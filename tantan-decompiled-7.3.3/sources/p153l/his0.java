package p153l;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class his0 {

    /* JADX INFO: renamed from: a */
    public MotionEvent f110062a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* JADX INFO: renamed from: b */
    public MotionEvent f110063b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* JADX INFO: renamed from: c */
    public final Context f110064c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f110065d;

    /* JADX INFO: renamed from: e */
    public final cew0 f110066e;

    /* JADX INFO: renamed from: f */
    public final jis0 f110067f;

    public his0(Context context, ScheduledExecutorService scheduledExecutorService, jis0 jis0Var, cew0 cew0Var) {
        this.f110064c = context;
        this.f110065d = scheduledExecutorService;
        this.f110067f = jis0Var;
        this.f110066e = cew0Var;
    }

    /* JADX INFO: renamed from: a */
    public final hpr m135135a() {
        return (gvw0) pvw0.m173988o(gvw0.m132580C(pvw0.m173981h(null)), ((Long) xis0.f194496c.m149974e()).longValue(), TimeUnit.MILLISECONDS, this.f110065d);
    }

    /* JADX INFO: renamed from: b */
    public final void m135136b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.f110062a.getEventTime()) {
            this.f110062a = MotionEvent.obtain(motionEvent);
        } else {
            if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.f110063b.getEventTime()) {
                return;
            }
            this.f110063b = MotionEvent.obtain(motionEvent);
        }
    }
}
