package com.p051p1.mobile.putong.live.livingroom.voice.intl.giftwall.view;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBookInfo;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.nkn0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceGiftWallItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public RelativeLayout f54016d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f54017e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f54018f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f54019g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f54020h;

    /* JADX INFO: renamed from: i */
    public VText f54021i;

    public VoiceGiftWallItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m79351h0(View view) {
        nkn0.m163662a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m79352i0(BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo, int i) {
        FrameLayout frameLayout = this.f54018f;
        if (i == 1) {
            bnl0.m105524M(frameLayout, false);
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            this.f54017e.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        } else {
            bnl0.m105524M(frameLayout, true);
            boolean zIsEmpty = TextUtils.isEmpty(bLiveVoiceGiftWallBookInfo.firstLightUserAvatar);
            VDraweeView vDraweeView = this.f54019g;
            if (zIsEmpty) {
                bnl0.m105524M(vDraweeView, false);
            } else {
                izs.m142868s("context_single_room", vDraweeView, bLiveVoiceGiftWallBookInfo.firstLightUserAvatar);
                bnl0.m105524M(this.f54019g, true);
            }
            if (TextUtils.isEmpty(bLiveVoiceGiftWallBookInfo.mostGiveUserAvatar) || bLiveVoiceGiftWallBookInfo.firstLightUserId.equals(bLiveVoiceGiftWallBookInfo.mostGiveUserId)) {
                bnl0.m105524M(this.f54020h, false);
            } else {
                izs.m142868s("context_single_room", this.f54020h, bLiveVoiceGiftWallBookInfo.mostGiveUserAvatar);
                bnl0.m105524M(this.f54020h, true);
            }
        }
        izs.m142868s("context_single_room", this.f54017e, bLiveVoiceGiftWallBookInfo.giftImage);
        this.f54021i.setText(bLiveVoiceGiftWallBookInfo.giftTitle);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79351h0(this);
    }

    public VoiceGiftWallItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceGiftWallItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
