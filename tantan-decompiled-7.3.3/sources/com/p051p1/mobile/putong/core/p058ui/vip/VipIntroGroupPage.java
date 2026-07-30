package com.p051p1.mobile.putong.core.p058ui.vip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import p151v.VImage;
import p151v.VText;
import p153l.a690;
import p153l.pql0;

/* JADX INFO: loaded from: classes12.dex */
public class VipIntroGroupPage extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f37834a;

    /* JADX INFO: renamed from: b */
    public ImageView f37835b;

    /* JADX INFO: renamed from: c */
    public VImage f37836c;

    /* JADX INFO: renamed from: d */
    public VText f37837d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f37838e;

    /* JADX INFO: renamed from: f */
    public ImageView f37839f;

    /* JADX INFO: renamed from: g */
    public VImage f37840g;

    /* JADX INFO: renamed from: h */
    public ImageView f37841h;

    /* JADX INFO: renamed from: i */
    public VText f37842i;

    public VipIntroGroupPage(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m57429a(View view) {
        pql0.m173359a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m57430b(a690 a690Var) {
        this.f37837d.setText(a690Var.m96314t());
        this.f37842i.setText(a690Var.m96310p());
        int iM96304j = a690Var.m96304j();
        ImageView imageView = this.f37835b;
        if (iM96304j != 0) {
            imageView.setVisibility(0);
            this.f37835b.setImageResource(a690Var.m96304j());
        } else {
            imageView.setVisibility(8);
        }
        int iM96303i = a690Var.m96303i();
        VImage vImage = this.f37836c;
        if (iM96303i != 0) {
            vImage.setImageResource(a690Var.m96303i());
            this.f37836c.setVisibility(0);
        } else {
            vImage.setVisibility(8);
        }
        int iM96309o = a690Var.m96309o();
        VImage vImage2 = this.f37840g;
        if (iM96309o != 0) {
            vImage2.setVisibility(0);
            this.f37840g.setImageResource(a690Var.m96309o());
        } else {
            vImage2.setVisibility(8);
        }
        int iM96308n = a690Var.m96308n();
        ImageView imageView2 = this.f37841h;
        if (iM96308n == 0) {
            imageView2.setVisibility(8);
        } else {
            imageView2.setVisibility(0);
            this.f37841h.setImageResource(a690Var.m96308n());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57429a(this);
    }

    public VipIntroGroupPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VipIntroGroupPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
