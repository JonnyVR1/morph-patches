package com.p051p1.mobile.putong.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p153l.nrb0;
import p153l.sl4;

/* JADX INFO: loaded from: classes12.dex */
public class CardLabelsContainerView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CardLabelItemView f39353a;

    /* JADX INFO: renamed from: b */
    public CardLabelItemView f39354b;

    /* JADX INFO: renamed from: c */
    public CardLabelItemView f39355c;

    /* JADX INFO: renamed from: d */
    public int f39356d;

    /* JADX INFO: renamed from: e */
    public List<CardLabelItemView> f39357e;

    public CardLabelsContainerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39356d = nrb0.m164466b() ? 2 : 3;
        this.f39357e = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m60697a(View view) {
        sl4.m186561a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m60697a(this);
        this.f39357e.add(this.f39353a);
        this.f39357e.add(this.f39354b);
        this.f39357e.add(this.f39355c);
    }

    public CardLabelsContainerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardLabelsContainerView(Context context) {
        this(context, null);
    }
}
