package com.hellogroup.p036mk.business.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import p153l.lpj0;

/* JADX INFO: loaded from: classes7.dex */
public class MKResizeListenerLayout extends RelativeLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    private int[] f12345a;

    /* JADX INFO: renamed from: b */
    private int f12346b;

    /* JADX INFO: renamed from: c */
    private int f12347c;

    /* JADX INFO: renamed from: com.hellogroup.mk.business.widget.MKResizeListenerLayout$a */
    public interface InterfaceC3573a {
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.widget.MKResizeListenerLayout$b */
    public interface InterfaceC3574b {
    }

    public MKResizeListenerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12345a = new int[4];
        this.f12347c = lpj0.m155251g();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        int[] iArr = this.f12345a;
        iArr[0] = rect.left;
        iArr[1] = rect.top;
        iArr[2] = rect.right;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        return super.fitSystemWindows(rect);
    }

    public int getKeyboardHeight() {
        return this.f12346b;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.f12345a[0] = windowInsets.getSystemWindowInsetLeft();
        this.f12345a[1] = windowInsets.getSystemWindowInsetTop();
        this.f12345a[2] = windowInsets.getSystemWindowInsetRight();
        return super.onApplyWindowInsets(windowInsets.replaceSystemWindowInsets(0, 0, 0, windowInsets.getSystemWindowInsetBottom()));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        Context context = getContext();
        if (context instanceof Activity) {
            Rect rect = new Rect();
            View decorView = ((Activity) context).getWindow().getDecorView();
            decorView.getWindowVisibleDisplayFrame(rect);
            this.f12346b = decorView.getRootView().getHeight() - rect.bottom;
        }
        if (this.f12346b > 0) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setOnKeyboardHeight(InterfaceC3573a interfaceC3573a) {
    }

    public void setOnResizeListener(InterfaceC3574b interfaceC3574b) {
    }
}
