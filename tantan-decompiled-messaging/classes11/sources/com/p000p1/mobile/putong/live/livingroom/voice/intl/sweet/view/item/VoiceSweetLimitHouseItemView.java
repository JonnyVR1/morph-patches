package com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.p1.mobile.putong.live.livingroom.R;
import l.gro0;
import l.h1c0;
import l.hxs;
import l.i3c0;
import l.ipn;
import l.w8u;
import l.xdl0;
import l.ym2;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceSweetLimitHouseItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f7214a;

    /* JADX INFO: renamed from: b */
    public TextView f7215b;

    /* JADX INFO: renamed from: c */
    public TextView f7216c;

    /* JADX INFO: renamed from: d */
    public VoiceSweetTimeView f7217d;

    public VoiceSweetLimitHouseItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8786a(View view) {
        gro0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m8787b(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse) {
        hxs.v("context_single_room", this.f7214a, bLiveVoiceSweetLimitHouse.image, xdl0.w(100.0f), xdl0.w(100.0f), false, false, ipn.a(), (ym2) null);
        boolean z = bLiveVoiceSweetLimitHouse.wore;
        TextView textView = this.f7215b;
        if (z) {
            textView.setText(R.string.Bh);
            this.f7215b.setBackgroundResource(i3c0.e8);
            this.f7215b.setTextColor(getContext().getResources().getColor(h1c0.A0));
        } else {
            textView.setText(R.string.Ah);
            this.f7215b.setBackgroundResource(i3c0.f8);
            this.f7215b.setTextColor(getContext().getResources().getColor(h1c0.e1));
        }
        long j = bLiveVoiceSweetLimitHouse.remainingMill;
        VoiceSweetTimeView voiceSweetTimeView = this.f7217d;
        if (j == -1) {
            xdl0.M0(voiceSweetTimeView, false);
        } else {
            xdl0.M0(voiceSweetTimeView, true);
            this.f7217d.m8796b(bLiveVoiceSweetLimitHouse.remainingMill, true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8786a(this);
        this.f7216c.setText(w8u.t(R.string.zh) + ":");
    }

    public VoiceSweetLimitHouseItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetLimitHouseItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
