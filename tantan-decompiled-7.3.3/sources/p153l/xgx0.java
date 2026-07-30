package p153l;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class xgx0 implements qkx0 {

    /* JADX INFO: renamed from: a */
    public final wgx0 f194257a;

    /* JADX INFO: renamed from: b */
    public int f194258b;

    /* JADX INFO: renamed from: c */
    public int f194259c;

    /* JADX INFO: renamed from: d */
    public int f194260d = 0;

    public xgx0(wgx0 wgx0Var) {
        Charset charset = gjx0.f104688a;
        this.f194257a = wgx0Var;
        wgx0Var.f189071c = this;
    }

    /* JADX INFO: renamed from: j */
    public static final void m210967j(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzhag.zzg();
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m210968k(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzhag.zzg();
        }
    }

    /* JADX INFO: renamed from: l */
    public static xgx0 m210969l(wgx0 wgx0Var) {
        xgx0 xgx0Var = wgx0Var.f189071c;
        return xgx0Var != null ? xgx0Var : new xgx0(wgx0Var);
    }

    @Override // p153l.qkx0
    /* JADX INFO: renamed from: a */
    public final void mo176974a(Object obj, ukx0 ukx0Var, jhx0 jhx0Var) throws IOException {
        m210974i(2);
        m210972g(obj, ukx0Var, jhx0Var);
    }

    @Override // p153l.qkx0
    /* JADX INFO: renamed from: b */
    public final void mo176975b(Object obj, ukx0 ukx0Var, jhx0 jhx0Var) throws IOException {
        m210974i(3);
        m210971f(obj, ukx0Var, jhx0Var);
    }

    @Override // p153l.qkx0
    @Deprecated
    /* JADX INFO: renamed from: c */
    public final void mo176976c(List list, ukx0 ukx0Var, jhx0 jhx0Var) throws IOException {
        int iMo12858r;
        int i = this.f194258b;
        if ((i & 7) != 3) {
            throw zzhag.zza();
        }
        do {
            Object objZze = ukx0Var.zze();
            m210971f(objZze, ukx0Var, jhx0Var);
            ukx0Var.mo13338a(objZze);
            list.add(objZze);
            if (this.f194257a.mo12846b() || this.f194260d != 0) {
                return;
            } else {
                iMo12858r = this.f194257a.mo12858r();
            }
        } while (iMo12858r == i);
        this.f194260d = iMo12858r;
    }

    @Override // p153l.qkx0
    /* JADX INFO: renamed from: d */
    public final void mo176977d(List list, ukx0 ukx0Var, jhx0 jhx0Var) throws IOException {
        int iMo12858r;
        int i = this.f194258b;
        if ((i & 7) != 2) {
            throw zzhag.zza();
        }
        do {
            Object objZze = ukx0Var.zze();
            m210972g(objZze, ukx0Var, jhx0Var);
            ukx0Var.mo13338a(objZze);
            list.add(objZze);
            if (this.f194257a.mo12846b() || this.f194260d != 0) {
                return;
            } else {
                iMo12858r = this.f194257a.mo12858r();
            }
        } while (iMo12858r == i);
        this.f194260d = iMo12858r;
    }

    /* JADX INFO: renamed from: e */
    public final void m210970e(List list, boolean z) throws IOException {
        int iMo12858r;
        int iMo12858r2;
        if ((this.f194258b & 7) != 2) {
            throw zzhag.zza();
        }
        if ((list instanceof jjx0) && !z) {
            jjx0 jjx0Var = (jjx0) list;
            do {
                jjx0Var.mo140242Z(zzp());
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r2 = this.f194257a.mo12858r();
                }
            } while (iMo12858r2 == this.f194258b);
        } else {
            do {
                list.add(z ? zzs() : zzr());
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r = this.f194257a.mo12858r();
                }
            } while (iMo12858r == this.f194258b);
            iMo12858r2 = iMo12858r;
        }
        this.f194260d = iMo12858r2;
    }

    /* JADX INFO: renamed from: f */
    public final void m210971f(Object obj, ukx0 ukx0Var, jhx0 jhx0Var) throws IOException {
        int i = this.f194259c;
        this.f194259c = ((this.f194258b >>> 3) << 3) | 4;
        try {
            ukx0Var.mo13343f(obj, this, jhx0Var);
            if (this.f194258b != this.f194259c) {
                throw zzhag.zzg();
            }
            this.f194259c = i;
        } catch (Throwable th) {
            this.f194259c = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m210972g(Object obj, ukx0 ukx0Var, jhx0 jhx0Var) throws IOException {
        wgx0 wgx0Var = this.f194257a;
        int iMo12859s = wgx0Var.mo12859s();
        if (wgx0Var.f189069a >= wgx0Var.f189070b) {
            throw new zzhag("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iMo12852l = this.f194257a.mo12852l(iMo12859s);
        this.f194257a.f189069a++;
        ukx0Var.mo13343f(obj, this, jhx0Var);
        this.f194257a.mo12836B(0);
        wgx0 wgx0Var2 = this.f194257a;
        wgx0Var2.f189069a--;
        wgx0Var2.mo12845a(iMo12852l);
    }

    /* JADX INFO: renamed from: h */
    public final void m210973h(int i) throws IOException {
        if (this.f194257a.mo12851k() != i) {
            throw zzhag.zzj();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m210974i(int i) throws IOException {
        if ((this.f194258b & 7) != i) {
            throw zzhag.zza();
        }
    }

    @Override // p153l.qkx0
    public final void zzA(List list) throws IOException {
        int iMo12858r;
        int iMo12858r2;
        boolean z = list instanceof qjx0;
        int i = this.f194258b;
        if (z) {
            qjx0 qjx0Var = (qjx0) list;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zzhag.zza();
                }
                int iMo12859s = this.f194257a.mo12859s();
                m210968k(iMo12859s);
                int iMo12851k = this.f194257a.mo12851k() + iMo12859s;
                do {
                    qjx0Var.m176902g(this.f194257a.mo12860t());
                } while (this.f194257a.mo12851k() < iMo12851k);
                return;
            }
            do {
                qjx0Var.m176902g(this.f194257a.mo12860t());
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r2 = this.f194257a.mo12858r();
                }
            } while (iMo12858r2 == this.f194258b);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw zzhag.zza();
                }
                int iMo12859s2 = this.f194257a.mo12859s();
                m210968k(iMo12859s2);
                int iMo12851k2 = this.f194257a.mo12851k() + iMo12859s2;
                do {
                    list.add(Long.valueOf(this.f194257a.mo12860t()));
                } while (this.f194257a.mo12851k() < iMo12851k2);
                return;
            }
            do {
                list.add(Long.valueOf(this.f194257a.mo12860t()));
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r = this.f194257a.mo12858r();
                }
            } while (iMo12858r == this.f194258b);
            iMo12858r2 = iMo12858r;
        }
        this.f194260d = iMo12858r2;
    }

    @Override // p153l.qkx0
    public final void zzB(List list) throws IOException {
        int iMo12858r;
        int iMo12858r2;
        boolean z = list instanceof phx0;
        int i = this.f194258b;
        if (z) {
            phx0 phx0Var = (phx0) list;
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo12859s = this.f194257a.mo12859s();
                m210967j(iMo12859s);
                int iMo12851k = this.f194257a.mo12851k() + iMo12859s;
                do {
                    phx0Var.m172350c(this.f194257a.mo12850j());
                } while (this.f194257a.mo12851k() < iMo12851k);
                return;
            }
            if (i2 != 5) {
                throw zzhag.zza();
            }
            do {
                phx0Var.m172350c(this.f194257a.mo12850j());
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r2 = this.f194257a.mo12858r();
                }
            } while (iMo12858r2 == this.f194258b);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iMo12859s2 = this.f194257a.mo12859s();
                m210967j(iMo12859s2);
                int iMo12851k2 = this.f194257a.mo12851k() + iMo12859s2;
                do {
                    list.add(Float.valueOf(this.f194257a.mo12850j()));
                } while (this.f194257a.mo12851k() < iMo12851k2);
                return;
            }
            if (i3 != 5) {
                throw zzhag.zza();
            }
            do {
                list.add(Float.valueOf(this.f194257a.mo12850j()));
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r = this.f194257a.mo12858r();
                }
            } while (iMo12858r == this.f194258b);
            iMo12858r2 = iMo12858r;
        }
        this.f194260d = iMo12858r2;
    }

    @Override // p153l.qkx0
    public final void zzD(List list) throws IOException {
        int iMo12858r;
        int iMo12858r2;
        boolean z = list instanceof whx0;
        int i = this.f194258b;
        if (z) {
            whx0 whx0Var = (whx0) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhag.zza();
                }
                wgx0 wgx0Var = this.f194257a;
                int iMo12851k = wgx0Var.mo12851k() + wgx0Var.mo12859s();
                do {
                    whx0Var.zzh(this.f194257a.mo12855o());
                } while (this.f194257a.mo12851k() < iMo12851k);
                m210973h(iMo12851k);
                return;
            }
            do {
                whx0Var.zzh(this.f194257a.mo12855o());
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r2 = this.f194257a.mo12858r();
                }
            } while (iMo12858r2 == this.f194258b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzhag.zza();
                }
                wgx0 wgx0Var2 = this.f194257a;
                int iMo12851k2 = wgx0Var2.mo12851k() + wgx0Var2.mo12859s();
                do {
                    list.add(Integer.valueOf(this.f194257a.mo12855o()));
                } while (this.f194257a.mo12851k() < iMo12851k2);
                m210973h(iMo12851k2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.f194257a.mo12855o()));
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r = this.f194257a.mo12858r();
                }
            } while (iMo12858r == this.f194258b);
            iMo12858r2 = iMo12858r;
        }
        this.f194260d = iMo12858r2;
    }

    @Override // p153l.qkx0
    public final void zzE(List list) throws IOException {
        int iMo12858r;
        int iMo12858r2;
        boolean z = list instanceof qjx0;
        int i = this.f194258b;
        if (z) {
            qjx0 qjx0Var = (qjx0) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhag.zza();
                }
                wgx0 wgx0Var = this.f194257a;
                int iMo12851k = wgx0Var.mo12851k() + wgx0Var.mo12859s();
                do {
                    qjx0Var.m176902g(this.f194257a.mo12861u());
                } while (this.f194257a.mo12851k() < iMo12851k);
                m210973h(iMo12851k);
                return;
            }
            do {
                qjx0Var.m176902g(this.f194257a.mo12861u());
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r2 = this.f194257a.mo12858r();
                }
            } while (iMo12858r2 == this.f194258b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzhag.zza();
                }
                wgx0 wgx0Var2 = this.f194257a;
                int iMo12851k2 = wgx0Var2.mo12851k() + wgx0Var2.mo12859s();
                do {
                    list.add(Long.valueOf(this.f194257a.mo12861u()));
                } while (this.f194257a.mo12851k() < iMo12851k2);
                m210973h(iMo12851k2);
                return;
            }
            do {
                list.add(Long.valueOf(this.f194257a.mo12861u()));
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r = this.f194257a.mo12858r();
                }
            } while (iMo12858r == this.f194258b);
            iMo12858r2 = iMo12858r;
        }
        this.f194260d = iMo12858r2;
    }

    @Override // p153l.qkx0
    public final void zzG(List list) throws IOException {
        int iMo12858r;
        int iMo12858r2;
        boolean z = list instanceof whx0;
        int i = this.f194258b;
        if (z) {
            whx0 whx0Var = (whx0) list;
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo12859s = this.f194257a.mo12859s();
                m210967j(iMo12859s);
                int iMo12851k = this.f194257a.mo12851k() + iMo12859s;
                do {
                    whx0Var.zzh(this.f194257a.mo12856p());
                } while (this.f194257a.mo12851k() < iMo12851k);
                return;
            }
            if (i2 != 5) {
                throw zzhag.zza();
            }
            do {
                whx0Var.zzh(this.f194257a.mo12856p());
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r2 = this.f194257a.mo12858r();
                }
            } while (iMo12858r2 == this.f194258b);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iMo12859s2 = this.f194257a.mo12859s();
                m210967j(iMo12859s2);
                int iMo12851k2 = this.f194257a.mo12851k() + iMo12859s2;
                do {
                    list.add(Integer.valueOf(this.f194257a.mo12856p()));
                } while (this.f194257a.mo12851k() < iMo12851k2);
                return;
            }
            if (i3 != 5) {
                throw zzhag.zza();
            }
            do {
                list.add(Integer.valueOf(this.f194257a.mo12856p()));
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r = this.f194257a.mo12858r();
                }
            } while (iMo12858r == this.f194258b);
            iMo12858r2 = iMo12858r;
        }
        this.f194260d = iMo12858r2;
    }

    @Override // p153l.qkx0
    public final void zzH(List list) throws IOException {
        int iMo12858r;
        int iMo12858r2;
        boolean z = list instanceof qjx0;
        int i = this.f194258b;
        if (z) {
            qjx0 qjx0Var = (qjx0) list;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zzhag.zza();
                }
                int iMo12859s = this.f194257a.mo12859s();
                m210968k(iMo12859s);
                int iMo12851k = this.f194257a.mo12851k() + iMo12859s;
                do {
                    qjx0Var.m176902g(this.f194257a.mo12862v());
                } while (this.f194257a.mo12851k() < iMo12851k);
                return;
            }
            do {
                qjx0Var.m176902g(this.f194257a.mo12862v());
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r2 = this.f194257a.mo12858r();
                }
            } while (iMo12858r2 == this.f194258b);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw zzhag.zza();
                }
                int iMo12859s2 = this.f194257a.mo12859s();
                m210968k(iMo12859s2);
                int iMo12851k2 = this.f194257a.mo12851k() + iMo12859s2;
                do {
                    list.add(Long.valueOf(this.f194257a.mo12862v()));
                } while (this.f194257a.mo12851k() < iMo12851k2);
                return;
            }
            do {
                list.add(Long.valueOf(this.f194257a.mo12862v()));
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r = this.f194257a.mo12858r();
                }
            } while (iMo12858r == this.f194258b);
            iMo12858r2 = iMo12858r;
        }
        this.f194260d = iMo12858r2;
    }

    @Override // p153l.qkx0
    public final void zzI(List list) throws IOException {
        int iMo12858r;
        int iMo12858r2;
        boolean z = list instanceof whx0;
        int i = this.f194258b;
        if (z) {
            whx0 whx0Var = (whx0) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhag.zza();
                }
                wgx0 wgx0Var = this.f194257a;
                int iMo12851k = wgx0Var.mo12851k() + wgx0Var.mo12859s();
                do {
                    whx0Var.zzh(this.f194257a.mo12857q());
                } while (this.f194257a.mo12851k() < iMo12851k);
                m210973h(iMo12851k);
                return;
            }
            do {
                whx0Var.zzh(this.f194257a.mo12857q());
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r2 = this.f194257a.mo12858r();
                }
            } while (iMo12858r2 == this.f194258b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzhag.zza();
                }
                wgx0 wgx0Var2 = this.f194257a;
                int iMo12851k2 = wgx0Var2.mo12851k() + wgx0Var2.mo12859s();
                do {
                    list.add(Integer.valueOf(this.f194257a.mo12857q()));
                } while (this.f194257a.mo12851k() < iMo12851k2);
                m210973h(iMo12851k2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.f194257a.mo12857q()));
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r = this.f194257a.mo12858r();
                }
            } while (iMo12858r == this.f194258b);
            iMo12858r2 = iMo12858r;
        }
        this.f194260d = iMo12858r2;
    }

    @Override // p153l.qkx0
    public final void zzJ(List list) throws IOException {
        int iMo12858r;
        int iMo12858r2;
        boolean z = list instanceof qjx0;
        int i = this.f194258b;
        if (z) {
            qjx0 qjx0Var = (qjx0) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhag.zza();
                }
                wgx0 wgx0Var = this.f194257a;
                int iMo12851k = wgx0Var.mo12851k() + wgx0Var.mo12859s();
                do {
                    qjx0Var.m176902g(this.f194257a.mo12863w());
                } while (this.f194257a.mo12851k() < iMo12851k);
                m210973h(iMo12851k);
                return;
            }
            do {
                qjx0Var.m176902g(this.f194257a.mo12863w());
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r2 = this.f194257a.mo12858r();
                }
            } while (iMo12858r2 == this.f194258b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzhag.zza();
                }
                wgx0 wgx0Var2 = this.f194257a;
                int iMo12851k2 = wgx0Var2.mo12851k() + wgx0Var2.mo12859s();
                do {
                    list.add(Long.valueOf(this.f194257a.mo12863w()));
                } while (this.f194257a.mo12851k() < iMo12851k2);
                m210973h(iMo12851k2);
                return;
            }
            do {
                list.add(Long.valueOf(this.f194257a.mo12863w()));
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r = this.f194257a.mo12858r();
                }
            } while (iMo12858r == this.f194258b);
            iMo12858r2 = iMo12858r;
        }
        this.f194260d = iMo12858r2;
    }

    @Override // p153l.qkx0
    public final void zzL(List list) throws IOException {
        int iMo12858r;
        int iMo12858r2;
        boolean z = list instanceof whx0;
        int i = this.f194258b;
        if (z) {
            whx0 whx0Var = (whx0) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhag.zza();
                }
                wgx0 wgx0Var = this.f194257a;
                int iMo12851k = wgx0Var.mo12851k() + wgx0Var.mo12859s();
                do {
                    whx0Var.zzh(this.f194257a.mo12859s());
                } while (this.f194257a.mo12851k() < iMo12851k);
                m210973h(iMo12851k);
                return;
            }
            do {
                whx0Var.zzh(this.f194257a.mo12859s());
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r2 = this.f194257a.mo12858r();
                }
            } while (iMo12858r2 == this.f194258b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzhag.zza();
                }
                wgx0 wgx0Var2 = this.f194257a;
                int iMo12851k2 = wgx0Var2.mo12851k() + wgx0Var2.mo12859s();
                do {
                    list.add(Integer.valueOf(this.f194257a.mo12859s()));
                } while (this.f194257a.mo12851k() < iMo12851k2);
                m210973h(iMo12851k2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.f194257a.mo12859s()));
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r = this.f194257a.mo12858r();
                }
            } while (iMo12858r == this.f194258b);
            iMo12858r2 = iMo12858r;
        }
        this.f194260d = iMo12858r2;
    }

    @Override // p153l.qkx0
    public final void zzM(List list) throws IOException {
        int iMo12858r;
        int iMo12858r2;
        boolean z = list instanceof qjx0;
        int i = this.f194258b;
        if (z) {
            qjx0 qjx0Var = (qjx0) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhag.zza();
                }
                wgx0 wgx0Var = this.f194257a;
                int iMo12851k = wgx0Var.mo12851k() + wgx0Var.mo12859s();
                do {
                    qjx0Var.m176902g(this.f194257a.mo12864x());
                } while (this.f194257a.mo12851k() < iMo12851k);
                m210973h(iMo12851k);
                return;
            }
            do {
                qjx0Var.m176902g(this.f194257a.mo12864x());
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r2 = this.f194257a.mo12858r();
                }
            } while (iMo12858r2 == this.f194258b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzhag.zza();
                }
                wgx0 wgx0Var2 = this.f194257a;
                int iMo12851k2 = wgx0Var2.mo12851k() + wgx0Var2.mo12859s();
                do {
                    list.add(Long.valueOf(this.f194257a.mo12864x()));
                } while (this.f194257a.mo12851k() < iMo12851k2);
                m210973h(iMo12851k2);
                return;
            }
            do {
                list.add(Long.valueOf(this.f194257a.mo12864x()));
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r = this.f194257a.mo12858r();
                }
            } while (iMo12858r == this.f194258b);
            iMo12858r2 = iMo12858r;
        }
        this.f194260d = iMo12858r2;
    }

    @Override // p153l.qkx0
    public final boolean zzN() throws IOException {
        m210974i(0);
        return this.f194257a.mo12847c();
    }

    @Override // p153l.qkx0
    public final boolean zzO() throws IOException {
        int i;
        if (this.f194257a.mo12846b() || (i = this.f194258b) == this.f194259c) {
            return false;
        }
        return this.f194257a.mo12848d(i);
    }

    @Override // p153l.qkx0
    public final double zza() throws IOException {
        m210974i(1);
        return this.f194257a.mo12849i();
    }

    @Override // p153l.qkx0
    public final float zzb() throws IOException {
        m210974i(5);
        return this.f194257a.mo12850j();
    }

    @Override // p153l.qkx0
    public final int zzc() throws IOException {
        int iMo12858r = this.f194260d;
        if (iMo12858r != 0) {
            this.f194258b = iMo12858r;
            this.f194260d = 0;
        } else {
            iMo12858r = this.f194257a.mo12858r();
            this.f194258b = iMo12858r;
        }
        return (iMo12858r == 0 || iMo12858r == this.f194259c) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : iMo12858r >>> 3;
    }

    @Override // p153l.qkx0
    public final int zzd() {
        return this.f194258b;
    }

    @Override // p153l.qkx0
    public final int zze() throws IOException {
        m210974i(0);
        return this.f194257a.mo12853m();
    }

    @Override // p153l.qkx0
    public final int zzf() throws IOException {
        m210974i(5);
        return this.f194257a.mo12854n();
    }

    @Override // p153l.qkx0
    public final int zzg() throws IOException {
        m210974i(0);
        return this.f194257a.mo12855o();
    }

    @Override // p153l.qkx0
    public final int zzh() throws IOException {
        m210974i(5);
        return this.f194257a.mo12856p();
    }

    @Override // p153l.qkx0
    public final int zzi() throws IOException {
        m210974i(0);
        return this.f194257a.mo12857q();
    }

    @Override // p153l.qkx0
    public final int zzj() throws IOException {
        m210974i(0);
        return this.f194257a.mo12859s();
    }

    @Override // p153l.qkx0
    public final long zzk() throws IOException {
        m210974i(1);
        return this.f194257a.mo12860t();
    }

    @Override // p153l.qkx0
    public final long zzl() throws IOException {
        m210974i(0);
        return this.f194257a.mo12861u();
    }

    @Override // p153l.qkx0
    public final long zzm() throws IOException {
        m210974i(1);
        return this.f194257a.mo12862v();
    }

    @Override // p153l.qkx0
    public final long zzn() throws IOException {
        m210974i(0);
        return this.f194257a.mo12863w();
    }

    @Override // p153l.qkx0
    public final long zzo() throws IOException {
        m210974i(0);
        return this.f194257a.mo12864x();
    }

    @Override // p153l.qkx0
    public final zzgyl zzp() throws IOException {
        m210974i(2);
        return this.f194257a.mo12865y();
    }

    @Override // p153l.qkx0
    public final String zzr() throws IOException {
        m210974i(2);
        return this.f194257a.mo12866z();
    }

    @Override // p153l.qkx0
    public final String zzs() throws IOException {
        m210974i(2);
        return this.f194257a.mo12835A();
    }

    @Override // p153l.qkx0
    public final void zzv(List list) throws IOException {
        int iMo12858r;
        int iMo12858r2;
        boolean z = list instanceof fgx0;
        int i = this.f194258b;
        if (z) {
            fgx0 fgx0Var = (fgx0) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhag.zza();
                }
                wgx0 wgx0Var = this.f194257a;
                int iMo12851k = wgx0Var.mo12851k() + wgx0Var.mo12859s();
                do {
                    fgx0Var.m125535c(this.f194257a.mo12847c());
                } while (this.f194257a.mo12851k() < iMo12851k);
                m210973h(iMo12851k);
                return;
            }
            do {
                fgx0Var.m125535c(this.f194257a.mo12847c());
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r2 = this.f194257a.mo12858r();
                }
            } while (iMo12858r2 == this.f194258b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzhag.zza();
                }
                wgx0 wgx0Var2 = this.f194257a;
                int iMo12851k2 = wgx0Var2.mo12851k() + wgx0Var2.mo12859s();
                do {
                    list.add(Boolean.valueOf(this.f194257a.mo12847c()));
                } while (this.f194257a.mo12851k() < iMo12851k2);
                m210973h(iMo12851k2);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.f194257a.mo12847c()));
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r = this.f194257a.mo12858r();
                }
            } while (iMo12858r == this.f194258b);
            iMo12858r2 = iMo12858r;
        }
        this.f194260d = iMo12858r2;
    }

    @Override // p153l.qkx0
    public final void zzw(List list) throws IOException {
        int iMo12858r;
        if ((this.f194258b & 7) != 2) {
            throw zzhag.zza();
        }
        do {
            list.add(zzp());
            if (this.f194257a.mo12846b()) {
                return;
            } else {
                iMo12858r = this.f194257a.mo12858r();
            }
        } while (iMo12858r == this.f194258b);
        this.f194260d = iMo12858r;
    }

    @Override // p153l.qkx0
    public final void zzx(List list) throws IOException {
        int iMo12858r;
        int iMo12858r2;
        boolean z = list instanceof ghx0;
        int i = this.f194258b;
        if (z) {
            ghx0 ghx0Var = (ghx0) list;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zzhag.zza();
                }
                int iMo12859s = this.f194257a.mo12859s();
                m210968k(iMo12859s);
                int iMo12851k = this.f194257a.mo12851k() + iMo12859s;
                do {
                    ghx0Var.m130282c(this.f194257a.mo12849i());
                } while (this.f194257a.mo12851k() < iMo12851k);
                return;
            }
            do {
                ghx0Var.m130282c(this.f194257a.mo12849i());
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r2 = this.f194257a.mo12858r();
                }
            } while (iMo12858r2 == this.f194258b);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw zzhag.zza();
                }
                int iMo12859s2 = this.f194257a.mo12859s();
                m210968k(iMo12859s2);
                int iMo12851k2 = this.f194257a.mo12851k() + iMo12859s2;
                do {
                    list.add(Double.valueOf(this.f194257a.mo12849i()));
                } while (this.f194257a.mo12851k() < iMo12851k2);
                return;
            }
            do {
                list.add(Double.valueOf(this.f194257a.mo12849i()));
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r = this.f194257a.mo12858r();
                }
            } while (iMo12858r == this.f194258b);
            iMo12858r2 = iMo12858r;
        }
        this.f194260d = iMo12858r2;
    }

    @Override // p153l.qkx0
    public final void zzy(List list) throws IOException {
        int iMo12858r;
        int iMo12858r2;
        boolean z = list instanceof whx0;
        int i = this.f194258b;
        if (z) {
            whx0 whx0Var = (whx0) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhag.zza();
                }
                wgx0 wgx0Var = this.f194257a;
                int iMo12851k = wgx0Var.mo12851k() + wgx0Var.mo12859s();
                do {
                    whx0Var.zzh(this.f194257a.mo12853m());
                } while (this.f194257a.mo12851k() < iMo12851k);
                m210973h(iMo12851k);
                return;
            }
            do {
                whx0Var.zzh(this.f194257a.mo12853m());
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r2 = this.f194257a.mo12858r();
                }
            } while (iMo12858r2 == this.f194258b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzhag.zza();
                }
                wgx0 wgx0Var2 = this.f194257a;
                int iMo12851k2 = wgx0Var2.mo12851k() + wgx0Var2.mo12859s();
                do {
                    list.add(Integer.valueOf(this.f194257a.mo12853m()));
                } while (this.f194257a.mo12851k() < iMo12851k2);
                m210973h(iMo12851k2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.f194257a.mo12853m()));
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r = this.f194257a.mo12858r();
                }
            } while (iMo12858r == this.f194258b);
            iMo12858r2 = iMo12858r;
        }
        this.f194260d = iMo12858r2;
    }

    @Override // p153l.qkx0
    public final void zzz(List list) throws IOException {
        int iMo12858r;
        int iMo12858r2;
        boolean z = list instanceof whx0;
        int i = this.f194258b;
        if (z) {
            whx0 whx0Var = (whx0) list;
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo12859s = this.f194257a.mo12859s();
                m210967j(iMo12859s);
                int iMo12851k = this.f194257a.mo12851k() + iMo12859s;
                do {
                    whx0Var.zzh(this.f194257a.mo12854n());
                } while (this.f194257a.mo12851k() < iMo12851k);
                return;
            }
            if (i2 != 5) {
                throw zzhag.zza();
            }
            do {
                whx0Var.zzh(this.f194257a.mo12854n());
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r2 = this.f194257a.mo12858r();
                }
            } while (iMo12858r2 == this.f194258b);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iMo12859s2 = this.f194257a.mo12859s();
                m210967j(iMo12859s2);
                int iMo12851k2 = this.f194257a.mo12851k() + iMo12859s2;
                do {
                    list.add(Integer.valueOf(this.f194257a.mo12854n()));
                } while (this.f194257a.mo12851k() < iMo12851k2);
                return;
            }
            if (i3 != 5) {
                throw zzhag.zza();
            }
            do {
                list.add(Integer.valueOf(this.f194257a.mo12854n()));
                if (this.f194257a.mo12846b()) {
                    return;
                } else {
                    iMo12858r = this.f194257a.mo12858r();
                }
            } while (iMo12858r == this.f194258b);
            iMo12858r2 = iMo12858r;
        }
        this.f194260d = iMo12858r2;
    }
}
