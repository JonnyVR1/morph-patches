package com.p046p1.mobile.putong.core.view;

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
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.data.LabelData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p149l.eqh0;
import p149l.r9c0;
import p149l.t100;
import p149l.vwb;

/* JADX INFO: loaded from: classes10.dex */
public class CommonLabelShowView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f38510a;

    /* JADX INFO: renamed from: b */
    public Paint f38511b;

    /* JADX INFO: renamed from: c */
    public Paint f38512c;

    /* JADX INFO: renamed from: d */
    public Paint f38513d;

    /* JADX INFO: renamed from: e */
    public Paint f38514e;

    /* JADX INFO: renamed from: f */
    public Paint f38515f;

    /* JADX INFO: renamed from: g */
    public int f38516g;

    /* JADX INFO: renamed from: h */
    public int f38517h;

    /* JADX INFO: renamed from: i */
    public List<LayoutData> f38518i;

    /* JADX INFO: renamed from: j */
    public Map<Integer, Float> f38519j;

    /* JADX INFO: renamed from: k */
    public int f38520k;

    /* JADX INFO: renamed from: l */
    public int f38521l;

    /* JADX INFO: renamed from: m */
    public volatile List<LabelData> f38522m;

    /* JADX INFO: renamed from: n */
    public volatile List<LabelData> f38523n;

    /* JADX INFO: renamed from: o */
    public List<LabelData> f38524o;

    /* JADX INFO: renamed from: p */
    public int f38525p;

    /* JADX INFO: renamed from: q */
    public int f38526q;

    /* JADX INFO: renamed from: r */
    public int f38527r;

    /* JADX INFO: renamed from: s */
    public boolean f38528s;

    /* JADX INFO: renamed from: t */
    public boolean f38529t;

    /* JADX INFO: renamed from: u */
    public String f38530u;

    /* JADX INFO: renamed from: v */
    public C9160b f38531v;

    /* JADX INFO: renamed from: w */
    public int f38532w;

    /* JADX INFO: renamed from: x */
    public int f38533x;

    public static class LayoutData extends RectF {
        public RectF desRect;
        public int line;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CommonLabelShowView$a */
    public interface InterfaceC9159a {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CommonLabelShowView$b */
    public static class C9160b {

        /* JADX INFO: renamed from: a */
        public float f38534a;

        /* JADX INFO: renamed from: b */
        public float f38535b;

        /* JADX INFO: renamed from: c */
        public float f38536c;

        /* JADX INFO: renamed from: d */
        public float f38537d;

        /* JADX INFO: renamed from: e */
        public int f38538e;

        /* JADX INFO: renamed from: f */
        public int f38539f;

        /* JADX INFO: renamed from: g */
        public float f38540g;

        /* JADX INFO: renamed from: h */
        public float f38541h;

        /* JADX INFO: renamed from: i */
        public float f38542i;

        public C9160b() {
            int i = t100.f167256e;
            this.f38534a = i;
            this.f38535b = i;
            this.f38536c = i;
            this.f38537d = i;
            this.f38538e = -6686;
            this.f38540g = t100.m186890d(10.0f);
            this.f38542i = t100.m186890d(6.0f);
            this.f38539f = -872415232;
        }
    }

    public CommonLabelShowView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38518i = new ArrayList();
        this.f38519j = new HashMap();
        this.f38522m = new ArrayList();
        this.f38523n = new ArrayList();
        this.f38524o = new ArrayList();
        this.f38529t = false;
        m59516c(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public static int m59514b(float f) {
        return (int) (App.f15369e.getResources().getDisplayMetrics().density * f);
    }

    /* JADX INFO: renamed from: a */
    public final void m59515a() {
        Float f;
        for (LayoutData layoutData : this.f38518i) {
            int i = layoutData.line;
            if (!this.f38519j.isEmpty() && (f = this.f38519j.get(Integer.valueOf(i))) != null) {
                float fFloatValue = f.floatValue() / 2.0f;
                ((RectF) layoutData).left += fFloatValue;
                ((RectF) layoutData).right += fFloatValue;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m59516c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9c0.f158325d);
        int color = typedArrayObtainStyledAttributes.getColor(r9c0.f158327e, 134217728);
        int color2 = typedArrayObtainStyledAttributes.getColor(r9c0.f158340m, -872415232);
        this.f38528s = typedArrayObtainStyledAttributes.getBoolean(r9c0.f158339l, false);
        this.f38526q = typedArrayObtainStyledAttributes.getInt(r9c0.f158333h, 100);
        this.f38527r = typedArrayObtainStyledAttributes.getInt(r9c0.f158331g, 5);
        this.f38521l = typedArrayObtainStyledAttributes.getDimensionPixelSize(r9c0.f158335i, t100.m186890d(10.0f));
        if (typedArrayObtainStyledAttributes.getBoolean(r9c0.f158329f, false)) {
            int color3 = typedArrayObtainStyledAttributes.getColor(r9c0.f158337j, 167772160);
            this.f38525p = typedArrayObtainStyledAttributes.getDimensionPixelSize(r9c0.f158338k, 0);
            Paint paint = new Paint();
            this.f38512c = paint;
            paint.setAntiAlias(true);
            this.f38512c.setColor(color3);
            this.f38512c.setStyle(Paint.Style.STROKE);
            this.f38512c.setStrokeWidth(this.f38525p);
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f38510a = paint2;
        paint2.setAntiAlias(true);
        this.f38510a.setColor(color);
        Paint paint3 = this.f38510a;
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f38511b = paint4;
        paint4.setAntiAlias(true);
        this.f38511b.setColor(117440512);
        this.f38511b.setStyle(style);
        Paint paint5 = new Paint();
        this.f38513d = paint5;
        paint5.setAntiAlias(true);
        Paint paint6 = new Paint();
        this.f38514e = paint6;
        paint6.setAntiAlias(true);
        this.f38514e.setTypeface(eqh0.m117752c(3));
        this.f38514e.setColor(color2);
        this.f38514e.setTextSize(m59514b(14.0f));
        this.f38532w = 44;
        this.f38533x = 8;
        this.f38531v = new C9160b();
        TextPaint textPaint = new TextPaint();
        this.f38515f = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        m59518e();
        m59519f();
    }

    /* JADX INFO: renamed from: d */
    public boolean m59517d(List<LabelData> list) {
        if (vwb.m200296J(list) || vwb.m200296J(this.f38523n) || list.size() != this.f38523n.size()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals(list.get(i).name, this.f38523n.get(i).name)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m59518e() {
        this.f38515f.setTextSize(this.f38531v.f38540g);
        this.f38515f.setColor(this.f38531v.f38539f);
        this.f38515f.setAntiAlias(true);
        this.f38515f.setFakeBoldText(true);
        Rect rect = new Rect();
        this.f38515f.getTextBounds("你符合", 0, 1, rect);
        this.f38531v.f38541h = rect.bottom - rect.top;
    }

    /* JADX INFO: renamed from: f */
    public final void m59519f() {
        Rect rect = new Rect();
        this.f38514e.getTextBounds("高", 0, 1, rect);
        int i = rect.bottom - rect.top;
        this.f38517h = (((m59514b(this.f38532w) - i) / 2) + i) - m59514b(1.0f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < this.f38524o.size(); i++) {
            LayoutData layoutData = this.f38518i.get(i);
            LabelData labelData = this.f38524o.get(i);
            boolean z = labelData.highlight;
            int i2 = this.f38521l;
            if (z) {
                canvas.drawRoundRect(layoutData, i2, i2, this.f38510a);
            } else {
                canvas.drawRoundRect(layoutData, i2, i2, this.f38511b);
            }
            if (i == 0 && this.f38529t && NullChecker.m81303a(null)) {
                float f = ((RectF) layoutData).left;
                throw null;
            }
            if (this.f38512c != null) {
                RectF rectF = new RectF();
                float f2 = this.f38525p / 2;
                rectF.top = ((RectF) layoutData).top + f2;
                rectF.left = ((RectF) layoutData).left + f2;
                rectF.right = ((RectF) layoutData).right - f2;
                rectF.bottom = ((RectF) layoutData).bottom - f2;
                int i3 = this.f38521l;
                canvas.drawRoundRect(rectF, i3, i3, this.f38512c);
            }
            String str = this.f38524o.get(i).name;
            Rect rect = new Rect();
            this.f38514e.getTextBounds(str, 0, str.length(), rect);
            float f3 = rect.right - rect.left;
            float fM59514b = (((RectF) layoutData).right - ((RectF) layoutData).left) - m59514b(16.0f);
            if (f3 <= fM59514b) {
                canvas.drawText(str, ((RectF) layoutData).left + m59514b(16.0f), ((RectF) layoutData).top + this.f38517h, this.f38514e);
            } else {
                int length = (int) (str.length() * (fM59514b / f3));
                if (length > 1) {
                    length--;
                }
                canvas.drawText(str.substring(0, length).concat("..."), ((RectF) layoutData).left + m59514b(16.0f), ((RectF) layoutData).top + this.f38517h, this.f38514e);
            }
            if (!TextUtils.isEmpty(labelData.desStr)) {
                this.f38515f.setColor(-1);
                this.f38515f.setStyle(Paint.Style.STROKE);
                this.f38515f.setStrokeWidth(this.f38531v.f38542i);
                RectF rectF2 = layoutData.desRect;
                int i4 = t100.f167258g;
                canvas.drawRoundRect(rectF2, i4, i4, this.f38515f);
                this.f38515f.setStyle(Paint.Style.FILL);
                this.f38515f.setColor(this.f38531v.f38538e);
                canvas.drawRoundRect(layoutData.desRect, i4, i4, this.f38515f);
                this.f38515f.setColor(this.f38531v.f38539f);
                String str2 = labelData.desStr;
                RectF rectF3 = layoutData.desRect;
                canvas.drawText(str2, (rectF3.right + rectF3.left) / 2.0f, ((rectF3.bottom + rectF3.top) / 2.0f) + (this.f38531v.f38541h / 2.3f), this.f38515f);
            }
        }
        this.f38529t = false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        this.f38516g = View.MeasureSpec.getSize(i);
        int measuredHeight = getMeasuredHeight();
        if (this.f38516g > 0 && !m59517d(this.f38522m) && measuredHeight > 0 && measuredHeight == this.f38520k) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), this.f38520k);
            return;
        }
        this.f38518i.clear();
        this.f38524o.clear();
        int i4 = this.f38522m.size() > 0 ? 1 : 0;
        float fM59514b = 0.0f;
        for (int i5 = 0; i5 < this.f38522m.size() && (((i3 = this.f38526q) == 0 || i5 < i3) && i4 <= this.f38527r); i5++) {
            if (!TextUtils.isEmpty(this.f38522m.get(i5).name)) {
                int iM186890d = (i4 - 1) * t100.m186890d(this.f38532w + this.f38533x);
                LayoutData layoutData = new LayoutData();
                float fMeasureText = this.f38514e.measureText(this.f38522m.get(i5).name);
                float fM59514b2 = fM59514b + fMeasureText + m59514b(40.0f);
                layoutData.line = i4;
                if (fM59514b2 > this.f38516g) {
                    int i6 = i4 + 1;
                    if (i6 > this.f38527r) {
                        break;
                    }
                    int i7 = this.f38526q;
                    if (i6 > i7) {
                        i4 = i7;
                        break;
                    }
                    float fM59514b3 = fMeasureText + m59514b(32.0f);
                    int i8 = this.f38516g;
                    float f = fM59514b3 > ((float) i8) ? i8 : fM59514b3;
                    int iM186890d2 = i4 * t100.m186890d(this.f38532w + this.f38533x);
                    ((RectF) layoutData).left = 0.0f;
                    ((RectF) layoutData).top = iM186890d2;
                    ((RectF) layoutData).right = f;
                    ((RectF) layoutData).bottom = m59514b(this.f38532w) + iM186890d2;
                    layoutData.line = i6;
                    this.f38519j.put(Integer.valueOf(i6), Float.valueOf(this.f38516g - f));
                    this.f38518i.add(layoutData);
                    this.f38524o.add(this.f38522m.get(i5));
                    i4 = i6;
                    fM59514b = f;
                } else {
                    ((RectF) layoutData).left = fM59514b == 0.0f ? 0.0f : fM59514b + m59514b(8.0f);
                    ((RectF) layoutData).top = iM186890d;
                    fM59514b = fM59514b == 0.0f ? fMeasureText + m59514b(32.0f) : fM59514b2;
                    ((RectF) layoutData).right = fM59514b;
                    ((RectF) layoutData).bottom = m59514b(this.f38532w) + iM186890d;
                    this.f38518i.add(layoutData);
                    this.f38524o.add(this.f38522m.get(i5));
                    this.f38519j.put(Integer.valueOf(i4), Float.valueOf(this.f38516g - fM59514b));
                }
            }
        }
        if (!vwb.m200296J(this.f38518i)) {
            for (int i9 = 0; i9 < this.f38518i.size(); i9++) {
                LayoutData layoutData2 = this.f38518i.get(i9);
                LabelData labelData = this.f38522m.get(i9);
                if (!TextUtils.isEmpty(labelData.desStr)) {
                    float fMeasureText2 = this.f38515f.measureText(labelData.desStr);
                    C9160b c9160b = this.f38531v;
                    float f2 = fMeasureText2 + c9160b.f38534a + c9160b.f38536c;
                    float f3 = c9160b.f38541h + c9160b.f38535b + c9160b.f38537d;
                    float f4 = ((RectF) layoutData2).right;
                    int i10 = t100.f167254c;
                    float f5 = (i10 + f4) - f2;
                    float f6 = ((RectF) layoutData2).top;
                    float f7 = f3 / 2.0f;
                    layoutData2.desRect = new RectF(f5, f6 - f7, f4 + i10, f6 + f7);
                }
            }
        }
        if (this.f38528s) {
            m59515a();
        }
        int iM59514b = i4 > 0 ? m59514b((this.f38532w * i4) + (this.f38533x * (i4 - 1))) : 0;
        this.f38520k = iM59514b;
        this.f38523n.clear();
        this.f38523n.addAll(this.f38522m);
        setMeasuredDimension(View.MeasureSpec.getSize(i), iM59514b);
    }

    public void setFirstLabelShowCallback(InterfaceC9159a interfaceC9159a) {
    }

    public void setItemHeight(int i) {
        this.f38532w = i;
        m59519f();
    }

    public void setLabel(List<LabelData> list) {
        if (m59517d(list)) {
            this.f38529t = true;
            this.f38524o.clear();
            this.f38522m.clear();
            this.f38522m.addAll(list);
            requestLayout();
            postInvalidate();
        }
    }

    public void setTagBackgroundPaintLight(@ColorInt int i) {
        this.f38510a.setColor(i);
    }

    public void setTestKey(String str) {
        this.f38530u = str;
    }

    public CommonLabelShowView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommonLabelShowView(Context context) {
        this(context, null);
    }
}
