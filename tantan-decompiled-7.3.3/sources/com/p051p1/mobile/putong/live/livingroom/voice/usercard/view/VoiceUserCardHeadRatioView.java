package com.p051p1.mobile.putong.live.livingroom.voice.usercard.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p153l.vhc0;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceUserCardHeadRatioView extends View {

    /* JADX INFO: renamed from: a */
    public float f54770a;

    /* JADX INFO: renamed from: b */
    public float f54771b;

    public VoiceUserCardHeadRatioView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54770a = 1.0f;
        this.f54771b = 1.0f;
        m79952a(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m79952a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vhc0.f184145o0);
        this.f54771b = typedArrayObtainStyledAttributes.getFloat(vhc0.f184147p0, 1.0f);
        this.f54770a = typedArrayObtainStyledAttributes.getFloat(vhc0.f184149q0, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public final void m79953b() {
        if (this.f54770a > 1.0f) {
            this.f54770a = 1.0f;
        }
        if (this.f54770a < 0.0f) {
            this.f54770a = 0.0f;
        }
        if (this.f54771b > 1.0f) {
            this.f54771b = 1.0f;
        }
        if (this.f54771b < 0.0f) {
            this.f54771b = 0.0f;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        m79953b();
        setMeasuredDimension((int) (size * this.f54771b), (int) (size2 * this.f54770a));
    }

    public VoiceUserCardHeadRatioView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceUserCardHeadRatioView(Context context) {
        this(context, null);
    }
}
