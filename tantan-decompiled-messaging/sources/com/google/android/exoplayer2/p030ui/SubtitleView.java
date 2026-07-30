package com.google.android.exoplayer2.p030ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p149l.o5g0;
import p149l.tf4;
import p149l.vck0;
import p149l.x9g0;
import p149l.ywb;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public List<ywb> f9395a;

    /* JADX INFO: renamed from: b */
    public tf4 f9396b;

    /* JADX INFO: renamed from: c */
    public int f9397c;

    /* JADX INFO: renamed from: d */
    public float f9398d;

    /* JADX INFO: renamed from: e */
    public float f9399e;

    /* JADX INFO: renamed from: f */
    public boolean f9400f;

    /* JADX INFO: renamed from: g */
    public boolean f9401g;

    /* JADX INFO: renamed from: h */
    public int f9402h;

    /* JADX INFO: renamed from: i */
    public InterfaceC2031a f9403i;

    /* JADX INFO: renamed from: j */
    public View f9404j;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.SubtitleView$a */
    public interface InterfaceC2031a {
        /* JADX INFO: renamed from: a */
        void mo11807a(List<ywb> list, tf4 tf4Var, float f, int i, float f2);
    }

    public SubtitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9395a = Collections.EMPTY_LIST;
        this.f9396b = tf4.f169938g;
        this.f9397c = 0;
        this.f9398d = 0.0533f;
        this.f9399e = 0.08f;
        this.f9400f = true;
        this.f9401g = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context);
        this.f9403i = canvasSubtitleOutput;
        this.f9404j = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.f9402h = 1;
    }

    private List<ywb> getCuesWithStylingPreferencesApplied() {
        if (this.f9400f && this.f9401g) {
            return this.f9395a;
        }
        ArrayList arrayList = new ArrayList(this.f9395a.size());
        for (int i = 0; i < this.f9395a.size(); i++) {
            arrayList.add(m12038a(this.f9395a.get(i)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (vck0.f180948a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private tf4 getUserCaptionStyle() {
        if (vck0.f180948a < 19 || isInEditMode()) {
            return tf4.f169938g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? tf4.f169938g : tf4.m188648a(captioningManager.getUserStyle());
    }

    private <T extends View & InterfaceC2031a> void setView(T t) {
        removeView(this.f9404j);
        View view = this.f9404j;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).m12061g();
        }
        this.f9404j = t;
        this.f9403i = t;
        addView(t);
    }

    /* JADX INFO: renamed from: a */
    public final ywb m12038a(ywb ywbVar) {
        ywb.C21557b c21557bM216310b = ywbVar.m216310b();
        if (!this.f9400f) {
            o5g0.m162783c(c21557bM216310b);
        } else if (!this.f9401g) {
            o5g0.m162784d(c21557bM216310b);
        }
        return c21557bM216310b.m216311a();
    }

    /* JADX INFO: renamed from: b */
    public void m12039b(float f, boolean z) {
        m12040c(z ? 1 : 0, f);
    }

    /* JADX INFO: renamed from: c */
    public final void m12040c(int i, float f) {
        this.f9397c = i;
        this.f9398d = f;
        m12043f();
    }

    /* JADX INFO: renamed from: d */
    public void m12041d() {
        setStyle(getUserCaptionStyle());
    }

    /* JADX INFO: renamed from: e */
    public void m12042e() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    /* JADX INFO: renamed from: f */
    public final void m12043f() {
        this.f9403i.mo11807a(getCuesWithStylingPreferencesApplied(), this.f9396b, this.f9398d, this.f9397c, this.f9399e);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f9401g = z;
        m12043f();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f9400f = z;
        m12043f();
    }

    public void setBottomPaddingFraction(float f) {
        this.f9399e = f;
        m12043f();
    }

    public void setCues(@Nullable List<ywb> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f9395a = list;
        m12043f();
    }

    public void setFractionalTextSize(float f) {
        m12039b(f, false);
    }

    public void setStyle(tf4 tf4Var) {
        this.f9396b = tf4Var;
        m12043f();
    }

    public void setViewType(int i) {
        if (this.f9402h == i) {
            return;
        }
        if (i == 1) {
            setView(new CanvasSubtitleOutput(getContext()));
        } else {
            if (i != 2) {
                x9g0.m207497a();
                return;
            }
            setView(new WebViewSubtitleOutput(getContext()));
        }
        this.f9402h = i;
    }

    public SubtitleView(Context context) {
        this(context, null);
    }
}
