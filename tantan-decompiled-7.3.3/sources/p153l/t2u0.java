package p153l;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.mlkit.p034nl.languageid.LanguageIdentifier;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class t2u0 {

    /* JADX INFO: renamed from: f */
    public static final String f171817f = Integer.toString(0, 36);

    /* JADX INFO: renamed from: g */
    public static final String f171818g = Integer.toString(1, 36);

    /* JADX INFO: renamed from: h */
    @Deprecated
    public static final mhy0 f171819h = new mhy0() { // from class: l.k1u0
    };

    /* JADX INFO: renamed from: a */
    public final int f171820a = 1;

    /* JADX INFO: renamed from: b */
    public final String f171821b;

    /* JADX INFO: renamed from: c */
    public final int f171822c;

    /* JADX INFO: renamed from: d */
    public final sqr0[] f171823d;

    /* JADX INFO: renamed from: e */
    public int f171824e;

    public t2u0(String str, sqr0... sqr0VarArr) {
        this.f171821b = str;
        this.f171823d = sqr0VarArr;
        int iM96490b = a8t0.m96490b(sqr0VarArr[0].f170251l);
        this.f171822c = iM96490b == -1 ? a8t0.m96490b(sqr0VarArr[0].f170250k) : iM96490b;
        m189001d(sqr0VarArr[0].f170242c);
        int i = sqr0VarArr[0].f170244e;
    }

    /* JADX INFO: renamed from: d */
    public static String m189001d(@Nullable String str) {
        return (str == null || str.equals(LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG)) ? "" : str;
    }

    /* JADX INFO: renamed from: a */
    public final int m189002a(sqr0 sqr0Var) {
        for (int i = 0; i <= 0; i++) {
            if (sqr0Var == this.f171823d[i]) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final sqr0 m189003b(int i) {
        return this.f171823d[i];
    }

    @CheckResult
    /* JADX INFO: renamed from: c */
    public final t2u0 m189004c(String str) {
        return new t2u0(str, this.f171823d);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t2u0.class == obj.getClass()) {
            t2u0 t2u0Var = (t2u0) obj;
            if (this.f171821b.equals(t2u0Var.f171821b) && Arrays.equals(this.f171823d, t2u0Var.f171823d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f171824e;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((this.f171821b.hashCode() + 527) * 31) + Arrays.hashCode(this.f171823d);
        this.f171824e = iHashCode;
        return iHashCode;
    }
}
