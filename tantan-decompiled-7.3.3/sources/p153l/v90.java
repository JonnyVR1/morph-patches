package p153l;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class v90 implements zrf {

    /* JADX INFO: renamed from: m */
    public static final esf f182918m = new esf() { // from class: l.u90
        @Override // p153l.esf
        /* JADX INFO: renamed from: b */
        public final zrf[] mo96504b() {
            return v90.m200363c();
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f182919a;

    /* JADX INFO: renamed from: b */
    public final w90 f182920b;

    /* JADX INFO: renamed from: c */
    public final ig60 f182921c;

    /* JADX INFO: renamed from: d */
    public final ig60 f182922d;

    /* JADX INFO: renamed from: e */
    public final hg60 f182923e;

    /* JADX INFO: renamed from: f */
    public bsf f182924f;

    /* JADX INFO: renamed from: g */
    public long f182925g;

    /* JADX INFO: renamed from: h */
    public long f182926h;

    /* JADX INFO: renamed from: i */
    public int f182927i;

    /* JADX INFO: renamed from: j */
    public boolean f182928j;

    /* JADX INFO: renamed from: k */
    public boolean f182929k;

    /* JADX INFO: renamed from: l */
    public boolean f182930l;

    public v90(int i) {
        this.f182919a = (i & 2) != 0 ? i | 1 : i;
        this.f182920b = new w90(true);
        this.f182921c = new ig60(2048);
        this.f182927i = -1;
        this.f182926h = -1L;
        ig60 ig60Var = new ig60(10);
        this.f182922d = ig60Var;
        this.f182923e = new hg60(ig60Var.m139815e());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ zrf[] m200363c() {
        return new zrf[]{new v90()};
    }

    /* JADX INFO: renamed from: e */
    private static int m200364e(int i, long j) {
        return (int) ((((long) i) * 8000000) / j);
    }

    /* JADX INFO: renamed from: g */
    private mke0 m200365g(long j, boolean z) {
        return new ey5(j, this.f182926h, m200364e(this.f182927i, this.f182920b.m205543k()), this.f182927i, z);
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: a */
    public void mo11029a(long j, long j2) {
        this.f182929k = false;
        this.f182920b.mo108400b();
        this.f182925g = j2;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: b */
    public void mo11030b(bsf bsfVar) {
        this.f182924f = bsfVar;
        this.f182920b.mo108403e(bsfVar, new jkj0.C17969d(0, 1));
        bsfVar.mo11425l();
    }

    /* JADX INFO: renamed from: d */
    public final void m200366d(asf asfVar) throws IOException {
        if (this.f182928j) {
            return;
        }
        this.f182927i = -1;
        asfVar.mo99902h();
        long j = 0;
        if (asfVar.getPosition() == 0) {
            m200368j(asfVar);
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                if (asfVar.mo99901g(this.f182922d.m139815e(), 0, 2, true)) {
                    this.f182922d.m139808U(0);
                    if (!w90.m205538m(this.f182922d.m139801N())) {
                        break;
                    }
                    if (asfVar.mo99901g(this.f182922d.m139815e(), 0, 4, true)) {
                        this.f182923e.m134913p(14);
                        int iM134905h = this.f182923e.m134905h(13);
                        if (iM134905h <= 6) {
                            this.f182928j = true;
                            throw ParserException.createForMalformedContainer("Malformed ADTS stream", null);
                        }
                        j += (long) iM134905h;
                        i2++;
                        if (i2 != 1000 && asfVar.mo99906p(iM134905h - 6, true)) {
                        }
                    }
                }
            } catch (EOFException unused) {
            }
            i = i2;
            break;
        }
        asfVar.mo99902h();
        if (i > 0) {
            this.f182927i = (int) (j / ((long) i));
        } else {
            this.f182927i = -1;
        }
        this.f182928j = true;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: f */
    public boolean mo11031f(asf asfVar) throws IOException {
        int iM200368j = m200368j(asfVar);
        int i = iM200368j;
        int i2 = 0;
        int i3 = 0;
        do {
            asfVar.mo99900f(this.f182922d.m139815e(), 0, 2);
            this.f182922d.m139808U(0);
            if (w90.m205538m(this.f182922d.m139801N())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                asfVar.mo99900f(this.f182922d.m139815e(), 0, 4);
                this.f182923e.m134913p(14);
                int iM134905h = this.f182923e.m134905h(13);
                if (iM134905h <= 6) {
                    i++;
                    asfVar.mo99902h();
                    asfVar.mo99904m(i);
                } else {
                    asfVar.mo99904m(iM134905h - 6);
                    i3 += iM134905h;
                }
            } else {
                i++;
                asfVar.mo99902h();
                asfVar.mo99904m(i);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iM200368j < 8192);
        return false;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: h */
    public int mo11032h(asf asfVar, ll80 ll80Var) throws IOException {
        w11.m204373i(this.f182924f);
        long length = asfVar.getLength();
        int i = this.f182919a;
        if ((i & 2) != 0 || ((i & 1) != 0 && length != -1)) {
            m200366d(asfVar);
        }
        int i2 = asfVar.read(this.f182921c.m139815e(), 0, 2048);
        boolean z = i2 == -1;
        m200367i(length, z);
        if (z) {
            return -1;
        }
        this.f182921c.m139808U(0);
        this.f182921c.m139807T(i2);
        if (!this.f182929k) {
            this.f182920b.mo108402d(this.f182925g, 4);
            this.f182929k = true;
        }
        this.f182920b.mo108399a(this.f182921c);
        return 0;
    }

    @RequiresNonNull({"extractorOutput"})
    /* JADX INFO: renamed from: i */
    public final void m200367i(long j, boolean z) {
        if (this.f182930l) {
            return;
        }
        boolean z2 = (this.f182919a & 1) != 0 && this.f182927i > 0;
        if (z2 && this.f182920b.m205543k() == -9223372036854775807L && !z) {
            return;
        }
        if (!z2 || this.f182920b.m205543k() == -9223372036854775807L) {
            this.f182924f.mo11424k(new mke0.C18641b(-9223372036854775807L));
        } else {
            this.f182924f.mo11424k(m200365g(j, (this.f182919a & 2) != 0));
        }
        this.f182930l = true;
    }

    /* JADX INFO: renamed from: j */
    public final int m200368j(asf asfVar) throws IOException {
        int i = 0;
        while (true) {
            asfVar.mo99900f(this.f182922d.m139815e(), 0, 10);
            this.f182922d.m139808U(0);
            if (this.f182922d.m139798K() != 4801587) {
                break;
            }
            this.f182922d.m139809V(3);
            int iM139794G = this.f182922d.m139794G();
            i += iM139794G + 10;
            asfVar.mo99904m(iM139794G);
        }
        asfVar.mo99902h();
        asfVar.mo99904m(i);
        if (this.f182926h == -1) {
            this.f182926h = i;
        }
        return i;
    }

    @Override // p153l.zrf
    public void release() {
    }

    public v90() {
        this(0);
    }
}
