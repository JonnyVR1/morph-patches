package com.p003p1.mobile.putong.core.p006ui;

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
import com.p003p1.mobile.android.app.Act;
import com.p003p1.mobile.android.app.C0231c;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.bs5;
import l.e30;
import l.kol;
import l.t100;
import l.v1c0;
import l.w0c0;
import p007l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@SuppressLint({"AppCompatCustomView"})
public class RadarRipple extends ImageView implements kol {

    /* JADX INFO: renamed from: a */
    public float f1710a;

    /* JADX INFO: renamed from: b */
    public float f1711b;

    /* JADX INFO: renamed from: c */
    public ArrayList<Long> f1712c;

    /* JADX INFO: renamed from: d */
    public final DecelerateInterpolator f1713d;

    /* JADX INFO: renamed from: e */
    public bs5 f1714e;

    /* JADX INFO: renamed from: f */
    public Paint f1715f;

    /* JADX INFO: renamed from: g */
    public Paint f1716g;

    /* JADX INFO: renamed from: h */
    public int f1717h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f1718i;

    public RadarRipple(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1712c = new ArrayList<>();
        this.f1713d = new DecelerateInterpolator();
        this.f1714e = new bs5();
        this.f1715f = new Paint();
        this.f1716g = new Paint();
        this.f1715f.setColor(getContext().getResources().getColor(w0c0.I));
        this.f1715f.setAlpha(75);
        this.f1715f.setAntiAlias(true);
        this.f1715f.setStyle(Paint.Style.FILL);
        this.f1716g.setColor(getResources().getColor(w0c0.I));
        this.f1716g.setAlpha(255);
        this.f1716g.setAntiAlias(true);
        this.f1716g.setStyle(Paint.Style.STROKE);
        this.f1716g.setStrokeWidth(this.f1717h);
        this.f1717h = isInEditMode() ? 0 : t100.d(3.0f);
    }

    /* JADX INFO: renamed from: a */
    public void m8379a() {
        if (this.f1712c.size() != 0) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            ArrayList<Long> arrayList = this.f1712c;
            if (jUptimeMillis - arrayList.get(arrayList.size() - 1).longValue() <= 100) {
                return;
            }
        }
        this.f1712c.add(Long.valueOf(SystemClock.uptimeMillis()));
        if (this.f1718i == null) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1000L);
            this.f1718i = duration;
            duration.setRepeatCount(-1);
            this.f1718i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.vbc0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f4962a.m8383h(valueAnimator);
                }
            });
            this.f1718i.start();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m8380c() {
        this.f1712c.clear();
    }

    /* JADX INFO: renamed from: f */
    public final Act m8381f() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m8382g(C0231c c0231c) {
        if (c0231c == C0231c.f1249k) {
            if (NullChecker.a(this.f1718i)) {
                this.f1718i.cancel();
            }
        } else if (c0231c == C0231c.f1246h && NullChecker.a(this.f1718i)) {
            this.f1718i.start();
        }
    }

    public ImageView getRippleView() {
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m8383h(ValueAnimator valueAnimator) {
        if (this.f1712c.size() != 0) {
            invalidate();
        } else if (NullChecker.a(this.f1718i)) {
            this.f1718i.cancel();
            this.f1718i = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1714e.c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z = false;
        for (Long l2 : this.f1712c) {
            if (SystemClock.uptimeMillis() - l2.longValue() < 3000) {
                float interpolation = this.f1713d.getInterpolation(((SystemClock.uptimeMillis() - l2.longValue()) * 1.0f) / 3000.0f);
                float f = 1.0f - interpolation;
                this.f1715f.setAlpha((int) (75.0f * f));
                this.f1716g.setAlpha((int) (255.0f * f));
                this.f1716g.setStrokeWidth(this.f1717h * f);
                int measuredWidth = getMeasuredWidth() / 2;
                int measuredHeight = getMeasuredHeight() / 2;
                float f2 = this.f1710a;
                float f3 = f2 + ((this.f1711b - f2) * interpolation);
                float f4 = measuredWidth;
                float f5 = measuredHeight;
                canvas.drawCircle(f4, f5, f3, this.f1715f);
                canvas.drawCircle(f4, f5, f3, this.f1716g);
                z = true;
            }
        }
        if (z || !NullChecker.a(this.f1718i)) {
            return;
        }
        this.f1718i.cancel();
        this.f1718i = null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1714e.a(m8381f().lifecycle().subscribe(mkd0.m9874G(new e30() { // from class: l.tbc0
            public final void call(Object obj) {
                this.f4249a.m8382g((C0231c) obj);
            }
        })));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f1710a = (float) (((double) (getContext().getResources().getDimensionPixelSize(v1c0.e) / 2)) * 0.95d);
        this.f1711b = getMeasuredHeight() / 2;
    }

    public void setRadarColor(int i) {
        Drawable drawable = getDrawable();
        if (NullChecker.a(drawable)) {
            drawable.mutate();
            drawable.setColorFilter(new LightingColorFilter(-16777216, i));
            this.f1715f.setColor(i);
        }
    }

    public RadarRipple(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadarRipple(Context context) {
        this(context, null);
    }
}
