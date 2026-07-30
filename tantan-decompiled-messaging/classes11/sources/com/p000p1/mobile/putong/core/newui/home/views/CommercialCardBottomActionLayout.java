package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import l.d30;
import l.eqh0;
import l.sh5;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CommercialCardBottomActionLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public CommercialCardBottomActionLayout f2610c;

    /* JADX INFO: renamed from: d */
    public VImage f2611d;

    /* JADX INFO: renamed from: e */
    public VLinear f2612e;

    /* JADX INFO: renamed from: f */
    public VImage f2613f;

    /* JADX INFO: renamed from: g */
    public VText f2614g;

    /* JADX INFO: renamed from: h */
    public int f2615h;

    /* JADX INFO: renamed from: i */
    public boolean f2616i;

    /* JADX INFO: renamed from: j */
    public String f2617j;

    /* JADX INFO: renamed from: k */
    public d30 f2618k;

    /* JADX INFO: renamed from: l */
    public int f2619l;

    public CommercialCardBottomActionLayout(Context context) {
        super(context);
        this.f2615h = -1;
        this.f2616i = false;
        this.f2617j = "";
        this.f2618k = null;
        this.f2619l = -99;
    }

    /* JADX INFO: renamed from: P */
    public final void m3154P(View view) {
        sh5.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3154P(this);
        this.f2614g.setTypeface(eqh0.c(3), 1);
    }

    public void setUndoClickAction(d30 d30Var) {
        this.f2618k = d30Var;
    }

    public CommercialCardBottomActionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2615h = -1;
        this.f2616i = false;
        this.f2617j = "";
        this.f2618k = null;
        this.f2619l = -99;
    }

    public CommercialCardBottomActionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2615h = -1;
        this.f2616i = false;
        this.f2617j = "";
        this.f2618k = null;
        this.f2619l = -99;
    }
}
