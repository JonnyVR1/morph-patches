package com.p051p1.mobile.putong.core.p058ui.settings.filter.newui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.jg40;
import p153l.lyh0;
import p153l.q2i0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
public class NewPurposeFilterItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public NewPurposeFilterItem f37041a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f37042b;

    /* JADX INFO: renamed from: c */
    public VText f37043c;

    public NewPurposeFilterItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m56678a(View view) {
        jg40.m144752a(this, view);
    }

    public q2i0 getBindViewData() {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56678a(this);
        int iM105592y0 = (bnl0.m105592y0() - (qa00.m175859d(35.0f) * 2)) / 3;
        bnl0.m105507D0(iM105592y0, this.f37041a);
        bnl0.m105505C0(this.f37041a, iM105592y0);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f37043c.setSelected(z);
        VText vText = this.f37043c;
        if (z) {
            vText.setTypeface(lyh0.m156283c(3));
        } else {
            vText.setTypeface(lyh0.m156283c(2));
        }
        String str = uqb0.f180413s;
        isSelected();
        throw null;
    }

    public NewPurposeFilterItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewPurposeFilterItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setData(q2i0 q2i0Var) {
    }
}
