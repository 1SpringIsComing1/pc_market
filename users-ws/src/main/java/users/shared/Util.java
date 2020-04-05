package users.shared;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Util {
    public String generateUserId() {
        return UUID.randomUUID().toString();
    }
}

