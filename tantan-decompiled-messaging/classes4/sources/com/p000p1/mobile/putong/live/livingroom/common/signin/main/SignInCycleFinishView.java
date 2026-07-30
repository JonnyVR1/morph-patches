package com.p000p1.mobile.putong.live.livingroom.common.signin.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveSignInTask;
import l.t100;
import p002l.f3f0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class SignInCycleFinishView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public SignInCycleFurtherView f5337a;

    public SignInCycleFinishView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(t100.d(62.0f), t100.d(94.0f));
        marginLayoutParams.topMargin = t100.t;
        setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: a */
    public final void m6731a(View view) {
        f3f0.m12930a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m6732b(BLiveSignInTask bLiveSignInTask) {
        this.f5337a.m6734b(bLiveSignInTask);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6731a(this);
    }
}
