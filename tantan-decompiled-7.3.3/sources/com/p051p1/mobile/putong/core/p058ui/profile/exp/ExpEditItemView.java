package com.p051p1.mobile.putong.core.p058ui.profile.exp;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.lyh0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class ExpEditItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f33946a;

    /* JADX INFO: renamed from: b */
    public VText f33947b;

    /* JADX INFO: renamed from: c */
    public VText f33948c;

    /* JADX INFO: renamed from: d */
    public VImage f33949d;

    /* JADX INFO: renamed from: e */
    public ExpEditDividerView f33950e;

    public ExpEditItemView(@NonNull Context context) {
        super(context);
        m52010b();
    }

    /* JADX INFO: renamed from: a */
    public void m52009a() {
        this.f33948c.setText("");
    }

    /* JADX INFO: renamed from: b */
    public final void m52010b() {
        setOrientation(0);
        int i = qa00.f156330q;
        setPadding(i, 0, i, 0);
        setGravity(16);
        VImage vImage = new VImage(getContext());
        this.f33946a = vImage;
        int i2 = qa00.f156328o;
        addView(vImage, i2, i2);
        VText_Medium vText_Medium = new VText_Medium(getContext());
        this.f33947b = vText_Medium;
        vText_Medium.setTextSize(1, 16.0f);
        this.f33947b.setSingleLine();
        this.f33947b.setMaxLines(1);
        this.f33947b.setGravity(16);
        this.f33947b.setTextColor(getResources().getColor(c9c0.f80469x));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, bnl0.f77544e);
        layoutParams.weight = 1.0f;
        layoutParams.leftMargin = qa00.f156320g;
        addView(this.f33947b, layoutParams);
        VText vText = new VText(getContext());
        this.f33948c = vText;
        vText.setTextSize(1, 16.0f);
        this.f33948c.setGravity(16);
        this.f33948c.setMaxWidth(qa00.f156309V);
        this.f33948c.setSingleLine();
        this.f33948c.setMaxLines(1);
        this.f33948c.setEllipsize(TextUtils.TruncateAt.END);
        this.f33948c.setPadding(qa00.f156336w, 0, qa00.f156318e, 0);
        addView(this.f33948c, bnl0.f77545f, bnl0.f77544e);
        VImage vImage2 = new VImage(getContext());
        this.f33949d = vImage2;
        vImage2.setBackgroundResource(dbc0.f86773Ys);
        addView(this.f33949d, i2, i2);
    }

    /* JADX INFO: renamed from: c */
    public void m52011c(String str, int i) {
        if (i == 2) {
            this.f33948c.setTypeface(lyh0.m156283c(3), 0);
            this.f33948c.setTextColor(getResources().getColor(c9c0.f80472y));
        } else if (i == 1) {
            this.f33948c.setTypeface(Typeface.DEFAULT);
            this.f33948c.setTextColor(getResources().getColor(c9c0.f80475z));
        }
        this.f33948c.setText(str);
    }

    /* JADX INFO: renamed from: d */
    public void m52012d(String str, int i) {
        this.f33947b.setText(str);
        this.f33946a.setBackgroundResource(i);
    }

    public String getBlankTip() {
        return this.f33947b.getText().toString();
    }

    public ExpEditDividerView getDividerView() {
        if (this.f33950e == null) {
            this.f33950e = new ExpEditDividerView(getContext());
        }
        return this.f33950e;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(qa00.f156288A, 1073741824));
    }

    public void setRightIconRes(int i) {
        VImage vImage = this.f33949d;
        if (i == 0) {
            bnl0.m105524M(vImage, false);
        } else {
            bnl0.m105524M(vImage, true);
            this.f33949d.setBackgroundResource(i);
        }
    }

    public ExpEditItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m52010b();
    }

    public ExpEditItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m52010b();
    }
}
