package p153l;

import android.content.Context;
import android.os.StrictMode;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class qft0 {
    @Deprecated
    /* JADX INFO: renamed from: a */
    public static Object m176409a(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            dct0.m115296e("Unexpected exception.", th);
            w2t0.m204592c(context).mo204598b(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
