package com.p051p1.mobile.putong.core.newui.intlmeet.tribe;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.core.data.TribeSubset;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText_NoTopPadding;
import p153l.bnl0;
import p153l.egp;
import p153l.ojo;

/* JADX INFO: loaded from: classes11.dex */
public class IntlTribeItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText_NoTopPadding f25028c;

    /* JADX INFO: renamed from: d */
    public VText_NoTopPadding f25029d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f25030e;

    public IntlTribeItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m40455P(View view) {
        egp.m120794a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m40456Q(TribeSubset tribeSubset, ojo ojoVar) {
        if (tribeSubset == null) {
            return;
        }
        this.f25028c.setText(tribeSubset.mainHead);
        this.f25029d.setText(tribeSubset.subHead);
        bnl0.m105524M(this.f25029d, !TextUtils.isEmpty(tribeSubset.subHead));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40455P(this);
    }

    public IntlTribeItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlTribeItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
