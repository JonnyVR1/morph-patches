package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.lyh0;
import p153l.si5;
import p153l.x20;

/* JADX INFO: loaded from: classes11.dex */
public class CommercialCardBottomActionLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public CommercialCardBottomActionLayout f24574c;

    /* JADX INFO: renamed from: d */
    public VImage f24575d;

    /* JADX INFO: renamed from: e */
    public VLinear f24576e;

    /* JADX INFO: renamed from: f */
    public VImage f24577f;

    /* JADX INFO: renamed from: g */
    public VText f24578g;

    /* JADX INFO: renamed from: h */
    public int f24579h;

    /* JADX INFO: renamed from: i */
    public boolean f24580i;

    /* JADX INFO: renamed from: j */
    public String f24581j;

    /* JADX INFO: renamed from: k */
    public x20 f24582k;

    /* JADX INFO: renamed from: l */
    public int f24583l;

    public CommercialCardBottomActionLayout(Context context) {
        super(context);
        this.f24579h = -1;
        this.f24580i = false;
        this.f24581j = "";
        this.f24582k = null;
        this.f24583l = -99;
    }

    /* JADX INFO: renamed from: P */
    public final void m40141P(View view) {
        si5.m186002a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40141P(this);
        this.f24578g.setTypeface(lyh0.m156283c(3), 1);
    }

    public void setUndoClickAction(x20 x20Var) {
        this.f24582k = x20Var;
    }

    public CommercialCardBottomActionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24579h = -1;
        this.f24580i = false;
        this.f24581j = "";
        this.f24582k = null;
        this.f24583l = -99;
    }

    public CommercialCardBottomActionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24579h = -1;
        this.f24580i = false;
        this.f24581j = "";
        this.f24582k = null;
        this.f24583l = -99;
    }
}
