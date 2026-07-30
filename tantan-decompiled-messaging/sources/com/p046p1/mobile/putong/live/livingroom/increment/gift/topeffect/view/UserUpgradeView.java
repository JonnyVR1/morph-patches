package com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveUserUpgrade;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.bt0;
import p149l.d30;
import p149l.dt0;
import p149l.fak0;
import p149l.hxs;
import p149l.i3c0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class UserUpgradeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f50033a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f50034b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f50035c;

    /* JADX INFO: renamed from: d */
    public VText f50036d;

    /* JADX INFO: renamed from: e */
    public VText f50037e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f50038f;

    /* JADX INFO: renamed from: g */
    public VImage f50039g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f50040h;

    /* JADX INFO: renamed from: i */
    public AnimEffectPlayer f50041i;

    /* JADX INFO: renamed from: j */
    public AnimEffectPlayer f50042j;

    /* JADX INFO: renamed from: k */
    public AnimatorSet f50043k;

    public UserUpgradeView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m74111c(View view) {
        fak0.m120216a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m74112d() {
        dt0.m113503C(this.f50043k);
    }

    /* JADX INFO: renamed from: e */
    public boolean m74113e() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m74114f() {
        xdl0.m208344M(this, true);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m74115g(d30 d30Var) {
        xdl0.m208344M(this, false);
        d30Var.call();
    }

    /* JADX INFO: renamed from: h */
    public final void m74116h(final d30 d30Var) {
        this.f50042j.m68500j("https://auto.tancdn.com/v1/raw/64673fea-4f02-4f5e-9ef6-96f6de4c4d0d11.so", 1);
        this.f50041i.m68500j("https://auto.tancdn.com/v1/raw/4f9fe897-56cc-4fa8-86c4-f8aa02e2fd0011.so", -1);
        this.f50035c.m68500j("https://auto.tancdn.com/v1/raw/77cbc051-9a53-4a89-81c0-40c8f6fc7b1e11.so", -1);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f50034b, "translationY", -t100.m186890d(136.0f), 0.0f);
        objectAnimatorOfFloat.setDuration(650L);
        objectAnimatorOfFloat.setInterpolator(new OvershootInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f50034b, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(650L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f50033a, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat3.setDuration(650L);
        objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f50034b, "translationX", 1.0f, 0.9f, 1.2f, 1.0f);
        objectAnimatorOfFloat4.setDuration(500L);
        objectAnimatorOfFloat4.setInterpolator(new OvershootInterpolator());
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f50034b, "translationY", 1.0f, 0.9f, 1.2f, 1.0f);
        objectAnimatorOfFloat5.setDuration(500L);
        objectAnimatorOfFloat5.setInterpolator(new OvershootInterpolator());
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f50034b, "translationY", 0.0f, (float) (((double) t100.m186890d(136.0f)) * (-0.1d)), -t100.m186890d(136.0f));
        objectAnimatorOfFloat6.setDuration(500L);
        objectAnimatorOfFloat6.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat6.setStartDelay(2350L);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.f50034b, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat7.setDuration(500L);
        objectAnimatorOfFloat7.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat7.setStartDelay(2350L);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.f50033a, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat8.setDuration(500L);
        objectAnimatorOfFloat8.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat8.setStartDelay(2350L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f50043k = animatorSet;
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
        this.f50043k.play(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5);
        this.f50043k.play(objectAnimatorOfFloat6).with(objectAnimatorOfFloat7).with(objectAnimatorOfFloat8);
        this.f50043k.play(objectAnimatorOfFloat4).after(objectAnimatorOfFloat);
        this.f50043k.play(objectAnimatorOfFloat6).after(objectAnimatorOfFloat5);
        bt0.m103750w(this.f50043k, new Runnable() { // from class: l.dak0
            @Override // java.lang.Runnable
            public final void run() {
                this.f85238a.m74114f();
            }
        }, new Runnable() { // from class: l.eak0
            @Override // java.lang.Runnable
            public final void run() {
                this.f90211a.m74115g(d30Var);
            }
        });
        this.f50043k.start();
    }

    /* JADX INFO: renamed from: i */
    public void m74117i(BLiveUserUpgrade bLiveUserUpgrade, d30 d30Var) {
        m74118j(bLiveUserUpgrade);
        m74116h(d30Var);
    }

    /* JADX INFO: renamed from: j */
    public void m74118j(BLiveUserUpgrade bLiveUserUpgrade) {
        this.f50036d.setText(bLiveUserUpgrade.userName);
        hxs.m133407t("context_livingAct", this.f50040h, bLiveUserUpgrade.avatarUrl, t100.f167275x);
        BLiveUserLevel bLiveUserLevel = bLiveUserUpgrade.liveUserLevel;
        if (bLiveUserLevel != null) {
            hxs.m133406s("context_livingAct", this.f50038f, bLiveUserLevel.backendUrl);
        }
        this.f50037e.setText(R$string.f46796Kj);
        this.f50039g.setImageResource(i3c0.f110646A8);
        this.f50035c.setBackground(getContext().getResources().getDrawable(i3c0.f110658B8));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m74112d();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74111c(this);
    }

    public UserUpgradeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UserUpgradeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
