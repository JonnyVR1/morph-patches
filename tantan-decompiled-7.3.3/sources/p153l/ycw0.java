package p153l;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class ycw0 implements vcw0 {

    /* JADX INFO: renamed from: a */
    public final vcw0 f198550a;

    /* JADX INFO: renamed from: b */
    public final Queue f198551b = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: c */
    public final int f198552c = ((Integer) jas0.m144075c().m176505a(sgs0.f167948C8)).intValue();

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f198553d = new AtomicBoolean(false);

    public ycw0(vcw0 vcw0Var, ScheduledExecutorService scheduledExecutorService) {
        this.f198550a = vcw0Var;
        long jIntValue = ((Integer) jas0.m144075c().m176505a(sgs0.f167936B8)).intValue();
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168369kb)).booleanValue()) {
            scheduledExecutorService.scheduleWithFixedDelay(new Runnable() { // from class: l.xcw0
                @Override // java.lang.Runnable
                public final void run() {
                    ycw0.m215183c(this.f193410a);
                }
            }, jIntValue, jIntValue, TimeUnit.MILLISECONDS);
        } else {
            scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: l.xcw0
                @Override // java.lang.Runnable
                public final void run() {
                    ycw0.m215183c(this.f193410a);
                }
            }, jIntValue, jIntValue, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m215183c(ycw0 ycw0Var) {
        while (!ycw0Var.f198551b.isEmpty()) {
            ycw0Var.f198550a.mo125151a((ucw0) ycw0Var.f198551b.remove());
        }
    }

    @Override // p153l.vcw0
    /* JADX INFO: renamed from: a */
    public final void mo125151a(ucw0 ucw0Var) {
        if (this.f198551b.size() < this.f198552c) {
            this.f198551b.offer(ucw0Var);
            return;
        }
        if (this.f198553d.getAndSet(true)) {
            return;
        }
        Queue queue = this.f198551b;
        ucw0 ucw0VarM195443b = ucw0.m195443b("dropped_event");
        Map mapM195452j = ucw0Var.m195452j();
        if (mapM195452j.containsKey("action")) {
            ucw0VarM195443b.m195445a("dropped_action", (String) mapM195452j.get("action"));
        }
        queue.offer(ucw0VarM195443b);
    }

    @Override // p153l.vcw0
    /* JADX INFO: renamed from: b */
    public final String mo125152b(ucw0 ucw0Var) {
        return this.f198550a.mo125152b(ucw0Var);
    }
}
