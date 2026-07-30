package p153l;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.measurement.C2368s0;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzkb;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class azx0 implements zby0 {

    /* JADX INFO: renamed from: a */
    public final nxx0 f74199a;

    /* JADX INFO: renamed from: b */
    public int f74200b;

    /* JADX INFO: renamed from: c */
    public int f74201c;

    /* JADX INFO: renamed from: d */
    public int f74202d = 0;

    public azx0(nxx0 nxx0Var) {
        nxx0 nxx0Var2 = (nxx0) i2y0.m138254f(nxx0Var, "input");
        this.f74199a = nxx0Var2;
        nxx0Var2.f144277c = this;
    }

    /* JADX INFO: renamed from: B */
    public static void m101097B(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzkb.zzg();
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m101098D(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzkb.zzg();
        }
    }

    /* JADX INFO: renamed from: w */
    public static azx0 m101099w(nxx0 nxx0Var) {
        azx0 azx0Var = nxx0Var.f144277c;
        return azx0Var != null ? azx0Var : new azx0(nxx0Var);
    }

    /* JADX INFO: renamed from: A */
    public final void m101100A(int i) throws IOException {
        if ((this.f74200b & 7) != i) {
            throw zzkb.zza();
        }
    }

    /* JADX INFO: renamed from: C */
    public final <T> void m101101C(T t, ocy0<T> ocy0Var, C2368s0 c2368s0) throws IOException {
        int i = this.f74201c;
        this.f74201c = ((this.f74200b >>> 3) << 3) | 4;
        try {
            ocy0Var.mo14513d(t, this, c2368s0);
            if (this.f74200b != this.f74201c) {
                throw zzkb.zzg();
            }
            this.f74201c = i;
        } catch (Throwable th) {
            this.f74201c = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: E */
    public final <T> void m101102E(T t, ocy0<T> ocy0Var, C2368s0 c2368s0) throws IOException {
        int iMo123322q = this.f74199a.mo123322q();
        nxx0 nxx0Var = this.f74199a;
        if (nxx0Var.f144275a >= nxx0Var.f144276b) {
            throw zzkb.zzh();
        }
        int iMo123311f = nxx0Var.mo123311f(iMo123322q);
        this.f74199a.f144275a++;
        ocy0Var.mo14513d(t, this, c2368s0);
        this.f74199a.mo123313h(0);
        nxx0 nxx0Var2 = this.f74199a;
        nxx0Var2.f144275a--;
        nxx0Var2.mo123315j(iMo123311f);
    }

    @Override // p153l.zby0
    /* JADX INFO: renamed from: a */
    public final String mo101103a() throws IOException {
        m101100A(2);
        return this.f74199a.mo123330y();
    }

    @Override // p153l.zby0
    /* JADX INFO: renamed from: b */
    public final void mo101104b(List<Integer> list) throws IOException {
        int iMo123321p;
        int iMo123321p2;
        boolean z = list instanceof m2y0;
        int i = this.f74200b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f74199a.mo123322q()));
                    if (this.f74199a.mo123300A()) {
                        return;
                    } else {
                        iMo123321p = this.f74199a.mo123321p();
                    }
                } while (iMo123321p == this.f74200b);
                this.f74202d = iMo123321p;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iMo123312g = this.f74199a.mo123312g() + this.f74199a.mo123322q();
            do {
                list.add(Integer.valueOf(this.f74199a.mo123322q()));
            } while (this.f74199a.mo123312g() < iMo123312g);
            m101127x(iMo123312g);
            return;
        }
        m2y0 m2y0Var = (m2y0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                m2y0Var.m156912g(this.f74199a.mo123322q());
                if (this.f74199a.mo123300A()) {
                    return;
                } else {
                    iMo123321p2 = this.f74199a.mo123321p();
                }
            } while (iMo123321p2 == this.f74200b);
            this.f74202d = iMo123321p2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iMo123312g2 = this.f74199a.mo123312g() + this.f74199a.mo123322q();
        do {
            m2y0Var.m156912g(this.f74199a.mo123322q());
        } while (this.f74199a.mo123312g() < iMo123312g2);
        m101127x(iMo123312g2);
    }

    @Override // p153l.zby0
    /* JADX INFO: renamed from: c */
    public final void mo101105c(List<Long> list) throws IOException {
        int iMo123321p;
        int iMo123321p2;
        boolean z = list instanceof f6y0;
        int i = this.f74200b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f74199a.mo123324s()));
                    if (this.f74199a.mo123300A()) {
                        return;
                    } else {
                        iMo123321p = this.f74199a.mo123321p();
                    }
                } while (iMo123321p == this.f74200b);
                this.f74202d = iMo123321p;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iMo123312g = this.f74199a.mo123312g() + this.f74199a.mo123322q();
            do {
                list.add(Long.valueOf(this.f74199a.mo123324s()));
            } while (this.f74199a.mo123312g() < iMo123312g);
            m101127x(iMo123312g);
            return;
        }
        f6y0 f6y0Var = (f6y0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                f6y0Var.m124332c(this.f74199a.mo123324s());
                if (this.f74199a.mo123300A()) {
                    return;
                } else {
                    iMo123321p2 = this.f74199a.mo123321p();
                }
            } while (iMo123321p2 == this.f74200b);
            this.f74202d = iMo123321p2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iMo123312g2 = this.f74199a.mo123312g() + this.f74199a.mo123322q();
        do {
            f6y0Var.m124332c(this.f74199a.mo123324s());
        } while (this.f74199a.mo123312g() < iMo123312g2);
        m101127x(iMo123312g2);
    }

    @Override // p153l.zby0
    /* JADX INFO: renamed from: d */
    public final void mo101106d(List<String> list) throws IOException {
        m101128y(list, true);
    }

    @Override // p153l.zby0
    /* JADX INFO: renamed from: e */
    public final void mo101107e(List<Long> list) throws IOException {
        int iMo123321p;
        int iMo123321p2;
        boolean z = list instanceof f6y0;
        int i = this.f74200b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f74199a.mo123328w()));
                    if (this.f74199a.mo123300A()) {
                        return;
                    } else {
                        iMo123321p = this.f74199a.mo123321p();
                    }
                } while (iMo123321p == this.f74200b);
                this.f74202d = iMo123321p;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iMo123312g = this.f74199a.mo123312g() + this.f74199a.mo123322q();
            do {
                list.add(Long.valueOf(this.f74199a.mo123328w()));
            } while (this.f74199a.mo123312g() < iMo123312g);
            m101127x(iMo123312g);
            return;
        }
        f6y0 f6y0Var = (f6y0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                f6y0Var.m124332c(this.f74199a.mo123328w());
                if (this.f74199a.mo123300A()) {
                    return;
                } else {
                    iMo123321p2 = this.f74199a.mo123321p();
                }
            } while (iMo123321p2 == this.f74200b);
            this.f74202d = iMo123321p2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iMo123312g2 = this.f74199a.mo123312g() + this.f74199a.mo123322q();
        do {
            f6y0Var.m124332c(this.f74199a.mo123328w());
        } while (this.f74199a.mo123312g() < iMo123312g2);
        m101127x(iMo123312g2);
    }

    @Override // p153l.zby0
    /* JADX INFO: renamed from: f */
    public final void mo101108f(List<Integer> list) throws IOException {
        int iMo123321p;
        int iMo123321p2;
        boolean z = list instanceof m2y0;
        int i = this.f74200b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f74199a.mo123320o()));
                    if (this.f74199a.mo123300A()) {
                        return;
                    } else {
                        iMo123321p = this.f74199a.mo123321p();
                    }
                } while (iMo123321p == this.f74200b);
                this.f74202d = iMo123321p;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iMo123312g = this.f74199a.mo123312g() + this.f74199a.mo123322q();
            do {
                list.add(Integer.valueOf(this.f74199a.mo123320o()));
            } while (this.f74199a.mo123312g() < iMo123312g);
            m101127x(iMo123312g);
            return;
        }
        m2y0 m2y0Var = (m2y0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                m2y0Var.m156912g(this.f74199a.mo123320o());
                if (this.f74199a.mo123300A()) {
                    return;
                } else {
                    iMo123321p2 = this.f74199a.mo123321p();
                }
            } while (iMo123321p2 == this.f74200b);
            this.f74202d = iMo123321p2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iMo123312g2 = this.f74199a.mo123312g() + this.f74199a.mo123322q();
        do {
            m2y0Var.m156912g(this.f74199a.mo123320o());
        } while (this.f74199a.mo123312g() < iMo123312g2);
        m101127x(iMo123312g2);
    }

    @Override // p153l.zby0
    /* JADX INFO: renamed from: g */
    public final <K, V> void mo101109g(Map<K, V> map, h7y0<K, V> h7y0Var, C2368s0 c2368s0) throws IOException {
        m101100A(2);
        this.f74199a.mo123311f(this.f74199a.mo123322q());
        throw null;
    }

    @Override // p153l.zby0
    /* JADX INFO: renamed from: h */
    public final void mo101110h(List<Long> list) throws IOException {
        int iMo123321p;
        int iMo123321p2;
        boolean z = list instanceof f6y0;
        int i = this.f74200b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f74199a.mo123326u()));
                    if (this.f74199a.mo123300A()) {
                        return;
                    } else {
                        iMo123321p = this.f74199a.mo123321p();
                    }
                } while (iMo123321p == this.f74200b);
                this.f74202d = iMo123321p;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iMo123322q = this.f74199a.mo123322q();
            m101098D(iMo123322q);
            int iMo123312g = this.f74199a.mo123312g() + iMo123322q;
            do {
                list.add(Long.valueOf(this.f74199a.mo123326u()));
            } while (this.f74199a.mo123312g() < iMo123312g);
            return;
        }
        f6y0 f6y0Var = (f6y0) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                f6y0Var.m124332c(this.f74199a.mo123326u());
                if (this.f74199a.mo123300A()) {
                    return;
                } else {
                    iMo123321p2 = this.f74199a.mo123321p();
                }
            } while (iMo123321p2 == this.f74200b);
            this.f74202d = iMo123321p2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iMo123322q2 = this.f74199a.mo123322q();
        m101098D(iMo123322q2);
        int iMo123312g2 = this.f74199a.mo123312g() + iMo123322q2;
        do {
            f6y0Var.m124332c(this.f74199a.mo123326u());
        } while (this.f74199a.mo123312g() < iMo123312g2);
    }

    @Override // p153l.zby0
    /* JADX INFO: renamed from: h0 */
    public final void mo101111h0(List<Long> list) throws IOException {
        int iMo123321p;
        int iMo123321p2;
        boolean z = list instanceof f6y0;
        int i = this.f74200b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f74199a.mo123323r()));
                    if (this.f74199a.mo123300A()) {
                        return;
                    } else {
                        iMo123321p = this.f74199a.mo123321p();
                    }
                } while (iMo123321p == this.f74200b);
                this.f74202d = iMo123321p;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iMo123322q = this.f74199a.mo123322q();
            m101098D(iMo123322q);
            int iMo123312g = this.f74199a.mo123312g() + iMo123322q;
            do {
                list.add(Long.valueOf(this.f74199a.mo123323r()));
            } while (this.f74199a.mo123312g() < iMo123312g);
            return;
        }
        f6y0 f6y0Var = (f6y0) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                f6y0Var.m124332c(this.f74199a.mo123323r());
                if (this.f74199a.mo123300A()) {
                    return;
                } else {
                    iMo123321p2 = this.f74199a.mo123321p();
                }
            } while (iMo123321p2 == this.f74200b);
            this.f74202d = iMo123321p2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iMo123322q2 = this.f74199a.mo123322q();
        m101098D(iMo123322q2);
        int iMo123312g2 = this.f74199a.mo123312g() + iMo123322q2;
        do {
            f6y0Var.m124332c(this.f74199a.mo123323r());
        } while (this.f74199a.mo123312g() < iMo123312g2);
    }

    @Override // p153l.zby0
    /* JADX INFO: renamed from: i */
    public final void mo101112i(List<String> list) throws IOException {
        m101128y(list, false);
    }

    @Override // p153l.zby0
    /* JADX INFO: renamed from: j */
    public final void mo101113j(List<Long> list) throws IOException {
        int iMo123321p;
        int iMo123321p2;
        boolean z = list instanceof f6y0;
        int i = this.f74200b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f74199a.mo123327v()));
                    if (this.f74199a.mo123300A()) {
                        return;
                    } else {
                        iMo123321p = this.f74199a.mo123321p();
                    }
                } while (iMo123321p == this.f74200b);
                this.f74202d = iMo123321p;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iMo123312g = this.f74199a.mo123312g() + this.f74199a.mo123322q();
            do {
                list.add(Long.valueOf(this.f74199a.mo123327v()));
            } while (this.f74199a.mo123312g() < iMo123312g);
            m101127x(iMo123312g);
            return;
        }
        f6y0 f6y0Var = (f6y0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                f6y0Var.m124332c(this.f74199a.mo123327v());
                if (this.f74199a.mo123300A()) {
                    return;
                } else {
                    iMo123321p2 = this.f74199a.mo123321p();
                }
            } while (iMo123321p2 == this.f74200b);
            this.f74202d = iMo123321p2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iMo123312g2 = this.f74199a.mo123312g() + this.f74199a.mo123322q();
        do {
            f6y0Var.m124332c(this.f74199a.mo123327v());
        } while (this.f74199a.mo123312g() < iMo123312g2);
        m101127x(iMo123312g2);
    }

    @Override // p153l.zby0
    /* JADX INFO: renamed from: k */
    public final void mo101114k(List<Integer> list) throws IOException {
        int iMo123321p;
        int iMo123321p2;
        boolean z = list instanceof m2y0;
        int i = this.f74200b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f74199a.mo123318m()));
                    if (this.f74199a.mo123300A()) {
                        return;
                    } else {
                        iMo123321p = this.f74199a.mo123321p();
                    }
                } while (iMo123321p == this.f74200b);
                this.f74202d = iMo123321p;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iMo123312g = this.f74199a.mo123312g() + this.f74199a.mo123322q();
            do {
                list.add(Integer.valueOf(this.f74199a.mo123318m()));
            } while (this.f74199a.mo123312g() < iMo123312g);
            m101127x(iMo123312g);
            return;
        }
        m2y0 m2y0Var = (m2y0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                m2y0Var.m156912g(this.f74199a.mo123318m());
                if (this.f74199a.mo123300A()) {
                    return;
                } else {
                    iMo123321p2 = this.f74199a.mo123321p();
                }
            } while (iMo123321p2 == this.f74200b);
            this.f74202d = iMo123321p2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iMo123312g2 = this.f74199a.mo123312g() + this.f74199a.mo123322q();
        do {
            m2y0Var.m156912g(this.f74199a.mo123318m());
        } while (this.f74199a.mo123312g() < iMo123312g2);
        m101127x(iMo123312g2);
    }

    @Override // p153l.zby0
    /* JADX INFO: renamed from: l */
    public final void mo101115l(List<Float> list) throws IOException {
        int iMo123321p;
        int iMo123321p2;
        boolean z = list instanceof x1y0;
        int i = this.f74200b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo123322q = this.f74199a.mo123322q();
                m101097B(iMo123322q);
                int iMo123312g = this.f74199a.mo123312g() + iMo123322q;
                do {
                    list.add(Float.valueOf(this.f74199a.mo123310e()));
                } while (this.f74199a.mo123312g() < iMo123312g);
                return;
            }
            if (i2 != 5) {
                throw zzkb.zza();
            }
            do {
                list.add(Float.valueOf(this.f74199a.mo123310e()));
                if (this.f74199a.mo123300A()) {
                    return;
                } else {
                    iMo123321p = this.f74199a.mo123321p();
                }
            } while (iMo123321p == this.f74200b);
            this.f74202d = iMo123321p;
            return;
        }
        x1y0 x1y0Var = (x1y0) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo123322q2 = this.f74199a.mo123322q();
            m101097B(iMo123322q2);
            int iMo123312g2 = this.f74199a.mo123312g() + iMo123322q2;
            do {
                x1y0Var.m209119c(this.f74199a.mo123310e());
            } while (this.f74199a.mo123312g() < iMo123312g2);
            return;
        }
        if (i3 != 5) {
            throw zzkb.zza();
        }
        do {
            x1y0Var.m209119c(this.f74199a.mo123310e());
            if (this.f74199a.mo123300A()) {
                return;
            } else {
                iMo123321p2 = this.f74199a.mo123321p();
            }
        } while (iMo123321p2 == this.f74200b);
        this.f74202d = iMo123321p2;
    }

    @Override // p153l.zby0
    /* JADX INFO: renamed from: m */
    public final void mo101116m(List<Integer> list) throws IOException {
        int iMo123321p;
        int iMo123321p2;
        boolean z = list instanceof m2y0;
        int i = this.f74200b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo123322q = this.f74199a.mo123322q();
                m101097B(iMo123322q);
                int iMo123312g = this.f74199a.mo123312g() + iMo123322q;
                do {
                    list.add(Integer.valueOf(this.f74199a.mo123319n()));
                } while (this.f74199a.mo123312g() < iMo123312g);
                return;
            }
            if (i2 != 5) {
                throw zzkb.zza();
            }
            do {
                list.add(Integer.valueOf(this.f74199a.mo123319n()));
                if (this.f74199a.mo123300A()) {
                    return;
                } else {
                    iMo123321p = this.f74199a.mo123321p();
                }
            } while (iMo123321p == this.f74200b);
            this.f74202d = iMo123321p;
            return;
        }
        m2y0 m2y0Var = (m2y0) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo123322q2 = this.f74199a.mo123322q();
            m101097B(iMo123322q2);
            int iMo123312g2 = this.f74199a.mo123312g() + iMo123322q2;
            do {
                m2y0Var.m156912g(this.f74199a.mo123319n());
            } while (this.f74199a.mo123312g() < iMo123312g2);
            return;
        }
        if (i3 != 5) {
            throw zzkb.zza();
        }
        do {
            m2y0Var.m156912g(this.f74199a.mo123319n());
            if (this.f74199a.mo123300A()) {
                return;
            } else {
                iMo123321p2 = this.f74199a.mo123321p();
            }
        } while (iMo123321p2 == this.f74200b);
        this.f74202d = iMo123321p2;
    }

    @Override // p153l.zby0
    /* JADX INFO: renamed from: m0 */
    public final void mo101117m0(List<zzik> list) throws IOException {
        int iMo123321p;
        if ((this.f74200b & 7) != 2) {
            throw zzkb.zza();
        }
        do {
            list.add(zzp());
            if (this.f74199a.mo123300A()) {
                return;
            } else {
                iMo123321p = this.f74199a.mo123321p();
            }
        } while (iMo123321p == this.f74200b);
        this.f74202d = iMo123321p;
    }

    @Override // p153l.zby0
    /* JADX INFO: renamed from: n */
    public final <T> void mo101118n(T t, ocy0<T> ocy0Var, C2368s0 c2368s0) throws IOException {
        m101100A(2);
        m101102E(t, ocy0Var, c2368s0);
    }

    @Override // p153l.zby0
    /* JADX INFO: renamed from: o */
    public final <T> void mo101119o(T t, ocy0<T> ocy0Var, C2368s0 c2368s0) throws IOException {
        m101100A(3);
        m101101C(t, ocy0Var, c2368s0);
    }

    @Override // p153l.zby0
    /* JADX INFO: renamed from: p */
    public final void mo101120p(List<Double> list) throws IOException {
        int iMo123321p;
        int iMo123321p2;
        boolean z = list instanceof ozx0;
        int i = this.f74200b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f74199a.mo123309a()));
                    if (this.f74199a.mo123300A()) {
                        return;
                    } else {
                        iMo123321p = this.f74199a.mo123321p();
                    }
                } while (iMo123321p == this.f74200b);
                this.f74202d = iMo123321p;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iMo123322q = this.f74199a.mo123322q();
            m101098D(iMo123322q);
            int iMo123312g = this.f74199a.mo123312g() + iMo123322q;
            do {
                list.add(Double.valueOf(this.f74199a.mo123309a()));
            } while (this.f74199a.mo123312g() < iMo123312g);
            return;
        }
        ozx0 ozx0Var = (ozx0) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                ozx0Var.m170007c(this.f74199a.mo123309a());
                if (this.f74199a.mo123300A()) {
                    return;
                } else {
                    iMo123321p2 = this.f74199a.mo123321p();
                }
            } while (iMo123321p2 == this.f74200b);
            this.f74202d = iMo123321p2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iMo123322q2 = this.f74199a.mo123322q();
        m101098D(iMo123322q2);
        int iMo123312g2 = this.f74199a.mo123312g() + iMo123322q2;
        do {
            ozx0Var.m170007c(this.f74199a.mo123309a());
        } while (this.f74199a.mo123312g() < iMo123312g2);
    }

    @Override // p153l.zby0
    /* JADX INFO: renamed from: q */
    public final void mo101121q(List<Integer> list) throws IOException {
        int iMo123321p;
        int iMo123321p2;
        boolean z = list instanceof m2y0;
        int i = this.f74200b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo123322q = this.f74199a.mo123322q();
                m101097B(iMo123322q);
                int iMo123312g = this.f74199a.mo123312g() + iMo123322q;
                do {
                    list.add(Integer.valueOf(this.f74199a.mo123316k()));
                } while (this.f74199a.mo123312g() < iMo123312g);
                return;
            }
            if (i2 != 5) {
                throw zzkb.zza();
            }
            do {
                list.add(Integer.valueOf(this.f74199a.mo123316k()));
                if (this.f74199a.mo123300A()) {
                    return;
                } else {
                    iMo123321p = this.f74199a.mo123321p();
                }
            } while (iMo123321p == this.f74200b);
            this.f74202d = iMo123321p;
            return;
        }
        m2y0 m2y0Var = (m2y0) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo123322q2 = this.f74199a.mo123322q();
            m101097B(iMo123322q2);
            int iMo123312g2 = this.f74199a.mo123312g() + iMo123322q2;
            do {
                m2y0Var.m156912g(this.f74199a.mo123316k());
            } while (this.f74199a.mo123312g() < iMo123312g2);
            return;
        }
        if (i3 != 5) {
            throw zzkb.zza();
        }
        do {
            m2y0Var.m156912g(this.f74199a.mo123316k());
            if (this.f74199a.mo123300A()) {
                return;
            } else {
                iMo123321p2 = this.f74199a.mo123321p();
            }
        } while (iMo123321p2 == this.f74200b);
        this.f74202d = iMo123321p2;
    }

    @Override // p153l.zby0
    /* JADX INFO: renamed from: r */
    public final void mo101122r(List<Integer> list) throws IOException {
        int iMo123321p;
        int iMo123321p2;
        boolean z = list instanceof m2y0;
        int i = this.f74200b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f74199a.mo123314i()));
                    if (this.f74199a.mo123300A()) {
                        return;
                    } else {
                        iMo123321p = this.f74199a.mo123321p();
                    }
                } while (iMo123321p == this.f74200b);
                this.f74202d = iMo123321p;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iMo123312g = this.f74199a.mo123312g() + this.f74199a.mo123322q();
            do {
                list.add(Integer.valueOf(this.f74199a.mo123314i()));
            } while (this.f74199a.mo123312g() < iMo123312g);
            m101127x(iMo123312g);
            return;
        }
        m2y0 m2y0Var = (m2y0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                m2y0Var.m156912g(this.f74199a.mo123314i());
                if (this.f74199a.mo123300A()) {
                    return;
                } else {
                    iMo123321p2 = this.f74199a.mo123321p();
                }
            } while (iMo123321p2 == this.f74200b);
            this.f74202d = iMo123321p2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iMo123312g2 = this.f74199a.mo123312g() + this.f74199a.mo123322q();
        do {
            m2y0Var.m156912g(this.f74199a.mo123314i());
        } while (this.f74199a.mo123312g() < iMo123312g2);
        m101127x(iMo123312g2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.zby0
    @Deprecated
    /* JADX INFO: renamed from: s */
    public final <T> void mo101123s(List<T> list, ocy0<T> ocy0Var, C2368s0 c2368s0) throws IOException {
        int iMo123321p;
        int i = this.f74200b;
        if ((i & 7) != 3) {
            throw zzkb.zza();
        }
        do {
            list.add(m101126v(ocy0Var, c2368s0));
            if (this.f74199a.mo123300A() || this.f74202d != 0) {
                return;
            } else {
                iMo123321p = this.f74199a.mo123321p();
            }
        } while (iMo123321p == i);
        this.f74202d = iMo123321p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.zby0
    /* JADX INFO: renamed from: t */
    public final <T> void mo101124t(List<T> list, ocy0<T> ocy0Var, C2368s0 c2368s0) throws IOException {
        int iMo123321p;
        int i = this.f74200b;
        if ((i & 7) != 2) {
            throw zzkb.zza();
        }
        do {
            list.add(m101129z(ocy0Var, c2368s0));
            if (this.f74199a.mo123300A() || this.f74202d != 0) {
                return;
            } else {
                iMo123321p = this.f74199a.mo123321p();
            }
        } while (iMo123321p == i);
        this.f74202d = iMo123321p;
    }

    @Override // p153l.zby0
    /* JADX INFO: renamed from: u */
    public final void mo101125u(List<Boolean> list) throws IOException {
        int iMo123321p;
        int iMo123321p2;
        boolean z = list instanceof fvx0;
        int i = this.f74200b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f74199a.mo123301B()));
                    if (this.f74199a.mo123300A()) {
                        return;
                    } else {
                        iMo123321p = this.f74199a.mo123321p();
                    }
                } while (iMo123321p == this.f74200b);
                this.f74202d = iMo123321p;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iMo123312g = this.f74199a.mo123312g() + this.f74199a.mo123322q();
            do {
                list.add(Boolean.valueOf(this.f74199a.mo123301B()));
            } while (this.f74199a.mo123312g() < iMo123312g);
            m101127x(iMo123312g);
            return;
        }
        fvx0 fvx0Var = (fvx0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                fvx0Var.m127743c(this.f74199a.mo123301B());
                if (this.f74199a.mo123300A()) {
                    return;
                } else {
                    iMo123321p2 = this.f74199a.mo123321p();
                }
            } while (iMo123321p2 == this.f74200b);
            this.f74202d = iMo123321p2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iMo123312g2 = this.f74199a.mo123312g() + this.f74199a.mo123322q();
        do {
            fvx0Var.m127743c(this.f74199a.mo123301B());
        } while (this.f74199a.mo123312g() < iMo123312g2);
        m101127x(iMo123312g2);
    }

    /* JADX INFO: renamed from: v */
    public final <T> T m101126v(ocy0<T> ocy0Var, C2368s0 c2368s0) throws IOException {
        T tZza = ocy0Var.zza();
        m101101C(tZza, ocy0Var, c2368s0);
        ocy0Var.zzd(tZza);
        return tZza;
    }

    /* JADX INFO: renamed from: x */
    public final void m101127x(int i) throws IOException {
        if (this.f74199a.mo123312g() != i) {
            throw zzkb.zzi();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m101128y(List<String> list, boolean z) throws IOException {
        int iMo123321p;
        int iMo123321p2;
        if ((this.f74200b & 7) != 2) {
            throw zzkb.zza();
        }
        if (!(list instanceof n5y0) || z) {
            do {
                list.add(z ? zzr() : mo101103a());
                if (this.f74199a.mo123300A()) {
                    return;
                } else {
                    iMo123321p = this.f74199a.mo123321p();
                }
            } while (iMo123321p == this.f74200b);
            this.f74202d = iMo123321p;
            return;
        }
        n5y0 n5y0Var = (n5y0) list;
        do {
            n5y0Var.m161737B(zzp());
            if (this.f74199a.mo123300A()) {
                return;
            } else {
                iMo123321p2 = this.f74199a.mo123321p();
            }
        } while (iMo123321p2 == this.f74200b);
        this.f74202d = iMo123321p2;
    }

    /* JADX INFO: renamed from: z */
    public final <T> T m101129z(ocy0<T> ocy0Var, C2368s0 c2368s0) throws IOException {
        T tZza = ocy0Var.zza();
        m101102E(tZza, ocy0Var, c2368s0);
        ocy0Var.zzd(tZza);
        return tZza;
    }

    @Override // p153l.zby0
    public final double zza() throws IOException {
        m101100A(1);
        return this.f74199a.mo123309a();
    }

    @Override // p153l.zby0
    public final float zzb() throws IOException {
        m101100A(5);
        return this.f74199a.mo123310e();
    }

    @Override // p153l.zby0
    public final int zzc() throws IOException {
        int i = this.f74202d;
        if (i != 0) {
            this.f74200b = i;
            this.f74202d = 0;
        } else {
            this.f74200b = this.f74199a.mo123321p();
        }
        int i2 = this.f74200b;
        return (i2 == 0 || i2 == this.f74201c) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i2 >>> 3;
    }

    @Override // p153l.zby0
    public final int zzd() {
        return this.f74200b;
    }

    @Override // p153l.zby0
    public final int zze() throws IOException {
        m101100A(0);
        return this.f74199a.mo123314i();
    }

    @Override // p153l.zby0
    public final int zzf() throws IOException {
        m101100A(5);
        return this.f74199a.mo123316k();
    }

    @Override // p153l.zby0
    public final int zzg() throws IOException {
        m101100A(0);
        return this.f74199a.mo123318m();
    }

    @Override // p153l.zby0
    public final int zzh() throws IOException {
        m101100A(5);
        return this.f74199a.mo123319n();
    }

    @Override // p153l.zby0
    public final int zzi() throws IOException {
        m101100A(0);
        return this.f74199a.mo123320o();
    }

    @Override // p153l.zby0
    public final int zzj() throws IOException {
        m101100A(0);
        return this.f74199a.mo123322q();
    }

    @Override // p153l.zby0
    public final long zzk() throws IOException {
        m101100A(1);
        return this.f74199a.mo123323r();
    }

    @Override // p153l.zby0
    public final long zzl() throws IOException {
        m101100A(0);
        return this.f74199a.mo123324s();
    }

    @Override // p153l.zby0
    public final long zzm() throws IOException {
        m101100A(1);
        return this.f74199a.mo123326u();
    }

    @Override // p153l.zby0
    public final long zzn() throws IOException {
        m101100A(0);
        return this.f74199a.mo123327v();
    }

    @Override // p153l.zby0
    public final long zzo() throws IOException {
        m101100A(0);
        return this.f74199a.mo123328w();
    }

    @Override // p153l.zby0
    public final zzik zzp() throws IOException {
        m101100A(2);
        return this.f74199a.mo123329x();
    }

    @Override // p153l.zby0
    public final String zzr() throws IOException {
        m101100A(2);
        return this.f74199a.mo123331z();
    }

    @Override // p153l.zby0
    public final boolean zzs() throws IOException {
        m101100A(0);
        return this.f74199a.mo123301B();
    }

    @Override // p153l.zby0
    public final boolean zzt() throws IOException {
        int i;
        if (this.f74199a.mo123300A() || (i = this.f74200b) == this.f74201c) {
            return false;
        }
        return this.f74199a.mo123317l(i);
    }
}
