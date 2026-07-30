package com.p051p1.mobile.putong.core.p058ui.greet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.p9r;
import p153l.uck;

/* JADX INFO: loaded from: classes3.dex */
public class GreetMessageUserHeaderLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f30251a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f30252b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f30253c;

    /* JADX INFO: renamed from: d */
    public View f30254d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f30255e;

    /* JADX INFO: renamed from: f */
    public View f30256f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f30257g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f30258h;

    /* JADX INFO: renamed from: i */
    public VText f30259i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f30260j;

    /* JADX INFO: renamed from: k */
    public VImage f30261k;

    /* JADX INFO: renamed from: l */
    public VText f30262l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f30263m;

    /* JADX INFO: renamed from: n */
    public VText f30264n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f30265o;

    /* JADX INFO: renamed from: p */
    public VText f30266p;

    /* JADX INFO: renamed from: q */
    public boolean f30267q;

    /* JADX INFO: renamed from: r */
    public String f30268r;

    /* JADX INFO: renamed from: s */
    public CharSequence f30269s;

    /* JADX INFO: renamed from: t */
    public CharSequence f30270t;

    /* JADX INFO: renamed from: u */
    public CharSequence f30271u;

    public GreetMessageUserHeaderLayout(Context context) {
        super(context);
        this.f30267q = false;
        this.f30268r = "";
        this.f30269s = "";
        this.f30270t = "";
        this.f30271u = "";
    }

    /* JADX INFO: renamed from: a */
    public View m46938a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uck.m195408b(this, layoutInflater, viewGroup);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        addView(m46938a(p9r.m171370a(getContext()), this));
    }

    public GreetMessageUserHeaderLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30267q = false;
        this.f30268r = "";
        this.f30269s = "";
        this.f30270t = "";
        this.f30271u = "";
    }

    public GreetMessageUserHeaderLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30267q = false;
        this.f30268r = "";
        this.f30269s = "";
        this.f30270t = "";
        this.f30271u = "";
    }
}
