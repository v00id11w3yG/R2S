package com.example.user.gloryroad;
import java.util.EnumMap;
public interface playerInterface {
    enum effects {
        FLU,
        COLD,
        SLEEP,
        MARRIED
    }

    int age = 0;
    EnumMap <effects,Integer> temporaryEffects = null;
}
