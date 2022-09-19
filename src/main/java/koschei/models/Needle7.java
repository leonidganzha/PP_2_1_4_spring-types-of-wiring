package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Needle7 {
    @Autowired
    private Deth8 death;

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + death.toString();
    }
}
