package com.p000p1.mobile.putong.core.p001ui.profile.exp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.t100;
import l.x2c0;
import l.xdl0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpOperationSquareButton extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f985a;

    /* JADX INFO: renamed from: b */
    public VImage f986b;

    public ExpOperationSquareButton(@NonNull Context context) {
        super(context);
        m1403a();
    }

    /* JADX INFO: renamed from: a */
    public final void m1403a() {
        VImage vImage = new VImage(getContext());
        this.f986b = vImage;
        int i = xdl0.e;
        addView((View) vImage, i, i);
        this.f986b.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f986b.setImageDrawable(getResources().getDrawable(x2c0.E));
        this.f985a = new VImage(getContext());
        int i2 = t100.s;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 17;
        addView((View) this.f985a, (ViewGroup.LayoutParams) layoutParams);
        int i3 = t100.A;
        xdl0.D0(i3, new View[]{this});
        xdl0.C0(this, i3);
    }

    public void setGray(boolean z) {
        this.f985a.setAlpha(z ? 0.3f : 1.0f);
    }

    public ExpOperationSquareButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m1403a();
    }

    public ExpOperationSquareButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1403a();
    }
}
