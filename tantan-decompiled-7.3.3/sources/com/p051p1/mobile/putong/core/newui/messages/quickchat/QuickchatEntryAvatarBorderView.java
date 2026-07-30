package com.p051p1.mobile.putong.core.newui.messages.quickchat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import p151v.VDraweeView;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class QuickchatEntryAvatarBorderView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public Paint f26665o;

    /* JADX INFO: renamed from: p */
    public LinearGradient f26666p;

    /* JADX INFO: renamed from: q */
    public int f26667q;

    /* JADX INFO: renamed from: r */
    public int f26668r;

    /* JADX INFO: renamed from: s */
    public LinearGradient f26669s;

    public QuickchatEntryAvatarBorderView(Context context) {
        super(context);
        this.f26667q = Color.parseColor("#FFC683");
        this.f26668r = Color.parseColor("#FF9D73");
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // p151v.VDraweeView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f26669s == null || this.f26666p == null) {
            int i = qa00.f156322i;
            int i2 = this.f26667q;
            int i3 = this.f26668r;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f26669s = new LinearGradient(-i, getHeight() + i, qa00.f156309V, -i, i2, i3, tileMode);
            int i4 = qa00.f156333t;
            this.f26666p = new LinearGradient(-i4, getHeight() - i, qa00.f156307T, -i4, this.f26667q, this.f26668r, tileMode);
        }
        if (this.f26665o == null) {
            Paint paint = new Paint();
            this.f26665o = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f26665o.setAntiAlias(true);
            this.f26665o.setStrokeWidth(qa00.m175859d(2.0f));
        }
        float translationX = getTranslationX();
        float width = getWidth() / 2.0f;
        Paint paint2 = this.f26665o;
        if (translationX > width) {
            paint2.setShader(this.f26666p);
        } else {
            paint2.setShader(this.f26669s);
        }
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - qa00.f156316c, this.f26665o);
    }

    public QuickchatEntryAvatarBorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26667q = Color.parseColor("#FFC683");
        this.f26668r = Color.parseColor("#FF9D73");
    }

    public QuickchatEntryAvatarBorderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26667q = Color.parseColor("#FFC683");
        this.f26668r = Color.parseColor("#FF9D73");
    }
}
