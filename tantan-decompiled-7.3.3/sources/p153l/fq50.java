package p153l;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes10.dex */
public class fq50 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final View f100247a;

    /* JADX INFO: renamed from: b */
    public ViewTreeObserver f100248b;

    /* JADX INFO: renamed from: c */
    public final Runnable f100249c;

    public fq50(View view, Runnable runnable) {
        this.f100247a = view;
        this.f100248b = view.getViewTreeObserver();
        this.f100249c = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static fq50 m126731a(View view, Runnable runnable) {
        if (view == null) {
            mnd0.m159157a("view == null");
            return null;
        }
        if (runnable == null) {
            mnd0.m159157a("runnable == null");
            return null;
        }
        fq50 fq50Var = new fq50(view, runnable);
        view.getViewTreeObserver().addOnGlobalLayoutListener(fq50Var);
        return fq50Var;
    }

    /* JADX INFO: renamed from: b */
    public void m126732b() {
        if (this.f100248b.isAlive()) {
            this.f100248b.removeOnGlobalLayoutListener(this);
        } else {
            this.f100247a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m126733c() {
        if (this.f100248b.isAlive()) {
            this.f100248b.removeOnPreDrawListener(this);
        } else {
            this.f100247a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        m126732b();
        this.f100249c.run();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m126733c();
        this.f100249c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f100248b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m126733c();
        m126732b();
    }
}
