package com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view;

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
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcBean;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcWrapperBean;
import java.util.List;
import p153l.mgw;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
public class LrcView extends View {

    /* JADX INFO: renamed from: x */
    public static volatile LrcWrapperBean f53335x;

    /* JADX INFO: renamed from: a */
    public final TextPaint f53336a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f53337b;

    /* JADX INFO: renamed from: c */
    public int f53338c;

    /* JADX INFO: renamed from: d */
    public int f53339d;

    /* JADX INFO: renamed from: e */
    public int f53340e;

    /* JADX INFO: renamed from: f */
    public float f53341f;

    /* JADX INFO: renamed from: g */
    public int f53342g;

    /* JADX INFO: renamed from: h */
    public float f53343h;

    /* JADX INFO: renamed from: i */
    public float f53344i;

    /* JADX INFO: renamed from: j */
    public float f53345j;

    /* JADX INFO: renamed from: k */
    public int f53346k;

    /* JADX INFO: renamed from: l */
    public boolean f53347l;

    /* JADX INFO: renamed from: m */
    public final Rect f53348m;

    /* JADX INFO: renamed from: n */
    public final Rect f53349n;

    /* JADX INFO: renamed from: o */
    public final Rect f53350o;

    /* JADX INFO: renamed from: p */
    public long f53351p;

    /* JADX INFO: renamed from: q */
    public Long f53352q;

    /* JADX INFO: renamed from: r */
    public Bitmap f53353r;

    /* JADX INFO: renamed from: s */
    public Canvas f53354s;

    /* JADX INFO: renamed from: t */
    public Bitmap f53355t;

    /* JADX INFO: renamed from: u */
    public Canvas f53356u;

    /* JADX INFO: renamed from: v */
    public float f53357v;

    /* JADX INFO: renamed from: w */
    public mgw f53358w;

    public LrcView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53336a = new TextPaint(1);
        this.f53337b = new TextPaint(1);
        this.f53346k = 0;
        this.f53347l = true;
        this.f53348m = new Rect();
        this.f53349n = new Rect();
        this.f53350o = new Rect();
        this.f53351p = 0L;
        m78319h();
    }

    private int getLrcHeight() {
        return Math.max((getHeight() - getPaddingTop()) - getPaddingBottom(), 0);
    }

    private int getLrcWidth() {
        return Math.max((getWidth() - getPaddingStart()) - getPaddingEnd(), 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m78312a(int i, int i2) {
        this.f53353r = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_4444);
        this.f53354s = new Canvas(this.f53353r);
    }

    /* JADX INFO: renamed from: b */
    public final void m78313b(int i, int i2) {
        this.f53355t = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_4444);
        this.f53356u = new Canvas(this.f53355t);
    }

    /* JADX INFO: renamed from: c */
    public final void m78314c() {
        if (this.f53358w == null) {
            return;
        }
        float lrcHeight = ((getLrcHeight() + this.f53358w.m158394d()) / 2.0f) + this.f53344i + this.f53345j;
        this.f53337b.setTextSize(this.f53341f);
        this.f53337b.setColor(this.f53340e);
        this.f53354s.save();
        this.f53354s.translate(0.0f, lrcHeight);
        int i = this.f53346k;
        while (true) {
            i++;
            if (i >= f53335x.getLrcBeans().size()) {
                break;
            }
            mgw mgwVar = new mgw(f53335x.getLrcBeans().get(i), this.f53337b, getLrcWidth());
            if (mgwVar.m158394d() + lrcHeight > ((double) getLrcHeight()) * 1.5d) {
                break;
            }
            mgwVar.m158391a(this.f53354s);
            float fM158394d = mgwVar.m158394d() + this.f53344i;
            this.f53354s.translate(0.0f, fM158394d);
            lrcHeight += fM158394d;
        }
        this.f53354s.restore();
    }

    /* JADX INFO: renamed from: d */
    public final void m78315d() {
        mgw mgwVar = this.f53358w;
        if (mgwVar == null) {
            return;
        }
        Rect[] rectArrM158393c = mgwVar.m158393c(this.f53351p);
        if (rectArrM158393c == null || rectArrM158393c.length <= 1) {
            this.f53345j = qa00.m175859d(-10.0f);
        } else {
            this.f53345j = 0.0f;
        }
        float lrcHeight = ((getLrcHeight() - this.f53358w.m158394d()) / 2.0f) + this.f53345j;
        this.f53354s.save();
        this.f53354s.translate(0.0f, lrcHeight);
        this.f53358w.m158391a(this.f53354s);
        this.f53354s.restore();
        this.f53357v = lrcHeight;
    }

    /* JADX INFO: renamed from: e */
    public final void m78316e() {
        if (this.f53358w == null) {
            return;
        }
        this.f53355t.eraseColor(0);
        Rect[] rectArrM158393c = this.f53358w.m158393c(this.f53351p);
        if (rectArrM158393c == null) {
            return;
        }
        if (rectArrM158393c.length > 1) {
            this.f53345j = 0.0f;
        } else {
            this.f53345j = qa00.m175859d(-10.0f);
        }
        float lrcHeight = ((getLrcHeight() - this.f53358w.m158394d()) / 2.0f) + this.f53345j;
        for (Rect rect : rectArrM158393c) {
            int i = rect.left;
            int i2 = rect.right;
            if (i != i2) {
                Rect rect2 = this.f53348m;
                rect2.left = i;
                rect2.top = (int) (rect.top + lrcHeight);
                rect2.right = i2;
                rect2.bottom = (int) (rect.bottom + lrcHeight);
                this.f53356u.save();
                this.f53356u.clipRect(this.f53348m);
                this.f53356u.translate(0.0f, lrcHeight);
                this.f53358w.m158392b(this.f53356u);
                this.f53356u.restore();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m78317f(long j) {
        List<LrcBean> lrcBeans = f53335x.getLrcBeans();
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
    public final boolean m78318g() {
        return (f53335x == null || f53335x.getLrcBeans() == null || f53335x.getLrcBeans().isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public final void m78319h() {
        this.f53343h = qa00.f156325l;
        this.f53341f = qa00.m175859d(13.0f);
        this.f53344i = qa00.m175859d(4.0f);
        this.f53345j = qa00.m175859d(-10.0f);
        this.f53338c = Color.parseColor("#ffffff");
        this.f53339d = Color.parseColor("#F200FF");
        this.f53340e = Color.parseColor("#9affffff");
        this.f53342g = Color.parseColor("#F200FF");
        this.f53336a.setTextSize(this.f53343h);
        this.f53336a.setColor(this.f53342g);
        this.f53336a.setAntiAlias(true);
        TextPaint textPaint = this.f53336a;
        Paint.Align align = Paint.Align.LEFT;
        textPaint.setTextAlign(align);
        this.f53337b.setTextSize(this.f53341f);
        this.f53337b.setColor(this.f53338c);
        this.f53337b.setAntiAlias(true);
        this.f53337b.setTextAlign(align);
    }

    /* JADX INFO: renamed from: i */
    public void m78320i() {
        f53335x = null;
        this.f53346k = 0;
        this.f53347l = true;
        this.f53351p = 0L;
        this.f53357v = 0.0f;
        this.f53352q = null;
        invalidate();
    }

    /* JADX INFO: renamed from: j */
    public void m78321j(long j) {
        if (m78318g()) {
            this.f53351p = j;
            int iM78317f = m78317f(j);
            if (iM78317f != this.f53346k) {
                this.f53347l = true;
                this.f53346k = iM78317f;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!m78318g()) {
            int lrcWidth = getLrcWidth();
            int lrcHeight = getLrcHeight();
            if (lrcWidth == 0 || lrcHeight == 0) {
                return;
            }
            StaticLayout staticLayout = new StaticLayout("暂无歌词", this.f53337b, lrcWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, getPaddingTop() + ((lrcHeight - staticLayout.getHeight()) / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            return;
        }
        if (this.f53346k >= f53335x.getLrcBeans().size()) {
            return;
        }
        if (this.f53346k == 0) {
            this.f53343h = qa00.m175859d(13.0f);
        } else {
            this.f53343h = qa00.m175859d(15.0f);
        }
        this.f53337b.setTextSize(this.f53343h);
        this.f53336a.setTextSize(this.f53343h);
        LrcBean lrcBean = f53335x.getLrcBeans().get(this.f53346k);
        if (this.f53347l) {
            this.f53337b.setColor(this.f53338c);
            this.f53337b.setTextSize(this.f53343h);
            this.f53358w = new mgw(lrcBean, this.f53336a, this.f53337b, getLrcWidth());
            Bitmap bitmap = this.f53353r;
            if (bitmap != null) {
                bitmap.eraseColor(0);
            }
            int i = this.f53346k;
            if (i < 0 || i >= f53335x.getLrcBeans().size()) {
                this.f53347l = false;
                return;
            } else {
                m78315d();
                m78314c();
                this.f53347l = false;
            }
        }
        canvas.drawBitmap(this.f53353r, this.f53349n, this.f53350o, (Paint) null);
        m78316e();
        canvas.drawBitmap(this.f53355t, this.f53349n, this.f53350o, (Paint) null);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int paddingStart = ((i3 - i) - getPaddingStart()) - getPaddingEnd();
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            if (paddingTop > 0) {
                Bitmap bitmap = this.f53355t;
                if (bitmap == null) {
                    m78313b(paddingStart, paddingTop);
                } else if (bitmap.getWidth() != paddingStart || this.f53355t.getHeight() != paddingTop) {
                    if (!this.f53355t.isRecycled()) {
                        this.f53355t.recycle();
                    }
                    m78313b(paddingStart, paddingTop);
                }
                Bitmap bitmap2 = this.f53353r;
                if (bitmap2 == null) {
                    m78312a(paddingStart, paddingTop);
                } else if (bitmap2.getWidth() != paddingStart || this.f53353r.getHeight() != paddingTop) {
                    if (!this.f53353r.isRecycled()) {
                        this.f53353r.recycle();
                    }
                    m78312a(paddingStart, paddingTop);
                    Bitmap bitmap3 = this.f53353r;
                    if (bitmap3 == null) {
                        m78312a(paddingStart, paddingTop);
                    } else if (bitmap3.getWidth() != paddingStart || this.f53353r.getHeight() != paddingTop) {
                        if (!this.f53353r.isRecycled()) {
                            this.f53353r.recycle();
                        }
                        m78312a(paddingStart, paddingTop);
                    }
                }
            }
            Rect rect = this.f53349n;
            rect.left = 0;
            rect.top = 0;
            rect.right = getLrcWidth();
            this.f53349n.bottom = getLrcHeight();
            this.f53350o.left = getPaddingStart();
            this.f53350o.top = getPaddingTop();
            this.f53350o.right = getPaddingStart() + getLrcWidth();
            this.f53350o.bottom = getPaddingTop() + getLrcHeight();
            invalidate();
        }
    }

    public void setLrcData(LrcWrapperBean lrcWrapperBean) {
        List<LrcBean.Tone> list;
        f53335x = lrcWrapperBean;
        if (this.f53352q != null && f53335x != null && f53335x.getLrcBeans() != null && !f53335x.getLrcBeans().isEmpty() && (list = f53335x.getLrcBeans().get(f53335x.getLrcBeans().size() - 1).tones) != null && !list.isEmpty()) {
            list.get(list.size() - 1).end = this.f53352q.longValue();
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
