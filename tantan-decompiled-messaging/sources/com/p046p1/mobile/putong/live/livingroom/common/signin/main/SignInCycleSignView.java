package com.p046p1.mobile.putong.live.livingroom.common.signin.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInReward;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInTask;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.signin.C12769a;
import p147v.VDraweeView;
import p147v.VText;
import p149l.hxs;
import p149l.i3f0;
import p149l.t100;
import p149l.vwb;

/* JADX INFO: loaded from: classes4.dex */
public class SignInCycleSignView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AnimEffectPlayer f49299a;

    /* JADX INFO: renamed from: b */
    public VText f49300b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f49301c;

    /* JADX INFO: renamed from: d */
    public VText f49302d;

    /* JADX INFO: renamed from: e */
    public VText f49303e;

    public SignInCycleSignView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutParams(new ViewGroup.LayoutParams(t100.m186890d(116.0f), t100.m186890d(155.0f)));
    }

    /* JADX INFO: renamed from: b */
    public final void m73207b(View view) {
        i3f0.m134210a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m73208c(final BLiveSignInTask bLiveSignInTask, final C12769a c12769a) {
        this.f49300b.setText(String.format(getResources().getString(R$string.f46702Gd), bLiveSignInTask.title));
        if (!vwb.m200296J(bLiveSignInTask.rewards)) {
            BLiveSignInReward bLiveSignInReward = bLiveSignInTask.rewards.get(0);
            hxs.m133408u("context_livingAct", this.f49301c, bLiveSignInReward.icon, t100.m186890d(38.0f), t100.m186890d(38.0f));
            this.f49303e.setText(bLiveSignInReward.name + bLiveSignInReward.description);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.h3f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12769a c12769a2 = c12769a;
                BLiveSignInTask bLiveSignInTask2 = bLiveSignInTask;
                c12769a2.m73173q4(bLiveSignInTask2.rewards, bLiveSignInTask2.taskId);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49299a.m68500j("https://auto.tancdn.com/v1/raw/cd1dcb13-6e30-4fb6-9060-8831fd99bc0611.so", -1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73207b(this);
    }
}
