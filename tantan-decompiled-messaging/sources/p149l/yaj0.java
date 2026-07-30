package p149l;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class yaj0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f197212a = new byte[10];

    /* JADX INFO: renamed from: b */
    public boolean f197213b;

    /* JADX INFO: renamed from: c */
    public int f197214c;

    /* JADX INFO: renamed from: d */
    public long f197215d;

    /* JADX INFO: renamed from: e */
    public int f197216e;

    /* JADX INFO: renamed from: f */
    public int f197217f;

    /* JADX INFO: renamed from: g */
    public int f197218g;

    /* JADX INFO: renamed from: a */
    public void m213852a(m6j0 m6j0Var, @Nullable m6j0.C18401a c18401a) {
        if (this.f197214c > 0) {
            m6j0Var.mo11109a(this.f197215d, this.f197216e, this.f197217f, this.f197218g, c18401a);
            this.f197214c = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m213853b() {
        this.f197213b = false;
        this.f197214c = 0;
    }

    /* JADX INFO: renamed from: c */
    public void m213854c(m6j0 m6j0Var, long j, int i, int i2, int i3, @Nullable m6j0.C18401a c18401a) {
        p11.m167014h(this.f197218g <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f197213b) {
            int i4 = this.f197214c;
            int i5 = i4 + 1;
            this.f197214c = i5;
            if (i4 == 0) {
                this.f197215d = j;
                this.f197216e = i;
                this.f197217f = 0;
            }
            this.f197217f += i2;
            this.f197218g = i3;
            if (i5 >= 16) {
                m213852a(m6j0Var, c18401a);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m213855d(tqf tqfVar) throws IOException {
        if (this.f197213b) {
            return;
        }
        tqfVar.mo150655f(this.f197212a, 0, 10);
        tqfVar.mo150657h();
        if (C16561e9.m115328j(this.f197212a) == 0) {
            return;
        }
        this.f197213b = true;
    }
}
