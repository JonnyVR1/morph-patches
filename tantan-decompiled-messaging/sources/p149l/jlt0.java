package p149l;

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
public final class jlt0 implements cxt0, ezt0, dyt0, b1r0, zxt0, r6u0 {

    /* JADX INFO: renamed from: a */
    public final Context f118567a;

    /* JADX INFO: renamed from: b */
    public final Executor f118568b;

    /* JADX INFO: renamed from: c */
    public final Executor f118569c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f118570d;

    /* JADX INFO: renamed from: e */
    public final vxv0 f118571e;

    /* JADX INFO: renamed from: f */
    public final kxv0 f118572f;

    /* JADX INFO: renamed from: g */
    public final o5w0 f118573g;

    /* JADX INFO: renamed from: h */
    public final tyv0 f118574h;

    /* JADX INFO: renamed from: i */
    public final ptr0 f118575i;

    /* JADX INFO: renamed from: j */
    public final b9s0 f118576j;

    /* JADX INFO: renamed from: k */
    public final w4w0 f118577k;

    /* JADX INFO: renamed from: l */
    public final WeakReference f118578l;

    /* JADX INFO: renamed from: m */
    public final WeakReference f118579m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public final tut0 f118580n;

    /* JADX INFO: renamed from: o */
    public boolean f118581o;

    /* JADX INFO: renamed from: p */
    public final AtomicBoolean f118582p = new AtomicBoolean();

    /* JADX INFO: renamed from: q */
    public final d9s0 f118583q;

    public jlt0(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, vxv0 vxv0Var, kxv0 kxv0Var, o5w0 o5w0Var, tyv0 tyv0Var, @Nullable View view, @Nullable q9t0 q9t0Var, ptr0 ptr0Var, b9s0 b9s0Var, d9s0 d9s0Var, w4w0 w4w0Var, @Nullable tut0 tut0Var) {
        this.f118567a = context;
        this.f118568b = executor;
        this.f118569c = executor2;
        this.f118570d = scheduledExecutorService;
        this.f118571e = vxv0Var;
        this.f118572f = kxv0Var;
        this.f118573g = o5w0Var;
        this.f118574h = tyv0Var;
        this.f118575i = ptr0Var;
        this.f118578l = new WeakReference(view);
        this.f118579m = new WeakReference(q9t0Var);
        this.f118576j = b9s0Var;
        this.f118583q = d9s0Var;
        this.f118577k = w4w0Var;
        this.f118580n = tut0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final void m142110K() {
        String strMo136911h;
        int i;
        List list;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132168ab)).booleanValue() && ((list = this.f118572f.f125189d) == null || list.isEmpty())) {
            return;
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132355p3)).booleanValue()) {
            strMo136911h = this.f118575i.m171378c().mo136911h(this.f118567a, (View) this.f118578l.get(), null);
        } else {
            strMo136911h = null;
        }
        if ((((Boolean) d1s0.m109677c().m144697a(m7s0.f132326n0)).booleanValue() && this.f118571e.f183478b.f178773b.f141060g) || !((Boolean) r9s0.f158436h.m115379e()).booleanValue()) {
            tyv0 tyv0Var = this.f118574h;
            o5w0 o5w0Var = this.f118573g;
            vxv0 vxv0Var = this.f118571e;
            kxv0 kxv0Var = this.f118572f;
            tyv0Var.m191108a(o5w0Var.m162814d(vxv0Var, kxv0Var, false, strMo136911h, null, kxv0Var.f125189d));
            return;
        }
        if (((Boolean) r9s0.f158435g.m115379e()).booleanValue() && ((i = this.f118572f.f125185b) == 1 || i == 2 || i == 5)) {
        }
        jmw0.m142245r((amw0) jmw0.m142242o(amw0.m97696C(jmw0.m142235h(null)), ((Long) d1s0.m109677c().m144697a(m7s0.f132097V0)).longValue(), TimeUnit.MILLISECONDS, this.f118570d), new ilt0(this, strMo136911h), this.f118568b);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m142116B(int i, int i2) {
        m142118O(i - 1, i2);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m142117D(final int i, final int i2) {
        this.f118568b.execute(new Runnable() { // from class: l.elt0
            @Override // java.lang.Runnable
            public final void run() {
                this.f92140a.m142116B(i, i2);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final void m142118O(final int i, final int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.f118578l.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            m142110K();
        } else {
            this.f118570d.schedule(new Runnable() { // from class: l.glt0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f103397a.m142117D(i, i2);
                }
            }, i2, TimeUnit.MILLISECONDS);
        }
    }

    @Override // p149l.dyt0
    /* JADX INFO: renamed from: a */
    public final void mo95459a() {
        if (this.f118582p.compareAndSet(false, true)) {
            int iIntValue = ((Integer) d1s0.m109677c().m144697a(m7s0.f132466y3)).intValue();
            if (iIntValue > 0) {
                m142118O(iIntValue, ((Integer) d1s0.m109677c().m144697a(m7s0.f132478z3)).intValue());
                return;
            }
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132454x3)).booleanValue()) {
                this.f118569c.execute(new Runnable() { // from class: l.clt0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f81467a.zzm();
                    }
                });
            } else {
                m142110K();
            }
        }
    }

    @Override // p149l.cxt0
    /* JADX INFO: renamed from: i */
    public final void mo100929i(zvs0 zvs0Var, String str, String str2) {
        o5w0 o5w0Var = this.f118573g;
        kxv0 kxv0Var = this.f118572f;
        this.f118574h.m191108a(o5w0Var.m162815e(kxv0Var, kxv0Var.f125199i, zvs0Var));
    }

    @Override // p149l.zxt0
    /* JADX INFO: renamed from: k */
    public final void mo134396k(zze zzeVar) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132428v1)).booleanValue()) {
            this.f118574h.m191108a(this.f118573g.m162813c(this.f118571e, this.f118572f, o5w0.m162808f(2, zzeVar.zza, this.f118572f.f125213p)));
        }
    }

    @Override // p149l.b1r0
    public final void onAdClicked() {
        if (!(((Boolean) d1s0.m109677c().m144697a(m7s0.f132326n0)).booleanValue() && this.f118571e.f183478b.f178773b.f141060g) && ((Boolean) r9s0.f158432d.m115379e()).booleanValue()) {
            jmw0.m142245r(jmw0.m142232e(amw0.m97696C(this.f118576j.m100824a()), Throwable.class, new yew0() { // from class: l.dlt0
                @Override // p149l.yew0
                public final Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, i3t0.f111377f), new hlt0(this), this.f118568b);
            return;
        }
        tyv0 tyv0Var = this.f118574h;
        o5w0 o5w0Var = this.f118573g;
        vxv0 vxv0Var = this.f118571e;
        kxv0 kxv0Var = this.f118572f;
        tyv0Var.m191110c(o5w0Var.m162813c(vxv0Var, kxv0Var, kxv0Var.f125187c), true == vny0.m199079q().m212293z(this.f118567a) ? 2 : 1);
    }

    @Override // p149l.cxt0
    public final void zze() {
        o5w0 o5w0Var = this.f118573g;
        vxv0 vxv0Var = this.f118571e;
        kxv0 kxv0Var = this.f118572f;
        this.f118574h.m191108a(o5w0Var.m162813c(vxv0Var, kxv0Var, kxv0Var.f125201j));
    }

    @Override // p149l.cxt0
    public final void zzf() {
        o5w0 o5w0Var = this.f118573g;
        vxv0 vxv0Var = this.f118571e;
        kxv0 kxv0Var = this.f118572f;
        this.f118574h.m191108a(o5w0Var.m162813c(vxv0Var, kxv0Var, kxv0Var.f125197h));
    }

    public final /* synthetic */ void zzm() {
        this.f118568b.execute(new Runnable() { // from class: l.flt0
            @Override // java.lang.Runnable
            public final void run() {
                this.f98221a.m142110K();
            }
        });
    }

    @Override // p149l.ezt0
    public final synchronized void zzr() {
        tut0 tut0Var;
        try {
            if (this.f118581o) {
                ArrayList arrayList = new ArrayList(this.f118572f.f125189d);
                arrayList.addAll(this.f118572f.f125195g);
                this.f118574h.m191108a(this.f118573g.m162814d(this.f118571e, this.f118572f, true, null, null, arrayList));
            } else {
                tyv0 tyv0Var = this.f118574h;
                o5w0 o5w0Var = this.f118573g;
                vxv0 vxv0Var = this.f118571e;
                kxv0 kxv0Var = this.f118572f;
                tyv0Var.m191108a(o5w0Var.m162813c(vxv0Var, kxv0Var, kxv0Var.f125209n));
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132418u3)).booleanValue() && (tut0Var = this.f118580n) != null) {
                    List listM162810h = o5w0.m162810h(o5w0.m162809g(tut0Var.m190716b().f125209n, tut0Var.m190715a().m213330g()), this.f118580n.m190715a().m213328a());
                    tyv0 tyv0Var2 = this.f118574h;
                    o5w0 o5w0Var2 = this.f118573g;
                    tut0 tut0Var2 = this.f118580n;
                    tyv0Var2.m191108a(o5w0Var2.m162813c(tut0Var2.m190717c(), tut0Var2.m190716b(), listM162810h));
                }
                tyv0 tyv0Var3 = this.f118574h;
                o5w0 o5w0Var3 = this.f118573g;
                vxv0 vxv0Var2 = this.f118571e;
                kxv0 kxv0Var2 = this.f118572f;
                tyv0Var3.m191108a(o5w0Var3.m162813c(vxv0Var2, kxv0Var2, kxv0Var2.f125195g));
            }
            this.f118581o = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.r6u0
    public final void zzs() {
        o5w0 o5w0Var = this.f118573g;
        vxv0 vxv0Var = this.f118571e;
        kxv0 kxv0Var = this.f118572f;
        this.f118574h.m191108a(o5w0Var.m162813c(vxv0Var, kxv0Var, kxv0Var.f125224u0));
    }

    @Override // p149l.cxt0
    public final void zza() {
    }

    @Override // p149l.cxt0
    public final void zzb() {
    }

    @Override // p149l.cxt0
    public final void zzc() {
    }
}
