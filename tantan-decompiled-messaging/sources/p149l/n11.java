package p149l;

import android.os.Looper;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.common.utils.ThreadUtil;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public class n11 {
    /* JADX INFO: renamed from: b */
    public static void m157329b(boolean z) {
        if (z) {
            m157334g(new IllegalStateException());
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m157330c() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            m157334g(new IllegalStateException("Should be called from main thread,current thread Name:" + Thread.currentThread().getName() + " thread id:" + Thread.currentThread().getId()));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m157331d(Object obj) {
        if (obj == null) {
            m157334g(new NullPointerException());
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m157332e(Object obj, String str) {
        if (obj == null) {
            m157334g(new IllegalStateException(str));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m157333f() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            m157334g(new IllegalStateException("Should not be called from main thread"));
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m157334g(final RuntimeException runtimeException) {
        Objects.toString(runtimeException);
        du2.m113670a("Assert", "printAndThrow called:" + runtimeException);
        if (!edk0.f90613c) {
            throw runtimeException;
        }
        ThreadUtil.m81313h(new Runnable() { // from class: l.l11
            @Override // java.lang.Runnable
            public final void run() {
                n11.m157328a(runtimeException);
            }
        }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        throw runtimeException;
    }

    /* JADX INFO: renamed from: h */
    public static void m157335h(boolean z) {
        if (z) {
            return;
        }
        m157334g(new IllegalStateException());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m157328a(RuntimeException runtimeException) {
        throw runtimeException;
    }
}
