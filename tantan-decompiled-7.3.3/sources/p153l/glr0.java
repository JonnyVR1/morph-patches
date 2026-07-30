package p153l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class glr0 implements ewr0 {

    /* JADX INFO: renamed from: a */
    public final Double f104881a;

    public glr0(Double d) {
        if (d == null) {
            this.f104881a = Double.valueOf(Double.NaN);
        } else {
            this.f104881a = d;
        }
    }

    @Override // p153l.ewr0
    /* JADX INFO: renamed from: c */
    public final ewr0 mo100514c(String str, gix0 gix0Var, List<ewr0> list) {
        if ("toString".equals(str)) {
            return new vyr0(zzf());
        }
        gzi0.m133102a("%s.%s is not a function.", new Object[]{zzf(), str});
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof glr0) {
            return this.f104881a.equals(((glr0) obj).f104881a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f104881a.hashCode();
    }

    public final String toString() {
        return zzf();
    }

    @Override // p153l.ewr0
    public final ewr0 zzc() {
        return new glr0(this.f104881a);
    }

    @Override // p153l.ewr0
    public final Boolean zzd() {
        return Boolean.valueOf((Double.isNaN(this.f104881a.doubleValue()) || this.f104881a.doubleValue() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) ? false : true);
    }

    @Override // p153l.ewr0
    public final Double zze() {
        return this.f104881a;
    }

    @Override // p153l.ewr0
    public final String zzf() {
        if (Double.isNaN(this.f104881a.doubleValue())) {
            return "NaN";
        }
        boolean zIsInfinite = Double.isInfinite(this.f104881a.doubleValue());
        Double d = this.f104881a;
        if (zIsInfinite) {
            return d.doubleValue() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d.doubleValue());
        BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : blr0.m104927a(bigDecimalValueOf);
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

    @Override // p153l.ewr0
    public final Iterator<ewr0> zzh() {
        return null;
    }
}
