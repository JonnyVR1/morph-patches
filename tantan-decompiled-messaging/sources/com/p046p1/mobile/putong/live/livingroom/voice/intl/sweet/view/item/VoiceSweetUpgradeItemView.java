package com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceSweet;
import p147v.VDraweeView;
import p147v.VText;
import p149l.hxs;
import p149l.xto0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceSweetUpgradeItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53628a;

    /* JADX INFO: renamed from: b */
    public VText f53629b;

    public VoiceSweetUpgradeItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m78585a(View view) {
        xto0.m211005a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m78586b(VoiceSweet.VoiceCpHouseReward voiceCpHouseReward) {
        if (!TextUtils.isEmpty(voiceCpHouseReward.getImage())) {
            hxs.m133406s("context_single_room", this.f53628a, voiceCpHouseReward.getImage());
        }
        if (TextUtils.isEmpty(voiceCpHouseReward.getTitle())) {
            return;
        }
        this.f53629b.setText(voiceCpHouseReward.getTitle());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78585a(this);
    }

    public VoiceSweetUpgradeItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetUpgradeItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
