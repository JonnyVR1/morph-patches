package com.xiaomi.push.service;

import android.app.Notification;
import android.content.Context;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p149l.fvq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14862d {

    /* JADX INFO: renamed from: a */
    private static List<a> f63034a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: com.xiaomi.push.service.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f63035a;

        /* JADX INFO: renamed from: a */
        public final long f63036a;

        /* JADX INFO: renamed from: a */
        public final String f63037a;

        /* JADX INFO: renamed from: a */
        public final Notification.Action[] f63038a;

        public a(String str, long j, int i, Notification.Action[] actionArr) {
            this.f63037a = str;
            this.f63036a = j;
            this.f63035a = i;
            this.f63038a = actionArr;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m86634a() {
        for (int size = f63034a.size() - 1; size >= 0; size--) {
            a aVar = f63034a.get(size);
            if (SystemClock.elapsedRealtime() - aVar.f63036a > Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
                f63034a.remove(aVar);
            }
        }
        if (f63034a.size() > 10) {
            f63034a.remove(0);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m86636a(a aVar) {
        f63034a.add(aVar);
        m86634a();
    }

    /* JADX INFO: renamed from: a */
    public static void m86635a(Context context, StatusBarNotification statusBarNotification, int i) {
        if (!fvq0.m123356j(context) || i <= 0 || statusBarNotification == null) {
            return;
        }
        m86636a(new a(statusBarNotification.getKey(), SystemClock.elapsedRealtime(), i, C14836ag.m86473a(statusBarNotification.getNotification())));
    }
}
