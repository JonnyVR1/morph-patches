package p153l;

import android.os.Looper;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.common.utils.ThreadUtil;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class u11 {
    /* JADX INFO: renamed from: b */
    public static void m193888b(boolean z) {
        if (z) {
            m193893g(new IllegalStateException());
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m193889c() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            m193893g(new IllegalStateException("Should be called from main thread,current thread Name:" + Thread.currentThread().getName() + " thread id:" + Thread.currentThread().getId()));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m193890d(Object obj) {
        if (obj == null) {
            m193893g(new NullPointerException());
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m193891e(Object obj, String str) {
        if (obj == null) {
            m193893g(new IllegalStateException(str));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m193892f() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            m193893g(new IllegalStateException("Should not be called from main thread"));
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m193893g(final RuntimeException runtimeException) {
        Objects.toString(runtimeException);
        tu2.m192703a("Assert", "printAndThrow called:" + runtimeException);
        if (!kmk0.f127510c) {
            throw runtimeException;
        }
        ThreadUtil.m82496h(new Runnable() { // from class: l.s11
            @Override // java.lang.Runnable
            public final void run() {
                u11.m193887a(runtimeException);
            }
        }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        throw runtimeException;
    }

    /* JADX INFO: renamed from: h */
    public static void m193894h(boolean z) {
        if (z) {
            return;
        }
        m193893g(new IllegalStateException());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m193887a(RuntimeException runtimeException) {
        throw runtimeException;
    }
}
