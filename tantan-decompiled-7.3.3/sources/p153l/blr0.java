package p153l;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class blr0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BigDecimal m104927a(BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
    }
}
