package com.p051p1.mobile.putong.core.p058ui.profile.exp;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p151v.VImage;
import p153l.dbc0;
import p153l.gra;

/* JADX INFO: loaded from: classes4.dex */
public class ExpDislikeSquareButton extends ExpOperationSquareButton {
    public ExpDislikeSquareButton(@NonNull Context context) {
        super(context);
        m52008b();
    }

    /* JADX INFO: renamed from: b */
    public void m52008b() {
        boolean zM131596L3 = gra.m131596L3();
        VImage vImage = this.f34011a;
        if (zM131596L3) {
            vImage.setImageDrawable(getResources().getDrawable(dbc0.f87451ti));
            setBackgroundResource(dbc0.f87352qi);
        } else {
            vImage.setImageDrawable(getResources().getDrawable(dbc0.f87451ti));
            setBackgroundResource(dbc0.f87352qi);
        }
    }

    public ExpDislikeSquareButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m52008b();
    }

    public ExpDislikeSquareButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m52008b();
    }
}
