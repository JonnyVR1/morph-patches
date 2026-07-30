package com.p000p1.mobile.putong.core.newui.home.bubble.internalpush;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.LiveVirtualPushHaloAvatar;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import l.e9c0;
import l.t100;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 N2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\nJ\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\nJ\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010\"\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010#\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010$\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0014\u0010&\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001cR\u0016\u0010(\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001cR\"\u0010.\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0017\u00102\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b/\u0010\u001c\u001a\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010\u001fR\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010<\u001a\n 9*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R.\u0010I\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010A8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006O"}, d2 = {"Lcom/p1/mobile/putong/core/newui/home/bubble/internalpush/LiveVirtualPushHaloAvatar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "b", "()V", "onAttachedToWindow", "onDetachedFromWindow", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "d", "e", "Landroid/animation/ValueAnimator;", "getAnimator", "()Landroid/animation/ValueAnimator;", "a", "I", "haloSize", "", "F", "innerStrokeWidth", "c", "innerHaloRadius", "outerStrokeWidth", "outerHaloRadius", "f", "haloStartColor", "g", "haloEndColor", "h", "getHaloZoomRatio", "()F", "setHaloZoomRatio", "(F)V", "haloZoomRatio", "i", "getAvatarSize", "()I", "avatarSize", "j", "animatedFraction", "", "k", "Z", "isStartAnimator", "kotlin.jvm.PlatformType", "l", "Landroid/animation/ValueAnimator;", "animator", "Landroid/graphics/Paint;", "m", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Bitmap;", "value", "n", "Landroid/graphics/Bitmap;", "getAvatar", "()Landroid/graphics/Bitmap;", "setAvatar", "(Landroid/graphics/Bitmap;)V", "avatar", "Landroid/graphics/Matrix;", "o", "Landroid/graphics/Matrix;", "bitmapMatrix", "Companion", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class LiveVirtualPushHaloAvatar extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int haloSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final float innerStrokeWidth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final float innerHaloRadius;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final float outerStrokeWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final float outerHaloRadius;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int haloStartColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int haloEndColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public float haloZoomRatio;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int avatarSize;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public float animatedFraction;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isStartAnimator;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final ValueAnimator animator;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Paint paint;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public Bitmap avatar;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Matrix bitmapMatrix;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveVirtualPushHaloAvatar(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        float f = t100.d;
        this.innerStrokeWidth = f;
        float f2 = t100.c;
        this.outerStrokeWidth = f2;
        this.haloZoomRatio = 1.6f;
        this.isStartAnimator = true;
        this.animator = ValueAnimator.ofFloat(0.0f, 1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.V);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.Y, 0);
        this.haloSize = dimensionPixelSize;
        this.avatarSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.W, 0);
        int color = typedArrayObtainStyledAttributes.getColor(e9c0.Z, -38485);
        this.haloStartColor = color;
        this.haloEndColor = typedArrayObtainStyledAttributes.getColor(e9c0.X, -41238);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(e9c0.a0, true);
        this.isStartAnimator = z;
        this.innerHaloRadius = (dimensionPixelSize - f) / 2.0f;
        this.outerHaloRadius = (dimensionPixelSize - f2) / 2.0f;
        if (z) {
            m1851b();
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setShader(new LinearGradient(0.0f, 0.0f, dimensionPixelSize, 0.0f, color, this.haloEndColor, Shader.TileMode.CLAMP));
        this.paint = paint;
        this.bitmapMatrix = new Matrix();
    }

    /* JADX INFO: renamed from: c */
    public static final void m1850c(LiveVirtualPushHaloAvatar liveVirtualPushHaloAvatar, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        valueAnimator2.getClass();
        liveVirtualPushHaloAvatar.animatedFraction = valueAnimator.getAnimatedFraction();
        liveVirtualPushHaloAvatar.invalidate();
    }

    /* JADX INFO: renamed from: b */
    public final void m1851b() {
        final ValueAnimator valueAnimator = this.animator;
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setDuration(3000L);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fxu
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                LiveVirtualPushHaloAvatar.m1850c(this.f13214a, valueAnimator, valueAnimator2);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m1852d() {
        m1853e();
        this.animator.start();
    }

    /* JADX INFO: renamed from: e */
    public final void m1853e() {
        if (this.animator.isRunning()) {
            this.animator.cancel();
        }
    }

    @NotNull
    public final ValueAnimator getAnimator() {
        ValueAnimator valueAnimator = this.animator;
        valueAnimator.getClass();
        return valueAnimator;
    }

    @Nullable
    public final Bitmap getAvatar() {
        return this.avatar;
    }

    public final int getAvatarSize() {
        return this.avatarSize;
    }

    public final float getHaloZoomRatio() {
        return this.haloZoomRatio;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
        }
        m1852d();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1853e();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        float f;
        canvas.getClass();
        if (this.animator.isRunning()) {
            this.paint.setAlpha(0);
            float f2 = this.animatedFraction;
            float f3 = 1.0f;
            if (f2 * 3000.0f < 1400.0f) {
                float f4 = f2 / 0.46666667f;
                float f5 = ((f4 * 3000.0f) - 0.0f) / 3000.0f;
                this.paint.setAlpha((int) ((1.0f - f5) * 255.0f));
                f = (f5 * (this.haloZoomRatio - 1.0f)) + 1.0f;
                this.paint.setStrokeWidth(this.outerStrokeWidth + f4);
            } else {
                f = 1.0f;
            }
            int i = this.haloSize;
            canvas.drawCircle(i / 2.0f, i / 2.0f, this.outerHaloRadius * f, this.paint);
            this.paint.setAlpha(0);
            float f6 = this.animatedFraction;
            if (f6 * 3000.0f < 2000.0f && f6 * 3000.0f > 700.0f) {
                float f7 = (f6 - 0.23333333f) / 0.43333334f;
                float f8 = ((f7 * 3000.0f) - 0.0f) / 3000.0f;
                this.paint.setAlpha((int) ((1.0f - f8) * 255.0f));
                f3 = 1.0f + (f8 * (this.haloZoomRatio - 1.0f));
                this.paint.setStrokeWidth(this.outerStrokeWidth + f7);
            }
            int i2 = this.haloSize;
            canvas.drawCircle(i2 / 2.0f, i2 / 2.0f, this.outerHaloRadius * f3, this.paint);
        }
        Bitmap bitmap = this.avatar;
        if (bitmap != null) {
            this.paint.setAlpha(255);
            float f9 = (this.haloSize - this.avatarSize) / 2.0f;
            this.bitmapMatrix.reset();
            this.bitmapMatrix.preTranslate(f9, f9);
            canvas.drawBitmap(bitmap, this.bitmapMatrix, this.paint);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.haloSize, 1073741824);
        setMeasuredDimension(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public final void setAvatar(@Nullable Bitmap bitmap) {
        float f;
        float f2;
        if (bitmap != null) {
            int i = this.avatarSize;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            int i2 = this.avatarSize;
            canvas.drawCircle(i2 / 2.0f, i2 / 2.0f, i2 / 2.0f, paint);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i3 = this.avatarSize;
            float f3 = 0.0f;
            if (width * i3 > i3 * height) {
                f = (i3 * 1.0f) / height;
                float f4 = (i3 - (width * f)) * 0.5f;
                f2 = 0.0f;
                f3 = f4;
            } else {
                f = (i3 * 1.0f) / width;
                f2 = (i3 - (height * f)) * 0.5f;
            }
            Matrix matrix = new Matrix();
            matrix.setScale(f, f);
            matrix.postTranslate(f3, f2);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, matrix, paint);
            this.avatar = bitmapCreateBitmap;
        }
    }

    public final void setHaloZoomRatio(float f) {
        this.haloZoomRatio = f;
    }
}
