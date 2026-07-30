package p002l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.PerformanceLogUtil;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.ProfileLogEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import l.d30;
import l.dac0;
import l.mcr;
import l.qkq0;
import l.w0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class hn2<T> {

    /* JADX INFO: renamed from: l */
    public static final AtomicInteger f12116l = new AtomicInteger(1);

    /* JADX INFO: renamed from: m */
    public static int f12117m = -3;

    /* JADX INFO: renamed from: n */
    public static int f12118n = -2;

    /* JADX INFO: renamed from: o */
    public static int f12119o = -1;

    /* JADX INFO: renamed from: p */
    public static int f12120p = 1;

    /* JADX INFO: renamed from: q */
    public static int f12121q = 2;

    /* JADX INFO: renamed from: r */
    public static int f12122r = 3;

    /* JADX INFO: renamed from: a */
    public final mcr f12123a;

    /* JADX INFO: renamed from: b */
    public View f12124b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final T f12125c;

    /* JADX INFO: renamed from: d */
    public final int f12126d;

    /* JADX INFO: renamed from: e */
    public int f12127e;

    /* JADX INFO: renamed from: h */
    public dac0 f12130h;

    /* JADX INFO: renamed from: f */
    public boolean f12128f = false;

    /* JADX INFO: renamed from: g */
    public boolean f12129g = false;

    /* JADX INFO: renamed from: i */
    public List<d30> f12131i = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: j */
    public List<d30> f12132j = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: k */
    public boolean f12133k = true;

    public hn2(@NonNull T t, mcr mcrVar) {
        this.f12125c = t;
        this.f12123a = mcrVar;
        AtomicInteger atomicInteger = f12116l;
        if (atomicInteger.get() > 65536) {
            atomicInteger.set(1);
        }
        this.f12126d = atomicInteger.getAndIncrement();
    }

    /* JADX INFO: renamed from: a */
    public void mo14451a(d30 d30Var) {
        if (m14458i()) {
            d30Var.call();
        } else {
            this.f12131i.add(d30Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m14452b(d30 d30Var) {
        if (m14457h()) {
            d30Var.call();
        } else {
            this.f12132j.add(d30Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m14453c(dac0 dac0Var) {
        this.f12130h = dac0Var;
    }

    /* JADX INFO: renamed from: d */
    public int mo11100d() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m14454e() {
        Iterator<d30> it = this.f12131i.iterator();
        while (it.hasNext()) {
            it.next().call();
        }
        this.f12131i.clear();
    }

    /* JADX INFO: renamed from: f */
    public void m14455f() {
        Iterator<d30> it = this.f12132j.iterator();
        while (it.hasNext()) {
            it.next().call();
        }
        this.f12132j.clear();
    }

    /* JADX INFO: renamed from: g */
    public final View m14456g(ViewGroup viewGroup) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.ITEM_INFLATE;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName, getClass().getSimpleName());
        View viewMo3281s = mo3281s(viewGroup);
        this.f12124b = viewMo3281s;
        if (viewMo3281s == null) {
            qkq0.a("rootView is Null !!!");
            return null;
        }
        mo3383r(viewMo3281s);
        mo3279j(this.f12124b);
        m14454e();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName, getClass().getSimpleName());
        return this.f12124b;
    }

    /* JADX INFO: renamed from: h */
    public boolean m14457h() {
        return this.f12129g;
    }

    /* JADX INFO: renamed from: i */
    public boolean m14458i() {
        return this.f12124b != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo2919k() {
        return true;
    }

    /* JADX INFO: renamed from: l */
    public abstract boolean mo3280l();

    /* JADX INFO: renamed from: m */
    public boolean mo3380m() {
        return false;
    }

    /* JADX INFO: renamed from: n */
    public boolean m14459n() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public int m14460o() {
        return this.f12126d;
    }

    /* JADX INFO: renamed from: p */
    public mcr m14461p() {
        return this.f12123a;
    }

    /* JADX INFO: renamed from: q */
    public void m14462q() {
        this.f12133k = true;
    }

    /* JADX INFO: renamed from: r */
    public void mo3383r(View view) {
        if (view.getBackground() != null) {
            return;
        }
        view.setBackgroundResource(w0c0.k1);
    }

    /* JADX INFO: renamed from: s */
    public abstract View mo3281s(ViewGroup viewGroup);

    /* JADX INFO: renamed from: t */
    public abstract void mo3282t();

    /* JADX INFO: renamed from: u */
    public View m14463u() {
        return this.f12124b;
    }

    /* JADX INFO: renamed from: v */
    public void m14464v(int i) {
        this.f12127e = i;
    }

    /* JADX INFO: renamed from: w */
    public T m14465w() {
        return this.f12125c;
    }

    /* JADX INFO: renamed from: x */
    public final void m14466x(dac0 dac0Var, int i, View view) {
        if (mo3380m() && this.f12129g && !this.f12133k) {
            return;
        }
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.CUSTOM;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName, "render by ".concat(getClass().getSimpleName()));
        m14453c(dac0Var);
        mo3282t();
        this.f12129g = true;
        this.f12133k = false;
        m14455f();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName, "render by ".concat(getClass().getSimpleName()));
    }

    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
    }
}
