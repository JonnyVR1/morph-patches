package p153l;

import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes8.dex */
public class fyh0 {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f101374a;

    /* JADX INFO: renamed from: b */
    public final Object f101375b;

    /* JADX INFO: renamed from: c */
    public final Object f101376c;

    /* JADX INFO: renamed from: d */
    public int f101377d;

    /* JADX INFO: renamed from: e */
    public final List<C17097c> f101378e;

    /* JADX INFO: renamed from: l.fyh0$a */
    public class ThreadFactoryC17095a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public int f101379a;

        public ThreadFactoryC17095a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder("TTPlayerFactory-");
            int i = this.f101379a;
            this.f101379a = i + 1;
            sb.append(i);
            return new Thread(runnable, sb.toString());
        }
    }

    /* JADX INFO: renamed from: l.fyh0$b */
    public static class C17096b {

        /* JADX INFO: renamed from: a */
        public static final fyh0 f101381a = new fyh0();
    }

    /* JADX INFO: renamed from: l.fyh0$c */
    public static class C17097c extends dyh0 {

        /* JADX INFO: renamed from: b */
        public int f101382b;

        public C17097c(int i) {
            this.f101382b = i;
        }

        @Override // p153l.dyh0, com.tantanapp.ijk.media.player.IMediaPlayer
        public void release() {
            super.release();
            fyh0.m128089d().m128094g(this);
        }

        @Override // p153l.dyh0, com.tantanapp.ijk.media.player.IMediaPlayer
        public void stop() throws IllegalStateException {
            super.stop();
            if (m118696b() instanceof IjkMediaPlayer) {
                ((IjkMediaPlayer) m118696b()).resetListeners();
            }
            fyh0.m128089d().m128095h(this);
        }
    }

    public fyh0() {
        this.f101374a = Executors.newSingleThreadExecutor(new ThreadFactoryC17095a());
        this.f101375b = new Object();
        this.f101376c = new Object();
        this.f101378e = new LinkedList();
    }

    /* JADX INFO: renamed from: d */
    public static fyh0 m128089d() {
        return C17096b.f101381a;
    }

    /* JADX INFO: renamed from: b */
    public final C17097c m128090b() {
        int i;
        synchronized (this.f101375b) {
            try {
                int i2 = this.f101377d;
                if (i2 < 3) {
                    int i3 = i2 + 1;
                    this.f101377d = i3;
                    return m128091c(i3);
                }
                synchronized (this.f101376c) {
                    try {
                        if (this.f101378e.size() > 0) {
                            C17097c c17097cRemove = this.f101378e.remove(0);
                            int i4 = c17097cRemove.f101382b;
                            return c17097cRemove;
                        }
                        synchronized (this.f101375b) {
                            i = this.f101377d + 1;
                            this.f101377d = i;
                        }
                        return m128091c(i);
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
    public final C17097c m128091c(int i) {
        return new C17097c(i);
    }

    /* JADX INFO: renamed from: e */
    public dyh0 m128092e() {
        return m128090b();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m128093f(dyh0 dyh0Var) {
        if (this.f101378e.size() >= 3) {
            dyh0Var.release();
            return;
        }
        dyh0Var.reset();
        synchronized (this.f101376c) {
            this.f101378e.add((C17097c) dyh0Var);
        }
        this.f101378e.size();
    }

    /* JADX INFO: renamed from: g */
    public void m128094g(dyh0 dyh0Var) {
        synchronized (this.f101375b) {
            this.f101377d--;
        }
        synchronized (this.f101376c) {
            this.f101378e.remove(dyh0Var);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m128095h(final dyh0 dyh0Var) {
        this.f101374a.submit(new Runnable() { // from class: l.eyh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f96435a.m128093f(dyh0Var);
            }
        });
    }
}
