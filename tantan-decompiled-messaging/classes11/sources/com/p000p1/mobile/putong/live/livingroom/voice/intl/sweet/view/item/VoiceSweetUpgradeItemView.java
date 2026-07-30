package com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p1.mobile.longlink.msg.liveroom.VoiceSweet;
import l.hxs;
import l.xto0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceSweetUpgradeItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f7234a;

    /* JADX INFO: renamed from: b */
    public VText f7235b;

    public VoiceSweetUpgradeItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8798a(View view) {
        xto0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m8799b(VoiceSweet.VoiceCpHouseReward voiceCpHouseReward) {
        if (!TextUtils.isEmpty(voiceCpHouseReward.getImage())) {
            hxs.s("context_single_room", this.f7234a, voiceCpHouseReward.getImage());
        }
        if (TextUtils.isEmpty(voiceCpHouseReward.getTitle())) {
            return;
        }
        this.f7235b.setText(voiceCpHouseReward.getTitle());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8798a(this);
    }

    public VoiceSweetUpgradeItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetUpgradeItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
