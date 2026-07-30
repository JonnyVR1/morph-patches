package p153l;

import com.google.android.exoplayer2.extractor.flv.C1887a;
import com.google.android.exoplayer2.extractor.flv.C1888b;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class awi implements zrf {

    /* JADX INFO: renamed from: q */
    public static final esf f73741q = new esf() { // from class: l.zvi
        @Override // p153l.esf
        /* JADX INFO: renamed from: b */
        public final zrf[] mo96504b() {
            return awi.m100644c();
        }
    };

    /* JADX INFO: renamed from: f */
    public bsf f73747f;

    /* JADX INFO: renamed from: h */
    public boolean f73749h;

    /* JADX INFO: renamed from: i */
    public long f73750i;

    /* JADX INFO: renamed from: j */
    public int f73751j;

    /* JADX INFO: renamed from: k */
    public int f73752k;

    /* JADX INFO: renamed from: l */
    public int f73753l;

    /* JADX INFO: renamed from: m */
    public long f73754m;

    /* JADX INFO: renamed from: n */
    public boolean f73755n;

    /* JADX INFO: renamed from: o */
    public C1887a f73756o;

    /* JADX INFO: renamed from: p */
    public C1888b f73757p;

    /* JADX INFO: renamed from: a */
    public final ig60 f73742a = new ig60(4);

    /* JADX INFO: renamed from: b */
    public final ig60 f73743b = new ig60(9);

    /* JADX INFO: renamed from: c */
    public final ig60 f73744c = new ig60(11);

    /* JADX INFO: renamed from: d */
    public final ig60 f73745d = new ig60();

    /* JADX INFO: renamed from: e */
    public final wde0 f73746e = new wde0();

    /* JADX INFO: renamed from: g */
    public int f73748g = 1;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ zrf[] m100644c() {
        return new zrf[]{new awi()};
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: a */
    public void mo11029a(long j, long j2) {
        if (j == 0) {
            this.f73748g = 1;
            this.f73749h = false;
        } else {
            this.f73748g = 3;
        }
        this.f73751j = 0;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: b */
    public void mo11030b(bsf bsfVar) {
        this.f73747f = bsfVar;
    }

    @RequiresNonNull({"extractorOutput"})
    /* JADX INFO: renamed from: d */
    public final void m100645d() {
        if (this.f73755n) {
            return;
        }
        this.f73747f.mo11424k(new mke0.C18641b(-9223372036854775807L));
        this.f73755n = true;
    }

    /* JADX INFO: renamed from: e */
    public final long m100646e() {
        if (this.f73749h) {
            return this.f73750i + this.f73754m;
        }
        if (this.f73746e.m205864d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f73754m;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: f */
    public boolean mo11031f(asf asfVar) throws IOException {
        asfVar.mo99900f(this.f73742a.m139815e(), 0, 3);
        this.f73742a.m139808U(0);
        if (this.f73742a.m139798K() != 4607062) {
            return false;
        }
        asfVar.mo99900f(this.f73742a.m139815e(), 0, 2);
        this.f73742a.m139808U(0);
        if ((this.f73742a.m139801N() & 250) != 0) {
            return false;
        }
        asfVar.mo99900f(this.f73742a.m139815e(), 0, 4);
        this.f73742a.m139808U(0);
        int iM139827q = this.f73742a.m139827q();
        asfVar.mo99902h();
        asfVar.mo99904m(iM139827q);
        asfVar.mo99900f(this.f73742a.m139815e(), 0, 4);
        this.f73742a.m139808U(0);
        return this.f73742a.m139827q() == 0;
    }

    /* JADX INFO: renamed from: g */
    public final ig60 m100647g(asf asfVar) throws IOException {
        int i = this.f73753l;
        int iM139812b = this.f73745d.m139812b();
        ig60 ig60Var = this.f73745d;
        if (i > iM139812b) {
            ig60Var.m139806S(new byte[Math.max(ig60Var.m139812b() * 2, this.f73753l)], 0);
        } else {
            ig60Var.m139808U(0);
        }
        this.f73745d.m139807T(this.f73753l);
        asfVar.readFully(this.f73745d.m139815e(), 0, this.f73753l);
        return this.f73745d;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: h */
    public int mo11032h(asf asfVar, ll80 ll80Var) throws IOException {
        w11.m204373i(this.f73747f);
        while (true) {
            int i = this.f73748g;
            if (i != 1) {
                if (i == 2) {
                    m100651l(asfVar);
                } else if (i != 3) {
                    if (i != 4) {
                        wpg0.m207458a();
                        return 0;
                    }
                    if (m100649j(asfVar)) {
                        return 0;
                    }
                } else if (!m100650k(asfVar)) {
                    return -1;
                }
            } else if (!m100648i(asfVar)) {
                return -1;
            }
        }
    }

    @RequiresNonNull({"extractorOutput"})
    /* JADX INFO: renamed from: i */
    public final boolean m100648i(asf asfVar) throws IOException {
        if (!asfVar.mo99898b(this.f73743b.m139815e(), 0, 9, true)) {
            return false;
        }
        this.f73743b.m139808U(0);
        this.f73743b.m139809V(4);
        int iM139795H = this.f73743b.m139795H();
        boolean z = (iM139795H & 4) != 0;
        boolean z2 = (iM139795H & 1) != 0;
        if (z && this.f73756o == null) {
            this.f73756o = new C1887a(this.f73747f.mo11416b(8, 1));
        }
        if (z2 && this.f73757p == null) {
            this.f73757p = new C1888b(this.f73747f.mo11416b(9, 2));
        }
        this.f73747f.mo11425l();
        this.f73751j = this.f73743b.m139827q() - 5;
        this.f73748g = 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    @RequiresNonNull({"extractorOutput"})
    /* JADX INFO: renamed from: j */
    public final boolean m100649j(asf asfVar) throws IOException {
        boolean zM10035a;
        boolean z;
        long j;
        long jM100646e = m100646e();
        int i = this.f73752k;
        if (i == 8 && this.f73756o != null) {
            m100645d();
            zM10035a = this.f73756o.m10035a(m100647g(asfVar), jM100646e);
        } else {
            if (i != 9 || this.f73757p == null) {
                if (i != 18 || this.f73755n) {
                    asfVar.mo99905o(this.f73753l);
                    zM10035a = false;
                    z = false;
                } else {
                    zM10035a = this.f73746e.m10035a(m100647g(asfVar), jM100646e);
                    long jM205864d = this.f73746e.m205864d();
                    if (jM205864d != -9223372036854775807L) {
                        this.f73747f.mo11424k(new ytm(this.f73746e.m205865e(), this.f73746e.m205866f(), jM205864d));
                        this.f73755n = true;
                    }
                }
                if (!this.f73749h && zM10035a) {
                    this.f73749h = true;
                    if (this.f73746e.m205864d() == -9223372036854775807L) {
                        j = -this.f73754m;
                    } else {
                        j = 0;
                    }
                    this.f73750i = j;
                }
                this.f73751j = 4;
                this.f73748g = 2;
                return z;
            }
            m100645d();
            zM10035a = this.f73757p.m10035a(m100647g(asfVar), jM100646e);
        }
        z = true;
        if (!this.f73749h) {
            this.f73749h = true;
            if (this.f73746e.m205864d() == -9223372036854775807L) {
                j = -this.f73754m;
            } else {
                j = 0;
            }
            this.f73750i = j;
        }
        this.f73751j = 4;
        this.f73748g = 2;
        return z;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m100650k(asf asfVar) throws IOException {
        if (!asfVar.mo99898b(this.f73744c.m139815e(), 0, 11, true)) {
            return false;
        }
        this.f73744c.m139808U(0);
        this.f73752k = this.f73744c.m139795H();
        this.f73753l = this.f73744c.m139798K();
        this.f73754m = this.f73744c.m139798K();
        this.f73754m = (((long) (this.f73744c.m139795H() << 24)) | this.f73754m) * 1000;
        this.f73744c.m139809V(3);
        this.f73748g = 4;
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final void m100651l(asf asfVar) throws IOException {
        asfVar.mo99905o(this.f73751j);
        this.f73751j = 0;
        this.f73748g = 3;
    }

    @Override // p153l.zrf
    public void release() {
    }
}
