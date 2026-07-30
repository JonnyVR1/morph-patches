package com.p046p1.mobile.putong.live.base.view;

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
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.view.LiveHaloAvatar;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.n9c0;
import p149l.t100;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 B2\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0010J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\nJ\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\nR\u0014\u0010\u001c\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0016\u0010\"\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0014\u0010#\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u0014\u0010\u0015\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001bR\u0016\u0010\u0016\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001bR\u0017\u0010)\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010 R\u001c\u00100\u001a\n -*\u0004\u0018\u00010,0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R.\u0010=\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u0001058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006C"}, m87232d2 = {"Lcom/p1/mobile/putong/live/base/view/LiveHaloAvatar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "haloStartColor", "haloEndColor", "c", Constants.INAPP_DATA_TAG, "e", "a", "I", "haloSize", "b", "innerStrokeWidth", "", "F", "innerHaloRadius", "outerStrokeWidth", "outerHaloRadius", "f", "g", "h", "getAvatarSize", "()I", "avatarSize", RXScreenCaptureService.KEY_INDEX, "animatedFraction", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "j", "Landroid/animation/ValueAnimator;", "animator", "Landroid/graphics/Paint;", "k", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Bitmap;", "value", BLiveStormDanmakuGiftResourceType.f44444l, "Landroid/graphics/Bitmap;", "getAvatar", "()Landroid/graphics/Bitmap;", "setAvatar", "(Landroid/graphics/Bitmap;)V", "avatar", "Landroid/graphics/Matrix;", "m", "Landroid/graphics/Matrix;", "bitmapMatrix", "Companion", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class LiveHaloAvatar extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int haloSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int innerStrokeWidth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final float innerHaloRadius;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int outerStrokeWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final float outerHaloRadius;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int haloStartColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int haloEndColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final int avatarSize;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public float animatedFraction;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final ValueAnimator animator;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Paint paint;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public Bitmap avatar;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Matrix bitmapMatrix;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveHaloAvatar(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(1500L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ess
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LiveHaloAvatar.m68730b(this.f93050a, valueAnimatorOfFloat, valueAnimator);
            }
        });
        this.animator = valueAnimatorOfFloat;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n9c0.f137773m);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(n9c0.f137776p, 0);
        this.haloSize = dimensionPixelSize;
        this.avatarSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(n9c0.f137774n, 0);
        this.innerStrokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(n9c0.f137778r, t100.f167255d);
        this.outerStrokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(n9c0.f137779s, t100.f167254c);
        int color = typedArrayObtainStyledAttributes.getColor(n9c0.f137777q, -38485);
        this.haloStartColor = color;
        this.haloEndColor = typedArrayObtainStyledAttributes.getColor(n9c0.f137775o, -41238);
        this.innerHaloRadius = (dimensionPixelSize - this.innerStrokeWidth) / 2.0f;
        this.outerHaloRadius = (dimensionPixelSize - this.outerStrokeWidth) / 2.0f;
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setShader(new LinearGradient(0.0f, 0.0f, dimensionPixelSize, 0.0f, color, this.haloEndColor, Shader.TileMode.CLAMP));
        this.paint = paint;
        this.bitmapMatrix = new Matrix();
    }

    /* JADX INFO: renamed from: b */
    public static final void m68730b(LiveHaloAvatar liveHaloAvatar, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        valueAnimator2.getClass();
        liveHaloAvatar.animatedFraction = valueAnimator.getAnimatedFraction();
        liveHaloAvatar.invalidate();
    }

    /* JADX INFO: renamed from: c */
    public final void m68731c(int haloStartColor, int haloEndColor) {
        this.paint.setShader(new LinearGradient(0.0f, 0.0f, this.haloSize, 0.0f, haloStartColor, haloEndColor, Shader.TileMode.CLAMP));
    }

    /* JADX INFO: renamed from: d */
    public final void m68732d() {
        m68733e();
        this.animator.start();
    }

    /* JADX INFO: renamed from: e */
    public final void m68733e() {
        if (this.animator.isRunning()) {
            this.animator.cancel();
        }
    }

    @Nullable
    public final Bitmap getAvatar() {
        return this.avatar;
    }

    public final int getAvatarSize() {
        return this.avatarSize;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
        }
        m68732d();
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
        canvas.getClass();
        this.paint.setAlpha(255);
        this.paint.setStrokeWidth(this.innerStrokeWidth);
        int i = this.haloSize;
        canvas.drawCircle(i / 2.0f, i / 2.0f, this.innerHaloRadius, this.paint);
        if (this.animator.isRunning()) {
            this.paint.setStrokeWidth(this.outerStrokeWidth);
            float f2 = this.animatedFraction;
            float f3 = f2 * 1500.0f;
            Paint paint = this.paint;
            if (f3 < 500.0f) {
                paint.setAlpha(0);
                f = 1.0f;
            } else {
                paint.setAlpha((int) ((1.0f - (((f2 * 1500.0f) - 500.0f) / 1000.0f)) * 255.0f));
                f = ((((this.animatedFraction * 1500.0f) - 500.0f) / 1000.0f) * 0.20000005f) + 1.0f;
            }
            int i2 = this.haloSize;
            canvas.drawCircle(i2 / 2.0f, i2 / 2.0f, this.outerHaloRadius * f, this.paint);
        }
        Bitmap bitmap = this.avatar;
        if (bitmap != null) {
            this.paint.setAlpha(255);
            float f4 = (this.haloSize - this.avatarSize) / 2.0f;
            if (!this.animator.isRunning()) {
                this.bitmapMatrix.reset();
                this.bitmapMatrix.preTranslate(f4, f4);
                canvas.drawBitmap(bitmap, this.bitmapMatrix, this.paint);
                return;
            }
            float f5 = this.animatedFraction;
            float f6 = f5 * 1500.0f <= 666.0f ? 1.0f + (((f5 * 1500.0f) / 666.0f) * 0.100000024f) : 1.1f - ((((f5 * 1500.0f) - 666.0f) / 834.0f) * 0.100000024f);
            this.bitmapMatrix.reset();
            this.bitmapMatrix.preTranslate(f4, f4);
            Matrix matrix = this.bitmapMatrix;
            int i3 = this.avatarSize;
            matrix.preScale(f6, f6, i3 / 2, i3 / 2);
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
}
