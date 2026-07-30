package com.p051p1.mobile.putong.live.livingroom.common.bottom.areaC.item;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.view.BottomViewGroup;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.qa00;
import p153l.uvk;

/* JADX INFO: loaded from: classes4.dex */
public class GuideGiftItemView extends LinearLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public BottomViewGroup f49415a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f49416b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f49417c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f49418d;

    /* JADX INFO: renamed from: e */
    public View f49419e;

    /* JADX INFO: renamed from: f */
    public View f49420f;

    /* JADX INFO: renamed from: g */
    public View f49421g;

    /* JADX INFO: renamed from: h */
    public VText f49422h;

    /* JADX INFO: renamed from: i */
    public ObjectAnimator f49423i;

    /* JADX INFO: renamed from: j */
    public String f49424j;

    public GuideGiftItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    private void m73385c(boolean z, boolean z2) {
        ObjectAnimator objectAnimator = this.f49423i;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!z2) {
            View view = this.f49420f;
            if (z) {
                view.setTranslationX(qa00.m175859d(6.0f));
                return;
            } else {
                view.setTranslationX(0.0f);
                return;
            }
        }
        View view2 = this.f49420f;
        Property property = LinearLayout.TRANSLATION_X;
        if (z) {
            this.f49423i = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, 0.0f, qa00.m175859d(5.0f));
        } else {
            this.f49423i = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, qa00.m175859d(5.0f), 0.0f);
        }
        this.f49423i.start();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: O */
    public void mo73323O(boolean z) {
        AnimEffectPlayer animEffectPlayer = this.f49416b;
        if (z) {
            animEffectPlayer.m69683j("https://auto.tancdn.com/v1/raw/8e6f62a4-a452-403f-bc8b-c331b4bafc6411.pdf", -1);
        } else {
            animEffectPlayer.m69687n();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m73386a(View view) {
        uvk.m198265a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m73387b() {
        if (NullChecker.m82486a(this.f49424j)) {
            C4499d.m21895l().m21899k(this.f49424j);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m73388d(String str, String str2, boolean z) {
        izs.m142869t("context_livingAct", this.f49417c, str2, qa00.f156333t);
        this.f49422h.setText(str);
        m73389e(z, false);
    }

    /* JADX INFO: renamed from: e */
    public void m73389e(boolean z, boolean z2) {
        this.f49419e.setSelected(z);
        this.f49420f.setSelected(z);
        m73385c(z, z2);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo73321g0(boolean z) {
        bnl0.m105524M(this.f49421g, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f49423i;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            return;
        }
        this.f49423i.cancel();
        this.f49423i = null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73386a(this);
        this.f49415a.f49584a = 0.84615386f;
    }

    public GuideGiftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GuideGiftItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
