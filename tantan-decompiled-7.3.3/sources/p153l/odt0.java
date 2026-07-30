package p153l;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public abstract class odt0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f146941a;

    public odt0(View view) {
        this.f146941a = new WeakReference(view);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo157996a(ViewTreeObserver viewTreeObserver);

    /* JADX INFO: renamed from: b */
    public abstract void mo157997b(ViewTreeObserver viewTreeObserver);

    @Nullable
    /* JADX INFO: renamed from: c */
    public final ViewTreeObserver m167340c() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f146941a.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    /* JADX INFO: renamed from: d */
    public final void m167341d() {
        ViewTreeObserver viewTreeObserverM167340c = m167340c();
        if (viewTreeObserverM167340c != null) {
            mo157996a(viewTreeObserverM167340c);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m167342e() {
        ViewTreeObserver viewTreeObserverM167340c = m167340c();
        if (viewTreeObserverM167340c != null) {
            mo157997b(viewTreeObserverM167340c);
        }
    }
}
