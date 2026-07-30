package com.p051p1.mobile.putong.feed.newui.mediapicker;

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
import p153l.a30;
import p153l.k9c0;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class VideoCutDrawView extends View {

    /* JADX INFO: renamed from: a */
    public int f41377a;

    /* JADX INFO: renamed from: b */
    public int f41378b;

    /* JADX INFO: renamed from: c */
    public int f41379c;

    /* JADX INFO: renamed from: d */
    public int f41380d;

    /* JADX INFO: renamed from: e */
    public int f41381e;

    /* JADX INFO: renamed from: f */
    public int f41382f;

    /* JADX INFO: renamed from: g */
    public int f41383g;

    /* JADX INFO: renamed from: h */
    public int f41384h;

    /* JADX INFO: renamed from: i */
    public int f41385i;

    /* JADX INFO: renamed from: j */
    public int f41386j;

    /* JADX INFO: renamed from: k */
    public int f41387k;

    /* JADX INFO: renamed from: l */
    public int f41388l;

    /* JADX INFO: renamed from: m */
    public int f41389m;

    /* JADX INFO: renamed from: n */
    public int f41390n;

    /* JADX INFO: renamed from: o */
    public int f41391o;

    /* JADX INFO: renamed from: p */
    public int f41392p;

    /* JADX INFO: renamed from: q */
    public int f41393q;

    /* JADX INFO: renamed from: r */
    public boolean f41394r;

    /* JADX INFO: renamed from: s */
    public boolean f41395s;

    /* JADX INFO: renamed from: t */
    public GestureDetector f41396t;

    /* JADX INFO: renamed from: u */
    public Paint f41397u;

    /* JADX INFO: renamed from: v */
    public Paint f41398v;

    /* JADX INFO: renamed from: w */
    public Paint f41399w;

    /* JADX INFO: renamed from: x */
    public a30<Integer, Integer, Boolean> f41400x;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.VideoCutDrawView$a */
    public class C11402a extends GestureDetector.SimpleOnGestureListener {
        public C11402a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            if (x > VideoCutDrawView.this.f41377a - 20 && x < VideoCutDrawView.this.f41377a + VideoCutDrawView.this.f41384h + 20) {
                VideoCutDrawView videoCutDrawView = VideoCutDrawView.this;
                videoCutDrawView.f41395s = false;
                videoCutDrawView.f41394r = true;
                return true;
            }
            if (x >= VideoCutDrawView.this.f41378b + 20 || x <= (VideoCutDrawView.this.f41378b - VideoCutDrawView.this.f41384h) - 20) {
                return false;
            }
            VideoCutDrawView videoCutDrawView2 = VideoCutDrawView.this;
            videoCutDrawView2.f41395s = false;
            videoCutDrawView2.f41394r = false;
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean z = VideoCutDrawView.this.f41394r;
            VideoCutDrawView videoCutDrawView = VideoCutDrawView.this;
            if (z) {
                videoCutDrawView.f41377a -= (int) f;
                if (VideoCutDrawView.this.f41377a < 0) {
                    VideoCutDrawView.this.f41377a = 0;
                }
                int i = VideoCutDrawView.this.f41377a;
                int i2 = VideoCutDrawView.this.f41378b - VideoCutDrawView.this.f41382f;
                VideoCutDrawView videoCutDrawView2 = VideoCutDrawView.this;
                if (i < i2) {
                    videoCutDrawView2.f41377a = videoCutDrawView2.f41378b - VideoCutDrawView.this.f41382f;
                } else {
                    int i3 = videoCutDrawView2.f41377a;
                    int i4 = VideoCutDrawView.this.f41378b - VideoCutDrawView.this.f41380d;
                    VideoCutDrawView videoCutDrawView3 = VideoCutDrawView.this;
                    if (i3 < i4) {
                        videoCutDrawView3.f41377a = videoCutDrawView3.f41378b - VideoCutDrawView.this.f41380d;
                    } else if (videoCutDrawView3.f41377a > VideoCutDrawView.this.f41378b - VideoCutDrawView.this.f41381e) {
                        VideoCutDrawView videoCutDrawView4 = VideoCutDrawView.this;
                        videoCutDrawView4.f41377a = videoCutDrawView4.f41378b - VideoCutDrawView.this.f41381e;
                    }
                }
            } else {
                videoCutDrawView.f41378b -= (int) f;
                if (VideoCutDrawView.this.f41378b > VideoCutDrawView.this.f41379c) {
                    VideoCutDrawView videoCutDrawView5 = VideoCutDrawView.this;
                    videoCutDrawView5.f41378b = videoCutDrawView5.f41379c;
                }
                int i5 = VideoCutDrawView.this.f41378b;
                int i6 = VideoCutDrawView.this.f41377a + VideoCutDrawView.this.f41382f;
                VideoCutDrawView videoCutDrawView6 = VideoCutDrawView.this;
                if (i5 > i6) {
                    videoCutDrawView6.f41378b = videoCutDrawView6.f41377a + VideoCutDrawView.this.f41382f;
                } else if (videoCutDrawView6.f41378b < VideoCutDrawView.this.f41377a + VideoCutDrawView.this.f41381e) {
                    VideoCutDrawView videoCutDrawView7 = VideoCutDrawView.this;
                    videoCutDrawView7.f41378b = videoCutDrawView7.f41377a + VideoCutDrawView.this.f41381e;
                }
            }
            if (NullChecker.m82486a(VideoCutDrawView.this.f41400x)) {
                VideoCutDrawView videoCutDrawView8 = VideoCutDrawView.this;
                videoCutDrawView8.f41400x.mo37058a(Integer.valueOf(videoCutDrawView8.f41377a), Integer.valueOf(VideoCutDrawView.this.f41378b), Boolean.FALSE);
            }
            VideoCutDrawView.this.invalidate();
            return true;
        }
    }

    public VideoCutDrawView(Context context) {
        super(context);
        this.f41383g = 0;
        this.f41384h = qa00.m175859d(14.0f);
        this.f41385i = qa00.m175859d(2.0f);
        this.f41386j = qa00.m175859d(27.0f);
        this.f41387k = qa00.m175859d(41.0f);
        this.f41388l = qa00.m175859d(9.0f);
        this.f41389m = qa00.m175859d(6.5f);
        this.f41390n = qa00.m175859d(7.5f);
        this.f41391o = qa00.m175859d(3.5f);
        this.f41392p = qa00.m175859d(4.5f);
        this.f41393q = qa00.m175859d(5.0f);
        this.f41395s = true;
        this.f41397u = new Paint();
        this.f41398v = new Paint();
        this.f41399w = new Paint();
    }

    /* JADX INFO: renamed from: l */
    public void m63772l(int i, int i2, int i3, int i4, a30<Integer, Integer, Boolean> a30Var) {
        this.f41400x = a30Var;
        this.f41377a = i;
        this.f41383g = i;
        this.f41378b = i + (i4 > i2 ? i2 : i4);
        this.f41379c = i2;
        this.f41380d = i2;
        this.f41381e = i3;
        this.f41382f = i4;
        this.f41397u.setColor(getResources().getColor(k9c0.f124491W));
        this.f41398v.setColor(getResources().getColor(k9c0.f124492X));
        this.f41399w.setColor(getResources().getColor(k9c0.f124521n));
        invalidate();
        m63773m();
    }

    /* JADX INFO: renamed from: m */
    public final void m63773m() {
        this.f41396t = new GestureDetector(new C11402a());
    }

    /* JADX INFO: renamed from: n */
    public void m63774n(int i) {
        this.f41379c = i;
    }

    @Override // android.view.View
    @RequiresApi(api = 21)
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int i = this.f41377a;
        canvas.clipRect(i, this.f41391o, this.f41384h + i, getHeight() - this.f41391o);
        int i2 = this.f41377a;
        float f = this.f41391o;
        float f2 = i2 + this.f41384h + this.f41392p;
        float height = getHeight() - this.f41391o;
        int i3 = this.f41392p;
        canvas.drawRoundRect(i2, f, f2, height, i3, i3, this.f41397u);
        canvas.restore();
        canvas.save();
        int i4 = this.f41378b;
        canvas.clipRect(i4 - this.f41384h, this.f41391o, i4, getHeight() - this.f41391o);
        int i5 = this.f41378b;
        float height2 = getHeight() - this.f41391o;
        int i6 = this.f41392p;
        canvas.drawRoundRect((i5 - this.f41384h) - this.f41392p, this.f41391o, i5, height2, i6, i6, this.f41397u);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        int i7 = this.f41377a;
        int i8 = this.f41391o;
        canvas.drawRect(i7 + i8, i8, this.f41378b - i8, this.f41385i + i8, this.f41397u);
        float f3 = this.f41377a + this.f41391o;
        int height3 = getHeight() - this.f41385i;
        int i9 = this.f41391o;
        canvas.drawRect(f3, height3 - i9, this.f41378b - i9, getHeight() - this.f41391o, this.f41397u);
        int i10 = this.f41377a;
        canvas.drawRect(this.f41393q + i10, this.f41386j, i10 + this.f41389m, this.f41387k, this.f41398v);
        int i11 = this.f41377a;
        canvas.drawRect(this.f41390n + i11, this.f41386j, i11 + this.f41388l, this.f41387k, this.f41398v);
        int i12 = this.f41378b;
        canvas.drawRect(i12 - this.f41389m, this.f41386j, i12 - this.f41393q, this.f41387k, this.f41398v);
        int i13 = this.f41378b;
        canvas.drawRect(i13 - this.f41388l, this.f41386j, i13 - this.f41390n, this.f41387k, this.f41398v);
        if (this.f41395s) {
            int i14 = this.f41383g;
            float f4 = i14 + this.f41392p;
            float height4 = getHeight();
            int i15 = this.f41391o;
            canvas.drawRoundRect(i14, 0.0f, f4, height4, i15, i15, this.f41399w);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return this.f41396t.onTouchEvent(motionEvent);
        }
        if (NullChecker.m82486a(this.f41400x)) {
            this.f41400x.mo37058a(Integer.valueOf(this.f41377a), Integer.valueOf(this.f41378b), Boolean.TRUE);
        }
        return true;
    }

    public void setPointIndex(int i) {
        int i2 = this.f41378b;
        int i3 = this.f41377a;
        if (i > i2 - i3) {
            i = i2 - i3;
        } else if (i < 0) {
            i = 0;
        }
        this.f41383g = i3 + i;
        postInvalidate();
    }

    public VideoCutDrawView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41383g = 0;
        this.f41384h = qa00.m175859d(14.0f);
        this.f41385i = qa00.m175859d(2.0f);
        this.f41386j = qa00.m175859d(27.0f);
        this.f41387k = qa00.m175859d(41.0f);
        this.f41388l = qa00.m175859d(9.0f);
        this.f41389m = qa00.m175859d(6.5f);
        this.f41390n = qa00.m175859d(7.5f);
        this.f41391o = qa00.m175859d(3.5f);
        this.f41392p = qa00.m175859d(4.5f);
        this.f41393q = qa00.m175859d(5.0f);
        this.f41395s = true;
        this.f41397u = new Paint();
        this.f41398v = new Paint();
        this.f41399w = new Paint();
    }

    public VideoCutDrawView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41383g = 0;
        this.f41384h = qa00.m175859d(14.0f);
        this.f41385i = qa00.m175859d(2.0f);
        this.f41386j = qa00.m175859d(27.0f);
        this.f41387k = qa00.m175859d(41.0f);
        this.f41388l = qa00.m175859d(9.0f);
        this.f41389m = qa00.m175859d(6.5f);
        this.f41390n = qa00.m175859d(7.5f);
        this.f41391o = qa00.m175859d(3.5f);
        this.f41392p = qa00.m175859d(4.5f);
        this.f41393q = qa00.m175859d(5.0f);
        this.f41395s = true;
        this.f41397u = new Paint();
        this.f41398v = new Paint();
        this.f41399w = new Paint();
    }
}
