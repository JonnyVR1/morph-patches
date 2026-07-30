package p149l;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.mlkit.p033nl.languageid.LanguageIdentifier;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class ntt0 {

    /* JADX INFO: renamed from: f */
    public static final String f140532f = Integer.toString(0, 36);

    /* JADX INFO: renamed from: g */
    public static final String f140533g = Integer.toString(1, 36);

    /* JADX INFO: renamed from: h */
    @Deprecated
    public static final g8y0 f140534h = new g8y0() { // from class: l.est0
    };

    /* JADX INFO: renamed from: a */
    public final int f140535a = 1;

    /* JADX INFO: renamed from: b */
    public final String f140536b;

    /* JADX INFO: renamed from: c */
    public final int f140537c;

    /* JADX INFO: renamed from: d */
    public final mhr0[] f140538d;

    /* JADX INFO: renamed from: e */
    public int f140539e;

    public ntt0(String str, mhr0... mhr0VarArr) {
        this.f140536b = str;
        this.f140538d = mhr0VarArr;
        int iM196365b = uys0.m196365b(mhr0VarArr[0].f133892l);
        this.f140537c = iM196365b == -1 ? uys0.m196365b(mhr0VarArr[0].f133891k) : iM196365b;
        m161412d(mhr0VarArr[0].f133883c);
        int i = mhr0VarArr[0].f133885e;
    }

    /* JADX INFO: renamed from: d */
    public static String m161412d(@Nullable String str) {
        return (str == null || str.equals(LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG)) ? "" : str;
    }

    /* JADX INFO: renamed from: a */
    public final int m161413a(mhr0 mhr0Var) {
        for (int i = 0; i <= 0; i++) {
            if (mhr0Var == this.f140538d[i]) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final mhr0 m161414b(int i) {
        return this.f140538d[i];
    }

    @CheckResult
    /* JADX INFO: renamed from: c */
    public final ntt0 m161415c(String str) {
        return new ntt0(str, this.f140538d);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ntt0.class == obj.getClass()) {
            ntt0 ntt0Var = (ntt0) obj;
            if (this.f140536b.equals(ntt0Var.f140536b) && Arrays.equals(this.f140538d, ntt0Var.f140538d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f140539e;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((this.f140536b.hashCode() + 527) * 31) + Arrays.hashCode(this.f140538d);
        this.f140539e = iHashCode;
        return iHashCode;
    }
}
