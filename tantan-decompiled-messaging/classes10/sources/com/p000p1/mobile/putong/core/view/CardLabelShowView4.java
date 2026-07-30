package com.p000p1.mobile.putong.core.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.t100;
import l.vwb;
import l.w0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CardLabelShowView4 extends View {

    /* JADX INFO: renamed from: a */
    public int f2426a;

    /* JADX INFO: renamed from: b */
    public volatile List<NewTags> f2427b;

    /* JADX INFO: renamed from: c */
    public volatile List<NewTags> f2428c;

    /* JADX INFO: renamed from: d */
    public List<NewTags> f2429d;

    /* JADX INFO: renamed from: e */
    public volatile HashMap<String, Bitmap> f2430e;

    /* JADX INFO: renamed from: f */
    public Paint f2431f;

    /* JADX INFO: renamed from: g */
    public Paint f2432g;

    /* JADX INFO: renamed from: h */
    public Paint f2433h;

    /* JADX INFO: renamed from: i */
    public Paint f2434i;

    /* JADX INFO: renamed from: j */
    public Paint f2435j;

    /* JADX INFO: renamed from: k */
    public int f2436k;

    /* JADX INFO: renamed from: l */
    public int f2437l;

    /* JADX INFO: renamed from: m */
    public List<RectF> f2438m;

    /* JADX INFO: renamed from: n */
    public List<RectF> f2439n;

    /* JADX INFO: renamed from: o */
    public boolean f2440o;

    /* JADX INFO: renamed from: p */
    public int f2441p;

    /* JADX INFO: renamed from: q */
    public int f2442q;

    /* JADX INFO: renamed from: r */
    public int f2443r;

    /* JADX INFO: renamed from: s */
    public int f2444s;

    /* JADX INFO: renamed from: t */
    public boolean f2445t;

    /* JADX INFO: renamed from: u */
    public boolean f2446u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CardLabelShowView4$a */
    public interface InterfaceC3256a {
    }

    public CardLabelShowView4(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2426a = 1;
        this.f2427b = new ArrayList();
        this.f2428c = new ArrayList();
        this.f2429d = new ArrayList();
        this.f2430e = new HashMap<>();
        this.f2438m = new ArrayList();
        this.f2439n = new ArrayList();
        this.f2440o = false;
        this.f2443r = t100.g;
        m4919b();
    }

    /* JADX INFO: renamed from: a */
    public static int m4918a(float f) {
        return (int) (App.e.getResources().getDisplayMetrics().density * f);
    }

    /* JADX INFO: renamed from: b */
    public final void m4919b() {
        Paint paint = new Paint();
        this.f2431f = paint;
        paint.setAntiAlias(true);
        this.f2431f.setColor(App.e.getResources().getColor(w0c0.O));
        Paint paint2 = this.f2431f;
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f2432g = paint3;
        paint3.setAntiAlias(true);
        this.f2432g.setColor(App.e.getResources().getColor(w0c0.j0));
        this.f2432g.setStyle(style);
        Paint paint4 = new Paint();
        this.f2433h = paint4;
        paint4.setAntiAlias(true);
        this.f2433h.setColor(App.e.getResources().getColor(w0c0.R0));
        this.f2433h.setStyle(style);
        Paint paint5 = new Paint();
        this.f2434i = paint5;
        paint5.setAntiAlias(true);
        Paint paint6 = new Paint();
        this.f2435j = paint6;
        paint6.setAntiAlias(true);
        this.f2435j.setColor(Color.parseColor("#FFFFFF"));
        this.f2435j.setTextSize(m4918a(12.0f));
        Rect rect = new Rect();
        this.f2435j.getTextBounds("高", 0, 1, rect);
        int i = rect.bottom - rect.top;
        this.f2437l = (((m4918a(24.0f) - i) / 2) + i) - m4918a(1.0f);
    }

    /* JADX INFO: renamed from: c */
    public boolean m4920c(List<NewTags> list) {
        if (this.f2445t || vwb.J(list) || vwb.J(this.f2428c) || list.size() != this.f2428c.size()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals(list.get(i).name, this.f2428c.get(i).name)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void m4921d(List<NewTags> list, boolean z, boolean z2, int i) {
        this.f2445t = z;
        this.f2446u = z2;
        this.f2444s = i;
        if (m4920c(list)) {
            this.f2429d.clear();
            this.f2427b.clear();
            this.f2427b.addAll(list);
            this.f2430e.clear();
            for (int i2 = 0; i2 < this.f2427b.size(); i2++) {
                this.f2430e.put(String.valueOf(i2), BitmapFactory.decodeResource(CoreModule.b.getResources(), this.f2427b.get(i2).loadIcon));
            }
            requestLayout();
            postInvalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < this.f2429d.size(); i++) {
            RectF rectF = this.f2438m.get(i);
            NewTags newTags = this.f2429d.get(i);
            if (newTags.localIsCommonLabel) {
                RectF rectF2 = this.f2438m.get(i);
                int i2 = this.f2443r;
                canvas.drawRoundRect(rectF2, i2, i2, this.f2433h);
            } else {
                boolean zIsEmpty = TextUtils.isEmpty(newTags.bgColor);
                Paint paint = this.f2431f;
                if (zIsEmpty) {
                    paint.setColor(App.e.getResources().getColor(w0c0.O));
                } else {
                    paint.setColor(Color.parseColor(newTags.bgColor));
                }
                RectF rectF3 = this.f2438m.get(i);
                int i3 = this.f2443r;
                canvas.drawRoundRect(rectF3, i3, i3, this.f2432g);
                RectF rectF4 = this.f2438m.get(i);
                int i4 = this.f2443r;
                canvas.drawRoundRect(rectF4, i4, i4, this.f2431f);
            }
            canvas.drawBitmap(this.f2430e.get(String.valueOf(i)), (Rect) null, this.f2439n.get(i), this.f2434i);
            boolean zIsEmpty2 = TextUtils.isEmpty(this.f2429d.get(i).nameColor);
            Paint paint2 = this.f2435j;
            if (zIsEmpty2) {
                paint2.setColor(Color.parseColor("#FFFFFF"));
            } else {
                paint2.setColor(Color.parseColor(this.f2429d.get(i).nameColor));
            }
            canvas.drawText(this.f2429d.get(i).localShowName, rectF.left + m4918a(24.0f), rectF.top + this.f2437l, this.f2435j);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        String strSubstring;
        float fM4918a;
        int size = View.MeasureSpec.getSize(i) - m4918a(5.0f);
        this.f2436k = size;
        if (this.f2446u) {
            this.f2436k = size - this.f2444s;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.f2436k > 0 && !m4920c(this.f2427b) && measuredHeight > 0 && this.f2436k == this.f2442q && measuredHeight == this.f2441p) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), this.f2441p);
            return;
        }
        this.f2438m.clear();
        this.f2429d.clear();
        this.f2439n.clear();
        int i3 = this.f2427b.size() > 0 ? 1 : 0;
        float fM4918a2 = 0.0f;
        for (int i4 = 0; i4 < this.f2427b.size(); i4++) {
            int iM4918a = (i3 - 1) * m4918a(32.0f);
            RectF rectF = new RectF();
            float fMeasureText = this.f2435j.measureText(this.f2427b.get(i4).name);
            float fM4918a3 = fM4918a2 + fMeasureText + m4918a(30.0f);
            if (fM4918a3 > this.f2436k) {
                float fM4918a4 = m4918a(80.0f) + fM4918a2;
                if (!this.f2440o || fM4918a4 >= this.f2436k) {
                    int i5 = i3 + 1;
                    int i6 = this.f2426a;
                    if (i5 > i6) {
                        i3 = i6;
                        break;
                    }
                    fM4918a = fMeasureText + m4918a(30.0f);
                    int iM4918a2 = i3 * m4918a(32.0f);
                    rectF.left = 0.0f;
                    rectF.top = iM4918a2;
                    rectF.right = fM4918a;
                    rectF.bottom = m4918a(24.0f) + iM4918a2;
                    this.f2438m.add(rectF);
                    this.f2429d.add(this.f2427b.get(i4));
                    i3 = i5;
                    fM4918a2 = fM4918a;
                } else {
                    rectF.left = fM4918a2 == 0.0f ? 0.0f : fM4918a2 + m4918a(5.0f);
                    rectF.top = iM4918a;
                    rectF.right = this.f2436k;
                    rectF.bottom = m4918a(24.0f) + iM4918a;
                    this.f2438m.add(rectF);
                    this.f2429d.add(this.f2427b.get(i4));
                    i3++;
                    int i7 = this.f2426a;
                    if (i3 > i7) {
                        i3 = i7;
                        break;
                    } else {
                        fM4918a = 0.0f;
                        fM4918a2 = fM4918a;
                    }
                }
            } else {
                rectF.left = fM4918a2 == 0.0f ? 0.0f : fM4918a2 + m4918a(5.0f);
                rectF.top = iM4918a;
                rectF.right = (fM4918a2 == 0.0f ? 0 : m4918a(5.0f)) + fM4918a3;
                rectF.bottom = m4918a(24.0f) + iM4918a;
                this.f2438m.add(rectF);
                this.f2429d.add(this.f2427b.get(i4));
                fM4918a2 = fM4918a3 + (fM4918a2 == 0.0f ? 0 : m4918a(5.0f));
            }
        }
        for (int i8 = 0; i8 < this.f2429d.size(); i8++) {
            RectF rectF2 = this.f2438m.get(i8);
            RectF rectF3 = new RectF();
            rectF3.top = rectF2.top + m4918a(5.0f);
            float fM4918a5 = rectF2.left + m4918a(6.0f);
            rectF3.left = fM4918a5;
            rectF3.right = fM4918a5 + m4918a(14.0f);
            rectF3.bottom = rectF3.top + m4918a(14.0f);
            this.f2439n.add(rectF3);
            float fMeasureText2 = this.f2435j.measureText(this.f2429d.get(i8).name);
            float fM4918a6 = ((rectF2.right - m4918a(6.0f)) - rectF2.left) - m4918a(24.0f);
            List<NewTags> list = this.f2429d;
            if (fM4918a6 >= fMeasureText2) {
                list.get(i8).localShowName = this.f2429d.get(i8).name;
            } else {
                int iRound = Math.round((fM4918a6 / fMeasureText2) * list.get(i8).name.length());
                if (iRound > 0) {
                    int length = this.f2429d.get(i8).name.length();
                    List<NewTags> list2 = this.f2429d;
                    strSubstring = length > 5 ? list2.get(i8).name.substring(0, iRound - 2) : list2.get(i8).name.substring(0, iRound - 1);
                } else {
                    strSubstring = "";
                }
                this.f2429d.get(i8).localShowName = strSubstring.concat("...");
            }
        }
        int iM4918a3 = i3 > 0 ? m4918a((i3 * 24) + ((i3 - 1) * 8)) : 0;
        this.f2441p = iM4918a3;
        this.f2442q = this.f2436k;
        this.f2428c.clear();
        this.f2428c.addAll(this.f2427b);
        setMeasuredDimension(View.MeasureSpec.getSize(i), iM4918a3);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = 0; i < this.f2438m.size(); i++) {
            if (this.f2438m.get(i).contains(x, y)) {
                motionEvent.getAction();
                return true;
            }
        }
        return false;
    }

    public void setMostLine(int i) {
        this.f2426a = i;
    }

    public void setNewTags(List<NewTags> list) {
        m4921d(list, false, false, m4918a(84.0f));
    }

    public void setOnTagClickListener(InterfaceC3256a interfaceC3256a) {
    }

    public CardLabelShowView4(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardLabelShowView4(Context context) {
        this(context, null);
    }
}
