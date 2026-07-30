package com.p051p1.mobile.putong.core.view;

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
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.NewTags;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p153l.c9c0;
import p153l.jyb;
import p153l.qa00;

/* JADX INFO: loaded from: classes12.dex */
public class CardLabelShowView4 extends View {

    /* JADX INFO: renamed from: a */
    public int f39332a;

    /* JADX INFO: renamed from: b */
    public volatile List<NewTags> f39333b;

    /* JADX INFO: renamed from: c */
    public volatile List<NewTags> f39334c;

    /* JADX INFO: renamed from: d */
    public List<NewTags> f39335d;

    /* JADX INFO: renamed from: e */
    public volatile HashMap<String, Bitmap> f39336e;

    /* JADX INFO: renamed from: f */
    public Paint f39337f;

    /* JADX INFO: renamed from: g */
    public Paint f39338g;

    /* JADX INFO: renamed from: h */
    public Paint f39339h;

    /* JADX INFO: renamed from: i */
    public Paint f39340i;

    /* JADX INFO: renamed from: j */
    public Paint f39341j;

    /* JADX INFO: renamed from: k */
    public int f39342k;

    /* JADX INFO: renamed from: l */
    public int f39343l;

    /* JADX INFO: renamed from: m */
    public List<RectF> f39344m;

    /* JADX INFO: renamed from: n */
    public List<RectF> f39345n;

    /* JADX INFO: renamed from: o */
    public boolean f39346o;

    /* JADX INFO: renamed from: p */
    public int f39347p;

    /* JADX INFO: renamed from: q */
    public int f39348q;

    /* JADX INFO: renamed from: r */
    public int f39349r;

    /* JADX INFO: renamed from: s */
    public int f39350s;

    /* JADX INFO: renamed from: t */
    public boolean f39351t;

    /* JADX INFO: renamed from: u */
    public boolean f39352u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CardLabelShowView4$a */
    public interface InterfaceC9321a {
    }

    public CardLabelShowView4(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39332a = 1;
        this.f39333b = new ArrayList();
        this.f39334c = new ArrayList();
        this.f39335d = new ArrayList();
        this.f39336e = new HashMap<>();
        this.f39344m = new ArrayList();
        this.f39345n = new ArrayList();
        this.f39346o = false;
        this.f39349r = qa00.f156320g;
        m60694b();
    }

    /* JADX INFO: renamed from: a */
    public static int m60693a(float f) {
        return (int) (App.f16088e.getResources().getDisplayMetrics().density * f);
    }

    /* JADX INFO: renamed from: b */
    public final void m60694b() {
        Paint paint = new Paint();
        this.f39337f = paint;
        paint.setAntiAlias(true);
        this.f39337f.setColor(App.f16088e.getResources().getColor(c9c0.f80360O));
        Paint paint2 = this.f39337f;
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f39338g = paint3;
        paint3.setAntiAlias(true);
        this.f39338g.setColor(App.f16088e.getResources().getColor(c9c0.f80431k0));
        this.f39338g.setStyle(style);
        Paint paint4 = new Paint();
        this.f39339h = paint4;
        paint4.setAntiAlias(true);
        this.f39339h.setColor(App.f16088e.getResources().getColor(c9c0.f80373S0));
        this.f39339h.setStyle(style);
        Paint paint5 = new Paint();
        this.f39340i = paint5;
        paint5.setAntiAlias(true);
        Paint paint6 = new Paint();
        this.f39341j = paint6;
        paint6.setAntiAlias(true);
        this.f39341j.setColor(Color.parseColor("#FFFFFF"));
        this.f39341j.setTextSize(m60693a(12.0f));
        Rect rect = new Rect();
        this.f39341j.getTextBounds("高", 0, 1, rect);
        int i = rect.bottom - rect.top;
        this.f39343l = (((m60693a(24.0f) - i) / 2) + i) - m60693a(1.0f);
    }

    /* JADX INFO: renamed from: c */
    public boolean m60695c(List<NewTags> list) {
        if (this.f39351t || jyb.m147479J(list) || jyb.m147479J(this.f39334c) || list.size() != this.f39334c.size()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals(list.get(i).name, this.f39334c.get(i).name)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void m60696d(List<NewTags> list, boolean z, boolean z2, int i) {
        this.f39351t = z;
        this.f39352u = z2;
        this.f39350s = i;
        if (m60695c(list)) {
            this.f39335d.clear();
            this.f39333b.clear();
            this.f39333b.addAll(list);
            this.f39336e.clear();
            for (int i2 = 0; i2 < this.f39333b.size(); i2++) {
                this.f39336e.put(String.valueOf(i2), BitmapFactory.decodeResource(CoreModule.f18263b.getResources(), this.f39333b.get(i2).loadIcon));
            }
            requestLayout();
            postInvalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < this.f39335d.size(); i++) {
            RectF rectF = this.f39344m.get(i);
            NewTags newTags = this.f39335d.get(i);
            if (newTags.localIsCommonLabel) {
                RectF rectF2 = this.f39344m.get(i);
                int i2 = this.f39349r;
                canvas.drawRoundRect(rectF2, i2, i2, this.f39339h);
            } else {
                boolean zIsEmpty = TextUtils.isEmpty(newTags.bgColor);
                Paint paint = this.f39337f;
                if (zIsEmpty) {
                    paint.setColor(App.f16088e.getResources().getColor(c9c0.f80360O));
                } else {
                    paint.setColor(Color.parseColor(newTags.bgColor));
                }
                RectF rectF3 = this.f39344m.get(i);
                int i3 = this.f39349r;
                canvas.drawRoundRect(rectF3, i3, i3, this.f39338g);
                RectF rectF4 = this.f39344m.get(i);
                int i4 = this.f39349r;
                canvas.drawRoundRect(rectF4, i4, i4, this.f39337f);
            }
            canvas.drawBitmap(this.f39336e.get(String.valueOf(i)), (Rect) null, this.f39345n.get(i), this.f39340i);
            boolean zIsEmpty2 = TextUtils.isEmpty(this.f39335d.get(i).nameColor);
            Paint paint2 = this.f39341j;
            if (zIsEmpty2) {
                paint2.setColor(Color.parseColor("#FFFFFF"));
            } else {
                paint2.setColor(Color.parseColor(this.f39335d.get(i).nameColor));
            }
            canvas.drawText(this.f39335d.get(i).localShowName, rectF.left + m60693a(24.0f), rectF.top + this.f39343l, this.f39341j);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        String strSubstring;
        float fM60693a;
        int size = View.MeasureSpec.getSize(i) - m60693a(5.0f);
        this.f39342k = size;
        if (this.f39352u) {
            this.f39342k = size - this.f39350s;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.f39342k > 0 && !m60695c(this.f39333b) && measuredHeight > 0 && this.f39342k == this.f39348q && measuredHeight == this.f39347p) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), this.f39347p);
            return;
        }
        this.f39344m.clear();
        this.f39335d.clear();
        this.f39345n.clear();
        int i3 = this.f39333b.size() > 0 ? 1 : 0;
        float fM60693a2 = 0.0f;
        for (int i4 = 0; i4 < this.f39333b.size(); i4++) {
            int iM60693a = (i3 - 1) * m60693a(32.0f);
            RectF rectF = new RectF();
            float fMeasureText = this.f39341j.measureText(this.f39333b.get(i4).name);
            float fM60693a3 = fM60693a2 + fMeasureText + m60693a(30.0f);
            if (fM60693a3 > this.f39342k) {
                float fM60693a4 = m60693a(80.0f) + fM60693a2;
                if (!this.f39346o || fM60693a4 >= this.f39342k) {
                    int i5 = i3 + 1;
                    int i6 = this.f39332a;
                    if (i5 > i6) {
                        i3 = i6;
                        break;
                    }
                    fM60693a = fMeasureText + m60693a(30.0f);
                    int iM60693a2 = i3 * m60693a(32.0f);
                    rectF.left = 0.0f;
                    rectF.top = iM60693a2;
                    rectF.right = fM60693a;
                    rectF.bottom = m60693a(24.0f) + iM60693a2;
                    this.f39344m.add(rectF);
                    this.f39335d.add(this.f39333b.get(i4));
                    i3 = i5;
                    fM60693a2 = fM60693a;
                } else {
                    rectF.left = fM60693a2 == 0.0f ? 0.0f : fM60693a2 + m60693a(5.0f);
                    rectF.top = iM60693a;
                    rectF.right = this.f39342k;
                    rectF.bottom = m60693a(24.0f) + iM60693a;
                    this.f39344m.add(rectF);
                    this.f39335d.add(this.f39333b.get(i4));
                    i3++;
                    int i7 = this.f39332a;
                    if (i3 > i7) {
                        i3 = i7;
                        break;
                    } else {
                        fM60693a = 0.0f;
                        fM60693a2 = fM60693a;
                    }
                }
            } else {
                rectF.left = fM60693a2 == 0.0f ? 0.0f : fM60693a2 + m60693a(5.0f);
                rectF.top = iM60693a;
                rectF.right = (fM60693a2 == 0.0f ? 0 : m60693a(5.0f)) + fM60693a3;
                rectF.bottom = m60693a(24.0f) + iM60693a;
                this.f39344m.add(rectF);
                this.f39335d.add(this.f39333b.get(i4));
                fM60693a2 = fM60693a3 + (fM60693a2 == 0.0f ? 0 : m60693a(5.0f));
            }
        }
        for (int i8 = 0; i8 < this.f39335d.size(); i8++) {
            RectF rectF2 = this.f39344m.get(i8);
            RectF rectF3 = new RectF();
            rectF3.top = rectF2.top + m60693a(5.0f);
            float fM60693a5 = rectF2.left + m60693a(6.0f);
            rectF3.left = fM60693a5;
            rectF3.right = fM60693a5 + m60693a(14.0f);
            rectF3.bottom = rectF3.top + m60693a(14.0f);
            this.f39345n.add(rectF3);
            float fMeasureText2 = this.f39341j.measureText(this.f39335d.get(i8).name);
            float fM60693a6 = ((rectF2.right - m60693a(6.0f)) - rectF2.left) - m60693a(24.0f);
            List<NewTags> list = this.f39335d;
            if (fM60693a6 >= fMeasureText2) {
                list.get(i8).localShowName = this.f39335d.get(i8).name;
            } else {
                int iRound = Math.round((fM60693a6 / fMeasureText2) * list.get(i8).name.length());
                if (iRound > 0) {
                    int length = this.f39335d.get(i8).name.length();
                    List<NewTags> list2 = this.f39335d;
                    strSubstring = length > 5 ? list2.get(i8).name.substring(0, iRound - 2) : list2.get(i8).name.substring(0, iRound - 1);
                } else {
                    strSubstring = "";
                }
                this.f39335d.get(i8).localShowName = strSubstring.concat("...");
            }
        }
        int iM60693a3 = i3 > 0 ? m60693a((i3 * 24) + ((i3 - 1) * 8)) : 0;
        this.f39347p = iM60693a3;
        this.f39348q = this.f39342k;
        this.f39334c.clear();
        this.f39334c.addAll(this.f39333b);
        setMeasuredDimension(View.MeasureSpec.getSize(i), iM60693a3);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = 0; i < this.f39344m.size(); i++) {
            if (this.f39344m.get(i).contains(x, y)) {
                motionEvent.getAction();
                return true;
            }
        }
        return false;
    }

    public void setMostLine(int i) {
        this.f39332a = i;
    }

    public void setNewTags(List<NewTags> list) {
        m60696d(list, false, false, m60693a(84.0f));
    }

    public void setOnTagClickListener(InterfaceC9321a interfaceC9321a) {
    }

    public CardLabelShowView4(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardLabelShowView4(Context context) {
        this(context, null);
    }
}
