package p153l;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class esj0 extends nxk {

    /* JADX INFO: renamed from: b */
    public static esj0 f95634b;

    public esj0() {
        super(new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: renamed from: v */
    public static esj0 m122371v() {
        if (f95634b == null) {
            f95634b = new esj0();
        }
        return f95634b;
    }

    @Override // p153l.nxk, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (m165159k()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
