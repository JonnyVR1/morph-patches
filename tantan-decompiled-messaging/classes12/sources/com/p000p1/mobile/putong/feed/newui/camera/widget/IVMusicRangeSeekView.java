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
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.f30;
import l.t100;
import p007l.e1c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class IVMusicRangeSeekView extends View implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: u */
    public static final int f1164u = t100.d(22.0f);

    /* JADX INFO: renamed from: v */
    public static final int f1165v = t100.d(25.0f);

    /* JADX INFO: renamed from: a */
    public Integer[] f1166a;

    /* JADX INFO: renamed from: b */
    public ArrayList<RectF> f1167b;

    /* JADX INFO: renamed from: c */
    public int f1168c;

    /* JADX INFO: renamed from: d */
    public int f1169d;

    /* JADX INFO: renamed from: e */
    public int f1170e;

    /* JADX INFO: renamed from: f */
    public Paint f1171f;

    /* JADX INFO: renamed from: g */
    public int f1172g;

    /* JADX INFO: renamed from: h */
    public int f1173h;

    /* JADX INFO: renamed from: i */
    public int f1174i;

    /* JADX INFO: renamed from: j */
    public int f1175j;

    /* JADX INFO: renamed from: k */
    public int f1176k;

    /* JADX INFO: renamed from: l */
    public RectF f1177l;

    /* JADX INFO: renamed from: m */
    public RectF f1178m;

    /* JADX INFO: renamed from: n */
    public int f1179n;

    /* JADX INFO: renamed from: o */
    public GestureDetector f1180o;

    /* JADX INFO: renamed from: p */
    public f30<Integer, Integer> f1181p;

    /* JADX INFO: renamed from: q */
    public RectF f1182q;

    /* JADX INFO: renamed from: r */
    public Path f1183r;

    /* JADX INFO: renamed from: s */
    public RectF f1184s;

    /* JADX INFO: renamed from: t */
    public Paint f1185t;

    public IVMusicRangeSeekView(Context context) throws IllegalArgumentException {
        super(context);
        this.f1166a = new Integer[]{32, 44, 36, 56, 44, 18, 26, 56, 44, 70, 58, 38, 25, 46, 34, 42, 56, 44, 36, 48, 64, 40, 30, 38, 58, 30, 56, 36, 42, 58, 70, 44, 34, 50};
        this.f1168c = t100.d(2.0f);
        int iD = t100.d(4.0f);
        this.f1169d = iD;
        this.f1170e = this.f1168c + iD;
        m2562d();
    }

    /* JADX INFO: renamed from: a */
    public final void m2559a(Canvas canvas, int i, int i2, int i3, Paint paint) {
        if (this.f1177l == null) {
            this.f1177l = new RectF();
        }
        if (this.f1178m == null) {
            this.f1178m = new RectF();
        }
        int i4 = (i * this.f1170e) + i3;
        this.f1177l.left = i4 - t100.d(24.0f);
        this.f1177l.top = (getHeight() - f1164u) - 2;
        this.f1177l.right = t100.d(24.0f) + i4;
        this.f1177l.bottom = getHeight() - 2;
        this.f1178m.left = i4 - t100.d(24.0f);
        RectF rectF = this.f1178m;
        rectF.top = 1.0f;
        rectF.right = (i2 * this.f1170e) + i3;
        rectF.bottom = getHeight() + 2;
        paint.setColor(getResources().getColor(e1c0.f7154n));
        RectF rectF2 = this.f1177l;
        float f = rectF2.bottom;
        float f2 = rectF2.top;
        canvas.drawRoundRect(rectF2, (f - f2) / 2.0f, (f - f2) / 2.0f, paint);
        if (this.f1183r == null) {
            this.f1183r = new Path();
        }
        this.f1183r.reset();
        this.f1183r.moveTo(i4, this.f1177l.top - t100.d(3.0f));
        this.f1183r.lineTo(i4 - t100.d(2.0f), this.f1177l.top);
        this.f1183r.lineTo(t100.d(2.0f) + i4, this.f1177l.top);
        this.f1183r.close();
        canvas.drawPath(this.f1183r, paint);
        paint.setColor(Color.parseColor("#33000000"));
        if (this.f1182q == null) {
            this.f1182q = new RectF();
        }
        this.f1182q.left = i4 - t100.d(7.0f);
        this.f1182q.top = getHeight() - ((this.f1177l.height() * 3.0f) / 4.0f);
        this.f1182q.right = i4 - t100.d(5.0f);
        this.f1182q.bottom = getHeight() - (this.f1177l.height() / 4.0f);
        canvas.drawRoundRect(this.f1182q, t100.d(1.0f), t100.d(1.0f), paint);
        this.f1182q.left = i4 - t100.d(1.0f);
        this.f1182q.right = t100.d(1.0f) + i4;
        canvas.drawRoundRect(this.f1182q, t100.d(1.0f), t100.d(1.0f), paint);
        this.f1182q.left = t100.d(5.0f) + i4;
        this.f1182q.right = i4 + t100.d(7.0f);
        canvas.drawRoundRect(this.f1182q, t100.d(1.0f), t100.d(1.0f), paint);
    }

    /* JADX INFO: renamed from: b */
    public final void m2560b(Canvas canvas, int i, int i2, int i3, Paint paint) {
        if (this.f1185t == null) {
            this.f1185t = new Paint(1);
        }
        this.f1185t.setTextSize(t100.d(12.0f));
        this.f1185t.setStyle(Paint.Style.FILL);
        this.f1185t.setColor(Color.parseColor("#ffffff"));
        String str = m2561c(this.f1175j) + "/" + m2561c(this.f1172g);
        float fMeasureText = this.f1185t.measureText(str);
        if (this.f1184s == null) {
            this.f1184s = new RectF();
        }
        int iD = t100.d(5.0f);
        float f = iD * 2;
        float f2 = (this.f1170e * i) + fMeasureText + f;
        float width = getWidth();
        RectF rectF = this.f1184s;
        if (f2 > width) {
            rectF.left = (getWidth() - fMeasureText) - f;
            this.f1184s.right = getWidth();
        } else {
            int i4 = this.f1170e;
            rectF.left = (i * i4) + i3;
            rectF.right = (i4 * i) + fMeasureText + f + i3;
        }
        RectF rectF2 = this.f1184s;
        rectF2.top = 0.0f;
        int i5 = f1165v;
        rectF2.bottom = i5;
        paint.setColor(Color.parseColor("#b3000000"));
        canvas.drawRoundRect(this.f1184s, t100.d(2.0f), t100.d(2.0f), paint);
        canvas.drawText(str, this.f1184s.left + iD, (i5 * 2) / 3, this.f1185t);
        if (this.f1183r == null) {
            this.f1183r = new Path();
        }
        this.f1183r.reset();
        this.f1183r.moveTo((this.f1170e * i) + iD + i3, i5);
        this.f1183r.lineTo((this.f1170e * i) + iD + t100.d(8.0f) + i3, i5);
        this.f1183r.lineTo((i * this.f1170e) + iD + t100.d(4.0f) + i3, i5 + t100.d(4.0f));
        this.f1183r.close();
        canvas.drawPath(this.f1183r, paint);
    }

    /* JADX INFO: renamed from: c */
    public final String m2561c(int i) {
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
    public final void m2562d() {
        this.f1180o = new GestureDetector(this);
    }

    /* JADX INFO: renamed from: e */
    public final int m2563e(Canvas canvas) {
        if (this.f1185t == null) {
            this.f1185t = new Paint(1);
        }
        this.f1185t.setTextSize(t100.d(10.0f));
        this.f1185t.setStyle(Paint.Style.FILL);
        this.f1185t.setColor(Color.parseColor("#ffffff"));
        String strM2561c = m2561c(0);
        float fMeasureText = this.f1185t.measureText(strM2561c);
        String strM2561c2 = m2561c(this.f1172g);
        float fMeasureText2 = this.f1185t.measureText(strM2561c2);
        if (fMeasureText <= fMeasureText2) {
            fMeasureText = fMeasureText2;
        }
        int height = getHeight() - f1164u;
        int i = f1165v;
        float f = ((height - i) / 2) + i;
        canvas.drawText(strM2561c, this.f1168c, f, this.f1185t);
        canvas.drawText(strM2561c2, (getWidth() - this.f1168c) - fMeasureText, f, this.f1185t);
        return ((int) fMeasureText) + (this.f1168c * 2);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (this.f1177l == null) {
            return false;
        }
        if (motionEvent.getAction() != 0 || (motionEvent.getX() >= this.f1178m.left - 10.0f && motionEvent.getX() <= this.f1178m.right + 10.0f && motionEvent.getY() >= this.f1178m.top - 10.0f && motionEvent.getY() <= this.f1178m.bottom + 10.0f && motionEvent.getX() >= this.f1177l.left - 10.0f && motionEvent.getX() <= this.f1177l.right + 10.0f && motionEvent.getY() >= this.f1177l.top - 10.0f && motionEvent.getY() <= this.f1177l.bottom + 10.0f)) {
            return (motionEvent.getAction() != 0 || (motionEvent.getX() >= this.f1177l.left - 10.0f && motionEvent.getX() <= this.f1177l.right + 10.0f && motionEvent.getY() >= this.f1177l.top - 10.0f && motionEvent.getY() <= this.f1177l.bottom + 10.0f)) && this.f1173h != 0;
        }
        return false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        super.onDraw(canvas);
        int iM2563e = m2563e(canvas);
        if (this.f1167b == null) {
            this.f1167b = new ArrayList<>();
            this.f1174i = (getWidth() - (iM2563e * 2)) / this.f1170e;
            int height = getHeight() - f1164u;
            int i4 = f1165v;
            int i5 = ((height - i4) / 2) + i4;
            int i6 = 0;
            int i7 = 0;
            while (i6 < this.f1174i) {
                int i8 = (this.f1170e * i7) + this.f1168c;
                int i9 = this.f1169d + i8;
                Integer[] numArr = this.f1166a;
                int length = i6 >= numArr.length ? i6 % numArr.length : i6;
                this.f1167b.add(new RectF(i8 + iM2563e, i5 - t100.d(numArr[length].intValue() / 2), i9 + iM2563e, t100.d(this.f1166a[length].intValue() / 2) + i5));
                i7++;
                i6++;
            }
        }
        if (this.f1171f == null) {
            Paint paint = new Paint(1);
            this.f1171f = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f1171f.setColor(Color.parseColor("#ffffff"));
        }
        int i10 = this.f1172g;
        if (i10 == 0 || (i3 = this.f1173h) == 0) {
            i = this.f1174i;
            i2 = 0;
        } else {
            int i11 = this.f1174i;
            int i12 = (int) ((i3 / i10) * i11);
            int i13 = i12 != 0 ? i12 : 1;
            int i14 = this.f1175j;
            i2 = (int) ((i14 / i10) * i11);
            if (i2 >= i11 - i13 || i14 + i3 >= i10) {
                i2 = i11 - i13;
            }
            i = i2 + i13;
            this.f1176k = i13 * this.f1170e;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int i15 = this.f1174i;
        if (i <= i15) {
            i15 = i;
        }
        for (int i16 = 0; i16 < this.f1167b.size(); i16++) {
            if (i16 < i2 || i16 >= i15) {
                this.f1171f.setColor(Color.parseColor("#ffffff"));
            } else {
                this.f1171f.setColor(getResources().getColor(e1c0.f7154n));
            }
            canvas.drawRoundRect(this.f1167b.get(i16), this.f1167b.get(i16).width(), this.f1167b.get(i16).width(), this.f1171f);
        }
        int i17 = i2;
        m2560b(canvas, i17, i15, iM2563e, this.f1171f);
        m2559a(canvas, i17, i15, iM2563e, this.f1171f);
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
            this.f1179n = getMeasuredWidth();
        }
        int i = this.f1179n;
        if (i != 0) {
            if (this.f1172g == 0) {
                this.f1172g = this.f1173h;
            }
            float f3 = this.f1175j;
            int i2 = this.f1172g;
            float f4 = f3 - ((f * i2) / i);
            if (f4 % 1.0f > 0.5d) {
                this.f1175j = ((int) f4) + 1;
            } else {
                this.f1175j = (int) f4;
            }
            int i3 = this.f1175j;
            int i4 = this.f1173h;
            if (i3 + i4 > i2) {
                this.f1175j = i2 - i4;
            }
            if (this.f1175j < 0) {
                this.f1175j = 0;
            }
            setStartTime(this.f1175j);
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
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && NullChecker.a(this.f1181p)) {
            f30<Integer, Integer> f30Var = this.f1181p;
            Integer numValueOf = Integer.valueOf(this.f1175j);
            int i = this.f1175j;
            int i2 = this.f1173h;
            int i3 = i + i2;
            int i4 = this.f1172g;
            if (i3 <= i4) {
                i4 = i + i2;
            }
            f30Var.call(numValueOf, Integer.valueOf(i4));
        }
        return this.f1180o.onTouchEvent(motionEvent);
    }

    public void setListener(f30<Integer, Integer> f30Var) {
        this.f1181p = f30Var;
    }

    public void setMusicLength(int i) {
        this.f1172g = i;
    }

    public void setStartTime(int i) {
        this.f1175j = i;
        invalidate();
    }

    public void setVideoLength(int i) {
        this.f1173h = i;
    }

    public IVMusicRangeSeekView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1166a = new Integer[]{32, 44, 36, 56, 44, 18, 26, 56, 44, 70, 58, 38, 25, 46, 34, 42, 56, 44, 36, 48, 64, 40, 30, 38, 58, 30, 56, 36, 42, 58, 70, 44, 34, 50};
        this.f1168c = t100.d(2.0f);
        int iD = t100.d(4.0f);
        this.f1169d = iD;
        this.f1170e = this.f1168c + iD;
        m2562d();
    }

    public IVMusicRangeSeekView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1166a = new Integer[]{32, 44, 36, 56, 44, 18, 26, 56, 44, 70, 58, 38, 25, 46, 34, 42, 56, 44, 36, 48, 64, 40, 30, 38, 58, 30, 56, 36, 42, 58, 70, 44, 34, 50};
        this.f1168c = t100.d(2.0f);
        int iD = t100.d(4.0f);
        this.f1169d = iD;
        this.f1170e = this.f1168c + iD;
        m2562d();
    }
}
