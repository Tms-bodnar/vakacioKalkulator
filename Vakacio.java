/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vakacio;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Bodnár Tamás <tms.bodnar@gmail.com> | www.kalandlabor.hu
 */
public class Vakacio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        IskolaiSzunet[] szunetek = new IskolaiSzunet[5];
        szunetek[0] = new IskolaiSzunet("Tavaszi szünet", 2017, 4, 13, 2017, 4, 18);
        szunetek[1] = new IskolaiSzunet("Nyári szünet", 2017, 6, 16, 2017, 9, 4);
        szunetek[2] = new IskolaiSzunet("Téli szünet",2016, 12, 22, 2017, 1, 2 );
        szunetek[3] = new IskolaiSzunet("Őszi szünet", 2016, 10, 29, 2016, 11, 6);
        szunetek[4] = new IskolaiSzunet("Síszünet", 2017, 2, 20, 2017, 2, 22 );
        Date ma = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        System.out.println("A mai dátum: "+ sdf.format(ma));
        Calendar mai = Calendar.getInstance();
        mai.setTime(ma);
        Calendar cal0 = Calendar.getInstance();
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        Calendar cal3 = Calendar.getInstance();
        Calendar cal4 = Calendar.getInstance();
        Calendar[] szunetKezdet = new Calendar[5];
        szunetKezdet[0] = cal0;
        szunetKezdet[1] = cal1;
        szunetKezdet[2] = cal2;
        szunetKezdet[3] = cal3;
        szunetKezdet[4] = cal4;
        for (int i = 0; i < szunetKezdet.length; i++) {
            szunetKezdet[i].set(szunetek[i].getKezdetEv(), szunetek[i].getKezdetHo()-1, szunetek[i].getKezdezNap()+1);
            }
        Calendar[] szunetVeg  = new Calendar[5];
        Calendar cal5 = Calendar.getInstance();
        Calendar cal6 = Calendar.getInstance();
        Calendar cal7 = Calendar.getInstance();
        Calendar cal8 = Calendar.getInstance();
        Calendar cal9 = Calendar.getInstance();
        szunetVeg[0] = cal5;
        szunetVeg[1] = cal6;
        szunetVeg[2] = cal7;
        szunetVeg[3] = cal8;
        szunetVeg[4] = cal9;
        for (int i = 0; i < szunetVeg.length; i++) {
            szunetVeg[i].set(szunetek[i].getVegEv(), szunetek[i].getVegHo()-1, szunetek[i].getVegNap()+1);
        }       
        Calendar tempIdo = Calendar.getInstance();
        tempIdo.set(3000, 0, 1);
        for (int i = 0; i < szunetKezdet.length; i++) {
            if (szunetKezdet[i].getTimeInMillis() < mai.getTimeInMillis()  && szunetVeg[i].getTimeInMillis() >  mai.getTimeInMillis()){
                System.out.print("Most is iskolaszünet van, még ");
                long temp = (szunetVeg[i].getTimeInMillis()-mai.getTimeInMillis())/1000/60/60/24;
                System.out.println(temp + " napig");
                i = szunetKezdet.length;
            }else if (0 < szunetKezdet[i].getTimeInMillis() - mai.getTimeInMillis() && szunetKezdet[i].getTimeInMillis() - mai.getTimeInMillis()< tempIdo.getTimeInMillis()-mai.getTimeInMillis()){
                tempIdo = szunetKezdet[i];       
                }
         }
        long temp = (tempIdo.getTimeInMillis() - mai.getTimeInMillis())/1000/60/60/24;
        if (temp > 0){
        System.out.println("A következő iskolaszünet "+ temp +" nap múlva lesz");
        }
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Milyen dátumtól számoljak? Év: ");
        int datumEv = sc.nextInt();
        System.out.println("Hónap: ");
        int datumHo = sc.nextInt();
        System.out.println("Nap: ");
        int datumNap = sc.nextInt();
        Calendar datum = Calendar.getInstance();
        datum.set(datumEv, datumHo-1, datumNap);
        Date d = datum.getTime();
        System.out.println(sdf.format(d));
        Calendar tempIdo2 = Calendar.getInstance();
        tempIdo2.set(3000, 0, 1);
        boolean OK = true;
        for (int i = 0; i < szunetKezdet.length; i++) {
                            
            if (szunetKezdet[i].getTimeInMillis() < datum.getTimeInMillis() && szunetVeg[i].getTimeInMillis() > datum.getTimeInMillis()){
                System.out.print("Most is iskolaszünet van, még ");
                long tempUj = (szunetVeg[i].getTimeInMillis()-datum.getTimeInMillis())/1000/60/60/24;
                System.out.println(tempUj + " napig");
                i = szunetKezdet.length;
                OK = false;
            }else if (0 < szunetKezdet[i].getTimeInMillis() - datum.getTimeInMillis() && szunetKezdet[i].getTimeInMillis() - datum.getTimeInMillis()< tempIdo2.getTimeInMillis()-datum.getTimeInMillis()){
                tempIdo2 = szunetKezdet[i];
                }
            }
        long tempUj = (tempIdo2.getTimeInMillis() - datum.getTimeInMillis())/1000/60/60/24;
            if(tempUj>0 && OK){
                System.out.println("A következő  iskolaszünet "+ tempUj +" nap múlva lesz");
         }
        
        
    }

}
