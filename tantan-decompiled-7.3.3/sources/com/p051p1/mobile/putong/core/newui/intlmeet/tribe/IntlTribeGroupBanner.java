package com.p051p1.mobile.putong.core.newui.intlmeet.tribe;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.core.data.TribeSubsetContent;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText_NoTopPadding;
import p153l.bgp;
import p153l.bnl0;
import p153l.ojo;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class IntlTribeGroupBanner extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f25006a;

    /* JADX INFO: renamed from: b */
    public VLinear f25007b;

    /* JADX INFO: renamed from: c */
    public VText_NoTopPadding f25008c;

    /* JADX INFO: renamed from: d */
    public VText_NoTopPadding f25009d;

    /* JADX INFO: renamed from: e */
    public VText_NoTopPadding f25010e;

    public IntlTribeGroupBanner(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40449p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m40449p(View view) {
        bgp.m104235a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m40450s(TribeSubsetContent tribeSubsetContent, ojo ojoVar) {
        if (tribeSubsetContent == null) {
            return;
        }
        uqb0.f180374G.m127115L0(this.f25006a, tribeSubsetContent.coverUrl);
        this.f25009d.setText(tribeSubsetContent.title);
        this.f25010e.setText(ojoVar.m167897t0(tribeSubsetContent.totalCount, false));
        bnl0.m105524M(this.f25010e, tribeSubsetContent.totalCount > 1);
        this.f25008c.setText(ojoVar.m167897t0(tribeSubsetContent.currentLikeMe, true));
        bnl0.m105524M(this.f25007b, tribeSubsetContent.currentLikeMe > 0);
    }

    public IntlTribeGroupBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlTribeGroupBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
