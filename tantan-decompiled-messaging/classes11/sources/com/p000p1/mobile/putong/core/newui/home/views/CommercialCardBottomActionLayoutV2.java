package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import l.eqh0;
import l.rh5;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CommercialCardBottomActionLayoutV2 extends VLinear {

    /* JADX INFO: renamed from: c */
    public CommercialCardBottomActionLayoutV2 f2620c;

    /* JADX INFO: renamed from: d */
    public VImage f2621d;

    /* JADX INFO: renamed from: e */
    public VText f2622e;

    /* JADX INFO: renamed from: f */
    public int f2623f;

    /* JADX INFO: renamed from: g */
    public boolean f2624g;

    /* JADX INFO: renamed from: h */
    public String f2625h;

    /* JADX INFO: renamed from: i */
    public boolean f2626i;

    public CommercialCardBottomActionLayoutV2(Context context) {
        super(context);
        this.f2623f = -1;
        this.f2624g = false;
        this.f2625h = "";
        this.f2626i = false;
    }

    /* JADX INFO: renamed from: P */
    public final void m3155P(View view) {
        rh5.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3155P(this);
        this.f2622e.setTypeface(eqh0.c(3), 1);
    }

    public CommercialCardBottomActionLayoutV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2623f = -1;
        this.f2624g = false;
        this.f2625h = "";
        this.f2626i = false;
    }

    public CommercialCardBottomActionLayoutV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2623f = -1;
        this.f2624g = false;
        this.f2625h = "";
        this.f2626i = false;
    }
}
