package p153l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class kxk {

    /* JADX INFO: renamed from: l.kxk$a */
    @RequiresApi(28)
    public static class C18293a {
        /* JADX INFO: renamed from: a */
        public static Handler m151838a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static Handler m151837a(@NonNull Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C18293a.m151838a(looper);
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
            iig0.m140070a(cause);
            return null;
        }
    }
}
