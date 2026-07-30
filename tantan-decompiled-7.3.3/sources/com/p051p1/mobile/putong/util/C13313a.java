package com.p051p1.mobile.putong.util;

import android.os.Build;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.joor.Reflect;

/* JADX INFO: renamed from: com.p1.mobile.putong.util.a */
/* JADX INFO: loaded from: classes10.dex */
public class C13313a {
    /* JADX INFO: renamed from: a */
    public static void m81518a() {
        if (Build.VERSION.SDK_INT < 26) {
            m81520c();
        } else {
            m81519b();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m81519b() {
        try {
            Reflect reflectM222383on = Reflect.m222383on("android.app.QueuedWork");
            reflectM222383on.set("sFinishers", new LinkedListProxy((LinkedList) reflectM222383on.field0("sFinishers").get(reflectM222383on.get())));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m81520c() {
        try {
            Reflect reflectM222383on = Reflect.m222383on("android.app.QueuedWork");
            reflectM222383on.set("sPendingWorkFinishers", new ConcurrentLinkedQueueProxy((ConcurrentLinkedQueue) reflectM222383on.field0("sPendingWorkFinishers").get(reflectM222383on.get())));
        } catch (Throwable unused) {
        }
    }
}
