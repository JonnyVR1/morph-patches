package com.p051p1.mobile.putong.core.view;

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
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.data.TagCategories;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p153l.c9c0;
import p153l.jyb;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class CardLabelShowView extends View {

    /* JADX INFO: renamed from: a */
    public int f39268a;

    /* JADX INFO: renamed from: b */
    public volatile List<NewTags> f39269b;

    /* JADX INFO: renamed from: c */
    public volatile List<NewTags> f39270c;

    /* JADX INFO: renamed from: d */
    public List<NewTags> f39271d;

    /* JADX INFO: renamed from: e */
    public volatile HashMap<String, Bitmap> f39272e;

    /* JADX INFO: renamed from: f */
    public Paint f39273f;

    /* JADX INFO: renamed from: g */
    public Paint f39274g;

    /* JADX INFO: renamed from: h */
    public Paint f39275h;

    /* JADX INFO: renamed from: i */
    public Paint f39276i;

    /* JADX INFO: renamed from: j */
    public Paint f39277j;

    /* JADX INFO: renamed from: k */
    public Paint f39278k;

    /* JADX INFO: renamed from: l */
    public int f39279l;

    /* JADX INFO: renamed from: m */
    public int f39280m;

    /* JADX INFO: renamed from: n */
    public List<RectF> f39281n;

    /* JADX INFO: renamed from: o */
    public List<RectF> f39282o;

    /* JADX INFO: renamed from: p */
    public int f39283p;

    /* JADX INFO: renamed from: q */
    public int f39284q;

    /* JADX INFO: renamed from: r */
    public boolean f39285r;

    /* JADX INFO: renamed from: s */
    @ColorInt
    public int f39286s;

    /* JADX INFO: renamed from: t */
    @ColorInt
    public int f39287t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CardLabelShowView$a */
    public class C9317a implements y20<Bitmap> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TagCategories f39288a;

        public C9317a(TagCategories tagCategories) {
            this.f39288a = tagCategories;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Bitmap bitmap) {
            CardLabelShowView.this.f39272e.put(this.f39288a.iconWhite, bitmap);
            CardLabelShowView.this.postInvalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CardLabelShowView$b */
    public class C9318b implements y20<Bitmap> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TagCategories f39290a;

        public C9318b(TagCategories tagCategories) {
            this.f39290a = tagCategories;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Bitmap bitmap) {
            CardLabelShowView.this.f39272e.put(this.f39290a.iconWhite, bitmap);
            CardLabelShowView.this.postInvalidate();
        }
    }

    public CardLabelShowView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39268a = 2;
        this.f39269b = new ArrayList();
        this.f39270c = new ArrayList();
        this.f39271d = new ArrayList();
        this.f39272e = new HashMap<>();
        this.f39276i = null;
        this.f39281n = new ArrayList();
        this.f39282o = new ArrayList();
        this.f39284q = m60677a(6.0f);
        m60678b();
    }

    /* JADX INFO: renamed from: a */
    public static int m60677a(float f) {
        return (int) (App.f16088e.getResources().getDisplayMetrics().density * f);
    }

    /* JADX INFO: renamed from: b */
    public final void m60678b() {
        Paint paint = new Paint();
        this.f39273f = paint;
        paint.setAntiAlias(true);
        this.f39273f.setColor(App.f16088e.getResources().getColor(c9c0.f80360O));
        Paint paint2 = this.f39273f;
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f39274g = paint3;
        paint3.setAntiAlias(true);
        this.f39274g.setColor(App.f16088e.getResources().getColor(c9c0.f80431k0));
        this.f39274g.setStyle(style);
        Paint paint4 = new Paint();
        this.f39275h = paint4;
        paint4.setAntiAlias(true);
        this.f39275h.setColor(App.f16088e.getResources().getColor(c9c0.f80373S0));
        this.f39275h.setStyle(style);
        Paint paint5 = new Paint();
        this.f39277j = paint5;
        paint5.setAntiAlias(true);
        Paint paint6 = new Paint();
        this.f39278k = paint6;
        paint6.setAntiAlias(true);
        this.f39278k.setColor(Color.parseColor("#FFFFFF"));
        this.f39278k.setTextSize(m60677a(12.0f));
        Rect rect = new Rect();
        this.f39278k.getTextBounds("高", 0, 1, rect);
        int i = rect.bottom - rect.top;
        this.f39280m = (((m60677a(24.0f) - i) / 2) + i) - m60677a(1.0f);
    }

    /* JADX INFO: renamed from: c */
    public boolean m60679c(List<NewTags> list) {
        if (this.f39285r || jyb.m147479J(list) || jyb.m147479J(this.f39270c) || list.size() != this.f39270c.size()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals(list.get(i).name, this.f39270c.get(i).name)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void m60680d(List<NewTags> list, boolean z) {
        this.f39285r = z;
        if (m60679c(list)) {
            this.f39271d.clear();
            this.f39269b.clear();
            this.f39269b.addAll(list);
            this.f39272e.clear();
            for (int i = 0; i < this.f39269b.size(); i++) {
                if (!jyb.m147479J(this.f39269b.get(i).localTagCategories)) {
                    TagCategories tagCategories = this.f39269b.get(i).localTagCategories.get(0);
                    uqb0.f180374G.m127108I(tagCategories.iconWhite, new C9317a(tagCategories));
                }
            }
            requestLayout();
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m60681e(@ColorInt int i, @ColorInt int i2) {
        this.f39286s = i;
        this.f39287t = i2;
        Paint paint = new Paint();
        this.f39276i = paint;
        paint.setAntiAlias(true);
        this.f39276i.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < this.f39271d.size(); i++) {
            RectF rectF = this.f39281n.get(i);
            if (this.f39271d.get(i).localIsCommonLabel) {
                Paint paint = this.f39276i;
                if (paint != null) {
                    paint.setShader(new LinearGradient(0.0f, 0.0f, rectF.right, 0.0f, this.f39286s, this.f39287t, Shader.TileMode.MIRROR));
                    RectF rectF2 = this.f39281n.get(i);
                    int i2 = this.f39284q;
                    canvas.drawRoundRect(rectF2, i2, i2, this.f39276i);
                } else {
                    RectF rectF3 = this.f39281n.get(i);
                    int i3 = this.f39284q;
                    canvas.drawRoundRect(rectF3, i3, i3, this.f39275h);
                }
            } else {
                RectF rectF4 = this.f39281n.get(i);
                int i4 = this.f39284q;
                canvas.drawRoundRect(rectF4, i4, i4, this.f39274g);
                RectF rectF5 = this.f39281n.get(i);
                int i5 = this.f39284q;
                canvas.drawRoundRect(rectF5, i5, i5, this.f39273f);
            }
            TagCategories tagCategories = this.f39269b.get(i).localTagCategories.get(0);
            if (this.f39272e.get(tagCategories.iconWhite) != null && !this.f39272e.get(tagCategories.iconWhite).isRecycled()) {
                canvas.drawBitmap(this.f39272e.get(tagCategories.iconWhite), (Rect) null, this.f39282o.get(i), this.f39277j);
            } else if (this.f39272e.get(tagCategories.iconWhite) != null && this.f39272e.get(tagCategories.iconWhite).isRecycled()) {
                uqb0.f180374G.m127108I(tagCategories.iconWhite, new C9318b(tagCategories));
            }
            canvas.drawText(this.f39271d.get(i).localShowName, rectF.left + m60677a(22.0f), rectF.top + this.f39280m, this.f39278k);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        float fM60677a;
        this.f39279l = View.MeasureSpec.getSize(i) - m60677a(5.0f);
        int measuredHeight = getMeasuredHeight();
        if (this.f39279l > 0 && !m60679c(this.f39269b) && measuredHeight > 0 && measuredHeight == this.f39283p) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), this.f39283p);
            return;
        }
        this.f39281n.clear();
        this.f39271d.clear();
        this.f39282o.clear();
        int i3 = this.f39269b.size() > 0 ? 1 : 0;
        float fM60677a2 = 0.0f;
        for (int i4 = 0; i4 < this.f39269b.size(); i4++) {
            int iM60677a = (i3 - 1) * m60677a(32.0f);
            RectF rectF = new RectF();
            float fMeasureText = this.f39278k.measureText(this.f39269b.get(i4).name);
            float fM60677a3 = fM60677a2 + fMeasureText + m60677a(30.0f);
            if (fM60677a3 <= this.f39279l) {
                rectF.left = fM60677a2 == 0.0f ? 0.0f : fM60677a2 + m60677a(5.0f);
                rectF.top = iM60677a;
                rectF.right = (fM60677a2 == 0.0f ? 0 : m60677a(5.0f)) + fM60677a3;
                rectF.bottom = m60677a(24.0f) + iM60677a;
                this.f39281n.add(rectF);
                this.f39271d.add(this.f39269b.get(i4));
                fM60677a2 = fM60677a3 + (fM60677a2 == 0.0f ? 0 : m60677a(5.0f));
            } else if (m60677a(80.0f) + fM60677a2 < this.f39279l) {
                rectF.left = fM60677a2 == 0.0f ? 0.0f : fM60677a2 + m60677a(5.0f);
                rectF.top = iM60677a;
                rectF.right = this.f39279l;
                rectF.bottom = m60677a(24.0f) + iM60677a;
                this.f39281n.add(rectF);
                this.f39271d.add(this.f39269b.get(i4));
                i3++;
                int i5 = this.f39268a;
                if (i3 > i5) {
                    i3 = i5;
                    break;
                } else {
                    fM60677a = 0.0f;
                    fM60677a2 = fM60677a;
                }
            } else {
                int i6 = i3 + 1;
                int i7 = this.f39268a;
                if (i6 > i7) {
                    i3 = i7;
                    break;
                }
                fM60677a = fMeasureText + m60677a(30.0f);
                int iM60677a2 = i3 * m60677a(32.0f);
                rectF.left = 0.0f;
                rectF.top = iM60677a2;
                rectF.right = fM60677a;
                rectF.bottom = m60677a(24.0f) + iM60677a2;
                this.f39281n.add(rectF);
                this.f39271d.add(this.f39269b.get(i4));
                i3 = i6;
                fM60677a2 = fM60677a;
            }
        }
        for (int i8 = 0; i8 < this.f39271d.size(); i8++) {
            RectF rectF2 = this.f39281n.get(i8);
            RectF rectF3 = new RectF();
            rectF3.top = rectF2.top + m60677a(4.0f);
            float fM60677a4 = rectF2.left + m60677a(4.0f);
            rectF3.left = fM60677a4;
            rectF3.right = fM60677a4 + m60677a(16.0f);
            rectF3.bottom = rectF3.top + m60677a(16.0f);
            this.f39282o.add(rectF3);
            float fMeasureText2 = this.f39278k.measureText(this.f39271d.get(i8).name);
            float fM60677a5 = ((rectF2.right - m60677a(8.0f)) - rectF2.left) - m60677a(22.0f);
            List<NewTags> list = this.f39271d;
            if (fM60677a5 >= fMeasureText2) {
                list.get(i8).localShowName = this.f39271d.get(i8).name;
            } else {
                int iRound = Math.round((fM60677a5 / fMeasureText2) * list.get(i8).name.length());
                this.f39271d.get(i8).localShowName = (iRound > 0 ? this.f39271d.get(i8).name.substring(0, iRound - 1) : "").concat("...");
            }
        }
        int iM60677a3 = i3 > 0 ? m60677a((i3 * 24) + ((i3 - 1) * 8)) : 0;
        this.f39283p = iM60677a3;
        this.f39270c.clear();
        this.f39270c.addAll(this.f39269b);
        setMeasuredDimension(View.MeasureSpec.getSize(i), iM60677a3);
    }

    public void setMostLine(int i) {
        this.f39268a = i;
    }

    public void setNewTags(List<NewTags> list) {
        m60680d(list, false);
    }

    public CardLabelShowView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardLabelShowView(Context context) {
        this(context, null);
    }
}
