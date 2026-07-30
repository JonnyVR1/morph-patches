package org.spongycastle.crypto.p010ec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.math.p012ec.ECConstants;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
class ECUtil {
    public static BigInteger generateK(BigInteger bigInteger, SecureRandom secureRandom) {
        int iBitLength = bigInteger.bitLength();
        while (true) {
            BigInteger bigInteger2 = new BigInteger(iBitLength, secureRandom);
            if (!bigInteger2.equals(ECConstants.ZERO) && bigInteger2.compareTo(bigInteger) < 0) {
                return bigInteger2;
            }
        }
    }
}
