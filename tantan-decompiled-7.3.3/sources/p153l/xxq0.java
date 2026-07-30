package p153l;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xxq0 {

    /* JADX INFO: renamed from: a */
    private List<jrq0> f196674a = new ArrayList(3);

    private xxq0(Handler handler, Context context) {
        if (lrq0.m155646j(context)) {
            this.f196674a.add(new kwq0(handler, 0L, 15000L));
        }
    }

    /* JADX INFO: renamed from: a */
    public static xxq0 m213555a(Handler handler, Context context) {
        return new xxq0(handler, context);
    }

    /* JADX INFO: renamed from: b */
    public void m213556b() {
        q5r0.m175511a("[ScheduleTaskManager] execute, task size=" + this.f196674a.size());
        Iterator<jrq0> it = this.f196674a.iterator();
        while (it.hasNext()) {
            try {
                it.next().m146814a();
            } catch (Throwable unused) {
            }
        }
    }
}
