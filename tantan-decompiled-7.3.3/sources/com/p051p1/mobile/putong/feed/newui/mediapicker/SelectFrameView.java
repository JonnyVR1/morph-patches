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
import p153l.k9c0;
import p153l.qa00;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class SelectFrameView extends View {

    /* JADX INFO: renamed from: a */
    public int f41343a;

    /* JADX INFO: renamed from: b */
    public int f41344b;

    /* JADX INFO: renamed from: c */
    public int f41345c;

    /* JADX INFO: renamed from: d */
    public int f41346d;

    /* JADX INFO: renamed from: e */
    public int f41347e;

    /* JADX INFO: renamed from: f */
    public int f41348f;

    /* JADX INFO: renamed from: g */
    public GestureDetector f41349g;

    /* JADX INFO: renamed from: h */
    public Paint f41350h;

    /* JADX INFO: renamed from: i */
    public y20<Integer> f41351i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.SelectFrameView$a */
    public class C11397a extends GestureDetector.SimpleOnGestureListener {
        public C11397a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            return x > ((float) (SelectFrameView.this.f41345c + (-20))) && x < ((float) ((SelectFrameView.this.f41345c + SelectFrameView.this.f41346d) + 20));
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            SelectFrameView.this.f41345c -= (int) f;
            int i = SelectFrameView.this.f41345c;
            int i2 = SelectFrameView.this.f41343a;
            SelectFrameView selectFrameView = SelectFrameView.this;
            if (i < i2) {
                selectFrameView.f41345c = selectFrameView.f41343a;
            } else if (selectFrameView.f41345c > SelectFrameView.this.f41344b) {
                SelectFrameView selectFrameView2 = SelectFrameView.this;
                selectFrameView2.f41345c = selectFrameView2.f41344b;
            }
            if (NullChecker.m82486a(SelectFrameView.this.f41351i)) {
                SelectFrameView selectFrameView3 = SelectFrameView.this;
                selectFrameView3.f41351i.call(Integer.valueOf(selectFrameView3.f41345c - SelectFrameView.this.f41343a));
            }
            SelectFrameView.this.invalidate();
            return true;
        }
    }

    public SelectFrameView(Context context) {
        super(context);
        this.f41345c = 0;
        this.f41346d = qa00.m175859d(8.0f);
        this.f41347e = qa00.m175859d(3.5f);
        this.f41348f = qa00.m175859d(4.5f);
        this.f41350h = new Paint();
    }

    /* JADX INFO: renamed from: f */
    public void m63739f(int i, int i2, int i3, y20<Integer> y20Var) {
        this.f41351i = y20Var;
        this.f41343a = i;
        this.f41345c = i;
        if (i3 <= i2) {
            i2 = i3;
        }
        this.f41344b = i + i2;
        this.f41350h.setColor(getResources().getColor(k9c0.f124521n));
        invalidate();
        m63740g();
    }

    /* JADX INFO: renamed from: g */
    public final void m63740g() {
        this.f41349g = new GestureDetector(new C11397a());
    }

    /* JADX INFO: renamed from: h */
    public void m63741h(int i) {
        this.f41345c = i;
        invalidate();
        m63740g();
    }

    @Override // android.view.View
    @RequiresApi(api = 21)
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f41345c;
        float f = i;
        float f2 = i + this.f41348f;
        float height = getHeight();
        int i2 = this.f41347e;
        canvas.drawRoundRect(f, 0.0f, f2, height, i2, i2, this.f41350h);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return this.f41349g.onTouchEvent(motionEvent);
        }
        if (NullChecker.m82486a(this.f41351i)) {
            this.f41351i.call(Integer.valueOf(this.f41345c - this.f41343a));
        }
        return true;
    }

    public SelectFrameView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41345c = 0;
        this.f41346d = qa00.m175859d(8.0f);
        this.f41347e = qa00.m175859d(3.5f);
        this.f41348f = qa00.m175859d(4.5f);
        this.f41350h = new Paint();
    }

    public SelectFrameView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41345c = 0;
        this.f41346d = qa00.m175859d(8.0f);
        this.f41347e = qa00.m175859d(3.5f);
        this.f41348f = qa00.m175859d(4.5f);
        this.f41350h = new Paint();
    }
}
