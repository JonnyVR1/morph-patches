package com.p051p1.mobile.putong.live.external.page.rights.list.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p151v.VText;
import p153l.tad0;
import p153l.uad0;

/* JADX INFO: loaded from: classes9.dex */
public class RightEquipTextItemView extends VText {

    /* JADX INFO: renamed from: i */
    public RightEquipTextItemView f46924i;

    public RightEquipTextItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l */
    public final void m71797l(View view) {
        uad0.m195165a(this, view);
    }

    /* JADX INFO: renamed from: o */
    public void m71798o(tad0 tad0Var) {
        this.f46924i.setText(tad0Var.m189836H());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71797l(this);
    }

    public RightEquipTextItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RightEquipTextItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
