package com.p051p1.mobile.putong.live.livingroom.voice.intl.liveend;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p153l.j26;
import p153l.n9c0;
import p153l.qa00;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceEndFireProgressView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f54095a;

    /* JADX INFO: renamed from: b */
    public RectF f54096b;

    /* JADX INFO: renamed from: c */
    public RectF f54097c;

    /* JADX INFO: renamed from: d */
    public float f54098d;

    /* JADX INFO: renamed from: e */
    public int f54099e;

    /* JADX INFO: renamed from: f */
    public int f54100f;

    public VoiceEndFireProgressView(Context context) {
        super(context);
        m79436a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m79436a(Context context) {
        Paint paint = new Paint();
        this.f54095a = paint;
        paint.setAntiAlias(true);
        this.f54095a.setDither(true);
        this.f54096b = new RectF();
        this.f54097c = new RectF();
        this.f54099e = j26.m143190c(context, n9c0.f140838j1);
        this.f54100f = j26.m143190c(context, n9c0.f140855p0);
    }

    /* JADX INFO: renamed from: b */
    public void m79437b(int i, int i2) {
        this.f54098d = i / i2;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f54095a.setColor(this.f54099e);
        this.f54096b.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(this.f54096b, qa00.m175859d(5.0f), qa00.m175859d(5.0f), this.f54095a);
        this.f54097c.set(0.0f, 0.0f, getWidth() * this.f54098d, getHeight());
        this.f54095a.setColor(this.f54100f);
        canvas.drawRoundRect(this.f54097c, qa00.m175859d(5.0f), qa00.m175859d(5.0f), this.f54095a);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public VoiceEndFireProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m79436a(context);
    }

    public VoiceEndFireProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
