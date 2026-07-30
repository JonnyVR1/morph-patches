package com.p051p1.mobile.putong.live.external.voiceslipcard.activity;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.live.external.R$string;
import p151v.VRelative;
import p151v.VText;
import p153l.jyn0;
import p153l.n1v;
import p153l.xau;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVoiceActivitiesFooterView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VText f47275d;

    public LiveVoiceActivitiesFooterView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72160p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m72160p(View view) {
        n1v.m161146a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m72161q(boolean z, boolean z2) {
        this.f47275d.setTextColor(jyn0.m147605b(z2).mo187680j());
        VText vText = this.f47275d;
        if (z) {
            vText.setText(xau.m209910t(R$string.f45769q));
        } else {
            vText.setText(xau.m209911u(R$string.f45768p0, "30"));
        }
    }

    public LiveVoiceActivitiesFooterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceActivitiesFooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
