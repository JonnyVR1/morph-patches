package p149l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.android.p048ui.pushbubble.SimplePushBubble;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes8.dex */
public class wc80 {

    /* JADX INFO: renamed from: b */
    public WeakReference<Activity> f185658b;

    /* JADX INFO: renamed from: a */
    public final Map<String, PriorityQueue<uc80>> f185657a = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Application.ActivityLifecycleCallbacks f185659c = new C20847a();

    /* JADX INFO: renamed from: l.wc80$b */
    public static final class C20848b {

        /* JADX INFO: renamed from: a */
        public static final wc80 f185661a = new wc80();
    }

    /* JADX INFO: renamed from: e */
    public static wc80 m202636e() {
        return C20848b.f185661a;
    }

    /* JADX INFO: renamed from: d */
    public final void m202637d(uc80 uc80Var) {
        uc80Var.m192997f();
        m202645m("manager step dismiss", uc80Var);
        uc80Var.m193006q(false);
        PriorityQueue<uc80> priorityQueue = this.f185657a.get(m202639g());
        if (!vwb.m200296J(priorityQueue)) {
            priorityQueue.remove(uc80Var);
        }
        uc80 uc80VarPoll = vwb.m200296J(priorityQueue) ? null : priorityQueue.poll();
        if (!NullChecker.m81303a(uc80VarPoll) || uc80VarPoll.m192999h() == 1) {
            return;
        }
        m202645m("manager step dismiss next ", uc80VarPoll);
        m202646n(uc80VarPoll);
        priorityQueue.clear();
    }

    /* JADX INFO: renamed from: f */
    public uc80 m202638f() {
        if (this.f185657a.isEmpty()) {
            return null;
        }
        PriorityQueue<uc80> priorityQueue = this.f185657a.get(m202639g());
        if (!NullChecker.m81303a(priorityQueue) || priorityQueue.size() <= 0 || !NullChecker.m81303a(priorityQueue.peek()) || priorityQueue.peek().m193002m()) {
            return null;
        }
        return priorityQueue.peek();
    }

    /* JADX INFO: renamed from: g */
    public final String m202639g() {
        return m202640h(null);
    }

    /* JADX INFO: renamed from: h */
    public final String m202640h(Activity activity) {
        String strPageId;
        if (activity == null) {
            activity = NullChecker.m81303a(this.f185658b) ? this.f185658b.get() : null;
        }
        if (activity == null) {
            return "p_default_view";
        }
        if (!(activity instanceof Act)) {
            strPageId = "";
            break;
        }
        List<Fragment> listM2589t0 = ((Act) activity).getSupportFragmentManager().m2589t0();
        int i = 0;
        while (true) {
            if (i >= listM2589t0.size()) {
                strPageId = "";
                break;
            }
            Fragment fragment = listM2589t0.get(i);
            if (NullChecker.m81303a(fragment) && (fragment instanceof Frag) && fragment.isVisible()) {
                strPageId = ((Frag) fragment).pageId();
                break;
            }
            i++;
        }
        return TextUtils.isEmpty(strPageId) ? String.valueOf(activity.hashCode()) : strPageId;
    }

    /* JADX INFO: renamed from: i */
    public final List<String> m202641i(Activity activity) {
        ArrayList arrayList = new ArrayList();
        if (activity == null) {
            activity = NullChecker.m81303a(this.f185658b) ? this.f185658b.get() : null;
        }
        if (activity == null) {
            arrayList.add("p_default_view");
            return arrayList;
        }
        if (activity instanceof Act) {
            List<Fragment> listM2589t0 = ((Act) activity).getSupportFragmentManager().m2589t0();
            for (int i = 0; i < listM2589t0.size(); i++) {
                Fragment fragment = listM2589t0.get(i);
                if (NullChecker.m81303a(fragment) && (fragment instanceof Frag)) {
                    arrayList.add(((Frag) fragment).pageId());
                }
            }
        }
        if (vwb.m200296J(arrayList)) {
            arrayList.add(String.valueOf(activity.hashCode()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public void m202642j() {
        App.f15369e.registerActivityLifecycleCallbacks(this.f185659c);
    }

    /* JADX INFO: renamed from: k */
    public boolean m202643k() {
        if (this.f185657a.isEmpty()) {
            return false;
        }
        PriorityQueue<uc80> priorityQueue = this.f185657a.get(m202639g());
        return !vwb.m200296J(priorityQueue) && NullChecker.m81303a(priorityQueue.peek()) && priorityQueue.peek().m193002m();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m202644l(uc80 uc80Var, j0m j0mVar) {
        m202637d(uc80Var);
    }

    /* JADX INFO: renamed from: m */
    public void m202645m(String str, @Nullable uc80 uc80Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" , act: ");
        sb.append(m202639g());
        sb.append(" , build: ");
        sb.append(uc80Var != null ? Integer.valueOf(uc80Var.hashCode()) : "null");
        du2.m113670a("[PopUp]", sb.toString());
    }

    /* JADX INFO: renamed from: n */
    public final void m202646n(final uc80 uc80Var) {
        boolean zMo20867h;
        l0m l0mVarM192998g = uc80Var.m192998g();
        uc80Var.m192997f();
        if (NullChecker.m81303a(l0mVarM192998g) && l0mVarM192998g.isValid()) {
            m202645m("manager step real show valid", uc80Var);
            uc80Var.m192998g().mo20868i(new f0m() { // from class: l.vc80
                @Override // p149l.f0m
                /* JADX INFO: renamed from: a */
                public final void mo21109a(j0m j0mVar) {
                    this.f180913a.m202644l(uc80Var, j0mVar);
                }
            });
            zMo20867h = uc80Var.m192998g().mo20867h(uc80Var);
        } else {
            zMo20867h = false;
        }
        m202645m("manager step real show back " + zMo20867h, uc80Var);
        if (!zMo20867h) {
            m202651s();
            return;
        }
        String strM202639g = m202639g();
        PriorityQueue<uc80> priorityQueue = new PriorityQueue<>();
        try {
            priorityQueue.add(uc80Var);
        } catch (Exception unused) {
        }
        this.f185657a.put(strM202639g, priorityQueue);
        uc80Var.m193006q(true);
    }

    /* JADX INFO: renamed from: o */
    public final void m202647o(Activity activity) {
        if (this.f185657a.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, PriorityQueue<uc80>>> it = this.f185657a.entrySet().iterator();
        List<String> listM202641i = m202641i(activity);
        while (it.hasNext() && !vwb.m200296J(listM202641i)) {
            if (listM202641i.contains(it.next().getKey())) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m202648p() {
        this.f185657a.clear();
        App.f15369e.unregisterActivityLifecycleCallbacks(this.f185659c);
    }

    /* JADX INFO: renamed from: q */
    public void m202649q(uc80 uc80Var) {
        m202650r(uc80Var, false);
    }

    /* JADX INFO: renamed from: r */
    public final void m202650r(uc80 uc80Var, boolean z) {
        m202645m("manager start show: " + uc80Var.m192999h(), uc80Var);
        PriorityQueue<uc80> priorityQueue = this.f185657a.get(m202639g());
        m202639g();
        if (!vwb.m200296J(priorityQueue)) {
            priorityQueue.size();
        }
        StringBuilder sb = new StringBuilder("manager start step1: ");
        sb.append(vwb.m200296J(priorityQueue) ? 0 : priorityQueue.size());
        m202645m(sb.toString(), uc80Var);
        uc80 uc80VarPeek = !vwb.m200296J(priorityQueue) ? priorityQueue.peek() : null;
        if (!NullChecker.m81303a(uc80VarPeek) || !uc80VarPeek.m193002m() || z) {
            m202645m("manager step real show", uc80Var);
            m202646n(uc80Var);
            return;
        }
        if (uc80Var.m192999h() == 1) {
            m202645m("manager step remove low", uc80Var);
            return;
        }
        l0m l0mVarM192998g = uc80Var.m192998g();
        if (l0mVarM192998g instanceof SimplePushBubble) {
            SimplePushBubble simplePushBubble = (SimplePushBubble) l0mVarM192998g;
            if (simplePushBubble.getPriority() == 5 || (simplePushBubble.getPriority() == 3 && simplePushBubble.getPriority() > uc80VarPeek.m192999h())) {
                uc80VarPeek.m192998g().mo20866g(uc80VarPeek);
                m202646n(uc80Var);
                m202645m("manager step permission", uc80Var);
                return;
            }
        } else if (l0mVarM192998g instanceof m0m) {
            m0m m0mVar = (m0m) l0mVarM192998g;
            if (m0mVar.getPriority() == 5 || (m0mVar.getPriority() > 2 && m0mVar.getPriority() > uc80VarPeek.m192999h())) {
                uc80VarPeek.m192998g().mo20866g(uc80VarPeek);
                m202646n(uc80Var);
                m202645m("manager step permission", uc80Var);
                return;
            }
        }
        if (uc80VarPeek.m192999h() == 1) {
            uc80VarPeek.m192998g().mo20866g(uc80VarPeek);
            m202645m("manager step dismiss low", uc80Var);
            m202646n(uc80Var);
        } else {
            try {
                m202645m("manager step add list", uc80Var);
                priorityQueue.add(uc80Var);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m202651s() {
        m202645m("manager step show next check", null);
        PriorityQueue<uc80> priorityQueue = this.f185657a.get(m202639g());
        uc80 uc80VarPoll = vwb.m200296J(priorityQueue) ? null : priorityQueue.poll();
        if (!NullChecker.m81303a(uc80VarPoll) || uc80VarPoll.m192999h() == 1) {
            return;
        }
        m202645m("manager step show next", null);
        m202646n(uc80VarPoll);
    }

    /* JADX INFO: renamed from: l.wc80$a */
    public class C20847a implements Application.ActivityLifecycleCallbacks {
        public C20847a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            wc80.this.m202647o(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            wc80.this.f185658b = new WeakReference(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
