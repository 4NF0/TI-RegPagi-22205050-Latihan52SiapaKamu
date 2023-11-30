/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan52.siapakamu;

/**
 *
 * @author nm
 */
public class Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Dosen dosen;
        Mahasiswa mhs;
        
        dosen = new Dosen();
        System.out.println("NIP Dosen\t: 41227829930");
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println("");
        mhs = new Mahasiswa();
        System.out.println("NIM Mahasiswa\t: 10110269");
        mhs.siapaKamu();
        mhs.kelasApa();
    }
    
}
