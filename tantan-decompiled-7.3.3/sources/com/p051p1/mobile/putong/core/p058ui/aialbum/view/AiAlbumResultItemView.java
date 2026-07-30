package com.p051p1.mobile.putong.core.p058ui.aialbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VRelative;
import p153l.bnl0;
import p153l.fsb0;
import p153l.jg0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes9.dex */
public class AiAlbumResultItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public AiAlbumResultItemView f29259d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f29260e;

    /* JADX INFO: renamed from: f */
    public VImage f29261f;

    /* JADX INFO: renamed from: g */
    public int f29262g;

    /* JADX INFO: renamed from: h */
    public int f29263h;

    public AiAlbumResultItemView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45461p(this);
        m45462q();
        bnl0.m105507D0(this.f29262g, this.f29259d);
        bnl0.m105505C0(this.f29259d, this.f29263h);
    }

    /* JADX INFO: renamed from: p */
    public final void m45461p(View view) {
        jg0.m144743a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public final void m45462q() {
        if (this.f29262g == 0 || this.f29263h == 0) {
            int iM105592y0 = (bnl0.m105592y0() - qa00.f156335v) / 2;
            this.f29262g = iM105592y0;
            this.f29263h = (int) (iM105592y0 * 1.27f);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m45463z(String str, boolean z) {
        m45462q();
        fsb0 fsb0Var = uqb0.f180374G;
        VDraweeView vDraweeView = this.f29260e;
        int i = this.f29262g;
        int i2 = qa00.f156322i;
        fsb0Var.m127109I0(vDraweeView, str, i - i2, this.f29263h - i2);
        int iM175859d = z ? qa00.m175859d(7.0f) : qa00.f156319f;
        this.f29260e.setPadding(iM175859d, iM175859d, iM175859d, iM175859d);
        this.f29260e.setSelected(z);
    }

    public AiAlbumResultItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AiAlbumResultItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
