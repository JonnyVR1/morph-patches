package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class ahy0 extends dyv0 {
    public ahy0() {
        super(null);
    }

    @Override // p153l.dyv0
    /* JADX INFO: renamed from: a */
    public final void mo97941a(sky0 sky0Var, sky0 sky0Var2) {
        sky0Var.f169341b = sky0Var2;
    }

    @Override // p153l.dyv0
    /* JADX INFO: renamed from: b */
    public final void mo97942b(sky0 sky0Var, Thread thread) {
        sky0Var.f169340a = thread;
    }

    @Override // p153l.dyv0
    /* JADX INFO: renamed from: c */
    public final boolean mo97943c(uqy0 uqy0Var, hyx0 hyx0Var, hyx0 hyx0Var2) {
        synchronized (uqy0Var) {
            try {
                if (uqy0Var.f180546b != hyx0Var) {
                    return false;
                }
                uqy0Var.f180546b = hyx0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.dyv0
    /* JADX INFO: renamed from: d */
    public final boolean mo97944d(uqy0 uqy0Var, Object obj, Object obj2) {
        synchronized (uqy0Var) {
            try {
                if (uqy0Var.f180545a != obj) {
                    return false;
                }
                uqy0Var.f180545a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.dyv0
    /* JADX INFO: renamed from: e */
    public final boolean mo97945e(uqy0 uqy0Var, sky0 sky0Var, sky0 sky0Var2) {
        synchronized (uqy0Var) {
            try {
                if (uqy0Var.f180547c != sky0Var) {
                    return false;
                }
                uqy0Var.f180547c = sky0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
