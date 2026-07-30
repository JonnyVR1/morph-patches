package com.p051p1.mobile.putong.core.p058ui.profile.exp;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p151v.VImage;
import p153l.bnl0;
import p153l.dbc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class ExpOperationSquareButton extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f34011a;

    /* JADX INFO: renamed from: b */
    public VImage f34012b;

    public ExpOperationSquareButton(@NonNull Context context) {
        super(context);
        m52138a();
    }

    /* JADX INFO: renamed from: a */
    public final void m52138a() {
        VImage vImage = new VImage(getContext());
        this.f34012b = vImage;
        int i = bnl0.f77544e;
        addView(vImage, i, i);
        this.f34012b.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f34012b.setImageDrawable(getResources().getDrawable(dbc0.f86136F));
        this.f34011a = new VImage(getContext());
        int i2 = qa00.f156332s;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 17;
        addView(this.f34011a, layoutParams);
        int i3 = qa00.f156288A;
        bnl0.m105507D0(i3, this);
        bnl0.m105505C0(this, i3);
    }

    public void setGray(boolean z) {
        this.f34011a.setAlpha(z ? 0.3f : 1.0f);
    }

    public ExpOperationSquareButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m52138a();
    }

    public ExpOperationSquareButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m52138a();
    }
}
