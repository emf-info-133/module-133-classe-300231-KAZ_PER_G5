package doudix.ch.apigateway.dto;

import java.util.List;

public class PostDTO {
    private Long id;
    private Long creatorId;
    private String description;
    private String imageUrl;
    private String title;
    private List<MessageDTO> messages;

    // Constructeurs
    public PostDTO() {}

    public PostDTO(Long id, Long creatorId, String description, String imageUrl, String title, List<MessageDTO> messages) {
        this.id = id;
        this.creatorId = creatorId;
        this.description = description;
        this.imageUrl = imageUrl;
        this.title = title;
        this.messages = messages;
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getCreatorId() { return creatorId; }
    public void setCreatorId(Long creatorId) { this.creatorId = creatorId; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public List<MessageDTO> getMessages() { return messages; }
    public void setMessages(List<MessageDTO> messages) { this.messages = messages; }
}
