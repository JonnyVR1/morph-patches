package com.p046p1.mobile.android.app;

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
/* JADX INFO: loaded from: classes8.dex */
public class C4318b {

    /* JADX INFO: renamed from: a */
    public static final boolean f15538a = false;

    /* JADX INFO: renamed from: com.p1.mobile.android.app.b$a */
    public static class a implements MessageQueue.IdleHandler, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalFocusChangeListener {

        /* JADX INFO: renamed from: b */
        public static boolean f15539b = false;

        /* JADX INFO: renamed from: c */
        public static Field f15540c;

        /* JADX INFO: renamed from: d */
        public static Field f15541d;

        /* JADX INFO: renamed from: e */
        public static Method f15542e;

        /* JADX INFO: renamed from: a */
        public final InputMethodManager f15543a = (InputMethodManager) App.f15369e.getSystemService("input_method");

        /* JADX INFO: renamed from: c */
        public static void m20615c() {
            if (f15539b) {
                return;
            }
            f15539b = true;
            if (C4318b.f15538a) {
                try {
                    Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                    f15541d = declaredField;
                    declaredField.setAccessible(true);
                    Field declaredField2 = InputMethodManager.class.getDeclaredField("mServedView");
                    f15540c = declaredField2;
                    declaredField2.setAccessible(true);
                    Method declaredMethod = InputMethodManager.class.getDeclaredMethod("finishInputLocked", null);
                    f15542e = declaredMethod;
                    declaredMethod.setAccessible(true);
                    InputMethodManager.class.getDeclaredMethod("focusIn", View.class).setAccessible(true);
                } catch (NoSuchFieldException e) {
                    CrashHelper.m81296c(e);
                } catch (NoSuchMethodException e2) {
                    CrashHelper.m81296c(e2);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m20616a() {
            m20615c();
            try {
                Object obj = f15540c.get(this.f15543a);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        View view = (View) f15541d.get(this.f15543a);
                        if (view != null) {
                            if (view.getWindowVisibility() != 8) {
                                view.removeOnAttachStateChangeListener(this);
                                view.addOnAttachStateChangeListener(this);
                            } else {
                                Activity activityM20617b = m20617b(view.getContext());
                                if (activityM20617b == null || activityM20617b.getWindow() == null) {
                                    f15542e.invoke(this.f15543a, null);
                                } else {
                                    View viewPeekDecorView = activityM20617b.getWindow().peekDecorView();
                                    if (viewPeekDecorView.getWindowVisibility() != 8) {
                                        viewPeekDecorView.requestFocusFromTouch();
                                    } else {
                                        f15542e.invoke(this.f15543a, null);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException e) {
                CrashHelper.m81296c(e);
            } catch (InvocationTargetException e2) {
                CrashHelper.m81296c(e2);
            }
        }

        /* JADX INFO: renamed from: b */
        public final Activity m20617b(Context context) {
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
            m20616a();
            return false;
        }
    }
}
