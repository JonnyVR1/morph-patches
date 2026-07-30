package com.p046p1.mobile.putong.core.newui.messages;

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
import com.p046p1.mobile.putong.core.newui.messages.LiveHaloAvatar;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.e9c0;
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 `2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0011\u0010\nJ\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u000fJ\r\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\nJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\nJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010%R\u0016\u0010(\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010)\u001a\u00020$8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010%R\u0016\u0010*\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0014\u0010\u0019\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\"R\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\"\u00100\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00104\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010%\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\"\u0010:\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\"\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010F\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR\u0016\u0010H\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010%R\u0016\u0010J\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010=R\u001c\u0010N\u001a\n K*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR.\u0010[\u001a\u0004\u0018\u00010S2\b\u0010T\u001a\u0004\u0018\u00010S8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^¨\u0006a"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/messages/LiveHaloAvatar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "b", "()V", "", "aSize", "hSize", Constants.INAPP_DATA_TAG, "(II)V", "onAttachedToWindow", "onDetachedFromWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "haloStartColor", "haloEndColor", "e", "f", "g", "Landroid/animation/ValueAnimator;", "getAnimator", "()Landroid/animation/ValueAnimator;", "a", "I", "haloSize", "", "F", "innerStrokeWidth", "c", "innerHaloRadius", "outerStrokeWidth", "outerHaloRadius", "h", "getHaloZoomRatio", "()F", "setHaloZoomRatio", "(F)V", "haloZoomRatio", RXScreenCaptureService.KEY_INDEX, "getAvatarZoomRatio", "setAvatarZoomRatio", "avatarZoomRatio", "j", "getAvatarSize", "()I", "setAvatarSize", "(I)V", "avatarSize", "", "k", "Z", "getHasSecondHalo", "()Z", "setHasSecondHalo", "(Z)V", "hasSecondHalo", BLiveStormDanmakuGiftResourceType.f44444l, "getSecondHaloStart", "setSecondHaloStart", "secondHaloStart", "m", "animatedFraction", "n", "isStartAnimator", "kotlin.jvm.PlatformType", "o", "Landroid/animation/ValueAnimator;", "animator", "Landroid/graphics/Paint;", "p", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Bitmap;", "value", "q", "Landroid/graphics/Bitmap;", "getAvatar", "()Landroid/graphics/Bitmap;", "setAvatar", "(Landroid/graphics/Bitmap;)V", "avatar", "Landroid/graphics/Matrix;", "r", "Landroid/graphics/Matrix;", "bitmapMatrix", "Companion", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class LiveHaloAvatar extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int haloSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final float innerStrokeWidth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public float innerHaloRadius;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final float outerStrokeWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public float outerHaloRadius;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int haloStartColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int haloEndColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public float haloZoomRatio;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public float avatarZoomRatio;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int avatarSize;

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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.f90002V);
        this.haloSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.f90009Y, 0);
        this.avatarSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.f90005W, 0);
        int color = typedArrayObtainStyledAttributes.getColor(e9c0.f90011Z, -38485);
        this.haloStartColor = color;
        this.haloEndColor = typedArrayObtainStyledAttributes.getColor(e9c0.f90007X, -41238);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(e9c0.f90014a0, true);
        this.isStartAnimator = z;
        int i = this.haloSize;
        this.innerHaloRadius = (i - f) / 2.0f;
        this.outerHaloRadius = (i - f2) / 2.0f;
        if (z) {
            m41667b();
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setShader(new LinearGradient(0.0f, 0.0f, this.haloSize, 0.0f, color, this.haloEndColor, Shader.TileMode.CLAMP));
        this.paint = paint;
        this.bitmapMatrix = new Matrix();
    }

    /* JADX INFO: renamed from: c */
    public static final void m41666c(LiveHaloAvatar liveHaloAvatar, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        valueAnimator2.getClass();
        liveHaloAvatar.animatedFraction = valueAnimator.getAnimatedFraction();
        liveHaloAvatar.invalidate();
    }

    /* JADX INFO: renamed from: b */
    public final void m41667b() {
        final ValueAnimator valueAnimator = this.animator;
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setDuration(1500L);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fss
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                LiveHaloAvatar.m41666c(this.f99105a, valueAnimator, valueAnimator2);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m41668d(int aSize, int hSize) {
        this.avatarSize = aSize;
        this.haloSize = hSize;
        this.innerHaloRadius = (hSize - this.innerStrokeWidth) / 2.0f;
        this.outerHaloRadius = (hSize - this.outerStrokeWidth) / 2.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: e */
    public final void m41669e(int haloStartColor, int haloEndColor) {
        Paint paint = this.paint;
        int i = this.haloSize;
        paint.setShader(new LinearGradient(0.0f, i, i, 0.0f, haloStartColor, haloEndColor, Shader.TileMode.CLAMP));
    }

    /* JADX INFO: renamed from: f */
    public final void m41670f() {
        m41671g();
        this.animator.start();
    }

    /* JADX INFO: renamed from: g */
    public final void m41671g() {
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
        m41670f();
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

    public final void setAvatarSize(int i) {
        this.avatarSize = i;
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
