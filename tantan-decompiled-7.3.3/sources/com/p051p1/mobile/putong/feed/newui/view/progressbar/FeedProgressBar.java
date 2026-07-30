package com.p051p1.mobile.putong.feed.newui.view.progressbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p153l.hch;
import p153l.pxh;
import p153l.qa00;
import p153l.shc0;
import p153l.zvg;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes13.dex */
public class FeedProgressBar extends View {

    /* JADX INFO: renamed from: a */
    public float f44365a;

    /* JADX INFO: renamed from: b */
    public FeedProgressViewType f44366b;

    /* JADX INFO: renamed from: c */
    public pxh f44367c;

    /* JADX INFO: renamed from: d */
    public Paint[] f44368d;

    /* JADX INFO: renamed from: e */
    public int f44369e;

    /* JADX INFO: renamed from: f */
    public int f44370f;

    /* JADX INFO: renamed from: g */
    public int f44371g;

    /* JADX INFO: renamed from: h */
    public int f44372h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.progressbar.FeedProgressBar$a */
    public static /* synthetic */ class C11555a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44373a;

        static {
            int[] iArr = new int[FeedProgressViewType.values().length];
            f44373a = iArr;
            try {
                iArr[FeedProgressViewType.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44373a[FeedProgressViewType.LINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public FeedProgressBar(Context context, FeedProgressViewType feedProgressViewType) {
        super(context);
        FeedProgressViewType feedProgressViewType2 = FeedProgressViewType.CIRCLE;
        this.f44366b = feedProgressViewType;
        m67642c(context, null);
    }

    /* JADX INFO: renamed from: b */
    public ValueAnimator m67641b(long j) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.oxh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f149668a.m67646g(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: c */
    public final void m67642c(Context context, AttributeSet attributeSet) {
        m67644e(context, attributeSet);
        m67643d();
        this.f44367c.mo134451b(context, attributeSet);
        this.f44368d = this.f44367c.mo134453d(this);
    }

    /* JADX INFO: renamed from: d */
    public final void m67643d() {
        if (C11555a.f44373a[this.f44366b.ordinal()] != 1) {
            this.f44367c = new hch();
        } else {
            this.f44367c = new zvg();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m67644e(Context context, AttributeSet attributeSet) {
        if (NullChecker.m82486a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, shc0.f168612A);
            this.f44369e = typedArrayObtainStyledAttributes.getDimensionPixelSize(shc0.f168618E, qa00.m175859d(2.0f));
            this.f44370f = typedArrayObtainStyledAttributes.getColor(shc0.f168621H, 0);
            this.f44371g = typedArrayObtainStyledAttributes.getColor(shc0.f168620G, RoundedDrawable.DEFAULT_BORDER_COLOR);
            this.f44372h = typedArrayObtainStyledAttributes.getInt(shc0.f168619F, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        m67645f();
    }

    /* JADX INFO: renamed from: f */
    public final void m67645f() {
        if (this.f44372h != 0) {
            this.f44366b = FeedProgressViewType.LINE;
        } else {
            this.f44366b = FeedProgressViewType.CIRCLE;
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m67646g(ValueAnimator valueAnimator) {
        setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public int getBackGroundColor() {
        return this.f44370f;
    }

    public int getDrawLineWidth() {
        return this.f44369e;
    }

    public float getProgress() {
        return this.f44365a;
    }

    public int getProgressColor() {
        return this.f44371g;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f44367c.mo134450a(canvas, this, this.f44368d, getProgress());
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f44367c.mo134452c(this);
    }

    public void setFeedProgressViewType(FeedProgressViewType feedProgressViewType) {
        this.f44366b = feedProgressViewType;
        m67643d();
    }

    public void setProgress(float f) {
        this.f44365a = f;
        invalidate();
    }

    public FeedProgressBar(Context context) {
        super(context);
        this.f44366b = FeedProgressViewType.LINE;
        m67642c(context, null);
    }

    public FeedProgressBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44366b = FeedProgressViewType.LINE;
        m67642c(context, attributeSet);
    }

    public FeedProgressBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44366b = FeedProgressViewType.LINE;
        m67642c(context, attributeSet);
    }

    public FeedProgressBar(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f44366b = FeedProgressViewType.LINE;
        m67642c(context, attributeSet);
    }
}
