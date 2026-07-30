package com.p046p1.mobile.putong.core.p053ui.vip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import p147v.VImage;
import p147v.VText;
import p149l.lhl0;
import p149l.wx80;

/* JADX INFO: loaded from: classes9.dex */
public class VipIntroGroupPage extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f36986a;

    /* JADX INFO: renamed from: b */
    public ImageView f36987b;

    /* JADX INFO: renamed from: c */
    public VImage f36988c;

    /* JADX INFO: renamed from: d */
    public VText f36989d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f36990e;

    /* JADX INFO: renamed from: f */
    public ImageView f36991f;

    /* JADX INFO: renamed from: g */
    public VImage f36992g;

    /* JADX INFO: renamed from: h */
    public ImageView f36993h;

    /* JADX INFO: renamed from: i */
    public VText f36994i;

    public VipIntroGroupPage(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m56246a(View view) {
        lhl0.m149846a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m56247b(wx80 wx80Var) {
        this.f36989d.setText(wx80Var.m205968t());
        this.f36994i.setText(wx80Var.m205964p());
        int iM205958j = wx80Var.m205958j();
        ImageView imageView = this.f36987b;
        if (iM205958j != 0) {
            imageView.setVisibility(0);
            this.f36987b.setImageResource(wx80Var.m205958j());
        } else {
            imageView.setVisibility(8);
        }
        int iM205957i = wx80Var.m205957i();
        VImage vImage = this.f36988c;
        if (iM205957i != 0) {
            vImage.setImageResource(wx80Var.m205957i());
            this.f36988c.setVisibility(0);
        } else {
            vImage.setVisibility(8);
        }
        int iM205963o = wx80Var.m205963o();
        VImage vImage2 = this.f36992g;
        if (iM205963o != 0) {
            vImage2.setVisibility(0);
            this.f36992g.setImageResource(wx80Var.m205963o());
        } else {
            vImage2.setVisibility(8);
        }
        int iM205962n = wx80Var.m205962n();
        ImageView imageView2 = this.f36993h;
        if (iM205962n == 0) {
            imageView2.setVisibility(8);
        } else {
            imageView2.setVisibility(0);
            this.f36993h.setImageResource(wx80Var.m205962n());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56246a(this);
    }

    public VipIntroGroupPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VipIntroGroupPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
