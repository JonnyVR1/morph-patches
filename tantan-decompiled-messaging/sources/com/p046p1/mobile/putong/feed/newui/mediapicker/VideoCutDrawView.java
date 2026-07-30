package com.p046p1.mobile.putong.feed.newui.mediapicker;

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
import p149l.e1c0;
import p149l.g30;
import p149l.t100;

/* JADX INFO: loaded from: classes12.dex */
public class VideoCutDrawView extends View {

    /* JADX INFO: renamed from: a */
    public int f40529a;

    /* JADX INFO: renamed from: b */
    public int f40530b;

    /* JADX INFO: renamed from: c */
    public int f40531c;

    /* JADX INFO: renamed from: d */
    public int f40532d;

    /* JADX INFO: renamed from: e */
    public int f40533e;

    /* JADX INFO: renamed from: f */
    public int f40534f;

    /* JADX INFO: renamed from: g */
    public int f40535g;

    /* JADX INFO: renamed from: h */
    public int f40536h;

    /* JADX INFO: renamed from: i */
    public int f40537i;

    /* JADX INFO: renamed from: j */
    public int f40538j;

    /* JADX INFO: renamed from: k */
    public int f40539k;

    /* JADX INFO: renamed from: l */
    public int f40540l;

    /* JADX INFO: renamed from: m */
    public int f40541m;

    /* JADX INFO: renamed from: n */
    public int f40542n;

    /* JADX INFO: renamed from: o */
    public int f40543o;

    /* JADX INFO: renamed from: p */
    public int f40544p;

    /* JADX INFO: renamed from: q */
    public int f40545q;

    /* JADX INFO: renamed from: r */
    public boolean f40546r;

    /* JADX INFO: renamed from: s */
    public boolean f40547s;

    /* JADX INFO: renamed from: t */
    public GestureDetector f40548t;

    /* JADX INFO: renamed from: u */
    public Paint f40549u;

    /* JADX INFO: renamed from: v */
    public Paint f40550v;

    /* JADX INFO: renamed from: w */
    public Paint f40551w;

    /* JADX INFO: renamed from: x */
    public g30<Integer, Integer, Boolean> f40552x;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.VideoCutDrawView$a */
    public class C11239a extends GestureDetector.SimpleOnGestureListener {
        public C11239a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            if (x > VideoCutDrawView.this.f40529a - 20 && x < VideoCutDrawView.this.f40529a + VideoCutDrawView.this.f40536h + 20) {
                VideoCutDrawView videoCutDrawView = VideoCutDrawView.this;
                videoCutDrawView.f40547s = false;
                videoCutDrawView.f40546r = true;
                return true;
            }
            if (x >= VideoCutDrawView.this.f40530b + 20 || x <= (VideoCutDrawView.this.f40530b - VideoCutDrawView.this.f40536h) - 20) {
                return false;
            }
            VideoCutDrawView videoCutDrawView2 = VideoCutDrawView.this;
            videoCutDrawView2.f40547s = false;
            videoCutDrawView2.f40546r = false;
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean z = VideoCutDrawView.this.f40546r;
            VideoCutDrawView videoCutDrawView = VideoCutDrawView.this;
            if (z) {
                videoCutDrawView.f40529a -= (int) f;
                if (VideoCutDrawView.this.f40529a < 0) {
                    VideoCutDrawView.this.f40529a = 0;
                }
                int i = VideoCutDrawView.this.f40529a;
                int i2 = VideoCutDrawView.this.f40530b - VideoCutDrawView.this.f40534f;
                VideoCutDrawView videoCutDrawView2 = VideoCutDrawView.this;
                if (i < i2) {
                    videoCutDrawView2.f40529a = videoCutDrawView2.f40530b - VideoCutDrawView.this.f40534f;
                } else {
                    int i3 = videoCutDrawView2.f40529a;
                    int i4 = VideoCutDrawView.this.f40530b - VideoCutDrawView.this.f40532d;
                    VideoCutDrawView videoCutDrawView3 = VideoCutDrawView.this;
                    if (i3 < i4) {
                        videoCutDrawView3.f40529a = videoCutDrawView3.f40530b - VideoCutDrawView.this.f40532d;
                    } else if (videoCutDrawView3.f40529a > VideoCutDrawView.this.f40530b - VideoCutDrawView.this.f40533e) {
                        VideoCutDrawView videoCutDrawView4 = VideoCutDrawView.this;
                        videoCutDrawView4.f40529a = videoCutDrawView4.f40530b - VideoCutDrawView.this.f40533e;
                    }
                }
            } else {
                videoCutDrawView.f40530b -= (int) f;
                if (VideoCutDrawView.this.f40530b > VideoCutDrawView.this.f40531c) {
                    VideoCutDrawView videoCutDrawView5 = VideoCutDrawView.this;
                    videoCutDrawView5.f40530b = videoCutDrawView5.f40531c;
                }
                int i5 = VideoCutDrawView.this.f40530b;
                int i6 = VideoCutDrawView.this.f40529a + VideoCutDrawView.this.f40534f;
                VideoCutDrawView videoCutDrawView6 = VideoCutDrawView.this;
                if (i5 > i6) {
                    videoCutDrawView6.f40530b = videoCutDrawView6.f40529a + VideoCutDrawView.this.f40534f;
                } else if (videoCutDrawView6.f40530b < VideoCutDrawView.this.f40529a + VideoCutDrawView.this.f40533e) {
                    VideoCutDrawView videoCutDrawView7 = VideoCutDrawView.this;
                    videoCutDrawView7.f40530b = videoCutDrawView7.f40529a + VideoCutDrawView.this.f40533e;
                }
            }
            if (NullChecker.m81303a(VideoCutDrawView.this.f40552x)) {
                VideoCutDrawView videoCutDrawView8 = VideoCutDrawView.this;
                videoCutDrawView8.f40552x.mo36055a(Integer.valueOf(videoCutDrawView8.f40529a), Integer.valueOf(VideoCutDrawView.this.f40530b), Boolean.FALSE);
            }
            VideoCutDrawView.this.invalidate();
            return true;
        }
    }

    public VideoCutDrawView(Context context) {
        super(context);
        this.f40535g = 0;
        this.f40536h = t100.m186890d(14.0f);
        this.f40537i = t100.m186890d(2.0f);
        this.f40538j = t100.m186890d(27.0f);
        this.f40539k = t100.m186890d(41.0f);
        this.f40540l = t100.m186890d(9.0f);
        this.f40541m = t100.m186890d(6.5f);
        this.f40542n = t100.m186890d(7.5f);
        this.f40543o = t100.m186890d(3.5f);
        this.f40544p = t100.m186890d(4.5f);
        this.f40545q = t100.m186890d(5.0f);
        this.f40547s = true;
        this.f40549u = new Paint();
        this.f40550v = new Paint();
        this.f40551w = new Paint();
    }

    /* JADX INFO: renamed from: l */
    public void m62589l(int i, int i2, int i3, int i4, g30<Integer, Integer, Boolean> g30Var) {
        this.f40552x = g30Var;
        this.f40529a = i;
        this.f40535g = i;
        this.f40530b = i + (i4 > i2 ? i2 : i4);
        this.f40531c = i2;
        this.f40532d = i2;
        this.f40533e = i3;
        this.f40534f = i4;
        this.f40549u.setColor(getResources().getColor(e1c0.f88768W));
        this.f40550v.setColor(getResources().getColor(e1c0.f88769X));
        this.f40551w.setColor(getResources().getColor(e1c0.f88798n));
        invalidate();
        m62590m();
    }

    /* JADX INFO: renamed from: m */
    public final void m62590m() {
        this.f40548t = new GestureDetector(new C11239a());
    }

    /* JADX INFO: renamed from: n */
    public void m62591n(int i) {
        this.f40531c = i;
    }

    @Override // android.view.View
    @RequiresApi(api = 21)
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int i = this.f40529a;
        canvas.clipRect(i, this.f40543o, this.f40536h + i, getHeight() - this.f40543o);
        int i2 = this.f40529a;
        float f = this.f40543o;
        float f2 = i2 + this.f40536h + this.f40544p;
        float height = getHeight() - this.f40543o;
        int i3 = this.f40544p;
        canvas.drawRoundRect(i2, f, f2, height, i3, i3, this.f40549u);
        canvas.restore();
        canvas.save();
        int i4 = this.f40530b;
        canvas.clipRect(i4 - this.f40536h, this.f40543o, i4, getHeight() - this.f40543o);
        int i5 = this.f40530b;
        float height2 = getHeight() - this.f40543o;
        int i6 = this.f40544p;
        canvas.drawRoundRect((i5 - this.f40536h) - this.f40544p, this.f40543o, i5, height2, i6, i6, this.f40549u);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        int i7 = this.f40529a;
        int i8 = this.f40543o;
        canvas.drawRect(i7 + i8, i8, this.f40530b - i8, this.f40537i + i8, this.f40549u);
        float f3 = this.f40529a + this.f40543o;
        int height3 = getHeight() - this.f40537i;
        int i9 = this.f40543o;
        canvas.drawRect(f3, height3 - i9, this.f40530b - i9, getHeight() - this.f40543o, this.f40549u);
        int i10 = this.f40529a;
        canvas.drawRect(this.f40545q + i10, this.f40538j, i10 + this.f40541m, this.f40539k, this.f40550v);
        int i11 = this.f40529a;
        canvas.drawRect(this.f40542n + i11, this.f40538j, i11 + this.f40540l, this.f40539k, this.f40550v);
        int i12 = this.f40530b;
        canvas.drawRect(i12 - this.f40541m, this.f40538j, i12 - this.f40545q, this.f40539k, this.f40550v);
        int i13 = this.f40530b;
        canvas.drawRect(i13 - this.f40540l, this.f40538j, i13 - this.f40542n, this.f40539k, this.f40550v);
        if (this.f40547s) {
            int i14 = this.f40535g;
            float f4 = i14 + this.f40544p;
            float height4 = getHeight();
            int i15 = this.f40543o;
            canvas.drawRoundRect(i14, 0.0f, f4, height4, i15, i15, this.f40551w);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return this.f40548t.onTouchEvent(motionEvent);
        }
        if (NullChecker.m81303a(this.f40552x)) {
            this.f40552x.mo36055a(Integer.valueOf(this.f40529a), Integer.valueOf(this.f40530b), Boolean.TRUE);
        }
        return true;
    }

    public void setPointIndex(int i) {
        int i2 = this.f40530b;
        int i3 = this.f40529a;
        if (i > i2 - i3) {
            i = i2 - i3;
        } else if (i < 0) {
            i = 0;
        }
        this.f40535g = i3 + i;
        postInvalidate();
    }

    public VideoCutDrawView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40535g = 0;
        this.f40536h = t100.m186890d(14.0f);
        this.f40537i = t100.m186890d(2.0f);
        this.f40538j = t100.m186890d(27.0f);
        this.f40539k = t100.m186890d(41.0f);
        this.f40540l = t100.m186890d(9.0f);
        this.f40541m = t100.m186890d(6.5f);
        this.f40542n = t100.m186890d(7.5f);
        this.f40543o = t100.m186890d(3.5f);
        this.f40544p = t100.m186890d(4.5f);
        this.f40545q = t100.m186890d(5.0f);
        this.f40547s = true;
        this.f40549u = new Paint();
        this.f40550v = new Paint();
        this.f40551w = new Paint();
    }

    public VideoCutDrawView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40535g = 0;
        this.f40536h = t100.m186890d(14.0f);
        this.f40537i = t100.m186890d(2.0f);
        this.f40538j = t100.m186890d(27.0f);
        this.f40539k = t100.m186890d(41.0f);
        this.f40540l = t100.m186890d(9.0f);
        this.f40541m = t100.m186890d(6.5f);
        this.f40542n = t100.m186890d(7.5f);
        this.f40543o = t100.m186890d(3.5f);
        this.f40544p = t100.m186890d(4.5f);
        this.f40545q = t100.m186890d(5.0f);
        this.f40547s = true;
        this.f40549u = new Paint();
        this.f40550v = new Paint();
        this.f40551w = new Paint();
    }
}
