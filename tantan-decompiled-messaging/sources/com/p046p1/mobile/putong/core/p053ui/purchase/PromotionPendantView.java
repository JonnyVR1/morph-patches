package com.p046p1.mobile.putong.core.p053ui.purchase;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.vip.widget.LetterRemainingSwitcherView;
import p147v.VText;
import p149l.d3c0;
import p149l.m6c0;
import p149l.o7r;
import p149l.oya0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class PromotionPendantView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f34358a;

    /* JADX INFO: renamed from: b */
    public LetterRemainingSwitcherView f34359b;

    /* JADX INFO: renamed from: c */
    public PurchaseType f34360c;

    /* JADX INFO: renamed from: d */
    public boolean f34361d;

    public PromotionPendantView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34361d = false;
        m53105b(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m53104a(View view) {
        oya0.m166629a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m53105b(Context context) {
        setOrientation(0);
        o7r.m163037a(context).inflate(m6c0.f131664x2, this);
        m53104a(this);
    }

    /* JADX INFO: renamed from: c */
    public void m53106c(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            setVisibility(8);
            return;
        }
        m53107d();
        this.f34359b.m57726i();
        xdl0.m208344M(this.f34359b, false);
        xdl0.m208344M(this.f34358a, true);
        this.f34358a.setText(charSequence);
    }

    /* JADX INFO: renamed from: d */
    public final void m53107d() {
        setBackgroundResource(d3c0.f83834Z5);
    }

    public void setInNewMyTab(boolean z) {
        this.f34361d = z;
    }

    public void setPurchaseType(PurchaseType purchaseType) {
        this.f34360c = purchaseType;
    }

    public PromotionPendantView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PromotionPendantView(Context context) {
        this(context, null);
    }
}
