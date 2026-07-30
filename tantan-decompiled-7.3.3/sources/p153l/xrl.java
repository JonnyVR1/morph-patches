package p153l;

import android.app.Activity;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class xrl {

    /* JADX INFO: renamed from: c */
    private static xrl f195930c = new xrl();

    /* JADX INFO: renamed from: a */
    private List<Activity> f195931a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b */
    HashMap<String, Activity> f195932b = new HashMap<>();

    private xrl() {
    }

    /* JADX INFO: renamed from: a */
    public static xrl m212838a() {
        return f195930c;
    }

    /* JADX INFO: renamed from: b */
    public Activity m212839b() {
        List<Activity> list = this.f195931a;
        if (list == null || list.size() == 0) {
            return null;
        }
        List<Activity> list2 = this.f195931a;
        return list2.get(list2.size() - 1);
    }

    /* JADX INFO: renamed from: c */
    public void m212840c(Activity activity) {
        this.f195931a.add(activity);
        this.f195932b.put(activity.getClass().getName(), activity);
    }

    /* JADX INFO: renamed from: e */
    public void m212842e(Activity activity) {
        if (this.f195931a.contains(activity)) {
            this.f195931a.remove(activity);
        }
        if (this.f195932b.containsKey(activity.getClass().getName())) {
            this.f195932b.remove(activity.getClass().getName());
        }
    }

    /* JADX INFO: renamed from: f */
    public void m212843f(Activity activity) {
        if (!this.f195931a.contains(activity)) {
            this.f195931a.add(activity);
        }
        if (this.f195932b.containsKey(activity.getClass().getName())) {
            return;
        }
        this.f195932b.put(activity.getClass().getName(), activity);
    }

    /* JADX INFO: renamed from: d */
    public void m212841d(Activity activity) {
    }
}
