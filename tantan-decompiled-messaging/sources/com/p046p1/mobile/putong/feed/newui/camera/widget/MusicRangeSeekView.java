package com.p046p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p149l.e1c0;
import p149l.f30;
import p149l.t100;

/* JADX INFO: loaded from: classes12.dex */
public class MusicRangeSeekView extends View implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: t */
    public static final int f39780t = t100.m186890d(22.0f);

    /* JADX INFO: renamed from: u */
    public static final int f39781u = t100.m186890d(25.0f);

    /* JADX INFO: renamed from: a */
    public Integer[] f39782a;

    /* JADX INFO: renamed from: b */
    public ArrayList<RectF> f39783b;

    /* JADX INFO: renamed from: c */
    public int f39784c;

    /* JADX INFO: renamed from: d */
    public int f39785d;

    /* JADX INFO: renamed from: e */
    public int f39786e;

    /* JADX INFO: renamed from: f */
    public Paint f39787f;

    /* JADX INFO: renamed from: g */
    public int f39788g;

    /* JADX INFO: renamed from: h */
    public int f39789h;

    /* JADX INFO: renamed from: i */
    public int f39790i;

    /* JADX INFO: renamed from: j */
    public int f39791j;

    /* JADX INFO: renamed from: k */
    public int f39792k;

    /* JADX INFO: renamed from: l */
    public RectF f39793l;

    /* JADX INFO: renamed from: m */
    public int f39794m;

    /* JADX INFO: renamed from: n */
    public GestureDetector f39795n;

    /* JADX INFO: renamed from: o */
    public f30<Integer, Integer> f39796o;

    /* JADX INFO: renamed from: p */
    public RectF f39797p;

    /* JADX INFO: renamed from: q */
    public Path f39798q;

    /* JADX INFO: renamed from: r */
    public RectF f39799r;

    /* JADX INFO: renamed from: s */
    public Paint f39800s;

    public MusicRangeSeekView(Context context) throws IllegalArgumentException {
        super(context);
        this.f39782a = new Integer[]{32, 44, 36, 56, 44, 18, 26, 56, 44, 70, 58, 38, 25, 46, 34, 42, 56, 44, 36, 48, 64, 40, 30, 38, 58, 30, 56, 36, 42, 58, 70, 44, 34, 50};
        this.f39784c = t100.m186890d(2.0f);
        int iM186890d = t100.m186890d(4.0f);
        this.f39785d = iM186890d;
        this.f39786e = this.f39784c + iM186890d;
        m61695d();
    }

    /* JADX INFO: renamed from: a */
    public final void m61692a(Canvas canvas, int i, int i2, int i3, Paint paint) {
        if (this.f39793l == null) {
            this.f39793l = new RectF();
        }
        int i4 = (i * this.f39786e) + i3;
        this.f39793l.left = i4 - t100.m186890d(24.0f);
        this.f39793l.top = (getHeight() - f39780t) - 2;
        this.f39793l.right = t100.m186890d(24.0f) + i4;
        this.f39793l.bottom = getHeight() - 2;
        paint.setColor(getResources().getColor(e1c0.f88798n));
        RectF rectF = this.f39793l;
        float f = rectF.bottom;
        float f2 = rectF.top;
        canvas.drawRoundRect(rectF, (f - f2) / 2.0f, (f - f2) / 2.0f, paint);
        if (this.f39798q == null) {
            this.f39798q = new Path();
        }
        this.f39798q.reset();
        this.f39798q.moveTo(i4, this.f39793l.top - t100.m186890d(3.0f));
        this.f39798q.lineTo(i4 - t100.m186890d(2.0f), this.f39793l.top);
        this.f39798q.lineTo(t100.m186890d(2.0f) + i4, this.f39793l.top);
        this.f39798q.close();
        canvas.drawPath(this.f39798q, paint);
        paint.setColor(Color.parseColor("#33000000"));
        if (this.f39797p == null) {
            this.f39797p = new RectF();
        }
        this.f39797p.left = i4 - t100.m186890d(7.0f);
        this.f39797p.top = getHeight() - ((this.f39793l.height() * 3.0f) / 4.0f);
        this.f39797p.right = i4 - t100.m186890d(5.0f);
        this.f39797p.bottom = getHeight() - (this.f39793l.height() / 4.0f);
        canvas.drawRoundRect(this.f39797p, t100.m186890d(1.0f), t100.m186890d(1.0f), paint);
        this.f39797p.left = i4 - t100.m186890d(1.0f);
        this.f39797p.right = t100.m186890d(1.0f) + i4;
        canvas.drawRoundRect(this.f39797p, t100.m186890d(1.0f), t100.m186890d(1.0f), paint);
        this.f39797p.left = t100.m186890d(5.0f) + i4;
        this.f39797p.right = i4 + t100.m186890d(7.0f);
        canvas.drawRoundRect(this.f39797p, t100.m186890d(1.0f), t100.m186890d(1.0f), paint);
    }

    /* JADX INFO: renamed from: b */
    public final void m61693b(Canvas canvas, int i, int i2, int i3, Paint paint) {
        if (this.f39800s == null) {
            this.f39800s = new Paint(1);
        }
        this.f39800s.setTextSize(t100.m186890d(12.0f));
        this.f39800s.setStyle(Paint.Style.STROKE);
        this.f39800s.setColor(Color.parseColor("#ffffff"));
        String str = String.format(FeedModule.f38852a.getString(R$string.f39148t0), m61694c(this.f39791j));
        float fMeasureText = this.f39800s.measureText(str);
        if (this.f39799r == null) {
            this.f39799r = new RectF();
        }
        int iM186890d = t100.m186890d(5.0f);
        float f = iM186890d * 2;
        float f2 = (this.f39786e * i) + fMeasureText + f;
        float width = getWidth();
        RectF rectF = this.f39799r;
        if (f2 > width) {
            rectF.left = (getWidth() - fMeasureText) - f;
            this.f39799r.right = getWidth();
        } else {
            int i4 = this.f39786e;
            rectF.left = (i * i4) + i3;
            rectF.right = (i4 * i) + fMeasureText + f + i3;
        }
        RectF rectF2 = this.f39799r;
        rectF2.top = 0.0f;
        int i5 = f39781u;
        rectF2.bottom = i5;
        paint.setColor(Color.parseColor("#b3000000"));
        canvas.drawRoundRect(this.f39799r, t100.m186890d(2.0f), t100.m186890d(2.0f), paint);
        canvas.drawText(str, this.f39799r.left + iM186890d, (i5 * 2) / 3, this.f39800s);
        if (this.f39798q == null) {
            this.f39798q = new Path();
        }
        this.f39798q.reset();
        this.f39798q.moveTo((this.f39786e * i) + iM186890d + i3, i5);
        this.f39798q.lineTo((this.f39786e * i) + iM186890d + t100.m186890d(8.0f) + i3, i5);
        this.f39798q.lineTo((i * this.f39786e) + iM186890d + t100.m186890d(4.0f) + i3, i5 + t100.m186890d(4.0f));
        this.f39798q.close();
        canvas.drawPath(this.f39798q, paint);
    }

    /* JADX INFO: renamed from: c */
    public final String m61694c(int i) {
        StringBuilder sb;
        String str;
        int i2 = i / 1000;
        int i3 = i2 / 60;
        int i4 = i2 % 60;
        if (i3 >= 10) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("");
        } else {
            sb = new StringBuilder("0");
            sb.append(i3);
        }
        String string = sb.toString();
        if (i4 >= 10) {
            str = i4 + "";
        } else {
            str = "0" + i4;
        }
        return String.format("%s:%s", string, str);
    }

    /* JADX INFO: renamed from: d */
    public final void m61695d() {
        this.f39795n = new GestureDetector(this);
    }

    /* JADX INFO: renamed from: e */
    public final int m61696e(Canvas canvas) {
        if (this.f39800s == null) {
            this.f39800s = new Paint(1);
        }
        this.f39800s.setTextSize(t100.m186890d(10.0f));
        this.f39800s.setStyle(Paint.Style.STROKE);
        this.f39800s.setColor(Color.parseColor("#ffffff"));
        String strM61694c = m61694c(0);
        float fMeasureText = this.f39800s.measureText(strM61694c);
        String strM61694c2 = m61694c(this.f39788g);
        float fMeasureText2 = this.f39800s.measureText(strM61694c2);
        if (fMeasureText <= fMeasureText2) {
            fMeasureText = fMeasureText2;
        }
        int height = getHeight() - f39780t;
        int i = f39781u;
        float f = ((height - i) / 2) + i;
        canvas.drawText(strM61694c, this.f39784c, f, this.f39800s);
        canvas.drawText(strM61694c2, (getWidth() - this.f39784c) - fMeasureText, f, this.f39800s);
        return ((int) fMeasureText) + (this.f39784c * 2);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (this.f39793l == null) {
            return false;
        }
        return (motionEvent.getAction() != 0 || (motionEvent.getX() >= this.f39793l.left - 10.0f && motionEvent.getX() <= this.f39793l.right + 10.0f && motionEvent.getY() >= this.f39793l.top - 10.0f && motionEvent.getY() <= this.f39793l.bottom + 10.0f)) && this.f39789h != 0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        super.onDraw(canvas);
        int iM61696e = m61696e(canvas);
        if (this.f39783b == null) {
            this.f39783b = new ArrayList<>();
            this.f39790i = (getWidth() - (iM61696e * 2)) / this.f39786e;
            int height = getHeight() - f39780t;
            int i4 = f39781u;
            int i5 = ((height - i4) / 2) + i4;
            int i6 = 0;
            int i7 = 0;
            while (i6 < this.f39790i) {
                int i8 = (this.f39786e * i7) + this.f39784c;
                int i9 = this.f39785d + i8;
                Integer[] numArr = this.f39782a;
                int length = i6 >= numArr.length ? i6 % numArr.length : i6;
                this.f39783b.add(new RectF(i8 + iM61696e, i5 - t100.m186890d(numArr[length].intValue() / 2), i9 + iM61696e, t100.m186890d(this.f39782a[length].intValue() / 2) + i5));
                i7++;
                i6++;
            }
        }
        if (this.f39787f == null) {
            Paint paint = new Paint(1);
            this.f39787f = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f39787f.setColor(Color.parseColor("#ffffff"));
        }
        int i10 = this.f39788g;
        if (i10 == 0 || (i3 = this.f39789h) == 0) {
            i = this.f39790i;
            i2 = 0;
        } else {
            int i11 = this.f39790i;
            int i12 = (int) ((i3 / i10) * i11);
            int i13 = i12 != 0 ? i12 : 1;
            int i14 = this.f39791j;
            i2 = (int) ((i14 / i10) * i11);
            if (i2 >= i11 - i13 || i14 + i3 >= i10) {
                i2 = i11 - i13;
            }
            i = i2 + i13;
            this.f39792k = i13 * this.f39786e;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int i15 = this.f39790i;
        if (i <= i15) {
            i15 = i;
        }
        for (int i16 = 0; i16 < this.f39783b.size(); i16++) {
            if (i16 < i2 || i16 >= i15) {
                this.f39787f.setColor(Color.parseColor("#ffffff"));
            } else {
                this.f39787f.setColor(getResources().getColor(e1c0.f88798n));
            }
            canvas.drawRoundRect(this.f39783b.get(i16), this.f39783b.get(i16).width() / 2.0f, this.f39783b.get(i16).width() / 2.0f, this.f39787f);
        }
        int i17 = i2;
        m61693b(canvas, i17, i15, iM61696e, this.f39787f);
        m61692a(canvas, i17, i15, iM61696e, this.f39787f);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (getMeasuredWidth() != 0) {
            this.f39794m = getMeasuredWidth();
        }
        int i = this.f39794m;
        if (i != 0) {
            if (this.f39788g == 0) {
                this.f39788g = this.f39789h;
            }
            float f3 = this.f39791j;
            int i2 = this.f39788g;
            float f4 = f3 - ((f * i2) / i);
            if (f4 % 1.0f > 0.5d) {
                this.f39791j = ((int) f4) + 1;
            } else {
                this.f39791j = (int) f4;
            }
            int i3 = this.f39791j;
            int i4 = this.f39789h;
            if (i3 + i4 > i2) {
                this.f39791j = i2 - i4;
            }
            if (this.f39791j < 0) {
                this.f39791j = 0;
            }
            setStartTime(this.f39791j);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && NullChecker.m81303a(this.f39796o)) {
            f30<Integer, Integer> f30Var = this.f39796o;
            Integer numValueOf = Integer.valueOf(this.f39791j);
            int i = this.f39791j;
            int i2 = this.f39789h;
            int i3 = i + i2;
            int i4 = this.f39788g;
            if (i3 <= i4) {
                i4 = i + i2;
            }
            f30Var.call(numValueOf, Integer.valueOf(i4));
        }
        return this.f39795n.onTouchEvent(motionEvent);
    }

    public void setListener(f30<Integer, Integer> f30Var) {
        this.f39796o = f30Var;
    }

    public void setMusicLength(int i) {
        this.f39788g = i;
    }

    public void setStartTime(int i) {
        this.f39791j = i;
        invalidate();
    }

    public void setVideoLength(int i) {
        this.f39789h = i;
    }

    public MusicRangeSeekView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39782a = new Integer[]{32, 44, 36, 56, 44, 18, 26, 56, 44, 70, 58, 38, 25, 46, 34, 42, 56, 44, 36, 48, 64, 40, 30, 38, 58, 30, 56, 36, 42, 58, 70, 44, 34, 50};
        this.f39784c = t100.m186890d(2.0f);
        int iM186890d = t100.m186890d(4.0f);
        this.f39785d = iM186890d;
        this.f39786e = this.f39784c + iM186890d;
        m61695d();
    }

    public MusicRangeSeekView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39782a = new Integer[]{32, 44, 36, 56, 44, 18, 26, 56, 44, 70, 58, 38, 25, 46, 34, 42, 56, 44, 36, 48, 64, 40, 30, 38, 58, 30, 56, 36, 42, 58, 70, 44, 34, 50};
        this.f39784c = t100.m186890d(2.0f);
        int iM186890d = t100.m186890d(4.0f);
        this.f39785d = iM186890d;
        this.f39786e = this.f39784c + iM186890d;
        m61695d();
    }
}
