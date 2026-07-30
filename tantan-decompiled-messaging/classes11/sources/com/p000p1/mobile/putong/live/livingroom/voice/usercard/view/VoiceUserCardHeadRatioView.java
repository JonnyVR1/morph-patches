package com.p000p1.mobile.putong.live.livingroom.voice.usercard.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import l.p9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceUserCardHeadRatioView extends View {

    /* JADX INFO: renamed from: a */
    public float f7528a;

    /* JADX INFO: renamed from: b */
    public float f7529b;

    public VoiceUserCardHeadRatioView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7528a = 1.0f;
        this.f7529b = 1.0f;
        m8985a(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m8985a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p9c0.o0);
        this.f7529b = typedArrayObtainStyledAttributes.getFloat(p9c0.p0, 1.0f);
        this.f7528a = typedArrayObtainStyledAttributes.getFloat(p9c0.q0, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public final void m8986b() {
        if (this.f7528a > 1.0f) {
            this.f7528a = 1.0f;
        }
        if (this.f7528a < 0.0f) {
            this.f7528a = 0.0f;
        }
        if (this.f7529b > 1.0f) {
            this.f7529b = 1.0f;
        }
        if (this.f7529b < 0.0f) {
            this.f7529b = 0.0f;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        m8986b();
        setMeasuredDimension((int) (size * this.f7529b), (int) (size2 * this.f7528a));
    }

    public VoiceUserCardHeadRatioView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceUserCardHeadRatioView(Context context) {
        this(context, null);
    }
}
