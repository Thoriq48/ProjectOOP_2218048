/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB10;


/**
 *
 * @author Aharfi
 */
public class KeaktifanMahasiswa extends Penilaian {
    int nilai_keaktifan;
    public KeaktifanMahasiswa() {
        this.nilai_keaktifan = 0;
    }

    @Override
    double nilaiAktif() {
        return ((nilai_keaktifan* 0.1) + nilaiAkhir());
    }
}