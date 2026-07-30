package p153l;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.internal.ads.zzcei;
import com.tencent.liteav.TXLiteAVCode;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class otx0 implements Runnable, r2s0 {

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public boolean f149022d;

    /* JADX INFO: renamed from: e */
    public final boolean f149023e;

    /* JADX INFO: renamed from: f */
    public final boolean f149024f;

    /* JADX INFO: renamed from: g */
    public final Executor f149025g;

    /* JADX INFO: renamed from: h */
    public final vhw0 f149026h;

    /* JADX INFO: renamed from: i */
    public Context f149027i;

    /* JADX INFO: renamed from: j */
    public final Context f149028j;

    /* JADX INFO: renamed from: k */
    public zzcei f149029k;

    /* JADX INFO: renamed from: l */
    public final zzcei f149030l;

    /* JADX INFO: renamed from: m */
    public final boolean f149031m;

    /* JADX INFO: renamed from: o */
    public int f149033o;

    /* JADX INFO: renamed from: a */
    public final List f149019a = new Vector();

    /* JADX INFO: renamed from: b */
    public final AtomicReference f149020b = new AtomicReference();

    /* JADX INFO: renamed from: c */
    public final AtomicReference f149021c = new AtomicReference();

    /* JADX INFO: renamed from: n */
    public final CountDownLatch f149032n = new CountDownLatch(1);

    public otx0(Context context, zzcei zzceiVar) {
        this.f149027i = context;
        this.f149028j = context;
        this.f149029k = zzceiVar;
        this.f149030l = zzceiVar;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.f149025g = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) jas0.m144075c().m176505a(sgs0.f168347j2)).booleanValue();
        this.f149031m = zBooleanValue;
        this.f149026h = vhw0.m201299a(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.f149023e = ((Boolean) jas0.m144075c().m176505a(sgs0.f168295f2)).booleanValue();
        this.f149024f = ((Boolean) jas0.m144075c().m176505a(sgs0.f168360k2)).booleanValue();
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168334i2)).booleanValue()) {
            this.f149033o = 2;
        } else {
            this.f149033o = 1;
        }
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168387m3)).booleanValue()) {
            this.f149022d = m169190k();
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168296f3)).booleanValue()) {
            oct0.f146733a.execute(this);
            return;
        }
        k6s0.m148569b();
        if (obt0.m167046w()) {
            oct0.f146733a.execute(this);
        } else {
            run();
        }
    }

    /* JADX INFO: renamed from: o */
    private final void m169187o() {
        List list = this.f149019a;
        r2s0 r2s0VarM169193n = m169193n();
        if (list.isEmpty() || r2s0VarM169193n == null) {
            return;
        }
        for (Object[] objArr : this.f149019a) {
            int length = objArr.length;
            if (length == 1) {
                r2s0VarM169193n.mo165759f((MotionEvent) objArr[0]);
            } else if (length == 3) {
                r2s0VarM169193n.mo165755b(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.f149019a.clear();
    }

    /* JADX INFO: renamed from: q */
    public static final Context m169188q(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    @Override // p153l.r2s0
    /* JADX INFO: renamed from: a */
    public final String mo165754a(Context context) {
        r2s0 r2s0VarM169193n;
        if (!m169191l() || (r2s0VarM169193n = m169193n()) == null) {
            return "";
        }
        m169187o();
        return r2s0VarM169193n.mo165754a(m169188q(context));
    }

    @Override // p153l.r2s0
    /* JADX INFO: renamed from: b */
    public final void mo165755b(int i, int i2, int i3) {
        r2s0 r2s0VarM169193n = m169193n();
        if (r2s0VarM169193n == null) {
            this.f149019a.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        } else {
            m169187o();
            r2s0VarM169193n.mo165755b(i, i2, i3);
        }
    }

    @Override // p153l.r2s0
    /* JADX INFO: renamed from: c */
    public final String mo165756c(Context context, String str, View view) {
        return mo165760g(context, str, view, null);
    }

    @Override // p153l.r2s0
    /* JADX INFO: renamed from: d */
    public final void mo165757d(StackTraceElement[] stackTraceElementArr) {
        r2s0 r2s0VarM169193n;
        if (!m169191l() || (r2s0VarM169193n = m169193n()) == null) {
            return;
        }
        r2s0VarM169193n.mo165757d(stackTraceElementArr);
    }

    @Override // p153l.r2s0
    /* JADX INFO: renamed from: e */
    public final void mo165758e(View view) {
        r2s0 r2s0VarM169193n = m169193n();
        if (r2s0VarM169193n != null) {
            r2s0VarM169193n.mo165758e(view);
        }
    }

    @Override // p153l.r2s0
    /* JADX INFO: renamed from: f */
    public final void mo165759f(MotionEvent motionEvent) {
        r2s0 r2s0VarM169193n = m169193n();
        if (r2s0VarM169193n == null) {
            this.f149019a.add(new Object[]{motionEvent});
        } else {
            m169187o();
            r2s0VarM169193n.mo165759f(motionEvent);
        }
    }

    @Override // p153l.r2s0
    /* JADX INFO: renamed from: g */
    public final String mo165760g(Context context, String str, View view, Activity activity) {
        if (!m169191l()) {
            return "";
        }
        r2s0 r2s0VarM169193n = m169193n();
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168329ha)).booleanValue()) {
            bxy0.m106934r();
            C2098b.m12370i(view, 4, null);
        }
        if (r2s0VarM169193n == null) {
            return "";
        }
        m169187o();
        return r2s0VarM169193n.mo165760g(m169188q(context), str, view, activity);
    }

    @Override // p153l.r2s0
    /* JADX INFO: renamed from: h */
    public final String mo165761h(Context context, View view, Activity activity) {
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168316ga)).booleanValue()) {
            r2s0 r2s0VarM169193n = m169193n();
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168329ha)).booleanValue()) {
                bxy0.m106934r();
                C2098b.m12370i(view, 2, null);
            }
            return r2s0VarM169193n != null ? r2s0VarM169193n.mo165761h(context, view, activity) : "";
        }
        if (!m169191l()) {
            return "";
        }
        r2s0 r2s0VarM169193n2 = m169193n();
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168329ha)).booleanValue()) {
            bxy0.m106934r();
            C2098b.m12370i(view, 2, null);
        }
        return r2s0VarM169193n2 != null ? r2s0VarM169193n2.mo165761h(context, view, activity) : "";
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m169189j(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            o2s0.m165747i(this.f149030l.zza, m169188q(this.f149028j), z, this.f149031m).m165763p();
        } catch (NullPointerException e) {
            this.f149026h.m201302c(TXLiteAVCode.EVT_MIC_START_SUCC, System.currentTimeMillis() - jCurrentTimeMillis, e);
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m169190k() {
        Context context = this.f149027i;
        oix0 oix0Var = new oix0(this);
        vhw0 vhw0Var = this.f149026h;
        return new sjw0(this.f149027i, ziw0.m219950b(context, vhw0Var), oix0Var, ((Boolean) jas0.m144075c().m176505a(sgs0.f168308g2)).booleanValue()).m186339d(1);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m169191l() {
        try {
            this.f149032n.await();
            return true;
        } catch (InterruptedException e) {
            dct0.m115299h("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: m */
    public final int m169192m() {
        if (!this.f149023e || this.f149022d) {
            return this.f149033o;
        }
        return 1;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final r2s0 m169193n() {
        return m169192m() == 2 ? (r2s0) this.f149021c.get() : (r2s0) this.f149020b.get();
    }

    /* JADX INFO: renamed from: p */
    public final void m169194p(boolean z) {
        this.f149020b.set(u2s0.m194301y(this.f149029k.zza, m169188q(this.f149027i), z, this.f149033o));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168387m3)).booleanValue()) {
                this.f149022d = m169190k();
            }
            boolean z = this.f149029k.zzd;
            final boolean z2 = false;
            if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168180W0)).booleanValue() && z) {
                z2 = true;
            }
            if (m169192m() == 1) {
                m169194p(z2);
                if (this.f149033o == 2) {
                    this.f149025g.execute(new Runnable() { // from class: l.erw0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f95546a.m169189j(z2);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    o2s0 o2s0VarM165747i = o2s0.m165747i(this.f149029k.zza, m169188q(this.f149027i), z2, this.f149031m);
                    this.f149021c.set(o2s0VarM165747i);
                    if (this.f149024f && !o2s0VarM165747i.m165764r()) {
                        this.f149033o = 1;
                        m169194p(z2);
                    }
                } catch (NullPointerException e) {
                    this.f149033o = 1;
                    m169194p(z2);
                    this.f149026h.m201302c(2031, System.currentTimeMillis() - jCurrentTimeMillis, e);
                }
            }
        } finally {
            this.f149032n.countDown();
            this.f149027i = null;
            this.f149029k = null;
        }
    }
}
