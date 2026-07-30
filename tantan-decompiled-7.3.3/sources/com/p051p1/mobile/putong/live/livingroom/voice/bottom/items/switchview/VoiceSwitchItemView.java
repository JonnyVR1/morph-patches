package com.p051p1.mobile.putong.live.livingroom.voice.bottom.items.switchview;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveSettingItemSwitchBindings;
import p153l.bnl0;
import p153l.izs;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceSwitchItemView extends LiveSettingItemSwitchBindings {

    /* JADX INFO: renamed from: j */
    public ObjectAnimator f53790j;

    public VoiceSwitchItemView(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: O */
    public void mo73323O(boolean z) {
        AnimEffectPlayer animEffectPlayer = this.f48914c;
        if (z) {
            animEffectPlayer.m69683j("https://auto.tancdn.com/v1/raw/8e6f62a4-a452-403f-bc8b-c331b4bafc6411.pdf", -1);
        } else {
            animEffectPlayer.m69687n();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m78973b(boolean z, boolean z2) {
        ObjectAnimator objectAnimator = this.f53790j;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!z2) {
            View view = this.f48918g;
            if (z) {
                view.setTranslationX(qa00.m175859d(4.0f));
                return;
            } else {
                view.setTranslationX(0.0f);
                return;
            }
        }
        View view2 = this.f48918g;
        Property property = LinearLayout.TRANSLATION_X;
        if (z) {
            this.f53790j = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, 0.0f, qa00.m175859d(4.0f));
        } else {
            this.f53790j = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, qa00.m175859d(4.0f), 0.0f);
        }
        this.f53790j.start();
    }

    /* JADX INFO: renamed from: c */
    public void m78974c(String str, String str2, boolean z) {
        izs.m142871v("context_livingAct", this.f48915d, str2, 0, 0, false, true, false, null);
        this.f48920i.setText(str);
        m78975d(z, false);
    }

    /* JADX INFO: renamed from: d */
    public void m78975d(boolean z, boolean z2) {
        this.f48917f.setSelected(z);
        this.f48918g.setSelected(z);
        m78973b(z, z2);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo73321g0(boolean z) {
        bnl0.m105524M(this.f48919h, z);
    }

    @Override // android.view.View
    public boolean isSelected() {
        return this.f48918g.isSelected();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f53790j;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            return;
        }
        this.f53790j.cancel();
        this.f53790j = null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveSettingItemSwitchBindings, android.view.View
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
