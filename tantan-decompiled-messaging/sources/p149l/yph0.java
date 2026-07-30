package p149l;

import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes8.dex */
public class yph0 {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f199446a;

    /* JADX INFO: renamed from: b */
    public final Object f199447b;

    /* JADX INFO: renamed from: c */
    public final Object f199448c;

    /* JADX INFO: renamed from: d */
    public int f199449d;

    /* JADX INFO: renamed from: e */
    public final List<C21466c> f199450e;

    /* JADX INFO: renamed from: l.yph0$a */
    public class ThreadFactoryC21464a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public int f199451a;

        public ThreadFactoryC21464a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder("TTPlayerFactory-");
            int i = this.f199451a;
            this.f199451a = i + 1;
            sb.append(i);
            return new Thread(runnable, sb.toString());
        }
    }

    /* JADX INFO: renamed from: l.yph0$b */
    public static class C21465b {

        /* JADX INFO: renamed from: a */
        public static final yph0 f199453a = new yph0();
    }

    /* JADX INFO: renamed from: l.yph0$c */
    public static class C21466c extends wph0 {

        /* JADX INFO: renamed from: b */
        public int f199454b;

        public C21466c(int i) {
            this.f199454b = i;
        }

        @Override // p149l.wph0, com.tantanapp.ijk.media.player.IMediaPlayer
        public void release() {
            super.release();
            yph0.m215627d().m215632g(this);
        }

        @Override // p149l.wph0, com.tantanapp.ijk.media.player.IMediaPlayer
        public void stop() throws IllegalStateException {
            super.stop();
            if (m204913b() instanceof IjkMediaPlayer) {
                ((IjkMediaPlayer) m204913b()).resetListeners();
            }
            yph0.m215627d().m215633h(this);
        }
    }

    public yph0() {
        this.f199446a = Executors.newSingleThreadExecutor(new ThreadFactoryC21464a());
        this.f199447b = new Object();
        this.f199448c = new Object();
        this.f199450e = new LinkedList();
    }

    /* JADX INFO: renamed from: d */
    public static yph0 m215627d() {
        return C21465b.f199453a;
    }

    /* JADX INFO: renamed from: b */
    public final C21466c m215628b() {
        int i;
        synchronized (this.f199447b) {
            try {
                int i2 = this.f199449d;
                if (i2 < 3) {
                    int i3 = i2 + 1;
                    this.f199449d = i3;
                    return m215629c(i3);
                }
                synchronized (this.f199448c) {
                    try {
                        if (this.f199450e.size() > 0) {
                            C21466c c21466cRemove = this.f199450e.remove(0);
                            int i4 = c21466cRemove.f199454b;
                            return c21466cRemove;
                        }
                        synchronized (this.f199447b) {
                            i = this.f199449d + 1;
                            this.f199449d = i;
                        }
                        return m215629c(i);
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
    public final C21466c m215629c(int i) {
        return new C21466c(i);
    }

    /* JADX INFO: renamed from: e */
    public wph0 m215630e() {
        return m215628b();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m215631f(wph0 wph0Var) {
        if (this.f199450e.size() >= 3) {
            wph0Var.release();
            return;
        }
        wph0Var.reset();
        synchronized (this.f199448c) {
            this.f199450e.add((C21466c) wph0Var);
        }
        this.f199450e.size();
    }

    /* JADX INFO: renamed from: g */
    public void m215632g(wph0 wph0Var) {
        synchronized (this.f199447b) {
            this.f199449d--;
        }
        synchronized (this.f199448c) {
            this.f199450e.remove(wph0Var);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m215633h(final wph0 wph0Var) {
        this.f199446a.submit(new Runnable() { // from class: l.xph0
            @Override // java.lang.Runnable
            public final void run() {
                this.f193920a.m215631f(wph0Var);
            }
        });
    }
}
