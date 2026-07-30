package com.p046p1.mobile.putong.live.livingroom.voice.intl.fanbase;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import p149l.p9c0;

/* JADX INFO: loaded from: classes5.dex */
public class GradientTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a */
    public int f53130a;

    /* JADX INFO: renamed from: b */
    public int f53131b;

    public GradientTextView(Context context) {
        super(context);
        m78133i(null);
    }

    /* JADX INFO: renamed from: h */
    public final void m78132h() {
        getPaint().setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), this.f53130a, this.f53131b, Shader.TileMode.CLAMP));
        invalidate();
    }

    /* JADX INFO: renamed from: i */
    public final void m78133i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p9c0.f147745o);
            this.f53130a = typedArrayObtainStyledAttributes.getColor(p9c0.f147749q, 16777215);
            this.f53131b = typedArrayObtainStyledAttributes.getColor(p9c0.f147747p, 16777215);
            typedArrayObtainStyledAttributes.recycle();
        }
        m78132h();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m78132h();
    }

    public GradientTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m78133i(attributeSet);
    }

    public GradientTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m78133i(attributeSet);
    }
}
