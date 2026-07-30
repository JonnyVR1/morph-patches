package com.hihonor.push.sdk;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class HonorPushClient {

    /* JADX INFO: renamed from: a */
    public static final HonorPushClient f11834a = new HonorPushClient();

    public static HonorPushClient getInstance() {
        return f11834a;
    }

    public boolean checkSupportHonorPush(Context context) {
        return C3505l.f11890e.m17522a(context);
    }

    public void deletePushToken(HonorPushCallback<Void> honorPushCallback) {
        C3505l c3505l = C3505l.f11890e;
        c3505l.m17521a(new RunnableC3493g(c3505l, honorPushCallback), honorPushCallback);
    }

    public void getNotificationCenterStatus(HonorPushCallback<Boolean> honorPushCallback) {
        C3505l c3505l = C3505l.f11890e;
        c3505l.m17521a(new RunnableC3496h(c3505l, honorPushCallback), honorPushCallback);
    }

    public void getPushToken(HonorPushCallback<String> honorPushCallback) {
        C3505l c3505l = C3505l.f11890e;
        c3505l.m17521a(new RunnableC3490f(c3505l, honorPushCallback, false), honorPushCallback);
    }

    public void getUnReadMessageBox(HonorPushCallback<List<HonorPushDataMsg>> honorPushCallback) {
        C3505l c3505l = C3505l.f11890e;
        c3505l.m17521a(new RunnableC3503k(c3505l, honorPushCallback), honorPushCallback);
    }

    public void init(Context context, boolean z) {
        C3505l c3505l = C3505l.f11890e;
        C3525v c3525v = new C3525v();
        c3525v.f11932a = context.getApplicationContext();
        c3525v.f11933b = z;
        C3479b1.m17500a(new RunnableC3487e(c3505l, c3525v));
    }

    public void turnOffNotificationCenter(HonorPushCallback<Void> honorPushCallback) {
        C3505l c3505l = C3505l.f11890e;
        c3505l.m17521a(new RunnableC3501j(c3505l, honorPushCallback), honorPushCallback);
    }

    public void turnOnNotificationCenter(HonorPushCallback<Void> honorPushCallback) {
        C3505l c3505l = C3505l.f11890e;
        c3505l.m17521a(new RunnableC3499i(c3505l, honorPushCallback), honorPushCallback);
    }
}
