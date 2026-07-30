package com.p051p1.mobile.putong.core.p058ui.settings.filter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p151v.VText;
import p153l.lyh0;
import p153l.p1i0;

/* JADX INFO: loaded from: classes12.dex */
public class TagGenderItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f36911a;

    public TagGenderItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m56548a(View view) {
        p1i0.m170207a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56548a(this);
    }

    public void setData(String str) {
        this.f36911a.setText(str);
        setSelected(isSelected());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f36911a.setSelected(z);
        VText vText = this.f36911a;
        if (z) {
            vText.setTypeface(lyh0.m156283c(3));
        } else {
            vText.setTypeface(lyh0.m156283c(2));
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
