package com.p051p1.mobile.putong.live.livingroom.voice.intl.giftwall.detail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBookInfo;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;
import p151v.VText;
import p153l.izs;
import p153l.pkn0;
import p153l.xau;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceGiftWallLightItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextView f54012a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f54013b;

    /* JADX INFO: renamed from: c */
    public VText f54014c;

    /* JADX INFO: renamed from: d */
    public VText f54015d;

    public VoiceGiftWallLightItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m79349a(View view) {
        pkn0.m172614a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m79350b(BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo, int i) {
        VDraweeView vDraweeView = this.f54013b;
        if (i == 0) {
            izs.m142868s("context_single_room", vDraweeView, bLiveVoiceGiftWallBookInfo.firstLightUserAvatar);
            this.f54014c.setText(bLiveVoiceGiftWallBookInfo.firstLightUserName);
            this.f54015d.setText(xau.m209911u(R$string.f48045dh, bLiveVoiceGiftWallBookInfo.firstLightTime));
            this.f54012a.setText(xau.m209910t(R$string.f48089fh));
            return;
        }
        izs.m142868s("context_single_room", vDraweeView, bLiveVoiceGiftWallBookInfo.mostGiveUserAvatar);
        this.f54014c.setText(bLiveVoiceGiftWallBookInfo.mostGiveUserName);
        this.f54015d.setText(xau.m209911u(R$string.f48198kh, String.valueOf(bLiveVoiceGiftWallBookInfo.mostGiveCount)));
        this.f54012a.setText(xau.m209910t(R$string.f48133hh));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79349a(this);
    }

    public VoiceGiftWallLightItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceGiftWallLightItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
