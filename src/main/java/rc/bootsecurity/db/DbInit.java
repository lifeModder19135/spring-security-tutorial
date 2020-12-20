package rc.bootsecurity.db;

import org.springframework.boot.CommandLineRunner;
import rc.bootsecurity.model.User;

public class DbInit implements CommandLineRunner {

    private UserRepository userRepository;

    public DbInit(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User testUSER = new User("testUSER", "useruser", "USER", "");
        User testADMIN = new User("testADMIN", "adminadmin", "ADMIN", "");
        User testMANAGEMENT = new User("testMANAGEMENT", "mgrmgr", "MANAGEMENT", "");
    }
}
