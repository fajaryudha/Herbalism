package id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.model;

import android.graphics.drawable.Drawable;

/**
 * Created by Smktelkom on 3/16/2017.
 */

public class Herbalism {
    public String Judul;
    public String Descripsi;
    public Drawable Foto;

    public Herbalism(String arJudul, String arDescripsi, Drawable arFoto) {
        this.Judul = arJudul;
        this.Descripsi = arDescripsi;
        this.Foto = arFoto;
    }
}
