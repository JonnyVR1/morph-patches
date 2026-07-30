package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.d30;
import p149l.eqh0;
import p149l.sh5;

/* JADX INFO: loaded from: classes11.dex */
public class CommercialCardBottomActionLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public CommercialCardBottomActionLayout f23832c;

    /* JADX INFO: renamed from: d */
    public VImage f23833d;

    /* JADX INFO: renamed from: e */
    public VLinear f23834e;

    /* JADX INFO: renamed from: f */
    public VImage f23835f;

    /* JADX INFO: renamed from: g */
    public VText f23836g;

    /* JADX INFO: renamed from: h */
    public int f23837h;

    /* JADX INFO: renamed from: i */
    public boolean f23838i;

    /* JADX INFO: renamed from: j */
    public String f23839j;

    /* JADX INFO: renamed from: k */
    public d30 f23840k;

    /* JADX INFO: renamed from: l */
    public int f23841l;

    public CommercialCardBottomActionLayout(Context context) {
        super(context);
        this.f23837h = -1;
        this.f23838i = false;
        this.f23839j = "";
        this.f23840k = null;
        this.f23841l = -99;
    }

    /* JADX INFO: renamed from: P */
    public final void m39138P(View view) {
        sh5.m184155a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39138P(this);
        this.f23836g.setTypeface(eqh0.m117752c(3), 1);
    }

    public void setUndoClickAction(d30 d30Var) {
        this.f23840k = d30Var;
    }

    public CommercialCardBottomActionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23837h = -1;
        this.f23838i = false;
        this.f23839j = "";
        this.f23840k = null;
        this.f23841l = -99;
    }

    public CommercialCardBottomActionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23837h = -1;
        this.f23838i = false;
        this.f23839j = "";
        this.f23840k = null;
        this.f23841l = -99;
    }
}
