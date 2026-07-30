package com.p046p1.mobile.putong.feed.newui.view.progressbar;

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
import p149l.awh;
import p149l.kug;
import p149l.m9c0;
import p149l.sah;
import p149l.t100;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes12.dex */
public class FeedProgressBar extends View {

    /* JADX INFO: renamed from: a */
    public float f43517a;

    /* JADX INFO: renamed from: b */
    public FeedProgressViewType f43518b;

    /* JADX INFO: renamed from: c */
    public awh f43519c;

    /* JADX INFO: renamed from: d */
    public Paint[] f43520d;

    /* JADX INFO: renamed from: e */
    public int f43521e;

    /* JADX INFO: renamed from: f */
    public int f43522f;

    /* JADX INFO: renamed from: g */
    public int f43523g;

    /* JADX INFO: renamed from: h */
    public int f43524h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.progressbar.FeedProgressBar$a */
    public static /* synthetic */ class C11392a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f43525a;

        static {
            int[] iArr = new int[FeedProgressViewType.values().length];
            f43525a = iArr;
            try {
                iArr[FeedProgressViewType.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43525a[FeedProgressViewType.LINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public FeedProgressBar(Context context, FeedProgressViewType feedProgressViewType) {
        super(context);
        FeedProgressViewType feedProgressViewType2 = FeedProgressViewType.CIRCLE;
        this.f43518b = feedProgressViewType;
        m66459c(context, null);
    }

    /* JADX INFO: renamed from: b */
    public ValueAnimator m66458b(long j) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.zvh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f205009a.m66463g(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: c */
    public final void m66459c(Context context, AttributeSet attributeSet) {
        m66461e(context, attributeSet);
        m66460d();
        this.f43519c.mo99286b(context, attributeSet);
        this.f43520d = this.f43519c.mo99288d(this);
    }

    /* JADX INFO: renamed from: d */
    public final void m66460d() {
        if (C11392a.f43525a[this.f43518b.ordinal()] != 1) {
            this.f43519c = new sah();
        } else {
            this.f43519c = new kug();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m66461e(Context context, AttributeSet attributeSet) {
        if (NullChecker.m81303a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f132690A);
            this.f43521e = typedArrayObtainStyledAttributes.getDimensionPixelSize(m9c0.f132696E, t100.m186890d(2.0f));
            this.f43522f = typedArrayObtainStyledAttributes.getColor(m9c0.f132699H, 0);
            this.f43523g = typedArrayObtainStyledAttributes.getColor(m9c0.f132698G, RoundedDrawable.DEFAULT_BORDER_COLOR);
            this.f43524h = typedArrayObtainStyledAttributes.getInt(m9c0.f132697F, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        m66462f();
    }

    /* JADX INFO: renamed from: f */
    public final void m66462f() {
        if (this.f43524h != 0) {
            this.f43518b = FeedProgressViewType.LINE;
        } else {
            this.f43518b = FeedProgressViewType.CIRCLE;
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m66463g(ValueAnimator valueAnimator) {
        setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public int getBackGroundColor() {
        return this.f43522f;
    }

    public int getDrawLineWidth() {
        return this.f43521e;
    }

    public float getProgress() {
        return this.f43517a;
    }

    public int getProgressColor() {
        return this.f43523g;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f43519c.mo99285a(canvas, this, this.f43520d, getProgress());
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f43519c.mo99287c(this);
    }

    public void setFeedProgressViewType(FeedProgressViewType feedProgressViewType) {
        this.f43518b = feedProgressViewType;
        m66460d();
    }

    public void setProgress(float f) {
        this.f43517a = f;
        invalidate();
    }

    public FeedProgressBar(Context context) {
        super(context);
        this.f43518b = FeedProgressViewType.LINE;
        m66459c(context, null);
    }

    public FeedProgressBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43518b = FeedProgressViewType.LINE;
        m66459c(context, attributeSet);
    }

    public FeedProgressBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43518b = FeedProgressViewType.LINE;
        m66459c(context, attributeSet);
    }

    public FeedProgressBar(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f43518b = FeedProgressViewType.LINE;
        m66459c(context, attributeSet);
    }
}
