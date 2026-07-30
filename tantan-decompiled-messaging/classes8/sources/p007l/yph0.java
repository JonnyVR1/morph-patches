package p007l;

import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import l.wph0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class yph0 {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f5450a;

    /* JADX INFO: renamed from: b */
    public final Object f5451b;

    /* JADX INFO: renamed from: c */
    public final Object f5452c;

    /* JADX INFO: renamed from: d */
    public int f5453d;

    /* JADX INFO: renamed from: e */
    public final List<C0798c> f5454e;

    /* JADX INFO: renamed from: l.yph0$a */
    public class ThreadFactoryC0796a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public int f5455a;

        public ThreadFactoryC0796a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder("TTPlayerFactory-");
            int i = this.f5455a;
            this.f5455a = i + 1;
            sb.append(i);
            return new Thread(runnable, sb.toString());
        }
    }

    /* JADX INFO: renamed from: l.yph0$b */
    public static class C0797b {

        /* JADX INFO: renamed from: a */
        public static final yph0 f5457a = new yph0();
    }

    /* JADX INFO: renamed from: l.yph0$c */
    public static class C0798c extends wph0 {

        /* JADX INFO: renamed from: b */
        public int f5458b;

        public C0798c(int i) {
            this.f5458b = i;
        }

        public void release() {
            super.release();
            yph0.m11944d().m11949g(this);
        }

        public void stop() throws IllegalStateException {
            super.stop();
            if (b() instanceof IjkMediaPlayer) {
                b().resetListeners();
            }
            yph0.m11944d().m11950h(this);
        }
    }

    public yph0() {
        this.f5450a = Executors.newSingleThreadExecutor(new ThreadFactoryC0796a());
        this.f5451b = new Object();
        this.f5452c = new Object();
        this.f5454e = new LinkedList();
    }

    /* JADX INFO: renamed from: d */
    public static yph0 m11944d() {
        return C0797b.f5457a;
    }

    /* JADX INFO: renamed from: b */
    public final C0798c m11945b() {
        int i;
        synchronized (this.f5451b) {
            try {
                int i2 = this.f5453d;
                if (i2 < 3) {
                    int i3 = i2 + 1;
                    this.f5453d = i3;
                    return m11946c(i3);
                }
                synchronized (this.f5452c) {
                    try {
                        if (this.f5454e.size() > 0) {
                            C0798c c0798cRemove = this.f5454e.remove(0);
                            int i4 = c0798cRemove.f5458b;
                            return c0798cRemove;
                        }
                        synchronized (this.f5451b) {
                            i = this.f5453d + 1;
                            this.f5453d = i;
                        }
                        return m11946c(i);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final C0798c m11946c(int i) {
        return new C0798c(i);
    }

    /* JADX INFO: renamed from: e */
    public wph0 m11947e() {
        return m11945b();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m11948f(wph0 wph0Var) {
        if (this.f5454e.size() >= 3) {
            wph0Var.release();
            return;
        }
        wph0Var.reset();
        synchronized (this.f5452c) {
            this.f5454e.add((C0798c) wph0Var);
        }
        this.f5454e.size();
    }

    /* JADX INFO: renamed from: g */
    public void m11949g(wph0 wph0Var) {
        synchronized (this.f5451b) {
            this.f5453d--;
        }
        synchronized (this.f5452c) {
            this.f5454e.remove(wph0Var);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m11950h(final wph0 wph0Var) {
        this.f5450a.submit(new Runnable() { // from class: l.xph0
            @Override // java.lang.Runnable
            public final void run() {
                this.f5359a.m11948f(wph0Var);
            }
        });
    }
}
