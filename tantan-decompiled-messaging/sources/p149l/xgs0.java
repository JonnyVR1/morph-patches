package p149l;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class xgs0 {

    /* JADX INFO: renamed from: a */
    public boolean f192794a = false;

    /* JADX INFO: renamed from: b */
    public boolean f192795b = false;

    /* JADX INFO: renamed from: c */
    public float f192796c = 0.0f;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f192797d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public final synchronized float m208693a() {
        return this.f192796c;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m208694b(boolean z, float f) {
        this.f192795b = z;
        this.f192796c = f;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m208695c(boolean z) {
        this.f192794a = z;
        this.f192797d.set(true);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m208696d() {
        return this.f192795b;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m208697e(boolean z) {
        if (!this.f192797d.get()) {
            return z;
        }
        return this.f192794a;
    }
}
