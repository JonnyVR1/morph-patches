package com.p051p1.mobile.putong.core.p058ui.growth.fakenew;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VImage;
import p151v.VText;
import p153l.ls90;

/* JADX INFO: loaded from: classes3.dex */
public class ProfileExampleItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f30386d;

    /* JADX INFO: renamed from: e */
    public VText f30387e;

    /* JADX INFO: renamed from: f */
    public VText f30388f;

    /* JADX INFO: renamed from: g */
    public VImage f30389g;

    /* JADX INFO: renamed from: h */
    public VImage f30390h;

    public ProfileExampleItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m47167h0(View view) {
        ls90.m155684a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47167h0(this);
    }

    public ProfileExampleItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProfileExampleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
