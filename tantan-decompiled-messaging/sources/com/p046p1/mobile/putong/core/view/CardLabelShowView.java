package com.p046p1.mobile.putong.core.view;

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
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.data.TagCategories;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p149l.e30;
import p149l.qib0;
import p149l.vwb;
import p149l.w0c0;

/* JADX INFO: loaded from: classes10.dex */
public class CardLabelShowView extends View {

    /* JADX INFO: renamed from: a */
    public int f38420a;

    /* JADX INFO: renamed from: b */
    public volatile List<NewTags> f38421b;

    /* JADX INFO: renamed from: c */
    public volatile List<NewTags> f38422c;

    /* JADX INFO: renamed from: d */
    public List<NewTags> f38423d;

    /* JADX INFO: renamed from: e */
    public volatile HashMap<String, Bitmap> f38424e;

    /* JADX INFO: renamed from: f */
    public Paint f38425f;

    /* JADX INFO: renamed from: g */
    public Paint f38426g;

    /* JADX INFO: renamed from: h */
    public Paint f38427h;

    /* JADX INFO: renamed from: i */
    public Paint f38428i;

    /* JADX INFO: renamed from: j */
    public Paint f38429j;

    /* JADX INFO: renamed from: k */
    public Paint f38430k;

    /* JADX INFO: renamed from: l */
    public int f38431l;

    /* JADX INFO: renamed from: m */
    public int f38432m;

    /* JADX INFO: renamed from: n */
    public List<RectF> f38433n;

    /* JADX INFO: renamed from: o */
    public List<RectF> f38434o;

    /* JADX INFO: renamed from: p */
    public int f38435p;

    /* JADX INFO: renamed from: q */
    public int f38436q;

    /* JADX INFO: renamed from: r */
    public boolean f38437r;

    /* JADX INFO: renamed from: s */
    @ColorInt
    public int f38438s;

    /* JADX INFO: renamed from: t */
    @ColorInt
    public int f38439t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CardLabelShowView$a */
    public class C9154a implements e30<Bitmap> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TagCategories f38440a;

        public C9154a(TagCategories tagCategories) {
            this.f38440a = tagCategories;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Bitmap bitmap) {
            CardLabelShowView.this.f38424e.put(this.f38440a.iconWhite, bitmap);
            CardLabelShowView.this.postInvalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CardLabelShowView$b */
    public class C9155b implements e30<Bitmap> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TagCategories f38442a;

        public C9155b(TagCategories tagCategories) {
            this.f38442a = tagCategories;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Bitmap bitmap) {
            CardLabelShowView.this.f38424e.put(this.f38442a.iconWhite, bitmap);
            CardLabelShowView.this.postInvalidate();
        }
    }

    public CardLabelShowView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38420a = 2;
        this.f38421b = new ArrayList();
        this.f38422c = new ArrayList();
        this.f38423d = new ArrayList();
        this.f38424e = new HashMap<>();
        this.f38428i = null;
        this.f38433n = new ArrayList();
        this.f38434o = new ArrayList();
        this.f38436q = m59493a(6.0f);
        m59494b();
    }

    /* JADX INFO: renamed from: a */
    public static int m59493a(float f) {
        return (int) (App.f15369e.getResources().getDisplayMetrics().density * f);
    }

    /* JADX INFO: renamed from: b */
    public final void m59494b() {
        Paint paint = new Paint();
        this.f38425f = paint;
        paint.setAntiAlias(true);
        this.f38425f.setColor(App.f15369e.getResources().getColor(w0c0.f183791O));
        Paint paint2 = this.f38425f;
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f38426g = paint3;
        paint3.setAntiAlias(true);
        this.f38426g.setColor(App.f15369e.getResources().getColor(w0c0.f183858j0));
        this.f38426g.setStyle(style);
        Paint paint4 = new Paint();
        this.f38427h = paint4;
        paint4.setAntiAlias(true);
        this.f38427h.setColor(App.f15369e.getResources().getColor(w0c0.f183801R0));
        this.f38427h.setStyle(style);
        Paint paint5 = new Paint();
        this.f38429j = paint5;
        paint5.setAntiAlias(true);
        Paint paint6 = new Paint();
        this.f38430k = paint6;
        paint6.setAntiAlias(true);
        this.f38430k.setColor(Color.parseColor("#FFFFFF"));
        this.f38430k.setTextSize(m59493a(12.0f));
        Rect rect = new Rect();
        this.f38430k.getTextBounds("高", 0, 1, rect);
        int i = rect.bottom - rect.top;
        this.f38432m = (((m59493a(24.0f) - i) / 2) + i) - m59493a(1.0f);
    }

    /* JADX INFO: renamed from: c */
    public boolean m59495c(List<NewTags> list) {
        if (this.f38437r || vwb.m200296J(list) || vwb.m200296J(this.f38422c) || list.size() != this.f38422c.size()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals(list.get(i).name, this.f38422c.get(i).name)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void m59496d(List<NewTags> list, boolean z) {
        this.f38437r = z;
        if (m59495c(list)) {
            this.f38423d.clear();
            this.f38421b.clear();
            this.f38421b.addAll(list);
            this.f38424e.clear();
            for (int i = 0; i < this.f38421b.size(); i++) {
                if (!vwb.m200296J(this.f38421b.get(i).localTagCategories)) {
                    TagCategories tagCategories = this.f38421b.get(i).localTagCategories.get(0);
                    qib0.f154691G.m102324I(tagCategories.iconWhite, new C9154a(tagCategories));
                }
            }
            requestLayout();
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m59497e(@ColorInt int i, @ColorInt int i2) {
        this.f38438s = i;
        this.f38439t = i2;
        Paint paint = new Paint();
        this.f38428i = paint;
        paint.setAntiAlias(true);
        this.f38428i.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < this.f38423d.size(); i++) {
            RectF rectF = this.f38433n.get(i);
            if (this.f38423d.get(i).localIsCommonLabel) {
                Paint paint = this.f38428i;
                if (paint != null) {
                    paint.setShader(new LinearGradient(0.0f, 0.0f, rectF.right, 0.0f, this.f38438s, this.f38439t, Shader.TileMode.MIRROR));
                    RectF rectF2 = this.f38433n.get(i);
                    int i2 = this.f38436q;
                    canvas.drawRoundRect(rectF2, i2, i2, this.f38428i);
                } else {
                    RectF rectF3 = this.f38433n.get(i);
                    int i3 = this.f38436q;
                    canvas.drawRoundRect(rectF3, i3, i3, this.f38427h);
                }
            } else {
                RectF rectF4 = this.f38433n.get(i);
                int i4 = this.f38436q;
                canvas.drawRoundRect(rectF4, i4, i4, this.f38426g);
                RectF rectF5 = this.f38433n.get(i);
                int i5 = this.f38436q;
                canvas.drawRoundRect(rectF5, i5, i5, this.f38425f);
            }
            TagCategories tagCategories = this.f38421b.get(i).localTagCategories.get(0);
            if (this.f38424e.get(tagCategories.iconWhite) != null && !this.f38424e.get(tagCategories.iconWhite).isRecycled()) {
                canvas.drawBitmap(this.f38424e.get(tagCategories.iconWhite), (Rect) null, this.f38434o.get(i), this.f38429j);
            } else if (this.f38424e.get(tagCategories.iconWhite) != null && this.f38424e.get(tagCategories.iconWhite).isRecycled()) {
                qib0.f154691G.m102324I(tagCategories.iconWhite, new C9155b(tagCategories));
            }
            canvas.drawText(this.f38423d.get(i).localShowName, rectF.left + m59493a(22.0f), rectF.top + this.f38432m, this.f38430k);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        float fM59493a;
        this.f38431l = View.MeasureSpec.getSize(i) - m59493a(5.0f);
        int measuredHeight = getMeasuredHeight();
        if (this.f38431l > 0 && !m59495c(this.f38421b) && measuredHeight > 0 && measuredHeight == this.f38435p) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), this.f38435p);
            return;
        }
        this.f38433n.clear();
        this.f38423d.clear();
        this.f38434o.clear();
        int i3 = this.f38421b.size() > 0 ? 1 : 0;
        float fM59493a2 = 0.0f;
        for (int i4 = 0; i4 < this.f38421b.size(); i4++) {
            int iM59493a = (i3 - 1) * m59493a(32.0f);
            RectF rectF = new RectF();
            float fMeasureText = this.f38430k.measureText(this.f38421b.get(i4).name);
            float fM59493a3 = fM59493a2 + fMeasureText + m59493a(30.0f);
            if (fM59493a3 <= this.f38431l) {
                rectF.left = fM59493a2 == 0.0f ? 0.0f : fM59493a2 + m59493a(5.0f);
                rectF.top = iM59493a;
                rectF.right = (fM59493a2 == 0.0f ? 0 : m59493a(5.0f)) + fM59493a3;
                rectF.bottom = m59493a(24.0f) + iM59493a;
                this.f38433n.add(rectF);
                this.f38423d.add(this.f38421b.get(i4));
                fM59493a2 = fM59493a3 + (fM59493a2 == 0.0f ? 0 : m59493a(5.0f));
            } else if (m59493a(80.0f) + fM59493a2 < this.f38431l) {
                rectF.left = fM59493a2 == 0.0f ? 0.0f : fM59493a2 + m59493a(5.0f);
                rectF.top = iM59493a;
                rectF.right = this.f38431l;
                rectF.bottom = m59493a(24.0f) + iM59493a;
                this.f38433n.add(rectF);
                this.f38423d.add(this.f38421b.get(i4));
                i3++;
                int i5 = this.f38420a;
                if (i3 > i5) {
                    i3 = i5;
                    break;
                } else {
                    fM59493a = 0.0f;
                    fM59493a2 = fM59493a;
                }
            } else {
                int i6 = i3 + 1;
                int i7 = this.f38420a;
                if (i6 > i7) {
                    i3 = i7;
                    break;
                }
                fM59493a = fMeasureText + m59493a(30.0f);
                int iM59493a2 = i3 * m59493a(32.0f);
                rectF.left = 0.0f;
                rectF.top = iM59493a2;
                rectF.right = fM59493a;
                rectF.bottom = m59493a(24.0f) + iM59493a2;
                this.f38433n.add(rectF);
                this.f38423d.add(this.f38421b.get(i4));
                i3 = i6;
                fM59493a2 = fM59493a;
            }
        }
        for (int i8 = 0; i8 < this.f38423d.size(); i8++) {
            RectF rectF2 = this.f38433n.get(i8);
            RectF rectF3 = new RectF();
            rectF3.top = rectF2.top + m59493a(4.0f);
            float fM59493a4 = rectF2.left + m59493a(4.0f);
            rectF3.left = fM59493a4;
            rectF3.right = fM59493a4 + m59493a(16.0f);
            rectF3.bottom = rectF3.top + m59493a(16.0f);
            this.f38434o.add(rectF3);
            float fMeasureText2 = this.f38430k.measureText(this.f38423d.get(i8).name);
            float fM59493a5 = ((rectF2.right - m59493a(8.0f)) - rectF2.left) - m59493a(22.0f);
            List<NewTags> list = this.f38423d;
            if (fM59493a5 >= fMeasureText2) {
                list.get(i8).localShowName = this.f38423d.get(i8).name;
            } else {
                int iRound = Math.round((fM59493a5 / fMeasureText2) * list.get(i8).name.length());
                this.f38423d.get(i8).localShowName = (iRound > 0 ? this.f38423d.get(i8).name.substring(0, iRound - 1) : "").concat("...");
            }
        }
        int iM59493a3 = i3 > 0 ? m59493a((i3 * 24) + ((i3 - 1) * 8)) : 0;
        this.f38435p = iM59493a3;
        this.f38422c.clear();
        this.f38422c.addAll(this.f38421b);
        setMeasuredDimension(View.MeasureSpec.getSize(i), iM59493a3);
    }

    public void setMostLine(int i) {
        this.f38420a = i;
    }

    public void setNewTags(List<NewTags> list) {
        m59496d(list, false);
    }

    public CardLabelShowView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardLabelShowView(Context context) {
        this(context, null);
    }
}
