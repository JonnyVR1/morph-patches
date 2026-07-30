package com.p051p1.mobile.putong.core.newui.view;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p153l.dac0;
import p153l.f9c0;
import p153l.ft5;
import p153l.psd0;
import p153l.qa00;
import p153l.y20;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"AppCompatCustomView"})
public class RadarRipple extends ImageView {

    /* JADX INFO: renamed from: a */
    public float f27814a;

    /* JADX INFO: renamed from: b */
    public float f27815b;

    /* JADX INFO: renamed from: c */
    public ArrayList<Long> f27816c;

    /* JADX INFO: renamed from: d */
    public final DecelerateInterpolator f27817d;

    /* JADX INFO: renamed from: e */
    public ft5 f27818e;

    /* JADX INFO: renamed from: f */
    public Paint f27819f;

    /* JADX INFO: renamed from: g */
    public Paint f27820g;

    /* JADX INFO: renamed from: h */
    public int f27821h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f27822i;

    public RadarRipple(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27816c = new ArrayList<>();
        this.f27817d = new DecelerateInterpolator();
        this.f27818e = new ft5();
        this.f27819f = new Paint();
        this.f27820g = new Paint();
        this.f27819f.setColor(getContext().getResources().getColor(f9c0.f97859d));
        this.f27819f.setAlpha(75);
        this.f27819f.setAntiAlias(true);
        this.f27819f.setStyle(Paint.Style.FILL);
        this.f27820g.setColor(getResources().getColor(f9c0.f97859d));
        this.f27820g.setAlpha(255);
        this.f27820g.setAntiAlias(true);
        this.f27820g.setStyle(Paint.Style.STROKE);
        this.f27820g.setStrokeWidth(this.f27821h);
        this.f27821h = isInEditMode() ? 0 : qa00.m175859d(3.0f);
    }

    /* JADX INFO: renamed from: c */
    public final Act m44926c() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m44927d(C4470c c4470c) {
        if (c4470c == C4470c.f16269k) {
            if (NullChecker.m82486a(this.f27822i)) {
                this.f27822i.cancel();
            }
        } else if (c4470c == C4470c.f16266h && NullChecker.m82486a(this.f27822i)) {
            this.f27822i.start();
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m44928e(ValueAnimator valueAnimator) {
        if (this.f27816c.size() != 0) {
            invalidate();
        } else if (NullChecker.m82486a(this.f27822i)) {
            this.f27822i.cancel();
            this.f27822i = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m44929f() {
        if (this.f27816c.size() != 0) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            ArrayList<Long> arrayList = this.f27816c;
            if (jUptimeMillis - arrayList.get(arrayList.size() - 1).longValue() <= 100) {
                return;
            }
        }
        this.f27816c.add(Long.valueOf(SystemClock.uptimeMillis()));
        if (this.f27822i == null) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1000L);
            this.f27822i = duration;
            duration.setRepeatCount(-1);
            this.f27822i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.dkc0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f89397a.m44928e(valueAnimator);
                }
            });
            this.f27822i.start();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27818e.m127299c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z = false;
        for (Long l2 : this.f27816c) {
            if (SystemClock.uptimeMillis() - l2.longValue() < 3000) {
                float interpolation = this.f27817d.getInterpolation(((SystemClock.uptimeMillis() - l2.longValue()) * 1.0f) / 3000.0f);
                float f = 1.0f - interpolation;
                this.f27819f.setAlpha((int) (75.0f * f));
                this.f27820g.setAlpha((int) (255.0f * f));
                this.f27820g.setStrokeWidth(this.f27821h * f);
                int measuredWidth = getMeasuredWidth() / 2;
                int measuredHeight = getMeasuredHeight() / 2;
                float f2 = this.f27814a;
                float f3 = f2 + ((this.f27815b - f2) * interpolation);
                float f4 = measuredWidth;
                float f5 = measuredHeight;
                canvas.drawCircle(f4, f5, f3, this.f27819f);
                canvas.drawCircle(f4, f5, f3, this.f27820g);
                z = true;
            }
        }
        if (z || !NullChecker.m82486a(this.f27822i)) {
            return;
        }
        this.f27822i.cancel();
        this.f27822i = null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f27818e.m127297a(m44926c().lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.bkc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77059a.m44927d((C4470c) obj);
            }
        })));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f27814a = (float) (((double) (getContext().getResources().getDimensionPixelSize(dac0.f85864a) / 2)) * 0.95d);
        this.f27815b = getMeasuredHeight() / 2;
    }

    public void setRadarColor(int i) {
        Drawable drawable = getDrawable();
        if (NullChecker.m82486a(drawable)) {
            drawable.mutate();
            drawable.setColorFilter(new LightingColorFilter(RoundedDrawable.DEFAULT_BORDER_COLOR, i));
            this.f27819f.setColor(i);
        }
    }

    public RadarRipple(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadarRipple(Context context) {
        this(context, null);
    }
}
