package com.p046p1.mobile.putong.live.livingroom.voice.bottom.items.switchview;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveSettingItemSwitchBindings;
import p149l.hxs;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceSwitchItemView extends LiveSettingItemSwitchBindings {

    /* JADX INFO: renamed from: j */
    public ObjectAnimator f52942j;

    public VoiceSwitchItemView(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: O */
    public void mo72140O(boolean z) {
        AnimEffectPlayer animEffectPlayer = this.f48066c;
        if (z) {
            animEffectPlayer.m68500j("https://auto.tancdn.com/v1/raw/8e6f62a4-a452-403f-bc8b-c331b4bafc6411.pdf", -1);
        } else {
            animEffectPlayer.m68504n();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m77790b(boolean z, boolean z2) {
        ObjectAnimator objectAnimator = this.f52942j;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!z2) {
            View view = this.f48070g;
            if (z) {
                view.setTranslationX(t100.m186890d(4.0f));
                return;
            } else {
                view.setTranslationX(0.0f);
                return;
            }
        }
        View view2 = this.f48070g;
        Property property = LinearLayout.TRANSLATION_X;
        if (z) {
            this.f52942j = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, 0.0f, t100.m186890d(4.0f));
        } else {
            this.f52942j = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, t100.m186890d(4.0f), 0.0f);
        }
        this.f52942j.start();
    }

    /* JADX INFO: renamed from: c */
    public void m77791c(String str, String str2, boolean z) {
        hxs.m133409v("context_livingAct", this.f48067d, str2, 0, 0, false, true, false, null);
        this.f48072i.setText(str);
        m77792d(z, false);
    }

    /* JADX INFO: renamed from: d */
    public void m77792d(boolean z, boolean z2) {
        this.f48069f.setSelected(z);
        this.f48070g.setSelected(z);
        m77790b(z, z2);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo72138g0(boolean z) {
        xdl0.m208344M(this.f48071h, z);
    }

    @Override // android.view.View
    public boolean isSelected() {
        return this.f48070g.isSelected();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f52942j;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            return;
        }
        this.f52942j.cancel();
        this.f52942j = null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveSettingItemSwitchBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public VoiceSwitchItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSwitchItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
