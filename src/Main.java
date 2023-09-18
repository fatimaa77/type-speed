import globaldata.GlobalData;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        GlobalData globalData = new GlobalData();
        globalData.read();
        boolean sing = true;
        int count = 0;
        System.out.println("<<<---------TYPE SPEED PROGRAM--------->>>");
        while (sing){
            String rw = GlobalData.randomWordsDynamic.get(random.nextInt(GlobalData.randomWordsDynamic.getSize()));
            System.out.println(rw);
            String wordInput = scanner.next();
            if (wordInput.equalsIgnoreCase(rw)){
                count++;
            }
            if (wordInput.equalsIgnoreCase("exit")){
                sing=false;
            }
        }
        System.out.println(count);

    }
}
