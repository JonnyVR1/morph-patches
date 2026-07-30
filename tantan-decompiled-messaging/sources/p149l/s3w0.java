package p149l;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class s3w0 implements p3w0 {

    /* JADX INFO: renamed from: a */
    public final p3w0 f162202a;

    /* JADX INFO: renamed from: b */
    public final Queue f162203b = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: c */
    public final int f162204c = ((Integer) d1s0.m109677c().m144697a(m7s0.f131877C8)).intValue();

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f162205d = new AtomicBoolean(false);

    public s3w0(p3w0 p3w0Var, ScheduledExecutorService scheduledExecutorService) {
        this.f162202a = p3w0Var;
        long jIntValue = ((Integer) d1s0.m109677c().m144697a(m7s0.f131865B8)).intValue();
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132298kb)).booleanValue()) {
            scheduledExecutorService.scheduleWithFixedDelay(new Runnable() { // from class: l.r3w0
                @Override // java.lang.Runnable
                public final void run() {
                    s3w0.m182204c(this.f157616a);
                }
            }, jIntValue, jIntValue, TimeUnit.MILLISECONDS);
        } else {
            scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: l.r3w0
                @Override // java.lang.Runnable
                public final void run() {
                    s3w0.m182204c(this.f157616a);
                }
            }, jIntValue, jIntValue, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m182204c(s3w0 s3w0Var) {
        while (!s3w0Var.f162203b.isEmpty()) {
            s3w0Var.f162202a.mo124429a((o3w0) s3w0Var.f162203b.remove());
        }
    }

    @Override // p149l.p3w0
    /* JADX INFO: renamed from: a */
    public final void mo124429a(o3w0 o3w0Var) {
        if (this.f162203b.size() < this.f162204c) {
            this.f162203b.offer(o3w0Var);
            return;
        }
        if (this.f162205d.getAndSet(true)) {
            return;
        }
        Queue queue = this.f162203b;
        o3w0 o3w0VarM162489b = o3w0.m162489b("dropped_event");
        Map mapM162498j = o3w0Var.m162498j();
        if (mapM162498j.containsKey("action")) {
            o3w0VarM162489b.m162491a("dropped_action", (String) mapM162498j.get("action"));
        }
        queue.offer(o3w0VarM162489b);
    }

    @Override // p149l.p3w0
    /* JADX INFO: renamed from: b */
    public final String mo124430b(o3w0 o3w0Var) {
        return this.f162202a.mo124430b(o3w0Var);
    }
}
