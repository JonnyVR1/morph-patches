package p149l;

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
public final class itu0 {

    /* JADX INFO: renamed from: a */
    public final kns0 f114932a;

    /* JADX INFO: renamed from: b */
    public final cfy0 f114933b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f114934c;

    /* JADX INFO: renamed from: d */
    public final q3l0 f114935d;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public final jyr0 f114936e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public b1r0 f114937f;

    /* JADX INFO: renamed from: g */
    public h70 f114938g;

    /* JADX INFO: renamed from: h */
    public a80[] f114939h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public fv0 f114940i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public ips0 f114941j;

    /* JADX INFO: renamed from: k */
    public g6l0 f114942k;

    /* JADX INFO: renamed from: l */
    public String f114943l;

    /* JADX INFO: renamed from: m */
    @NotOnlyInitialized
    public final ViewGroup f114944m;

    /* JADX INFO: renamed from: n */
    public int f114945n;

    /* JADX INFO: renamed from: o */
    public boolean f114946o;

    @VisibleForTesting
    public itu0(ViewGroup viewGroup, @Nullable AttributeSet attributeSet, boolean z, cfy0 cfy0Var, @Nullable ips0 ips0Var, int i) {
        zzq zzqVarM12255J;
        this.f114932a = new kns0();
        this.f114935d = new q3l0();
        this.f114936e = new aru0(this);
        this.f114944m = viewGroup;
        this.f114933b = cfy0Var;
        this.f114941j = null;
        this.f114934c = new AtomicBoolean(false);
        this.f114945n = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                yvy0 yvy0Var = new yvy0(context, attributeSet);
                this.f114939h = yvy0Var.m216247b(z);
                this.f114943l = yvy0Var.m216246a();
                if (viewGroup.isInEditMode()) {
                    i2t0 i2t0VarM118703b = exr0.m118703b();
                    a80 a80Var = this.f114939h[0];
                    int i2 = this.f114945n;
                    if (a80Var.equals(a80.f67976q)) {
                        zzqVarM12255J = zzq.m12255J();
                    } else {
                        zzq zzqVar = new zzq(context, a80Var);
                        zzqVar.zzj = m138252c(i2);
                        zzqVarM12255J = zzqVar;
                    }
                    i2t0VarM118703b.m134107o(viewGroup, zzqVarM12255J, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                exr0.m118703b().m134106n(viewGroup, new zzq(context, a80.f67968i), e.getMessage(), e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static zzq m138251b(Context context, a80[] a80VarArr, int i) {
        for (a80 a80Var : a80VarArr) {
            if (a80Var.equals(a80.f67976q)) {
                return zzq.m12255J();
            }
        }
        zzq zzqVar = new zzq(context, a80VarArr);
        zzqVar.zzj = m138252c(i);
        return zzqVar;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m138252c(int i) {
        return i == 1;
    }

    /* JADX INFO: renamed from: A */
    public final void m138254A(g6l0 g6l0Var) {
        this.f114942k = g6l0Var;
        try {
            ips0 ips0Var = this.f114941j;
            if (ips0Var != null) {
                ips0Var.mo137590e2(g6l0Var == null ? null : new zzfk(g6l0Var));
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final a80[] m138255a() {
        return this.f114939h;
    }

    /* JADX INFO: renamed from: d */
    public final h70 m138256d() {
        return this.f114938g;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final a80 m138257e() {
        zzq zzqVarZzg;
        try {
            ips0 ips0Var = this.f114941j;
            if (ips0Var != null && (zzqVarZzg = ips0Var.zzg()) != null) {
                return f0s0.m119045c(zzqVarZzg.zze, zzqVarZzg.zzb, zzqVarZzg.zza);
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
        a80[] a80VarArr = this.f114939h;
        if (a80VarArr != null) {
            return a80VarArr[0];
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final te50 m138258f() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final kxc0 m138259g() {
        ncu0 ncu0VarZzk = null;
        try {
            ips0 ips0Var = this.f114941j;
            if (ips0Var != null) {
                ncu0VarZzk = ips0Var.zzk();
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
        return kxc0.m147729d(ncu0VarZzk);
    }

    /* JADX INFO: renamed from: i */
    public final q3l0 m138260i() {
        return this.f114935d;
    }

    /* JADX INFO: renamed from: j */
    public final g6l0 m138261j() {
        return this.f114942k;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final fv0 m138262k() {
        return this.f114940i;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final fgu0 m138263l() {
        ips0 ips0Var = this.f114941j;
        if (ips0Var != null) {
            try {
                return ips0Var.zzl();
            } catch (RemoteException e) {
                x2t0.m206871i("#007 Could not call remote method.", e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final String m138264m() {
        ips0 ips0Var;
        if (this.f114943l == null && (ips0Var = this.f114941j) != null) {
            try {
                this.f114943l = ips0Var.zzr();
            } catch (RemoteException e) {
                x2t0.m206871i("#007 Could not call remote method.", e);
            }
        }
        return this.f114943l;
    }

    /* JADX INFO: renamed from: n */
    public final void m138265n() {
        try {
            ips0 ips0Var = this.f114941j;
            if (ips0Var != null) {
                ips0Var.mo137593g();
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m138266o(uyl uylVar) {
        this.f114944m.addView((View) s050.m181847P2(uylVar));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d2 A[Catch: RemoteException -> 0x00d0, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00d0, blocks: (B:27:0x009f, B:29:0x00a5, B:31:0x00b3, B:33:0x00c5, B:36:0x00d2), top: B:49:0x009f, outer: #1 }] */
    /* JADX INFO: renamed from: p */
    public final void m138267p(rou0 rou0Var) {
        try {
            if (this.f114941j == null) {
                if (this.f114939h == null || this.f114943l == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.f114944m.getContext();
                zzq zzqVarM138251b = m138251b(context, this.f114939h, this.f114945n);
                ips0 ips0Var = "search_v2".equals(zzqVarM138251b.zza) ? (ips0) new jgr0(exr0.m118702a(), context, zzqVarM138251b, this.f114943l).m190780d(context, false) : (ips0) new odr0(exr0.m118702a(), context, zzqVarM138251b, this.f114943l, this.f114932a).m190780d(context, false);
                this.f114941j = ips0Var;
                ips0Var.mo137603x2(new zhw0(this.f114936e));
                b1r0 b1r0Var = this.f114937f;
                if (b1r0Var != null) {
                    this.f114941j.mo137575C5(new r0s0(b1r0Var));
                }
                fv0 fv0Var = this.f114940i;
                if (fv0Var != null) {
                    this.f114941j.mo137595l1(new oyr0(fv0Var));
                }
                if (this.f114942k != null) {
                    this.f114941j.mo137590e2(new zzfk(this.f114942k));
                }
                this.f114941j.mo137579H3(new ouv0(null));
                this.f114941j.mo137599s4(this.f114946o);
                ips0 ips0Var2 = this.f114941j;
                if (ips0Var2 != null) {
                    try {
                        final uyl uylVarZzn = ips0Var2.zzn();
                        if (uylVarZzn != null) {
                            if (((Boolean) q9s0.f153475f.m115379e()).booleanValue()) {
                                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131927Ga)).booleanValue()) {
                                    i2t0.f110583b.post(new Runnable() { // from class: l.wpu0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.f187579a.m138266o(uylVarZzn);
                                        }
                                    });
                                } else {
                                    this.f114944m.addView((View) s050.m181847P2(uylVarZzn));
                                }
                            } else {
                                this.f114944m.addView((View) s050.m181847P2(uylVarZzn));
                            }
                        }
                    } catch (RemoteException e) {
                        x2t0.m206871i("#007 Could not call remote method.", e);
                    }
                }
            }
            ips0 ips0Var3 = this.f114941j;
            if (ips0Var3 == null) {
                throw null;
            }
            ips0Var3.mo137591f2(this.f114933b.m106615a(this.f114944m.getContext(), rou0Var));
        } catch (RemoteException e2) {
            x2t0.m206871i("#007 Could not call remote method.", e2);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m138268q() {
        try {
            ips0 ips0Var = this.f114941j;
            if (ips0Var != null) {
                ips0Var.mo137577G();
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m138269r() {
        try {
            ips0 ips0Var = this.f114941j;
            if (ips0Var != null) {
                ips0Var.mo137583J();
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m138270s(@Nullable b1r0 b1r0Var) {
        try {
            this.f114937f = b1r0Var;
            ips0 ips0Var = this.f114941j;
            if (ips0Var != null) {
                ips0Var.mo137575C5(b1r0Var != null ? new r0s0(b1r0Var) : null);
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m138271t(h70 h70Var) {
        this.f114938g = h70Var;
        this.f114936e.m143878K(h70Var);
    }

    /* JADX INFO: renamed from: u */
    public final void m138272u(a80... a80VarArr) {
        if (this.f114939h == null) {
            m138273v(a80VarArr);
        } else {
            qkq0.m175383a("The ad size can only be set once on AdView.");
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m138273v(a80... a80VarArr) {
        this.f114939h = a80VarArr;
        try {
            ips0 ips0Var = this.f114941j;
            if (ips0Var != null) {
                ips0Var.mo137586R3(m138251b(this.f114944m.getContext(), this.f114939h, this.f114945n));
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
        this.f114944m.requestLayout();
    }

    /* JADX INFO: renamed from: w */
    public final void m138274w(String str) {
        if (this.f114943l == null) {
            this.f114943l = str;
        } else {
            qkq0.m175383a("The ad unit ID can only be set once on AdView.");
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m138275x(@Nullable fv0 fv0Var) {
        try {
            this.f114940i = fv0Var;
            ips0 ips0Var = this.f114941j;
            if (ips0Var != null) {
                ips0Var.mo137595l1(fv0Var != null ? new oyr0(fv0Var) : null);
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m138276y(boolean z) {
        this.f114946o = z;
        try {
            ips0 ips0Var = this.f114941j;
            if (ips0Var != null) {
                ips0Var.mo137599s4(z);
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m138277z(@Nullable te50 te50Var) {
        try {
            ips0 ips0Var = this.f114941j;
            if (ips0Var != null) {
                ips0Var.mo137579H3(new ouv0(te50Var));
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    public itu0(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, cfy0.f80684a, null, i);
    }

    public itu0(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, cfy0.f80684a, null, 0);
    }

    public itu0(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, z, cfy0.f80684a, null, i);
    }

    public itu0(ViewGroup viewGroup) {
        this(viewGroup, null, false, cfy0.f80684a, null, 0);
    }
}
