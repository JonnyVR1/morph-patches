package com.p051p1.mobile.putong.live.livingroom.common.signin.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInReward;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInTask;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;
import p151v.VText;
import p153l.izs;
import p153l.jyb;
import p153l.nbf0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class SignInCycleFurtherView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f50144a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f50145b;

    /* JADX INFO: renamed from: c */
    public VText f50146c;

    public SignInCycleFurtherView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(qa00.m175859d(62.0f), qa00.m175859d(94.0f));
        marginLayoutParams.topMargin = qa00.f156333t;
        setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: a */
    public final void m74387a(View view) {
        nbf0.m162169a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m74388b(BLiveSignInTask bLiveSignInTask) {
        this.f50144a.setText(String.format(getResources().getString(R$string.f47550Gd), bLiveSignInTask.title));
        if (jyb.m147479J(bLiveSignInTask.rewards)) {
            return;
        }
        BLiveSignInReward bLiveSignInReward = bLiveSignInTask.rewards.get(0);
        izs.m142870u("context_livingAct", this.f50145b, bLiveSignInReward.icon, qa00.m175859d(38.0f), qa00.m175859d(38.0f));
        this.f50146c.setText(bLiveSignInReward.name + bLiveSignInReward.description);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74387a(this);
    }
}
