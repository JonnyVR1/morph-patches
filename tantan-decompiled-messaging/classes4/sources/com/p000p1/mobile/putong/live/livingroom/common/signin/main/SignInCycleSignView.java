package com.p000p1.mobile.putong.live.livingroom.common.signin.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.signin.C0358a;
import com.p1.mobile.putong.live.base.data.BLiveSignInReward;
import com.p1.mobile.putong.live.base.data.BLiveSignInTask;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.hxs;
import l.t100;
import l.vwb;
import p002l.i3f0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class SignInCycleSignView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AnimEffectPlayer f5341a;

    /* JADX INFO: renamed from: b */
    public VText f5342b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f5343c;

    /* JADX INFO: renamed from: d */
    public VText f5344d;

    /* JADX INFO: renamed from: e */
    public VText f5345e;

    public SignInCycleSignView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutParams(new ViewGroup.LayoutParams(t100.d(116.0f), t100.d(155.0f)));
    }

    /* JADX INFO: renamed from: b */
    public final void m6736b(View view) {
        i3f0.m14989a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m6737c(final BLiveSignInTask bLiveSignInTask, final C0358a c0358a) {
        this.f5342b.setText(String.format(getResources().getString(R$string.f2744Gd), bLiveSignInTask.title));
        if (!vwb.J(bLiveSignInTask.rewards)) {
            BLiveSignInReward bLiveSignInReward = (BLiveSignInReward) bLiveSignInTask.rewards.get(0);
            hxs.u("context_livingAct", this.f5343c, bLiveSignInReward.icon, t100.d(38.0f), t100.d(38.0f));
            this.f5345e.setText(bLiveSignInReward.name + bLiveSignInReward.description);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.h3f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0358a c0358a2 = c0358a;
                BLiveSignInTask bLiveSignInTask2 = bLiveSignInTask;
                c0358a2.m6701q4(bLiveSignInTask2.rewards, bLiveSignInTask2.taskId);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5341a.j("https://auto.tancdn.com/v1/raw/cd1dcb13-6e30-4fb6-9060-8831fd99bc0611.so", -1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6736b(this);
    }
}
