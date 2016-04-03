package tubespbo;

public class Kelas {
    private Matakuliah matakuliah;
    private Dosen dosen;
    
    public Kelas (Dosen dosen, Matakuliah matakuliah) {
        this.dosen = dosen;
        this.matakuliah = matakuliah;
    }
    
    public void setMatakuliah (Matakuliah m) {
        matakuliah = m;
    }
    
    public Matakuliah getMatakuliah () {
        return matakuliah;
    }
    
    public void setDosen (Dosen d) {
        dosen = d;
    }
    
    public Dosen getDosen () {
        return dosen;
    }
}