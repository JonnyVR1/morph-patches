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
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p153l.k9c0;
import p153l.qa00;
import p153l.z20;

/* JADX INFO: loaded from: classes13.dex */
public class MusicRangeSeekView extends View implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: t */
    public static final int f40628t = qa00.m175859d(22.0f);

    /* JADX INFO: renamed from: u */
    public static final int f40629u = qa00.m175859d(25.0f);

    /* JADX INFO: renamed from: a */
    public Integer[] f40630a;

    /* JADX INFO: renamed from: b */
    public ArrayList<RectF> f40631b;

    /* JADX INFO: renamed from: c */
    public int f40632c;

    /* JADX INFO: renamed from: d */
    public int f40633d;

    /* JADX INFO: renamed from: e */
    public int f40634e;

    /* JADX INFO: renamed from: f */
    public Paint f40635f;

    /* JADX INFO: renamed from: g */
    public int f40636g;

    /* JADX INFO: renamed from: h */
    public int f40637h;

    /* JADX INFO: renamed from: i */
    public int f40638i;

    /* JADX INFO: renamed from: j */
    public int f40639j;

    /* JADX INFO: renamed from: k */
    public int f40640k;

    /* JADX INFO: renamed from: l */
    public RectF f40641l;

    /* JADX INFO: renamed from: m */
    public int f40642m;

    /* JADX INFO: renamed from: n */
    public GestureDetector f40643n;

    /* JADX INFO: renamed from: o */
    public z20<Integer, Integer> f40644o;

    /* JADX INFO: renamed from: p */
    public RectF f40645p;

    /* JADX INFO: renamed from: q */
    public Path f40646q;

    /* JADX INFO: renamed from: r */
    public RectF f40647r;

    /* JADX INFO: renamed from: s */
    public Paint f40648s;

    public MusicRangeSeekView(Context context) throws IllegalArgumentException {
        super(context);
        this.f40630a = new Integer[]{32, 44, 36, 56, 44, 18, 26, 56, 44, 70, 58, 38, 25, 46, 34, 42, 56, 44, 36, 48, 64, 40, 30, 38, 58, 30, 56, 36, 42, 58, 70, 44, 34, 50};
        this.f40632c = qa00.m175859d(2.0f);
        int iM175859d = qa00.m175859d(4.0f);
        this.f40633d = iM175859d;
        this.f40634e = this.f40632c + iM175859d;
        m62879d();
    }

    /* JADX INFO: renamed from: a */
    public final void m62876a(Canvas canvas, int i, int i2, int i3, Paint paint) {
        if (this.f40641l == null) {
            this.f40641l = new RectF();
        }
        int i4 = (i * this.f40634e) + i3;
        this.f40641l.left = i4 - qa00.m175859d(24.0f);
        this.f40641l.top = (getHeight() - f40628t) - 2;
        this.f40641l.right = qa00.m175859d(24.0f) + i4;
        this.f40641l.bottom = getHeight() - 2;
        paint.setColor(getResources().getColor(k9c0.f124521n));
        RectF rectF = this.f40641l;
        float f = rectF.bottom;
        float f2 = rectF.top;
        canvas.drawRoundRect(rectF, (f - f2) / 2.0f, (f - f2) / 2.0f, paint);
        if (this.f40646q == null) {
            this.f40646q = new Path();
        }
        this.f40646q.reset();
        this.f40646q.moveTo(i4, this.f40641l.top - qa00.m175859d(3.0f));
        this.f40646q.lineTo(i4 - qa00.m175859d(2.0f), this.f40641l.top);
        this.f40646q.lineTo(qa00.m175859d(2.0f) + i4, this.f40641l.top);
        this.f40646q.close();
        canvas.drawPath(this.f40646q, paint);
        paint.setColor(Color.parseColor("#33000000"));
        if (this.f40645p == null) {
            this.f40645p = new RectF();
        }
        this.f40645p.left = i4 - qa00.m175859d(7.0f);
        this.f40645p.top = getHeight() - ((this.f40641l.height() * 3.0f) / 4.0f);
        this.f40645p.right = i4 - qa00.m175859d(5.0f);
        this.f40645p.bottom = getHeight() - (this.f40641l.height() / 4.0f);
        canvas.drawRoundRect(this.f40645p, qa00.m175859d(1.0f), qa00.m175859d(1.0f), paint);
        this.f40645p.left = i4 - qa00.m175859d(1.0f);
        this.f40645p.right = qa00.m175859d(1.0f) + i4;
        canvas.drawRoundRect(this.f40645p, qa00.m175859d(1.0f), qa00.m175859d(1.0f), paint);
        this.f40645p.left = qa00.m175859d(5.0f) + i4;
        this.f40645p.right = i4 + qa00.m175859d(7.0f);
        canvas.drawRoundRect(this.f40645p, qa00.m175859d(1.0f), qa00.m175859d(1.0f), paint);
    }

    /* JADX INFO: renamed from: b */
    public final void m62877b(Canvas canvas, int i, int i2, int i3, Paint paint) {
        if (this.f40648s == null) {
            this.f40648s = new Paint(1);
        }
        this.f40648s.setTextSize(qa00.m175859d(12.0f));
        this.f40648s.setStyle(Paint.Style.STROKE);
        this.f40648s.setColor(Color.parseColor("#ffffff"));
        String str = String.format(FeedModule.f39700a.getString(R$string.f39996t0), m62878c(this.f40639j));
        float fMeasureText = this.f40648s.measureText(str);
        if (this.f40647r == null) {
            this.f40647r = new RectF();
        }
        int iM175859d = qa00.m175859d(5.0f);
        float f = iM175859d * 2;
        float f2 = (this.f40634e * i) + fMeasureText + f;
        float width = getWidth();
        RectF rectF = this.f40647r;
        if (f2 > width) {
            rectF.left = (getWidth() - fMeasureText) - f;
            this.f40647r.right = getWidth();
        } else {
            int i4 = this.f40634e;
            rectF.left = (i * i4) + i3;
            rectF.right = (i4 * i) + fMeasureText + f + i3;
        }
        RectF rectF2 = this.f40647r;
        rectF2.top = 0.0f;
        int i5 = f40629u;
        rectF2.bottom = i5;
        paint.setColor(Color.parseColor("#b3000000"));
        canvas.drawRoundRect(this.f40647r, qa00.m175859d(2.0f), qa00.m175859d(2.0f), paint);
        canvas.drawText(str, this.f40647r.left + iM175859d, (i5 * 2) / 3, this.f40648s);
        if (this.f40646q == null) {
            this.f40646q = new Path();
        }
        this.f40646q.reset();
        this.f40646q.moveTo((this.f40634e * i) + iM175859d + i3, i5);
        this.f40646q.lineTo((this.f40634e * i) + iM175859d + qa00.m175859d(8.0f) + i3, i5);
        this.f40646q.lineTo((i * this.f40634e) + iM175859d + qa00.m175859d(4.0f) + i3, i5 + qa00.m175859d(4.0f));
        this.f40646q.close();
        canvas.drawPath(this.f40646q, paint);
    }

    /* JADX INFO: renamed from: c */
    public final String m62878c(int i) {
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
    public final void m62879d() {
        this.f40643n = new GestureDetector(this);
    }

    /* JADX INFO: renamed from: e */
    public final int m62880e(Canvas canvas) {
        if (this.f40648s == null) {
            this.f40648s = new Paint(1);
        }
        this.f40648s.setTextSize(qa00.m175859d(10.0f));
        this.f40648s.setStyle(Paint.Style.STROKE);
        this.f40648s.setColor(Color.parseColor("#ffffff"));
        String strM62878c = m62878c(0);
        float fMeasureText = this.f40648s.measureText(strM62878c);
        String strM62878c2 = m62878c(this.f40636g);
        float fMeasureText2 = this.f40648s.measureText(strM62878c2);
        if (fMeasureText <= fMeasureText2) {
            fMeasureText = fMeasureText2;
        }
        int height = getHeight() - f40628t;
        int i = f40629u;
        float f = ((height - i) / 2) + i;
        canvas.drawText(strM62878c, this.f40632c, f, this.f40648s);
        canvas.drawText(strM62878c2, (getWidth() - this.f40632c) - fMeasureText, f, this.f40648s);
        return ((int) fMeasureText) + (this.f40632c * 2);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (this.f40641l == null) {
            return false;
        }
        return (motionEvent.getAction() != 0 || (motionEvent.getX() >= this.f40641l.left - 10.0f && motionEvent.getX() <= this.f40641l.right + 10.0f && motionEvent.getY() >= this.f40641l.top - 10.0f && motionEvent.getY() <= this.f40641l.bottom + 10.0f)) && this.f40637h != 0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        super.onDraw(canvas);
        int iM62880e = m62880e(canvas);
        if (this.f40631b == null) {
            this.f40631b = new ArrayList<>();
            this.f40638i = (getWidth() - (iM62880e * 2)) / this.f40634e;
            int height = getHeight() - f40628t;
            int i4 = f40629u;
            int i5 = ((height - i4) / 2) + i4;
            int i6 = 0;
            int i7 = 0;
            while (i6 < this.f40638i) {
                int i8 = (this.f40634e * i7) + this.f40632c;
                int i9 = this.f40633d + i8;
                Integer[] numArr = this.f40630a;
                int length = i6 >= numArr.length ? i6 % numArr.length : i6;
                this.f40631b.add(new RectF(i8 + iM62880e, i5 - qa00.m175859d(numArr[length].intValue() / 2), i9 + iM62880e, qa00.m175859d(this.f40630a[length].intValue() / 2) + i5));
                i7++;
                i6++;
            }
        }
        if (this.f40635f == null) {
            Paint paint = new Paint(1);
            this.f40635f = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f40635f.setColor(Color.parseColor("#ffffff"));
        }
        int i10 = this.f40636g;
        if (i10 == 0 || (i3 = this.f40637h) == 0) {
            i = this.f40638i;
            i2 = 0;
        } else {
            int i11 = this.f40638i;
            int i12 = (int) ((i3 / i10) * i11);
            int i13 = i12 != 0 ? i12 : 1;
            int i14 = this.f40639j;
            i2 = (int) ((i14 / i10) * i11);
            if (i2 >= i11 - i13 || i14 + i3 >= i10) {
                i2 = i11 - i13;
            }
            i = i2 + i13;
            this.f40640k = i13 * this.f40634e;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int i15 = this.f40638i;
        if (i <= i15) {
            i15 = i;
        }
        for (int i16 = 0; i16 < this.f40631b.size(); i16++) {
            if (i16 < i2 || i16 >= i15) {
                this.f40635f.setColor(Color.parseColor("#ffffff"));
            } else {
                this.f40635f.setColor(getResources().getColor(k9c0.f124521n));
            }
            canvas.drawRoundRect(this.f40631b.get(i16), this.f40631b.get(i16).width() / 2.0f, this.f40631b.get(i16).width() / 2.0f, this.f40635f);
        }
        int i17 = i2;
        m62877b(canvas, i17, i15, iM62880e, this.f40635f);
        m62876a(canvas, i17, i15, iM62880e, this.f40635f);
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
            this.f40642m = getMeasuredWidth();
        }
        int i = this.f40642m;
        if (i != 0) {
            if (this.f40636g == 0) {
                this.f40636g = this.f40637h;
            }
            float f3 = this.f40639j;
            int i2 = this.f40636g;
            float f4 = f3 - ((f * i2) / i);
            if (f4 % 1.0f > 0.5d) {
                this.f40639j = ((int) f4) + 1;
            } else {
                this.f40639j = (int) f4;
            }
            int i3 = this.f40639j;
            int i4 = this.f40637h;
            if (i3 + i4 > i2) {
                this.f40639j = i2 - i4;
            }
            if (this.f40639j < 0) {
                this.f40639j = 0;
            }
            setStartTime(this.f40639j);
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
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && NullChecker.m82486a(this.f40644o)) {
            z20<Integer, Integer> z20Var = this.f40644o;
            Integer numValueOf = Integer.valueOf(this.f40639j);
            int i = this.f40639j;
            int i2 = this.f40637h;
            int i3 = i + i2;
            int i4 = this.f40636g;
            if (i3 <= i4) {
                i4 = i + i2;
            }
            z20Var.call(numValueOf, Integer.valueOf(i4));
        }
        return this.f40643n.onTouchEvent(motionEvent);
    }

    public void setListener(z20<Integer, Integer> z20Var) {
        this.f40644o = z20Var;
    }

    public void setMusicLength(int i) {
        this.f40636g = i;
    }

    public void setStartTime(int i) {
        this.f40639j = i;
        invalidate();
    }

    public void setVideoLength(int i) {
        this.f40637h = i;
    }

    public MusicRangeSeekView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40630a = new Integer[]{32, 44, 36, 56, 44, 18, 26, 56, 44, 70, 58, 38, 25, 46, 34, 42, 56, 44, 36, 48, 64, 40, 30, 38, 58, 30, 56, 36, 42, 58, 70, 44, 34, 50};
        this.f40632c = qa00.m175859d(2.0f);
        int iM175859d = qa00.m175859d(4.0f);
        this.f40633d = iM175859d;
        this.f40634e = this.f40632c + iM175859d;
        m62879d();
    }

    public MusicRangeSeekView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40630a = new Integer[]{32, 44, 36, 56, 44, 18, 26, 56, 44, 70, 58, 38, 25, 46, 34, 42, 56, 44, 36, 48, 64, 40, 30, 38, 58, 30, 56, 36, 42, 58, 70, 44, 34, 50};
        this.f40632c = qa00.m175859d(2.0f);
        int iM175859d = qa00.m175859d(4.0f);
        this.f40633d = iM175859d;
        this.f40634e = this.f40632c + iM175859d;
        m62879d();
    }
}
