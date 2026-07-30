package p149l;

import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzce;
import com.google.android.gms.internal.ads.zziz;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import com.tencent.liteav.TXLiteAVCode;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class cey0 implements q6y0 {

    /* JADX INFO: renamed from: a */
    public final g6v0 f80508a;

    /* JADX INFO: renamed from: b */
    public final bnt0 f80509b;

    /* JADX INFO: renamed from: c */
    public final qpt0 f80510c;

    /* JADX INFO: renamed from: d */
    public final zdy0 f80511d;

    /* JADX INFO: renamed from: e */
    public final SparseArray f80512e;

    /* JADX INFO: renamed from: f */
    public asv0 f80513f;

    /* JADX INFO: renamed from: g */
    public ift0 f80514g;

    /* JADX INFO: renamed from: h */
    public ojv0 f80515h;

    /* JADX INFO: renamed from: i */
    public boolean f80516i;

    public cey0(g6v0 g6v0Var) {
        g6v0Var.getClass();
        this.f80508a = g6v0Var;
        this.f80513f = new asv0(ggw0.m126056M(), g6v0Var, new tpv0() { // from class: l.nay0
            @Override // p149l.tpv0
            /* JADX INFO: renamed from: a */
            public final void mo140602a(Object obj, uar0 uar0Var) {
            }
        });
        bnt0 bnt0Var = new bnt0();
        this.f80509b = bnt0Var;
        this.f80510c = new qpt0();
        this.f80511d = new zdy0(bnt0Var);
        this.f80512e = new SparseArray();
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m106357X(cey0 cey0Var) {
        final s6y0 s6y0VarM106379V = cey0Var.m106379V();
        cey0Var.m106382Z(s6y0VarM106379V, TXLiteAVCode.EVT_SW_ENCODER_START_SUCC, new gnv0() { // from class: l.b7y0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
        cey0Var.f80513f.m98628e();
    }

    @Override // p149l.q6y0
    /* JADX INFO: renamed from: A */
    public final void mo106358A(final Object obj, final long j) {
        final s6y0 s6y0VarM106390d0 = m106390d0();
        m106382Z(s6y0VarM106390d0, 26, new gnv0() { // from class: l.fdy0
            @Override // p149l.gnv0
            public final void zza(Object obj2) {
                ((x6y0) obj2).mo154345b(s6y0VarM106390d0, obj, j);
            }
        });
    }

    @Override // p149l.jbt0
    /* JADX INFO: renamed from: B */
    public final void mo106359B(final aet0 aet0Var, final aet0 aet0Var2, final int i) {
        if (i == 1) {
            this.f80516i = false;
            i = 1;
        }
        zdy0 zdy0Var = this.f80511d;
        ift0 ift0Var = this.f80514g;
        ift0Var.getClass();
        zdy0Var.m218252g(ift0Var);
        final s6y0 s6y0VarM106379V = m106379V();
        m106382Z(s6y0VarM106379V, 11, new gnv0() { // from class: l.wcy0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
                ((x6y0) obj).mo154356m(s6y0VarM106379V, aet0Var, aet0Var2, i);
            }
        });
    }

    @Override // p149l.q6y0
    /* JADX INFO: renamed from: C */
    public final void mo106360C(final Exception exc) {
        final s6y0 s6y0VarM106390d0 = m106390d0();
        m106382Z(s6y0VarM106390d0, 1030, new gnv0() { // from class: l.a9y0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.q6y0
    /* JADX INFO: renamed from: D */
    public final void mo106361D(final long j, final int i) {
        final s6y0 s6y0VarM106388c0 = m106388c0();
        m106382Z(s6y0VarM106388c0, 1021, new gnv0(j, i) { // from class: l.qay0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.q6y0
    /* JADX INFO: renamed from: E */
    public final void mo106362E(final pnx0 pnx0Var) {
        final s6y0 s6y0VarM106388c0 = m106388c0();
        m106382Z(s6y0VarM106388c0, 1020, new gnv0() { // from class: l.hcy0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
                ((x6y0) obj).mo154358p(s6y0VarM106388c0, pnx0Var);
            }
        });
    }

    @Override // p149l.jbt0
    /* JADX INFO: renamed from: F */
    public final void mo106363F(final boolean z, final int i) {
        final s6y0 s6y0VarM106379V = m106379V();
        m106382Z(s6y0VarM106379V, 5, new gnv0(z, i) { // from class: l.lay0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.q6y0
    /* JADX INFO: renamed from: G */
    public final void mo106364G(final pnx0 pnx0Var) {
        final s6y0 s6y0VarM106390d0 = m106390d0();
        m106382Z(s6y0VarM106390d0, 1015, new gnv0() { // from class: l.zcy0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.q6y0
    /* JADX INFO: renamed from: H */
    public final void mo106365H(final Exception exc) {
        final s6y0 s6y0VarM106390d0 = m106390d0();
        m106382Z(s6y0VarM106390d0, 1014, new gnv0() { // from class: l.qdy0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.q6y0
    @CallSuper
    /* JADX INFO: renamed from: I */
    public final void mo106366I(final ift0 ift0Var, Looper looper) {
        boolean z = true;
        if (this.f80514g != null && !this.f80511d.f202749b.isEmpty()) {
            z = false;
        }
        f5v0.m119535f(z);
        ift0Var.getClass();
        this.f80514g = ift0Var;
        this.f80515h = this.f80508a.mo100826a(looper, null);
        this.f80513f = this.f80513f.m98624a(looper, new tpv0() { // from class: l.j9y0
            @Override // p149l.tpv0
            /* JADX INFO: renamed from: a */
            public final void mo140602a(Object obj, uar0 uar0Var) {
                this.f116987a.m106381Y(ift0Var, (x6y0) obj, uar0Var);
            }
        });
    }

    @Override // p149l.q6y0
    /* JADX INFO: renamed from: J */
    public final void mo106367J(List list, @Nullable eqy0 eqy0Var) {
        ift0 ift0Var = this.f80514g;
        ift0Var.getClass();
        this.f80511d.m218253h(list, eqy0Var, ift0Var);
    }

    @Override // p149l.jbt0
    /* JADX INFO: renamed from: K */
    public final void mo106368K(xqt0 xqt0Var, final int i) {
        ift0 ift0Var = this.f80514g;
        ift0Var.getClass();
        this.f80511d.m218254i(ift0Var);
        final s6y0 s6y0VarM106379V = m106379V();
        m106382Z(s6y0VarM106379V, 0, new gnv0(i) { // from class: l.l8y0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.q6y0
    /* JADX INFO: renamed from: L */
    public final void mo106369L(final mhr0 mhr0Var, @Nullable final tnx0 tnx0Var) {
        final s6y0 s6y0VarM106390d0 = m106390d0();
        m106382Z(s6y0VarM106390d0, 1009, new gnv0() { // from class: l.tcy0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
                ((x6y0) obj).mo154344a(s6y0VarM106390d0, mhr0Var, tnx0Var);
            }
        });
    }

    @Override // p149l.gry0
    /* JADX INFO: renamed from: M */
    public final void mo106370M(int i, @Nullable eqy0 eqy0Var, final vpy0 vpy0Var, final aqy0 aqy0Var) {
        final s6y0 s6y0VarM106386b0 = m106386b0(i, eqy0Var);
        m106382Z(s6y0VarM106386b0, 1000, new gnv0() { // from class: l.k7y0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.gry0
    /* JADX INFO: renamed from: N */
    public final void mo106371N(int i, @Nullable eqy0 eqy0Var, final vpy0 vpy0Var, final aqy0 aqy0Var) {
        final s6y0 s6y0VarM106386b0 = m106386b0(i, eqy0Var);
        m106382Z(s6y0VarM106386b0, 1002, new gnv0() { // from class: l.vay0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.jbt0
    /* JADX INFO: renamed from: O */
    public final void mo106372O(final lqs0 lqs0Var) {
        final s6y0 s6y0VarM106379V = m106379V();
        m106382Z(s6y0VarM106379V, 14, new gnv0() { // from class: l.tdy0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.gry0
    /* JADX INFO: renamed from: P */
    public final void mo106373P(int i, @Nullable eqy0 eqy0Var, final vpy0 vpy0Var, final aqy0 aqy0Var) {
        final s6y0 s6y0VarM106386b0 = m106386b0(i, eqy0Var);
        m106382Z(s6y0VarM106386b0, 1001, new gnv0() { // from class: l.bcy0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.jbt0
    /* JADX INFO: renamed from: Q */
    public final void mo106374Q(final boolean z, final int i) {
        final s6y0 s6y0VarM106379V = m106379V();
        m106382Z(s6y0VarM106379V, -1, new gnv0(z, i) { // from class: l.m9y0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.q6y0
    @CallSuper
    /* JADX INFO: renamed from: R */
    public final void mo106375R(x6y0 x6y0Var) {
        this.f80513f.m98629f(x6y0Var);
    }

    @Override // p149l.q6y0
    @CallSuper
    /* JADX INFO: renamed from: S */
    public final void mo106376S(x6y0 x6y0Var) {
        this.f80513f.m98625b(x6y0Var);
    }

    @Override // p149l.q6y0
    /* JADX INFO: renamed from: T */
    public final void mo106377T(final int i, final long j, final long j2) {
        final s6y0 s6y0VarM106390d0 = m106390d0();
        m106382Z(s6y0VarM106390d0, 1011, new gnv0(i, j, j2) { // from class: l.d9y0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.gry0
    /* JADX INFO: renamed from: U */
    public final void mo106378U(int i, @Nullable eqy0 eqy0Var, final aqy0 aqy0Var) {
        final s6y0 s6y0VarM106386b0 = m106386b0(i, eqy0Var);
        m106382Z(s6y0VarM106386b0, 1004, new gnv0() { // from class: l.say0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
                ((x6y0) obj).mo154349f(s6y0VarM106386b0, aqy0Var);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public final s6y0 m106379V() {
        return m106384a0(this.f80511d.m218248b());
    }

    @RequiresNonNull({GameIdentity.player})
    /* JADX INFO: renamed from: W */
    public final s6y0 m106380W(xqt0 xqt0Var, int i, @Nullable eqy0 eqy0Var) {
        eqy0 eqy0Var2 = true == xqt0Var.m210615o() ? null : eqy0Var;
        long jZza = this.f80508a.zza();
        boolean z = xqt0Var.equals(this.f80514g.zzn()) && i == this.f80514g.zzd();
        long jM126052I = 0;
        if (eqy0Var2 == null || !eqy0Var2.m117807b()) {
            if (z) {
                jM126052I = this.f80514g.zzj();
            } else if (!xqt0Var.m210615o()) {
                long j = xqt0Var.mo112552e(i, this.f80510c, 0L).f155825l;
                jM126052I = ggw0.m126052I(0L);
            }
        } else if (z && this.f80514g.zzb() == eqy0Var2.f92868b && this.f80514g.zzc() == eqy0Var2.f92869c) {
            jM126052I = this.f80514g.zzk();
        }
        return new s6y0(jZza, xqt0Var, i, eqy0Var2, jM126052I, this.f80514g.zzn(), this.f80514g.zzd(), this.f80511d.m218248b(), this.f80514g.zzk(), this.f80514g.zzm());
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m106381Y(ift0 ift0Var, x6y0 x6y0Var, uar0 uar0Var) {
        x6y0Var.mo154347d(ift0Var, new v6y0(uar0Var, this.f80512e));
    }

    /* JADX INFO: renamed from: Z */
    public final void m106382Z(s6y0 s6y0Var, int i, gnv0 gnv0Var) {
        this.f80512e.put(i, s6y0Var);
        asv0 asv0Var = this.f80513f;
        asv0Var.m98627d(i, gnv0Var);
        asv0Var.m98626c();
    }

    @Override // p149l.jbt0
    /* JADX INFO: renamed from: a */
    public final void mo106383a(final boolean z) {
        final s6y0 s6y0VarM106379V = m106379V();
        m106382Z(s6y0VarM106379V, 7, new gnv0(z) { // from class: l.s9y0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public final s6y0 m106384a0(@Nullable eqy0 eqy0Var) {
        this.f80514g.getClass();
        xqt0 xqt0VarM218247a = eqy0Var == null ? null : this.f80511d.m218247a(eqy0Var);
        if (eqy0Var != null && xqt0VarM218247a != null) {
            return m106380W(xqt0VarM218247a, xqt0VarM218247a.mo112558n(eqy0Var.f92867a, this.f80509b).f76445c, eqy0Var);
        }
        int iZzd = this.f80514g.zzd();
        xqt0 xqt0VarZzn = this.f80514g.zzn();
        if (iZzd >= xqt0VarZzn.mo113618c()) {
            xqt0VarZzn = xqt0.f194042a;
        }
        return m106380W(xqt0VarZzn, iZzd, null);
    }

    @Override // p149l.q6y0
    /* JADX INFO: renamed from: b */
    public final void mo106385b(final long j) {
        final s6y0 s6y0VarM106390d0 = m106390d0();
        m106382Z(s6y0VarM106390d0, 1010, new gnv0(j) { // from class: l.p9y0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public final s6y0 m106386b0(int i, @Nullable eqy0 eqy0Var) {
        ift0 ift0Var = this.f80514g;
        ift0Var.getClass();
        if (eqy0Var != null) {
            return this.f80511d.m218247a(eqy0Var) != null ? m106384a0(eqy0Var) : m106380W(xqt0.f194042a, i, eqy0Var);
        }
        xqt0 xqt0VarZzn = ift0Var.zzn();
        if (i >= xqt0VarZzn.mo113618c()) {
            xqt0VarZzn = xqt0.f194042a;
        }
        return m106380W(xqt0VarZzn, i, null);
    }

    @Override // p149l.q6y0
    /* JADX INFO: renamed from: c */
    public final void mo106387c(final String str) {
        final s6y0 s6y0VarM106390d0 = m106390d0();
        m106382Z(s6y0VarM106390d0, 1019, new gnv0() { // from class: l.cay0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public final s6y0 m106388c0() {
        return m106384a0(this.f80511d.m218250d());
    }

    @Override // p149l.q6y0
    /* JADX INFO: renamed from: d */
    public final void mo106389d(final String str, final long j, final long j2) {
        final s6y0 s6y0VarM106390d0 = m106390d0();
        m106382Z(s6y0VarM106390d0, 1008, new gnv0(str, j2, j) { // from class: l.x9y0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f191670b;

            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final s6y0 m106390d0() {
        return m106384a0(this.f80511d.m218251e());
    }

    @Override // p149l.q6y0
    /* JADX INFO: renamed from: e */
    public final void mo106391e(final Exception exc) {
        final s6y0 s6y0VarM106390d0 = m106390d0();
        m106382Z(s6y0VarM106390d0, TXLiteAVCode.EVT_LOCAL_RECORD_RESULT, new gnv0() { // from class: l.idy0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public final s6y0 m106392e0(@Nullable zzce zzceVar) {
        eqy0 eqy0Var;
        return (!(zzceVar instanceof zziz) || (eqy0Var = ((zziz) zzceVar).zzj) == null) ? m106379V() : m106384a0(eqy0Var);
    }

    @Override // p149l.q6y0
    /* JADX INFO: renamed from: f */
    public final void mo106393f(final mhr0 mhr0Var, @Nullable final tnx0 tnx0Var) {
        final s6y0 s6y0VarM106390d0 = m106390d0();
        m106382Z(s6y0VarM106390d0, 1017, new gnv0() { // from class: l.ecy0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
                ((x6y0) obj).mo154350g(s6y0VarM106390d0, mhr0Var, tnx0Var);
            }
        });
    }

    @Override // p149l.jbt0
    /* JADX INFO: renamed from: g */
    public final void mo106394g(final c5t0 c5t0Var) {
        final s6y0 s6y0VarM106379V = m106379V();
        m106382Z(s6y0VarM106379V, 12, new gnv0() { // from class: l.z6y0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.q6y0
    @CallSuper
    /* JADX INFO: renamed from: h */
    public final void mo106395h() {
        ojv0 ojv0Var = this.f80515h;
        f5v0.m119531b(ojv0Var);
        ojv0Var.mo164792g(new Runnable() { // from class: l.cdy0
            @Override // java.lang.Runnable
            public final void run() {
                cey0.m106357X(this.f80422a);
            }
        });
    }

    @Override // p149l.jbt0
    /* JADX INFO: renamed from: i */
    public final void mo106396i(final iat0 iat0Var) {
        final s6y0 s6y0VarM106379V = m106379V();
        m106382Z(s6y0VarM106379V, 13, new gnv0() { // from class: l.m7y0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.jbt0
    /* JADX INFO: renamed from: j */
    public final void mo106397j(final ueu0 ueu0Var) {
        final s6y0 s6y0VarM106390d0 = m106390d0();
        m106382Z(s6y0VarM106390d0, 25, new gnv0() { // from class: l.ncy0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
                s6y0 s6y0Var = s6y0VarM106390d0;
                ueu0 ueu0Var2 = ueu0Var;
                ((x6y0) obj).mo154359q(s6y0Var, ueu0Var2);
                int i = ueu0Var2.f176206a;
            }
        });
    }

    @Override // p149l.jbt0
    /* JADX INFO: renamed from: k */
    public final void mo106398k(@Nullable final nis0 nis0Var, final int i) {
        final s6y0 s6y0VarM106379V = m106379V();
        m106382Z(s6y0VarM106379V, 1, new gnv0(nis0Var, i) { // from class: l.o8y0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ nis0 f142685b;

            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.q6y0
    /* JADX INFO: renamed from: l */
    public final void mo106399l(final int i, final long j) {
        final s6y0 s6y0VarM106388c0 = m106388c0();
        m106382Z(s6y0VarM106388c0, 1018, new gnv0() { // from class: l.fay0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
                ((x6y0) obj).mo154353j(s6y0VarM106388c0, i, j);
            }
        });
    }

    @Override // p149l.jbt0
    /* JADX INFO: renamed from: m */
    public final void mo106400m(final zzce zzceVar) {
        final s6y0 s6y0VarM106392e0 = m106392e0(zzceVar);
        m106382Z(s6y0VarM106392e0, 10, new gnv0() { // from class: l.yay0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
                ((x6y0) obj).mo154346c(s6y0VarM106392e0, zzceVar);
            }
        });
    }

    @Override // p149l.jbt0
    /* JADX INFO: renamed from: n */
    public final void mo106401n(final int i) {
        final s6y0 s6y0VarM106379V = m106379V();
        m106382Z(s6y0VarM106379V, 6, new gnv0(i) { // from class: l.z9y0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.q6y0
    /* JADX INFO: renamed from: o */
    public final void mo106402o(final dhy0 dhy0Var) {
        final s6y0 s6y0VarM106390d0 = m106390d0();
        m106382Z(s6y0VarM106390d0, 1031, new gnv0() { // from class: l.kcy0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.uwy0
    /* JADX INFO: renamed from: p */
    public final void mo106403p(final int i, final long j, final long j2) {
        final s6y0 s6y0VarM106384a0 = m106384a0(this.f80511d.m218249c());
        m106382Z(s6y0VarM106384a0, 1006, new gnv0() { // from class: l.u8y0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
                ((x6y0) obj).mo154351h(s6y0VarM106384a0, i, j, j2);
            }
        });
    }

    @Override // p149l.jbt0
    /* JADX INFO: renamed from: q */
    public final void mo106404q(final boolean z) {
        final s6y0 s6y0VarM106390d0 = m106390d0();
        m106382Z(s6y0VarM106390d0, 23, new gnv0(z) { // from class: l.r8y0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.jbt0
    /* JADX INFO: renamed from: r */
    public final void mo106405r(final int i, final int i2) {
        final s6y0 s6y0VarM106390d0 = m106390d0();
        m106382Z(s6y0VarM106390d0, 24, new gnv0(i, i2) { // from class: l.wdy0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.q6y0
    /* JADX INFO: renamed from: s */
    public final void mo106406s(final dhy0 dhy0Var) {
        final s6y0 s6y0VarM106390d0 = m106390d0();
        m106382Z(s6y0VarM106390d0, 1032, new gnv0() { // from class: l.ndy0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.jbt0
    /* JADX INFO: renamed from: t */
    public final void mo106407t(final float f) {
        final s6y0 s6y0VarM106390d0 = m106390d0();
        m106382Z(s6y0VarM106390d0, 22, new gnv0(f) { // from class: l.x8y0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.jbt0
    /* JADX INFO: renamed from: u */
    public final void mo106408u(@Nullable final zzce zzceVar) {
        final s6y0 s6y0VarM106392e0 = m106392e0(zzceVar);
        m106382Z(s6y0VarM106392e0, 10, new gnv0() { // from class: l.iay0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.q6y0
    /* JADX INFO: renamed from: v */
    public final void mo106409v(final pnx0 pnx0Var) {
        final s6y0 s6y0VarM106388c0 = m106388c0();
        m106382Z(s6y0VarM106388c0, 1013, new gnv0() { // from class: l.bby0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.gry0
    /* JADX INFO: renamed from: w */
    public final void mo106410w(int i, @Nullable eqy0 eqy0Var, final vpy0 vpy0Var, final aqy0 aqy0Var, final IOException iOException, final boolean z) {
        final s6y0 s6y0VarM106386b0 = m106386b0(i, eqy0Var);
        m106382Z(s6y0VarM106386b0, 1003, new gnv0() { // from class: l.g9y0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
                ((x6y0) obj).mo154348e(s6y0VarM106386b0, vpy0Var, aqy0Var, iOException, z);
            }
        });
    }

    @Override // p149l.q6y0
    /* JADX INFO: renamed from: x */
    public final void mo106411x(final pnx0 pnx0Var) {
        final s6y0 s6y0VarM106390d0 = m106390d0();
        m106382Z(s6y0VarM106390d0, 1007, new gnv0() { // from class: l.d7y0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.jbt0
    /* JADX INFO: renamed from: y */
    public final void mo106412y(final o8u0 o8u0Var) {
        final s6y0 s6y0VarM106379V = m106379V();
        m106382Z(s6y0VarM106379V, 2, new gnv0() { // from class: l.u9y0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.q6y0
    /* JADX INFO: renamed from: z */
    public final void mo106413z(final String str, final long j, final long j2) {
        final s6y0 s6y0VarM106390d0 = m106390d0();
        m106382Z(s6y0VarM106390d0, 1016, new gnv0(str, j2, j) { // from class: l.ldy0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f127625b;

            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.jbt0
    public final void zzb(final boolean z) {
        final s6y0 s6y0VarM106379V = m106379V();
        m106382Z(s6y0VarM106379V, 3, new gnv0(z) { // from class: l.f7y0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.jbt0
    public final void zzh(final int i) {
        final s6y0 s6y0VarM106379V = m106379V();
        m106382Z(s6y0VarM106379V, 4, new gnv0() { // from class: l.eby0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
                ((x6y0) obj).mo154357o(s6y0VarM106379V, i);
            }
        });
    }

    @Override // p149l.q6y0
    public final void zzu() {
        if (this.f80516i) {
            return;
        }
        final s6y0 s6y0VarM106379V = m106379V();
        this.f80516i = true;
        m106382Z(s6y0VarM106379V, -1, new gnv0() { // from class: l.qcy0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p149l.q6y0
    public final void zzx(final String str) {
        final s6y0 s6y0VarM106390d0 = m106390d0();
        m106382Z(s6y0VarM106390d0, 1012, new gnv0() { // from class: l.h7y0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
            }
        });
    }
}
