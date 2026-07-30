package com.p051p1.mobile.putong.core.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
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
import p153l.c9c0;
import p153l.jyb;
import p153l.khc0;
import p153l.lyh0;
import p153l.qa00;

/* JADX INFO: loaded from: classes12.dex */
public class CardLabelShowView3 extends View {

    /* JADX INFO: renamed from: a */
    public Paint f39311a;

    /* JADX INFO: renamed from: b */
    public Paint f39312b;

    /* JADX INFO: renamed from: c */
    public Paint f39313c;

    /* JADX INFO: renamed from: d */
    public Paint f39314d;

    /* JADX INFO: renamed from: e */
    public Paint f39315e;

    /* JADX INFO: renamed from: f */
    public int f39316f;

    /* JADX INFO: renamed from: g */
    public int f39317g;

    /* JADX INFO: renamed from: h */
    public List<LayoutData> f39318h;

    /* JADX INFO: renamed from: i */
    public Map<Integer, Float> f39319i;

    /* JADX INFO: renamed from: j */
    public int f39320j;

    /* JADX INFO: renamed from: k */
    public int f39321k;

    /* JADX INFO: renamed from: l */
    public volatile List<LabelData> f39322l;

    /* JADX INFO: renamed from: m */
    public volatile List<LabelData> f39323m;

    /* JADX INFO: renamed from: n */
    public List<LabelData> f39324n;

    /* JADX INFO: renamed from: o */
    public int f39325o;

    /* JADX INFO: renamed from: p */
    public int f39326p;

    /* JADX INFO: renamed from: q */
    public int f39327q;

    /* JADX INFO: renamed from: r */
    public boolean f39328r;

    /* JADX INFO: renamed from: s */
    public InterfaceC9320a f39329s;

    /* JADX INFO: renamed from: t */
    public boolean f39330t;

    /* JADX INFO: renamed from: u */
    public String f39331u;

    public static class LayoutData extends RectF {
        public int line;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CardLabelShowView3$a */
    public interface InterfaceC9320a {
        /* JADX INFO: renamed from: a */
        void mo60692a(int i, int i2, int i3, boolean z);
    }

    public CardLabelShowView3(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39318h = new ArrayList();
        this.f39319i = new HashMap();
        this.f39322l = new ArrayList();
        this.f39323m = new ArrayList();
        this.f39324n = new ArrayList();
        this.f39330t = false;
        m60689c(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public static int m60687b(float f) {
        return (int) (App.f16088e.getResources().getDisplayMetrics().density * f);
    }

    /* JADX INFO: renamed from: a */
    public final void m60688a() {
        Float f;
        for (LayoutData layoutData : this.f39318h) {
            int i = layoutData.line;
            if (!this.f39319i.isEmpty() && (f = this.f39319i.get(Integer.valueOf(i))) != null) {
                float fFloatValue = f.floatValue() / 2.0f;
                ((RectF) layoutData).left += fFloatValue;
                ((RectF) layoutData).right += fFloatValue;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m60689c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khc0.f126852x);
        int color = typedArrayObtainStyledAttributes.getColor(khc0.f126855y, App.f16088e.getResources().getColor(c9c0.f80372S));
        this.f39328r = typedArrayObtainStyledAttributes.getBoolean(khc0.f126724F, false);
        this.f39326p = typedArrayObtainStyledAttributes.getInt(khc0.f126712B, 100);
        this.f39327q = typedArrayObtainStyledAttributes.getInt(khc0.f126709A, 5);
        this.f39321k = typedArrayObtainStyledAttributes.getDimensionPixelSize(khc0.f126715C, qa00.m175859d(10.0f));
        if (typedArrayObtainStyledAttributes.getBoolean(khc0.f126858z, false)) {
            int color2 = typedArrayObtainStyledAttributes.getColor(khc0.f126718D, App.f16088e.getResources().getColor(c9c0.f80375T));
            this.f39325o = typedArrayObtainStyledAttributes.getDimensionPixelSize(khc0.f126721E, 0);
            Paint paint = new Paint();
            this.f39313c = paint;
            paint.setAntiAlias(true);
            this.f39313c.setColor(color2);
            this.f39313c.setStyle(Paint.Style.STROKE);
            this.f39313c.setStrokeWidth(this.f39325o);
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f39311a = paint2;
        paint2.setAntiAlias(true);
        this.f39311a.setColor(color);
        Paint paint3 = this.f39311a;
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f39312b = paint4;
        paint4.setAntiAlias(true);
        this.f39312b.setColor(117440512);
        this.f39312b.setStyle(style);
        Paint paint5 = new Paint();
        this.f39314d = paint5;
        paint5.setAntiAlias(true);
        Paint paint6 = new Paint();
        this.f39315e = paint6;
        paint6.setAntiAlias(true);
        this.f39315e.setTypeface(lyh0.m156283c(3));
        this.f39315e.setColor(App.f16088e.getResources().getColor(c9c0.f80449q0));
        this.f39315e.setTextSize(m60687b(14.0f));
        Rect rect = new Rect();
        this.f39315e.getTextBounds("高", 0, 1, rect);
        int i = rect.bottom - rect.top;
        this.f39317g = (((m60687b(44.0f) - i) / 2) + i) - m60687b(1.0f);
    }

    /* JADX INFO: renamed from: d */
    public boolean m60690d(List<LabelData> list) {
        if (jyb.m147479J(list) || jyb.m147479J(this.f39323m) || list.size() != this.f39323m.size()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals(list.get(i).name, this.f39323m.get(i).name)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m60691e(int i, int i2, int i3) {
        this.f39327q = i;
        this.f39326p = i2;
        this.f39321k = i3;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < this.f39324n.size(); i++) {
            LayoutData layoutData = this.f39318h.get(i);
            LabelData labelData = this.f39324n.get(i);
            boolean z = labelData.highlight;
            int i2 = this.f39321k;
            if (z) {
                canvas.drawRoundRect(layoutData, i2, i2, this.f39311a);
            } else {
                canvas.drawRoundRect(layoutData, i2, i2, this.f39312b);
            }
            if (i == 0 && this.f39330t && NullChecker.m82486a(this.f39329s)) {
                this.f39329s.mo60692a((int) ((RectF) layoutData).left, (int) ((RectF) layoutData).right, (int) (((RectF) layoutData).bottom - ((RectF) layoutData).top), labelData.highlight);
            }
            if (this.f39313c != null) {
                RectF rectF = new RectF();
                float f = this.f39325o / 2;
                rectF.top = ((RectF) layoutData).top + f;
                rectF.left = ((RectF) layoutData).left + f;
                rectF.right = ((RectF) layoutData).right - f;
                rectF.bottom = ((RectF) layoutData).bottom - f;
                int i3 = this.f39321k;
                canvas.drawRoundRect(rectF, i3, i3, this.f39313c);
            }
            String str = this.f39324n.get(i).name;
            Rect rect = new Rect();
            this.f39315e.getTextBounds(str, 0, str.length(), rect);
            this.f39315e.setTypeface(lyh0.m156283c(3));
            float f2 = rect.right - rect.left;
            float fM60687b = (((RectF) layoutData).right - ((RectF) layoutData).left) - m60687b(16.0f);
            if (f2 <= fM60687b) {
                canvas.drawText(str, ((RectF) layoutData).left + m60687b(16.0f), ((RectF) layoutData).top + this.f39317g, this.f39315e);
            } else {
                int length = (int) (str.length() * (fM60687b / f2));
                if (length > 1) {
                    length--;
                }
                canvas.drawText(str.substring(0, length).concat("..."), ((RectF) layoutData).left + m60687b(16.0f), ((RectF) layoutData).top + this.f39317g, this.f39315e);
            }
        }
        this.f39330t = false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        this.f39316f = View.MeasureSpec.getSize(i);
        int measuredHeight = getMeasuredHeight();
        if (this.f39316f > 0 && !m60690d(this.f39322l) && measuredHeight > 0 && measuredHeight == this.f39320j) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), this.f39320j);
            return;
        }
        this.f39318h.clear();
        this.f39324n.clear();
        int i4 = this.f39322l.size() > 0 ? 1 : 0;
        float fM60687b = 0.0f;
        for (int i5 = 0; i5 < this.f39322l.size() && ((i3 = this.f39326p) == 0 || i5 < i3); i5++) {
            if (!TextUtils.isEmpty(this.f39322l.get(i5).name)) {
                int iM60687b = (i4 - 1) * m60687b(52.0f);
                LayoutData layoutData = new LayoutData();
                float fMeasureText = this.f39315e.measureText(this.f39322l.get(i5).name);
                float fM60687b2 = fM60687b + fMeasureText + m60687b(40.0f);
                layoutData.line = i4;
                if (fM60687b2 > this.f39316f) {
                    int i6 = i4 + 1;
                    int i7 = this.f39326p;
                    if (i6 > i7) {
                        i4 = i7;
                        break;
                    }
                    float fM60687b3 = fMeasureText + m60687b(32.0f);
                    int i8 = this.f39316f;
                    float f = fM60687b3 > ((float) i8) ? i8 : fM60687b3;
                    int iM60687b2 = i4 * m60687b(52.0f);
                    ((RectF) layoutData).left = 0.0f;
                    ((RectF) layoutData).top = iM60687b2;
                    ((RectF) layoutData).right = f;
                    ((RectF) layoutData).bottom = m60687b(44.0f) + iM60687b2;
                    layoutData.line = i6;
                    this.f39319i.put(Integer.valueOf(i6), Float.valueOf(this.f39316f - f));
                    this.f39318h.add(layoutData);
                    this.f39324n.add(this.f39322l.get(i5));
                    i4 = i6;
                    fM60687b = f;
                } else {
                    ((RectF) layoutData).left = fM60687b == 0.0f ? 0.0f : fM60687b + m60687b(8.0f);
                    ((RectF) layoutData).top = iM60687b;
                    fM60687b = fM60687b == 0.0f ? fMeasureText + m60687b(32.0f) : fM60687b2;
                    ((RectF) layoutData).right = fM60687b;
                    ((RectF) layoutData).bottom = m60687b(44.0f) + iM60687b;
                    this.f39318h.add(layoutData);
                    this.f39324n.add(this.f39322l.get(i5));
                    this.f39319i.put(Integer.valueOf(i4), Float.valueOf(this.f39316f - fM60687b));
                }
            }
        }
        if (this.f39328r) {
            m60688a();
        }
        int iM60687b3 = i4 > 0 ? m60687b((i4 * 44) + ((i4 - 1) * 8)) : 0;
        this.f39320j = iM60687b3;
        this.f39323m.clear();
        this.f39323m.addAll(this.f39322l);
        setMeasuredDimension(View.MeasureSpec.getSize(i), iM60687b3);
    }

    public void setFirstLabelShowCallback(InterfaceC9320a interfaceC9320a) {
        this.f39329s = interfaceC9320a;
    }

    public void setLabel(List<LabelData> list) {
        if (m60690d(list)) {
            this.f39330t = true;
            this.f39324n.clear();
            this.f39322l.clear();
            this.f39322l.addAll(list);
            requestLayout();
            postInvalidate();
        }
    }

    public void setTagBackgroundPaintLight(@ColorInt int i) {
        this.f39311a.setColor(i);
    }

    public void setTestKey(String str) {
        this.f39331u = str;
    }

    public CardLabelShowView3(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardLabelShowView3(Context context) {
        this(context, null);
    }
}
