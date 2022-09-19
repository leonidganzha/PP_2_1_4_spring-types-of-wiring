package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Egg6 {
    private Needle7 needle;
    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }

    @Autowired
    public void setNeedle(Needle7 needle) {
        this.needle = needle;
    }
}
