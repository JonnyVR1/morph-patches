package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.PerformanceLogUtil;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.ProfileLogEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hn2<T> {

    /* JADX INFO: renamed from: l */
    public static final AtomicInteger f108525l = new AtomicInteger(1);

    /* JADX INFO: renamed from: m */
    public static int f108526m = -3;

    /* JADX INFO: renamed from: n */
    public static int f108527n = -2;

    /* JADX INFO: renamed from: o */
    public static int f108528o = -1;

    /* JADX INFO: renamed from: p */
    public static int f108529p = 1;

    /* JADX INFO: renamed from: q */
    public static int f108530q = 2;

    /* JADX INFO: renamed from: r */
    public static int f108531r = 3;

    /* JADX INFO: renamed from: a */
    public final mcr f108532a;

    /* JADX INFO: renamed from: b */
    public View f108533b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final T f108534c;

    /* JADX INFO: renamed from: d */
    public final int f108535d;

    /* JADX INFO: renamed from: e */
    public int f108536e;

    /* JADX INFO: renamed from: h */
    public dac0 f108539h;

    /* JADX INFO: renamed from: f */
    public boolean f108537f = false;

    /* JADX INFO: renamed from: g */
    public boolean f108538g = false;

    /* JADX INFO: renamed from: i */
    public List<d30> f108540i = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: j */
    public List<d30> f108541j = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: k */
    public boolean f108542k = true;

    public hn2(@NonNull T t, mcr mcrVar) {
        this.f108534c = t;
        this.f108532a = mcrVar;
        AtomicInteger atomicInteger = f108525l;
        if (atomicInteger.get() > 65536) {
            atomicInteger.set(1);
        }
        this.f108535d = atomicInteger.getAndIncrement();
    }

    /* JADX INFO: renamed from: a */
    public void mo131811a(d30 d30Var) {
        if (m131818i()) {
            d30Var.call();
        } else {
            this.f108540i.add(d30Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m131812b(d30 d30Var) {
        if (m131817h()) {
            d30Var.call();
        } else {
            this.f108541j.add(d30Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m131813c(dac0 dac0Var) {
        this.f108539h = dac0Var;
    }

    /* JADX INFO: renamed from: d */
    public int mo107404d() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m131814e() {
        Iterator<d30> it = this.f108540i.iterator();
        while (it.hasNext()) {
            it.next().call();
        }
        this.f108540i.clear();
    }

    /* JADX INFO: renamed from: f */
    public void m131815f() {
        Iterator<d30> it = this.f108541j.iterator();
        while (it.hasNext()) {
            it.next().call();
        }
        this.f108541j.clear();
    }

    /* JADX INFO: renamed from: g */
    public final View m131816g(ViewGroup viewGroup) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.ITEM_INFLATE;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName, getClass().getSimpleName());
        View viewMo52730s = mo52730s(viewGroup);
        this.f108533b = viewMo52730s;
        if (viewMo52730s == null) {
            qkq0.m175383a("rootView is Null !!!");
            return null;
        }
        mo52832r(viewMo52730s);
        mo52728j(this.f108533b);
        m131814e();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName, getClass().getSimpleName());
        return this.f108533b;
    }

    /* JADX INFO: renamed from: h */
    public boolean m131817h() {
        return this.f108538g;
    }

    /* JADX INFO: renamed from: i */
    public boolean m131818i() {
        return this.f108533b != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo52385k() {
        return true;
    }

    /* JADX INFO: renamed from: l */
    public abstract boolean mo52729l();

    /* JADX INFO: renamed from: m */
    public boolean mo52829m() {
        return false;
    }

    /* JADX INFO: renamed from: n */
    public boolean m131819n() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public int m131820o() {
        return this.f108535d;
    }

    /* JADX INFO: renamed from: p */
    public mcr m131821p() {
        return this.f108532a;
    }

    /* JADX INFO: renamed from: q */
    public void m131822q() {
        this.f108542k = true;
    }

    /* JADX INFO: renamed from: r */
    public void mo52832r(View view) {
        if (view.getBackground() != null) {
            return;
        }
        view.setBackgroundResource(w0c0.f183862k1);
    }

    /* JADX INFO: renamed from: s */
    public abstract View mo52730s(ViewGroup viewGroup);

    /* JADX INFO: renamed from: t */
    public abstract void mo52731t();

    /* JADX INFO: renamed from: u */
    public View m131823u() {
        return this.f108533b;
    }

    /* JADX INFO: renamed from: v */
    public void m131824v(int i) {
        this.f108536e = i;
    }

    /* JADX INFO: renamed from: w */
    public T m131825w() {
        return this.f108534c;
    }

    /* JADX INFO: renamed from: x */
    public final void m131826x(dac0 dac0Var, int i, View view) {
        if (mo52829m() && this.f108538g && !this.f108542k) {
            return;
        }
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.CUSTOM;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName, "render by ".concat(getClass().getSimpleName()));
        m131813c(dac0Var);
        mo52731t();
        this.f108538g = true;
        this.f108542k = false;
        m131815f();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName, "render by ".concat(getClass().getSimpleName()));
    }

    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
    }
}
