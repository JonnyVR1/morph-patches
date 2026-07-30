package com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import l.hxs;
import l.ipn;
import l.rqo0;
import l.xdl0;
import l.ym2;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceSweetHouseItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f7211a;

    /* JADX INFO: renamed from: b */
    public VText f7212b;

    /* JADX INFO: renamed from: c */
    public TextView f7213c;

    public VoiceSweetHouseItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8784a(View view) {
        rqo0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m8785b(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        hxs.v("context_single_room", this.f7211a, bLiveVoiceCpHouseInfo.houseImage, xdl0.w(100.0f), xdl0.w(100.0f), false, false, ipn.a(), (ym2) null);
        boolean z = bLiveVoiceCpHouseInfo.isUnLock;
        VDraweeView vDraweeView = this.f7211a;
        if (z) {
            vDraweeView.setAlpha(1.0f);
        } else {
            vDraweeView.setAlpha(0.4f);
        }
        xdl0.M(this.f7212b, !bLiveVoiceCpHouseInfo.isUnLock);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8784a(this);
    }

    public VoiceSweetHouseItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetHouseItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
