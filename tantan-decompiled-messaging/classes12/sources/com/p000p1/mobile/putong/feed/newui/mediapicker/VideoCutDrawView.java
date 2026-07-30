package com.p000p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.tantanapp.common.utils.NullChecker;
import l.g30;
import l.t100;
import p007l.e1c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class VideoCutDrawView extends View {

    /* JADX INFO: renamed from: a */
    public int f1990a;

    /* JADX INFO: renamed from: b */
    public int f1991b;

    /* JADX INFO: renamed from: c */
    public int f1992c;

    /* JADX INFO: renamed from: d */
    public int f1993d;

    /* JADX INFO: renamed from: e */
    public int f1994e;

    /* JADX INFO: renamed from: f */
    public int f1995f;

    /* JADX INFO: renamed from: g */
    public int f1996g;

    /* JADX INFO: renamed from: h */
    public int f1997h;

    /* JADX INFO: renamed from: i */
    public int f1998i;

    /* JADX INFO: renamed from: j */
    public int f1999j;

    /* JADX INFO: renamed from: k */
    public int f2000k;

    /* JADX INFO: renamed from: l */
    public int f2001l;

    /* JADX INFO: renamed from: m */
    public int f2002m;

    /* JADX INFO: renamed from: n */
    public int f2003n;

    /* JADX INFO: renamed from: o */
    public int f2004o;

    /* JADX INFO: renamed from: p */
    public int f2005p;

    /* JADX INFO: renamed from: q */
    public int f2006q;

    /* JADX INFO: renamed from: r */
    public boolean f2007r;

    /* JADX INFO: renamed from: s */
    public boolean f2008s;

    /* JADX INFO: renamed from: t */
    public GestureDetector f2009t;

    /* JADX INFO: renamed from: u */
    public Paint f2010u;

    /* JADX INFO: renamed from: v */
    public Paint f2011v;

    /* JADX INFO: renamed from: w */
    public Paint f2012w;

    /* JADX INFO: renamed from: x */
    public g30<Integer, Integer, Boolean> f2013x;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.VideoCutDrawView$a */
    public class C2083a extends GestureDetector.SimpleOnGestureListener {
        public C2083a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            if (x > VideoCutDrawView.this.f1990a - 20 && x < VideoCutDrawView.this.f1990a + VideoCutDrawView.this.f1997h + 20) {
                VideoCutDrawView videoCutDrawView = VideoCutDrawView.this;
                videoCutDrawView.f2008s = false;
                videoCutDrawView.f2007r = true;
                return true;
            }
            if (x >= VideoCutDrawView.this.f1991b + 20 || x <= (VideoCutDrawView.this.f1991b - VideoCutDrawView.this.f1997h) - 20) {
                return false;
            }
            VideoCutDrawView videoCutDrawView2 = VideoCutDrawView.this;
            videoCutDrawView2.f2008s = false;
            videoCutDrawView2.f2007r = false;
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean z = VideoCutDrawView.this.f2007r;
            VideoCutDrawView videoCutDrawView = VideoCutDrawView.this;
            if (z) {
                videoCutDrawView.f1990a -= (int) f;
                if (VideoCutDrawView.this.f1990a < 0) {
                    VideoCutDrawView.this.f1990a = 0;
                }
                int i = VideoCutDrawView.this.f1990a;
                int i2 = VideoCutDrawView.this.f1991b - VideoCutDrawView.this.f1995f;
                VideoCutDrawView videoCutDrawView2 = VideoCutDrawView.this;
                if (i < i2) {
                    videoCutDrawView2.f1990a = videoCutDrawView2.f1991b - VideoCutDrawView.this.f1995f;
                } else {
                    int i3 = videoCutDrawView2.f1990a;
                    int i4 = VideoCutDrawView.this.f1991b - VideoCutDrawView.this.f1993d;
                    VideoCutDrawView videoCutDrawView3 = VideoCutDrawView.this;
                    if (i3 < i4) {
                        videoCutDrawView3.f1990a = videoCutDrawView3.f1991b - VideoCutDrawView.this.f1993d;
                    } else if (videoCutDrawView3.f1990a > VideoCutDrawView.this.f1991b - VideoCutDrawView.this.f1994e) {
                        VideoCutDrawView videoCutDrawView4 = VideoCutDrawView.this;
                        videoCutDrawView4.f1990a = videoCutDrawView4.f1991b - VideoCutDrawView.this.f1994e;
                    }
                }
            } else {
                videoCutDrawView.f1991b -= (int) f;
                if (VideoCutDrawView.this.f1991b > VideoCutDrawView.this.f1992c) {
                    VideoCutDrawView videoCutDrawView5 = VideoCutDrawView.this;
                    videoCutDrawView5.f1991b = videoCutDrawView5.f1992c;
                }
                int i5 = VideoCutDrawView.this.f1991b;
                int i6 = VideoCutDrawView.this.f1990a + VideoCutDrawView.this.f1995f;
                VideoCutDrawView videoCutDrawView6 = VideoCutDrawView.this;
                if (i5 > i6) {
                    videoCutDrawView6.f1991b = videoCutDrawView6.f1990a + VideoCutDrawView.this.f1995f;
                } else if (videoCutDrawView6.f1991b < VideoCutDrawView.this.f1990a + VideoCutDrawView.this.f1994e) {
                    VideoCutDrawView videoCutDrawView7 = VideoCutDrawView.this;
                    videoCutDrawView7.f1991b = videoCutDrawView7.f1990a + VideoCutDrawView.this.f1994e;
                }
            }
            if (NullChecker.a(VideoCutDrawView.this.f2013x)) {
                VideoCutDrawView videoCutDrawView8 = VideoCutDrawView.this;
                videoCutDrawView8.f2013x.a(Integer.valueOf(videoCutDrawView8.f1990a), Integer.valueOf(VideoCutDrawView.this.f1991b), Boolean.FALSE);
            }
            VideoCutDrawView.this.invalidate();
            return true;
        }
    }

    public VideoCutDrawView(Context context) {
        super(context);
        this.f1996g = 0;
        this.f1997h = t100.d(14.0f);
        this.f1998i = t100.d(2.0f);
        this.f1999j = t100.d(27.0f);
        this.f2000k = t100.d(41.0f);
        this.f2001l = t100.d(9.0f);
        this.f2002m = t100.d(6.5f);
        this.f2003n = t100.d(7.5f);
        this.f2004o = t100.d(3.5f);
        this.f2005p = t100.d(4.5f);
        this.f2006q = t100.d(5.0f);
        this.f2008s = true;
        this.f2010u = new Paint();
        this.f2011v = new Paint();
        this.f2012w = new Paint();
    }

    /* JADX INFO: renamed from: l */
    public void m3594l(int i, int i2, int i3, int i4, g30<Integer, Integer, Boolean> g30Var) {
        this.f2013x = g30Var;
        this.f1990a = i;
        this.f1996g = i;
        this.f1991b = i + (i4 > i2 ? i2 : i4);
        this.f1992c = i2;
        this.f1993d = i2;
        this.f1994e = i3;
        this.f1995f = i4;
        this.f2010u.setColor(getResources().getColor(e1c0.f7124W));
        this.f2011v.setColor(getResources().getColor(e1c0.f7125X));
        this.f2012w.setColor(getResources().getColor(e1c0.f7154n));
        invalidate();
        m3595m();
    }

    /* JADX INFO: renamed from: m */
    public final void m3595m() {
        this.f2009t = new GestureDetector(new C2083a());
    }

    /* JADX INFO: renamed from: n */
    public void m3596n(int i) {
        this.f1992c = i;
    }

    @Override // android.view.View
    @RequiresApi(api = 21)
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int i = this.f1990a;
        canvas.clipRect(i, this.f2004o, this.f1997h + i, getHeight() - this.f2004o);
        int i2 = this.f1990a;
        float f = this.f2004o;
        float f2 = i2 + this.f1997h + this.f2005p;
        float height = getHeight() - this.f2004o;
        int i3 = this.f2005p;
        canvas.drawRoundRect(i2, f, f2, height, i3, i3, this.f2010u);
        canvas.restore();
        canvas.save();
        int i4 = this.f1991b;
        canvas.clipRect(i4 - this.f1997h, this.f2004o, i4, getHeight() - this.f2004o);
        int i5 = this.f1991b;
        float height2 = getHeight() - this.f2004o;
        int i6 = this.f2005p;
        canvas.drawRoundRect((i5 - this.f1997h) - this.f2005p, this.f2004o, i5, height2, i6, i6, this.f2010u);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        int i7 = this.f1990a;
        int i8 = this.f2004o;
        canvas.drawRect(i7 + i8, i8, this.f1991b - i8, this.f1998i + i8, this.f2010u);
        float f3 = this.f1990a + this.f2004o;
        int height3 = getHeight() - this.f1998i;
        int i9 = this.f2004o;
        canvas.drawRect(f3, height3 - i9, this.f1991b - i9, getHeight() - this.f2004o, this.f2010u);
        int i10 = this.f1990a;
        canvas.drawRect(this.f2006q + i10, this.f1999j, i10 + this.f2002m, this.f2000k, this.f2011v);
        int i11 = this.f1990a;
        canvas.drawRect(this.f2003n + i11, this.f1999j, i11 + this.f2001l, this.f2000k, this.f2011v);
        int i12 = this.f1991b;
        canvas.drawRect(i12 - this.f2002m, this.f1999j, i12 - this.f2006q, this.f2000k, this.f2011v);
        int i13 = this.f1991b;
        canvas.drawRect(i13 - this.f2001l, this.f1999j, i13 - this.f2003n, this.f2000k, this.f2011v);
        if (this.f2008s) {
            int i14 = this.f1996g;
            float f4 = i14 + this.f2005p;
            float height4 = getHeight();
            int i15 = this.f2004o;
            canvas.drawRoundRect(i14, 0.0f, f4, height4, i15, i15, this.f2012w);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return this.f2009t.onTouchEvent(motionEvent);
        }
        if (NullChecker.a(this.f2013x)) {
            this.f2013x.a(Integer.valueOf(this.f1990a), Integer.valueOf(this.f1991b), Boolean.TRUE);
        }
        return true;
    }

    public void setPointIndex(int i) {
        int i2 = this.f1991b;
        int i3 = this.f1990a;
        if (i > i2 - i3) {
            i = i2 - i3;
        } else if (i < 0) {
            i = 0;
        }
        this.f1996g = i3 + i;
        postInvalidate();
    }

    public VideoCutDrawView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1996g = 0;
        this.f1997h = t100.d(14.0f);
        this.f1998i = t100.d(2.0f);
        this.f1999j = t100.d(27.0f);
        this.f2000k = t100.d(41.0f);
        this.f2001l = t100.d(9.0f);
        this.f2002m = t100.d(6.5f);
        this.f2003n = t100.d(7.5f);
        this.f2004o = t100.d(3.5f);
        this.f2005p = t100.d(4.5f);
        this.f2006q = t100.d(5.0f);
        this.f2008s = true;
        this.f2010u = new Paint();
        this.f2011v = new Paint();
        this.f2012w = new Paint();
    }

    public VideoCutDrawView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1996g = 0;
        this.f1997h = t100.d(14.0f);
        this.f1998i = t100.d(2.0f);
        this.f1999j = t100.d(27.0f);
        this.f2000k = t100.d(41.0f);
        this.f2001l = t100.d(9.0f);
        this.f2002m = t100.d(6.5f);
        this.f2003n = t100.d(7.5f);
        this.f2004o = t100.d(3.5f);
        this.f2005p = t100.d(4.5f);
        this.f2006q = t100.d(5.0f);
        this.f2008s = true;
        this.f2010u = new Paint();
        this.f2011v = new Paint();
        this.f2012w = new Paint();
    }
}
