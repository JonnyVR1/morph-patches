package p153l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.C0763a;
import androidx.work.WorkInfo;
import androidx.work.impl.C0775a;
import androidx.work.impl.constraints.AbstractC0789a;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import com.clevertap.android.sdk.Constants;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlinx.coroutines.InterfaceC15593o;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class n9k implements h2e0, sl50, v6f {

    /* JADX INFO: renamed from: o */
    public static final String f140896o = qzv.m178831i("GreedyScheduler");

    /* JADX INFO: renamed from: a */
    public final Context f140897a;

    /* JADX INFO: renamed from: c */
    public oud f140899c;

    /* JADX INFO: renamed from: d */
    public boolean f140900d;

    /* JADX INFO: renamed from: g */
    public final C0775a f140903g;

    /* JADX INFO: renamed from: h */
    public final siq0 f140904h;

    /* JADX INFO: renamed from: i */
    public final C0763a f140905i;

    /* JADX INFO: renamed from: k */
    public Boolean f140907k;

    /* JADX INFO: renamed from: l */
    public final WorkConstraintsTracker f140908l;

    /* JADX INFO: renamed from: m */
    public final zni0 f140909m;

    /* JADX INFO: renamed from: n */
    public final szi0 f140910n;

    /* JADX INFO: renamed from: b */
    public final Map<piq0, InterfaceC15593o> f140898b = new HashMap();

    /* JADX INFO: renamed from: e */
    public final Object f140901e = new Object();

    /* JADX INFO: renamed from: f */
    public final f3g0 f140902f = f3g0.create();

    /* JADX INFO: renamed from: j */
    public final Map<piq0, C18825b> f140906j = new HashMap();

    /* JADX INFO: renamed from: l.n9k$b */
    public static class C18825b {

        /* JADX INFO: renamed from: a */
        public final int f140911a;

        /* JADX INFO: renamed from: b */
        public final long f140912b;

        public C18825b(int i, long j) {
            this.f140911a = i;
            this.f140912b = j;
        }
    }

    public n9k(@NonNull Context context, @NonNull C0763a c0763a, @NonNull fgj0 fgj0Var, @NonNull C0775a c0775a, @NonNull siq0 siq0Var, @NonNull zni0 zni0Var) {
        this.f140897a = context;
        vqd0 runnableScheduler = c0763a.getRunnableScheduler();
        this.f140899c = new oud(this, runnableScheduler, c0763a.getClock());
        this.f140910n = new szi0(runnableScheduler, siq0Var);
        this.f140909m = zni0Var;
        this.f140908l = new WorkConstraintsTracker(fgj0Var);
        this.f140905i = c0763a;
        this.f140903g = c0775a;
        this.f140904h = siq0Var;
    }

    @Override // p153l.sl50
    /* JADX INFO: renamed from: a */
    public void mo4548a(@NonNull mjq0 mjq0Var, @NonNull AbstractC0789a abstractC0789a) {
        piq0 piq0VarM191450a = tjq0.m191450a(mjq0Var);
        if (abstractC0789a instanceof AbstractC0789a.a) {
            if (this.f140902f.mo123735d(piq0VarM191450a)) {
                return;
            }
            qzv.m178829e().mo178832a(f140896o, "Constraints met: Scheduling work ID " + piq0VarM191450a);
            e3g0 e3g0VarMo123733a = this.f140902f.mo123733a(piq0VarM191450a);
            this.f140910n.m188655c(e3g0VarMo123733a);
            this.f140904h.m186032c(e3g0VarMo123733a);
            return;
        }
        qzv.m178829e().mo178832a(f140896o, "Constraints not met: Cancelling work ID " + piq0VarM191450a);
        e3g0 e3g0VarMo123736e = this.f140902f.mo123736e(piq0VarM191450a);
        if (e3g0VarMo123736e != null) {
            this.f140910n.m188654b(e3g0VarMo123736e);
            this.f140904h.m186030a(e3g0VarMo123736e, ((AbstractC0789a.b) abstractC0789a).getCom.p1.mobile.putong.core.data.Reason.TYPE java.lang.String());
        }
    }

    @Override // p153l.h2e0
    /* JADX INFO: renamed from: b */
    public boolean mo133386b() {
        return false;
    }

    @Override // p153l.h2e0
    /* JADX INFO: renamed from: c */
    public void mo133387c(@NonNull String str) {
        if (this.f140907k == null) {
            m161984e();
        }
        if (!this.f140907k.booleanValue()) {
            qzv.m178829e().mo178836f(f140896o, "Ignoring schedule request in non-main process");
            return;
        }
        m161985f();
        qzv.m178829e().mo178832a(f140896o, "Cancelling work ID " + str);
        oud oudVar = this.f140899c;
        if (oudVar != null) {
            oudVar.m169286b(str);
        }
        for (e3g0 e3g0Var : this.f140902f.remove(str)) {
            this.f140910n.m188654b(e3g0Var);
            this.f140904h.m186031b(e3g0Var);
        }
    }

    @Override // p153l.h2e0
    /* JADX INFO: renamed from: d */
    public void mo133388d(@NonNull mjq0... mjq0VarArr) {
        if (this.f140907k == null) {
            m161984e();
        }
        if (!this.f140907k.booleanValue()) {
            qzv.m178829e().mo178836f(f140896o, "Ignoring schedule request in a secondary process");
            return;
        }
        m161985f();
        HashSet<mjq0> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (mjq0 mjq0Var : mjq0VarArr) {
            if (!this.f140902f.mo123735d(tjq0.m191450a(mjq0Var))) {
                long jMax = Math.max(mjq0Var.m158599b(), m161987h(mjq0Var));
                long jCurrentTimeMillis = this.f140905i.getClock().currentTimeMillis();
                if (mjq0Var.state == WorkInfo.State.ENQUEUED) {
                    if (jCurrentTimeMillis < jMax) {
                        oud oudVar = this.f140899c;
                        if (oudVar != null) {
                            oudVar.m169285a(mjq0Var, jMax);
                        }
                    } else if (mjq0Var.m158607k()) {
                        l06 l06Var = mjq0Var.constraints;
                        if (l06Var.getRequiresDeviceIdle()) {
                            qzv.m178829e().mo178832a(f140896o, "Ignoring " + mjq0Var + ". Requires device idle.");
                        } else if (l06Var.m152313g()) {
                            qzv.m178829e().mo178832a(f140896o, "Ignoring " + mjq0Var + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(mjq0Var);
                            hashSet2.add(mjq0Var.id);
                        }
                    } else if (!this.f140902f.mo123735d(tjq0.m191450a(mjq0Var))) {
                        qzv.m178829e().mo178832a(f140896o, "Starting work for " + mjq0Var.id);
                        e3g0 e3g0VarM123734b = this.f140902f.m123734b(mjq0Var);
                        this.f140910n.m188655c(e3g0VarM123734b);
                        this.f140904h.m186032c(e3g0VarM123734b);
                    }
                }
            }
        }
        synchronized (this.f140901e) {
            try {
                if (!hashSet.isEmpty()) {
                    qzv.m178829e().mo178832a(f140896o, "Starting tracking for " + TextUtils.join(Constants.SEPARATOR_COMMA, hashSet2));
                    for (mjq0 mjq0Var2 : hashSet) {
                        piq0 piq0VarM191450a = tjq0.m191450a(mjq0Var2);
                        if (!this.f140898b.containsKey(piq0VarM191450a)) {
                            this.f140898b.put(piq0VarM191450a, WorkConstraintsTrackerKt.m4584c(this.f140908l, mjq0Var2, this.f140909m.mo216344a(), this));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m161984e() {
        this.f140907k = Boolean.valueOf(rk90.m181782b(this.f140897a, this.f140905i));
    }

    /* JADX INFO: renamed from: f */
    public final void m161985f() {
        if (this.f140900d) {
            return;
        }
        this.f140903g.m4514e(this);
        this.f140900d = true;
    }

    /* JADX INFO: renamed from: g */
    public final void m161986g(@NonNull piq0 piq0Var) {
        InterfaceC15593o interfaceC15593oRemove;
        synchronized (this.f140901e) {
            interfaceC15593oRemove = this.f140898b.remove(piq0Var);
        }
        if (interfaceC15593oRemove != null) {
            qzv.m178829e().mo178832a(f140896o, "Stopping tracking for " + piq0Var);
            interfaceC15593oRemove.mo94586n(null);
        }
    }

    /* JADX INFO: renamed from: h */
    public final long m161987h(mjq0 mjq0Var) {
        long jMax;
        synchronized (this.f140901e) {
            try {
                piq0 piq0VarM191450a = tjq0.m191450a(mjq0Var);
                C18825b c18825b = this.f140906j.get(piq0VarM191450a);
                if (c18825b == null) {
                    c18825b = new C18825b(mjq0Var.runAttemptCount, this.f140905i.getClock().currentTimeMillis());
                    this.f140906j.put(piq0VarM191450a, c18825b);
                }
                jMax = c18825b.f140912b + (((long) Math.max((mjq0Var.runAttemptCount - c18825b.f140911a) - 5, 0)) * HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jMax;
    }

    @Override // p153l.v6f
    public void onExecuted(@NonNull piq0 piq0Var, boolean z) {
        e3g0 e3g0VarMo123736e = this.f140902f.mo123736e(piq0Var);
        if (e3g0VarMo123736e != null) {
            this.f140910n.m188654b(e3g0VarMo123736e);
        }
        m161986g(piq0Var);
        if (z) {
            return;
        }
        synchronized (this.f140901e) {
            this.f140906j.remove(piq0Var);
        }
    }
}
