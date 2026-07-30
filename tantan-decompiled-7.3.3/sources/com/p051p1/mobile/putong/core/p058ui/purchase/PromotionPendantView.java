package com.p051p1.mobile.putong.core.p058ui.purchase;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.widget.LetterRemainingSwitcherView;
import p151v.VText;
import p153l.bnl0;
import p153l.jbc0;
import p153l.p9r;
import p153l.rec0;
import p153l.s6b0;

/* JADX INFO: loaded from: classes4.dex */
public class PromotionPendantView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f35206a;

    /* JADX INFO: renamed from: b */
    public LetterRemainingSwitcherView f35207b;

    /* JADX INFO: renamed from: c */
    public PurchaseType f35208c;

    /* JADX INFO: renamed from: d */
    public boolean f35209d;

    public PromotionPendantView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35209d = false;
        m54288b(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m54287a(View view) {
        s6b0.m184881a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m54288b(Context context) {
        setOrientation(0);
        p9r.m171370a(context).inflate(rec0.f162624x2, this);
        m54287a(this);
    }

    /* JADX INFO: renamed from: c */
    public void m54289c(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            setVisibility(8);
            return;
        }
        m54290d();
        this.f35207b.m58909i();
        bnl0.m105524M(this.f35207b, false);
        bnl0.m105524M(this.f35206a, true);
        this.f35206a.setText(charSequence);
    }

    /* JADX INFO: renamed from: d */
    public final void m54290d() {
        setBackgroundResource(jbc0.f119489Z5);
    }

    public void setInNewMyTab(boolean z) {
        this.f35209d = z;
    }

    public void setPurchaseType(PurchaseType purchaseType) {
        this.f35208c = purchaseType;
    }

    public PromotionPendantView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PromotionPendantView(Context context) {
        this(context, null);
    }
}
