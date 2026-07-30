package org.spongycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
public class RandUtils {
    public static int nextInt(SecureRandom secureRandom, int i) {
        int iNextInt;
        int i2;
        if (((-i) & i) == i) {
            return (int) ((((long) i) * ((long) (secureRandom.nextInt() >>> 1))) >> 31);
        }
        do {
            iNextInt = secureRandom.nextInt() >>> 1;
            i2 = iNextInt % i;
        } while ((iNextInt - i2) + (i - 1) < 0);
        return i2;
    }
}
