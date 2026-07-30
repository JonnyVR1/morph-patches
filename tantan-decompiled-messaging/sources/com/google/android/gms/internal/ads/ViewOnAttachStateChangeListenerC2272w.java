package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.C2075b;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p149l.d1s0;
import p149l.m7s0;
import p149l.nyr0;
import p149l.rxr0;
import p149l.sxr0;
import p149l.tys0;
import p149l.vny0;
import p149l.x2t0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnAttachStateChangeListenerC2272w implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: p */
    public static final long f10080p = ((Long) d1s0.m109677c().m144697a(m7s0.f132314m1)).longValue();

    /* JADX INFO: renamed from: a */
    public final Context f10081a;

    /* JADX INFO: renamed from: b */
    public Application f10082b;

    /* JADX INFO: renamed from: c */
    public final WindowManager f10083c;

    /* JADX INFO: renamed from: d */
    public final PowerManager f10084d;

    /* JADX INFO: renamed from: e */
    public final KeyguardManager f10085e;

    /* JADX INFO: renamed from: f */
    @Nullable
    @VisibleForTesting
    public BroadcastReceiver f10086f;

    /* JADX INFO: renamed from: g */
    public WeakReference f10087g;

    /* JADX INFO: renamed from: h */
    public final WeakReference f10088h;

    /* JADX INFO: renamed from: i */
    public nyr0 f10089i;

    /* JADX INFO: renamed from: j */
    public final tys0 f10090j = new tys0(f10080p);

    /* JADX INFO: renamed from: k */
    public boolean f10091k = false;

    /* JADX INFO: renamed from: l */
    public int f10092l = -1;

    /* JADX INFO: renamed from: m */
    public final HashSet f10093m = new HashSet();

    /* JADX INFO: renamed from: n */
    public final DisplayMetrics f10094n;

    /* JADX INFO: renamed from: o */
    public final Rect f10095o;

    public ViewOnAttachStateChangeListenerC2272w(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f10081a = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        this.f10083c = windowManager;
        this.f10084d = (PowerManager) applicationContext.getSystemService("power");
        this.f10085e = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f10082b = application;
            this.f10089i = new nyr0(application, this);
        }
        this.f10094n = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f10095o = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f10088h;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m13412m(view2);
        }
        this.f10088h = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                m13411l(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public final Rect m13401a(Rect rect) {
        return new Rect(m13407h(rect.left), m13407h(rect.top), m13407h(rect.right), m13407h(rect.bottom));
    }

    /* JADX INFO: renamed from: c */
    public final void m13402c(sxr0 sxr0Var) {
        this.f10093m.add(sxr0Var);
        m13409j(3);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m13403d() {
        m13409j(3);
    }

    /* JADX INFO: renamed from: e */
    public final void m13404e(sxr0 sxr0Var) {
        this.f10093m.remove(sxr0Var);
    }

    /* JADX INFO: renamed from: f */
    public final void m13405f() {
        this.f10090j.m191069a(f10080p);
    }

    /* JADX INFO: renamed from: g */
    public final void m13406g(long j) {
        this.f10090j.m191069a(j);
    }

    /* JADX INFO: renamed from: h */
    public final int m13407h(int i) {
        return (int) (i / this.f10094n.density);
    }

    /* JADX INFO: renamed from: i */
    public final void m13408i(Activity activity, int i) {
        Window window;
        if (this.f10088h == null || (window = activity.getWindow()) == null) {
            return;
        }
        WeakReference weakReference = this.f10088h;
        View viewPeekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f10092l = i;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0131  */
    /* JADX WARN: Code duplicated, block: B:55:0x0136  */
    /* JADX WARN: Code duplicated, block: B:57:0x013a  */
    /* JADX WARN: Code duplicated, block: B:58:0x013e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final void m13409j(int i) {
        WeakReference weakReference;
        boolean globalVisibleRect;
        boolean localVisibleRect;
        View view;
        List arrayList;
        int i2;
        int i3;
        boolean z;
        if (this.f10093m.isEmpty() || (weakReference = this.f10088h) == null) {
            return;
        }
        View view2 = (View) weakReference.get();
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view2 != null) {
            globalVisibleRect = view2.getGlobalVisibleRect(rect2);
            localVisibleRect = view2.getLocalVisibleRect(rect3);
            view2.getHitRect(rect4);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
            } catch (Exception e) {
                x2t0.m206867e("Failure getting view location.", e);
            }
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131993M4)).booleanValue()) {
                rect.left = iArr2[0];
                rect.top = iArr2[1];
            } else {
                rect.left = iArr[0];
                rect.top = iArr[1];
            }
            rect.right = rect.left + view2.getWidth();
            rect.bottom = rect.top + view2.getHeight();
            view = view2;
        } else {
            globalVisibleRect = false;
            localVisibleRect = false;
            view = null;
        }
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132353p1)).booleanValue() || view == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            try {
                arrayList = new ArrayList();
                ViewParent parent = view.getParent();
                while (parent instanceof View) {
                    View view3 = (View) parent;
                    Rect rect5 = new Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect5)) {
                        arrayList.add(m13401a(rect5));
                    }
                    parent = parent.getParent();
                }
            } catch (Exception e2) {
                vny0.m199079q().m212290w(e2, "PositionWatcher.getParentScrollViewRects");
                arrayList = Collections.EMPTY_LIST;
            }
        }
        List list = arrayList;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i4 = this.f10092l;
        if (i4 != -1) {
            windowVisibility = i4;
        }
        vny0.m199080r();
        long jM12303X = C2075b.m12303X(view);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132193ca)).booleanValue()) {
            if (view2 != null) {
                PowerManager powerManager = this.f10084d;
                KeyguardManager keyguardManager = this.f10085e;
                vny0.m199080r();
                if (C2075b.m12325r(view, powerManager, keyguardManager)) {
                    if (!globalVisibleRect) {
                        i2 = 0;
                        globalVisibleRect = false;
                    } else if (!localVisibleRect) {
                        globalVisibleRect = true;
                        i2 = 0;
                        localVisibleRect = false;
                    } else if (jM12303X < ((Integer) d1s0.m109677c().m144697a(m7s0.f132232fa)).intValue() || windowVisibility != 0) {
                        globalVisibleRect = true;
                        localVisibleRect = true;
                    } else {
                        i2 = 1;
                        globalVisibleRect = true;
                        localVisibleRect = true;
                        windowVisibility = 0;
                    }
                }
            }
            i2 = 0;
        } else {
            if (view2 != null) {
                PowerManager powerManager2 = this.f10084d;
                KeyguardManager keyguardManager2 = this.f10085e;
                vny0.m199080r();
                if (C2075b.m12325r(view, powerManager2, keyguardManager2)) {
                    if (!globalVisibleRect) {
                        i2 = 0;
                        globalVisibleRect = false;
                    } else if (!localVisibleRect) {
                        globalVisibleRect = true;
                        i2 = 0;
                        localVisibleRect = false;
                    } else if (windowVisibility == 0) {
                        i2 = 1;
                        globalVisibleRect = true;
                        localVisibleRect = true;
                        windowVisibility = 0;
                    } else {
                        globalVisibleRect = true;
                        localVisibleRect = true;
                    }
                }
            }
            i2 = 0;
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132258ha)).booleanValue()) {
            PowerManager powerManager3 = this.f10084d;
            KeyguardManager keyguardManager3 = this.f10085e;
            vny0.m199080r();
            int i5 = true != C2075b.m12325r(view, powerManager3, keyguardManager3) ? 0 : 64;
            int i6 = true != globalVisibleRect ? 0 : 8;
            int i7 = true != localVisibleRect ? 0 : 16;
            int i8 = windowVisibility == 0 ? 128 : 0;
            int i9 = jM12303X >= ((long) ((Integer) d1s0.m109677c().m144697a(m7s0.f132232fa)).intValue()) ? 32 : 0;
            vny0.m199080r();
            C2075b.m12316i(view, i9 | i8 | i5 | i6 | i7 | i2, null);
            i3 = 1;
        } else {
            i3 = 1;
        }
        if (i == i3 && !this.f10090j.m191070b() && i2 == this.f10091k) {
            return;
        }
        if (i2 != 0 || this.f10091k) {
            z = true;
        } else {
            z = true;
            if (i == 1) {
                return;
            }
        }
        boolean z2 = i2;
        rxr0 rxr0Var = new rxr0(vny0.m199064b().elapsedRealtime(), this.f10084d.isScreenOn(), (view == null || !view.isAttachedToWindow()) ? false : z, view != null ? view.getWindowVisibility() : 8, m13401a(this.f10095o), m13401a(rect), m13401a(rect2), globalVisibleRect, m13401a(rect3), localVisibleRect, jM12303X, m13401a(rect4), this.f10094n.density, z2, list);
        Iterator it = this.f10093m.iterator();
        while (it.hasNext()) {
            ((sxr0) it.next()).mo13669U(rxr0Var);
        }
        this.f10091k = z2;
    }

    /* JADX INFO: renamed from: k */
    public final void m13410k() {
        C2075b.f9714l.post(new Runnable() { // from class: l.qxr0
            @Override // java.lang.Runnable
            public final void run() {
                this.f156866a.m13403d();
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m13411l(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f10087g = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f10086f == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f10086f = new zzayo(this);
            vny0.m199086x().m12287c(this.f10081a, this.f10086f, intentFilter);
        }
        Application application = this.f10082b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f10089i);
            } catch (Exception e) {
                x2t0.m206867e("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m13412m(View view) {
        try {
            WeakReference weakReference = this.f10087g;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f10087g = null;
            }
        } catch (Exception e) {
            x2t0.m206867e("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            x2t0.m206867e("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.f10086f != null) {
            try {
                vny0.m199086x().m12288d(this.f10081a, this.f10086f);
            } catch (IllegalStateException e3) {
                x2t0.m206867e("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                vny0.m199079q().m212290w(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f10086f = null;
        }
        Application application = this.f10082b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f10089i);
            } catch (Exception e5) {
                x2t0.m206867e("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m13408i(activity, 0);
        m13409j(3);
        m13410k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m13409j(3);
        m13410k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m13408i(activity, 4);
        m13409j(3);
        m13410k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m13408i(activity, 0);
        m13409j(3);
        m13410k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m13409j(3);
        m13410k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m13408i(activity, 0);
        m13409j(3);
        m13410k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m13409j(3);
        m13410k();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m13409j(2);
        m13410k();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m13409j(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f10092l = -1;
        m13411l(view);
        m13409j(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f10092l = -1;
        m13409j(3);
        m13410k();
        m13412m(view);
    }
}
