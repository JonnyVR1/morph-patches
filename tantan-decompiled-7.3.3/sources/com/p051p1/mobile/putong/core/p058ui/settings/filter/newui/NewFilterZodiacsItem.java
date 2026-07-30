package com.p051p1.mobile.putong.core.p058ui.settings.filter.newui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p151v.VText;
import p153l.gta;
import p153l.j9c0;
import p153l.kbc0;
import p153l.lyh0;
import p153l.mz20;
import p153l.qa00;
import p153l.t2i0;
import p153l.tu0;

/* JADX INFO: loaded from: classes12.dex */
public class NewFilterZodiacsItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f37038a;

    /* JADX INFO: renamed from: b */
    public VText f37039b;

    /* JADX INFO: renamed from: c */
    public t2i0 f37040c;

    public NewFilterZodiacsItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m56677a(View view) {
        mz20.m160877a(this, view);
    }

    public t2i0 getBindViewData() {
        return this.f37040c;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56677a(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f37039b.setTextColor(getContext().getResources().getColorStateList(j9c0.f118873j));
            setBackgroundResource(kbc0.f124891m1);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = qa00.m175859d(99.0f);
            layoutParams.height = qa00.m175859d(99.0f);
            setLayoutParams(layoutParams);
        }
    }

    public void setData(t2i0 t2i0Var) {
        if (t2i0Var == null) {
            return;
        }
        this.f37040c = t2i0Var;
        this.f37039b.setText(t2i0Var.f171766d);
        this.f37038a.setImageDrawable(tu0.m192702b(getContext(), this.f37040c.f171767e));
        setSelected(isSelected());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f37039b.setSelected(z);
        VText vText = this.f37039b;
        if (z) {
            vText.setTypeface(lyh0.m156283c(3));
        } else {
            vText.setTypeface(lyh0.m156283c(2));
        }
        requestLayout();
    }

    public NewFilterZodiacsItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewFilterZodiacsItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
