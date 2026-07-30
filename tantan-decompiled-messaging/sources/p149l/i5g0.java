package p149l;

import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class i5g0 implements sqf {

    /* JADX INFO: renamed from: a */
    public final g5g0 f111578a;

    /* JADX INFO: renamed from: d */
    public final C1871k f111581d;

    /* JADX INFO: renamed from: g */
    public uqf f111584g;

    /* JADX INFO: renamed from: h */
    public m6j0 f111585h;

    /* JADX INFO: renamed from: i */
    public int f111586i;

    /* JADX INFO: renamed from: b */
    public final axb f111579b = new axb();

    /* JADX INFO: renamed from: c */
    public final d860 f111580c = new d860();

    /* JADX INFO: renamed from: e */
    public final List<Long> f111582e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final List<d860> f111583f = new ArrayList();

    /* JADX INFO: renamed from: j */
    public int f111587j = 0;

    /* JADX INFO: renamed from: k */
    public long f111588k = -9223372036854775807L;

    public i5g0(g5g0 g5g0Var, C1871k c1871k) {
        this.f111578a = g5g0Var;
        this.f111581d = c1871k.m10282b().m10346g0("text/x-exoplayer-cues").m10324K(c1871k.f7748l).m10320G();
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: a */
    public void mo10975a(long j, long j2) {
        int i = this.f111587j;
        p11.m167013g((i == 0 || i == 5) ? false : true);
        this.f111588k = j2;
        if (this.f111587j == 2) {
            this.f111587j = 1;
        }
        if (this.f111587j == 4) {
            this.f111587j = 3;
        }
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: b */
    public void mo10976b(uqf uqfVar) {
        p11.m167013g(this.f111587j == 0);
        this.f111584g = uqfVar;
        this.f111585h = uqfVar.mo11362b(0, 3);
        this.f111584g.mo11371l();
        this.f111584g.mo11370k(new wrm(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.f111585h.mo11110b(this.f111581d);
        this.f111587j = 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m134482c() throws IOException, DecoderException {
        try {
            j5g0 j5g0VarMo101811a = this.f111578a.mo101811a();
            while (j5g0VarMo101811a == null) {
                Thread.sleep(5L);
                j5g0VarMo101811a = this.f111578a.mo101811a();
            }
            j5g0VarMo101811a.m9805v(this.f111586i);
            j5g0VarMo101811a.f7375c.put(this.f111580c.m110299e(), 0, this.f111586i);
            j5g0VarMo101811a.f7375c.limit(this.f111586i);
            this.f111578a.mo101813d(j5g0VarMo101811a);
            k5g0 k5g0VarMo101812c = this.f111578a.mo101812c();
            while (k5g0VarMo101812c == null) {
                Thread.sleep(5L);
                k5g0VarMo101812c = this.f111578a.mo101812c();
            }
            for (int i = 0; i < k5g0VarMo101812c.mo114792b(); i++) {
                byte[] bArrM99397a = this.f111579b.m99397a(k5g0VarMo101812c.mo114794g(k5g0VarMo101812c.mo114791a(i)));
                this.f111582e.add(Long.valueOf(k5g0VarMo101812c.mo114791a(i)));
                this.f111583f.add(new d860(bArrM99397a));
            }
            k5g0VarMo101812c.mo121353u();
        } catch (SubtitleDecoderException e) {
            throw ParserException.createForMalformedContainer("SubtitleDecoder failed.", e);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m134483d(tqf tqfVar) throws IOException {
        int iM110296b = this.f111580c.m110296b();
        int i = this.f111586i;
        if (iM110296b == i) {
            this.f111580c.m110297c(i + 1024);
        }
        int i2 = tqfVar.read(this.f111580c.m110299e(), this.f111586i, this.f111580c.m110296b() - this.f111586i);
        if (i2 != -1) {
            this.f111586i += i2;
        }
        long length = tqfVar.getLength();
        return (length != -1 && ((long) this.f111586i) == length) || i2 == -1;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m134484e(tqf tqfVar) throws IOException {
        return tqfVar.skip((tqfVar.getLength() > (-1L) ? 1 : (tqfVar.getLength() == (-1L) ? 0 : -1)) != 0 ? Ints.m16459d(tqfVar.getLength()) : 1024) == -1;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: f */
    public boolean mo10977f(tqf tqfVar) throws IOException {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m134485g() {
        p11.m167015i(this.f111585h);
        p11.m167013g(this.f111582e.size() == this.f111583f.size());
        long j = this.f111588k;
        for (int iM197854f = j == -9223372036854775807L ? 0 : vck0.m197854f(this.f111582e, Long.valueOf(j), true, true); iM197854f < this.f111583f.size(); iM197854f++) {
            d860 d860Var = this.f111583f.get(iM197854f);
            d860Var.m110292U(0);
            int length = d860Var.m110299e().length;
            this.f111585h.m153238d(d860Var, length);
            this.f111585h.mo11109a(this.f111582e.get(iM197854f).longValue(), 1, length, 0, null);
        }
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: h */
    public int mo10978h(tqf tqfVar, fd80 fd80Var) throws IOException, DecoderException {
        int i = this.f111587j;
        p11.m167013g((i == 0 || i == 5) ? false : true);
        if (this.f111587j == 1) {
            this.f111580c.m110288Q(tqfVar.getLength() != -1 ? Ints.m16459d(tqfVar.getLength()) : 1024);
            this.f111586i = 0;
            this.f111587j = 2;
        }
        if (this.f111587j == 2 && m134483d(tqfVar)) {
            m134482c();
            m134485g();
            this.f111587j = 4;
        }
        if (this.f111587j == 3 && m134484e(tqfVar)) {
            m134485g();
            this.f111587j = 4;
        }
        return this.f111587j == 4 ? -1 : 0;
    }

    @Override // p149l.sqf
    public void release() {
        if (this.f111587j == 5) {
            return;
        }
        this.f111578a.release();
        this.f111587j = 5;
    }
}
