package com.p051p1.mobile.putong.core.p058ui.profile.exp;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import p151v.AutoVDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.qa00;
import p153l.qnp0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpEditTopWarnView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f33999a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f34000b;

    /* JADX INFO: renamed from: c */
    public VText f34001c;

    /* JADX INFO: renamed from: d */
    public AutoVDraweeView f34002d;

    public ExpEditTopWarnView(@NonNull Context context) {
        super(context);
        m52127a();
    }

    /* JADX INFO: renamed from: a */
    public final void m52127a() {
        VText_Medium vText_Medium = new VText_Medium(getContext());
        this.f33999a = vText_Medium;
        vText_Medium.setCompoundDrawablePadding(qa00.f156321h);
        this.f33999a.setGravity(17);
        this.f33999a.setTextSize(1, 13.0f);
        this.f33999a.setTextColor(getContext().getResources().getColor(c9c0.f80469x));
        addView(this.f33999a);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f34000b = linearLayout;
        linearLayout.setOrientation(0);
        this.f34000b.setShowDividers(2);
        this.f34000b.setDividerPadding(qa00.f156318e);
        this.f34000b.setGravity(16);
        int i = bnl0.f77545f;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 21;
        layoutParams.rightMargin = qa00.f156330q;
        addView(this.f34000b, layoutParams);
        VText vText = new VText(getContext());
        this.f34001c = vText;
        vText.setTextSize(1, 13.0f);
        this.f34001c.setTextColor(getContext().getResources().getColor(c9c0.f80469x));
        this.f34000b.addView(this.f34001c);
        View view = new View(getContext());
        int i2 = qa00.f156327n;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i2, i2);
        view.setBackgroundResource(dbc0.f86805Zs);
        this.f34000b.addView(view, layoutParams2);
        qnp0.m177261d1(this, qa00.f156326m);
    }

    /* JADX INFO: renamed from: b */
    public final void m52128b() {
        bnl0.m105524M(this.f34000b, false);
        this.f33999a.setGravity(17);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f33999a.getLayoutParams();
        int i = bnl0.f77545f;
        layoutParams.width = i;
        layoutParams.height = i;
        layoutParams.gravity = 17;
        int i2 = qa00.f156328o;
        layoutParams.leftMargin = i2;
        layoutParams.rightMargin = i2;
        this.f33999a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public void m52129c(String str, int i, int i2) {
        m52128b();
        this.f33999a.setText(str);
        this.f33999a.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        AutoVDraweeView autoVDraweeView = this.f34002d;
        if (autoVDraweeView != null) {
            bnl0.m105524M(autoVDraweeView, false);
        }
        if (i2 != 0) {
            setBackgroundResource(i2);
        } else {
            setBackgroundResource(dbc0.f86367M6);
        }
        setOnClickListener(null);
    }

    /* JADX INFO: renamed from: d */
    public final void m52130d() {
        bnl0.m105524M(this.f34000b, true);
        this.f33999a.setGravity(19);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f33999a.getLayoutParams();
        int i = bnl0.f77545f;
        layoutParams.width = i;
        layoutParams.height = i;
        layoutParams.gravity = 19;
        layoutParams.leftMargin = qa00.f156330q;
        layoutParams.rightMargin = qa00.f156302O;
        this.f33999a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: e */
    public void m52131e(String str, String str2, int i, String str3) {
        m52130d();
        this.f33999a.setText(str);
        this.f33999a.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        this.f34001c.setText(str2);
        boolean zIsEmpty = TextUtils.isEmpty(str3);
        AutoVDraweeView autoVDraweeView = this.f34002d;
        if (zIsEmpty) {
            if (autoVDraweeView != null) {
                bnl0.m105524M(autoVDraweeView, false);
            }
            setBackgroundResource(dbc0.f86367M6);
            return;
        }
        if (autoVDraweeView == null) {
            AutoVDraweeView autoVDraweeView2 = new AutoVDraweeView(getContext());
            this.f34002d = autoVDraweeView2;
            int i2 = bnl0.f77544e;
            addView(autoVDraweeView2, 0, new LinearLayout.LayoutParams(i2, i2));
        }
        this.f34002d.setImageUrl(str3);
        bnl0.m105524M(this.f34002d, true);
    }

    public ExpEditTopWarnView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m52127a();
    }

    public ExpEditTopWarnView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m52127a();
    }
}
