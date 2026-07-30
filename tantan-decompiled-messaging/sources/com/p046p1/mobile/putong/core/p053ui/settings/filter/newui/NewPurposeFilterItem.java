package com.p046p1.mobile.putong.core.p053ui.settings.filter.newui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import p147v.VDraweeView;
import p147v.VText;
import p149l.eqh0;
import p149l.iuh0;
import p149l.qib0;
import p149l.t100;
import p149l.v740;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class NewPurposeFilterItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public NewPurposeFilterItem f36193a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f36194b;

    /* JADX INFO: renamed from: c */
    public VText f36195c;

    public NewPurposeFilterItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55495a(View view) {
        v740.m197334a(this, view);
    }

    public iuh0 getBindViewData() {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55495a(this);
        int iM208412y0 = (xdl0.m208412y0() - (t100.m186890d(35.0f) * 2)) / 3;
        xdl0.m208327D0(iM208412y0, this.f36193a);
        xdl0.m208325C0(this.f36193a, iM208412y0);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f36195c.setSelected(z);
        VText vText = this.f36195c;
        if (z) {
            vText.setTypeface(eqh0.m117752c(3));
        } else {
            vText.setTypeface(eqh0.m117752c(2));
        }
        String str = qib0.f154730s;
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
