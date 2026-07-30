package p009l;

import android.view.View;
import android.view.ViewTreeObserver;
import l.jfd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zh50 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final View f23660a;

    /* JADX INFO: renamed from: b */
    public ViewTreeObserver f23661b;

    /* JADX INFO: renamed from: c */
    public final Runnable f23662c;

    public zh50(View view, Runnable runnable) {
        this.f23660a = view;
        this.f23661b = view.getViewTreeObserver();
        this.f23662c = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static zh50 m25768a(View view, Runnable runnable) {
        if (view == null) {
            jfd0.a("view == null");
            return null;
        }
        if (runnable == null) {
            jfd0.a("runnable == null");
            return null;
        }
        zh50 zh50Var = new zh50(view, runnable);
        view.getViewTreeObserver().addOnGlobalLayoutListener(zh50Var);
        return zh50Var;
    }

    /* JADX INFO: renamed from: b */
    public void m25769b() {
        if (this.f23661b.isAlive()) {
            this.f23661b.removeOnGlobalLayoutListener(this);
        } else {
            this.f23660a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m25770c() {
        if (this.f23661b.isAlive()) {
            this.f23661b.removeOnPreDrawListener(this);
        } else {
            this.f23660a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        m25769b();
        this.f23662c.run();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m25770c();
        this.f23662c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f23661b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m25770c();
        m25769b();
    }
}
