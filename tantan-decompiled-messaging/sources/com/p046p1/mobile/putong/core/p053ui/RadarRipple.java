package com.p046p1.mobile.putong.core.p053ui;

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
import p149l.kol;
import p149l.mkd0;
import p149l.t100;
import p149l.v1c0;
import p149l.w0c0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"AppCompatCustomView"})
public class RadarRipple extends ImageView implements kol {

    /* JADX INFO: renamed from: a */
    public float f28139a;

    /* JADX INFO: renamed from: b */
    public float f28140b;

    /* JADX INFO: renamed from: c */
    public ArrayList<Long> f28141c;

    /* JADX INFO: renamed from: d */
    public final DecelerateInterpolator f28142d;

    /* JADX INFO: renamed from: e */
    public bs5 f28143e;

    /* JADX INFO: renamed from: f */
    public Paint f28144f;

    /* JADX INFO: renamed from: g */
    public Paint f28145g;

    /* JADX INFO: renamed from: h */
    public int f28146h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f28147i;

    public RadarRipple(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28141c = new ArrayList<>();
        this.f28142d = new DecelerateInterpolator();
        this.f28143e = new bs5();
        this.f28144f = new Paint();
        this.f28145g = new Paint();
        this.f28144f.setColor(getContext().getResources().getColor(w0c0.f183773I));
        this.f28144f.setAlpha(75);
        this.f28144f.setAntiAlias(true);
        this.f28144f.setStyle(Paint.Style.FILL);
        this.f28145g.setColor(getResources().getColor(w0c0.f183773I));
        this.f28145g.setAlpha(255);
        this.f28145g.setAntiAlias(true);
        this.f28145g.setStyle(Paint.Style.STROKE);
        this.f28145g.setStrokeWidth(this.f28146h);
        this.f28146h = isInEditMode() ? 0 : t100.m186890d(3.0f);
    }

    @Override // p149l.kol
    /* JADX INFO: renamed from: a */
    public void mo39112a() {
        if (this.f28141c.size() != 0) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            ArrayList<Long> arrayList = this.f28141c;
            if (jUptimeMillis - arrayList.get(arrayList.size() - 1).longValue() <= 100) {
                return;
            }
        }
        this.f28141c.add(Long.valueOf(SystemClock.uptimeMillis()));
        if (this.f28147i == null) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1000L);
            this.f28147i = duration;
            duration.setRepeatCount(-1);
            this.f28147i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.vbc0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f180835a.m44061h(valueAnimator);
                }
            });
            this.f28147i.start();
        }
    }

    @Override // p149l.kol
    /* JADX INFO: renamed from: c */
    public void mo39114c() {
        this.f28141c.clear();
    }

    /* JADX INFO: renamed from: f */
    public final Act m44059f() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m44060g(C4319c c4319c) {
        if (c4319c == C4319c.f15550k) {
            if (NullChecker.m81303a(this.f28147i)) {
                this.f28147i.cancel();
            }
        } else if (c4319c == C4319c.f15547h && NullChecker.m81303a(this.f28147i)) {
            this.f28147i.start();
        }
    }

    @Override // p149l.kol
    public ImageView getRippleView() {
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m44061h(ValueAnimator valueAnimator) {
        if (this.f28141c.size() != 0) {
            invalidate();
        } else if (NullChecker.m81303a(this.f28147i)) {
            this.f28147i.cancel();
            this.f28147i = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28143e.m103657c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z = false;
        for (Long l2 : this.f28141c) {
            if (SystemClock.uptimeMillis() - l2.longValue() < 3000) {
                float interpolation = this.f28142d.getInterpolation(((SystemClock.uptimeMillis() - l2.longValue()) * 1.0f) / 3000.0f);
                float f = 1.0f - interpolation;
                this.f28144f.setAlpha((int) (75.0f * f));
                this.f28145g.setAlpha((int) (255.0f * f));
                this.f28145g.setStrokeWidth(this.f28146h * f);
                int measuredWidth = getMeasuredWidth() / 2;
                int measuredHeight = getMeasuredHeight() / 2;
                float f2 = this.f28139a;
                float f3 = f2 + ((this.f28140b - f2) * interpolation);
                float f4 = measuredWidth;
                float f5 = measuredHeight;
                canvas.drawCircle(f4, f5, f3, this.f28144f);
                canvas.drawCircle(f4, f5, f3, this.f28145g);
                z = true;
            }
        }
        if (z || !NullChecker.m81303a(this.f28147i)) {
            return;
        }
        this.f28147i.cancel();
        this.f28147i = null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f28143e.m103655a(m44059f().lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.tbc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169248a.m44060g((C4319c) obj);
            }
        })));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f28139a = (float) (((double) (getContext().getResources().getDimensionPixelSize(v1c0.f179229e) / 2)) * 0.95d);
        this.f28140b = getMeasuredHeight() / 2;
    }

    @Override // p149l.kol
    public void setRadarColor(int i) {
        Drawable drawable = getDrawable();
        if (NullChecker.m81303a(drawable)) {
            drawable.mutate();
            drawable.setColorFilter(new LightingColorFilter(RoundedDrawable.DEFAULT_BORDER_COLOR, i));
            this.f28144f.setColor(i);
        }
    }

    public RadarRipple(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadarRipple(Context context) {
        this(context, null);
    }
}
