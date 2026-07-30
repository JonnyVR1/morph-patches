package com.p051p1.mobile.putong.live.livingroom.voice.intl.fanbase;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import p153l.vhc0;

/* JADX INFO: loaded from: classes5.dex */
public class GradientTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a */
    public int f53978a;

    /* JADX INFO: renamed from: b */
    public int f53979b;

    public GradientTextView(Context context) {
        super(context);
        m79316i(null);
    }

    /* JADX INFO: renamed from: h */
    public final void m79315h() {
        getPaint().setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), this.f53978a, this.f53979b, Shader.TileMode.CLAMP));
        invalidate();
    }

    /* JADX INFO: renamed from: i */
    public final void m79316i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, vhc0.f184144o);
            this.f53978a = typedArrayObtainStyledAttributes.getColor(vhc0.f184148q, 16777215);
            this.f53979b = typedArrayObtainStyledAttributes.getColor(vhc0.f184146p, 16777215);
            typedArrayObtainStyledAttributes.recycle();
        }
        m79315h();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m79315h();
    }

    public GradientTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m79316i(attributeSet);
    }

    public GradientTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m79316i(attributeSet);
    }
}
