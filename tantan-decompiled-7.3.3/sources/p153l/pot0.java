package p153l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class pot0 {

    /* JADX INFO: renamed from: a */
    public static final Handler f153428a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public static final Executor f153429b = new hnt0("Google consent worker");

    /* JADX INFO: renamed from: a */
    public static void m173113a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        wtq0.m207906a("Method must be call on main thread.");
    }
}
