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
import p153l.ua3;

/* JADX INFO: renamed from: com.tantanapp.beatles.safety.spwaitfix.a */
/* JADX INFO: loaded from: classes11.dex */
public class C13723a {

    /* JADX INFO: renamed from: b */
    public static volatile boolean f56828b;

    /* JADX INFO: renamed from: a */
    public Context f56829a;

    /* JADX INFO: renamed from: com.tantanapp.beatles.safety.spwaitfix.a$a */
    public static class a implements ProxySWork.InterfaceC13722b {

        /* JADX INFO: renamed from: a */
        public boolean f56830a;

        /* JADX INFO: renamed from: b */
        public Object f56831b;

        /* JADX INFO: renamed from: c */
        public Field f56832c;

        /* JADX INFO: renamed from: d */
        public Looper f56833d;

        @SuppressLint({"SoonBlockedPrivateApi"})
        public a() {
            this.f56830a = false;
            this.f56831b = null;
            try {
                Class<?> cls = Class.forName("android.app.QueuedWork");
                Method declaredMethod = cls.getDeclaredMethod("getHandler", null);
                declaredMethod.setAccessible(true);
                this.f56833d = ((Handler) declaredMethod.invoke(null, null)).getLooper();
                Field declaredField = cls.getDeclaredField("sWork");
                this.f56832c = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = cls.getDeclaredField("sLock");
                declaredField2.setAccessible(true);
                this.f56831b = declaredField2.get(null);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
                this.f56830a = true;
            }
        }

        @Override // com.tantanapp.beatles.safety.spwaitfix.ProxySWork.InterfaceC13722b
        /* JADX INFO: renamed from: a */
        public void mo82364a() {
            m82368c();
        }

        /* JADX INFO: renamed from: c */
        public final void m82368c() {
            if (this.f56830a) {
                return;
            }
            synchronized (this.f56831b) {
                try {
                    this.f56832c.set(null, new ProxySWork((LinkedList) this.f56832c.get(null), this.f56833d, this));
                } catch (IllegalAccessException unused) {
                    this.f56830a = true;
                }
            }
        }
    }

    public C13723a(Context context) {
        this.f56829a = context;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m82365a() {
        try {
            if (f56828b) {
                return;
            }
            ua3.m195156a("Landroid/app/QueuedWork;->sPendingWorkFinishers:Ljava/util/concurrent/ConcurrentLinkedQueue;", "Landroid/app/QueuedWork;->sFinishers:Ljava/util/LinkedList;", "Landroid/app/QueuedWork;->sWork:Ljava/util/LinkedList;", "Landroid/app/QueuedWork;->sLock:Ljava/lang/Object;", "Landroid/app/QueuedWork;->getHandler()Landroid/os/Handler;");
            m82366b();
            f56828b = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m82366b() throws Exception {
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
        new a().m82368c();
    }
}
