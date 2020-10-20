/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadiah.ktpintanputrisetyowati;

import java.util.Scanner;

/**
 *
 * @author Intan
 */
public class HadiahKTPintanputrisetyowati {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               //membuat Scanner dan tipe data
        Scanner input = new Scanner (System.in);
        String nama, tempat, bulan, alamat, kel, kec, agama, kerja, warga;
        int nik, tanggal, tahun, pilihkelamin, pilihgoldar, rt, rw, pilihstatus;
        //membuat judul
        System.out.print("\n MENGISI DATA \n");
        //nik
        System.out.print("NIK               : ");
        nik = input.nextInt();
        //nama
        System.out.print("Nama              : ");
        nama = input.nextLine();
        //lahir
        System.out.print("Tempat Lahir      : ");
        tempat = input.next();   
        System.out.print("   Tanggal        : ");
        tanggal = input.nextInt();
        System.out.print("   Bulan          : ");
        bulan = input.nextLine();
        System.out.print("   Tahun          : ");
        tahun = input.nextInt();
        //jenis kelamin
        String[] kelamin = {" ","Laki-Laki","Perempuan"};
        for(int a=1; a<kelamin.length; a++){
            System.out.println(a+". "+kelamin[a]);}
        System.out.print("Jenis Kelamin     : ");
        pilihkelamin = input.nextInt();
        //golongan darah
        String[] goldar = {" ","A","B","AB","O"};
        for(int a=1; a<goldar.length; a++){
            System.out.println(a+". "+goldar[a]);}
        System.out.print("Golongan Darah    : ");
        pilihgoldar = input.nextInt();
        //alamat
        System.out.print("Alamat            : ");
        alamat = input.nextLine();
        System.out.print("          RT      : ");
        rt = input.nextInt();
        System.out.print("          RW      : ");
        rw = input.nextInt();
        System.out.print("          kel     : ");
        kel = input.nextLine();
        System.out.print("          kec     : ");
        kec = input.nextLine();
        //Agama
        System.out.print("Agama             : ");
        agama = input.nextLine();
        //pekerjaan
        System.out.print("Pekerjaan         : ");
        kerja = input.nextLine();
        //status
        String[] status = {" ","Kawin","Belum Kawin"};
        for(int a=1; a<status.length; a++){
            System.out.println(a+". "+status[a]);}
        System.out.print("Status            : ");
        pilihstatus = input.nextInt();
        //warga
        System.out.print("Kewarganegaraan  : ");
        warga = input.nextLine();
        //membuat KTP
        System.out.println("-----------------------------------------");
        System.out.print("\n KARTU TANDA PENDUDUK PROVINSI JAWA TIMUR \n");
        System.out.println("NIK              : "+nik);
        System.out.println("Nama             : "+nama);
        System.out.println("Tempat/tgl lahir : "+tempat+", "+tanggal+"/"+bulan+"/"+tahun);
        System.out.println("jenis Kelamin    : "+kelamin[pilihkelamin]);
        System.out.println("Golongan darah   : "+goldar[pilihgoldar]);
        System.out.println("Alamat           : "+alamat);
        System.out.println("        RT/RW    : "+rt+"/"+rw);
        System.out.println("        kel      : "+kel);
        System.out.println("        kec      : "+kec);
        System.out.println("Agama            : "+agama);
        System.out.println("Pekerjaan        : "+kerja);
        System.out.println("Status Perkawinan: "+status[pilihstatus]);
        System.out.println("Kewarganegaraan  : "+warga);
    }
    
}
