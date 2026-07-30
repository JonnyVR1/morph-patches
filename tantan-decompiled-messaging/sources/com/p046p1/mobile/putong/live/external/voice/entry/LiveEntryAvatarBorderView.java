package com.p046p1.mobile.putong.live.external.voice.entry;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import p147v.VDraweeView;
import p149l.t100;

/* JADX INFO: loaded from: classes13.dex */
public class LiveEntryAvatarBorderView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public Paint f46391o;

    /* JADX INFO: renamed from: p */
    public LinearGradient f46392p;

    /* JADX INFO: renamed from: q */
    public int f46393q;

    /* JADX INFO: renamed from: r */
    public int f46394r;

    /* JADX INFO: renamed from: s */
    public LinearGradient f46395s;

    public LiveEntryAvatarBorderView(Context context) {
        super(context);
        this.f46393q = Color.parseColor("#41d2ff");
        this.f46394r = Color.parseColor("#279aff");
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // p147v.VDraweeView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f46395s == null || this.f46392p == null) {
            int i = t100.f167260i;
            int i2 = this.f46393q;
            int i3 = this.f46394r;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f46395s = new LinearGradient(-i, getHeight() + i, t100.f167247V, -i, i2, i3, tileMode);
            int i4 = t100.f167271t;
            this.f46392p = new LinearGradient(-i4, getHeight() - i, t100.f167245T, -i4, this.f46393q, this.f46394r, tileMode);
        }
        if (this.f46391o == null) {
            Paint paint = new Paint();
            this.f46391o = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f46391o.setAntiAlias(true);
            this.f46391o.setStrokeWidth(t100.m186890d(2.0f));
        }
        float translationX = getTranslationX();
        float width = getWidth() / 2.0f;
        Paint paint2 = this.f46391o;
        if (translationX > width) {
            paint2.setShader(this.f46392p);
        } else {
            paint2.setShader(this.f46395s);
        }
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - t100.f167254c, this.f46391o);
    }

    /* JADX INFO: renamed from: u */
    public void m70943u(int i, int i2) {
        this.f46393q = i;
        this.f46394r = i2;
        postInvalidate();
    }

    public LiveEntryAvatarBorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46393q = Color.parseColor("#41d2ff");
        this.f46394r = Color.parseColor("#279aff");
    }

    public LiveEntryAvatarBorderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46393q = Color.parseColor("#41d2ff");
        this.f46394r = Color.parseColor("#279aff");
    }
}
