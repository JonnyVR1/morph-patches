package p149l;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes11.dex */
public class zh50 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final View f203134a;

    /* JADX INFO: renamed from: b */
    public ViewTreeObserver f203135b;

    /* JADX INFO: renamed from: c */
    public final Runnable f203136c;

    public zh50(View view, Runnable runnable) {
        this.f203134a = view;
        this.f203135b = view.getViewTreeObserver();
        this.f203136c = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static zh50 m218766a(View view, Runnable runnable) {
        if (view == null) {
            jfd0.m141176a("view == null");
            return null;
        }
        if (runnable == null) {
            jfd0.m141176a("runnable == null");
            return null;
        }
        zh50 zh50Var = new zh50(view, runnable);
        view.getViewTreeObserver().addOnGlobalLayoutListener(zh50Var);
        return zh50Var;
    }

    /* JADX INFO: renamed from: b */
    public void m218767b() {
        if (this.f203135b.isAlive()) {
            this.f203135b.removeOnGlobalLayoutListener(this);
        } else {
            this.f203134a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m218768c() {
        if (this.f203135b.isAlive()) {
            this.f203135b.removeOnPreDrawListener(this);
        } else {
            this.f203134a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        m218767b();
        this.f203136c.run();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m218768c();
        this.f203136c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f203135b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m218768c();
        m218767b();
    }
}
