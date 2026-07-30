package com.p051p1.mobile.android.p053ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.hhc0;
import p153l.qa00;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes8.dex */
public class TextChangeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final Context f16364a;

    /* JADX INFO: renamed from: b */
    public TextView f16365b;

    /* JADX INFO: renamed from: c */
    public TextView f16366c;

    /* JADX INFO: renamed from: d */
    public int f16367d;

    /* JADX INFO: renamed from: e */
    public int f16368e;

    /* JADX INFO: renamed from: f */
    public int f16369f;

    /* JADX INFO: renamed from: g */
    public int f16370g;

    /* JADX INFO: renamed from: h */
    public int f16371h;

    /* JADX INFO: renamed from: i */
    public int f16372i;

    public TextChangeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16367d = 0;
        this.f16364a = context;
        m21815b(attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final TextView m21814a(int i, int i2) {
        TextView textView = new TextView(this.f16364a);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        textView.setTextColor(this.f16368e);
        textView.setTextSize(this.f16370g);
        textView.setAlpha(i);
        textView.setTranslationX(i2);
        return textView;
    }

    /* JADX INFO: renamed from: b */
    public final void m21815b(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = this.f16364a.obtainStyledAttributes(attributeSet, hhc0.f109649S2);
        this.f16368e = typedArrayObtainStyledAttributes.getColor(hhc0.f109661U2, RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f16369f = typedArrayObtainStyledAttributes.getInt(hhc0.f109655T2, 200);
        this.f16370g = (int) typedArrayObtainStyledAttributes.getDimension(hhc0.f109667V2, 18.0f);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(hhc0.f109673W2, qa00.m175859d(60.0f));
        this.f16371h = dimension;
        this.f16372i = dimension << 1;
        typedArrayObtainStyledAttributes.recycle();
        this.f16365b = m21814a(1, 0);
        this.f16366c = m21814a(0, this.f16371h);
        addView(this.f16365b);
        addView(this.f16366c);
    }

    public TextChangeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextChangeView(@NonNull Context context) {
        this(context, null);
    }
}
