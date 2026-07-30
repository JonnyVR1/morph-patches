package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class sri implements zrf {

    /* JADX INFO: renamed from: o */
    public static final esf f170337o = new esf() { // from class: l.rri
        @Override // p153l.esf
        /* JADX INFO: renamed from: b */
        public final zrf[] mo96504b() {
            return sri.m187618c();
        }
    };

    /* JADX INFO: renamed from: a */
    public final byte[] f170338a;

    /* JADX INFO: renamed from: b */
    public final ig60 f170339b;

    /* JADX INFO: renamed from: c */
    public final boolean f170340c;

    /* JADX INFO: renamed from: d */
    public final tri.C20384a f170341d;

    /* JADX INFO: renamed from: e */
    public bsf f170342e;

    /* JADX INFO: renamed from: f */
    public qfj0 f170343f;

    /* JADX INFO: renamed from: g */
    public int f170344g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Metadata f170345h;

    /* JADX INFO: renamed from: i */
    public xri f170346i;

    /* JADX INFO: renamed from: j */
    public int f170347j;

    /* JADX INFO: renamed from: k */
    public int f170348k;

    /* JADX INFO: renamed from: l */
    public qri f170349l;

    /* JADX INFO: renamed from: m */
    public int f170350m;

    /* JADX INFO: renamed from: n */
    public long f170351n;

    public sri(int i) {
        this.f170338a = new byte[42];
        this.f170339b = new ig60(new byte[32768], 0);
        this.f170340c = (i & 1) != 0;
        this.f170341d = new tri.C20384a();
        this.f170344g = 0;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ zrf[] m187618c() {
        return new zrf[]{new sri()};
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: a */
    public void mo11029a(long j, long j2) {
        if (j == 0) {
            this.f170344g = 0;
        } else {
            qri qriVar = this.f170349l;
            if (qriVar != null) {
                qriVar.m123135h(j2);
            }
        }
        this.f170351n = j2 != 0 ? -1L : 0L;
        this.f170350m = 0;
        this.f170339b.m139804Q(0);
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: b */
    public void mo11030b(bsf bsfVar) {
        this.f170342e = bsfVar;
        this.f170343f = bsfVar.mo11416b(0, 1);
        bsfVar.mo11425l();
    }

    /* JADX INFO: renamed from: d */
    public final long m187619d(ig60 ig60Var, boolean z) {
        boolean zM192504d;
        w11.m204369e(this.f170346i);
        int iM139816f = ig60Var.m139816f();
        while (iM139816f <= ig60Var.m139817g() - 16) {
            ig60Var.m139808U(iM139816f);
            if (tri.m192504d(ig60Var, this.f170346i, this.f170348k, this.f170341d)) {
                ig60Var.m139808U(iM139816f);
                return this.f170341d.f175880a;
            }
            iM139816f++;
        }
        if (!z) {
            ig60Var.m139808U(iM139816f);
            return -1L;
        }
        while (iM139816f <= ig60Var.m139817g() - this.f170347j) {
            ig60Var.m139808U(iM139816f);
            try {
                zM192504d = tri.m192504d(ig60Var, this.f170346i, this.f170348k, this.f170341d);
            } catch (IndexOutOfBoundsException unused) {
                zM192504d = false;
            }
            if (ig60Var.m139816f() <= ig60Var.m139817g() ? zM192504d : false) {
                ig60Var.m139808U(iM139816f);
                return this.f170341d.f175880a;
            }
            iM139816f++;
        }
        ig60Var.m139808U(ig60Var.m139817g());
        return -1L;
    }

    /* JADX INFO: renamed from: e */
    public final void m187620e(asf asfVar) throws IOException {
        this.f170348k = uri.m197603b(asfVar);
        ((bsf) bmk0.m105144j(this.f170342e)).mo11424k(m187621g(asfVar.getPosition(), asfVar.getLength()));
        this.f170344g = 5;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: f */
    public boolean mo11031f(asf asfVar) throws Throwable {
        uri.m197604c(asfVar, false);
        return uri.m197602a(asfVar);
    }

    /* JADX INFO: renamed from: g */
    public final mke0 m187621g(long j, long j2) {
        w11.m204369e(this.f170346i);
        xri xriVar = this.f170346i;
        if (xriVar.f195922k != null) {
            return new wri(xriVar, j);
        }
        if (j2 == -1 || xriVar.f195921j <= 0) {
            return new mke0.C18641b(xriVar.m212833f());
        }
        qri qriVar = new qri(xriVar, this.f170348k, j, j2);
        this.f170349l = qriVar;
        return qriVar.m123129b();
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: h */
    public int mo11032h(asf asfVar, ll80 ll80Var) throws IOException {
        int i = this.f170344g;
        if (i == 0) {
            m187625l(asfVar);
            return 0;
        }
        if (i == 1) {
            m187622i(asfVar);
            return 0;
        }
        if (i == 2) {
            m187627n(asfVar);
            return 0;
        }
        if (i == 3) {
            m187626m(asfVar);
            return 0;
        }
        if (i == 4) {
            m187620e(asfVar);
            return 0;
        }
        if (i == 5) {
            return m187624k(asfVar, ll80Var);
        }
        wpg0.m207458a();
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m187622i(asf asfVar) throws IOException {
        byte[] bArr = this.f170338a;
        asfVar.mo99900f(bArr, 0, bArr.length);
        asfVar.mo99902h();
        this.f170344g = 2;
    }

    /* JADX INFO: renamed from: j */
    public final void m187623j() {
        ((qfj0) bmk0.m105144j(this.f170343f)).mo11163a((this.f170351n * 1000000) / ((long) ((xri) bmk0.m105144j(this.f170346i)).f195916e), 1, this.f170350m, 0, null);
    }

    /* JADX INFO: renamed from: k */
    public final int m187624k(asf asfVar, ll80 ll80Var) throws IOException {
        boolean z;
        w11.m204369e(this.f170343f);
        w11.m204369e(this.f170346i);
        qri qriVar = this.f170349l;
        if (qriVar != null && qriVar.m123131d()) {
            return this.f170349l.m123130c(asfVar, ll80Var);
        }
        if (this.f170351n == -1) {
            this.f170351n = tri.m192509i(asfVar, this.f170346i);
            return 0;
        }
        int iM139817g = this.f170339b.m139817g();
        if (iM139817g < 32768) {
            int i = asfVar.read(this.f170339b.m139815e(), iM139817g, 32768 - iM139817g);
            z = i == -1;
            ig60 ig60Var = this.f170339b;
            if (!z) {
                ig60Var.m139807T(iM139817g + i);
            } else if (ig60Var.m139811a() == 0) {
                m187623j();
                return -1;
            }
        } else {
            z = false;
        }
        int iM139816f = this.f170339b.m139816f();
        int i2 = this.f170350m;
        int i3 = this.f170347j;
        if (i2 < i3) {
            ig60 ig60Var2 = this.f170339b;
            ig60Var2.m139809V(Math.min(i3 - i2, ig60Var2.m139811a()));
        }
        long jM187619d = m187619d(this.f170339b, z);
        int iM139816f2 = this.f170339b.m139816f() - iM139816f;
        this.f170339b.m139808U(iM139816f);
        this.f170343f.m176370d(this.f170339b, iM139816f2);
        this.f170350m += iM139816f2;
        if (jM187619d != -1) {
            m187623j();
            this.f170350m = 0;
            this.f170351n = jM187619d;
        }
        if (this.f170339b.m139811a() < 16) {
            int iM139811a = this.f170339b.m139811a();
            System.arraycopy(this.f170339b.m139815e(), this.f170339b.m139816f(), this.f170339b.m139815e(), 0, iM139811a);
            this.f170339b.m139808U(0);
            this.f170339b.m139807T(iM139811a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public final void m187625l(asf asfVar) throws IOException {
        this.f170345h = uri.m197605d(asfVar, !this.f170340c);
        this.f170344g = 1;
    }

    /* JADX INFO: renamed from: m */
    public final void m187626m(asf asfVar) throws IOException {
        uri.C20647a c20647a = new uri.C20647a(this.f170346i);
        boolean zM197606e = false;
        while (!zM197606e) {
            zM197606e = uri.m197606e(asfVar, c20647a);
            this.f170346i = (xri) bmk0.m105144j(c20647a.f180655a);
        }
        w11.m204369e(this.f170346i);
        this.f170347j = Math.max(this.f170346i.f195914c, 6);
        ((qfj0) bmk0.m105144j(this.f170343f)).mo11164b(this.f170346i.m212834g(this.f170338a, this.f170345h));
        this.f170344g = 4;
    }

    /* JADX INFO: renamed from: n */
    public final void m187627n(asf asfVar) throws IOException {
        uri.m197610i(asfVar);
        this.f170344g = 3;
    }

    @Override // p153l.zrf
    public void release() {
    }

    public sri() {
        this(0);
    }
}
