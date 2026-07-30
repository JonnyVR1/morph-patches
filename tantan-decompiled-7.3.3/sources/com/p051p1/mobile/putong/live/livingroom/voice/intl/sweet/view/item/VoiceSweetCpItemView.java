package com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetCpSimpleHeadView;
import p151v.VDraweeView;
import p151v.VLinear;
import p153l.bnl0;
import p153l.hxo0;
import p153l.irn;
import p153l.izs;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceSweetCpItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f54445a;

    /* JADX INFO: renamed from: b */
    public VLinear f54446b;

    /* JADX INFO: renamed from: c */
    public VoiceSweetCpSimpleHeadView f54447c;

    public VoiceSweetCpItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m79750a(View view) {
        hxo0.m137630a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m79751b(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        bnl0.m105524M(this.f54446b, !bLiveVoiceCpHouseInfo.isUnLock);
        izs.m142871v("context_single_room", this.f54445a, bLiveVoiceCpHouseInfo.houseImage, bnl0.m105587w(208.0f), bnl0.m105587w(207.0f), false, false, irn.m141839a(), null);
        this.f54447c.m79678b(bLiveVoiceCpHouseInfo.meUserAvatar, bLiveVoiceCpHouseInfo.cpUserAvatar, !bLiveVoiceCpHouseInfo.isUnLock);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79750a(this);
    }

    public VoiceSweetCpItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetCpItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
