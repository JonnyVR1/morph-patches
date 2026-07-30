package p149l;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class wwy0 {

    /* JADX INFO: renamed from: a */
    public int f188413a;

    /* JADX INFO: renamed from: b */
    public int f188414b;

    /* JADX INFO: renamed from: c */
    public int f188415c = 0;

    /* JADX INFO: renamed from: d */
    public pwy0[] f188416d = new pwy0[100];

    public wwy0(boolean z, int i) {
    }

    /* JADX INFO: renamed from: a */
    public final synchronized int m205888a() {
        return this.f188414b * 65536;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized pwy0 m205889b() {
        pwy0 pwy0Var;
        try {
            this.f188414b++;
            int i = this.f188415c;
            if (i > 0) {
                pwy0[] pwy0VarArr = this.f188416d;
                int i2 = i - 1;
                this.f188415c = i2;
                pwy0Var = pwy0VarArr[i2];
                if (pwy0Var == null) {
                    throw null;
                }
                pwy0VarArr[i2] = null;
            } else {
                pwy0Var = new pwy0(new byte[65536], 0);
                int i3 = this.f188414b;
                pwy0[] pwy0VarArr2 = this.f188416d;
                int length = pwy0VarArr2.length;
                if (i3 > length) {
                    this.f188416d = (pwy0[]) Arrays.copyOf(pwy0VarArr2, length + length);
                    return pwy0Var;
                }
            }
            return pwy0Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m205890c(pwy0 pwy0Var) {
        pwy0[] pwy0VarArr = this.f188416d;
        int i = this.f188415c;
        this.f188415c = i + 1;
        pwy0VarArr[i] = pwy0Var;
        this.f188414b--;
        notifyAll();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m205891d(@Nullable qwy0 qwy0Var) {
        while (qwy0Var != null) {
            try {
                pwy0[] pwy0VarArr = this.f188416d;
                int i = this.f188415c;
                this.f188415c = i + 1;
                pwy0VarArr[i] = qwy0Var.zzc();
                this.f188414b--;
                qwy0Var = qwy0Var.zzd();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m205892e() {
        m205893f(0);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m205893f(int i) {
        int i2 = this.f188413a;
        this.f188413a = i;
        if (i < i2) {
            m205894g();
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m205894g() {
        int i = this.f188413a;
        int i2 = ggw0.f102568a;
        int iMax = Math.max(0, ((i + j6f.COLOR_SPACE_UNCALIBRATED) / 65536) - this.f188414b);
        int i3 = this.f188415c;
        if (iMax >= i3) {
            return;
        }
        Arrays.fill(this.f188416d, iMax, i3, (Object) null);
        this.f188415c = iMax;
    }
}
