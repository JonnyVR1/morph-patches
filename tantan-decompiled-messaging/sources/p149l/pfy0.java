package p149l;

import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
public final class pfy0 {

    /* JADX INFO: renamed from: b */
    public static final pfy0 f148600b;

    /* JADX INFO: renamed from: a */
    @Nullable
    public final nfy0 f148601a;

    static {
        f148600b = ggw0.f102568a < 31 ? new pfy0() : new pfy0(nfy0.f138829b);
    }

    public pfy0() {
        f5v0.m119535f(ggw0.f102568a < 31);
        this.f148601a = null;
    }

    @RequiresApi(31)
    /* JADX INFO: renamed from: a */
    public final LogSessionId m168660a() {
        nfy0 nfy0Var = this.f148601a;
        nfy0Var.getClass();
        return nfy0Var.f138830a;
    }

    public pfy0(nfy0 nfy0Var) {
        this.f148601a = nfy0Var;
    }

    @RequiresApi(31)
    public pfy0(LogSessionId logSessionId) {
        this.f148601a = new nfy0(logSessionId);
    }
}
