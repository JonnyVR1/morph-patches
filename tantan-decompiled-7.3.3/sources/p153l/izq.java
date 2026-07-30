package p153l;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class izq extends c0j0 {
    @Override // p153l.c0j0
    /* JADX INFO: renamed from: b */
    public wxl mo107428b(Runnable runnable, zxi0 zxi0Var) {
        C17833a c17833a = new C17833a(runnable);
        c17833a.m142816a(zxi0Var.m221991a());
        return c17833a;
    }

    /* JADX INFO: renamed from: l.izq$a */
    public static class C17833a implements wxl {

        /* JADX INFO: renamed from: a */
        public ScheduledExecutorService f117733a;

        /* JADX INFO: renamed from: b */
        public Runnable f117734b;

        /* JADX INFO: renamed from: c */
        public int f117735c;

        public C17833a(Runnable runnable, int i) {
            this.f117734b = runnable;
            this.f117735c = i;
        }

        /* JADX INFO: renamed from: a */
        public void m142816a(ScheduledExecutorService scheduledExecutorService) {
            this.f117733a = scheduledExecutorService;
        }

        @Override // p153l.wxl
        public void start() {
            Runnable runnable;
            if (this.f117733a.isShutdown() || (runnable = this.f117734b) == null) {
                return;
            }
            this.f117733a.scheduleAtFixedRate(runnable, 0L, this.f117735c, TimeUnit.SECONDS);
        }

        @Override // p153l.wxl
        public void stop() {
            ScheduledExecutorService scheduledExecutorService = this.f117733a;
            if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
                return;
            }
            this.f117733a.shutdownNow();
        }

        public C17833a(Runnable runnable) {
            this(runnable, 30);
        }
    }
}
