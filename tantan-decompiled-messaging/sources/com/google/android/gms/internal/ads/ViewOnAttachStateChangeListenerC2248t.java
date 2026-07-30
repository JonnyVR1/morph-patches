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
import p149l.avr0;
import p149l.dur0;
import p149l.ii5;
import p149l.yur0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnAttachStateChangeListenerC2248t implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: m */
    public static final Handler f10052m = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    public final Context f10053a;

    /* JADX INFO: renamed from: b */
    public Application f10054b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final PowerManager f10055c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final KeyguardManager f10056d;

    /* JADX INFO: renamed from: e */
    public BroadcastReceiver f10057e;

    /* JADX INFO: renamed from: f */
    public final zzawc f10058f;

    /* JADX INFO: renamed from: g */
    public WeakReference f10059g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public WeakReference f10060h;

    /* JADX INFO: renamed from: i */
    public dur0 f10061i;

    /* JADX INFO: renamed from: j */
    public byte f10062j = -1;

    /* JADX INFO: renamed from: k */
    public int f10063k = -1;

    /* JADX INFO: renamed from: l */
    public long f10064l = -3;

    public ViewOnAttachStateChangeListenerC2248t(Context context, zzawc zzawcVar) {
        Context applicationContext = context.getApplicationContext();
        this.f10053a = applicationContext;
        this.f10058f = zzawcVar;
        this.f10055c = (PowerManager) applicationContext.getSystemService("power");
        this.f10056d = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f10054b = application;
            this.f10061i = new dur0(application, this);
        }
        m13311d(null);
    }

    /* JADX INFO: renamed from: a */
    public final long m13309a() {
        if (this.f10064l <= -2 && m13310b() == null) {
            this.f10064l = -3L;
        }
        return this.f10064l;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final View m13310b() {
        WeakReference weakReference = this.f10060h;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m13311d(View view) {
        long j;
        View viewM13310b = m13310b();
        if (viewM13310b != null) {
            viewM13310b.removeOnAttachStateChangeListener(this);
            m13316i(viewM13310b);
        }
        this.f10060h = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                m13315h(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.f10064l = j;
    }

    /* JADX INFO: renamed from: e */
    public final void m13312e(Activity activity, int i) {
        Window window;
        if (this.f10060h == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View viewM13310b = m13310b();
        if (viewM13310b == null || viewPeekDecorView == null || viewM13310b.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f10063k = i;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX INFO: renamed from: f */
    public final void m13313f() {
        Activity activity;
        if (this.f10060h == null) {
            return;
        }
        View viewM13310b = m13310b();
        if (viewM13310b == null) {
            this.f10064l = -3L;
            this.f10062j = (byte) -1;
            return;
        }
        int i = 0;
        int i2 = viewM13310b.getVisibility() != 0 ? 1 : 0;
        if (!viewM13310b.isShown()) {
            i2 |= 2;
        }
        PowerManager powerManager = this.f10055c;
        if (powerManager != null && !powerManager.isScreenOn()) {
            i2 |= 4;
        }
        if (!this.f10058f.zza()) {
            KeyguardManager keyguardManager = this.f10056d;
            if (keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode()) {
                i2 |= 8;
            } else {
                char[] cArr = yur0.f200119a;
                View rootView = viewM13310b.getRootView();
                if (rootView == null) {
                    rootView = viewM13310b;
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
        if (!viewM13310b.getGlobalVisibleRect(new Rect())) {
            i2 |= 16;
        }
        if (!viewM13310b.getLocalVisibleRect(new Rect())) {
            i2 |= 32;
        }
        int windowVisibility = viewM13310b.getWindowVisibility();
        int i3 = this.f10063k;
        if (i3 != -1) {
            windowVisibility = i3;
        }
        if (windowVisibility != 0) {
            i2 |= 64;
        }
        if (this.f10062j != i2) {
            this.f10062j = (byte) i2;
            this.f10064l = i2 == 0 ? SystemClock.elapsedRealtime() : (-3) - ((long) i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m13314g() {
        f10052m.post(new avr0(this));
    }

    /* JADX INFO: renamed from: h */
    public final void m13315h(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f10059g = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f10057e == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            zzawp zzawpVar = new zzawp(this);
            this.f10057e = zzawpVar;
            ii5.m136342l(this.f10053a, zzawpVar, intentFilter);
        }
        Application application = this.f10054b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f10061i);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m13316i(View view) {
        try {
            WeakReference weakReference = this.f10059g;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f10059g = null;
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
        BroadcastReceiver broadcastReceiver = this.f10057e;
        if (broadcastReceiver != null) {
            try {
                this.f10053a.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.f10057e = null;
        }
        Application application = this.f10054b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f10061i);
            } catch (Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m13312e(activity, 0);
        m13313f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m13313f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m13312e(activity, 4);
        m13313f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m13312e(activity, 0);
        m13313f();
        m13314g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m13313f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m13312e(activity, 0);
        m13313f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m13313f();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m13313f();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m13313f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f10063k = -1;
        m13315h(view);
        m13313f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f10063k = -1;
        m13313f();
        m13314g();
        m13316i(view);
    }
}
