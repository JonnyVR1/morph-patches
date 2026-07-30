package com.p046p1.mobile.putong.core.p053ui.greet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.dak;
import p149l.o7r;

/* JADX INFO: loaded from: classes10.dex */
public class GreetMessageUserHeaderLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f29403a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f29404b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f29405c;

    /* JADX INFO: renamed from: d */
    public View f29406d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f29407e;

    /* JADX INFO: renamed from: f */
    public View f29408f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f29409g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f29410h;

    /* JADX INFO: renamed from: i */
    public VText f29411i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f29412j;

    /* JADX INFO: renamed from: k */
    public VImage f29413k;

    /* JADX INFO: renamed from: l */
    public VText f29414l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f29415m;

    /* JADX INFO: renamed from: n */
    public VText f29416n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f29417o;

    /* JADX INFO: renamed from: p */
    public VText f29418p;

    /* JADX INFO: renamed from: q */
    public boolean f29419q;

    /* JADX INFO: renamed from: r */
    public String f29420r;

    /* JADX INFO: renamed from: s */
    public CharSequence f29421s;

    /* JADX INFO: renamed from: t */
    public CharSequence f29422t;

    /* JADX INFO: renamed from: u */
    public CharSequence f29423u;

    public GreetMessageUserHeaderLayout(Context context) {
        super(context);
        this.f29419q = false;
        this.f29420r = "";
        this.f29421s = "";
        this.f29422t = "";
        this.f29423u = "";
    }

    /* JADX INFO: renamed from: a */
    public View m45755a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dak.m110614b(this, layoutInflater, viewGroup);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        addView(m45755a(o7r.m163037a(getContext()), this));
    }

    public GreetMessageUserHeaderLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29419q = false;
        this.f29420r = "";
        this.f29421s = "";
        this.f29422t = "";
        this.f29423u = "";
    }

    public GreetMessageUserHeaderLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29419q = false;
        this.f29420r = "";
        this.f29421s = "";
        this.f29422t = "";
        this.f29423u = "";
    }
}
