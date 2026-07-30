package com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.irn;
import p153l.izs;
import p153l.k0p0;
import p153l.n9c0;
import p153l.obc0;
import p153l.xau;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceSweetLimitHouseItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f54456a;

    /* JADX INFO: renamed from: b */
    public TextView f54457b;

    /* JADX INFO: renamed from: c */
    public TextView f54458c;

    /* JADX INFO: renamed from: d */
    public VoiceSweetTimeView f54459d;

    public VoiceSweetLimitHouseItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m79756a(View view) {
        k0p0.m147832a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m79757b(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse) {
        izs.m142871v("context_single_room", this.f54456a, bLiveVoiceSweetLimitHouse.image, bnl0.m105587w(100.0f), bnl0.m105587w(100.0f), false, false, irn.m141839a(), null);
        boolean z = bLiveVoiceSweetLimitHouse.wore;
        TextView textView = this.f54457b;
        if (z) {
            textView.setText(R$string.f47444Bh);
            this.f54457b.setBackgroundResource(obc0.f146322e8);
            this.f54457b.setTextColor(getContext().getResources().getColor(n9c0.f140758A0));
        } else {
            textView.setText(R$string.f47422Ah);
            this.f54457b.setBackgroundResource(obc0.f146334f8);
            this.f54457b.setTextColor(getContext().getResources().getColor(n9c0.f140823e1));
        }
        long j = bLiveVoiceSweetLimitHouse.remainingMill;
        VoiceSweetTimeView voiceSweetTimeView = this.f54459d;
        if (j == -1) {
            bnl0.m105525M0(voiceSweetTimeView, false);
        } else {
            bnl0.m105525M0(voiceSweetTimeView, true);
            this.f54459d.m79766b(bLiveVoiceSweetLimitHouse.remainingMill, true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79756a(this);
        this.f54458c.setText(xau.m209910t(R$string.f48528zh) + ":");
    }

    public VoiceSweetLimitHouseItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetLimitHouseItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
