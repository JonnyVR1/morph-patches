package com.p046p1.mobile.putong.live.external.page.rights.list.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p147v.VText;
import p149l.q2d0;
import p149l.r2d0;

/* JADX INFO: loaded from: classes13.dex */
public class RightEquipTextItemView extends VText {

    /* JADX INFO: renamed from: i */
    public RightEquipTextItemView f46076i;

    public RightEquipTextItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l */
    public final void m70614l(View view) {
        r2d0.m177598a(this, view);
    }

    /* JADX INFO: renamed from: o */
    public void m70615o(q2d0 q2d0Var) {
        this.f46076i.setText(q2d0Var.m172435H());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70614l(this);
    }

    public RightEquipTextItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RightEquipTextItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
