import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        boolean b = true;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String D="";
        System.out.println("Какой сегодня день недели ? ");
        try {
            D = bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Day[] days = Day.values();
        for(Day d : days){
            if(d.getName().equals(D.toLowerCase())){
                System.out.println("Твой план на этот день: " + d.getDayPlan());
                b = false;
            }
        }

        if(b){
            System.out.println("Не правильный ввод!");
        }
    }
}
