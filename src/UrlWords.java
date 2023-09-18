import java.io.FileWriter;
import java.net.URL;
import java.util.Scanner;

public class UrlWords {
    public void randomWords(){
      try {
          FileWriter fileWriter = new FileWriter("randomwords.txt");
          for (int i = 0; i < 60; i++) {
              URL url = new URL("https://random-word-api.herokuapp.com/word");
              Scanner scanner = new Scanner(url.openStream());
              String randomWord0 = scanner.useDelimiter("\\A").nextLine().replace("[", "");
              String randomWord = randomWord0.replace("]","");

              fileWriter.write(randomWord+"\n");
              fileWriter.flush();
          }
        fileWriter.close();

          }catch (Exception ex){
          ex.printStackTrace();
      }
      }
    }

