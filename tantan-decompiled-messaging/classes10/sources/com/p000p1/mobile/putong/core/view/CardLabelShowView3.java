package com.p000p1.mobile.putong.core.view;

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
import com.p000p1.mobile.putong.core.data.LabelData;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.e9c0;
import l.eqh0;
import l.t100;
import l.vwb;
import l.w0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CardLabelShowView3 extends View {

    /* JADX INFO: renamed from: a */
    public Paint f2405a;

    /* JADX INFO: renamed from: b */
    public Paint f2406b;

    /* JADX INFO: renamed from: c */
    public Paint f2407c;

    /* JADX INFO: renamed from: d */
    public Paint f2408d;

    /* JADX INFO: renamed from: e */
    public Paint f2409e;

    /* JADX INFO: renamed from: f */
    public int f2410f;

    /* JADX INFO: renamed from: g */
    public int f2411g;

    /* JADX INFO: renamed from: h */
    public List<LayoutData> f2412h;

    /* JADX INFO: renamed from: i */
    public Map<Integer, Float> f2413i;

    /* JADX INFO: renamed from: j */
    public int f2414j;

    /* JADX INFO: renamed from: k */
    public int f2415k;

    /* JADX INFO: renamed from: l */
    public volatile List<LabelData> f2416l;

    /* JADX INFO: renamed from: m */
    public volatile List<LabelData> f2417m;

    /* JADX INFO: renamed from: n */
    public List<LabelData> f2418n;

    /* JADX INFO: renamed from: o */
    public int f2419o;

    /* JADX INFO: renamed from: p */
    public int f2420p;

    /* JADX INFO: renamed from: q */
    public int f2421q;

    /* JADX INFO: renamed from: r */
    public boolean f2422r;

    /* JADX INFO: renamed from: s */
    public InterfaceC3255a f2423s;

    /* JADX INFO: renamed from: t */
    public boolean f2424t;

    /* JADX INFO: renamed from: u */
    public String f2425u;

    public static class LayoutData extends RectF {
        public int line;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CardLabelShowView3$a */
    public interface InterfaceC3255a {
        /* JADX INFO: renamed from: a */
        void m4917a(int i, int i2, int i3, boolean z);
    }

    public CardLabelShowView3(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2412h = new ArrayList();
        this.f2413i = new HashMap();
        this.f2416l = new ArrayList();
        this.f2417m = new ArrayList();
        this.f2418n = new ArrayList();
        this.f2424t = false;
        m4914c(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public static int m4912b(float f) {
        return (int) (App.e.getResources().getDisplayMetrics().density * f);
    }

    /* JADX INFO: renamed from: a */
    public final void m4913a() {
        Float f;
        for (LayoutData layoutData : this.f2412h) {
            int i = layoutData.line;
            if (!this.f2413i.isEmpty() && (f = this.f2413i.get(Integer.valueOf(i))) != null) {
                float fFloatValue = f.floatValue() / 2.0f;
                ((RectF) layoutData).left += fFloatValue;
                ((RectF) layoutData).right += fFloatValue;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4914c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.x);
        int color = typedArrayObtainStyledAttributes.getColor(e9c0.y, App.e.getResources().getColor(w0c0.R));
        this.f2422r = typedArrayObtainStyledAttributes.getBoolean(e9c0.F, false);
        this.f2420p = typedArrayObtainStyledAttributes.getInt(e9c0.B, 100);
        this.f2421q = typedArrayObtainStyledAttributes.getInt(e9c0.A, 5);
        this.f2415k = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.C, t100.d(10.0f));
        if (typedArrayObtainStyledAttributes.getBoolean(e9c0.z, false)) {
            int color2 = typedArrayObtainStyledAttributes.getColor(e9c0.D, App.e.getResources().getColor(w0c0.S));
            this.f2419o = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.E, 0);
            Paint paint = new Paint();
            this.f2407c = paint;
            paint.setAntiAlias(true);
            this.f2407c.setColor(color2);
            this.f2407c.setStyle(Paint.Style.STROKE);
            this.f2407c.setStrokeWidth(this.f2419o);
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f2405a = paint2;
        paint2.setAntiAlias(true);
        this.f2405a.setColor(color);
        Paint paint3 = this.f2405a;
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f2406b = paint4;
        paint4.setAntiAlias(true);
        this.f2406b.setColor(117440512);
        this.f2406b.setStyle(style);
        Paint paint5 = new Paint();
        this.f2408d = paint5;
        paint5.setAntiAlias(true);
        Paint paint6 = new Paint();
        this.f2409e = paint6;
        paint6.setAntiAlias(true);
        this.f2409e.setTypeface(eqh0.c(3));
        this.f2409e.setColor(App.e.getResources().getColor(w0c0.p0));
        this.f2409e.setTextSize(m4912b(14.0f));
        Rect rect = new Rect();
        this.f2409e.getTextBounds("高", 0, 1, rect);
        int i = rect.bottom - rect.top;
        this.f2411g = (((m4912b(44.0f) - i) / 2) + i) - m4912b(1.0f);
    }

    /* JADX INFO: renamed from: d */
    public boolean m4915d(List<LabelData> list) {
        if (vwb.J(list) || vwb.J(this.f2417m) || list.size() != this.f2417m.size()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals(list.get(i).name, this.f2417m.get(i).name)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m4916e(int i, int i2, int i3) {
        this.f2421q = i;
        this.f2420p = i2;
        this.f2415k = i3;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < this.f2418n.size(); i++) {
            LayoutData layoutData = this.f2412h.get(i);
            LabelData labelData = this.f2418n.get(i);
            boolean z = labelData.highlight;
            int i2 = this.f2415k;
            if (z) {
                canvas.drawRoundRect(layoutData, i2, i2, this.f2405a);
            } else {
                canvas.drawRoundRect(layoutData, i2, i2, this.f2406b);
            }
            if (i == 0 && this.f2424t && NullChecker.a(this.f2423s)) {
                this.f2423s.m4917a((int) ((RectF) layoutData).left, (int) ((RectF) layoutData).right, (int) (((RectF) layoutData).bottom - ((RectF) layoutData).top), labelData.highlight);
            }
            if (this.f2407c != null) {
                RectF rectF = new RectF();
                float f = this.f2419o / 2;
                rectF.top = ((RectF) layoutData).top + f;
                rectF.left = ((RectF) layoutData).left + f;
                rectF.right = ((RectF) layoutData).right - f;
                rectF.bottom = ((RectF) layoutData).bottom - f;
                int i3 = this.f2415k;
                canvas.drawRoundRect(rectF, i3, i3, this.f2407c);
            }
            String str = this.f2418n.get(i).name;
            Rect rect = new Rect();
            this.f2409e.getTextBounds(str, 0, str.length(), rect);
            this.f2409e.setTypeface(eqh0.c(3));
            float f2 = rect.right - rect.left;
            float fM4912b = (((RectF) layoutData).right - ((RectF) layoutData).left) - m4912b(16.0f);
            if (f2 <= fM4912b) {
                canvas.drawText(str, ((RectF) layoutData).left + m4912b(16.0f), ((RectF) layoutData).top + this.f2411g, this.f2409e);
            } else {
                int length = (int) (str.length() * (fM4912b / f2));
                if (length > 1) {
                    length--;
                }
                canvas.drawText(str.substring(0, length).concat("..."), ((RectF) layoutData).left + m4912b(16.0f), ((RectF) layoutData).top + this.f2411g, this.f2409e);
            }
        }
        this.f2424t = false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        this.f2410f = View.MeasureSpec.getSize(i);
        int measuredHeight = getMeasuredHeight();
        if (this.f2410f > 0 && !m4915d(this.f2416l) && measuredHeight > 0 && measuredHeight == this.f2414j) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), this.f2414j);
            return;
        }
        this.f2412h.clear();
        this.f2418n.clear();
        int i4 = this.f2416l.size() > 0 ? 1 : 0;
        float fM4912b = 0.0f;
        for (int i5 = 0; i5 < this.f2416l.size() && ((i3 = this.f2420p) == 0 || i5 < i3); i5++) {
            if (!TextUtils.isEmpty(this.f2416l.get(i5).name)) {
                int iM4912b = (i4 - 1) * m4912b(52.0f);
                LayoutData layoutData = new LayoutData();
                float fMeasureText = this.f2409e.measureText(this.f2416l.get(i5).name);
                float fM4912b2 = fM4912b + fMeasureText + m4912b(40.0f);
                layoutData.line = i4;
                if (fM4912b2 > this.f2410f) {
                    int i6 = i4 + 1;
                    int i7 = this.f2420p;
                    if (i6 > i7) {
                        i4 = i7;
                        break;
                    }
                    float fM4912b3 = fMeasureText + m4912b(32.0f);
                    int i8 = this.f2410f;
                    float f = fM4912b3 > ((float) i8) ? i8 : fM4912b3;
                    int iM4912b2 = i4 * m4912b(52.0f);
                    ((RectF) layoutData).left = 0.0f;
                    ((RectF) layoutData).top = iM4912b2;
                    ((RectF) layoutData).right = f;
                    ((RectF) layoutData).bottom = m4912b(44.0f) + iM4912b2;
                    layoutData.line = i6;
                    this.f2413i.put(Integer.valueOf(i6), Float.valueOf(this.f2410f - f));
                    this.f2412h.add(layoutData);
                    this.f2418n.add(this.f2416l.get(i5));
                    i4 = i6;
                    fM4912b = f;
                } else {
                    ((RectF) layoutData).left = fM4912b == 0.0f ? 0.0f : fM4912b + m4912b(8.0f);
                    ((RectF) layoutData).top = iM4912b;
                    fM4912b = fM4912b == 0.0f ? fMeasureText + m4912b(32.0f) : fM4912b2;
                    ((RectF) layoutData).right = fM4912b;
                    ((RectF) layoutData).bottom = m4912b(44.0f) + iM4912b;
                    this.f2412h.add(layoutData);
                    this.f2418n.add(this.f2416l.get(i5));
                    this.f2413i.put(Integer.valueOf(i4), Float.valueOf(this.f2410f - fM4912b));
                }
            }
        }
        if (this.f2422r) {
            m4913a();
        }
        int iM4912b3 = i4 > 0 ? m4912b((i4 * 44) + ((i4 - 1) * 8)) : 0;
        this.f2414j = iM4912b3;
        this.f2417m.clear();
        this.f2417m.addAll(this.f2416l);
        setMeasuredDimension(View.MeasureSpec.getSize(i), iM4912b3);
    }

    public void setFirstLabelShowCallback(InterfaceC3255a interfaceC3255a) {
        this.f2423s = interfaceC3255a;
    }

    public void setLabel(List<LabelData> list) {
        if (m4915d(list)) {
            this.f2424t = true;
            this.f2418n.clear();
            this.f2416l.clear();
            this.f2416l.addAll(list);
            requestLayout();
            postInvalidate();
        }
    }

    public void setTagBackgroundPaintLight(@ColorInt int i) {
        this.f2405a.setColor(i);
    }

    public void setTestKey(String str) {
        this.f2425u = str;
    }

    public CardLabelShowView3(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardLabelShowView3(Context context) {
        this(context, null);
    }
}
