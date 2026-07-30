package p153l;

import com.google.android.exoplayer2.C1894k;
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
public class qdg0 implements zrf {

    /* JADX INFO: renamed from: a */
    public final odg0 f156722a;

    /* JADX INFO: renamed from: d */
    public final C1894k f156725d;

    /* JADX INFO: renamed from: g */
    public bsf f156728g;

    /* JADX INFO: renamed from: h */
    public qfj0 f156729h;

    /* JADX INFO: renamed from: i */
    public int f156730i;

    /* JADX INFO: renamed from: b */
    public final oyb f156723b = new oyb();

    /* JADX INFO: renamed from: c */
    public final ig60 f156724c = new ig60();

    /* JADX INFO: renamed from: e */
    public final List<Long> f156726e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final List<ig60> f156727f = new ArrayList();

    /* JADX INFO: renamed from: j */
    public int f156731j = 0;

    /* JADX INFO: renamed from: k */
    public long f156732k = -9223372036854775807L;

    public qdg0(odg0 odg0Var, C1894k c1894k) {
        this.f156722a = odg0Var;
        this.f156725d = c1894k.m10336b().m10400g0("text/x-exoplayer-cues").m10378K(c1894k.f7785l).m10374G();
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: a */
    public void mo11029a(long j, long j2) {
        int i = this.f156731j;
        w11.m204371g((i == 0 || i == 5) ? false : true);
        this.f156732k = j2;
        if (this.f156731j == 2) {
            this.f156731j = 1;
        }
        if (this.f156731j == 4) {
            this.f156731j = 3;
        }
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: b */
    public void mo11030b(bsf bsfVar) {
        w11.m204371g(this.f156731j == 0);
        this.f156728g = bsfVar;
        this.f156729h = bsfVar.mo11416b(0, 3);
        this.f156728g.mo11425l();
        this.f156728g.mo11424k(new ytm(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.f156729h.mo11164b(this.f156725d);
        this.f156731j = 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m176160c() throws IOException, DecoderException {
        try {
            rdg0 rdg0VarMo135120a = this.f156722a.mo135120a();
            while (rdg0VarMo135120a == null) {
                Thread.sleep(5L);
                rdg0VarMo135120a = this.f156722a.mo135120a();
            }
            rdg0VarMo135120a.m9859v(this.f156730i);
            rdg0VarMo135120a.f7412c.put(this.f156724c.m139815e(), 0, this.f156730i);
            rdg0VarMo135120a.f7412c.limit(this.f156730i);
            this.f156722a.mo135121d(rdg0VarMo135120a);
            sdg0 sdg0VarMo131056c = this.f156722a.mo131056c();
            while (sdg0VarMo131056c == null) {
                Thread.sleep(5L);
                sdg0VarMo131056c = this.f156722a.mo131056c();
            }
            for (int i = 0; i < sdg0VarMo131056c.mo95503b(); i++) {
                byte[] bArrM169836a = this.f156723b.m169836a(sdg0VarMo131056c.mo95505g(sdg0VarMo131056c.mo95502a(i)));
                this.f156726e.add(Long.valueOf(sdg0VarMo131056c.mo95502a(i)));
                this.f156727f.add(new ig60(bArrM169836a));
            }
            sdg0VarMo131056c.mo150584u();
        } catch (SubtitleDecoderException e) {
            throw ParserException.createForMalformedContainer("SubtitleDecoder failed.", e);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m176161d(asf asfVar) throws IOException {
        int iM139812b = this.f156724c.m139812b();
        int i = this.f156730i;
        if (iM139812b == i) {
            this.f156724c.m139813c(i + 1024);
        }
        int i2 = asfVar.read(this.f156724c.m139815e(), this.f156730i, this.f156724c.m139812b() - this.f156730i);
        if (i2 != -1) {
            this.f156730i += i2;
        }
        long length = asfVar.getLength();
        return (length != -1 && ((long) this.f156730i) == length) || i2 == -1;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m176162e(asf asfVar) throws IOException {
        return asfVar.skip((asfVar.getLength() > (-1L) ? 1 : (asfVar.getLength() == (-1L) ? 0 : -1)) != 0 ? Ints.m16514d(asfVar.getLength()) : 1024) == -1;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: f */
    public boolean mo11031f(asf asfVar) throws IOException {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m176163g() {
        w11.m204373i(this.f156729h);
        w11.m204371g(this.f156726e.size() == this.f156727f.size());
        long j = this.f156732k;
        for (int iM105132f = j == -9223372036854775807L ? 0 : bmk0.m105132f(this.f156726e, Long.valueOf(j), true, true); iM105132f < this.f156727f.size(); iM105132f++) {
            ig60 ig60Var = this.f156727f.get(iM105132f);
            ig60Var.m139808U(0);
            int length = ig60Var.m139815e().length;
            this.f156729h.m176370d(ig60Var, length);
            this.f156729h.mo11163a(this.f156726e.get(iM105132f).longValue(), 1, length, 0, null);
        }
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: h */
    public int mo11032h(asf asfVar, ll80 ll80Var) throws IOException, DecoderException {
        int i = this.f156731j;
        w11.m204371g((i == 0 || i == 5) ? false : true);
        if (this.f156731j == 1) {
            this.f156724c.m139804Q(asfVar.getLength() != -1 ? Ints.m16514d(asfVar.getLength()) : 1024);
            this.f156730i = 0;
            this.f156731j = 2;
        }
        if (this.f156731j == 2 && m176161d(asfVar)) {
            m176160c();
            m176163g();
            this.f156731j = 4;
        }
        if (this.f156731j == 3 && m176162e(asfVar)) {
            m176163g();
            this.f156731j = 4;
        }
        return this.f156731j == 4 ? -1 : 0;
    }

    @Override // p153l.zrf
    public void release() {
        if (this.f156731j == 5) {
            return;
        }
        this.f156722a.release();
        this.f156731j = 5;
    }
}
