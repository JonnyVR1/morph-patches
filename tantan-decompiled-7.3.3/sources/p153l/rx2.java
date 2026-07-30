package p153l;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes7.dex */
public final class rx2 {

    /* JADX INFO: renamed from: a */
    public static final BigInteger f165289a = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);

    /* JADX INFO: renamed from: b */
    public static final double f165290b = Math.log(10.0d);

    /* JADX INFO: renamed from: c */
    public static final double f165291c = Math.log(2.0d);

    /* JADX INFO: renamed from: a */
    public static BigInteger m183527a(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger).divide(new BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }
}
