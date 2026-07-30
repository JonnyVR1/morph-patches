package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class tnx0 {

    /* JADX INFO: renamed from: a */
    public final String f171293a;

    /* JADX INFO: renamed from: b */
    public final mhr0 f171294b;

    /* JADX INFO: renamed from: c */
    public final mhr0 f171295c;

    /* JADX INFO: renamed from: d */
    public final int f171296d;

    /* JADX INFO: renamed from: e */
    public final int f171297e;

    public tnx0(String str, mhr0 mhr0Var, mhr0 mhr0Var2, int i, int i2) {
        boolean z = true;
        if (i != 0) {
            if (i2 == 0) {
                i2 = 0;
            } else {
                z = false;
            }
        }
        f5v0.m119533d(z);
        f5v0.m119532c(str);
        this.f171293a = str;
        this.f171294b = mhr0Var;
        mhr0Var2.getClass();
        this.f171295c = mhr0Var2;
        this.f171296d = i;
        this.f171297e = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tnx0.class == obj.getClass()) {
            tnx0 tnx0Var = (tnx0) obj;
            if (this.f171296d == tnx0Var.f171296d && this.f171297e == tnx0Var.f171297e && this.f171293a.equals(tnx0Var.f171293a) && this.f171294b.equals(tnx0Var.f171294b) && this.f171295c.equals(tnx0Var.f171295c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f171296d + 527) * 31) + this.f171297e) * 31) + this.f171293a.hashCode()) * 31) + this.f171294b.hashCode()) * 31) + this.f171295c.hashCode();
    }
}
