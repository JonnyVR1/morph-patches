package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.C2489R;
import p153l.t0j0;

/* JADX INFO: loaded from: classes7.dex */
public class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t0j0 t0j0VarM188781t = t0j0.m188781t(context, attributeSet, C2489R.styleable.TabItem);
        this.text = t0j0VarM188781t.m188798p(C2489R.styleable.TabItem_android_text);
        this.icon = t0j0VarM188781t.m188789g(C2489R.styleable.TabItem_android_icon);
        this.customLayout = t0j0VarM188781t.m188796n(C2489R.styleable.TabItem_android_layout, 0);
        t0j0VarM188781t.m188801v();
    }

    public TabItem(Context context) {
        this(context, null);
    }
}
