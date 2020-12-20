package rc.bootsecurity.model;

import sun.util.resources.Bundles;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.security.PrivateKey;

@Entity
public class User {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable=false)
    private String username;

    @Column(nullable=false)
    private String password;

    private int isActive;

    private String roles;

    private String permissions;

    public user(String uname, String pwd, String roles, String permissions) {
        this.username = uname;
        this.password = pwd;
        this.roles = roles;
        this.permissions = permissions;
        this.isActive = 1;
    };
}
