package p153l;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zze;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class put0 implements i6u0, k8u0, j7u0, har0, f7u0, xfu0 {

    /* JADX INFO: renamed from: a */
    public final Context f154226a;

    /* JADX INFO: renamed from: b */
    public final Executor f154227b;

    /* JADX INFO: renamed from: c */
    public final Executor f154228c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f154229d;

    /* JADX INFO: renamed from: e */
    public final b7w0 f154230e;

    /* JADX INFO: renamed from: f */
    public final q6w0 f154231f;

    /* JADX INFO: renamed from: g */
    public final uew0 f154232g;

    /* JADX INFO: renamed from: h */
    public final z7w0 f154233h;

    /* JADX INFO: renamed from: i */
    public final v2s0 f154234i;

    /* JADX INFO: renamed from: j */
    public final his0 f154235j;

    /* JADX INFO: renamed from: k */
    public final cew0 f154236k;

    /* JADX INFO: renamed from: l */
    public final WeakReference f154237l;

    /* JADX INFO: renamed from: m */
    public final WeakReference f154238m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public final z3u0 f154239n;

    /* JADX INFO: renamed from: o */
    public boolean f154240o;

    /* JADX INFO: renamed from: p */
    public final AtomicBoolean f154241p = new AtomicBoolean();

    /* JADX INFO: renamed from: q */
    public final jis0 f154242q;

    public put0(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, b7w0 b7w0Var, q6w0 q6w0Var, uew0 uew0Var, z7w0 z7w0Var, @Nullable View view, @Nullable wit0 wit0Var, v2s0 v2s0Var, his0 his0Var, jis0 jis0Var, cew0 cew0Var, @Nullable z3u0 z3u0Var) {
        this.f154226a = context;
        this.f154227b = executor;
        this.f154228c = executor2;
        this.f154229d = scheduledExecutorService;
        this.f154230e = b7w0Var;
        this.f154231f = q6w0Var;
        this.f154232g = uew0Var;
        this.f154233h = z7w0Var;
        this.f154234i = v2s0Var;
        this.f154237l = new WeakReference(view);
        this.f154238m = new WeakReference(wit0Var);
        this.f154235j = his0Var;
        this.f154242q = jis0Var;
        this.f154236k = cew0Var;
        this.f154239n = z3u0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final void m173908K() {
        String strMo165761h;
        int i;
        List list;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168239ab)).booleanValue() && ((list = this.f154231f.f155879d) == null || list.isEmpty())) {
            return;
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168426p3)).booleanValue()) {
            strMo165761h = this.f154234i.m199147c().mo165761h(this.f154226a, (View) this.f154237l.get(), null);
        } else {
            strMo165761h = null;
        }
        if ((((Boolean) jas0.m144075c().m176505a(sgs0.f168397n0)).booleanValue() && this.f154230e.f75343b.f68854b.f172373g) || !((Boolean) xis0.f194501h.m149974e()).booleanValue()) {
            z7w0 z7w0Var = this.f154233h;
            uew0 uew0Var = this.f154232g;
            b7w0 b7w0Var = this.f154230e;
            q6w0 q6w0Var = this.f154231f;
            z7w0Var.m218921a(uew0Var.m195817d(b7w0Var, q6w0Var, false, strMo165761h, null, q6w0Var.f155879d));
            return;
        }
        if (((Boolean) xis0.f194500g.m149974e()).booleanValue() && ((i = this.f154231f.f155875b) == 1 || i == 2 || i == 5)) {
        }
        pvw0.m173991r((gvw0) pvw0.m173988o(gvw0.m132580C(pvw0.m173981h(null)), ((Long) jas0.m144075c().m176505a(sgs0.f168168V0)).longValue(), TimeUnit.MILLISECONDS, this.f154229d), new out0(this, strMo165761h), this.f154227b);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m173914B(int i, int i2) {
        m173916O(i - 1, i2);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m173915D(final int i, final int i2) {
        this.f154227b.execute(new Runnable() { // from class: l.kut0
            @Override // java.lang.Runnable
            public final void run() {
                this.f128920a.m173914B(i, i2);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final void m173916O(final int i, final int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.f154237l.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            m173908K();
        } else {
            this.f154229d.schedule(new Runnable() { // from class: l.mut0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f138840a.m173915D(i, i2);
                }
            }, i2, TimeUnit.MILLISECONDS);
        }
    }

    @Override // p153l.j7u0
    /* JADX INFO: renamed from: a */
    public final void mo106809a() {
        if (this.f154241p.compareAndSet(false, true)) {
            int iIntValue = ((Integer) jas0.m144075c().m176505a(sgs0.f168537y3)).intValue();
            if (iIntValue > 0) {
                m173916O(iIntValue, ((Integer) jas0.m144075c().m176505a(sgs0.f168549z3)).intValue());
                return;
            }
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168525x3)).booleanValue()) {
                this.f154228c.execute(new Runnable() { // from class: l.iut0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f116982a.zzm();
                    }
                });
            } else {
                m173908K();
            }
        }
    }

    @Override // p153l.i6u0
    /* JADX INFO: renamed from: i */
    public final void mo107087i(f5t0 f5t0Var, String str, String str2) {
        uew0 uew0Var = this.f154232g;
        q6w0 q6w0Var = this.f154231f;
        this.f154233h.m218921a(uew0Var.m195818e(q6w0Var, q6w0Var.f155889i, f5t0Var));
    }

    @Override // p153l.f7u0
    /* JADX INFO: renamed from: k */
    public final void mo124507k(zze zzeVar) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168499v1)).booleanValue()) {
            this.f154233h.m218921a(this.f154232g.m195816c(this.f154230e, this.f154231f, uew0.m195811f(2, zzeVar.zza, this.f154231f.f155903p)));
        }
    }

    @Override // p153l.har0
    public final void onAdClicked() {
        if (!(((Boolean) jas0.m144075c().m176505a(sgs0.f168397n0)).booleanValue() && this.f154230e.f75343b.f68854b.f172373g) && ((Boolean) xis0.f194497d.m149974e()).booleanValue()) {
            pvw0.m173991r(pvw0.m173978e(gvw0.m132580C(this.f154235j.m135135a()), Throwable.class, new eow0() { // from class: l.jut0
                @Override // p153l.eow0
                public final Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, oct0.f146738f), new nut0(this), this.f154227b);
            return;
        }
        z7w0 z7w0Var = this.f154233h;
        uew0 uew0Var = this.f154232g;
        b7w0 b7w0Var = this.f154230e;
        q6w0 q6w0Var = this.f154231f;
        z7w0Var.m218923c(uew0Var.m195816c(b7w0Var, q6w0Var, q6w0Var.f155877c), true == bxy0.m106933q().m120278z(this.f154226a) ? 2 : 1);
    }

    @Override // p153l.i6u0
    public final void zze() {
        uew0 uew0Var = this.f154232g;
        b7w0 b7w0Var = this.f154230e;
        q6w0 q6w0Var = this.f154231f;
        this.f154233h.m218921a(uew0Var.m195816c(b7w0Var, q6w0Var, q6w0Var.f155891j));
    }

    @Override // p153l.i6u0
    public final void zzf() {
        uew0 uew0Var = this.f154232g;
        b7w0 b7w0Var = this.f154230e;
        q6w0 q6w0Var = this.f154231f;
        this.f154233h.m218921a(uew0Var.m195816c(b7w0Var, q6w0Var, q6w0Var.f155887h));
    }

    public final /* synthetic */ void zzm() {
        this.f154227b.execute(new Runnable() { // from class: l.lut0
            @Override // java.lang.Runnable
            public final void run() {
                this.f133656a.m173908K();
            }
        });
    }

    @Override // p153l.k8u0
    public final synchronized void zzr() {
        z3u0 z3u0Var;
        try {
            if (this.f154240o) {
                ArrayList arrayList = new ArrayList(this.f154231f.f155879d);
                arrayList.addAll(this.f154231f.f155885g);
                this.f154233h.m218921a(this.f154232g.m195817d(this.f154230e, this.f154231f, true, null, null, arrayList));
            } else {
                z7w0 z7w0Var = this.f154233h;
                uew0 uew0Var = this.f154232g;
                b7w0 b7w0Var = this.f154230e;
                q6w0 q6w0Var = this.f154231f;
                z7w0Var.m218921a(uew0Var.m195816c(b7w0Var, q6w0Var, q6w0Var.f155899n));
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168489u3)).booleanValue() && (z3u0Var = this.f154239n) != null) {
                    List listM195813h = uew0.m195813h(uew0.m195812g(z3u0Var.m218492b().f155899n, z3u0Var.m218491a().m120865g()), this.f154239n.m218491a().m120863a());
                    z7w0 z7w0Var2 = this.f154233h;
                    uew0 uew0Var2 = this.f154232g;
                    z3u0 z3u0Var2 = this.f154239n;
                    z7w0Var2.m218921a(uew0Var2.m195816c(z3u0Var2.m218493c(), z3u0Var2.m218492b(), listM195813h));
                }
                z7w0 z7w0Var3 = this.f154233h;
                uew0 uew0Var3 = this.f154232g;
                b7w0 b7w0Var2 = this.f154230e;
                q6w0 q6w0Var2 = this.f154231f;
                z7w0Var3.m218921a(uew0Var3.m195816c(b7w0Var2, q6w0Var2, q6w0Var2.f155885g));
            }
            this.f154240o = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.xfu0
    public final void zzs() {
        uew0 uew0Var = this.f154232g;
        b7w0 b7w0Var = this.f154230e;
        q6w0 q6w0Var = this.f154231f;
        this.f154233h.m218921a(uew0Var.m195816c(b7w0Var, q6w0Var, q6w0Var.f155914u0));
    }

    @Override // p153l.i6u0
    public final void zza() {
    }

    @Override // p153l.i6u0
    public final void zzb() {
    }

    @Override // p153l.i6u0
    public final void zzc() {
    }
}
