package com.p046p1.mobile.putong.core.p053ui.onlinematch.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import p149l.bs5;
import p149l.e30;
import p149l.mkd0;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class QuickChatTopAnimView extends View {

    /* JADX INFO: renamed from: a */
    public int f32795a;

    /* JADX INFO: renamed from: b */
    public ArrayList<Long> f32796b;

    /* JADX INFO: renamed from: c */
    public final DecelerateInterpolator f32797c;

    /* JADX INFO: renamed from: d */
    public Paint f32798d;

    /* JADX INFO: renamed from: e */
    public int f32799e;

    /* JADX INFO: renamed from: f */
    public bs5 f32800f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f32801g;

    /* JADX INFO: renamed from: h */
    public boolean f32802h;

    /* JADX INFO: renamed from: i */
    public int f32803i;

    /* JADX INFO: renamed from: j */
    public int f32804j;

    /* JADX INFO: renamed from: k */
    public long f32805k;

    /* JADX INFO: renamed from: l */
    public int f32806l;

    public QuickChatTopAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32796b = new ArrayList<>();
        this.f32797c = new DecelerateInterpolator();
        this.f32798d = new Paint();
        this.f32800f = new bs5();
        this.f32798d.setColor(Color.parseColor("#ffffff"));
        this.f32798d.setStrokeWidth(t100.f167252a);
        this.f32798d.setAlpha(45);
        this.f32798d.setAntiAlias(true);
        this.f32798d.setStyle(Paint.Style.STROKE);
        this.f32802h = false;
        this.f32803i = 3000;
        this.f32804j = 800;
        this.f32805k = 0L;
        this.f32806l = 0;
        this.f32799e = isInEditMode() ? 0 : t100.m186890d(3.0f);
    }

    /* JADX INFO: renamed from: b */
    public final Act m50399b() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m50400c(C4319c c4319c) {
        if (c4319c == C4319c.f15550k) {
            if (NullChecker.m81303a(this.f32801g)) {
                this.f32801g.cancel();
            }
        } else if (c4319c == C4319c.f15547h && NullChecker.m81303a(this.f32801g)) {
            this.f32801g.start();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32800f.m103657c();
        if (NullChecker.m81303a(this.f32801g) && this.f32801g.isRunning()) {
            this.f32801g.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float measuredHeight;
        float f;
        float f2;
        super.onDraw(canvas);
        Iterator<Long> it = this.f32796b.iterator();
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            if (SystemClock.uptimeMillis() - jLongValue < this.f32803i) {
                float fUptimeMillis = ((SystemClock.uptimeMillis() - jLongValue) * 1.0f) / this.f32803i;
                this.f32798d.setAlpha((int) (((1.0f - this.f32797c.getInterpolation(fUptimeMillis)) * 35.0f) + 10.0f));
                float measuredWidth = getMeasuredWidth() / 2;
                int i = this.f32806l;
                if (i != 0) {
                    f2 = i;
                } else {
                    if (this.f32802h) {
                        measuredHeight = getMeasuredHeight();
                        f = 0.3f;
                    } else {
                        measuredHeight = getMeasuredHeight();
                        f = 0.24f;
                    }
                    f2 = measuredHeight * f;
                }
                canvas.drawCircle(measuredWidth, f2, ((int) (this.f32795a + ((getMeasuredWidth() - this.f32795a) * fUptimeMillis))) / 2, this.f32798d);
            } else {
                this.f32805k = jLongValue;
            }
        }
        this.f32796b.remove(Long.valueOf(this.f32805k));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32800f.m103655a(m50399b().lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.gyb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105004a.m50400c((C4319c) obj);
            }
        })));
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight() / 2;
        int i3 = t100.f167276y;
        if (this.f32802h) {
            i3 = t100.f167236K;
        }
        int i4 = this.f32803i;
        int i5 = (int) (((((int) (i3 * 1.2f)) - ((measuredHeight * 200) / i4)) * 1.0f) / (1 - (200 / i4)));
        this.f32795a = i5;
        if (i5 > i3) {
            this.f32795a = i3;
        }
        this.f32795a = (int) (this.f32795a * 0.95f);
    }

    public void setCenterYMarginTop(int i) {
        this.f32806l = i;
    }

    public void setIsbig(boolean z) {
        this.f32802h = z;
        if (z) {
            this.f32803i = 2000;
            this.f32804j = 560;
        } else {
            this.f32803i = 3000;
            this.f32804j = 800;
        }
    }

    public QuickChatTopAnimView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public QuickChatTopAnimView(Context context) {
        this(context, null);
    }
}
