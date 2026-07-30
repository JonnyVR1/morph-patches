package p149l;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p046p1.mobile.android.p048ui.poplevel.C4371a;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class hdb0 {

    /* JADX INFO: renamed from: a */
    public final Map<String, PriorityQueue<aie0>> f107228a;

    /* JADX INFO: renamed from: b */
    public final Map<String, gze0> f107229b;

    /* JADX INFO: renamed from: l.hdb0$a */
    public static final class C17286a {

        /* JADX INFO: renamed from: a */
        public static final hdb0 f107230a = new hdb0();
    }

    public hdb0() {
        this.f107228a = new ConcurrentHashMap();
        this.f107229b = new HashMap();
    }

    /* JADX INFO: renamed from: c */
    public static hdb0 m130575c() {
        return C17286a.f107230a;
    }

    /* JADX INFO: renamed from: b */
    public void m130576b(int i) {
        if (this.f107229b.size() > 0) {
            Iterator<Map.Entry<String, gze0>> it = this.f107229b.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().m128846a() == i) {
                    it.remove();
                }
            }
        }
        if (this.f107228a.size() > 0) {
            Iterator<Map.Entry<String, PriorityQueue<aie0>>> it2 = this.f107228a.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<String, PriorityQueue<aie0>> next = it2.next();
                if (vwb.m200296J(next.getValue())) {
                    it2.remove();
                } else {
                    Iterator<aie0> it3 = next.getValue().iterator();
                    while (it3.hasNext()) {
                        if (it3.next().mo21138j() == i) {
                            it3.remove();
                        }
                    }
                    if (vwb.m200296J(next.getValue())) {
                        it2.remove();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m130578e(String str, aie0 aie0Var) {
        du2.m113670a("[PushBubble]", str + ": " + aie0Var.mo21141p() + " , " + aie0Var.mo21140o() + " , " + aie0Var.getClass().getSimpleName() + " , " + aie0Var.hashCode());
    }

    /* JADX INFO: renamed from: f */
    public final int m130579f(@NonNull final aie0 aie0Var) {
        final d30 d30Var = aie0Var.f97025b;
        aie0Var.m120963q(new d30() { // from class: l.gdb0
            @Override // p149l.d30
            public final void call() {
                this.f102098a.m130577d(aie0Var, d30Var);
            }
        });
        int iMo21134A = aie0Var.mo21134A();
        aie0Var.m96807w(iMo21134A);
        m130578e("realShowBubble realshow " + iMo21134A, aie0Var);
        if (iMo21134A == 0) {
            PriorityQueue<aie0> priorityQueue = this.f107228a.get(aie0Var.mo21140o());
            if (priorityQueue == null) {
                priorityQueue = new PriorityQueue<>();
                this.f107228a.put(aie0Var.mo21140o(), priorityQueue);
            }
            priorityQueue.clear();
            priorityQueue.add(aie0Var);
        }
        return iMo21134A;
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void m130577d(@NonNull aie0 aie0Var, d30 d30Var) {
        this.f107228a.size();
        this.f107229b.size();
        m130578e("resolveDismiss ", aie0Var);
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        if (NullChecker.m81303a(aie0Var.f69977f)) {
            aie0Var.f69977f.mo21109a(aie0Var);
        }
        PriorityQueue<aie0> priorityQueue = this.f107228a.get(aie0Var.mo21140o());
        if (!vwb.m200296J(priorityQueue)) {
            priorityQueue.remove(aie0Var);
            if (vwb.m200296J(priorityQueue)) {
                this.f107228a.remove(aie0Var.mo21140o());
            }
        }
        Iterator<gze0> it = this.f107229b.values().iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().m128847b(), aie0Var.mo21141p())) {
                it.remove();
            }
        }
        aie0 aie0VarPoll = !vwb.m200296J(priorityQueue) ? priorityQueue.poll() : null;
        if (aie0VarPoll == null && !this.f107228a.isEmpty()) {
            PriorityQueue<aie0> next = this.f107228a.values().iterator().next();
            if (!vwb.m200296J(next)) {
                aie0VarPoll = next.poll();
            }
        }
        if (NullChecker.m81303a(aie0VarPoll)) {
            m130578e("showSequenceBubble resolveDismiss", aie0VarPoll);
            m130583j(aie0VarPoll, true);
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m130581h(@NotNull aie0 aie0Var, boolean z) {
        if (C4371a.m21100p().m21108I()) {
            m130579f(aie0Var);
            return true;
        }
        PriorityQueue<aie0> priorityQueue = this.f107228a.get(aie0Var.mo21140o());
        if (!vwb.m200296J(priorityQueue) && !z) {
            priorityQueue.add(aie0Var);
            m130578e("showPushBubble step1 back ", aie0Var);
            return false;
        }
        if (!this.f107229b.containsKey(aie0Var.mo21140o())) {
            int iM130579f = m130579f(aie0Var);
            this.f107229b.put(aie0Var.mo21140o(), new gze0(aie0Var.mo21141p(), SystemClock.elapsedRealtime(), false, iM130579f, aie0Var.mo21138j()));
            m130578e("showPushBubble step3 back " + iM130579f, aie0Var);
            return true;
        }
        gze0 gze0Var = this.f107229b.get(aie0Var.mo21140o());
        if (!gze0Var.m128850e() && SystemClock.elapsedRealtime() - gze0Var.m128848c() < gze0Var.m128849d()) {
            if (priorityQueue == null) {
                priorityQueue = new PriorityQueue<>();
                this.f107228a.put(aie0Var.mo21140o(), priorityQueue);
            }
            priorityQueue.add(aie0Var);
            m130578e("showPushBubble step2 back ", aie0Var);
            return false;
        }
        int iM130579f2 = m130579f(aie0Var);
        if (iM130579f2 != 0) {
            gze0Var.m128852g(aie0Var.mo21141p());
            gze0Var.m128851f(false);
            gze0Var.m128853h(SystemClock.elapsedRealtime());
            gze0Var.m128854i(iM130579f2);
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public void m130582i(@NonNull aie0 aie0Var) {
        m130578e("showSequenceBubble", aie0Var);
        m130583j(aie0Var, false);
    }

    /* JADX INFO: renamed from: j */
    public final void m130583j(@NonNull aie0 aie0Var, boolean z) {
        n11.m157330c();
        if (C4371a.m21100p().m21108I()) {
            int iMo21142u = aie0Var.mo21142u();
            if (iMo21142u < 0) {
                iMo21142u = ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME;
            }
            C4371a.m21100p().m21103C(aie0Var.m96805t(), aie0Var.mo21139m(), aie0Var, iMo21142u);
            return;
        }
        uc80 uc80VarM193004o = uc80.m192995a(aie0Var).m193004o(z);
        m130578e("showSequenceBubble in manager " + uc80VarM193004o.hashCode() + " , " + z, aie0Var);
        wc80.m202636e().m202649q(uc80VarM193004o);
    }

    /* JADX INFO: renamed from: k */
    public void m130584k() {
        aie0 aie0VarPeek;
        if (this.f107228a.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, PriorityQueue<aie0>>> it = this.f107228a.entrySet().iterator();
        while (it.hasNext()) {
            PriorityQueue<aie0> value = it.next().getValue();
            if (!vwb.m200296J(value) && (aie0VarPeek = value.peek()) != null && aie0VarPeek.m96806v() == 0) {
                m130578e("showSequenceBubble tab change", aie0VarPeek);
                m130583j(aie0VarPeek, true);
            }
        }
    }
}
