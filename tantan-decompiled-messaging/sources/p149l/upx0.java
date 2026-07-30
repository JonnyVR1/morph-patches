package p149l;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.measurement.C2345s0;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzkb;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class upx0 implements t2y0 {

    /* JADX INFO: renamed from: a */
    public final hox0 f177684a;

    /* JADX INFO: renamed from: b */
    public int f177685b;

    /* JADX INFO: renamed from: c */
    public int f177686c;

    /* JADX INFO: renamed from: d */
    public int f177687d = 0;

    public upx0(hox0 hox0Var) {
        hox0 hox0Var2 = (hox0) ctx0.m108708f(hox0Var, "input");
        this.f177684a = hox0Var2;
        hox0Var2.f108874c = this;
    }

    /* JADX INFO: renamed from: B */
    public static void m194939B(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzkb.zzg();
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m194940D(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzkb.zzg();
        }
    }

    /* JADX INFO: renamed from: w */
    public static upx0 m194941w(hox0 hox0Var) {
        upx0 upx0Var = hox0Var.f108874c;
        return upx0Var != null ? upx0Var : new upx0(hox0Var);
    }

    /* JADX INFO: renamed from: A */
    public final void m194942A(int i) throws IOException {
        if ((this.f177685b & 7) != i) {
            throw zzkb.zza();
        }
    }

    /* JADX INFO: renamed from: C */
    public final <T> void m194943C(T t, i3y0<T> i3y0Var, C2345s0 c2345s0) throws IOException {
        int i = this.f177686c;
        this.f177686c = ((this.f177685b >>> 3) << 3) | 4;
        try {
            i3y0Var.mo14459d(t, this, c2345s0);
            if (this.f177685b != this.f177686c) {
                throw zzkb.zzg();
            }
            this.f177686c = i;
        } catch (Throwable th) {
            this.f177686c = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: E */
    public final <T> void m194944E(T t, i3y0<T> i3y0Var, C2345s0 c2345s0) throws IOException {
        int iMo132307q = this.f177684a.mo132307q();
        hox0 hox0Var = this.f177684a;
        if (hox0Var.f108872a >= hox0Var.f108873b) {
            throw zzkb.zzh();
        }
        int iMo132296f = hox0Var.mo132296f(iMo132307q);
        this.f177684a.f108872a++;
        i3y0Var.mo14459d(t, this, c2345s0);
        this.f177684a.mo132298h(0);
        hox0 hox0Var2 = this.f177684a;
        hox0Var2.f108872a--;
        hox0Var2.mo132300j(iMo132296f);
    }

    @Override // p149l.t2y0
    /* JADX INFO: renamed from: a */
    public final String mo187061a() throws IOException {
        m194942A(2);
        return this.f177684a.mo132315y();
    }

    @Override // p149l.t2y0
    /* JADX INFO: renamed from: b */
    public final void mo187062b(List<Integer> list) throws IOException {
        int iMo132306p;
        int iMo132306p2;
        boolean z = list instanceof gtx0;
        int i = this.f177685b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f177684a.mo132307q()));
                    if (this.f177684a.mo132292A()) {
                        return;
                    } else {
                        iMo132306p = this.f177684a.mo132306p();
                    }
                } while (iMo132306p == this.f177685b);
                this.f177687d = iMo132306p;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iMo132297g = this.f177684a.mo132297g() + this.f177684a.mo132307q();
            do {
                list.add(Integer.valueOf(this.f177684a.mo132307q()));
            } while (this.f177684a.mo132297g() < iMo132297g);
            m194946x(iMo132297g);
            return;
        }
        gtx0 gtx0Var = (gtx0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                gtx0Var.m128008g(this.f177684a.mo132307q());
                if (this.f177684a.mo132292A()) {
                    return;
                } else {
                    iMo132306p2 = this.f177684a.mo132306p();
                }
            } while (iMo132306p2 == this.f177685b);
            this.f177687d = iMo132306p2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iMo132297g2 = this.f177684a.mo132297g() + this.f177684a.mo132307q();
        do {
            gtx0Var.m128008g(this.f177684a.mo132307q());
        } while (this.f177684a.mo132297g() < iMo132297g2);
        m194946x(iMo132297g2);
    }

    @Override // p149l.t2y0
    /* JADX INFO: renamed from: c */
    public final void mo187063c(List<Long> list) throws IOException {
        int iMo132306p;
        int iMo132306p2;
        boolean z = list instanceof zwx0;
        int i = this.f177685b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f177684a.mo132309s()));
                    if (this.f177684a.mo132292A()) {
                        return;
                    } else {
                        iMo132306p = this.f177684a.mo132306p();
                    }
                } while (iMo132306p == this.f177685b);
                this.f177687d = iMo132306p;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iMo132297g = this.f177684a.mo132297g() + this.f177684a.mo132307q();
            do {
                list.add(Long.valueOf(this.f177684a.mo132309s()));
            } while (this.f177684a.mo132297g() < iMo132297g);
            m194946x(iMo132297g);
            return;
        }
        zwx0 zwx0Var = (zwx0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                zwx0Var.m220738c(this.f177684a.mo132309s());
                if (this.f177684a.mo132292A()) {
                    return;
                } else {
                    iMo132306p2 = this.f177684a.mo132306p();
                }
            } while (iMo132306p2 == this.f177685b);
            this.f177687d = iMo132306p2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iMo132297g2 = this.f177684a.mo132297g() + this.f177684a.mo132307q();
        do {
            zwx0Var.m220738c(this.f177684a.mo132309s());
        } while (this.f177684a.mo132297g() < iMo132297g2);
        m194946x(iMo132297g2);
    }

    @Override // p149l.t2y0
    /* JADX INFO: renamed from: d */
    public final void mo187064d(List<String> list) throws IOException {
        m194947y(list, true);
    }

    @Override // p149l.t2y0
    /* JADX INFO: renamed from: e */
    public final void mo187065e(List<Long> list) throws IOException {
        int iMo132306p;
        int iMo132306p2;
        boolean z = list instanceof zwx0;
        int i = this.f177685b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f177684a.mo132313w()));
                    if (this.f177684a.mo132292A()) {
                        return;
                    } else {
                        iMo132306p = this.f177684a.mo132306p();
                    }
                } while (iMo132306p == this.f177685b);
                this.f177687d = iMo132306p;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iMo132297g = this.f177684a.mo132297g() + this.f177684a.mo132307q();
            do {
                list.add(Long.valueOf(this.f177684a.mo132313w()));
            } while (this.f177684a.mo132297g() < iMo132297g);
            m194946x(iMo132297g);
            return;
        }
        zwx0 zwx0Var = (zwx0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                zwx0Var.m220738c(this.f177684a.mo132313w());
                if (this.f177684a.mo132292A()) {
                    return;
                } else {
                    iMo132306p2 = this.f177684a.mo132306p();
                }
            } while (iMo132306p2 == this.f177685b);
            this.f177687d = iMo132306p2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iMo132297g2 = this.f177684a.mo132297g() + this.f177684a.mo132307q();
        do {
            zwx0Var.m220738c(this.f177684a.mo132313w());
        } while (this.f177684a.mo132297g() < iMo132297g2);
        m194946x(iMo132297g2);
    }

    @Override // p149l.t2y0
    /* JADX INFO: renamed from: f */
    public final void mo187066f(List<Integer> list) throws IOException {
        int iMo132306p;
        int iMo132306p2;
        boolean z = list instanceof gtx0;
        int i = this.f177685b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f177684a.mo132305o()));
                    if (this.f177684a.mo132292A()) {
                        return;
                    } else {
                        iMo132306p = this.f177684a.mo132306p();
                    }
                } while (iMo132306p == this.f177685b);
                this.f177687d = iMo132306p;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iMo132297g = this.f177684a.mo132297g() + this.f177684a.mo132307q();
            do {
                list.add(Integer.valueOf(this.f177684a.mo132305o()));
            } while (this.f177684a.mo132297g() < iMo132297g);
            m194946x(iMo132297g);
            return;
        }
        gtx0 gtx0Var = (gtx0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                gtx0Var.m128008g(this.f177684a.mo132305o());
                if (this.f177684a.mo132292A()) {
                    return;
                } else {
                    iMo132306p2 = this.f177684a.mo132306p();
                }
            } while (iMo132306p2 == this.f177685b);
            this.f177687d = iMo132306p2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iMo132297g2 = this.f177684a.mo132297g() + this.f177684a.mo132307q();
        do {
            gtx0Var.m128008g(this.f177684a.mo132305o());
        } while (this.f177684a.mo132297g() < iMo132297g2);
        m194946x(iMo132297g2);
    }

    @Override // p149l.t2y0
    /* JADX INFO: renamed from: g */
    public final <K, V> void mo187067g(Map<K, V> map, byx0<K, V> byx0Var, C2345s0 c2345s0) throws IOException {
        m194942A(2);
        this.f177684a.mo132296f(this.f177684a.mo132307q());
        throw null;
    }

    @Override // p149l.t2y0
    /* JADX INFO: renamed from: h */
    public final void mo187068h(List<Long> list) throws IOException {
        int iMo132306p;
        int iMo132306p2;
        boolean z = list instanceof zwx0;
        int i = this.f177685b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f177684a.mo132311u()));
                    if (this.f177684a.mo132292A()) {
                        return;
                    } else {
                        iMo132306p = this.f177684a.mo132306p();
                    }
                } while (iMo132306p == this.f177685b);
                this.f177687d = iMo132306p;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iMo132307q = this.f177684a.mo132307q();
            m194940D(iMo132307q);
            int iMo132297g = this.f177684a.mo132297g() + iMo132307q;
            do {
                list.add(Long.valueOf(this.f177684a.mo132311u()));
            } while (this.f177684a.mo132297g() < iMo132297g);
            return;
        }
        zwx0 zwx0Var = (zwx0) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                zwx0Var.m220738c(this.f177684a.mo132311u());
                if (this.f177684a.mo132292A()) {
                    return;
                } else {
                    iMo132306p2 = this.f177684a.mo132306p();
                }
            } while (iMo132306p2 == this.f177685b);
            this.f177687d = iMo132306p2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iMo132307q2 = this.f177684a.mo132307q();
        m194940D(iMo132307q2);
        int iMo132297g2 = this.f177684a.mo132297g() + iMo132307q2;
        do {
            zwx0Var.m220738c(this.f177684a.mo132311u());
        } while (this.f177684a.mo132297g() < iMo132297g2);
    }

    @Override // p149l.t2y0
    /* JADX INFO: renamed from: h0 */
    public final void mo187069h0(List<Long> list) throws IOException {
        int iMo132306p;
        int iMo132306p2;
        boolean z = list instanceof zwx0;
        int i = this.f177685b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f177684a.mo132308r()));
                    if (this.f177684a.mo132292A()) {
                        return;
                    } else {
                        iMo132306p = this.f177684a.mo132306p();
                    }
                } while (iMo132306p == this.f177685b);
                this.f177687d = iMo132306p;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iMo132307q = this.f177684a.mo132307q();
            m194940D(iMo132307q);
            int iMo132297g = this.f177684a.mo132297g() + iMo132307q;
            do {
                list.add(Long.valueOf(this.f177684a.mo132308r()));
            } while (this.f177684a.mo132297g() < iMo132297g);
            return;
        }
        zwx0 zwx0Var = (zwx0) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                zwx0Var.m220738c(this.f177684a.mo132308r());
                if (this.f177684a.mo132292A()) {
                    return;
                } else {
                    iMo132306p2 = this.f177684a.mo132306p();
                }
            } while (iMo132306p2 == this.f177685b);
            this.f177687d = iMo132306p2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iMo132307q2 = this.f177684a.mo132307q();
        m194940D(iMo132307q2);
        int iMo132297g2 = this.f177684a.mo132297g() + iMo132307q2;
        do {
            zwx0Var.m220738c(this.f177684a.mo132308r());
        } while (this.f177684a.mo132297g() < iMo132297g2);
    }

    @Override // p149l.t2y0
    /* JADX INFO: renamed from: i */
    public final void mo187070i(List<String> list) throws IOException {
        m194947y(list, false);
    }

    @Override // p149l.t2y0
    /* JADX INFO: renamed from: j */
    public final void mo187071j(List<Long> list) throws IOException {
        int iMo132306p;
        int iMo132306p2;
        boolean z = list instanceof zwx0;
        int i = this.f177685b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f177684a.mo132312v()));
                    if (this.f177684a.mo132292A()) {
                        return;
                    } else {
                        iMo132306p = this.f177684a.mo132306p();
                    }
                } while (iMo132306p == this.f177685b);
                this.f177687d = iMo132306p;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iMo132297g = this.f177684a.mo132297g() + this.f177684a.mo132307q();
            do {
                list.add(Long.valueOf(this.f177684a.mo132312v()));
            } while (this.f177684a.mo132297g() < iMo132297g);
            m194946x(iMo132297g);
            return;
        }
        zwx0 zwx0Var = (zwx0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                zwx0Var.m220738c(this.f177684a.mo132312v());
                if (this.f177684a.mo132292A()) {
                    return;
                } else {
                    iMo132306p2 = this.f177684a.mo132306p();
                }
            } while (iMo132306p2 == this.f177685b);
            this.f177687d = iMo132306p2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iMo132297g2 = this.f177684a.mo132297g() + this.f177684a.mo132307q();
        do {
            zwx0Var.m220738c(this.f177684a.mo132312v());
        } while (this.f177684a.mo132297g() < iMo132297g2);
        m194946x(iMo132297g2);
    }

    @Override // p149l.t2y0
    /* JADX INFO: renamed from: k */
    public final void mo187072k(List<Integer> list) throws IOException {
        int iMo132306p;
        int iMo132306p2;
        boolean z = list instanceof gtx0;
        int i = this.f177685b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f177684a.mo132303m()));
                    if (this.f177684a.mo132292A()) {
                        return;
                    } else {
                        iMo132306p = this.f177684a.mo132306p();
                    }
                } while (iMo132306p == this.f177685b);
                this.f177687d = iMo132306p;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iMo132297g = this.f177684a.mo132297g() + this.f177684a.mo132307q();
            do {
                list.add(Integer.valueOf(this.f177684a.mo132303m()));
            } while (this.f177684a.mo132297g() < iMo132297g);
            m194946x(iMo132297g);
            return;
        }
        gtx0 gtx0Var = (gtx0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                gtx0Var.m128008g(this.f177684a.mo132303m());
                if (this.f177684a.mo132292A()) {
                    return;
                } else {
                    iMo132306p2 = this.f177684a.mo132306p();
                }
            } while (iMo132306p2 == this.f177685b);
            this.f177687d = iMo132306p2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iMo132297g2 = this.f177684a.mo132297g() + this.f177684a.mo132307q();
        do {
            gtx0Var.m128008g(this.f177684a.mo132303m());
        } while (this.f177684a.mo132297g() < iMo132297g2);
        m194946x(iMo132297g2);
    }

    @Override // p149l.t2y0
    /* JADX INFO: renamed from: l */
    public final void mo187073l(List<Float> list) throws IOException {
        int iMo132306p;
        int iMo132306p2;
        boolean z = list instanceof rsx0;
        int i = this.f177685b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo132307q = this.f177684a.mo132307q();
                m194939B(iMo132307q);
                int iMo132297g = this.f177684a.mo132297g() + iMo132307q;
                do {
                    list.add(Float.valueOf(this.f177684a.mo132295e()));
                } while (this.f177684a.mo132297g() < iMo132297g);
                return;
            }
            if (i2 != 5) {
                throw zzkb.zza();
            }
            do {
                list.add(Float.valueOf(this.f177684a.mo132295e()));
                if (this.f177684a.mo132292A()) {
                    return;
                } else {
                    iMo132306p = this.f177684a.mo132306p();
                }
            } while (iMo132306p == this.f177685b);
            this.f177687d = iMo132306p;
            return;
        }
        rsx0 rsx0Var = (rsx0) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo132307q2 = this.f177684a.mo132307q();
            m194939B(iMo132307q2);
            int iMo132297g2 = this.f177684a.mo132297g() + iMo132307q2;
            do {
                rsx0Var.m180744c(this.f177684a.mo132295e());
            } while (this.f177684a.mo132297g() < iMo132297g2);
            return;
        }
        if (i3 != 5) {
            throw zzkb.zza();
        }
        do {
            rsx0Var.m180744c(this.f177684a.mo132295e());
            if (this.f177684a.mo132292A()) {
                return;
            } else {
                iMo132306p2 = this.f177684a.mo132306p();
            }
        } while (iMo132306p2 == this.f177685b);
        this.f177687d = iMo132306p2;
    }

    @Override // p149l.t2y0
    /* JADX INFO: renamed from: m */
    public final void mo187074m(List<Integer> list) throws IOException {
        int iMo132306p;
        int iMo132306p2;
        boolean z = list instanceof gtx0;
        int i = this.f177685b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo132307q = this.f177684a.mo132307q();
                m194939B(iMo132307q);
                int iMo132297g = this.f177684a.mo132297g() + iMo132307q;
                do {
                    list.add(Integer.valueOf(this.f177684a.mo132304n()));
                } while (this.f177684a.mo132297g() < iMo132297g);
                return;
            }
            if (i2 != 5) {
                throw zzkb.zza();
            }
            do {
                list.add(Integer.valueOf(this.f177684a.mo132304n()));
                if (this.f177684a.mo132292A()) {
                    return;
                } else {
                    iMo132306p = this.f177684a.mo132306p();
                }
            } while (iMo132306p == this.f177685b);
            this.f177687d = iMo132306p;
            return;
        }
        gtx0 gtx0Var = (gtx0) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo132307q2 = this.f177684a.mo132307q();
            m194939B(iMo132307q2);
            int iMo132297g2 = this.f177684a.mo132297g() + iMo132307q2;
            do {
                gtx0Var.m128008g(this.f177684a.mo132304n());
            } while (this.f177684a.mo132297g() < iMo132297g2);
            return;
        }
        if (i3 != 5) {
            throw zzkb.zza();
        }
        do {
            gtx0Var.m128008g(this.f177684a.mo132304n());
            if (this.f177684a.mo132292A()) {
                return;
            } else {
                iMo132306p2 = this.f177684a.mo132306p();
            }
        } while (iMo132306p2 == this.f177685b);
        this.f177687d = iMo132306p2;
    }

    @Override // p149l.t2y0
    /* JADX INFO: renamed from: m0 */
    public final void mo187075m0(List<zzik> list) throws IOException {
        int iMo132306p;
        if ((this.f177685b & 7) != 2) {
            throw zzkb.zza();
        }
        do {
            list.add(zzp());
            if (this.f177684a.mo132292A()) {
                return;
            } else {
                iMo132306p = this.f177684a.mo132306p();
            }
        } while (iMo132306p == this.f177685b);
        this.f177687d = iMo132306p;
    }

    @Override // p149l.t2y0
    /* JADX INFO: renamed from: n */
    public final <T> void mo187076n(T t, i3y0<T> i3y0Var, C2345s0 c2345s0) throws IOException {
        m194942A(2);
        m194944E(t, i3y0Var, c2345s0);
    }

    @Override // p149l.t2y0
    /* JADX INFO: renamed from: o */
    public final <T> void mo187077o(T t, i3y0<T> i3y0Var, C2345s0 c2345s0) throws IOException {
        m194942A(3);
        m194943C(t, i3y0Var, c2345s0);
    }

    @Override // p149l.t2y0
    /* JADX INFO: renamed from: p */
    public final void mo187078p(List<Double> list) throws IOException {
        int iMo132306p;
        int iMo132306p2;
        boolean z = list instanceof iqx0;
        int i = this.f177685b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f177684a.mo132294a()));
                    if (this.f177684a.mo132292A()) {
                        return;
                    } else {
                        iMo132306p = this.f177684a.mo132306p();
                    }
                } while (iMo132306p == this.f177685b);
                this.f177687d = iMo132306p;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iMo132307q = this.f177684a.mo132307q();
            m194940D(iMo132307q);
            int iMo132297g = this.f177684a.mo132297g() + iMo132307q;
            do {
                list.add(Double.valueOf(this.f177684a.mo132294a()));
            } while (this.f177684a.mo132297g() < iMo132297g);
            return;
        }
        iqx0 iqx0Var = (iqx0) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                iqx0Var.m137811c(this.f177684a.mo132294a());
                if (this.f177684a.mo132292A()) {
                    return;
                } else {
                    iMo132306p2 = this.f177684a.mo132306p();
                }
            } while (iMo132306p2 == this.f177685b);
            this.f177687d = iMo132306p2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iMo132307q2 = this.f177684a.mo132307q();
        m194940D(iMo132307q2);
        int iMo132297g2 = this.f177684a.mo132297g() + iMo132307q2;
        do {
            iqx0Var.m137811c(this.f177684a.mo132294a());
        } while (this.f177684a.mo132297g() < iMo132297g2);
    }

    @Override // p149l.t2y0
    /* JADX INFO: renamed from: q */
    public final void mo187079q(List<Integer> list) throws IOException {
        int iMo132306p;
        int iMo132306p2;
        boolean z = list instanceof gtx0;
        int i = this.f177685b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo132307q = this.f177684a.mo132307q();
                m194939B(iMo132307q);
                int iMo132297g = this.f177684a.mo132297g() + iMo132307q;
                do {
                    list.add(Integer.valueOf(this.f177684a.mo132301k()));
                } while (this.f177684a.mo132297g() < iMo132297g);
                return;
            }
            if (i2 != 5) {
                throw zzkb.zza();
            }
            do {
                list.add(Integer.valueOf(this.f177684a.mo132301k()));
                if (this.f177684a.mo132292A()) {
                    return;
                } else {
                    iMo132306p = this.f177684a.mo132306p();
                }
            } while (iMo132306p == this.f177685b);
            this.f177687d = iMo132306p;
            return;
        }
        gtx0 gtx0Var = (gtx0) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo132307q2 = this.f177684a.mo132307q();
            m194939B(iMo132307q2);
            int iMo132297g2 = this.f177684a.mo132297g() + iMo132307q2;
            do {
                gtx0Var.m128008g(this.f177684a.mo132301k());
            } while (this.f177684a.mo132297g() < iMo132297g2);
            return;
        }
        if (i3 != 5) {
            throw zzkb.zza();
        }
        do {
            gtx0Var.m128008g(this.f177684a.mo132301k());
            if (this.f177684a.mo132292A()) {
                return;
            } else {
                iMo132306p2 = this.f177684a.mo132306p();
            }
        } while (iMo132306p2 == this.f177685b);
        this.f177687d = iMo132306p2;
    }

    @Override // p149l.t2y0
    /* JADX INFO: renamed from: r */
    public final void mo187080r(List<Integer> list) throws IOException {
        int iMo132306p;
        int iMo132306p2;
        boolean z = list instanceof gtx0;
        int i = this.f177685b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f177684a.mo132299i()));
                    if (this.f177684a.mo132292A()) {
                        return;
                    } else {
                        iMo132306p = this.f177684a.mo132306p();
                    }
                } while (iMo132306p == this.f177685b);
                this.f177687d = iMo132306p;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iMo132297g = this.f177684a.mo132297g() + this.f177684a.mo132307q();
            do {
                list.add(Integer.valueOf(this.f177684a.mo132299i()));
            } while (this.f177684a.mo132297g() < iMo132297g);
            m194946x(iMo132297g);
            return;
        }
        gtx0 gtx0Var = (gtx0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                gtx0Var.m128008g(this.f177684a.mo132299i());
                if (this.f177684a.mo132292A()) {
                    return;
                } else {
                    iMo132306p2 = this.f177684a.mo132306p();
                }
            } while (iMo132306p2 == this.f177685b);
            this.f177687d = iMo132306p2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iMo132297g2 = this.f177684a.mo132297g() + this.f177684a.mo132307q();
        do {
            gtx0Var.m128008g(this.f177684a.mo132299i());
        } while (this.f177684a.mo132297g() < iMo132297g2);
        m194946x(iMo132297g2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.t2y0
    @Deprecated
    /* JADX INFO: renamed from: s */
    public final <T> void mo187081s(List<T> list, i3y0<T> i3y0Var, C2345s0 c2345s0) throws IOException {
        int iMo132306p;
        int i = this.f177685b;
        if ((i & 7) != 3) {
            throw zzkb.zza();
        }
        do {
            list.add(m194945v(i3y0Var, c2345s0));
            if (this.f177684a.mo132292A() || this.f177687d != 0) {
                return;
            } else {
                iMo132306p = this.f177684a.mo132306p();
            }
        } while (iMo132306p == i);
        this.f177687d = iMo132306p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.t2y0
    /* JADX INFO: renamed from: t */
    public final <T> void mo187082t(List<T> list, i3y0<T> i3y0Var, C2345s0 c2345s0) throws IOException {
        int iMo132306p;
        int i = this.f177685b;
        if ((i & 7) != 2) {
            throw zzkb.zza();
        }
        do {
            list.add(m194948z(i3y0Var, c2345s0));
            if (this.f177684a.mo132292A() || this.f177687d != 0) {
                return;
            } else {
                iMo132306p = this.f177684a.mo132306p();
            }
        } while (iMo132306p == i);
        this.f177687d = iMo132306p;
    }

    @Override // p149l.t2y0
    /* JADX INFO: renamed from: u */
    public final void mo187083u(List<Boolean> list) throws IOException {
        int iMo132306p;
        int iMo132306p2;
        boolean z = list instanceof zlx0;
        int i = this.f177685b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f177684a.mo132293B()));
                    if (this.f177684a.mo132292A()) {
                        return;
                    } else {
                        iMo132306p = this.f177684a.mo132306p();
                    }
                } while (iMo132306p == this.f177685b);
                this.f177687d = iMo132306p;
                return;
            }
            if (i2 != 2) {
                throw zzkb.zza();
            }
            int iMo132297g = this.f177684a.mo132297g() + this.f177684a.mo132307q();
            do {
                list.add(Boolean.valueOf(this.f177684a.mo132293B()));
            } while (this.f177684a.mo132297g() < iMo132297g);
            m194946x(iMo132297g);
            return;
        }
        zlx0 zlx0Var = (zlx0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                zlx0Var.m219295c(this.f177684a.mo132293B());
                if (this.f177684a.mo132292A()) {
                    return;
                } else {
                    iMo132306p2 = this.f177684a.mo132306p();
                }
            } while (iMo132306p2 == this.f177685b);
            this.f177687d = iMo132306p2;
            return;
        }
        if (i3 != 2) {
            throw zzkb.zza();
        }
        int iMo132297g2 = this.f177684a.mo132297g() + this.f177684a.mo132307q();
        do {
            zlx0Var.m219295c(this.f177684a.mo132293B());
        } while (this.f177684a.mo132297g() < iMo132297g2);
        m194946x(iMo132297g2);
    }

    /* JADX INFO: renamed from: v */
    public final <T> T m194945v(i3y0<T> i3y0Var, C2345s0 c2345s0) throws IOException {
        T tZza = i3y0Var.zza();
        m194943C(tZza, i3y0Var, c2345s0);
        i3y0Var.zzd(tZza);
        return tZza;
    }

    /* JADX INFO: renamed from: x */
    public final void m194946x(int i) throws IOException {
        if (this.f177684a.mo132297g() != i) {
            throw zzkb.zzi();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m194947y(List<String> list, boolean z) throws IOException {
        int iMo132306p;
        int iMo132306p2;
        if ((this.f177685b & 7) != 2) {
            throw zzkb.zza();
        }
        if (!(list instanceof hwx0) || z) {
            do {
                list.add(z ? zzr() : mo187061a());
                if (this.f177684a.mo132292A()) {
                    return;
                } else {
                    iMo132306p = this.f177684a.mo132306p();
                }
            } while (iMo132306p == this.f177685b);
            this.f177687d = iMo132306p;
            return;
        }
        hwx0 hwx0Var = (hwx0) list;
        do {
            hwx0Var.m133281B(zzp());
            if (this.f177684a.mo132292A()) {
                return;
            } else {
                iMo132306p2 = this.f177684a.mo132306p();
            }
        } while (iMo132306p2 == this.f177685b);
        this.f177687d = iMo132306p2;
    }

    /* JADX INFO: renamed from: z */
    public final <T> T m194948z(i3y0<T> i3y0Var, C2345s0 c2345s0) throws IOException {
        T tZza = i3y0Var.zza();
        m194944E(tZza, i3y0Var, c2345s0);
        i3y0Var.zzd(tZza);
        return tZza;
    }

    @Override // p149l.t2y0
    public final double zza() throws IOException {
        m194942A(1);
        return this.f177684a.mo132294a();
    }

    @Override // p149l.t2y0
    public final float zzb() throws IOException {
        m194942A(5);
        return this.f177684a.mo132295e();
    }

    @Override // p149l.t2y0
    public final int zzc() throws IOException {
        int i = this.f177687d;
        if (i != 0) {
            this.f177685b = i;
            this.f177687d = 0;
        } else {
            this.f177685b = this.f177684a.mo132306p();
        }
        int i2 = this.f177685b;
        return (i2 == 0 || i2 == this.f177686c) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i2 >>> 3;
    }

    @Override // p149l.t2y0
    public final int zzd() {
        return this.f177685b;
    }

    @Override // p149l.t2y0
    public final int zze() throws IOException {
        m194942A(0);
        return this.f177684a.mo132299i();
    }

    @Override // p149l.t2y0
    public final int zzf() throws IOException {
        m194942A(5);
        return this.f177684a.mo132301k();
    }

    @Override // p149l.t2y0
    public final int zzg() throws IOException {
        m194942A(0);
        return this.f177684a.mo132303m();
    }

    @Override // p149l.t2y0
    public final int zzh() throws IOException {
        m194942A(5);
        return this.f177684a.mo132304n();
    }

    @Override // p149l.t2y0
    public final int zzi() throws IOException {
        m194942A(0);
        return this.f177684a.mo132305o();
    }

    @Override // p149l.t2y0
    public final int zzj() throws IOException {
        m194942A(0);
        return this.f177684a.mo132307q();
    }

    @Override // p149l.t2y0
    public final long zzk() throws IOException {
        m194942A(1);
        return this.f177684a.mo132308r();
    }

    @Override // p149l.t2y0
    public final long zzl() throws IOException {
        m194942A(0);
        return this.f177684a.mo132309s();
    }

    @Override // p149l.t2y0
    public final long zzm() throws IOException {
        m194942A(1);
        return this.f177684a.mo132311u();
    }

    @Override // p149l.t2y0
    public final long zzn() throws IOException {
        m194942A(0);
        return this.f177684a.mo132312v();
    }

    @Override // p149l.t2y0
    public final long zzo() throws IOException {
        m194942A(0);
        return this.f177684a.mo132313w();
    }

    @Override // p149l.t2y0
    public final zzik zzp() throws IOException {
        m194942A(2);
        return this.f177684a.mo132314x();
    }

    @Override // p149l.t2y0
    public final String zzr() throws IOException {
        m194942A(2);
        return this.f177684a.mo132316z();
    }

    @Override // p149l.t2y0
    public final boolean zzs() throws IOException {
        m194942A(0);
        return this.f177684a.mo132293B();
    }

    @Override // p149l.t2y0
    public final boolean zzt() throws IOException {
        int i;
        if (this.f177684a.mo132292A() || (i = this.f177685b) == this.f177686c) {
            return false;
        }
        return this.f177684a.mo132302l(i);
    }
}
