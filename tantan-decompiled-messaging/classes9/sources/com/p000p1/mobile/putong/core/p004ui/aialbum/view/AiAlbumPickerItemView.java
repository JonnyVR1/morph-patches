package com.p000p1.mobile.putong.core.p004ui.aialbum.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import l.eg0;
import l.t100;
import l.xdl0;
import p006l.jf0;
import p006l.qib0;
import p006l.x2c0;
import v.VDraweeView;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AiAlbumPickerItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public AiAlbumPickerItemView f4457d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4458e;

    /* JADX INFO: renamed from: f */
    public ImageView f4459f;

    /* JADX INFO: renamed from: g */
    public ImageView f4460g;

    public AiAlbumPickerItemView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7221p(this);
        int iY0 = (xdl0.y0() - t100.v) / 4;
        xdl0.D0(iY0, new View[]{this.f4457d});
        xdl0.C0(this.f4457d, (int) (iY0 * 1.28f));
    }

    /* JADX INFO: renamed from: p */
    public final void m7221p(View view) {
        eg0.a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m7222q(jf0 jf0Var) {
        qib0.f19782G.m12748N0(this.f4458e, TextUtils.isEmpty(jf0Var.f15132b) ? jf0Var.f15133c : jf0Var.f15132b, false);
        xdl0.M(this.f4460g, true);
        xdl0.M(this.f4459f, false);
        int i = jf0Var.f15131a;
        if (i == 1) {
            this.f4460g.setImageResource(x2c0.f26915n0);
        } else if (i != 2) {
            xdl0.M(this.f4460g, false);
        } else {
            xdl0.M(this.f4459f, true);
            this.f4460g.setImageResource(x2c0.f26851l0);
        }
    }

    public AiAlbumPickerItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AiAlbumPickerItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
