package p153l;

import android.app.Application;
import android.util.SparseArray;
import com.tantanapp.beatles.safety.core.AbsSafetyPolicy;
import com.tantanapp.beatles.safety.exception.IgnoreException;

/* JADX INFO: loaded from: classes11.dex */
public class owd0 implements j5m<AbsSafetyPolicy> {

    /* JADX INFO: renamed from: a */
    public int f149470a = 0;

    /* JADX INFO: renamed from: b */
    public final SparseArray<AbsSafetyPolicy> f149471b = new SparseArray<>();

    /* JADX INFO: renamed from: c */
    public Runnable f149472c;

    /* JADX INFO: renamed from: d */
    public boolean f149473d;

    /* JADX INFO: renamed from: e */
    public boolean f149474e;

    /* JADX INFO: renamed from: f */
    public boolean f149475f;

    public owd0(Application application) {
        k1c.m147855n(application);
    }

    @Override // p153l.j5m
    /* JADX INFO: renamed from: a */
    public void mo143543a() {
        Runnable runnable = this.f149472c;
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Exception e) {
                throw new IgnoreException("Toast 调用失败！", e);
            }
        }
    }

    @Override // p153l.j5m
    /* JADX INFO: renamed from: b */
    public boolean mo143544b() {
        return this.f149473d;
    }

    @Override // p153l.j5m
    /* JADX INFO: renamed from: c */
    public boolean mo143545c(Throwable th) {
        if (vc60.m200786a().contains(":")) {
            return true;
        }
        boolean zExecute = false;
        if (g9r.m129600c() && yx0.m217668c(du2.m118045e())) {
            pf60<Integer, Integer> pf60VarM177908b = qtb.m177908b();
            Integer num = pf60VarM177908b.f152157b;
            int iIntValue = num != null ? num.intValue() : 0;
            Integer num2 = pf60VarM177908b.f152156a;
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            AbsSafetyPolicy absSafetyPolicy = this.f149471b.get(iIntValue);
            zExecute = absSafetyPolicy != null ? absSafetyPolicy.execute(du2.m118045e(), th) : false;
            int i = iIntValue + 1;
            if (i <= this.f149470a) {
                qtb.m177910d(iIntValue2, i);
            }
        }
        return zExecute;
    }

    @Override // p153l.j5m
    /* JADX INFO: renamed from: d */
    public boolean mo143546d() {
        return this.f149474e;
    }

    /* JADX INFO: renamed from: e */
    public owd0 m169549e(AbsSafetyPolicy absSafetyPolicy) {
        this.f149471b.put(absSafetyPolicy.getCrashCount(), absSafetyPolicy);
        this.f149470a = Math.max(this.f149470a, absSafetyPolicy.getCrashCount());
        return this;
    }

    /* JADX INFO: renamed from: f */
    public void m169550f(boolean z, boolean z2, boolean z3) {
        this.f149473d = z;
        this.f149474e = z2;
        this.f149475f = z3;
    }

    /* JADX INFO: renamed from: g */
    public void m169551g(Runnable runnable) {
        this.f149472c = runnable;
    }
}
