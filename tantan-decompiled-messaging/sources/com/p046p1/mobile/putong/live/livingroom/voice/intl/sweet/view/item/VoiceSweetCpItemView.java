package com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetCpSimpleHeadView;
import p147v.VDraweeView;
import p147v.VLinear;
import p149l.doo0;
import p149l.hxs;
import p149l.ipn;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceSweetCpItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53597a;

    /* JADX INFO: renamed from: b */
    public VLinear f53598b;

    /* JADX INFO: renamed from: c */
    public VoiceSweetCpSimpleHeadView f53599c;

    public VoiceSweetCpItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m78567a(View view) {
        doo0.m112809a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m78568b(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        xdl0.m208344M(this.f53598b, !bLiveVoiceCpHouseInfo.isUnLock);
        hxs.m133409v("context_single_room", this.f53597a, bLiveVoiceCpHouseInfo.houseImage, xdl0.m208407w(208.0f), xdl0.m208407w(207.0f), false, false, ipn.m137564a(), null);
        this.f53599c.m78495b(bLiveVoiceCpHouseInfo.meUserAvatar, bLiveVoiceCpHouseInfo.cpUserAvatar, !bLiveVoiceCpHouseInfo.isUnLock);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78567a(this);
    }

    public VoiceSweetCpItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetCpItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
