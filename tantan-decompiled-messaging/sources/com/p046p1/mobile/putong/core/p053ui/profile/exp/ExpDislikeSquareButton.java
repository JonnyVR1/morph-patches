package com.p046p1.mobile.putong.core.p053ui.profile.exp;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p147v.VImage;
import p149l.upa;
import p149l.x2c0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpDislikeSquareButton extends ExpOperationSquareButton {
    public ExpDislikeSquareButton(@NonNull Context context) {
        super(context);
        m50825b();
    }

    /* JADX INFO: renamed from: b */
    public void m50825b() {
        boolean zM194665L3 = upa.m194665L3();
        VImage vImage = this.f33163a;
        if (zM194665L3) {
            vImage.setImageDrawable(getResources().getDrawable(x2c0.f189331Fh));
            setBackgroundResource(x2c0.f189235Ch);
        } else {
            vImage.setImageDrawable(getResources().getDrawable(x2c0.f189331Fh));
            setBackgroundResource(x2c0.f189235Ch);
        }
    }

    public ExpDislikeSquareButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m50825b();
    }

    public ExpDislikeSquareButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m50825b();
    }
}
