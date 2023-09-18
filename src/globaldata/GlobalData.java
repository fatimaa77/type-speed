package globaldata;

import java.io.*;

public class GlobalData {

    public static RandomWordsDynamic randomWordsDynamic = new RandomWordsDynamic();

    public void read() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("randomwords.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                randomWordsDynamic.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
