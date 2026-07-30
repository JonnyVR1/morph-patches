package com.p046p1.mobile.putong.core.p053ui.settings.filter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p147v.VText;
import p149l.eqh0;
import p149l.hth0;

/* JADX INFO: loaded from: classes9.dex */
public class TagGenderItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f36063a;

    public TagGenderItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55365a(View view) {
        hth0.m132866a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55365a(this);
    }

    public void setData(String str) {
        this.f36063a.setText(str);
        setSelected(isSelected());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f36063a.setSelected(z);
        VText vText = this.f36063a;
        if (z) {
            vText.setTypeface(eqh0.m117752c(3));
        } else {
            vText.setTypeface(eqh0.m117752c(2));
        }
        requestLayout();
    }

    public TagGenderItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TagGenderItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
