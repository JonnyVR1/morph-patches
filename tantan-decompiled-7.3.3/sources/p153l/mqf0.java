package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.upstream.C2070a;
import com.google.android.gms.common.api.Api;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class mqf0 extends cq2 {

    /* JADX INFO: renamed from: o */
    public final int f138049o;

    /* JADX INFO: renamed from: p */
    public final C1894k f138050p;

    /* JADX INFO: renamed from: q */
    public long f138051q;

    /* JADX INFO: renamed from: r */
    public boolean f138052r;

    public mqf0(g6c g6cVar, C2070a c2070a, C1894k c1894k, int i, @Nullable Object obj, long j, long j2, long j3, int i2, C1894k c1894k2) {
        super(g6cVar, c2070a, c1894k, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.f138049o = i2;
        this.f138050p = c1894k2;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2067e
    /* JADX INFO: renamed from: a */
    public void mo11431a() throws IOException {
        eq2 eq2VarM111876j = m111876j();
        eq2VarM111876j.m121891c(0L);
        int iM176371e = 0;
        qfj0 qfj0VarMo121890b = eq2VarM111876j.mo121890b(0, this.f138049o);
        qfj0VarMo121890b.mo11164b(this.f138050p);
        try {
            long jMo11179n = this.f144934i.mo11179n(this.f144927b.m12160e(this.f138051q));
            if (jMo11179n != -1) {
                jMo11179n += this.f138051q;
            }
            qod qodVar = new qod(this.f144934i, this.f138051q, jMo11179n);
            while (true) {
                long j = this.f138051q;
                if (iM176371e == -1) {
                    qfj0VarMo121890b.mo11163a(this.f144932g, 1, (int) j, 0, null);
                    m6c.m157209a(this.f144934i);
                    this.f138052r = true;
                    return;
                }
                this.f138051q = j + ((long) iM176371e);
                iM176371e = qfj0VarMo121890b.m176371e(qodVar, Api.BaseClientBuilder.API_PRIORITY_OTHER, true);
            }
        } catch (Throwable th) {
            m6c.m157209a(this.f144934i);
            throw th;
        }
    }

    @Override // p153l.crx
    /* JADX INFO: renamed from: h */
    public boolean mo112090h() {
        return this.f138052r;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2067e
    /* JADX INFO: renamed from: c */
    public void mo11432c() {
    }
}
