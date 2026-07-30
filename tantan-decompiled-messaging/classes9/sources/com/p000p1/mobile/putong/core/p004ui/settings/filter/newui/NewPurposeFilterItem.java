package com.p000p1.mobile.putong.core.p004ui.settings.filter.newui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import l.eqh0;
import l.t100;
import l.v740;
import l.xdl0;
import p006l.iuh0;
import p006l.qib0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class NewPurposeFilterItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public NewPurposeFilterItem f5974a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f5975b;

    /* JADX INFO: renamed from: c */
    public VText f5976c;

    public NewPurposeFilterItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8878a(View view) {
        v740.a(this, view);
    }

    public iuh0 getBindViewData() {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8878a(this);
        int iY0 = (xdl0.y0() - (t100.d(35.0f) * 2)) / 3;
        xdl0.D0(iY0, new View[]{this.f5974a});
        xdl0.C0(this.f5974a, iY0);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f5976c.setSelected(z);
        VText vText = this.f5976c;
        if (z) {
            vText.setTypeface(eqh0.c(3));
        } else {
            vText.setTypeface(eqh0.c(2));
        }
        String str = qib0.f19821s;
        isSelected();
        throw null;
    }

    public NewPurposeFilterItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewPurposeFilterItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setData(iuh0 iuh0Var) {
    }
}
