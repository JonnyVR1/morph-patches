package p153l;

import androidx.annotation.Nullable;
import com.immomo.momomediaext.sei.BaseSei;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class brf0 {

    /* JADX INFO: renamed from: c */
    public static final brf0 f78020c = new brf0(-1, -1);

    /* JADX INFO: renamed from: d */
    public static final brf0 f78021d = new brf0(0, 0);

    /* JADX INFO: renamed from: a */
    public final int f78022a;

    /* JADX INFO: renamed from: b */
    public final int f78023b;

    public brf0(int i, int i2) {
        w11.m204365a((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.f78022a = i;
        this.f78023b = i2;
    }

    /* JADX INFO: renamed from: a */
    public int m106134a() {
        return this.f78023b;
    }

    /* JADX INFO: renamed from: b */
    public int m106135b() {
        return this.f78022a;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof brf0) {
            brf0 brf0Var = (brf0) obj;
            if (this.f78022a == brf0Var.f78022a && this.f78023b == brf0Var.f78023b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f78023b;
        int i2 = this.f78022a;
        return ((i2 >>> 16) | (i2 << 16)) ^ i;
    }

    public String toString() {
        return this.f78022a + BaseSei.f14624X + this.f78023b;
    }
}
