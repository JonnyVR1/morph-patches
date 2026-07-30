package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes13.dex */
public class zdl0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f202675a;

    public zdl0(View view) {
        this.f202675a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WindowInsets rootWindowInsets = this.f202675a.getRootWindowInsets();
        if (rootWindowInsets != null && rootWindowInsets.hasSystemWindowInsets() && rootWindowInsets.getSystemWindowInsetTop() != 0) {
            xdl0.f192405g = rootWindowInsets.getSystemWindowInsetTop();
            try {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f202675a.getLayoutParams();
            } catch (ClassCastException unused) {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(this.f202675a.getWidth(), this.f202675a.getHeight());
            }
            marginLayoutParams.topMargin += rootWindowInsets.getSystemWindowInsetTop();
            this.f202675a.setLayoutParams(marginLayoutParams);
        }
        this.f202675a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
