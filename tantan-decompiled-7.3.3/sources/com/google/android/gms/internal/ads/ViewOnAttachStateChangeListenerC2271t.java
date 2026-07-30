package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import p153l.e4s0;
import p153l.g4s0;
import p153l.j3s0;
import p153l.jj5;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnAttachStateChangeListenerC2271t implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: m */
    public static final Handler f10089m = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    public final Context f10090a;

    /* JADX INFO: renamed from: b */
    public Application f10091b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final PowerManager f10092c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final KeyguardManager f10093d;

    /* JADX INFO: renamed from: e */
    public BroadcastReceiver f10094e;

    /* JADX INFO: renamed from: f */
    public final zzawc f10095f;

    /* JADX INFO: renamed from: g */
    public WeakReference f10096g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public WeakReference f10097h;

    /* JADX INFO: renamed from: i */
    public j3s0 f10098i;

    /* JADX INFO: renamed from: j */
    public byte f10099j = -1;

    /* JADX INFO: renamed from: k */
    public int f10100k = -1;

    /* JADX INFO: renamed from: l */
    public long f10101l = -3;

    public ViewOnAttachStateChangeListenerC2271t(Context context, zzawc zzawcVar) {
        Context applicationContext = context.getApplicationContext();
        this.f10090a = applicationContext;
        this.f10095f = zzawcVar;
        this.f10092c = (PowerManager) applicationContext.getSystemService("power");
        this.f10093d = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f10091b = application;
            this.f10098i = new j3s0(application, this);
        }
        m13365d(null);
    }

    /* JADX INFO: renamed from: a */
    public final long m13363a() {
        if (this.f10101l <= -2 && m13364b() == null) {
            this.f10101l = -3L;
        }
        return this.f10101l;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final View m13364b() {
        WeakReference weakReference = this.f10097h;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m13365d(View view) {
        long j;
        View viewM13364b = m13364b();
        if (viewM13364b != null) {
            viewM13364b.removeOnAttachStateChangeListener(this);
            m13370i(viewM13364b);
        }
        this.f10097h = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                m13369h(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.f10101l = j;
    }

    /* JADX INFO: renamed from: e */
    public final void m13366e(Activity activity, int i) {
        Window window;
        if (this.f10097h == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View viewM13364b = m13364b();
        if (viewM13364b == null || viewPeekDecorView == null || viewM13364b.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f10100k = i;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX INFO: renamed from: f */
    public final void m13367f() {
        Activity activity;
        if (this.f10097h == null) {
            return;
        }
        View viewM13364b = m13364b();
        if (viewM13364b == null) {
            this.f10101l = -3L;
            this.f10099j = (byte) -1;
            return;
        }
        int i = 0;
        int i2 = viewM13364b.getVisibility() != 0 ? 1 : 0;
        if (!viewM13364b.isShown()) {
            i2 |= 2;
        }
        PowerManager powerManager = this.f10092c;
        if (powerManager != null && !powerManager.isScreenOn()) {
            i2 |= 4;
        }
        if (!this.f10095f.zza()) {
            KeyguardManager keyguardManager = this.f10093d;
            if (keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode()) {
                i2 |= 8;
            } else {
                char[] cArr = e4s0.f92144a;
                View rootView = viewM13364b.getRootView();
                if (rootView == null) {
                    rootView = viewM13364b;
                }
                Context context = rootView.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper) || i >= 10) {
                        activity = null;
                        break;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                        i++;
                    }
                }
                if (activity != null) {
                    Window window = activity.getWindow();
                    WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                    if (attributes == null || (attributes.flags & 524288) == 0) {
                        i2 |= 8;
                    }
                } else {
                    i2 |= 8;
                }
            }
        }
        if (!viewM13364b.getGlobalVisibleRect(new Rect())) {
            i2 |= 16;
        }
        if (!viewM13364b.getLocalVisibleRect(new Rect())) {
            i2 |= 32;
        }
        int windowVisibility = viewM13364b.getWindowVisibility();
        int i3 = this.f10100k;
        if (i3 != -1) {
            windowVisibility = i3;
        }
        if (windowVisibility != 0) {
            i2 |= 64;
        }
        if (this.f10099j != i2) {
            this.f10099j = (byte) i2;
            this.f10101l = i2 == 0 ? SystemClock.elapsedRealtime() : (-3) - ((long) i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m13368g() {
        f10089m.post(new g4s0(this));
    }

    /* JADX INFO: renamed from: h */
    public final void m13369h(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f10096g = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f10094e == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            zzawp zzawpVar = new zzawp(this);
            this.f10094e = zzawpVar;
            jj5.m145018l(this.f10090a, zzawpVar, intentFilter);
        }
        Application application = this.f10091b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f10098i);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m13370i(View view) {
        try {
            WeakReference weakReference = this.f10096g;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f10096g = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.f10094e;
        if (broadcastReceiver != null) {
            try {
                this.f10090a.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.f10094e = null;
        }
        Application application = this.f10091b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f10098i);
            } catch (Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m13366e(activity, 0);
        m13367f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m13367f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m13366e(activity, 4);
        m13367f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m13366e(activity, 0);
        m13367f();
        m13368g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m13367f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m13366e(activity, 0);
        m13367f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m13367f();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m13367f();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m13367f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f10100k = -1;
        m13369h(view);
        m13367f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f10100k = -1;
        m13367f();
        m13368g();
        m13370i(view);
    }
}
