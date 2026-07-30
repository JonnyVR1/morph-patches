package p149l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class acr0 implements ymr0 {

    /* JADX INFO: renamed from: a */
    public final Double f68874a;

    public acr0(Double d) {
        if (d == null) {
            this.f68874a = Double.valueOf(Double.NaN);
        } else {
            this.f68874a = d;
        }
    }

    @Override // p149l.ymr0
    /* JADX INFO: renamed from: c */
    public final ymr0 mo95833c(String str, a9x0 a9x0Var, List<ymr0> list) {
        if ("toString".equals(str)) {
            return new ppr0(zzf());
        }
        dqi0.m113073a("%s.%s is not a function.", new Object[]{zzf(), str});
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acr0) {
            return this.f68874a.equals(((acr0) obj).f68874a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f68874a.hashCode();
    }

    public final String toString() {
        return zzf();
    }

    @Override // p149l.ymr0
    public final ymr0 zzc() {
        return new acr0(this.f68874a);
    }

    @Override // p149l.ymr0
    public final Boolean zzd() {
        return Boolean.valueOf((Double.isNaN(this.f68874a.doubleValue()) || this.f68874a.doubleValue() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) ? false : true);
    }

    @Override // p149l.ymr0
    public final Double zze() {
        return this.f68874a;
    }

    @Override // p149l.ymr0
    public final String zzf() {
        if (Double.isNaN(this.f68874a.doubleValue())) {
            return "NaN";
        }
        boolean zIsInfinite = Double.isInfinite(this.f68874a.doubleValue());
        Double d = this.f68874a;
        if (zIsInfinite) {
            return d.doubleValue() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d.doubleValue());
        BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : vbr0.m197734a(bigDecimalValueOf);
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i >= 0 || i <= -7) && (i < 0 || i >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    @Override // p149l.ymr0
    public final Iterator<ymr0> zzh() {
        return null;
    }
}
