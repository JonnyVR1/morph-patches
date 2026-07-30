package com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.irn;
import p153l.izs;
import p153l.vzo0;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceSweetHouseItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f54453a;

    /* JADX INFO: renamed from: b */
    public VText f54454b;

    /* JADX INFO: renamed from: c */
    public TextView f54455c;

    public VoiceSweetHouseItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m79754a(View view) {
        vzo0.m204116a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m79755b(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        izs.m142871v("context_single_room", this.f54453a, bLiveVoiceCpHouseInfo.houseImage, bnl0.m105587w(100.0f), bnl0.m105587w(100.0f), false, false, irn.m141839a(), null);
        boolean z = bLiveVoiceCpHouseInfo.isUnLock;
        VDraweeView vDraweeView = this.f54453a;
        if (z) {
            vDraweeView.setAlpha(1.0f);
        } else {
            vDraweeView.setAlpha(0.4f);
        }
        bnl0.m105524M(this.f54454b, !bLiveVoiceCpHouseInfo.isUnLock);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79754a(this);
    }

    public VoiceSweetHouseItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetHouseItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
