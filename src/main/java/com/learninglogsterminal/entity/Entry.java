package com.learninglogsterminal.entity;

import java.time.LocalDateTime;

/**
 * ╔══════════════════════════════════════════════════════╗
 * ║           QUEST: Build the Entry Entity              ║
 * ║                                                      ║
 * ║   Complete all TODOs below to earn XP!               ║
 * ║   Total XP available in this file: 120 XP            ║
 * ╚══════════════════════════════════════════════════════╝
 *
 * An Entry represents a learning note under a Topic.
 * For example, if your topic is "Java Basics", an entry
 * might be: "Learned about variables and data types".
 *
 * Each entry has:
 *   - id         (int)            → unique identifier
 *   - content    (String)         → what you learned
 *   - topicId    (int)            → which topic this belongs to
 *   - createdAt  (LocalDateTime)  → when it was created
 *   - updatedAt  (LocalDateTime)  → when it was last updated
 */
public class Entry {

    // ============================================================
    // TODO 9: Declare the fields (+10 XP each = 50 XP)
    // ============================================================
    // Declare these private fields:
    //   - int id
    //   - String content
    //   - int topicId
    //   - LocalDateTime createdAt
    //   - LocalDateTime updatedAt
    //
    // Hint: private int id;
    // ============================================================
    private int id;
    private String content;
    private int topicId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;



    // ============================================================
    // TODO 10: Create the constructor (+20 XP)
    // ============================================================
    // Create a constructor that takes (int id, String content, int topicId)
    // Inside the constructor:
    //   - Set this.id = id
    //   - Set this.content = content
    //   - Set this.topicId = topicId
    //   - Store LocalDateTime.now() in a variable first
    //   - Set this.createdAt and this.updatedAt to that variable
    //
    // Hint:
    //   public Entry(int id, String content, int topicId) {
    //       this.id = id;
    //       this.content = content;
    //       this.topicId = topicId;
    //       LocalDateTime now = LocalDateTime.now();
    //       this.createdAt = now;
    //       this.updatedAt = now;
    //   }
    // ============================================================
    public Entry(int id, String content, int topicId){
        this.id = id;
        this.content = content;
        this.topicId = topicId;
        LocalDateTime now = LocalDateTime.now();
        createdAt = now;
        updatedAt = now;
    }



    // ============================================================
    // TODO 11: Create getters and setters (+30 XP)
    // ============================================================
    // Fill in each method body below:
    //   - getId()        → returns id
    //   - getContent()   → returns content
    //   - getTopicId()   → returns topicId
    //   - getCreatedAt() → returns createdAt
    //   - getUpdatedAt() → returns updatedAt
    //   - setContent(String content) → sets content AND updates updatedAt
    //
    // Hint for setContent:
    //   this.content = content;
    //   this.updatedAt = LocalDateTime.now();
    // ============================================================
    public int getId() {
        // Write your code here
        return this.id;
    }

    public String getContent() {
        // Write your code here
        return this.content;
    }

    public int getTopicId() {
        // Write your code here
        return this.topicId;
    }

    public LocalDateTime getCreatedAt() {
        // Write your code here
        return this.createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        // Write your code here
        return this.updatedAt;
    }

    public void setContent(String content) {
        // Write your code here
        this.content = content;
        this.updatedAt = LocalDateTime.now();
    }



    // ============================================================
    // TODO 12: Override toString() (+20 XP — ACHIEVEMENT: Scribe!)
    // ============================================================
    // Return a readable string like:
    //   "[1] Learned about variables (Topic: 2)"
    //
    // Hint: return "[" + id + "] " + content + " (Topic: " + topicId + ")";
    // ============================================================
    @Override
    public String toString() {
        return "[" + id + "] " + content + " (Topic: " + topicId + ")";
    }

}
