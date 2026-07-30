package com.p046p1.mobile.putong.core.p053ui.profile.exp;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p147v.VImage;
import p149l.upa;
import p149l.x2c0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLikeSquareButton extends ExpOperationSquareButton {
    public ExpLikeSquareButton(@NonNull Context context) {
        super(context);
        m50952b();
    }

    /* JADX INFO: renamed from: b */
    public void m50952b() {
        boolean zM194665L3 = upa.m194665L3();
        VImage vImage = this.f33163a;
        if (!zM194665L3) {
            vImage.setImageDrawable(getResources().getDrawable(x2c0.f189363Gh));
            setBackgroundResource(x2c0.f189267Dh);
        } else {
            vImage.setImageDrawable(null);
            this.f33163a.setImageDrawable(getResources().getDrawable(x2c0.f190058cs));
            setBackgroundResource(x2c0.f189255D5);
        }
    }

    public ExpLikeSquareButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m50952b();
    }

    public ExpLikeSquareButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m50952b();
    }
}
