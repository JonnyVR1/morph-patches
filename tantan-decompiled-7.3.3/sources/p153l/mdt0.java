package p153l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class mdt0 extends odt0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: b */
    public final WeakReference f136410b;

    public mdt0(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f136410b = new WeakReference(onGlobalLayoutListener);
    }

    @Override // p153l.odt0
    /* JADX INFO: renamed from: a */
    public final void mo157996a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    @Override // p153l.odt0
    /* JADX INFO: renamed from: b */
    public final void mo157997b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.f136410b.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            m167342e();
        }
    }
}
