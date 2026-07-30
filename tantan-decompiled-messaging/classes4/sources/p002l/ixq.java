package p002l;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ixq extends zqi0 {
    @Override // p002l.zqi0
    /* JADX INFO: renamed from: b */
    public evl mo10140b(Runnable runnable, xoi0 xoi0Var) {
        C0624a c0624a = new C0624a(runnable);
        c0624a.m15501a(xoi0Var.m26044a());
        return c0624a;
    }

    /* JADX INFO: renamed from: l.ixq$a */
    public static class C0624a implements evl {

        /* JADX INFO: renamed from: a */
        public ScheduledExecutorService f13474a;

        /* JADX INFO: renamed from: b */
        public Runnable f13475b;

        /* JADX INFO: renamed from: c */
        public int f13476c;

        public C0624a(Runnable runnable, int i) {
            this.f13475b = runnable;
            this.f13476c = i;
        }

        /* JADX INFO: renamed from: a */
        public void m15501a(ScheduledExecutorService scheduledExecutorService) {
            this.f13474a = scheduledExecutorService;
        }

        @Override // p002l.evl
        public void start() {
            Runnable runnable;
            if (this.f13474a.isShutdown() || (runnable = this.f13475b) == null) {
                return;
            }
            this.f13474a.scheduleAtFixedRate(runnable, 0L, this.f13476c, TimeUnit.SECONDS);
        }

        @Override // p002l.evl
        public void stop() {
            ScheduledExecutorService scheduledExecutorService = this.f13474a;
            if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
                return;
            }
            this.f13474a.shutdownNow();
        }

        public C0624a(Runnable runnable) {
            this(runnable, 30);
        }
    }
}
