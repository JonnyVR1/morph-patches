package p003l;

import java.util.concurrent.ThreadFactory;
import l.jfd0;
import p014rx.internal.util.RxThreadFactory;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class kjd0 {

    /* JADX INFO: renamed from: a */
    public static final kjd0 f4965a = new kjd0();

    /* JADX INFO: renamed from: a */
    public static bud0 m5685a() {
        return m5686b(new RxThreadFactory("RxComputationScheduler-"));
    }

    /* JADX INFO: renamed from: b */
    public static bud0 m5686b(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new v3f(threadFactory);
        }
        jfd0.a("threadFactory == null");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static bud0 m5687c() {
        return m5688d(new RxThreadFactory("RxIoScheduler-"));
    }

    /* JADX INFO: renamed from: d */
    public static bud0 m5688d(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new lx3(threadFactory);
        }
        jfd0.a("threadFactory == null");
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static bud0 m5689e() {
        return m5690f(new RxThreadFactory("RxNewThreadScheduler-"));
    }

    /* JADX INFO: renamed from: f */
    public static bud0 m5690f(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new wa40(threadFactory);
        }
        jfd0.a("threadFactory == null");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static kjd0 m5691h() {
        return f4965a;
    }

    /* JADX INFO: renamed from: g */
    public bud0 m5692g() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public bud0 m5693i() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public bud0 m5694j() {
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public d30 m5695k(d30 d30Var) {
        return d30Var;
    }
}
