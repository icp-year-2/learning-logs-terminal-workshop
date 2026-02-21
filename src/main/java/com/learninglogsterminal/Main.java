package com.learninglogsterminal;

import com.learninglogsterminal.entity.Entry;
import com.learninglogsterminal.entity.Topic;
import com.learninglogsterminal.service.EntryService;
import com.learninglogsterminal.service.TopicService;
import java.util.List;
import java.util.Scanner;

/**
 * ╔══════════════════════════════════════════════════════╗
 * ║        Learning Logs Terminal — Main Menu             ║
 * ║                                                      ║
 * ║   This file is PROVIDED for you. No changes needed!  ║
 * ║   Study how it works — it calls YOUR code.           ║
 * ╚══════════════════════════════════════════════════════╝
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TopicService topicService = new TopicService();
        EntryService entryService = new EntryService();

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║     Welcome to Learning Logs Terminal    ║");
        System.out.println("║     Track what you learn, level up!      ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println();

        boolean running = true;

        while (running) {
            System.out.println("┌──────────────────────────────┐");
            System.out.println("│         MAIN MENU            │");
            System.out.println("├──────────────────────────────┤");
            System.out.println("│  1. Add a new Topic          │");
            System.out.println("│  2. View all Topics          │");
            System.out.println("│  3. Add an Entry             │");
            System.out.println("│  4. View all Entries         │");
            System.out.println("│  5. View Entries by Topic    │");
            System.out.println("│  6. Exit                     │");
            System.out.println("└──────────────────────────────┘");
            System.out.print("Choose an option (1-6): ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1" -> {
                    System.out.print("Enter topic name: ");
                    String name = scanner.nextLine().trim();

                    if (name.isEmpty()) {
                        System.out.println("⚠ Topic name cannot be empty!\n");
                    } else {
                        Topic topic = topicService.addTopic(name);
                        if (topic != null) {
                            System.out.println("✓ Topic added: " + topic);
                            System.out.println("  Total topics: " + topicService.getTopicCount());
                        }
                        System.out.println();
                    }
                }
                case "2" -> {
                    List<Topic> topics = topicService.getAllTopics();

                    if (topics == null || topics.isEmpty()) {
                        System.out.println("No topics yet. Add your first topic!\n");
                    } else {
                        System.out.println("\n── Your Topics ──────────────────");
                        for (Topic topic : topics) {
                            System.out.println("  " + topic);
                        }
                        System.out.println("─────────────────────────────────");
                        System.out.println("  Total: " + topicService.getTopicCount() + " topic(s)\n");
                    }
                }
                case "3" -> {
                    List<Topic> topics = topicService.getAllTopics();

                    if (topics == null || topics.isEmpty()) {
                        System.out.println("No topics yet. Add a topic first!\n");
                    } else {
                        System.out.println("\n── Select a Topic ───────────────");
                        for (Topic topic : topics) {
                            System.out.println("  " + topic);
                        }
                        System.out.println("─────────────────────────────────");
                        System.out.print("Enter topic ID: ");
                        String idInput = scanner.nextLine().trim();

                        try {
                            int topicId = Integer.parseInt(idInput);
                            Topic topic = topicService.findById(topicId);

                            if (topic == null) {
                                System.out.println("⚠ Topic not found with ID: " + topicId + "\n");
                            } else {
                                System.out.print("Enter your learning note: ");
                                String content = scanner.nextLine().trim();

                                if (content.isEmpty()) {
                                    System.out.println("⚠ Entry content cannot be empty!\n");
                                } else {
                                    Entry entry = entryService.addEntry(content, topicId);
                                    System.out.println("✓ Entry added: " + entry);
                                    System.out.println("  Under topic: " + topic.getName());
                                    System.out.println();
                                }
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("⚠ Please enter a valid number!\n");
                        }
                    }
                }
                case "4" -> {
                    List<Entry> entries = entryService.getAllEntries();

                    if (entries == null || entries.isEmpty()) {
                        System.out.println("No entries yet. Add your first entry!\n");
                    } else {
                        System.out.println("\n── All Entries ──────────────────");
                        for (Entry entry : entries) {
                            System.out.println("  " + entry);
                        }
                        System.out.println("─────────────────────────────────\n");
                    }
                }
                case "5" -> {
                    List<Topic> topics = topicService.getAllTopics();

                    if (topics == null || topics.isEmpty()) {
                        System.out.println("No topics yet. Add a topic first!\n");
                    } else {
                        System.out.println("\n── Select a Topic ───────────────");
                        for (Topic topic : topics) {
                            System.out.println("  " + topic);
                        }
                        System.out.println("─────────────────────────────────");
                        System.out.print("Enter topic ID: ");
                        String idInput = scanner.nextLine().trim();

                        try {
                            int topicId = Integer.parseInt(idInput);
                            Topic topic = topicService.findById(topicId);

                            if (topic == null) {
                                System.out.println("⚠ Topic not found with ID: " + topicId + "\n");
                            } else {
                                List<Entry> entries = entryService.getEntriesByTopicId(topicId);

                                if (entries == null || entries.isEmpty()) {
                                    System.out.println("No entries for topic: " + topic.getName() + "\n");
                                } else {
                                    System.out.println("\n── Entries for: " + topic.getName() + " ──");
                                    for (Entry entry : entries) {
                                        System.out.println("  " + entry);
                                    }
                                    System.out.println("─────────────────────────────────\n");
                                }
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("⚠ Please enter a valid number!\n");
                        }
                    }
                }
                case "6" -> {
                    running = false;
                    System.out.println("\nHappy Learning! See you next time.\n");
                }
                default -> System.out.println("Invalid option. Please choose 1-6.\n");
            }
        }

        scanner.close();
    }
}
