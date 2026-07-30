package p149l;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class yh50 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final View f198273a;

    /* JADX INFO: renamed from: b */
    public ViewTreeObserver f198274b;

    /* JADX INFO: renamed from: c */
    public final Runnable f198275c;

    public yh50(View view, Runnable runnable) {
        this.f198273a = view;
        this.f198274b = view.getViewTreeObserver();
        this.f198275c = runnable;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static yh50 m214787a(@NonNull View view, @NonNull Runnable runnable) {
        if (view == null) {
            jfd0.m141176a("view == null");
            return null;
        }
        if (runnable == null) {
            jfd0.m141176a("runnable == null");
            return null;
        }
        yh50 yh50Var = new yh50(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(yh50Var);
        view.addOnAttachStateChangeListener(yh50Var);
        return yh50Var;
    }

    /* JADX INFO: renamed from: b */
    public void m214788b() {
        if (this.f198274b.isAlive()) {
            this.f198274b.removeOnPreDrawListener(this);
        } else {
            this.f198273a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f198273a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m214788b();
        this.f198275c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NonNull View view) {
        this.f198274b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NonNull View view) {
        m214788b();
    }
}
