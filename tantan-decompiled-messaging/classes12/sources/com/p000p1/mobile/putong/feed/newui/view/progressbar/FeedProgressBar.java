package com.p000p1.mobile.putong.feed.newui.view.progressbar;

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
import l.t100;
import p007l.awh;
import p007l.kug;
import p007l.m9c0;
import p007l.sah;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedProgressBar extends View {

    /* JADX INFO: renamed from: a */
    public float f4978a;

    /* JADX INFO: renamed from: b */
    public FeedProgressViewType f4979b;

    /* JADX INFO: renamed from: c */
    public awh f4980c;

    /* JADX INFO: renamed from: d */
    public Paint[] f4981d;

    /* JADX INFO: renamed from: e */
    public int f4982e;

    /* JADX INFO: renamed from: f */
    public int f4983f;

    /* JADX INFO: renamed from: g */
    public int f4984g;

    /* JADX INFO: renamed from: h */
    public int f4985h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.progressbar.FeedProgressBar$a */
    public static /* synthetic */ class C2236a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4986a;

        static {
            int[] iArr = new int[FeedProgressViewType.values().length];
            f4986a = iArr;
            try {
                iArr[FeedProgressViewType.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4986a[FeedProgressViewType.LINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public FeedProgressBar(Context context, FeedProgressViewType feedProgressViewType) {
        super(context);
        FeedProgressViewType feedProgressViewType2 = FeedProgressViewType.CIRCLE;
        this.f4979b = feedProgressViewType;
        m7626c(context, null);
    }

    /* JADX INFO: renamed from: b */
    public ValueAnimator m7625b(long j) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.zvh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f15865a.m7630g(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: c */
    public final void m7626c(Context context, AttributeSet attributeSet) {
        m7628e(context, attributeSet);
        m7627d();
        this.f4980c.mo8618b(context, attributeSet);
        this.f4981d = this.f4980c.mo8620d(this);
    }

    /* JADX INFO: renamed from: d */
    public final void m7627d() {
        if (C2236a.f4986a[this.f4979b.ordinal()] != 1) {
            this.f4980c = new sah();
        } else {
            this.f4980c = new kug();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7628e(Context context, AttributeSet attributeSet) {
        if (NullChecker.a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f10281A);
            this.f4982e = typedArrayObtainStyledAttributes.getDimensionPixelSize(m9c0.f10287E, t100.d(2.0f));
            this.f4983f = typedArrayObtainStyledAttributes.getColor(m9c0.f10290H, 0);
            this.f4984g = typedArrayObtainStyledAttributes.getColor(m9c0.f10289G, -16777216);
            this.f4985h = typedArrayObtainStyledAttributes.getInt(m9c0.f10288F, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        m7629f();
    }

    /* JADX INFO: renamed from: f */
    public final void m7629f() {
        if (this.f4985h != 0) {
            this.f4979b = FeedProgressViewType.LINE;
        } else {
            this.f4979b = FeedProgressViewType.CIRCLE;
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m7630g(ValueAnimator valueAnimator) {
        setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public int getBackGroundColor() {
        return this.f4983f;
    }

    public int getDrawLineWidth() {
        return this.f4982e;
    }

    public float getProgress() {
        return this.f4978a;
    }

    public int getProgressColor() {
        return this.f4984g;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f4980c.mo8617a(canvas, this, this.f4981d, getProgress());
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f4980c.mo8619c(this);
    }

    public void setFeedProgressViewType(FeedProgressViewType feedProgressViewType) {
        this.f4979b = feedProgressViewType;
        m7627d();
    }

    public void setProgress(float f) {
        this.f4978a = f;
        invalidate();
    }

    public FeedProgressBar(Context context) {
        super(context);
        this.f4979b = FeedProgressViewType.LINE;
        m7626c(context, null);
    }

    public FeedProgressBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4979b = FeedProgressViewType.LINE;
        m7626c(context, attributeSet);
    }

    public FeedProgressBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4979b = FeedProgressViewType.LINE;
        m7626c(context, attributeSet);
    }

    public FeedProgressBar(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4979b = FeedProgressViewType.LINE;
        m7626c(context, attributeSet);
    }
}
