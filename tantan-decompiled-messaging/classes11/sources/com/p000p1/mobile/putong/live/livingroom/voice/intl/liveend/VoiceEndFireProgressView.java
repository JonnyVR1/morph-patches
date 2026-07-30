package com.p000p1.mobile.putong.live.livingroom.voice.intl.liveend;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import l.e16;
import l.h1c0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceEndFireProgressView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f6853a;

    /* JADX INFO: renamed from: b */
    public RectF f6854b;

    /* JADX INFO: renamed from: c */
    public RectF f6855c;

    /* JADX INFO: renamed from: d */
    public float f6856d;

    /* JADX INFO: renamed from: e */
    public int f6857e;

    /* JADX INFO: renamed from: f */
    public int f6858f;

    public VoiceEndFireProgressView(Context context) {
        super(context);
        m8442a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8442a(Context context) {
        Paint paint = new Paint();
        this.f6853a = paint;
        paint.setAntiAlias(true);
        this.f6853a.setDither(true);
        this.f6854b = new RectF();
        this.f6855c = new RectF();
        this.f6857e = e16.c(context, h1c0.j1);
        this.f6858f = e16.c(context, h1c0.p0);
    }

    /* JADX INFO: renamed from: b */
    public void m8443b(int i, int i2) {
        this.f6856d = i / i2;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f6853a.setColor(this.f6857e);
        this.f6854b.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(this.f6854b, t100.d(5.0f), t100.d(5.0f), this.f6853a);
        this.f6855c.set(0.0f, 0.0f, getWidth() * this.f6856d, getHeight());
        this.f6853a.setColor(this.f6858f);
        canvas.drawRoundRect(this.f6855c, t100.d(5.0f), t100.d(5.0f), this.f6853a);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public VoiceEndFireProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m8442a(context);
    }

    public VoiceEndFireProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
