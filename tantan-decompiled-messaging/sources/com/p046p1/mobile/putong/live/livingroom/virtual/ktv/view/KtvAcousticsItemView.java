package com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.bean.KtvAcousticsBean;
import p149l.f0r;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class KtvAcousticsItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public ImageView f52362d;

    /* JADX INFO: renamed from: e */
    public ImageView f52363e;

    /* JADX INFO: renamed from: f */
    public TextView f52364f;

    public KtvAcousticsItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m77028h0(View view) {
        f0r.m119042a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77028h0(this);
    }

    public void setData(KtvAcousticsBean ktvAcousticsBean) {
        this.f52362d.setImageResource(ktvAcousticsBean.pic);
        this.f52364f.setText(ktvAcousticsBean.name);
        xdl0.m208344M(this.f52363e, ktvAcousticsBean.isSelected);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        xdl0.m208344M(this.f52363e, z);
    }

    public KtvAcousticsItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public KtvAcousticsItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
