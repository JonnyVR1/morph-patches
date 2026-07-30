package p149l;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class bjj0 extends xuk {

    /* JADX INFO: renamed from: b */
    public static bjj0 f75919b;

    public bjj0() {
        super(new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: renamed from: v */
    public static bjj0 m102185v() {
        if (f75919b == null) {
            f75919b = new bjj0();
        }
        return f75919b;
    }

    @Override // p149l.xuk, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (m211094k()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
