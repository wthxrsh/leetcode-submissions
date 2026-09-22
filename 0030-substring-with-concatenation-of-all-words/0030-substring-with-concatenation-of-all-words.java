import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        int wordLen = words[0].length();
        int totalWords = words.length;
        int totalLen = wordLen * totalWords;

        if (s.length() < totalLen) {
            return result;
        }

        // Step 1: Build frequency map of words
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Step 2: Iterate through all possible offsets (0 to wordLen - 1)
        for (int offset = 0; offset < wordLen; offset++) {
            Map<String, Integer> windowCount = new HashMap<>();
            int left = offset;
            int count = 0; // Number of valid words in current window

            // Step 3: Slide the window by wordLen
            for (int right = offset; right <= s.length() - wordLen; right += wordLen) {
                String word = s.substring(right, right + wordLen);

                if (wordCount.containsKey(word)) {
                    windowCount.put(word, windowCount.getOrDefault(word, 0) + 1);
                    count++;

                    // Step 4: Shrink window if count exceeds requirement
                    while (windowCount.get(word) > wordCount.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        windowCount.put(leftWord, windowCount.get(leftWord) - 1);
                        count--;
                        left += wordLen;
                    }

                    // Step 5: If window size matches total words, record index
                    if (count == totalWords) {
                        result.add(left);
                    }
                } else {
                    // Step 6: Invalid word found, reset window
                    windowCount.clear();
                    count = 0;
                    left = right + wordLen;
                }
            }
        }

        return result;
    }

    // Test cases
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test 1
        String s1 = "barfoothefoobarman";
        String[] words1 = {"foo", "bar"};
        System.out.println("Test 1: " + sol.findSubstring(s1, words1)); // Expected: [0, 9]

        // Test 2
        String s2 = "wordgoodgoodgoodbestword";
        String[] words2 = {"word", "good", "best", "word"};
        System.out.println("Test 2: " + sol.findSubstring(s2, words2)); // Expected: []

        // Test 3
        String s3 = "barfoofoobarthefoobarman";
        String[] words3 = {"bar", "foo", "the"};
        System.out.println("Test 3: " + sol.findSubstring(s3, words3)); // Expected: [6, 9, 12]
        
        // Test 4 (From discussion: overlapping words)
        String s4 = "lingmindraboofooowingdingbarrwingmonkeypoundcake";
        String[] words4 = {"fooo", "barr", "wing", "ding", "wing"};
        System.out.println("Test 4: " + sol.findSubstring(s4, words4)); // Expected: [13]
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna