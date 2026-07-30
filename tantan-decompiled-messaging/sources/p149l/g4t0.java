package p149l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class g4t0 extends i4t0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: b */
    public final WeakReference f100588b;

    public g4t0(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f100588b = new WeakReference(onGlobalLayoutListener);
    }

    @Override // p149l.i4t0
    /* JADX INFO: renamed from: a */
    public final void mo124400a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    @Override // p149l.i4t0
    /* JADX INFO: renamed from: b */
    public final void mo124401b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.f100588b.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            m134392e();
        }
    }
}
