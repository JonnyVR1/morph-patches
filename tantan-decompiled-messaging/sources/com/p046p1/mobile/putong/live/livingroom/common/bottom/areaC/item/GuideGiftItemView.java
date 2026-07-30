package com.p046p1.mobile.putong.live.livingroom.common.bottom.areaC.item;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.view.BottomViewGroup;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;
import p149l.etk;
import p149l.hxs;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class GuideGiftItemView extends LinearLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public BottomViewGroup f48567a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f48568b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f48569c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f48570d;

    /* JADX INFO: renamed from: e */
    public View f48571e;

    /* JADX INFO: renamed from: f */
    public View f48572f;

    /* JADX INFO: renamed from: g */
    public View f48573g;

    /* JADX INFO: renamed from: h */
    public VText f48574h;

    /* JADX INFO: renamed from: i */
    public ObjectAnimator f48575i;

    /* JADX INFO: renamed from: j */
    public String f48576j;

    public GuideGiftItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    private void m72202c(boolean z, boolean z2) {
        ObjectAnimator objectAnimator = this.f48575i;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!z2) {
            View view = this.f48572f;
            if (z) {
                view.setTranslationX(t100.m186890d(6.0f));
                return;
            } else {
                view.setTranslationX(0.0f);
                return;
            }
        }
        View view2 = this.f48572f;
        Property property = LinearLayout.TRANSLATION_X;
        if (z) {
            this.f48575i = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, 0.0f, t100.m186890d(5.0f));
        } else {
            this.f48575i = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, t100.m186890d(5.0f), 0.0f);
        }
        this.f48575i.start();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: O */
    public void mo72140O(boolean z) {
        AnimEffectPlayer animEffectPlayer = this.f48568b;
        if (z) {
            animEffectPlayer.m68500j("https://auto.tancdn.com/v1/raw/8e6f62a4-a452-403f-bc8b-c331b4bafc6411.pdf", -1);
        } else {
            animEffectPlayer.m68504n();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m72203a(View view) {
        etk.m118127a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m72204b() {
        if (NullChecker.m81303a(this.f48576j)) {
            C4348d.m20896l().m20900k(this.f48576j);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m72205d(String str, String str2, boolean z) {
        hxs.m133407t("context_livingAct", this.f48569c, str2, t100.f167271t);
        this.f48574h.setText(str);
        m72206e(z, false);
    }

    /* JADX INFO: renamed from: e */
    public void m72206e(boolean z, boolean z2) {
        this.f48571e.setSelected(z);
        this.f48572f.setSelected(z);
        m72202c(z, z2);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo72138g0(boolean z) {
        xdl0.m208344M(this.f48573g, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f48575i;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            return;
        }
        this.f48575i.cancel();
        this.f48575i = null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72203a(this);
        this.f48567a.f48736a = 0.84615386f;
    }

    public GuideGiftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GuideGiftItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
