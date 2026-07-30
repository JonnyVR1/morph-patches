package com.p051p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveEntranceSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.izs;
import p153l.oun;
import p153l.own;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveEntranceStartLiveView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f46635c;

    /* JADX INFO: renamed from: d */
    public VText f46636d;

    public IntlLiveEntranceStartLiveView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m71514P(View view) {
        own.m169598a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m71515Q(oun ounVar, BLiveEntranceSummary bLiveEntranceSummary) {
        if (!TextUtils.isEmpty(bLiveEntranceSummary.title)) {
            this.f46636d.setText(bLiveEntranceSummary.title);
        }
        izs.m142868s("context_square", this.f46635c, bLiveEntranceSummary.icon);
        ounVar.m169355L3();
        ounVar.m169348D3(BLiveUnreadTypeEnum.get("unknown_"), 0);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71514P(this);
    }

    public IntlLiveEntranceStartLiveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveEntranceStartLiveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
