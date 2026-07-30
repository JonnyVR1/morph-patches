package com.p051p1.mobile.putong.live.livingroom.voice.intl.heatchallenge;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class HeatChallengeProgressView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f54040a;

    /* JADX INFO: renamed from: b */
    public int f54041b;

    /* JADX INFO: renamed from: c */
    public int f54042c;

    /* JADX INFO: renamed from: d */
    public float f54043d;

    /* JADX INFO: renamed from: e */
    public Path f54044e;

    public HeatChallengeProgressView(@NonNull Context context) {
        super(context);
        this.f54041b = Color.parseColor("#ff3a00");
        this.f54042c = Color.parseColor("#ff852a");
        this.f54044e = new Path();
    }

    /* JADX INFO: renamed from: a */
    public final void m79372a() {
        Paint paint = new Paint();
        this.f54040a = paint;
        paint.setColor(-65536);
        this.f54040a.setAntiAlias(true);
        this.f54040a.setDither(true);
        this.f54040a.setStyle(Paint.Style.FILL);
        this.f54040a.setShader(new LinearGradient(0.0f, 0.0f, this.f54043d * getWidth(), getHeight(), this.f54041b, this.f54042c, Shader.TileMode.CLAMP));
        this.f54044e.addCircle(getHeight() / 2.0f, getHeight() / 2.0f, getHeight() / 2.0f, Path.Direction.CCW);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (getHeight() != 0 && this.f54040a == null) {
            m79372a();
        }
        Paint paint = this.f54040a;
        if (paint != null) {
            paint.setShader(new LinearGradient(0.0f, 0.0f, this.f54043d * getWidth(), getHeight(), this.f54041b, this.f54042c, Shader.TileMode.CLAMP));
            float width = this.f54043d * getWidth();
            if (width <= getHeight()) {
                canvas.save();
                canvas.clipPath(this.f54044e);
                canvas.drawCircle(width - (getHeight() / 2.0f), getHeight() / 2.0f, getHeight() / 2.0f, this.f54040a);
                canvas.restore();
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawRoundRect(0.0f, 0.0f, width, getHeight(), getHeight() / 2.0f, getHeight() / 2.0f, this.f54040a);
            }
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0006 A[PHI: r0
      0x0006: PHI (r0v4 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    public void setContentRatio(float f) {
        float f2 = 1.0f;
        if (f > 1.0f) {
            f = f2;
        } else {
            f2 = 0.0f;
            if (f < 0.0f) {
                f = f2;
            }
        }
        if (this.f54043d != f) {
            this.f54043d = f;
            invalidate();
        }
    }

    public void setEndColor(int i) {
        this.f54042c = i;
    }

    public void setStartColor(int i) {
        this.f54041b = i;
    }

    public HeatChallengeProgressView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54041b = Color.parseColor("#ff3a00");
        this.f54042c = Color.parseColor("#ff852a");
        this.f54044e = new Path();
    }

    public HeatChallengeProgressView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54041b = Color.parseColor("#ff3a00");
        this.f54042c = Color.parseColor("#ff852a");
        this.f54044e = new Path();
    }
}
