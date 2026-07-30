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
import l.xdl0;
import l.ydt;
import p002l.dx2;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class BigMedal extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final int f5380c = t100.d(128.0f);

    /* JADX INFO: renamed from: a */
    public VDraweeView f5381a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f5382b;

    public BigMedal(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m6773a(View view) {
        dx2.m12082a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m6774b(BLiveSignInMedal bLiveSignInMedal) {
        xdl0.M(this.f5381a, bLiveSignInMedal.show);
        VDraweeView vDraweeView = this.f5382b;
        String str = bLiveSignInMedal.icon;
        int i = f5380c;
        hxs.u("context_livingAct", vDraweeView, str, i, i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6773a(this);
        hxs.u("context_livingAct", this.f5381a, ydt.h, t100.d(166.0f), t100.d(166.0f));
    }
}
