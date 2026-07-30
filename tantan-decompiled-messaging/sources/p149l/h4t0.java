package p149l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class h4t0 extends i4t0 implements ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: b */
    public final WeakReference f105876b;

    public h4t0(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f105876b = new WeakReference(onScrollChangedListener);
    }

    @Override // p149l.i4t0
    /* JADX INFO: renamed from: a */
    public final void mo124400a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    @Override // p149l.i4t0
    /* JADX INFO: renamed from: b */
    public final void mo124401b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) this.f105876b.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            m134392e();
        }
    }
}
