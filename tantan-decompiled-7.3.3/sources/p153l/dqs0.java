package p153l;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class dqs0 {

    /* JADX INFO: renamed from: a */
    public boolean f90290a = false;

    /* JADX INFO: renamed from: b */
    public boolean f90291b = false;

    /* JADX INFO: renamed from: c */
    public float f90292c = 0.0f;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f90293d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public final synchronized float m117568a() {
        return this.f90292c;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m117569b(boolean z, float f) {
        this.f90291b = z;
        this.f90292c = f;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m117570c(boolean z) {
        this.f90290a = z;
        this.f90293d.set(true);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m117571d() {
        return this.f90291b;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m117572e(boolean z) {
        if (!this.f90293d.get()) {
            return z;
        }
        return this.f90290a;
    }
}
