package com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.StickStatus;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzCircleCountdownView;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.qa00;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0010¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\u0010H\u0002¢\u0006\u0004\b)\u0010'R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\r\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010+R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010,R\u0016\u0010\u001f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010,R\u0016\u0010-\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010+R\u0016\u0010.\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010+R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010+R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010+R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzCircleCountdownView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ringColor", "defaultColor", "", "ringWidth", "", Constants.INAPP_DATA_TAG, "(IIF)V", "", "changed", BLiveGiftBubblePopupTitlePosition.left, StickStatus.top, "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "progress", "setProgress", "(F)V", "", BLiveOperationTitleShowType.duration, "f", "(FJ)V", "b", "()V", "e", "c", "a", "I", "F", "viewCenterX", "viewCenterY", "Landroid/graphics/RectF;", "g", "Landroid/graphics/RectF;", "ringRect", "h", "ringRadius", "Landroid/graphics/Paint;", RXScreenCaptureService.KEY_INDEX, "Landroid/graphics/Paint;", "ringPaint", "j", "padding", "Landroid/animation/ValueAnimator;", "k", "Landroid/animation/ValueAnimator;", "animator", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class BuzzCircleCountdownView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int ringColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int defaultColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public float ringWidth;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float progress;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int viewCenterX;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int viewCenterY;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public RectF ringRect;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int ringRadius;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public Paint ringPaint;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int padding;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator animator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuzzCircleCountdownView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.defaultColor = -1;
        this.ringWidth = 10.0f;
        this.ringRect = new RectF();
        this.ringPaint = new Paint();
        this.padding = qa00.f156318e;
    }

    /* JADX INFO: renamed from: a */
    public static void m48309a(BuzzCircleCountdownView buzzCircleCountdownView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        buzzCircleCountdownView.progress = ((Float) animatedValue).floatValue();
        buzzCircleCountdownView.invalidate();
    }

    /* JADX INFO: renamed from: b */
    public final void m48310b() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        valueAnimator.cancel();
    }

    /* JADX INFO: renamed from: c */
    public final void m48311c() {
        this.ringPaint.setAntiAlias(true);
        this.ringPaint.setStyle(Paint.Style.STROKE);
        this.ringPaint.setColor(this.ringColor);
        this.ringPaint.setStrokeWidth(this.ringWidth);
    }

    /* JADX INFO: renamed from: d */
    public final void m48312d(int ringColor, int defaultColor, float ringWidth) {
        this.ringColor = ringColor;
        this.ringWidth = ringWidth;
        this.defaultColor = defaultColor;
        m48311c();
    }

    /* JADX INFO: renamed from: e */
    public final void m48313e() {
        setProgress(0.0f);
    }

    /* JADX INFO: renamed from: f */
    public final void m48314f(float progress, long duration) {
        m48310b();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.progress, progress);
        this.animator = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.eo3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BuzzCircleCountdownView.m48309a(this.f94864a, valueAnimator);
                }
            });
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator2 = this.animator;
        if (valueAnimator2 != null) {
            valueAnimator2.setDuration(duration);
        }
        ValueAnimator valueAnimator3 = this.animator;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Canvas canvas2;
        canvas.getClass();
        int i = this.defaultColor;
        if (i != 0) {
            this.ringPaint.setColor(i);
            canvas2 = canvas;
            canvas2.drawArc(this.ringRect, 90.0f, 360.0f, false, this.ringPaint);
        } else {
            canvas2 = canvas;
        }
        this.ringPaint.setColor(this.ringColor);
        RectF rectF = this.ringRect;
        float f = this.progress;
        canvas2.drawArc(rectF, (360.0f * f) - 90.0f, 360.0f - (f * 360.0f), false, this.ringPaint);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.ringRadius = Math.min((getMeasuredWidth() - this.padding) / 2, (getMeasuredHeight() - this.padding) / 2);
        this.viewCenterX = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        this.viewCenterY = measuredHeight;
        RectF rectF = this.ringRect;
        int i = this.viewCenterX;
        int i2 = this.ringRadius;
        float f = this.ringWidth;
        rectF.left = (i - i2) + (f / 2.0f);
        rectF.top = (measuredHeight - i2) + (f / 2.0f);
        rectF.right = (i + i2) - (f / 2.0f);
        rectF.bottom = (measuredHeight + i2) - (f / 2.0f);
    }

    public final void setProgress(float progress) {
        this.progress = progress;
        postInvalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuzzCircleCountdownView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuzzCircleCountdownView(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
