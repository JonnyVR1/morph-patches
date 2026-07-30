package com.p000p1.mobile.putong.live.livingroom.common.signin.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.live.base.data.BLiveSignInReward;
import com.p1.mobile.putong.live.base.data.BLiveSignInTask;
import l.hxs;
import l.t100;
import l.vwb;
import p002l.g3f0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class SignInCycleFurtherView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f5338a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f5339b;

    /* JADX INFO: renamed from: c */
    public VText f5340c;

    public SignInCycleFurtherView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(t100.d(62.0f), t100.d(94.0f));
        marginLayoutParams.topMargin = t100.t;
        setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: a */
    public final void m6733a(View view) {
        g3f0.m13545a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m6734b(BLiveSignInTask bLiveSignInTask) {
        this.f5338a.setText(String.format(getResources().getString(R$string.f2744Gd), bLiveSignInTask.title));
        if (vwb.J(bLiveSignInTask.rewards)) {
            return;
        }
        BLiveSignInReward bLiveSignInReward = (BLiveSignInReward) bLiveSignInTask.rewards.get(0);
        hxs.u("context_livingAct", this.f5339b, bLiveSignInReward.icon, t100.d(38.0f), t100.d(38.0f));
        this.f5340c.setText(bLiveSignInReward.name + bLiveSignInReward.description);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6733a(this);
    }
}
