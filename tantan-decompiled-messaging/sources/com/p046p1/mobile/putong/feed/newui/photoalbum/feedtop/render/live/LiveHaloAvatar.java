package com.p046p1.mobile.putong.feed.newui.photoalbum.feedtop.render.live;

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
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedtop.render.live.LiveHaloAvatar;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.m9c0;
import p149l.t100;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 D2\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0013\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u000fJ\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u000fR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001fR\u0014\u0010\"\u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR\u0014\u0010#\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0016\u0010%\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001bR\u0016\u0010'\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001bR\u0017\u0010+\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u001fR\u001c\u00102\u001a\n /*\u0004\u0018\u00010.0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R.\u0010?\u001a\u0004\u0018\u0001072\b\u00108\u001a\u0004\u0018\u0001078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006E"}, m87232d2 = {"Lcom/p1/mobile/putong/feed/newui/photoalbum/feedtop/render/live/LiveHaloAvatar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "startColor", "endColor", "", "c", "(II)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", Constants.INAPP_DATA_TAG, "e", "a", "I", "haloSize", "", "b", "F", "innerStrokeWidth", "innerHaloRadius", "outerStrokeWidth", "outerHaloRadius", "f", "haloStartColor", "g", "haloEndColor", "h", "getAvatarSize", "()I", "avatarSize", RXScreenCaptureService.KEY_INDEX, "animatedFraction", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "j", "Landroid/animation/ValueAnimator;", "animator", "Landroid/graphics/Paint;", "k", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Bitmap;", "value", BLiveStormDanmakuGiftResourceType.f44444l, "Landroid/graphics/Bitmap;", "getAvatar", "()Landroid/graphics/Bitmap;", "setAvatar", "(Landroid/graphics/Bitmap;)V", "avatar", "Landroid/graphics/Matrix;", "m", "Landroid/graphics/Matrix;", "bitmapMatrix", "Companion", "b_feed_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public int haloStartColor;

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
        float f = t100.f167255d;
        this.innerStrokeWidth = f;
        float f2 = t100.f167254c;
        this.outerStrokeWidth = f2;
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(1500L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.dss
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LiveHaloAvatar.m64718b(this.f87788a, valueAnimatorOfFloat, valueAnimator);
            }
        });
        this.animator = valueAnimatorOfFloat;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f132760v);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(m9c0.f132766y, 0);
        this.haloSize = dimensionPixelSize;
        this.avatarSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(m9c0.f132762w, 0);
        this.haloStartColor = typedArrayObtainStyledAttributes.getColor(m9c0.f132768z, -38485);
        this.haloEndColor = typedArrayObtainStyledAttributes.getColor(m9c0.f132764x, -41238);
        this.innerHaloRadius = (dimensionPixelSize - f) / 2.0f;
        this.outerHaloRadius = (dimensionPixelSize - f2) / 2.0f;
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setShader(new LinearGradient(0.0f, 0.0f, dimensionPixelSize, 0.0f, this.haloStartColor, this.haloEndColor, Shader.TileMode.CLAMP));
        this.paint = paint;
        this.bitmapMatrix = new Matrix();
    }

    /* JADX INFO: renamed from: b */
    public static final void m64718b(LiveHaloAvatar liveHaloAvatar, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        valueAnimator2.getClass();
        liveHaloAvatar.animatedFraction = valueAnimator.getAnimatedFraction();
        liveHaloAvatar.invalidate();
    }

    /* JADX INFO: renamed from: c */
    public final void m64719c(int startColor, int endColor) {
        this.haloStartColor = startColor;
        this.haloEndColor = endColor;
        this.paint.setShader(new LinearGradient(0.0f, 0.0f, this.haloSize, 0.0f, this.haloStartColor, this.haloEndColor, Shader.TileMode.CLAMP));
    }

    /* JADX INFO: renamed from: d */
    public final void m64720d() {
        m64721e();
        this.animator.start();
    }

    /* JADX INFO: renamed from: e */
    public final void m64721e() {
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
        m64720d();
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
