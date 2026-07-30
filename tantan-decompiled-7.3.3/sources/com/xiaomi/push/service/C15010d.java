package com.xiaomi.push.service;

import android.app.Notification;
import android.content.Context;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p153l.l4r0;

/* JADX INFO: renamed from: com.xiaomi.push.service.d */
/* JADX INFO: loaded from: classes2.dex */
public class C15010d {

    /* JADX INFO: renamed from: a */
    private static List<a> f63881a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: com.xiaomi.push.service.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f63882a;

        /* JADX INFO: renamed from: a */
        public final long f63883a;

        /* JADX INFO: renamed from: a */
        public final String f63884a;

        /* JADX INFO: renamed from: a */
        public final Notification.Action[] f63885a;

        public a(String str, long j, int i, Notification.Action[] actionArr) {
            this.f63884a = str;
            this.f63883a = j;
            this.f63882a = i;
            this.f63885a = actionArr;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m87805a() {
        for (int size = f63881a.size() - 1; size >= 0; size--) {
            a aVar = f63881a.get(size);
            if (SystemClock.elapsedRealtime() - aVar.f63883a > Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
                f63881a.remove(aVar);
            }
        }
        if (f63881a.size() > 10) {
            f63881a.remove(0);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m87807a(a aVar) {
        f63881a.add(aVar);
        m87805a();
    }

    /* JADX INFO: renamed from: a */
    public static void m87806a(Context context, StatusBarNotification statusBarNotification, int i) {
        if (!l4r0.m152825j(context) || i <= 0 || statusBarNotification == null) {
            return;
        }
        m87807a(new a(statusBarNotification.getKey(), SystemClock.elapsedRealtime(), i, C14984ag.m87644a(statusBarNotification.getNotification())));
    }
}
