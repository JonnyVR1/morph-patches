package p153l;

import androidx.annotation.MainThread;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.ExtraActLifecycle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@MainThread
public class srf {

    /* JADX INFO: renamed from: b */
    public static srf f170328b;

    /* JADX INFO: renamed from: a */
    public HashMap<ExtraActLifecycle, List<y20<Act>>> f170329a = new HashMap<>();

    @MainThread
    /* JADX INFO: renamed from: a */
    public static srf m187598a() {
        if (f170328b == null) {
            f170328b = new srf();
        }
        return f170328b;
    }

    @MainThread
    /* JADX INFO: renamed from: b */
    public void m187599b(ExtraActLifecycle extraActLifecycle, y20<Act> y20Var) {
        List<y20<Act>> arrayList = this.f170329a.get(extraActLifecycle);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            arrayList.add(y20Var);
        } else if (!arrayList.contains(y20Var)) {
            arrayList.add(y20Var);
        }
        this.f170329a.put(extraActLifecycle, arrayList);
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public void m187600c(ExtraActLifecycle extraActLifecycle, Act act) {
        List<y20<Act>> list = this.f170329a.get(extraActLifecycle);
        if (jyb.m147479J(list)) {
            return;
        }
        Iterator<y20<Act>> it = list.iterator();
        while (it.hasNext()) {
            it.next().call(act);
        }
    }

    @MainThread
    /* JADX INFO: renamed from: d */
    public void m187601d(ExtraActLifecycle extraActLifecycle, y20<Act> y20Var) {
        List<y20<Act>> list = this.f170329a.get(extraActLifecycle);
        if (jyb.m147479J(list) || !list.contains(y20Var)) {
            return;
        }
        list.remove(y20Var);
    }
}
