package com.p000p1.mobile.putong.core.newui.home.card.expanded.view;

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
import com.p1.mobile.putong.core.data.LabelData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.eqh0;
import l.j760;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ExpandedCardCommonLabelView extends View {

    /* JADX INFO: renamed from: a */
    public C0125c f1294a;

    /* JADX INFO: renamed from: b */
    public CommonLabelState f1295b;

    /* JADX INFO: renamed from: c */
    public int f1296c;

    /* JADX INFO: renamed from: d */
    public int f1297d;

    /* JADX INFO: renamed from: e */
    public int f1298e;

    /* JADX INFO: renamed from: f */
    public List<C0124b> f1299f;

    /* JADX INFO: renamed from: g */
    public TextPaint f1300g;

    /* JADX INFO: renamed from: h */
    public Paint f1301h;

    /* JADX INFO: renamed from: i */
    public Rect f1302i;

    /* JADX INFO: renamed from: j */
    public PorterDuffXfermode f1303j;

    /* JADX INFO: renamed from: k */
    public float f1304k;

    /* JADX INFO: renamed from: l */
    public float f1305l;

    /* JADX INFO: renamed from: m */
    public int f1306m;

    /* JADX INFO: renamed from: n */
    public int f1307n;

    public enum CommonLabelState {
        INIT("初始化状态"),
        MEASURED("已经计算过大小");

        private String des;

        CommonLabelState(String str) {
            this.des = str;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardCommonLabelView$a */
    public interface InterfaceC0123a {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardCommonLabelView$b */
    public static class C0124b {

        /* JADX INFO: renamed from: a */
        public String f1308a;

        /* JADX INFO: renamed from: b */
        public int f1309b;

        /* JADX INFO: renamed from: c */
        public boolean f1310c = false;

        /* JADX INFO: renamed from: d */
        public boolean f1311d = false;

        /* JADX INFO: renamed from: e */
        public RectF f1312e = new RectF();

        /* JADX INFO: renamed from: f */
        public RectF f1313f = new RectF();

        /* JADX INFO: renamed from: g */
        public float f1314g;

        /* JADX INFO: renamed from: h */
        public float f1315h;

        /* JADX INFO: renamed from: i */
        public String f1316i;

        /* JADX INFO: renamed from: j */
        public Bitmap f1317j;

        /* JADX INFO: renamed from: k */
        public Rect f1318k;

        public C0124b(String str, int i, Context context) {
            this.f1308a = str;
            this.f1309b = i;
            this.f1316i = str;
            if (m2230o()) {
                this.f1317j = BitmapFactory.decodeResource(context.getResources(), i);
                this.f1318k = new Rect(0, 0, this.f1317j.getWidth(), this.f1317j.getHeight());
            }
        }

        /* JADX INFO: renamed from: o */
        public boolean m2230o() {
            int i = this.f1309b;
            return (i == 0 || i == -1) ? false : true;
        }

        /* JADX INFO: renamed from: p */
        public C0124b m2231p(boolean z) {
            this.f1310c = z;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardCommonLabelView$c */
    public static class C0125c implements Cloneable {

        /* JADX INFO: renamed from: a */
        public int f1319a;

        /* JADX INFO: renamed from: b */
        public int f1320b;

        /* JADX INFO: renamed from: c */
        public int f1321c;

        /* JADX INFO: renamed from: d */
        public int f1322d;

        /* JADX INFO: renamed from: e */
        public int f1323e;

        /* JADX INFO: renamed from: f */
        public int f1324f;

        /* JADX INFO: renamed from: g */
        public int f1325g;

        /* JADX INFO: renamed from: h */
        public int f1326h;

        /* JADX INFO: renamed from: i */
        public int f1327i;

        /* JADX INFO: renamed from: j */
        public int f1328j;

        /* JADX INFO: renamed from: k */
        public int f1329k;

        /* JADX INFO: renamed from: l */
        public int f1330l;

        /* JADX INFO: renamed from: m */
        public int f1331m;

        /* JADX INFO: renamed from: n */
        public int f1332n;

        /* JADX INFO: renamed from: o */
        public int f1333o;

        /* JADX INFO: renamed from: p */
        public float f1334p;

        /* JADX INFO: renamed from: q */
        public Bitmap f1335q;

        public C0125c() {
            this.f1319a = t100.k;
            this.f1320b = -872415232;
            this.f1321c = 134217728;
            this.f1322d = t100.d(44.0f);
            this.f1323e = t100.o;
            int i = t100.m;
            this.f1324f = i;
            this.f1325g = i;
            this.f1326h = t100.j;
            this.f1327i = t100.e;
            int i2 = t100.h;
            this.f1331m = i2;
            this.f1328j = i2;
            this.f1329k = -6686;
            this.f1330l = -1;
            this.f1332n = 20;
            this.f1333o = 20;
        }

        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public C0125c clone() {
            C0125c c0125c = new C0125c();
            c0125c.f1319a = this.f1319a;
            c0125c.f1320b = this.f1320b;
            c0125c.f1321c = this.f1321c;
            c0125c.f1322d = this.f1322d;
            c0125c.f1323e = this.f1323e;
            c0125c.f1324f = this.f1324f;
            c0125c.f1325g = this.f1325g;
            c0125c.f1326h = this.f1326h;
            c0125c.f1327i = this.f1327i;
            c0125c.f1331m = this.f1331m;
            c0125c.f1328j = this.f1328j;
            c0125c.f1329k = this.f1329k;
            c0125c.f1330l = this.f1330l;
            c0125c.f1333o = this.f1333o;
            c0125c.f1332n = this.f1332n;
            return c0125c;
        }

        /* JADX INFO: renamed from: N */
        public boolean m2264N() {
            int i = this.f1330l;
            return (i == -1 || i == 0) ? false : true;
        }

        /* JADX INFO: renamed from: O */
        public final boolean m2265O(C0125c c0125c) {
            return (c0125c.f1319a == this.f1319a && c0125c.f1323e == this.f1323e && c0125c.f1324f == this.f1324f && c0125c.f1325g == this.f1325g && c0125c.f1326h == this.f1326h && c0125c.f1327i == this.f1327i && c0125c.f1331m == this.f1331m && c0125c.f1322d == this.f1322d && c0125c.f1332n == this.f1332n && c0125c.f1333o == this.f1333o) ? false : true;
        }
    }

    public ExpandedCardCommonLabelView(Context context) {
        super(context);
        this.f1295b = CommonLabelState.INIT;
        this.f1296c = -1;
        this.f1303j = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.f1304k = 0.0f;
        this.f1305l = 0.0f;
        this.f1306m = 0;
        this.f1307n = 1;
        m2210c();
    }

    /* JADX INFO: renamed from: a */
    public final void m2208a(C0124b c0124b, int i) {
        float f;
        if (TextUtils.isEmpty(c0124b.f1308a)) {
            c0124b.f1311d = false;
            return;
        }
        float fMeasureText = this.f1300g.measureText(c0124b.f1308a);
        boolean zM2230o = c0124b.m2230o();
        C0125c c0125c = this.f1294a;
        if (zM2230o) {
            f = c0125c.f1326h + this.f1294a.f1323e + this.f1294a.f1327i + this.f1294a.f1324f;
            c0124b.f1314g = this.f1304k + this.f1294a.f1326h + this.f1294a.f1323e + this.f1294a.f1327i;
            c0124b.f1315h = this.f1305l + this.f1294a.f1334p;
        } else {
            f = c0125c.f1325g + this.f1294a.f1324f;
            c0124b.f1314g = this.f1304k + this.f1294a.f1325g;
            c0124b.f1315h = this.f1305l + this.f1294a.f1334p;
        }
        float f2 = this.f1304k;
        float f3 = i;
        if (f2 + fMeasureText + f < f3) {
            m2209b(c0124b, fMeasureText, f, i);
            return;
        }
        float f4 = 0.0f;
        if (f2 != 0.0f) {
            this.f1307n++;
            this.f1304k = 0.0f;
            this.f1305l = this.f1305l + this.f1294a.f1322d + this.f1294a.f1331m;
            if (this.f1307n <= this.f1294a.f1333o) {
                m2208a(c0124b, i);
                return;
            }
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 > c0124b.f1308a.length()) {
                fMeasureText = f4;
                break;
            }
            float fMeasureText2 = this.f1300g.measureText(c0124b.f1308a.substring(0, i3).concat("..."));
            if (this.f1304k + fMeasureText2 + f >= f3) {
                break;
            }
            f4 = fMeasureText;
            fMeasureText = fMeasureText2;
            i2 = i3;
        }
        c0124b.f1316i = c0124b.f1308a.substring(0, Math.min(i2, c0124b.f1308a.length())).concat("...");
        m2209b(c0124b, fMeasureText, f, i);
    }

    /* JADX INFO: renamed from: b */
    public final void m2209b(C0124b c0124b, float f, float f2, int i) {
        c0124b.f1311d = true;
        RectF rectF = c0124b.f1312e;
        float f3 = this.f1304k;
        float f4 = this.f1305l;
        rectF.set(f3, f4, f + f3 + f2, this.f1294a.f1322d + f4);
        if (c0124b.m2230o()) {
            c0124b.f1313f.set(this.f1304k + this.f1294a.f1326h, (this.f1305l + (this.f1294a.f1322d / 2.0f)) - (this.f1294a.f1323e / 2.0f), this.f1304k + this.f1294a.f1326h + this.f1294a.f1323e, this.f1305l + (this.f1294a.f1322d / 2.0f) + (this.f1294a.f1323e / 2.0f));
        }
        float f5 = c0124b.f1312e.right + this.f1294a.f1331m;
        this.f1304k = f5;
        if (f5 + f2 >= i) {
            this.f1304k = 0.0f;
            this.f1305l = this.f1305l + this.f1294a.f1322d + this.f1294a.f1331m;
            this.f1307n++;
        }
        this.f1306m++;
    }

    /* JADX INFO: renamed from: c */
    public final void m2210c() {
        this.f1294a = new C0125c();
        this.f1299f = new ArrayList();
        TextPaint textPaint = new TextPaint();
        this.f1300g = textPaint;
        textPaint.setAntiAlias(true);
        this.f1300g.setTypeface(eqh0.c(3));
        Paint paint = new Paint();
        this.f1301h = paint;
        paint.setAntiAlias(true);
        this.f1302i = new Rect();
        m2215h();
    }

    /* JADX INFO: renamed from: d */
    public void m2211d(List<LabelData> list) {
        this.f1299f.clear();
        for (LabelData labelData : list) {
            C0124b c0124b = new C0124b(labelData.name, labelData.iconDrawableRes, getContext());
            c0124b.m2231p(labelData.highlight);
            this.f1299f.add(c0124b);
        }
        this.f1295b = CommonLabelState.INIT;
        requestLayout();
    }

    /* JADX INFO: renamed from: e */
    public void m2212e() {
        C0125c currentStyle = getCurrentStyle();
        currentStyle.f1330l = -5414;
        currentStyle.f1329k = -5414;
        currentStyle.f1321c = -592138;
        currentStyle.f1320b = -872415232;
        currentStyle.f1332n = Integer.MAX_VALUE;
        currentStyle.f1333o = Integer.MAX_VALUE;
        int i = t100.j;
        currentStyle.f1328j = i;
        currentStyle.f1326h = i;
        currentStyle.f1327i = t100.h;
        setLabelStyle(currentStyle);
    }

    /* JADX INFO: renamed from: f */
    public void m2213f() {
        C0125c currentStyle = getCurrentStyle();
        currentStyle.f1330l = -5414;
        currentStyle.f1329k = -5414;
        currentStyle.f1321c = -592138;
        currentStyle.f1320b = -872415232;
        currentStyle.f1332n = Integer.MAX_VALUE;
        currentStyle.f1333o = Integer.MAX_VALUE;
        int i = t100.j;
        currentStyle.f1328j = i;
        currentStyle.f1326h = i;
        currentStyle.f1327i = t100.h;
        int i2 = t100.n;
        currentStyle.f1325g = i2;
        currentStyle.f1324f = i2;
        setLabelStyle(currentStyle);
    }

    /* JADX INFO: renamed from: g */
    public final void m2214g() {
        if (NullChecker.a((Object) null)) {
            ArrayList arrayList = new ArrayList();
            for (C0124b c0124b : this.f1299f) {
                if (c0124b.f1311d) {
                    arrayList.add(j760.a(c0124b.f1312e, Boolean.valueOf(c0124b.f1310c)));
                }
            }
            throw null;
        }
    }

    public C0125c getCurrentStyle() {
        return this.f1294a.clone();
    }

    /* JADX INFO: renamed from: h */
    public final void m2215h() {
        this.f1300g.setTextSize(this.f1294a.f1319a);
        this.f1300g.setColor(this.f1294a.f1320b);
        C0125c c0125c = this.f1294a;
        c0125c.f1334p = (c0125c.f1322d / 2.0f) + (Math.abs(this.f1300g.ascent() + this.f1300g.descent()) / 2.0f);
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1295b == CommonLabelState.MEASURED) {
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
            this.f1301h.setXfermode(null);
            for (C0124b c0124b : this.f1299f) {
                if (c0124b.f1311d) {
                    if (!c0124b.f1310c) {
                        this.f1301h.setColor(this.f1294a.f1321c);
                        canvas.drawRoundRect(c0124b.f1312e, this.f1294a.f1328j, this.f1294a.f1328j, this.f1301h);
                    } else if (!this.f1294a.m2264N() || this.f1294a.f1335q == null || this.f1294a.f1335q.isRecycled()) {
                        this.f1301h.setColor(this.f1294a.f1329k);
                        canvas.drawRoundRect(c0124b.f1312e, this.f1294a.f1328j, this.f1294a.f1328j, this.f1301h);
                    } else {
                        this.f1301h.setColor(this.f1294a.f1329k);
                        canvas.drawRoundRect(c0124b.f1312e, this.f1294a.f1328j, this.f1294a.f1328j, this.f1301h);
                        this.f1301h.setXfermode(this.f1303j);
                        this.f1302i.set(0, 0, Math.min((int) ((this.f1294a.f1335q.getHeight() * c0124b.f1312e.width()) / c0124b.f1312e.height()), this.f1294a.f1335q.getWidth()), this.f1294a.f1335q.getHeight());
                        canvas.drawBitmap(this.f1294a.f1335q, this.f1302i, c0124b.f1312e, this.f1301h);
                    }
                    this.f1301h.setXfermode(null);
                    if (c0124b.m2230o()) {
                        this.f1301h.setColor(-16777216);
                        canvas.drawBitmap(c0124b.f1317j, c0124b.f1318k, c0124b.f1313f, this.f1301h);
                    }
                    canvas.drawText(c0124b.f1316i, c0124b.f1314g, c0124b.f1315h, this.f1300g);
                }
            }
            canvas.restoreToCount(iSaveLayer);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (size != this.f1297d || this.f1295b == CommonLabelState.INIT) {
            this.f1304k = 0.0f;
            this.f1305l = 0.0f;
            this.f1306m = 0;
            this.f1307n = 1;
            for (C0124b c0124b : this.f1299f) {
                if (this.f1307n > this.f1294a.f1333o || this.f1306m > this.f1294a.f1332n) {
                    break;
                }
                m2208a(c0124b, size);
                if (c0124b.f1311d) {
                    this.f1298e = (int) c0124b.f1312e.bottom;
                }
            }
            m2214g();
        }
        this.f1297d = size;
        this.f1295b = CommonLabelState.MEASURED;
        setMeasuredDimension(size, this.f1298e);
    }

    public void setLabelShowListener(InterfaceC0123a interfaceC0123a) {
    }

    public void setLabelStyle(C0125c c0125c) {
        if (this.f1294a.m2265O(c0125c)) {
            requestLayout();
        } else {
            invalidate();
        }
        this.f1294a = c0125c;
        if (c0125c.m2264N()) {
            this.f1294a.f1335q = BitmapFactory.decodeResource(getResources(), this.f1294a.f1330l);
        }
        m2215h();
    }

    public ExpandedCardCommonLabelView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1295b = CommonLabelState.INIT;
        this.f1296c = -1;
        this.f1303j = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.f1304k = 0.0f;
        this.f1305l = 0.0f;
        this.f1306m = 0;
        this.f1307n = 1;
        m2210c();
    }

    public ExpandedCardCommonLabelView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1295b = CommonLabelState.INIT;
        this.f1296c = -1;
        this.f1303j = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.f1304k = 0.0f;
        this.f1305l = 0.0f;
        this.f1306m = 0;
        this.f1307n = 1;
        m2210c();
    }
}
