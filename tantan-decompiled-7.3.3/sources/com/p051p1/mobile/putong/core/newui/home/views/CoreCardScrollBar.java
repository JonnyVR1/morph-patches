package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p151v.VFrame;
import p153l.adc0;
import p153l.bnl0;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class CoreCardScrollBar extends VFrame {

    /* JADX INFO: renamed from: a */
    public View f24596a;

    /* JADX INFO: renamed from: b */
    public View f24597b;

    /* JADX INFO: renamed from: c */
    public float f24598c;

    public CoreCardScrollBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24598c = qa00.m175859d(1.5f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f24596a = findViewById(adc0.f70237Za);
        this.f24597b = findViewById(adc0.f70254ab);
        bnl0.m105540X(this.f24596a, (int) this.f24598c);
    }

    public void setProgress(float f) {
        View view = this.f24596a;
        if (view == null || this.f24597b == null) {
            return;
        }
        int height = view.getHeight() - (this.f24597b.getHeight() - ((int) (this.f24598c * 2.0f)));
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.f24597b.setTranslationY(height * f);
    }

    public CoreCardScrollBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public CoreCardScrollBar(Context context) {
        this(context, null);
    }
}
