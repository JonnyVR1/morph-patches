package com.p046p1.mobile.putong.live.livingroom.voice.intl.medalwall.view;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlMedalWallItem;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.SvgAndImageView;
import p147v.VLinear;
import p147v.VText;
import p149l.ayn0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceMedalWallItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public SvgAndImageView f53275c;

    /* JADX INFO: renamed from: d */
    public VText f53276d;

    public VoiceMedalWallItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m78276P(View view) {
        ayn0.m99573a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m78277Q(BLiveIntlMedalWallItem bLiveIntlMedalWallItem, boolean z) {
        if (z) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            this.f53275c.getDraweeView().setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        } else {
            this.f53275c.getDraweeView().clearColorFilter();
        }
        this.f53275c.m77476c("context_single_room", bLiveIntlMedalWallItem.icon);
        this.f53276d.setText(bLiveIntlMedalWallItem.name);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f53275c.m77474a();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78276P(this);
    }

    public VoiceMedalWallItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceMedalWallItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
