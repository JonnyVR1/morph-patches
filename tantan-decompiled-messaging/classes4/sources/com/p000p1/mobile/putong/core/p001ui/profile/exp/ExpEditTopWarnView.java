package com.p000p1.mobile.putong.core.p001ui.profile.exp;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.ui.VText_Medium;
import l.mep0;
import l.t100;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import v.AutoVDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpEditTopWarnView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f973a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f974b;

    /* JADX INFO: renamed from: c */
    public VText f975c;

    /* JADX INFO: renamed from: d */
    public AutoVDraweeView f976d;

    public ExpEditTopWarnView(@NonNull Context context) {
        super(context);
        m1392a();
    }

    /* JADX INFO: renamed from: a */
    public final void m1392a() {
        VText_Medium vText_Medium = new VText_Medium(getContext());
        this.f973a = vText_Medium;
        vText_Medium.setCompoundDrawablePadding(t100.h);
        this.f973a.setGravity(17);
        this.f973a.setTextSize(1, 13.0f);
        this.f973a.setTextColor(getContext().getResources().getColor(w0c0.x));
        addView(this.f973a);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f974b = linearLayout;
        linearLayout.setOrientation(0);
        this.f974b.setShowDividers(2);
        this.f974b.setDividerPadding(t100.e);
        this.f974b.setGravity(16);
        int i = xdl0.f;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 21;
        layoutParams.rightMargin = t100.q;
        addView(this.f974b, layoutParams);
        VText vText = new VText(getContext());
        this.f975c = vText;
        vText.setTextSize(1, 13.0f);
        this.f975c.setTextColor(getContext().getResources().getColor(w0c0.x));
        this.f974b.addView(this.f975c);
        View view = new View(getContext());
        int i2 = t100.n;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i2, i2);
        view.setBackgroundResource(x2c0.ls);
        this.f974b.addView(view, layoutParams2);
        mep0.d1(this, t100.m);
    }

    /* JADX INFO: renamed from: b */
    public final void m1393b() {
        xdl0.M(this.f974b, false);
        this.f973a.setGravity(17);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f973a.getLayoutParams();
        int i = xdl0.f;
        layoutParams.width = i;
        layoutParams.height = i;
        layoutParams.gravity = 17;
        int i2 = t100.o;
        layoutParams.leftMargin = i2;
        layoutParams.rightMargin = i2;
        this.f973a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public void m1394c(String str, int i, int i2) {
        m1393b();
        this.f973a.setText(str);
        this.f973a.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        AutoVDraweeView autoVDraweeView = this.f976d;
        if (autoVDraweeView != null) {
            xdl0.M(autoVDraweeView, false);
        }
        if (i2 != 0) {
            setBackgroundResource(i2);
        } else {
            setBackgroundResource(x2c0.L6);
        }
        setOnClickListener(null);
    }

    /* JADX INFO: renamed from: d */
    public final void m1395d() {
        xdl0.M(this.f974b, true);
        this.f973a.setGravity(19);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f973a.getLayoutParams();
        int i = xdl0.f;
        layoutParams.width = i;
        layoutParams.height = i;
        layoutParams.gravity = 19;
        layoutParams.leftMargin = t100.q;
        layoutParams.rightMargin = t100.O;
        this.f973a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: e */
    public void m1396e(String str, String str2, int i, String str3) {
        m1395d();
        this.f973a.setText(str);
        this.f973a.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        this.f975c.setText(str2);
        boolean zIsEmpty = TextUtils.isEmpty(str3);
        AutoVDraweeView autoVDraweeView = this.f976d;
        if (zIsEmpty) {
            if (autoVDraweeView != null) {
                xdl0.M(autoVDraweeView, false);
            }
            setBackgroundResource(x2c0.L6);
            return;
        }
        if (autoVDraweeView == null) {
            AutoVDraweeView autoVDraweeView2 = new AutoVDraweeView(getContext());
            this.f976d = autoVDraweeView2;
            int i2 = xdl0.e;
            addView((View) autoVDraweeView2, 0, (ViewGroup.LayoutParams) new LinearLayout.LayoutParams(i2, i2));
        }
        this.f976d.setImageUrl(str3);
        xdl0.M(this.f976d, true);
    }

    public ExpEditTopWarnView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m1392a();
    }

    public ExpEditTopWarnView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1392a();
    }
}
