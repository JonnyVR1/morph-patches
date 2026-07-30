package com.p046p1.mobile.putong.live.livingroom.common.signin.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInReward;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInTask;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;
import p147v.VText;
import p149l.g3f0;
import p149l.hxs;
import p149l.t100;
import p149l.vwb;

/* JADX INFO: loaded from: classes4.dex */
public class SignInCycleFurtherView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f49296a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f49297b;

    /* JADX INFO: renamed from: c */
    public VText f49298c;

    public SignInCycleFurtherView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(t100.m186890d(62.0f), t100.m186890d(94.0f));
        marginLayoutParams.topMargin = t100.f167271t;
        setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: a */
    public final void m73204a(View view) {
        g3f0.m124266a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m73205b(BLiveSignInTask bLiveSignInTask) {
        this.f49296a.setText(String.format(getResources().getString(R$string.f46702Gd), bLiveSignInTask.title));
        if (vwb.m200296J(bLiveSignInTask.rewards)) {
            return;
        }
        BLiveSignInReward bLiveSignInReward = bLiveSignInTask.rewards.get(0);
        hxs.m133408u("context_livingAct", this.f49297b, bLiveSignInReward.icon, t100.m186890d(38.0f), t100.m186890d(38.0f));
        this.f49298c.setText(bLiveSignInReward.name + bLiveSignInReward.description);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73204a(this);
    }
}
