package com.hihonor.push.sdk;

import android.content.Context;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.hihonor.push.sdk.l */
/* JADX INFO: loaded from: classes7.dex */
public class C3664l {

    /* JADX INFO: renamed from: e */
    public static final C3664l f12631e = new C3664l();

    /* JADX INFO: renamed from: a */
    public WeakReference<Context> f12632a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f12633b = false;

    /* JADX INFO: renamed from: c */
    public volatile boolean f12634c = false;

    /* JADX INFO: renamed from: d */
    public C3678s f12635d;

    /* JADX INFO: renamed from: com.hihonor.push.sdk.l$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f12636a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HonorPushCallback f12637b;

        public a(Runnable runnable, HonorPushCallback honorPushCallback) {
            this.f12636a = runnable;
            this.f12637b = honorPushCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3664l.this.f12633b) {
                this.f12636a.run();
                return;
            }
            HonorPushCallback honorPushCallback = this.f12637b;
            if (honorPushCallback != null) {
                HonorPushErrorEnum honorPushErrorEnum = HonorPushErrorEnum.ERROR_NOT_INITIALIZED;
                honorPushCallback.onFailure(honorPushErrorEnum.getErrorCode(), honorPushErrorEnum.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m18599a(Context context) {
        return HonorPushErrorEnum.SUCCESS.statusCode == C3636b.m18575b(context);
    }

    /* JADX INFO: renamed from: a */
    public Context m18597a() {
        return this.f12632a.get();
    }

    /* JADX INFO: renamed from: a */
    public final void m18598a(Runnable runnable, HonorPushCallback<?> honorPushCallback) {
        C3638b1.m18577a(new a(runnable, honorPushCallback));
    }
}
