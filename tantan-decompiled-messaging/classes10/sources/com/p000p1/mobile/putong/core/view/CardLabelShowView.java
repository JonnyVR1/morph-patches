package com.p000p1.mobile.putong.core.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.NewTags;
import com.p000p1.mobile.putong.core.data.TagCategories;
import com.p1.mobile.android.app.App;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.e30;
import l.qib0;
import l.vwb;
import l.w0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CardLabelShowView extends View {

    /* JADX INFO: renamed from: a */
    public int f2362a;

    /* JADX INFO: renamed from: b */
    public volatile List<NewTags> f2363b;

    /* JADX INFO: renamed from: c */
    public volatile List<NewTags> f2364c;

    /* JADX INFO: renamed from: d */
    public List<NewTags> f2365d;

    /* JADX INFO: renamed from: e */
    public volatile HashMap<String, Bitmap> f2366e;

    /* JADX INFO: renamed from: f */
    public Paint f2367f;

    /* JADX INFO: renamed from: g */
    public Paint f2368g;

    /* JADX INFO: renamed from: h */
    public Paint f2369h;

    /* JADX INFO: renamed from: i */
    public Paint f2370i;

    /* JADX INFO: renamed from: j */
    public Paint f2371j;

    /* JADX INFO: renamed from: k */
    public Paint f2372k;

    /* JADX INFO: renamed from: l */
    public int f2373l;

    /* JADX INFO: renamed from: m */
    public int f2374m;

    /* JADX INFO: renamed from: n */
    public List<RectF> f2375n;

    /* JADX INFO: renamed from: o */
    public List<RectF> f2376o;

    /* JADX INFO: renamed from: p */
    public int f2377p;

    /* JADX INFO: renamed from: q */
    public int f2378q;

    /* JADX INFO: renamed from: r */
    public boolean f2379r;

    /* JADX INFO: renamed from: s */
    @ColorInt
    public int f2380s;

    /* JADX INFO: renamed from: t */
    @ColorInt
    public int f2381t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CardLabelShowView$a */
    public class C3252a implements e30<Bitmap> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TagCategories f2382a;

        public C3252a(TagCategories tagCategories) {
            this.f2382a = tagCategories;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Bitmap bitmap) {
            CardLabelShowView.this.f2366e.put(this.f2382a.iconWhite, bitmap);
            CardLabelShowView.this.postInvalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CardLabelShowView$b */
    public class C3253b implements e30<Bitmap> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TagCategories f2384a;

        public C3253b(TagCategories tagCategories) {
            this.f2384a = tagCategories;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Bitmap bitmap) {
            CardLabelShowView.this.f2366e.put(this.f2384a.iconWhite, bitmap);
            CardLabelShowView.this.postInvalidate();
        }
    }

    public CardLabelShowView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2362a = 2;
        this.f2363b = new ArrayList();
        this.f2364c = new ArrayList();
        this.f2365d = new ArrayList();
        this.f2366e = new HashMap<>();
        this.f2370i = null;
        this.f2375n = new ArrayList();
        this.f2376o = new ArrayList();
        this.f2378q = m4902a(6.0f);
        m4903b();
    }

    /* JADX INFO: renamed from: a */
    public static int m4902a(float f) {
        return (int) (App.e.getResources().getDisplayMetrics().density * f);
    }

    /* JADX INFO: renamed from: b */
    public final void m4903b() {
        Paint paint = new Paint();
        this.f2367f = paint;
        paint.setAntiAlias(true);
        this.f2367f.setColor(App.e.getResources().getColor(w0c0.O));
        Paint paint2 = this.f2367f;
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f2368g = paint3;
        paint3.setAntiAlias(true);
        this.f2368g.setColor(App.e.getResources().getColor(w0c0.j0));
        this.f2368g.setStyle(style);
        Paint paint4 = new Paint();
        this.f2369h = paint4;
        paint4.setAntiAlias(true);
        this.f2369h.setColor(App.e.getResources().getColor(w0c0.R0));
        this.f2369h.setStyle(style);
        Paint paint5 = new Paint();
        this.f2371j = paint5;
        paint5.setAntiAlias(true);
        Paint paint6 = new Paint();
        this.f2372k = paint6;
        paint6.setAntiAlias(true);
        this.f2372k.setColor(Color.parseColor("#FFFFFF"));
        this.f2372k.setTextSize(m4902a(12.0f));
        Rect rect = new Rect();
        this.f2372k.getTextBounds("高", 0, 1, rect);
        int i = rect.bottom - rect.top;
        this.f2374m = (((m4902a(24.0f) - i) / 2) + i) - m4902a(1.0f);
    }

    /* JADX INFO: renamed from: c */
    public boolean m4904c(List<NewTags> list) {
        if (this.f2379r || vwb.J(list) || vwb.J(this.f2364c) || list.size() != this.f2364c.size()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals(list.get(i).name, this.f2364c.get(i).name)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void m4905d(List<NewTags> list, boolean z) {
        this.f2379r = z;
        if (m4904c(list)) {
            this.f2365d.clear();
            this.f2363b.clear();
            this.f2363b.addAll(list);
            this.f2366e.clear();
            for (int i = 0; i < this.f2363b.size(); i++) {
                if (!vwb.J(this.f2363b.get(i).localTagCategories)) {
                    TagCategories tagCategories = this.f2363b.get(i).localTagCategories.get(0);
                    qib0.G.I(tagCategories.iconWhite, new C3252a(tagCategories));
                }
            }
            requestLayout();
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m4906e(@ColorInt int i, @ColorInt int i2) {
        this.f2380s = i;
        this.f2381t = i2;
        Paint paint = new Paint();
        this.f2370i = paint;
        paint.setAntiAlias(true);
        this.f2370i.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < this.f2365d.size(); i++) {
            RectF rectF = this.f2375n.get(i);
            if (this.f2365d.get(i).localIsCommonLabel) {
                Paint paint = this.f2370i;
                if (paint != null) {
                    paint.setShader(new LinearGradient(0.0f, 0.0f, rectF.right, 0.0f, this.f2380s, this.f2381t, Shader.TileMode.MIRROR));
                    RectF rectF2 = this.f2375n.get(i);
                    int i2 = this.f2378q;
                    canvas.drawRoundRect(rectF2, i2, i2, this.f2370i);
                } else {
                    RectF rectF3 = this.f2375n.get(i);
                    int i3 = this.f2378q;
                    canvas.drawRoundRect(rectF3, i3, i3, this.f2369h);
                }
            } else {
                RectF rectF4 = this.f2375n.get(i);
                int i4 = this.f2378q;
                canvas.drawRoundRect(rectF4, i4, i4, this.f2368g);
                RectF rectF5 = this.f2375n.get(i);
                int i5 = this.f2378q;
                canvas.drawRoundRect(rectF5, i5, i5, this.f2367f);
            }
            TagCategories tagCategories = this.f2363b.get(i).localTagCategories.get(0);
            if (this.f2366e.get(tagCategories.iconWhite) != null && !this.f2366e.get(tagCategories.iconWhite).isRecycled()) {
                canvas.drawBitmap(this.f2366e.get(tagCategories.iconWhite), (Rect) null, this.f2376o.get(i), this.f2371j);
            } else if (this.f2366e.get(tagCategories.iconWhite) != null && this.f2366e.get(tagCategories.iconWhite).isRecycled()) {
                qib0.G.I(tagCategories.iconWhite, new C3253b(tagCategories));
            }
            canvas.drawText(this.f2365d.get(i).localShowName, rectF.left + m4902a(22.0f), rectF.top + this.f2374m, this.f2372k);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        float fM4902a;
        this.f2373l = View.MeasureSpec.getSize(i) - m4902a(5.0f);
        int measuredHeight = getMeasuredHeight();
        if (this.f2373l > 0 && !m4904c(this.f2363b) && measuredHeight > 0 && measuredHeight == this.f2377p) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), this.f2377p);
            return;
        }
        this.f2375n.clear();
        this.f2365d.clear();
        this.f2376o.clear();
        int i3 = this.f2363b.size() > 0 ? 1 : 0;
        float fM4902a2 = 0.0f;
        for (int i4 = 0; i4 < this.f2363b.size(); i4++) {
            int iM4902a = (i3 - 1) * m4902a(32.0f);
            RectF rectF = new RectF();
            float fMeasureText = this.f2372k.measureText(this.f2363b.get(i4).name);
            float fM4902a3 = fM4902a2 + fMeasureText + m4902a(30.0f);
            if (fM4902a3 <= this.f2373l) {
                rectF.left = fM4902a2 == 0.0f ? 0.0f : fM4902a2 + m4902a(5.0f);
                rectF.top = iM4902a;
                rectF.right = (fM4902a2 == 0.0f ? 0 : m4902a(5.0f)) + fM4902a3;
                rectF.bottom = m4902a(24.0f) + iM4902a;
                this.f2375n.add(rectF);
                this.f2365d.add(this.f2363b.get(i4));
                fM4902a2 = fM4902a3 + (fM4902a2 == 0.0f ? 0 : m4902a(5.0f));
            } else if (m4902a(80.0f) + fM4902a2 < this.f2373l) {
                rectF.left = fM4902a2 == 0.0f ? 0.0f : fM4902a2 + m4902a(5.0f);
                rectF.top = iM4902a;
                rectF.right = this.f2373l;
                rectF.bottom = m4902a(24.0f) + iM4902a;
                this.f2375n.add(rectF);
                this.f2365d.add(this.f2363b.get(i4));
                i3++;
                int i5 = this.f2362a;
                if (i3 > i5) {
                    i3 = i5;
                    break;
                } else {
                    fM4902a = 0.0f;
                    fM4902a2 = fM4902a;
                }
            } else {
                int i6 = i3 + 1;
                int i7 = this.f2362a;
                if (i6 > i7) {
                    i3 = i7;
                    break;
                }
                fM4902a = fMeasureText + m4902a(30.0f);
                int iM4902a2 = i3 * m4902a(32.0f);
                rectF.left = 0.0f;
                rectF.top = iM4902a2;
                rectF.right = fM4902a;
                rectF.bottom = m4902a(24.0f) + iM4902a2;
                this.f2375n.add(rectF);
                this.f2365d.add(this.f2363b.get(i4));
                i3 = i6;
                fM4902a2 = fM4902a;
            }
        }
        for (int i8 = 0; i8 < this.f2365d.size(); i8++) {
            RectF rectF2 = this.f2375n.get(i8);
            RectF rectF3 = new RectF();
            rectF3.top = rectF2.top + m4902a(4.0f);
            float fM4902a4 = rectF2.left + m4902a(4.0f);
            rectF3.left = fM4902a4;
            rectF3.right = fM4902a4 + m4902a(16.0f);
            rectF3.bottom = rectF3.top + m4902a(16.0f);
            this.f2376o.add(rectF3);
            float fMeasureText2 = this.f2372k.measureText(this.f2365d.get(i8).name);
            float fM4902a5 = ((rectF2.right - m4902a(8.0f)) - rectF2.left) - m4902a(22.0f);
            List<NewTags> list = this.f2365d;
            if (fM4902a5 >= fMeasureText2) {
                list.get(i8).localShowName = this.f2365d.get(i8).name;
            } else {
                int iRound = Math.round((fM4902a5 / fMeasureText2) * list.get(i8).name.length());
                this.f2365d.get(i8).localShowName = (iRound > 0 ? this.f2365d.get(i8).name.substring(0, iRound - 1) : "").concat("...");
            }
        }
        int iM4902a3 = i3 > 0 ? m4902a((i3 * 24) + ((i3 - 1) * 8)) : 0;
        this.f2377p = iM4902a3;
        this.f2364c.clear();
        this.f2364c.addAll(this.f2363b);
        setMeasuredDimension(View.MeasureSpec.getSize(i), iM4902a3);
    }

    public void setMostLine(int i) {
        this.f2362a = i;
    }

    public void setNewTags(List<NewTags> list) {
        m4905d(list, false);
    }

    public CardLabelShowView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardLabelShowView(Context context) {
        this(context, null);
    }
}
