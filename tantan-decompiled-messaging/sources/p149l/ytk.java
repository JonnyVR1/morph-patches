package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ytk implements dse {

    /* JADX INFO: renamed from: l */
    public static final float[] f199968l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a */
    @Nullable
    public final v4k0 f199969a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final d860 f199970b;

    /* JADX INFO: renamed from: c */
    public final boolean[] f199971c;

    /* JADX INFO: renamed from: d */
    public final C21509a f199972d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final a320 f199973e;

    /* JADX INFO: renamed from: f */
    public C21510b f199974f;

    /* JADX INFO: renamed from: g */
    public long f199975g;

    /* JADX INFO: renamed from: h */
    public String f199976h;

    /* JADX INFO: renamed from: i */
    public m6j0 f199977i;

    /* JADX INFO: renamed from: j */
    public boolean f199978j;

    /* JADX INFO: renamed from: k */
    public long f199979k;

    /* JADX INFO: renamed from: l.ytk$a */
    public static final class C21509a {

        /* JADX INFO: renamed from: f */
        public static final byte[] f199980f = {0, 0, 1};

        /* JADX INFO: renamed from: a */
        public boolean f199981a;

        /* JADX INFO: renamed from: b */
        public int f199982b;

        /* JADX INFO: renamed from: c */
        public int f199983c;

        /* JADX INFO: renamed from: d */
        public int f199984d;

        /* JADX INFO: renamed from: e */
        public byte[] f199985e;

        public C21509a(int i) {
            this.f199985e = new byte[i];
        }

        /* JADX INFO: renamed from: a */
        public void m216056a(byte[] bArr, int i, int i2) {
            if (this.f199981a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f199985e;
                int length = bArr2.length;
                int i4 = this.f199983c;
                if (length < i4 + i3) {
                    this.f199985e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f199985e, this.f199983c, i3);
                this.f199983c += i3;
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m216057b(int i, int i2) {
            int i3 = this.f199982b;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                ohg0.m164364a();
                                return false;
                            }
                            if (i == 179 || i == 181) {
                                this.f199983c -= i2;
                                this.f199981a = false;
                                return true;
                            }
                        } else if ((i & 240) != 32) {
                            jwv.m143689i("H263Reader", "Unexpected start code value");
                            m216058c();
                        } else {
                            this.f199984d = this.f199983c;
                            this.f199982b = 4;
                        }
                    } else if (i > 31) {
                        jwv.m143689i("H263Reader", "Unexpected start code value");
                        m216058c();
                    } else {
                        this.f199982b = 3;
                    }
                } else if (i != 181) {
                    jwv.m143689i("H263Reader", "Unexpected start code value");
                    m216058c();
                } else {
                    this.f199982b = 2;
                }
            } else if (i == 176) {
                this.f199982b = 1;
                this.f199981a = true;
            }
            byte[] bArr = f199980f;
            m216056a(bArr, 0, bArr.length);
            return false;
        }

        /* JADX INFO: renamed from: c */
        public void m216058c() {
            this.f199981a = false;
            this.f199983c = 0;
            this.f199982b = 0;
        }
    }

    /* JADX INFO: renamed from: l.ytk$b */
    public static final class C21510b {

        /* JADX INFO: renamed from: a */
        public final m6j0 f199986a;

        /* JADX INFO: renamed from: b */
        public boolean f199987b;

        /* JADX INFO: renamed from: c */
        public boolean f199988c;

        /* JADX INFO: renamed from: d */
        public boolean f199989d;

        /* JADX INFO: renamed from: e */
        public int f199990e;

        /* JADX INFO: renamed from: f */
        public int f199991f;

        /* JADX INFO: renamed from: g */
        public long f199992g;

        /* JADX INFO: renamed from: h */
        public long f199993h;

        public C21510b(m6j0 m6j0Var) {
            this.f199986a = m6j0Var;
        }

        /* JADX INFO: renamed from: a */
        public void m216059a(byte[] bArr, int i, int i2) {
            if (this.f199988c) {
                int i3 = this.f199991f;
                int i4 = (i + 1) - i3;
                if (i4 >= i2) {
                    this.f199991f = i3 + (i2 - i);
                } else {
                    this.f199989d = ((bArr[i4] & 192) >> 6) == 0;
                    this.f199988c = false;
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
        public void m216060b(long j, int i, boolean z) {
            if (this.f199990e == 182 && z && this.f199987b) {
                long j2 = this.f199993h;
                if (j2 != -9223372036854775807L) {
                    this.f199986a.mo11109a(j2, this.f199989d ? 1 : 0, (int) (j - this.f199992g), i, null);
                }
            }
            if (this.f199990e != 179) {
                this.f199992g = j;
            }
        }

        /* JADX INFO: renamed from: c */
        public void m216061c(int i, long j) {
            this.f199990e = i;
            this.f199989d = false;
            this.f199987b = i == 182 || i == 179;
            this.f199988c = i == 182;
            this.f199991f = 0;
            this.f199993h = j;
        }

        /* JADX INFO: renamed from: d */
        public void m216062d() {
            this.f199987b = false;
            this.f199988c = false;
            this.f199989d = false;
            this.f199990e = -1;
        }
    }

    public ytk(@Nullable v4k0 v4k0Var) {
        this.f199969a = v4k0Var;
        this.f199971c = new boolean[4];
        this.f199972d = new C21509a(128);
        this.f199979k = -9223372036854775807L;
        if (v4k0Var != null) {
            this.f199973e = new a320(178, 128);
            this.f199970b = new d860();
        } else {
            this.f199973e = null;
            this.f199970b = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static C1871k m216055f(C21509a c21509a, int i, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(c21509a.f199985e, c21509a.f199983c);
        c860 c860Var = new c860(bArrCopyOf);
        c860Var.m105675s(i);
        c860Var.m105675s(4);
        c860Var.m105673q();
        c860Var.m105674r(8);
        if (c860Var.m105663g()) {
            c860Var.m105674r(4);
            c860Var.m105674r(3);
        }
        int iM105664h = c860Var.m105664h(4);
        float f = 1.0f;
        if (iM105664h == 15) {
            int iM105664h2 = c860Var.m105664h(8);
            int iM105664h3 = c860Var.m105664h(8);
            if (iM105664h3 == 0) {
                jwv.m143689i("H263Reader", "Invalid aspect ratio");
            } else {
                f = iM105664h2 / iM105664h3;
            }
        } else {
            float[] fArr = f199968l;
            if (iM105664h < fArr.length) {
                f = fArr[iM105664h];
            } else {
                jwv.m143689i("H263Reader", "Invalid aspect ratio");
            }
        }
        if (c860Var.m105663g()) {
            c860Var.m105674r(2);
            c860Var.m105674r(1);
            if (c860Var.m105663g()) {
                c860Var.m105674r(15);
                c860Var.m105673q();
                c860Var.m105674r(15);
                c860Var.m105673q();
                c860Var.m105674r(15);
                c860Var.m105673q();
                c860Var.m105674r(3);
                c860Var.m105674r(11);
                c860Var.m105673q();
                c860Var.m105674r(15);
                c860Var.m105673q();
            }
        }
        if (c860Var.m105664h(2) != 0) {
            jwv.m143689i("H263Reader", "Unhandled video object layer shape");
        }
        c860Var.m105673q();
        int iM105664h4 = c860Var.m105664h(16);
        c860Var.m105673q();
        if (c860Var.m105663g()) {
            if (iM105664h4 == 0) {
                jwv.m143689i("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i2 = 0;
                for (int i3 = iM105664h4 - 1; i3 > 0; i3 >>= 1) {
                    i2++;
                }
                c860Var.m105674r(i2);
            }
        }
        c860Var.m105673q();
        int iM105664h5 = c860Var.m105664h(13);
        c860Var.m105673q();
        int iM105664h6 = c860Var.m105664h(13);
        c860Var.m105673q();
        c860Var.m105673q();
        return new C1871k.b().m10334U(str).m10346g0("video/mp4v-es").m10353n0(iM105664h5).m10332S(iM105664h6).m10342c0(f).m10335V(Collections.singletonList(bArrCopyOf)).m10320G();
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: a */
    public void mo95480a(d860 d860Var) {
        p11.m167015i(this.f199974f);
        p11.m167015i(this.f199977i);
        int iM110300f = d860Var.m110300f();
        int iM110301g = d860Var.m110301g();
        byte[] bArrM110299e = d860Var.m110299e();
        this.f199975g += (long) d860Var.m110295a();
        this.f199977i.m153238d(d860Var, d860Var.m110295a());
        while (true) {
            int iM100040c = b320.m100040c(bArrM110299e, iM110300f, iM110301g, this.f199971c);
            if (iM100040c == iM110301g) {
                break;
            }
            int i = iM100040c + 3;
            int i2 = d860Var.m110299e()[i] & 255;
            int i3 = iM100040c - iM110300f;
            int i4 = 0;
            if (!this.f199978j) {
                if (i3 > 0) {
                    this.f199972d.m216056a(bArrM110299e, iM110300f, iM100040c);
                }
                if (this.f199972d.m216057b(i2, i3 < 0 ? -i3 : 0)) {
                    m6j0 m6j0Var = this.f199977i;
                    C21509a c21509a = this.f199972d;
                    m6j0Var.mo11110b(m216055f(c21509a, c21509a.f199984d, (String) p11.m167011e(this.f199976h)));
                    this.f199978j = true;
                }
            }
            this.f199974f.m216059a(bArrM110299e, iM110300f, iM100040c);
            a320 a320Var = this.f199973e;
            if (a320Var != null) {
                if (i3 > 0) {
                    a320Var.m94637a(bArrM110299e, iM110300f, iM100040c);
                } else {
                    i4 = -i3;
                }
                if (this.f199973e.m94638b(i4)) {
                    a320 a320Var2 = this.f199973e;
                    ((d860) vck0.m197866j(this.f199970b)).m110290S(this.f199973e.f67316d, b320.m100054q(a320Var2.f67316d, a320Var2.f67317e));
                    ((v4k0) vck0.m197866j(this.f199969a)).m196997a(this.f199979k, this.f199970b);
                }
                if (i2 == 178 && d860Var.m110299e()[iM100040c + 2] == 1) {
                    this.f199973e.m94641e(i2);
                }
            }
            int i5 = iM110301g - iM100040c;
            this.f199974f.m216060b(this.f199975g - ((long) i5), i5, this.f199978j);
            this.f199974f.m216061c(i2, this.f199979k);
            iM110300f = i;
        }
        if (!this.f199978j) {
            this.f199972d.m216056a(bArrM110299e, iM110300f, iM110301g);
        }
        this.f199974f.m216059a(bArrM110299e, iM110300f, iM110301g);
        a320 a320Var3 = this.f199973e;
        if (a320Var3 != null) {
            a320Var3.m94637a(bArrM110299e, iM110300f, iM110301g);
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: b */
    public void mo95481b() {
        b320.m100038a(this.f199971c);
        this.f199972d.m216058c();
        C21510b c21510b = this.f199974f;
        if (c21510b != null) {
            c21510b.m216062d();
        }
        a320 a320Var = this.f199973e;
        if (a320Var != null) {
            a320Var.m94640d();
        }
        this.f199975g = 0L;
        this.f199979k = -9223372036854775807L;
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: d */
    public void mo95483d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f199979k = j;
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: e */
    public void mo95484e(uqf uqfVar, fbj0.C16793d c16793d) {
        c16793d.m120357a();
        this.f199976h = c16793d.m120358b();
        m6j0 m6j0VarMo11362b = uqfVar.mo11362b(c16793d.m120359c(), 2);
        this.f199977i = m6j0VarMo11362b;
        this.f199974f = new C21510b(m6j0VarMo11362b);
        v4k0 v4k0Var = this.f199969a;
        if (v4k0Var != null) {
            v4k0Var.m196998b(uqfVar, c16793d);
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: c */
    public void mo95482c() {
    }

    public ytk() {
        this(null);
    }
}
