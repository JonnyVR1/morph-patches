package p149l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class uuk {

    /* JADX INFO: renamed from: l.uuk$a */
    @RequiresApi(28)
    public static class C20517a {
        /* JADX INFO: renamed from: a */
        public static Handler m195376a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static Handler m195375a(@NonNull Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C20517a.m195376a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            aag0.m95543a(cause);
            return null;
        }
    }
}
