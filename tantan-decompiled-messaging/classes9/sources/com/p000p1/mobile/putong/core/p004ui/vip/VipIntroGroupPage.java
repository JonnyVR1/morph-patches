package com.p000p1.mobile.putong.core.p004ui.vip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import l.lhl0;
import p006l.wx80;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VipIntroGroupPage extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f6767a;

    /* JADX INFO: renamed from: b */
    public ImageView f6768b;

    /* JADX INFO: renamed from: c */
    public VImage f6769c;

    /* JADX INFO: renamed from: d */
    public VText f6770d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f6771e;

    /* JADX INFO: renamed from: f */
    public ImageView f6772f;

    /* JADX INFO: renamed from: g */
    public VImage f6773g;

    /* JADX INFO: renamed from: h */
    public ImageView f6774h;

    /* JADX INFO: renamed from: i */
    public VText f6775i;

    public VipIntroGroupPage(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m9680a(View view) {
        lhl0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m9681b(wx80 wx80Var) {
        this.f6770d.setText(wx80Var.m26849t());
        this.f6775i.setText(wx80Var.m26845p());
        int iM26839j = wx80Var.m26839j();
        ImageView imageView = this.f6768b;
        if (iM26839j != 0) {
            imageView.setVisibility(0);
            this.f6768b.setImageResource(wx80Var.m26839j());
        } else {
            imageView.setVisibility(8);
        }
        int iM26838i = wx80Var.m26838i();
        VImage vImage = this.f6769c;
        if (iM26838i != 0) {
            vImage.setImageResource(wx80Var.m26838i());
            this.f6769c.setVisibility(0);
        } else {
            vImage.setVisibility(8);
        }
        int iM26844o = wx80Var.m26844o();
        VImage vImage2 = this.f6773g;
        if (iM26844o != 0) {
            vImage2.setVisibility(0);
            this.f6773g.setImageResource(wx80Var.m26844o());
        } else {
            vImage2.setVisibility(8);
        }
        int iM26843n = wx80Var.m26843n();
        ImageView imageView2 = this.f6774h;
        if (iM26843n == 0) {
            imageView2.setVisibility(8);
        } else {
            imageView2.setVisibility(0);
            this.f6774h.setImageResource(wx80Var.m26843n());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9680a(this);
    }

    public VipIntroGroupPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VipIntroGroupPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
