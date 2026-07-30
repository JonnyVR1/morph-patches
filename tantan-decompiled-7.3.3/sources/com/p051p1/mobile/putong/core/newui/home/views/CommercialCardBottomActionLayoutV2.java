package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.lyh0;
import p153l.ri5;

/* JADX INFO: loaded from: classes11.dex */
public class CommercialCardBottomActionLayoutV2 extends VLinear {

    /* JADX INFO: renamed from: c */
    public CommercialCardBottomActionLayoutV2 f24584c;

    /* JADX INFO: renamed from: d */
    public VImage f24585d;

    /* JADX INFO: renamed from: e */
    public VText f24586e;

    /* JADX INFO: renamed from: f */
    public int f24587f;

    /* JADX INFO: renamed from: g */
    public boolean f24588g;

    /* JADX INFO: renamed from: h */
    public String f24589h;

    /* JADX INFO: renamed from: i */
    public boolean f24590i;

    public CommercialCardBottomActionLayoutV2(Context context) {
        super(context);
        this.f24587f = -1;
        this.f24588g = false;
        this.f24589h = "";
        this.f24590i = false;
    }

    /* JADX INFO: renamed from: P */
    public final void m40142P(View view) {
        ri5.m181575a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40142P(this);
        this.f24586e.setTypeface(lyh0.m156283c(3), 1);
    }

    public CommercialCardBottomActionLayoutV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24587f = -1;
        this.f24588g = false;
        this.f24589h = "";
        this.f24590i = false;
    }

    public CommercialCardBottomActionLayoutV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24587f = -1;
        this.f24588g = false;
        this.f24589h = "";
        this.f24590i = false;
    }
}
