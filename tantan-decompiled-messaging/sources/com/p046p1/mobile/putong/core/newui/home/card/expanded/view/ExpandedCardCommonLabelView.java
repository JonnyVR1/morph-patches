package com.p046p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.putong.core.data.LabelData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.eqh0;
import p149l.j760;
import p149l.t100;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedCardCommonLabelView extends View {

    /* JADX INFO: renamed from: a */
    public C7961c f22516a;

    /* JADX INFO: renamed from: b */
    public CommonLabelState f22517b;

    /* JADX INFO: renamed from: c */
    public int f22518c;

    /* JADX INFO: renamed from: d */
    public int f22519d;

    /* JADX INFO: renamed from: e */
    public int f22520e;

    /* JADX INFO: renamed from: f */
    public List<C7960b> f22521f;

    /* JADX INFO: renamed from: g */
    public TextPaint f22522g;

    /* JADX INFO: renamed from: h */
    public Paint f22523h;

    /* JADX INFO: renamed from: i */
    public Rect f22524i;

    /* JADX INFO: renamed from: j */
    public PorterDuffXfermode f22525j;

    /* JADX INFO: renamed from: k */
    public float f22526k;

    /* JADX INFO: renamed from: l */
    public float f22527l;

    /* JADX INFO: renamed from: m */
    public int f22528m;

    /* JADX INFO: renamed from: n */
    public int f22529n;

    public enum CommonLabelState {
        INIT("初始化状态"),
        MEASURED("已经计算过大小");

        private String des;

        CommonLabelState(String str) {
            this.des = str;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardCommonLabelView$a */
    public interface InterfaceC7959a {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardCommonLabelView$b */
    public static class C7960b {

        /* JADX INFO: renamed from: a */
        public String f22530a;

        /* JADX INFO: renamed from: b */
        public int f22531b;

        /* JADX INFO: renamed from: c */
        public boolean f22532c = false;

        /* JADX INFO: renamed from: d */
        public boolean f22533d = false;

        /* JADX INFO: renamed from: e */
        public RectF f22534e = new RectF();

        /* JADX INFO: renamed from: f */
        public RectF f22535f = new RectF();

        /* JADX INFO: renamed from: g */
        public float f22536g;

        /* JADX INFO: renamed from: h */
        public float f22537h;

        /* JADX INFO: renamed from: i */
        public String f22538i;

        /* JADX INFO: renamed from: j */
        public Bitmap f22539j;

        /* JADX INFO: renamed from: k */
        public Rect f22540k;

        public C7960b(String str, int i, Context context) {
            this.f22530a = str;
            this.f22531b = i;
            this.f22538i = str;
            if (m38252o()) {
                this.f22539j = BitmapFactory.decodeResource(context.getResources(), i);
                this.f22540k = new Rect(0, 0, this.f22539j.getWidth(), this.f22539j.getHeight());
            }
        }

        /* JADX INFO: renamed from: o */
        public boolean m38252o() {
            int i = this.f22531b;
            return (i == 0 || i == -1) ? false : true;
        }

        /* JADX INFO: renamed from: p */
        public C7960b m38253p(boolean z) {
            this.f22532c = z;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardCommonLabelView$c */
    public static class C7961c implements Cloneable {

        /* JADX INFO: renamed from: a */
        public int f22541a;

        /* JADX INFO: renamed from: b */
        public int f22542b;

        /* JADX INFO: renamed from: c */
        public int f22543c;

        /* JADX INFO: renamed from: d */
        public int f22544d;

        /* JADX INFO: renamed from: e */
        public int f22545e;

        /* JADX INFO: renamed from: f */
        public int f22546f;

        /* JADX INFO: renamed from: g */
        public int f22547g;

        /* JADX INFO: renamed from: h */
        public int f22548h;

        /* JADX INFO: renamed from: i */
        public int f22549i;

        /* JADX INFO: renamed from: j */
        public int f22550j;

        /* JADX INFO: renamed from: k */
        public int f22551k;

        /* JADX INFO: renamed from: l */
        public int f22552l;

        /* JADX INFO: renamed from: m */
        public int f22553m;

        /* JADX INFO: renamed from: n */
        public int f22554n;

        /* JADX INFO: renamed from: o */
        public int f22555o;

        /* JADX INFO: renamed from: p */
        public float f22556p;

        /* JADX INFO: renamed from: q */
        public Bitmap f22557q;

        public C7961c() {
            this.f22541a = t100.f167262k;
            this.f22542b = -872415232;
            this.f22543c = 134217728;
            this.f22544d = t100.m186890d(44.0f);
            this.f22545e = t100.f167266o;
            int i = t100.f167264m;
            this.f22546f = i;
            this.f22547g = i;
            this.f22548h = t100.f167261j;
            this.f22549i = t100.f167256e;
            int i2 = t100.f167259h;
            this.f22553m = i2;
            this.f22550j = i2;
            this.f22551k = -6686;
            this.f22552l = -1;
            this.f22554n = 20;
            this.f22555o = 20;
        }

        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public C7961c clone() {
            C7961c c7961c = new C7961c();
            c7961c.f22541a = this.f22541a;
            c7961c.f22542b = this.f22542b;
            c7961c.f22543c = this.f22543c;
            c7961c.f22544d = this.f22544d;
            c7961c.f22545e = this.f22545e;
            c7961c.f22546f = this.f22546f;
            c7961c.f22547g = this.f22547g;
            c7961c.f22548h = this.f22548h;
            c7961c.f22549i = this.f22549i;
            c7961c.f22553m = this.f22553m;
            c7961c.f22550j = this.f22550j;
            c7961c.f22551k = this.f22551k;
            c7961c.f22552l = this.f22552l;
            c7961c.f22555o = this.f22555o;
            c7961c.f22554n = this.f22554n;
            return c7961c;
        }

        /* JADX INFO: renamed from: N */
        public boolean m38286N() {
            int i = this.f22552l;
            return (i == -1 || i == 0) ? false : true;
        }

        /* JADX INFO: renamed from: O */
        public final boolean m38287O(C7961c c7961c) {
            return (c7961c.f22541a == this.f22541a && c7961c.f22545e == this.f22545e && c7961c.f22546f == this.f22546f && c7961c.f22547g == this.f22547g && c7961c.f22548h == this.f22548h && c7961c.f22549i == this.f22549i && c7961c.f22553m == this.f22553m && c7961c.f22544d == this.f22544d && c7961c.f22554n == this.f22554n && c7961c.f22555o == this.f22555o) ? false : true;
        }
    }

    public ExpandedCardCommonLabelView(Context context) {
        super(context);
        this.f22517b = CommonLabelState.INIT;
        this.f22518c = -1;
        this.f22525j = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.f22526k = 0.0f;
        this.f22527l = 0.0f;
        this.f22528m = 0;
        this.f22529n = 1;
        m38232c();
    }

    /* JADX INFO: renamed from: a */
    public final void m38230a(C7960b c7960b, int i) {
        float f;
        if (TextUtils.isEmpty(c7960b.f22530a)) {
            c7960b.f22533d = false;
            return;
        }
        float fMeasureText = this.f22522g.measureText(c7960b.f22530a);
        boolean zM38252o = c7960b.m38252o();
        C7961c c7961c = this.f22516a;
        if (zM38252o) {
            f = c7961c.f22548h + this.f22516a.f22545e + this.f22516a.f22549i + this.f22516a.f22546f;
            c7960b.f22536g = this.f22526k + this.f22516a.f22548h + this.f22516a.f22545e + this.f22516a.f22549i;
            c7960b.f22537h = this.f22527l + this.f22516a.f22556p;
        } else {
            f = c7961c.f22547g + this.f22516a.f22546f;
            c7960b.f22536g = this.f22526k + this.f22516a.f22547g;
            c7960b.f22537h = this.f22527l + this.f22516a.f22556p;
        }
        float f2 = this.f22526k;
        float f3 = i;
        if (f2 + fMeasureText + f < f3) {
            m38231b(c7960b, fMeasureText, f, i);
            return;
        }
        float f4 = 0.0f;
        if (f2 != 0.0f) {
            this.f22529n++;
            this.f22526k = 0.0f;
            this.f22527l = this.f22527l + this.f22516a.f22544d + this.f22516a.f22553m;
            if (this.f22529n <= this.f22516a.f22555o) {
                m38230a(c7960b, i);
                return;
            }
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 > c7960b.f22530a.length()) {
                fMeasureText = f4;
                break;
            }
            float fMeasureText2 = this.f22522g.measureText(c7960b.f22530a.substring(0, i3).concat("..."));
            if (this.f22526k + fMeasureText2 + f >= f3) {
                break;
            }
            f4 = fMeasureText;
            fMeasureText = fMeasureText2;
            i2 = i3;
        }
        c7960b.f22538i = c7960b.f22530a.substring(0, Math.min(i2, c7960b.f22530a.length())).concat("...");
        m38231b(c7960b, fMeasureText, f, i);
    }

    /* JADX INFO: renamed from: b */
    public final void m38231b(C7960b c7960b, float f, float f2, int i) {
        c7960b.f22533d = true;
        RectF rectF = c7960b.f22534e;
        float f3 = this.f22526k;
        float f4 = this.f22527l;
        rectF.set(f3, f4, f + f3 + f2, this.f22516a.f22544d + f4);
        if (c7960b.m38252o()) {
            c7960b.f22535f.set(this.f22526k + this.f22516a.f22548h, (this.f22527l + (this.f22516a.f22544d / 2.0f)) - (this.f22516a.f22545e / 2.0f), this.f22526k + this.f22516a.f22548h + this.f22516a.f22545e, this.f22527l + (this.f22516a.f22544d / 2.0f) + (this.f22516a.f22545e / 2.0f));
        }
        float f5 = c7960b.f22534e.right + this.f22516a.f22553m;
        this.f22526k = f5;
        if (f5 + f2 >= i) {
            this.f22526k = 0.0f;
            this.f22527l = this.f22527l + this.f22516a.f22544d + this.f22516a.f22553m;
            this.f22529n++;
        }
        this.f22528m++;
    }

    /* JADX INFO: renamed from: c */
    public final void m38232c() {
        this.f22516a = new C7961c();
        this.f22521f = new ArrayList();
        TextPaint textPaint = new TextPaint();
        this.f22522g = textPaint;
        textPaint.setAntiAlias(true);
        this.f22522g.setTypeface(eqh0.m117752c(3));
        Paint paint = new Paint();
        this.f22523h = paint;
        paint.setAntiAlias(true);
        this.f22524i = new Rect();
        m38237h();
    }

    /* JADX INFO: renamed from: d */
    public void m38233d(List<LabelData> list) {
        this.f22521f.clear();
        for (LabelData labelData : list) {
            C7960b c7960b = new C7960b(labelData.name, labelData.iconDrawableRes, getContext());
            c7960b.m38253p(labelData.highlight);
            this.f22521f.add(c7960b);
        }
        this.f22517b = CommonLabelState.INIT;
        requestLayout();
    }

    /* JADX INFO: renamed from: e */
    public void m38234e() {
        C7961c currentStyle = getCurrentStyle();
        currentStyle.f22552l = -5414;
        currentStyle.f22551k = -5414;
        currentStyle.f22543c = -592138;
        currentStyle.f22542b = -872415232;
        currentStyle.f22554n = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        currentStyle.f22555o = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i = t100.f167261j;
        currentStyle.f22550j = i;
        currentStyle.f22548h = i;
        currentStyle.f22549i = t100.f167259h;
        setLabelStyle(currentStyle);
    }

    /* JADX INFO: renamed from: f */
    public void m38235f() {
        C7961c currentStyle = getCurrentStyle();
        currentStyle.f22552l = -5414;
        currentStyle.f22551k = -5414;
        currentStyle.f22543c = -592138;
        currentStyle.f22542b = -872415232;
        currentStyle.f22554n = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        currentStyle.f22555o = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i = t100.f167261j;
        currentStyle.f22550j = i;
        currentStyle.f22548h = i;
        currentStyle.f22549i = t100.f167259h;
        int i2 = t100.f167265n;
        currentStyle.f22547g = i2;
        currentStyle.f22546f = i2;
        setLabelStyle(currentStyle);
    }

    /* JADX INFO: renamed from: g */
    public final void m38236g() {
        if (NullChecker.m81303a(null)) {
            ArrayList arrayList = new ArrayList();
            for (C7960b c7960b : this.f22521f) {
                if (c7960b.f22533d) {
                    arrayList.add(j760.m140076a(c7960b.f22534e, Boolean.valueOf(c7960b.f22532c)));
                }
            }
            throw null;
        }
    }

    public C7961c getCurrentStyle() {
        return this.f22516a.clone();
    }

    /* JADX INFO: renamed from: h */
    public final void m38237h() {
        this.f22522g.setTextSize(this.f22516a.f22541a);
        this.f22522g.setColor(this.f22516a.f22542b);
        C7961c c7961c = this.f22516a;
        c7961c.f22556p = (c7961c.f22544d / 2.0f) + (Math.abs(this.f22522g.ascent() + this.f22522g.descent()) / 2.0f);
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.f22517b == CommonLabelState.MEASURED) {
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
            this.f22523h.setXfermode(null);
            for (C7960b c7960b : this.f22521f) {
                if (c7960b.f22533d) {
                    if (!c7960b.f22532c) {
                        this.f22523h.setColor(this.f22516a.f22543c);
                        canvas.drawRoundRect(c7960b.f22534e, this.f22516a.f22550j, this.f22516a.f22550j, this.f22523h);
                    } else if (!this.f22516a.m38286N() || this.f22516a.f22557q == null || this.f22516a.f22557q.isRecycled()) {
                        this.f22523h.setColor(this.f22516a.f22551k);
                        canvas.drawRoundRect(c7960b.f22534e, this.f22516a.f22550j, this.f22516a.f22550j, this.f22523h);
                    } else {
                        this.f22523h.setColor(this.f22516a.f22551k);
                        canvas.drawRoundRect(c7960b.f22534e, this.f22516a.f22550j, this.f22516a.f22550j, this.f22523h);
                        this.f22523h.setXfermode(this.f22525j);
                        this.f22524i.set(0, 0, Math.min((int) ((this.f22516a.f22557q.getHeight() * c7960b.f22534e.width()) / c7960b.f22534e.height()), this.f22516a.f22557q.getWidth()), this.f22516a.f22557q.getHeight());
                        canvas.drawBitmap(this.f22516a.f22557q, this.f22524i, c7960b.f22534e, this.f22523h);
                    }
                    this.f22523h.setXfermode(null);
                    if (c7960b.m38252o()) {
                        this.f22523h.setColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
                        canvas.drawBitmap(c7960b.f22539j, c7960b.f22540k, c7960b.f22535f, this.f22523h);
                    }
                    canvas.drawText(c7960b.f22538i, c7960b.f22536g, c7960b.f22537h, this.f22522g);
                }
            }
            canvas.restoreToCount(iSaveLayer);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (size != this.f22519d || this.f22517b == CommonLabelState.INIT) {
            this.f22526k = 0.0f;
            this.f22527l = 0.0f;
            this.f22528m = 0;
            this.f22529n = 1;
            for (C7960b c7960b : this.f22521f) {
                if (this.f22529n > this.f22516a.f22555o || this.f22528m > this.f22516a.f22554n) {
                    break;
                }
                m38230a(c7960b, size);
                if (c7960b.f22533d) {
                    this.f22520e = (int) c7960b.f22534e.bottom;
                }
            }
            m38236g();
        }
        this.f22519d = size;
        this.f22517b = CommonLabelState.MEASURED;
        setMeasuredDimension(size, this.f22520e);
    }

    public void setLabelShowListener(InterfaceC7959a interfaceC7959a) {
    }

    public void setLabelStyle(C7961c c7961c) {
        if (this.f22516a.m38287O(c7961c)) {
            requestLayout();
        } else {
            invalidate();
        }
        this.f22516a = c7961c;
        if (c7961c.m38286N()) {
            this.f22516a.f22557q = BitmapFactory.decodeResource(getResources(), this.f22516a.f22552l);
        }
        m38237h();
    }

    public ExpandedCardCommonLabelView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22517b = CommonLabelState.INIT;
        this.f22518c = -1;
        this.f22525j = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.f22526k = 0.0f;
        this.f22527l = 0.0f;
        this.f22528m = 0;
        this.f22529n = 1;
        m38232c();
    }

    public ExpandedCardCommonLabelView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22517b = CommonLabelState.INIT;
        this.f22518c = -1;
        this.f22525j = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.f22526k = 0.0f;
        this.f22527l = 0.0f;
        this.f22528m = 0;
        this.f22529n = 1;
        m38232c();
    }
}
