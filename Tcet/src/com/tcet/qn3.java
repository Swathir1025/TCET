package com.tcet;
import java.util.HashMap;
import java.util.Map;
public class qn3 {
	public static void main(String[] args) {
		String input="This is a test string. This string is for testing.";
		String[] words=input.toLowerCase().split("\\s+");
		Map<String, Integer> WordCountMap=new HashMap<>();
		for (String word: words) {
			WordCountMap.put(word, WordCountMap.getOrDefault(word, 0)+1);
		}
		for (Map.Entry<String, Integer> entry:WordCountMap.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
	}

}
