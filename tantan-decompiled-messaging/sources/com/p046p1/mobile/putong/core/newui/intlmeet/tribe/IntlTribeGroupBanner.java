package com.p046p1.mobile.putong.core.newui.intlmeet.tribe;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.core.data.TribeSubsetContent;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText_NoTopPadding;
import p149l.bep;
import p149l.oho;
import p149l.qib0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class IntlTribeGroupBanner extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f24264a;

    /* JADX INFO: renamed from: b */
    public VLinear f24265b;

    /* JADX INFO: renamed from: c */
    public VText_NoTopPadding f24266c;

    /* JADX INFO: renamed from: d */
    public VText_NoTopPadding f24267d;

    /* JADX INFO: renamed from: e */
    public VText_NoTopPadding f24268e;

    public IntlTribeGroupBanner(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39446p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m39446p(View view) {
        bep.m101355a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m39447s(TribeSubsetContent tribeSubsetContent, oho ohoVar) {
        if (tribeSubsetContent == null) {
            return;
        }
        qib0.f154691G.m102331L0(this.f24264a, tribeSubsetContent.coverUrl);
        this.f24267d.setText(tribeSubsetContent.title);
        this.f24268e.setText(ohoVar.m164457t0(tribeSubsetContent.totalCount, false));
        xdl0.m208344M(this.f24268e, tribeSubsetContent.totalCount > 1);
        this.f24266c.setText(ohoVar.m164457t0(tribeSubsetContent.currentLikeMe, true));
        xdl0.m208344M(this.f24265b, tribeSubsetContent.currentLikeMe > 0);
    }

    public IntlTribeGroupBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlTribeGroupBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
