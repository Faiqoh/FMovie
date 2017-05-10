package id.sch.smktelkom_mlg.privateassignment.xirpl112.fmovie;

import java.io.Serializable;

/**
 * Created by Faiqoh on 10/05/2017.
 */

public class HomeListItem implements Serializable {
    private String head;
    private String desc;

    public HomeListItem(String head, String desc) {
        this.head = head;
        this.desc = desc;
    }

    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }
}
