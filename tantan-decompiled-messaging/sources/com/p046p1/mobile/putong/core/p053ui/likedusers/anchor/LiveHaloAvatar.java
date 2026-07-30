package com.p046p1.mobile.putong.core.p053ui.likedusers.anchor;

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
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.p053ui.likedusers.anchor.LiveHaloAvatar;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.h9c0;
import p149l.t100;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \\2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0011J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\nJ\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\nJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010%\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010&\u001a\u00020!8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0014\u0010'\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0016\u0010\u0017\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001fR\"\u0010.\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00102\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\"\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R\u0017\u00106\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b3\u0010\u001f\u001a\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010B\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00109\u001a\u0004\b@\u0010;\"\u0004\bA\u0010=R\u0016\u0010D\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010\"R\u0016\u0010F\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00109R\u001c\u0010J\u001a\n G*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR.\u0010W\u001a\u0004\u0018\u00010O2\b\u0010P\u001a\u0004\u0018\u00010O8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006]"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/likedusers/anchor/LiveHaloAvatar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "b", "()V", "onAttachedToWindow", "onDetachedFromWindow", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "haloStartColor", "haloEndColor", Constants.INAPP_DATA_TAG, "e", "f", "Landroid/animation/ValueAnimator;", "getAnimator", "()Landroid/animation/ValueAnimator;", "a", "I", "haloSize", "", "F", "innerStrokeWidth", "c", "innerHaloRadius", "outerStrokeWidth", "outerHaloRadius", "g", "h", "getHaloZoomRatio", "()F", "setHaloZoomRatio", "(F)V", "haloZoomRatio", RXScreenCaptureService.KEY_INDEX, "getAvatarZoomRatio", "setAvatarZoomRatio", "avatarZoomRatio", "j", "getAvatarSize", "()I", "avatarSize", "", "k", "Z", "getHasSecondHalo", "()Z", "setHasSecondHalo", "(Z)V", "hasSecondHalo", BLiveStormDanmakuGiftResourceType.f44444l, "getSecondHaloStart", "setSecondHaloStart", "secondHaloStart", "m", "animatedFraction", "n", "isStartAnimator", "kotlin.jvm.PlatformType", "o", "Landroid/animation/ValueAnimator;", "animator", "Landroid/graphics/Paint;", "p", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Bitmap;", "value", "q", "Landroid/graphics/Bitmap;", "getAvatar", "()Landroid/graphics/Bitmap;", "setAvatar", "(Landroid/graphics/Bitmap;)V", "avatar", "Landroid/graphics/Matrix;", "r", "Landroid/graphics/Matrix;", "bitmapMatrix", "Companion", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class LiveHaloAvatar extends View {

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
    public float avatarZoomRatio;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final int avatarSize;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean hasSecondHalo;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean secondHaloStart;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public float animatedFraction;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean isStartAnimator;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final ValueAnimator animator;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Paint paint;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public Bitmap avatar;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final Matrix bitmapMatrix;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveHaloAvatar(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        float f = t100.f167255d;
        this.innerStrokeWidth = f;
        float f2 = t100.f167254c;
        this.outerStrokeWidth = f2;
        this.haloZoomRatio = 1.2f;
        this.avatarZoomRatio = 1.1f;
        this.isStartAnimator = true;
        this.animator = ValueAnimator.ofFloat(0.0f, 1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h9c0.f106554k);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(h9c0.f106557n, 0);
        this.haloSize = dimensionPixelSize;
        this.avatarSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(h9c0.f106555l, 0);
        int color = typedArrayObtainStyledAttributes.getColor(h9c0.f106558o, -38485);
        this.haloStartColor = color;
        this.haloEndColor = typedArrayObtainStyledAttributes.getColor(h9c0.f106556m, -41238);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(h9c0.f106559p, true);
        this.isStartAnimator = z;
        this.innerHaloRadius = (dimensionPixelSize - f) / 2.0f;
        this.outerHaloRadius = (dimensionPixelSize - f2) / 2.0f;
        if (z) {
            m46811b();
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
    public static final void m46810c(LiveHaloAvatar liveHaloAvatar, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        valueAnimator2.getClass();
        liveHaloAvatar.animatedFraction = valueAnimator.getAnimatedFraction();
        liveHaloAvatar.invalidate();
    }

    /* JADX INFO: renamed from: b */
    public final void m46811b() {
        final ValueAnimator valueAnimator = this.animator;
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setDuration(1500L);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.css
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                LiveHaloAvatar.m46810c(this.f82376a, valueAnimator, valueAnimator2);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m46812d(int haloStartColor, int haloEndColor) {
        Paint paint = this.paint;
        int i = this.haloSize;
        paint.setShader(new LinearGradient(0.0f, i, i, 0.0f, haloStartColor, haloEndColor, Shader.TileMode.CLAMP));
    }

    /* JADX INFO: renamed from: e */
    public final void m46813e() {
        m46814f();
        this.animator.start();
    }

    /* JADX INFO: renamed from: f */
    public final void m46814f() {
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

    public final float getAvatarZoomRatio() {
        return this.avatarZoomRatio;
    }

    public final float getHaloZoomRatio() {
        return this.haloZoomRatio;
    }

    public final boolean getHasSecondHalo() {
        return this.hasSecondHalo;
    }

    public final boolean getSecondHaloStart() {
        return this.secondHaloStart;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
        }
        m46813e();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.animator.removeAllListeners();
        this.animator.cancel();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        float f;
        float f2;
        canvas.getClass();
        this.paint.setAlpha(255);
        this.paint.setStrokeWidth(this.innerStrokeWidth);
        int i = this.haloSize;
        canvas.drawCircle(i / 2.0f, i / 2.0f, this.innerHaloRadius, this.paint);
        if (this.animator.isRunning()) {
            this.paint.setStrokeWidth(this.outerStrokeWidth);
            float f3 = this.animatedFraction;
            float f4 = f3 * 1500.0f;
            Paint paint = this.paint;
            if (f4 < 500.0f) {
                paint.setAlpha(0);
                f = 1.0f;
            } else {
                paint.setAlpha((int) ((1.0f - (((f3 * 1500.0f) - 500.0f) / 1000.0f)) * 255.0f));
                f = ((((this.animatedFraction * 1500.0f) - 500.0f) / 1000.0f) * (this.haloZoomRatio - 1.0f)) + 1.0f;
            }
            int i2 = this.haloSize;
            canvas.drawCircle(i2 / 2.0f, i2 / 2.0f, this.outerHaloRadius * f, this.paint);
            if (this.hasSecondHalo) {
                float f5 = this.animatedFraction + 0.5f;
                if (f5 > 1.0f) {
                    f5 -= 1.0f;
                    this.secondHaloStart = true;
                }
                if (this.secondHaloStart) {
                    this.paint.setStrokeWidth(this.outerStrokeWidth);
                    float f6 = f5 * 1500.0f;
                    Paint paint2 = this.paint;
                    if (f6 < 500.0f) {
                        paint2.setAlpha(0);
                        f2 = 1.0f;
                    } else {
                        float f7 = (f6 - 500.0f) / 1000.0f;
                        paint2.setAlpha((int) ((1.0f - f7) * 255.0f));
                        f2 = (f7 * (this.haloZoomRatio - 1.0f)) + 1.0f;
                    }
                    int i3 = this.haloSize;
                    canvas.drawCircle(i3 / 2.0f, i3 / 2.0f, this.outerHaloRadius * f2, this.paint);
                }
            }
        }
        Bitmap bitmap = this.avatar;
        if (bitmap != null) {
            this.paint.setAlpha(255);
            float f8 = (this.haloSize - this.avatarSize) / 2.0f;
            if (!this.animator.isRunning()) {
                this.bitmapMatrix.reset();
                this.bitmapMatrix.preTranslate(f8, f8);
                canvas.drawBitmap(bitmap, this.bitmapMatrix, this.paint);
                return;
            }
            float f9 = this.animatedFraction;
            float f10 = f9 * 1500.0f;
            float f11 = this.avatarZoomRatio;
            float f12 = f10 <= 666.0f ? 1.0f + (((f9 * 1500.0f) / 666.0f) * (f11 - 1.0f)) : f11 - ((((f9 * 1500.0f) - 666.0f) / 834.0f) * (f11 - 1.0f));
            this.bitmapMatrix.reset();
            this.bitmapMatrix.preTranslate(f8, f8);
            Matrix matrix = this.bitmapMatrix;
            int i4 = this.avatarSize;
            matrix.preScale(f12, f12, i4 / 2, i4 / 2);
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

    public final void setAvatarZoomRatio(float f) {
        this.avatarZoomRatio = f;
    }

    public final void setHaloZoomRatio(float f) {
        this.haloZoomRatio = f;
    }

    public final void setHasSecondHalo(boolean z) {
        this.hasSecondHalo = z;
    }

    public final void setSecondHaloStart(boolean z) {
        this.secondHaloStart = z;
    }
}
