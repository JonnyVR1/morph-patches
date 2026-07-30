package com.p000p1.mobile.putong.core.p001ui.purchase;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.vip.widget.LetterRemainingSwitcherView;
import l.d3c0;
import l.m6c0;
import l.o7r;
import l.oya0;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class PromotionPendantView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f2180a;

    /* JADX INFO: renamed from: b */
    public LetterRemainingSwitcherView f2181b;

    /* JADX INFO: renamed from: c */
    public PurchaseType f2182c;

    /* JADX INFO: renamed from: d */
    public boolean f2183d;

    public PromotionPendantView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2183d = false;
        m3671b(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m3670a(View view) {
        oya0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m3671b(Context context) {
        setOrientation(0);
        o7r.a(context).inflate(m6c0.x2, this);
        m3670a(this);
    }

    /* JADX INFO: renamed from: c */
    public void m3672c(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            setVisibility(8);
            return;
        }
        m3673d();
        this.f2181b.i();
        xdl0.M(this.f2181b, false);
        xdl0.M(this.f2180a, true);
        this.f2180a.setText(charSequence);
    }

    /* JADX INFO: renamed from: d */
    public final void m3673d() {
        setBackgroundResource(d3c0.Z5);
    }

    public void setInNewMyTab(boolean z) {
        this.f2183d = z;
    }

    public void setPurchaseType(PurchaseType purchaseType) {
        this.f2182c = purchaseType;
    }

    public PromotionPendantView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PromotionPendantView(Context context) {
        this(context, null);
    }
}
