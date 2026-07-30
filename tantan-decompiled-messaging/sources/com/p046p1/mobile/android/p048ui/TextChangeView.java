package com.p046p1.mobile.android.p048ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.b9c0;
import p149l.t100;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes8.dex */
public class TextChangeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final Context f15645a;

    /* JADX INFO: renamed from: b */
    public TextView f15646b;

    /* JADX INFO: renamed from: c */
    public TextView f15647c;

    /* JADX INFO: renamed from: d */
    public int f15648d;

    /* JADX INFO: renamed from: e */
    public int f15649e;

    /* JADX INFO: renamed from: f */
    public int f15650f;

    /* JADX INFO: renamed from: g */
    public int f15651g;

    /* JADX INFO: renamed from: h */
    public int f15652h;

    /* JADX INFO: renamed from: i */
    public int f15653i;

    public TextChangeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15648d = 0;
        this.f15645a = context;
        m20816b(attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final TextView m20815a(int i, int i2) {
        TextView textView = new TextView(this.f15645a);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        textView.setTextColor(this.f15649e);
        textView.setTextSize(this.f15651g);
        textView.setAlpha(i);
        textView.setTranslationX(i2);
        return textView;
    }

    /* JADX INFO: renamed from: b */
    public final void m20816b(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = this.f15645a.obtainStyledAttributes(attributeSet, b9c0.f74340S2);
        this.f15649e = typedArrayObtainStyledAttributes.getColor(b9c0.f74352U2, RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f15650f = typedArrayObtainStyledAttributes.getInt(b9c0.f74346T2, 200);
        this.f15651g = (int) typedArrayObtainStyledAttributes.getDimension(b9c0.f74358V2, 18.0f);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(b9c0.f74364W2, t100.m186890d(60.0f));
        this.f15652h = dimension;
        this.f15653i = dimension << 1;
        typedArrayObtainStyledAttributes.recycle();
        this.f15646b = m20815a(1, 0);
        this.f15647c = m20815a(0, this.f15652h);
        addView(this.f15646b);
        addView(this.f15647c);
    }

    public TextChangeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextChangeView(@NonNull Context context) {
        this(context, null);
    }
}
