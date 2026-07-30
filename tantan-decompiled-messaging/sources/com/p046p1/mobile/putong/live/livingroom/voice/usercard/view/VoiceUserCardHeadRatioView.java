package com.p046p1.mobile.putong.live.livingroom.voice.usercard.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p149l.p9c0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceUserCardHeadRatioView extends View {

    /* JADX INFO: renamed from: a */
    public float f53922a;

    /* JADX INFO: renamed from: b */
    public float f53923b;

    public VoiceUserCardHeadRatioView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53922a = 1.0f;
        this.f53923b = 1.0f;
        m78769a(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m78769a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p9c0.f147746o0);
        this.f53923b = typedArrayObtainStyledAttributes.getFloat(p9c0.f147748p0, 1.0f);
        this.f53922a = typedArrayObtainStyledAttributes.getFloat(p9c0.f147750q0, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public final void m78770b() {
        if (this.f53922a > 1.0f) {
            this.f53922a = 1.0f;
        }
        if (this.f53922a < 0.0f) {
            this.f53922a = 0.0f;
        }
        if (this.f53923b > 1.0f) {
            this.f53923b = 1.0f;
        }
        if (this.f53923b < 0.0f) {
            this.f53923b = 0.0f;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        m78770b();
        setMeasuredDimension((int) (size * this.f53923b), (int) (size2 * this.f53922a));
    }

    public VoiceUserCardHeadRatioView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceUserCardHeadRatioView(Context context) {
        this(context, null);
    }
}
