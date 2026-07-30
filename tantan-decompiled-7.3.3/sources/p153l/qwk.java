package p153l;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class qwk implements hte {

    /* JADX INFO: renamed from: a */
    public final vke0 f159896a;

    /* JADX INFO: renamed from: b */
    public final boolean f159897b;

    /* JADX INFO: renamed from: c */
    public final boolean f159898c;

    /* JADX INFO: renamed from: g */
    public long f159902g;

    /* JADX INFO: renamed from: i */
    public String f159904i;

    /* JADX INFO: renamed from: j */
    public qfj0 f159905j;

    /* JADX INFO: renamed from: k */
    public C19685b f159906k;

    /* JADX INFO: renamed from: l */
    public boolean f159907l;

    /* JADX INFO: renamed from: n */
    public boolean f159909n;

    /* JADX INFO: renamed from: h */
    public final boolean[] f159903h = new boolean[3];

    /* JADX INFO: renamed from: d */
    public final ib20 f159899d = new ib20(7, 128);

    /* JADX INFO: renamed from: e */
    public final ib20 f159900e = new ib20(8, 128);

    /* JADX INFO: renamed from: f */
    public final ib20 f159901f = new ib20(6, 128);

    /* JADX INFO: renamed from: m */
    public long f159908m = -9223372036854775807L;

    /* JADX INFO: renamed from: o */
    public final ig60 f159910o = new ig60();

    /* JADX INFO: renamed from: l.qwk$b */
    public static final class C19685b {

        /* JADX INFO: renamed from: a */
        public final qfj0 f159911a;

        /* JADX INFO: renamed from: b */
        public final boolean f159912b;

        /* JADX INFO: renamed from: c */
        public final boolean f159913c;

        /* JADX INFO: renamed from: d */
        public final SparseArray<jb20.C17914c> f159914d = new SparseArray<>();

        /* JADX INFO: renamed from: e */
        public final SparseArray<jb20.C17913b> f159915e = new SparseArray<>();

        /* JADX INFO: renamed from: f */
        public final jg60 f159916f;

        /* JADX INFO: renamed from: g */
        public byte[] f159917g;

        /* JADX INFO: renamed from: h */
        public int f159918h;

        /* JADX INFO: renamed from: i */
        public int f159919i;

        /* JADX INFO: renamed from: j */
        public long f159920j;

        /* JADX INFO: renamed from: k */
        public boolean f159921k;

        /* JADX INFO: renamed from: l */
        public long f159922l;

        /* JADX INFO: renamed from: m */
        public a f159923m;

        /* JADX INFO: renamed from: n */
        public a f159924n;

        /* JADX INFO: renamed from: o */
        public boolean f159925o;

        /* JADX INFO: renamed from: p */
        public long f159926p;

        /* JADX INFO: renamed from: q */
        public long f159927q;

        /* JADX INFO: renamed from: r */
        public boolean f159928r;

        /* JADX INFO: renamed from: l.qwk$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public boolean f159929a;

            /* JADX INFO: renamed from: b */
            public boolean f159930b;

            /* JADX INFO: renamed from: c */
            @Nullable
            public jb20.C17914c f159931c;

            /* JADX INFO: renamed from: d */
            public int f159932d;

            /* JADX INFO: renamed from: e */
            public int f159933e;

            /* JADX INFO: renamed from: f */
            public int f159934f;

            /* JADX INFO: renamed from: g */
            public int f159935g;

            /* JADX INFO: renamed from: h */
            public boolean f159936h;

            /* JADX INFO: renamed from: i */
            public boolean f159937i;

            /* JADX INFO: renamed from: j */
            public boolean f159938j;

            /* JADX INFO: renamed from: k */
            public boolean f159939k;

            /* JADX INFO: renamed from: l */
            public int f159940l;

            /* JADX INFO: renamed from: m */
            public int f159941m;

            /* JADX INFO: renamed from: n */
            public int f159942n;

            /* JADX INFO: renamed from: o */
            public int f159943o;

            /* JADX INFO: renamed from: p */
            public int f159944p;

            public a() {
            }

            /* JADX INFO: renamed from: b */
            public void m178516b() {
                this.f159930b = false;
                this.f159929a = false;
            }

            /* JADX INFO: renamed from: c */
            public final boolean m178517c(a aVar) {
                int i;
                int i2;
                int i3;
                boolean z;
                if (!this.f159929a) {
                    return false;
                }
                if (!aVar.f159929a) {
                    return true;
                }
                jb20.C17914c c17914c = (jb20.C17914c) w11.m204373i(this.f159931c);
                jb20.C17914c c17914c2 = (jb20.C17914c) w11.m204373i(aVar.f159931c);
                return (this.f159934f == aVar.f159934f && this.f159935g == aVar.f159935g && this.f159936h == aVar.f159936h && (!this.f159937i || !aVar.f159937i || this.f159938j == aVar.f159938j) && (((i = this.f159932d) == (i2 = aVar.f159932d) || (i != 0 && i2 != 0)) && (((i3 = c17914c.f119118l) != 0 || c17914c2.f119118l != 0 || (this.f159941m == aVar.f159941m && this.f159942n == aVar.f159942n)) && ((i3 != 1 || c17914c2.f119118l != 1 || (this.f159943o == aVar.f159943o && this.f159944p == aVar.f159944p)) && (z = this.f159939k) == aVar.f159939k && (!z || this.f159940l == aVar.f159940l))))) ? false : true;
            }

            /* JADX INFO: renamed from: d */
            public boolean m178518d() {
                if (!this.f159930b) {
                    return false;
                }
                int i = this.f159933e;
                return i == 7 || i == 2;
            }

            /* JADX INFO: renamed from: e */
            public void m178519e(jb20.C17914c c17914c, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.f159931c = c17914c;
                this.f159932d = i;
                this.f159933e = i2;
                this.f159934f = i3;
                this.f159935g = i4;
                this.f159936h = z;
                this.f159937i = z2;
                this.f159938j = z3;
                this.f159939k = z4;
                this.f159940l = i5;
                this.f159941m = i6;
                this.f159942n = i7;
                this.f159943o = i8;
                this.f159944p = i9;
                this.f159929a = true;
                this.f159930b = true;
            }

            /* JADX INFO: renamed from: f */
            public void m178520f(int i) {
                this.f159933e = i;
                this.f159930b = true;
            }
        }

        public C19685b(qfj0 qfj0Var, boolean z, boolean z2) {
            this.f159911a = qfj0Var;
            this.f159912b = z;
            this.f159913c = z2;
            this.f159923m = new a();
            this.f159924n = new a();
            byte[] bArr = new byte[128];
            this.f159917g = bArr;
            this.f159916f = new jg60(bArr, 0, 0);
            m178513g();
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
        public void m178507a(byte[] bArr, int i, int i2) {
            boolean z;
            boolean z2;
            boolean zM144762d;
            boolean z3;
            int iM144766h;
            int i3;
            int i4;
            int iM144765g;
            int i5;
            int iM144765g2;
            int iM144763e;
            if (this.f159921k) {
                int i6 = i2 - i;
                byte[] bArr2 = this.f159917g;
                int length = bArr2.length;
                int i7 = this.f159918h;
                if (length < i7 + i6) {
                    this.f159917g = Arrays.copyOf(bArr2, (i7 + i6) * 2);
                }
                System.arraycopy(bArr, i, this.f159917g, this.f159918h, i6);
                int i8 = this.f159918h + i6;
                this.f159918h = i8;
                this.f159916f.m144767i(this.f159917g, 0, i8);
                if (this.f159916f.m144760b(8)) {
                    this.f159916f.m144769k();
                    int iM144763e2 = this.f159916f.m144763e(2);
                    this.f159916f.m144770l(5);
                    if (this.f159916f.m144761c()) {
                        this.f159916f.m144766h();
                        if (this.f159916f.m144761c()) {
                            int iM144766h2 = this.f159916f.m144766h();
                            if (!this.f159913c) {
                                this.f159921k = false;
                                this.f159924n.m178520f(iM144766h2);
                                return;
                            }
                            if (this.f159916f.m144761c()) {
                                int iM144766h3 = this.f159916f.m144766h();
                                if (this.f159915e.indexOfKey(iM144766h3) < 0) {
                                    this.f159921k = false;
                                    return;
                                }
                                jb20.C17913b c17913b = this.f159915e.get(iM144766h3);
                                jb20.C17914c c17914c = this.f159914d.get(c17913b.f119105b);
                                if (c17914c.f119115i) {
                                    if (!this.f159916f.m144760b(2)) {
                                        return;
                                    } else {
                                        this.f159916f.m144770l(2);
                                    }
                                }
                                if (this.f159916f.m144760b(c17914c.f119117k)) {
                                    int iM144763e3 = this.f159916f.m144763e(c17914c.f119117k);
                                    if (!c17914c.f119116j) {
                                        if (this.f159916f.m144760b(1)) {
                                            boolean zM144762d2 = this.f159916f.m144762d();
                                            if (!zM144762d2) {
                                                z = zM144762d2;
                                                z2 = false;
                                            } else {
                                                if (!this.f159916f.m144760b(1)) {
                                                    return;
                                                }
                                                z = zM144762d2;
                                                z2 = true;
                                                zM144762d = this.f159916f.m144762d();
                                            }
                                            if (this.f159919i == 5) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            if (z3) {
                                                iM144766h = 0;
                                            } else if (!this.f159916f.m144761c()) {
                                                return;
                                            } else {
                                                iM144766h = this.f159916f.m144766h();
                                            }
                                            i3 = c17914c.f119118l;
                                            if (i3 != 0) {
                                                if (this.f159916f.m144760b(c17914c.f119119m)) {
                                                    iM144763e = this.f159916f.m144763e(c17914c.f119119m);
                                                    if (c17913b.f119106c || z) {
                                                        i4 = iM144763e;
                                                        iM144765g = 0;
                                                    } else {
                                                        if (!this.f159916f.m144761c()) {
                                                            return;
                                                        }
                                                        iM144765g = this.f159916f.m144765g();
                                                        i4 = iM144763e;
                                                        i5 = 0;
                                                    }
                                                    iM144765g2 = i5;
                                                    this.f159924n.m178519e(c17914c, iM144763e2, iM144766h2, iM144763e3, iM144766h3, z, z2, zM144762d, z3, iM144766h, i4, iM144765g, i5, iM144765g2);
                                                    this.f159921k = false;
                                                }
                                                return;
                                            }
                                            if (i3 == 1 || c17914c.f119120n) {
                                                i4 = 0;
                                                iM144765g = 0;
                                            } else {
                                                if (!this.f159916f.m144761c()) {
                                                    return;
                                                }
                                                int iM144765g3 = this.f159916f.m144765g();
                                                if (!c17913b.f119106c || z) {
                                                    i5 = iM144765g3;
                                                    i4 = 0;
                                                    iM144765g = 0;
                                                    iM144765g2 = 0;
                                                } else {
                                                    if (!this.f159916f.m144761c()) {
                                                        return;
                                                    }
                                                    iM144765g2 = this.f159916f.m144765g();
                                                    i5 = iM144765g3;
                                                    i4 = 0;
                                                    iM144765g = 0;
                                                }
                                            }
                                            this.f159924n.m178519e(c17914c, iM144763e2, iM144766h2, iM144763e3, iM144766h3, z, z2, zM144762d, z3, iM144766h, i4, iM144765g, i5, iM144765g2);
                                            this.f159921k = false;
                                            i5 = iM144765g;
                                            iM144765g2 = i5;
                                            this.f159924n.m178519e(c17914c, iM144763e2, iM144766h2, iM144763e3, iM144766h3, z, z2, zM144762d, z3, iM144766h, i4, iM144765g, i5, iM144765g2);
                                            this.f159921k = false;
                                        }
                                        return;
                                    }
                                    z = false;
                                    z2 = false;
                                    zM144762d = z2;
                                    if (this.f159919i == 5) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        iM144766h = 0;
                                    } else if (!this.f159916f.m144761c()) {
                                        return;
                                    } else {
                                        iM144766h = this.f159916f.m144766h();
                                    }
                                    i3 = c17914c.f119118l;
                                    if (i3 != 0) {
                                        if (i3 == 1) {
                                        }
                                        i4 = 0;
                                        iM144765g = 0;
                                    } else {
                                        if (this.f159916f.m144760b(c17914c.f119119m)) {
                                            return;
                                        }
                                        iM144763e = this.f159916f.m144763e(c17914c.f119119m);
                                        if (c17913b.f119106c) {
                                        }
                                        i4 = iM144763e;
                                        iM144765g = 0;
                                    }
                                    i5 = iM144765g;
                                    iM144765g2 = i5;
                                    this.f159924n.m178519e(c17914c, iM144763e2, iM144766h2, iM144763e3, iM144766h3, z, z2, zM144762d, z3, iM144766h, i4, iM144765g, i5, iM144765g2);
                                    this.f159921k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m178508b(long j, int i, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.f159919i == 9 || (this.f159913c && this.f159924n.m178517c(this.f159923m))) {
                if (z && this.f159925o) {
                    m178510d(i + ((int) (j - this.f159920j)));
                }
                this.f159926p = this.f159920j;
                this.f159927q = this.f159922l;
                this.f159928r = false;
                this.f159925o = true;
            }
            if (this.f159912b) {
                z2 = this.f159924n.m178518d();
            }
            boolean z4 = this.f159928r;
            int i2 = this.f159919i;
            if (i2 == 5 || (z2 && i2 == 1)) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            this.f159928r = z5;
            return z5;
        }

        /* JADX INFO: renamed from: c */
        public boolean m178509c() {
            return this.f159913c;
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
        public final void m178510d(int i) {
            long j = this.f159927q;
            if (j == -9223372036854775807L) {
                return;
            }
            boolean z = this.f159928r;
            this.f159911a.mo11163a(j, z ? 1 : 0, (int) (this.f159920j - this.f159926p), i, null);
        }

        /* JADX INFO: renamed from: e */
        public void m178511e(jb20.C17913b c17913b) {
            this.f159915e.append(c17913b.f119104a, c17913b);
        }

        /* JADX INFO: renamed from: f */
        public void m178512f(jb20.C17914c c17914c) {
            this.f159914d.append(c17914c.f119110d, c17914c);
        }

        /* JADX INFO: renamed from: g */
        public void m178513g() {
            this.f159921k = false;
            this.f159925o = false;
            this.f159924n.m178516b();
        }

        /* JADX INFO: renamed from: h */
        public void m178514h(long j, int i, long j2) {
            this.f159919i = i;
            this.f159922l = j2;
            this.f159920j = j;
            if (!this.f159912b || i != 1) {
                if (!this.f159913c) {
                    return;
                }
                if (i != 5 && i != 1 && i != 2) {
                    return;
                }
            }
            a aVar = this.f159923m;
            this.f159923m = this.f159924n;
            this.f159924n = aVar;
            aVar.m178516b();
            this.f159918h = 0;
            this.f159921k = true;
        }
    }

    public qwk(vke0 vke0Var, boolean z, boolean z2) {
        this.f159896a = vke0Var;
        this.f159897b = z;
        this.f159898c = z2;
    }

    @EnsuresNonNull({"output", "sampleReader"})
    /* JADX INFO: renamed from: f */
    private void m178503f() {
        w11.m204373i(this.f159905j);
        bmk0.m105144j(this.f159906k);
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: a */
    public void mo108399a(ig60 ig60Var) {
        m178503f();
        int iM139816f = ig60Var.m139816f();
        int iM139817g = ig60Var.m139817g();
        byte[] bArrM139815e = ig60Var.m139815e();
        this.f159902g += (long) ig60Var.m139811a();
        this.f159905j.m176370d(ig60Var, ig60Var.m139811a());
        while (true) {
            int iM144185c = jb20.m144185c(bArrM139815e, iM139816f, iM139817g, this.f159903h);
            if (iM144185c == iM139817g) {
                this.m178505h(bArrM139815e, iM139816f, iM139817g);
                return;
            }
            int iM144188f = jb20.m144188f(bArrM139815e, iM144185c);
            int i = iM144185c - iM139816f;
            if (i > 0) {
                this.m178505h(bArrM139815e, iM139816f, iM144185c);
            }
            int i2 = iM139817g - iM144185c;
            long j = this.f159902g - ((long) i2);
            qwk qwkVar = this;
            qwkVar.m178504g(j, i2, i < 0 ? -i : 0, this.f159908m);
            qwkVar.m178506i(j, iM144188f, qwkVar.f159908m);
            iM139816f = iM144185c + 3;
            this = qwkVar;
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: b */
    public void mo108400b() {
        this.f159902g = 0L;
        this.f159909n = false;
        this.f159908m = -9223372036854775807L;
        jb20.m144183a(this.f159903h);
        this.f159899d.m139237d();
        this.f159900e.m139237d();
        this.f159901f.m139237d();
        C19685b c19685b = this.f159906k;
        if (c19685b != null) {
            c19685b.m178513g();
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: d */
    public void mo108402d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f159908m = j;
        }
        this.f159909n |= (i & 2) != 0;
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: e */
    public void mo108403e(bsf bsfVar, jkj0.C17969d c17969d) {
        c17969d.m145854a();
        this.f159904i = c17969d.m145855b();
        qfj0 qfj0VarMo11416b = bsfVar.mo11416b(c17969d.m145856c(), 2);
        this.f159905j = qfj0VarMo11416b;
        this.f159906k = new C19685b(qfj0VarMo11416b, this.f159897b, this.f159898c);
        this.f159896a.m201569b(bsfVar, c17969d);
    }

    @RequiresNonNull({"output", "sampleReader"})
    /* JADX INFO: renamed from: g */
    public final void m178504g(long j, int i, int i2, long j2) {
        if (!this.f159907l || this.f159906k.m178509c()) {
            this.f159899d.m139235b(i2);
            this.f159900e.m139235b(i2);
            boolean z = this.f159907l;
            ib20 ib20Var = this.f159899d;
            if (z) {
                if (ib20Var.m139236c()) {
                    ib20 ib20Var2 = this.f159899d;
                    this.f159906k.m178512f(jb20.m144194l(ib20Var2.f113652d, 3, ib20Var2.f113653e));
                    this.f159899d.m139237d();
                } else if (this.f159900e.m139236c()) {
                    ib20 ib20Var3 = this.f159900e;
                    this.f159906k.m178511e(jb20.m144192j(ib20Var3.f113652d, 3, ib20Var3.f113653e));
                    this.f159900e.m139237d();
                }
            } else if (ib20Var.m139236c() && this.f159900e.m139236c()) {
                ArrayList arrayList = new ArrayList();
                ib20 ib20Var4 = this.f159899d;
                arrayList.add(Arrays.copyOf(ib20Var4.f113652d, ib20Var4.f113653e));
                ib20 ib20Var5 = this.f159900e;
                arrayList.add(Arrays.copyOf(ib20Var5.f113652d, ib20Var5.f113653e));
                ib20 ib20Var6 = this.f159899d;
                jb20.C17914c c17914cM144194l = jb20.m144194l(ib20Var6.f113652d, 3, ib20Var6.f113653e);
                ib20 ib20Var7 = this.f159900e;
                jb20.C17913b c17913bM144192j = jb20.m144192j(ib20Var7.f113652d, 3, ib20Var7.f113653e);
                this.f159905j.mo11164b(new C1894k.b().m10388U(this.f159904i).m10400g0(YtVideoEncoder.MIME_TYPE).m10378K(lc5.m153621a(c17914cM144194l.f119107a, c17914cM144194l.f119108b, c17914cM144194l.f119109c)).m10407n0(c17914cM144194l.f119112f).m10386S(c17914cM144194l.f119113g).m10396c0(c17914cM144194l.f119114h).m10389V(arrayList).m10374G());
                this.f159907l = true;
                this.f159906k.m178512f(c17914cM144194l);
                this.f159906k.m178511e(c17913bM144192j);
                this.f159899d.m139237d();
                this.f159900e.m139237d();
            }
        }
        if (this.f159901f.m139235b(i2)) {
            ib20 ib20Var8 = this.f159901f;
            this.f159910o.m139806S(this.f159901f.f113652d, jb20.m144199q(ib20Var8.f113652d, ib20Var8.f113653e));
            this.f159910o.m139808U(4);
            this.f159896a.m201568a(j2, this.f159910o);
        }
        if (this.f159906k.m178508b(j, i, this.f159907l, this.f159909n)) {
            this.f159909n = false;
        }
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: h */
    public final void m178505h(byte[] bArr, int i, int i2) {
        if (!this.f159907l || this.f159906k.m178509c()) {
            this.f159899d.m139234a(bArr, i, i2);
            this.f159900e.m139234a(bArr, i, i2);
        }
        this.f159901f.m139234a(bArr, i, i2);
        this.f159906k.m178507a(bArr, i, i2);
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: i */
    public final void m178506i(long j, int i, long j2) {
        if (!this.f159907l || this.f159906k.m178509c()) {
            this.f159899d.m139238e(i);
            this.f159900e.m139238e(i);
        }
        this.f159901f.m139238e(i);
        this.f159906k.m178514h(j, i, j2);
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: c */
    public void mo108401c() {
    }
}
