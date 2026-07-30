package com.p000p1.mobile.putong.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import l.jjb0;
import p003l.tk4;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CardLabelsContainerView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CardLabelItemView f2447a;

    /* JADX INFO: renamed from: b */
    public CardLabelItemView f2448b;

    /* JADX INFO: renamed from: c */
    public CardLabelItemView f2449c;

    /* JADX INFO: renamed from: d */
    public int f2450d;

    /* JADX INFO: renamed from: e */
    public List<CardLabelItemView> f2451e;

    public CardLabelsContainerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2450d = jjb0.b() ? 2 : 3;
        this.f2451e = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m4922a(View view) {
        tk4.m9586a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4922a(this);
        this.f2451e.add(this.f2447a);
        this.f2451e.add(this.f2448b);
        this.f2451e.add(this.f2449c);
    }

    public CardLabelsContainerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardLabelsContainerView(Context context) {
        this(context, null);
    }
}
