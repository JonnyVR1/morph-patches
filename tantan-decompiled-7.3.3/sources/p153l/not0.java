package p153l;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;

/* JADX INFO: loaded from: classes6.dex */
public final class not0 {

    /* JADX INFO: renamed from: a */
    public final View f143030a;

    /* JADX INFO: renamed from: b */
    public Activity f143031b;

    /* JADX INFO: renamed from: c */
    public boolean f143032c;

    /* JADX INFO: renamed from: d */
    public boolean f143033d;

    /* JADX INFO: renamed from: e */
    public boolean f143034e;

    /* JADX INFO: renamed from: f */
    public final ViewTreeObserver.OnGlobalLayoutListener f143035f;

    public not0(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f143031b = activity;
        this.f143030a = view;
        this.f143035f = onGlobalLayoutListener;
    }

    /* JADX INFO: renamed from: f */
    public static ViewTreeObserver m164188f(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    /* JADX INFO: renamed from: a */
    public final void m164189a() {
        this.f143034e = false;
        m164195h();
    }

    /* JADX INFO: renamed from: b */
    public final void m164190b() {
        this.f143034e = true;
        if (this.f143033d) {
            m164194g();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m164191c() {
        this.f143033d = true;
        if (this.f143034e) {
            m164194g();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m164192d() {
        this.f143033d = false;
        m164195h();
    }

    /* JADX INFO: renamed from: e */
    public final void m164193e(Activity activity) {
        this.f143031b = activity;
    }

    /* JADX INFO: renamed from: g */
    public final void m164194g() {
        if (this.f143032c) {
            return;
        }
        Activity activity = this.f143031b;
        if (activity != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f143035f;
            ViewTreeObserver viewTreeObserverM164188f = m164188f(activity);
            if (viewTreeObserverM164188f != null) {
                viewTreeObserverM164188f.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        View view = this.f143030a;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.f143035f;
        bxy0.m106942z();
        ldt0.m153789a(view, onGlobalLayoutListener2);
        this.f143032c = true;
    }

    /* JADX INFO: renamed from: h */
    public final void m164195h() {
        Activity activity = this.f143031b;
        if (activity != null && this.f143032c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f143035f;
            ViewTreeObserver viewTreeObserverM164188f = m164188f(activity);
            if (viewTreeObserverM164188f != null) {
                viewTreeObserverM164188f.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f143032c = false;
        }
    }
}
