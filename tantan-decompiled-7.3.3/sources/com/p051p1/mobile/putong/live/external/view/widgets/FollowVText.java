package com.p051p1.mobile.putong.live.external.view.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.PopupWindow;
import p151v.VFrame;
import p153l.dox;
import p153l.gt0;
import p153l.kl80;
import p153l.l51;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
public class FollowVText extends VFrame {

    /* JADX INFO: renamed from: a */
    public PopupWindow f47093a;

    /* JADX INFO: renamed from: b */
    public Runnable f47094b;

    public FollowVText(Context context) {
        super(context);
        this.f47094b = new Runnable() { // from class: l.wzi
            @Override // java.lang.Runnable
            public final void run() {
                this.f191799a.m72026u();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m72026u() {
        PopupWindow popupWindow = this.f47093a;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        this.f47093a.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m72027v() {
        this.f47093a = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47094b.run();
    }

    /* JADX INFO: renamed from: w */
    public void m72028w(View view) {
        PopupWindow popupWindow = new PopupWindow(this, -2, -2);
        this.f47093a = popupWindow;
        popupWindow.setOutsideTouchable(true);
        this.f47093a.setBackgroundDrawable(null);
        this.f47093a.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.xzi
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f196876a.m72027v();
            }
        });
        measure(dox.m117364b(qa00.m175859d(166.0f)), dox.m117364b(qa00.m175859d(60.0f)));
        kl80.m150358c(this.f47093a, view, ((-getMeasuredWidth()) / 2) + (view.getWidth() / 2), -(view.getHeight() + getMeasuredHeight()), 48);
        gt0.m132179y(new LinearInterpolator(), 300L, gt0.m132171q(this, "translationY", -getMinimumHeight(), 0.0f), gt0.m132171q(this, "alpha", 0.0f, 1.0f)).start();
        l51.m152888H(getContext(), this.f47094b, 3000L);
    }

    public FollowVText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47094b = new Runnable() { // from class: l.wzi
            @Override // java.lang.Runnable
            public final void run() {
                this.f191799a.m72026u();
            }
        };
    }

    public FollowVText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f47094b = new Runnable() { // from class: l.wzi
            @Override // java.lang.Runnable
            public final void run() {
                this.f191799a.m72026u();
            }
        };
    }
}
