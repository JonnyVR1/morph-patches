package com.hihonor.push.sdk;

import android.content.Context;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.hihonor.push.sdk.l */
/* JADX INFO: loaded from: classes7.dex */
public class C3505l {

    /* JADX INFO: renamed from: e */
    public static final C3505l f11890e = new C3505l();

    /* JADX INFO: renamed from: a */
    public WeakReference<Context> f11891a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f11892b = false;

    /* JADX INFO: renamed from: c */
    public volatile boolean f11893c = false;

    /* JADX INFO: renamed from: d */
    public C3519s f11894d;

    /* JADX INFO: renamed from: com.hihonor.push.sdk.l$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f11895a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HonorPushCallback f11896b;

        public a(Runnable runnable, HonorPushCallback honorPushCallback) {
            this.f11895a = runnable;
            this.f11896b = honorPushCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3505l.this.f11892b) {
                this.f11895a.run();
                return;
            }
            HonorPushCallback honorPushCallback = this.f11896b;
            if (honorPushCallback != null) {
                HonorPushErrorEnum honorPushErrorEnum = HonorPushErrorEnum.ERROR_NOT_INITIALIZED;
                honorPushCallback.onFailure(honorPushErrorEnum.getErrorCode(), honorPushErrorEnum.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m17522a(Context context) {
        return HonorPushErrorEnum.SUCCESS.statusCode == C3477b.m17498b(context);
    }

    /* JADX INFO: renamed from: a */
    public Context m17520a() {
        return this.f11891a.get();
    }

    /* JADX INFO: renamed from: a */
    public final void m17521a(Runnable runnable, HonorPushCallback<?> honorPushCallback) {
        C3479b1.m17500a(new a(runnable, honorPushCallback));
    }
}
