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
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p149l.e1c0;
import p149l.f30;
import p149l.t100;

/* JADX INFO: loaded from: classes12.dex */
public class IVMusicRangeSeekView extends View implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: u */
    public static final int f39703u = t100.m186890d(22.0f);

    /* JADX INFO: renamed from: v */
    public static final int f39704v = t100.m186890d(25.0f);

    /* JADX INFO: renamed from: a */
    public Integer[] f39705a;

    /* JADX INFO: renamed from: b */
    public ArrayList<RectF> f39706b;

    /* JADX INFO: renamed from: c */
    public int f39707c;

    /* JADX INFO: renamed from: d */
    public int f39708d;

    /* JADX INFO: renamed from: e */
    public int f39709e;

    /* JADX INFO: renamed from: f */
    public Paint f39710f;

    /* JADX INFO: renamed from: g */
    public int f39711g;

    /* JADX INFO: renamed from: h */
    public int f39712h;

    /* JADX INFO: renamed from: i */
    public int f39713i;

    /* JADX INFO: renamed from: j */
    public int f39714j;

    /* JADX INFO: renamed from: k */
    public int f39715k;

    /* JADX INFO: renamed from: l */
    public RectF f39716l;

    /* JADX INFO: renamed from: m */
    public RectF f39717m;

    /* JADX INFO: renamed from: n */
    public int f39718n;

    /* JADX INFO: renamed from: o */
    public GestureDetector f39719o;

    /* JADX INFO: renamed from: p */
    public f30<Integer, Integer> f39720p;

    /* JADX INFO: renamed from: q */
    public RectF f39721q;

    /* JADX INFO: renamed from: r */
    public Path f39722r;

    /* JADX INFO: renamed from: s */
    public RectF f39723s;

    /* JADX INFO: renamed from: t */
    public Paint f39724t;

    public IVMusicRangeSeekView(Context context) throws IllegalArgumentException {
        super(context);
        this.f39705a = new Integer[]{32, 44, 36, 56, 44, 18, 26, 56, 44, 70, 58, 38, 25, 46, 34, 42, 56, 44, 36, 48, 64, 40, 30, 38, 58, 30, 56, 36, 42, 58, 70, 44, 34, 50};
        this.f39707c = t100.m186890d(2.0f);
        int iM186890d = t100.m186890d(4.0f);
        this.f39708d = iM186890d;
        this.f39709e = this.f39707c + iM186890d;
        m61610d();
    }

    /* JADX INFO: renamed from: a */
    public final void m61607a(Canvas canvas, int i, int i2, int i3, Paint paint) {
        if (this.f39716l == null) {
            this.f39716l = new RectF();
        }
        if (this.f39717m == null) {
            this.f39717m = new RectF();
        }
        int i4 = (i * this.f39709e) + i3;
        this.f39716l.left = i4 - t100.m186890d(24.0f);
        this.f39716l.top = (getHeight() - f39703u) - 2;
        this.f39716l.right = t100.m186890d(24.0f) + i4;
        this.f39716l.bottom = getHeight() - 2;
        this.f39717m.left = i4 - t100.m186890d(24.0f);
        RectF rectF = this.f39717m;
        rectF.top = 1.0f;
        rectF.right = (i2 * this.f39709e) + i3;
        rectF.bottom = getHeight() + 2;
        paint.setColor(getResources().getColor(e1c0.f88798n));
        RectF rectF2 = this.f39716l;
        float f = rectF2.bottom;
        float f2 = rectF2.top;
        canvas.drawRoundRect(rectF2, (f - f2) / 2.0f, (f - f2) / 2.0f, paint);
        if (this.f39722r == null) {
            this.f39722r = new Path();
        }
        this.f39722r.reset();
        this.f39722r.moveTo(i4, this.f39716l.top - t100.m186890d(3.0f));
        this.f39722r.lineTo(i4 - t100.m186890d(2.0f), this.f39716l.top);
        this.f39722r.lineTo(t100.m186890d(2.0f) + i4, this.f39716l.top);
        this.f39722r.close();
        canvas.drawPath(this.f39722r, paint);
        paint.setColor(Color.parseColor("#33000000"));
        if (this.f39721q == null) {
            this.f39721q = new RectF();
        }
        this.f39721q.left = i4 - t100.m186890d(7.0f);
        this.f39721q.top = getHeight() - ((this.f39716l.height() * 3.0f) / 4.0f);
        this.f39721q.right = i4 - t100.m186890d(5.0f);
        this.f39721q.bottom = getHeight() - (this.f39716l.height() / 4.0f);
        canvas.drawRoundRect(this.f39721q, t100.m186890d(1.0f), t100.m186890d(1.0f), paint);
        this.f39721q.left = i4 - t100.m186890d(1.0f);
        this.f39721q.right = t100.m186890d(1.0f) + i4;
        canvas.drawRoundRect(this.f39721q, t100.m186890d(1.0f), t100.m186890d(1.0f), paint);
        this.f39721q.left = t100.m186890d(5.0f) + i4;
        this.f39721q.right = i4 + t100.m186890d(7.0f);
        canvas.drawRoundRect(this.f39721q, t100.m186890d(1.0f), t100.m186890d(1.0f), paint);
    }

    /* JADX INFO: renamed from: b */
    public final void m61608b(Canvas canvas, int i, int i2, int i3, Paint paint) {
        if (this.f39724t == null) {
            this.f39724t = new Paint(1);
        }
        this.f39724t.setTextSize(t100.m186890d(12.0f));
        this.f39724t.setStyle(Paint.Style.FILL);
        this.f39724t.setColor(Color.parseColor("#ffffff"));
        String str = m61609c(this.f39714j) + "/" + m61609c(this.f39711g);
        float fMeasureText = this.f39724t.measureText(str);
        if (this.f39723s == null) {
            this.f39723s = new RectF();
        }
        int iM186890d = t100.m186890d(5.0f);
        float f = iM186890d * 2;
        float f2 = (this.f39709e * i) + fMeasureText + f;
        float width = getWidth();
        RectF rectF = this.f39723s;
        if (f2 > width) {
            rectF.left = (getWidth() - fMeasureText) - f;
            this.f39723s.right = getWidth();
        } else {
            int i4 = this.f39709e;
            rectF.left = (i * i4) + i3;
            rectF.right = (i4 * i) + fMeasureText + f + i3;
        }
        RectF rectF2 = this.f39723s;
        rectF2.top = 0.0f;
        int i5 = f39704v;
        rectF2.bottom = i5;
        paint.setColor(Color.parseColor("#b3000000"));
        canvas.drawRoundRect(this.f39723s, t100.m186890d(2.0f), t100.m186890d(2.0f), paint);
        canvas.drawText(str, this.f39723s.left + iM186890d, (i5 * 2) / 3, this.f39724t);
        if (this.f39722r == null) {
            this.f39722r = new Path();
        }
        this.f39722r.reset();
        this.f39722r.moveTo((this.f39709e * i) + iM186890d + i3, i5);
        this.f39722r.lineTo((this.f39709e * i) + iM186890d + t100.m186890d(8.0f) + i3, i5);
        this.f39722r.lineTo((i * this.f39709e) + iM186890d + t100.m186890d(4.0f) + i3, i5 + t100.m186890d(4.0f));
        this.f39722r.close();
        canvas.drawPath(this.f39722r, paint);
    }

    /* JADX INFO: renamed from: c */
    public final String m61609c(int i) {
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
    public final void m61610d() {
        this.f39719o = new GestureDetector(this);
    }

    /* JADX INFO: renamed from: e */
    public final int m61611e(Canvas canvas) {
        if (this.f39724t == null) {
            this.f39724t = new Paint(1);
        }
        this.f39724t.setTextSize(t100.m186890d(10.0f));
        this.f39724t.setStyle(Paint.Style.FILL);
        this.f39724t.setColor(Color.parseColor("#ffffff"));
        String strM61609c = m61609c(0);
        float fMeasureText = this.f39724t.measureText(strM61609c);
        String strM61609c2 = m61609c(this.f39711g);
        float fMeasureText2 = this.f39724t.measureText(strM61609c2);
        if (fMeasureText <= fMeasureText2) {
            fMeasureText = fMeasureText2;
        }
        int height = getHeight() - f39703u;
        int i = f39704v;
        float f = ((height - i) / 2) + i;
        canvas.drawText(strM61609c, this.f39707c, f, this.f39724t);
        canvas.drawText(strM61609c2, (getWidth() - this.f39707c) - fMeasureText, f, this.f39724t);
        return ((int) fMeasureText) + (this.f39707c * 2);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (this.f39716l == null) {
            return false;
        }
        if (motionEvent.getAction() != 0 || (motionEvent.getX() >= this.f39717m.left - 10.0f && motionEvent.getX() <= this.f39717m.right + 10.0f && motionEvent.getY() >= this.f39717m.top - 10.0f && motionEvent.getY() <= this.f39717m.bottom + 10.0f && motionEvent.getX() >= this.f39716l.left - 10.0f && motionEvent.getX() <= this.f39716l.right + 10.0f && motionEvent.getY() >= this.f39716l.top - 10.0f && motionEvent.getY() <= this.f39716l.bottom + 10.0f)) {
            return (motionEvent.getAction() != 0 || (motionEvent.getX() >= this.f39716l.left - 10.0f && motionEvent.getX() <= this.f39716l.right + 10.0f && motionEvent.getY() >= this.f39716l.top - 10.0f && motionEvent.getY() <= this.f39716l.bottom + 10.0f)) && this.f39712h != 0;
        }
        return false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        super.onDraw(canvas);
        int iM61611e = m61611e(canvas);
        if (this.f39706b == null) {
            this.f39706b = new ArrayList<>();
            this.f39713i = (getWidth() - (iM61611e * 2)) / this.f39709e;
            int height = getHeight() - f39703u;
            int i4 = f39704v;
            int i5 = ((height - i4) / 2) + i4;
            int i6 = 0;
            int i7 = 0;
            while (i6 < this.f39713i) {
                int i8 = (this.f39709e * i7) + this.f39707c;
                int i9 = this.f39708d + i8;
                Integer[] numArr = this.f39705a;
                int length = i6 >= numArr.length ? i6 % numArr.length : i6;
                this.f39706b.add(new RectF(i8 + iM61611e, i5 - t100.m186890d(numArr[length].intValue() / 2), i9 + iM61611e, t100.m186890d(this.f39705a[length].intValue() / 2) + i5));
                i7++;
                i6++;
            }
        }
        if (this.f39710f == null) {
            Paint paint = new Paint(1);
            this.f39710f = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f39710f.setColor(Color.parseColor("#ffffff"));
        }
        int i10 = this.f39711g;
        if (i10 == 0 || (i3 = this.f39712h) == 0) {
            i = this.f39713i;
            i2 = 0;
        } else {
            int i11 = this.f39713i;
            int i12 = (int) ((i3 / i10) * i11);
            int i13 = i12 != 0 ? i12 : 1;
            int i14 = this.f39714j;
            i2 = (int) ((i14 / i10) * i11);
            if (i2 >= i11 - i13 || i14 + i3 >= i10) {
                i2 = i11 - i13;
            }
            i = i2 + i13;
            this.f39715k = i13 * this.f39709e;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int i15 = this.f39713i;
        if (i <= i15) {
            i15 = i;
        }
        for (int i16 = 0; i16 < this.f39706b.size(); i16++) {
            if (i16 < i2 || i16 >= i15) {
                this.f39710f.setColor(Color.parseColor("#ffffff"));
            } else {
                this.f39710f.setColor(getResources().getColor(e1c0.f88798n));
            }
            canvas.drawRoundRect(this.f39706b.get(i16), this.f39706b.get(i16).width(), this.f39706b.get(i16).width(), this.f39710f);
        }
        int i17 = i2;
        m61608b(canvas, i17, i15, iM61611e, this.f39710f);
        m61607a(canvas, i17, i15, iM61611e, this.f39710f);
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
            this.f39718n = getMeasuredWidth();
        }
        int i = this.f39718n;
        if (i != 0) {
            if (this.f39711g == 0) {
                this.f39711g = this.f39712h;
            }
            float f3 = this.f39714j;
            int i2 = this.f39711g;
            float f4 = f3 - ((f * i2) / i);
            if (f4 % 1.0f > 0.5d) {
                this.f39714j = ((int) f4) + 1;
            } else {
                this.f39714j = (int) f4;
            }
            int i3 = this.f39714j;
            int i4 = this.f39712h;
            if (i3 + i4 > i2) {
                this.f39714j = i2 - i4;
            }
            if (this.f39714j < 0) {
                this.f39714j = 0;
            }
            setStartTime(this.f39714j);
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
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && NullChecker.m81303a(this.f39720p)) {
            f30<Integer, Integer> f30Var = this.f39720p;
            Integer numValueOf = Integer.valueOf(this.f39714j);
            int i = this.f39714j;
            int i2 = this.f39712h;
            int i3 = i + i2;
            int i4 = this.f39711g;
            if (i3 <= i4) {
                i4 = i + i2;
            }
            f30Var.call(numValueOf, Integer.valueOf(i4));
        }
        return this.f39719o.onTouchEvent(motionEvent);
    }

    public void setListener(f30<Integer, Integer> f30Var) {
        this.f39720p = f30Var;
    }

    public void setMusicLength(int i) {
        this.f39711g = i;
    }

    public void setStartTime(int i) {
        this.f39714j = i;
        invalidate();
    }

    public void setVideoLength(int i) {
        this.f39712h = i;
    }

    public IVMusicRangeSeekView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39705a = new Integer[]{32, 44, 36, 56, 44, 18, 26, 56, 44, 70, 58, 38, 25, 46, 34, 42, 56, 44, 36, 48, 64, 40, 30, 38, 58, 30, 56, 36, 42, 58, 70, 44, 34, 50};
        this.f39707c = t100.m186890d(2.0f);
        int iM186890d = t100.m186890d(4.0f);
        this.f39708d = iM186890d;
        this.f39709e = this.f39707c + iM186890d;
        m61610d();
    }

    public IVMusicRangeSeekView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39705a = new Integer[]{32, 44, 36, 56, 44, 18, 26, 56, 44, 70, 58, 38, 25, 46, 34, 42, 56, 44, 36, 48, 64, 40, 30, 38, 58, 30, 56, 36, 42, 58, 70, 44, 34, 50};
        this.f39707c = t100.m186890d(2.0f);
        int iM186890d = t100.m186890d(4.0f);
        this.f39708d = iM186890d;
        this.f39709e = this.f39707c + iM186890d;
        m61610d();
    }
}
