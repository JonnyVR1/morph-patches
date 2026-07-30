package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import p151v.VImage;
import p151v.VText;
import p153l.a690;
import p153l.che0;
import p153l.vnb;

/* JADX INFO: loaded from: classes12.dex */
public class SeeLetterBlockPage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f36019a;

    /* JADX INFO: renamed from: b */
    public VImage f36020b;

    /* JADX INFO: renamed from: c */
    public VText f36021c;

    /* JADX INFO: renamed from: d */
    public VText f36022d;

    /* JADX INFO: renamed from: e */
    public boolean f36023e;

    /* JADX INFO: renamed from: f */
    public boolean f36024f;

    /* JADX INFO: renamed from: g */
    public float f36025g;

    public SeeLetterBlockPage(Context context) {
        super(context);
        this.f36023e = vnb.m201957q1();
        this.f36024f = vnb.m201956p1();
        this.f36025g = this.f36023e ? 0.7f : 0.9f;
    }

    /* JADX INFO: renamed from: a */
    public final void m55498a(View view) {
        che0.m109768a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m55499b() {
        this.f36021c.setTextSize(this.f36023e ? 18.0f : 19.0f);
        this.f36022d.setTextSize(this.f36023e ? 12.0f : 13.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f36021c.getLayoutParams();
        marginLayoutParams.topMargin = (int) (marginLayoutParams.topMargin * this.f36025g);
        this.f36021c.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f36022d.getLayoutParams();
        marginLayoutParams2.topMargin = (int) (marginLayoutParams2.topMargin * this.f36025g);
        this.f36022d.setLayoutParams(marginLayoutParams2);
    }

    /* JADX INFO: renamed from: c */
    public void m55500c(Act act, a690 a690Var) {
        if (this.f36023e || this.f36024f) {
            m55499b();
        }
        this.f36021c.setText(a690Var.m96314t());
        this.f36022d.setText(a690Var.m96294d());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55498a(this);
    }

    public SeeLetterBlockPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36023e = vnb.m201957q1();
        this.f36024f = vnb.m201956p1();
        this.f36025g = this.f36023e ? 0.7f : 0.9f;
    }

    public SeeLetterBlockPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36023e = vnb.m201957q1();
        this.f36024f = vnb.m201956p1();
        this.f36025g = this.f36023e ? 0.7f : 0.9f;
    }
}
