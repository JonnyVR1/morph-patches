package com.p051p1.mobile.putong.feed.newui.photoalbum.live;

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
import com.google.android.gms.common.ConnectionResult;
import com.tantanapp.common.utils.NullChecker;
import p153l.shc0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedLiveLightView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f42862a;

    /* JADX INFO: renamed from: b */
    public RectF f42863b;

    /* JADX INFO: renamed from: c */
    public boolean f42864c;

    /* JADX INFO: renamed from: d */
    public LinearGradient f42865d;

    /* JADX INFO: renamed from: e */
    public LinearGradient f42866e;

    /* JADX INFO: renamed from: f */
    public int f42867f;

    /* JADX INFO: renamed from: g */
    public int f42868g;

    /* JADX INFO: renamed from: h */
    public int f42869h;

    /* JADX INFO: renamed from: i */
    public Path f42870i;

    /* JADX INFO: renamed from: j */
    public Path f42871j;

    /* JADX INFO: renamed from: k */
    public ValueAnimator f42872k;

    public FeedLiveLightView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, shc0.f168671p0);
        this.f42868g = typedArrayObtainStyledAttributes.getInt(shc0.f168675r0, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        this.f42867f = typedArrayObtainStyledAttributes.getInt(shc0.f168673q0, 100);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public final void m65969b() {
        if (this.f42867f > getWidth() - (getHeight() * 2)) {
            this.f42867f = getWidth() - (getHeight() * 2);
        }
        if (NullChecker.m82486a(this.f42872k)) {
            this.f42872k.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-this.f42867f, getWidth() * 2);
        this.f42872k = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.zch
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f203760a.m65971d(valueAnimator);
            }
        });
        this.f42872k.setRepeatMode(1);
        this.f42872k.setRepeatCount(-1);
        this.f42872k.setDuration(this.f42868g);
        this.f42872k.start();
    }

    /* JADX INFO: renamed from: c */
    public final void m65970c() {
        this.f42864c = true;
        Paint paint = new Paint();
        this.f42862a = paint;
        paint.setColor(-1);
        this.f42862a.setAntiAlias(true);
        this.f42862a.setDither(true);
        this.f42862a.setStyle(Paint.Style.FILL);
        this.f42865d = new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, Color.parseColor("#ff3a00"), Color.parseColor("#ff852a"), Shader.TileMode.CLAMP);
        this.f42863b = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        Path path = new Path();
        this.f42870i = path;
        path.reset();
        this.f42870i.addRoundRect(this.f42863b, getHeight() / 2, getHeight() / 2, Path.Direction.CCW);
        this.f42871j = new Path();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m65971d(ValueAnimator valueAnimator) {
        this.f42869h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = this.f42869h;
        this.f42866e = new LinearGradient(i - 2, 0.0f, i + this.f42867f, 0.0f, Color.parseColor("#00000000"), Color.parseColor("#ff952a"), Shader.TileMode.CLAMP);
        postInvalidate();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!NullChecker.m82486a(this.f42872k) || this.f42872k.isRunning()) {
            return;
        }
        this.f42872k.start();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.m82486a(this.f42872k)) {
            this.f42872k.end();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && !this.f42864c) {
            m65970c();
            m65969b();
        }
        Paint paint = this.f42862a;
        if (paint == null) {
            return;
        }
        paint.setColor(-1);
        this.f42862a.setStyle(Paint.Style.FILL);
        this.f42862a.setShader(this.f42865d);
        canvas.drawRoundRect(this.f42863b, getHeight() / 2, getHeight() / 2, this.f42862a);
        int i = this.f42869h;
        this.f42871j.reset();
        this.f42871j.addRect(i, 0.0f, i + this.f42867f, getHeight(), Path.Direction.CCW);
        this.f42871j.op(this.f42870i, Path.Op.INTERSECT);
        this.f42862a.setShader(this.f42866e);
        canvas.drawPath(this.f42871j, this.f42862a);
        this.f42862a.setXfermode(null);
        this.f42862a.setShader(null);
    }

    public FeedLiveLightView(Context context) {
        this(context, null);
    }

    public FeedLiveLightView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42867f = 90;
        this.f42868g = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    }
}
