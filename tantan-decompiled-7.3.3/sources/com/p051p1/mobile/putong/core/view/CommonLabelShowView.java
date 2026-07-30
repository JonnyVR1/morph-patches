package com.p051p1.mobile.putong.core.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.data.LabelData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p153l.jyb;
import p153l.lyh0;
import p153l.qa00;
import p153l.xhc0;

/* JADX INFO: loaded from: classes12.dex */
public class CommonLabelShowView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f39358a;

    /* JADX INFO: renamed from: b */
    public Paint f39359b;

    /* JADX INFO: renamed from: c */
    public Paint f39360c;

    /* JADX INFO: renamed from: d */
    public Paint f39361d;

    /* JADX INFO: renamed from: e */
    public Paint f39362e;

    /* JADX INFO: renamed from: f */
    public Paint f39363f;

    /* JADX INFO: renamed from: g */
    public int f39364g;

    /* JADX INFO: renamed from: h */
    public int f39365h;

    /* JADX INFO: renamed from: i */
    public List<LayoutData> f39366i;

    /* JADX INFO: renamed from: j */
    public Map<Integer, Float> f39367j;

    /* JADX INFO: renamed from: k */
    public int f39368k;

    /* JADX INFO: renamed from: l */
    public int f39369l;

    /* JADX INFO: renamed from: m */
    public volatile List<LabelData> f39370m;

    /* JADX INFO: renamed from: n */
    public volatile List<LabelData> f39371n;

    /* JADX INFO: renamed from: o */
    public List<LabelData> f39372o;

    /* JADX INFO: renamed from: p */
    public int f39373p;

    /* JADX INFO: renamed from: q */
    public int f39374q;

    /* JADX INFO: renamed from: r */
    public int f39375r;

    /* JADX INFO: renamed from: s */
    public boolean f39376s;

    /* JADX INFO: renamed from: t */
    public boolean f39377t;

    /* JADX INFO: renamed from: u */
    public String f39378u;

    /* JADX INFO: renamed from: v */
    public C9323b f39379v;

    /* JADX INFO: renamed from: w */
    public int f39380w;

    /* JADX INFO: renamed from: x */
    public int f39381x;

    public static class LayoutData extends RectF {
        public RectF desRect;
        public int line;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CommonLabelShowView$a */
    public interface InterfaceC9322a {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CommonLabelShowView$b */
    public static class C9323b {

        /* JADX INFO: renamed from: a */
        public float f39382a;

        /* JADX INFO: renamed from: b */
        public float f39383b;

        /* JADX INFO: renamed from: c */
        public float f39384c;

        /* JADX INFO: renamed from: d */
        public float f39385d;

        /* JADX INFO: renamed from: e */
        public int f39386e;

        /* JADX INFO: renamed from: f */
        public int f39387f;

        /* JADX INFO: renamed from: g */
        public float f39388g;

        /* JADX INFO: renamed from: h */
        public float f39389h;

        /* JADX INFO: renamed from: i */
        public float f39390i;

        public C9323b() {
            int i = qa00.f156318e;
            this.f39382a = i;
            this.f39383b = i;
            this.f39384c = i;
            this.f39385d = i;
            this.f39386e = -6686;
            this.f39388g = qa00.m175859d(10.0f);
            this.f39390i = qa00.m175859d(6.0f);
            this.f39387f = -872415232;
        }
    }

    public CommonLabelShowView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39366i = new ArrayList();
        this.f39367j = new HashMap();
        this.f39370m = new ArrayList();
        this.f39371n = new ArrayList();
        this.f39372o = new ArrayList();
        this.f39377t = false;
        m60700c(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public static int m60698b(float f) {
        return (int) (App.f16088e.getResources().getDisplayMetrics().density * f);
    }

    /* JADX INFO: renamed from: a */
    public final void m60699a() {
        Float f;
        for (LayoutData layoutData : this.f39366i) {
            int i = layoutData.line;
            if (!this.f39367j.isEmpty() && (f = this.f39367j.get(Integer.valueOf(i))) != null) {
                float fFloatValue = f.floatValue() / 2.0f;
                ((RectF) layoutData).left += fFloatValue;
                ((RectF) layoutData).right += fFloatValue;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m60700c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xhc0.f194325d);
        int color = typedArrayObtainStyledAttributes.getColor(xhc0.f194327e, 134217728);
        int color2 = typedArrayObtainStyledAttributes.getColor(xhc0.f194340m, -872415232);
        this.f39376s = typedArrayObtainStyledAttributes.getBoolean(xhc0.f194339l, false);
        this.f39374q = typedArrayObtainStyledAttributes.getInt(xhc0.f194333h, 100);
        this.f39375r = typedArrayObtainStyledAttributes.getInt(xhc0.f194331g, 5);
        this.f39369l = typedArrayObtainStyledAttributes.getDimensionPixelSize(xhc0.f194335i, qa00.m175859d(10.0f));
        if (typedArrayObtainStyledAttributes.getBoolean(xhc0.f194329f, false)) {
            int color3 = typedArrayObtainStyledAttributes.getColor(xhc0.f194337j, 167772160);
            this.f39373p = typedArrayObtainStyledAttributes.getDimensionPixelSize(xhc0.f194338k, 0);
            Paint paint = new Paint();
            this.f39360c = paint;
            paint.setAntiAlias(true);
            this.f39360c.setColor(color3);
            this.f39360c.setStyle(Paint.Style.STROKE);
            this.f39360c.setStrokeWidth(this.f39373p);
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f39358a = paint2;
        paint2.setAntiAlias(true);
        this.f39358a.setColor(color);
        Paint paint3 = this.f39358a;
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f39359b = paint4;
        paint4.setAntiAlias(true);
        this.f39359b.setColor(117440512);
        this.f39359b.setStyle(style);
        Paint paint5 = new Paint();
        this.f39361d = paint5;
        paint5.setAntiAlias(true);
        Paint paint6 = new Paint();
        this.f39362e = paint6;
        paint6.setAntiAlias(true);
        this.f39362e.setTypeface(lyh0.m156283c(3));
        this.f39362e.setColor(color2);
        this.f39362e.setTextSize(m60698b(14.0f));
        this.f39380w = 44;
        this.f39381x = 8;
        this.f39379v = new C9323b();
        TextPaint textPaint = new TextPaint();
        this.f39363f = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        m60702e();
        m60703f();
    }

    /* JADX INFO: renamed from: d */
    public boolean m60701d(List<LabelData> list) {
        if (jyb.m147479J(list) || jyb.m147479J(this.f39371n) || list.size() != this.f39371n.size()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals(list.get(i).name, this.f39371n.get(i).name)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m60702e() {
        this.f39363f.setTextSize(this.f39379v.f39388g);
        this.f39363f.setColor(this.f39379v.f39387f);
        this.f39363f.setAntiAlias(true);
        this.f39363f.setFakeBoldText(true);
        Rect rect = new Rect();
        this.f39363f.getTextBounds("你符合", 0, 1, rect);
        this.f39379v.f39389h = rect.bottom - rect.top;
    }

    /* JADX INFO: renamed from: f */
    public final void m60703f() {
        Rect rect = new Rect();
        this.f39362e.getTextBounds("高", 0, 1, rect);
        int i = rect.bottom - rect.top;
        this.f39365h = (((m60698b(this.f39380w) - i) / 2) + i) - m60698b(1.0f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < this.f39372o.size(); i++) {
            LayoutData layoutData = this.f39366i.get(i);
            LabelData labelData = this.f39372o.get(i);
            boolean z = labelData.highlight;
            int i2 = this.f39369l;
            if (z) {
                canvas.drawRoundRect(layoutData, i2, i2, this.f39358a);
            } else {
                canvas.drawRoundRect(layoutData, i2, i2, this.f39359b);
            }
            if (i == 0 && this.f39377t && NullChecker.m82486a(null)) {
                float f = ((RectF) layoutData).left;
                throw null;
            }
            if (this.f39360c != null) {
                RectF rectF = new RectF();
                float f2 = this.f39373p / 2;
                rectF.top = ((RectF) layoutData).top + f2;
                rectF.left = ((RectF) layoutData).left + f2;
                rectF.right = ((RectF) layoutData).right - f2;
                rectF.bottom = ((RectF) layoutData).bottom - f2;
                int i3 = this.f39369l;
                canvas.drawRoundRect(rectF, i3, i3, this.f39360c);
            }
            String str = this.f39372o.get(i).name;
            Rect rect = new Rect();
            this.f39362e.getTextBounds(str, 0, str.length(), rect);
            float f3 = rect.right - rect.left;
            float fM60698b = (((RectF) layoutData).right - ((RectF) layoutData).left) - m60698b(16.0f);
            if (f3 <= fM60698b) {
                canvas.drawText(str, ((RectF) layoutData).left + m60698b(16.0f), ((RectF) layoutData).top + this.f39365h, this.f39362e);
            } else {
                int length = (int) (str.length() * (fM60698b / f3));
                if (length > 1) {
                    length--;
                }
                canvas.drawText(str.substring(0, length).concat("..."), ((RectF) layoutData).left + m60698b(16.0f), ((RectF) layoutData).top + this.f39365h, this.f39362e);
            }
            if (!TextUtils.isEmpty(labelData.desStr)) {
                this.f39363f.setColor(-1);
                this.f39363f.setStyle(Paint.Style.STROKE);
                this.f39363f.setStrokeWidth(this.f39379v.f39390i);
                RectF rectF2 = layoutData.desRect;
                int i4 = qa00.f156320g;
                canvas.drawRoundRect(rectF2, i4, i4, this.f39363f);
                this.f39363f.setStyle(Paint.Style.FILL);
                this.f39363f.setColor(this.f39379v.f39386e);
                canvas.drawRoundRect(layoutData.desRect, i4, i4, this.f39363f);
                this.f39363f.setColor(this.f39379v.f39387f);
                String str2 = labelData.desStr;
                RectF rectF3 = layoutData.desRect;
                canvas.drawText(str2, (rectF3.right + rectF3.left) / 2.0f, ((rectF3.bottom + rectF3.top) / 2.0f) + (this.f39379v.f39389h / 2.3f), this.f39363f);
            }
        }
        this.f39377t = false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        this.f39364g = View.MeasureSpec.getSize(i);
        int measuredHeight = getMeasuredHeight();
        if (this.f39364g > 0 && !m60701d(this.f39370m) && measuredHeight > 0 && measuredHeight == this.f39368k) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), this.f39368k);
            return;
        }
        this.f39366i.clear();
        this.f39372o.clear();
        int i4 = this.f39370m.size() > 0 ? 1 : 0;
        float fM60698b = 0.0f;
        for (int i5 = 0; i5 < this.f39370m.size() && (((i3 = this.f39374q) == 0 || i5 < i3) && i4 <= this.f39375r); i5++) {
            if (!TextUtils.isEmpty(this.f39370m.get(i5).name)) {
                int iM175859d = (i4 - 1) * qa00.m175859d(this.f39380w + this.f39381x);
                LayoutData layoutData = new LayoutData();
                float fMeasureText = this.f39362e.measureText(this.f39370m.get(i5).name);
                float fM60698b2 = fM60698b + fMeasureText + m60698b(40.0f);
                layoutData.line = i4;
                if (fM60698b2 > this.f39364g) {
                    int i6 = i4 + 1;
                    if (i6 > this.f39375r) {
                        break;
                    }
                    int i7 = this.f39374q;
                    if (i6 > i7) {
                        i4 = i7;
                        break;
                    }
                    float fM60698b3 = fMeasureText + m60698b(32.0f);
                    int i8 = this.f39364g;
                    float f = fM60698b3 > ((float) i8) ? i8 : fM60698b3;
                    int iM175859d2 = i4 * qa00.m175859d(this.f39380w + this.f39381x);
                    ((RectF) layoutData).left = 0.0f;
                    ((RectF) layoutData).top = iM175859d2;
                    ((RectF) layoutData).right = f;
                    ((RectF) layoutData).bottom = m60698b(this.f39380w) + iM175859d2;
                    layoutData.line = i6;
                    this.f39367j.put(Integer.valueOf(i6), Float.valueOf(this.f39364g - f));
                    this.f39366i.add(layoutData);
                    this.f39372o.add(this.f39370m.get(i5));
                    i4 = i6;
                    fM60698b = f;
                } else {
                    ((RectF) layoutData).left = fM60698b == 0.0f ? 0.0f : fM60698b + m60698b(8.0f);
                    ((RectF) layoutData).top = iM175859d;
                    fM60698b = fM60698b == 0.0f ? fMeasureText + m60698b(32.0f) : fM60698b2;
                    ((RectF) layoutData).right = fM60698b;
                    ((RectF) layoutData).bottom = m60698b(this.f39380w) + iM175859d;
                    this.f39366i.add(layoutData);
                    this.f39372o.add(this.f39370m.get(i5));
                    this.f39367j.put(Integer.valueOf(i4), Float.valueOf(this.f39364g - fM60698b));
                }
            }
        }
        if (!jyb.m147479J(this.f39366i)) {
            for (int i9 = 0; i9 < this.f39366i.size(); i9++) {
                LayoutData layoutData2 = this.f39366i.get(i9);
                LabelData labelData = this.f39370m.get(i9);
                if (!TextUtils.isEmpty(labelData.desStr)) {
                    float fMeasureText2 = this.f39363f.measureText(labelData.desStr);
                    C9323b c9323b = this.f39379v;
                    float f2 = fMeasureText2 + c9323b.f39382a + c9323b.f39384c;
                    float f3 = c9323b.f39389h + c9323b.f39383b + c9323b.f39385d;
                    float f4 = ((RectF) layoutData2).right;
                    int i10 = qa00.f156316c;
                    float f5 = (i10 + f4) - f2;
                    float f6 = ((RectF) layoutData2).top;
                    float f7 = f3 / 2.0f;
                    layoutData2.desRect = new RectF(f5, f6 - f7, f4 + i10, f6 + f7);
                }
            }
        }
        if (this.f39376s) {
            m60699a();
        }
        int iM60698b = i4 > 0 ? m60698b((this.f39380w * i4) + (this.f39381x * (i4 - 1))) : 0;
        this.f39368k = iM60698b;
        this.f39371n.clear();
        this.f39371n.addAll(this.f39370m);
        setMeasuredDimension(View.MeasureSpec.getSize(i), iM60698b);
    }

    public void setFirstLabelShowCallback(InterfaceC9322a interfaceC9322a) {
    }

    public void setItemHeight(int i) {
        this.f39380w = i;
        m60703f();
    }

    public void setLabel(List<LabelData> list) {
        if (m60701d(list)) {
            this.f39377t = true;
            this.f39372o.clear();
            this.f39370m.clear();
            this.f39370m.addAll(list);
            requestLayout();
            postInvalidate();
        }
    }

    public void setTagBackgroundPaintLight(@ColorInt int i) {
        this.f39358a.setColor(i);
    }

    public void setTestKey(String str) {
        this.f39378u = str;
    }

    public CommonLabelShowView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommonLabelShowView(Context context) {
        this(context, null);
    }
}
