package com.p046p1.mobile.putong.core.view;

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
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.data.LabelData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p149l.e9c0;
import p149l.eqh0;
import p149l.t100;
import p149l.vwb;
import p149l.w0c0;

/* JADX INFO: loaded from: classes10.dex */
public class CardLabelShowView3 extends View {

    /* JADX INFO: renamed from: a */
    public Paint f38463a;

    /* JADX INFO: renamed from: b */
    public Paint f38464b;

    /* JADX INFO: renamed from: c */
    public Paint f38465c;

    /* JADX INFO: renamed from: d */
    public Paint f38466d;

    /* JADX INFO: renamed from: e */
    public Paint f38467e;

    /* JADX INFO: renamed from: f */
    public int f38468f;

    /* JADX INFO: renamed from: g */
    public int f38469g;

    /* JADX INFO: renamed from: h */
    public List<LayoutData> f38470h;

    /* JADX INFO: renamed from: i */
    public Map<Integer, Float> f38471i;

    /* JADX INFO: renamed from: j */
    public int f38472j;

    /* JADX INFO: renamed from: k */
    public int f38473k;

    /* JADX INFO: renamed from: l */
    public volatile List<LabelData> f38474l;

    /* JADX INFO: renamed from: m */
    public volatile List<LabelData> f38475m;

    /* JADX INFO: renamed from: n */
    public List<LabelData> f38476n;

    /* JADX INFO: renamed from: o */
    public int f38477o;

    /* JADX INFO: renamed from: p */
    public int f38478p;

    /* JADX INFO: renamed from: q */
    public int f38479q;

    /* JADX INFO: renamed from: r */
    public boolean f38480r;

    /* JADX INFO: renamed from: s */
    public InterfaceC9157a f38481s;

    /* JADX INFO: renamed from: t */
    public boolean f38482t;

    /* JADX INFO: renamed from: u */
    public String f38483u;

    public static class LayoutData extends RectF {
        public int line;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CardLabelShowView3$a */
    public interface InterfaceC9157a {
        /* JADX INFO: renamed from: a */
        void mo59508a(int i, int i2, int i3, boolean z);
    }

    public CardLabelShowView3(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38470h = new ArrayList();
        this.f38471i = new HashMap();
        this.f38474l = new ArrayList();
        this.f38475m = new ArrayList();
        this.f38476n = new ArrayList();
        this.f38482t = false;
        m59505c(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public static int m59503b(float f) {
        return (int) (App.f15369e.getResources().getDisplayMetrics().density * f);
    }

    /* JADX INFO: renamed from: a */
    public final void m59504a() {
        Float f;
        for (LayoutData layoutData : this.f38470h) {
            int i = layoutData.line;
            if (!this.f38471i.isEmpty() && (f = this.f38471i.get(Integer.valueOf(i))) != null) {
                float fFloatValue = f.floatValue() / 2.0f;
                ((RectF) layoutData).left += fFloatValue;
                ((RectF) layoutData).right += fFloatValue;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m59505c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.f90082x);
        int color = typedArrayObtainStyledAttributes.getColor(e9c0.f90085y, App.f15369e.getResources().getColor(w0c0.f183800R));
        this.f38480r = typedArrayObtainStyledAttributes.getBoolean(e9c0.f89954F, false);
        this.f38478p = typedArrayObtainStyledAttributes.getInt(e9c0.f89942B, 100);
        this.f38479q = typedArrayObtainStyledAttributes.getInt(e9c0.f89939A, 5);
        this.f38473k = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.f89945C, t100.m186890d(10.0f));
        if (typedArrayObtainStyledAttributes.getBoolean(e9c0.f90088z, false)) {
            int color2 = typedArrayObtainStyledAttributes.getColor(e9c0.f89948D, App.f15369e.getResources().getColor(w0c0.f183803S));
            this.f38477o = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.f89951E, 0);
            Paint paint = new Paint();
            this.f38465c = paint;
            paint.setAntiAlias(true);
            this.f38465c.setColor(color2);
            this.f38465c.setStyle(Paint.Style.STROKE);
            this.f38465c.setStrokeWidth(this.f38477o);
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f38463a = paint2;
        paint2.setAntiAlias(true);
        this.f38463a.setColor(color);
        Paint paint3 = this.f38463a;
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f38464b = paint4;
        paint4.setAntiAlias(true);
        this.f38464b.setColor(117440512);
        this.f38464b.setStyle(style);
        Paint paint5 = new Paint();
        this.f38466d = paint5;
        paint5.setAntiAlias(true);
        Paint paint6 = new Paint();
        this.f38467e = paint6;
        paint6.setAntiAlias(true);
        this.f38467e.setTypeface(eqh0.m117752c(3));
        this.f38467e.setColor(App.f15369e.getResources().getColor(w0c0.f183876p0));
        this.f38467e.setTextSize(m59503b(14.0f));
        Rect rect = new Rect();
        this.f38467e.getTextBounds("高", 0, 1, rect);
        int i = rect.bottom - rect.top;
        this.f38469g = (((m59503b(44.0f) - i) / 2) + i) - m59503b(1.0f);
    }

    /* JADX INFO: renamed from: d */
    public boolean m59506d(List<LabelData> list) {
        if (vwb.m200296J(list) || vwb.m200296J(this.f38475m) || list.size() != this.f38475m.size()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals(list.get(i).name, this.f38475m.get(i).name)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m59507e(int i, int i2, int i3) {
        this.f38479q = i;
        this.f38478p = i2;
        this.f38473k = i3;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < this.f38476n.size(); i++) {
            LayoutData layoutData = this.f38470h.get(i);
            LabelData labelData = this.f38476n.get(i);
            boolean z = labelData.highlight;
            int i2 = this.f38473k;
            if (z) {
                canvas.drawRoundRect(layoutData, i2, i2, this.f38463a);
            } else {
                canvas.drawRoundRect(layoutData, i2, i2, this.f38464b);
            }
            if (i == 0 && this.f38482t && NullChecker.m81303a(this.f38481s)) {
                this.f38481s.mo59508a((int) ((RectF) layoutData).left, (int) ((RectF) layoutData).right, (int) (((RectF) layoutData).bottom - ((RectF) layoutData).top), labelData.highlight);
            }
            if (this.f38465c != null) {
                RectF rectF = new RectF();
                float f = this.f38477o / 2;
                rectF.top = ((RectF) layoutData).top + f;
                rectF.left = ((RectF) layoutData).left + f;
                rectF.right = ((RectF) layoutData).right - f;
                rectF.bottom = ((RectF) layoutData).bottom - f;
                int i3 = this.f38473k;
                canvas.drawRoundRect(rectF, i3, i3, this.f38465c);
            }
            String str = this.f38476n.get(i).name;
            Rect rect = new Rect();
            this.f38467e.getTextBounds(str, 0, str.length(), rect);
            this.f38467e.setTypeface(eqh0.m117752c(3));
            float f2 = rect.right - rect.left;
            float fM59503b = (((RectF) layoutData).right - ((RectF) layoutData).left) - m59503b(16.0f);
            if (f2 <= fM59503b) {
                canvas.drawText(str, ((RectF) layoutData).left + m59503b(16.0f), ((RectF) layoutData).top + this.f38469g, this.f38467e);
            } else {
                int length = (int) (str.length() * (fM59503b / f2));
                if (length > 1) {
                    length--;
                }
                canvas.drawText(str.substring(0, length).concat("..."), ((RectF) layoutData).left + m59503b(16.0f), ((RectF) layoutData).top + this.f38469g, this.f38467e);
            }
        }
        this.f38482t = false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        this.f38468f = View.MeasureSpec.getSize(i);
        int measuredHeight = getMeasuredHeight();
        if (this.f38468f > 0 && !m59506d(this.f38474l) && measuredHeight > 0 && measuredHeight == this.f38472j) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), this.f38472j);
            return;
        }
        this.f38470h.clear();
        this.f38476n.clear();
        int i4 = this.f38474l.size() > 0 ? 1 : 0;
        float fM59503b = 0.0f;
        for (int i5 = 0; i5 < this.f38474l.size() && ((i3 = this.f38478p) == 0 || i5 < i3); i5++) {
            if (!TextUtils.isEmpty(this.f38474l.get(i5).name)) {
                int iM59503b = (i4 - 1) * m59503b(52.0f);
                LayoutData layoutData = new LayoutData();
                float fMeasureText = this.f38467e.measureText(this.f38474l.get(i5).name);
                float fM59503b2 = fM59503b + fMeasureText + m59503b(40.0f);
                layoutData.line = i4;
                if (fM59503b2 > this.f38468f) {
                    int i6 = i4 + 1;
                    int i7 = this.f38478p;
                    if (i6 > i7) {
                        i4 = i7;
                        break;
                    }
                    float fM59503b3 = fMeasureText + m59503b(32.0f);
                    int i8 = this.f38468f;
                    float f = fM59503b3 > ((float) i8) ? i8 : fM59503b3;
                    int iM59503b2 = i4 * m59503b(52.0f);
                    ((RectF) layoutData).left = 0.0f;
                    ((RectF) layoutData).top = iM59503b2;
                    ((RectF) layoutData).right = f;
                    ((RectF) layoutData).bottom = m59503b(44.0f) + iM59503b2;
                    layoutData.line = i6;
                    this.f38471i.put(Integer.valueOf(i6), Float.valueOf(this.f38468f - f));
                    this.f38470h.add(layoutData);
                    this.f38476n.add(this.f38474l.get(i5));
                    i4 = i6;
                    fM59503b = f;
                } else {
                    ((RectF) layoutData).left = fM59503b == 0.0f ? 0.0f : fM59503b + m59503b(8.0f);
                    ((RectF) layoutData).top = iM59503b;
                    fM59503b = fM59503b == 0.0f ? fMeasureText + m59503b(32.0f) : fM59503b2;
                    ((RectF) layoutData).right = fM59503b;
                    ((RectF) layoutData).bottom = m59503b(44.0f) + iM59503b;
                    this.f38470h.add(layoutData);
                    this.f38476n.add(this.f38474l.get(i5));
                    this.f38471i.put(Integer.valueOf(i4), Float.valueOf(this.f38468f - fM59503b));
                }
            }
        }
        if (this.f38480r) {
            m59504a();
        }
        int iM59503b3 = i4 > 0 ? m59503b((i4 * 44) + ((i4 - 1) * 8)) : 0;
        this.f38472j = iM59503b3;
        this.f38475m.clear();
        this.f38475m.addAll(this.f38474l);
        setMeasuredDimension(View.MeasureSpec.getSize(i), iM59503b3);
    }

    public void setFirstLabelShowCallback(InterfaceC9157a interfaceC9157a) {
        this.f38481s = interfaceC9157a;
    }

    public void setLabel(List<LabelData> list) {
        if (m59506d(list)) {
            this.f38482t = true;
            this.f38476n.clear();
            this.f38474l.clear();
            this.f38474l.addAll(list);
            requestLayout();
            postInvalidate();
        }
    }

    public void setTagBackgroundPaintLight(@ColorInt int i) {
        this.f38463a.setColor(i);
    }

    public void setTestKey(String str) {
        this.f38483u = str;
    }

    public CardLabelShowView3(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardLabelShowView3(Context context) {
        this(context, null);
    }
}
