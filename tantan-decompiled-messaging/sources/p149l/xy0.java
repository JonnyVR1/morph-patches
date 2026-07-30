package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class xy0 extends afi0 {

    /* JADX INFO: renamed from: c */
    public static volatile xy0 f194981c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public static final Executor f194982d = new Executor() { // from class: l.vy0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            xy0.m211654g().mo96228c(runnable);
        }
    };

    /* JADX INFO: renamed from: e */
    @NonNull
    public static final Executor f194983e = new Executor() { // from class: l.wy0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            xy0.m211654g().mo96226a(runnable);
        }
    };

    /* JADX INFO: renamed from: a */
    @NonNull
    public afi0 f194984a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final afi0 f194985b;

    public xy0() {
        uqd uqdVar = new uqd();
        this.f194985b = uqdVar;
        this.f194984a = uqdVar;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static Executor m211653f() {
        return f194983e;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static xy0 m211654g() {
        if (f194981c != null) {
            return f194981c;
        }
        synchronized (xy0.class) {
            try {
                if (f194981c == null) {
                    f194981c = new xy0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f194981c;
    }

    @Override // p149l.afi0
    /* JADX INFO: renamed from: a */
    public void mo96226a(@NonNull Runnable runnable) {
        this.f194984a.mo96226a(runnable);
    }

    @Override // p149l.afi0
    /* JADX INFO: renamed from: b */
    public boolean mo96227b() {
        return this.f194984a.mo96227b();
    }

    @Override // p149l.afi0
    /* JADX INFO: renamed from: c */
    public void mo96228c(@NonNull Runnable runnable) {
        this.f194984a.mo96228c(runnable);
    }
}
