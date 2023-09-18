package globaldata;
public class RandomWordsDynamic {

    public static String [] randomWords = new String[0];

    public void add(String word){
        String [] newrandomWords = new String[randomWords.length+1];
        for (int i = 0; i < randomWords.length; i++) {
            newrandomWords[i]=randomWords[i];
        }
        newrandomWords[randomWords.length] = word;
        randomWords=newrandomWords;
    }

    public String get(int index) {
       try {
           if (index<0 || index>= randomWords.length){
               System.out.println("Wrong index!");
           }
       }catch (Exception ex){
           ex.printStackTrace();
       }
        return randomWords[index];
    }

    public int getSize(){
        return randomWords.length;
    }

}





