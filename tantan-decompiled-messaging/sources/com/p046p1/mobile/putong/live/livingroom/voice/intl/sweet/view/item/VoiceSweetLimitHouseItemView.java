package com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;
import p149l.gro0;
import p149l.h1c0;
import p149l.hxs;
import p149l.i3c0;
import p149l.ipn;
import p149l.w8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceSweetLimitHouseItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53608a;

    /* JADX INFO: renamed from: b */
    public TextView f53609b;

    /* JADX INFO: renamed from: c */
    public TextView f53610c;

    /* JADX INFO: renamed from: d */
    public VoiceSweetTimeView f53611d;

    public VoiceSweetLimitHouseItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m78573a(View view) {
        gro0.m127751a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m78574b(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse) {
        hxs.m133409v("context_single_room", this.f53608a, bLiveVoiceSweetLimitHouse.image, xdl0.m208407w(100.0f), xdl0.m208407w(100.0f), false, false, ipn.m137564a(), null);
        boolean z = bLiveVoiceSweetLimitHouse.wore;
        TextView textView = this.f53609b;
        if (z) {
            textView.setText(R$string.f46596Bh);
            this.f53609b.setBackgroundResource(i3c0.f110994e8);
            this.f53609b.setTextColor(getContext().getResources().getColor(h1c0.f105297A0));
        } else {
            textView.setText(R$string.f46574Ah);
            this.f53609b.setBackgroundResource(i3c0.f111006f8);
            this.f53609b.setTextColor(getContext().getResources().getColor(h1c0.f105362e1));
        }
        long j = bLiveVoiceSweetLimitHouse.remainingMill;
        VoiceSweetTimeView voiceSweetTimeView = this.f53611d;
        if (j == -1) {
            xdl0.m208345M0(voiceSweetTimeView, false);
        } else {
            xdl0.m208345M0(voiceSweetTimeView, true);
            this.f53611d.m78583b(bLiveVoiceSweetLimitHouse.remainingMill, true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78573a(this);
        this.f53610c.setText(w8u.m202217t(R$string.f47680zh) + ":");
    }

    public VoiceSweetLimitHouseItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetLimitHouseItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
