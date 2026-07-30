package com.p046p1.mobile.putong.core.p053ui.profile.exp;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p147v.VImage;
import p149l.t100;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpOperationSquareButton extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f33163a;

    /* JADX INFO: renamed from: b */
    public VImage f33164b;

    public ExpOperationSquareButton(@NonNull Context context) {
        super(context);
        m50955a();
    }

    /* JADX INFO: renamed from: a */
    public final void m50955a() {
        VImage vImage = new VImage(getContext());
        this.f33164b = vImage;
        int i = xdl0.f192403e;
        addView(vImage, i, i);
        this.f33164b.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f33164b.setImageDrawable(getResources().getDrawable(x2c0.f189281E));
        this.f33163a = new VImage(getContext());
        int i2 = t100.f167270s;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 17;
        addView(this.f33163a, layoutParams);
        int i3 = t100.f167226A;
        xdl0.m208327D0(i3, this);
        xdl0.m208325C0(this, i3);
    }

    public void setGray(boolean z) {
        this.f33163a.setAlpha(z ? 0.3f : 1.0f);
    }

    public ExpOperationSquareButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m50955a();
    }

    public ExpOperationSquareButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m50955a();
    }
}
