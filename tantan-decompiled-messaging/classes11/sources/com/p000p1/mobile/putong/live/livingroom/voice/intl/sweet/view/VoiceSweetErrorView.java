package com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.i3c0;
import l.jqo0;
import l.t100;
import l.xdl0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceSweetErrorView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f7169d;

    /* JADX INFO: renamed from: e */
    public VText f7170e;

    /* JADX INFO: renamed from: f */
    public VText f7171f;

    public VoiceSweetErrorView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m8736h0(View view) {
        jqo0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8736h0(this);
    }

    public void setStyle(boolean z) {
        VImage vImage = this.f7169d;
        if (z) {
            xdl0.N(vImage, i3c0.va);
            xdl0.X(this.f7171f, t100.e);
        } else {
            xdl0.N(vImage, i3c0.wa);
            xdl0.X(this.f7171f, t100.c);
        }
    }

    public void setSubTitle(String str) {
        this.f7171f.setText(str);
    }

    public VoiceSweetErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
