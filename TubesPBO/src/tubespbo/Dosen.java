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
 * @author Yogie fajar
 */
public class Dosen extends Orang {

    public Dosen (String nama, String id) {
        super(nama,id);
    }

    @Override
    public String display () {
        return ("Nama Dosen : "+getNama()+"\n"+"NIP : "+super.getID());
    }
}