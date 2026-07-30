package com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceSweet;
import p151v.VDraweeView;
import p151v.VText;
import p153l.b3p0;
import p153l.izs;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceSweetUpgradeItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f54476a;

    /* JADX INFO: renamed from: b */
    public VText f54477b;

    public VoiceSweetUpgradeItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m79768a(View view) {
        b3p0.m102357a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m79769b(VoiceSweet.VoiceCpHouseReward voiceCpHouseReward) {
        if (!TextUtils.isEmpty(voiceCpHouseReward.getImage())) {
            izs.m142868s("context_single_room", this.f54476a, voiceCpHouseReward.getImage());
        }
        if (TextUtils.isEmpty(voiceCpHouseReward.getTitle())) {
            return;
        }
        this.f54477b.setText(voiceCpHouseReward.getTitle());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79768a(this);
    }

    public VoiceSweetUpgradeItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetUpgradeItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
