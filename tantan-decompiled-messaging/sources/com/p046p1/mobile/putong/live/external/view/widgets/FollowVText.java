package com.p046p1.mobile.putong.live.external.view.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.PopupWindow;
import p147v.VFrame;
import p149l.bt0;
import p149l.e51;
import p149l.ed80;
import p149l.ffx;
import p149l.t100;

/* JADX INFO: loaded from: classes13.dex */
public class FollowVText extends VFrame {

    /* JADX INFO: renamed from: a */
    public PopupWindow f46245a;

    /* JADX INFO: renamed from: b */
    public Runnable f46246b;

    public FollowVText(Context context) {
        super(context);
        this.f46246b = new Runnable() { // from class: l.axi
            @Override // java.lang.Runnable
            public final void run() {
                this.f72186a.m70843u();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m70843u() {
        PopupWindow popupWindow = this.f46245a;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        this.f46245a.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m70844v() {
        this.f46245a = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46246b.run();
    }

    /* JADX INFO: renamed from: w */
    public void m70845w(View view) {
        PopupWindow popupWindow = new PopupWindow(this, -2, -2);
        this.f46245a = popupWindow;
        popupWindow.setOutsideTouchable(true);
        this.f46245a.setBackgroundDrawable(null);
        this.f46245a.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.bxi
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f77793a.m70844v();
            }
        });
        measure(ffx.m121199b(t100.m186890d(166.0f)), ffx.m121199b(t100.m186890d(60.0f)));
        ed80.m115791c(this.f46245a, view, ((-getMeasuredWidth()) / 2) + (view.getWidth() / 2), -(view.getHeight() + getMeasuredHeight()), 48);
        bt0.m103752y(new LinearInterpolator(), 300L, bt0.m103744q(this, "translationY", -getMinimumHeight(), 0.0f), bt0.m103744q(this, "alpha", 0.0f, 1.0f)).start();
        e51.m114743H(getContext(), this.f46246b, 3000L);
    }

    public FollowVText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46246b = new Runnable() { // from class: l.axi
            @Override // java.lang.Runnable
            public final void run() {
                this.f72186a.m70843u();
            }
        };
    }

    public FollowVText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46246b = new Runnable() { // from class: l.axi
            @Override // java.lang.Runnable
            public final void run() {
                this.f72186a.m70843u();
            }
        };
    }
}
