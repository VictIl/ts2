package hj;

import org.example.f;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class testt {
    @Test
    public void facttest(){
        Assertions.assertEquals(120, f.factorialRecursive(5));
    }
}
