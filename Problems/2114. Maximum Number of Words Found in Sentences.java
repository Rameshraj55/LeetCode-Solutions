10.====================2114. Maximum Number of Words Found in Sentences==============
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxNoWords = 0;
        for(int i =0; i<sentences.length ;i++){
          // THIS IS ARRAY OF WORDS { sentences[i].split(" ") }
            int wordsCount = sentences[i].split(" ").length;
            if(wordsCount>maxNoWords) maxNoWords = wordsCount;
        }
        return maxNoWords;


        
    }
}
