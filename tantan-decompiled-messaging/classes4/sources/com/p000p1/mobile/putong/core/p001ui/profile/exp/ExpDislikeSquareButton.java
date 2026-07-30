package com.p000p1.mobile.putong.core.p001ui.profile.exp;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.upa;
import l.x2c0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpDislikeSquareButton extends ExpOperationSquareButton {
    public ExpDislikeSquareButton(@NonNull Context context) {
        super(context);
        m1271b();
    }

    /* JADX INFO: renamed from: b */
    public void m1271b() {
        boolean zL3 = upa.L3();
        VImage vImage = this.f985a;
        if (zL3) {
            vImage.setImageDrawable(getResources().getDrawable(x2c0.Fh));
            setBackgroundResource(x2c0.Ch);
        } else {
            vImage.setImageDrawable(getResources().getDrawable(x2c0.Fh));
            setBackgroundResource(x2c0.Ch);
        }
    }

    public ExpDislikeSquareButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m1271b();
    }

    public ExpDislikeSquareButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1271b();
    }
}
