package p149l;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class cfv0 {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f80676a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    @Nullable
    public bfv0 f80677b;

    @Nullable
    /* JADX INFO: renamed from: a */
    public final bfv0 m106604a() {
        return this.f80677b;
    }

    /* JADX INFO: renamed from: b */
    public final void m106605b(bfv0 bfv0Var) {
        this.f80677b = bfv0Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m106606c(boolean z) {
        this.f80676a.set(true);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m106607d() {
        return this.f80676a.get();
    }
}
