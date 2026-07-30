package com.p000p1.mobile.putong.core.newui.intlmeet.tribe;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.putong.core.data.TribeSubset;
import l.eep;
import l.xdl0;
import p009l.oho;
import v.VLinear;
import v.VRecyclerView;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlTribeItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText_NoTopPadding f3064c;

    /* JADX INFO: renamed from: d */
    public VText_NoTopPadding f3065d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f3066e;

    public IntlTribeItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m3506P(View view) {
        eep.a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m3507Q(TribeSubset tribeSubset, oho ohoVar) {
        if (tribeSubset == null) {
            return;
        }
        this.f3064c.setText(tribeSubset.mainHead);
        this.f3065d.setText(tribeSubset.subHead);
        xdl0.M(this.f3065d, !TextUtils.isEmpty(tribeSubset.subHead));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3506P(this);
    }

    public IntlTribeItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlTribeItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
