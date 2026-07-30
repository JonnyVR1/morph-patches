package com.p000p1.mobile.putong.core.newui.messages.quickchat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import l.t100;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class QuickchatEntryAvatarBorderView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public Paint f4701o;

    /* JADX INFO: renamed from: p */
    public LinearGradient f4702p;

    /* JADX INFO: renamed from: q */
    public int f4703q;

    /* JADX INFO: renamed from: r */
    public int f4704r;

    /* JADX INFO: renamed from: s */
    public LinearGradient f4705s;

    public QuickchatEntryAvatarBorderView(Context context) {
        super(context);
        this.f4703q = Color.parseColor("#FFC683");
        this.f4704r = Color.parseColor("#FF9D73");
    }

    public void onAttachedToWindow() {
        super/*com.facebook.drawee.view.DraweeView*/.onAttachedToWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4705s == null || this.f4702p == null) {
            int i = t100.i;
            int i2 = this.f4703q;
            int i3 = this.f4704r;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f4705s = new LinearGradient(-i, getHeight() + i, t100.V, -i, i2, i3, tileMode);
            int i4 = t100.t;
            this.f4702p = new LinearGradient(-i4, getHeight() - i, t100.T, -i4, this.f4703q, this.f4704r, tileMode);
        }
        if (this.f4701o == null) {
            Paint paint = new Paint();
            this.f4701o = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f4701o.setAntiAlias(true);
            this.f4701o.setStrokeWidth(t100.d(2.0f));
        }
        float translationX = getTranslationX();
        float width = getWidth() / 2.0f;
        Paint paint2 = this.f4701o;
        if (translationX > width) {
            paint2.setShader(this.f4702p);
        } else {
            paint2.setShader(this.f4705s);
        }
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - t100.c, this.f4701o);
    }

    public QuickchatEntryAvatarBorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4703q = Color.parseColor("#FFC683");
        this.f4704r = Color.parseColor("#FF9D73");
    }

    public QuickchatEntryAvatarBorderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4703q = Color.parseColor("#FFC683");
        this.f4704r = Color.parseColor("#FF9D73");
    }
}
