package com.p046p1.mobile.putong.core.newui.view;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p149l.bs5;
import p149l.e30;
import p149l.mkd0;
import p149l.t100;
import p149l.w1c0;
import p149l.z0c0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"AppCompatCustomView"})
public class RadarRipple extends ImageView {

    /* JADX INFO: renamed from: a */
    public float f26966a;

    /* JADX INFO: renamed from: b */
    public float f26967b;

    /* JADX INFO: renamed from: c */
    public ArrayList<Long> f26968c;

    /* JADX INFO: renamed from: d */
    public final DecelerateInterpolator f26969d;

    /* JADX INFO: renamed from: e */
    public bs5 f26970e;

    /* JADX INFO: renamed from: f */
    public Paint f26971f;

    /* JADX INFO: renamed from: g */
    public Paint f26972g;

    /* JADX INFO: renamed from: h */
    public int f26973h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f26974i;

    public RadarRipple(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26968c = new ArrayList<>();
        this.f26969d = new DecelerateInterpolator();
        this.f26970e = new bs5();
        this.f26971f = new Paint();
        this.f26972g = new Paint();
        this.f26971f.setColor(getContext().getResources().getColor(z0c0.f200976d));
        this.f26971f.setAlpha(75);
        this.f26971f.setAntiAlias(true);
        this.f26971f.setStyle(Paint.Style.FILL);
        this.f26972g.setColor(getResources().getColor(z0c0.f200976d));
        this.f26972g.setAlpha(255);
        this.f26972g.setAntiAlias(true);
        this.f26972g.setStyle(Paint.Style.STROKE);
        this.f26972g.setStrokeWidth(this.f26973h);
        this.f26973h = isInEditMode() ? 0 : t100.m186890d(3.0f);
    }

    /* JADX INFO: renamed from: c */
    public final Act m43740c() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m43741d(C4319c c4319c) {
        if (c4319c == C4319c.f15550k) {
            if (NullChecker.m81303a(this.f26974i)) {
                this.f26974i.cancel();
            }
        } else if (c4319c == C4319c.f15547h && NullChecker.m81303a(this.f26974i)) {
            this.f26974i.start();
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m43742e(ValueAnimator valueAnimator) {
        if (this.f26968c.size() != 0) {
            invalidate();
        } else if (NullChecker.m81303a(this.f26974i)) {
            this.f26974i.cancel();
            this.f26974i = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m43743f() {
        if (this.f26968c.size() != 0) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            ArrayList<Long> arrayList = this.f26968c;
            if (jUptimeMillis - arrayList.get(arrayList.size() - 1).longValue() <= 100) {
                return;
            }
        }
        this.f26968c.add(Long.valueOf(SystemClock.uptimeMillis()));
        if (this.f26974i == null) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1000L);
            this.f26974i = duration;
            duration.setRepeatCount(-1);
            this.f26974i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wbc0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f185569a.m43742e(valueAnimator);
                }
            });
            this.f26974i.start();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26970e.m103657c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z = false;
        for (Long l2 : this.f26968c) {
            if (SystemClock.uptimeMillis() - l2.longValue() < 3000) {
                float interpolation = this.f26969d.getInterpolation(((SystemClock.uptimeMillis() - l2.longValue()) * 1.0f) / 3000.0f);
                float f = 1.0f - interpolation;
                this.f26971f.setAlpha((int) (75.0f * f));
                this.f26972g.setAlpha((int) (255.0f * f));
                this.f26972g.setStrokeWidth(this.f26973h * f);
                int measuredWidth = getMeasuredWidth() / 2;
                int measuredHeight = getMeasuredHeight() / 2;
                float f2 = this.f26966a;
                float f3 = f2 + ((this.f26967b - f2) * interpolation);
                float f4 = measuredWidth;
                float f5 = measuredHeight;
                canvas.drawCircle(f4, f5, f3, this.f26971f);
                canvas.drawCircle(f4, f5, f3, this.f26972g);
                z = true;
            }
        }
        if (z || !NullChecker.m81303a(this.f26974i)) {
            return;
        }
        this.f26974i.cancel();
        this.f26974i = null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f26970e.m103655a(m43740c().lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.ubc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175679a.m43741d((C4319c) obj);
            }
        })));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f26966a = (float) (((double) (getContext().getResources().getDimensionPixelSize(w1c0.f183989a) / 2)) * 0.95d);
        this.f26967b = getMeasuredHeight() / 2;
    }

    public void setRadarColor(int i) {
        Drawable drawable = getDrawable();
        if (NullChecker.m81303a(drawable)) {
            drawable.mutate();
            drawable.setColorFilter(new LightingColorFilter(RoundedDrawable.DEFAULT_BORDER_COLOR, i));
            this.f26971f.setColor(i);
        }
    }

    public RadarRipple(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadarRipple(Context context) {
        this(context, null);
    }
}
