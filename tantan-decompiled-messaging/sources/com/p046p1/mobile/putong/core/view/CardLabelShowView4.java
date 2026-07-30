package com.p046p1.mobile.putong.core.view;

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
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.NewTags;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p149l.t100;
import p149l.vwb;
import p149l.w0c0;

/* JADX INFO: loaded from: classes10.dex */
public class CardLabelShowView4 extends View {

    /* JADX INFO: renamed from: a */
    public int f38484a;

    /* JADX INFO: renamed from: b */
    public volatile List<NewTags> f38485b;

    /* JADX INFO: renamed from: c */
    public volatile List<NewTags> f38486c;

    /* JADX INFO: renamed from: d */
    public List<NewTags> f38487d;

    /* JADX INFO: renamed from: e */
    public volatile HashMap<String, Bitmap> f38488e;

    /* JADX INFO: renamed from: f */
    public Paint f38489f;

    /* JADX INFO: renamed from: g */
    public Paint f38490g;

    /* JADX INFO: renamed from: h */
    public Paint f38491h;

    /* JADX INFO: renamed from: i */
    public Paint f38492i;

    /* JADX INFO: renamed from: j */
    public Paint f38493j;

    /* JADX INFO: renamed from: k */
    public int f38494k;

    /* JADX INFO: renamed from: l */
    public int f38495l;

    /* JADX INFO: renamed from: m */
    public List<RectF> f38496m;

    /* JADX INFO: renamed from: n */
    public List<RectF> f38497n;

    /* JADX INFO: renamed from: o */
    public boolean f38498o;

    /* JADX INFO: renamed from: p */
    public int f38499p;

    /* JADX INFO: renamed from: q */
    public int f38500q;

    /* JADX INFO: renamed from: r */
    public int f38501r;

    /* JADX INFO: renamed from: s */
    public int f38502s;

    /* JADX INFO: renamed from: t */
    public boolean f38503t;

    /* JADX INFO: renamed from: u */
    public boolean f38504u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CardLabelShowView4$a */
    public interface InterfaceC9158a {
    }

    public CardLabelShowView4(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38484a = 1;
        this.f38485b = new ArrayList();
        this.f38486c = new ArrayList();
        this.f38487d = new ArrayList();
        this.f38488e = new HashMap<>();
        this.f38496m = new ArrayList();
        this.f38497n = new ArrayList();
        this.f38498o = false;
        this.f38501r = t100.f167258g;
        m59510b();
    }

    /* JADX INFO: renamed from: a */
    public static int m59509a(float f) {
        return (int) (App.f15369e.getResources().getDisplayMetrics().density * f);
    }

    /* JADX INFO: renamed from: b */
    public final void m59510b() {
        Paint paint = new Paint();
        this.f38489f = paint;
        paint.setAntiAlias(true);
        this.f38489f.setColor(App.f15369e.getResources().getColor(w0c0.f183791O));
        Paint paint2 = this.f38489f;
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f38490g = paint3;
        paint3.setAntiAlias(true);
        this.f38490g.setColor(App.f15369e.getResources().getColor(w0c0.f183858j0));
        this.f38490g.setStyle(style);
        Paint paint4 = new Paint();
        this.f38491h = paint4;
        paint4.setAntiAlias(true);
        this.f38491h.setColor(App.f15369e.getResources().getColor(w0c0.f183801R0));
        this.f38491h.setStyle(style);
        Paint paint5 = new Paint();
        this.f38492i = paint5;
        paint5.setAntiAlias(true);
        Paint paint6 = new Paint();
        this.f38493j = paint6;
        paint6.setAntiAlias(true);
        this.f38493j.setColor(Color.parseColor("#FFFFFF"));
        this.f38493j.setTextSize(m59509a(12.0f));
        Rect rect = new Rect();
        this.f38493j.getTextBounds("高", 0, 1, rect);
        int i = rect.bottom - rect.top;
        this.f38495l = (((m59509a(24.0f) - i) / 2) + i) - m59509a(1.0f);
    }

    /* JADX INFO: renamed from: c */
    public boolean m59511c(List<NewTags> list) {
        if (this.f38503t || vwb.m200296J(list) || vwb.m200296J(this.f38486c) || list.size() != this.f38486c.size()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals(list.get(i).name, this.f38486c.get(i).name)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void m59512d(List<NewTags> list, boolean z, boolean z2, int i) {
        this.f38503t = z;
        this.f38504u = z2;
        this.f38502s = i;
        if (m59511c(list)) {
            this.f38487d.clear();
            this.f38485b.clear();
            this.f38485b.addAll(list);
            this.f38488e.clear();
            for (int i2 = 0; i2 < this.f38485b.size(); i2++) {
                this.f38488e.put(String.valueOf(i2), BitmapFactory.decodeResource(CoreModule.f17544b.getResources(), this.f38485b.get(i2).loadIcon));
            }
            requestLayout();
            postInvalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < this.f38487d.size(); i++) {
            RectF rectF = this.f38496m.get(i);
            NewTags newTags = this.f38487d.get(i);
            if (newTags.localIsCommonLabel) {
                RectF rectF2 = this.f38496m.get(i);
                int i2 = this.f38501r;
                canvas.drawRoundRect(rectF2, i2, i2, this.f38491h);
            } else {
                boolean zIsEmpty = TextUtils.isEmpty(newTags.bgColor);
                Paint paint = this.f38489f;
                if (zIsEmpty) {
                    paint.setColor(App.f15369e.getResources().getColor(w0c0.f183791O));
                } else {
                    paint.setColor(Color.parseColor(newTags.bgColor));
                }
                RectF rectF3 = this.f38496m.get(i);
                int i3 = this.f38501r;
                canvas.drawRoundRect(rectF3, i3, i3, this.f38490g);
                RectF rectF4 = this.f38496m.get(i);
                int i4 = this.f38501r;
                canvas.drawRoundRect(rectF4, i4, i4, this.f38489f);
            }
            canvas.drawBitmap(this.f38488e.get(String.valueOf(i)), (Rect) null, this.f38497n.get(i), this.f38492i);
            boolean zIsEmpty2 = TextUtils.isEmpty(this.f38487d.get(i).nameColor);
            Paint paint2 = this.f38493j;
            if (zIsEmpty2) {
                paint2.setColor(Color.parseColor("#FFFFFF"));
            } else {
                paint2.setColor(Color.parseColor(this.f38487d.get(i).nameColor));
            }
            canvas.drawText(this.f38487d.get(i).localShowName, rectF.left + m59509a(24.0f), rectF.top + this.f38495l, this.f38493j);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        String strSubstring;
        float fM59509a;
        int size = View.MeasureSpec.getSize(i) - m59509a(5.0f);
        this.f38494k = size;
        if (this.f38504u) {
            this.f38494k = size - this.f38502s;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.f38494k > 0 && !m59511c(this.f38485b) && measuredHeight > 0 && this.f38494k == this.f38500q && measuredHeight == this.f38499p) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), this.f38499p);
            return;
        }
        this.f38496m.clear();
        this.f38487d.clear();
        this.f38497n.clear();
        int i3 = this.f38485b.size() > 0 ? 1 : 0;
        float fM59509a2 = 0.0f;
        for (int i4 = 0; i4 < this.f38485b.size(); i4++) {
            int iM59509a = (i3 - 1) * m59509a(32.0f);
            RectF rectF = new RectF();
            float fMeasureText = this.f38493j.measureText(this.f38485b.get(i4).name);
            float fM59509a3 = fM59509a2 + fMeasureText + m59509a(30.0f);
            if (fM59509a3 > this.f38494k) {
                float fM59509a4 = m59509a(80.0f) + fM59509a2;
                if (!this.f38498o || fM59509a4 >= this.f38494k) {
                    int i5 = i3 + 1;
                    int i6 = this.f38484a;
                    if (i5 > i6) {
                        i3 = i6;
                        break;
                    }
                    fM59509a = fMeasureText + m59509a(30.0f);
                    int iM59509a2 = i3 * m59509a(32.0f);
                    rectF.left = 0.0f;
                    rectF.top = iM59509a2;
                    rectF.right = fM59509a;
                    rectF.bottom = m59509a(24.0f) + iM59509a2;
                    this.f38496m.add(rectF);
                    this.f38487d.add(this.f38485b.get(i4));
                    i3 = i5;
                    fM59509a2 = fM59509a;
                } else {
                    rectF.left = fM59509a2 == 0.0f ? 0.0f : fM59509a2 + m59509a(5.0f);
                    rectF.top = iM59509a;
                    rectF.right = this.f38494k;
                    rectF.bottom = m59509a(24.0f) + iM59509a;
                    this.f38496m.add(rectF);
                    this.f38487d.add(this.f38485b.get(i4));
                    i3++;
                    int i7 = this.f38484a;
                    if (i3 > i7) {
                        i3 = i7;
                        break;
                    } else {
                        fM59509a = 0.0f;
                        fM59509a2 = fM59509a;
                    }
                }
            } else {
                rectF.left = fM59509a2 == 0.0f ? 0.0f : fM59509a2 + m59509a(5.0f);
                rectF.top = iM59509a;
                rectF.right = (fM59509a2 == 0.0f ? 0 : m59509a(5.0f)) + fM59509a3;
                rectF.bottom = m59509a(24.0f) + iM59509a;
                this.f38496m.add(rectF);
                this.f38487d.add(this.f38485b.get(i4));
                fM59509a2 = fM59509a3 + (fM59509a2 == 0.0f ? 0 : m59509a(5.0f));
            }
        }
        for (int i8 = 0; i8 < this.f38487d.size(); i8++) {
            RectF rectF2 = this.f38496m.get(i8);
            RectF rectF3 = new RectF();
            rectF3.top = rectF2.top + m59509a(5.0f);
            float fM59509a5 = rectF2.left + m59509a(6.0f);
            rectF3.left = fM59509a5;
            rectF3.right = fM59509a5 + m59509a(14.0f);
            rectF3.bottom = rectF3.top + m59509a(14.0f);
            this.f38497n.add(rectF3);
            float fMeasureText2 = this.f38493j.measureText(this.f38487d.get(i8).name);
            float fM59509a6 = ((rectF2.right - m59509a(6.0f)) - rectF2.left) - m59509a(24.0f);
            List<NewTags> list = this.f38487d;
            if (fM59509a6 >= fMeasureText2) {
                list.get(i8).localShowName = this.f38487d.get(i8).name;
            } else {
                int iRound = Math.round((fM59509a6 / fMeasureText2) * list.get(i8).name.length());
                if (iRound > 0) {
                    int length = this.f38487d.get(i8).name.length();
                    List<NewTags> list2 = this.f38487d;
                    strSubstring = length > 5 ? list2.get(i8).name.substring(0, iRound - 2) : list2.get(i8).name.substring(0, iRound - 1);
                } else {
                    strSubstring = "";
                }
                this.f38487d.get(i8).localShowName = strSubstring.concat("...");
            }
        }
        int iM59509a3 = i3 > 0 ? m59509a((i3 * 24) + ((i3 - 1) * 8)) : 0;
        this.f38499p = iM59509a3;
        this.f38500q = this.f38494k;
        this.f38486c.clear();
        this.f38486c.addAll(this.f38485b);
        setMeasuredDimension(View.MeasureSpec.getSize(i), iM59509a3);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = 0; i < this.f38496m.size(); i++) {
            if (this.f38496m.get(i).contains(x, y)) {
                motionEvent.getAction();
                return true;
            }
        }
        return false;
    }

    public void setMostLine(int i) {
        this.f38484a = i;
    }

    public void setNewTags(List<NewTags> list) {
        m59512d(list, false, false, m59509a(84.0f));
    }

    public void setOnTagClickListener(InterfaceC9158a interfaceC9158a) {
    }

    public CardLabelShowView4(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardLabelShowView4(Context context) {
        this(context, null);
    }
}
