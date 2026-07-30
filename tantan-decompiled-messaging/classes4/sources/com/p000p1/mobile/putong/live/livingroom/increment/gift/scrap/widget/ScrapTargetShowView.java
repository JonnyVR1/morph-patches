package com.p000p1.mobile.putong.live.livingroom.increment.gift.scrap.widget;

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
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.dt0;
import l.hxs;
import l.jji0;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import p002l.g5c0;
import p002l.t6c0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ScrapTargetShowView extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public static final int f5994f = t100.d(10.0f);

    /* JADX INFO: renamed from: a */
    public AnimEffectPlayer f5995a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f5996b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f5997c;

    /* JADX INFO: renamed from: d */
    public FrameLayout.LayoutParams f5998d;

    /* JADX INFO: renamed from: e */
    public ObjectAnimator f5999e;

    public ScrapTargetShowView(@NonNull Context context) {
        super(context);
        m7569b();
    }

    /* JADX INFO: renamed from: a */
    public void m7568a() {
        this.f5996b.o();
        this.f5995a.o();
        dt0.A(this.f5999e);
    }

    /* JADX INFO: renamed from: b */
    public final void m7569b() {
        LayoutInflater.from(getContext()).inflate(t6c0.f19942n5, (ViewGroup) this, true);
        this.f5995a = findViewById(g5c0.f10959T);
        this.f5996b = findViewById(g5c0.f11020Z6);
        VDraweeView vDraweeViewFindViewById = findViewById(g5c0.f11162o2);
        this.f5997c = vDraweeViewFindViewById;
        this.f5998d = (FrameLayout.LayoutParams) vDraweeViewFindViewById.getLayoutParams();
    }

    /* JADX INFO: renamed from: c */
    public void m7570c(@NotNull String str, boolean z) {
        this.f5995a.j("https://auto.tancdn.com/v1/raw/6e048cca-cfbb-433a-b787-d1c79ee8b71210.so", -1);
        this.f5996b.j("https://auto.tancdn.com/v1/raw/b944a22f-e2f8-47dc-ac97-aa2d8e47a6ef11.so", -1);
        m7571d(str, z);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f5997c, (Property<VDraweeView, Float>) View.TRANSLATION_Y, 0.0f, f5994f, 0.0f);
        this.f5999e = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(2600L);
        this.f5999e.setInterpolator(new LinearInterpolator());
        this.f5999e.setRepeatCount(-1);
        this.f5999e.setRepeatMode(1);
        this.f5999e.start();
    }

    /* JADX INFO: renamed from: d */
    public void m7571d(@NotNull String str, boolean z) {
        int iD = t100.d(z ? 130.0f : 160.0f);
        int iD2 = t100.d(z ? 25.0f : 10.0f);
        FrameLayout.LayoutParams layoutParams = this.f5998d;
        layoutParams.width = iD;
        layoutParams.height = iD;
        layoutParams.topMargin = iD2;
        this.f5997c.setLayoutParams(layoutParams);
        xdl0.M0(this.f5997c, !jji0.b(str));
        hxs.u("context_single_room", this.f5997c, str, iD, iD);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public ScrapTargetShowView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m7569b();
    }

    public ScrapTargetShowView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7569b();
    }

    public ScrapTargetShowView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
