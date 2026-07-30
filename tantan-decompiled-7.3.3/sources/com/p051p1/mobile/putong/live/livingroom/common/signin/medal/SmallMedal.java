package com.p051p1.mobile.putong.live.livingroom.common.signin.medal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInMedal;
import p151v.VDraweeView;
import p153l.izs;
import p153l.lsf0;
import p153l.obc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class SmallMedal extends FrameLayout {

    /* JADX INFO: renamed from: b */
    public static final int f50211b = qa00.m175859d(40.0f);

    /* JADX INFO: renamed from: a */
    public VDraweeView f50212a;

    public SmallMedal(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m74446a(View view) {
        lsf0.m155687a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m74447b(BLiveSignInMedal bLiveSignInMedal, boolean z) {
        setBackground(z ? getResources().getDrawable(obc0.f146069I7) : null);
        VDraweeView vDraweeView = this.f50212a;
        String str = bLiveSignInMedal.icon;
        int i = f50211b;
        izs.m142870u("context_livingAct", vDraweeView, str, i, i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74446a(this);
    }
}
