package com.p046p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveEntranceSummary;
import com.p046p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.hxs;
import p149l.osn;
import p149l.oun;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveEntranceStartLiveView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f45787c;

    /* JADX INFO: renamed from: d */
    public VText f45788d;

    public IntlLiveEntranceStartLiveView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m70331P(View view) {
        oun.m166086a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m70332Q(osn osnVar, BLiveEntranceSummary bLiveEntranceSummary) {
        if (!TextUtils.isEmpty(bLiveEntranceSummary.title)) {
            this.f45788d.setText(bLiveEntranceSummary.title);
        }
        hxs.m133406s("context_square", this.f45787c, bLiveEntranceSummary.icon);
        osnVar.m165861L3();
        osnVar.m165854D3(BLiveUnreadTypeEnum.get("unknown_"), 0);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70331P(this);
    }

    public IntlLiveEntranceStartLiveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveEntranceStartLiveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
