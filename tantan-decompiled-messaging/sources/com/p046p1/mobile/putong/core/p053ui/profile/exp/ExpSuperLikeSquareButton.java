package com.p046p1.mobile.putong.core.p053ui.profile.exp;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.upa;
import p149l.x2c0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpSuperLikeSquareButton extends ExpOperationSquareButton {
    public ExpSuperLikeSquareButton(@NonNull Context context) {
        super(context);
        m50957b();
    }

    /* JADX INFO: renamed from: b */
    public void m50957b() {
        if (upa.m194665L3()) {
            setBackgroundResource(x2c0.f189287E5);
            this.f33163a.setImageDrawable(getResources().getDrawable(x2c0.f190185gs));
        } else {
            this.f33163a.setImageDrawable(getResources().getDrawable(x2c0.f189394Hh));
            setBackgroundResource(x2c0.f189299Eh);
        }
    }

    public ExpSuperLikeSquareButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m50957b();
    }

    public ExpSuperLikeSquareButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m50957b();
    }
}
