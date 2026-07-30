package p153l;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p051p1.mobile.android.p053ui.poplevel.C4522a;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class llb0 {

    /* JADX INFO: renamed from: a */
    public final Map<String, PriorityQueue<fqe0>> f132537a;

    /* JADX INFO: renamed from: b */
    public final Map<String, n7f0> f132538b;

    /* JADX INFO: renamed from: l.llb0$a */
    public static final class C18409a {

        /* JADX INFO: renamed from: a */
        public static final llb0 f132539a = new llb0();
    }

    public llb0() {
        this.f132537a = new ConcurrentHashMap();
        this.f132538b = new HashMap();
    }

    /* JADX INFO: renamed from: c */
    public static llb0 m154703c() {
        return C18409a.f132539a;
    }

    /* JADX INFO: renamed from: b */
    public void m154704b(int i) {
        if (this.f132538b.size() > 0) {
            Iterator<Map.Entry<String, n7f0>> it = this.f132538b.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().m161864a() == i) {
                    it.remove();
                }
            }
        }
        if (this.f132537a.size() > 0) {
            Iterator<Map.Entry<String, PriorityQueue<fqe0>>> it2 = this.f132537a.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<String, PriorityQueue<fqe0>> next = it2.next();
                if (jyb.m147479J(next.getValue())) {
                    it2.remove();
                } else {
                    Iterator<fqe0> it3 = next.getValue().iterator();
                    while (it3.hasNext()) {
                        if (it3.next().mo22137j() == i) {
                            it3.remove();
                        }
                    }
                    if (jyb.m147479J(next.getValue())) {
                        it2.remove();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m154706e(String str, fqe0 fqe0Var) {
        tu2.m192703a("[PushBubble]", str + ": " + fqe0Var.mo22140p() + " , " + fqe0Var.mo22139o() + " , " + fqe0Var.getClass().getSimpleName() + " , " + fqe0Var.hashCode());
    }

    /* JADX INFO: renamed from: f */
    public final int m154707f(@NonNull final fqe0 fqe0Var) {
        final x20 x20Var = fqe0Var.f121543b;
        fqe0Var.m146058q(new x20() { // from class: l.klb0
            @Override // p153l.x20
            public final void call() {
                this.f127360a.m154705d(fqe0Var, x20Var);
            }
        });
        int iMo22133A = fqe0Var.mo22133A();
        fqe0Var.m126744w(iMo22133A);
        m154706e("realShowBubble realshow " + iMo22133A, fqe0Var);
        if (iMo22133A == 0) {
            PriorityQueue<fqe0> priorityQueue = this.f132537a.get(fqe0Var.mo22139o());
            if (priorityQueue == null) {
                priorityQueue = new PriorityQueue<>();
                this.f132537a.put(fqe0Var.mo22139o(), priorityQueue);
            }
            priorityQueue.clear();
            priorityQueue.add(fqe0Var);
        }
        return iMo22133A;
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void m154705d(@NonNull fqe0 fqe0Var, x20 x20Var) {
        this.f132537a.size();
        this.f132538b.size();
        m154706e("resolveDismiss ", fqe0Var);
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        if (NullChecker.m82486a(fqe0Var.f100281f)) {
            fqe0Var.f100281f.mo22108a(fqe0Var);
        }
        PriorityQueue<fqe0> priorityQueue = this.f132537a.get(fqe0Var.mo22139o());
        if (!jyb.m147479J(priorityQueue)) {
            priorityQueue.remove(fqe0Var);
            if (jyb.m147479J(priorityQueue)) {
                this.f132537a.remove(fqe0Var.mo22139o());
            }
        }
        Iterator<n7f0> it = this.f132538b.values().iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().m161865b(), fqe0Var.mo22140p())) {
                it.remove();
            }
        }
        fqe0 fqe0VarPoll = !jyb.m147479J(priorityQueue) ? priorityQueue.poll() : null;
        if (fqe0VarPoll == null && !this.f132537a.isEmpty()) {
            PriorityQueue<fqe0> next = this.f132537a.values().iterator().next();
            if (!jyb.m147479J(next)) {
                fqe0VarPoll = next.poll();
            }
        }
        if (NullChecker.m82486a(fqe0VarPoll)) {
            m154706e("showSequenceBubble resolveDismiss", fqe0VarPoll);
            m154711j(fqe0VarPoll, true);
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m154709h(@NotNull fqe0 fqe0Var, boolean z) {
        if (C4522a.m22099p().m22107I()) {
            m154707f(fqe0Var);
            return true;
        }
        PriorityQueue<fqe0> priorityQueue = this.f132537a.get(fqe0Var.mo22139o());
        if (!jyb.m147479J(priorityQueue) && !z) {
            priorityQueue.add(fqe0Var);
            m154706e("showPushBubble step1 back ", fqe0Var);
            return false;
        }
        if (!this.f132538b.containsKey(fqe0Var.mo22139o())) {
            int iM154707f = m154707f(fqe0Var);
            this.f132538b.put(fqe0Var.mo22139o(), new n7f0(fqe0Var.mo22140p(), SystemClock.elapsedRealtime(), false, iM154707f, fqe0Var.mo22137j()));
            m154706e("showPushBubble step3 back " + iM154707f, fqe0Var);
            return true;
        }
        n7f0 n7f0Var = this.f132538b.get(fqe0Var.mo22139o());
        if (!n7f0Var.m161868e() && SystemClock.elapsedRealtime() - n7f0Var.m161866c() < n7f0Var.m161867d()) {
            if (priorityQueue == null) {
                priorityQueue = new PriorityQueue<>();
                this.f132537a.put(fqe0Var.mo22139o(), priorityQueue);
            }
            priorityQueue.add(fqe0Var);
            m154706e("showPushBubble step2 back ", fqe0Var);
            return false;
        }
        int iM154707f2 = m154707f(fqe0Var);
        if (iM154707f2 != 0) {
            n7f0Var.m161870g(fqe0Var.mo22140p());
            n7f0Var.m161869f(false);
            n7f0Var.m161871h(SystemClock.elapsedRealtime());
            n7f0Var.m161872i(iM154707f2);
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public void m154710i(@NonNull fqe0 fqe0Var) {
        m154706e("showSequenceBubble", fqe0Var);
        m154711j(fqe0Var, false);
    }

    /* JADX INFO: renamed from: j */
    public final void m154711j(@NonNull fqe0 fqe0Var, boolean z) {
        u11.m193889c();
        if (C4522a.m22099p().m22107I()) {
            int iMo22141u = fqe0Var.mo22141u();
            if (iMo22141u < 0) {
                iMo22141u = ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME;
            }
            C4522a.m22099p().m22102C(fqe0Var.m126742t(), fqe0Var.mo22138m(), fqe0Var, iMo22141u);
            return;
        }
        al80 al80VarM98650o = al80.m98641a(fqe0Var).m98650o(z);
        m154706e("showSequenceBubble in manager " + al80VarM98650o.hashCode() + " , " + z, fqe0Var);
        cl80.m110426e().m110439q(al80VarM98650o);
    }

    /* JADX INFO: renamed from: k */
    public void m154712k() {
        fqe0 fqe0VarPeek;
        if (this.f132537a.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, PriorityQueue<fqe0>>> it = this.f132537a.entrySet().iterator();
        while (it.hasNext()) {
            PriorityQueue<fqe0> value = it.next().getValue();
            if (!jyb.m147479J(value) && (fqe0VarPeek = value.peek()) != null && fqe0VarPeek.m126743v() == 0) {
                m154706e("showSequenceBubble tab change", fqe0VarPeek);
                m154711j(fqe0VarPeek, true);
            }
        }
    }
}
