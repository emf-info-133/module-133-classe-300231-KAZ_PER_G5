package doudix.ch.ctrlrest2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import doudix.ch.ctrlrest2.models.Message;
import doudix.ch.ctrlrest2.models.MessageRepository;
import doudix.ch.ctrlrest2.models.Post;
import doudix.ch.ctrlrest2.models.PostRepository;
import doudix.ch.ctrlrest2.models.User;
import doudix.ch.ctrlrest2.models.UserRepository;
import jakarta.transaction.Transactional;

@Service
public class Rest2Service {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MessageRepository messageRepository;

   

    // Méthode pour supprimer les messages et les posts
    @Transactional
    public void deleteMessagesAndPosts(List<Long> postIds) {
        // Supprimer d'abord les messages associés aux posts
        List<Message> messages = messageRepository.findByPostIdIn(postIds);
        for (Message message : messages) {
            messageRepository.delete(message);  // Suppression explicite des messages
        }

        // Ensuite, supprimer les posts
        postRepository.deleteByIdIn(postIds);
    }
    
    // Méthode pour supprimer un utilisateur par son nom
    public boolean deleteUserByName(String name) {
        Optional<User> user = userRepository.findByUsername(name);
        if (user.isPresent()) {
            userRepository.delete(user.get());
            return true;
        }
        return false;
    }
}
