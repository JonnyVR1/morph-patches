package p149l;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vbr0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BigDecimal m197734a(BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
    }
}
