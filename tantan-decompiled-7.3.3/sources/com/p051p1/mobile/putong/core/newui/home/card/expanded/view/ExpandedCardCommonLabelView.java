package com.p051p1.mobile.putong.core.newui.home.card.expanded.view;

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
import com.p051p1.mobile.putong.core.data.LabelData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.lyh0;
import p153l.pf60;
import p153l.qa00;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedCardCommonLabelView extends View {

    /* JADX INFO: renamed from: a */
    public C8112c f23258a;

    /* JADX INFO: renamed from: b */
    public CommonLabelState f23259b;

    /* JADX INFO: renamed from: c */
    public int f23260c;

    /* JADX INFO: renamed from: d */
    public int f23261d;

    /* JADX INFO: renamed from: e */
    public int f23262e;

    /* JADX INFO: renamed from: f */
    public List<C8111b> f23263f;

    /* JADX INFO: renamed from: g */
    public TextPaint f23264g;

    /* JADX INFO: renamed from: h */
    public Paint f23265h;

    /* JADX INFO: renamed from: i */
    public Rect f23266i;

    /* JADX INFO: renamed from: j */
    public PorterDuffXfermode f23267j;

    /* JADX INFO: renamed from: k */
    public float f23268k;

    /* JADX INFO: renamed from: l */
    public float f23269l;

    /* JADX INFO: renamed from: m */
    public int f23270m;

    /* JADX INFO: renamed from: n */
    public int f23271n;

    public enum CommonLabelState {
        INIT("初始化状态"),
        MEASURED("已经计算过大小");

        private String des;

        CommonLabelState(String str) {
            this.des = str;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardCommonLabelView$a */
    public interface InterfaceC8110a {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardCommonLabelView$b */
    public static class C8111b {

        /* JADX INFO: renamed from: a */
        public String f23272a;

        /* JADX INFO: renamed from: b */
        public int f23273b;

        /* JADX INFO: renamed from: c */
        public boolean f23274c = false;

        /* JADX INFO: renamed from: d */
        public boolean f23275d = false;

        /* JADX INFO: renamed from: e */
        public RectF f23276e = new RectF();

        /* JADX INFO: renamed from: f */
        public RectF f23277f = new RectF();

        /* JADX INFO: renamed from: g */
        public float f23278g;

        /* JADX INFO: renamed from: h */
        public float f23279h;

        /* JADX INFO: renamed from: i */
        public String f23280i;

        /* JADX INFO: renamed from: j */
        public Bitmap f23281j;

        /* JADX INFO: renamed from: k */
        public Rect f23282k;

        public C8111b(String str, int i, Context context) {
            this.f23272a = str;
            this.f23273b = i;
            this.f23280i = str;
            if (m39255o()) {
                this.f23281j = BitmapFactory.decodeResource(context.getResources(), i);
                this.f23282k = new Rect(0, 0, this.f23281j.getWidth(), this.f23281j.getHeight());
            }
        }

        /* JADX INFO: renamed from: o */
        public boolean m39255o() {
            int i = this.f23273b;
            return (i == 0 || i == -1) ? false : true;
        }

        /* JADX INFO: renamed from: p */
        public C8111b m39256p(boolean z) {
            this.f23274c = z;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardCommonLabelView$c */
    public static class C8112c implements Cloneable {

        /* JADX INFO: renamed from: a */
        public int f23283a;

        /* JADX INFO: renamed from: b */
        public int f23284b;

        /* JADX INFO: renamed from: c */
        public int f23285c;

        /* JADX INFO: renamed from: d */
        public int f23286d;

        /* JADX INFO: renamed from: e */
        public int f23287e;

        /* JADX INFO: renamed from: f */
        public int f23288f;

        /* JADX INFO: renamed from: g */
        public int f23289g;

        /* JADX INFO: renamed from: h */
        public int f23290h;

        /* JADX INFO: renamed from: i */
        public int f23291i;

        /* JADX INFO: renamed from: j */
        public int f23292j;

        /* JADX INFO: renamed from: k */
        public int f23293k;

        /* JADX INFO: renamed from: l */
        public int f23294l;

        /* JADX INFO: renamed from: m */
        public int f23295m;

        /* JADX INFO: renamed from: n */
        public int f23296n;

        /* JADX INFO: renamed from: o */
        public int f23297o;

        /* JADX INFO: renamed from: p */
        public float f23298p;

        /* JADX INFO: renamed from: q */
        public Bitmap f23299q;

        public C8112c() {
            this.f23283a = qa00.f156324k;
            this.f23284b = -872415232;
            this.f23285c = 134217728;
            this.f23286d = qa00.m175859d(44.0f);
            this.f23287e = qa00.f156328o;
            int i = qa00.f156326m;
            this.f23288f = i;
            this.f23289g = i;
            this.f23290h = qa00.f156323j;
            this.f23291i = qa00.f156318e;
            int i2 = qa00.f156321h;
            this.f23295m = i2;
            this.f23292j = i2;
            this.f23293k = -6686;
            this.f23294l = -1;
            this.f23296n = 20;
            this.f23297o = 20;
        }

        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public C8112c clone() {
            C8112c c8112c = new C8112c();
            c8112c.f23283a = this.f23283a;
            c8112c.f23284b = this.f23284b;
            c8112c.f23285c = this.f23285c;
            c8112c.f23286d = this.f23286d;
            c8112c.f23287e = this.f23287e;
            c8112c.f23288f = this.f23288f;
            c8112c.f23289g = this.f23289g;
            c8112c.f23290h = this.f23290h;
            c8112c.f23291i = this.f23291i;
            c8112c.f23295m = this.f23295m;
            c8112c.f23292j = this.f23292j;
            c8112c.f23293k = this.f23293k;
            c8112c.f23294l = this.f23294l;
            c8112c.f23297o = this.f23297o;
            c8112c.f23296n = this.f23296n;
            return c8112c;
        }

        /* JADX INFO: renamed from: N */
        public boolean m39289N() {
            int i = this.f23294l;
            return (i == -1 || i == 0) ? false : true;
        }

        /* JADX INFO: renamed from: O */
        public final boolean m39290O(C8112c c8112c) {
            return (c8112c.f23283a == this.f23283a && c8112c.f23287e == this.f23287e && c8112c.f23288f == this.f23288f && c8112c.f23289g == this.f23289g && c8112c.f23290h == this.f23290h && c8112c.f23291i == this.f23291i && c8112c.f23295m == this.f23295m && c8112c.f23286d == this.f23286d && c8112c.f23296n == this.f23296n && c8112c.f23297o == this.f23297o) ? false : true;
        }
    }

    public ExpandedCardCommonLabelView(Context context) {
        super(context);
        this.f23259b = CommonLabelState.INIT;
        this.f23260c = -1;
        this.f23267j = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.f23268k = 0.0f;
        this.f23269l = 0.0f;
        this.f23270m = 0;
        this.f23271n = 1;
        m39235c();
    }

    /* JADX INFO: renamed from: a */
    public final void m39233a(C8111b c8111b, int i) {
        float f;
        if (TextUtils.isEmpty(c8111b.f23272a)) {
            c8111b.f23275d = false;
            return;
        }
        float fMeasureText = this.f23264g.measureText(c8111b.f23272a);
        boolean zM39255o = c8111b.m39255o();
        C8112c c8112c = this.f23258a;
        if (zM39255o) {
            f = c8112c.f23290h + this.f23258a.f23287e + this.f23258a.f23291i + this.f23258a.f23288f;
            c8111b.f23278g = this.f23268k + this.f23258a.f23290h + this.f23258a.f23287e + this.f23258a.f23291i;
            c8111b.f23279h = this.f23269l + this.f23258a.f23298p;
        } else {
            f = c8112c.f23289g + this.f23258a.f23288f;
            c8111b.f23278g = this.f23268k + this.f23258a.f23289g;
            c8111b.f23279h = this.f23269l + this.f23258a.f23298p;
        }
        float f2 = this.f23268k;
        float f3 = i;
        if (f2 + fMeasureText + f < f3) {
            m39234b(c8111b, fMeasureText, f, i);
            return;
        }
        float f4 = 0.0f;
        if (f2 != 0.0f) {
            this.f23271n++;
            this.f23268k = 0.0f;
            this.f23269l = this.f23269l + this.f23258a.f23286d + this.f23258a.f23295m;
            if (this.f23271n <= this.f23258a.f23297o) {
                m39233a(c8111b, i);
                return;
            }
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 > c8111b.f23272a.length()) {
                fMeasureText = f4;
                break;
            }
            float fMeasureText2 = this.f23264g.measureText(c8111b.f23272a.substring(0, i3).concat("..."));
            if (this.f23268k + fMeasureText2 + f >= f3) {
                break;
            }
            f4 = fMeasureText;
            fMeasureText = fMeasureText2;
            i2 = i3;
        }
        c8111b.f23280i = c8111b.f23272a.substring(0, Math.min(i2, c8111b.f23272a.length())).concat("...");
        m39234b(c8111b, fMeasureText, f, i);
    }

    /* JADX INFO: renamed from: b */
    public final void m39234b(C8111b c8111b, float f, float f2, int i) {
        c8111b.f23275d = true;
        RectF rectF = c8111b.f23276e;
        float f3 = this.f23268k;
        float f4 = this.f23269l;
        rectF.set(f3, f4, f + f3 + f2, this.f23258a.f23286d + f4);
        if (c8111b.m39255o()) {
            c8111b.f23277f.set(this.f23268k + this.f23258a.f23290h, (this.f23269l + (this.f23258a.f23286d / 2.0f)) - (this.f23258a.f23287e / 2.0f), this.f23268k + this.f23258a.f23290h + this.f23258a.f23287e, this.f23269l + (this.f23258a.f23286d / 2.0f) + (this.f23258a.f23287e / 2.0f));
        }
        float f5 = c8111b.f23276e.right + this.f23258a.f23295m;
        this.f23268k = f5;
        if (f5 + f2 >= i) {
            this.f23268k = 0.0f;
            this.f23269l = this.f23269l + this.f23258a.f23286d + this.f23258a.f23295m;
            this.f23271n++;
        }
        this.f23270m++;
    }

    /* JADX INFO: renamed from: c */
    public final void m39235c() {
        this.f23258a = new C8112c();
        this.f23263f = new ArrayList();
        TextPaint textPaint = new TextPaint();
        this.f23264g = textPaint;
        textPaint.setAntiAlias(true);
        this.f23264g.setTypeface(lyh0.m156283c(3));
        Paint paint = new Paint();
        this.f23265h = paint;
        paint.setAntiAlias(true);
        this.f23266i = new Rect();
        m39240h();
    }

    /* JADX INFO: renamed from: d */
    public void m39236d(List<LabelData> list) {
        this.f23263f.clear();
        for (LabelData labelData : list) {
            C8111b c8111b = new C8111b(labelData.name, labelData.iconDrawableRes, getContext());
            c8111b.m39256p(labelData.highlight);
            this.f23263f.add(c8111b);
        }
        this.f23259b = CommonLabelState.INIT;
        requestLayout();
    }

    /* JADX INFO: renamed from: e */
    public void m39237e() {
        C8112c currentStyle = getCurrentStyle();
        currentStyle.f23294l = -5414;
        currentStyle.f23293k = -5414;
        currentStyle.f23285c = -592138;
        currentStyle.f23284b = -872415232;
        currentStyle.f23296n = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        currentStyle.f23297o = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i = qa00.f156323j;
        currentStyle.f23292j = i;
        currentStyle.f23290h = i;
        currentStyle.f23291i = qa00.f156321h;
        setLabelStyle(currentStyle);
    }

    /* JADX INFO: renamed from: f */
    public void m39238f() {
        C8112c currentStyle = getCurrentStyle();
        currentStyle.f23294l = -5414;
        currentStyle.f23293k = -5414;
        currentStyle.f23285c = -592138;
        currentStyle.f23284b = -872415232;
        currentStyle.f23296n = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        currentStyle.f23297o = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i = qa00.f156323j;
        currentStyle.f23292j = i;
        currentStyle.f23290h = i;
        currentStyle.f23291i = qa00.f156321h;
        int i2 = qa00.f156327n;
        currentStyle.f23289g = i2;
        currentStyle.f23288f = i2;
        setLabelStyle(currentStyle);
    }

    /* JADX INFO: renamed from: g */
    public final void m39239g() {
        if (NullChecker.m82486a(null)) {
            ArrayList arrayList = new ArrayList();
            for (C8111b c8111b : this.f23263f) {
                if (c8111b.f23275d) {
                    arrayList.add(pf60.m172085a(c8111b.f23276e, Boolean.valueOf(c8111b.f23274c)));
                }
            }
            throw null;
        }
    }

    public C8112c getCurrentStyle() {
        return this.f23258a.clone();
    }

    /* JADX INFO: renamed from: h */
    public final void m39240h() {
        this.f23264g.setTextSize(this.f23258a.f23283a);
        this.f23264g.setColor(this.f23258a.f23284b);
        C8112c c8112c = this.f23258a;
        c8112c.f23298p = (c8112c.f23286d / 2.0f) + (Math.abs(this.f23264g.ascent() + this.f23264g.descent()) / 2.0f);
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.f23259b == CommonLabelState.MEASURED) {
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
            this.f23265h.setXfermode(null);
            for (C8111b c8111b : this.f23263f) {
                if (c8111b.f23275d) {
                    if (!c8111b.f23274c) {
                        this.f23265h.setColor(this.f23258a.f23285c);
                        canvas.drawRoundRect(c8111b.f23276e, this.f23258a.f23292j, this.f23258a.f23292j, this.f23265h);
                    } else if (!this.f23258a.m39289N() || this.f23258a.f23299q == null || this.f23258a.f23299q.isRecycled()) {
                        this.f23265h.setColor(this.f23258a.f23293k);
                        canvas.drawRoundRect(c8111b.f23276e, this.f23258a.f23292j, this.f23258a.f23292j, this.f23265h);
                    } else {
                        this.f23265h.setColor(this.f23258a.f23293k);
                        canvas.drawRoundRect(c8111b.f23276e, this.f23258a.f23292j, this.f23258a.f23292j, this.f23265h);
                        this.f23265h.setXfermode(this.f23267j);
                        this.f23266i.set(0, 0, Math.min((int) ((this.f23258a.f23299q.getHeight() * c8111b.f23276e.width()) / c8111b.f23276e.height()), this.f23258a.f23299q.getWidth()), this.f23258a.f23299q.getHeight());
                        canvas.drawBitmap(this.f23258a.f23299q, this.f23266i, c8111b.f23276e, this.f23265h);
                    }
                    this.f23265h.setXfermode(null);
                    if (c8111b.m39255o()) {
                        this.f23265h.setColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
                        canvas.drawBitmap(c8111b.f23281j, c8111b.f23282k, c8111b.f23277f, this.f23265h);
                    }
                    canvas.drawText(c8111b.f23280i, c8111b.f23278g, c8111b.f23279h, this.f23264g);
                }
            }
            canvas.restoreToCount(iSaveLayer);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (size != this.f23261d || this.f23259b == CommonLabelState.INIT) {
            this.f23268k = 0.0f;
            this.f23269l = 0.0f;
            this.f23270m = 0;
            this.f23271n = 1;
            for (C8111b c8111b : this.f23263f) {
                if (this.f23271n > this.f23258a.f23297o || this.f23270m > this.f23258a.f23296n) {
                    break;
                }
                m39233a(c8111b, size);
                if (c8111b.f23275d) {
                    this.f23262e = (int) c8111b.f23276e.bottom;
                }
            }
            m39239g();
        }
        this.f23261d = size;
        this.f23259b = CommonLabelState.MEASURED;
        setMeasuredDimension(size, this.f23262e);
    }

    public void setLabelShowListener(InterfaceC8110a interfaceC8110a) {
    }

    public void setLabelStyle(C8112c c8112c) {
        if (this.f23258a.m39290O(c8112c)) {
            requestLayout();
        } else {
            invalidate();
        }
        this.f23258a = c8112c;
        if (c8112c.m39289N()) {
            this.f23258a.f23299q = BitmapFactory.decodeResource(getResources(), this.f23258a.f23294l);
        }
        m39240h();
    }

    public ExpandedCardCommonLabelView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23259b = CommonLabelState.INIT;
        this.f23260c = -1;
        this.f23267j = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.f23268k = 0.0f;
        this.f23269l = 0.0f;
        this.f23270m = 0;
        this.f23271n = 1;
        m39235c();
    }

    public ExpandedCardCommonLabelView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23259b = CommonLabelState.INIT;
        this.f23260c = -1;
        this.f23267j = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.f23268k = 0.0f;
        this.f23269l = 0.0f;
        this.f23270m = 0;
        this.f23271n = 1;
        m39235c();
    }
}
