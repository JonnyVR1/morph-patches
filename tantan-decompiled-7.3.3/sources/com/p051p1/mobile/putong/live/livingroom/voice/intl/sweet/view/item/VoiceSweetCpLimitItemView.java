package com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;
import p151v.VLinear;
import p153l.bnl0;
import p153l.irn;
import p153l.izs;
import p153l.lxo0;
import p153l.xau;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceSweetCpLimitItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f54448a;

    /* JADX INFO: renamed from: b */
    public VLinear f54449b;

    /* JADX INFO: renamed from: c */
    public VLinear f54450c;

    /* JADX INFO: renamed from: d */
    public TextView f54451d;

    /* JADX INFO: renamed from: e */
    public VoiceSweetTimeView f54452e;

    public VoiceSweetCpLimitItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m79752a(View view) {
        lxo0.m156206a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m79753b(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse) {
        boolean z = bLiveVoiceSweetLimitHouse.remainingMill == -1;
        bnl0.m105524M(this.f54449b, z);
        bnl0.m105525M0(this.f54450c, !z);
        VDraweeView vDraweeView = this.f54448a;
        if (z) {
            vDraweeView.setAlpha(0.3f);
        } else {
            vDraweeView.setAlpha(1.0f);
            this.f54452e.m79766b(bLiveVoiceSweetLimitHouse.remainingMill, false);
        }
        izs.m142871v("context_single_room", this.f54448a, bLiveVoiceSweetLimitHouse.image, bnl0.m105587w(200.0f), bnl0.m105587w(200.0f), false, false, irn.m141839a(), null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79752a(this);
        this.f54451d.setText(xau.m209910t(R$string.f48528zh) + ":");
    }

    public VoiceSweetCpLimitItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetCpLimitItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
