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
import com.google.android.gms.ads.internal.util.C2098b;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p153l.bxy0;
import p153l.dct0;
import p153l.jas0;
import p153l.sgs0;
import p153l.t7s0;
import p153l.x6s0;
import p153l.y6s0;
import p153l.z7t0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnAttachStateChangeListenerC2295w implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: p */
    public static final long f10117p = ((Long) jas0.m144075c().m176505a(sgs0.f168385m1)).longValue();

    /* JADX INFO: renamed from: a */
    public final Context f10118a;

    /* JADX INFO: renamed from: b */
    public Application f10119b;

    /* JADX INFO: renamed from: c */
    public final WindowManager f10120c;

    /* JADX INFO: renamed from: d */
    public final PowerManager f10121d;

    /* JADX INFO: renamed from: e */
    public final KeyguardManager f10122e;

    /* JADX INFO: renamed from: f */
    @Nullable
    @VisibleForTesting
    public BroadcastReceiver f10123f;

    /* JADX INFO: renamed from: g */
    public WeakReference f10124g;

    /* JADX INFO: renamed from: h */
    public final WeakReference f10125h;

    /* JADX INFO: renamed from: i */
    public t7s0 f10126i;

    /* JADX INFO: renamed from: j */
    public final z7t0 f10127j = new z7t0(f10117p);

    /* JADX INFO: renamed from: k */
    public boolean f10128k = false;

    /* JADX INFO: renamed from: l */
    public int f10129l = -1;

    /* JADX INFO: renamed from: m */
    public final HashSet f10130m = new HashSet();

    /* JADX INFO: renamed from: n */
    public final DisplayMetrics f10131n;

    /* JADX INFO: renamed from: o */
    public final Rect f10132o;

    public ViewOnAttachStateChangeListenerC2295w(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f10118a = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        this.f10120c = windowManager;
        this.f10121d = (PowerManager) applicationContext.getSystemService("power");
        this.f10122e = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f10119b = application;
            this.f10126i = new t7s0(application, this);
        }
        this.f10131n = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f10132o = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f10125h;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m13466m(view2);
        }
        this.f10125h = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                m13465l(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public final Rect m13455a(Rect rect) {
        return new Rect(m13461h(rect.left), m13461h(rect.top), m13461h(rect.right), m13461h(rect.bottom));
    }

    /* JADX INFO: renamed from: c */
    public final void m13456c(y6s0 y6s0Var) {
        this.f10130m.add(y6s0Var);
        m13463j(3);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m13457d() {
        m13463j(3);
    }

    /* JADX INFO: renamed from: e */
    public final void m13458e(y6s0 y6s0Var) {
        this.f10130m.remove(y6s0Var);
    }

    /* JADX INFO: renamed from: f */
    public final void m13459f() {
        this.f10127j.m218917a(f10117p);
    }

    /* JADX INFO: renamed from: g */
    public final void m13460g(long j) {
        this.f10127j.m218917a(j);
    }

    /* JADX INFO: renamed from: h */
    public final int m13461h(int i) {
        return (int) (i / this.f10131n.density);
    }

    /* JADX INFO: renamed from: i */
    public final void m13462i(Activity activity, int i) {
        Window window;
        if (this.f10125h == null || (window = activity.getWindow()) == null) {
            return;
        }
        WeakReference weakReference = this.f10125h;
        View viewPeekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f10129l = i;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0131  */
    /* JADX WARN: Code duplicated, block: B:55:0x0136  */
    /* JADX WARN: Code duplicated, block: B:57:0x013a  */
    /* JADX WARN: Code duplicated, block: B:58:0x013e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final void m13463j(int i) {
        WeakReference weakReference;
        boolean globalVisibleRect;
        boolean localVisibleRect;
        View view;
        List arrayList;
        int i2;
        int i3;
        boolean z;
        if (this.f10130m.isEmpty() || (weakReference = this.f10125h) == null) {
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
                dct0.m115296e("Failure getting view location.", e);
            }
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168064M4)).booleanValue()) {
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
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168424p1)).booleanValue() || view == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            try {
                arrayList = new ArrayList();
                ViewParent parent = view.getParent();
                while (parent instanceof View) {
                    View view3 = (View) parent;
                    Rect rect5 = new Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect5)) {
                        arrayList.add(m13455a(rect5));
                    }
                    parent = parent.getParent();
                }
            } catch (Exception e2) {
                bxy0.m106933q().m120275w(e2, "PositionWatcher.getParentScrollViewRects");
                arrayList = Collections.EMPTY_LIST;
            }
        }
        List list = arrayList;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i4 = this.f10129l;
        if (i4 != -1) {
            windowVisibility = i4;
        }
        bxy0.m106934r();
        long jM12357X = C2098b.m12357X(view);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168264ca)).booleanValue()) {
            if (view2 != null) {
                PowerManager powerManager = this.f10121d;
                KeyguardManager keyguardManager = this.f10122e;
                bxy0.m106934r();
                if (C2098b.m12379r(view, powerManager, keyguardManager)) {
                    if (!globalVisibleRect) {
                        i2 = 0;
                        globalVisibleRect = false;
                    } else if (!localVisibleRect) {
                        globalVisibleRect = true;
                        i2 = 0;
                        localVisibleRect = false;
                    } else if (jM12357X < ((Integer) jas0.m144075c().m176505a(sgs0.f168303fa)).intValue() || windowVisibility != 0) {
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
                PowerManager powerManager2 = this.f10121d;
                KeyguardManager keyguardManager2 = this.f10122e;
                bxy0.m106934r();
                if (C2098b.m12379r(view, powerManager2, keyguardManager2)) {
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
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168329ha)).booleanValue()) {
            PowerManager powerManager3 = this.f10121d;
            KeyguardManager keyguardManager3 = this.f10122e;
            bxy0.m106934r();
            int i5 = true != C2098b.m12379r(view, powerManager3, keyguardManager3) ? 0 : 64;
            int i6 = true != globalVisibleRect ? 0 : 8;
            int i7 = true != localVisibleRect ? 0 : 16;
            int i8 = windowVisibility == 0 ? 128 : 0;
            int i9 = jM12357X >= ((long) ((Integer) jas0.m144075c().m176505a(sgs0.f168303fa)).intValue()) ? 32 : 0;
            bxy0.m106934r();
            C2098b.m12370i(view, i9 | i8 | i5 | i6 | i7 | i2, null);
            i3 = 1;
        } else {
            i3 = 1;
        }
        if (i == i3 && !this.f10127j.m218918b() && i2 == this.f10128k) {
            return;
        }
        if (i2 != 0 || this.f10128k) {
            z = true;
        } else {
            z = true;
            if (i == 1) {
                return;
            }
        }
        boolean z2 = i2;
        x6s0 x6s0Var = new x6s0(bxy0.m106918b().elapsedRealtime(), this.f10121d.isScreenOn(), (view == null || !view.isAttachedToWindow()) ? false : z, view != null ? view.getWindowVisibility() : 8, m13455a(this.f10132o), m13455a(rect), m13455a(rect2), globalVisibleRect, m13455a(rect3), localVisibleRect, jM12357X, m13455a(rect4), this.f10131n.density, z2, list);
        Iterator it = this.f10130m.iterator();
        while (it.hasNext()) {
            ((y6s0) it.next()).mo13723U(x6s0Var);
        }
        this.f10128k = z2;
    }

    /* JADX INFO: renamed from: k */
    public final void m13464k() {
        C2098b.f9751l.post(new Runnable() { // from class: l.w6s0
            @Override // java.lang.Runnable
            public final void run() {
                this.f187650a.m13457d();
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m13465l(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f10124g = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f10123f == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f10123f = new zzayo(this);
            bxy0.m106940x().m12341c(this.f10118a, this.f10123f, intentFilter);
        }
        Application application = this.f10119b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f10126i);
            } catch (Exception e) {
                dct0.m115296e("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m13466m(View view) {
        try {
            WeakReference weakReference = this.f10124g;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f10124g = null;
            }
        } catch (Exception e) {
            dct0.m115296e("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            dct0.m115296e("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.f10123f != null) {
            try {
                bxy0.m106940x().m12342d(this.f10118a, this.f10123f);
            } catch (IllegalStateException e3) {
                dct0.m115296e("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                bxy0.m106933q().m120275w(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f10123f = null;
        }
        Application application = this.f10119b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f10126i);
            } catch (Exception e5) {
                dct0.m115296e("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m13462i(activity, 0);
        m13463j(3);
        m13464k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m13463j(3);
        m13464k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m13462i(activity, 4);
        m13463j(3);
        m13464k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m13462i(activity, 0);
        m13463j(3);
        m13464k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m13463j(3);
        m13464k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m13462i(activity, 0);
        m13463j(3);
        m13464k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m13463j(3);
        m13464k();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m13463j(2);
        m13464k();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m13463j(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f10129l = -1;
        m13465l(view);
        m13463j(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f10129l = -1;
        m13463j(3);
        m13464k();
        m13466m(view);
    }
}
