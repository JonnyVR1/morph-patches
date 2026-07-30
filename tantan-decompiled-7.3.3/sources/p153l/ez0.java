package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ez0 extends aoi0 {

    /* JADX INFO: renamed from: c */
    public static volatile ez0 f96549c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public static final Executor f96550d = new Executor() { // from class: l.cz0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            ez0.m123336g().mo99085c(runnable);
        }
    };

    /* JADX INFO: renamed from: e */
    @NonNull
    public static final Executor f96551e = new Executor() { // from class: l.dz0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            ez0.m123336g().mo99083a(runnable);
        }
    };

    /* JADX INFO: renamed from: a */
    @NonNull
    public aoi0 f96552a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final aoi0 f96553b;

    public ez0() {
        jsd jsdVar = new jsd();
        this.f96553b = jsdVar;
        this.f96552a = jsdVar;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static Executor m123335f() {
        return f96551e;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static ez0 m123336g() {
        if (f96549c != null) {
            return f96549c;
        }
        synchronized (ez0.class) {
            try {
                if (f96549c == null) {
                    f96549c = new ez0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f96549c;
    }

    @Override // p153l.aoi0
    /* JADX INFO: renamed from: a */
    public void mo99083a(@NonNull Runnable runnable) {
        this.f96552a.mo99083a(runnable);
    }

    @Override // p153l.aoi0
    /* JADX INFO: renamed from: b */
    public boolean mo99084b() {
        return this.f96552a.mo99084b();
    }

    @Override // p153l.aoi0
    /* JADX INFO: renamed from: c */
    public void mo99085c(@NonNull Runnable runnable) {
        this.f96552a.mo99085c(runnable);
    }
}
