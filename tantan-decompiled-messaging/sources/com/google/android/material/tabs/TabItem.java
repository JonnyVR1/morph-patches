package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.C2466R;
import p149l.qri0;

/* JADX INFO: loaded from: classes7.dex */
public class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        qri0 qri0VarM175992t = qri0.m175992t(context, attributeSet, C2466R.styleable.TabItem);
        this.text = qri0VarM175992t.m176009p(C2466R.styleable.TabItem_android_text);
        this.icon = qri0VarM175992t.m176000g(C2466R.styleable.TabItem_android_icon);
        this.customLayout = qri0VarM175992t.m176007n(C2466R.styleable.TabItem_android_layout, 0);
        qri0VarM175992t.m176012v();
    }

    public TabItem(Context context) {
        this(context, null);
    }
}
