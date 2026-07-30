package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.upstream.C2070a;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class v16 extends cq2 {

    /* JADX INFO: renamed from: o */
    public final int f181927o;

    /* JADX INFO: renamed from: p */
    public final long f181928p;

    /* JADX INFO: renamed from: q */
    public final p45 f181929q;

    /* JADX INFO: renamed from: r */
    public long f181930r;

    /* JADX INFO: renamed from: s */
    public volatile boolean f181931s;

    /* JADX INFO: renamed from: t */
    public boolean f181932t;

    public v16(g6c g6cVar, C2070a c2070a, C1894k c1894k, int i, @Nullable Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, p45 p45Var) {
        super(g6cVar, c2070a, c1894k, i, obj, j, j2, j3, j4, j5);
        this.f181927o = i2;
        this.f181928p = j6;
        this.f181929q = p45Var;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2067e
    /* JADX INFO: renamed from: a */
    public final void mo11431a() throws IOException {
        if (this.f181930r == 0) {
            eq2 eq2VarM111876j = m111876j();
            eq2VarM111876j.m121891c(this.f181928p);
            p45 p45Var = this.f181929q;
            p45.InterfaceC19292b interfaceC19292bM198975l = m198975l(eq2VarM111876j);
            long j = this.f83062k;
            long j2 = j == -9223372036854775807L ? -9223372036854775807L : j - this.f181928p;
            long j3 = this.f83063l;
            p45Var.mo120971c(interfaceC19292bM198975l, j2, j3 != -9223372036854775807L ? j3 - this.f181928p : -9223372036854775807L);
        }
        try {
            C2070a c2070aM12160e = this.f144927b.m12160e(this.f181930r);
            p4g0 p4g0Var = this.f144934i;
            qod qodVar = new qod(p4g0Var, c2070aM12160e.f9535g, p4g0Var.mo11179n(c2070aM12160e));
            do {
                try {
                    if (this.f181931s) {
                        break;
                    }
                } catch (Throwable th) {
                    this.f181930r = qodVar.getPosition() - this.f144927b.f9535g;
                    throw th;
                }
            } while (this.f181929q.mo120970a(qodVar));
            this.f181930r = qodVar.getPosition() - this.f144927b.f9535g;
            m6c.m157209a(this.f144934i);
            this.f181932t = !this.f181931s;
        } catch (Throwable th2) {
            m6c.m157209a(this.f144934i);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2067e
    /* JADX INFO: renamed from: c */
    public final void mo11432c() {
        this.f181931s = true;
    }

    @Override // p153l.crx
    /* JADX INFO: renamed from: g */
    public long mo112089g() {
        return this.f83373j + ((long) this.f181927o);
    }

    @Override // p153l.crx
    /* JADX INFO: renamed from: h */
    public boolean mo112090h() {
        return this.f181932t;
    }

    /* JADX INFO: renamed from: l */
    public p45.InterfaceC19292b m198975l(eq2 eq2Var) {
        return eq2Var;
    }
}
