package id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.model;

import java.io.Serializable;

/**
 * Created by Smktelkom on 3/16/2017.
 */

public class Herbalism implements Serializable {
    public String Judul;
    public String Descripsi;
    public String Detail;
    public String Lokasi;
    public String Foto;


    public Herbalism(String arJudul, String arDescripsi, String arDetail, String arLokasi, String arFoto) {
        this.Judul = arJudul;
        this.Descripsi = arDescripsi;
        this.Detail = arDetail;
        this.Lokasi = arLokasi;
        this.Foto = arFoto;
    }
}
