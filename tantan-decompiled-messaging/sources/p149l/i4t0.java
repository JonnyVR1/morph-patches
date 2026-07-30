package p149l;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i4t0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f111480a;

    public i4t0(View view) {
        this.f111480a = new WeakReference(view);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo124400a(ViewTreeObserver viewTreeObserver);

    /* JADX INFO: renamed from: b */
    public abstract void mo124401b(ViewTreeObserver viewTreeObserver);

    @Nullable
    /* JADX INFO: renamed from: c */
    public final ViewTreeObserver m134390c() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f111480a.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    /* JADX INFO: renamed from: d */
    public final void m134391d() {
        ViewTreeObserver viewTreeObserverM134390c = m134390c();
        if (viewTreeObserverM134390c != null) {
            mo124400a(viewTreeObserverM134390c);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m134392e() {
        ViewTreeObserver viewTreeObserverM134390c = m134390c();
        if (viewTreeObserverM134390c != null) {
            mo124401b(viewTreeObserverM134390c);
        }
    }
}
