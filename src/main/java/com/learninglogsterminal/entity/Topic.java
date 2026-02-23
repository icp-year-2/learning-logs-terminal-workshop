package com.learninglogsterminal.entity;

import java.time.LocalDateTime;

/**
 * ╔══════════════════════════════════════════════════════╗
 * ║           QUEST: Build the Topic Entity              ║
 * ║                                                      ║
 * ║   Complete all TODOs below to earn XP!               ║
 * ║   Total XP available in this file: 110 XP            ║
 * ╚══════════════════════════════════════════════════════╝
 *
 * A Topic represents a subject you are learning about.
 * Each topic has:
 *   - id         (int)            → unique identifier
 *   - topicName       (String)         → topic topicName
 *   - createdAt  (LocalDateTime)  → when it was created
 *   - updatedAt  (LocalDateTime)  → when it was last updated
 */
public class Topic {

    // ============================================================
    // TODO 1: Declare the fields (+10 XP each = 40 XP)
    // ============================================================
    // Declare these private fields:
    //   - int id
    //   - String topicName
    //   - LocalDateTime createdAt
    //   - LocalDateTime updatedAt
    //
    // Hint: private int id;
    // ============================================================
    private int id;
    private String topicName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    
    // ============================================================
    // TODO 2: Create the constructor (+20 XP)
    // ============================================================
    // Create a constructor that takes (int id, String topicName)
    // Inside the constructor:
    //   - Set this.id = id
    //   - Set this.topicName = topicName
    //   - Store LocalDateTime.now() in a variable first
    //   - Set this.createdAt and this.updatedAt to that variable
    //
    // Hint:
    //   public Topic(int id, String topicName) {
    //       this.id = id;
    //       this.topicName = topicName;
    //       LocalDateTime now = LocalDateTime.now();
    //       this.createdAt = now;
    //       this.updatedAt = now;
    //   }
    // ============================================================

    public Topic(int id, String topicName){
        this.id = id;
        this.topicName = topicName;
        LocalDateTime now = LocalDateTime.now();
        createdAt = now;
        updatedAt = now;
    }



    // ============================================================
    // TODO 3: Create getters and setters (+30 XP)
    // ============================================================
    // Fill in each method body below:
    //   - getId()        → returns id
    //   - getName()      → returns topicName
    //   - getCreatedAt() → returns createdAt
    //   - getUpdatedAt() → returns updatedAt
    //   - setName(String topicName) → sets topicName AND updates updatedAt
    //
    // Hint for setName:
    //   this.topicName = topicName;
    //   this.updatedAt = LocalDateTime.now();
    // ============================================================
    public int getId() {
        // Write your code here
        return id;
    }

    public String getName() {
        // Write your code here
        return topicName;
    }

    public LocalDateTime getCreatedAt() {
        // Write your code here
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        // Write your code here
        return updatedAt;
    }

    public void setName(String topicName) {
        // Write your code here
        this.topicName = topicName;
        this.updatedAt = LocalDateTime.now();
    }



    // ============================================================
    // TODO 4: Override toString() (+20 XP — ACHIEVEMENT: Architect!)
    // ============================================================
    // Return a readable string like:
    //   "[1] Java Basics (Created: 2025-02-18T10:30:00)"
    //
    // Hint: return "[" + id + "] " + topicName + " (Created: " + createdAt + ")";
    // ============================================================

    @Override
    public String toString() {
        return "[" + id + "] " + topicName + " (Created: " + createdAt + ")";
    }

}
