package com.p051p1.mobile.putong.live.external.intl.view.widgets;

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
public class IntlFollowVText extends VFrame {

    /* JADX INFO: renamed from: a */
    public PopupWindow f46572a;

    /* JADX INFO: renamed from: b */
    public Runnable f46573b;

    public IntlFollowVText(Context context) {
        super(context);
        this.f46573b = new Runnable() { // from class: l.ygn
            @Override // java.lang.Runnable
            public final void run() {
                this.f199850a.m71429u();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m71429u() {
        PopupWindow popupWindow = this.f46572a;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        this.f46572a.dismiss();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46573b.run();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m71430v() {
        this.f46572a = null;
    }

    /* JADX INFO: renamed from: w */
    public void m71431w(View view) {
        PopupWindow popupWindow = new PopupWindow(this, -2, -2);
        this.f46572a = popupWindow;
        popupWindow.setOutsideTouchable(true);
        this.f46572a.setBackgroundDrawable(null);
        this.f46572a.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.zgn
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f204325a.m71430v();
            }
        });
        measure(dox.m117364b(qa00.m175859d(166.0f)), dox.m117364b(qa00.m175859d(60.0f)));
        kl80.m150358c(this.f46572a, view, ((-getMeasuredWidth()) / 2) + (view.getWidth() / 2), -(view.getHeight() + getMeasuredHeight()), 48);
        gt0.m132179y(new LinearInterpolator(), 300L, gt0.m132171q(this, "translationY", -getMinimumHeight(), 0.0f), gt0.m132171q(this, "alpha", 0.0f, 1.0f)).start();
        l51.m152888H(getContext(), this.f46573b, 3000L);
    }

    public IntlFollowVText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46573b = new Runnable() { // from class: l.ygn
            @Override // java.lang.Runnable
            public final void run() {
                this.f199850a.m71429u();
            }
        };
    }

    public IntlFollowVText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46573b = new Runnable() { // from class: l.ygn
            @Override // java.lang.Runnable
            public final void run() {
                this.f199850a.m71429u();
            }
        };
    }
}
