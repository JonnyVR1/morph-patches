package com.p051p1.mobile.android.app;

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
public class C4469b {

    /* JADX INFO: renamed from: a */
    public static final boolean f16257a = false;

    /* JADX INFO: renamed from: com.p1.mobile.android.app.b$a */
    public static class a implements MessageQueue.IdleHandler, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalFocusChangeListener {

        /* JADX INFO: renamed from: b */
        public static boolean f16258b = false;

        /* JADX INFO: renamed from: c */
        public static Field f16259c;

        /* JADX INFO: renamed from: d */
        public static Field f16260d;

        /* JADX INFO: renamed from: e */
        public static Method f16261e;

        /* JADX INFO: renamed from: a */
        public final InputMethodManager f16262a = (InputMethodManager) App.f16088e.getSystemService("input_method");

        /* JADX INFO: renamed from: c */
        public static void m21614c() {
            if (f16258b) {
                return;
            }
            f16258b = true;
            if (C4469b.f16257a) {
                try {
                    Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                    f16260d = declaredField;
                    declaredField.setAccessible(true);
                    Field declaredField2 = InputMethodManager.class.getDeclaredField("mServedView");
                    f16259c = declaredField2;
                    declaredField2.setAccessible(true);
                    Method declaredMethod = InputMethodManager.class.getDeclaredMethod("finishInputLocked", null);
                    f16261e = declaredMethod;
                    declaredMethod.setAccessible(true);
                    InputMethodManager.class.getDeclaredMethod("focusIn", View.class).setAccessible(true);
                } catch (NoSuchFieldException e) {
                    CrashHelper.m82479c(e);
                } catch (NoSuchMethodException e2) {
                    CrashHelper.m82479c(e2);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m21615a() {
            m21614c();
            try {
                Object obj = f16259c.get(this.f16262a);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        View view = (View) f16260d.get(this.f16262a);
                        if (view != null) {
                            if (view.getWindowVisibility() != 8) {
                                view.removeOnAttachStateChangeListener(this);
                                view.addOnAttachStateChangeListener(this);
                            } else {
                                Activity activityM21616b = m21616b(view.getContext());
                                if (activityM21616b == null || activityM21616b.getWindow() == null) {
                                    f16261e.invoke(this.f16262a, null);
                                } else {
                                    View viewPeekDecorView = activityM21616b.getWindow().peekDecorView();
                                    if (viewPeekDecorView.getWindowVisibility() != 8) {
                                        viewPeekDecorView.requestFocusFromTouch();
                                    } else {
                                        f16261e.invoke(this.f16262a, null);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException e) {
                CrashHelper.m82479c(e);
            } catch (InvocationTargetException e2) {
                CrashHelper.m82479c(e2);
            }
        }

        /* JADX INFO: renamed from: b */
        public final Activity m21616b(Context context) {
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
            m21615a();
            return false;
        }
    }
}
