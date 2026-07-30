package com.p000p1.mobile.putong.core.newui.intlmeet.tribe;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.putong.core.data.TribeSubsetContent;
import l.bep;
import l.qib0;
import l.xdl0;
import p009l.oho;
import v.VDraweeView;
import v.VFrame;
import v.VLinear;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlTribeGroupBanner extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f3042a;

    /* JADX INFO: renamed from: b */
    public VLinear f3043b;

    /* JADX INFO: renamed from: c */
    public VText_NoTopPadding f3044c;

    /* JADX INFO: renamed from: d */
    public VText_NoTopPadding f3045d;

    /* JADX INFO: renamed from: e */
    public VText_NoTopPadding f3046e;

    public IntlTribeGroupBanner(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3500p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m3500p(View view) {
        bep.a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m3501s(TribeSubsetContent tribeSubsetContent, oho ohoVar) {
        if (tribeSubsetContent == null) {
            return;
        }
        qib0.G.L0(this.f3042a, tribeSubsetContent.coverUrl);
        this.f3045d.setText(tribeSubsetContent.title);
        this.f3046e.setText(ohoVar.m19793t0(tribeSubsetContent.totalCount, false));
        xdl0.M(this.f3046e, tribeSubsetContent.totalCount > 1);
        this.f3044c.setText(ohoVar.m19793t0(tribeSubsetContent.currentLikeMe, true));
        xdl0.M(this.f3043b, tribeSubsetContent.currentLikeMe > 0);
    }

    public IntlTribeGroupBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlTribeGroupBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
