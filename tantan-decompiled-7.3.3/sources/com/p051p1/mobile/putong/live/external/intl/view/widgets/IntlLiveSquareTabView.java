package com.p051p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareTab;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.i4g0;
import p153l.jyb;
import p153l.mqr;
import p153l.sft;
import p153l.w9o;
import p153l.xec0;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveSquareTabView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VText f46701d;

    /* JADX INFO: renamed from: e */
    public VText f46702e;

    /* JADX INFO: renamed from: f */
    public VText f46703f;

    /* JADX INFO: renamed from: g */
    public ImageView f46704g;

    /* JADX INFO: renamed from: h */
    public BLiveSquareTab f46705h;

    /* JADX INFO: renamed from: i */
    public int f46706i;

    public IntlLiveSquareTabView(Context context, BLiveSquareTab bLiveSquareTab) {
        super(context);
        m71554p(View.inflate(context, xec0.f193793K, this));
        setTag(bLiveSquareTab.name);
        this.f46705h = bLiveSquareTab;
        this.f46701d.setText(bLiveSquareTab.title);
        this.f46701d.setBackgroundColor(0);
        if ("square-suggested".equals(bLiveSquareTab.name)) {
            this.f46706i = 1;
        } else if (BLiveAbsData.VOICE_LIVE.equals(bLiveSquareTab.name)) {
            this.f46706i = 2;
        } else {
            this.f46706i = 4;
        }
    }

    /* JADX INFO: renamed from: I */
    private void m71547I(String str, String str2) {
        i4g0.m138523u("e_red_dot_live_icon", sft.m185665c(str2), jyb.m147494Y("tooltips_type_ui", str));
    }

    /* JADX INFO: renamed from: L */
    private void m71548L(String str, String str2) {
        i4g0.m138492A("e_red_dot_live_icon", sft.m185665c(str2), jyb.m147494Y("tooltips_type_ui", str));
    }

    /* JADX INFO: renamed from: O */
    private void m71549O(boolean z, String str, String str2) {
        if (z) {
            m71548L(str, str2);
        } else {
            m71548L(str, str2);
            m71547I(str, str2);
        }
    }

    /* JADX INFO: renamed from: B */
    public boolean m71550B() {
        return bnl0.m105529O0(this.f46704g) || bnl0.m105529O0(this.f46703f) || bnl0.m105529O0(this.f46702e);
    }

    /* JADX INFO: renamed from: H */
    public void m71551H(String str, boolean z) {
        VText vText = this.f46702e;
        if (vText != null && bnl0.m105529O0(vText)) {
            m71549O(z, "red_dot_figure", str);
            return;
        }
        ImageView imageView = this.f46704g;
        if (imageView == null || !bnl0.m105529O0(imageView)) {
            return;
        }
        m71549O(z, "red_dot_normal", str);
    }

    /* JADX INFO: renamed from: M */
    public void m71552M(String str, String str2) {
        View view;
        if ("red_dot_figure".equals(str2)) {
            view = !mqr.m159585e() ? this.f46702e : this.f46704g;
        } else {
            view = this.f46703f;
        }
        if (view != null) {
            bnl0.m105525M0(view, true);
            if (view instanceof TextView) {
                ((TextView) view).setText(String.valueOf(str));
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public void m71553P(String str) {
        VText vText = this.f46702e;
        if (vText != null && bnl0.m105529O0(vText)) {
            sft.m185669g("red_dot_figure", this.f46702e.getText().toString(), str);
            return;
        }
        VText vText2 = this.f46703f;
        if (vText2 != null && bnl0.m105529O0(vText2)) {
            sft.m185669g("red_dot_word", "", str);
            return;
        }
        ImageView imageView = this.f46704g;
        if (imageView == null || !bnl0.m105529O0(imageView)) {
            return;
        }
        sft.m185669g("red_dot_normal", "", str);
    }

    public String getTabID() {
        BLiveSquareTab bLiveSquareTab = this.f46705h;
        return bLiveSquareTab != null ? bLiveSquareTab.f45289id : "-2";
    }

    /* JADX INFO: renamed from: p */
    public final void m71554p(View view) {
        w9o.m205606a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m71555q() {
        bnl0.m105524M(this.f46703f, false);
    }

    public void setLiveRedDotNum(int i) {
        if (mqr.m159585e()) {
            bnl0.m105524M(this.f46704g, i > 0);
        } else {
            this.f46702e.setText(String.valueOf(i));
            bnl0.m105524M(this.f46702e, i > 0);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m71556z() {
        VText vText = this.f46702e;
        if (vText != null && bnl0.m105529O0(vText)) {
            bnl0.m105524M(this.f46702e, false);
        }
        VText vText2 = this.f46703f;
        if (vText2 != null && bnl0.m105529O0(vText2)) {
            bnl0.m105524M(this.f46703f, false);
        }
        ImageView imageView = this.f46704g;
        if (imageView == null || !bnl0.m105529O0(imageView)) {
            return;
        }
        bnl0.m105524M(this.f46704g, false);
    }

    public IntlLiveSquareTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveSquareTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
