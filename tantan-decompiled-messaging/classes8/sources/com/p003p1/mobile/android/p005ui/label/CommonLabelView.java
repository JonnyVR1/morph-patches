package com.p003p1.mobile.android.p005ui.label;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import l.j760;
import l.t100;
import l.upk0;
import l.xaj0;
import p007l.b9c0;
import p007l.q6r;
import p007l.s6r;
import p007l.u2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class CommonLabelView extends View {

    /* JADX INFO: renamed from: j */
    public static HashMap<Integer, xaj0<Bitmap, Integer, Integer>> f1539j = new HashMap<>();

    /* JADX INFO: renamed from: k */
    public static HashMap<Integer, C0281a> f1540k = new HashMap<>();

    /* JADX INFO: renamed from: l */
    public static HashMap<Integer, HashMap<String, j760<Integer, Integer>>> f1541l = new HashMap<>();

    /* JADX INFO: renamed from: m */
    public static HashMap<Integer, C0282b> f1542m;

    /* JADX INFO: renamed from: a */
    public int f1543a;

    /* JADX INFO: renamed from: b */
    public C0282b f1544b;

    /* JADX INFO: renamed from: c */
    public q6r f1545c;

    /* JADX INFO: renamed from: d */
    public TextPaint f1546d;

    /* JADX INFO: renamed from: e */
    public Paint f1547e;

    /* JADX INFO: renamed from: f */
    public Path f1548f;

    /* JADX INFO: renamed from: g */
    public PorterDuffXfermode f1549g;

    /* JADX INFO: renamed from: h */
    public Rect f1550h;

    /* JADX INFO: renamed from: i */
    public RectF f1551i;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.label.CommonLabelView$a */
    public static class C0281a {

        /* JADX INFO: renamed from: a */
        public Bitmap f1552a;

        /* JADX INFO: renamed from: b */
        public int f1553b;

        /* JADX INFO: renamed from: c */
        public int f1554c;

        public C0281a(Bitmap bitmap, int i, int i2) {
            this.f1552a = bitmap;
            this.f1553b = i;
            this.f1554c = i2;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.label.CommonLabelView$b */
    public static class C0282b {

        /* JADX INFO: renamed from: a */
        public int f1555a;

        /* JADX INFO: renamed from: b */
        public int f1556b;

        /* JADX INFO: renamed from: c */
        public int f1557c;

        /* JADX INFO: renamed from: d */
        public int f1558d;

        /* JADX INFO: renamed from: e */
        public int f1559e;

        /* JADX INFO: renamed from: f */
        public int f1560f;

        /* JADX INFO: renamed from: g */
        public int f1561g;

        /* JADX INFO: renamed from: h */
        public int f1562h;

        public C0282b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f1555a = i;
            this.f1556b = i2;
            this.f1557c = i3;
            this.f1558d = i4;
            this.f1559e = i5;
            this.f1560f = i6;
            this.f1561g = i7;
            this.f1562h = i8;
        }
    }

    static {
        HashMap<Integer, C0282b> map = new HashMap<>();
        f1542m = map;
        int i = t100.k;
        int iD = t100.d(9.0f);
        int i2 = t100.i;
        int i3 = t100.a;
        int i4 = t100.d;
        int i5 = t100.e;
        map.put(0, new C0282b(i, iD, i2, i3, i4, i5, i5, i));
        HashMap<Integer, C0282b> map2 = f1542m;
        int i6 = t100.o;
        int i7 = t100.j;
        int i8 = t100.c;
        int i9 = t100.f;
        int i10 = t100.g;
        int i11 = t100.m;
        map2.put(1, new C0282b(i6, i2, i7, i8, i9, i10, i9, i11));
        f1542m.put(2, new C0282b(t100.q, i7, i11, i8, i10, t100.h, i10, t100.n));
    }

    public CommonLabelView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1543a = -1;
        this.f1544b = null;
        this.f1545c = null;
        this.f1546d = null;
        this.f1549g = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f2276y, i, 0);
            int i2 = typedArrayObtainStyledAttributes.getInt(b9c0.f1942A, -1);
            if (i2 < 0) {
                upk0.a("创建标签必须要携带标签尺寸");
                throw null;
            }
            this.f1543a = i2;
            this.f1544b = f1542m.get(Integer.valueOf(i2));
            m1350i(context, this.f1543a);
            int i3 = typedArrayObtainStyledAttributes.getInt(b9c0.f1949B, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(b9c0.f2283z, -1);
            if (i4 >= 0) {
                this.f1545c = s6r.m10624a().m10625b(LabelModule.getLabel(i3), i4);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        m1351b();
    }

    /* JADX INFO: renamed from: a */
    public static CommonLabelView m1349a(Context context, LabelStyle labelStyle) {
        CommonLabelView commonLabelView = new CommonLabelView(context);
        commonLabelView.setSizeStyle(labelStyle);
        m1350i(context, labelStyle.getSize());
        return commonLabelView;
    }

    /* JADX INFO: renamed from: i */
    public static void m1350i(Context context, int i) {
        if (f1539j.containsKey(Integer.valueOf(i))) {
            return;
        }
        if (i == 0) {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), u2c0.f4746m);
            f1539j.put(Integer.valueOf(i), xaj0.a(bitmapDecodeResource, Integer.valueOf(bitmapDecodeResource.getWidth()), Integer.valueOf(bitmapDecodeResource.getHeight())));
        } else if (i == 1) {
            Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(context.getResources(), u2c0.f4746m);
            f1539j.put(Integer.valueOf(i), xaj0.a(bitmapDecodeResource2, Integer.valueOf(bitmapDecodeResource2.getWidth()), Integer.valueOf(bitmapDecodeResource2.getHeight())));
        } else if (i == 2) {
            Bitmap bitmapDecodeResource3 = BitmapFactory.decodeResource(context.getResources(), u2c0.f4746m);
            f1539j.put(Integer.valueOf(i), xaj0.a(bitmapDecodeResource3, Integer.valueOf(bitmapDecodeResource3.getWidth()), Integer.valueOf(bitmapDecodeResource3.getHeight())));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1351b() {
        Paint paint = new Paint();
        this.f1547e = paint;
        paint.setAntiAlias(true);
        this.f1547e.setStyle(Paint.Style.FILL);
        this.f1548f = new Path();
        this.f1550h = new Rect(0, 0, 0, 0);
        this.f1551i = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        TextPaint textPaint = new TextPaint();
        this.f1546d = textPaint;
        textPaint.setAntiAlias(true);
        this.f1546d.setTypeface(Typeface.DEFAULT_BOLD);
    }

    /* JADX INFO: renamed from: c */
    public final C0281a m1352c(int i) {
        C0281a c0281a = f1540k.get(Integer.valueOf(i));
        if (c0281a != null) {
            return c0281a;
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), i);
        C0281a c0281a2 = new C0281a(bitmapDecodeResource, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight());
        f1540k.put(Integer.valueOf(i), c0281a2);
        return c0281a2;
    }

    /* JADX INFO: renamed from: d */
    public final j760<Integer, Integer> m1353d(String str, boolean z) {
        C0282b c0282b = f1542m.get(Integer.valueOf(this.f1543a));
        int i = z ? c0282b.f1562h : c0282b.f1556b;
        HashMap<String, j760<Integer, Integer>> map = f1541l.get(Integer.valueOf(i));
        if (map == null) {
            map = new HashMap<>();
            f1541l.put(Integer.valueOf(i), map);
        }
        if (map.containsKey(str)) {
            return map.get(str);
        }
        if (this.f1546d == null) {
            TextPaint textPaint = new TextPaint();
            this.f1546d = textPaint;
            textPaint.setAntiAlias(true);
        }
        this.f1546d.setTextSize(i);
        this.f1546d.setTextAlign(Paint.Align.LEFT);
        int iMeasureText = (int) this.f1546d.measureText(str);
        float f = this.f1546d.getFontMetrics().bottom - this.f1546d.getFontMetrics().top;
        int i2 = c0282b.f1555a;
        map.put(str, j760.a(Integer.valueOf(iMeasureText), Integer.valueOf((int) ((i2 - ((i2 - f) / 2.0f)) - this.f1546d.getFontMetrics().bottom))));
        return map.get(str);
    }

    /* JADX INFO: renamed from: e */
    public final void m1354e(Canvas canvas) {
        C0281a c0281aM1352c = m1352c(this.f1545c.f3812e);
        this.f1550h.set(0, 0, c0281aM1352c.f1553b, c0281aM1352c.f1554c);
        this.f1551i.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawBitmap(c0281aM1352c.f1552a, this.f1550h, this.f1551i, this.f1547e);
    }

    /* JADX INFO: renamed from: f */
    public final void m1355f(Canvas canvas) {
        C0281a c0281aM1352c = m1352c(this.f1545c.f3809b);
        this.f1550h.set(0, 0, c0281aM1352c.f1553b, c0281aM1352c.f1554c);
        int i = this.f1544b.f1559e;
        C0282b c0282b = this.f1544b;
        int i2 = c0282b.f1557c;
        int i3 = i + (i2 / 2);
        int i4 = c0282b.f1555a / 2;
        int i5 = c0281aM1352c.f1553b;
        int i6 = c0281aM1352c.f1554c;
        RectF rectF = this.f1551i;
        if (i5 > i6) {
            float f = i2 / i5;
            float f2 = i3;
            float f3 = i4;
            rectF.set(f2 - ((i5 * f) / 2.0f), f3 - ((i6 * f) / 2.0f), f2 + ((i5 * f) / 2.0f), f3 + ((i6 * f) / 2.0f));
        } else {
            float f4 = i2 / i6;
            float f5 = i3;
            float f6 = i4;
            rectF.set(f5 - ((i5 * f4) / 2.0f), f6 - ((i6 * f4) / 2.0f), f5 + ((i5 * f4) / 2.0f), f6 + ((i6 * f4) / 2.0f));
        }
        canvas.drawBitmap(c0281aM1352c.f1552a, this.f1550h, this.f1551i, this.f1547e);
    }

    /* JADX INFO: renamed from: g */
    public void m1356g(q6r q6rVar) {
        this.f1545c = q6rVar;
        requestLayout();
    }

    /* JADX INFO: renamed from: h */
    public final void m1357h(Canvas canvas) {
        q6r q6rVar = this.f1545c;
        j760<Integer, Integer> j760VarM1353d = m1353d(q6rVar.f3808a, q6rVar.m10296f());
        TextPaint textPaint = this.f1546d;
        boolean zM10296f = this.f1545c.m10296f();
        C0282b c0282b = this.f1544b;
        textPaint.setTextSize(zM10296f ? c0282b.f1562h : c0282b.f1556b);
        this.f1546d.setColor(this.f1545c.f3811d);
        canvas.drawText(this.f1545c.f3808a, this.f1544b.f1559e + (this.f1545c.m10292b() ? this.f1544b.f1557c : 0) + this.f1544b.f1558d, ((Integer) j760VarM1353d.b).intValue(), this.f1546d);
    }

    /* JADX INFO: renamed from: j */
    public void m1358j(String str) {
        q6r q6rVar = this.f1545c;
        if (q6rVar != null) {
            q6rVar.f3808a = str;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        q6r q6rVar = this.f1545c;
        if (q6rVar == null) {
            return;
        }
        if (q6rVar.m10294d()) {
            m1354e(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        this.f1547e.setXfermode(null);
        canvas.drawColor(this.f1545c.f3810c);
        xaj0<Bitmap, Integer, Integer> xaj0Var = f1539j.get(Integer.valueOf(this.f1543a));
        if (xaj0Var == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i = this.f1544b.f1555a;
        float f = measuredHeight;
        int iMin = Math.min((int) ((measuredWidth * ((Integer) xaj0Var.c).intValue()) / f), ((Integer) xaj0Var.b).intValue());
        this.f1550h.set(0, 0, iMin, ((Integer) xaj0Var.c).intValue());
        this.f1551i.set(0.0f, 0.0f, Math.min(measuredWidth, (int) ((iMin * f) / ((Integer) xaj0Var.c).intValue())), i);
        canvas.drawBitmap((Bitmap) xaj0Var.a, this.f1550h, this.f1551i, this.f1547e);
        if (this.f1545c.m10292b()) {
            m1355f(canvas);
        }
        if (this.f1545c.m10293c()) {
            m1357h(canvas);
        }
        this.f1547e.setColor(-1);
        this.f1548f.reset();
        this.f1548f.setFillType(Path.FillType.EVEN_ODD);
        Path path = this.f1548f;
        float measuredWidth2 = getMeasuredWidth() + 1;
        float measuredHeight2 = getMeasuredHeight() + 1;
        Path.Direction direction = Path.Direction.CW;
        path.addRect(-1.0f, -1.0f, measuredWidth2, measuredHeight2, direction);
        this.f1548f.addRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f1544b.f1561g, this.f1544b.f1561g, direction);
        this.f1547e.setXfermode(this.f1549g);
        this.f1548f.close();
        canvas.drawPath(this.f1548f, this.f1547e);
        this.f1547e.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        super.onMeasure(i, i2);
        C0282b c0282b = f1542m.get(Integer.valueOf(this.f1543a));
        q6r q6rVar = this.f1545c;
        if (q6rVar == null || c0282b == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        boolean zM10294d = q6rVar.m10294d();
        q6r q6rVar2 = this.f1545c;
        if (zM10294d) {
            C0281a c0281aM1352c = m1352c(q6rVar2.f3812e);
            i7 = c0282b.f1555a;
            i6 = (c0281aM1352c.f1553b * i7) / c0281aM1352c.f1554c;
        } else {
            boolean zM10295e = q6rVar2.m10295e();
            q6r q6rVar3 = this.f1545c;
            if (zM10295e) {
                m1352c(q6rVar3.f3809b);
                int i8 = c0282b.f1555a;
                i6 = c0282b.f1559e + c0282b.f1557c + c0282b.f1559e;
                i7 = i8;
            } else {
                boolean zM10296f = q6rVar3.m10296f();
                q6r q6rVar4 = this.f1545c;
                if (zM10296f) {
                    int iIntValue = ((Integer) m1353d(q6rVar4.f3808a, q6rVar4.m10296f()).a).intValue();
                    i3 = c0282b.f1555a;
                    i4 = c0282b.f1559e + c0282b.f1558d + iIntValue;
                    i5 = c0282b.f1560f;
                } else {
                    int iIntValue2 = ((Integer) m1353d(q6rVar4.f3808a, q6rVar4.m10296f()).a).intValue();
                    m1352c(this.f1545c.f3809b);
                    i3 = c0282b.f1555a;
                    i4 = c0282b.f1559e + c0282b.f1557c + c0282b.f1558d + iIntValue2;
                    i5 = c0282b.f1560f;
                }
                int i9 = i3;
                i6 = i5 + i4;
                i7 = i9;
            }
        }
        setMeasuredDimension(i6, i7);
    }

    public void setSizeStyle(LabelStyle labelStyle) {
        if (labelStyle == null) {
            upk0.a("创建标签必须要携带标签尺寸");
            return;
        }
        int size = labelStyle.getSize();
        this.f1543a = size;
        this.f1544b = f1542m.get(Integer.valueOf(size));
    }

    public CommonLabelView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommonLabelView(Context context) {
        this(context, null);
    }
}
