package p149l;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class r7x0 implements kbx0 {

    /* JADX INFO: renamed from: a */
    public final q7x0 f158102a;

    /* JADX INFO: renamed from: b */
    public int f158103b;

    /* JADX INFO: renamed from: c */
    public int f158104c;

    /* JADX INFO: renamed from: d */
    public int f158105d = 0;

    public r7x0(q7x0 q7x0Var) {
        Charset charset = aax0.f68607a;
        this.f158102a = q7x0Var;
        q7x0Var.f153095c = this;
    }

    /* JADX INFO: renamed from: j */
    public static final void m178217j(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzhag.zzg();
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m178218k(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzhag.zzg();
        }
    }

    /* JADX INFO: renamed from: l */
    public static r7x0 m178219l(q7x0 q7x0Var) {
        r7x0 r7x0Var = q7x0Var.f153095c;
        return r7x0Var != null ? r7x0Var : new r7x0(q7x0Var);
    }

    @Override // p149l.kbx0
    /* JADX INFO: renamed from: a */
    public final void mo145328a(Object obj, obx0 obx0Var, d8x0 d8x0Var) throws IOException {
        m178224i(2);
        m178222g(obj, obx0Var, d8x0Var);
    }

    @Override // p149l.kbx0
    /* JADX INFO: renamed from: b */
    public final void mo145329b(Object obj, obx0 obx0Var, d8x0 d8x0Var) throws IOException {
        m178224i(3);
        m178221f(obj, obx0Var, d8x0Var);
    }

    @Override // p149l.kbx0
    @Deprecated
    /* JADX INFO: renamed from: c */
    public final void mo145330c(List list, obx0 obx0Var, d8x0 d8x0Var) throws IOException {
        int iMo12804r;
        int i = this.f158103b;
        if ((i & 7) != 3) {
            throw zzhag.zza();
        }
        do {
            Object objZze = obx0Var.zze();
            m178221f(objZze, obx0Var, d8x0Var);
            obx0Var.mo13284a(objZze);
            list.add(objZze);
            if (this.f158102a.mo12792b() || this.f158105d != 0) {
                return;
            } else {
                iMo12804r = this.f158102a.mo12804r();
            }
        } while (iMo12804r == i);
        this.f158105d = iMo12804r;
    }

    @Override // p149l.kbx0
    /* JADX INFO: renamed from: d */
    public final void mo145331d(List list, obx0 obx0Var, d8x0 d8x0Var) throws IOException {
        int iMo12804r;
        int i = this.f158103b;
        if ((i & 7) != 2) {
            throw zzhag.zza();
        }
        do {
            Object objZze = obx0Var.zze();
            m178222g(objZze, obx0Var, d8x0Var);
            obx0Var.mo13284a(objZze);
            list.add(objZze);
            if (this.f158102a.mo12792b() || this.f158105d != 0) {
                return;
            } else {
                iMo12804r = this.f158102a.mo12804r();
            }
        } while (iMo12804r == i);
        this.f158105d = iMo12804r;
    }

    /* JADX INFO: renamed from: e */
    public final void m178220e(List list, boolean z) throws IOException {
        int iMo12804r;
        int iMo12804r2;
        if ((this.f158103b & 7) != 2) {
            throw zzhag.zza();
        }
        if ((list instanceof dax0) && !z) {
            dax0 dax0Var = (dax0) list;
            do {
                dax0Var.mo105952Y(zzp());
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r2 = this.f158102a.mo12804r();
                }
            } while (iMo12804r2 == this.f158103b);
        } else {
            do {
                list.add(z ? zzs() : zzr());
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r = this.f158102a.mo12804r();
                }
            } while (iMo12804r == this.f158103b);
            iMo12804r2 = iMo12804r;
        }
        this.f158105d = iMo12804r2;
    }

    /* JADX INFO: renamed from: f */
    public final void m178221f(Object obj, obx0 obx0Var, d8x0 d8x0Var) throws IOException {
        int i = this.f158104c;
        this.f158104c = ((this.f158103b >>> 3) << 3) | 4;
        try {
            obx0Var.mo13289f(obj, this, d8x0Var);
            if (this.f158103b != this.f158104c) {
                throw zzhag.zzg();
            }
            this.f158104c = i;
        } catch (Throwable th) {
            this.f158104c = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m178222g(Object obj, obx0 obx0Var, d8x0 d8x0Var) throws IOException {
        q7x0 q7x0Var = this.f158102a;
        int iMo12805s = q7x0Var.mo12805s();
        if (q7x0Var.f153093a >= q7x0Var.f153094b) {
            throw new zzhag("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iMo12798l = this.f158102a.mo12798l(iMo12805s);
        this.f158102a.f153093a++;
        obx0Var.mo13289f(obj, this, d8x0Var);
        this.f158102a.mo12782B(0);
        q7x0 q7x0Var2 = this.f158102a;
        q7x0Var2.f153093a--;
        q7x0Var2.mo12791a(iMo12798l);
    }

    /* JADX INFO: renamed from: h */
    public final void m178223h(int i) throws IOException {
        if (this.f158102a.mo12797k() != i) {
            throw zzhag.zzj();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m178224i(int i) throws IOException {
        if ((this.f158103b & 7) != i) {
            throw zzhag.zza();
        }
    }

    @Override // p149l.kbx0
    public final void zzA(List list) throws IOException {
        int iMo12804r;
        int iMo12804r2;
        boolean z = list instanceof kax0;
        int i = this.f158103b;
        if (z) {
            kax0 kax0Var = (kax0) list;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zzhag.zza();
                }
                int iMo12805s = this.f158102a.mo12805s();
                m178218k(iMo12805s);
                int iMo12797k = this.f158102a.mo12797k() + iMo12805s;
                do {
                    kax0Var.m145191g(this.f158102a.mo12806t());
                } while (this.f158102a.mo12797k() < iMo12797k);
                return;
            }
            do {
                kax0Var.m145191g(this.f158102a.mo12806t());
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r2 = this.f158102a.mo12804r();
                }
            } while (iMo12804r2 == this.f158103b);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw zzhag.zza();
                }
                int iMo12805s2 = this.f158102a.mo12805s();
                m178218k(iMo12805s2);
                int iMo12797k2 = this.f158102a.mo12797k() + iMo12805s2;
                do {
                    list.add(Long.valueOf(this.f158102a.mo12806t()));
                } while (this.f158102a.mo12797k() < iMo12797k2);
                return;
            }
            do {
                list.add(Long.valueOf(this.f158102a.mo12806t()));
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r = this.f158102a.mo12804r();
                }
            } while (iMo12804r == this.f158103b);
            iMo12804r2 = iMo12804r;
        }
        this.f158105d = iMo12804r2;
    }

    @Override // p149l.kbx0
    public final void zzB(List list) throws IOException {
        int iMo12804r;
        int iMo12804r2;
        boolean z = list instanceof j8x0;
        int i = this.f158103b;
        if (z) {
            j8x0 j8x0Var = (j8x0) list;
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo12805s = this.f158102a.mo12805s();
                m178217j(iMo12805s);
                int iMo12797k = this.f158102a.mo12797k() + iMo12805s;
                do {
                    j8x0Var.m140477c(this.f158102a.mo12796j());
                } while (this.f158102a.mo12797k() < iMo12797k);
                return;
            }
            if (i2 != 5) {
                throw zzhag.zza();
            }
            do {
                j8x0Var.m140477c(this.f158102a.mo12796j());
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r2 = this.f158102a.mo12804r();
                }
            } while (iMo12804r2 == this.f158103b);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iMo12805s2 = this.f158102a.mo12805s();
                m178217j(iMo12805s2);
                int iMo12797k2 = this.f158102a.mo12797k() + iMo12805s2;
                do {
                    list.add(Float.valueOf(this.f158102a.mo12796j()));
                } while (this.f158102a.mo12797k() < iMo12797k2);
                return;
            }
            if (i3 != 5) {
                throw zzhag.zza();
            }
            do {
                list.add(Float.valueOf(this.f158102a.mo12796j()));
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r = this.f158102a.mo12804r();
                }
            } while (iMo12804r == this.f158103b);
            iMo12804r2 = iMo12804r;
        }
        this.f158105d = iMo12804r2;
    }

    @Override // p149l.kbx0
    public final void zzD(List list) throws IOException {
        int iMo12804r;
        int iMo12804r2;
        boolean z = list instanceof q8x0;
        int i = this.f158103b;
        if (z) {
            q8x0 q8x0Var = (q8x0) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhag.zza();
                }
                q7x0 q7x0Var = this.f158102a;
                int iMo12797k = q7x0Var.mo12797k() + q7x0Var.mo12805s();
                do {
                    q8x0Var.zzh(this.f158102a.mo12801o());
                } while (this.f158102a.mo12797k() < iMo12797k);
                m178223h(iMo12797k);
                return;
            }
            do {
                q8x0Var.zzh(this.f158102a.mo12801o());
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r2 = this.f158102a.mo12804r();
                }
            } while (iMo12804r2 == this.f158103b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzhag.zza();
                }
                q7x0 q7x0Var2 = this.f158102a;
                int iMo12797k2 = q7x0Var2.mo12797k() + q7x0Var2.mo12805s();
                do {
                    list.add(Integer.valueOf(this.f158102a.mo12801o()));
                } while (this.f158102a.mo12797k() < iMo12797k2);
                m178223h(iMo12797k2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.f158102a.mo12801o()));
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r = this.f158102a.mo12804r();
                }
            } while (iMo12804r == this.f158103b);
            iMo12804r2 = iMo12804r;
        }
        this.f158105d = iMo12804r2;
    }

    @Override // p149l.kbx0
    public final void zzE(List list) throws IOException {
        int iMo12804r;
        int iMo12804r2;
        boolean z = list instanceof kax0;
        int i = this.f158103b;
        if (z) {
            kax0 kax0Var = (kax0) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhag.zza();
                }
                q7x0 q7x0Var = this.f158102a;
                int iMo12797k = q7x0Var.mo12797k() + q7x0Var.mo12805s();
                do {
                    kax0Var.m145191g(this.f158102a.mo12807u());
                } while (this.f158102a.mo12797k() < iMo12797k);
                m178223h(iMo12797k);
                return;
            }
            do {
                kax0Var.m145191g(this.f158102a.mo12807u());
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r2 = this.f158102a.mo12804r();
                }
            } while (iMo12804r2 == this.f158103b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzhag.zza();
                }
                q7x0 q7x0Var2 = this.f158102a;
                int iMo12797k2 = q7x0Var2.mo12797k() + q7x0Var2.mo12805s();
                do {
                    list.add(Long.valueOf(this.f158102a.mo12807u()));
                } while (this.f158102a.mo12797k() < iMo12797k2);
                m178223h(iMo12797k2);
                return;
            }
            do {
                list.add(Long.valueOf(this.f158102a.mo12807u()));
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r = this.f158102a.mo12804r();
                }
            } while (iMo12804r == this.f158103b);
            iMo12804r2 = iMo12804r;
        }
        this.f158105d = iMo12804r2;
    }

    @Override // p149l.kbx0
    public final void zzG(List list) throws IOException {
        int iMo12804r;
        int iMo12804r2;
        boolean z = list instanceof q8x0;
        int i = this.f158103b;
        if (z) {
            q8x0 q8x0Var = (q8x0) list;
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo12805s = this.f158102a.mo12805s();
                m178217j(iMo12805s);
                int iMo12797k = this.f158102a.mo12797k() + iMo12805s;
                do {
                    q8x0Var.zzh(this.f158102a.mo12802p());
                } while (this.f158102a.mo12797k() < iMo12797k);
                return;
            }
            if (i2 != 5) {
                throw zzhag.zza();
            }
            do {
                q8x0Var.zzh(this.f158102a.mo12802p());
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r2 = this.f158102a.mo12804r();
                }
            } while (iMo12804r2 == this.f158103b);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iMo12805s2 = this.f158102a.mo12805s();
                m178217j(iMo12805s2);
                int iMo12797k2 = this.f158102a.mo12797k() + iMo12805s2;
                do {
                    list.add(Integer.valueOf(this.f158102a.mo12802p()));
                } while (this.f158102a.mo12797k() < iMo12797k2);
                return;
            }
            if (i3 != 5) {
                throw zzhag.zza();
            }
            do {
                list.add(Integer.valueOf(this.f158102a.mo12802p()));
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r = this.f158102a.mo12804r();
                }
            } while (iMo12804r == this.f158103b);
            iMo12804r2 = iMo12804r;
        }
        this.f158105d = iMo12804r2;
    }

    @Override // p149l.kbx0
    public final void zzH(List list) throws IOException {
        int iMo12804r;
        int iMo12804r2;
        boolean z = list instanceof kax0;
        int i = this.f158103b;
        if (z) {
            kax0 kax0Var = (kax0) list;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zzhag.zza();
                }
                int iMo12805s = this.f158102a.mo12805s();
                m178218k(iMo12805s);
                int iMo12797k = this.f158102a.mo12797k() + iMo12805s;
                do {
                    kax0Var.m145191g(this.f158102a.mo12808v());
                } while (this.f158102a.mo12797k() < iMo12797k);
                return;
            }
            do {
                kax0Var.m145191g(this.f158102a.mo12808v());
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r2 = this.f158102a.mo12804r();
                }
            } while (iMo12804r2 == this.f158103b);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw zzhag.zza();
                }
                int iMo12805s2 = this.f158102a.mo12805s();
                m178218k(iMo12805s2);
                int iMo12797k2 = this.f158102a.mo12797k() + iMo12805s2;
                do {
                    list.add(Long.valueOf(this.f158102a.mo12808v()));
                } while (this.f158102a.mo12797k() < iMo12797k2);
                return;
            }
            do {
                list.add(Long.valueOf(this.f158102a.mo12808v()));
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r = this.f158102a.mo12804r();
                }
            } while (iMo12804r == this.f158103b);
            iMo12804r2 = iMo12804r;
        }
        this.f158105d = iMo12804r2;
    }

    @Override // p149l.kbx0
    public final void zzI(List list) throws IOException {
        int iMo12804r;
        int iMo12804r2;
        boolean z = list instanceof q8x0;
        int i = this.f158103b;
        if (z) {
            q8x0 q8x0Var = (q8x0) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhag.zza();
                }
                q7x0 q7x0Var = this.f158102a;
                int iMo12797k = q7x0Var.mo12797k() + q7x0Var.mo12805s();
                do {
                    q8x0Var.zzh(this.f158102a.mo12803q());
                } while (this.f158102a.mo12797k() < iMo12797k);
                m178223h(iMo12797k);
                return;
            }
            do {
                q8x0Var.zzh(this.f158102a.mo12803q());
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r2 = this.f158102a.mo12804r();
                }
            } while (iMo12804r2 == this.f158103b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzhag.zza();
                }
                q7x0 q7x0Var2 = this.f158102a;
                int iMo12797k2 = q7x0Var2.mo12797k() + q7x0Var2.mo12805s();
                do {
                    list.add(Integer.valueOf(this.f158102a.mo12803q()));
                } while (this.f158102a.mo12797k() < iMo12797k2);
                m178223h(iMo12797k2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.f158102a.mo12803q()));
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r = this.f158102a.mo12804r();
                }
            } while (iMo12804r == this.f158103b);
            iMo12804r2 = iMo12804r;
        }
        this.f158105d = iMo12804r2;
    }

    @Override // p149l.kbx0
    public final void zzJ(List list) throws IOException {
        int iMo12804r;
        int iMo12804r2;
        boolean z = list instanceof kax0;
        int i = this.f158103b;
        if (z) {
            kax0 kax0Var = (kax0) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhag.zza();
                }
                q7x0 q7x0Var = this.f158102a;
                int iMo12797k = q7x0Var.mo12797k() + q7x0Var.mo12805s();
                do {
                    kax0Var.m145191g(this.f158102a.mo12809w());
                } while (this.f158102a.mo12797k() < iMo12797k);
                m178223h(iMo12797k);
                return;
            }
            do {
                kax0Var.m145191g(this.f158102a.mo12809w());
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r2 = this.f158102a.mo12804r();
                }
            } while (iMo12804r2 == this.f158103b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzhag.zza();
                }
                q7x0 q7x0Var2 = this.f158102a;
                int iMo12797k2 = q7x0Var2.mo12797k() + q7x0Var2.mo12805s();
                do {
                    list.add(Long.valueOf(this.f158102a.mo12809w()));
                } while (this.f158102a.mo12797k() < iMo12797k2);
                m178223h(iMo12797k2);
                return;
            }
            do {
                list.add(Long.valueOf(this.f158102a.mo12809w()));
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r = this.f158102a.mo12804r();
                }
            } while (iMo12804r == this.f158103b);
            iMo12804r2 = iMo12804r;
        }
        this.f158105d = iMo12804r2;
    }

    @Override // p149l.kbx0
    public final void zzL(List list) throws IOException {
        int iMo12804r;
        int iMo12804r2;
        boolean z = list instanceof q8x0;
        int i = this.f158103b;
        if (z) {
            q8x0 q8x0Var = (q8x0) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhag.zza();
                }
                q7x0 q7x0Var = this.f158102a;
                int iMo12797k = q7x0Var.mo12797k() + q7x0Var.mo12805s();
                do {
                    q8x0Var.zzh(this.f158102a.mo12805s());
                } while (this.f158102a.mo12797k() < iMo12797k);
                m178223h(iMo12797k);
                return;
            }
            do {
                q8x0Var.zzh(this.f158102a.mo12805s());
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r2 = this.f158102a.mo12804r();
                }
            } while (iMo12804r2 == this.f158103b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzhag.zza();
                }
                q7x0 q7x0Var2 = this.f158102a;
                int iMo12797k2 = q7x0Var2.mo12797k() + q7x0Var2.mo12805s();
                do {
                    list.add(Integer.valueOf(this.f158102a.mo12805s()));
                } while (this.f158102a.mo12797k() < iMo12797k2);
                m178223h(iMo12797k2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.f158102a.mo12805s()));
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r = this.f158102a.mo12804r();
                }
            } while (iMo12804r == this.f158103b);
            iMo12804r2 = iMo12804r;
        }
        this.f158105d = iMo12804r2;
    }

    @Override // p149l.kbx0
    public final void zzM(List list) throws IOException {
        int iMo12804r;
        int iMo12804r2;
        boolean z = list instanceof kax0;
        int i = this.f158103b;
        if (z) {
            kax0 kax0Var = (kax0) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhag.zza();
                }
                q7x0 q7x0Var = this.f158102a;
                int iMo12797k = q7x0Var.mo12797k() + q7x0Var.mo12805s();
                do {
                    kax0Var.m145191g(this.f158102a.mo12810x());
                } while (this.f158102a.mo12797k() < iMo12797k);
                m178223h(iMo12797k);
                return;
            }
            do {
                kax0Var.m145191g(this.f158102a.mo12810x());
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r2 = this.f158102a.mo12804r();
                }
            } while (iMo12804r2 == this.f158103b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzhag.zza();
                }
                q7x0 q7x0Var2 = this.f158102a;
                int iMo12797k2 = q7x0Var2.mo12797k() + q7x0Var2.mo12805s();
                do {
                    list.add(Long.valueOf(this.f158102a.mo12810x()));
                } while (this.f158102a.mo12797k() < iMo12797k2);
                m178223h(iMo12797k2);
                return;
            }
            do {
                list.add(Long.valueOf(this.f158102a.mo12810x()));
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r = this.f158102a.mo12804r();
                }
            } while (iMo12804r == this.f158103b);
            iMo12804r2 = iMo12804r;
        }
        this.f158105d = iMo12804r2;
    }

    @Override // p149l.kbx0
    public final boolean zzN() throws IOException {
        m178224i(0);
        return this.f158102a.mo12793c();
    }

    @Override // p149l.kbx0
    public final boolean zzO() throws IOException {
        int i;
        if (this.f158102a.mo12792b() || (i = this.f158103b) == this.f158104c) {
            return false;
        }
        return this.f158102a.mo12794d(i);
    }

    @Override // p149l.kbx0
    public final double zza() throws IOException {
        m178224i(1);
        return this.f158102a.mo12795i();
    }

    @Override // p149l.kbx0
    public final float zzb() throws IOException {
        m178224i(5);
        return this.f158102a.mo12796j();
    }

    @Override // p149l.kbx0
    public final int zzc() throws IOException {
        int iMo12804r = this.f158105d;
        if (iMo12804r != 0) {
            this.f158103b = iMo12804r;
            this.f158105d = 0;
        } else {
            iMo12804r = this.f158102a.mo12804r();
            this.f158103b = iMo12804r;
        }
        return (iMo12804r == 0 || iMo12804r == this.f158104c) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : iMo12804r >>> 3;
    }

    @Override // p149l.kbx0
    public final int zzd() {
        return this.f158103b;
    }

    @Override // p149l.kbx0
    public final int zze() throws IOException {
        m178224i(0);
        return this.f158102a.mo12799m();
    }

    @Override // p149l.kbx0
    public final int zzf() throws IOException {
        m178224i(5);
        return this.f158102a.mo12800n();
    }

    @Override // p149l.kbx0
    public final int zzg() throws IOException {
        m178224i(0);
        return this.f158102a.mo12801o();
    }

    @Override // p149l.kbx0
    public final int zzh() throws IOException {
        m178224i(5);
        return this.f158102a.mo12802p();
    }

    @Override // p149l.kbx0
    public final int zzi() throws IOException {
        m178224i(0);
        return this.f158102a.mo12803q();
    }

    @Override // p149l.kbx0
    public final int zzj() throws IOException {
        m178224i(0);
        return this.f158102a.mo12805s();
    }

    @Override // p149l.kbx0
    public final long zzk() throws IOException {
        m178224i(1);
        return this.f158102a.mo12806t();
    }

    @Override // p149l.kbx0
    public final long zzl() throws IOException {
        m178224i(0);
        return this.f158102a.mo12807u();
    }

    @Override // p149l.kbx0
    public final long zzm() throws IOException {
        m178224i(1);
        return this.f158102a.mo12808v();
    }

    @Override // p149l.kbx0
    public final long zzn() throws IOException {
        m178224i(0);
        return this.f158102a.mo12809w();
    }

    @Override // p149l.kbx0
    public final long zzo() throws IOException {
        m178224i(0);
        return this.f158102a.mo12810x();
    }

    @Override // p149l.kbx0
    public final zzgyl zzp() throws IOException {
        m178224i(2);
        return this.f158102a.mo12811y();
    }

    @Override // p149l.kbx0
    public final String zzr() throws IOException {
        m178224i(2);
        return this.f158102a.mo12812z();
    }

    @Override // p149l.kbx0
    public final String zzs() throws IOException {
        m178224i(2);
        return this.f158102a.mo12781A();
    }

    @Override // p149l.kbx0
    public final void zzv(List list) throws IOException {
        int iMo12804r;
        int iMo12804r2;
        boolean z = list instanceof z6x0;
        int i = this.f158103b;
        if (z) {
            z6x0 z6x0Var = (z6x0) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhag.zza();
                }
                q7x0 q7x0Var = this.f158102a;
                int iMo12797k = q7x0Var.mo12797k() + q7x0Var.mo12805s();
                do {
                    z6x0Var.m217422c(this.f158102a.mo12793c());
                } while (this.f158102a.mo12797k() < iMo12797k);
                m178223h(iMo12797k);
                return;
            }
            do {
                z6x0Var.m217422c(this.f158102a.mo12793c());
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r2 = this.f158102a.mo12804r();
                }
            } while (iMo12804r2 == this.f158103b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzhag.zza();
                }
                q7x0 q7x0Var2 = this.f158102a;
                int iMo12797k2 = q7x0Var2.mo12797k() + q7x0Var2.mo12805s();
                do {
                    list.add(Boolean.valueOf(this.f158102a.mo12793c()));
                } while (this.f158102a.mo12797k() < iMo12797k2);
                m178223h(iMo12797k2);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.f158102a.mo12793c()));
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r = this.f158102a.mo12804r();
                }
            } while (iMo12804r == this.f158103b);
            iMo12804r2 = iMo12804r;
        }
        this.f158105d = iMo12804r2;
    }

    @Override // p149l.kbx0
    public final void zzw(List list) throws IOException {
        int iMo12804r;
        if ((this.f158103b & 7) != 2) {
            throw zzhag.zza();
        }
        do {
            list.add(zzp());
            if (this.f158102a.mo12792b()) {
                return;
            } else {
                iMo12804r = this.f158102a.mo12804r();
            }
        } while (iMo12804r == this.f158103b);
        this.f158105d = iMo12804r;
    }

    @Override // p149l.kbx0
    public final void zzx(List list) throws IOException {
        int iMo12804r;
        int iMo12804r2;
        boolean z = list instanceof a8x0;
        int i = this.f158103b;
        if (z) {
            a8x0 a8x0Var = (a8x0) list;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zzhag.zza();
                }
                int iMo12805s = this.f158102a.mo12805s();
                m178218k(iMo12805s);
                int iMo12797k = this.f158102a.mo12797k() + iMo12805s;
                do {
                    a8x0Var.m95387c(this.f158102a.mo12795i());
                } while (this.f158102a.mo12797k() < iMo12797k);
                return;
            }
            do {
                a8x0Var.m95387c(this.f158102a.mo12795i());
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r2 = this.f158102a.mo12804r();
                }
            } while (iMo12804r2 == this.f158103b);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw zzhag.zza();
                }
                int iMo12805s2 = this.f158102a.mo12805s();
                m178218k(iMo12805s2);
                int iMo12797k2 = this.f158102a.mo12797k() + iMo12805s2;
                do {
                    list.add(Double.valueOf(this.f158102a.mo12795i()));
                } while (this.f158102a.mo12797k() < iMo12797k2);
                return;
            }
            do {
                list.add(Double.valueOf(this.f158102a.mo12795i()));
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r = this.f158102a.mo12804r();
                }
            } while (iMo12804r == this.f158103b);
            iMo12804r2 = iMo12804r;
        }
        this.f158105d = iMo12804r2;
    }

    @Override // p149l.kbx0
    public final void zzy(List list) throws IOException {
        int iMo12804r;
        int iMo12804r2;
        boolean z = list instanceof q8x0;
        int i = this.f158103b;
        if (z) {
            q8x0 q8x0Var = (q8x0) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhag.zza();
                }
                q7x0 q7x0Var = this.f158102a;
                int iMo12797k = q7x0Var.mo12797k() + q7x0Var.mo12805s();
                do {
                    q8x0Var.zzh(this.f158102a.mo12799m());
                } while (this.f158102a.mo12797k() < iMo12797k);
                m178223h(iMo12797k);
                return;
            }
            do {
                q8x0Var.zzh(this.f158102a.mo12799m());
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r2 = this.f158102a.mo12804r();
                }
            } while (iMo12804r2 == this.f158103b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzhag.zza();
                }
                q7x0 q7x0Var2 = this.f158102a;
                int iMo12797k2 = q7x0Var2.mo12797k() + q7x0Var2.mo12805s();
                do {
                    list.add(Integer.valueOf(this.f158102a.mo12799m()));
                } while (this.f158102a.mo12797k() < iMo12797k2);
                m178223h(iMo12797k2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.f158102a.mo12799m()));
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r = this.f158102a.mo12804r();
                }
            } while (iMo12804r == this.f158103b);
            iMo12804r2 = iMo12804r;
        }
        this.f158105d = iMo12804r2;
    }

    @Override // p149l.kbx0
    public final void zzz(List list) throws IOException {
        int iMo12804r;
        int iMo12804r2;
        boolean z = list instanceof q8x0;
        int i = this.f158103b;
        if (z) {
            q8x0 q8x0Var = (q8x0) list;
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo12805s = this.f158102a.mo12805s();
                m178217j(iMo12805s);
                int iMo12797k = this.f158102a.mo12797k() + iMo12805s;
                do {
                    q8x0Var.zzh(this.f158102a.mo12800n());
                } while (this.f158102a.mo12797k() < iMo12797k);
                return;
            }
            if (i2 != 5) {
                throw zzhag.zza();
            }
            do {
                q8x0Var.zzh(this.f158102a.mo12800n());
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r2 = this.f158102a.mo12804r();
                }
            } while (iMo12804r2 == this.f158103b);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iMo12805s2 = this.f158102a.mo12805s();
                m178217j(iMo12805s2);
                int iMo12797k2 = this.f158102a.mo12797k() + iMo12805s2;
                do {
                    list.add(Integer.valueOf(this.f158102a.mo12800n()));
                } while (this.f158102a.mo12797k() < iMo12797k2);
                return;
            }
            if (i3 != 5) {
                throw zzhag.zza();
            }
            do {
                list.add(Integer.valueOf(this.f158102a.mo12800n()));
                if (this.f158102a.mo12792b()) {
                    return;
                } else {
                    iMo12804r = this.f158102a.mo12804r();
                }
            } while (iMo12804r == this.f158103b);
            iMo12804r2 = iMo12804r;
        }
        this.f158105d = iMo12804r2;
    }
}
