package com.p000p1.mobile.putong.core.p001ui.profile.exp;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.ui.VText_Medium;
import l.eqh0;
import l.t100;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpEditItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f920a;

    /* JADX INFO: renamed from: b */
    public VText f921b;

    /* JADX INFO: renamed from: c */
    public VText f922c;

    /* JADX INFO: renamed from: d */
    public VImage f923d;

    /* JADX INFO: renamed from: e */
    public ExpEditDividerView f924e;

    public ExpEditItemView(@NonNull Context context) {
        super(context);
        m1273b();
    }

    /* JADX INFO: renamed from: a */
    public void m1272a() {
        this.f922c.setText("");
    }

    /* JADX INFO: renamed from: b */
    public final void m1273b() {
        setOrientation(0);
        int i = t100.q;
        setPadding(i, 0, i, 0);
        setGravity(16);
        View vImage = new VImage(getContext());
        this.f920a = vImage;
        int i2 = t100.o;
        addView(vImage, i2, i2);
        VText_Medium vText_Medium = new VText_Medium(getContext());
        this.f921b = vText_Medium;
        vText_Medium.setTextSize(1, 16.0f);
        this.f921b.setSingleLine();
        this.f921b.setMaxLines(1);
        this.f921b.setGravity(16);
        this.f921b.setTextColor(getResources().getColor(w0c0.x));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, xdl0.e);
        layoutParams.weight = 1.0f;
        layoutParams.leftMargin = t100.g;
        addView(this.f921b, layoutParams);
        VText vText = new VText(getContext());
        this.f922c = vText;
        vText.setTextSize(1, 16.0f);
        this.f922c.setGravity(16);
        this.f922c.setMaxWidth(t100.V);
        this.f922c.setSingleLine();
        this.f922c.setMaxLines(1);
        this.f922c.setEllipsize(TextUtils.TruncateAt.END);
        this.f922c.setPadding(t100.w, 0, t100.e, 0);
        addView(this.f922c, xdl0.f, xdl0.e);
        VImage vImage2 = new VImage(getContext());
        this.f923d = vImage2;
        vImage2.setBackgroundResource(x2c0.ks);
        addView(this.f923d, i2, i2);
    }

    /* JADX INFO: renamed from: c */
    public void m1274c(String str, int i) {
        if (i == 2) {
            this.f922c.setTypeface(eqh0.c(3), 0);
            this.f922c.setTextColor(getResources().getColor(w0c0.y));
        } else if (i == 1) {
            this.f922c.setTypeface(Typeface.DEFAULT);
            this.f922c.setTextColor(getResources().getColor(w0c0.z));
        }
        this.f922c.setText(str);
    }

    /* JADX INFO: renamed from: d */
    public void m1275d(String str, int i) {
        this.f921b.setText(str);
        this.f920a.setBackgroundResource(i);
    }

    public String getBlankTip() {
        return this.f921b.getText().toString();
    }

    public ExpEditDividerView getDividerView() {
        if (this.f924e == null) {
            this.f924e = new ExpEditDividerView(getContext());
        }
        return this.f924e;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(t100.A, 1073741824));
    }

    public void setRightIconRes(int i) {
        VImage vImage = this.f923d;
        if (i == 0) {
            xdl0.M(vImage, false);
        } else {
            xdl0.M(vImage, true);
            this.f923d.setBackgroundResource(i);
        }
    }

    public ExpEditItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m1273b();
    }

    public ExpEditItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1273b();
    }
}
