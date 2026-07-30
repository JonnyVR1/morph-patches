package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes13.dex */
public class ael0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f69053a;

    public ael0(View view) {
        this.f69053a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        WindowInsets rootWindowInsets = this.f69053a.getRootWindowInsets();
        if (rootWindowInsets != null && rootWindowInsets.hasSystemWindowInsets() && rootWindowInsets.getSystemWindowInsetTop() != 0) {
            xdl0.f192405g = rootWindowInsets.getSystemWindowInsetTop();
            ViewGroup.LayoutParams layoutParams = this.f69053a.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(this.f69053a.getWidth(), this.f69053a.getHeight());
            }
            layoutParams.height += rootWindowInsets.getSystemWindowInsetTop();
            this.f69053a.setLayoutParams(layoutParams);
        }
        this.f69053a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
