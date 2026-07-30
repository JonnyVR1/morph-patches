package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p153l.bnl0;
import p153l.obc0;
import p153l.qa00;
import p153l.y20;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class LivePkScoreView extends View {

    /* JADX INFO: renamed from: a */
    public int f52503a;

    /* JADX INFO: renamed from: b */
    public int f52504b;

    /* JADX INFO: renamed from: c */
    public int f52505c;

    /* JADX INFO: renamed from: d */
    public int f52506d;

    /* JADX INFO: renamed from: e */
    public int f52507e;

    /* JADX INFO: renamed from: f */
    public Paint f52508f;

    /* JADX INFO: renamed from: g */
    public float f52509g;

    /* JADX INFO: renamed from: h */
    public float f52510h;

    /* JADX INFO: renamed from: i */
    public Paint f52511i;

    /* JADX INFO: renamed from: j */
    public Paint f52512j;

    /* JADX INFO: renamed from: k */
    public float f52513k;

    /* JADX INFO: renamed from: l */
    public long f52514l;

    /* JADX INFO: renamed from: m */
    public long f52515m;

    /* JADX INFO: renamed from: n */
    public String f52516n;

    /* JADX INFO: renamed from: o */
    public String f52517o;

    /* JADX INFO: renamed from: p */
    public Path f52518p;

    /* JADX INFO: renamed from: q */
    public Path f52519q;

    /* JADX INFO: renamed from: r */
    public y20<Float> f52520r;

    /* JADX INFO: renamed from: s */
    public Drawable f52521s;

    /* JADX INFO: renamed from: t */
    public boolean f52522t;

    /* JADX INFO: renamed from: u */
    public boolean f52523u;

    public LivePkScoreView(Context context) {
        super(context);
        this.f52503a = qa00.m175859d(10.0f);
        this.f52504b = qa00.m175859d(11.0f);
        this.f52505c = qa00.m175859d(12.0f);
        this.f52506d = qa00.m175859d(4.0f);
        this.f52507e = qa00.m175859d(5.0f);
        this.f52513k = 2.0f;
        this.f52514l = 0L;
        this.f52515m = 0L;
        this.f52516n = zrv.f205803e.getString(R$string.f47762Qa);
        this.f52517o = zrv.f205803e.getString(R$string.f48481xe);
        this.f52522t = false;
        this.f52523u = false;
        this.f52521s = getResources().getDrawable(obc0.f146403l5);
    }

    /* JADX INFO: renamed from: a */
    public void m77331a() {
        this.f52514l = 0L;
        this.f52515m = 0L;
        postInvalidate();
    }

    /* JADX INFO: renamed from: b */
    public void m77332b(long j, long j2, boolean z, boolean z2) {
        this.f52522t = z;
        this.f52523u = z2;
        if (j > this.f52514l) {
            this.f52514l = j;
        }
        if (j2 > this.f52515m) {
            this.f52515m = j2;
        }
        postInvalidate();
    }

    public long getLeftScore() {
        return this.f52514l;
    }

    public long getRightScore() {
        return this.f52515m;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f52508f == null || getHeight() == 0) {
            Paint paint = new Paint();
            this.f52508f = paint;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            this.f52508f.setColor(-1);
            this.f52508f.setAntiAlias(true);
            this.f52508f.setTextSize(this.f52505c);
            this.f52508f.setFakeBoldText(true);
            RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            Paint.FontMetrics fontMetrics = this.f52508f.getFontMetrics();
            float f = fontMetrics.bottom;
            this.f52509g = rectF.centerY() + (((f - fontMetrics.top) / 2.0f) - f);
            this.f52508f.setTextSize(this.f52505c);
            Paint.FontMetrics fontMetrics2 = this.f52508f.getFontMetrics();
            float f2 = fontMetrics2.bottom;
            this.f52510h = rectF.centerY() + (((f2 - fontMetrics2.top) / 2.0f) - f2);
            Paint paint2 = new Paint();
            this.f52511i = paint2;
            paint2.setStyle(style);
            this.f52511i.setColor(-14064897);
            this.f52511i.setAntiAlias(true);
            Paint paint3 = new Paint();
            this.f52512j = paint3;
            paint3.setStyle(style);
            this.f52512j.setColor(-49023);
            this.f52512j.setAntiAlias(true);
            Path path = new Path();
            this.f52518p = path;
            path.reset();
            this.f52518p.addRoundRect(rectF, bnl0.m105587w(8.0f), bnl0.m105587w(8.0f), Path.Direction.CCW);
            this.f52519q = new Path();
        }
        String strValueOf = String.valueOf(this.f52514l);
        String strValueOf2 = String.valueOf(this.f52515m);
        this.f52508f.setTextSize(this.f52504b);
        float fMeasureText = this.f52508f.measureText(this.f52516n);
        this.f52508f.setTextSize(this.f52505c);
        float fMeasureText2 = this.f52508f.measureText(strValueOf);
        float f3 = this.f52503a + fMeasureText;
        int i = this.f52506d;
        float width = f3 + i + fMeasureText2 + i;
        this.f52508f.setTextSize(this.f52504b);
        float fMeasureText3 = this.f52508f.measureText(this.f52517o);
        this.f52508f.setTextSize(this.f52505c);
        float fMeasureText4 = this.f52508f.measureText(strValueOf2);
        float f4 = this.f52503a + fMeasureText3;
        int i2 = this.f52506d;
        float f5 = f4 + i2 + fMeasureText4 + i2;
        long j = this.f52514l;
        if (j == 0 && this.f52515m == 0) {
            width = getWidth() / 2.0f;
        } else if (j != 0) {
            long j2 = this.f52515m;
            if (j2 == 0) {
                width = getWidth() - f5;
            } else {
                width += ((getWidth() - width) - f5) * (j / (j + j2));
            }
        }
        if (this.f52522t) {
            width = getWidth() / 2.0f;
        }
        float f6 = width;
        y20<Float> y20Var = this.f52520r;
        if (y20Var != null) {
            y20Var.call(Float.valueOf(f6));
        }
        this.f52519q.reset();
        Path path2 = this.f52519q;
        float height = getHeight();
        Path.Direction direction = Path.Direction.CCW;
        path2.addRect(0.0f, 0.0f, f6, height, direction);
        Path path3 = this.f52519q;
        Path path4 = this.f52518p;
        Path.Op op = Path.Op.INTERSECT;
        path3.op(path4, op);
        canvas.drawPath(this.f52519q, this.f52511i);
        this.f52519q.reset();
        this.f52519q.addRect(f6, 0.0f, getWidth(), getHeight(), direction);
        this.f52519q.op(this.f52518p, op);
        canvas.drawPath(this.f52519q, this.f52512j);
        this.f52508f.setTextSize(this.f52504b);
        canvas.drawText(this.f52516n, this.f52503a, this.f52510h, this.f52508f);
        this.f52508f.setTextSize(this.f52505c);
        canvas.drawText(strValueOf, this.f52503a + fMeasureText + this.f52506d, this.f52509g + this.f52513k, this.f52508f);
        this.f52508f.setTextSize(this.f52504b);
        canvas.drawText(this.f52517o, (getWidth() - this.f52503a) - fMeasureText3, this.f52510h, this.f52508f);
        if (!this.f52523u) {
            this.f52508f.setTextSize(this.f52505c);
            canvas.drawText(strValueOf2, (((getWidth() - this.f52503a) - fMeasureText3) - fMeasureText4) - this.f52507e, this.f52509g + this.f52513k, this.f52508f);
            return;
        }
        int width2 = (int) ((((getWidth() - this.f52503a) - fMeasureText3) - qa00.m175859d(30.0f)) - this.f52507e);
        int iM175859d = qa00.m175859d(5.0f);
        int iM175859d2 = qa00.m175859d(30.0f) + width2;
        int iM175859d3 = qa00.m175859d(12.0f) + iM175859d;
        if (this.f52521s == null) {
            this.f52521s = getResources().getDrawable(obc0.f146403l5);
        }
        this.f52521s.setBounds(width2, iM175859d, iM175859d2, iM175859d3);
        this.f52521s.draw(canvas);
    }

    public void setCursorListener(y20<Float> y20Var) {
        this.f52520r = y20Var;
    }

    public LivePkScoreView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52503a = qa00.m175859d(10.0f);
        this.f52504b = qa00.m175859d(11.0f);
        this.f52505c = qa00.m175859d(12.0f);
        this.f52506d = qa00.m175859d(4.0f);
        this.f52507e = qa00.m175859d(5.0f);
        this.f52513k = 2.0f;
        this.f52514l = 0L;
        this.f52515m = 0L;
        this.f52516n = zrv.f205803e.getString(R$string.f47762Qa);
        this.f52517o = zrv.f205803e.getString(R$string.f48481xe);
        this.f52522t = false;
        this.f52523u = false;
    }

    public LivePkScoreView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52503a = qa00.m175859d(10.0f);
        this.f52504b = qa00.m175859d(11.0f);
        this.f52505c = qa00.m175859d(12.0f);
        this.f52506d = qa00.m175859d(4.0f);
        this.f52507e = qa00.m175859d(5.0f);
        this.f52513k = 2.0f;
        this.f52514l = 0L;
        this.f52515m = 0L;
        this.f52516n = zrv.f205803e.getString(R$string.f47762Qa);
        this.f52517o = zrv.f205803e.getString(R$string.f48481xe);
        this.f52522t = false;
        this.f52523u = false;
    }
}
