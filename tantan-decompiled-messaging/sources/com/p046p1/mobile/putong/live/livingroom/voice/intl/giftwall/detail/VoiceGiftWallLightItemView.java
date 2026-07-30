package com.p046p1.mobile.putong.live.livingroom.voice.intl.giftwall.detail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBookInfo;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;
import p147v.VText;
import p149l.hxs;
import p149l.lbn0;
import p149l.w8u;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceGiftWallLightItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextView f53164a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f53165b;

    /* JADX INFO: renamed from: c */
    public VText f53166c;

    /* JADX INFO: renamed from: d */
    public VText f53167d;

    public VoiceGiftWallLightItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m78166a(View view) {
        lbn0.m149258a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m78167b(BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo, int i) {
        VDraweeView vDraweeView = this.f53165b;
        if (i == 0) {
            hxs.m133406s("context_single_room", vDraweeView, bLiveVoiceGiftWallBookInfo.firstLightUserAvatar);
            this.f53166c.setText(bLiveVoiceGiftWallBookInfo.firstLightUserName);
            this.f53167d.setText(w8u.m202218u(R$string.f47197dh, bLiveVoiceGiftWallBookInfo.firstLightTime));
            this.f53164a.setText(w8u.m202217t(R$string.f47241fh));
            return;
        }
        hxs.m133406s("context_single_room", vDraweeView, bLiveVoiceGiftWallBookInfo.mostGiveUserAvatar);
        this.f53166c.setText(bLiveVoiceGiftWallBookInfo.mostGiveUserName);
        this.f53167d.setText(w8u.m202218u(R$string.f47350kh, String.valueOf(bLiveVoiceGiftWallBookInfo.mostGiveCount)));
        this.f53164a.setText(w8u.m202217t(R$string.f47285hh));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78166a(this);
    }

    public VoiceGiftWallLightItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceGiftWallLightItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
