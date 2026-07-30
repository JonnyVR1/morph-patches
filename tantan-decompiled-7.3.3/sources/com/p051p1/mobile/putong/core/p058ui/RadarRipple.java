package com.p051p1.mobile.putong.core.p058ui;

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
import p153l.c9c0;
import p153l.cac0;
import p153l.ft5;
import p153l.psd0;
import p153l.qa00;
import p153l.vql;
import p153l.y20;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"AppCompatCustomView"})
public class RadarRipple extends ImageView implements vql {

    /* JADX INFO: renamed from: a */
    public float f28987a;

    /* JADX INFO: renamed from: b */
    public float f28988b;

    /* JADX INFO: renamed from: c */
    public ArrayList<Long> f28989c;

    /* JADX INFO: renamed from: d */
    public final DecelerateInterpolator f28990d;

    /* JADX INFO: renamed from: e */
    public ft5 f28991e;

    /* JADX INFO: renamed from: f */
    public Paint f28992f;

    /* JADX INFO: renamed from: g */
    public Paint f28993g;

    /* JADX INFO: renamed from: h */
    public int f28994h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f28995i;

    public RadarRipple(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28989c = new ArrayList<>();
        this.f28990d = new DecelerateInterpolator();
        this.f28991e = new ft5();
        this.f28992f = new Paint();
        this.f28993g = new Paint();
        this.f28992f.setColor(getContext().getResources().getColor(c9c0.f80342I));
        this.f28992f.setAlpha(75);
        this.f28992f.setAntiAlias(true);
        this.f28992f.setStyle(Paint.Style.FILL);
        this.f28993g.setColor(getResources().getColor(c9c0.f80342I));
        this.f28993g.setAlpha(255);
        this.f28993g.setAntiAlias(true);
        this.f28993g.setStyle(Paint.Style.STROKE);
        this.f28993g.setStrokeWidth(this.f28994h);
        this.f28994h = isInEditMode() ? 0 : qa00.m175859d(3.0f);
    }

    @Override // p153l.vql
    /* JADX INFO: renamed from: a */
    public void mo40115a() {
        if (this.f28989c.size() != 0) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            ArrayList<Long> arrayList = this.f28989c;
            if (jUptimeMillis - arrayList.get(arrayList.size() - 1).longValue() <= 100) {
                return;
            }
        }
        this.f28989c.add(Long.valueOf(SystemClock.uptimeMillis()));
        if (this.f28995i == null) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1000L);
            this.f28995i = duration;
            duration.setRepeatCount(-1);
            this.f28995i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ckc0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f82276a.m45244h(valueAnimator);
                }
            });
            this.f28995i.start();
        }
    }

    @Override // p153l.vql
    /* JADX INFO: renamed from: c */
    public void mo40117c() {
        this.f28989c.clear();
    }

    /* JADX INFO: renamed from: f */
    public final Act m45242f() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m45243g(C4470c c4470c) {
        if (c4470c == C4470c.f16269k) {
            if (NullChecker.m82486a(this.f28995i)) {
                this.f28995i.cancel();
            }
        } else if (c4470c == C4470c.f16266h && NullChecker.m82486a(this.f28995i)) {
            this.f28995i.start();
        }
    }

    @Override // p153l.vql
    public ImageView getRippleView() {
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m45244h(ValueAnimator valueAnimator) {
        if (this.f28989c.size() != 0) {
            invalidate();
        } else if (NullChecker.m82486a(this.f28995i)) {
            this.f28995i.cancel();
            this.f28995i = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28991e.m127299c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z = false;
        for (Long l2 : this.f28989c) {
            if (SystemClock.uptimeMillis() - l2.longValue() < 3000) {
                float interpolation = this.f28990d.getInterpolation(((SystemClock.uptimeMillis() - l2.longValue()) * 1.0f) / 3000.0f);
                float f = 1.0f - interpolation;
                this.f28992f.setAlpha((int) (75.0f * f));
                this.f28993g.setAlpha((int) (255.0f * f));
                this.f28993g.setStrokeWidth(this.f28994h * f);
                int measuredWidth = getMeasuredWidth() / 2;
                int measuredHeight = getMeasuredHeight() / 2;
                float f2 = this.f28987a;
                float f3 = f2 + ((this.f28988b - f2) * interpolation);
                float f4 = measuredWidth;
                float f5 = measuredHeight;
                canvas.drawCircle(f4, f5, f3, this.f28992f);
                canvas.drawCircle(f4, f5, f3, this.f28993g);
                z = true;
            }
        }
        if (z || !NullChecker.m82486a(this.f28995i)) {
            return;
        }
        this.f28995i.cancel();
        this.f28995i = null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f28991e.m127297a(m45242f().lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.akc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71982a.m45243g((C4470c) obj);
            }
        })));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f28987a = (float) (((double) (getContext().getResources().getDimensionPixelSize(cac0.f80575e) / 2)) * 0.95d);
        this.f28988b = getMeasuredHeight() / 2;
    }

    @Override // p153l.vql
    public void setRadarColor(int i) {
        Drawable drawable = getDrawable();
        if (NullChecker.m82486a(drawable)) {
            drawable.mutate();
            drawable.setColorFilter(new LightingColorFilter(RoundedDrawable.DEFAULT_BORDER_COLOR, i));
            this.f28992f.setColor(i);
        }
    }

    public RadarRipple(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadarRipple(Context context) {
        this(context, null);
    }
}
