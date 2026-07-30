package com.p051p1.mobile.android.p053ui.label;

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
import p153l.abc0;
import p153l.azk0;
import p153l.bkj0;
import p153l.hhc0;
import p153l.pf60;
import p153l.qa00;
import p153l.r8r;
import p153l.t8r;

/* JADX INFO: loaded from: classes8.dex */
public class CommonLabelView extends View {

    /* JADX INFO: renamed from: j */
    public static HashMap<Integer, bkj0<Bitmap, Integer, Integer>> f16559j = new HashMap<>();

    /* JADX INFO: renamed from: k */
    public static HashMap<Integer, C4520a> f16560k = new HashMap<>();

    /* JADX INFO: renamed from: l */
    public static HashMap<Integer, HashMap<String, pf60<Integer, Integer>>> f16561l = new HashMap<>();

    /* JADX INFO: renamed from: m */
    public static HashMap<Integer, C4521b> f16562m;

    /* JADX INFO: renamed from: a */
    public int f16563a;

    /* JADX INFO: renamed from: b */
    public C4521b f16564b;

    /* JADX INFO: renamed from: c */
    public r8r f16565c;

    /* JADX INFO: renamed from: d */
    public TextPaint f16566d;

    /* JADX INFO: renamed from: e */
    public Paint f16567e;

    /* JADX INFO: renamed from: f */
    public Path f16568f;

    /* JADX INFO: renamed from: g */
    public PorterDuffXfermode f16569g;

    /* JADX INFO: renamed from: h */
    public Rect f16570h;

    /* JADX INFO: renamed from: i */
    public RectF f16571i;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.label.CommonLabelView$a */
    public static class C4520a {

        /* JADX INFO: renamed from: a */
        public Bitmap f16572a;

        /* JADX INFO: renamed from: b */
        public int f16573b;

        /* JADX INFO: renamed from: c */
        public int f16574c;

        public C4520a(Bitmap bitmap, int i, int i2) {
            this.f16572a = bitmap;
            this.f16573b = i;
            this.f16574c = i2;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.label.CommonLabelView$b */
    public static class C4521b {

        /* JADX INFO: renamed from: a */
        public int f16575a;

        /* JADX INFO: renamed from: b */
        public int f16576b;

        /* JADX INFO: renamed from: c */
        public int f16577c;

        /* JADX INFO: renamed from: d */
        public int f16578d;

        /* JADX INFO: renamed from: e */
        public int f16579e;

        /* JADX INFO: renamed from: f */
        public int f16580f;

        /* JADX INFO: renamed from: g */
        public int f16581g;

        /* JADX INFO: renamed from: h */
        public int f16582h;

        public C4521b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f16575a = i;
            this.f16576b = i2;
            this.f16577c = i3;
            this.f16578d = i4;
            this.f16579e = i5;
            this.f16580f = i6;
            this.f16581g = i7;
            this.f16582h = i8;
        }
    }

    static {
        HashMap<Integer, C4521b> map = new HashMap<>();
        f16562m = map;
        int i = qa00.f156324k;
        int iM175859d = qa00.m175859d(9.0f);
        int i2 = qa00.f156322i;
        int i3 = qa00.f156314a;
        int i4 = qa00.f156317d;
        int i5 = qa00.f156318e;
        map.put(0, new C4521b(i, iM175859d, i2, i3, i4, i5, i5, i));
        HashMap<Integer, C4521b> map2 = f16562m;
        int i6 = qa00.f156328o;
        int i7 = qa00.f156323j;
        int i8 = qa00.f156316c;
        int i9 = qa00.f156319f;
        int i10 = qa00.f156320g;
        int i11 = qa00.f156326m;
        map2.put(1, new C4521b(i6, i2, i7, i8, i9, i10, i9, i11));
        f16562m.put(2, new C4521b(qa00.f156330q, i7, i11, i8, i10, qa00.f156321h, i10, qa00.f156327n));
    }

    public CommonLabelView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16563a = -1;
        this.f16564b = null;
        this.f16565c = null;
        this.f16566d = null;
        this.f16569g = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109862y, i, 0);
            int i2 = typedArrayObtainStyledAttributes.getInt(hhc0.f109528A, -1);
            if (i2 < 0) {
                azk0.m101074a("创建标签必须要携带标签尺寸");
                throw null;
            }
            this.f16563a = i2;
            this.f16564b = f16562m.get(Integer.valueOf(i2));
            m22077i(context, this.f16563a);
            int i3 = typedArrayObtainStyledAttributes.getInt(hhc0.f109535B, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(hhc0.f109869z, -1);
            if (i4 >= 0) {
                this.f16565c = t8r.m189686a().m189687b(LabelModule.getLabel(i3), i4);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        m22078b();
    }

    /* JADX INFO: renamed from: a */
    public static CommonLabelView m22076a(Context context, LabelStyle labelStyle) {
        CommonLabelView commonLabelView = new CommonLabelView(context);
        commonLabelView.setSizeStyle(labelStyle);
        m22077i(context, labelStyle.getSize());
        return commonLabelView;
    }

    /* JADX INFO: renamed from: i */
    public static void m22077i(Context context, int i) {
        if (f16559j.containsKey(Integer.valueOf(i))) {
            return;
        }
        if (i == 0) {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), abc0.f69498m);
            f16559j.put(Integer.valueOf(i), bkj0.m104818a(bitmapDecodeResource, Integer.valueOf(bitmapDecodeResource.getWidth()), Integer.valueOf(bitmapDecodeResource.getHeight())));
        } else if (i == 1) {
            Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(context.getResources(), abc0.f69498m);
            f16559j.put(Integer.valueOf(i), bkj0.m104818a(bitmapDecodeResource2, Integer.valueOf(bitmapDecodeResource2.getWidth()), Integer.valueOf(bitmapDecodeResource2.getHeight())));
        } else if (i == 2) {
            Bitmap bitmapDecodeResource3 = BitmapFactory.decodeResource(context.getResources(), abc0.f69498m);
            f16559j.put(Integer.valueOf(i), bkj0.m104818a(bitmapDecodeResource3, Integer.valueOf(bitmapDecodeResource3.getWidth()), Integer.valueOf(bitmapDecodeResource3.getHeight())));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m22078b() {
        Paint paint = new Paint();
        this.f16567e = paint;
        paint.setAntiAlias(true);
        this.f16567e.setStyle(Paint.Style.FILL);
        this.f16568f = new Path();
        this.f16570h = new Rect(0, 0, 0, 0);
        this.f16571i = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        TextPaint textPaint = new TextPaint();
        this.f16566d = textPaint;
        textPaint.setAntiAlias(true);
        this.f16566d.setTypeface(Typeface.DEFAULT_BOLD);
    }

    /* JADX INFO: renamed from: c */
    public final C4520a m22079c(int i) {
        C4520a c4520a = f16560k.get(Integer.valueOf(i));
        if (c4520a != null) {
            return c4520a;
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), i);
        C4520a c4520a2 = new C4520a(bitmapDecodeResource, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight());
        f16560k.put(Integer.valueOf(i), c4520a2);
        return c4520a2;
    }

    /* JADX INFO: renamed from: d */
    public final pf60<Integer, Integer> m22080d(String str, boolean z) {
        C4521b c4521b = f16562m.get(Integer.valueOf(this.f16563a));
        int i = z ? c4521b.f16582h : c4521b.f16576b;
        HashMap<String, pf60<Integer, Integer>> map = f16561l.get(Integer.valueOf(i));
        if (map == null) {
            map = new HashMap<>();
            f16561l.put(Integer.valueOf(i), map);
        }
        if (map.containsKey(str)) {
            return map.get(str);
        }
        if (this.f16566d == null) {
            TextPaint textPaint = new TextPaint();
            this.f16566d = textPaint;
            textPaint.setAntiAlias(true);
        }
        this.f16566d.setTextSize(i);
        this.f16566d.setTextAlign(Paint.Align.LEFT);
        int iMeasureText = (int) this.f16566d.measureText(str);
        float f = this.f16566d.getFontMetrics().bottom - this.f16566d.getFontMetrics().top;
        int i2 = c4521b.f16575a;
        map.put(str, pf60.m172085a(Integer.valueOf(iMeasureText), Integer.valueOf((int) ((i2 - ((i2 - f) / 2.0f)) - this.f16566d.getFontMetrics().bottom))));
        return map.get(str);
    }

    /* JADX INFO: renamed from: e */
    public final void m22081e(Canvas canvas) {
        C4520a c4520aM22079c = m22079c(this.f16565c.f161754e);
        this.f16570h.set(0, 0, c4520aM22079c.f16573b, c4520aM22079c.f16574c);
        this.f16571i.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawBitmap(c4520aM22079c.f16572a, this.f16570h, this.f16571i, this.f16567e);
    }

    /* JADX INFO: renamed from: f */
    public final void m22082f(Canvas canvas) {
        C4520a c4520aM22079c = m22079c(this.f16565c.f161751b);
        this.f16570h.set(0, 0, c4520aM22079c.f16573b, c4520aM22079c.f16574c);
        int i = this.f16564b.f16579e;
        C4521b c4521b = this.f16564b;
        int i2 = c4521b.f16577c;
        int i3 = i + (i2 / 2);
        int i4 = c4521b.f16575a / 2;
        int i5 = c4520aM22079c.f16573b;
        int i6 = c4520aM22079c.f16574c;
        RectF rectF = this.f16571i;
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
        canvas.drawBitmap(c4520aM22079c.f16572a, this.f16570h, this.f16571i, this.f16567e);
    }

    /* JADX INFO: renamed from: g */
    public void m22083g(r8r r8rVar) {
        this.f16565c = r8rVar;
        requestLayout();
    }

    /* JADX INFO: renamed from: h */
    public final void m22084h(Canvas canvas) {
        r8r r8rVar = this.f16565c;
        pf60<Integer, Integer> pf60VarM22080d = m22080d(r8rVar.f161750a, r8rVar.m180242f());
        TextPaint textPaint = this.f16566d;
        boolean zM180242f = this.f16565c.m180242f();
        C4521b c4521b = this.f16564b;
        textPaint.setTextSize(zM180242f ? c4521b.f16582h : c4521b.f16576b);
        this.f16566d.setColor(this.f16565c.f161753d);
        canvas.drawText(this.f16565c.f161750a, this.f16564b.f16579e + (this.f16565c.m180238b() ? this.f16564b.f16577c : 0) + this.f16564b.f16578d, pf60VarM22080d.f152157b.intValue(), this.f16566d);
    }

    /* JADX INFO: renamed from: j */
    public void m22085j(String str) {
        r8r r8rVar = this.f16565c;
        if (r8rVar != null) {
            r8rVar.f161750a = str;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        r8r r8rVar = this.f16565c;
        if (r8rVar == null) {
            return;
        }
        if (r8rVar.m180240d()) {
            m22081e(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        this.f16567e.setXfermode(null);
        canvas.drawColor(this.f16565c.f161752c);
        bkj0<Bitmap, Integer, Integer> bkj0Var = f16559j.get(Integer.valueOf(this.f16563a));
        if (bkj0Var == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i = this.f16564b.f16575a;
        float f = measuredHeight;
        int iMin = Math.min((int) ((measuredWidth * bkj0Var.f77083c.intValue()) / f), bkj0Var.f77082b.intValue());
        this.f16570h.set(0, 0, iMin, bkj0Var.f77083c.intValue());
        this.f16571i.set(0.0f, 0.0f, Math.min(measuredWidth, (int) ((iMin * f) / bkj0Var.f77083c.intValue())), i);
        canvas.drawBitmap(bkj0Var.f77081a, this.f16570h, this.f16571i, this.f16567e);
        if (this.f16565c.m180238b()) {
            m22082f(canvas);
        }
        if (this.f16565c.m180239c()) {
            m22084h(canvas);
        }
        this.f16567e.setColor(-1);
        this.f16568f.reset();
        this.f16568f.setFillType(Path.FillType.EVEN_ODD);
        Path path = this.f16568f;
        float measuredWidth2 = getMeasuredWidth() + 1;
        float measuredHeight2 = getMeasuredHeight() + 1;
        Path.Direction direction = Path.Direction.CW;
        path.addRect(-1.0f, -1.0f, measuredWidth2, measuredHeight2, direction);
        this.f16568f.addRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f16564b.f16581g, this.f16564b.f16581g, direction);
        this.f16567e.setXfermode(this.f16569g);
        this.f16568f.close();
        canvas.drawPath(this.f16568f, this.f16567e);
        this.f16567e.setXfermode(null);
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
        C4521b c4521b = f16562m.get(Integer.valueOf(this.f16563a));
        r8r r8rVar = this.f16565c;
        if (r8rVar == null || c4521b == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        boolean zM180240d = r8rVar.m180240d();
        r8r r8rVar2 = this.f16565c;
        if (zM180240d) {
            C4520a c4520aM22079c = m22079c(r8rVar2.f161754e);
            i7 = c4521b.f16575a;
            i6 = (c4520aM22079c.f16573b * i7) / c4520aM22079c.f16574c;
        } else {
            boolean zM180241e = r8rVar2.m180241e();
            r8r r8rVar3 = this.f16565c;
            if (zM180241e) {
                m22079c(r8rVar3.f161751b);
                int i8 = c4521b.f16575a;
                i6 = c4521b.f16579e + c4521b.f16577c + c4521b.f16579e;
                i7 = i8;
            } else {
                boolean zM180242f = r8rVar3.m180242f();
                r8r r8rVar4 = this.f16565c;
                if (zM180242f) {
                    int iIntValue = m22080d(r8rVar4.f161750a, r8rVar4.m180242f()).f152156a.intValue();
                    i3 = c4521b.f16575a;
                    i4 = c4521b.f16579e + c4521b.f16578d + iIntValue;
                    i5 = c4521b.f16580f;
                } else {
                    int iIntValue2 = m22080d(r8rVar4.f161750a, r8rVar4.m180242f()).f152156a.intValue();
                    m22079c(this.f16565c.f161751b);
                    i3 = c4521b.f16575a;
                    i4 = c4521b.f16579e + c4521b.f16577c + c4521b.f16578d + iIntValue2;
                    i5 = c4521b.f16580f;
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
            azk0.m101074a("创建标签必须要携带标签尺寸");
            return;
        }
        int size = labelStyle.getSize();
        this.f16563a = size;
        this.f16564b = f16562m.get(Integer.valueOf(size));
    }

    public CommonLabelView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommonLabelView(Context context) {
        this(context, null);
    }
}
