package p149l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.C0761a;
import androidx.work.WorkInfo;
import androidx.work.impl.C0773a;
import androidx.work.impl.constraints.AbstractC0787a;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import com.clevertap.android.sdk.Constants;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlinx.coroutines.InterfaceC15486o;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class v6k implements dud0, ld50, r5f {

    /* JADX INFO: renamed from: o */
    public static final String f180197o = txv.m190978i("GreedyScheduler");

    /* JADX INFO: renamed from: a */
    public final Context f180198a;

    /* JADX INFO: renamed from: c */
    public atd f180200c;

    /* JADX INFO: renamed from: d */
    public boolean f180201d;

    /* JADX INFO: renamed from: g */
    public final C0773a f180204g;

    /* JADX INFO: renamed from: h */
    public final n9q0 f180205h;

    /* JADX INFO: renamed from: i */
    public final C0761a f180206i;

    /* JADX INFO: renamed from: k */
    public Boolean f180208k;

    /* JADX INFO: renamed from: l */
    public final WorkConstraintsTracker f180209l;

    /* JADX INFO: renamed from: m */
    public final zei0 f180210m;

    /* JADX INFO: renamed from: n */
    public final pqi0 f180211n;

    /* JADX INFO: renamed from: b */
    public final Map<k9q0, InterfaceC15486o> f180199b = new HashMap();

    /* JADX INFO: renamed from: e */
    public final Object f180202e = new Object();

    /* JADX INFO: renamed from: f */
    public final wuf0 f180203f = wuf0.create();

    /* JADX INFO: renamed from: j */
    public final Map<k9q0, C20587b> f180207j = new HashMap();

    /* JADX INFO: renamed from: l.v6k$b */
    public static class C20587b {

        /* JADX INFO: renamed from: a */
        public final int f180212a;

        /* JADX INFO: renamed from: b */
        public final long f180213b;

        public C20587b(int i, long j) {
            this.f180212a = i;
            this.f180213b = j;
        }
    }

    public v6k(@NonNull Context context, @NonNull C0761a c0761a, @NonNull b7j0 b7j0Var, @NonNull C0773a c0773a, @NonNull n9q0 n9q0Var, @NonNull zei0 zei0Var) {
        this.f180198a = context;
        sid0 runnableScheduler = c0761a.getRunnableScheduler();
        this.f180200c = new atd(this, runnableScheduler, c0761a.getClock());
        this.f180211n = new pqi0(runnableScheduler, n9q0Var);
        this.f180210m = zei0Var;
        this.f180209l = new WorkConstraintsTracker(b7j0Var);
        this.f180206i = c0761a;
        this.f180204g = c0773a;
        this.f180205h = n9q0Var;
    }

    @Override // p149l.ld50
    /* JADX INFO: renamed from: a */
    public void mo4546a(@NonNull haq0 haq0Var, @NonNull AbstractC0787a abstractC0787a) {
        k9q0 k9q0VarM163363a = oaq0.m163363a(haq0Var);
        if (abstractC0787a instanceof AbstractC0787a.a) {
            if (this.f180203f.mo141293d(k9q0VarM163363a)) {
                return;
            }
            txv.m190976e().mo190979a(f180197o, "Constraints met: Scheduling work ID " + k9q0VarM163363a);
            vuf0 vuf0VarMo141292a = this.f180203f.mo141292a(k9q0VarM163363a);
            this.f180211n.m170923c(vuf0VarMo141292a);
            this.f180205h.m158561c(vuf0VarMo141292a);
            return;
        }
        txv.m190976e().mo190979a(f180197o, "Constraints not met: Cancelling work ID " + k9q0VarM163363a);
        vuf0 vuf0VarMo141294e = this.f180203f.mo141294e(k9q0VarM163363a);
        if (vuf0VarMo141294e != null) {
            this.f180211n.m170922b(vuf0VarMo141294e);
            this.f180205h.m158559a(vuf0VarMo141294e, ((AbstractC0787a.b) abstractC0787a).getCom.p1.mobile.putong.core.data.Reason.TYPE java.lang.String());
        }
    }

    @Override // p149l.dud0
    /* JADX INFO: renamed from: b */
    public boolean mo113682b() {
        return false;
    }

    @Override // p149l.dud0
    /* JADX INFO: renamed from: c */
    public void mo113683c(@NonNull String str) {
        if (this.f180208k == null) {
            m197204e();
        }
        if (!this.f180208k.booleanValue()) {
            txv.m190976e().mo190983f(f180197o, "Ignoring schedule request in non-main process");
            return;
        }
        m197205f();
        txv.m190976e().mo190979a(f180197o, "Cancelling work ID " + str);
        atd atdVar = this.f180200c;
        if (atdVar != null) {
            atdVar.m98793b(str);
        }
        for (vuf0 vuf0Var : this.f180203f.remove(str)) {
            this.f180211n.m170922b(vuf0Var);
            this.f180205h.m158560b(vuf0Var);
        }
    }

    @Override // p149l.dud0
    /* JADX INFO: renamed from: d */
    public void mo113684d(@NonNull haq0... haq0VarArr) {
        if (this.f180208k == null) {
            m197204e();
        }
        if (!this.f180208k.booleanValue()) {
            txv.m190976e().mo190983f(f180197o, "Ignoring schedule request in a secondary process");
            return;
        }
        m197205f();
        HashSet<haq0> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (haq0 haq0Var : haq0VarArr) {
            if (!this.f180203f.mo141293d(oaq0.m163363a(haq0Var))) {
                long jMax = Math.max(haq0Var.m130157b(), m197207h(haq0Var));
                long jCurrentTimeMillis = this.f180206i.getClock().currentTimeMillis();
                if (haq0Var.state == WorkInfo.State.ENQUEUED) {
                    if (jCurrentTimeMillis < jMax) {
                        atd atdVar = this.f180200c;
                        if (atdVar != null) {
                            atdVar.m98792a(haq0Var, jMax);
                        }
                    } else if (haq0Var.m130165k()) {
                        gz5 gz5Var = haq0Var.constraints;
                        if (gz5Var.getRequiresDeviceIdle()) {
                            txv.m190976e().mo190979a(f180197o, "Ignoring " + haq0Var + ". Requires device idle.");
                        } else if (gz5Var.m128826g()) {
                            txv.m190976e().mo190979a(f180197o, "Ignoring " + haq0Var + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(haq0Var);
                            hashSet2.add(haq0Var.id);
                        }
                    } else if (!this.f180203f.mo141293d(oaq0.m163363a(haq0Var))) {
                        txv.m190976e().mo190979a(f180197o, "Starting work for " + haq0Var.id);
                        vuf0 vuf0VarM205623b = this.f180203f.m205623b(haq0Var);
                        this.f180211n.m170923c(vuf0VarM205623b);
                        this.f180205h.m158561c(vuf0VarM205623b);
                    }
                }
            }
        }
        synchronized (this.f180202e) {
            try {
                if (!hashSet.isEmpty()) {
                    txv.m190976e().mo190979a(f180197o, "Starting tracking for " + TextUtils.join(Constants.SEPARATOR_COMMA, hashSet2));
                    for (haq0 haq0Var2 : hashSet) {
                        k9q0 k9q0VarM163363a = oaq0.m163363a(haq0Var2);
                        if (!this.f180199b.containsKey(k9q0VarM163363a)) {
                            this.f180199b.put(k9q0VarM163363a, WorkConstraintsTrackerKt.m4582c(this.f180209l, haq0Var2, this.f180210m.mo187636a(), this));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m197204e() {
        this.f180208k = Boolean.valueOf(nc90.m158928b(this.f180198a, this.f180206i));
    }

    /* JADX INFO: renamed from: f */
    public final void m197205f() {
        if (this.f180201d) {
            return;
        }
        this.f180204g.m4512e(this);
        this.f180201d = true;
    }

    /* JADX INFO: renamed from: g */
    public final void m197206g(@NonNull k9q0 k9q0Var) {
        InterfaceC15486o interfaceC15486oRemove;
        synchronized (this.f180202e) {
            interfaceC15486oRemove = this.f180199b.remove(k9q0Var);
        }
        if (interfaceC15486oRemove != null) {
            txv.m190976e().mo190979a(f180197o, "Stopping tracking for " + k9q0Var);
            interfaceC15486oRemove.mo93695n(null);
        }
    }

    /* JADX INFO: renamed from: h */
    public final long m197207h(haq0 haq0Var) {
        long jMax;
        synchronized (this.f180202e) {
            try {
                k9q0 k9q0VarM163363a = oaq0.m163363a(haq0Var);
                C20587b c20587b = this.f180207j.get(k9q0VarM163363a);
                if (c20587b == null) {
                    c20587b = new C20587b(haq0Var.runAttemptCount, this.f180206i.getClock().currentTimeMillis());
                    this.f180207j.put(k9q0VarM163363a, c20587b);
                }
                jMax = c20587b.f180213b + (((long) Math.max((haq0Var.runAttemptCount - c20587b.f180212a) - 5, 0)) * HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jMax;
    }

    @Override // p149l.r5f
    public void onExecuted(@NonNull k9q0 k9q0Var, boolean z) {
        vuf0 vuf0VarMo141294e = this.f180203f.mo141294e(k9q0Var);
        if (vuf0VarMo141294e != null) {
            this.f180211n.m170922b(vuf0VarMo141294e);
        }
        m197206g(k9q0Var);
        if (z) {
            return;
        }
        synchronized (this.f180202e) {
            this.f180207j.remove(k9q0Var);
        }
    }
}
