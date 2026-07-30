package com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VImage;
import p147v.VText;
import p149l.i3c0;
import p149l.jqo0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceSweetErrorView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f53563d;

    /* JADX INFO: renamed from: e */
    public VText f53564e;

    /* JADX INFO: renamed from: f */
    public VText f53565f;

    public VoiceSweetErrorView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m78525h0(View view) {
        jqo0.m142829a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78525h0(this);
    }

    public void setStyle(boolean z) {
        VImage vImage = this.f53563d;
        if (z) {
            xdl0.m208346N(vImage, i3c0.f111200va);
            xdl0.m208360X(this.f53565f, t100.f167256e);
        } else {
            xdl0.m208346N(vImage, i3c0.f111212wa);
            xdl0.m208360X(this.f53565f, t100.f167254c);
        }
    }

    public void setSubTitle(String str) {
        this.f53565f.setText(str);
    }

    public VoiceSweetErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
