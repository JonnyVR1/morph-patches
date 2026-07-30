package com.p051p1.mobile.putong.core.p058ui.onlinematch.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import p153l.ft5;
import p153l.psd0;
import p153l.qa00;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class QuickChatTopAnimView extends View {

    /* JADX INFO: renamed from: a */
    public int f33643a;

    /* JADX INFO: renamed from: b */
    public ArrayList<Long> f33644b;

    /* JADX INFO: renamed from: c */
    public final DecelerateInterpolator f33645c;

    /* JADX INFO: renamed from: d */
    public Paint f33646d;

    /* JADX INFO: renamed from: e */
    public int f33647e;

    /* JADX INFO: renamed from: f */
    public ft5 f33648f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f33649g;

    /* JADX INFO: renamed from: h */
    public boolean f33650h;

    /* JADX INFO: renamed from: i */
    public int f33651i;

    /* JADX INFO: renamed from: j */
    public int f33652j;

    /* JADX INFO: renamed from: k */
    public long f33653k;

    /* JADX INFO: renamed from: l */
    public int f33654l;

    public QuickChatTopAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33644b = new ArrayList<>();
        this.f33645c = new DecelerateInterpolator();
        this.f33646d = new Paint();
        this.f33648f = new ft5();
        this.f33646d.setColor(Color.parseColor("#ffffff"));
        this.f33646d.setStrokeWidth(qa00.f156314a);
        this.f33646d.setAlpha(45);
        this.f33646d.setAntiAlias(true);
        this.f33646d.setStyle(Paint.Style.STROKE);
        this.f33650h = false;
        this.f33651i = 3000;
        this.f33652j = 800;
        this.f33653k = 0L;
        this.f33654l = 0;
        this.f33647e = isInEditMode() ? 0 : qa00.m175859d(3.0f);
    }

    /* JADX INFO: renamed from: b */
    public final Act m51582b() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m51583c(C4470c c4470c) {
        if (c4470c == C4470c.f16269k) {
            if (NullChecker.m82486a(this.f33649g)) {
                this.f33649g.cancel();
            }
        } else if (c4470c == C4470c.f16266h && NullChecker.m82486a(this.f33649g)) {
            this.f33649g.start();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33648f.m127299c();
        if (NullChecker.m82486a(this.f33649g) && this.f33649g.isRunning()) {
            this.f33649g.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float measuredHeight;
        float f;
        float f2;
        super.onDraw(canvas);
        Iterator<Long> it = this.f33644b.iterator();
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            if (SystemClock.uptimeMillis() - jLongValue < this.f33651i) {
                float fUptimeMillis = ((SystemClock.uptimeMillis() - jLongValue) * 1.0f) / this.f33651i;
                this.f33646d.setAlpha((int) (((1.0f - this.f33645c.getInterpolation(fUptimeMillis)) * 35.0f) + 10.0f));
                float measuredWidth = getMeasuredWidth() / 2;
                int i = this.f33654l;
                if (i != 0) {
                    f2 = i;
                } else {
                    if (this.f33650h) {
                        measuredHeight = getMeasuredHeight();
                        f = 0.3f;
                    } else {
                        measuredHeight = getMeasuredHeight();
                        f = 0.24f;
                    }
                    f2 = measuredHeight * f;
                }
                canvas.drawCircle(measuredWidth, f2, ((int) (this.f33643a + ((getMeasuredWidth() - this.f33643a) * fUptimeMillis))) / 2, this.f33646d);
            } else {
                this.f33653k = jLongValue;
            }
        }
        this.f33644b.remove(Long.valueOf(this.f33653k));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f33648f.m127297a(m51582b().lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.k6c0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124169a.m51583c((C4470c) obj);
            }
        })));
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight() / 2;
        int i3 = qa00.f156338y;
        if (this.f33650h) {
            i3 = qa00.f156298K;
        }
        int i4 = this.f33651i;
        int i5 = (int) (((((int) (i3 * 1.2f)) - ((measuredHeight * 200) / i4)) * 1.0f) / (1 - (200 / i4)));
        this.f33643a = i5;
        if (i5 > i3) {
            this.f33643a = i3;
        }
        this.f33643a = (int) (this.f33643a * 0.95f);
    }

    public void setCenterYMarginTop(int i) {
        this.f33654l = i;
    }

    public void setIsbig(boolean z) {
        this.f33650h = z;
        if (z) {
            this.f33651i = 2000;
            this.f33652j = 560;
        } else {
            this.f33651i = 3000;
            this.f33652j = 800;
        }
    }

    public QuickChatTopAnimView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public QuickChatTopAnimView(Context context) {
        this(context, null);
    }
}
