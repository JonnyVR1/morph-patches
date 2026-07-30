package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.upstream.C2047a;
import com.google.android.gms.common.api.Api;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class dif0 extends lp2 {

    /* JADX INFO: renamed from: o */
    public final int f86382o;

    /* JADX INFO: renamed from: p */
    public final C1871k f86383p;

    /* JADX INFO: renamed from: q */
    public long f86384q;

    /* JADX INFO: renamed from: r */
    public boolean f86385r;

    public dif0(a5c a5cVar, C2047a c2047a, C1871k c1871k, int i, @Nullable Object obj, long j, long j2, long j3, int i2, C1871k c1871k2) {
        super(a5cVar, c2047a, c1871k, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.f86382o = i2;
        this.f86383p = c1871k2;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2044e
    /* JADX INFO: renamed from: a */
    public void mo11377a() throws IOException {
        np2 np2VarM150819j = m150819j();
        np2VarM150819j.m160444c(0L);
        int iM153239e = 0;
        m6j0 m6j0VarMo160443b = np2VarM150819j.mo160443b(0, this.f86382o);
        m6j0VarMo160443b.mo11110b(this.f86383p);
        try {
            long jMo11125n = this.f136919i.mo11125n(this.f136912b.m12106e(this.f86384q));
            if (jMo11125n != -1) {
                jMo11125n += this.f86384q;
            }
            lnd lndVar = new lnd(this.f136919i, this.f86384q, jMo11125n);
            while (true) {
                long j = this.f86384q;
                if (iM153239e == -1) {
                    m6j0VarMo160443b.mo11109a(this.f136917g, 1, (int) j, 0, null);
                    g5c.m124484a(this.f136919i);
                    this.f86385r = true;
                    return;
                }
                this.f86384q = j + ((long) iM153239e);
                iM153239e = m6j0VarMo160443b.m153239e(lndVar, Api.BaseClientBuilder.API_PRIORITY_OTHER, true);
            }
        } catch (Throwable th) {
            g5c.m124484a(this.f136919i);
            throw th;
        }
    }

    @Override // p149l.fix
    /* JADX INFO: renamed from: h */
    public boolean mo111872h() {
        return this.f86385r;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2044e
    /* JADX INFO: renamed from: c */
    public void mo11378c() {
    }
}
