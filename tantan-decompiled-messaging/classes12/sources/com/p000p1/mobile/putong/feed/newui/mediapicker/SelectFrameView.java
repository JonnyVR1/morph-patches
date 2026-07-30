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
import l.e30;
import l.t100;
import p007l.e1c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class SelectFrameView extends View {

    /* JADX INFO: renamed from: a */
    public int f1956a;

    /* JADX INFO: renamed from: b */
    public int f1957b;

    /* JADX INFO: renamed from: c */
    public int f1958c;

    /* JADX INFO: renamed from: d */
    public int f1959d;

    /* JADX INFO: renamed from: e */
    public int f1960e;

    /* JADX INFO: renamed from: f */
    public int f1961f;

    /* JADX INFO: renamed from: g */
    public GestureDetector f1962g;

    /* JADX INFO: renamed from: h */
    public Paint f1963h;

    /* JADX INFO: renamed from: i */
    public e30<Integer> f1964i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.SelectFrameView$a */
    public class C2078a extends GestureDetector.SimpleOnGestureListener {
        public C2078a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            return x > ((float) (SelectFrameView.this.f1958c + (-20))) && x < ((float) ((SelectFrameView.this.f1958c + SelectFrameView.this.f1959d) + 20));
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            SelectFrameView.this.f1958c -= (int) f;
            int i = SelectFrameView.this.f1958c;
            int i2 = SelectFrameView.this.f1956a;
            SelectFrameView selectFrameView = SelectFrameView.this;
            if (i < i2) {
                selectFrameView.f1958c = selectFrameView.f1956a;
            } else if (selectFrameView.f1958c > SelectFrameView.this.f1957b) {
                SelectFrameView selectFrameView2 = SelectFrameView.this;
                selectFrameView2.f1958c = selectFrameView2.f1957b;
            }
            if (NullChecker.a(SelectFrameView.this.f1964i)) {
                SelectFrameView selectFrameView3 = SelectFrameView.this;
                selectFrameView3.f1964i.call(Integer.valueOf(selectFrameView3.f1958c - SelectFrameView.this.f1956a));
            }
            SelectFrameView.this.invalidate();
            return true;
        }
    }

    public SelectFrameView(Context context) {
        super(context);
        this.f1958c = 0;
        this.f1959d = t100.d(8.0f);
        this.f1960e = t100.d(3.5f);
        this.f1961f = t100.d(4.5f);
        this.f1963h = new Paint();
    }

    /* JADX INFO: renamed from: f */
    public void m3561f(int i, int i2, int i3, e30<Integer> e30Var) {
        this.f1964i = e30Var;
        this.f1956a = i;
        this.f1958c = i;
        if (i3 <= i2) {
            i2 = i3;
        }
        this.f1957b = i + i2;
        this.f1963h.setColor(getResources().getColor(e1c0.f7154n));
        invalidate();
        m3562g();
    }

    /* JADX INFO: renamed from: g */
    public final void m3562g() {
        this.f1962g = new GestureDetector(new C2078a());
    }

    /* JADX INFO: renamed from: h */
    public void m3563h(int i) {
        this.f1958c = i;
        invalidate();
        m3562g();
    }

    @Override // android.view.View
    @RequiresApi(api = 21)
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f1958c;
        float f = i;
        float f2 = i + this.f1961f;
        float height = getHeight();
        int i2 = this.f1960e;
        canvas.drawRoundRect(f, 0.0f, f2, height, i2, i2, this.f1963h);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return this.f1962g.onTouchEvent(motionEvent);
        }
        if (NullChecker.a(this.f1964i)) {
            this.f1964i.call(Integer.valueOf(this.f1958c - this.f1956a));
        }
        return true;
    }

    public SelectFrameView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1958c = 0;
        this.f1959d = t100.d(8.0f);
        this.f1960e = t100.d(3.5f);
        this.f1961f = t100.d(4.5f);
        this.f1963h = new Paint();
    }

    public SelectFrameView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1958c = 0;
        this.f1959d = t100.d(8.0f);
        this.f1960e = t100.d(3.5f);
        this.f1961f = t100.d(4.5f);
        this.f1963h = new Paint();
    }
}
