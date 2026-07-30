package com.p046p1.mobile.putong.feed.newui.photoalbum.live;

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
import p149l.m9c0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedLiveLightView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f42014a;

    /* JADX INFO: renamed from: b */
    public RectF f42015b;

    /* JADX INFO: renamed from: c */
    public boolean f42016c;

    /* JADX INFO: renamed from: d */
    public LinearGradient f42017d;

    /* JADX INFO: renamed from: e */
    public LinearGradient f42018e;

    /* JADX INFO: renamed from: f */
    public int f42019f;

    /* JADX INFO: renamed from: g */
    public int f42020g;

    /* JADX INFO: renamed from: h */
    public int f42021h;

    /* JADX INFO: renamed from: i */
    public Path f42022i;

    /* JADX INFO: renamed from: j */
    public Path f42023j;

    /* JADX INFO: renamed from: k */
    public ValueAnimator f42024k;

    public FeedLiveLightView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f132749p0);
        this.f42020g = typedArrayObtainStyledAttributes.getInt(m9c0.f132753r0, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        this.f42019f = typedArrayObtainStyledAttributes.getInt(m9c0.f132751q0, 100);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public final void m64786b() {
        if (this.f42019f > getWidth() - (getHeight() * 2)) {
            this.f42019f = getWidth() - (getHeight() * 2);
        }
        if (NullChecker.m81303a(this.f42024k)) {
            this.f42024k.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-this.f42019f, getWidth() * 2);
        this.f42024k = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.kbh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f122240a.m64788d(valueAnimator);
            }
        });
        this.f42024k.setRepeatMode(1);
        this.f42024k.setRepeatCount(-1);
        this.f42024k.setDuration(this.f42020g);
        this.f42024k.start();
    }

    /* JADX INFO: renamed from: c */
    public final void m64787c() {
        this.f42016c = true;
        Paint paint = new Paint();
        this.f42014a = paint;
        paint.setColor(-1);
        this.f42014a.setAntiAlias(true);
        this.f42014a.setDither(true);
        this.f42014a.setStyle(Paint.Style.FILL);
        this.f42017d = new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, Color.parseColor("#ff3a00"), Color.parseColor("#ff852a"), Shader.TileMode.CLAMP);
        this.f42015b = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        Path path = new Path();
        this.f42022i = path;
        path.reset();
        this.f42022i.addRoundRect(this.f42015b, getHeight() / 2, getHeight() / 2, Path.Direction.CCW);
        this.f42023j = new Path();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m64788d(ValueAnimator valueAnimator) {
        this.f42021h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = this.f42021h;
        this.f42018e = new LinearGradient(i - 2, 0.0f, i + this.f42019f, 0.0f, Color.parseColor("#00000000"), Color.parseColor("#ff952a"), Shader.TileMode.CLAMP);
        postInvalidate();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!NullChecker.m81303a(this.f42024k) || this.f42024k.isRunning()) {
            return;
        }
        this.f42024k.start();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.m81303a(this.f42024k)) {
            this.f42024k.end();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && !this.f42016c) {
            m64787c();
            m64786b();
        }
        Paint paint = this.f42014a;
        if (paint == null) {
            return;
        }
        paint.setColor(-1);
        this.f42014a.setStyle(Paint.Style.FILL);
        this.f42014a.setShader(this.f42017d);
        canvas.drawRoundRect(this.f42015b, getHeight() / 2, getHeight() / 2, this.f42014a);
        int i = this.f42021h;
        this.f42023j.reset();
        this.f42023j.addRect(i, 0.0f, i + this.f42019f, getHeight(), Path.Direction.CCW);
        this.f42023j.op(this.f42022i, Path.Op.INTERSECT);
        this.f42014a.setShader(this.f42018e);
        canvas.drawPath(this.f42023j, this.f42014a);
        this.f42014a.setXfermode(null);
        this.f42014a.setShader(null);
    }

    public FeedLiveLightView(Context context) {
        this(context, null);
    }

    public FeedLiveLightView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42019f = 90;
        this.f42020g = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    }
}
