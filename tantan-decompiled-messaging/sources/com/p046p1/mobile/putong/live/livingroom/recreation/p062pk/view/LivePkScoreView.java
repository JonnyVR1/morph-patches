package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p149l.e30;
import p149l.i3c0;
import p149l.t100;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes5.dex */
public class LivePkScoreView extends View {

    /* JADX INFO: renamed from: a */
    public int f51655a;

    /* JADX INFO: renamed from: b */
    public int f51656b;

    /* JADX INFO: renamed from: c */
    public int f51657c;

    /* JADX INFO: renamed from: d */
    public int f51658d;

    /* JADX INFO: renamed from: e */
    public int f51659e;

    /* JADX INFO: renamed from: f */
    public Paint f51660f;

    /* JADX INFO: renamed from: g */
    public float f51661g;

    /* JADX INFO: renamed from: h */
    public float f51662h;

    /* JADX INFO: renamed from: i */
    public Paint f51663i;

    /* JADX INFO: renamed from: j */
    public Paint f51664j;

    /* JADX INFO: renamed from: k */
    public float f51665k;

    /* JADX INFO: renamed from: l */
    public long f51666l;

    /* JADX INFO: renamed from: m */
    public long f51667m;

    /* JADX INFO: renamed from: n */
    public String f51668n;

    /* JADX INFO: renamed from: o */
    public String f51669o;

    /* JADX INFO: renamed from: p */
    public Path f51670p;

    /* JADX INFO: renamed from: q */
    public Path f51671q;

    /* JADX INFO: renamed from: r */
    public e30<Float> f51672r;

    /* JADX INFO: renamed from: s */
    public Drawable f51673s;

    /* JADX INFO: renamed from: t */
    public boolean f51674t;

    /* JADX INFO: renamed from: u */
    public boolean f51675u;

    public LivePkScoreView(Context context) {
        super(context);
        this.f51655a = t100.m186890d(10.0f);
        this.f51656b = t100.m186890d(11.0f);
        this.f51657c = t100.m186890d(12.0f);
        this.f51658d = t100.m186890d(4.0f);
        this.f51659e = t100.m186890d(5.0f);
        this.f51665k = 2.0f;
        this.f51666l = 0L;
        this.f51667m = 0L;
        this.f51668n = ypv.f199497e.getString(R$string.f46914Qa);
        this.f51669o = ypv.f199497e.getString(R$string.f47633xe);
        this.f51674t = false;
        this.f51675u = false;
        this.f51673s = getResources().getDrawable(i3c0.f111075l5);
    }

    /* JADX INFO: renamed from: a */
    public void m76148a() {
        this.f51666l = 0L;
        this.f51667m = 0L;
        postInvalidate();
    }

    /* JADX INFO: renamed from: b */
    public void m76149b(long j, long j2, boolean z, boolean z2) {
        this.f51674t = z;
        this.f51675u = z2;
        if (j > this.f51666l) {
            this.f51666l = j;
        }
        if (j2 > this.f51667m) {
            this.f51667m = j2;
        }
        postInvalidate();
    }

    public long getLeftScore() {
        return this.f51666l;
    }

    public long getRightScore() {
        return this.f51667m;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f51660f == null || getHeight() == 0) {
            Paint paint = new Paint();
            this.f51660f = paint;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            this.f51660f.setColor(-1);
            this.f51660f.setAntiAlias(true);
            this.f51660f.setTextSize(this.f51657c);
            this.f51660f.setFakeBoldText(true);
            RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            Paint.FontMetrics fontMetrics = this.f51660f.getFontMetrics();
            float f = fontMetrics.bottom;
            this.f51661g = rectF.centerY() + (((f - fontMetrics.top) / 2.0f) - f);
            this.f51660f.setTextSize(this.f51657c);
            Paint.FontMetrics fontMetrics2 = this.f51660f.getFontMetrics();
            float f2 = fontMetrics2.bottom;
            this.f51662h = rectF.centerY() + (((f2 - fontMetrics2.top) / 2.0f) - f2);
            Paint paint2 = new Paint();
            this.f51663i = paint2;
            paint2.setStyle(style);
            this.f51663i.setColor(-14064897);
            this.f51663i.setAntiAlias(true);
            Paint paint3 = new Paint();
            this.f51664j = paint3;
            paint3.setStyle(style);
            this.f51664j.setColor(-49023);
            this.f51664j.setAntiAlias(true);
            Path path = new Path();
            this.f51670p = path;
            path.reset();
            this.f51670p.addRoundRect(rectF, xdl0.m208407w(8.0f), xdl0.m208407w(8.0f), Path.Direction.CCW);
            this.f51671q = new Path();
        }
        String strValueOf = String.valueOf(this.f51666l);
        String strValueOf2 = String.valueOf(this.f51667m);
        this.f51660f.setTextSize(this.f51656b);
        float fMeasureText = this.f51660f.measureText(this.f51668n);
        this.f51660f.setTextSize(this.f51657c);
        float fMeasureText2 = this.f51660f.measureText(strValueOf);
        float f3 = this.f51655a + fMeasureText;
        int i = this.f51658d;
        float width = f3 + i + fMeasureText2 + i;
        this.f51660f.setTextSize(this.f51656b);
        float fMeasureText3 = this.f51660f.measureText(this.f51669o);
        this.f51660f.setTextSize(this.f51657c);
        float fMeasureText4 = this.f51660f.measureText(strValueOf2);
        float f4 = this.f51655a + fMeasureText3;
        int i2 = this.f51658d;
        float f5 = f4 + i2 + fMeasureText4 + i2;
        long j = this.f51666l;
        if (j == 0 && this.f51667m == 0) {
            width = getWidth() / 2.0f;
        } else if (j != 0) {
            long j2 = this.f51667m;
            if (j2 == 0) {
                width = getWidth() - f5;
            } else {
                width += ((getWidth() - width) - f5) * (j / (j + j2));
            }
        }
        if (this.f51674t) {
            width = getWidth() / 2.0f;
        }
        float f6 = width;
        e30<Float> e30Var = this.f51672r;
        if (e30Var != null) {
            e30Var.call(Float.valueOf(f6));
        }
        this.f51671q.reset();
        Path path2 = this.f51671q;
        float height = getHeight();
        Path.Direction direction = Path.Direction.CCW;
        path2.addRect(0.0f, 0.0f, f6, height, direction);
        Path path3 = this.f51671q;
        Path path4 = this.f51670p;
        Path.Op op = Path.Op.INTERSECT;
        path3.op(path4, op);
        canvas.drawPath(this.f51671q, this.f51663i);
        this.f51671q.reset();
        this.f51671q.addRect(f6, 0.0f, getWidth(), getHeight(), direction);
        this.f51671q.op(this.f51670p, op);
        canvas.drawPath(this.f51671q, this.f51664j);
        this.f51660f.setTextSize(this.f51656b);
        canvas.drawText(this.f51668n, this.f51655a, this.f51662h, this.f51660f);
        this.f51660f.setTextSize(this.f51657c);
        canvas.drawText(strValueOf, this.f51655a + fMeasureText + this.f51658d, this.f51661g + this.f51665k, this.f51660f);
        this.f51660f.setTextSize(this.f51656b);
        canvas.drawText(this.f51669o, (getWidth() - this.f51655a) - fMeasureText3, this.f51662h, this.f51660f);
        if (!this.f51675u) {
            this.f51660f.setTextSize(this.f51657c);
            canvas.drawText(strValueOf2, (((getWidth() - this.f51655a) - fMeasureText3) - fMeasureText4) - this.f51659e, this.f51661g + this.f51665k, this.f51660f);
            return;
        }
        int width2 = (int) ((((getWidth() - this.f51655a) - fMeasureText3) - t100.m186890d(30.0f)) - this.f51659e);
        int iM186890d = t100.m186890d(5.0f);
        int iM186890d2 = t100.m186890d(30.0f) + width2;
        int iM186890d3 = t100.m186890d(12.0f) + iM186890d;
        if (this.f51673s == null) {
            this.f51673s = getResources().getDrawable(i3c0.f111075l5);
        }
        this.f51673s.setBounds(width2, iM186890d, iM186890d2, iM186890d3);
        this.f51673s.draw(canvas);
    }

    public void setCursorListener(e30<Float> e30Var) {
        this.f51672r = e30Var;
    }

    public LivePkScoreView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51655a = t100.m186890d(10.0f);
        this.f51656b = t100.m186890d(11.0f);
        this.f51657c = t100.m186890d(12.0f);
        this.f51658d = t100.m186890d(4.0f);
        this.f51659e = t100.m186890d(5.0f);
        this.f51665k = 2.0f;
        this.f51666l = 0L;
        this.f51667m = 0L;
        this.f51668n = ypv.f199497e.getString(R$string.f46914Qa);
        this.f51669o = ypv.f199497e.getString(R$string.f47633xe);
        this.f51674t = false;
        this.f51675u = false;
    }

    public LivePkScoreView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51655a = t100.m186890d(10.0f);
        this.f51656b = t100.m186890d(11.0f);
        this.f51657c = t100.m186890d(12.0f);
        this.f51658d = t100.m186890d(4.0f);
        this.f51659e = t100.m186890d(5.0f);
        this.f51665k = 2.0f;
        this.f51666l = 0L;
        this.f51667m = 0L;
        this.f51668n = ypv.f199497e.getString(R$string.f46914Qa);
        this.f51669o = ypv.f199497e.getString(R$string.f47633xe);
        this.f51674t = false;
        this.f51675u = false;
    }
}
