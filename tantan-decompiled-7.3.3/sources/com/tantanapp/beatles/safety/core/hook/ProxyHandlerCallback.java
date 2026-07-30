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
import p153l.puc0;
import p153l.y40;

/* JADX INFO: loaded from: classes11.dex */
public class ProxyHandlerCallback implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final y40 f56820a;

    /* JADX INFO: renamed from: b */
    public final Handler f56821b;

    /* JADX INFO: renamed from: c */
    public final Handler.Callback f56822c;

    /* JADX INFO: renamed from: d */
    public final Thread.UncaughtExceptionHandler f56823d;

    /* JADX INFO: renamed from: e */
    public final int f56824e;

    /* JADX INFO: renamed from: f */
    public final Set<Integer> f56825f;

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
        this.f56825f = hashSet;
        this.f56821b = handler;
        this.f56822c = callback;
        this.f56820a = y40.m214194c();
        this.f56823d = uncaughtExceptionHandler;
        this.f56824e = ((Integer) puc0.m173843l(handler).m173853e("SCHEDULE_CRASH").m173855h()).intValue();
        Integer num = (Integer) puc0.m173843l(handler).m173853e("SERVICE_ARGS").m173855h();
        num.intValue();
        hashSet.add(num);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m82360a(Throwable th) {
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if ("android.app.ActivityThread".equals(stackTraceElement.getClassName()) && "handleTopResumedActivityChanged".equals(stackTraceElement.getMethodName())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m82361b(Message message) {
        y40 y40Var = this.f56820a;
        if (y40Var == null || message == null) {
            return;
        }
        try {
            y40Var.m214195a(message.what, message);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m82362c(Message message, Thread thread, Throwable th) {
        if (ThrowableUtils.m82369a(th, DeadObjectException.class) || ThrowableUtils.m82369a(th, DeadSystemException.class)) {
            this.f56823d.uncaughtException(thread, new IgnoreException("catch DeadObjectException in ActivityThreadHandlerCallback", th));
            return;
        }
        if (ThrowableUtils.m82369a(th, IllegalStateException.class) && Build.VERSION.SDK_INT >= 29 && m82360a(th)) {
            this.f56823d.uncaughtException(thread, new IgnoreException("catch IllegalStateException in ActivityThreadHandlerCallback", th));
        } else {
            m82361b(message);
            this.f56823d.uncaughtException(Thread.currentThread(), new ActivityLifecycleException("Activity生命周期异常", th));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m82363d(Message message) {
        try {
            this.f56821b.handleMessage(message);
        } catch (Throwable th) {
            m82362c(message, Thread.currentThread(), th);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        int i = message.what;
        if (i == this.f56824e) {
            return true;
        }
        if (this.f56825f.contains(Integer.valueOf(i))) {
            m82363d(message);
            return true;
        }
        Handler.Callback callback = this.f56822c;
        return callback != null && callback.handleMessage(message);
    }
}
