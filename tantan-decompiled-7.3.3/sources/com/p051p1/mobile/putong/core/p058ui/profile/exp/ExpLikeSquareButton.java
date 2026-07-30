package com.p051p1.mobile.putong.core.p058ui.profile.exp;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p151v.VImage;
import p153l.dbc0;
import p153l.gra;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLikeSquareButton extends ExpOperationSquareButton {
    public ExpLikeSquareButton(@NonNull Context context) {
        super(context);
        m52135b();
    }

    /* JADX INFO: renamed from: b */
    public void m52135b() {
        boolean zM131596L3 = gra.m131596L3();
        VImage vImage = this.f34011a;
        if (!zM131596L3) {
            vImage.setImageDrawable(getResources().getDrawable(dbc0.f87484ui));
            setBackgroundResource(dbc0.f87385ri);
        } else {
            vImage.setImageDrawable(null);
            this.f34011a.setImageDrawable(getResources().getDrawable(dbc0.f86517Qs));
            setBackgroundResource(dbc0.f86110E5);
        }
    }

    public ExpLikeSquareButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m52135b();
    }

    public ExpLikeSquareButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m52135b();
    }
}
