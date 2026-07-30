package com.p000p1.mobile.putong.core.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.LabelData;
import com.p1.mobile.android.app.App;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.e9c0;
import l.eqh0;
import l.vwb;
import l.w0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CardLabelShowView2 extends View {

    /* JADX INFO: renamed from: a */
    public Paint f2386a;

    /* JADX INFO: renamed from: b */
    public Paint f2387b;

    /* JADX INFO: renamed from: c */
    public Paint f2388c;

    /* JADX INFO: renamed from: d */
    public Paint f2389d;

    /* JADX INFO: renamed from: e */
    public int f2390e;

    /* JADX INFO: renamed from: f */
    public int f2391f;

    /* JADX INFO: renamed from: g */
    public List<RectF> f2392g;

    /* JADX INFO: renamed from: h */
    public List<RectF> f2393h;

    /* JADX INFO: renamed from: i */
    public int f2394i;

    /* JADX INFO: renamed from: j */
    public int f2395j;

    /* JADX INFO: renamed from: k */
    public volatile List<LabelData> f2396k;

    /* JADX INFO: renamed from: l */
    public volatile List<LabelData> f2397l;

    /* JADX INFO: renamed from: m */
    public List<LabelData> f2398m;

    /* JADX INFO: renamed from: n */
    public volatile HashMap<String, Bitmap> f2399n;

    /* JADX INFO: renamed from: o */
    public int f2400o;

    /* JADX INFO: renamed from: p */
    public int f2401p;

    /* JADX INFO: renamed from: q */
    public int f2402q;

    /* JADX INFO: renamed from: r */
    public int f2403r;

    /* JADX INFO: renamed from: s */
    public int f2404s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CardLabelShowView2$a */
    public interface InterfaceC3254a {
    }

    public CardLabelShowView2(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2392g = new ArrayList();
        this.f2393h = new ArrayList();
        this.f2395j = m4909a(10.0f);
        this.f2396k = new ArrayList();
        this.f2397l = new ArrayList();
        this.f2398m = new ArrayList();
        this.f2399n = new HashMap<>();
        this.f2404s = -6686;
        m4910b(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public static int m4909a(float f) {
        return (int) (App.e.getResources().getDisplayMetrics().density * f);
    }

    /* JADX INFO: renamed from: b */
    public final void m4910b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.q);
        int color = typedArrayObtainStyledAttributes.getColor(e9c0.r, App.e.getResources().getColor(w0c0.R));
        this.f2403r = color;
        this.f2404s = color;
        this.f2401p = typedArrayObtainStyledAttributes.getInt(e9c0.u, 0);
        this.f2402q = typedArrayObtainStyledAttributes.getInt(e9c0.t, 5);
        if (typedArrayObtainStyledAttributes.getBoolean(e9c0.s, false)) {
            int color2 = typedArrayObtainStyledAttributes.getColor(e9c0.v, App.e.getResources().getColor(w0c0.S));
            this.f2400o = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.w, 0);
            Paint paint = new Paint();
            this.f2387b = paint;
            paint.setAntiAlias(true);
            this.f2387b.setColor(color2);
            this.f2387b.setStyle(Paint.Style.STROKE);
            this.f2387b.setStrokeWidth(this.f2400o);
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f2386a = paint2;
        paint2.setAntiAlias(true);
        this.f2386a.setColor(this.f2403r);
        this.f2386a.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint3 = new Paint();
        this.f2388c = paint3;
        paint3.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.f2389d = paint4;
        paint4.setAntiAlias(true);
        this.f2389d.setTypeface(eqh0.c(3));
        this.f2389d.setColor(App.e.getResources().getColor(w0c0.p0));
        this.f2389d.setTextSize(m4909a(14.0f));
        Rect rect = new Rect();
        this.f2389d.getTextBounds("高", 0, 1, rect);
        int i = rect.bottom - rect.top;
        this.f2391f = (((m4909a(44.0f) - i) / 2) + i) - m4909a(1.0f);
    }

    /* JADX INFO: renamed from: c */
    public boolean m4911c(List<LabelData> list) {
        if (vwb.J(list) || vwb.J(this.f2397l) || list.size() != this.f2397l.size()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals(list.get(i).name, this.f2397l.get(i).name) || list.get(i).highlight != this.f2397l.get(i).highlight) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < this.f2398m.size(); i++) {
            LabelData labelData = this.f2398m.get(i);
            RectF rectF = this.f2392g.get(i);
            boolean z = labelData.highlight;
            Paint paint = this.f2386a;
            if (z) {
                paint.setColor(this.f2404s);
            } else {
                paint.setColor(this.f2403r);
            }
            int i2 = this.f2395j;
            canvas.drawRoundRect(rectF, i2, i2, this.f2386a);
            if (this.f2387b != null) {
                RectF rectF2 = new RectF();
                float f = this.f2400o / 2;
                rectF2.top = rectF.top + f;
                rectF2.left = rectF.left + f;
                rectF2.right = rectF.right - f;
                rectF2.bottom = rectF.bottom - f;
                int i3 = this.f2395j;
                canvas.drawRoundRect(rectF2, i3, i3, this.f2387b);
            }
            String strValueOf = String.valueOf(labelData.iconDrawableRes);
            if (this.f2399n.get(strValueOf) != null && !this.f2399n.get(strValueOf).isRecycled()) {
                canvas.drawBitmap(this.f2399n.get(strValueOf), (Rect) null, this.f2393h.get(i), this.f2388c);
            }
            String str = this.f2398m.get(i).name;
            Rect rect = new Rect();
            this.f2389d.getTextBounds(str, 0, str.length(), rect);
            float f2 = rect.right - rect.left;
            float fM4909a = (rectF.right - rectF.left) - m4909a(38.0f);
            if (f2 <= fM4909a) {
                canvas.drawText(str, rectF.left + m4909a(38.0f), rectF.top + this.f2391f, this.f2389d);
            } else {
                int length = (int) (str.length() * (fM4909a / f2));
                if (length > 1) {
                    length--;
                }
                canvas.drawText(str.substring(0, length).concat("..."), rectF.left + m4909a(38.0f), rectF.top + this.f2391f, this.f2389d);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.f2390e = View.MeasureSpec.getSize(i) - m4909a(5.0f);
        int measuredHeight = getMeasuredHeight();
        if (this.f2390e > 0 && !m4911c(this.f2396k) && measuredHeight > 0 && measuredHeight == this.f2394i) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), this.f2394i);
            return;
        }
        this.f2392g.clear();
        this.f2398m.clear();
        this.f2393h.clear();
        int i3 = this.f2396k.size() > 0 ? 1 : 0;
        float fM4909a = 0.0f;
        for (int i4 = 0; i4 < this.f2396k.size(); i4++) {
            if (!TextUtils.isEmpty(this.f2396k.get(i4).name)) {
                int iM4909a = (i3 - 1) * m4909a(52.0f);
                RectF rectF = new RectF();
                float fMeasureText = this.f2389d.measureText(this.f2396k.get(i4).name);
                float fM4909a2 = fM4909a + fMeasureText + m4909a(62.0f);
                if (fM4909a2 > this.f2390e) {
                    if (i3 != 1 || fM4909a != 0.0f) {
                        i3++;
                    }
                    int i5 = this.f2401p;
                    if (i3 > i5) {
                        i3 = i5;
                        break;
                    }
                    float fM4909a3 = fMeasureText + m4909a(54.0f);
                    int i6 = this.f2390e;
                    if (fM4909a3 > i6) {
                        fM4909a = i6;
                        int length = this.f2396k.get(i4).name.length();
                        do {
                            length--;
                            Paint paint = this.f2389d;
                            StringBuilder sb = new StringBuilder();
                            String strSubstring = this.f2396k.get(i4).name.substring(0, length);
                            sb.append(strSubstring);
                            sb.append("...");
                            if (paint.measureText(strSubstring.concat("...")) + m4909a(54.0f) < this.f2390e) {
                                break;
                            }
                        } while (length > 0);
                        this.f2396k.get(i4).name = this.f2396k.get(i4).name.substring(0, length).concat("...");
                    } else {
                        fM4909a = fM4909a3;
                    }
                    int iM4909a2 = (i3 == 1 && fM4909a == 0.0f) ? 0 : (i3 - 1) * m4909a(52.0f);
                    rectF.left = 0.0f;
                    rectF.top = iM4909a2;
                    rectF.right = fM4909a;
                    rectF.bottom = m4909a(44.0f) + iM4909a2;
                    this.f2392g.add(rectF);
                    this.f2398m.add(this.f2396k.get(i4));
                } else {
                    rectF.left = fM4909a == 0.0f ? 0.0f : fM4909a + m4909a(8.0f);
                    rectF.top = iM4909a;
                    fM4909a = fM4909a == 0.0f ? fMeasureText + m4909a(54.0f) : fM4909a2;
                    rectF.right = fM4909a;
                    rectF.bottom = m4909a(44.0f) + iM4909a;
                    this.f2392g.add(rectF);
                    this.f2398m.add(this.f2396k.get(i4));
                }
            }
        }
        for (int i7 = 0; i7 < this.f2398m.size(); i7++) {
            RectF rectF2 = this.f2392g.get(i7);
            RectF rectF3 = new RectF();
            rectF3.top = rectF2.top + m4909a(11.0f);
            float fM4909a4 = rectF2.left + m4909a(12.0f);
            rectF3.left = fM4909a4;
            rectF3.right = fM4909a4 + m4909a(22.0f);
            rectF3.bottom = rectF3.top + m4909a(22.0f);
            this.f2393h.add(rectF3);
        }
        int iM4909a3 = i3 > 0 ? m4909a((i3 * 44) + ((i3 - 1) * 8)) : 0;
        this.f2394i = iM4909a3;
        this.f2397l.clear();
        this.f2397l.addAll(this.f2396k);
        setMeasuredDimension(View.MeasureSpec.getSize(i), iM4909a3);
    }

    public void setBgColor(int i) {
        this.f2403r = i;
    }

    public void setItemMaxNumber(int i) {
        this.f2401p = i;
    }

    public void setLabel(List<LabelData> list) {
        if (m4911c(list)) {
            this.f2398m.clear();
            this.f2396k.clear();
            this.f2396k.addAll(list);
            this.f2399n.clear();
            for (int i = 0; i < this.f2396k.size(); i++) {
                int i2 = this.f2396k.get(i).iconDrawableRes;
                if (i2 != 0) {
                    this.f2399n.put(String.valueOf(i2), BitmapFactory.decodeResource(getResources(), i2));
                }
            }
            requestLayout();
            postInvalidate();
        }
    }

    public void setLabelShowListener(InterfaceC3254a interfaceC3254a) {
    }

    public void setLightBgColor(int i) {
        this.f2404s = i;
    }

    public CardLabelShowView2(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardLabelShowView2(Context context) {
        this(context, null);
    }
}
