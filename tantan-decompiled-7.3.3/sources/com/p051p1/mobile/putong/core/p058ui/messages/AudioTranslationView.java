package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.tantanapp.common.utils.NullChecker;
import p151v.VLinear_MaxWidth;
import p151v.VText;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.ibc0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class AudioTranslationView extends VLinear_MaxWidth {

    /* JADX INFO: renamed from: b */
    public VText f31530b;

    /* JADX INFO: renamed from: c */
    public ProgressBar f31531c;

    /* JADX INFO: renamed from: d */
    public int f31532d;

    /* JADX INFO: renamed from: e */
    public y20<Boolean> f31533e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.AudioTranslationView$a */
    public static class C8634a {
        /* JADX INFO: renamed from: b */
        public static void m49047b(AudioTranslationView audioTranslationView, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            audioTranslationView.f31530b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            audioTranslationView.f31531c = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        }
    }

    public AudioTranslationView(Context context) {
        super(context);
        this.f31532d = 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m49044c(View view) {
        C8634a.m49047b(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m49045d(String str) {
        setState(2);
        this.f31530b.setText(str);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49044c(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f31530b.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f31531c.setIndeterminateDrawable(getResources().getDrawable(ibc0.f114075m));
        }
    }

    public void setAudioViewVisibleCallback(y20<Boolean> y20Var) {
        this.f31533e = y20Var;
    }

    public void setState(int i) {
        int i2 = this.f31532d;
        this.f31532d = i;
        bnl0.m105524M(this, i != 0);
        if (NullChecker.m82486a(this.f31533e)) {
            this.f31533e.call(Boolean.valueOf(i != 0));
        }
        if (i == 0 || i == 2) {
            if (i2 == 1) {
                this.f31531c.setIndeterminate(false);
            }
            bnl0.m105524M(this.f31531c, false);
        } else {
            bnl0.m105524M(this.f31531c, true);
            this.f31531c.setIndeterminate(true);
        }
        bnl0.m105524M(this.f31530b, i == 2);
    }

    public AudioTranslationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31532d = 0;
    }

    public AudioTranslationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31532d = 0;
    }
}
