package com.p046p1.mobile.putong.core.p053ui.aialbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VRelative;
import p149l.bkb0;
import p149l.ng0;
import p149l.qib0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class AiAlbumResultItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public AiAlbumResultItemView f28411d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f28412e;

    /* JADX INFO: renamed from: f */
    public VImage f28413f;

    /* JADX INFO: renamed from: g */
    public int f28414g;

    /* JADX INFO: renamed from: h */
    public int f28415h;

    public AiAlbumResultItemView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44278p(this);
        m44279q();
        xdl0.m208327D0(this.f28414g, this.f28411d);
        xdl0.m208325C0(this.f28411d, this.f28415h);
    }

    /* JADX INFO: renamed from: p */
    public final void m44278p(View view) {
        ng0.m159291a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public final void m44279q() {
        if (this.f28414g == 0 || this.f28415h == 0) {
            int iM208412y0 = (xdl0.m208412y0() - t100.f167273v) / 2;
            this.f28414g = iM208412y0;
            this.f28415h = (int) (iM208412y0 * 1.27f);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m44280z(String str, boolean z) {
        m44279q();
        bkb0 bkb0Var = qib0.f154691G;
        VDraweeView vDraweeView = this.f28412e;
        int i = this.f28414g;
        int i2 = t100.f167260i;
        bkb0Var.m102325I0(vDraweeView, str, i - i2, this.f28415h - i2);
        int iM186890d = z ? t100.m186890d(7.0f) : t100.f167257f;
        this.f28412e.setPadding(iM186890d, iM186890d, iM186890d, iM186890d);
        this.f28412e.setSelected(z);
    }

    public AiAlbumResultItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AiAlbumResultItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
