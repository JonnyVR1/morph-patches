package com.p051p1.mobile.putong.live.external.voice.entry;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import p151v.VDraweeView;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
public class LiveEntryAvatarBorderView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public Paint f47239o;

    /* JADX INFO: renamed from: p */
    public LinearGradient f47240p;

    /* JADX INFO: renamed from: q */
    public int f47241q;

    /* JADX INFO: renamed from: r */
    public int f47242r;

    /* JADX INFO: renamed from: s */
    public LinearGradient f47243s;

    public LiveEntryAvatarBorderView(Context context) {
        super(context);
        this.f47241q = Color.parseColor("#41d2ff");
        this.f47242r = Color.parseColor("#279aff");
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // p151v.VDraweeView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f47243s == null || this.f47240p == null) {
            int i = qa00.f156322i;
            int i2 = this.f47241q;
            int i3 = this.f47242r;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f47243s = new LinearGradient(-i, getHeight() + i, qa00.f156309V, -i, i2, i3, tileMode);
            int i4 = qa00.f156333t;
            this.f47240p = new LinearGradient(-i4, getHeight() - i, qa00.f156307T, -i4, this.f47241q, this.f47242r, tileMode);
        }
        if (this.f47239o == null) {
            Paint paint = new Paint();
            this.f47239o = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f47239o.setAntiAlias(true);
            this.f47239o.setStrokeWidth(qa00.m175859d(2.0f));
        }
        float translationX = getTranslationX();
        float width = getWidth() / 2.0f;
        Paint paint2 = this.f47239o;
        if (translationX > width) {
            paint2.setShader(this.f47240p);
        } else {
            paint2.setShader(this.f47243s);
        }
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - qa00.f156316c, this.f47239o);
    }

    /* JADX INFO: renamed from: u */
    public void m72126u(int i, int i2) {
        this.f47241q = i;
        this.f47242r = i2;
        postInvalidate();
    }

    public LiveEntryAvatarBorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47241q = Color.parseColor("#41d2ff");
        this.f47242r = Color.parseColor("#279aff");
    }

    public LiveEntryAvatarBorderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f47241q = Color.parseColor("#41d2ff");
        this.f47242r = Color.parseColor("#279aff");
    }
}
