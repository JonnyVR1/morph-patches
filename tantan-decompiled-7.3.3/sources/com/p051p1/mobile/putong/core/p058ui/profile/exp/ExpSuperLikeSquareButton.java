package com.p051p1.mobile.putong.core.p058ui.profile.exp;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.dbc0;
import p153l.gra;

/* JADX INFO: loaded from: classes4.dex */
public class ExpSuperLikeSquareButton extends ExpOperationSquareButton {
    public ExpSuperLikeSquareButton(@NonNull Context context) {
        super(context);
        m52140b();
    }

    /* JADX INFO: renamed from: b */
    public void m52140b() {
        if (gra.m131596L3()) {
            setBackgroundResource(dbc0.f86142F5);
            this.f34011a.setImageDrawable(getResources().getDrawable(dbc0.f86645Us));
        } else {
            this.f34011a.setImageDrawable(getResources().getDrawable(dbc0.f87516vi));
            setBackgroundResource(dbc0.f87418si);
        }
    }

    public ExpSuperLikeSquareButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m52140b();
    }

    public ExpSuperLikeSquareButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m52140b();
    }
}
