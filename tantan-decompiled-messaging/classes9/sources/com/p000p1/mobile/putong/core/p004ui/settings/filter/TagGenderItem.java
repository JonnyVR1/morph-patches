package com.p000p1.mobile.putong.core.p004ui.settings.filter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import l.eqh0;
import l.hth0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TagGenderItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f5844a;

    public TagGenderItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8738a(View view) {
        hth0.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8738a(this);
    }

    public void setData(String str) {
        this.f5844a.setText(str);
        setSelected(isSelected());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f5844a.setSelected(z);
        VText vText = this.f5844a;
        if (z) {
            vText.setTypeface(eqh0.c(3));
        } else {
            vText.setTypeface(eqh0.c(2));
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
