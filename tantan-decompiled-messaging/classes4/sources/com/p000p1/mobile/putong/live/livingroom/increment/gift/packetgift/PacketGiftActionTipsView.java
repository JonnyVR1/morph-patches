package com.p000p1.mobile.putong.live.livingroom.increment.gift.packetgift;

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
import com.p000p1.mobile.putong.live.livingroom.R$string;
import l.bgv;
import l.bt0;
import l.fld0;
import l.t100;
import l.xdl0;
import l.ypv;
import p002l.x460;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class PacketGiftActionTipsView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f5929a;

    /* JADX INFO: renamed from: b */
    public AnimatorSet f5930b;

    public PacketGiftActionTipsView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m7454c(View view) {
        x460.m25680a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m7455d() {
        xdl0.M(this, true);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m7456e() {
        xdl0.M(this, false);
        ((bgv) ypv.l(fld0.f)).B();
    }

    /* JADX INFO: renamed from: f */
    public void m7457f() {
        this.f5929a.setText(R$string.f3473oa);
        AnimatorSet animatorSet = this.f5930b;
        if (animatorSet == null || !animatorSet.isRunning()) {
            m7458g();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7458g() {
        setTranslationY(0.0f);
        float fD = t100.d(37.0f);
        Property property = View.TRANSLATION_Y;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f5929a, (Property<VText, Float>) property, 0.0f, fD);
        objectAnimatorOfFloat.setDuration(400L);
        Animator animatorJ = bt0.j(2000);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f5929a, (Property<VText, Float>) property, fD, 0.0f);
        objectAnimatorOfFloat2.setDuration(400L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f5930b = animatorSet;
        animatorSet.playSequentially(objectAnimatorOfFloat, animatorJ, objectAnimatorOfFloat2);
        bt0.w(this.f5930b, new Runnable() { // from class: l.v460
            @Override // java.lang.Runnable
            public final void run() {
                this.f20945a.m7455d();
            }
        }, new Runnable() { // from class: l.w460
            @Override // java.lang.Runnable
            public final void run() {
                this.f21436a.m7456e();
            }
        });
        this.f5930b.start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7454c(this);
    }

    public PacketGiftActionTipsView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
