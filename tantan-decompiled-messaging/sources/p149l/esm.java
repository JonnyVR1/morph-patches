package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.upstream.C2047a;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class esm extends n35 {

    /* JADX INFO: renamed from: j */
    public final o35 f93036j;

    /* JADX INFO: renamed from: k */
    public o35.InterfaceC18830b f93037k;

    /* JADX INFO: renamed from: l */
    public long f93038l;

    /* JADX INFO: renamed from: m */
    public volatile boolean f93039m;

    public esm(a5c a5cVar, C2047a c2047a, C1871k c1871k, int i, @Nullable Object obj, o35 o35Var) {
        super(a5cVar, c2047a, 2, c1871k, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f93036j = o35Var;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2044e
    /* JADX INFO: renamed from: a */
    public void mo11377a() throws IOException {
        if (this.f93038l == 0) {
            this.f93036j.mo162407c(this.f93037k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C2047a c2047aM12106e = this.f136912b.m12106e(this.f93038l);
            gwf0 gwf0Var = this.f136919i;
            lnd lndVar = new lnd(gwf0Var, c2047aM12106e.f9498g, gwf0Var.mo11125n(c2047aM12106e));
            while (!this.f93039m && this.f93036j.mo162406a(lndVar)) {
                try {
                } catch (Throwable th) {
                    this.f93038l = lndVar.getPosition() - this.f136912b.f9498g;
                    throw th;
                }
            }
            this.f93038l = lndVar.getPosition() - this.f136912b.f9498g;
            g5c.m124484a(this.f136919i);
        } catch (Throwable th2) {
            g5c.m124484a(this.f136919i);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2044e
    /* JADX INFO: renamed from: c */
    public void mo11378c() {
        this.f93039m = true;
    }

    /* JADX INFO: renamed from: g */
    public void m117949g(o35.InterfaceC18830b interfaceC18830b) {
        this.f93037k = interfaceC18830b;
    }
}
