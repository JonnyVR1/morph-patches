package com.p000p1.mobile.putong.feed.newui.camera.widget;

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
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.f30;
import l.t100;
import p007l.e1c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MusicRangeSeekView extends View implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: t */
    public static final int f1241t = t100.d(22.0f);

    /* JADX INFO: renamed from: u */
    public static final int f1242u = t100.d(25.0f);

    /* JADX INFO: renamed from: a */
    public Integer[] f1243a;

    /* JADX INFO: renamed from: b */
    public ArrayList<RectF> f1244b;

    /* JADX INFO: renamed from: c */
    public int f1245c;

    /* JADX INFO: renamed from: d */
    public int f1246d;

    /* JADX INFO: renamed from: e */
    public int f1247e;

    /* JADX INFO: renamed from: f */
    public Paint f1248f;

    /* JADX INFO: renamed from: g */
    public int f1249g;

    /* JADX INFO: renamed from: h */
    public int f1250h;

    /* JADX INFO: renamed from: i */
    public int f1251i;

    /* JADX INFO: renamed from: j */
    public int f1252j;

    /* JADX INFO: renamed from: k */
    public int f1253k;

    /* JADX INFO: renamed from: l */
    public RectF f1254l;

    /* JADX INFO: renamed from: m */
    public int f1255m;

    /* JADX INFO: renamed from: n */
    public GestureDetector f1256n;

    /* JADX INFO: renamed from: o */
    public f30<Integer, Integer> f1257o;

    /* JADX INFO: renamed from: p */
    public RectF f1258p;

    /* JADX INFO: renamed from: q */
    public Path f1259q;

    /* JADX INFO: renamed from: r */
    public RectF f1260r;

    /* JADX INFO: renamed from: s */
    public Paint f1261s;

    public MusicRangeSeekView(Context context) throws IllegalArgumentException {
        super(context);
        this.f1243a = new Integer[]{32, 44, 36, 56, 44, 18, 26, 56, 44, 70, 58, 38, 25, 46, 34, 42, 56, 44, 36, 48, 64, 40, 30, 38, 58, 30, 56, 36, 42, 58, 70, 44, 34, 50};
        this.f1245c = t100.d(2.0f);
        int iD = t100.d(4.0f);
        this.f1246d = iD;
        this.f1247e = this.f1245c + iD;
        m2647d();
    }

    /* JADX INFO: renamed from: a */
    public final void m2644a(Canvas canvas, int i, int i2, int i3, Paint paint) {
        if (this.f1254l == null) {
            this.f1254l = new RectF();
        }
        int i4 = (i * this.f1247e) + i3;
        this.f1254l.left = i4 - t100.d(24.0f);
        this.f1254l.top = (getHeight() - f1241t) - 2;
        this.f1254l.right = t100.d(24.0f) + i4;
        this.f1254l.bottom = getHeight() - 2;
        paint.setColor(getResources().getColor(e1c0.f7154n));
        RectF rectF = this.f1254l;
        float f = rectF.bottom;
        float f2 = rectF.top;
        canvas.drawRoundRect(rectF, (f - f2) / 2.0f, (f - f2) / 2.0f, paint);
        if (this.f1259q == null) {
            this.f1259q = new Path();
        }
        this.f1259q.reset();
        this.f1259q.moveTo(i4, this.f1254l.top - t100.d(3.0f));
        this.f1259q.lineTo(i4 - t100.d(2.0f), this.f1254l.top);
        this.f1259q.lineTo(t100.d(2.0f) + i4, this.f1254l.top);
        this.f1259q.close();
        canvas.drawPath(this.f1259q, paint);
        paint.setColor(Color.parseColor("#33000000"));
        if (this.f1258p == null) {
            this.f1258p = new RectF();
        }
        this.f1258p.left = i4 - t100.d(7.0f);
        this.f1258p.top = getHeight() - ((this.f1254l.height() * 3.0f) / 4.0f);
        this.f1258p.right = i4 - t100.d(5.0f);
        this.f1258p.bottom = getHeight() - (this.f1254l.height() / 4.0f);
        canvas.drawRoundRect(this.f1258p, t100.d(1.0f), t100.d(1.0f), paint);
        this.f1258p.left = i4 - t100.d(1.0f);
        this.f1258p.right = t100.d(1.0f) + i4;
        canvas.drawRoundRect(this.f1258p, t100.d(1.0f), t100.d(1.0f), paint);
        this.f1258p.left = t100.d(5.0f) + i4;
        this.f1258p.right = i4 + t100.d(7.0f);
        canvas.drawRoundRect(this.f1258p, t100.d(1.0f), t100.d(1.0f), paint);
    }

    /* JADX INFO: renamed from: b */
    public final void m2645b(Canvas canvas, int i, int i2, int i3, Paint paint) {
        if (this.f1261s == null) {
            this.f1261s = new Paint(1);
        }
        this.f1261s.setTextSize(t100.d(12.0f));
        this.f1261s.setStyle(Paint.Style.STROKE);
        this.f1261s.setColor(Color.parseColor("#ffffff"));
        String str = String.format(FeedModule.f313a.getString(R$string.f609t0), m2646c(this.f1252j));
        float fMeasureText = this.f1261s.measureText(str);
        if (this.f1260r == null) {
            this.f1260r = new RectF();
        }
        int iD = t100.d(5.0f);
        float f = iD * 2;
        float f2 = (this.f1247e * i) + fMeasureText + f;
        float width = getWidth();
        RectF rectF = this.f1260r;
        if (f2 > width) {
            rectF.left = (getWidth() - fMeasureText) - f;
            this.f1260r.right = getWidth();
        } else {
            int i4 = this.f1247e;
            rectF.left = (i * i4) + i3;
            rectF.right = (i4 * i) + fMeasureText + f + i3;
        }
        RectF rectF2 = this.f1260r;
        rectF2.top = 0.0f;
        int i5 = f1242u;
        rectF2.bottom = i5;
        paint.setColor(Color.parseColor("#b3000000"));
        canvas.drawRoundRect(this.f1260r, t100.d(2.0f), t100.d(2.0f), paint);
        canvas.drawText(str, this.f1260r.left + iD, (i5 * 2) / 3, this.f1261s);
        if (this.f1259q == null) {
            this.f1259q = new Path();
        }
        this.f1259q.reset();
        this.f1259q.moveTo((this.f1247e * i) + iD + i3, i5);
        this.f1259q.lineTo((this.f1247e * i) + iD + t100.d(8.0f) + i3, i5);
        this.f1259q.lineTo((i * this.f1247e) + iD + t100.d(4.0f) + i3, i5 + t100.d(4.0f));
        this.f1259q.close();
        canvas.drawPath(this.f1259q, paint);
    }

    /* JADX INFO: renamed from: c */
    public final String m2646c(int i) {
        StringBuilder sb;
        String str;
        int i2 = i / MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO;
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
    public final void m2647d() {
        this.f1256n = new GestureDetector(this);
    }

    /* JADX INFO: renamed from: e */
    public final int m2648e(Canvas canvas) {
        if (this.f1261s == null) {
            this.f1261s = new Paint(1);
        }
        this.f1261s.setTextSize(t100.d(10.0f));
        this.f1261s.setStyle(Paint.Style.STROKE);
        this.f1261s.setColor(Color.parseColor("#ffffff"));
        String strM2646c = m2646c(0);
        float fMeasureText = this.f1261s.measureText(strM2646c);
        String strM2646c2 = m2646c(this.f1249g);
        float fMeasureText2 = this.f1261s.measureText(strM2646c2);
        if (fMeasureText <= fMeasureText2) {
            fMeasureText = fMeasureText2;
        }
        int height = getHeight() - f1241t;
        int i = f1242u;
        float f = ((height - i) / 2) + i;
        canvas.drawText(strM2646c, this.f1245c, f, this.f1261s);
        canvas.drawText(strM2646c2, (getWidth() - this.f1245c) - fMeasureText, f, this.f1261s);
        return ((int) fMeasureText) + (this.f1245c * 2);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (this.f1254l == null) {
            return false;
        }
        return (motionEvent.getAction() != 0 || (motionEvent.getX() >= this.f1254l.left - 10.0f && motionEvent.getX() <= this.f1254l.right + 10.0f && motionEvent.getY() >= this.f1254l.top - 10.0f && motionEvent.getY() <= this.f1254l.bottom + 10.0f)) && this.f1250h != 0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        super.onDraw(canvas);
        int iM2648e = m2648e(canvas);
        if (this.f1244b == null) {
            this.f1244b = new ArrayList<>();
            this.f1251i = (getWidth() - (iM2648e * 2)) / this.f1247e;
            int height = getHeight() - f1241t;
            int i4 = f1242u;
            int i5 = ((height - i4) / 2) + i4;
            int i6 = 0;
            int i7 = 0;
            while (i6 < this.f1251i) {
                int i8 = (this.f1247e * i7) + this.f1245c;
                int i9 = this.f1246d + i8;
                Integer[] numArr = this.f1243a;
                int length = i6 >= numArr.length ? i6 % numArr.length : i6;
                this.f1244b.add(new RectF(i8 + iM2648e, i5 - t100.d(numArr[length].intValue() / 2), i9 + iM2648e, t100.d(this.f1243a[length].intValue() / 2) + i5));
                i7++;
                i6++;
            }
        }
        if (this.f1248f == null) {
            Paint paint = new Paint(1);
            this.f1248f = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f1248f.setColor(Color.parseColor("#ffffff"));
        }
        int i10 = this.f1249g;
        if (i10 == 0 || (i3 = this.f1250h) == 0) {
            i = this.f1251i;
            i2 = 0;
        } else {
            int i11 = this.f1251i;
            int i12 = (int) ((i3 / i10) * i11);
            int i13 = i12 != 0 ? i12 : 1;
            int i14 = this.f1252j;
            i2 = (int) ((i14 / i10) * i11);
            if (i2 >= i11 - i13 || i14 + i3 >= i10) {
                i2 = i11 - i13;
            }
            i = i2 + i13;
            this.f1253k = i13 * this.f1247e;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int i15 = this.f1251i;
        if (i <= i15) {
            i15 = i;
        }
        for (int i16 = 0; i16 < this.f1244b.size(); i16++) {
            if (i16 < i2 || i16 >= i15) {
                this.f1248f.setColor(Color.parseColor("#ffffff"));
            } else {
                this.f1248f.setColor(getResources().getColor(e1c0.f7154n));
            }
            canvas.drawRoundRect(this.f1244b.get(i16), this.f1244b.get(i16).width() / 2.0f, this.f1244b.get(i16).width() / 2.0f, this.f1248f);
        }
        int i17 = i2;
        m2645b(canvas, i17, i15, iM2648e, this.f1248f);
        m2644a(canvas, i17, i15, iM2648e, this.f1248f);
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
            this.f1255m = getMeasuredWidth();
        }
        int i = this.f1255m;
        if (i != 0) {
            if (this.f1249g == 0) {
                this.f1249g = this.f1250h;
            }
            float f3 = this.f1252j;
            int i2 = this.f1249g;
            float f4 = f3 - ((f * i2) / i);
            if (f4 % 1.0f > 0.5d) {
                this.f1252j = ((int) f4) + 1;
            } else {
                this.f1252j = (int) f4;
            }
            int i3 = this.f1252j;
            int i4 = this.f1250h;
            if (i3 + i4 > i2) {
                this.f1252j = i2 - i4;
            }
            if (this.f1252j < 0) {
                this.f1252j = 0;
            }
            setStartTime(this.f1252j);
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
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && NullChecker.a(this.f1257o)) {
            f30<Integer, Integer> f30Var = this.f1257o;
            Integer numValueOf = Integer.valueOf(this.f1252j);
            int i = this.f1252j;
            int i2 = this.f1250h;
            int i3 = i + i2;
            int i4 = this.f1249g;
            if (i3 <= i4) {
                i4 = i + i2;
            }
            f30Var.call(numValueOf, Integer.valueOf(i4));
        }
        return this.f1256n.onTouchEvent(motionEvent);
    }

    public void setListener(f30<Integer, Integer> f30Var) {
        this.f1257o = f30Var;
    }

    public void setMusicLength(int i) {
        this.f1249g = i;
    }

    public void setStartTime(int i) {
        this.f1252j = i;
        invalidate();
    }

    public void setVideoLength(int i) {
        this.f1250h = i;
    }

    public MusicRangeSeekView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1243a = new Integer[]{32, 44, 36, 56, 44, 18, 26, 56, 44, 70, 58, 38, 25, 46, 34, 42, 56, 44, 36, 48, 64, 40, 30, 38, 58, 30, 56, 36, 42, 58, 70, 44, 34, 50};
        this.f1245c = t100.d(2.0f);
        int iD = t100.d(4.0f);
        this.f1246d = iD;
        this.f1247e = this.f1245c + iD;
        m2647d();
    }

    public MusicRangeSeekView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1243a = new Integer[]{32, 44, 36, 56, 44, 18, 26, 56, 44, 70, 58, 38, 25, 46, 34, 42, 56, 44, 36, 48, 64, 40, 30, 38, 58, 30, 56, 36, 42, 58, 70, 44, 34, 50};
        this.f1245c = t100.d(2.0f);
        int iD = t100.d(4.0f);
        this.f1246d = iD;
        this.f1247e = this.f1245c + iD;
        m2647d();
    }
}
