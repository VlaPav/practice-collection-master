package org.itstep;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanNew = new Scanner(System.in);
        int choose = 0;
        
        Map<String, TreeSet<String>> channels = new HashMap<>();
        do {
            
            System.out.println(" 1 - Add show\n 2 - Show channels and shows\n 3 - Exit");
            choose = scan.nextInt();
            
            switch (choose)
            {

                case 1:
                {
                    TreeSet<String> shows = new TreeSet<>();


                    System.out.print("Input tv network:");
                    String channelName = scanNew.nextLine();
                    
                    if (channels.containsKey(channelName)) {
                        
                        System.out.print("Input tv show on "+channelName+":");
                        String showName = scanNew.nextLine();
                        
                        channels.get(channelName).add(showName);
                        System.out.println(channels);
                    }
                    else {

                        System.out.print("Input tv show on "+channelName+":");
                        String showName = scanNew.nextLine();
                        
                        shows.add(showName);
                        channels.put(channelName, shows);
                        System.out.println(channels);
                    }
                    break;
                }
                case 2:
                {
                        System.out.println(channels);
                    break;
                }

            }
        }while(choose != 3);
    }
}
