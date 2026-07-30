package com.p046p1.mobile.putong.live.livingroom.voice.intl.giftwall.view;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBookInfo;
import p147v.VDraweeView;
import p147v.VText;
import p149l.hxs;
import p149l.jbn0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceGiftWallItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public RelativeLayout f53168d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f53169e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f53170f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f53171g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f53172h;

    /* JADX INFO: renamed from: i */
    public VText f53173i;

    public VoiceGiftWallItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m78168h0(View view) {
        jbn0.m140803a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m78169i0(BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo, int i) {
        FrameLayout frameLayout = this.f53170f;
        if (i == 1) {
            xdl0.m208344M(frameLayout, false);
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            this.f53169e.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        } else {
            xdl0.m208344M(frameLayout, true);
            boolean zIsEmpty = TextUtils.isEmpty(bLiveVoiceGiftWallBookInfo.firstLightUserAvatar);
            VDraweeView vDraweeView = this.f53171g;
            if (zIsEmpty) {
                xdl0.m208344M(vDraweeView, false);
            } else {
                hxs.m133406s("context_single_room", vDraweeView, bLiveVoiceGiftWallBookInfo.firstLightUserAvatar);
                xdl0.m208344M(this.f53171g, true);
            }
            if (TextUtils.isEmpty(bLiveVoiceGiftWallBookInfo.mostGiveUserAvatar) || bLiveVoiceGiftWallBookInfo.firstLightUserId.equals(bLiveVoiceGiftWallBookInfo.mostGiveUserId)) {
                xdl0.m208344M(this.f53172h, false);
            } else {
                hxs.m133406s("context_single_room", this.f53172h, bLiveVoiceGiftWallBookInfo.mostGiveUserAvatar);
                xdl0.m208344M(this.f53172h, true);
            }
        }
        hxs.m133406s("context_single_room", this.f53169e, bLiveVoiceGiftWallBookInfo.giftImage);
        this.f53173i.setText(bLiveVoiceGiftWallBookInfo.giftTitle);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78168h0(this);
    }

    public VoiceGiftWallItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceGiftWallItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
