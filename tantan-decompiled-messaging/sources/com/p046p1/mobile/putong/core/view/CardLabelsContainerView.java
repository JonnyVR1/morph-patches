package com.p046p1.mobile.putong.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p149l.jjb0;
import p149l.tk4;

/* JADX INFO: loaded from: classes10.dex */
public class CardLabelsContainerView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CardLabelItemView f38505a;

    /* JADX INFO: renamed from: b */
    public CardLabelItemView f38506b;

    /* JADX INFO: renamed from: c */
    public CardLabelItemView f38507c;

    /* JADX INFO: renamed from: d */
    public int f38508d;

    /* JADX INFO: renamed from: e */
    public List<CardLabelItemView> f38509e;

    public CardLabelsContainerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38508d = jjb0.m141784b() ? 2 : 3;
        this.f38509e = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m59513a(View view) {
        tk4.m189422a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m59513a(this);
        this.f38509e.add(this.f38505a);
        this.f38509e.add(this.f38506b);
        this.f38509e.add(this.f38507c);
    }

    public CardLabelsContainerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardLabelsContainerView(Context context) {
        this(context, null);
    }
}
