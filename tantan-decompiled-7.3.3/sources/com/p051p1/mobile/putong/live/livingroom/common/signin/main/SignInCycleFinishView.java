package com.p051p1.mobile.putong.live.livingroom.common.signin.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInTask;
import p153l.mbf0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class SignInCycleFinishView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public SignInCycleFurtherView f50143a;

    public SignInCycleFinishView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(qa00.m175859d(62.0f), qa00.m175859d(94.0f));
        marginLayoutParams.topMargin = qa00.f156333t;
        setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: a */
    public final void m74385a(View view) {
        mbf0.m157774a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m74386b(BLiveSignInTask bLiveSignInTask) {
        this.f50143a.m74388b(bLiveSignInTask);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74385a(this);
    }
}
