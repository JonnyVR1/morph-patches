package p149l;

import java.util.concurrent.ThreadFactory;
import p133rx.internal.util.RxThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public class kjd0 {

    /* JADX INFO: renamed from: a */
    public static final kjd0 f123444a = new kjd0();

    /* JADX INFO: renamed from: a */
    public static bud0 m146217a() {
        return m146218b(new RxThreadFactory("RxComputationScheduler-"));
    }

    /* JADX INFO: renamed from: b */
    public static bud0 m146218b(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new v3f(threadFactory);
        }
        jfd0.m141176a("threadFactory == null");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static bud0 m146219c() {
        return m146220d(new RxThreadFactory("RxIoScheduler-"));
    }

    /* JADX INFO: renamed from: d */
    public static bud0 m146220d(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new lx3(threadFactory);
        }
        jfd0.m141176a("threadFactory == null");
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static bud0 m146221e() {
        return m146222f(new RxThreadFactory("RxNewThreadScheduler-"));
    }

    /* JADX INFO: renamed from: f */
    public static bud0 m146222f(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new wa40(threadFactory);
        }
        jfd0.m141176a("threadFactory == null");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static kjd0 m146223h() {
        return f123444a;
    }

    /* JADX INFO: renamed from: g */
    public bud0 m146224g() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public bud0 m146225i() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public bud0 m146226j() {
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public d30 m146227k(d30 d30Var) {
        return d30Var;
    }
}
