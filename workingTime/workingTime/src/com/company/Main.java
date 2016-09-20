package com.company;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by Ratchanon on 9/18/2016.
 */

public class Main {
    public static void main(String[] args) {

        String path = "../../workingTime/LOG/Log.log";
        String line;
        int lenDiff =0;
        int[] pos = new int[5];
        int i = 0;
        int[] posCal = new int[3];
        String name,startDate,endDate,tempStartTime,tempEndTime;
        String sHours = "",sMin = "";
        String eHours = "",eMin = "";
        int  check = 0,check1 = 0;
        float  sMinTime = 0,eMinTime = 0,sHourTime = 0,eHourTime = 0;
        float totalHour = 0;
        float totalMin = 0;
        float totalTime = 0;
        float stTime =0, endTime = 0;
        int countLine =0;


        Calulate cal = new Calulate();

        try{
            /*Test to write file
            * */
         /*   FileWriter w = new FileWriter("output.txt");
            w.write("Hello");
            w.close();*/
            /*
            * */
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null){
                countLine++;
                lenDiff = line.length();
                /*FullName
                * */
                for (i = 0 ; i < lenDiff ; i++){
                    if (line.charAt(i) == '|'){
                        pos[0] = i;
                        break;
                    }
                }
                /*StartDate
                * */
                for (i = pos[0]+1 ; i < lenDiff ; i++) {
                    if (line.charAt(i) == '|') {
                        pos[1] = i;
                        break;
                    }
                }
                /*StartTime
                * */
                for (i = pos[1]+1 ; i < lenDiff ; i++) {
                    if (line.charAt(i) == '|') {
                        pos[2] = i;
                        break;
                    }
                }
                /*EndDate
                * */
                for (i = pos[2]+1 ; i < lenDiff ; i++) {
                    if (line.charAt(i) == '|') {
                        pos[3] = i;
                        break;
                    }
                }

                name            = line.substring(0,pos[0]);
                startDate       = line.substring(pos[0]+1,pos[1]);
                tempStartTime   = line.substring(pos[1]+1,pos[2]);
                endDate         = line.substring(pos[2]+1,pos[3]);
                tempEndTime     = line.substring(pos[3]+1);

                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(startDate);
                SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
                String sDate = simpleDate.format(date);
                LocalDate sDay = LocalDate.parse(sDate);

                Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(endDate);
                SimpleDateFormat simpleDate1 = new SimpleDateFormat("yyyy-MM-dd");
                String eDate = simpleDate.format(date1);
                LocalDate eDay = LocalDate.parse(eDate);

                if(tempEndTime.length() != 0 && tempStartTime.length() != 0) {
                    while (tempStartTime.charAt(check) != ':') {
                        sHours = tempStartTime.substring(0,check+1);
                        check++;
                    }

                     sMin =  tempStartTime.substring(check+1);

                    while (tempEndTime.charAt(check1) != ':'){
                        eHours = tempEndTime.substring(0,check1+1);
                        check1++;
                    }
                     eMin = tempEndTime.substring(check1+1);
                }

                else{
                    System.out.print(countLine+" ");
                    System.out.println(name +" ----------- ไม่ได้มาทำงาน ----------");
                    continue;

                }

                tempStartTime = "";
                tempEndTime = "";
                check = 0;
                check1 = 0;
                sMinTime = Float.parseFloat(sMin);
                eMinTime = Float.parseFloat(eMin);
                sHourTime = Float.parseFloat(sHours);
                eHourTime = Float.parseFloat(eHours);

                stTime = sHourTime + (sMinTime*0.01f);
                endTime = eHourTime + (eMinTime*0.01f);

                totalTime= 0;


                // ****************check Work Time******************


                    switch (sDay.getDayOfWeek().toString()) {

                        case "SATURDAY":
                            System.out.print(countLine+" ");
                            cal.calTimeIrregular(endTime,stTime,totalTime,name);
                            break;

                        case "SUNDAY":
                            System.out.print(countLine+" ");
                            cal.calTimeIrregular(endTime,stTime,totalTime,name);
                            break;
                        default:
                            System.out.print(countLine+" ");
                            cal.calTimeRegular(endTime,stTime,totalTime,name);
                            break;

                    }


            }//End of While

        }//End of Try
        catch (Exception e){
        }

    }
}
