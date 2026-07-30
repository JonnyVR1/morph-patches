package com.p046p1.mobile.putong.core.view;

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
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.data.LabelData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p149l.e9c0;
import p149l.eqh0;
import p149l.vwb;
import p149l.w0c0;

/* JADX INFO: loaded from: classes10.dex */
public class CardLabelShowView2 extends View {

    /* JADX INFO: renamed from: a */
    public Paint f38444a;

    /* JADX INFO: renamed from: b */
    public Paint f38445b;

    /* JADX INFO: renamed from: c */
    public Paint f38446c;

    /* JADX INFO: renamed from: d */
    public Paint f38447d;

    /* JADX INFO: renamed from: e */
    public int f38448e;

    /* JADX INFO: renamed from: f */
    public int f38449f;

    /* JADX INFO: renamed from: g */
    public List<RectF> f38450g;

    /* JADX INFO: renamed from: h */
    public List<RectF> f38451h;

    /* JADX INFO: renamed from: i */
    public int f38452i;

    /* JADX INFO: renamed from: j */
    public int f38453j;

    /* JADX INFO: renamed from: k */
    public volatile List<LabelData> f38454k;

    /* JADX INFO: renamed from: l */
    public volatile List<LabelData> f38455l;

    /* JADX INFO: renamed from: m */
    public List<LabelData> f38456m;

    /* JADX INFO: renamed from: n */
    public volatile HashMap<String, Bitmap> f38457n;

    /* JADX INFO: renamed from: o */
    public int f38458o;

    /* JADX INFO: renamed from: p */
    public int f38459p;

    /* JADX INFO: renamed from: q */
    public int f38460q;

    /* JADX INFO: renamed from: r */
    public int f38461r;

    /* JADX INFO: renamed from: s */
    public int f38462s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CardLabelShowView2$a */
    public interface InterfaceC9156a {
    }

    public CardLabelShowView2(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38450g = new ArrayList();
        this.f38451h = new ArrayList();
        this.f38453j = m59500a(10.0f);
        this.f38454k = new ArrayList();
        this.f38455l = new ArrayList();
        this.f38456m = new ArrayList();
        this.f38457n = new HashMap<>();
        this.f38462s = -6686;
        m59501b(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public static int m59500a(float f) {
        return (int) (App.f15369e.getResources().getDisplayMetrics().density * f);
    }

    /* JADX INFO: renamed from: b */
    public final void m59501b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.f90061q);
        int color = typedArrayObtainStyledAttributes.getColor(e9c0.f90064r, App.f15369e.getResources().getColor(w0c0.f183800R));
        this.f38461r = color;
        this.f38462s = color;
        this.f38459p = typedArrayObtainStyledAttributes.getInt(e9c0.f90073u, 0);
        this.f38460q = typedArrayObtainStyledAttributes.getInt(e9c0.f90070t, 5);
        if (typedArrayObtainStyledAttributes.getBoolean(e9c0.f90067s, false)) {
            int color2 = typedArrayObtainStyledAttributes.getColor(e9c0.f90076v, App.f15369e.getResources().getColor(w0c0.f183803S));
            this.f38458o = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.f90079w, 0);
            Paint paint = new Paint();
            this.f38445b = paint;
            paint.setAntiAlias(true);
            this.f38445b.setColor(color2);
            this.f38445b.setStyle(Paint.Style.STROKE);
            this.f38445b.setStrokeWidth(this.f38458o);
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f38444a = paint2;
        paint2.setAntiAlias(true);
        this.f38444a.setColor(this.f38461r);
        this.f38444a.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint3 = new Paint();
        this.f38446c = paint3;
        paint3.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.f38447d = paint4;
        paint4.setAntiAlias(true);
        this.f38447d.setTypeface(eqh0.m117752c(3));
        this.f38447d.setColor(App.f15369e.getResources().getColor(w0c0.f183876p0));
        this.f38447d.setTextSize(m59500a(14.0f));
        Rect rect = new Rect();
        this.f38447d.getTextBounds("高", 0, 1, rect);
        int i = rect.bottom - rect.top;
        this.f38449f = (((m59500a(44.0f) - i) / 2) + i) - m59500a(1.0f);
    }

    /* JADX INFO: renamed from: c */
    public boolean m59502c(List<LabelData> list) {
        if (vwb.m200296J(list) || vwb.m200296J(this.f38455l) || list.size() != this.f38455l.size()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals(list.get(i).name, this.f38455l.get(i).name) || list.get(i).highlight != this.f38455l.get(i).highlight) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < this.f38456m.size(); i++) {
            LabelData labelData = this.f38456m.get(i);
            RectF rectF = this.f38450g.get(i);
            boolean z = labelData.highlight;
            Paint paint = this.f38444a;
            if (z) {
                paint.setColor(this.f38462s);
            } else {
                paint.setColor(this.f38461r);
            }
            int i2 = this.f38453j;
            canvas.drawRoundRect(rectF, i2, i2, this.f38444a);
            if (this.f38445b != null) {
                RectF rectF2 = new RectF();
                float f = this.f38458o / 2;
                rectF2.top = rectF.top + f;
                rectF2.left = rectF.left + f;
                rectF2.right = rectF.right - f;
                rectF2.bottom = rectF.bottom - f;
                int i3 = this.f38453j;
                canvas.drawRoundRect(rectF2, i3, i3, this.f38445b);
            }
            String strValueOf = String.valueOf(labelData.iconDrawableRes);
            if (this.f38457n.get(strValueOf) != null && !this.f38457n.get(strValueOf).isRecycled()) {
                canvas.drawBitmap(this.f38457n.get(strValueOf), (Rect) null, this.f38451h.get(i), this.f38446c);
            }
            String str = this.f38456m.get(i).name;
            Rect rect = new Rect();
            this.f38447d.getTextBounds(str, 0, str.length(), rect);
            float f2 = rect.right - rect.left;
            float fM59500a = (rectF.right - rectF.left) - m59500a(38.0f);
            if (f2 <= fM59500a) {
                canvas.drawText(str, rectF.left + m59500a(38.0f), rectF.top + this.f38449f, this.f38447d);
            } else {
                int length = (int) (str.length() * (fM59500a / f2));
                if (length > 1) {
                    length--;
                }
                canvas.drawText(str.substring(0, length).concat("..."), rectF.left + m59500a(38.0f), rectF.top + this.f38449f, this.f38447d);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.f38448e = View.MeasureSpec.getSize(i) - m59500a(5.0f);
        int measuredHeight = getMeasuredHeight();
        if (this.f38448e > 0 && !m59502c(this.f38454k) && measuredHeight > 0 && measuredHeight == this.f38452i) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), this.f38452i);
            return;
        }
        this.f38450g.clear();
        this.f38456m.clear();
        this.f38451h.clear();
        int i3 = this.f38454k.size() > 0 ? 1 : 0;
        float fM59500a = 0.0f;
        for (int i4 = 0; i4 < this.f38454k.size(); i4++) {
            if (!TextUtils.isEmpty(this.f38454k.get(i4).name)) {
                int iM59500a = (i3 - 1) * m59500a(52.0f);
                RectF rectF = new RectF();
                float fMeasureText = this.f38447d.measureText(this.f38454k.get(i4).name);
                float fM59500a2 = fM59500a + fMeasureText + m59500a(62.0f);
                if (fM59500a2 > this.f38448e) {
                    if (i3 != 1 || fM59500a != 0.0f) {
                        i3++;
                    }
                    int i5 = this.f38459p;
                    if (i3 > i5) {
                        i3 = i5;
                        break;
                    }
                    float fM59500a3 = fMeasureText + m59500a(54.0f);
                    int i6 = this.f38448e;
                    if (fM59500a3 > i6) {
                        fM59500a = i6;
                        int length = this.f38454k.get(i4).name.length();
                        do {
                            length--;
                            Paint paint = this.f38447d;
                            StringBuilder sb = new StringBuilder();
                            String strSubstring = this.f38454k.get(i4).name.substring(0, length);
                            sb.append(strSubstring);
                            sb.append("...");
                            if (paint.measureText(strSubstring.concat("...")) + m59500a(54.0f) < this.f38448e) {
                                break;
                            }
                        } while (length > 0);
                        this.f38454k.get(i4).name = this.f38454k.get(i4).name.substring(0, length).concat("...");
                    } else {
                        fM59500a = fM59500a3;
                    }
                    int iM59500a2 = (i3 == 1 && fM59500a == 0.0f) ? 0 : (i3 - 1) * m59500a(52.0f);
                    rectF.left = 0.0f;
                    rectF.top = iM59500a2;
                    rectF.right = fM59500a;
                    rectF.bottom = m59500a(44.0f) + iM59500a2;
                    this.f38450g.add(rectF);
                    this.f38456m.add(this.f38454k.get(i4));
                } else {
                    rectF.left = fM59500a == 0.0f ? 0.0f : fM59500a + m59500a(8.0f);
                    rectF.top = iM59500a;
                    fM59500a = fM59500a == 0.0f ? fMeasureText + m59500a(54.0f) : fM59500a2;
                    rectF.right = fM59500a;
                    rectF.bottom = m59500a(44.0f) + iM59500a;
                    this.f38450g.add(rectF);
                    this.f38456m.add(this.f38454k.get(i4));
                }
            }
        }
        for (int i7 = 0; i7 < this.f38456m.size(); i7++) {
            RectF rectF2 = this.f38450g.get(i7);
            RectF rectF3 = new RectF();
            rectF3.top = rectF2.top + m59500a(11.0f);
            float fM59500a4 = rectF2.left + m59500a(12.0f);
            rectF3.left = fM59500a4;
            rectF3.right = fM59500a4 + m59500a(22.0f);
            rectF3.bottom = rectF3.top + m59500a(22.0f);
            this.f38451h.add(rectF3);
        }
        int iM59500a3 = i3 > 0 ? m59500a((i3 * 44) + ((i3 - 1) * 8)) : 0;
        this.f38452i = iM59500a3;
        this.f38455l.clear();
        this.f38455l.addAll(this.f38454k);
        setMeasuredDimension(View.MeasureSpec.getSize(i), iM59500a3);
    }

    public void setBgColor(int i) {
        this.f38461r = i;
    }

    public void setItemMaxNumber(int i) {
        this.f38459p = i;
    }

    public void setLabel(List<LabelData> list) {
        if (m59502c(list)) {
            this.f38456m.clear();
            this.f38454k.clear();
            this.f38454k.addAll(list);
            this.f38457n.clear();
            for (int i = 0; i < this.f38454k.size(); i++) {
                int i2 = this.f38454k.get(i).iconDrawableRes;
                if (i2 != 0) {
                    this.f38457n.put(String.valueOf(i2), BitmapFactory.decodeResource(getResources(), i2));
                }
            }
            requestLayout();
            postInvalidate();
        }
    }

    public void setLabelShowListener(InterfaceC9156a interfaceC9156a) {
    }

    public void setLightBgColor(int i) {
        this.f38462s = i;
    }

    public CardLabelShowView2(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardLabelShowView2(Context context) {
        this(context, null);
    }
}
