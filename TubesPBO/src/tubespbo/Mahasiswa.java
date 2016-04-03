/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tinodau
 */
public class Mahasiswa extends Orang {
    private List<Kelas> pilihan = new ArrayList<>();
    private String username;
    private String password;
    private int semester;
    private int nMax;
    private int n = 0;
    
    public Mahasiswa(String nama, String id, String username, String password, int semester, int nMax) {
        super(nama,id);
        this.username = username;
        this.password = password;
        this.semester = semester;
        this.nMax = nMax;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getSemester() {
        return semester;
    }    

    public void addKelas (Kelas k) {
        pilihan.add(k);
    }
        
    public void removeKelas (Kelas k) {
        pilihan.remove(k);
    }
        
    public Kelas getKelas(int indeks) {
        return pilihan.get(indeks);
    }
    
    public List<Kelas> getAllKelas () {
        return pilihan;
    }
    
    public int getJumlahKelas () {
        return pilihan.size();
    }
    
    @Override
    public String display () {
        return ("Nama Mahasiswa : "+getNama()+"\n"+"NIM : "+getID());
    }

}