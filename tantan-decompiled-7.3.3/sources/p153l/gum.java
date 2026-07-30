package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.upstream.C2070a;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class gum extends o45 {

    /* JADX INFO: renamed from: j */
    public final p45 f106518j;

    /* JADX INFO: renamed from: k */
    public p45.InterfaceC19292b f106519k;

    /* JADX INFO: renamed from: l */
    public long f106520l;

    /* JADX INFO: renamed from: m */
    public volatile boolean f106521m;

    public gum(g6c g6cVar, C2070a c2070a, C1894k c1894k, int i, @Nullable Object obj, p45 p45Var) {
        super(g6cVar, c2070a, 2, c1894k, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f106518j = p45Var;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2067e
    /* JADX INFO: renamed from: a */
    public void mo11431a() throws IOException {
        if (this.f106520l == 0) {
            this.f106518j.mo120971c(this.f106519k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C2070a c2070aM12160e = this.f144927b.m12160e(this.f106520l);
            p4g0 p4g0Var = this.f144934i;
            qod qodVar = new qod(p4g0Var, c2070aM12160e.f9535g, p4g0Var.mo11179n(c2070aM12160e));
            while (!this.f106521m && this.f106518j.mo120970a(qodVar)) {
                try {
                } catch (Throwable th) {
                    this.f106520l = qodVar.getPosition() - this.f144927b.f9535g;
                    throw th;
                }
            }
            this.f106520l = qodVar.getPosition() - this.f144927b.f9535g;
            m6c.m157209a(this.f144934i);
        } catch (Throwable th2) {
            m6c.m157209a(this.f144934i);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2067e
    /* JADX INFO: renamed from: c */
    public void mo11432c() {
        this.f106521m = true;
    }

    /* JADX INFO: renamed from: g */
    public void m132345g(p45.InterfaceC19292b interfaceC19292b) {
        this.f106519k = interfaceC19292b;
    }
}
