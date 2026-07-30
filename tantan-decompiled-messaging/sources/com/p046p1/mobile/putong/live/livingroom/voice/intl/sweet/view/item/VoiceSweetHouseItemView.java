package com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import p147v.VDraweeView;
import p147v.VText;
import p149l.hxs;
import p149l.ipn;
import p149l.rqo0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceSweetHouseItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53605a;

    /* JADX INFO: renamed from: b */
    public VText f53606b;

    /* JADX INFO: renamed from: c */
    public TextView f53607c;

    public VoiceSweetHouseItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m78571a(View view) {
        rqo0.m180461a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m78572b(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        hxs.m133409v("context_single_room", this.f53605a, bLiveVoiceCpHouseInfo.houseImage, xdl0.m208407w(100.0f), xdl0.m208407w(100.0f), false, false, ipn.m137564a(), null);
        boolean z = bLiveVoiceCpHouseInfo.isUnLock;
        VDraweeView vDraweeView = this.f53605a;
        if (z) {
            vDraweeView.setAlpha(1.0f);
        } else {
            vDraweeView.setAlpha(0.4f);
        }
        xdl0.m208344M(this.f53606b, !bLiveVoiceCpHouseInfo.isUnLock);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78571a(this);
    }

    public VoiceSweetHouseItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetHouseItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
