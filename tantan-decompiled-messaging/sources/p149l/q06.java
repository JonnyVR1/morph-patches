package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.upstream.C2047a;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class q06 extends lp2 {

    /* JADX INFO: renamed from: o */
    public final int f152009o;

    /* JADX INFO: renamed from: p */
    public final long f152010p;

    /* JADX INFO: renamed from: q */
    public final o35 f152011q;

    /* JADX INFO: renamed from: r */
    public long f152012r;

    /* JADX INFO: renamed from: s */
    public volatile boolean f152013s;

    /* JADX INFO: renamed from: t */
    public boolean f152014t;

    public q06(a5c a5cVar, C2047a c2047a, C1871k c1871k, int i, @Nullable Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, o35 o35Var) {
        super(a5cVar, c2047a, c1871k, i, obj, j, j2, j3, j4, j5);
        this.f152009o = i2;
        this.f152010p = j6;
        this.f152011q = o35Var;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2044e
    /* JADX INFO: renamed from: a */
    public final void mo11377a() throws IOException {
        if (this.f152012r == 0) {
            np2 np2VarM150819j = m150819j();
            np2VarM150819j.m160444c(this.f152010p);
            o35 o35Var = this.f152011q;
            o35.InterfaceC18830b interfaceC18830bM172289l = m172289l(np2VarM150819j);
            long j = this.f129154k;
            long j2 = j == -9223372036854775807L ? -9223372036854775807L : j - this.f152010p;
            long j3 = this.f129155l;
            o35Var.mo162407c(interfaceC18830bM172289l, j2, j3 != -9223372036854775807L ? j3 - this.f152010p : -9223372036854775807L);
        }
        try {
            C2047a c2047aM12106e = this.f136912b.m12106e(this.f152012r);
            gwf0 gwf0Var = this.f136919i;
            lnd lndVar = new lnd(gwf0Var, c2047aM12106e.f9498g, gwf0Var.mo11125n(c2047aM12106e));
            do {
                try {
                    if (this.f152013s) {
                        break;
                    }
                } catch (Throwable th) {
                    this.f152012r = lndVar.getPosition() - this.f136912b.f9498g;
                    throw th;
                }
            } while (this.f152011q.mo162406a(lndVar));
            this.f152012r = lndVar.getPosition() - this.f136912b.f9498g;
            g5c.m124484a(this.f136919i);
            this.f152014t = !this.f152013s;
        } catch (Throwable th2) {
            g5c.m124484a(this.f136919i);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2044e
    /* JADX INFO: renamed from: c */
    public final void mo11378c() {
        this.f152013s = true;
    }

    @Override // p149l.fix
    /* JADX INFO: renamed from: g */
    public long mo121564g() {
        return this.f97730j + ((long) this.f152009o);
    }

    @Override // p149l.fix
    /* JADX INFO: renamed from: h */
    public boolean mo111872h() {
        return this.f152014t;
    }

    /* JADX INFO: renamed from: l */
    public o35.InterfaceC18830b m172289l(np2 np2Var) {
        return np2Var;
    }
}
