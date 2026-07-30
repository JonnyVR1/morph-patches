package com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.nzo0;
import p153l.obc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceSweetErrorView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f54411d;

    /* JADX INFO: renamed from: e */
    public VText f54412e;

    /* JADX INFO: renamed from: f */
    public VText f54413f;

    public VoiceSweetErrorView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m79708h0(View view) {
        nzo0.m165391a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79708h0(this);
    }

    public void setStyle(boolean z) {
        VImage vImage = this.f54411d;
        if (z) {
            bnl0.m105526N(vImage, obc0.f146528va);
            bnl0.m105540X(this.f54413f, qa00.f156318e);
        } else {
            bnl0.m105526N(vImage, obc0.f146540wa);
            bnl0.m105540X(this.f54413f, qa00.f156316c);
        }
    }

    public void setSubTitle(String str) {
        this.f54413f.setText(str);
    }

    public VoiceSweetErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
