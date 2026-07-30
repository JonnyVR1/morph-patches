package p149l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class jft0 {

    /* JADX INFO: renamed from: a */
    public static final Handler f117689a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public static final Executor f117690b = new bet0("Google consent worker");

    /* JADX INFO: renamed from: a */
    public static void m141214a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        qkq0.m175383a("Method must be call on main thread.");
    }
}
