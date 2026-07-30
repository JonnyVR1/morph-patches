package com.p051p1.mobile.putong.live.livingroom.common.signin.medal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInMedal;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.izs;
import p153l.qa00;
import p153l.sx2;
import p153l.zft;

/* JADX INFO: loaded from: classes4.dex */
public class BigMedal extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final int f50186c = qa00.m175859d(128.0f);

    /* JADX INFO: renamed from: a */
    public VDraweeView f50187a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f50188b;

    public BigMedal(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m74426a(View view) {
        sx2.m188418a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m74427b(BLiveSignInMedal bLiveSignInMedal) {
        bnl0.m105524M(this.f50187a, bLiveSignInMedal.show);
        VDraweeView vDraweeView = this.f50188b;
        String str = bLiveSignInMedal.icon;
        int i = f50186c;
        izs.m142870u("context_livingAct", vDraweeView, str, i, i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74426a(this);
        izs.m142870u("context_livingAct", this.f50187a, zft.f204213h, qa00.m175859d(166.0f), qa00.m175859d(166.0f));
    }
}
