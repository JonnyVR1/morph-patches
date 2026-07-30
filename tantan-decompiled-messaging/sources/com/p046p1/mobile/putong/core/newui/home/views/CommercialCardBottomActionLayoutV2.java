package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.eqh0;
import p149l.rh5;

/* JADX INFO: loaded from: classes11.dex */
public class CommercialCardBottomActionLayoutV2 extends VLinear {

    /* JADX INFO: renamed from: c */
    public CommercialCardBottomActionLayoutV2 f23842c;

    /* JADX INFO: renamed from: d */
    public VImage f23843d;

    /* JADX INFO: renamed from: e */
    public VText f23844e;

    /* JADX INFO: renamed from: f */
    public int f23845f;

    /* JADX INFO: renamed from: g */
    public boolean f23846g;

    /* JADX INFO: renamed from: h */
    public String f23847h;

    /* JADX INFO: renamed from: i */
    public boolean f23848i;

    public CommercialCardBottomActionLayoutV2(Context context) {
        super(context);
        this.f23845f = -1;
        this.f23846g = false;
        this.f23847h = "";
        this.f23848i = false;
    }

    /* JADX INFO: renamed from: P */
    public final void m39139P(View view) {
        rh5.m179328a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39139P(this);
        this.f23844e.setTypeface(eqh0.m117752c(3), 1);
    }

    public CommercialCardBottomActionLayoutV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23845f = -1;
        this.f23846g = false;
        this.f23847h = "";
        this.f23848i = false;
    }

    public CommercialCardBottomActionLayoutV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23845f = -1;
        this.f23846g = false;
        this.f23847h = "";
        this.f23848i = false;
    }
}
