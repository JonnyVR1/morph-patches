package p007l;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p003p1.mobile.android.p005ui.poplevel.C0283a;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;
import l.d30;
import l.du2;
import l.n11;
import l.vwb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class hdb0 {

    /* JADX INFO: renamed from: a */
    public final Map<String, PriorityQueue<aie0>> f2813a;

    /* JADX INFO: renamed from: b */
    public final Map<String, gze0> f2814b;

    /* JADX INFO: renamed from: l.hdb0$a */
    public static final class C0557a {

        /* JADX INFO: renamed from: a */
        public static final hdb0 f2815a = new hdb0();
    }

    public hdb0() {
        this.f2813a = new ConcurrentHashMap();
        this.f2814b = new HashMap();
    }

    /* JADX INFO: renamed from: c */
    public static hdb0 m9293c() {
        return C0557a.f2815a;
    }

    /* JADX INFO: renamed from: b */
    public void m9294b(int i) {
        if (this.f2814b.size() > 0) {
            Iterator<Map.Entry<String, gze0>> it = this.f2814b.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().m9279a() == i) {
                    it.remove();
                }
            }
        }
        if (this.f2813a.size() > 0) {
            Iterator<Map.Entry<String, PriorityQueue<aie0>>> it2 = this.f2813a.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<String, PriorityQueue<aie0>> next = it2.next();
                if (vwb.J(next.getValue())) {
                    it2.remove();
                } else {
                    Iterator<aie0> it3 = next.getValue().iterator();
                    while (it3.hasNext()) {
                        if (it3.next().mo1410j() == i) {
                            it3.remove();
                        }
                    }
                    if (vwb.J(next.getValue())) {
                        it2.remove();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m9296e(String str, aie0 aie0Var) {
        du2.a("[PushBubble]", str + ": " + aie0Var.mo1413p() + " , " + aie0Var.mo1412o() + " , " + aie0Var.getClass().getSimpleName() + " , " + aie0Var.hashCode());
    }

    /* JADX INFO: renamed from: f */
    public final int m9297f(@NonNull final aie0 aie0Var) {
        final d30 d30Var = aie0Var.f2673b;
        aie0Var.m9088q(new d30() { // from class: l.gdb0
            public final void call() {
                this.f2758a.m9295d(aie0Var, d30Var);
            }
        });
        int iMo1406A = aie0Var.mo1406A();
        aie0Var.m8552w(iMo1406A);
        m9296e("realShowBubble realshow " + iMo1406A, aie0Var);
        if (iMo1406A == 0) {
            PriorityQueue<aie0> priorityQueue = this.f2813a.get(aie0Var.mo1412o());
            if (priorityQueue == null) {
                priorityQueue = new PriorityQueue<>();
                this.f2813a.put(aie0Var.mo1412o(), priorityQueue);
            }
            priorityQueue.clear();
            priorityQueue.add(aie0Var);
        }
        return iMo1406A;
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void m9295d(@NonNull aie0 aie0Var, d30 d30Var) {
        this.f2813a.size();
        this.f2814b.size();
        m9296e("resolveDismiss ", aie0Var);
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        if (NullChecker.a(aie0Var.f1856f)) {
            aie0Var.f1856f.mo1381a(aie0Var);
        }
        PriorityQueue<aie0> priorityQueue = this.f2813a.get(aie0Var.mo1412o());
        if (!vwb.J(priorityQueue)) {
            priorityQueue.remove(aie0Var);
            if (vwb.J(priorityQueue)) {
                this.f2813a.remove(aie0Var.mo1412o());
            }
        }
        Iterator<gze0> it = this.f2814b.values().iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().m9280b(), aie0Var.mo1413p())) {
                it.remove();
            }
        }
        aie0 aie0VarPoll = !vwb.J(priorityQueue) ? priorityQueue.poll() : null;
        if (aie0VarPoll == null && !this.f2813a.isEmpty()) {
            PriorityQueue<aie0> next = this.f2813a.values().iterator().next();
            if (!vwb.J(next)) {
                aie0VarPoll = next.poll();
            }
        }
        if (NullChecker.a(aie0VarPoll)) {
            m9296e("showSequenceBubble resolveDismiss", aie0VarPoll);
            m9301j(aie0VarPoll, true);
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m9299h(@NotNull aie0 aie0Var, boolean z) {
        if (C0283a.m1372p().m1380I()) {
            m9297f(aie0Var);
            return true;
        }
        PriorityQueue<aie0> priorityQueue = this.f2813a.get(aie0Var.mo1412o());
        if (!vwb.J(priorityQueue) && !z) {
            priorityQueue.add(aie0Var);
            m9296e("showPushBubble step1 back ", aie0Var);
            return false;
        }
        if (!this.f2814b.containsKey(aie0Var.mo1412o())) {
            int iM9297f = m9297f(aie0Var);
            this.f2814b.put(aie0Var.mo1412o(), new gze0(aie0Var.mo1413p(), SystemClock.elapsedRealtime(), false, iM9297f, aie0Var.mo1410j()));
            m9296e("showPushBubble step3 back " + iM9297f, aie0Var);
            return true;
        }
        gze0 gze0Var = this.f2814b.get(aie0Var.mo1412o());
        if (!gze0Var.m9283e() && SystemClock.elapsedRealtime() - gze0Var.m9281c() < gze0Var.m9282d()) {
            if (priorityQueue == null) {
                priorityQueue = new PriorityQueue<>();
                this.f2813a.put(aie0Var.mo1412o(), priorityQueue);
            }
            priorityQueue.add(aie0Var);
            m9296e("showPushBubble step2 back ", aie0Var);
            return false;
        }
        int iM9297f2 = m9297f(aie0Var);
        if (iM9297f2 != 0) {
            gze0Var.m9285g(aie0Var.mo1413p());
            gze0Var.m9284f(false);
            gze0Var.m9286h(SystemClock.elapsedRealtime());
            gze0Var.m9287i(iM9297f2);
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public void m9300i(@NonNull aie0 aie0Var) {
        m9296e("showSequenceBubble", aie0Var);
        m9301j(aie0Var, false);
    }

    /* JADX INFO: renamed from: j */
    public final void m9301j(@NonNull aie0 aie0Var, boolean z) {
        n11.c();
        if (C0283a.m1372p().m1380I()) {
            int iMo1414u = aie0Var.mo1414u();
            if (iMo1414u < 0) {
                iMo1414u = 20000;
            }
            C0283a.m1372p().m1375C(aie0Var.m8550t(), aie0Var.mo1411m(), aie0Var, iMo1414u);
            return;
        }
        uc80 uc80VarM11212o = uc80.m11203a(aie0Var).m11212o(z);
        m9296e("showSequenceBubble in manager " + uc80VarM11212o.hashCode() + " , " + z, aie0Var);
        wc80.m11338e().m11351q(uc80VarM11212o);
    }

    /* JADX INFO: renamed from: k */
    public void m9302k() {
        aie0 aie0VarPeek;
        if (this.f2813a.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, PriorityQueue<aie0>>> it = this.f2813a.entrySet().iterator();
        while (it.hasNext()) {
            PriorityQueue<aie0> value = it.next().getValue();
            if (!vwb.J(value) && (aie0VarPeek = value.peek()) != null && aie0VarPeek.m8551v() == 0) {
                m9296e("showSequenceBubble tab change", aie0VarPeek);
                m9301j(aie0VarPeek, true);
            }
        }
    }
}
