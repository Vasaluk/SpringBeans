package app.model;

import org.springframework.stereotype.Component;

@Component
public abstract class Animal {
    public String toString() {
        return "Im a Animal";
    }
}
