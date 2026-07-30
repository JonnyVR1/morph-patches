package p153l;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes11.dex */
public class cnl0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f82734a;

    public cnl0(View view) {
        this.f82734a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        WindowInsets rootWindowInsets = this.f82734a.getRootWindowInsets();
        if (rootWindowInsets != null && rootWindowInsets.hasSystemWindowInsets() && rootWindowInsets.getSystemWindowInsetTop() != 0) {
            bnl0.f77546g = rootWindowInsets.getSystemWindowInsetTop();
            View view = this.f82734a;
            view.setPadding(view.getPaddingLeft(), this.f82734a.getPaddingTop() + rootWindowInsets.getSystemWindowInsetTop(), this.f82734a.getPaddingRight(), this.f82734a.getPaddingBottom());
        }
        this.f82734a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
