package p007l;

import androidx.annotation.MainThread;
import com.p003p1.mobile.android.app.Act;
import com.p003p1.mobile.android.app.ExtraActLifecycle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l.e30;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@MainThread
public class lqf {

    /* JADX INFO: renamed from: b */
    public static lqf f3243b;

    /* JADX INFO: renamed from: a */
    public HashMap<ExtraActLifecycle, List<e30<Act>>> f3244a = new HashMap<>();

    @MainThread
    /* JADX INFO: renamed from: a */
    public static lqf m9815a() {
        if (f3243b == null) {
            f3243b = new lqf();
        }
        return f3243b;
    }

    @MainThread
    /* JADX INFO: renamed from: b */
    public void m9816b(ExtraActLifecycle extraActLifecycle, e30<Act> e30Var) {
        List<e30<Act>> arrayList = this.f3244a.get(extraActLifecycle);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            arrayList.add(e30Var);
        } else if (!arrayList.contains(e30Var)) {
            arrayList.add(e30Var);
        }
        this.f3244a.put(extraActLifecycle, arrayList);
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public void m9817c(ExtraActLifecycle extraActLifecycle, Act act) {
        List<e30<Act>> list = this.f3244a.get(extraActLifecycle);
        if (vwb.J(list)) {
            return;
        }
        Iterator<e30<Act>> it = list.iterator();
        while (it.hasNext()) {
            it.next().call(act);
        }
    }

    @MainThread
    /* JADX INFO: renamed from: d */
    public void m9818d(ExtraActLifecycle extraActLifecycle, e30<Act> e30Var) {
        List<e30<Act>> list = this.f3244a.get(extraActLifecycle);
        if (vwb.J(list) || !list.contains(e30Var)) {
            return;
        }
        list.remove(e30Var);
    }
}
