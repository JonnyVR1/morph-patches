package com.p000p1.mobile.putong.core.p001ui.greet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import l.o7r;
import p003l.dak;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GreetMessageUserHeaderLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f1797a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f1798b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f1799c;

    /* JADX INFO: renamed from: d */
    public View f1800d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f1801e;

    /* JADX INFO: renamed from: f */
    public View f1802f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f1803g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f1804h;

    /* JADX INFO: renamed from: i */
    public VText f1805i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f1806j;

    /* JADX INFO: renamed from: k */
    public VImage f1807k;

    /* JADX INFO: renamed from: l */
    public VText f1808l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f1809m;

    /* JADX INFO: renamed from: n */
    public VText f1810n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f1811o;

    /* JADX INFO: renamed from: p */
    public VText f1812p;

    /* JADX INFO: renamed from: q */
    public boolean f1813q;

    /* JADX INFO: renamed from: r */
    public String f1814r;

    /* JADX INFO: renamed from: s */
    public CharSequence f1815s;

    /* JADX INFO: renamed from: t */
    public CharSequence f1816t;

    /* JADX INFO: renamed from: u */
    public CharSequence f1817u;

    public GreetMessageUserHeaderLayout(Context context) {
        super(context);
        this.f1813q = false;
        this.f1814r = "";
        this.f1815s = "";
        this.f1816t = "";
        this.f1817u = "";
    }

    /* JADX INFO: renamed from: a */
    public View m3093a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dak.m6096b(this, layoutInflater, viewGroup);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        addView(m3093a(o7r.a(getContext()), this));
    }

    public GreetMessageUserHeaderLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1813q = false;
        this.f1814r = "";
        this.f1815s = "";
        this.f1816t = "";
        this.f1817u = "";
    }

    public GreetMessageUserHeaderLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1813q = false;
        this.f1814r = "";
        this.f1815s = "";
        this.f1816t = "";
        this.f1817u = "";
    }
}
