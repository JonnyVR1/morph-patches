package com.p000p1.mobile.putong.core.p004ui.aialbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import l.ng0;
import l.t100;
import l.xdl0;
import p006l.bkb0;
import p006l.qib0;
import v.VDraweeView;
import v.VImage;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AiAlbumResultItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public AiAlbumResultItemView f4478d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4479e;

    /* JADX INFO: renamed from: f */
    public VImage f4480f;

    /* JADX INFO: renamed from: g */
    public int f4481g;

    /* JADX INFO: renamed from: h */
    public int f4482h;

    public AiAlbumResultItemView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7234p(this);
        m7235q();
        xdl0.D0(this.f4481g, new View[]{this.f4478d});
        xdl0.C0(this.f4478d, this.f4482h);
    }

    /* JADX INFO: renamed from: p */
    public final void m7234p(View view) {
        ng0.a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public final void m7235q() {
        if (this.f4481g == 0 || this.f4482h == 0) {
            int iY0 = (xdl0.y0() - t100.v) / 2;
            this.f4481g = iY0;
            this.f4482h = (int) (iY0 * 1.27f);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m7236z(String str, boolean z) {
        m7235q();
        bkb0 bkb0Var = qib0.f19782G;
        VDraweeView vDraweeView = this.f4479e;
        int i = this.f4481g;
        int i2 = t100.i;
        bkb0Var.m12738I0(vDraweeView, str, i - i2, this.f4482h - i2);
        int iD = z ? t100.d(7.0f) : t100.f;
        this.f4479e.setPadding(iD, iD, iD, iD);
        this.f4479e.setSelected(z);
    }

    public AiAlbumResultItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AiAlbumResultItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
