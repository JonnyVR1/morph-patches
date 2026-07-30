package com.p046p1.mobile.putong.live.livingroom.increment.gift.scrap.widget;

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
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;
import p149l.dt0;
import p149l.g5c0;
import p149l.hxs;
import p149l.jji0;
import p149l.t100;
import p149l.t6c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class ScrapTargetShowView extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public static final int f49952f = t100.m186890d(10.0f);

    /* JADX INFO: renamed from: a */
    public AnimEffectPlayer f49953a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f49954b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f49955c;

    /* JADX INFO: renamed from: d */
    public FrameLayout.LayoutParams f49956d;

    /* JADX INFO: renamed from: e */
    public ObjectAnimator f49957e;

    public ScrapTargetShowView(@NonNull Context context) {
        super(context);
        m74008b();
    }

    /* JADX INFO: renamed from: a */
    public void m74007a() {
        this.f49954b.m68505o();
        this.f49953a.m68505o();
        dt0.m113501A(this.f49957e);
    }

    /* JADX INFO: renamed from: b */
    public final void m74008b() {
        LayoutInflater.from(getContext()).inflate(t6c0.f168446n5, (ViewGroup) this, true);
        this.f49953a = (AnimEffectPlayer) findViewById(g5c0.f100809T);
        this.f49954b = (AnimEffectPlayer) findViewById(g5c0.f100870Z6);
        VDraweeView vDraweeView = (VDraweeView) findViewById(g5c0.f101012o2);
        this.f49955c = vDraweeView;
        this.f49956d = (FrameLayout.LayoutParams) vDraweeView.getLayoutParams();
    }

    /* JADX INFO: renamed from: c */
    public void m74009c(@NotNull String str, boolean z) {
        this.f49953a.m68500j("https://auto.tancdn.com/v1/raw/6e048cca-cfbb-433a-b787-d1c79ee8b71210.so", -1);
        this.f49954b.m68500j("https://auto.tancdn.com/v1/raw/b944a22f-e2f8-47dc-ac97-aa2d8e47a6ef11.so", -1);
        m74010d(str, z);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49955c, (Property<VDraweeView, Float>) View.TRANSLATION_Y, 0.0f, f49952f, 0.0f);
        this.f49957e = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(2600L);
        this.f49957e.setInterpolator(new LinearInterpolator());
        this.f49957e.setRepeatCount(-1);
        this.f49957e.setRepeatMode(1);
        this.f49957e.start();
    }

    /* JADX INFO: renamed from: d */
    public void m74010d(@NotNull String str, boolean z) {
        int iM186890d = t100.m186890d(z ? 130.0f : 160.0f);
        int iM186890d2 = t100.m186890d(z ? 25.0f : 10.0f);
        FrameLayout.LayoutParams layoutParams = this.f49956d;
        layoutParams.width = iM186890d;
        layoutParams.height = iM186890d;
        layoutParams.topMargin = iM186890d2;
        this.f49955c.setLayoutParams(layoutParams);
        xdl0.m208345M0(this.f49955c, !jji0.m141806b(str));
        hxs.m133408u("context_single_room", this.f49955c, str, iM186890d, iM186890d);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public ScrapTargetShowView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m74008b();
    }

    public ScrapTargetShowView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m74008b();
    }

    public ScrapTargetShowView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
