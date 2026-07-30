package com.p051p1.mobile.putong.feed.newui.camera.widget;

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
import p153l.k9c0;
import p153l.qa00;
import p153l.z20;

/* JADX INFO: loaded from: classes13.dex */
public class IVMusicRangeSeekView extends View implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: u */
    public static final int f40551u = qa00.m175859d(22.0f);

    /* JADX INFO: renamed from: v */
    public static final int f40552v = qa00.m175859d(25.0f);

    /* JADX INFO: renamed from: a */
    public Integer[] f40553a;

    /* JADX INFO: renamed from: b */
    public ArrayList<RectF> f40554b;

    /* JADX INFO: renamed from: c */
    public int f40555c;

    /* JADX INFO: renamed from: d */
    public int f40556d;

    /* JADX INFO: renamed from: e */
    public int f40557e;

    /* JADX INFO: renamed from: f */
    public Paint f40558f;

    /* JADX INFO: renamed from: g */
    public int f40559g;

    /* JADX INFO: renamed from: h */
    public int f40560h;

    /* JADX INFO: renamed from: i */
    public int f40561i;

    /* JADX INFO: renamed from: j */
    public int f40562j;

    /* JADX INFO: renamed from: k */
    public int f40563k;

    /* JADX INFO: renamed from: l */
    public RectF f40564l;

    /* JADX INFO: renamed from: m */
    public RectF f40565m;

    /* JADX INFO: renamed from: n */
    public int f40566n;

    /* JADX INFO: renamed from: o */
    public GestureDetector f40567o;

    /* JADX INFO: renamed from: p */
    public z20<Integer, Integer> f40568p;

    /* JADX INFO: renamed from: q */
    public RectF f40569q;

    /* JADX INFO: renamed from: r */
    public Path f40570r;

    /* JADX INFO: renamed from: s */
    public RectF f40571s;

    /* JADX INFO: renamed from: t */
    public Paint f40572t;

    public IVMusicRangeSeekView(Context context) throws IllegalArgumentException {
        super(context);
        this.f40553a = new Integer[]{32, 44, 36, 56, 44, 18, 26, 56, 44, 70, 58, 38, 25, 46, 34, 42, 56, 44, 36, 48, 64, 40, 30, 38, 58, 30, 56, 36, 42, 58, 70, 44, 34, 50};
        this.f40555c = qa00.m175859d(2.0f);
        int iM175859d = qa00.m175859d(4.0f);
        this.f40556d = iM175859d;
        this.f40557e = this.f40555c + iM175859d;
        m62794d();
    }

    /* JADX INFO: renamed from: a */
    public final void m62791a(Canvas canvas, int i, int i2, int i3, Paint paint) {
        if (this.f40564l == null) {
            this.f40564l = new RectF();
        }
        if (this.f40565m == null) {
            this.f40565m = new RectF();
        }
        int i4 = (i * this.f40557e) + i3;
        this.f40564l.left = i4 - qa00.m175859d(24.0f);
        this.f40564l.top = (getHeight() - f40551u) - 2;
        this.f40564l.right = qa00.m175859d(24.0f) + i4;
        this.f40564l.bottom = getHeight() - 2;
        this.f40565m.left = i4 - qa00.m175859d(24.0f);
        RectF rectF = this.f40565m;
        rectF.top = 1.0f;
        rectF.right = (i2 * this.f40557e) + i3;
        rectF.bottom = getHeight() + 2;
        paint.setColor(getResources().getColor(k9c0.f124521n));
        RectF rectF2 = this.f40564l;
        float f = rectF2.bottom;
        float f2 = rectF2.top;
        canvas.drawRoundRect(rectF2, (f - f2) / 2.0f, (f - f2) / 2.0f, paint);
        if (this.f40570r == null) {
            this.f40570r = new Path();
        }
        this.f40570r.reset();
        this.f40570r.moveTo(i4, this.f40564l.top - qa00.m175859d(3.0f));
        this.f40570r.lineTo(i4 - qa00.m175859d(2.0f), this.f40564l.top);
        this.f40570r.lineTo(qa00.m175859d(2.0f) + i4, this.f40564l.top);
        this.f40570r.close();
        canvas.drawPath(this.f40570r, paint);
        paint.setColor(Color.parseColor("#33000000"));
        if (this.f40569q == null) {
            this.f40569q = new RectF();
        }
        this.f40569q.left = i4 - qa00.m175859d(7.0f);
        this.f40569q.top = getHeight() - ((this.f40564l.height() * 3.0f) / 4.0f);
        this.f40569q.right = i4 - qa00.m175859d(5.0f);
        this.f40569q.bottom = getHeight() - (this.f40564l.height() / 4.0f);
        canvas.drawRoundRect(this.f40569q, qa00.m175859d(1.0f), qa00.m175859d(1.0f), paint);
        this.f40569q.left = i4 - qa00.m175859d(1.0f);
        this.f40569q.right = qa00.m175859d(1.0f) + i4;
        canvas.drawRoundRect(this.f40569q, qa00.m175859d(1.0f), qa00.m175859d(1.0f), paint);
        this.f40569q.left = qa00.m175859d(5.0f) + i4;
        this.f40569q.right = i4 + qa00.m175859d(7.0f);
        canvas.drawRoundRect(this.f40569q, qa00.m175859d(1.0f), qa00.m175859d(1.0f), paint);
    }

    /* JADX INFO: renamed from: b */
    public final void m62792b(Canvas canvas, int i, int i2, int i3, Paint paint) {
        if (this.f40572t == null) {
            this.f40572t = new Paint(1);
        }
        this.f40572t.setTextSize(qa00.m175859d(12.0f));
        this.f40572t.setStyle(Paint.Style.FILL);
        this.f40572t.setColor(Color.parseColor("#ffffff"));
        String str = m62793c(this.f40562j) + "/" + m62793c(this.f40559g);
        float fMeasureText = this.f40572t.measureText(str);
        if (this.f40571s == null) {
            this.f40571s = new RectF();
        }
        int iM175859d = qa00.m175859d(5.0f);
        float f = iM175859d * 2;
        float f2 = (this.f40557e * i) + fMeasureText + f;
        float width = getWidth();
        RectF rectF = this.f40571s;
        if (f2 > width) {
            rectF.left = (getWidth() - fMeasureText) - f;
            this.f40571s.right = getWidth();
        } else {
            int i4 = this.f40557e;
            rectF.left = (i * i4) + i3;
            rectF.right = (i4 * i) + fMeasureText + f + i3;
        }
        RectF rectF2 = this.f40571s;
        rectF2.top = 0.0f;
        int i5 = f40552v;
        rectF2.bottom = i5;
        paint.setColor(Color.parseColor("#b3000000"));
        canvas.drawRoundRect(this.f40571s, qa00.m175859d(2.0f), qa00.m175859d(2.0f), paint);
        canvas.drawText(str, this.f40571s.left + iM175859d, (i5 * 2) / 3, this.f40572t);
        if (this.f40570r == null) {
            this.f40570r = new Path();
        }
        this.f40570r.reset();
        this.f40570r.moveTo((this.f40557e * i) + iM175859d + i3, i5);
        this.f40570r.lineTo((this.f40557e * i) + iM175859d + qa00.m175859d(8.0f) + i3, i5);
        this.f40570r.lineTo((i * this.f40557e) + iM175859d + qa00.m175859d(4.0f) + i3, i5 + qa00.m175859d(4.0f));
        this.f40570r.close();
        canvas.drawPath(this.f40570r, paint);
    }

    /* JADX INFO: renamed from: c */
    public final String m62793c(int i) {
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
    public final void m62794d() {
        this.f40567o = new GestureDetector(this);
    }

    /* JADX INFO: renamed from: e */
    public final int m62795e(Canvas canvas) {
        if (this.f40572t == null) {
            this.f40572t = new Paint(1);
        }
        this.f40572t.setTextSize(qa00.m175859d(10.0f));
        this.f40572t.setStyle(Paint.Style.FILL);
        this.f40572t.setColor(Color.parseColor("#ffffff"));
        String strM62793c = m62793c(0);
        float fMeasureText = this.f40572t.measureText(strM62793c);
        String strM62793c2 = m62793c(this.f40559g);
        float fMeasureText2 = this.f40572t.measureText(strM62793c2);
        if (fMeasureText <= fMeasureText2) {
            fMeasureText = fMeasureText2;
        }
        int height = getHeight() - f40551u;
        int i = f40552v;
        float f = ((height - i) / 2) + i;
        canvas.drawText(strM62793c, this.f40555c, f, this.f40572t);
        canvas.drawText(strM62793c2, (getWidth() - this.f40555c) - fMeasureText, f, this.f40572t);
        return ((int) fMeasureText) + (this.f40555c * 2);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (this.f40564l == null) {
            return false;
        }
        if (motionEvent.getAction() != 0 || (motionEvent.getX() >= this.f40565m.left - 10.0f && motionEvent.getX() <= this.f40565m.right + 10.0f && motionEvent.getY() >= this.f40565m.top - 10.0f && motionEvent.getY() <= this.f40565m.bottom + 10.0f && motionEvent.getX() >= this.f40564l.left - 10.0f && motionEvent.getX() <= this.f40564l.right + 10.0f && motionEvent.getY() >= this.f40564l.top - 10.0f && motionEvent.getY() <= this.f40564l.bottom + 10.0f)) {
            return (motionEvent.getAction() != 0 || (motionEvent.getX() >= this.f40564l.left - 10.0f && motionEvent.getX() <= this.f40564l.right + 10.0f && motionEvent.getY() >= this.f40564l.top - 10.0f && motionEvent.getY() <= this.f40564l.bottom + 10.0f)) && this.f40560h != 0;
        }
        return false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        super.onDraw(canvas);
        int iM62795e = m62795e(canvas);
        if (this.f40554b == null) {
            this.f40554b = new ArrayList<>();
            this.f40561i = (getWidth() - (iM62795e * 2)) / this.f40557e;
            int height = getHeight() - f40551u;
            int i4 = f40552v;
            int i5 = ((height - i4) / 2) + i4;
            int i6 = 0;
            int i7 = 0;
            while (i6 < this.f40561i) {
                int i8 = (this.f40557e * i7) + this.f40555c;
                int i9 = this.f40556d + i8;
                Integer[] numArr = this.f40553a;
                int length = i6 >= numArr.length ? i6 % numArr.length : i6;
                this.f40554b.add(new RectF(i8 + iM62795e, i5 - qa00.m175859d(numArr[length].intValue() / 2), i9 + iM62795e, qa00.m175859d(this.f40553a[length].intValue() / 2) + i5));
                i7++;
                i6++;
            }
        }
        if (this.f40558f == null) {
            Paint paint = new Paint(1);
            this.f40558f = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f40558f.setColor(Color.parseColor("#ffffff"));
        }
        int i10 = this.f40559g;
        if (i10 == 0 || (i3 = this.f40560h) == 0) {
            i = this.f40561i;
            i2 = 0;
        } else {
            int i11 = this.f40561i;
            int i12 = (int) ((i3 / i10) * i11);
            int i13 = i12 != 0 ? i12 : 1;
            int i14 = this.f40562j;
            i2 = (int) ((i14 / i10) * i11);
            if (i2 >= i11 - i13 || i14 + i3 >= i10) {
                i2 = i11 - i13;
            }
            i = i2 + i13;
            this.f40563k = i13 * this.f40557e;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int i15 = this.f40561i;
        if (i <= i15) {
            i15 = i;
        }
        for (int i16 = 0; i16 < this.f40554b.size(); i16++) {
            if (i16 < i2 || i16 >= i15) {
                this.f40558f.setColor(Color.parseColor("#ffffff"));
            } else {
                this.f40558f.setColor(getResources().getColor(k9c0.f124521n));
            }
            canvas.drawRoundRect(this.f40554b.get(i16), this.f40554b.get(i16).width(), this.f40554b.get(i16).width(), this.f40558f);
        }
        int i17 = i2;
        m62792b(canvas, i17, i15, iM62795e, this.f40558f);
        m62791a(canvas, i17, i15, iM62795e, this.f40558f);
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
            this.f40566n = getMeasuredWidth();
        }
        int i = this.f40566n;
        if (i != 0) {
            if (this.f40559g == 0) {
                this.f40559g = this.f40560h;
            }
            float f3 = this.f40562j;
            int i2 = this.f40559g;
            float f4 = f3 - ((f * i2) / i);
            if (f4 % 1.0f > 0.5d) {
                this.f40562j = ((int) f4) + 1;
            } else {
                this.f40562j = (int) f4;
            }
            int i3 = this.f40562j;
            int i4 = this.f40560h;
            if (i3 + i4 > i2) {
                this.f40562j = i2 - i4;
            }
            if (this.f40562j < 0) {
                this.f40562j = 0;
            }
            setStartTime(this.f40562j);
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
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && NullChecker.m82486a(this.f40568p)) {
            z20<Integer, Integer> z20Var = this.f40568p;
            Integer numValueOf = Integer.valueOf(this.f40562j);
            int i = this.f40562j;
            int i2 = this.f40560h;
            int i3 = i + i2;
            int i4 = this.f40559g;
            if (i3 <= i4) {
                i4 = i + i2;
            }
            z20Var.call(numValueOf, Integer.valueOf(i4));
        }
        return this.f40567o.onTouchEvent(motionEvent);
    }

    public void setListener(z20<Integer, Integer> z20Var) {
        this.f40568p = z20Var;
    }

    public void setMusicLength(int i) {
        this.f40559g = i;
    }

    public void setStartTime(int i) {
        this.f40562j = i;
        invalidate();
    }

    public void setVideoLength(int i) {
        this.f40560h = i;
    }

    public IVMusicRangeSeekView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40553a = new Integer[]{32, 44, 36, 56, 44, 18, 26, 56, 44, 70, 58, 38, 25, 46, 34, 42, 56, 44, 36, 48, 64, 40, 30, 38, 58, 30, 56, 36, 42, 58, 70, 44, 34, 50};
        this.f40555c = qa00.m175859d(2.0f);
        int iM175859d = qa00.m175859d(4.0f);
        this.f40556d = iM175859d;
        this.f40557e = this.f40555c + iM175859d;
        m62794d();
    }

    public IVMusicRangeSeekView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40553a = new Integer[]{32, 44, 36, 56, 44, 18, 26, 56, 44, 70, 58, 38, 25, 46, 34, 42, 56, 44, 36, 48, 64, 40, 30, 38, 58, 30, 56, 36, 42, 58, 70, 44, 34, 50};
        this.f40555c = qa00.m175859d(2.0f);
        int iM175859d = qa00.m175859d(4.0f);
        this.f40556d = iM175859d;
        this.f40557e = this.f40555c + iM175859d;
        m62794d();
    }
}
