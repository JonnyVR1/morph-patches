package com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.p1.mobile.putong.live.livingroom.R;
import l.hoo0;
import l.hxs;
import l.ipn;
import l.w8u;
import l.xdl0;
import l.ym2;
import v.VDraweeView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceSweetCpLimitItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f7206a;

    /* JADX INFO: renamed from: b */
    public VLinear f7207b;

    /* JADX INFO: renamed from: c */
    public VLinear f7208c;

    /* JADX INFO: renamed from: d */
    public TextView f7209d;

    /* JADX INFO: renamed from: e */
    public VoiceSweetTimeView f7210e;

    public VoiceSweetCpLimitItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8782a(View view) {
        hoo0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m8783b(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse) {
        boolean z = bLiveVoiceSweetLimitHouse.remainingMill == -1;
        xdl0.M(this.f7207b, z);
        xdl0.M0(this.f7208c, !z);
        VDraweeView vDraweeView = this.f7206a;
        if (z) {
            vDraweeView.setAlpha(0.3f);
        } else {
            vDraweeView.setAlpha(1.0f);
            this.f7210e.m8796b(bLiveVoiceSweetLimitHouse.remainingMill, false);
        }
        hxs.v("context_single_room", this.f7206a, bLiveVoiceSweetLimitHouse.image, xdl0.w(200.0f), xdl0.w(200.0f), false, false, ipn.a(), (ym2) null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8782a(this);
        this.f7209d.setText(w8u.t(R.string.zh) + ":");
    }

    public VoiceSweetCpLimitItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetCpLimitItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
