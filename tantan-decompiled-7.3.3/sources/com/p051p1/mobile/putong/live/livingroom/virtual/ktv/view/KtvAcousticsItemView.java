package com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.bean.KtvAcousticsBean;
import p153l.bnl0;
import p153l.g2r;

/* JADX INFO: loaded from: classes5.dex */
public class KtvAcousticsItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public ImageView f53210d;

    /* JADX INFO: renamed from: e */
    public ImageView f53211e;

    /* JADX INFO: renamed from: f */
    public TextView f53212f;

    public KtvAcousticsItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m78211h0(View view) {
        g2r.m128637a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78211h0(this);
    }

    public void setData(KtvAcousticsBean ktvAcousticsBean) {
        this.f53210d.setImageResource(ktvAcousticsBean.pic);
        this.f53212f.setText(ktvAcousticsBean.name);
        bnl0.m105524M(this.f53211e, ktvAcousticsBean.isSelected);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        bnl0.m105524M(this.f53211e, z);
    }

    public KtvAcousticsItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public KtvAcousticsItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
