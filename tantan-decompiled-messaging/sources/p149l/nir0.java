package p149l;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class nir0 implements j5r0 {

    /* JADX INFO: renamed from: j */
    public static final c6r0 f139125j = new c6r0() { // from class: l.mir0
        @Override // p149l.c6r0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j5r0[] mo95449a(Uri uri, Map map) {
            int i = b6r0.f73876a;
            return new j5r0[]{new nir0(0)};
        }
    };

    /* JADX INFO: renamed from: a */
    public final oir0 f139126a;

    /* JADX INFO: renamed from: b */
    public final v6w0 f139127b;

    /* JADX INFO: renamed from: c */
    public final v6w0 f139128c;

    /* JADX INFO: renamed from: d */
    public final x5w0 f139129d;

    /* JADX INFO: renamed from: e */
    public m5r0 f139130e;

    /* JADX INFO: renamed from: f */
    public long f139131f;

    /* JADX INFO: renamed from: g */
    public long f139132g;

    /* JADX INFO: renamed from: h */
    public boolean f139133h;

    /* JADX INFO: renamed from: i */
    public boolean f139134i;

    public nir0(int i) {
        this.f139126a = new oir0(true, null);
        this.f139127b = new v6w0(2048);
        this.f139132g = -1L;
        v6w0 v6w0Var = new v6w0(10);
        this.f139128c = v6w0Var;
        byte[] bArrM197264m = v6w0Var.m197264m();
        this.f139129d = new x5w0(bArrM197264m, bArrM197264m.length);
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: c */
    public final void mo100820c(long j, long j2) {
        this.f139133h = false;
        this.f139126a.zze();
        this.f139131f = j2;
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: d */
    public final boolean mo100821d(k5r0 k5r0Var) throws IOException {
        int i = 0;
        while (true) {
            z4r0 z4r0Var = (z4r0) k5r0Var;
            z4r0Var.mo140051c(this.f139128c.m197264m(), 0, 10, false);
            this.f139128c.m197262k(0);
            if (this.f139128c.m197240D() != 4801587) {
                break;
            }
            this.f139128c.m197263l(3);
            int iM197237A = this.f139128c.m197237A();
            i += iM197237A + 10;
            z4r0Var.m217118j(iM197237A, false);
        }
        k5r0Var.zzj();
        z4r0 z4r0Var2 = (z4r0) k5r0Var;
        z4r0Var2.m217118j(i, false);
        if (this.f139132g == -1) {
            this.f139132g = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            z4r0Var2.mo140051c(this.f139128c.m197264m(), 0, 2, false);
            this.f139128c.m197262k(0);
            if (oir0.m164548e(this.f139128c.m197242F())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                z4r0Var2.mo140051c(this.f139128c.m197264m(), 0, 4, false);
                this.f139129d.m207157k(14);
                int iM207150d = this.f139129d.m207150d(13);
                if (iM207150d <= 6) {
                    i4++;
                    k5r0Var.zzj();
                    z4r0Var2.m217118j(i4, false);
                } else {
                    z4r0Var2.m217118j(iM207150d - 6, false);
                    i3 += iM207150d;
                }
            } else {
                i4++;
                k5r0Var.zzj();
                z4r0Var2.m217118j(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: e */
    public final void mo100822e(m5r0 m5r0Var) {
        this.f139130e = m5r0Var;
        this.f139126a.mo121628d(m5r0Var, new alr0(Integer.MIN_VALUE, 0, 1));
        m5r0Var.mo129453c();
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: f */
    public final int mo100823f(k5r0 k5r0Var, s6r0 s6r0Var) throws IOException {
        f5v0.m119531b(this.f139130e);
        int iMo12727a = k5r0Var.mo12727a(this.f139127b.m197264m(), 0, 2048);
        if (!this.f139134i) {
            this.f139130e.mo129455j(new u6r0(-9223372036854775807L, 0L));
            this.f139134i = true;
        }
        if (iMo12727a == -1) {
            return -1;
        }
        this.f139127b.m197262k(0);
        this.f139127b.m197261j(iMo12727a);
        if (!this.f139133h) {
            this.f139126a.mo121627c(this.f139131f, 4);
            this.f139133h = true;
        }
        this.f139126a.mo121626b(this.f139127b);
        return 0;
    }

    public nir0() {
        this(0);
    }
}
