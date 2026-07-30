package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.performance.PerformanceLogUtil;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.performance.ProfileLogEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class on2<T> {

    /* JADX INFO: renamed from: l */
    public static final AtomicInteger f148047l = new AtomicInteger(1);

    /* JADX INFO: renamed from: m */
    public static int f148048m = -3;

    /* JADX INFO: renamed from: n */
    public static int f148049n = -2;

    /* JADX INFO: renamed from: o */
    public static int f148050o = -1;

    /* JADX INFO: renamed from: p */
    public static int f148051p = 1;

    /* JADX INFO: renamed from: q */
    public static int f148052q = 2;

    /* JADX INFO: renamed from: r */
    public static int f148053r = 3;

    /* JADX INFO: renamed from: a */
    public final ner f148054a;

    /* JADX INFO: renamed from: b */
    public View f148055b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final T f148056c;

    /* JADX INFO: renamed from: d */
    public final int f148057d;

    /* JADX INFO: renamed from: e */
    public int f148058e;

    /* JADX INFO: renamed from: h */
    public jic0 f148061h;

    /* JADX INFO: renamed from: f */
    public boolean f148059f = false;

    /* JADX INFO: renamed from: g */
    public boolean f148060g = false;

    /* JADX INFO: renamed from: i */
    public List<x20> f148062i = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: j */
    public List<x20> f148063j = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: k */
    public boolean f148064k = true;

    public on2(@NonNull T t, ner nerVar) {
        this.f148056c = t;
        this.f148054a = nerVar;
        AtomicInteger atomicInteger = f148047l;
        if (atomicInteger.get() > 65536) {
            atomicInteger.set(1);
        }
        this.f148057d = atomicInteger.getAndIncrement();
    }

    /* JADX INFO: renamed from: a */
    public void mo168208a(x20 x20Var) {
        if (m168318i()) {
            x20Var.call();
        } else {
            this.f148062i.add(x20Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m168312b(x20 x20Var) {
        if (m168317h()) {
            x20Var.call();
        } else {
            this.f148063j.add(x20Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m168313c(jic0 jic0Var) {
        this.f148061h = jic0Var;
    }

    /* JADX INFO: renamed from: d */
    public int mo130650d() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m168314e() {
        Iterator<x20> it = this.f148062i.iterator();
        while (it.hasNext()) {
            it.next().call();
        }
        this.f148062i.clear();
    }

    /* JADX INFO: renamed from: f */
    public void m168315f() {
        Iterator<x20> it = this.f148063j.iterator();
        while (it.hasNext()) {
            it.next().call();
        }
        this.f148063j.clear();
    }

    /* JADX INFO: renamed from: g */
    public final View m168316g(ViewGroup viewGroup) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.ITEM_INFLATE;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName, getClass().getSimpleName());
        View viewMo53913s = mo53913s(viewGroup);
        this.f148055b = viewMo53913s;
        if (viewMo53913s == null) {
            wtq0.m207906a("rootView is Null !!!");
            return null;
        }
        mo54015r(viewMo53913s);
        mo53911j(this.f148055b);
        m168314e();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName, getClass().getSimpleName());
        return this.f148055b;
    }

    /* JADX INFO: renamed from: h */
    public boolean m168317h() {
        return this.f148060g;
    }

    /* JADX INFO: renamed from: i */
    public boolean m168318i() {
        return this.f148055b != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo53568k() {
        return true;
    }

    /* JADX INFO: renamed from: l */
    public abstract boolean mo53912l();

    /* JADX INFO: renamed from: m */
    public boolean mo54012m() {
        return false;
    }

    /* JADX INFO: renamed from: n */
    public boolean m168319n() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public int m168320o() {
        return this.f148057d;
    }

    /* JADX INFO: renamed from: p */
    public ner m168321p() {
        return this.f148054a;
    }

    /* JADX INFO: renamed from: q */
    public void m168322q() {
        this.f148064k = true;
    }

    /* JADX INFO: renamed from: r */
    public void mo54015r(View view) {
        if (view.getBackground() != null) {
            return;
        }
        view.setBackgroundResource(c9c0.f80435l1);
    }

    /* JADX INFO: renamed from: s */
    public abstract View mo53913s(ViewGroup viewGroup);

    /* JADX INFO: renamed from: t */
    public abstract void mo53914t();

    /* JADX INFO: renamed from: u */
    public View m168323u() {
        return this.f148055b;
    }

    /* JADX INFO: renamed from: v */
    public void m168324v(int i) {
        this.f148058e = i;
    }

    /* JADX INFO: renamed from: w */
    public T m168325w() {
        return this.f148056c;
    }

    /* JADX INFO: renamed from: x */
    public final void m168326x(jic0 jic0Var, int i, View view) {
        if (mo54012m() && this.f148060g && !this.f148064k) {
            return;
        }
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.CUSTOM;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName, "render by ".concat(getClass().getSimpleName()));
        m168313c(jic0Var);
        mo53914t();
        this.f148060g = true;
        this.f148064k = false;
        m168315f();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName, "render by ".concat(getClass().getSimpleName()));
    }

    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
    }
}
