package p153l;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class iov0 {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f116222a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    @Nullable
    public hov0 f116223b;

    @Nullable
    /* JADX INFO: renamed from: a */
    public final hov0 m141353a() {
        return this.f116223b;
    }

    /* JADX INFO: renamed from: b */
    public final void m141354b(hov0 hov0Var) {
        this.f116223b = hov0Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m141355c(boolean z) {
        this.f116222a.set(true);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m141356d() {
        return this.f116222a.get();
    }
}
