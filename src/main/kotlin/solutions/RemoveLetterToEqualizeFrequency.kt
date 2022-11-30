package solutions

import core.Executable

/*

https://leetcode.com/problems/remove-letter-to-equalize-frequency/


You are given a 0-indexed string word, consisting of lowercase English letters. You need to select one index and remove the letter at that index from word so that the frequency of every letter present in word is equal.

Return true if it is possible to remove one letter so that the frequency of all letters in word are equal, and false otherwise.

Note:

    The frequency of a letter x is the number of times it occurs in the string.
    You must remove exactly one letter and cannot chose to do nothing.

Example 1:

Input: word = "abcc"
Output: true
Explanation: Select index 3 and delete it: word becomes "abc" and each character has a frequency of 1.

Example 2:

Input: word = "aazz"
Output: false
Explanation: We must delete a character, so either the frequency of "a" is 1 and the frequency of "z" is 2, or vice versa. It is impossible to make all present letters have equal frequency.

Constraints:

    2 <= word.length <= 100
    word consists of lowercase English letters only.


*/

class RemoveLetterToEqualizeFrequency: Executable<String, Boolean> {
    override fun invoke(args: String): Boolean {
        val occurrencesMap = mutableMapOf<Char, Int>()

        // Since we have constraint 2 <= args.length <= 100 the following check isn't needed. I left it here for
        // information purposes, handling special cases isn't hard
        /*
        when (args.length) {
            0 -> return false
            1 -> return true
        }
        */

        // Loading up occurrences from string input
        args.forEach { occurrencesMap[it] = occurrencesMap.getOrDefault(it, 0) + 1 }

        val maxOccurrences = occurrencesMap.maxByOrNull { it.value }
        val minOccurrences = occurrencesMap.minByOrNull { it.value }
        check(maxOccurrences != null && minOccurrences != null) {
            // This shouldn't happen because args.length >= 2
            return false
        }

        if (maxOccurrences.value == minOccurrences.value.plus(1)) {

            // Subtraction
            with(maxOccurrences.key) {
                occurrencesMap[this] = occurrencesMap.getOrElse(this) { return false } - 1
            }

            // If all are the same size, aka distinctBy key returns a single element, then we have a solution
            if (occurrencesMap.toList().toTypedArray().distinctBy { it.second }.size == 1) {
                return true
            }
        }
        return false
    }
}