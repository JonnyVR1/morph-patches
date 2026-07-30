package p149l;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b9r0 implements j5r0 {

    /* JADX INFO: renamed from: q */
    public static final c6r0 f74602q = new c6r0() { // from class: l.a9r0
        @Override // p149l.c6r0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j5r0[] mo95449a(Uri uri, Map map) {
            int i = b6r0.f73876a;
            return new j5r0[]{new b9r0()};
        }
    };

    /* JADX INFO: renamed from: f */
    public m5r0 f74608f;

    /* JADX INFO: renamed from: h */
    public boolean f74610h;

    /* JADX INFO: renamed from: i */
    public long f74611i;

    /* JADX INFO: renamed from: j */
    public int f74612j;

    /* JADX INFO: renamed from: k */
    public int f74613k;

    /* JADX INFO: renamed from: l */
    public int f74614l;

    /* JADX INFO: renamed from: m */
    public long f74615m;

    /* JADX INFO: renamed from: n */
    public boolean f74616n;

    /* JADX INFO: renamed from: o */
    public z8r0 f74617o;

    /* JADX INFO: renamed from: p */
    public e9r0 f74618p;

    /* JADX INFO: renamed from: a */
    public final v6w0 f74603a = new v6w0(4);

    /* JADX INFO: renamed from: b */
    public final v6w0 f74604b = new v6w0(9);

    /* JADX INFO: renamed from: c */
    public final v6w0 f74605c = new v6w0(11);

    /* JADX INFO: renamed from: d */
    public final v6w0 f74606d = new v6w0();

    /* JADX INFO: renamed from: e */
    public final c9r0 f74607e = new c9r0();

    /* JADX INFO: renamed from: g */
    public int f74609g = 1;

    @RequiresNonNull({"extractorOutput"})
    /* JADX INFO: renamed from: b */
    private final void m100818b() {
        if (this.f74616n) {
            return;
        }
        this.f74608f.mo129455j(new u6r0(-9223372036854775807L, 0L));
        this.f74616n = true;
    }

    /* JADX INFO: renamed from: a */
    public final v6w0 m100819a(k5r0 k5r0Var) throws IOException {
        int i = this.f74614l;
        int iM197269r = this.f74606d.m197269r();
        v6w0 v6w0Var = this.f74606d;
        if (i > iM197269r) {
            int iM197269r2 = v6w0Var.m197269r();
            v6w0Var.m197260i(new byte[Math.max(iM197269r2 + iM197269r2, this.f74614l)], 0);
        } else {
            v6w0Var.m197262k(0);
        }
        this.f74606d.m197261j(this.f74614l);
        ((z4r0) k5r0Var).mo140050b(this.f74606d.m197264m(), 0, this.f74614l, false);
        return this.f74606d;
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: c */
    public final void mo100820c(long j, long j2) {
        if (j == 0) {
            this.f74609g = 1;
            this.f74610h = false;
        } else {
            this.f74609g = 3;
        }
        this.f74612j = 0;
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: d */
    public final boolean mo100821d(k5r0 k5r0Var) throws IOException {
        z4r0 z4r0Var = (z4r0) k5r0Var;
        z4r0Var.mo140051c(this.f74603a.m197264m(), 0, 3, false);
        this.f74603a.m197262k(0);
        if (this.f74603a.m197240D() != 4607062) {
            return false;
        }
        z4r0Var.mo140051c(this.f74603a.m197264m(), 0, 2, false);
        this.f74603a.m197262k(0);
        if ((this.f74603a.m197242F() & 250) != 0) {
            return false;
        }
        z4r0Var.mo140051c(this.f74603a.m197264m(), 0, 4, false);
        this.f74603a.m197262k(0);
        int iM197273v = this.f74603a.m197273v();
        k5r0Var.zzj();
        z4r0 z4r0Var2 = (z4r0) k5r0Var;
        z4r0Var2.m217118j(iM197273v, false);
        z4r0Var2.mo140051c(this.f74603a.m197264m(), 0, 4, false);
        this.f74603a.m197262k(0);
        return this.f74603a.m197273v() == 0;
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: e */
    public final void mo100822e(m5r0 m5r0Var) {
        this.f74608f = m5r0Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0009 A[SYNTHETIC] */
    @Override // p149l.j5r0
    /* JADX INFO: renamed from: f */
    public final int mo100823f(k5r0 k5r0Var, s6r0 s6r0Var) throws IOException {
        long j;
        boolean zM110462c;
        boolean z;
        long j2;
        f5v0.m119531b(this.f74608f);
        while (true) {
            int i = this.f74609g;
            int i2 = 8;
            if (i != 1) {
                if (i == 2) {
                    ((z4r0) k5r0Var).m217119k(this.f74612j, false);
                    this.f74612j = 0;
                    this.f74609g = 3;
                } else if (i != 3) {
                    if (i != 4) {
                        ohg0.m164364a();
                        return 0;
                    }
                    if (this.f74610h) {
                        j = this.f74611i + this.f74615m;
                    } else {
                        j = this.f74607e.m105905d() == -9223372036854775807L ? 0L : this.f74615m;
                    }
                    int i3 = this.f74613k;
                    if (i3 == 8) {
                        if (this.f74617o != null) {
                            m100818b();
                            zM110462c = this.f74617o.m110462c(m100819a(k5r0Var), j);
                        }
                        z = true;
                        if (!this.f74610h && zM110462c) {
                            this.f74610h = true;
                            if (this.f74607e.m105905d() == -9223372036854775807L) {
                                j2 = -this.f74615m;
                            } else {
                                j2 = 0;
                            }
                            this.f74611i = j2;
                        }
                        this.f74612j = 4;
                        this.f74609g = 2;
                        if (z) {
                            return 0;
                        }
                    } else {
                        i2 = i3;
                    }
                    if (i2 == 9) {
                        if (this.f74618p != null) {
                            m100818b();
                            zM110462c = this.f74618p.m110462c(m100819a(k5r0Var), j);
                            z = true;
                        } else {
                            ((z4r0) k5r0Var).m217119k(this.f74614l, false);
                            zM110462c = false;
                            z = false;
                        }
                    } else if (i2 != 18 || this.f74616n) {
                        ((z4r0) k5r0Var).m217119k(this.f74614l, false);
                        zM110462c = false;
                        z = false;
                    } else {
                        zM110462c = this.f74607e.m110462c(m100819a(k5r0Var), j);
                        c9r0 c9r0Var = this.f74607e;
                        long jM105905d = c9r0Var.m105905d();
                        if (jM105905d != -9223372036854775807L) {
                            this.f74608f.mo129455j(new o6r0(c9r0Var.m105906e(), c9r0Var.m105907f(), jM105905d));
                            this.f74616n = true;
                        }
                        z = true;
                    }
                    if (!this.f74610h) {
                        this.f74610h = true;
                        if (this.f74607e.m105905d() == -9223372036854775807L) {
                            j2 = -this.f74615m;
                        } else {
                            j2 = 0;
                        }
                        this.f74611i = j2;
                    }
                    this.f74612j = 4;
                    this.f74609g = 2;
                    if (z) {
                        return 0;
                    }
                } else {
                    if (!k5r0Var.mo140050b(this.f74605c.m197264m(), 0, 11, true)) {
                        return -1;
                    }
                    this.f74605c.m197262k(0);
                    this.f74613k = this.f74605c.m197238B();
                    this.f74614l = this.f74605c.m197240D();
                    this.f74615m = this.f74605c.m197240D();
                    this.f74615m = (((long) (this.f74605c.m197238B() << 24)) | this.f74615m) * 1000;
                    this.f74605c.m197263l(3);
                    this.f74609g = 4;
                }
            } else {
                if (!k5r0Var.mo140050b(this.f74604b.m197264m(), 0, 9, true)) {
                    return -1;
                }
                this.f74604b.m197262k(0);
                this.f74604b.m197263l(4);
                int iM197238B = this.f74604b.m197238B();
                int i4 = iM197238B & 4;
                int i5 = iM197238B & 1;
                if (i4 != 0 && this.f74617o == null) {
                    this.f74617o = new z8r0(this.f74608f.mo129454i(8, 1));
                }
                if (i5 != 0 && this.f74618p == null) {
                    this.f74618p = new e9r0(this.f74608f.mo129454i(9, 2));
                }
                this.f74608f.mo129453c();
                this.f74612j = this.f74604b.m197273v() - 5;
                this.f74609g = 2;
            }
        }
    }
}
