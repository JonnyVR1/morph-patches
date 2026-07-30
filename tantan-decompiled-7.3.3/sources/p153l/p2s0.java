package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class p2s0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ q2s0 f150308a;

    public p2s0(q2s0 q2s0Var) {
        this.f150308a = q2s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        if (this.f150308a.f155389b != null) {
            return;
        }
        synchronized (q2s0.f155385c) {
            if (this.f150308a.f155389b != null) {
                return;
            }
            boolean z = false;
            try {
                zBooleanValue = ((Boolean) sgs0.f168438q2.m149974e()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    q2s0.f155386d = xjw0.m211270b(this.f150308a.f155388a.f74969a, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z = zBooleanValue;
            this.f150308a.f155389b = Boolean.valueOf(z);
            q2s0.f155385c.open();
        }
    }
}
