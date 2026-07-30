package com.tantanapp.beatles.safety.spwaitfix;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import p149l.fa3;

/* JADX INFO: renamed from: com.tantanapp.beatles.safety.spwaitfix.a */
/* JADX INFO: loaded from: classes13.dex */
public class C13560a {

    /* JADX INFO: renamed from: b */
    public static volatile boolean f55980b;

    /* JADX INFO: renamed from: a */
    public Context f55981a;

    /* JADX INFO: renamed from: com.tantanapp.beatles.safety.spwaitfix.a$a */
    public static class a implements ProxySWork.InterfaceC13559b {

        /* JADX INFO: renamed from: a */
        public boolean f55982a;

        /* JADX INFO: renamed from: b */
        public Object f55983b;

        /* JADX INFO: renamed from: c */
        public Field f55984c;

        /* JADX INFO: renamed from: d */
        public Looper f55985d;

        @SuppressLint({"SoonBlockedPrivateApi"})
        public a() {
            this.f55982a = false;
            this.f55983b = null;
            try {
                Class<?> cls = Class.forName("android.app.QueuedWork");
                Method declaredMethod = cls.getDeclaredMethod("getHandler", null);
                declaredMethod.setAccessible(true);
                this.f55985d = ((Handler) declaredMethod.invoke(null, null)).getLooper();
                Field declaredField = cls.getDeclaredField("sWork");
                this.f55984c = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = cls.getDeclaredField("sLock");
                declaredField2.setAccessible(true);
                this.f55983b = declaredField2.get(null);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
                this.f55982a = true;
            }
        }

        @Override // com.tantanapp.beatles.safety.spwaitfix.ProxySWork.InterfaceC13559b
        /* JADX INFO: renamed from: a */
        public void mo81181a() {
            m81185c();
        }

        /* JADX INFO: renamed from: c */
        public final void m81185c() {
            if (this.f55982a) {
                return;
            }
            synchronized (this.f55983b) {
                try {
                    this.f55984c.set(null, new ProxySWork((LinkedList) this.f55984c.get(null), this.f55985d, this));
                } catch (IllegalAccessException unused) {
                    this.f55982a = true;
                }
            }
        }
    }

    public C13560a(Context context) {
        this.f55981a = context;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m81182a() {
        try {
            if (f55980b) {
                return;
            }
            fa3.m120142a("Landroid/app/QueuedWork;->sPendingWorkFinishers:Ljava/util/concurrent/ConcurrentLinkedQueue;", "Landroid/app/QueuedWork;->sFinishers:Ljava/util/LinkedList;", "Landroid/app/QueuedWork;->sWork:Ljava/util/LinkedList;", "Landroid/app/QueuedWork;->sLock:Ljava/lang/Object;", "Landroid/app/QueuedWork;->getHandler()Landroid/os/Handler;");
            m81183b();
            f55980b = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m81183b() throws Exception {
        Class<?> cls = Class.forName("android.app.QueuedWork");
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            Field declaredField = cls.getDeclaredField("sPendingWorkFinishers");
            declaredField.setAccessible(true);
            declaredField.set(null, new ProxyFinishersLinkedList((ConcurrentLinkedQueue) declaredField.get(null)));
        } else {
            Field declaredField2 = cls.getDeclaredField("sFinishers");
            declaredField2.setAccessible(true);
            declaredField2.set(null, new ProxyFinishersList((LinkedList) declaredField2.get(null)));
        }
        if (i < 26) {
            return;
        }
        new a().m81185c();
    }
}
