package p149l;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;

/* JADX INFO: loaded from: classes6.dex */
public final class hft0 {

    /* JADX INFO: renamed from: a */
    public final View f107518a;

    /* JADX INFO: renamed from: b */
    public Activity f107519b;

    /* JADX INFO: renamed from: c */
    public boolean f107520c;

    /* JADX INFO: renamed from: d */
    public boolean f107521d;

    /* JADX INFO: renamed from: e */
    public boolean f107522e;

    /* JADX INFO: renamed from: f */
    public final ViewTreeObserver.OnGlobalLayoutListener f107523f;

    public hft0(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f107519b = activity;
        this.f107518a = view;
        this.f107523f = onGlobalLayoutListener;
    }

    /* JADX INFO: renamed from: f */
    public static ViewTreeObserver m130781f(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    /* JADX INFO: renamed from: a */
    public final void m130782a() {
        this.f107522e = false;
        m130788h();
    }

    /* JADX INFO: renamed from: b */
    public final void m130783b() {
        this.f107522e = true;
        if (this.f107521d) {
            m130787g();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m130784c() {
        this.f107521d = true;
        if (this.f107522e) {
            m130787g();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m130785d() {
        this.f107521d = false;
        m130788h();
    }

    /* JADX INFO: renamed from: e */
    public final void m130786e(Activity activity) {
        this.f107519b = activity;
    }

    /* JADX INFO: renamed from: g */
    public final void m130787g() {
        if (this.f107520c) {
            return;
        }
        Activity activity = this.f107519b;
        if (activity != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f107523f;
            ViewTreeObserver viewTreeObserverM130781f = m130781f(activity);
            if (viewTreeObserverM130781f != null) {
                viewTreeObserverM130781f.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        View view = this.f107518a;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.f107523f;
        vny0.m199088z();
        f4t0.m119424a(view, onGlobalLayoutListener2);
        this.f107520c = true;
    }

    /* JADX INFO: renamed from: h */
    public final void m130788h() {
        Activity activity = this.f107519b;
        if (activity != null && this.f107520c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f107523f;
            ViewTreeObserver viewTreeObserverM130781f = m130781f(activity);
            if (viewTreeObserverM130781f != null) {
                viewTreeObserverM130781f.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f107520c = false;
        }
    }
}
