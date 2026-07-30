package com.p046p1.mobile.putong.live.livingroom.common.signin.medal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInMedal;
import p147v.VDraweeView;
import p149l.ckf0;
import p149l.hxs;
import p149l.i3c0;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class SmallMedal extends FrameLayout {

    /* JADX INFO: renamed from: b */
    public static final int f49363b = t100.m186890d(40.0f);

    /* JADX INFO: renamed from: a */
    public VDraweeView f49364a;

    public SmallMedal(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m73263a(View view) {
        ckf0.m107408a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m73264b(BLiveSignInMedal bLiveSignInMedal, boolean z) {
        setBackground(z ? getResources().getDrawable(i3c0.f110741I7) : null);
        VDraweeView vDraweeView = this.f49364a;
        String str = bLiveSignInMedal.icon;
        int i = f49363b;
        hxs.m133408u("context_livingAct", vDraweeView, str, i, i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73263a(this);
    }
}
