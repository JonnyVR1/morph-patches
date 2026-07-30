package p153l;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class c6z0 {

    /* JADX INFO: renamed from: a */
    public int f80016a;

    /* JADX INFO: renamed from: b */
    public int f80017b;

    /* JADX INFO: renamed from: c */
    public int f80018c = 0;

    /* JADX INFO: renamed from: d */
    public v5z0[] f80019d = new v5z0[100];

    public c6z0(boolean z, int i) {
    }

    /* JADX INFO: renamed from: a */
    public final synchronized int m108194a() {
        return this.f80017b * 65536;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized v5z0 m108195b() {
        v5z0 v5z0Var;
        try {
            this.f80017b++;
            int i = this.f80018c;
            if (i > 0) {
                v5z0[] v5z0VarArr = this.f80019d;
                int i2 = i - 1;
                this.f80018c = i2;
                v5z0Var = v5z0VarArr[i2];
                if (v5z0Var == null) {
                    throw null;
                }
                v5z0VarArr[i2] = null;
            } else {
                v5z0Var = new v5z0(new byte[65536], 0);
                int i3 = this.f80017b;
                v5z0[] v5z0VarArr2 = this.f80019d;
                int length = v5z0VarArr2.length;
                if (i3 > length) {
                    this.f80019d = (v5z0[]) Arrays.copyOf(v5z0VarArr2, length + length);
                    return v5z0Var;
                }
            }
            return v5z0Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m108196c(v5z0 v5z0Var) {
        v5z0[] v5z0VarArr = this.f80019d;
        int i = this.f80018c;
        this.f80018c = i + 1;
        v5z0VarArr[i] = v5z0Var;
        this.f80017b--;
        notifyAll();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m108197d(@Nullable w5z0 w5z0Var) {
        while (w5z0Var != null) {
            try {
                v5z0[] v5z0VarArr = this.f80019d;
                int i = this.f80018c;
                this.f80018c = i + 1;
                v5z0VarArr[i] = w5z0Var.zzc();
                this.f80017b--;
                w5z0Var = w5z0Var.zzd();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m108198e() {
        m108199f(0);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m108199f(int i) {
        int i2 = this.f80016a;
        this.f80016a = i;
        if (i < i2) {
            m108200g();
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m108200g() {
        int i = this.f80016a;
        int i2 = mpw0.f137957a;
        int iMax = Math.max(0, ((i + p7f.COLOR_SPACE_UNCALIBRATED) / 65536) - this.f80017b);
        int i3 = this.f80018c;
        if (iMax >= i3) {
            return;
        }
        Arrays.fill(this.f80019d, iMax, i3, (Object) null);
        this.f80018c = iMax;
    }
}
