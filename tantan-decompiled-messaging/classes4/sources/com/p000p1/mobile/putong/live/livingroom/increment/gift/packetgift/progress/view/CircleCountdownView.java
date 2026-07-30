package com.p000p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import l.t100;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.p9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ7\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\bJ\u000f\u0010 \u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010\u001eR\u0016\u0010\"\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u0016\u0010$\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010#R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0016\u0010%\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0016\u0010'\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010!R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010!R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/CircleCountdownView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "changed", "left", "top", "right", "bottom", "", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "progress", "d", "(F)V", "c", "()V", "a", "b", "I", "ringColor", "F", "ringWidth", "viewCenterX", "e", "viewCenterY", "Landroid/graphics/RectF;", "f", "Landroid/graphics/RectF;", "ringRect", "g", "ringRadius", "Landroid/graphics/Paint;", "h", "Landroid/graphics/Paint;", "ringPaint", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CircleCountdownView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int ringColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public float ringWidth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public float progress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int viewCenterX;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int viewCenterY;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public RectF ringRect;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int ringRadius;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public Paint ringPaint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleCountdownView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.ringWidth = 10.0f;
        this.ringRect = new RectF();
        this.ringPaint = new Paint();
        m7480a(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m7480a(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, p9c0.f17122e);
            this.ringColor = typedArrayObtainStyledAttributes.getColor(p9c0.f17124f, -16777216);
            this.ringWidth = typedArrayObtainStyledAttributes.getDimension(p9c0.f17126g, t100.d(5.0f));
            typedArrayObtainStyledAttributes.recycle();
            m7481b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7481b() {
        this.ringPaint.setAntiAlias(true);
        this.ringPaint.setStyle(Paint.Style.STROKE);
        this.ringPaint.setColor(this.ringColor);
        this.ringPaint.setStrokeWidth(this.ringWidth);
    }

    /* JADX INFO: renamed from: c */
    public final void m7482c() {
        m7483d(1.0f);
    }

    /* JADX INFO: renamed from: d */
    public final void m7483d(float progress) {
        this.progress = 1.0f - progress;
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        canvas.getClass();
        RectF rectF = this.ringRect;
        float f = this.progress;
        canvas.drawArc(rectF, (360.0f * f) - 90.0f, 360.0f - (f * 360.0f), false, this.ringPaint);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        int iMin = Math.min(measuredWidth, measuredHeight);
        this.ringRadius = iMin;
        this.viewCenterX = measuredWidth;
        this.viewCenterY = measuredHeight;
        RectF rectF = this.ringRect;
        float f = this.ringWidth;
        rectF.left = (measuredWidth - iMin) + (f / 2.0f);
        rectF.top = (measuredHeight - iMin) + (f / 2.0f);
        rectF.right = (measuredWidth + iMin) - (f / 2.0f);
        rectF.bottom = (measuredHeight + iMin) - (f / 2.0f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleCountdownView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleCountdownView(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
