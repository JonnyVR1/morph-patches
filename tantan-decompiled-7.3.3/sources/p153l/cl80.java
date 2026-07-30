package p153l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.android.p053ui.pushbubble.SimplePushBubble;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes8.dex */
public class cl80 {

    /* JADX INFO: renamed from: b */
    public WeakReference<Activity> f82351b;

    /* JADX INFO: renamed from: a */
    public final Map<String, PriorityQueue<al80>> f82350a = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Application.ActivityLifecycleCallbacks f82352c = new C16296a();

    /* JADX INFO: renamed from: l.cl80$b */
    public static final class C16297b {

        /* JADX INFO: renamed from: a */
        public static final cl80 f82354a = new cl80();
    }

    /* JADX INFO: renamed from: e */
    public static cl80 m110426e() {
        return C16297b.f82354a;
    }

    /* JADX INFO: renamed from: d */
    public final void m110427d(al80 al80Var) {
        al80Var.m98643f();
        m110435m("manager step dismiss", al80Var);
        al80Var.m98652q(false);
        PriorityQueue<al80> priorityQueue = this.f82350a.get(m110429g());
        if (!jyb.m147479J(priorityQueue)) {
            priorityQueue.remove(al80Var);
        }
        al80 al80VarPoll = jyb.m147479J(priorityQueue) ? null : priorityQueue.poll();
        if (!NullChecker.m82486a(al80VarPoll) || al80VarPoll.m98645h() == 1) {
            return;
        }
        m110435m("manager step dismiss next ", al80VarPoll);
        m110436n(al80VarPoll);
        priorityQueue.clear();
    }

    /* JADX INFO: renamed from: f */
    public al80 m110428f() {
        if (this.f82350a.isEmpty()) {
            return null;
        }
        PriorityQueue<al80> priorityQueue = this.f82350a.get(m110429g());
        if (!NullChecker.m82486a(priorityQueue) || priorityQueue.size() <= 0 || !NullChecker.m82486a(priorityQueue.peek()) || priorityQueue.peek().m98648m()) {
            return null;
        }
        return priorityQueue.peek();
    }

    /* JADX INFO: renamed from: g */
    public final String m110429g() {
        return m110430h(null);
    }

    /* JADX INFO: renamed from: h */
    public final String m110430h(Activity activity) {
        String strPageId;
        if (activity == null) {
            activity = NullChecker.m82486a(this.f82351b) ? this.f82351b.get() : null;
        }
        if (activity == null) {
            return "p_default_view";
        }
        if (!(activity instanceof Act)) {
            strPageId = "";
            break;
        }
        List<Fragment> listM2590t0 = ((Act) activity).getSupportFragmentManager().m2590t0();
        int i = 0;
        while (true) {
            if (i >= listM2590t0.size()) {
                strPageId = "";
                break;
            }
            Fragment fragment = listM2590t0.get(i);
            if (NullChecker.m82486a(fragment) && (fragment instanceof Frag) && fragment.isVisible()) {
                strPageId = ((Frag) fragment).pageId();
                break;
            }
            i++;
        }
        return TextUtils.isEmpty(strPageId) ? String.valueOf(activity.hashCode()) : strPageId;
    }

    /* JADX INFO: renamed from: i */
    public final List<String> m110431i(Activity activity) {
        ArrayList arrayList = new ArrayList();
        if (activity == null) {
            activity = NullChecker.m82486a(this.f82351b) ? this.f82351b.get() : null;
        }
        if (activity == null) {
            arrayList.add("p_default_view");
            return arrayList;
        }
        if (activity instanceof Act) {
            List<Fragment> listM2590t0 = ((Act) activity).getSupportFragmentManager().m2590t0();
            for (int i = 0; i < listM2590t0.size(); i++) {
                Fragment fragment = listM2590t0.get(i);
                if (NullChecker.m82486a(fragment) && (fragment instanceof Frag)) {
                    arrayList.add(((Frag) fragment).pageId());
                }
            }
        }
        if (jyb.m147479J(arrayList)) {
            arrayList.add(String.valueOf(activity.hashCode()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public void m110432j() {
        App.f16088e.registerActivityLifecycleCallbacks(this.f82352c);
    }

    /* JADX INFO: renamed from: k */
    public boolean m110433k() {
        if (this.f82350a.isEmpty()) {
            return false;
        }
        PriorityQueue<al80> priorityQueue = this.f82350a.get(m110429g());
        return !jyb.m147479J(priorityQueue) && NullChecker.m82486a(priorityQueue.peek()) && priorityQueue.peek().m98648m();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m110434l(al80 al80Var, d3m d3mVar) {
        m110427d(al80Var);
    }

    /* JADX INFO: renamed from: m */
    public void m110435m(String str, @Nullable al80 al80Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" , act: ");
        sb.append(m110429g());
        sb.append(" , build: ");
        sb.append(al80Var != null ? Integer.valueOf(al80Var.hashCode()) : "null");
        tu2.m192703a("[PopUp]", sb.toString());
    }

    /* JADX INFO: renamed from: n */
    public final void m110436n(final al80 al80Var) {
        boolean zMo21866h;
        f3m f3mVarM98644g = al80Var.m98644g();
        al80Var.m98643f();
        if (NullChecker.m82486a(f3mVarM98644g) && f3mVarM98644g.isValid()) {
            m110435m("manager step real show valid", al80Var);
            al80Var.m98644g().mo21867i(new z2m() { // from class: l.bl80
                @Override // p153l.z2m
                /* JADX INFO: renamed from: a */
                public final void mo22108a(d3m d3mVar) {
                    this.f77151a.m110434l(al80Var, d3mVar);
                }
            });
            zMo21866h = al80Var.m98644g().mo21866h(al80Var);
        } else {
            zMo21866h = false;
        }
        m110435m("manager step real show back " + zMo21866h, al80Var);
        if (!zMo21866h) {
            m110441s();
            return;
        }
        String strM110429g = m110429g();
        PriorityQueue<al80> priorityQueue = new PriorityQueue<>();
        try {
            priorityQueue.add(al80Var);
        } catch (Exception unused) {
        }
        this.f82350a.put(strM110429g, priorityQueue);
        al80Var.m98652q(true);
    }

    /* JADX INFO: renamed from: o */
    public final void m110437o(Activity activity) {
        if (this.f82350a.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, PriorityQueue<al80>>> it = this.f82350a.entrySet().iterator();
        List<String> listM110431i = m110431i(activity);
        while (it.hasNext() && !jyb.m147479J(listM110431i)) {
            if (listM110431i.contains(it.next().getKey())) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m110438p() {
        this.f82350a.clear();
        App.f16088e.unregisterActivityLifecycleCallbacks(this.f82352c);
    }

    /* JADX INFO: renamed from: q */
    public void m110439q(al80 al80Var) {
        m110440r(al80Var, false);
    }

    /* JADX INFO: renamed from: r */
    public final void m110440r(al80 al80Var, boolean z) {
        m110435m("manager start show: " + al80Var.m98645h(), al80Var);
        PriorityQueue<al80> priorityQueue = this.f82350a.get(m110429g());
        m110429g();
        if (!jyb.m147479J(priorityQueue)) {
            priorityQueue.size();
        }
        StringBuilder sb = new StringBuilder("manager start step1: ");
        sb.append(jyb.m147479J(priorityQueue) ? 0 : priorityQueue.size());
        m110435m(sb.toString(), al80Var);
        al80 al80VarPeek = !jyb.m147479J(priorityQueue) ? priorityQueue.peek() : null;
        if (!NullChecker.m82486a(al80VarPeek) || !al80VarPeek.m98648m() || z) {
            m110435m("manager step real show", al80Var);
            m110436n(al80Var);
            return;
        }
        if (al80Var.m98645h() == 1) {
            m110435m("manager step remove low", al80Var);
            return;
        }
        f3m f3mVarM98644g = al80Var.m98644g();
        if (f3mVarM98644g instanceof SimplePushBubble) {
            SimplePushBubble simplePushBubble = (SimplePushBubble) f3mVarM98644g;
            if (simplePushBubble.getPriority() == 5 || (simplePushBubble.getPriority() == 3 && simplePushBubble.getPriority() > al80VarPeek.m98645h())) {
                al80VarPeek.m98644g().mo21865g(al80VarPeek);
                m110436n(al80Var);
                m110435m("manager step permission", al80Var);
                return;
            }
        } else if (f3mVarM98644g instanceof g3m) {
            g3m g3mVar = (g3m) f3mVarM98644g;
            if (g3mVar.getPriority() == 5 || (g3mVar.getPriority() > 2 && g3mVar.getPriority() > al80VarPeek.m98645h())) {
                al80VarPeek.m98644g().mo21865g(al80VarPeek);
                m110436n(al80Var);
                m110435m("manager step permission", al80Var);
                return;
            }
        }
        if (al80VarPeek.m98645h() == 1) {
            al80VarPeek.m98644g().mo21865g(al80VarPeek);
            m110435m("manager step dismiss low", al80Var);
            m110436n(al80Var);
        } else {
            try {
                m110435m("manager step add list", al80Var);
                priorityQueue.add(al80Var);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m110441s() {
        m110435m("manager step show next check", null);
        PriorityQueue<al80> priorityQueue = this.f82350a.get(m110429g());
        al80 al80VarPoll = jyb.m147479J(priorityQueue) ? null : priorityQueue.poll();
        if (!NullChecker.m82486a(al80VarPoll) || al80VarPoll.m98645h() == 1) {
            return;
        }
        m110435m("manager step show next", null);
        m110436n(al80VarPoll);
    }

    /* JADX INFO: renamed from: l.cl80$a */
    public class C16296a implements Application.ActivityLifecycleCallbacks {
        public C16296a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            cl80.this.m110437o(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            cl80.this.f82351b = new WeakReference(activity);
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
