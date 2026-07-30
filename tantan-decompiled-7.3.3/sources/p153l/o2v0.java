package p153l;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.atomic.AtomicBoolean;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes6.dex */
public final class o2v0 {

    /* JADX INFO: renamed from: a */
    public final qws0 f144789a;

    /* JADX INFO: renamed from: b */
    public final ioy0 f144790b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f144791c;

    /* JADX INFO: renamed from: d */
    public final vcl0 f144792d;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public final p7s0 f144793e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public har0 f144794f;

    /* JADX INFO: renamed from: g */
    public d70 f144795g;

    /* JADX INFO: renamed from: h */
    public w70[] f144796h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public mv0 f144797i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public oys0 f144798j;

    /* JADX INFO: renamed from: k */
    public kfl0 f144799k;

    /* JADX INFO: renamed from: l */
    public String f144800l;

    /* JADX INFO: renamed from: m */
    @NotOnlyInitialized
    public final ViewGroup f144801m;

    /* JADX INFO: renamed from: n */
    public int f144802n;

    /* JADX INFO: renamed from: o */
    public boolean f144803o;

    @VisibleForTesting
    public o2v0(ViewGroup viewGroup, @Nullable AttributeSet attributeSet, boolean z, ioy0 ioy0Var, @Nullable oys0 oys0Var, int i) {
        zzq zzqVarM12309J;
        this.f144789a = new qws0();
        this.f144792d = new vcl0();
        this.f144793e = new g0v0(this);
        this.f144801m = viewGroup;
        this.f144790b = ioy0Var;
        this.f144798j = null;
        this.f144791c = new AtomicBoolean(false);
        this.f144802n = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                e5z0 e5z0Var = new e5z0(context, attributeSet);
                this.f144796h = e5z0Var.m119566b(z);
                this.f144800l = e5z0Var.m119565a();
                if (viewGroup.isInEditMode()) {
                    obt0 obt0VarM148569b = k6s0.m148569b();
                    w70 w70Var = this.f144796h[0];
                    int i2 = this.f144802n;
                    if (w70Var.equals(w70.f187689q)) {
                        zzqVarM12309J = zzq.m12309J();
                    } else {
                        zzq zzqVar = new zzq(context, w70Var);
                        zzqVar.zzj = m165769c(i2);
                        zzqVarM12309J = zzqVar;
                    }
                    obt0VarM148569b.m167060o(viewGroup, zzqVarM12309J, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                k6s0.m148569b().m167059n(viewGroup, new zzq(context, w70.f187681i), e.getMessage(), e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static zzq m165768b(Context context, w70[] w70VarArr, int i) {
        for (w70 w70Var : w70VarArr) {
            if (w70Var.equals(w70.f187689q)) {
                return zzq.m12309J();
            }
        }
        zzq zzqVar = new zzq(context, w70VarArr);
        zzqVar.zzj = m165769c(i);
        return zzqVar;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m165769c(int i) {
        return i == 1;
    }

    /* JADX INFO: renamed from: A */
    public final void m165771A(kfl0 kfl0Var) {
        this.f144799k = kfl0Var;
        try {
            oys0 oys0Var = this.f144798j;
            if (oys0Var != null) {
                oys0Var.mo113761e2(kfl0Var == null ? null : new zzfk(kfl0Var));
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final w70[] m165772a() {
        return this.f144796h;
    }

    /* JADX INFO: renamed from: d */
    public final d70 m165773d() {
        return this.f144795g;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final w70 m165774e() {
        zzq zzqVarZzg;
        try {
            oys0 oys0Var = this.f144798j;
            if (oys0Var != null && (zzqVarZzg = oys0Var.zzg()) != null) {
                return l9s0.m153448c(zzqVarZzg.zze, zzqVarZzg.zzb, zzqVarZzg.zza);
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
        w70[] w70VarArr = this.f144796h;
        if (w70VarArr != null) {
            return w70VarArr[0];
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final an50 m165775f() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final n5d0 m165776g() {
        tlu0 tlu0VarZzk = null;
        try {
            oys0 oys0Var = this.f144798j;
            if (oys0Var != null) {
                tlu0VarZzk = oys0Var.zzk();
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
        return n5d0.m161698d(tlu0VarZzk);
    }

    /* JADX INFO: renamed from: i */
    public final vcl0 m165777i() {
        return this.f144792d;
    }

    /* JADX INFO: renamed from: j */
    public final kfl0 m165778j() {
        return this.f144799k;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final mv0 m165779k() {
        return this.f144797i;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final lpu0 m165780l() {
        oys0 oys0Var = this.f144798j;
        if (oys0Var != null) {
            try {
                return oys0Var.zzl();
            } catch (RemoteException e) {
                dct0.m115300i("#007 Could not call remote method.", e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final String m165781m() {
        oys0 oys0Var;
        if (this.f144800l == null && (oys0Var = this.f144798j) != null) {
            try {
                this.f144800l = oys0Var.zzr();
            } catch (RemoteException e) {
                dct0.m115300i("#007 Could not call remote method.", e);
            }
        }
        return this.f144800l;
    }

    /* JADX INFO: renamed from: n */
    public final void m165782n() {
        try {
            oys0 oys0Var = this.f144798j;
            if (oys0Var != null) {
                oys0Var.mo113764g();
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m165783o(p1m p1mVar) {
        this.f144801m.addView((View) h950.m134037P2(p1mVar));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d2 A[Catch: RemoteException -> 0x00d0, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00d0, blocks: (B:27:0x009f, B:29:0x00a5, B:31:0x00b3, B:33:0x00c5, B:36:0x00d2), top: B:49:0x009f, outer: #1 }] */
    /* JADX INFO: renamed from: p */
    public final void m165784p(xxu0 xxu0Var) {
        try {
            if (this.f144798j == null) {
                if (this.f144796h == null || this.f144800l == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.f144801m.getContext();
                zzq zzqVarM165768b = m165768b(context, this.f144796h, this.f144802n);
                oys0 oys0Var = "search_v2".equals(zzqVarM165768b.zza) ? (oys0) new ppr0(k6s0.m148568a(), context, zzqVarM165768b, this.f144800l).m218609d(context, false) : (oys0) new umr0(k6s0.m148568a(), context, zzqVarM165768b, this.f144800l, this.f144789a).m218609d(context, false);
                this.f144798j = oys0Var;
                oys0Var.mo113778x2(new frw0(this.f144793e));
                har0 har0Var = this.f144794f;
                if (har0Var != null) {
                    this.f144798j.mo113743C5(new x9s0(har0Var));
                }
                mv0 mv0Var = this.f144797i;
                if (mv0Var != null) {
                    this.f144798j.mo113767l1(new u7s0(mv0Var));
                }
                if (this.f144799k != null) {
                    this.f144798j.mo113761e2(new zzfk(this.f144799k));
                }
                this.f144798j.mo113747H3(new u3w0(null));
                this.f144798j.mo113774s4(this.f144803o);
                oys0 oys0Var2 = this.f144798j;
                if (oys0Var2 != null) {
                    try {
                        final p1m p1mVarZzn = oys0Var2.zzn();
                        if (p1mVarZzn != null) {
                            if (((Boolean) wis0.f189389f.m149974e()).booleanValue()) {
                                if (((Boolean) jas0.m144075c().m176505a(sgs0.f167998Ga)).booleanValue()) {
                                    obt0.f146613b.post(new Runnable() { // from class: l.czu0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.f84497a.m165783o(p1mVarZzn);
                                        }
                                    });
                                } else {
                                    this.f144801m.addView((View) h950.m134037P2(p1mVarZzn));
                                }
                            } else {
                                this.f144801m.addView((View) h950.m134037P2(p1mVarZzn));
                            }
                        }
                    } catch (RemoteException e) {
                        dct0.m115300i("#007 Could not call remote method.", e);
                    }
                }
            }
            oys0 oys0Var3 = this.f144798j;
            if (oys0Var3 == null) {
                throw null;
            }
            oys0Var3.mo113762f2(this.f144790b.m141359a(this.f144801m.getContext(), xxu0Var));
        } catch (RemoteException e2) {
            dct0.m115300i("#007 Could not call remote method.", e2);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m165785q() {
        try {
            oys0 oys0Var = this.f144798j;
            if (oys0Var != null) {
                oys0Var.mo113745G();
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m165786r() {
        try {
            oys0 oys0Var = this.f144798j;
            if (oys0Var != null) {
                oys0Var.mo113751J();
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m165787s(@Nullable har0 har0Var) {
        try {
            this.f144794f = har0Var;
            oys0 oys0Var = this.f144798j;
            if (oys0Var != null) {
                oys0Var.mo113743C5(har0Var != null ? new x9s0(har0Var) : null);
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m165788t(d70 d70Var) {
        this.f144795g = d70Var;
        this.f144793e.m171165K(d70Var);
    }

    /* JADX INFO: renamed from: u */
    public final void m165789u(w70... w70VarArr) {
        if (this.f144796h == null) {
            m165790v(w70VarArr);
        } else {
            wtq0.m207906a("The ad size can only be set once on AdView.");
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m165790v(w70... w70VarArr) {
        this.f144796h = w70VarArr;
        try {
            oys0 oys0Var = this.f144798j;
            if (oys0Var != null) {
                oys0Var.mo113757R3(m165768b(this.f144801m.getContext(), this.f144796h, this.f144802n));
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
        this.f144801m.requestLayout();
    }

    /* JADX INFO: renamed from: w */
    public final void m165791w(String str) {
        if (this.f144800l == null) {
            this.f144800l = str;
        } else {
            wtq0.m207906a("The ad unit ID can only be set once on AdView.");
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m165792x(@Nullable mv0 mv0Var) {
        try {
            this.f144797i = mv0Var;
            oys0 oys0Var = this.f144798j;
            if (oys0Var != null) {
                oys0Var.mo113767l1(mv0Var != null ? new u7s0(mv0Var) : null);
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m165793y(boolean z) {
        this.f144803o = z;
        try {
            oys0 oys0Var = this.f144798j;
            if (oys0Var != null) {
                oys0Var.mo113774s4(z);
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m165794z(@Nullable an50 an50Var) {
        try {
            oys0 oys0Var = this.f144798j;
            if (oys0Var != null) {
                oys0Var.mo113747H3(new u3w0(an50Var));
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    public o2v0(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, ioy0.f116230a, null, i);
    }

    public o2v0(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, ioy0.f116230a, null, 0);
    }

    public o2v0(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, z, ioy0.f116230a, null, i);
    }

    public o2v0(ViewGroup viewGroup) {
        this(viewGroup, null, false, ioy0.f116230a, null, 0);
    }
}
