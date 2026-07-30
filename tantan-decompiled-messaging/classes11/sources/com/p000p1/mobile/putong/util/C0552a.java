package com.p000p1.mobile.putong.util;

import android.os.Build;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.joor.Reflect;

/* JADX INFO: renamed from: com.p1.mobile.putong.util.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0552a {
    /* JADX INFO: renamed from: a */
    public static void m10686a() {
        if (Build.VERSION.SDK_INT < 26) {
            m10688c();
        } else {
            m10687b();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m10687b() {
        try {
            Reflect reflectOn = Reflect.on("android.app.QueuedWork");
            reflectOn.set("sFinishers", new LinkedListProxy((LinkedList) reflectOn.field0("sFinishers").get(reflectOn.get())));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m10688c() {
        try {
            Reflect reflectOn = Reflect.on("android.app.QueuedWork");
            reflectOn.set("sPendingWorkFinishers", new ConcurrentLinkedQueueProxy((ConcurrentLinkedQueue) reflectOn.field0("sPendingWorkFinishers").get(reflectOn.get())));
        } catch (Throwable unused) {
        }
    }
}
