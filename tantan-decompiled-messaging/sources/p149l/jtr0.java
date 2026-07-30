package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class jtr0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ktr0 f119671a;

    public jtr0(ktr0 ktr0Var) {
        this.f119671a = ktr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        if (this.f119671a.f124615b != null) {
            return;
        }
        synchronized (ktr0.f124611c) {
            if (this.f119671a.f124615b != null) {
                return;
            }
            boolean z = false;
            try {
                zBooleanValue = ((Boolean) m7s0.f132367q2.m115379e()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    ktr0.f124612d = raw0.m178538b(this.f119671a.f124614a.f183102a, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z = zBooleanValue;
            this.f119671a.f124615b = Boolean.valueOf(z);
            ktr0.f124611c.open();
        }
    }
}
