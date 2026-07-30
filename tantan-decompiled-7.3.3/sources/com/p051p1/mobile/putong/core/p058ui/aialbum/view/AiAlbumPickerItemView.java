package com.p051p1.mobile.putong.core.p058ui.aialbum.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import p151v.VDraweeView;
import p151v.VRelative;
import p153l.ag0;
import p153l.bnl0;
import p153l.dbc0;
import p153l.ff0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes9.dex */
public class AiAlbumPickerItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public AiAlbumPickerItemView f29238d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f29239e;

    /* JADX INFO: renamed from: f */
    public ImageView f29240f;

    /* JADX INFO: renamed from: g */
    public ImageView f29241g;

    public AiAlbumPickerItemView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45448p(this);
        int iM105592y0 = (bnl0.m105592y0() - qa00.f156335v) / 4;
        bnl0.m105507D0(iM105592y0, this.f29238d);
        bnl0.m105505C0(this.f29238d, (int) (iM105592y0 * 1.28f));
    }

    /* JADX INFO: renamed from: p */
    public final void m45448p(View view) {
        ag0.m97575a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m45449q(ff0 ff0Var) {
        uqb0.f180374G.m127119N0(this.f29239e, TextUtils.isEmpty(ff0Var.f98729b) ? ff0Var.f98730c : ff0Var.f98729b, false);
        bnl0.m105524M(this.f29241g, true);
        bnl0.m105524M(this.f29240f, false);
        int i = ff0Var.f98728a;
        if (i == 1) {
            this.f29241g.setImageResource(dbc0.f87268o0);
        } else if (i != 2) {
            bnl0.m105524M(this.f29241g, false);
        } else {
            bnl0.m105524M(this.f29240f, true);
            this.f29241g.setImageResource(dbc0.f87202m0);
        }
    }

    public AiAlbumPickerItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AiAlbumPickerItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
