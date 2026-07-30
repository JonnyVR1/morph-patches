package p149l;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class b9s0 {

    /* JADX INFO: renamed from: a */
    public MotionEvent f74619a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* JADX INFO: renamed from: b */
    public MotionEvent f74620b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* JADX INFO: renamed from: c */
    public final Context f74621c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f74622d;

    /* JADX INFO: renamed from: e */
    public final w4w0 f74623e;

    /* JADX INFO: renamed from: f */
    public final d9s0 f74624f;

    public b9s0(Context context, ScheduledExecutorService scheduledExecutorService, d9s0 d9s0Var, w4w0 w4w0Var) {
        this.f74621c = context;
        this.f74622d = scheduledExecutorService;
        this.f74624f = d9s0Var;
        this.f74623e = w4w0Var;
    }

    /* JADX INFO: renamed from: a */
    public final gnr m100824a() {
        return (amw0) jmw0.m142242o(amw0.m97696C(jmw0.m142235h(null)), ((Long) r9s0.f158431c.m115379e()).longValue(), TimeUnit.MILLISECONDS, this.f74622d);
    }

    /* JADX INFO: renamed from: b */
    public final void m100825b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.f74619a.getEventTime()) {
            this.f74619a = MotionEvent.obtain(motionEvent);
        } else {
            if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.f74620b.getEventTime()) {
                return;
            }
            this.f74620b = MotionEvent.obtain(motionEvent);
        }
    }
}
