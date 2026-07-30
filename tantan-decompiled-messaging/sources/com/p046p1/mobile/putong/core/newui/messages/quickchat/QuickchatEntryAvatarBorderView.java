package com.p046p1.mobile.putong.core.newui.messages.quickchat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import p147v.VDraweeView;
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
public class QuickchatEntryAvatarBorderView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public Paint f25923o;

    /* JADX INFO: renamed from: p */
    public LinearGradient f25924p;

    /* JADX INFO: renamed from: q */
    public int f25925q;

    /* JADX INFO: renamed from: r */
    public int f25926r;

    /* JADX INFO: renamed from: s */
    public LinearGradient f25927s;

    public QuickchatEntryAvatarBorderView(Context context) {
        super(context);
        this.f25925q = Color.parseColor("#FFC683");
        this.f25926r = Color.parseColor("#FF9D73");
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // p147v.VDraweeView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f25927s == null || this.f25924p == null) {
            int i = t100.f167260i;
            int i2 = this.f25925q;
            int i3 = this.f25926r;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f25927s = new LinearGradient(-i, getHeight() + i, t100.f167247V, -i, i2, i3, tileMode);
            int i4 = t100.f167271t;
            this.f25924p = new LinearGradient(-i4, getHeight() - i, t100.f167245T, -i4, this.f25925q, this.f25926r, tileMode);
        }
        if (this.f25923o == null) {
            Paint paint = new Paint();
            this.f25923o = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f25923o.setAntiAlias(true);
            this.f25923o.setStrokeWidth(t100.m186890d(2.0f));
        }
        float translationX = getTranslationX();
        float width = getWidth() / 2.0f;
        Paint paint2 = this.f25923o;
        if (translationX > width) {
            paint2.setShader(this.f25924p);
        } else {
            paint2.setShader(this.f25927s);
        }
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - t100.f167254c, this.f25923o);
    }

    public QuickchatEntryAvatarBorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25925q = Color.parseColor("#FFC683");
        this.f25926r = Color.parseColor("#FF9D73");
    }

    public QuickchatEntryAvatarBorderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25925q = Color.parseColor("#FFC683");
        this.f25926r = Color.parseColor("#FF9D73");
    }
}
