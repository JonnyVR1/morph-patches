package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.tantanapp.common.utils.NullChecker;
import p147v.VLinear_MaxWidth;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.e30;
import p149l.ura;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class AudioTranslationView extends VLinear_MaxWidth {

    /* JADX INFO: renamed from: b */
    public VText f30682b;

    /* JADX INFO: renamed from: c */
    public ProgressBar f30683c;

    /* JADX INFO: renamed from: d */
    public int f30684d;

    /* JADX INFO: renamed from: e */
    public e30<Boolean> f30685e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.AudioTranslationView$a */
    public static class C8471a {
        /* JADX INFO: renamed from: b */
        public static void m47864b(AudioTranslationView audioTranslationView, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            audioTranslationView.f30682b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            audioTranslationView.f30683c = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        }
    }

    public AudioTranslationView(Context context) {
        super(context);
        this.f30684d = 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m47861c(View view) {
        C8471a.m47864b(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m47862d(String str) {
        setState(2);
        this.f30682b.setText(str);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47861c(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f30682b.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f30683c.setIndeterminateDrawable(getResources().getDrawable(c3c0.f78800m));
        }
    }

    public void setAudioViewVisibleCallback(e30<Boolean> e30Var) {
        this.f30685e = e30Var;
    }

    public void setState(int i) {
        int i2 = this.f30684d;
        this.f30684d = i;
        xdl0.m208344M(this, i != 0);
        if (NullChecker.m81303a(this.f30685e)) {
            this.f30685e.call(Boolean.valueOf(i != 0));
        }
        if (i == 0 || i == 2) {
            if (i2 == 1) {
                this.f30683c.setIndeterminate(false);
            }
            xdl0.m208344M(this.f30683c, false);
        } else {
            xdl0.m208344M(this.f30683c, true);
            this.f30683c.setIndeterminate(true);
        }
        xdl0.m208344M(this.f30682b, i == 2);
    }

    public AudioTranslationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30684d = 0;
    }

    public AudioTranslationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30684d = 0;
    }
}
