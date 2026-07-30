package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class owk implements hte {

    /* JADX INFO: renamed from: l */
    public static final float[] f149516l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a */
    @Nullable
    public final bek0 f149517a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final ig60 f149518b;

    /* JADX INFO: renamed from: c */
    public final boolean[] f149519c;

    /* JADX INFO: renamed from: d */
    public final C19236a f149520d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final ib20 f149521e;

    /* JADX INFO: renamed from: f */
    public C19237b f149522f;

    /* JADX INFO: renamed from: g */
    public long f149523g;

    /* JADX INFO: renamed from: h */
    public String f149524h;

    /* JADX INFO: renamed from: i */
    public qfj0 f149525i;

    /* JADX INFO: renamed from: j */
    public boolean f149526j;

    /* JADX INFO: renamed from: k */
    public long f149527k;

    /* JADX INFO: renamed from: l.owk$a */
    public static final class C19236a {

        /* JADX INFO: renamed from: f */
        public static final byte[] f149528f = {0, 0, 1};

        /* JADX INFO: renamed from: a */
        public boolean f149529a;

        /* JADX INFO: renamed from: b */
        public int f149530b;

        /* JADX INFO: renamed from: c */
        public int f149531c;

        /* JADX INFO: renamed from: d */
        public int f149532d;

        /* JADX INFO: renamed from: e */
        public byte[] f149533e;

        public C19236a(int i) {
            this.f149533e = new byte[i];
        }

        /* JADX INFO: renamed from: a */
        public void m169591a(byte[] bArr, int i, int i2) {
            if (this.f149529a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f149533e;
                int length = bArr2.length;
                int i4 = this.f149531c;
                if (length < i4 + i3) {
                    this.f149533e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f149533e, this.f149531c, i3);
                this.f149531c += i3;
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m169592b(int i, int i2) {
            int i3 = this.f149530b;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                wpg0.m207458a();
                                return false;
                            }
                            if (i == 179 || i == 181) {
                                this.f149531c -= i2;
                                this.f149529a = false;
                                return true;
                            }
                        } else if ((i & 240) != 32) {
                            kyv.m152151i("H263Reader", "Unexpected start code value");
                            m169593c();
                        } else {
                            this.f149532d = this.f149531c;
                            this.f149530b = 4;
                        }
                    } else if (i > 31) {
                        kyv.m152151i("H263Reader", "Unexpected start code value");
                        m169593c();
                    } else {
                        this.f149530b = 3;
                    }
                } else if (i != 181) {
                    kyv.m152151i("H263Reader", "Unexpected start code value");
                    m169593c();
                } else {
                    this.f149530b = 2;
                }
            } else if (i == 176) {
                this.f149530b = 1;
                this.f149529a = true;
            }
            byte[] bArr = f149528f;
            m169591a(bArr, 0, bArr.length);
            return false;
        }

        /* JADX INFO: renamed from: c */
        public void m169593c() {
            this.f149529a = false;
            this.f149531c = 0;
            this.f149530b = 0;
        }
    }

    /* JADX INFO: renamed from: l.owk$b */
    public static final class C19237b {

        /* JADX INFO: renamed from: a */
        public final qfj0 f149534a;

        /* JADX INFO: renamed from: b */
        public boolean f149535b;

        /* JADX INFO: renamed from: c */
        public boolean f149536c;

        /* JADX INFO: renamed from: d */
        public boolean f149537d;

        /* JADX INFO: renamed from: e */
        public int f149538e;

        /* JADX INFO: renamed from: f */
        public int f149539f;

        /* JADX INFO: renamed from: g */
        public long f149540g;

        /* JADX INFO: renamed from: h */
        public long f149541h;

        public C19237b(qfj0 qfj0Var) {
            this.f149534a = qfj0Var;
        }

        /* JADX INFO: renamed from: a */
        public void m169594a(byte[] bArr, int i, int i2) {
            if (this.f149536c) {
                int i3 = this.f149539f;
                int i4 = (i + 1) - i3;
                if (i4 >= i2) {
                    this.f149539f = i3 + (i2 - i);
                } else {
                    this.f149537d = ((bArr[i4] & 192) >> 6) == 0;
                    this.f149536c = false;
                }
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: b */
        public void m169595b(long j, int i, boolean z) {
            if (this.f149538e == 182 && z && this.f149535b) {
                long j2 = this.f149541h;
                if (j2 != -9223372036854775807L) {
                    this.f149534a.mo11163a(j2, this.f149537d ? 1 : 0, (int) (j - this.f149540g), i, null);
                }
            }
            if (this.f149538e != 179) {
                this.f149540g = j;
            }
        }

        /* JADX INFO: renamed from: c */
        public void m169596c(int i, long j) {
            this.f149538e = i;
            this.f149537d = false;
            this.f149535b = i == 182 || i == 179;
            this.f149536c = i == 182;
            this.f149539f = 0;
            this.f149541h = j;
        }

        /* JADX INFO: renamed from: d */
        public void m169597d() {
            this.f149535b = false;
            this.f149536c = false;
            this.f149537d = false;
            this.f149538e = -1;
        }
    }

    public owk(@Nullable bek0 bek0Var) {
        this.f149517a = bek0Var;
        this.f149519c = new boolean[4];
        this.f149520d = new C19236a(128);
        this.f149527k = -9223372036854775807L;
        if (bek0Var != null) {
            this.f149521e = new ib20(178, 128);
            this.f149518b = new ig60();
        } else {
            this.f149521e = null;
            this.f149518b = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static C1894k m169590f(C19236a c19236a, int i, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(c19236a.f149533e, c19236a.f149531c);
        hg60 hg60Var = new hg60(bArrCopyOf);
        hg60Var.m134916s(i);
        hg60Var.m134916s(4);
        hg60Var.m134914q();
        hg60Var.m134915r(8);
        if (hg60Var.m134904g()) {
            hg60Var.m134915r(4);
            hg60Var.m134915r(3);
        }
        int iM134905h = hg60Var.m134905h(4);
        float f = 1.0f;
        if (iM134905h == 15) {
            int iM134905h2 = hg60Var.m134905h(8);
            int iM134905h3 = hg60Var.m134905h(8);
            if (iM134905h3 == 0) {
                kyv.m152151i("H263Reader", "Invalid aspect ratio");
            } else {
                f = iM134905h2 / iM134905h3;
            }
        } else {
            float[] fArr = f149516l;
            if (iM134905h < fArr.length) {
                f = fArr[iM134905h];
            } else {
                kyv.m152151i("H263Reader", "Invalid aspect ratio");
            }
        }
        if (hg60Var.m134904g()) {
            hg60Var.m134915r(2);
            hg60Var.m134915r(1);
            if (hg60Var.m134904g()) {
                hg60Var.m134915r(15);
                hg60Var.m134914q();
                hg60Var.m134915r(15);
                hg60Var.m134914q();
                hg60Var.m134915r(15);
                hg60Var.m134914q();
                hg60Var.m134915r(3);
                hg60Var.m134915r(11);
                hg60Var.m134914q();
                hg60Var.m134915r(15);
                hg60Var.m134914q();
            }
        }
        if (hg60Var.m134905h(2) != 0) {
            kyv.m152151i("H263Reader", "Unhandled video object layer shape");
        }
        hg60Var.m134914q();
        int iM134905h4 = hg60Var.m134905h(16);
        hg60Var.m134914q();
        if (hg60Var.m134904g()) {
            if (iM134905h4 == 0) {
                kyv.m152151i("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i2 = 0;
                for (int i3 = iM134905h4 - 1; i3 > 0; i3 >>= 1) {
                    i2++;
                }
                hg60Var.m134915r(i2);
            }
        }
        hg60Var.m134914q();
        int iM134905h5 = hg60Var.m134905h(13);
        hg60Var.m134914q();
        int iM134905h6 = hg60Var.m134905h(13);
        hg60Var.m134914q();
        hg60Var.m134914q();
        return new C1894k.b().m10388U(str).m10400g0("video/mp4v-es").m10407n0(iM134905h5).m10386S(iM134905h6).m10396c0(f).m10389V(Collections.singletonList(bArrCopyOf)).m10374G();
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: a */
    public void mo108399a(ig60 ig60Var) {
        w11.m204373i(this.f149522f);
        w11.m204373i(this.f149525i);
        int iM139816f = ig60Var.m139816f();
        int iM139817g = ig60Var.m139817g();
        byte[] bArrM139815e = ig60Var.m139815e();
        this.f149523g += (long) ig60Var.m139811a();
        this.f149525i.m176370d(ig60Var, ig60Var.m139811a());
        while (true) {
            int iM144185c = jb20.m144185c(bArrM139815e, iM139816f, iM139817g, this.f149519c);
            if (iM144185c == iM139817g) {
                break;
            }
            int i = iM144185c + 3;
            int i2 = ig60Var.m139815e()[i] & 255;
            int i3 = iM144185c - iM139816f;
            int i4 = 0;
            if (!this.f149526j) {
                if (i3 > 0) {
                    this.f149520d.m169591a(bArrM139815e, iM139816f, iM144185c);
                }
                if (this.f149520d.m169592b(i2, i3 < 0 ? -i3 : 0)) {
                    qfj0 qfj0Var = this.f149525i;
                    C19236a c19236a = this.f149520d;
                    qfj0Var.mo11164b(m169590f(c19236a, c19236a.f149532d, (String) w11.m204369e(this.f149524h)));
                    this.f149526j = true;
                }
            }
            this.f149522f.m169594a(bArrM139815e, iM139816f, iM144185c);
            ib20 ib20Var = this.f149521e;
            if (ib20Var != null) {
                if (i3 > 0) {
                    ib20Var.m139234a(bArrM139815e, iM139816f, iM144185c);
                } else {
                    i4 = -i3;
                }
                if (this.f149521e.m139235b(i4)) {
                    ib20 ib20Var2 = this.f149521e;
                    ((ig60) bmk0.m105144j(this.f149518b)).m139806S(this.f149521e.f113652d, jb20.m144199q(ib20Var2.f113652d, ib20Var2.f113653e));
                    ((bek0) bmk0.m105144j(this.f149517a)).m103710a(this.f149527k, this.f149518b);
                }
                if (i2 == 178 && ig60Var.m139815e()[iM144185c + 2] == 1) {
                    this.f149521e.m139238e(i2);
                }
            }
            int i5 = iM139817g - iM144185c;
            this.f149522f.m169595b(this.f149523g - ((long) i5), i5, this.f149526j);
            this.f149522f.m169596c(i2, this.f149527k);
            iM139816f = i;
        }
        if (!this.f149526j) {
            this.f149520d.m169591a(bArrM139815e, iM139816f, iM139817g);
        }
        this.f149522f.m169594a(bArrM139815e, iM139816f, iM139817g);
        ib20 ib20Var3 = this.f149521e;
        if (ib20Var3 != null) {
            ib20Var3.m139234a(bArrM139815e, iM139816f, iM139817g);
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: b */
    public void mo108400b() {
        jb20.m144183a(this.f149519c);
        this.f149520d.m169593c();
        C19237b c19237b = this.f149522f;
        if (c19237b != null) {
            c19237b.m169597d();
        }
        ib20 ib20Var = this.f149521e;
        if (ib20Var != null) {
            ib20Var.m139237d();
        }
        this.f149523g = 0L;
        this.f149527k = -9223372036854775807L;
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: d */
    public void mo108402d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f149527k = j;
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: e */
    public void mo108403e(bsf bsfVar, jkj0.C17969d c17969d) {
        c17969d.m145854a();
        this.f149524h = c17969d.m145855b();
        qfj0 qfj0VarMo11416b = bsfVar.mo11416b(c17969d.m145856c(), 2);
        this.f149525i = qfj0VarMo11416b;
        this.f149522f = new C19237b(qfj0VarMo11416b);
        bek0 bek0Var = this.f149517a;
        if (bek0Var != null) {
            bek0Var.m103711b(bsfVar, c17969d);
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: c */
    public void mo108401c() {
    }

    public owk() {
        this(null);
    }
}
