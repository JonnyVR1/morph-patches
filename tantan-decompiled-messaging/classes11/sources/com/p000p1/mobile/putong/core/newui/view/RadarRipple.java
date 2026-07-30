package com.p000p1.mobile.putong.core.newui.view;

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
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.bs5;
import l.e30;
import l.mkd0;
import l.t100;
import l.w1c0;
import l.z0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@SuppressLint({"AppCompatCustomView"})
public class RadarRipple extends ImageView {

    /* JADX INFO: renamed from: a */
    public float f5744a;

    /* JADX INFO: renamed from: b */
    public float f5745b;

    /* JADX INFO: renamed from: c */
    public ArrayList<Long> f5746c;

    /* JADX INFO: renamed from: d */
    public final DecelerateInterpolator f5747d;

    /* JADX INFO: renamed from: e */
    public bs5 f5748e;

    /* JADX INFO: renamed from: f */
    public Paint f5749f;

    /* JADX INFO: renamed from: g */
    public Paint f5750g;

    /* JADX INFO: renamed from: h */
    public int f5751h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f5752i;

    public RadarRipple(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5746c = new ArrayList<>();
        this.f5747d = new DecelerateInterpolator();
        this.f5748e = new bs5();
        this.f5749f = new Paint();
        this.f5750g = new Paint();
        this.f5749f.setColor(getContext().getResources().getColor(z0c0.d));
        this.f5749f.setAlpha(75);
        this.f5749f.setAntiAlias(true);
        this.f5749f.setStyle(Paint.Style.FILL);
        this.f5750g.setColor(getResources().getColor(z0c0.d));
        this.f5750g.setAlpha(255);
        this.f5750g.setAntiAlias(true);
        this.f5750g.setStyle(Paint.Style.STROKE);
        this.f5750g.setStrokeWidth(this.f5751h);
        this.f5751h = isInEditMode() ? 0 : t100.d(3.0f);
    }

    /* JADX INFO: renamed from: c */
    public final Act m8004c() {
        return getContext();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m8005d(c cVar) {
        if (cVar == c.k) {
            if (NullChecker.a(this.f5752i)) {
                this.f5752i.cancel();
            }
        } else if (cVar == c.h && NullChecker.a(this.f5752i)) {
            this.f5752i.start();
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m8006e(ValueAnimator valueAnimator) {
        if (this.f5746c.size() != 0) {
            invalidate();
        } else if (NullChecker.a(this.f5752i)) {
            this.f5752i.cancel();
            this.f5752i = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m8007f() {
        if (this.f5746c.size() != 0) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            ArrayList<Long> arrayList = this.f5746c;
            if (jUptimeMillis - arrayList.get(arrayList.size() - 1).longValue() <= 100) {
                return;
            }
        }
        this.f5746c.add(Long.valueOf(SystemClock.uptimeMillis()));
        if (this.f5752i == null) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1000L);
            this.f5752i = duration;
            duration.setRepeatCount(-1);
            this.f5752i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wbc0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f21990a.m8006e(valueAnimator);
                }
            });
            this.f5752i.start();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5748e.c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z = false;
        for (Long l2 : this.f5746c) {
            if (SystemClock.uptimeMillis() - l2.longValue() < 3000) {
                float interpolation = this.f5747d.getInterpolation(((SystemClock.uptimeMillis() - l2.longValue()) * 1.0f) / 3000.0f);
                float f = 1.0f - interpolation;
                this.f5749f.setAlpha((int) (75.0f * f));
                this.f5750g.setAlpha((int) (255.0f * f));
                this.f5750g.setStrokeWidth(this.f5751h * f);
                int measuredWidth = getMeasuredWidth() / 2;
                int measuredHeight = getMeasuredHeight() / 2;
                float f2 = this.f5744a;
                float f3 = f2 + ((this.f5745b - f2) * interpolation);
                float f4 = measuredWidth;
                float f5 = measuredHeight;
                canvas.drawCircle(f4, f5, f3, this.f5749f);
                canvas.drawCircle(f4, f5, f3, this.f5750g);
                z = true;
            }
        }
        if (z || !NullChecker.a(this.f5752i)) {
            return;
        }
        this.f5752i.cancel();
        this.f5752i = null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f5748e.a(m8004c().lifecycle().subscribe(mkd0.G(new e30() { // from class: l.ubc0
            public final void call(Object obj) {
                this.f21055a.m8005d((c) obj);
            }
        })));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f5744a = (float) (((double) (getContext().getResources().getDimensionPixelSize(w1c0.a) / 2)) * 0.95d);
        this.f5745b = getMeasuredHeight() / 2;
    }

    public void setRadarColor(int i) {
        Drawable drawable = getDrawable();
        if (NullChecker.a(drawable)) {
            drawable.mutate();
            drawable.setColorFilter(new LightingColorFilter(-16777216, i));
            this.f5749f.setColor(i);
        }
    }

    public RadarRipple(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadarRipple(Context context) {
        this(context, null);
    }
}
