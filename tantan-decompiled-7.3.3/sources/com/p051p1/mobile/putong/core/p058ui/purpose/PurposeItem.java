package com.p051p1.mobile.putong.core.p058ui.purpose;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText_AutoFit;
import p153l.bnl0;
import p153l.lyh0;
import p153l.p2i0;
import p153l.qa00;
import p153l.ykb0;

/* JADX INFO: loaded from: classes12.dex */
public class PurposeItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public PurposeItem f36161a;

    /* JADX INFO: renamed from: b */
    public VFrame f36162b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f36163c;

    /* JADX INFO: renamed from: d */
    public VImage f36164d;

    /* JADX INFO: renamed from: e */
    public VText_AutoFit f36165e;

    /* JADX INFO: renamed from: f */
    public int f36166f;

    public PurposeItem(Context context) {
        super(context);
        this.f36166f = (bnl0.m105592y0() - qa00.m175859d(112.0f)) / 3;
    }

    public p2i0 getBindViewData() {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55627p(this);
        this.f36165e.setTypeface(lyh0.m156283c(3));
        bnl0.m105507D0(this.f36166f, this.f36161a);
        bnl0.m105505C0(this.f36161a, this.f36166f + qa00.m175859d(23.0f));
        bnl0.m105507D0(this.f36166f, this.f36162b);
        bnl0.m105505C0(this.f36162b, this.f36166f);
    }

    /* JADX INFO: renamed from: p */
    public final void m55627p(View view) {
        ykb0.m216466a(this, view);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f36165e.setSelected(z);
        bnl0.m105525M0(this.f36164d, z);
    }

    public PurposeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36166f = (bnl0.m105592y0() - qa00.m175859d(112.0f)) / 3;
    }

    public PurposeItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36166f = (bnl0.m105592y0() - qa00.m175859d(112.0f)) / 3;
    }

    public void setData(p2i0 p2i0Var) {
    }
}
