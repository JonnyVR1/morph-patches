package com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;
import p147v.VLinear;
import p149l.hoo0;
import p149l.hxs;
import p149l.ipn;
import p149l.w8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceSweetCpLimitItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53600a;

    /* JADX INFO: renamed from: b */
    public VLinear f53601b;

    /* JADX INFO: renamed from: c */
    public VLinear f53602c;

    /* JADX INFO: renamed from: d */
    public TextView f53603d;

    /* JADX INFO: renamed from: e */
    public VoiceSweetTimeView f53604e;

    public VoiceSweetCpLimitItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m78569a(View view) {
        hoo0.m132226a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m78570b(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse) {
        boolean z = bLiveVoiceSweetLimitHouse.remainingMill == -1;
        xdl0.m208344M(this.f53601b, z);
        xdl0.m208345M0(this.f53602c, !z);
        VDraweeView vDraweeView = this.f53600a;
        if (z) {
            vDraweeView.setAlpha(0.3f);
        } else {
            vDraweeView.setAlpha(1.0f);
            this.f53604e.m78583b(bLiveVoiceSweetLimitHouse.remainingMill, false);
        }
        hxs.m133409v("context_single_room", this.f53600a, bLiveVoiceSweetLimitHouse.image, xdl0.m208407w(200.0f), xdl0.m208407w(200.0f), false, false, ipn.m137564a(), null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78569a(this);
        this.f53603d.setText(w8u.m202217t(R$string.f47680zh) + ":");
    }

    public VoiceSweetCpLimitItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetCpLimitItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
