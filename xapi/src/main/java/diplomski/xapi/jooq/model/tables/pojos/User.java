/*
 * This file is generated by jOOQ.
 */
package diplomski.xapi.jooq.model.tables.pojos;


import java.io.Serializable;
import java.util.Arrays;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User implements Serializable {

    private static final long serialVersionUID = 1247307450;

    private String[] id;
    private String[] phonenumber;

    public User() {}

    public User(User value) {
        this.id = value.id;
        this.phonenumber = value.phonenumber;
    }

    public User(
        String[] id,
        String[] phonenumber
    ) {
        this.id = id;
        this.phonenumber = phonenumber;
    }

    public String[] getId() {
        return this.id;
    }

    public void setId(String[] id) {
        this.id = id;
    }

    public String[] getPhonenumber() {
        return this.phonenumber;
    }

    public void setPhonenumber(String[] phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User (");

        sb.append(Arrays.toString(id));
        sb.append(", ").append(Arrays.toString(phonenumber));

        sb.append(")");
        return sb.toString();
    }
}