package p149l;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes13.dex */
public class ydl0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f197573a;

    public ydl0(View view) {
        this.f197573a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        WindowInsets rootWindowInsets = this.f197573a.getRootWindowInsets();
        if (rootWindowInsets != null && rootWindowInsets.hasSystemWindowInsets() && rootWindowInsets.getSystemWindowInsetTop() != 0) {
            xdl0.f192405g = rootWindowInsets.getSystemWindowInsetTop();
            View view = this.f197573a;
            view.setPadding(view.getPaddingLeft(), this.f197573a.getPaddingTop() + rootWindowInsets.getSystemWindowInsetTop(), this.f197573a.getPaddingRight(), this.f197573a.getPaddingBottom());
        }
        this.f197573a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
