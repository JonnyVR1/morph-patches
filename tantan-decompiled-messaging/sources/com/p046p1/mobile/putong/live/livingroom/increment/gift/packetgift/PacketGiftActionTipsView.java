package com.p046p1.mobile.putong.live.livingroom.increment.gift.packetgift;

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
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VText;
import p149l.bgv;
import p149l.bt0;
import p149l.fld0;
import p149l.t100;
import p149l.x460;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class PacketGiftActionTipsView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f49887a;

    /* JADX INFO: renamed from: b */
    public AnimatorSet f49888b;

    public PacketGiftActionTipsView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m73898c(View view) {
        x460.m206959a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m73899d() {
        xdl0.m208344M(this, true);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m73900e() {
        xdl0.m208344M(this, false);
        ((bgv) ypv.m215673l(fld0.f98151f)).m101714B();
    }

    /* JADX INFO: renamed from: f */
    public void m73901f() {
        this.f49887a.setText(R$string.f47431oa);
        AnimatorSet animatorSet = this.f49888b;
        if (animatorSet == null || !animatorSet.isRunning()) {
            m73902g();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m73902g() {
        setTranslationY(0.0f);
        float fM186890d = t100.m186890d(37.0f);
        Property property = View.TRANSLATION_Y;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49887a, (Property<VText, Float>) property, 0.0f, fM186890d);
        objectAnimatorOfFloat.setDuration(400L);
        Animator animatorM103737j = bt0.m103737j(2000);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f49887a, (Property<VText, Float>) property, fM186890d, 0.0f);
        objectAnimatorOfFloat2.setDuration(400L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f49888b = animatorSet;
        animatorSet.playSequentially(objectAnimatorOfFloat, animatorM103737j, objectAnimatorOfFloat2);
        bt0.m103750w(this.f49888b, new Runnable() { // from class: l.v460
            @Override // java.lang.Runnable
            public final void run() {
                this.f179883a.m73899d();
            }
        }, new Runnable() { // from class: l.w460
            @Override // java.lang.Runnable
            public final void run() {
                this.f184478a.m73900e();
            }
        });
        this.f49888b.start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73898c(this);
    }

    public PacketGiftActionTipsView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
