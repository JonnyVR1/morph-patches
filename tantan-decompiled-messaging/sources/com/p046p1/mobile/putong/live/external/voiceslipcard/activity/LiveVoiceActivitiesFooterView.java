package com.p046p1.mobile.putong.live.external.voiceslipcard.activity;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.live.external.R$string;
import p147v.VRelative;
import p147v.VText;
import p149l.fpn0;
import p149l.mzu;
import p149l.w8u;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceActivitiesFooterView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VText f46427d;

    public LiveVoiceActivitiesFooterView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70977p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m70977p(View view) {
        mzu.m157169a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m70978q(boolean z, boolean z2) {
        this.f46427d.setTextColor(fpn0.m122612b(z2).mo108470j());
        VText vText = this.f46427d;
        if (z) {
            vText.setText(w8u.m202217t(R$string.f44921q));
        } else {
            vText.setText(w8u.m202218u(R$string.f44920p0, "30"));
        }
    }

    public LiveVoiceActivitiesFooterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceActivitiesFooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
