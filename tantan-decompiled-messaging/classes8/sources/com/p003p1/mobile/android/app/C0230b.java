package com.p003p1.mobile.android.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.p1.mobile.android.app.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0230b {

    /* JADX INFO: renamed from: a */
    public static final boolean f1237a = false;

    /* JADX INFO: renamed from: com.p1.mobile.android.app.b$a */
    public static class a implements MessageQueue.IdleHandler, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalFocusChangeListener {

        /* JADX INFO: renamed from: b */
        public static boolean f1238b = false;

        /* JADX INFO: renamed from: c */
        public static Field f1239c;

        /* JADX INFO: renamed from: d */
        public static Field f1240d;

        /* JADX INFO: renamed from: e */
        public static Method f1241e;

        /* JADX INFO: renamed from: a */
        public final InputMethodManager f1242a = (InputMethodManager) App.f1068e.getSystemService("input_method");

        /* JADX INFO: renamed from: c */
        public static void m886c() {
            if (f1238b) {
                return;
            }
            f1238b = true;
            if (C0230b.f1237a) {
                try {
                    Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                    f1240d = declaredField;
                    declaredField.setAccessible(true);
                    Field declaredField2 = InputMethodManager.class.getDeclaredField("mServedView");
                    f1239c = declaredField2;
                    declaredField2.setAccessible(true);
                    Method declaredMethod = InputMethodManager.class.getDeclaredMethod("finishInputLocked", null);
                    f1241e = declaredMethod;
                    declaredMethod.setAccessible(true);
                    InputMethodManager.class.getDeclaredMethod("focusIn", View.class).setAccessible(true);
                } catch (NoSuchFieldException e) {
                    CrashHelper.c(e);
                } catch (NoSuchMethodException e2) {
                    CrashHelper.c(e2);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m887a() {
            m886c();
            try {
                Object obj = f1239c.get(this.f1242a);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        View view = (View) f1240d.get(this.f1242a);
                        if (view != null) {
                            if (view.getWindowVisibility() != 8) {
                                view.removeOnAttachStateChangeListener(this);
                                view.addOnAttachStateChangeListener(this);
                            } else {
                                Activity activityM888b = m888b(view.getContext());
                                if (activityM888b == null || activityM888b.getWindow() == null) {
                                    f1241e.invoke(this.f1242a, null);
                                } else {
                                    View viewPeekDecorView = activityM888b.getWindow().peekDecorView();
                                    if (viewPeekDecorView.getWindowVisibility() != 8) {
                                        viewPeekDecorView.requestFocusFromTouch();
                                    } else {
                                        f1241e.invoke(this.f1242a, null);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException e) {
                CrashHelper.c(e);
            } catch (InvocationTargetException e2) {
                CrashHelper.c(e2);
            }
        }

        /* JADX INFO: renamed from: b */
        public final Activity m888b(Context context) {
            Context baseContext;
            while (!(context instanceof Application)) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                if (!(context instanceof ContextWrapper) || (baseContext = ((ContextWrapper) context).getBaseContext()) == context) {
                    return null;
                }
                context = baseContext;
            }
            return null;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            if (view2 == null) {
                return;
            }
            if (view != null) {
                view.removeOnAttachStateChangeListener(this);
            }
            Looper.myQueue().removeIdleHandler(this);
            view2.addOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            Looper.myQueue().removeIdleHandler(this);
            Looper.myQueue().addIdleHandler(this);
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            m887a();
            return false;
        }
    }
}
