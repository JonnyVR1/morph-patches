package com.p046p1.mobile.putong.live.external.intl.view.widgets;

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
public class IntlFollowVText extends VFrame {

    /* JADX INFO: renamed from: a */
    public PopupWindow f45724a;

    /* JADX INFO: renamed from: b */
    public Runnable f45725b;

    public IntlFollowVText(Context context) {
        super(context);
        this.f45725b = new Runnable() { // from class: l.yen
            @Override // java.lang.Runnable
            public final void run() {
                this.f197698a.m70246u();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m70246u() {
        PopupWindow popupWindow = this.f45724a;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        this.f45724a.dismiss();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45725b.run();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m70247v() {
        this.f45724a = null;
    }

    /* JADX INFO: renamed from: w */
    public void m70248w(View view) {
        PopupWindow popupWindow = new PopupWindow(this, -2, -2);
        this.f45724a = popupWindow;
        popupWindow.setOutsideTouchable(true);
        this.f45724a.setBackgroundDrawable(null);
        this.f45724a.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.zen
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f202852a.m70247v();
            }
        });
        measure(ffx.m121199b(t100.m186890d(166.0f)), ffx.m121199b(t100.m186890d(60.0f)));
        ed80.m115791c(this.f45724a, view, ((-getMeasuredWidth()) / 2) + (view.getWidth() / 2), -(view.getHeight() + getMeasuredHeight()), 48);
        bt0.m103752y(new LinearInterpolator(), 300L, bt0.m103744q(this, "translationY", -getMinimumHeight(), 0.0f), bt0.m103744q(this, "alpha", 0.0f, 1.0f)).start();
        e51.m114743H(getContext(), this.f45725b, 3000L);
    }

    public IntlFollowVText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45725b = new Runnable() { // from class: l.yen
            @Override // java.lang.Runnable
            public final void run() {
                this.f197698a.m70246u();
            }
        };
    }

    public IntlFollowVText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45725b = new Runnable() { // from class: l.yen
            @Override // java.lang.Runnable
            public final void run() {
                this.f197698a.m70246u();
            }
        };
    }
}
