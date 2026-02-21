package com.learninglogsterminal.service;

import com.learninglogsterminal.entity.Entry;
import java.util.ArrayList;
import java.util.List;

/**
 * ╔══════════════════════════════════════════════════════╗
 * ║         QUEST: Build the Entry Service               ║
 * ║                                                      ║
 * ║   Complete all TODOs below to earn XP!               ║
 * ║   Total XP available in this file: 80 XP             ║
 * ╚══════════════════════════════════════════════════════╝
 *
 * EntryService manages a collection of Entries.
 * It uses an ArrayList to store entries in memory.
 */
public class EntryService {

    private final List<Entry> entries = new ArrayList<>();
    private int nextId = 1;

    // ============================================================
    // TODO 13: Implement addEntry() (+30 XP)
    // ============================================================
    // This method should:
    //   1. Create a new Entry using nextId, content, and topicId
    //   2. Add it to the entries list
    //   3. Increment nextId by 1
    //   4. Return the created Entry
    //
    // Hint:
    //   Entry entry = new Entry(nextId, content, topicId);
    //   entries.add(entry);
    //   nextId++;
    //   return entry;
    // ============================================================
    public Entry addEntry(String content, int topicId) {
        // Write your code here

        return null; // ← Replace this
    }

    // ============================================================
    // TODO 14: Implement getAllEntries() (+20 XP — ACHIEVEMENT: Builder!)
    // ============================================================
    // This method should:
    //   Return the list of all entries
    //
    // Hint: return entries;
    // ============================================================
    public List<Entry> getAllEntries() {
        // Write your code here

        return null; // ← Replace this
    }

    // ============================================================
    // ⭐ BONUS TODO 15: Implement getEntriesByTopicId() (+30 XP — ACHIEVEMENT: Master!)
    // ============================================================
    // This method should:
    //   1. Create a new empty ArrayList<Entry>
    //   2. Loop through all entries
    //   3. If an entry's topicId matches the given topicId, add it to the new list
    //   4. Return the filtered list
    //
    // Hint:
    //   List<Entry> result = new ArrayList<>();
    //   for (Entry entry : entries) {
    //       if (entry.getTopicId() == topicId) {
    //           result.add(entry);
    //       }
    //   }
    //   return result;
    // ============================================================
    public List<Entry> getEntriesByTopicId(int topicId) {
        // Write your code here

        return null; // ← Replace this
    }
}
