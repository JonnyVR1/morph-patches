package com.p000p1.mobile.putong.core.view;

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
import com.p000p1.mobile.putong.core.data.LabelData;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.eqh0;
import l.r9c0;
import l.t100;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CommonLabelShowView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f2452a;

    /* JADX INFO: renamed from: b */
    public Paint f2453b;

    /* JADX INFO: renamed from: c */
    public Paint f2454c;

    /* JADX INFO: renamed from: d */
    public Paint f2455d;

    /* JADX INFO: renamed from: e */
    public Paint f2456e;

    /* JADX INFO: renamed from: f */
    public Paint f2457f;

    /* JADX INFO: renamed from: g */
    public int f2458g;

    /* JADX INFO: renamed from: h */
    public int f2459h;

    /* JADX INFO: renamed from: i */
    public List<LayoutData> f2460i;

    /* JADX INFO: renamed from: j */
    public Map<Integer, Float> f2461j;

    /* JADX INFO: renamed from: k */
    public int f2462k;

    /* JADX INFO: renamed from: l */
    public int f2463l;

    /* JADX INFO: renamed from: m */
    public volatile List<LabelData> f2464m;

    /* JADX INFO: renamed from: n */
    public volatile List<LabelData> f2465n;

    /* JADX INFO: renamed from: o */
    public List<LabelData> f2466o;

    /* JADX INFO: renamed from: p */
    public int f2467p;

    /* JADX INFO: renamed from: q */
    public int f2468q;

    /* JADX INFO: renamed from: r */
    public int f2469r;

    /* JADX INFO: renamed from: s */
    public boolean f2470s;

    /* JADX INFO: renamed from: t */
    public boolean f2471t;

    /* JADX INFO: renamed from: u */
    public String f2472u;

    /* JADX INFO: renamed from: v */
    public C3258b f2473v;

    /* JADX INFO: renamed from: w */
    public int f2474w;

    /* JADX INFO: renamed from: x */
    public int f2475x;

    public static class LayoutData extends RectF {
        public RectF desRect;
        public int line;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CommonLabelShowView$a */
    public interface InterfaceC3257a {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CommonLabelShowView$b */
    public static class C3258b {

        /* JADX INFO: renamed from: a */
        public float f2476a;

        /* JADX INFO: renamed from: b */
        public float f2477b;

        /* JADX INFO: renamed from: c */
        public float f2478c;

        /* JADX INFO: renamed from: d */
        public float f2479d;

        /* JADX INFO: renamed from: e */
        public int f2480e;

        /* JADX INFO: renamed from: f */
        public int f2481f;

        /* JADX INFO: renamed from: g */
        public float f2482g;

        /* JADX INFO: renamed from: h */
        public float f2483h;

        /* JADX INFO: renamed from: i */
        public float f2484i;

        public C3258b() {
            int i = t100.e;
            this.f2476a = i;
            this.f2477b = i;
            this.f2478c = i;
            this.f2479d = i;
            this.f2480e = -6686;
            this.f2482g = t100.d(10.0f);
            this.f2484i = t100.d(6.0f);
            this.f2481f = -872415232;
        }
    }

    public CommonLabelShowView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2460i = new ArrayList();
        this.f2461j = new HashMap();
        this.f2464m = new ArrayList();
        this.f2465n = new ArrayList();
        this.f2466o = new ArrayList();
        this.f2471t = false;
        m4925c(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public static int m4923b(float f) {
        return (int) (App.e.getResources().getDisplayMetrics().density * f);
    }

    /* JADX INFO: renamed from: a */
    public final void m4924a() {
        Float f;
        for (LayoutData layoutData : this.f2460i) {
            int i = layoutData.line;
            if (!this.f2461j.isEmpty() && (f = this.f2461j.get(Integer.valueOf(i))) != null) {
                float fFloatValue = f.floatValue() / 2.0f;
                ((RectF) layoutData).left += fFloatValue;
                ((RectF) layoutData).right += fFloatValue;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4925c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9c0.d);
        int color = typedArrayObtainStyledAttributes.getColor(r9c0.e, 134217728);
        int color2 = typedArrayObtainStyledAttributes.getColor(r9c0.m, -872415232);
        this.f2470s = typedArrayObtainStyledAttributes.getBoolean(r9c0.l, false);
        this.f2468q = typedArrayObtainStyledAttributes.getInt(r9c0.h, 100);
        this.f2469r = typedArrayObtainStyledAttributes.getInt(r9c0.g, 5);
        this.f2463l = typedArrayObtainStyledAttributes.getDimensionPixelSize(r9c0.i, t100.d(10.0f));
        if (typedArrayObtainStyledAttributes.getBoolean(r9c0.f, false)) {
            int color3 = typedArrayObtainStyledAttributes.getColor(r9c0.j, 167772160);
            this.f2467p = typedArrayObtainStyledAttributes.getDimensionPixelSize(r9c0.k, 0);
            Paint paint = new Paint();
            this.f2454c = paint;
            paint.setAntiAlias(true);
            this.f2454c.setColor(color3);
            this.f2454c.setStyle(Paint.Style.STROKE);
            this.f2454c.setStrokeWidth(this.f2467p);
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f2452a = paint2;
        paint2.setAntiAlias(true);
        this.f2452a.setColor(color);
        Paint paint3 = this.f2452a;
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f2453b = paint4;
        paint4.setAntiAlias(true);
        this.f2453b.setColor(117440512);
        this.f2453b.setStyle(style);
        Paint paint5 = new Paint();
        this.f2455d = paint5;
        paint5.setAntiAlias(true);
        Paint paint6 = new Paint();
        this.f2456e = paint6;
        paint6.setAntiAlias(true);
        this.f2456e.setTypeface(eqh0.c(3));
        this.f2456e.setColor(color2);
        this.f2456e.setTextSize(m4923b(14.0f));
        this.f2474w = 44;
        this.f2475x = 8;
        this.f2473v = new C3258b();
        TextPaint textPaint = new TextPaint();
        this.f2457f = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        m4927e();
        m4928f();
    }

    /* JADX INFO: renamed from: d */
    public boolean m4926d(List<LabelData> list) {
        if (vwb.J(list) || vwb.J(this.f2465n) || list.size() != this.f2465n.size()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals(list.get(i).name, this.f2465n.get(i).name)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m4927e() {
        this.f2457f.setTextSize(this.f2473v.f2482g);
        this.f2457f.setColor(this.f2473v.f2481f);
        this.f2457f.setAntiAlias(true);
        this.f2457f.setFakeBoldText(true);
        Rect rect = new Rect();
        this.f2457f.getTextBounds("你符合", 0, 1, rect);
        this.f2473v.f2483h = rect.bottom - rect.top;
    }

    /* JADX INFO: renamed from: f */
    public final void m4928f() {
        Rect rect = new Rect();
        this.f2456e.getTextBounds("高", 0, 1, rect);
        int i = rect.bottom - rect.top;
        this.f2459h = (((m4923b(this.f2474w) - i) / 2) + i) - m4923b(1.0f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < this.f2466o.size(); i++) {
            LayoutData layoutData = this.f2460i.get(i);
            LabelData labelData = this.f2466o.get(i);
            boolean z = labelData.highlight;
            int i2 = this.f2463l;
            if (z) {
                canvas.drawRoundRect(layoutData, i2, i2, this.f2452a);
            } else {
                canvas.drawRoundRect(layoutData, i2, i2, this.f2453b);
            }
            if (i == 0 && this.f2471t && NullChecker.a((Object) null)) {
                float f = ((RectF) layoutData).left;
                throw null;
            }
            if (this.f2454c != null) {
                RectF rectF = new RectF();
                float f2 = this.f2467p / 2;
                rectF.top = ((RectF) layoutData).top + f2;
                rectF.left = ((RectF) layoutData).left + f2;
                rectF.right = ((RectF) layoutData).right - f2;
                rectF.bottom = ((RectF) layoutData).bottom - f2;
                int i3 = this.f2463l;
                canvas.drawRoundRect(rectF, i3, i3, this.f2454c);
            }
            String str = this.f2466o.get(i).name;
            Rect rect = new Rect();
            this.f2456e.getTextBounds(str, 0, str.length(), rect);
            float f3 = rect.right - rect.left;
            float fM4923b = (((RectF) layoutData).right - ((RectF) layoutData).left) - m4923b(16.0f);
            if (f3 <= fM4923b) {
                canvas.drawText(str, ((RectF) layoutData).left + m4923b(16.0f), ((RectF) layoutData).top + this.f2459h, this.f2456e);
            } else {
                int length = (int) (str.length() * (fM4923b / f3));
                if (length > 1) {
                    length--;
                }
                canvas.drawText(str.substring(0, length).concat("..."), ((RectF) layoutData).left + m4923b(16.0f), ((RectF) layoutData).top + this.f2459h, this.f2456e);
            }
            if (!TextUtils.isEmpty(labelData.desStr)) {
                this.f2457f.setColor(-1);
                this.f2457f.setStyle(Paint.Style.STROKE);
                this.f2457f.setStrokeWidth(this.f2473v.f2484i);
                RectF rectF2 = layoutData.desRect;
                int i4 = t100.g;
                canvas.drawRoundRect(rectF2, i4, i4, this.f2457f);
                this.f2457f.setStyle(Paint.Style.FILL);
                this.f2457f.setColor(this.f2473v.f2480e);
                canvas.drawRoundRect(layoutData.desRect, i4, i4, this.f2457f);
                this.f2457f.setColor(this.f2473v.f2481f);
                String str2 = labelData.desStr;
                RectF rectF3 = layoutData.desRect;
                canvas.drawText(str2, (rectF3.right + rectF3.left) / 2.0f, ((rectF3.bottom + rectF3.top) / 2.0f) + (this.f2473v.f2483h / 2.3f), this.f2457f);
            }
        }
        this.f2471t = false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        this.f2458g = View.MeasureSpec.getSize(i);
        int measuredHeight = getMeasuredHeight();
        if (this.f2458g > 0 && !m4926d(this.f2464m) && measuredHeight > 0 && measuredHeight == this.f2462k) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), this.f2462k);
            return;
        }
        this.f2460i.clear();
        this.f2466o.clear();
        int i4 = this.f2464m.size() > 0 ? 1 : 0;
        float fM4923b = 0.0f;
        for (int i5 = 0; i5 < this.f2464m.size() && (((i3 = this.f2468q) == 0 || i5 < i3) && i4 <= this.f2469r); i5++) {
            if (!TextUtils.isEmpty(this.f2464m.get(i5).name)) {
                int iD = (i4 - 1) * t100.d(this.f2474w + this.f2475x);
                LayoutData layoutData = new LayoutData();
                float fMeasureText = this.f2456e.measureText(this.f2464m.get(i5).name);
                float fM4923b2 = fM4923b + fMeasureText + m4923b(40.0f);
                layoutData.line = i4;
                if (fM4923b2 > this.f2458g) {
                    int i6 = i4 + 1;
                    if (i6 > this.f2469r) {
                        break;
                    }
                    int i7 = this.f2468q;
                    if (i6 > i7) {
                        i4 = i7;
                        break;
                    }
                    float fM4923b3 = fMeasureText + m4923b(32.0f);
                    int i8 = this.f2458g;
                    float f = fM4923b3 > ((float) i8) ? i8 : fM4923b3;
                    int iD2 = i4 * t100.d(this.f2474w + this.f2475x);
                    ((RectF) layoutData).left = 0.0f;
                    ((RectF) layoutData).top = iD2;
                    ((RectF) layoutData).right = f;
                    ((RectF) layoutData).bottom = m4923b(this.f2474w) + iD2;
                    layoutData.line = i6;
                    this.f2461j.put(Integer.valueOf(i6), Float.valueOf(this.f2458g - f));
                    this.f2460i.add(layoutData);
                    this.f2466o.add(this.f2464m.get(i5));
                    i4 = i6;
                    fM4923b = f;
                } else {
                    ((RectF) layoutData).left = fM4923b == 0.0f ? 0.0f : fM4923b + m4923b(8.0f);
                    ((RectF) layoutData).top = iD;
                    fM4923b = fM4923b == 0.0f ? fMeasureText + m4923b(32.0f) : fM4923b2;
                    ((RectF) layoutData).right = fM4923b;
                    ((RectF) layoutData).bottom = m4923b(this.f2474w) + iD;
                    this.f2460i.add(layoutData);
                    this.f2466o.add(this.f2464m.get(i5));
                    this.f2461j.put(Integer.valueOf(i4), Float.valueOf(this.f2458g - fM4923b));
                }
            }
        }
        if (!vwb.J(this.f2460i)) {
            for (int i9 = 0; i9 < this.f2460i.size(); i9++) {
                LayoutData layoutData2 = this.f2460i.get(i9);
                LabelData labelData = this.f2464m.get(i9);
                if (!TextUtils.isEmpty(labelData.desStr)) {
                    float fMeasureText2 = this.f2457f.measureText(labelData.desStr);
                    C3258b c3258b = this.f2473v;
                    float f2 = fMeasureText2 + c3258b.f2476a + c3258b.f2478c;
                    float f3 = c3258b.f2483h + c3258b.f2477b + c3258b.f2479d;
                    float f4 = ((RectF) layoutData2).right;
                    int i10 = t100.c;
                    float f5 = (i10 + f4) - f2;
                    float f6 = ((RectF) layoutData2).top;
                    float f7 = f3 / 2.0f;
                    layoutData2.desRect = new RectF(f5, f6 - f7, f4 + i10, f6 + f7);
                }
            }
        }
        if (this.f2470s) {
            m4924a();
        }
        int iM4923b = i4 > 0 ? m4923b((this.f2474w * i4) + (this.f2475x * (i4 - 1))) : 0;
        this.f2462k = iM4923b;
        this.f2465n.clear();
        this.f2465n.addAll(this.f2464m);
        setMeasuredDimension(View.MeasureSpec.getSize(i), iM4923b);
    }

    public void setFirstLabelShowCallback(InterfaceC3257a interfaceC3257a) {
    }

    public void setItemHeight(int i) {
        this.f2474w = i;
        m4928f();
    }

    public void setLabel(List<LabelData> list) {
        if (m4926d(list)) {
            this.f2471t = true;
            this.f2466o.clear();
            this.f2464m.clear();
            this.f2464m.addAll(list);
            requestLayout();
            postInvalidate();
        }
    }

    public void setTagBackgroundPaintLight(@ColorInt int i) {
        this.f2452a.setColor(i);
    }

    public void setTestKey(String str) {
        this.f2472u = str;
    }

    public CommonLabelShowView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommonLabelShowView(Context context) {
        this(context, null);
    }
}
