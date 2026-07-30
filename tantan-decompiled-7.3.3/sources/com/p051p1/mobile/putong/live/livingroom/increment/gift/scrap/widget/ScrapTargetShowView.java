package com.p051p1.mobile.putong.live.livingroom.increment.gift.scrap.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.it0;
import p153l.izs;
import p153l.jsi0;
import p153l.mdc0;
import p153l.qa00;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class ScrapTargetShowView extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public static final int f50800f = qa00.m175859d(10.0f);

    /* JADX INFO: renamed from: a */
    public AnimEffectPlayer f50801a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f50802b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f50803c;

    /* JADX INFO: renamed from: d */
    public FrameLayout.LayoutParams f50804d;

    /* JADX INFO: renamed from: e */
    public ObjectAnimator f50805e;

    public ScrapTargetShowView(@NonNull Context context) {
        super(context);
        m75191b();
    }

    /* JADX INFO: renamed from: a */
    public void m75190a() {
        this.f50802b.m69688o();
        this.f50801a.m69688o();
        it0.m142007A(this.f50805e);
    }

    /* JADX INFO: renamed from: b */
    public final void m75191b() {
        LayoutInflater.from(getContext()).inflate(yec0.f199178n5, (ViewGroup) this, true);
        this.f50801a = (AnimEffectPlayer) findViewById(mdc0.f136054T);
        this.f50802b = (AnimEffectPlayer) findViewById(mdc0.f136115Z6);
        VDraweeView vDraweeView = (VDraweeView) findViewById(mdc0.f136257o2);
        this.f50803c = vDraweeView;
        this.f50804d = (FrameLayout.LayoutParams) vDraweeView.getLayoutParams();
    }

    /* JADX INFO: renamed from: c */
    public void m75192c(@NotNull String str, boolean z) {
        this.f50801a.m69683j("https://auto.tancdn.com/v1/raw/6e048cca-cfbb-433a-b787-d1c79ee8b71210.so", -1);
        this.f50802b.m69683j("https://auto.tancdn.com/v1/raw/b944a22f-e2f8-47dc-ac97-aa2d8e47a6ef11.so", -1);
        m75193d(str, z);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f50803c, (Property<VDraweeView, Float>) View.TRANSLATION_Y, 0.0f, f50800f, 0.0f);
        this.f50805e = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(2600L);
        this.f50805e.setInterpolator(new LinearInterpolator());
        this.f50805e.setRepeatCount(-1);
        this.f50805e.setRepeatMode(1);
        this.f50805e.start();
    }

    /* JADX INFO: renamed from: d */
    public void m75193d(@NotNull String str, boolean z) {
        int iM175859d = qa00.m175859d(z ? 130.0f : 160.0f);
        int iM175859d2 = qa00.m175859d(z ? 25.0f : 10.0f);
        FrameLayout.LayoutParams layoutParams = this.f50804d;
        layoutParams.width = iM175859d;
        layoutParams.height = iM175859d;
        layoutParams.topMargin = iM175859d2;
        this.f50803c.setLayoutParams(layoutParams);
        bnl0.m105525M0(this.f50803c, !jsi0.m146843b(str));
        izs.m142870u("context_single_room", this.f50803c, str, iM175859d, iM175859d);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public ScrapTargetShowView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m75191b();
    }

    public ScrapTargetShowView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m75191b();
    }

    public ScrapTargetShowView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
