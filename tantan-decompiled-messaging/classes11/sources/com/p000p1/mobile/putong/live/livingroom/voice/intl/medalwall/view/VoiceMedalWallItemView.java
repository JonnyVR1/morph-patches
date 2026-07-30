package com.p000p1.mobile.putong.live.livingroom.voice.intl.medalwall.view;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.putong.live.base.data.BLiveIntlMedalWallItem;
import com.p1.mobile.putong.live.livingroom.virtual.roomInfo.view.SvgAndImageView;
import l.ayn0;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceMedalWallItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public SvgAndImageView f6881c;

    /* JADX INFO: renamed from: d */
    public VText f6882d;

    public VoiceMedalWallItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m8465P(View view) {
        ayn0.a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m8466Q(BLiveIntlMedalWallItem bLiveIntlMedalWallItem, boolean z) {
        if (z) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            this.f6881c.getDraweeView().setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        } else {
            this.f6881c.getDraweeView().clearColorFilter();
        }
        this.f6881c.c("context_single_room", bLiveIntlMedalWallItem.icon);
        this.f6882d.setText(bLiveIntlMedalWallItem.name);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        this.f6881c.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8465P(this);
    }

    public VoiceMedalWallItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceMedalWallItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
