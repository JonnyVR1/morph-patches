package com.hihonor.push.sdk;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class HonorPushClient {

    /* JADX INFO: renamed from: a */
    public static final HonorPushClient f12575a = new HonorPushClient();

    public static HonorPushClient getInstance() {
        return f12575a;
    }

    public boolean checkSupportHonorPush(Context context) {
        return C3664l.f12631e.m18599a(context);
    }

    public void deletePushToken(HonorPushCallback<Void> honorPushCallback) {
        C3664l c3664l = C3664l.f12631e;
        c3664l.m18598a(new RunnableC3652g(c3664l, honorPushCallback), honorPushCallback);
    }

    public void getNotificationCenterStatus(HonorPushCallback<Boolean> honorPushCallback) {
        C3664l c3664l = C3664l.f12631e;
        c3664l.m18598a(new RunnableC3655h(c3664l, honorPushCallback), honorPushCallback);
    }

    public void getPushToken(HonorPushCallback<String> honorPushCallback) {
        C3664l c3664l = C3664l.f12631e;
        c3664l.m18598a(new RunnableC3649f(c3664l, honorPushCallback, false), honorPushCallback);
    }

    public void getUnReadMessageBox(HonorPushCallback<List<HonorPushDataMsg>> honorPushCallback) {
        C3664l c3664l = C3664l.f12631e;
        c3664l.m18598a(new RunnableC3662k(c3664l, honorPushCallback), honorPushCallback);
    }

    public void init(Context context, boolean z) {
        C3664l c3664l = C3664l.f12631e;
        C3684v c3684v = new C3684v();
        c3684v.f12673a = context.getApplicationContext();
        c3684v.f12674b = z;
        C3638b1.m18577a(new RunnableC3646e(c3664l, c3684v));
    }

    public void turnOffNotificationCenter(HonorPushCallback<Void> honorPushCallback) {
        C3664l c3664l = C3664l.f12631e;
        c3664l.m18598a(new RunnableC3660j(c3664l, honorPushCallback), honorPushCallback);
    }

    public void turnOnNotificationCenter(HonorPushCallback<Void> honorPushCallback) {
        C3664l c3664l = C3664l.f12631e;
        c3664l.m18598a(new RunnableC3658i(c3664l, honorPushCallback), honorPushCallback);
    }
}
