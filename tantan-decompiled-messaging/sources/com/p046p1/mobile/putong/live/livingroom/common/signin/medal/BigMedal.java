package com.p046p1.mobile.putong.live.livingroom.common.signin.medal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInMedal;
import p147v.VDraweeView;
import p149l.dx2;
import p149l.hxs;
import p149l.t100;
import p149l.xdl0;
import p149l.ydt;

/* JADX INFO: loaded from: classes4.dex */
public class BigMedal extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final int f49338c = t100.m186890d(128.0f);

    /* JADX INFO: renamed from: a */
    public VDraweeView f49339a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f49340b;

    public BigMedal(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m73243a(View view) {
        dx2.m113966a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m73244b(BLiveSignInMedal bLiveSignInMedal) {
        xdl0.m208344M(this.f49339a, bLiveSignInMedal.show);
        VDraweeView vDraweeView = this.f49340b;
        String str = bLiveSignInMedal.icon;
        int i = f49338c;
        hxs.m133408u("context_livingAct", vDraweeView, str, i, i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73243a(this);
        hxs.m133408u("context_livingAct", this.f49339a, ydt.f197618h, t100.m186890d(166.0f), t100.m186890d(166.0f));
    }
}
