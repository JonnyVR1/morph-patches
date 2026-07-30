package com.hellogroup.p036mk.business.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.C2489R;
import p153l.t0j0;

/* JADX INFO: loaded from: classes7.dex */
public class TabItem extends View {

    /* JADX INFO: renamed from: a */
    public final CharSequence f12478a;

    /* JADX INFO: renamed from: b */
    public final Drawable f12479b;

    /* JADX INFO: renamed from: c */
    public final int f12480c;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t0j0 t0j0VarM188781t = t0j0.m188781t(context, attributeSet, C2489R.styleable.TabItem);
        this.f12478a = t0j0VarM188781t.m188798p(C2489R.styleable.TabItem_android_text);
        this.f12479b = t0j0VarM188781t.m188789g(C2489R.styleable.TabItem_android_icon);
        this.f12480c = t0j0VarM188781t.m188796n(C2489R.styleable.TabItem_android_layout, 0);
        t0j0VarM188781t.m188801v();
    }

    public TabItem(Context context) {
        this(context, null);
    }
}
