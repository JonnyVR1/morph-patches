package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class rfe implements qfj0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f162779a = new byte[4096];

    @Override // p153l.qfj0
    /* JADX INFO: renamed from: c */
    public int mo11165c(e6c e6cVar, int i, boolean z, int i2) throws IOException {
        int i3 = e6cVar.read(this.f162779a, 0, Math.min(this.f162779a.length, i));
        if (i3 != -1) {
            return i3;
        }
        if (z) {
            return -1;
        }
        vg3.m201207a();
        return 0;
    }

    @Override // p153l.qfj0
    /* JADX INFO: renamed from: f */
    public void mo11166f(ig60 ig60Var, int i, int i2) {
        ig60Var.m139809V(i);
    }

    @Override // p153l.qfj0
    /* JADX INFO: renamed from: b */
    public void mo11164b(C1894k c1894k) {
    }

    @Override // p153l.qfj0
    /* JADX INFO: renamed from: a */
    public void mo11163a(long j, int i, int i2, int i3, @Nullable qfj0.C19562a c19562a) {
    }
}
