package doudix.ch.ctrlrest1.models;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    
    // Méthode pour récupérer les messages par les IDs de post
    List<Message> findByPostPostIdIn(List<Long> postIds);
    List<Message> findByPostPostId(Long postId); // pour le getMessagesByPost
    
}
