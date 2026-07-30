package com.p000p1.mobile.putong.live.livingroom.common.bottom.areaC.item;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.RedDot;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.view.BottomViewGroup;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantanapp.common.utils.NullChecker;
import l.hxs;
import l.t100;
import l.xdl0;
import p002l.etk;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GuideGiftItemView extends LinearLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public BottomViewGroup f4609a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f4610b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f4611c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f4612d;

    /* JADX INFO: renamed from: e */
    public View f4613e;

    /* JADX INFO: renamed from: f */
    public View f4614f;

    /* JADX INFO: renamed from: g */
    public View f4615g;

    /* JADX INFO: renamed from: h */
    public VText f4616h;

    /* JADX INFO: renamed from: i */
    public ObjectAnimator f4617i;

    /* JADX INFO: renamed from: j */
    public String f4618j;

    public GuideGiftItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    private void m5675c(boolean z, boolean z2) {
        ObjectAnimator objectAnimator = this.f4617i;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!z2) {
            View view = this.f4614f;
            if (z) {
                view.setTranslationX(t100.d(6.0f));
                return;
            } else {
                view.setTranslationX(0.0f);
                return;
            }
        }
        View view2 = this.f4614f;
        Property property = LinearLayout.TRANSLATION_X;
        if (z) {
            this.f4617i = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, 0.0f, t100.d(5.0f));
        } else {
            this.f4617i = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, t100.d(5.0f), 0.0f);
        }
        this.f4617i.start();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: O */
    public void mo5613O(boolean z) {
        AnimEffectPlayer animEffectPlayer = this.f4610b;
        if (z) {
            animEffectPlayer.j("https://auto.tancdn.com/v1/raw/8e6f62a4-a452-403f-bc8b-c331b4bafc6411.pdf", -1);
        } else {
            animEffectPlayer.n();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5676a(View view) {
        etk.m12697a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m5677b() {
        if (NullChecker.a(this.f4618j)) {
            d.l().k(this.f4618j);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m5678d(String str, String str2, boolean z) {
        hxs.t("context_livingAct", this.f4611c, str2, t100.t);
        this.f4616h.setText(str);
        m5679e(z, false);
    }

    /* JADX INFO: renamed from: e */
    public void m5679e(boolean z, boolean z2) {
        this.f4613e.setSelected(z);
        this.f4614f.setSelected(z);
        m5675c(z, z2);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo5611g0(boolean z) {
        xdl0.M(this.f4615g, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f4617i;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            return;
        }
        this.f4617i.cancel();
        this.f4617i = null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5676a(this);
        this.f4609a.f4778a = 0.84615386f;
    }

    public GuideGiftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GuideGiftItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
