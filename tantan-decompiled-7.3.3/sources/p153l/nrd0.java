package p153l;

import java.util.concurrent.ThreadFactory;
import p137rx.internal.util.RxThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public class nrd0 {

    /* JADX INFO: renamed from: a */
    public static final nrd0 f143398a = new nrd0();

    /* JADX INFO: renamed from: a */
    public static f2e0 m164470a() {
        return m164471b(new RxThreadFactory("RxComputationScheduler-"));
    }

    /* JADX INFO: renamed from: b */
    public static f2e0 m164471b(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new z4f(threadFactory);
        }
        mnd0.m159157a("threadFactory == null");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static f2e0 m164472c() {
        return m164473d(new RxThreadFactory("RxIoScheduler-"));
    }

    /* JADX INFO: renamed from: d */
    public static f2e0 m164473d(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new ky3(threadFactory);
        }
        mnd0.m159157a("threadFactory == null");
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static f2e0 m164474e() {
        return m164475f(new RxThreadFactory("RxNewThreadScheduler-"));
    }

    /* JADX INFO: renamed from: f */
    public static f2e0 m164475f(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new kj40(threadFactory);
        }
        mnd0.m159157a("threadFactory == null");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static nrd0 m164476h() {
        return f143398a;
    }

    /* JADX INFO: renamed from: g */
    public f2e0 m164477g() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public f2e0 m164478i() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public f2e0 m164479j() {
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public x20 m164480k(x20 x20Var) {
        return x20Var;
    }
}
