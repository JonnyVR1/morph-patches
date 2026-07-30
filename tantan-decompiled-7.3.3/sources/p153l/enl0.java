package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes11.dex */
public class enl0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f94795a;

    public enl0(View view) {
        this.f94795a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        WindowInsets rootWindowInsets = this.f94795a.getRootWindowInsets();
        if (rootWindowInsets != null && rootWindowInsets.hasSystemWindowInsets() && rootWindowInsets.getSystemWindowInsetTop() != 0) {
            bnl0.f77546g = rootWindowInsets.getSystemWindowInsetTop();
            ViewGroup.LayoutParams layoutParams = this.f94795a.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(this.f94795a.getWidth(), this.f94795a.getHeight());
            }
            layoutParams.height += rootWindowInsets.getSystemWindowInsetTop();
            this.f94795a.setLayoutParams(layoutParams);
        }
        this.f94795a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
