package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes11.dex */
public class dnl0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f89814a;

    public dnl0(View view) {
        this.f89814a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WindowInsets rootWindowInsets = this.f89814a.getRootWindowInsets();
        if (rootWindowInsets != null && rootWindowInsets.hasSystemWindowInsets() && rootWindowInsets.getSystemWindowInsetTop() != 0) {
            bnl0.f77546g = rootWindowInsets.getSystemWindowInsetTop();
            try {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f89814a.getLayoutParams();
            } catch (ClassCastException unused) {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(this.f89814a.getWidth(), this.f89814a.getHeight());
            }
            marginLayoutParams.topMargin += rootWindowInsets.getSystemWindowInsetTop();
            this.f89814a.setLayoutParams(marginLayoutParams);
        }
        this.f89814a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
