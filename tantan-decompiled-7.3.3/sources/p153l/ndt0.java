package p153l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class ndt0 extends odt0 implements ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: b */
    public final WeakReference f141529b;

    public ndt0(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f141529b = new WeakReference(onScrollChangedListener);
    }

    @Override // p153l.odt0
    /* JADX INFO: renamed from: a */
    public final void mo157996a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    @Override // p153l.odt0
    /* JADX INFO: renamed from: b */
    public final void mo157997b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) this.f141529b.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            m167342e();
        }
    }
}
