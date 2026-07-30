package com.p046p1.mobile.putong.core.p053ui.aialbum.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import p147v.VDraweeView;
import p147v.VRelative;
import p149l.eg0;
import p149l.jf0;
import p149l.qib0;
import p149l.t100;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class AiAlbumPickerItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public AiAlbumPickerItemView f28390d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f28391e;

    /* JADX INFO: renamed from: f */
    public ImageView f28392f;

    /* JADX INFO: renamed from: g */
    public ImageView f28393g;

    public AiAlbumPickerItemView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44265p(this);
        int iM208412y0 = (xdl0.m208412y0() - t100.f167273v) / 4;
        xdl0.m208327D0(iM208412y0, this.f28390d);
        xdl0.m208325C0(this.f28390d, (int) (iM208412y0 * 1.28f));
    }

    /* JADX INFO: renamed from: p */
    public final void m44265p(View view) {
        eg0.m116114a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m44266q(jf0 jf0Var) {
        qib0.f154691G.m102335N0(this.f28391e, TextUtils.isEmpty(jf0Var.f117621b) ? jf0Var.f117622c : jf0Var.f117621b, false);
        xdl0.m208344M(this.f28393g, true);
        xdl0.m208344M(this.f28392f, false);
        int i = jf0Var.f117620a;
        if (i == 1) {
            this.f28393g.setImageResource(x2c0.f190379n0);
        } else if (i != 2) {
            xdl0.m208344M(this.f28393g, false);
        } else {
            xdl0.m208344M(this.f28392f, true);
            this.f28393g.setImageResource(x2c0.f190315l0);
        }
    }

    public AiAlbumPickerItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AiAlbumPickerItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
