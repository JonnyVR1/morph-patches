package p149l;

import android.content.Context;
import android.os.StrictMode;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class k6t0 {
    @Deprecated
    /* JADX INFO: renamed from: a */
    public static Object m144630a(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            x2t0.m206867e("Unexpected exception.", th);
            qts0.m176477c(context).mo176483b(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
