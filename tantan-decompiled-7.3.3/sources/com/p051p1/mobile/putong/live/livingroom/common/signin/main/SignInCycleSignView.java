package com.p051p1.mobile.putong.live.livingroom.common.signin.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInReward;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInTask;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.signin.C12932a;
import p151v.VDraweeView;
import p151v.VText;
import p153l.izs;
import p153l.jyb;
import p153l.pbf0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class SignInCycleSignView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AnimEffectPlayer f50147a;

    /* JADX INFO: renamed from: b */
    public VText f50148b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f50149c;

    /* JADX INFO: renamed from: d */
    public VText f50150d;

    /* JADX INFO: renamed from: e */
    public VText f50151e;

    public SignInCycleSignView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutParams(new ViewGroup.LayoutParams(qa00.m175859d(116.0f), qa00.m175859d(155.0f)));
    }

    /* JADX INFO: renamed from: b */
    public final void m74390b(View view) {
        pbf0.m171510a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m74391c(final BLiveSignInTask bLiveSignInTask, final C12932a c12932a) {
        this.f50148b.setText(String.format(getResources().getString(R$string.f47550Gd), bLiveSignInTask.title));
        if (!jyb.m147479J(bLiveSignInTask.rewards)) {
            BLiveSignInReward bLiveSignInReward = bLiveSignInTask.rewards.get(0);
            izs.m142870u("context_livingAct", this.f50149c, bLiveSignInReward.icon, qa00.m175859d(38.0f), qa00.m175859d(38.0f));
            this.f50151e.setText(bLiveSignInReward.name + bLiveSignInReward.description);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.obf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12932a c12932a2 = c12932a;
                BLiveSignInTask bLiveSignInTask2 = bLiveSignInTask;
                c12932a2.m74356q4(bLiveSignInTask2.rewards, bLiveSignInTask2.taskId);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50147a.m69683j("https://auto.tancdn.com/v1/raw/cd1dcb13-6e30-4fb6-9060-8831fd99bc0611.so", -1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74390b(this);
    }
}
