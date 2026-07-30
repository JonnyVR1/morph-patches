package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class nee implements m6j0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f138607a = new byte[4096];

    @Override // p149l.m6j0
    /* JADX INFO: renamed from: c */
    public int mo11111c(w4c w4cVar, int i, boolean z, int i2) throws IOException {
        int i3 = w4cVar.read(this.f138607a, 0, Math.min(this.f138607a.length, i));
        if (i3 != -1) {
            return i3;
        }
        if (z) {
            return -1;
        }
        hg3.m130807a();
        return 0;
    }

    @Override // p149l.m6j0
    /* JADX INFO: renamed from: f */
    public void mo11112f(d860 d860Var, int i, int i2) {
        d860Var.m110293V(i);
    }

    @Override // p149l.m6j0
    /* JADX INFO: renamed from: b */
    public void mo11110b(C1871k c1871k) {
    }

    @Override // p149l.m6j0
    /* JADX INFO: renamed from: a */
    public void mo11109a(long j, int i, int i2, int i3, @Nullable m6j0.C18401a c18401a) {
    }
}
