package p153l;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.tantanapp.beatles.safety.core.hook.ProxyHandlerCallback;
import com.tantanapp.beatles.safety.exception.IgnoreException;
import com.tantanapp.beatles.utils.ReflectException;

/* JADX INFO: loaded from: classes11.dex */
public final class jpj0 {

    /* JADX INFO: renamed from: a */
    public final Thread.UncaughtExceptionHandler f122113a;

    /* JADX INFO: renamed from: l.jpj0$a */
    public class RunnableC18001a implements Runnable {
        public RunnableC18001a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            jpj0.this.m146507c();
        }
    }

    public jpj0(@NonNull Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f122113a = uncaughtExceptionHandler;
    }

    /* JADX INFO: renamed from: d */
    public static void m146505d(@NonNull Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        try {
            new jpj0(uncaughtExceptionHandler).m146506b();
        } catch (Throwable th) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), new IgnoreException("Hook mH failed!", th));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m146506b() throws ReflectException {
        Handler handlerM215848c = ygl.m215848c();
        if (handlerM215848c == null) {
            handlerM215848c = new Handler(Looper.getMainLooper());
        }
        handlerM215848c.post(new RunnableC18001a());
        puc0.m173843l(handlerM215848c).m173858p("mCallback", new ProxyHandlerCallback(handlerM215848c, (Handler.Callback) puc0.m173843l(handlerM215848c).m173853e("mCallback").m173855h(), this.f122113a));
    }

    /* JADX INFO: renamed from: c */
    public final void m146507c() {
        int i = 0;
        while (true) {
            try {
                Looper.loop();
            } catch (Throwable th) {
                this.f122113a.uncaughtException(Thread.currentThread(), th);
            }
            int i2 = i + 1;
            if (i >= Integer.MAX_VALUE) {
                yx0.m217669d();
                return;
            }
            i = i2;
        }
    }
}
