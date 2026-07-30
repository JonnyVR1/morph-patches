package p149l;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class auk implements dse {

    /* JADX INFO: renamed from: a */
    public final qce0 f71786a;

    /* JADX INFO: renamed from: b */
    public final boolean f71787b;

    /* JADX INFO: renamed from: c */
    public final boolean f71788c;

    /* JADX INFO: renamed from: g */
    public long f71792g;

    /* JADX INFO: renamed from: i */
    public String f71794i;

    /* JADX INFO: renamed from: j */
    public m6j0 f71795j;

    /* JADX INFO: renamed from: k */
    public C15730b f71796k;

    /* JADX INFO: renamed from: l */
    public boolean f71797l;

    /* JADX INFO: renamed from: n */
    public boolean f71799n;

    /* JADX INFO: renamed from: h */
    public final boolean[] f71793h = new boolean[3];

    /* JADX INFO: renamed from: d */
    public final a320 f71789d = new a320(7, 128);

    /* JADX INFO: renamed from: e */
    public final a320 f71790e = new a320(8, 128);

    /* JADX INFO: renamed from: f */
    public final a320 f71791f = new a320(6, 128);

    /* JADX INFO: renamed from: m */
    public long f71798m = -9223372036854775807L;

    /* JADX INFO: renamed from: o */
    public final d860 f71800o = new d860();

    /* JADX INFO: renamed from: l.auk$b */
    public static final class C15730b {

        /* JADX INFO: renamed from: a */
        public final m6j0 f71801a;

        /* JADX INFO: renamed from: b */
        public final boolean f71802b;

        /* JADX INFO: renamed from: c */
        public final boolean f71803c;

        /* JADX INFO: renamed from: d */
        public final SparseArray<b320.C15785c> f71804d = new SparseArray<>();

        /* JADX INFO: renamed from: e */
        public final SparseArray<b320.C15784b> f71805e = new SparseArray<>();

        /* JADX INFO: renamed from: f */
        public final e860 f71806f;

        /* JADX INFO: renamed from: g */
        public byte[] f71807g;

        /* JADX INFO: renamed from: h */
        public int f71808h;

        /* JADX INFO: renamed from: i */
        public int f71809i;

        /* JADX INFO: renamed from: j */
        public long f71810j;

        /* JADX INFO: renamed from: k */
        public boolean f71811k;

        /* JADX INFO: renamed from: l */
        public long f71812l;

        /* JADX INFO: renamed from: m */
        public a f71813m;

        /* JADX INFO: renamed from: n */
        public a f71814n;

        /* JADX INFO: renamed from: o */
        public boolean f71815o;

        /* JADX INFO: renamed from: p */
        public long f71816p;

        /* JADX INFO: renamed from: q */
        public long f71817q;

        /* JADX INFO: renamed from: r */
        public boolean f71818r;

        /* JADX INFO: renamed from: l.auk$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public boolean f71819a;

            /* JADX INFO: renamed from: b */
            public boolean f71820b;

            /* JADX INFO: renamed from: c */
            @Nullable
            public b320.C15785c f71821c;

            /* JADX INFO: renamed from: d */
            public int f71822d;

            /* JADX INFO: renamed from: e */
            public int f71823e;

            /* JADX INFO: renamed from: f */
            public int f71824f;

            /* JADX INFO: renamed from: g */
            public int f71825g;

            /* JADX INFO: renamed from: h */
            public boolean f71826h;

            /* JADX INFO: renamed from: i */
            public boolean f71827i;

            /* JADX INFO: renamed from: j */
            public boolean f71828j;

            /* JADX INFO: renamed from: k */
            public boolean f71829k;

            /* JADX INFO: renamed from: l */
            public int f71830l;

            /* JADX INFO: renamed from: m */
            public int f71831m;

            /* JADX INFO: renamed from: n */
            public int f71832n;

            /* JADX INFO: renamed from: o */
            public int f71833o;

            /* JADX INFO: renamed from: p */
            public int f71834p;

            public a() {
            }

            /* JADX INFO: renamed from: b */
            public void m99010b() {
                this.f71820b = false;
                this.f71819a = false;
            }

            /* JADX INFO: renamed from: c */
            public final boolean m99011c(a aVar) {
                int i;
                int i2;
                int i3;
                boolean z;
                if (!this.f71819a) {
                    return false;
                }
                if (!aVar.f71819a) {
                    return true;
                }
                b320.C15785c c15785c = (b320.C15785c) p11.m167015i(this.f71821c);
                b320.C15785c c15785c2 = (b320.C15785c) p11.m167015i(aVar.f71821c);
                return (this.f71824f == aVar.f71824f && this.f71825g == aVar.f71825g && this.f71826h == aVar.f71826h && (!this.f71827i || !aVar.f71827i || this.f71828j == aVar.f71828j) && (((i = this.f71822d) == (i2 = aVar.f71822d) || (i != 0 && i2 != 0)) && (((i3 = c15785c.f72796l) != 0 || c15785c2.f72796l != 0 || (this.f71831m == aVar.f71831m && this.f71832n == aVar.f71832n)) && ((i3 != 1 || c15785c2.f72796l != 1 || (this.f71833o == aVar.f71833o && this.f71834p == aVar.f71834p)) && (z = this.f71829k) == aVar.f71829k && (!z || this.f71830l == aVar.f71830l))))) ? false : true;
            }

            /* JADX INFO: renamed from: d */
            public boolean m99012d() {
                if (!this.f71820b) {
                    return false;
                }
                int i = this.f71823e;
                return i == 7 || i == 2;
            }

            /* JADX INFO: renamed from: e */
            public void m99013e(b320.C15785c c15785c, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.f71821c = c15785c;
                this.f71822d = i;
                this.f71823e = i2;
                this.f71824f = i3;
                this.f71825g = i4;
                this.f71826h = z;
                this.f71827i = z2;
                this.f71828j = z3;
                this.f71829k = z4;
                this.f71830l = i5;
                this.f71831m = i6;
                this.f71832n = i7;
                this.f71833o = i8;
                this.f71834p = i9;
                this.f71819a = true;
                this.f71820b = true;
            }

            /* JADX INFO: renamed from: f */
            public void m99014f(int i) {
                this.f71823e = i;
                this.f71820b = true;
            }
        }

        public C15730b(m6j0 m6j0Var, boolean z, boolean z2) {
            this.f71801a = m6j0Var;
            this.f71802b = z;
            this.f71803c = z2;
            this.f71813m = new a();
            this.f71814n = new a();
            byte[] bArr = new byte[128];
            this.f71807g = bArr;
            this.f71806f = new e860(bArr, 0, 0);
            m99007g();
        }

        /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:53:0x0109  */
        /* JADX WARN: Code duplicated, block: B:54:0x010c  */
        /* JADX WARN: Code duplicated, block: B:56:0x0110  */
        /* JADX WARN: Code duplicated, block: B:59:0x011a  */
        /* JADX WARN: Code duplicated, block: B:60:0x0123  */
        /* JADX WARN: Code duplicated, block: B:63:0x0129  */
        /* JADX WARN: Code duplicated, block: B:66:0x0134  */
        /* JADX WARN: Code duplicated, block: B:76:0x0161  */
        /* JADX INFO: renamed from: a */
        public void m99001a(byte[] bArr, int i, int i2) {
            boolean z;
            boolean z2;
            boolean zM115246d;
            boolean z3;
            int iM115250h;
            int i3;
            int i4;
            int iM115249g;
            int i5;
            int iM115249g2;
            int iM115247e;
            if (this.f71811k) {
                int i6 = i2 - i;
                byte[] bArr2 = this.f71807g;
                int length = bArr2.length;
                int i7 = this.f71808h;
                if (length < i7 + i6) {
                    this.f71807g = Arrays.copyOf(bArr2, (i7 + i6) * 2);
                }
                System.arraycopy(bArr, i, this.f71807g, this.f71808h, i6);
                int i8 = this.f71808h + i6;
                this.f71808h = i8;
                this.f71806f.m115251i(this.f71807g, 0, i8);
                if (this.f71806f.m115244b(8)) {
                    this.f71806f.m115253k();
                    int iM115247e2 = this.f71806f.m115247e(2);
                    this.f71806f.m115254l(5);
                    if (this.f71806f.m115245c()) {
                        this.f71806f.m115250h();
                        if (this.f71806f.m115245c()) {
                            int iM115250h2 = this.f71806f.m115250h();
                            if (!this.f71803c) {
                                this.f71811k = false;
                                this.f71814n.m99014f(iM115250h2);
                                return;
                            }
                            if (this.f71806f.m115245c()) {
                                int iM115250h3 = this.f71806f.m115250h();
                                if (this.f71805e.indexOfKey(iM115250h3) < 0) {
                                    this.f71811k = false;
                                    return;
                                }
                                b320.C15784b c15784b = this.f71805e.get(iM115250h3);
                                b320.C15785c c15785c = this.f71804d.get(c15784b.f72783b);
                                if (c15785c.f72793i) {
                                    if (!this.f71806f.m115244b(2)) {
                                        return;
                                    } else {
                                        this.f71806f.m115254l(2);
                                    }
                                }
                                if (this.f71806f.m115244b(c15785c.f72795k)) {
                                    int iM115247e3 = this.f71806f.m115247e(c15785c.f72795k);
                                    if (!c15785c.f72794j) {
                                        if (this.f71806f.m115244b(1)) {
                                            boolean zM115246d2 = this.f71806f.m115246d();
                                            if (!zM115246d2) {
                                                z = zM115246d2;
                                                z2 = false;
                                            } else {
                                                if (!this.f71806f.m115244b(1)) {
                                                    return;
                                                }
                                                z = zM115246d2;
                                                z2 = true;
                                                zM115246d = this.f71806f.m115246d();
                                            }
                                            if (this.f71809i == 5) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            if (z3) {
                                                iM115250h = 0;
                                            } else if (!this.f71806f.m115245c()) {
                                                return;
                                            } else {
                                                iM115250h = this.f71806f.m115250h();
                                            }
                                            i3 = c15785c.f72796l;
                                            if (i3 != 0) {
                                                if (this.f71806f.m115244b(c15785c.f72797m)) {
                                                    iM115247e = this.f71806f.m115247e(c15785c.f72797m);
                                                    if (c15784b.f72784c || z) {
                                                        i4 = iM115247e;
                                                        iM115249g = 0;
                                                    } else {
                                                        if (!this.f71806f.m115245c()) {
                                                            return;
                                                        }
                                                        iM115249g = this.f71806f.m115249g();
                                                        i4 = iM115247e;
                                                        i5 = 0;
                                                    }
                                                    iM115249g2 = i5;
                                                    this.f71814n.m99013e(c15785c, iM115247e2, iM115250h2, iM115247e3, iM115250h3, z, z2, zM115246d, z3, iM115250h, i4, iM115249g, i5, iM115249g2);
                                                    this.f71811k = false;
                                                }
                                                return;
                                            }
                                            if (i3 == 1 || c15785c.f72798n) {
                                                i4 = 0;
                                                iM115249g = 0;
                                            } else {
                                                if (!this.f71806f.m115245c()) {
                                                    return;
                                                }
                                                int iM115249g3 = this.f71806f.m115249g();
                                                if (!c15784b.f72784c || z) {
                                                    i5 = iM115249g3;
                                                    i4 = 0;
                                                    iM115249g = 0;
                                                    iM115249g2 = 0;
                                                } else {
                                                    if (!this.f71806f.m115245c()) {
                                                        return;
                                                    }
                                                    iM115249g2 = this.f71806f.m115249g();
                                                    i5 = iM115249g3;
                                                    i4 = 0;
                                                    iM115249g = 0;
                                                }
                                            }
                                            this.f71814n.m99013e(c15785c, iM115247e2, iM115250h2, iM115247e3, iM115250h3, z, z2, zM115246d, z3, iM115250h, i4, iM115249g, i5, iM115249g2);
                                            this.f71811k = false;
                                            i5 = iM115249g;
                                            iM115249g2 = i5;
                                            this.f71814n.m99013e(c15785c, iM115247e2, iM115250h2, iM115247e3, iM115250h3, z, z2, zM115246d, z3, iM115250h, i4, iM115249g, i5, iM115249g2);
                                            this.f71811k = false;
                                        }
                                        return;
                                    }
                                    z = false;
                                    z2 = false;
                                    zM115246d = z2;
                                    if (this.f71809i == 5) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        iM115250h = 0;
                                    } else if (!this.f71806f.m115245c()) {
                                        return;
                                    } else {
                                        iM115250h = this.f71806f.m115250h();
                                    }
                                    i3 = c15785c.f72796l;
                                    if (i3 != 0) {
                                        if (i3 == 1) {
                                        }
                                        i4 = 0;
                                        iM115249g = 0;
                                    } else {
                                        if (this.f71806f.m115244b(c15785c.f72797m)) {
                                            return;
                                        }
                                        iM115247e = this.f71806f.m115247e(c15785c.f72797m);
                                        if (c15784b.f72784c) {
                                        }
                                        i4 = iM115247e;
                                        iM115249g = 0;
                                    }
                                    i5 = iM115249g;
                                    iM115249g2 = i5;
                                    this.f71814n.m99013e(c15785c, iM115247e2, iM115250h2, iM115247e3, iM115250h3, z, z2, zM115246d, z3, iM115250h, i4, iM115249g, i5, iM115249g2);
                                    this.f71811k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m99002b(long j, int i, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.f71809i == 9 || (this.f71803c && this.f71814n.m99011c(this.f71813m))) {
                if (z && this.f71815o) {
                    m99004d(i + ((int) (j - this.f71810j)));
                }
                this.f71816p = this.f71810j;
                this.f71817q = this.f71812l;
                this.f71818r = false;
                this.f71815o = true;
            }
            if (this.f71802b) {
                z2 = this.f71814n.m99012d();
            }
            boolean z4 = this.f71818r;
            int i2 = this.f71809i;
            if (i2 == 5 || (z2 && i2 == 1)) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            this.f71818r = z5;
            return z5;
        }

        /* JADX INFO: renamed from: c */
        public boolean m99003c() {
            return this.f71803c;
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
        /* JADX INFO: renamed from: d */
        public final void m99004d(int i) {
            long j = this.f71817q;
            if (j == -9223372036854775807L) {
                return;
            }
            boolean z = this.f71818r;
            this.f71801a.mo11109a(j, z ? 1 : 0, (int) (this.f71810j - this.f71816p), i, null);
        }

        /* JADX INFO: renamed from: e */
        public void m99005e(b320.C15784b c15784b) {
            this.f71805e.append(c15784b.f72782a, c15784b);
        }

        /* JADX INFO: renamed from: f */
        public void m99006f(b320.C15785c c15785c) {
            this.f71804d.append(c15785c.f72788d, c15785c);
        }

        /* JADX INFO: renamed from: g */
        public void m99007g() {
            this.f71811k = false;
            this.f71815o = false;
            this.f71814n.m99010b();
        }

        /* JADX INFO: renamed from: h */
        public void m99008h(long j, int i, long j2) {
            this.f71809i = i;
            this.f71812l = j2;
            this.f71810j = j;
            if (!this.f71802b || i != 1) {
                if (!this.f71803c) {
                    return;
                }
                if (i != 5 && i != 1 && i != 2) {
                    return;
                }
            }
            a aVar = this.f71813m;
            this.f71813m = this.f71814n;
            this.f71814n = aVar;
            aVar.m99010b();
            this.f71808h = 0;
            this.f71811k = true;
        }
    }

    public auk(qce0 qce0Var, boolean z, boolean z2) {
        this.f71786a = qce0Var;
        this.f71787b = z;
        this.f71788c = z2;
    }

    @EnsuresNonNull({"output", "sampleReader"})
    /* JADX INFO: renamed from: f */
    private void m98997f() {
        p11.m167015i(this.f71795j);
        vck0.m197866j(this.f71796k);
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: a */
    public void mo95480a(d860 d860Var) {
        m98997f();
        int iM110300f = d860Var.m110300f();
        int iM110301g = d860Var.m110301g();
        byte[] bArrM110299e = d860Var.m110299e();
        this.f71792g += (long) d860Var.m110295a();
        this.f71795j.m153238d(d860Var, d860Var.m110295a());
        while (true) {
            int iM100040c = b320.m100040c(bArrM110299e, iM110300f, iM110301g, this.f71793h);
            if (iM100040c == iM110301g) {
                this.m98999h(bArrM110299e, iM110300f, iM110301g);
                return;
            }
            int iM100043f = b320.m100043f(bArrM110299e, iM100040c);
            int i = iM100040c - iM110300f;
            if (i > 0) {
                this.m98999h(bArrM110299e, iM110300f, iM100040c);
            }
            int i2 = iM110301g - iM100040c;
            long j = this.f71792g - ((long) i2);
            auk aukVar = this;
            aukVar.m98998g(j, i2, i < 0 ? -i : 0, this.f71798m);
            aukVar.m99000i(j, iM100043f, aukVar.f71798m);
            iM110300f = iM100040c + 3;
            this = aukVar;
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: b */
    public void mo95481b() {
        this.f71792g = 0L;
        this.f71799n = false;
        this.f71798m = -9223372036854775807L;
        b320.m100038a(this.f71793h);
        this.f71789d.m94640d();
        this.f71790e.m94640d();
        this.f71791f.m94640d();
        C15730b c15730b = this.f71796k;
        if (c15730b != null) {
            c15730b.m99007g();
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: d */
    public void mo95483d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f71798m = j;
        }
        this.f71799n |= (i & 2) != 0;
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: e */
    public void mo95484e(uqf uqfVar, fbj0.C16793d c16793d) {
        c16793d.m120357a();
        this.f71794i = c16793d.m120358b();
        m6j0 m6j0VarMo11362b = uqfVar.mo11362b(c16793d.m120359c(), 2);
        this.f71795j = m6j0VarMo11362b;
        this.f71796k = new C15730b(m6j0VarMo11362b, this.f71787b, this.f71788c);
        this.f71786a.m173867b(uqfVar, c16793d);
    }

    @RequiresNonNull({"output", "sampleReader"})
    /* JADX INFO: renamed from: g */
    public final void m98998g(long j, int i, int i2, long j2) {
        if (!this.f71797l || this.f71796k.m99003c()) {
            this.f71789d.m94638b(i2);
            this.f71790e.m94638b(i2);
            boolean z = this.f71797l;
            a320 a320Var = this.f71789d;
            if (z) {
                if (a320Var.m94639c()) {
                    a320 a320Var2 = this.f71789d;
                    this.f71796k.m99006f(b320.m100049l(a320Var2.f67316d, 3, a320Var2.f67317e));
                    this.f71789d.m94640d();
                } else if (this.f71790e.m94639c()) {
                    a320 a320Var3 = this.f71790e;
                    this.f71796k.m99005e(b320.m100047j(a320Var3.f67316d, 3, a320Var3.f67317e));
                    this.f71790e.m94640d();
                }
            } else if (a320Var.m94639c() && this.f71790e.m94639c()) {
                ArrayList arrayList = new ArrayList();
                a320 a320Var4 = this.f71789d;
                arrayList.add(Arrays.copyOf(a320Var4.f67316d, a320Var4.f67317e));
                a320 a320Var5 = this.f71790e;
                arrayList.add(Arrays.copyOf(a320Var5.f67316d, a320Var5.f67317e));
                a320 a320Var6 = this.f71789d;
                b320.C15785c c15785cM100049l = b320.m100049l(a320Var6.f67316d, 3, a320Var6.f67317e);
                a320 a320Var7 = this.f71790e;
                b320.C15784b c15784bM100047j = b320.m100047j(a320Var7.f67316d, 3, a320Var7.f67317e);
                this.f71795j.mo11110b(new C1871k.b().m10334U(this.f71794i).m10346g0(YtVideoEncoder.MIME_TYPE).m10324K(lb5.m149199a(c15785cM100049l.f72785a, c15785cM100049l.f72786b, c15785cM100049l.f72787c)).m10353n0(c15785cM100049l.f72790f).m10332S(c15785cM100049l.f72791g).m10342c0(c15785cM100049l.f72792h).m10335V(arrayList).m10320G());
                this.f71797l = true;
                this.f71796k.m99006f(c15785cM100049l);
                this.f71796k.m99005e(c15784bM100047j);
                this.f71789d.m94640d();
                this.f71790e.m94640d();
            }
        }
        if (this.f71791f.m94638b(i2)) {
            a320 a320Var8 = this.f71791f;
            this.f71800o.m110290S(this.f71791f.f67316d, b320.m100054q(a320Var8.f67316d, a320Var8.f67317e));
            this.f71800o.m110292U(4);
            this.f71786a.m173866a(j2, this.f71800o);
        }
        if (this.f71796k.m99002b(j, i, this.f71797l, this.f71799n)) {
            this.f71799n = false;
        }
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: h */
    public final void m98999h(byte[] bArr, int i, int i2) {
        if (!this.f71797l || this.f71796k.m99003c()) {
            this.f71789d.m94637a(bArr, i, i2);
            this.f71790e.m94637a(bArr, i, i2);
        }
        this.f71791f.m94637a(bArr, i, i2);
        this.f71796k.m99001a(bArr, i, i2);
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: i */
    public final void m99000i(long j, int i, long j2) {
        if (!this.f71797l || this.f71796k.m99003c()) {
            this.f71789d.m94641e(i);
            this.f71790e.m94641e(i);
        }
        this.f71791f.m94641e(i);
        this.f71796k.m99008h(j, i, j2);
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: c */
    public void mo95482c() {
    }
}
