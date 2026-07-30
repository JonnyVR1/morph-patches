package com.p051p1.mobile.putong.core.view;

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
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.data.LabelData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p153l.c9c0;
import p153l.jyb;
import p153l.khc0;
import p153l.lyh0;

/* JADX INFO: loaded from: classes12.dex */
public class CardLabelShowView2 extends View {

    /* JADX INFO: renamed from: a */
    public Paint f39292a;

    /* JADX INFO: renamed from: b */
    public Paint f39293b;

    /* JADX INFO: renamed from: c */
    public Paint f39294c;

    /* JADX INFO: renamed from: d */
    public Paint f39295d;

    /* JADX INFO: renamed from: e */
    public int f39296e;

    /* JADX INFO: renamed from: f */
    public int f39297f;

    /* JADX INFO: renamed from: g */
    public List<RectF> f39298g;

    /* JADX INFO: renamed from: h */
    public List<RectF> f39299h;

    /* JADX INFO: renamed from: i */
    public int f39300i;

    /* JADX INFO: renamed from: j */
    public int f39301j;

    /* JADX INFO: renamed from: k */
    public volatile List<LabelData> f39302k;

    /* JADX INFO: renamed from: l */
    public volatile List<LabelData> f39303l;

    /* JADX INFO: renamed from: m */
    public List<LabelData> f39304m;

    /* JADX INFO: renamed from: n */
    public volatile HashMap<String, Bitmap> f39305n;

    /* JADX INFO: renamed from: o */
    public int f39306o;

    /* JADX INFO: renamed from: p */
    public int f39307p;

    /* JADX INFO: renamed from: q */
    public int f39308q;

    /* JADX INFO: renamed from: r */
    public int f39309r;

    /* JADX INFO: renamed from: s */
    public int f39310s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CardLabelShowView2$a */
    public interface InterfaceC9319a {
    }

    public CardLabelShowView2(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39298g = new ArrayList();
        this.f39299h = new ArrayList();
        this.f39301j = m60684a(10.0f);
        this.f39302k = new ArrayList();
        this.f39303l = new ArrayList();
        this.f39304m = new ArrayList();
        this.f39305n = new HashMap<>();
        this.f39310s = -6686;
        m60685b(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public static int m60684a(float f) {
        return (int) (App.f16088e.getResources().getDisplayMetrics().density * f);
    }

    /* JADX INFO: renamed from: b */
    public final void m60685b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khc0.f126831q);
        int color = typedArrayObtainStyledAttributes.getColor(khc0.f126834r, App.f16088e.getResources().getColor(c9c0.f80372S));
        this.f39309r = color;
        this.f39310s = color;
        this.f39307p = typedArrayObtainStyledAttributes.getInt(khc0.f126843u, 0);
        this.f39308q = typedArrayObtainStyledAttributes.getInt(khc0.f126840t, 5);
        if (typedArrayObtainStyledAttributes.getBoolean(khc0.f126837s, false)) {
            int color2 = typedArrayObtainStyledAttributes.getColor(khc0.f126846v, App.f16088e.getResources().getColor(c9c0.f80375T));
            this.f39306o = typedArrayObtainStyledAttributes.getDimensionPixelSize(khc0.f126849w, 0);
            Paint paint = new Paint();
            this.f39293b = paint;
            paint.setAntiAlias(true);
            this.f39293b.setColor(color2);
            this.f39293b.setStyle(Paint.Style.STROKE);
            this.f39293b.setStrokeWidth(this.f39306o);
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f39292a = paint2;
        paint2.setAntiAlias(true);
        this.f39292a.setColor(this.f39309r);
        this.f39292a.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint3 = new Paint();
        this.f39294c = paint3;
        paint3.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.f39295d = paint4;
        paint4.setAntiAlias(true);
        this.f39295d.setTypeface(lyh0.m156283c(3));
        this.f39295d.setColor(App.f16088e.getResources().getColor(c9c0.f80449q0));
        this.f39295d.setTextSize(m60684a(14.0f));
        Rect rect = new Rect();
        this.f39295d.getTextBounds("高", 0, 1, rect);
        int i = rect.bottom - rect.top;
        this.f39297f = (((m60684a(44.0f) - i) / 2) + i) - m60684a(1.0f);
    }

    /* JADX INFO: renamed from: c */
    public boolean m60686c(List<LabelData> list) {
        if (jyb.m147479J(list) || jyb.m147479J(this.f39303l) || list.size() != this.f39303l.size()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals(list.get(i).name, this.f39303l.get(i).name) || list.get(i).highlight != this.f39303l.get(i).highlight) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < this.f39304m.size(); i++) {
            LabelData labelData = this.f39304m.get(i);
            RectF rectF = this.f39298g.get(i);
            boolean z = labelData.highlight;
            Paint paint = this.f39292a;
            if (z) {
                paint.setColor(this.f39310s);
            } else {
                paint.setColor(this.f39309r);
            }
            int i2 = this.f39301j;
            canvas.drawRoundRect(rectF, i2, i2, this.f39292a);
            if (this.f39293b != null) {
                RectF rectF2 = new RectF();
                float f = this.f39306o / 2;
                rectF2.top = rectF.top + f;
                rectF2.left = rectF.left + f;
                rectF2.right = rectF.right - f;
                rectF2.bottom = rectF.bottom - f;
                int i3 = this.f39301j;
                canvas.drawRoundRect(rectF2, i3, i3, this.f39293b);
            }
            String strValueOf = String.valueOf(labelData.iconDrawableRes);
            if (this.f39305n.get(strValueOf) != null && !this.f39305n.get(strValueOf).isRecycled()) {
                canvas.drawBitmap(this.f39305n.get(strValueOf), (Rect) null, this.f39299h.get(i), this.f39294c);
            }
            String str = this.f39304m.get(i).name;
            Rect rect = new Rect();
            this.f39295d.getTextBounds(str, 0, str.length(), rect);
            float f2 = rect.right - rect.left;
            float fM60684a = (rectF.right - rectF.left) - m60684a(38.0f);
            if (f2 <= fM60684a) {
                canvas.drawText(str, rectF.left + m60684a(38.0f), rectF.top + this.f39297f, this.f39295d);
            } else {
                int length = (int) (str.length() * (fM60684a / f2));
                if (length > 1) {
                    length--;
                }
                canvas.drawText(str.substring(0, length).concat("..."), rectF.left + m60684a(38.0f), rectF.top + this.f39297f, this.f39295d);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.f39296e = View.MeasureSpec.getSize(i) - m60684a(5.0f);
        int measuredHeight = getMeasuredHeight();
        if (this.f39296e > 0 && !m60686c(this.f39302k) && measuredHeight > 0 && measuredHeight == this.f39300i) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), this.f39300i);
            return;
        }
        this.f39298g.clear();
        this.f39304m.clear();
        this.f39299h.clear();
        int i3 = this.f39302k.size() > 0 ? 1 : 0;
        float fM60684a = 0.0f;
        for (int i4 = 0; i4 < this.f39302k.size(); i4++) {
            if (!TextUtils.isEmpty(this.f39302k.get(i4).name)) {
                int iM60684a = (i3 - 1) * m60684a(52.0f);
                RectF rectF = new RectF();
                float fMeasureText = this.f39295d.measureText(this.f39302k.get(i4).name);
                float fM60684a2 = fM60684a + fMeasureText + m60684a(62.0f);
                if (fM60684a2 > this.f39296e) {
                    if (i3 != 1 || fM60684a != 0.0f) {
                        i3++;
                    }
                    int i5 = this.f39307p;
                    if (i3 > i5) {
                        i3 = i5;
                        break;
                    }
                    float fM60684a3 = fMeasureText + m60684a(54.0f);
                    int i6 = this.f39296e;
                    if (fM60684a3 > i6) {
                        fM60684a = i6;
                        int length = this.f39302k.get(i4).name.length();
                        do {
                            length--;
                            Paint paint = this.f39295d;
                            StringBuilder sb = new StringBuilder();
                            String strSubstring = this.f39302k.get(i4).name.substring(0, length);
                            sb.append(strSubstring);
                            sb.append("...");
                            if (paint.measureText(strSubstring.concat("...")) + m60684a(54.0f) < this.f39296e) {
                                break;
                            }
                        } while (length > 0);
                        this.f39302k.get(i4).name = this.f39302k.get(i4).name.substring(0, length).concat("...");
                    } else {
                        fM60684a = fM60684a3;
                    }
                    int iM60684a2 = (i3 == 1 && fM60684a == 0.0f) ? 0 : (i3 - 1) * m60684a(52.0f);
                    rectF.left = 0.0f;
                    rectF.top = iM60684a2;
                    rectF.right = fM60684a;
                    rectF.bottom = m60684a(44.0f) + iM60684a2;
                    this.f39298g.add(rectF);
                    this.f39304m.add(this.f39302k.get(i4));
                } else {
                    rectF.left = fM60684a == 0.0f ? 0.0f : fM60684a + m60684a(8.0f);
                    rectF.top = iM60684a;
                    fM60684a = fM60684a == 0.0f ? fMeasureText + m60684a(54.0f) : fM60684a2;
                    rectF.right = fM60684a;
                    rectF.bottom = m60684a(44.0f) + iM60684a;
                    this.f39298g.add(rectF);
                    this.f39304m.add(this.f39302k.get(i4));
                }
            }
        }
        for (int i7 = 0; i7 < this.f39304m.size(); i7++) {
            RectF rectF2 = this.f39298g.get(i7);
            RectF rectF3 = new RectF();
            rectF3.top = rectF2.top + m60684a(11.0f);
            float fM60684a4 = rectF2.left + m60684a(12.0f);
            rectF3.left = fM60684a4;
            rectF3.right = fM60684a4 + m60684a(22.0f);
            rectF3.bottom = rectF3.top + m60684a(22.0f);
            this.f39299h.add(rectF3);
        }
        int iM60684a3 = i3 > 0 ? m60684a((i3 * 44) + ((i3 - 1) * 8)) : 0;
        this.f39300i = iM60684a3;
        this.f39303l.clear();
        this.f39303l.addAll(this.f39302k);
        setMeasuredDimension(View.MeasureSpec.getSize(i), iM60684a3);
    }

    public void setBgColor(int i) {
        this.f39309r = i;
    }

    public void setItemMaxNumber(int i) {
        this.f39307p = i;
    }

    public void setLabel(List<LabelData> list) {
        if (m60686c(list)) {
            this.f39304m.clear();
            this.f39302k.clear();
            this.f39302k.addAll(list);
            this.f39305n.clear();
            for (int i = 0; i < this.f39302k.size(); i++) {
                int i2 = this.f39302k.get(i).iconDrawableRes;
                if (i2 != 0) {
                    this.f39305n.put(String.valueOf(i2), BitmapFactory.decodeResource(getResources(), i2));
                }
            }
            requestLayout();
            postInvalidate();
        }
    }

    public void setLabelShowListener(InterfaceC9319a interfaceC9319a) {
    }

    public void setLightBgColor(int i) {
        this.f39310s = i;
    }

    public CardLabelShowView2(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardLabelShowView2(Context context) {
        this(context, null);
    }
}
