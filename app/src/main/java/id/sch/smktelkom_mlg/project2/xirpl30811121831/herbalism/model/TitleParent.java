package id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.model;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.List;
import java.util.UUID;

/**
 * Created by MHRJ on 4/6/2017.
 */

public class TitleParent implements ParentObject {

    private List<Object> mChildrenList;
    private UUID _id;
    private String tittle;

    public TitleParent(String tittle) {
        this.tittle = tittle;
        _id = UUID.randomUUID();
    }

    public UUID get_id() {
        return _id;
    }

    public void set_id(UUID _id) {
        this._id = _id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    @Override
    public List<Object> getChildObjectList() {
        return mChildrenList;
    }

    @Override
    public void setChildObjectList(List<Object> list) {
        mChildrenList = list;
    }
}
