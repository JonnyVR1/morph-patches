package p149l;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class ixq extends zqi0 {
    @Override // p149l.zqi0
    /* JADX INFO: renamed from: b */
    public evl mo99788b(Runnable runnable, xoi0 xoi0Var) {
        C17642a c17642a = new C17642a(runnable);
        c17642a.m138883a(xoi0Var.m210429a());
        return c17642a;
    }

    /* JADX INFO: renamed from: l.ixq$a */
    public static class C17642a implements evl {

        /* JADX INFO: renamed from: a */
        public ScheduledExecutorService f115389a;

        /* JADX INFO: renamed from: b */
        public Runnable f115390b;

        /* JADX INFO: renamed from: c */
        public int f115391c;

        public C17642a(Runnable runnable, int i) {
            this.f115390b = runnable;
            this.f115391c = i;
        }

        /* JADX INFO: renamed from: a */
        public void m138883a(ScheduledExecutorService scheduledExecutorService) {
            this.f115389a = scheduledExecutorService;
        }

        @Override // p149l.evl
        public void start() {
            Runnable runnable;
            if (this.f115389a.isShutdown() || (runnable = this.f115390b) == null) {
                return;
            }
            this.f115389a.scheduleAtFixedRate(runnable, 0L, this.f115391c, TimeUnit.SECONDS);
        }

        @Override // p149l.evl
        public void stop() {
            ScheduledExecutorService scheduledExecutorService = this.f115389a;
            if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
                return;
            }
            this.f115389a.shutdownNow();
        }

        public C17642a(Runnable runnable) {
            this(runnable, 30);
        }
    }
}
