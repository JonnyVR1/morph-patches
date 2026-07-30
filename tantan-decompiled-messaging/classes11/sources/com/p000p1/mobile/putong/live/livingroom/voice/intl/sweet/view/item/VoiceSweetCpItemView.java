package com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetCpSimpleHeadView;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import l.doo0;
import l.hxs;
import l.ipn;
import l.xdl0;
import l.ym2;
import v.VDraweeView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceSweetCpItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f7203a;

    /* JADX INFO: renamed from: b */
    public VLinear f7204b;

    /* JADX INFO: renamed from: c */
    public VoiceSweetCpSimpleHeadView f7205c;

    public VoiceSweetCpItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8780a(View view) {
        doo0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m8781b(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        xdl0.M(this.f7204b, !bLiveVoiceCpHouseInfo.isUnLock);
        hxs.v("context_single_room", this.f7203a, bLiveVoiceCpHouseInfo.houseImage, xdl0.w(208.0f), xdl0.w(207.0f), false, false, ipn.a(), (ym2) null);
        this.f7205c.m8704b(bLiveVoiceCpHouseInfo.meUserAvatar, bLiveVoiceCpHouseInfo.cpUserAvatar, !bLiveVoiceCpHouseInfo.isUnLock);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8780a(this);
    }

    public VoiceSweetCpItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetCpItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
