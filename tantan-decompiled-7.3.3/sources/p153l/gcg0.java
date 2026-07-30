package p153l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gcg0<T> implements bb50<T>, kcg0 {

    /* JADX INFO: renamed from: a */
    public final ocg0 f103566a;

    /* JADX INFO: renamed from: b */
    public final gcg0<?> f103567b;

    /* JADX INFO: renamed from: c */
    public vk90 f103568c;

    /* JADX INFO: renamed from: d */
    public long f103569d;

    public gcg0(gcg0<?> gcg0Var, boolean z) {
        this.f103569d = Long.MIN_VALUE;
        this.f103567b = gcg0Var;
        this.f103566a = (!z || gcg0Var == null) ? new ocg0() : gcg0Var.f103566a;
    }

    /* JADX INFO: renamed from: b */
    public final void m129866b(kcg0 kcg0Var) {
        this.f103566a.m167213a(kcg0Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m129867c(long j) {
        long j2 = this.f103569d;
        if (j2 == Long.MIN_VALUE) {
            this.f103569d = j;
            return;
        }
        long j3 = j2 + j;
        if (j3 < 0) {
            this.f103569d = Long.MAX_VALUE;
        } else {
            this.f103569d = j3;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m129868e(long j) {
        if (j < 0) {
            fcg0.m125008a("number requested cannot be negative: ", j);
            return;
        }
        synchronized (this) {
            vk90 vk90Var = this.f103568c;
            if (vk90Var != null) {
                vk90Var.request(j);
            } else {
                m129867c(j);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo95773f(vk90 vk90Var) {
        long j;
        gcg0<?> gcg0Var;
        boolean z;
        synchronized (this) {
            j = this.f103569d;
            this.f103568c = vk90Var;
            gcg0Var = this.f103567b;
            z = gcg0Var != null && j == Long.MIN_VALUE;
        }
        if (z) {
            gcg0Var.mo95773f(vk90Var);
        } else if (j == Long.MIN_VALUE) {
            vk90Var.request(Long.MAX_VALUE);
        } else {
            vk90Var.request(j);
        }
    }

    @Override // p153l.kcg0
    public final boolean isUnsubscribed() {
        return this.f103566a.isUnsubscribed();
    }

    @Override // p153l.kcg0
    public final void unsubscribe() {
        this.f103566a.unsubscribe();
    }

    /* JADX INFO: renamed from: d */
    public void mo95884d() {
    }

    public gcg0(gcg0<?> gcg0Var) {
        this(gcg0Var, true);
    }

    public gcg0() {
        this(null, false);
    }
}
