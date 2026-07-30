package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.android.app.Act;
import l.hmb;
import l.x8e0;
import p006l.wx80;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SeeLetterBlockPage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f4952a;

    /* JADX INFO: renamed from: b */
    public VImage f4953b;

    /* JADX INFO: renamed from: c */
    public VText f4954c;

    /* JADX INFO: renamed from: d */
    public VText f4955d;

    /* JADX INFO: renamed from: e */
    public boolean f4956e;

    /* JADX INFO: renamed from: f */
    public boolean f4957f;

    /* JADX INFO: renamed from: g */
    public float f4958g;

    public SeeLetterBlockPage(Context context) {
        super(context);
        this.f4956e = hmb.q1();
        this.f4957f = hmb.p1();
        this.f4958g = this.f4956e ? 0.7f : 0.9f;
    }

    /* JADX INFO: renamed from: a */
    public final void m7650a(View view) {
        x8e0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m7651b() {
        this.f4954c.setTextSize(this.f4956e ? 18.0f : 19.0f);
        this.f4955d.setTextSize(this.f4956e ? 12.0f : 13.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4954c.getLayoutParams();
        marginLayoutParams.topMargin = (int) (marginLayoutParams.topMargin * this.f4958g);
        this.f4954c.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f4955d.getLayoutParams();
        marginLayoutParams2.topMargin = (int) (marginLayoutParams2.topMargin * this.f4958g);
        this.f4955d.setLayoutParams(marginLayoutParams2);
    }

    /* JADX INFO: renamed from: c */
    public void m7652c(Act act, wx80 wx80Var) {
        if (this.f4956e || this.f4957f) {
            m7651b();
        }
        this.f4954c.setText(wx80Var.m26849t());
        this.f4955d.setText(wx80Var.m26829d());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7650a(this);
    }

    public SeeLetterBlockPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4956e = hmb.q1();
        this.f4957f = hmb.p1();
        this.f4958g = this.f4956e ? 0.7f : 0.9f;
    }

    public SeeLetterBlockPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4956e = hmb.q1();
        this.f4957f = hmb.p1();
        this.f4958g = this.f4956e ? 0.7f : 0.9f;
    }
}
