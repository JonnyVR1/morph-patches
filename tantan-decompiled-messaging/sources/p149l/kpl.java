package p149l;

import android.app.Activity;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class kpl {

    /* JADX INFO: renamed from: c */
    private static kpl f124168c = new kpl();

    /* JADX INFO: renamed from: a */
    private List<Activity> f124169a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b */
    HashMap<String, Activity> f124170b = new HashMap<>();

    private kpl() {
    }

    /* JADX INFO: renamed from: a */
    public static kpl m146872a() {
        return f124168c;
    }

    /* JADX INFO: renamed from: b */
    public Activity m146873b() {
        List<Activity> list = this.f124169a;
        if (list == null || list.size() == 0) {
            return null;
        }
        List<Activity> list2 = this.f124169a;
        return list2.get(list2.size() - 1);
    }

    /* JADX INFO: renamed from: c */
    public void m146874c(Activity activity) {
        this.f124169a.add(activity);
        this.f124170b.put(activity.getClass().getName(), activity);
    }

    /* JADX INFO: renamed from: e */
    public void m146876e(Activity activity) {
        if (this.f124169a.contains(activity)) {
            this.f124169a.remove(activity);
        }
        if (this.f124170b.containsKey(activity.getClass().getName())) {
            this.f124170b.remove(activity.getClass().getName());
        }
    }

    /* JADX INFO: renamed from: f */
    public void m146877f(Activity activity) {
        if (!this.f124169a.contains(activity)) {
            this.f124169a.add(activity);
        }
        if (this.f124170b.containsKey(activity.getClass().getName())) {
            return;
        }
        this.f124170b.put(activity.getClass().getName(), activity);
    }

    /* JADX INFO: renamed from: d */
    public void m146875d(Activity activity) {
    }
}
