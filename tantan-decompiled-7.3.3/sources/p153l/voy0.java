package p153l;

import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
public final class voy0 {

    /* JADX INFO: renamed from: b */
    public static final voy0 f185192b;

    /* JADX INFO: renamed from: a */
    @Nullable
    public final toy0 f185193a;

    static {
        f185192b = mpw0.f137957a < 31 ? new voy0() : new voy0(toy0.f175522b);
    }

    public voy0() {
        lev0.m153958f(mpw0.f137957a < 31);
        this.f185193a = null;
    }

    @RequiresApi(31)
    /* JADX INFO: renamed from: a */
    public final LogSessionId m202183a() {
        toy0 toy0Var = this.f185193a;
        toy0Var.getClass();
        return toy0Var.f175523a;
    }

    public voy0(toy0 toy0Var) {
        this.f185193a = toy0Var;
    }

    @RequiresApi(31)
    public voy0(LogSessionId logSessionId) {
        this.f185193a = new toy0(logSessionId);
    }
}
