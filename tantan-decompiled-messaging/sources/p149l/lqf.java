package p149l;

import androidx.annotation.MainThread;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.ExtraActLifecycle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@MainThread
public class lqf {

    /* JADX INFO: renamed from: b */
    public static lqf f129331b;

    /* JADX INFO: renamed from: a */
    public HashMap<ExtraActLifecycle, List<e30<Act>>> f129332a = new HashMap<>();

    @MainThread
    /* JADX INFO: renamed from: a */
    public static lqf m151015a() {
        if (f129331b == null) {
            f129331b = new lqf();
        }
        return f129331b;
    }

    @MainThread
    /* JADX INFO: renamed from: b */
    public void m151016b(ExtraActLifecycle extraActLifecycle, e30<Act> e30Var) {
        List<e30<Act>> arrayList = this.f129332a.get(extraActLifecycle);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            arrayList.add(e30Var);
        } else if (!arrayList.contains(e30Var)) {
            arrayList.add(e30Var);
        }
        this.f129332a.put(extraActLifecycle, arrayList);
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public void m151017c(ExtraActLifecycle extraActLifecycle, Act act) {
        List<e30<Act>> list = this.f129332a.get(extraActLifecycle);
        if (vwb.m200296J(list)) {
            return;
        }
        Iterator<e30<Act>> it = list.iterator();
        while (it.hasNext()) {
            it.next().call(act);
        }
    }

    @MainThread
    /* JADX INFO: renamed from: d */
    public void m151018d(ExtraActLifecycle extraActLifecycle, e30<Act> e30Var) {
        List<e30<Act>> list = this.f129332a.get(extraActLifecycle);
        if (vwb.m200296J(list) || !list.contains(e30Var)) {
            return;
        }
        list.remove(e30Var);
    }
}
