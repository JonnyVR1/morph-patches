package com.p000p1.mobile.putong.core.p001ui.purchase.intlpage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.p001ui.purchase.intlpage.IntlPremiumDiscountPlanCardFrame;
import com.p1.mobile.android.app.App;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.a;
import l.b1c0;
import l.t100;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 82\u00020\u0001:\u0001\u0017B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\nJ\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u0014\u0010(\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010*\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010%R\u0014\u0010,\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010%R\u0016\u0010.\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010%R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00107\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPremiumDiscountPlanCardFrame;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "d", "f", "Landroid/graphics/Path;", "fillPath", "c", "(Landroid/graphics/Canvas;Landroid/graphics/Path;)V", "Landroid/graphics/Paint;", "a", "Landroid/graphics/Paint;", "fillPaint", "b", "glowDiffusePaint", "crispBorderPaint", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "roundRect", "Landroid/animation/ValueAnimator;", "e", "Landroid/animation/ValueAnimator;", "breathAnimator", "", "F", "strokeWidthPx", "g", "glowStrokeWidthPx", "h", "cornerRadiusPx", "i", "glowPathBaseOutsetPx", "j", "breathPhase", "", "k", "Lkotlin/Lazy;", "getBaseFillColor", "()I", "baseFillColor", "getDensity", "()F", "density", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class IntlPremiumDiscountPlanCardFrame extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Paint fillPaint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Paint glowDiffusePaint;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Paint crispBorderPaint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final RectF roundRect;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator breathAnimator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final float strokeWidthPx;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final float glowStrokeWidthPx;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final float cornerRadiusPx;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final float glowPathBaseOutsetPx;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public float breathPhase;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy baseFillColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlPremiumDiscountPlanCardFrame(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.fillPaint = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.glowDiffusePaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        this.crispBorderPaint = paint3;
        this.roundRect = new RectF();
        this.strokeWidthPx = t100.d(1.0f);
        this.glowStrokeWidthPx = t100.d(2.5f);
        this.cornerRadiusPx = t100.d(16.0f);
        this.glowPathBaseOutsetPx = t100.d(2.0f);
        this.baseFillColor = LazyKt__LazyJVMKt.a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.mto
            public final Object invoke() {
                return Integer.valueOf(IntlPremiumDiscountPlanCardFrame.m4296a());
            }
        });
        setWillNotDraw(false);
        setLayerType(1, null);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX INFO: renamed from: a */
    public static int m4296a() {
        return App.e.getColor(b1c0.I);
    }

    /* JADX INFO: renamed from: e */
    public static final void m4298e(IntlPremiumDiscountPlanCardFrame intlPremiumDiscountPlanCardFrame, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        intlPremiumDiscountPlanCardFrame.breathPhase = 1.0f - Math.abs((((Float) animatedValue).floatValue() * 2.0f) - 1.0f);
        intlPremiumDiscountPlanCardFrame.invalidate();
    }

    private final int getBaseFillColor() {
        return ((Number) this.baseFillColor.getValue()).intValue();
    }

    private final float getDensity() {
        return getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: c */
    public final void m4299c(Canvas canvas, Path fillPath) {
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(fillPath);
        } else {
            canvas.clipRect(0, 0, getWidth(), getHeight());
            canvas.clipPath(fillPath, Region.Op.DIFFERENCE);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4300d() {
        ValueAnimator valueAnimator = this.breathAnimator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.breathAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(2400L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.lto
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    IntlPremiumDiscountPlanCardFrame.m4298e(this.f15055a, valueAnimator3);
                }
            });
            valueAnimatorOfFloat.start();
            this.breathAnimator = valueAnimatorOfFloat;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4301f() {
        ValueAnimator valueAnimator = this.breathAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.breathAnimator = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m4300d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m4301f();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float width = getWidth() - getPaddingRight();
        float height = getHeight() - getPaddingBottom();
        if (width <= paddingLeft || height <= paddingTop) {
            return;
        }
        float f = this.strokeWidthPx / 2.0f;
        float f2 = this.breathPhase;
        Path path = new Path();
        float f3 = this.cornerRadiusPx;
        path.addRoundRect(paddingLeft, paddingTop, width, height, f3, f3, Path.Direction.CW);
        float f4 = 0.6f * f2;
        int iG = a.g((int) ((0.4f + f4) * 255.0f), 0, 255);
        float density = getDensity() * ((6.0f * f2) + 4.0f);
        float density2 = getDensity() * f2 * 3.0f;
        int iG2 = a.g((int) (f4 * 255.0f), 0, 255);
        float f5 = this.glowPathBaseOutsetPx + density2;
        this.roundRect.set(paddingLeft - f5, paddingTop - f5, width + f5, height + f5);
        float f6 = this.cornerRadiusPx + f5;
        this.glowDiffusePaint.setStrokeWidth(this.glowStrokeWidthPx);
        this.glowDiffusePaint.setColor(Color.argb(iG2, 216, 186, 142));
        this.glowDiffusePaint.setMaskFilter(new BlurMaskFilter(density, BlurMaskFilter.Blur.NORMAL));
        if (iG2 > 0) {
            canvas.save();
            m4299c(canvas, path);
            canvas.drawRoundRect(this.roundRect, f6, f6, this.glowDiffusePaint);
            canvas.restore();
        }
        this.glowDiffusePaint.setMaskFilter(null);
        this.roundRect.set(paddingLeft, paddingTop, width, height);
        this.fillPaint.setColor(getBaseFillColor());
        RectF rectF = this.roundRect;
        float f7 = this.cornerRadiusPx;
        canvas.drawRoundRect(rectF, f7, f7, this.fillPaint);
        this.roundRect.set(paddingLeft + f, paddingTop + f, width - f, height - f);
        this.crispBorderPaint.setStrokeWidth(this.strokeWidthPx);
        this.crispBorderPaint.setColor(Color.argb(iG, 216, 186, 142));
        RectF rectF2 = this.roundRect;
        float f8 = this.cornerRadiusPx;
        canvas.drawRoundRect(rectF2, f8, f8, this.crispBorderPaint);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public IntlPremiumDiscountPlanCardFrame(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public /* synthetic */ IntlPremiumDiscountPlanCardFrame(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
