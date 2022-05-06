package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class Animal {

    @Autowired
    public String toString() {
        return "Im a Animal";
    }
}
