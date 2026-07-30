package com.hihonor.push.sdk;

import android.content.Context;
import com.hihonor.push.sdk.common.data.ApiException;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.hihonor.push.sdk.s */
/* JADX INFO: loaded from: classes7.dex */
public class C3519s {

    /* JADX INFO: renamed from: a */
    public final Context f11915a;

    /* JADX INFO: renamed from: b */
    public C3475a0 f11916b = new C3475a0();

    /* JADX INFO: renamed from: com.hihonor.push.sdk.s$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Callable f11917a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HonorPushCallback f11918b;

        public a(Callable callable, HonorPushCallback honorPushCallback) {
            this.f11917a = callable;
            this.f11918b = honorPushCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Object objCall = this.f11917a.call();
                C3519s c3519s = C3519s.this;
                HonorPushCallback honorPushCallback = this.f11918b;
                c3519s.getClass();
                C3479b1.m17500a(new RunnableC3521t(c3519s, honorPushCallback, objCall));
            } catch (ApiException e) {
                C3519s.m17525a(C3519s.this, this.f11918b, e.getErrorCode(), e.getMessage());
            } catch (Exception unused) {
                C3519s c3519s2 = C3519s.this;
                HonorPushCallback honorPushCallback2 = this.f11918b;
                HonorPushErrorEnum honorPushErrorEnum = HonorPushErrorEnum.ERROR_INTERNAL_ERROR;
                C3519s.m17525a(c3519s2, honorPushCallback2, honorPushErrorEnum.getErrorCode(), honorPushErrorEnum.getMessage());
            }
        }
    }

    public C3519s(Context context) {
        this.f11915a = context;
    }

    /* JADX INFO: renamed from: a */
    public final <T> void m17526a(Callable<T> callable, HonorPushCallback<T> honorPushCallback) {
        a aVar = new a(callable, honorPushCallback);
        C3479b1 c3479b1 = C3479b1.f11845d;
        if (c3479b1.f11847b == null) {
            synchronized (c3479b1.f11848c) {
                try {
                    if (c3479b1.f11847b == null) {
                        c3479b1.f11847b = c3479b1.m17502b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c3479b1.f11847b.execute(aVar);
    }

    /* JADX INFO: renamed from: a */
    public static void m17525a(C3519s c3519s, HonorPushCallback honorPushCallback, int i, String str) {
        c3519s.getClass();
        C3479b1.m17500a(new RunnableC3523u(c3519s, honorPushCallback, i, str));
    }
}
