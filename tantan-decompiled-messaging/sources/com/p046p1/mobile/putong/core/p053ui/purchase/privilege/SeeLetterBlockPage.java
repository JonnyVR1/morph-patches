package com.p046p1.mobile.putong.core.p053ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import p147v.VImage;
import p147v.VText;
import p149l.hmb;
import p149l.wx80;
import p149l.x8e0;

/* JADX INFO: loaded from: classes9.dex */
public class SeeLetterBlockPage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f35171a;

    /* JADX INFO: renamed from: b */
    public VImage f35172b;

    /* JADX INFO: renamed from: c */
    public VText f35173c;

    /* JADX INFO: renamed from: d */
    public VText f35174d;

    /* JADX INFO: renamed from: e */
    public boolean f35175e;

    /* JADX INFO: renamed from: f */
    public boolean f35176f;

    /* JADX INFO: renamed from: g */
    public float f35177g;

    public SeeLetterBlockPage(Context context) {
        super(context);
        this.f35175e = hmb.m131712q1();
        this.f35176f = hmb.m131711p1();
        this.f35177g = this.f35175e ? 0.7f : 0.9f;
    }

    /* JADX INFO: renamed from: a */
    public final void m54315a(View view) {
        x8e0.m207370a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m54316b() {
        this.f35173c.setTextSize(this.f35175e ? 18.0f : 19.0f);
        this.f35174d.setTextSize(this.f35175e ? 12.0f : 13.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f35173c.getLayoutParams();
        marginLayoutParams.topMargin = (int) (marginLayoutParams.topMargin * this.f35177g);
        this.f35173c.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f35174d.getLayoutParams();
        marginLayoutParams2.topMargin = (int) (marginLayoutParams2.topMargin * this.f35177g);
        this.f35174d.setLayoutParams(marginLayoutParams2);
    }

    /* JADX INFO: renamed from: c */
    public void m54317c(Act act, wx80 wx80Var) {
        if (this.f35175e || this.f35176f) {
            m54316b();
        }
        this.f35173c.setText(wx80Var.m205968t());
        this.f35174d.setText(wx80Var.m205948d());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54315a(this);
    }

    public SeeLetterBlockPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35175e = hmb.m131712q1();
        this.f35176f = hmb.m131711p1();
        this.f35177g = this.f35175e ? 0.7f : 0.9f;
    }

    public SeeLetterBlockPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35175e = hmb.m131712q1();
        this.f35176f = hmb.m131711p1();
        this.f35177g = this.f35175e ? 0.7f : 0.9f;
    }
}
