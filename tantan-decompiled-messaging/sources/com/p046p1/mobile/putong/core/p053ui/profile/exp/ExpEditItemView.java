package com.p046p1.mobile.putong.core.p053ui.profile.exp;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import p147v.VImage;
import p147v.VText;
import p149l.eqh0;
import p149l.t100;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpEditItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f33098a;

    /* JADX INFO: renamed from: b */
    public VText f33099b;

    /* JADX INFO: renamed from: c */
    public VText f33100c;

    /* JADX INFO: renamed from: d */
    public VImage f33101d;

    /* JADX INFO: renamed from: e */
    public ExpEditDividerView f33102e;

    public ExpEditItemView(@NonNull Context context) {
        super(context);
        m50827b();
    }

    /* JADX INFO: renamed from: a */
    public void m50826a() {
        this.f33100c.setText("");
    }

    /* JADX INFO: renamed from: b */
    public final void m50827b() {
        setOrientation(0);
        int i = t100.f167268q;
        setPadding(i, 0, i, 0);
        setGravity(16);
        VImage vImage = new VImage(getContext());
        this.f33098a = vImage;
        int i2 = t100.f167266o;
        addView(vImage, i2, i2);
        VText_Medium vText_Medium = new VText_Medium(getContext());
        this.f33099b = vText_Medium;
        vText_Medium.setTextSize(1, 16.0f);
        this.f33099b.setSingleLine();
        this.f33099b.setMaxLines(1);
        this.f33099b.setGravity(16);
        this.f33099b.setTextColor(getResources().getColor(w0c0.f183899x));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, xdl0.f192403e);
        layoutParams.weight = 1.0f;
        layoutParams.leftMargin = t100.f167258g;
        addView(this.f33099b, layoutParams);
        VText vText = new VText(getContext());
        this.f33100c = vText;
        vText.setTextSize(1, 16.0f);
        this.f33100c.setGravity(16);
        this.f33100c.setMaxWidth(t100.f167247V);
        this.f33100c.setSingleLine();
        this.f33100c.setMaxLines(1);
        this.f33100c.setEllipsize(TextUtils.TruncateAt.END);
        this.f33100c.setPadding(t100.f167274w, 0, t100.f167256e, 0);
        addView(this.f33100c, xdl0.f192404f, xdl0.f192403e);
        VImage vImage2 = new VImage(getContext());
        this.f33101d = vImage2;
        vImage2.setBackgroundResource(x2c0.f190311ks);
        addView(this.f33101d, i2, i2);
    }

    /* JADX INFO: renamed from: c */
    public void m50828c(String str, int i) {
        if (i == 2) {
            this.f33100c.setTypeface(eqh0.m117752c(3), 0);
            this.f33100c.setTextColor(getResources().getColor(w0c0.f183902y));
        } else if (i == 1) {
            this.f33100c.setTypeface(Typeface.DEFAULT);
            this.f33100c.setTextColor(getResources().getColor(w0c0.f183905z));
        }
        this.f33100c.setText(str);
    }

    /* JADX INFO: renamed from: d */
    public void m50829d(String str, int i) {
        this.f33099b.setText(str);
        this.f33098a.setBackgroundResource(i);
    }

    public String getBlankTip() {
        return this.f33099b.getText().toString();
    }

    public ExpEditDividerView getDividerView() {
        if (this.f33102e == null) {
            this.f33102e = new ExpEditDividerView(getContext());
        }
        return this.f33102e;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(t100.f167226A, 1073741824));
    }

    public void setRightIconRes(int i) {
        VImage vImage = this.f33101d;
        if (i == 0) {
            xdl0.m208344M(vImage, false);
        } else {
            xdl0.m208344M(vImage, true);
            this.f33101d.setBackgroundResource(i);
        }
    }

    public ExpEditItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m50827b();
    }

    public ExpEditItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m50827b();
    }
}
