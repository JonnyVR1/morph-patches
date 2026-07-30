package com.p000p1.mobile.putong.live.livingroom.common.signin.medal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveSignInMedal;
import l.hxs;
import l.t100;
import p002l.ckf0;
import p002l.i3c0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class SmallMedal extends FrameLayout {

    /* JADX INFO: renamed from: b */
    public static final int f5405b = t100.d(40.0f);

    /* JADX INFO: renamed from: a */
    public VDraweeView f5406a;

    public SmallMedal(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m6798a(View view) {
        ckf0.m11101a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m6799b(BLiveSignInMedal bLiveSignInMedal, boolean z) {
        setBackground(z ? getResources().getDrawable(i3c0.f12526I7) : null);
        VDraweeView vDraweeView = this.f5406a;
        String str = bLiveSignInMedal.icon;
        int i = f5405b;
        hxs.u("context_livingAct", vDraweeView, str, i, i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6798a(this);
    }
}
