package p153l;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class eq50 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final View f95303a;

    /* JADX INFO: renamed from: b */
    public ViewTreeObserver f95304b;

    /* JADX INFO: renamed from: c */
    public final Runnable f95305c;

    public eq50(View view, Runnable runnable) {
        this.f95303a = view;
        this.f95304b = view.getViewTreeObserver();
        this.f95305c = runnable;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static eq50 m121892a(@NonNull View view, @NonNull Runnable runnable) {
        if (view == null) {
            mnd0.m159157a("view == null");
            return null;
        }
        if (runnable == null) {
            mnd0.m159157a("runnable == null");
            return null;
        }
        eq50 eq50Var = new eq50(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(eq50Var);
        view.addOnAttachStateChangeListener(eq50Var);
        return eq50Var;
    }

    /* JADX INFO: renamed from: b */
    public void m121893b() {
        if (this.f95304b.isAlive()) {
            this.f95304b.removeOnPreDrawListener(this);
        } else {
            this.f95303a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f95303a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m121893b();
        this.f95305c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NonNull View view) {
        this.f95304b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NonNull View view) {
        m121893b();
    }
}
