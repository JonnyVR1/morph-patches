package com.p000p1.mobile.putong.core.p001ui.profile.exp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.upa;
import l.x2c0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpLikeSquareButton extends ExpOperationSquareButton {
    public ExpLikeSquareButton(@NonNull Context context) {
        super(context);
        m1400b();
    }

    /* JADX INFO: renamed from: b */
    public void m1400b() {
        boolean zL3 = upa.L3();
        VImage vImage = this.f985a;
        if (!zL3) {
            vImage.setImageDrawable(getResources().getDrawable(x2c0.Gh));
            setBackgroundResource(x2c0.Dh);
        } else {
            vImage.setImageDrawable((Drawable) null);
            this.f985a.setImageDrawable(getResources().getDrawable(x2c0.cs));
            setBackgroundResource(x2c0.D5);
        }
    }

    public ExpLikeSquareButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m1400b();
    }

    public ExpLikeSquareButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1400b();
    }
}
