package com.p051p1.mobile.putong.live.livingroom.increment.gift.packetgift;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VText;
import p153l.bnl0;
import p153l.civ;
import p153l.dd60;
import p153l.gt0;
import p153l.htd0;
import p153l.qa00;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class PacketGiftActionTipsView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f50735a;

    /* JADX INFO: renamed from: b */
    public AnimatorSet f50736b;

    public PacketGiftActionTipsView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m75081c(View view) {
        dd60.m115327a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m75082d() {
        bnl0.m105524M(this, true);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m75083e() {
        bnl0.m105524M(this, false);
        ((civ) zrv.m221194l(htd0.f111524f)).m109950B();
    }

    /* JADX INFO: renamed from: f */
    public void m75084f() {
        this.f50735a.setText(R$string.f48279oa);
        AnimatorSet animatorSet = this.f50736b;
        if (animatorSet == null || !animatorSet.isRunning()) {
            m75085g();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m75085g() {
        setTranslationY(0.0f);
        float fM175859d = qa00.m175859d(37.0f);
        Property property = View.TRANSLATION_Y;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f50735a, (Property<VText, Float>) property, 0.0f, fM175859d);
        objectAnimatorOfFloat.setDuration(400L);
        Animator animatorM132164j = gt0.m132164j(2000);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f50735a, (Property<VText, Float>) property, fM175859d, 0.0f);
        objectAnimatorOfFloat2.setDuration(400L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f50736b = animatorSet;
        animatorSet.playSequentially(objectAnimatorOfFloat, animatorM132164j, objectAnimatorOfFloat2);
        gt0.m132177w(this.f50736b, new Runnable() { // from class: l.bd60
            @Override // java.lang.Runnable
            public final void run() {
                this.f76227a.m75082d();
            }
        }, new Runnable() { // from class: l.cd60
            @Override // java.lang.Runnable
            public final void run() {
                this.f81107a.m75083e();
            }
        });
        this.f50736b.start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75081c(this);
    }

    public PacketGiftActionTipsView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
