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
import androidx.cardview.widget.CardView;
import com.p1.mobile.putong.core.ui.VText_Medium;
import l.eqh0;
import l.t100;
import l.xdl0;
import v.AutoVDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpTagView extends CardView {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f993a;

    /* JADX INFO: renamed from: b */
    public VText_Medium f994b;

    /* JADX INFO: renamed from: c */
    public ExpTagBgView f995c;

    public ExpTagView(@NonNull Context context) {
        super(context);
        m1409b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    private void m1409b() {
        setRadius(t100.d(10.0f));
        setCardBackgroundColor(0);
        setElevation(0.0f);
        setCardElevation(0.0f);
        ExpTagBgView expTagBgView = new ExpTagBgView(getContext());
        this.f995c = expTagBgView;
        expTagBgView.setOrientation(0);
        this.f993a = new AutoVDraweeView(getContext());
        int i = t100.o;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.rightMargin = t100.f;
        layoutParams.gravity = 16;
        this.f995c.addView((View) this.f993a, (ViewGroup.LayoutParams) layoutParams);
        VText_Medium vText_Medium = new VText_Medium(getContext());
        this.f994b = vText_Medium;
        vText_Medium.setTypeface(eqh0.c(3), 1);
        this.f994b.setGravity(17);
        this.f994b.setTextSize(1, 14.0f);
        this.f994b.setTextColor(-16777216);
        this.f994b.setSingleLine(true);
        this.f994b.setEllipsize(TextUtils.TruncateAt.END);
        this.f994b.setMaxLines(1);
        this.f995c.addView((View) this.f994b, xdl0.f, xdl0.e);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(xdl0.f, t100.f(44));
        layoutParams2.gravity = 17;
        addView(this.f995c, layoutParams2);
    }

    /* JADX INFO: renamed from: e */
    public void m1410e(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            m1413i();
        } else {
            m1411f();
            this.f993a.setImageUrl(str2);
        }
        this.f994b.setText(str);
        this.f995c.m1407b(-526345);
    }

    /* JADX INFO: renamed from: f */
    public final void m1411f() {
        this.f995c.setPadding(t100.j, 0, t100.m, 0);
        xdl0.M(this.f993a, true);
    }

    /* JADX INFO: renamed from: h */
    public void m1412h(String str, int i, boolean z) {
        if (i != 0) {
            this.f993a.setBackgroundResource(i);
            m1411f();
        } else {
            m1413i();
        }
        this.f994b.setText(str);
        ExpTagBgView expTagBgView = this.f995c;
        if (z) {
            expTagBgView.m1408c();
        } else {
            expTagBgView.m1407b(-4383);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m1413i() {
        ExpTagBgView expTagBgView = this.f995c;
        int i = t100.m;
        expTagBgView.setPadding(i, 0, i, 0);
        xdl0.M(this.f993a, false);
    }

    public ExpTagView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m1409b();
    }

    public ExpTagView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1409b();
    }
}
