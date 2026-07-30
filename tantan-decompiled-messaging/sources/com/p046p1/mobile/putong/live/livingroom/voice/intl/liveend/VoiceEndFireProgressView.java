package com.p046p1.mobile.putong.live.livingroom.voice.intl.liveend;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p149l.e16;
import p149l.h1c0;
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceEndFireProgressView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f53247a;

    /* JADX INFO: renamed from: b */
    public RectF f53248b;

    /* JADX INFO: renamed from: c */
    public RectF f53249c;

    /* JADX INFO: renamed from: d */
    public float f53250d;

    /* JADX INFO: renamed from: e */
    public int f53251e;

    /* JADX INFO: renamed from: f */
    public int f53252f;

    public VoiceEndFireProgressView(Context context) {
        super(context);
        m78253a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m78253a(Context context) {
        Paint paint = new Paint();
        this.f53247a = paint;
        paint.setAntiAlias(true);
        this.f53247a.setDither(true);
        this.f53248b = new RectF();
        this.f53249c = new RectF();
        this.f53251e = e16.m114375c(context, h1c0.f105377j1);
        this.f53252f = e16.m114375c(context, h1c0.f105394p0);
    }

    /* JADX INFO: renamed from: b */
    public void m78254b(int i, int i2) {
        this.f53250d = i / i2;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f53247a.setColor(this.f53251e);
        this.f53248b.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(this.f53248b, t100.m186890d(5.0f), t100.m186890d(5.0f), this.f53247a);
        this.f53249c.set(0.0f, 0.0f, getWidth() * this.f53250d, getHeight());
        this.f53247a.setColor(this.f53252f);
        canvas.drawRoundRect(this.f53249c, t100.m186890d(5.0f), t100.m186890d(5.0f), this.f53247a);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public VoiceEndFireProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m78253a(context);
    }

    public VoiceEndFireProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
