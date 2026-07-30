package com.google.android.exoplayer2.p031ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p153l.bmk0;
import p153l.fig0;
import p153l.myb;
import p153l.sg4;
import p153l.wdg0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public List<myb> f9432a;

    /* JADX INFO: renamed from: b */
    public sg4 f9433b;

    /* JADX INFO: renamed from: c */
    public int f9434c;

    /* JADX INFO: renamed from: d */
    public float f9435d;

    /* JADX INFO: renamed from: e */
    public float f9436e;

    /* JADX INFO: renamed from: f */
    public boolean f9437f;

    /* JADX INFO: renamed from: g */
    public boolean f9438g;

    /* JADX INFO: renamed from: h */
    public int f9439h;

    /* JADX INFO: renamed from: i */
    public InterfaceC2054a f9440i;

    /* JADX INFO: renamed from: j */
    public View f9441j;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.SubtitleView$a */
    public interface InterfaceC2054a {
        /* JADX INFO: renamed from: a */
        void mo11861a(List<myb> list, sg4 sg4Var, float f, int i, float f2);
    }

    public SubtitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9432a = Collections.EMPTY_LIST;
        this.f9433b = sg4.f167788g;
        this.f9434c = 0;
        this.f9435d = 0.0533f;
        this.f9436e = 0.08f;
        this.f9437f = true;
        this.f9438g = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context);
        this.f9440i = canvasSubtitleOutput;
        this.f9441j = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.f9439h = 1;
    }

    private List<myb> getCuesWithStylingPreferencesApplied() {
        if (this.f9437f && this.f9438g) {
            return this.f9432a;
        }
        ArrayList arrayList = new ArrayList(this.f9432a.size());
        for (int i = 0; i < this.f9432a.size(); i++) {
            arrayList.add(m12092a(this.f9432a.get(i)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (bmk0.f77313a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private sg4 getUserCaptionStyle() {
        if (bmk0.f77313a < 19 || isInEditMode()) {
            return sg4.f167788g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? sg4.f167788g : sg4.m185689a(captioningManager.getUserStyle());
    }

    private <T extends View & InterfaceC2054a> void setView(T t) {
        removeView(this.f9441j);
        View view = this.f9441j;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).m12115g();
        }
        this.f9441j = t;
        this.f9440i = t;
        addView(t);
    }

    /* JADX INFO: renamed from: a */
    public final myb m12092a(myb mybVar) {
        myb.C18746b c18746bM160753b = mybVar.m160753b();
        if (!this.f9437f) {
            wdg0.m205881c(c18746bM160753b);
        } else if (!this.f9438g) {
            wdg0.m205882d(c18746bM160753b);
        }
        return c18746bM160753b.m160754a();
    }

    /* JADX INFO: renamed from: b */
    public void m12093b(float f, boolean z) {
        m12094c(z ? 1 : 0, f);
    }

    /* JADX INFO: renamed from: c */
    public final void m12094c(int i, float f) {
        this.f9434c = i;
        this.f9435d = f;
        m12097f();
    }

    /* JADX INFO: renamed from: d */
    public void m12095d() {
        setStyle(getUserCaptionStyle());
    }

    /* JADX INFO: renamed from: e */
    public void m12096e() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    /* JADX INFO: renamed from: f */
    public final void m12097f() {
        this.f9440i.mo11861a(getCuesWithStylingPreferencesApplied(), this.f9433b, this.f9435d, this.f9434c, this.f9436e);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f9438g = z;
        m12097f();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f9437f = z;
        m12097f();
    }

    public void setBottomPaddingFraction(float f) {
        this.f9436e = f;
        m12097f();
    }

    public void setCues(@Nullable List<myb> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f9432a = list;
        m12097f();
    }

    public void setFractionalTextSize(float f) {
        m12093b(f, false);
    }

    public void setStyle(sg4 sg4Var) {
        this.f9433b = sg4Var;
        m12097f();
    }

    public void setViewType(int i) {
        if (this.f9439h == i) {
            return;
        }
        if (i == 1) {
            setView(new CanvasSubtitleOutput(getContext()));
        } else {
            if (i != 2) {
                fig0.m125680a();
                return;
            }
            setView(new WebViewSubtitleOutput(getContext()));
        }
        this.f9439h = i;
    }

    public SubtitleView(Context context) {
        this(context, null);
    }
}
