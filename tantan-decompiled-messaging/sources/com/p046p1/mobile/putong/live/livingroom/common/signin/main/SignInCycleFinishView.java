package com.p046p1.mobile.putong.live.livingroom.common.signin.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInTask;
import p149l.f3f0;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class SignInCycleFinishView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public SignInCycleFurtherView f49295a;

    public SignInCycleFinishView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(t100.m186890d(62.0f), t100.m186890d(94.0f));
        marginLayoutParams.topMargin = t100.f167271t;
        setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: a */
    public final void m73202a(View view) {
        f3f0.m119259a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m73203b(BLiveSignInTask bLiveSignInTask) {
        this.f49295a.m73205b(bLiveSignInTask);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73202a(this);
    }
}
