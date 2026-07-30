package com.p000p1.mobile.putong.feed.newui.photoalbum.live;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p007l.m9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedLiveLightView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f3475a;

    /* JADX INFO: renamed from: b */
    public RectF f3476b;

    /* JADX INFO: renamed from: c */
    public boolean f3477c;

    /* JADX INFO: renamed from: d */
    public LinearGradient f3478d;

    /* JADX INFO: renamed from: e */
    public LinearGradient f3479e;

    /* JADX INFO: renamed from: f */
    public int f3480f;

    /* JADX INFO: renamed from: g */
    public int f3481g;

    /* JADX INFO: renamed from: h */
    public int f3482h;

    /* JADX INFO: renamed from: i */
    public Path f3483i;

    /* JADX INFO: renamed from: j */
    public Path f3484j;

    /* JADX INFO: renamed from: k */
    public ValueAnimator f3485k;

    public FeedLiveLightView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f10340p0);
        this.f3481g = typedArrayObtainStyledAttributes.getInt(m9c0.f10344r0, 1500);
        this.f3480f = typedArrayObtainStyledAttributes.getInt(m9c0.f10342q0, 100);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public final void m5883b() {
        if (this.f3480f > getWidth() - (getHeight() * 2)) {
            this.f3480f = getWidth() - (getHeight() * 2);
        }
        if (NullChecker.a(this.f3485k)) {
            this.f3485k.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-this.f3480f, getWidth() * 2);
        this.f3485k = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.kbh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f9669a.m5885d(valueAnimator);
            }
        });
        this.f3485k.setRepeatMode(1);
        this.f3485k.setRepeatCount(-1);
        this.f3485k.setDuration(this.f3481g);
        this.f3485k.start();
    }

    /* JADX INFO: renamed from: c */
    public final void m5884c() {
        this.f3477c = true;
        Paint paint = new Paint();
        this.f3475a = paint;
        paint.setColor(-1);
        this.f3475a.setAntiAlias(true);
        this.f3475a.setDither(true);
        this.f3475a.setStyle(Paint.Style.FILL);
        this.f3478d = new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, Color.parseColor("#ff3a00"), Color.parseColor("#ff852a"), Shader.TileMode.CLAMP);
        this.f3476b = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        Path path = new Path();
        this.f3483i = path;
        path.reset();
        this.f3483i.addRoundRect(this.f3476b, getHeight() / 2, getHeight() / 2, Path.Direction.CCW);
        this.f3484j = new Path();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m5885d(ValueAnimator valueAnimator) {
        this.f3482h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = this.f3482h;
        this.f3479e = new LinearGradient(i - 2, 0.0f, i + this.f3480f, 0.0f, Color.parseColor("#00000000"), Color.parseColor("#ff952a"), Shader.TileMode.CLAMP);
        postInvalidate();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!NullChecker.a(this.f3485k) || this.f3485k.isRunning()) {
            return;
        }
        this.f3485k.start();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.a(this.f3485k)) {
            this.f3485k.end();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && !this.f3477c) {
            m5884c();
            m5883b();
        }
        Paint paint = this.f3475a;
        if (paint == null) {
            return;
        }
        paint.setColor(-1);
        this.f3475a.setStyle(Paint.Style.FILL);
        this.f3475a.setShader(this.f3478d);
        canvas.drawRoundRect(this.f3476b, getHeight() / 2, getHeight() / 2, this.f3475a);
        int i = this.f3482h;
        this.f3484j.reset();
        this.f3484j.addRect(i, 0.0f, i + this.f3480f, getHeight(), Path.Direction.CCW);
        this.f3484j.op(this.f3483i, Path.Op.INTERSECT);
        this.f3475a.setShader(this.f3479e);
        canvas.drawPath(this.f3484j, this.f3475a);
        this.f3475a.setXfermode(null);
        this.f3475a.setShader(null);
    }

    public FeedLiveLightView(Context context) {
        this(context, null);
    }

    public FeedLiveLightView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3480f = 90;
        this.f3481g = 1500;
    }
}
