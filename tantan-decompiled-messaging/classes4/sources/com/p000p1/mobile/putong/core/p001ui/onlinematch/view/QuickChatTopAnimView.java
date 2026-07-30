package com.p000p1.mobile.putong.core.p001ui.onlinematch.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import l.bs5;
import l.e30;
import l.mkd0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class QuickChatTopAnimView extends View {

    /* JADX INFO: renamed from: a */
    public int f617a;

    /* JADX INFO: renamed from: b */
    public ArrayList<Long> f618b;

    /* JADX INFO: renamed from: c */
    public final DecelerateInterpolator f619c;

    /* JADX INFO: renamed from: d */
    public Paint f620d;

    /* JADX INFO: renamed from: e */
    public int f621e;

    /* JADX INFO: renamed from: f */
    public bs5 f622f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f623g;

    /* JADX INFO: renamed from: h */
    public boolean f624h;

    /* JADX INFO: renamed from: i */
    public int f625i;

    /* JADX INFO: renamed from: j */
    public int f626j;

    /* JADX INFO: renamed from: k */
    public long f627k;

    /* JADX INFO: renamed from: l */
    public int f628l;

    public QuickChatTopAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f618b = new ArrayList<>();
        this.f619c = new DecelerateInterpolator();
        this.f620d = new Paint();
        this.f622f = new bs5();
        this.f620d.setColor(Color.parseColor("#ffffff"));
        this.f620d.setStrokeWidth(t100.a);
        this.f620d.setAlpha(45);
        this.f620d.setAntiAlias(true);
        this.f620d.setStyle(Paint.Style.STROKE);
        this.f624h = false;
        this.f625i = 3000;
        this.f626j = 800;
        this.f627k = 0L;
        this.f628l = 0;
        this.f621e = isInEditMode() ? 0 : t100.d(3.0f);
    }

    /* JADX INFO: renamed from: b */
    public final Act m830b() {
        return getContext();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m831c(c cVar) {
        if (cVar == c.k) {
            if (NullChecker.a(this.f623g)) {
                this.f623g.cancel();
            }
        } else if (cVar == c.h && NullChecker.a(this.f623g)) {
            this.f623g.start();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f622f.c();
        if (NullChecker.a(this.f623g) && this.f623g.isRunning()) {
            this.f623g.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float measuredHeight;
        float f;
        float f2;
        super.onDraw(canvas);
        Iterator<Long> it = this.f618b.iterator();
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            if (SystemClock.uptimeMillis() - jLongValue < this.f625i) {
                float fUptimeMillis = ((SystemClock.uptimeMillis() - jLongValue) * 1.0f) / this.f625i;
                this.f620d.setAlpha((int) (((1.0f - this.f619c.getInterpolation(fUptimeMillis)) * 35.0f) + 10.0f));
                float measuredWidth = getMeasuredWidth() / 2;
                int i = this.f628l;
                if (i != 0) {
                    f2 = i;
                } else {
                    if (this.f624h) {
                        measuredHeight = getMeasuredHeight();
                        f = 0.3f;
                    } else {
                        measuredHeight = getMeasuredHeight();
                        f = 0.24f;
                    }
                    f2 = measuredHeight * f;
                }
                canvas.drawCircle(measuredWidth, f2, ((int) (this.f617a + ((getMeasuredWidth() - this.f617a) * fUptimeMillis))) / 2, this.f620d);
            } else {
                this.f627k = jLongValue;
            }
        }
        this.f618b.remove(Long.valueOf(this.f627k));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f622f.a(m830b().lifecycle().subscribe(mkd0.G(new e30() { // from class: l.gyb0
            public final void call(Object obj) {
                this.f11682a.m831c((c) obj);
            }
        })));
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight() / 2;
        int i3 = t100.y;
        if (this.f624h) {
            i3 = t100.K;
        }
        int i4 = this.f625i;
        int i5 = (int) (((((int) (i3 * 1.2f)) - ((measuredHeight * 200) / i4)) * 1.0f) / (1 - (200 / i4)));
        this.f617a = i5;
        if (i5 > i3) {
            this.f617a = i3;
        }
        this.f617a = (int) (this.f617a * 0.95f);
    }

    public void setCenterYMarginTop(int i) {
        this.f628l = i;
    }

    public void setIsbig(boolean z) {
        this.f624h = z;
        if (z) {
            this.f625i = 2000;
            this.f626j = 560;
        } else {
            this.f625i = 3000;
            this.f626j = 800;
        }
    }

    public QuickChatTopAnimView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public QuickChatTopAnimView(Context context) {
        this(context, null);
    }
}
