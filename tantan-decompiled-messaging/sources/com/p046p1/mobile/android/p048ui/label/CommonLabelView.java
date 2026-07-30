package com.p046p1.mobile.android.p048ui.label;

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
import p149l.b9c0;
import p149l.j760;
import p149l.q6r;
import p149l.s6r;
import p149l.t100;
import p149l.u2c0;
import p149l.upk0;
import p149l.xaj0;

/* JADX INFO: loaded from: classes8.dex */
public class CommonLabelView extends View {

    /* JADX INFO: renamed from: j */
    public static HashMap<Integer, xaj0<Bitmap, Integer, Integer>> f15840j = new HashMap<>();

    /* JADX INFO: renamed from: k */
    public static HashMap<Integer, C4369a> f15841k = new HashMap<>();

    /* JADX INFO: renamed from: l */
    public static HashMap<Integer, HashMap<String, j760<Integer, Integer>>> f15842l = new HashMap<>();

    /* JADX INFO: renamed from: m */
    public static HashMap<Integer, C4370b> f15843m;

    /* JADX INFO: renamed from: a */
    public int f15844a;

    /* JADX INFO: renamed from: b */
    public C4370b f15845b;

    /* JADX INFO: renamed from: c */
    public q6r f15846c;

    /* JADX INFO: renamed from: d */
    public TextPaint f15847d;

    /* JADX INFO: renamed from: e */
    public Paint f15848e;

    /* JADX INFO: renamed from: f */
    public Path f15849f;

    /* JADX INFO: renamed from: g */
    public PorterDuffXfermode f15850g;

    /* JADX INFO: renamed from: h */
    public Rect f15851h;

    /* JADX INFO: renamed from: i */
    public RectF f15852i;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.label.CommonLabelView$a */
    public static class C4369a {

        /* JADX INFO: renamed from: a */
        public Bitmap f15853a;

        /* JADX INFO: renamed from: b */
        public int f15854b;

        /* JADX INFO: renamed from: c */
        public int f15855c;

        public C4369a(Bitmap bitmap, int i, int i2) {
            this.f15853a = bitmap;
            this.f15854b = i;
            this.f15855c = i2;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.label.CommonLabelView$b */
    public static class C4370b {

        /* JADX INFO: renamed from: a */
        public int f15856a;

        /* JADX INFO: renamed from: b */
        public int f15857b;

        /* JADX INFO: renamed from: c */
        public int f15858c;

        /* JADX INFO: renamed from: d */
        public int f15859d;

        /* JADX INFO: renamed from: e */
        public int f15860e;

        /* JADX INFO: renamed from: f */
        public int f15861f;

        /* JADX INFO: renamed from: g */
        public int f15862g;

        /* JADX INFO: renamed from: h */
        public int f15863h;

        public C4370b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f15856a = i;
            this.f15857b = i2;
            this.f15858c = i3;
            this.f15859d = i4;
            this.f15860e = i5;
            this.f15861f = i6;
            this.f15862g = i7;
            this.f15863h = i8;
        }
    }

    static {
        HashMap<Integer, C4370b> map = new HashMap<>();
        f15843m = map;
        int i = t100.f167262k;
        int iM186890d = t100.m186890d(9.0f);
        int i2 = t100.f167260i;
        int i3 = t100.f167252a;
        int i4 = t100.f167255d;
        int i5 = t100.f167256e;
        map.put(0, new C4370b(i, iM186890d, i2, i3, i4, i5, i5, i));
        HashMap<Integer, C4370b> map2 = f15843m;
        int i6 = t100.f167266o;
        int i7 = t100.f167261j;
        int i8 = t100.f167254c;
        int i9 = t100.f167257f;
        int i10 = t100.f167258g;
        int i11 = t100.f167264m;
        map2.put(1, new C4370b(i6, i2, i7, i8, i9, i10, i9, i11));
        f15843m.put(2, new C4370b(t100.f167268q, i7, i11, i8, i10, t100.f167259h, i10, t100.f167265n));
    }

    public CommonLabelView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15844a = -1;
        this.f15845b = null;
        this.f15846c = null;
        this.f15847d = null;
        this.f15850g = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74553y, i, 0);
            int i2 = typedArrayObtainStyledAttributes.getInt(b9c0.f74219A, -1);
            if (i2 < 0) {
                upk0.m194883a("创建标签必须要携带标签尺寸");
                throw null;
            }
            this.f15844a = i2;
            this.f15845b = f15843m.get(Integer.valueOf(i2));
            m21078i(context, this.f15844a);
            int i3 = typedArrayObtainStyledAttributes.getInt(b9c0.f74226B, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(b9c0.f74560z, -1);
            if (i4 >= 0) {
                this.f15846c = s6r.m182454a().m182455b(LabelModule.getLabel(i3), i4);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        m21079b();
    }

    /* JADX INFO: renamed from: a */
    public static CommonLabelView m21077a(Context context, LabelStyle labelStyle) {
        CommonLabelView commonLabelView = new CommonLabelView(context);
        commonLabelView.setSizeStyle(labelStyle);
        m21078i(context, labelStyle.getSize());
        return commonLabelView;
    }

    /* JADX INFO: renamed from: i */
    public static void m21078i(Context context, int i) {
        if (f15840j.containsKey(Integer.valueOf(i))) {
            return;
        }
        if (i == 0) {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), u2c0.f173378m);
            f15840j.put(Integer.valueOf(i), xaj0.m207578a(bitmapDecodeResource, Integer.valueOf(bitmapDecodeResource.getWidth()), Integer.valueOf(bitmapDecodeResource.getHeight())));
        } else if (i == 1) {
            Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(context.getResources(), u2c0.f173378m);
            f15840j.put(Integer.valueOf(i), xaj0.m207578a(bitmapDecodeResource2, Integer.valueOf(bitmapDecodeResource2.getWidth()), Integer.valueOf(bitmapDecodeResource2.getHeight())));
        } else if (i == 2) {
            Bitmap bitmapDecodeResource3 = BitmapFactory.decodeResource(context.getResources(), u2c0.f173378m);
            f15840j.put(Integer.valueOf(i), xaj0.m207578a(bitmapDecodeResource3, Integer.valueOf(bitmapDecodeResource3.getWidth()), Integer.valueOf(bitmapDecodeResource3.getHeight())));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21079b() {
        Paint paint = new Paint();
        this.f15848e = paint;
        paint.setAntiAlias(true);
        this.f15848e.setStyle(Paint.Style.FILL);
        this.f15849f = new Path();
        this.f15851h = new Rect(0, 0, 0, 0);
        this.f15852i = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        TextPaint textPaint = new TextPaint();
        this.f15847d = textPaint;
        textPaint.setAntiAlias(true);
        this.f15847d.setTypeface(Typeface.DEFAULT_BOLD);
    }

    /* JADX INFO: renamed from: c */
    public final C4369a m21080c(int i) {
        C4369a c4369a = f15841k.get(Integer.valueOf(i));
        if (c4369a != null) {
            return c4369a;
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), i);
        C4369a c4369a2 = new C4369a(bitmapDecodeResource, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight());
        f15841k.put(Integer.valueOf(i), c4369a2);
        return c4369a2;
    }

    /* JADX INFO: renamed from: d */
    public final j760<Integer, Integer> m21081d(String str, boolean z) {
        C4370b c4370b = f15843m.get(Integer.valueOf(this.f15844a));
        int i = z ? c4370b.f15863h : c4370b.f15857b;
        HashMap<String, j760<Integer, Integer>> map = f15842l.get(Integer.valueOf(i));
        if (map == null) {
            map = new HashMap<>();
            f15842l.put(Integer.valueOf(i), map);
        }
        if (map.containsKey(str)) {
            return map.get(str);
        }
        if (this.f15847d == null) {
            TextPaint textPaint = new TextPaint();
            this.f15847d = textPaint;
            textPaint.setAntiAlias(true);
        }
        this.f15847d.setTextSize(i);
        this.f15847d.setTextAlign(Paint.Align.LEFT);
        int iMeasureText = (int) this.f15847d.measureText(str);
        float f = this.f15847d.getFontMetrics().bottom - this.f15847d.getFontMetrics().top;
        int i2 = c4370b.f15856a;
        map.put(str, j760.m140076a(Integer.valueOf(iMeasureText), Integer.valueOf((int) ((i2 - ((i2 - f) / 2.0f)) - this.f15847d.getFontMetrics().bottom))));
        return map.get(str);
    }

    /* JADX INFO: renamed from: e */
    public final void m21082e(Canvas canvas) {
        C4369a c4369aM21080c = m21080c(this.f15846c.f152939e);
        this.f15851h.set(0, 0, c4369aM21080c.f15854b, c4369aM21080c.f15855c);
        this.f15852i.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawBitmap(c4369aM21080c.f15853a, this.f15851h, this.f15852i, this.f15848e);
    }

    /* JADX INFO: renamed from: f */
    public final void m21083f(Canvas canvas) {
        C4369a c4369aM21080c = m21080c(this.f15846c.f152936b);
        this.f15851h.set(0, 0, c4369aM21080c.f15854b, c4369aM21080c.f15855c);
        int i = this.f15845b.f15860e;
        C4370b c4370b = this.f15845b;
        int i2 = c4370b.f15858c;
        int i3 = i + (i2 / 2);
        int i4 = c4370b.f15856a / 2;
        int i5 = c4369aM21080c.f15854b;
        int i6 = c4369aM21080c.f15855c;
        RectF rectF = this.f15852i;
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
        canvas.drawBitmap(c4369aM21080c.f15853a, this.f15851h, this.f15852i, this.f15848e);
    }

    /* JADX INFO: renamed from: g */
    public void m21084g(q6r q6rVar) {
        this.f15846c = q6rVar;
        requestLayout();
    }

    /* JADX INFO: renamed from: h */
    public final void m21085h(Canvas canvas) {
        q6r q6rVar = this.f15846c;
        j760<Integer, Integer> j760VarM21081d = m21081d(q6rVar.f152935a, q6rVar.m173153f());
        TextPaint textPaint = this.f15847d;
        boolean zM173153f = this.f15846c.m173153f();
        C4370b c4370b = this.f15845b;
        textPaint.setTextSize(zM173153f ? c4370b.f15863h : c4370b.f15857b);
        this.f15847d.setColor(this.f15846c.f152938d);
        canvas.drawText(this.f15846c.f152935a, this.f15845b.f15860e + (this.f15846c.m173149b() ? this.f15845b.f15858c : 0) + this.f15845b.f15859d, j760VarM21081d.f116565b.intValue(), this.f15847d);
    }

    /* JADX INFO: renamed from: j */
    public void m21086j(String str) {
        q6r q6rVar = this.f15846c;
        if (q6rVar != null) {
            q6rVar.f152935a = str;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        q6r q6rVar = this.f15846c;
        if (q6rVar == null) {
            return;
        }
        if (q6rVar.m173151d()) {
            m21082e(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        this.f15848e.setXfermode(null);
        canvas.drawColor(this.f15846c.f152937c);
        xaj0<Bitmap, Integer, Integer> xaj0Var = f15840j.get(Integer.valueOf(this.f15844a));
        if (xaj0Var == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i = this.f15845b.f15856a;
        float f = measuredHeight;
        int iMin = Math.min((int) ((measuredWidth * xaj0Var.f191753c.intValue()) / f), xaj0Var.f191752b.intValue());
        this.f15851h.set(0, 0, iMin, xaj0Var.f191753c.intValue());
        this.f15852i.set(0.0f, 0.0f, Math.min(measuredWidth, (int) ((iMin * f) / xaj0Var.f191753c.intValue())), i);
        canvas.drawBitmap(xaj0Var.f191751a, this.f15851h, this.f15852i, this.f15848e);
        if (this.f15846c.m173149b()) {
            m21083f(canvas);
        }
        if (this.f15846c.m173150c()) {
            m21085h(canvas);
        }
        this.f15848e.setColor(-1);
        this.f15849f.reset();
        this.f15849f.setFillType(Path.FillType.EVEN_ODD);
        Path path = this.f15849f;
        float measuredWidth2 = getMeasuredWidth() + 1;
        float measuredHeight2 = getMeasuredHeight() + 1;
        Path.Direction direction = Path.Direction.CW;
        path.addRect(-1.0f, -1.0f, measuredWidth2, measuredHeight2, direction);
        this.f15849f.addRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f15845b.f15862g, this.f15845b.f15862g, direction);
        this.f15848e.setXfermode(this.f15850g);
        this.f15849f.close();
        canvas.drawPath(this.f15849f, this.f15848e);
        this.f15848e.setXfermode(null);
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
        C4370b c4370b = f15843m.get(Integer.valueOf(this.f15844a));
        q6r q6rVar = this.f15846c;
        if (q6rVar == null || c4370b == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        boolean zM173151d = q6rVar.m173151d();
        q6r q6rVar2 = this.f15846c;
        if (zM173151d) {
            C4369a c4369aM21080c = m21080c(q6rVar2.f152939e);
            i7 = c4370b.f15856a;
            i6 = (c4369aM21080c.f15854b * i7) / c4369aM21080c.f15855c;
        } else {
            boolean zM173152e = q6rVar2.m173152e();
            q6r q6rVar3 = this.f15846c;
            if (zM173152e) {
                m21080c(q6rVar3.f152936b);
                int i8 = c4370b.f15856a;
                i6 = c4370b.f15860e + c4370b.f15858c + c4370b.f15860e;
                i7 = i8;
            } else {
                boolean zM173153f = q6rVar3.m173153f();
                q6r q6rVar4 = this.f15846c;
                if (zM173153f) {
                    int iIntValue = m21081d(q6rVar4.f152935a, q6rVar4.m173153f()).f116564a.intValue();
                    i3 = c4370b.f15856a;
                    i4 = c4370b.f15860e + c4370b.f15859d + iIntValue;
                    i5 = c4370b.f15861f;
                } else {
                    int iIntValue2 = m21081d(q6rVar4.f152935a, q6rVar4.m173153f()).f116564a.intValue();
                    m21080c(this.f15846c.f152936b);
                    i3 = c4370b.f15856a;
                    i4 = c4370b.f15860e + c4370b.f15858c + c4370b.f15859d + iIntValue2;
                    i5 = c4370b.f15861f;
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
            upk0.m194883a("创建标签必须要携带标签尺寸");
            return;
        }
        int size = labelStyle.getSize();
        this.f15844a = size;
        this.f15845b = f15843m.get(Integer.valueOf(size));
    }

    public CommonLabelView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommonLabelView(Context context) {
        this(context, null);
    }
}
