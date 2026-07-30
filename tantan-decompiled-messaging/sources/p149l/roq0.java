package p149l;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class roq0 {

    /* JADX INFO: renamed from: a */
    private List<eiq0> f160410a = new ArrayList(3);

    private roq0(Handler handler, Context context) {
        if (giq0.m126395j(context)) {
            this.f160410a.add(new enq0(handler, 0L, 15000L));
        }
    }

    /* JADX INFO: renamed from: a */
    public static roq0 m180245a(Handler handler, Context context) {
        return new roq0(handler, context);
    }

    /* JADX INFO: renamed from: b */
    public void m180246b() {
        kwq0.m147628a("[ScheduleTaskManager] execute, task size=" + this.f160410a.size());
        Iterator<eiq0> it = this.f160410a.iterator();
        while (it.hasNext()) {
            try {
                it.next().m116719a();
            } catch (Throwable unused) {
            }
        }
    }
}
