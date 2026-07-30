package com.p000p1.mobile.putong.core.p001ui.profile.exp;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.upa;
import l.x2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpSuperLikeSquareButton extends ExpOperationSquareButton {
    public ExpSuperLikeSquareButton(@NonNull Context context) {
        super(context);
        m1405b();
    }

    /* JADX INFO: renamed from: b */
    public void m1405b() {
        if (upa.L3()) {
            setBackgroundResource(x2c0.E5);
            this.f985a.setImageDrawable(getResources().getDrawable(x2c0.gs));
        } else {
            this.f985a.setImageDrawable(getResources().getDrawable(x2c0.Hh));
            setBackgroundResource(x2c0.Eh);
        }
    }

    public ExpSuperLikeSquareButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m1405b();
    }

    public ExpSuperLikeSquareButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1405b();
    }
}
