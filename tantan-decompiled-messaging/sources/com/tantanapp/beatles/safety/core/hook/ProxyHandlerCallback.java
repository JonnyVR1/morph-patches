package com.tantanapp.beatles.safety.core.hook;

import android.os.Build;
import android.os.DeadObjectException;
import android.os.DeadSystemException;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import com.tantanapp.beatles.safety.exception.ActivityLifecycleException;
import com.tantanapp.beatles.safety.exception.IgnoreException;
import com.tantanapp.beatles.safety.utils.ThrowableUtils;
import java.util.HashSet;
import java.util.Set;
import p149l.d50;
import p149l.kmc0;

/* JADX INFO: loaded from: classes13.dex */
public class ProxyHandlerCallback implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final d50 f55972a;

    /* JADX INFO: renamed from: b */
    public final Handler f55973b;

    /* JADX INFO: renamed from: c */
    public final Handler.Callback f55974c;

    /* JADX INFO: renamed from: d */
    public final Thread.UncaughtExceptionHandler f55975d;

    /* JADX INFO: renamed from: e */
    public final int f55976e;

    /* JADX INFO: renamed from: f */
    public final Set<Integer> f55977f;

    public ProxyHandlerCallback(Handler handler, Handler.Callback callback, @NonNull Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        HashSet<Integer> hashSet = new HashSet<Integer>() { // from class: com.tantanapp.beatles.safety.core.hook.ProxyHandlerCallback.1
            {
                if (Build.VERSION.SDK_INT >= 29) {
                    add(159);
                    return;
                }
                add(100);
                add(107);
                add(101);
                add(104);
                add(109);
            }
        };
        this.f55977f = hashSet;
        this.f55973b = handler;
        this.f55974c = callback;
        this.f55972a = d50.m110000c();
        this.f55975d = uncaughtExceptionHandler;
        this.f55976e = ((Integer) kmc0.m146494l(handler).m146504e("SCHEDULE_CRASH").m146506h()).intValue();
        Integer num = (Integer) kmc0.m146494l(handler).m146504e("SERVICE_ARGS").m146506h();
        num.intValue();
        hashSet.add(num);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m81177a(Throwable th) {
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if ("android.app.ActivityThread".equals(stackTraceElement.getClassName()) && "handleTopResumedActivityChanged".equals(stackTraceElement.getMethodName())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m81178b(Message message) {
        d50 d50Var = this.f55972a;
        if (d50Var == null || message == null) {
            return;
        }
        try {
            d50Var.m110001a(message.what, message);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m81179c(Message message, Thread thread, Throwable th) {
        if (ThrowableUtils.m81186a(th, DeadObjectException.class) || ThrowableUtils.m81186a(th, DeadSystemException.class)) {
            this.f55975d.uncaughtException(thread, new IgnoreException("catch DeadObjectException in ActivityThreadHandlerCallback", th));
            return;
        }
        if (ThrowableUtils.m81186a(th, IllegalStateException.class) && Build.VERSION.SDK_INT >= 29 && m81177a(th)) {
            this.f55975d.uncaughtException(thread, new IgnoreException("catch IllegalStateException in ActivityThreadHandlerCallback", th));
        } else {
            m81178b(message);
            this.f55975d.uncaughtException(Thread.currentThread(), new ActivityLifecycleException("Activity生命周期异常", th));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m81180d(Message message) {
        try {
            this.f55973b.handleMessage(message);
        } catch (Throwable th) {
            m81179c(message, Thread.currentThread(), th);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        int i = message.what;
        if (i == this.f55976e) {
            return true;
        }
        if (this.f55977f.contains(Integer.valueOf(i))) {
            m81180d(message);
            return true;
        }
        Handler.Callback callback = this.f55974c;
        return callback != null && callback.handleMessage(message);
    }
}
