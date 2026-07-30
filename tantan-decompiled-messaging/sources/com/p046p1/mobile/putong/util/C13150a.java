package com.p046p1.mobile.putong.util;

import android.os.Build;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.joor.Reflect;

/* JADX INFO: renamed from: com.p1.mobile.putong.util.a */
/* JADX INFO: loaded from: classes11.dex */
public class C13150a {
    /* JADX INFO: renamed from: a */
    public static void m80335a() {
        if (Build.VERSION.SDK_INT < 26) {
            m80337c();
        } else {
            m80336b();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m80336b() {
        try {
            Reflect reflectM221137on = Reflect.m221137on("android.app.QueuedWork");
            reflectM221137on.set("sFinishers", new LinkedListProxy((LinkedList) reflectM221137on.field0("sFinishers").get(reflectM221137on.get())));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m80337c() {
        try {
            Reflect reflectM221137on = Reflect.m221137on("android.app.QueuedWork");
            reflectM221137on.set("sPendingWorkFinishers", new ConcurrentLinkedQueueProxy((ConcurrentLinkedQueue) reflectM221137on.field0("sPendingWorkFinishers").get(reflectM221137on.get())));
        } catch (Throwable unused) {
        }
    }
}
