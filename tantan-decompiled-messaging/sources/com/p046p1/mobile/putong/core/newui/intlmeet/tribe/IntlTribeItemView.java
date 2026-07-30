package com.p046p1.mobile.putong.core.newui.intlmeet.tribe;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.core.data.TribeSubset;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText_NoTopPadding;
import p149l.eep;
import p149l.oho;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class IntlTribeItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText_NoTopPadding f24286c;

    /* JADX INFO: renamed from: d */
    public VText_NoTopPadding f24287d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f24288e;

    public IntlTribeItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m39452P(View view) {
        eep.m115986a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m39453Q(TribeSubset tribeSubset, oho ohoVar) {
        if (tribeSubset == null) {
            return;
        }
        this.f24286c.setText(tribeSubset.mainHead);
        this.f24287d.setText(tribeSubset.subHead);
        xdl0.m208344M(this.f24287d, !TextUtils.isEmpty(tribeSubset.subHead));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39452P(this);
    }

    public IntlTribeItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlTribeItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
