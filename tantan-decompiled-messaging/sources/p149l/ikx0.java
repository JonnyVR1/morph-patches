package p149l;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.C2075b;
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
public final class ikx0 implements Runnable, ltr0 {

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public boolean f113742d;

    /* JADX INFO: renamed from: e */
    public final boolean f113743e;

    /* JADX INFO: renamed from: f */
    public final boolean f113744f;

    /* JADX INFO: renamed from: g */
    public final Executor f113745g;

    /* JADX INFO: renamed from: h */
    public final p8w0 f113746h;

    /* JADX INFO: renamed from: i */
    public Context f113747i;

    /* JADX INFO: renamed from: j */
    public final Context f113748j;

    /* JADX INFO: renamed from: k */
    public zzcei f113749k;

    /* JADX INFO: renamed from: l */
    public final zzcei f113750l;

    /* JADX INFO: renamed from: m */
    public final boolean f113751m;

    /* JADX INFO: renamed from: o */
    public int f113753o;

    /* JADX INFO: renamed from: a */
    public final List f113739a = new Vector();

    /* JADX INFO: renamed from: b */
    public final AtomicReference f113740b = new AtomicReference();

    /* JADX INFO: renamed from: c */
    public final AtomicReference f113741c = new AtomicReference();

    /* JADX INFO: renamed from: n */
    public final CountDownLatch f113752n = new CountDownLatch(1);

    public ikx0(Context context, zzcei zzceiVar) {
        this.f113747i = context;
        this.f113748j = context;
        this.f113749k = zzceiVar;
        this.f113750l = zzceiVar;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.f113745g = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132276j2)).booleanValue();
        this.f113751m = zBooleanValue;
        this.f113746h = p8w0.m167824a(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.f113743e = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132224f2)).booleanValue();
        this.f113744f = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132289k2)).booleanValue();
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132263i2)).booleanValue()) {
            this.f113753o = 2;
        } else {
            this.f113753o = 1;
        }
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132316m3)).booleanValue()) {
            this.f113742d = m136913k();
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132225f3)).booleanValue()) {
            i3t0.f111372a.execute(this);
            return;
        }
        exr0.m118703b();
        if (i2t0.m134093w()) {
            i3t0.f111372a.execute(this);
        } else {
            run();
        }
    }

    /* JADX INFO: renamed from: o */
    private final void m136902o() {
        List list = this.f113739a;
        ltr0 ltr0VarM136916n = m136916n();
        if (list.isEmpty() || ltr0VarM136916n == null) {
            return;
        }
        for (Object[] objArr : this.f113739a) {
            int length = objArr.length;
            if (length == 1) {
                ltr0VarM136916n.mo136909f((MotionEvent) objArr[0]);
            } else if (length == 3) {
                ltr0VarM136916n.mo136905b(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.f113739a.clear();
    }

    /* JADX INFO: renamed from: q */
    public static final Context m136903q(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    @Override // p149l.ltr0
    /* JADX INFO: renamed from: a */
    public final String mo136904a(Context context) {
        ltr0 ltr0VarM136916n;
        if (!m136914l() || (ltr0VarM136916n = m136916n()) == null) {
            return "";
        }
        m136902o();
        return ltr0VarM136916n.mo136904a(m136903q(context));
    }

    @Override // p149l.ltr0
    /* JADX INFO: renamed from: b */
    public final void mo136905b(int i, int i2, int i3) {
        ltr0 ltr0VarM136916n = m136916n();
        if (ltr0VarM136916n == null) {
            this.f113739a.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        } else {
            m136902o();
            ltr0VarM136916n.mo136905b(i, i2, i3);
        }
    }

    @Override // p149l.ltr0
    /* JADX INFO: renamed from: c */
    public final String mo136906c(Context context, String str, View view) {
        return mo136910g(context, str, view, null);
    }

    @Override // p149l.ltr0
    /* JADX INFO: renamed from: d */
    public final void mo136907d(StackTraceElement[] stackTraceElementArr) {
        ltr0 ltr0VarM136916n;
        if (!m136914l() || (ltr0VarM136916n = m136916n()) == null) {
            return;
        }
        ltr0VarM136916n.mo136907d(stackTraceElementArr);
    }

    @Override // p149l.ltr0
    /* JADX INFO: renamed from: e */
    public final void mo136908e(View view) {
        ltr0 ltr0VarM136916n = m136916n();
        if (ltr0VarM136916n != null) {
            ltr0VarM136916n.mo136908e(view);
        }
    }

    @Override // p149l.ltr0
    /* JADX INFO: renamed from: f */
    public final void mo136909f(MotionEvent motionEvent) {
        ltr0 ltr0VarM136916n = m136916n();
        if (ltr0VarM136916n == null) {
            this.f113739a.add(new Object[]{motionEvent});
        } else {
            m136902o();
            ltr0VarM136916n.mo136909f(motionEvent);
        }
    }

    @Override // p149l.ltr0
    /* JADX INFO: renamed from: g */
    public final String mo136910g(Context context, String str, View view, Activity activity) {
        if (!m136914l()) {
            return "";
        }
        ltr0 ltr0VarM136916n = m136916n();
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132258ha)).booleanValue()) {
            vny0.m199080r();
            C2075b.m12316i(view, 4, null);
        }
        if (ltr0VarM136916n == null) {
            return "";
        }
        m136902o();
        return ltr0VarM136916n.mo136910g(m136903q(context), str, view, activity);
    }

    @Override // p149l.ltr0
    /* JADX INFO: renamed from: h */
    public final String mo136911h(Context context, View view, Activity activity) {
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132245ga)).booleanValue()) {
            ltr0 ltr0VarM136916n = m136916n();
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132258ha)).booleanValue()) {
                vny0.m199080r();
                C2075b.m12316i(view, 2, null);
            }
            return ltr0VarM136916n != null ? ltr0VarM136916n.mo136911h(context, view, activity) : "";
        }
        if (!m136914l()) {
            return "";
        }
        ltr0 ltr0VarM136916n2 = m136916n();
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132258ha)).booleanValue()) {
            vny0.m199080r();
            C2075b.m12316i(view, 2, null);
        }
        return ltr0VarM136916n2 != null ? ltr0VarM136916n2.mo136911h(context, view, activity) : "";
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m136912j(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            itr0.m138238i(this.f113750l.zza, m136903q(this.f113748j), z, this.f113751m).m138246p();
        } catch (NullPointerException e) {
            this.f113746h.m167827c(TXLiteAVCode.EVT_MIC_START_SUCC, System.currentTimeMillis() - jCurrentTimeMillis, e);
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m136913k() {
        Context context = this.f113747i;
        i9x0 i9x0Var = new i9x0(this);
        p8w0 p8w0Var = this.f113746h;
        return new maw0(this.f113747i, t9w0.m187684b(context, p8w0Var), i9x0Var, ((Boolean) d1s0.m109677c().m144697a(m7s0.f132237g2)).booleanValue()).m153847d(1);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m136914l() {
        try {
            this.f113752n.await();
            return true;
        } catch (InterruptedException e) {
            x2t0.m206870h("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: m */
    public final int m136915m() {
        if (!this.f113743e || this.f113742d) {
            return this.f113753o;
        }
        return 1;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final ltr0 m136916n() {
        return m136915m() == 2 ? (ltr0) this.f113741c.get() : (ltr0) this.f113740b.get();
    }

    /* JADX INFO: renamed from: p */
    public final void m136917p(boolean z) {
        this.f113740b.set(otr0.m165969y(this.f113749k.zza, m136903q(this.f113747i), z, this.f113753o));
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132316m3)).booleanValue()) {
                this.f113742d = m136913k();
            }
            boolean z = this.f113749k.zzd;
            final boolean z2 = false;
            if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132109W0)).booleanValue() && z) {
                z2 = true;
            }
            if (m136915m() == 1) {
                m136917p(z2);
                if (this.f113753o == 2) {
                    this.f113745g.execute(new Runnable() { // from class: l.yhw0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f198419a.m136912j(z2);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    itr0 itr0VarM138238i = itr0.m138238i(this.f113749k.zza, m136903q(this.f113747i), z2, this.f113751m);
                    this.f113741c.set(itr0VarM138238i);
                    if (this.f113744f && !itr0VarM138238i.m138247r()) {
                        this.f113753o = 1;
                        m136917p(z2);
                    }
                } catch (NullPointerException e) {
                    this.f113753o = 1;
                    m136917p(z2);
                    this.f113746h.m167827c(2031, System.currentTimeMillis() - jCurrentTimeMillis, e);
                }
            }
            this.f113752n.countDown();
            this.f113747i = null;
            this.f113749k = null;
        } catch (Throwable th) {
            this.f113752n.countDown();
            this.f113747i = null;
            this.f113749k = null;
            throw th;
        }
    }
}
