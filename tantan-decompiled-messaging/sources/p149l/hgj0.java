package p149l;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.tantanapp.beatles.safety.core.hook.ProxyHandlerCallback;
import com.tantanapp.beatles.safety.exception.IgnoreException;
import com.tantanapp.beatles.utils.ReflectException;

/* JADX INFO: loaded from: classes13.dex */
public final class hgj0 {

    /* JADX INFO: renamed from: a */
    public final Thread.UncaughtExceptionHandler f107603a;

    /* JADX INFO: renamed from: l.hgj0$a */
    public class RunnableC17305a implements Runnable {
        public RunnableC17305a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            hgj0.this.m130833c();
        }
    }

    public hgj0(@NonNull Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f107603a = uncaughtExceptionHandler;
    }

    /* JADX INFO: renamed from: d */
    public static void m130831d(@NonNull Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        try {
            new hgj0(uncaughtExceptionHandler).m130832b();
        } catch (Throwable th) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), new IgnoreException("Hook mH failed!", th));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m130832b() throws ReflectException {
        Handler handlerM135710c = iel.m135710c();
        if (handlerM135710c == null) {
            handlerM135710c = new Handler(Looper.getMainLooper());
        }
        handlerM135710c.post(new RunnableC17305a());
        kmc0.m146494l(handlerM135710c).m146509p("mCallback", new ProxyHandlerCallback(handlerM135710c, (Handler.Callback) kmc0.m146494l(handlerM135710c).m146504e("mCallback").m146506h(), this.f107603a));
    }

    /* JADX INFO: renamed from: c */
    public final void m130833c() {
        int i = 0;
        while (true) {
            try {
                Looper.loop();
            } catch (Throwable th) {
                this.f107603a.uncaughtException(Thread.currentThread(), th);
            }
            int i2 = i + 1;
            if (i >= Integer.MAX_VALUE) {
                rx0.m181467d();
                return;
            }
            i = i2;
        }
    }
}
