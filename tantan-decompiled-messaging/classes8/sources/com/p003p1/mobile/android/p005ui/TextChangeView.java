package com.p003p1.mobile.android.p005ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.t100;
import p007l.b9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class TextChangeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final Context f1344a;

    /* JADX INFO: renamed from: b */
    public TextView f1345b;

    /* JADX INFO: renamed from: c */
    public TextView f1346c;

    /* JADX INFO: renamed from: d */
    public int f1347d;

    /* JADX INFO: renamed from: e */
    public int f1348e;

    /* JADX INFO: renamed from: f */
    public int f1349f;

    /* JADX INFO: renamed from: g */
    public int f1350g;

    /* JADX INFO: renamed from: h */
    public int f1351h;

    /* JADX INFO: renamed from: i */
    public int f1352i;

    public TextChangeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1347d = 0;
        this.f1344a = context;
        m1087b(attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final TextView m1086a(int i, int i2) {
        TextView textView = new TextView(this.f1344a);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        textView.setTextColor(this.f1348e);
        textView.setTextSize(this.f1350g);
        textView.setAlpha(i);
        textView.setTranslationX(i2);
        return textView;
    }

    /* JADX INFO: renamed from: b */
    public final void m1087b(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = this.f1344a.obtainStyledAttributes(attributeSet, b9c0.f2063S2);
        this.f1348e = typedArrayObtainStyledAttributes.getColor(b9c0.f2075U2, -16777216);
        this.f1349f = typedArrayObtainStyledAttributes.getInt(b9c0.f2069T2, 200);
        this.f1350g = (int) typedArrayObtainStyledAttributes.getDimension(b9c0.f2081V2, 18.0f);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(b9c0.f2087W2, t100.d(60.0f));
        this.f1351h = dimension;
        this.f1352i = dimension << 1;
        typedArrayObtainStyledAttributes.recycle();
        this.f1345b = m1086a(1, 0);
        this.f1346c = m1086a(0, this.f1351h);
        addView(this.f1345b);
        addView(this.f1346c);
    }

    public TextChangeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextChangeView(@NonNull Context context) {
        this(context, null);
    }
}
