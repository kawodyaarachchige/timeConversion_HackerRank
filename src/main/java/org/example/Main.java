package org.example;


import java.io.*;

class Result {

        public static String timeConversion(String s) {
            String[] parts = s.split(":");
            int hours = Integer.parseInt(parts[0]);
            String period = parts[2].substring(2);

            if (period.equals("PM") && hours < 12) {
                hours += 12;
            } else if (period.equals("AM") && hours == 12) {
                hours = 0;
            }

            String militaryTime = String.format("%02d:%s:%s", hours, parts[1], parts[2].substring(0, 2));
            return militaryTime;
        }

    }

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String s = bufferedReader.readLine();

            String result = Result.timeConversion(s);

            System.out.println(result);

            bufferedReader.close();
        }
    }
