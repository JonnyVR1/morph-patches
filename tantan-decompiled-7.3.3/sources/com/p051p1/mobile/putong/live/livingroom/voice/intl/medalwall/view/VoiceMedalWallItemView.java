package com.p051p1.mobile.putong.live.livingroom.voice.intl.medalwall.view;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlMedalWallItem;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.SvgAndImageView;
import p151v.VLinear;
import p151v.VText;
import p153l.e7o0;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceMedalWallItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public SvgAndImageView f54123c;

    /* JADX INFO: renamed from: d */
    public VText f54124d;

    public VoiceMedalWallItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m79459P(View view) {
        e7o0.m119761a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m79460Q(BLiveIntlMedalWallItem bLiveIntlMedalWallItem, boolean z) {
        if (z) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            this.f54123c.getDraweeView().setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        } else {
            this.f54123c.getDraweeView().clearColorFilter();
        }
        this.f54123c.m78659c("context_single_room", bLiveIntlMedalWallItem.icon);
        this.f54124d.setText(bLiveIntlMedalWallItem.name);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f54123c.m78657a();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79459P(this);
    }

    public VoiceMedalWallItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceMedalWallItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
