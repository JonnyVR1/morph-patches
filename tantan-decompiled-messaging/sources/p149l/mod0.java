package p149l;

import android.app.Application;
import android.util.SparseArray;
import com.tantanapp.beatles.safety.core.AbsSafetyPolicy;
import com.tantanapp.beatles.safety.exception.IgnoreException;

/* JADX INFO: loaded from: classes13.dex */
public class mod0 implements q2m<AbsSafetyPolicy> {

    /* JADX INFO: renamed from: a */
    public int f134883a = 0;

    /* JADX INFO: renamed from: b */
    public final SparseArray<AbsSafetyPolicy> f134884b = new SparseArray<>();

    /* JADX INFO: renamed from: c */
    public Runnable f134885c;

    /* JADX INFO: renamed from: d */
    public boolean f134886d;

    /* JADX INFO: renamed from: e */
    public boolean f134887e;

    /* JADX INFO: renamed from: f */
    public boolean f134888f;

    public mod0(Application application) {
        xzb.m211951n(application);
    }

    @Override // p149l.q2m
    /* JADX INFO: renamed from: a */
    public void mo155668a() {
        Runnable runnable = this.f134885c;
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Exception e) {
                throw new IgnoreException("Toast 调用失败！", e);
            }
        }
    }

    @Override // p149l.q2m
    /* JADX INFO: renamed from: b */
    public boolean mo155669b() {
        return this.f134886d;
    }

    @Override // p149l.q2m
    /* JADX INFO: renamed from: c */
    public boolean mo155670c(Throwable th) {
        if (p460.m167365a().contains(":")) {
            return true;
        }
        boolean zExecute = false;
        if (f7r.m119819c() && rx0.m181466c(nt2.m160814e())) {
            j760<Integer, Integer> j760VarM108488b = csb.m108488b();
            Integer num = j760VarM108488b.f116565b;
            int iIntValue = num != null ? num.intValue() : 0;
            Integer num2 = j760VarM108488b.f116564a;
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            AbsSafetyPolicy absSafetyPolicy = this.f134884b.get(iIntValue);
            zExecute = absSafetyPolicy != null ? absSafetyPolicy.execute(nt2.m160814e(), th) : false;
            int i = iIntValue + 1;
            if (i <= this.f134883a) {
                csb.m108490d(iIntValue2, i);
            }
        }
        return zExecute;
    }

    @Override // p149l.q2m
    /* JADX INFO: renamed from: d */
    public boolean mo155671d() {
        return this.f134887e;
    }

    /* JADX INFO: renamed from: e */
    public mod0 m155672e(AbsSafetyPolicy absSafetyPolicy) {
        this.f134884b.put(absSafetyPolicy.getCrashCount(), absSafetyPolicy);
        this.f134883a = Math.max(this.f134883a, absSafetyPolicy.getCrashCount());
        return this;
    }

    /* JADX INFO: renamed from: f */
    public void m155673f(boolean z, boolean z2, boolean z3) {
        this.f134886d = z;
        this.f134887e = z2;
        this.f134888f = z3;
    }

    /* JADX INFO: renamed from: g */
    public void m155674g(Runnable runnable) {
        this.f134885c = runnable;
    }
}
