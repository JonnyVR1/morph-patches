package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzafw;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgaa;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class y8r0 implements j5r0 {

    /* JADX INFO: renamed from: n */
    public static final c6r0 f196863n = new c6r0() { // from class: l.l8r0
        @Override // p149l.c6r0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j5r0[] mo95449a(Uri uri, Map map) {
            int i = b6r0.f73876a;
            return new j5r0[]{new y8r0(0)};
        }
    };

    /* JADX INFO: renamed from: a */
    public final byte[] f196864a;

    /* JADX INFO: renamed from: b */
    public final v6w0 f196865b;

    /* JADX INFO: renamed from: c */
    public final d6r0 f196866c;

    /* JADX INFO: renamed from: d */
    public m5r0 f196867d;

    /* JADX INFO: renamed from: e */
    public m7r0 f196868e;

    /* JADX INFO: renamed from: f */
    public int f196869f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public zzby f196870g;

    /* JADX INFO: renamed from: h */
    public i6r0 f196871h;

    /* JADX INFO: renamed from: i */
    public int f196872i;

    /* JADX INFO: renamed from: j */
    public int f196873j;

    /* JADX INFO: renamed from: k */
    public k8r0 f196874k;

    /* JADX INFO: renamed from: l */
    public int f196875l;

    /* JADX INFO: renamed from: m */
    public long f196876m;

    public y8r0(int i) {
        this.f196864a = new byte[42];
        this.f196865b = new v6w0(new byte[32768], 0);
        this.f196866c = new d6r0();
        this.f196869f = 0;
    }

    /* JADX INFO: renamed from: a */
    public final long m213432a(v6w0 v6w0Var, boolean z) {
        boolean zM115110c;
        this.f196871h.getClass();
        int iM197270s = v6w0Var.m197270s();
        while (iM197270s <= v6w0Var.m197271t() - 16) {
            v6w0Var.m197262k(iM197270s);
            if (e6r0.m115110c(v6w0Var, this.f196871h, this.f196873j, this.f196866c)) {
                v6w0Var.m197262k(iM197270s);
                return this.f196866c.f84648a;
            }
            iM197270s++;
        }
        if (!z) {
            v6w0Var.m197262k(iM197270s);
            return -1L;
        }
        while (iM197270s <= v6w0Var.m197271t() - this.f196872i) {
            v6w0Var.m197262k(iM197270s);
            try {
                zM115110c = e6r0.m115110c(v6w0Var, this.f196871h, this.f196873j, this.f196866c);
            } catch (IndexOutOfBoundsException unused) {
                zM115110c = false;
            }
            if (v6w0Var.m197270s() <= v6w0Var.m197271t() && zM115110c) {
                v6w0Var.m197262k(iM197270s);
                return this.f196866c.f84648a;
            }
            iM197270s++;
        }
        v6w0Var.m197262k(v6w0Var.m197271t());
        return -1L;
    }

    /* JADX INFO: renamed from: b */
    public final void m213433b() {
        long j = this.f196876m * 1000000;
        i6r0 i6r0Var = this.f196871h;
        int i = ggw0.f102568a;
        this.f196868e.mo134530c(j / ((long) i6r0Var.f111763e), 1, this.f196875l, 0, null);
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: c */
    public final void mo100820c(long j, long j2) {
        if (j == 0) {
            this.f196869f = 0;
        } else {
            k8r0 k8r0Var = this.f196874k;
            if (k8r0Var != null) {
                k8r0Var.m197059d(j2);
            }
        }
        this.f196876m = j2 != 0 ? -1L : 0L;
        this.f196875l = 0;
        this.f196865b.m197259h(0);
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: d */
    public final boolean mo100821d(k5r0 k5r0Var) throws IOException {
        f6r0.m119634a(k5r0Var, false);
        v6w0 v6w0Var = new v6w0(4);
        ((z4r0) k5r0Var).mo140051c(v6w0Var.m197264m(), 0, 4, false);
        return v6w0Var.m197246J() == 1716281667;
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: e */
    public final void mo100822e(m5r0 m5r0Var) {
        this.f196867d = m5r0Var;
        this.f196868e = m5r0Var.mo129454i(0, 1);
        m5r0Var.mo129453c();
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: f */
    public final int mo100823f(k5r0 k5r0Var, s6r0 s6r0Var) throws IOException {
        boolean zM207161o;
        v6r0 u6r0Var;
        boolean z;
        int i = this.f196869f;
        if (i == 0) {
            k5r0Var.zzj();
            long jZze = k5r0Var.zze();
            zzby zzbyVarM119634a = f6r0.m119634a(k5r0Var, true);
            ((z4r0) k5r0Var).m217119k((int) (k5r0Var.zze() - jZze), false);
            this.f196870g = zzbyVarM119634a;
            this.f196869f = 1;
            return 0;
        }
        if (i == 1) {
            ((z4r0) k5r0Var).mo140051c(this.f196864a, 0, 42, false);
            k5r0Var.zzj();
            this.f196869f = 2;
            return 0;
        }
        if (i == 2) {
            v6w0 v6w0Var = new v6w0(4);
            ((z4r0) k5r0Var).mo140050b(v6w0Var.m197264m(), 0, 4, false);
            if (v6w0Var.m197246J() != 1716281667) {
                throw zzcc.zza("Failed to read FLAC stream marker.", null);
            }
            this.f196869f = 3;
            return 0;
        }
        if (i == 3) {
            i6r0 i6r0VarM134640e = this.f196871h;
            do {
                k5r0Var.zzj();
                x5w0 x5w0Var = new x5w0(new byte[4], 4);
                z4r0 z4r0Var = (z4r0) k5r0Var;
                z4r0Var.mo140051c(x5w0Var.f191198a, 0, 4, false);
                zM207161o = x5w0Var.m207161o();
                int iM207150d = x5w0Var.m207150d(7);
                int iM207150d2 = x5w0Var.m207150d(24) + 4;
                if (iM207150d == 0) {
                    byte[] bArr = new byte[38];
                    z4r0Var.mo140050b(bArr, 0, 38, false);
                    i6r0VarM134640e = new i6r0(bArr, 4);
                } else {
                    if (i6r0VarM134640e == null) {
                        x9g0.m207497a();
                        return 0;
                    }
                    if (iM207150d == 3) {
                        v6w0 v6w0Var2 = new v6w0(iM207150d2);
                        z4r0Var.mo140050b(v6w0Var2.m197264m(), 0, iM207150d2, false);
                        i6r0VarM134640e = i6r0VarM134640e.m134641f(f6r0.m119635b(v6w0Var2));
                    } else if (iM207150d == 4) {
                        v6w0 v6w0Var3 = new v6w0(iM207150d2);
                        z4r0Var.mo140050b(v6w0Var3.m197264m(), 0, iM207150d2, false);
                        v6w0Var3.m197263l(4);
                        i6r0VarM134640e = i6r0VarM134640e.m134642g(Arrays.asList(s7r0.m182516c(v6w0Var3, false, false).f147538b));
                    } else if (iM207150d == 6) {
                        v6w0 v6w0Var4 = new v6w0(iM207150d2);
                        z4r0Var.mo140050b(v6w0Var4.m197264m(), 0, iM207150d2, false);
                        v6w0Var4.m197263l(4);
                        i6r0VarM134640e = i6r0VarM134640e.m134640e(zzgaa.zzm(zzafw.m13539a(v6w0Var4)));
                    } else {
                        z4r0Var.m217119k(iM207150d2, false);
                    }
                }
                int i2 = ggw0.f102568a;
                this.f196871h = i6r0VarM134640e;
            } while (!zM207161o);
            i6r0VarM134640e.getClass();
            this.f196872i = Math.max(i6r0VarM134640e.f111761c, 6);
            this.f196868e.mo134531d(this.f196871h.m134638c(this.f196864a, this.f196870g));
            this.f196869f = 4;
            return 0;
        }
        if (i == 4) {
            k5r0Var.zzj();
            v6w0 v6w0Var5 = new v6w0(2);
            ((z4r0) k5r0Var).mo140051c(v6w0Var5.m197264m(), 0, 2, false);
            int iM197242F = v6w0Var5.m197242F();
            if ((iM197242F >> 2) != 16382) {
                k5r0Var.zzj();
                throw zzcc.zza("First frame does not start with sync code.", null);
            }
            k5r0Var.zzj();
            this.f196873j = iM197242F;
            m5r0 m5r0Var = this.f196867d;
            int i3 = ggw0.f102568a;
            long jZzf = k5r0Var.zzf();
            long jZzd = k5r0Var.zzd();
            i6r0 i6r0Var = this.f196871h;
            i6r0Var.getClass();
            if (i6r0Var.f111769k != null) {
                u6r0Var = new g6r0(i6r0Var, jZzf);
            } else if (jZzd == -1 || i6r0Var.f111768j <= 0) {
                u6r0Var = new u6r0(i6r0Var.m134636a(), 0L);
            } else {
                k8r0 k8r0Var = new k8r0(i6r0Var, this.f196873j, jZzf, jZzd);
                this.f196874k = k8r0Var;
                u6r0Var = k8r0Var.m197057b();
            }
            m5r0Var.mo129455j(u6r0Var);
            this.f196869f = 5;
            return 0;
        }
        this.f196868e.getClass();
        i6r0 i6r0Var2 = this.f196871h;
        i6r0Var2.getClass();
        k8r0 k8r0Var2 = this.f196874k;
        if (k8r0Var2 != null && k8r0Var2.m197060e()) {
            return k8r0Var2.m197056a(k5r0Var, s6r0Var);
        }
        if (this.f196876m == -1) {
            this.f196876m = e6r0.m115109b(k5r0Var, i6r0Var2);
            return 0;
        }
        v6w0 v6w0Var6 = this.f196865b;
        int iM197271t = v6w0Var6.m197271t();
        if (iM197271t < 32768) {
            int iMo12727a = k5r0Var.mo12727a(v6w0Var6.m197264m(), iM197271t, 32768 - iM197271t);
            z = iMo12727a == -1;
            v6w0 v6w0Var7 = this.f196865b;
            if (!z) {
                v6w0Var7.m197261j(iM197271t + iMo12727a);
            } else if (v6w0Var7.m197268q() == 0) {
                m213433b();
                return -1;
            }
        } else {
            z = false;
        }
        v6w0 v6w0Var8 = this.f196865b;
        int iM197270s = v6w0Var8.m197270s();
        int i4 = this.f196875l;
        int i5 = this.f196872i;
        if (i4 < i5) {
            v6w0Var8.m197263l(Math.min(i5 - i4, v6w0Var8.m197268q()));
        }
        long jM213432a = m213432a(this.f196865b, z);
        v6w0 v6w0Var9 = this.f196865b;
        int iM197270s2 = v6w0Var9.m197270s() - iM197270s;
        v6w0Var9.m197262k(iM197270s);
        z6r0.m217416b(this.f196868e, this.f196865b, iM197270s2);
        this.f196875l += iM197270s2;
        if (jM213432a != -1) {
            m213433b();
            this.f196875l = 0;
            this.f196876m = jM213432a;
        }
        v6w0 v6w0Var10 = this.f196865b;
        if (v6w0Var10.m197268q() >= 16) {
            return 0;
        }
        int iM197268q = v6w0Var10.m197268q();
        System.arraycopy(v6w0Var10.m197264m(), v6w0Var10.m197270s(), v6w0Var10.m197264m(), 0, iM197268q);
        this.f196865b.m197262k(0);
        this.f196865b.m197261j(iM197268q);
        return 0;
    }

    public y8r0() {
        this(0);
    }
}
