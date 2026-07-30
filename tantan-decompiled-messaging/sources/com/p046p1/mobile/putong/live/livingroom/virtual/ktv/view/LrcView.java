package com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcBean;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcWrapperBean;
import java.util.List;
import p149l.oew;
import p149l.t100;

/* JADX INFO: loaded from: classes5.dex */
public class LrcView extends View {

    /* JADX INFO: renamed from: x */
    public static volatile LrcWrapperBean f52487x;

    /* JADX INFO: renamed from: a */
    public final TextPaint f52488a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f52489b;

    /* JADX INFO: renamed from: c */
    public int f52490c;

    /* JADX INFO: renamed from: d */
    public int f52491d;

    /* JADX INFO: renamed from: e */
    public int f52492e;

    /* JADX INFO: renamed from: f */
    public float f52493f;

    /* JADX INFO: renamed from: g */
    public int f52494g;

    /* JADX INFO: renamed from: h */
    public float f52495h;

    /* JADX INFO: renamed from: i */
    public float f52496i;

    /* JADX INFO: renamed from: j */
    public float f52497j;

    /* JADX INFO: renamed from: k */
    public int f52498k;

    /* JADX INFO: renamed from: l */
    public boolean f52499l;

    /* JADX INFO: renamed from: m */
    public final Rect f52500m;

    /* JADX INFO: renamed from: n */
    public final Rect f52501n;

    /* JADX INFO: renamed from: o */
    public final Rect f52502o;

    /* JADX INFO: renamed from: p */
    public long f52503p;

    /* JADX INFO: renamed from: q */
    public Long f52504q;

    /* JADX INFO: renamed from: r */
    public Bitmap f52505r;

    /* JADX INFO: renamed from: s */
    public Canvas f52506s;

    /* JADX INFO: renamed from: t */
    public Bitmap f52507t;

    /* JADX INFO: renamed from: u */
    public Canvas f52508u;

    /* JADX INFO: renamed from: v */
    public float f52509v;

    /* JADX INFO: renamed from: w */
    public oew f52510w;

    public LrcView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52488a = new TextPaint(1);
        this.f52489b = new TextPaint(1);
        this.f52498k = 0;
        this.f52499l = true;
        this.f52500m = new Rect();
        this.f52501n = new Rect();
        this.f52502o = new Rect();
        this.f52503p = 0L;
        m77136h();
    }

    private int getLrcHeight() {
        return Math.max((getHeight() - getPaddingTop()) - getPaddingBottom(), 0);
    }

    private int getLrcWidth() {
        return Math.max((getWidth() - getPaddingStart()) - getPaddingEnd(), 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m77129a(int i, int i2) {
        this.f52505r = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_4444);
        this.f52506s = new Canvas(this.f52505r);
    }

    /* JADX INFO: renamed from: b */
    public final void m77130b(int i, int i2) {
        this.f52507t = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_4444);
        this.f52508u = new Canvas(this.f52507t);
    }

    /* JADX INFO: renamed from: c */
    public final void m77131c() {
        if (this.f52510w == null) {
            return;
        }
        float lrcHeight = ((getLrcHeight() + this.f52510w.m164032d()) / 2.0f) + this.f52496i + this.f52497j;
        this.f52489b.setTextSize(this.f52493f);
        this.f52489b.setColor(this.f52492e);
        this.f52506s.save();
        this.f52506s.translate(0.0f, lrcHeight);
        int i = this.f52498k;
        while (true) {
            i++;
            if (i >= f52487x.getLrcBeans().size()) {
                break;
            }
            oew oewVar = new oew(f52487x.getLrcBeans().get(i), this.f52489b, getLrcWidth());
            if (oewVar.m164032d() + lrcHeight > ((double) getLrcHeight()) * 1.5d) {
                break;
            }
            oewVar.m164029a(this.f52506s);
            float fM164032d = oewVar.m164032d() + this.f52496i;
            this.f52506s.translate(0.0f, fM164032d);
            lrcHeight += fM164032d;
        }
        this.f52506s.restore();
    }

    /* JADX INFO: renamed from: d */
    public final void m77132d() {
        oew oewVar = this.f52510w;
        if (oewVar == null) {
            return;
        }
        Rect[] rectArrM164031c = oewVar.m164031c(this.f52503p);
        if (rectArrM164031c == null || rectArrM164031c.length <= 1) {
            this.f52497j = t100.m186890d(-10.0f);
        } else {
            this.f52497j = 0.0f;
        }
        float lrcHeight = ((getLrcHeight() - this.f52510w.m164032d()) / 2.0f) + this.f52497j;
        this.f52506s.save();
        this.f52506s.translate(0.0f, lrcHeight);
        this.f52510w.m164029a(this.f52506s);
        this.f52506s.restore();
        this.f52509v = lrcHeight;
    }

    /* JADX INFO: renamed from: e */
    public final void m77133e() {
        if (this.f52510w == null) {
            return;
        }
        this.f52507t.eraseColor(0);
        Rect[] rectArrM164031c = this.f52510w.m164031c(this.f52503p);
        if (rectArrM164031c == null) {
            return;
        }
        if (rectArrM164031c.length > 1) {
            this.f52497j = 0.0f;
        } else {
            this.f52497j = t100.m186890d(-10.0f);
        }
        float lrcHeight = ((getLrcHeight() - this.f52510w.m164032d()) / 2.0f) + this.f52497j;
        for (Rect rect : rectArrM164031c) {
            int i = rect.left;
            int i2 = rect.right;
            if (i != i2) {
                Rect rect2 = this.f52500m;
                rect2.left = i;
                rect2.top = (int) (rect.top + lrcHeight);
                rect2.right = i2;
                rect2.bottom = (int) (rect.bottom + lrcHeight);
                this.f52508u.save();
                this.f52508u.clipRect(this.f52500m);
                this.f52508u.translate(0.0f, lrcHeight);
                this.f52510w.m164030b(this.f52508u);
                this.f52508u.restore();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m77134f(long j) {
        List<LrcBean> lrcBeans = f52487x.getLrcBeans();
        if (lrcBeans == null || lrcBeans.size() == 0) {
            return -1;
        }
        int size = lrcBeans.size();
        while (true) {
            size--;
            if (size < 0) {
                return 0;
            }
            if (lrcBeans.get(size) != null && lrcBeans.get(size).tones != null && lrcBeans.get(size).tones.size() > 0 && lrcBeans.get(size).tones.get(0).begin < j) {
                return size;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m77135g() {
        return (f52487x == null || f52487x.getLrcBeans() == null || f52487x.getLrcBeans().isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public final void m77136h() {
        this.f52495h = t100.f167263l;
        this.f52493f = t100.m186890d(13.0f);
        this.f52496i = t100.m186890d(4.0f);
        this.f52497j = t100.m186890d(-10.0f);
        this.f52490c = Color.parseColor("#ffffff");
        this.f52491d = Color.parseColor("#F200FF");
        this.f52492e = Color.parseColor("#9affffff");
        this.f52494g = Color.parseColor("#F200FF");
        this.f52488a.setTextSize(this.f52495h);
        this.f52488a.setColor(this.f52494g);
        this.f52488a.setAntiAlias(true);
        TextPaint textPaint = this.f52488a;
        Paint.Align align = Paint.Align.LEFT;
        textPaint.setTextAlign(align);
        this.f52489b.setTextSize(this.f52493f);
        this.f52489b.setColor(this.f52490c);
        this.f52489b.setAntiAlias(true);
        this.f52489b.setTextAlign(align);
    }

    /* JADX INFO: renamed from: i */
    public void m77137i() {
        f52487x = null;
        this.f52498k = 0;
        this.f52499l = true;
        this.f52503p = 0L;
        this.f52509v = 0.0f;
        this.f52504q = null;
        invalidate();
    }

    /* JADX INFO: renamed from: j */
    public void m77138j(long j) {
        if (m77135g()) {
            this.f52503p = j;
            int iM77134f = m77134f(j);
            if (iM77134f != this.f52498k) {
                this.f52499l = true;
                this.f52498k = iM77134f;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!m77135g()) {
            int lrcWidth = getLrcWidth();
            int lrcHeight = getLrcHeight();
            if (lrcWidth == 0 || lrcHeight == 0) {
                return;
            }
            StaticLayout staticLayout = new StaticLayout("暂无歌词", this.f52489b, lrcWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, getPaddingTop() + ((lrcHeight - staticLayout.getHeight()) / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            return;
        }
        if (this.f52498k >= f52487x.getLrcBeans().size()) {
            return;
        }
        if (this.f52498k == 0) {
            this.f52495h = t100.m186890d(13.0f);
        } else {
            this.f52495h = t100.m186890d(15.0f);
        }
        this.f52489b.setTextSize(this.f52495h);
        this.f52488a.setTextSize(this.f52495h);
        LrcBean lrcBean = f52487x.getLrcBeans().get(this.f52498k);
        if (this.f52499l) {
            this.f52489b.setColor(this.f52490c);
            this.f52489b.setTextSize(this.f52495h);
            this.f52510w = new oew(lrcBean, this.f52488a, this.f52489b, getLrcWidth());
            Bitmap bitmap = this.f52505r;
            if (bitmap != null) {
                bitmap.eraseColor(0);
            }
            int i = this.f52498k;
            if (i < 0 || i >= f52487x.getLrcBeans().size()) {
                this.f52499l = false;
                return;
            } else {
                m77132d();
                m77131c();
                this.f52499l = false;
            }
        }
        canvas.drawBitmap(this.f52505r, this.f52501n, this.f52502o, (Paint) null);
        m77133e();
        canvas.drawBitmap(this.f52507t, this.f52501n, this.f52502o, (Paint) null);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int paddingStart = ((i3 - i) - getPaddingStart()) - getPaddingEnd();
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            if (paddingTop > 0) {
                Bitmap bitmap = this.f52507t;
                if (bitmap == null) {
                    m77130b(paddingStart, paddingTop);
                } else if (bitmap.getWidth() != paddingStart || this.f52507t.getHeight() != paddingTop) {
                    if (!this.f52507t.isRecycled()) {
                        this.f52507t.recycle();
                    }
                    m77130b(paddingStart, paddingTop);
                }
                Bitmap bitmap2 = this.f52505r;
                if (bitmap2 == null) {
                    m77129a(paddingStart, paddingTop);
                } else if (bitmap2.getWidth() != paddingStart || this.f52505r.getHeight() != paddingTop) {
                    if (!this.f52505r.isRecycled()) {
                        this.f52505r.recycle();
                    }
                    m77129a(paddingStart, paddingTop);
                    Bitmap bitmap3 = this.f52505r;
                    if (bitmap3 == null) {
                        m77129a(paddingStart, paddingTop);
                    } else if (bitmap3.getWidth() != paddingStart || this.f52505r.getHeight() != paddingTop) {
                        if (!this.f52505r.isRecycled()) {
                            this.f52505r.recycle();
                        }
                        m77129a(paddingStart, paddingTop);
                    }
                }
            }
            Rect rect = this.f52501n;
            rect.left = 0;
            rect.top = 0;
            rect.right = getLrcWidth();
            this.f52501n.bottom = getLrcHeight();
            this.f52502o.left = getPaddingStart();
            this.f52502o.top = getPaddingTop();
            this.f52502o.right = getPaddingStart() + getLrcWidth();
            this.f52502o.bottom = getPaddingTop() + getLrcHeight();
            invalidate();
        }
    }

    public void setLrcData(LrcWrapperBean lrcWrapperBean) {
        List<LrcBean.Tone> list;
        f52487x = lrcWrapperBean;
        if (this.f52504q != null && f52487x != null && f52487x.getLrcBeans() != null && !f52487x.getLrcBeans().isEmpty() && (list = f52487x.getLrcBeans().get(f52487x.getLrcBeans().size() - 1).tones) != null && !list.isEmpty()) {
            list.get(list.size() - 1).end = this.f52504q.longValue();
        }
        invalidate();
    }

    public LrcView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LrcView(Context context) {
        this(context, null);
    }
}
