package p007l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p003p1.mobile.android.app.Act;
import com.p003p1.mobile.android.app.App;
import com.p003p1.mobile.android.app.Frag;
import com.p003p1.mobile.android.p005ui.pushbubble.SimplePushBubble;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import l.du2;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class wc80 {

    /* JADX INFO: renamed from: b */
    public WeakReference<Activity> f5030b;

    /* JADX INFO: renamed from: a */
    public final Map<String, PriorityQueue<uc80>> f5029a = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Application.ActivityLifecycleCallbacks f5031c = new C0752a();

    /* JADX INFO: renamed from: l.wc80$b */
    public static final class C0753b {

        /* JADX INFO: renamed from: a */
        public static final wc80 f5033a = new wc80();
    }

    /* JADX INFO: renamed from: e */
    public static wc80 m11338e() {
        return C0753b.f5033a;
    }

    /* JADX INFO: renamed from: d */
    public final void m11339d(uc80 uc80Var) {
        uc80Var.m11205f();
        m11347m("manager step dismiss", uc80Var);
        uc80Var.m11214q(false);
        PriorityQueue<uc80> priorityQueue = this.f5029a.get(m11341g());
        if (!vwb.J(priorityQueue)) {
            priorityQueue.remove(uc80Var);
        }
        uc80 uc80VarPoll = vwb.J(priorityQueue) ? null : priorityQueue.poll();
        if (!NullChecker.a(uc80VarPoll) || uc80VarPoll.m11207h() == 1) {
            return;
        }
        m11347m("manager step dismiss next ", uc80VarPoll);
        m11348n(uc80VarPoll);
        priorityQueue.clear();
    }

    /* JADX INFO: renamed from: f */
    public uc80 m11340f() {
        if (this.f5029a.isEmpty()) {
            return null;
        }
        PriorityQueue<uc80> priorityQueue = this.f5029a.get(m11341g());
        if (!NullChecker.a(priorityQueue) || priorityQueue.size() <= 0 || !NullChecker.a(priorityQueue.peek()) || priorityQueue.peek().m11210m()) {
            return null;
        }
        return priorityQueue.peek();
    }

    /* JADX INFO: renamed from: g */
    public final String m11341g() {
        return m11342h(null);
    }

    /* JADX INFO: renamed from: h */
    public final String m11342h(Activity activity) {
        String strPageId;
        if (activity == null) {
            activity = NullChecker.a(this.f5030b) ? this.f5030b.get() : null;
        }
        if (activity == null) {
            return "p_default_view";
        }
        if (!(activity instanceof Act)) {
            strPageId = "";
            break;
        }
        List listT0 = ((Act) activity).getSupportFragmentManager().t0();
        int i = 0;
        while (true) {
            if (i >= listT0.size()) {
                strPageId = "";
                break;
            }
            Fragment fragment = (Fragment) listT0.get(i);
            if (NullChecker.a(fragment) && (fragment instanceof Frag) && fragment.isVisible()) {
                strPageId = ((Frag) fragment).pageId();
                break;
            }
            i++;
        }
        return TextUtils.isEmpty(strPageId) ? String.valueOf(activity.hashCode()) : strPageId;
    }

    /* JADX INFO: renamed from: i */
    public final List<String> m11343i(Activity activity) {
        ArrayList arrayList = new ArrayList();
        if (activity == null) {
            activity = NullChecker.a(this.f5030b) ? this.f5030b.get() : null;
        }
        if (activity == null) {
            arrayList.add("p_default_view");
            return arrayList;
        }
        if (activity instanceof Act) {
            List listT0 = ((Act) activity).getSupportFragmentManager().t0();
            for (int i = 0; i < listT0.size(); i++) {
                Fragment fragment = (Fragment) listT0.get(i);
                if (NullChecker.a(fragment) && (fragment instanceof Frag)) {
                    arrayList.add(((Frag) fragment).pageId());
                }
            }
        }
        if (vwb.J(arrayList)) {
            arrayList.add(String.valueOf(activity.hashCode()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public void m11344j() {
        App.f1068e.registerActivityLifecycleCallbacks(this.f5031c);
    }

    /* JADX INFO: renamed from: k */
    public boolean m11345k() {
        if (this.f5029a.isEmpty()) {
            return false;
        }
        PriorityQueue<uc80> priorityQueue = this.f5029a.get(m11341g());
        return !vwb.J(priorityQueue) && NullChecker.a(priorityQueue.peek()) && priorityQueue.peek().m11210m();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m11346l(uc80 uc80Var, j0m j0mVar) {
        m11339d(uc80Var);
    }

    /* JADX INFO: renamed from: m */
    public void m11347m(String str, @Nullable uc80 uc80Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" , act: ");
        sb.append(m11341g());
        sb.append(" , build: ");
        sb.append(uc80Var != null ? Integer.valueOf(uc80Var.hashCode()) : "null");
        du2.a("[PopUp]", sb.toString());
    }

    /* JADX INFO: renamed from: n */
    public final void m11348n(final uc80 uc80Var) {
        boolean zMo1138h;
        l0m l0mVarM11206g = uc80Var.m11206g();
        uc80Var.m11205f();
        if (NullChecker.a(l0mVarM11206g) && l0mVarM11206g.isValid()) {
            m11347m("manager step real show valid", uc80Var);
            uc80Var.m11206g().mo1139i(new f0m() { // from class: l.vc80
                @Override // p007l.f0m
                /* JADX INFO: renamed from: a */
                public final void mo1381a(j0m j0mVar) {
                    this.f4964a.m11346l(uc80Var, j0mVar);
                }
            });
            zMo1138h = uc80Var.m11206g().mo1138h(uc80Var);
        } else {
            zMo1138h = false;
        }
        m11347m("manager step real show back " + zMo1138h, uc80Var);
        if (!zMo1138h) {
            m11353s();
            return;
        }
        String strM11341g = m11341g();
        PriorityQueue<uc80> priorityQueue = new PriorityQueue<>();
        try {
            priorityQueue.add(uc80Var);
        } catch (Exception unused) {
        }
        this.f5029a.put(strM11341g, priorityQueue);
        uc80Var.m11214q(true);
    }

    /* JADX INFO: renamed from: o */
    public final void m11349o(Activity activity) {
        if (this.f5029a.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, PriorityQueue<uc80>>> it = this.f5029a.entrySet().iterator();
        List<String> listM11343i = m11343i(activity);
        while (it.hasNext() && !vwb.J(listM11343i)) {
            if (listM11343i.contains(it.next().getKey())) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m11350p() {
        this.f5029a.clear();
        App.f1068e.unregisterActivityLifecycleCallbacks(this.f5031c);
    }

    /* JADX INFO: renamed from: q */
    public void m11351q(uc80 uc80Var) {
        m11352r(uc80Var, false);
    }

    /* JADX INFO: renamed from: r */
    public final void m11352r(uc80 uc80Var, boolean z) {
        m11347m("manager start show: " + uc80Var.m11207h(), uc80Var);
        PriorityQueue<uc80> priorityQueue = this.f5029a.get(m11341g());
        m11341g();
        if (!vwb.J(priorityQueue)) {
            priorityQueue.size();
        }
        StringBuilder sb = new StringBuilder("manager start step1: ");
        sb.append(vwb.J(priorityQueue) ? 0 : priorityQueue.size());
        m11347m(sb.toString(), uc80Var);
        uc80 uc80VarPeek = !vwb.J(priorityQueue) ? priorityQueue.peek() : null;
        if (!NullChecker.a(uc80VarPeek) || !uc80VarPeek.m11210m() || z) {
            m11347m("manager step real show", uc80Var);
            m11348n(uc80Var);
            return;
        }
        if (uc80Var.m11207h() == 1) {
            m11347m("manager step remove low", uc80Var);
            return;
        }
        l0m l0mVarM11206g = uc80Var.m11206g();
        if (l0mVarM11206g instanceof SimplePushBubble) {
            SimplePushBubble simplePushBubble = (SimplePushBubble) l0mVarM11206g;
            if (simplePushBubble.getPriority() == 5 || (simplePushBubble.getPriority() == 3 && simplePushBubble.getPriority() > uc80VarPeek.m11207h())) {
                uc80VarPeek.m11206g().mo1137g(uc80VarPeek);
                m11348n(uc80Var);
                m11347m("manager step permission", uc80Var);
                return;
            }
        } else if (l0mVarM11206g instanceof m0m) {
            m0m m0mVar = (m0m) l0mVarM11206g;
            if (m0mVar.getPriority() == 5 || (m0mVar.getPriority() > 2 && m0mVar.getPriority() > uc80VarPeek.m11207h())) {
                uc80VarPeek.m11206g().mo1137g(uc80VarPeek);
                m11348n(uc80Var);
                m11347m("manager step permission", uc80Var);
                return;
            }
        }
        if (uc80VarPeek.m11207h() == 1) {
            uc80VarPeek.m11206g().mo1137g(uc80VarPeek);
            m11347m("manager step dismiss low", uc80Var);
            m11348n(uc80Var);
        } else {
            try {
                m11347m("manager step add list", uc80Var);
                priorityQueue.add(uc80Var);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m11353s() {
        m11347m("manager step show next check", null);
        PriorityQueue<uc80> priorityQueue = this.f5029a.get(m11341g());
        uc80 uc80VarPoll = vwb.J(priorityQueue) ? null : priorityQueue.poll();
        if (!NullChecker.a(uc80VarPoll) || uc80VarPoll.m11207h() == 1) {
            return;
        }
        m11347m("manager step show next", null);
        m11348n(uc80VarPoll);
    }

    /* JADX INFO: renamed from: l.wc80$a */
    public class C0752a implements Application.ActivityLifecycleCallbacks {
        public C0752a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            wc80.this.m11349o(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            wc80.this.f5030b = new WeakReference(activity);
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
