package com.p046p1.mobile.putong.live.livingroom.voice.intl.heatchallenge;

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
    public Paint f53192a;

    /* JADX INFO: renamed from: b */
    public int f53193b;

    /* JADX INFO: renamed from: c */
    public int f53194c;

    /* JADX INFO: renamed from: d */
    public float f53195d;

    /* JADX INFO: renamed from: e */
    public Path f53196e;

    public HeatChallengeProgressView(@NonNull Context context) {
        super(context);
        this.f53193b = Color.parseColor("#ff3a00");
        this.f53194c = Color.parseColor("#ff852a");
        this.f53196e = new Path();
    }

    /* JADX INFO: renamed from: a */
    public final void m78189a() {
        Paint paint = new Paint();
        this.f53192a = paint;
        paint.setColor(-65536);
        this.f53192a.setAntiAlias(true);
        this.f53192a.setDither(true);
        this.f53192a.setStyle(Paint.Style.FILL);
        this.f53192a.setShader(new LinearGradient(0.0f, 0.0f, this.f53195d * getWidth(), getHeight(), this.f53193b, this.f53194c, Shader.TileMode.CLAMP));
        this.f53196e.addCircle(getHeight() / 2.0f, getHeight() / 2.0f, getHeight() / 2.0f, Path.Direction.CCW);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (getHeight() != 0 && this.f53192a == null) {
            m78189a();
        }
        Paint paint = this.f53192a;
        if (paint != null) {
            paint.setShader(new LinearGradient(0.0f, 0.0f, this.f53195d * getWidth(), getHeight(), this.f53193b, this.f53194c, Shader.TileMode.CLAMP));
            float width = this.f53195d * getWidth();
            if (width <= getHeight()) {
                canvas.save();
                canvas.clipPath(this.f53196e);
                canvas.drawCircle(width - (getHeight() / 2.0f), getHeight() / 2.0f, getHeight() / 2.0f, this.f53192a);
                canvas.restore();
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawRoundRect(0.0f, 0.0f, width, getHeight(), getHeight() / 2.0f, getHeight() / 2.0f, this.f53192a);
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
        if (this.f53195d != f) {
            this.f53195d = f;
            invalidate();
        }
    }

    public void setEndColor(int i) {
        this.f53194c = i;
    }

    public void setStartColor(int i) {
        this.f53193b = i;
    }

    public HeatChallengeProgressView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53193b = Color.parseColor("#ff3a00");
        this.f53194c = Color.parseColor("#ff852a");
        this.f53196e = new Path();
    }

    public HeatChallengeProgressView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53193b = Color.parseColor("#ff3a00");
        this.f53194c = Color.parseColor("#ff852a");
        this.f53196e = new Path();
    }
}
