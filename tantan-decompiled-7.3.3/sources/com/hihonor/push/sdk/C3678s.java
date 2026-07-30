package com.hihonor.push.sdk;

import android.content.Context;
import com.hihonor.push.sdk.common.data.ApiException;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.hihonor.push.sdk.s */
/* JADX INFO: loaded from: classes7.dex */
public class C3678s {

    /* JADX INFO: renamed from: a */
    public final Context f12656a;

    /* JADX INFO: renamed from: b */
    public C3634a0 f12657b = new C3634a0();

    /* JADX INFO: renamed from: com.hihonor.push.sdk.s$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Callable f12658a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HonorPushCallback f12659b;

        public a(Callable callable, HonorPushCallback honorPushCallback) {
            this.f12658a = callable;
            this.f12659b = honorPushCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Object objCall = this.f12658a.call();
                C3678s c3678s = C3678s.this;
                HonorPushCallback honorPushCallback = this.f12659b;
                c3678s.getClass();
                C3638b1.m18577a(new RunnableC3680t(c3678s, honorPushCallback, objCall));
            } catch (ApiException e) {
                C3678s.m18602a(C3678s.this, this.f12659b, e.getErrorCode(), e.getMessage());
            } catch (Exception unused) {
                C3678s c3678s2 = C3678s.this;
                HonorPushCallback honorPushCallback2 = this.f12659b;
                HonorPushErrorEnum honorPushErrorEnum = HonorPushErrorEnum.ERROR_INTERNAL_ERROR;
                C3678s.m18602a(c3678s2, honorPushCallback2, honorPushErrorEnum.getErrorCode(), honorPushErrorEnum.getMessage());
            }
        }
    }

    public C3678s(Context context) {
        this.f12656a = context;
    }

    /* JADX INFO: renamed from: a */
    public final <T> void m18603a(Callable<T> callable, HonorPushCallback<T> honorPushCallback) {
        a aVar = new a(callable, honorPushCallback);
        C3638b1 c3638b1 = C3638b1.f12586d;
        if (c3638b1.f12588b == null) {
            synchronized (c3638b1.f12589c) {
                try {
                    if (c3638b1.f12588b == null) {
                        c3638b1.f12588b = c3638b1.m18579b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c3638b1.f12588b.execute(aVar);
    }

    /* JADX INFO: renamed from: a */
    public static void m18602a(C3678s c3678s, HonorPushCallback honorPushCallback, int i, String str) {
        c3678s.getClass();
        C3638b1.m18577a(new RunnableC3682u(c3678s, honorPushCallback, i, str));
    }
}
