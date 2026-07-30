package com.p046p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareTab;
import p147v.VRelative;
import p147v.VText;
import p149l.lor;
import p149l.rdt;
import p149l.s6c0;
import p149l.vwb;
import p149l.w7o;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveSquareTabView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VText f45853d;

    /* JADX INFO: renamed from: e */
    public VText f45854e;

    /* JADX INFO: renamed from: f */
    public VText f45855f;

    /* JADX INFO: renamed from: g */
    public ImageView f45856g;

    /* JADX INFO: renamed from: h */
    public BLiveSquareTab f45857h;

    /* JADX INFO: renamed from: i */
    public int f45858i;

    public IntlLiveSquareTabView(Context context, BLiveSquareTab bLiveSquareTab) {
        super(context);
        m70371p(View.inflate(context, s6c0.f162679K, this));
        setTag(bLiveSquareTab.name);
        this.f45857h = bLiveSquareTab;
        this.f45853d.setText(bLiveSquareTab.title);
        this.f45853d.setBackgroundColor(0);
        if ("square-suggested".equals(bLiveSquareTab.name)) {
            this.f45858i = 1;
        } else if (BLiveAbsData.VOICE_LIVE.equals(bLiveSquareTab.name)) {
            this.f45858i = 2;
        } else {
            this.f45858i = 4;
        }
    }

    /* JADX INFO: renamed from: I */
    private void m70364I(String str, String str2) {
        zvf0.m220399u("e_red_dot_live_icon", rdt.m179008c(str2), vwb.m200311Y("tooltips_type_ui", str));
    }

    /* JADX INFO: renamed from: L */
    private void m70365L(String str, String str2) {
        zvf0.m220368A("e_red_dot_live_icon", rdt.m179008c(str2), vwb.m200311Y("tooltips_type_ui", str));
    }

    /* JADX INFO: renamed from: O */
    private void m70366O(boolean z, String str, String str2) {
        if (z) {
            m70365L(str, str2);
        } else {
            m70365L(str, str2);
            m70364I(str, str2);
        }
    }

    /* JADX INFO: renamed from: B */
    public boolean m70367B() {
        return xdl0.m208349O0(this.f45856g) || xdl0.m208349O0(this.f45855f) || xdl0.m208349O0(this.f45854e);
    }

    /* JADX INFO: renamed from: H */
    public void m70368H(String str, boolean z) {
        VText vText = this.f45854e;
        if (vText != null && xdl0.m208349O0(vText)) {
            m70366O(z, "red_dot_figure", str);
            return;
        }
        ImageView imageView = this.f45856g;
        if (imageView == null || !xdl0.m208349O0(imageView)) {
            return;
        }
        m70366O(z, "red_dot_normal", str);
    }

    /* JADX INFO: renamed from: M */
    public void m70369M(String str, String str2) {
        View view;
        if ("red_dot_figure".equals(str2)) {
            view = !lor.m150800e() ? this.f45854e : this.f45856g;
        } else {
            view = this.f45855f;
        }
        if (view != null) {
            xdl0.m208345M0(view, true);
            if (view instanceof TextView) {
                ((TextView) view).setText(String.valueOf(str));
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public void m70370P(String str) {
        VText vText = this.f45854e;
        if (vText != null && xdl0.m208349O0(vText)) {
            rdt.m179012g("red_dot_figure", this.f45854e.getText().toString(), str);
            return;
        }
        VText vText2 = this.f45855f;
        if (vText2 != null && xdl0.m208349O0(vText2)) {
            rdt.m179012g("red_dot_word", "", str);
            return;
        }
        ImageView imageView = this.f45856g;
        if (imageView == null || !xdl0.m208349O0(imageView)) {
            return;
        }
        rdt.m179012g("red_dot_normal", "", str);
    }

    public String getTabID() {
        BLiveSquareTab bLiveSquareTab = this.f45857h;
        return bLiveSquareTab != null ? bLiveSquareTab.f44441id : "-2";
    }

    /* JADX INFO: renamed from: p */
    public final void m70371p(View view) {
        w7o.m202030a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m70372q() {
        xdl0.m208344M(this.f45855f, false);
    }

    public void setLiveRedDotNum(int i) {
        if (lor.m150800e()) {
            xdl0.m208344M(this.f45856g, i > 0);
        } else {
            this.f45854e.setText(String.valueOf(i));
            xdl0.m208344M(this.f45854e, i > 0);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m70373z() {
        VText vText = this.f45854e;
        if (vText != null && xdl0.m208349O0(vText)) {
            xdl0.m208344M(this.f45854e, false);
        }
        VText vText2 = this.f45855f;
        if (vText2 != null && xdl0.m208349O0(vText2)) {
            xdl0.m208344M(this.f45855f, false);
        }
        ImageView imageView = this.f45856g;
        if (imageView == null || !xdl0.m208349O0(imageView)) {
            return;
        }
        xdl0.m208344M(this.f45856g, false);
    }

    public IntlLiveSquareTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveSquareTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
