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
import p149l.e30;
import p149l.t100;

/* JADX INFO: loaded from: classes12.dex */
public class SelectFrameView extends View {

    /* JADX INFO: renamed from: a */
    public int f40495a;

    /* JADX INFO: renamed from: b */
    public int f40496b;

    /* JADX INFO: renamed from: c */
    public int f40497c;

    /* JADX INFO: renamed from: d */
    public int f40498d;

    /* JADX INFO: renamed from: e */
    public int f40499e;

    /* JADX INFO: renamed from: f */
    public int f40500f;

    /* JADX INFO: renamed from: g */
    public GestureDetector f40501g;

    /* JADX INFO: renamed from: h */
    public Paint f40502h;

    /* JADX INFO: renamed from: i */
    public e30<Integer> f40503i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.SelectFrameView$a */
    public class C11234a extends GestureDetector.SimpleOnGestureListener {
        public C11234a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            return x > ((float) (SelectFrameView.this.f40497c + (-20))) && x < ((float) ((SelectFrameView.this.f40497c + SelectFrameView.this.f40498d) + 20));
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            SelectFrameView.this.f40497c -= (int) f;
            int i = SelectFrameView.this.f40497c;
            int i2 = SelectFrameView.this.f40495a;
            SelectFrameView selectFrameView = SelectFrameView.this;
            if (i < i2) {
                selectFrameView.f40497c = selectFrameView.f40495a;
            } else if (selectFrameView.f40497c > SelectFrameView.this.f40496b) {
                SelectFrameView selectFrameView2 = SelectFrameView.this;
                selectFrameView2.f40497c = selectFrameView2.f40496b;
            }
            if (NullChecker.m81303a(SelectFrameView.this.f40503i)) {
                SelectFrameView selectFrameView3 = SelectFrameView.this;
                selectFrameView3.f40503i.call(Integer.valueOf(selectFrameView3.f40497c - SelectFrameView.this.f40495a));
            }
            SelectFrameView.this.invalidate();
            return true;
        }
    }

    public SelectFrameView(Context context) {
        super(context);
        this.f40497c = 0;
        this.f40498d = t100.m186890d(8.0f);
        this.f40499e = t100.m186890d(3.5f);
        this.f40500f = t100.m186890d(4.5f);
        this.f40502h = new Paint();
    }

    /* JADX INFO: renamed from: f */
    public void m62556f(int i, int i2, int i3, e30<Integer> e30Var) {
        this.f40503i = e30Var;
        this.f40495a = i;
        this.f40497c = i;
        if (i3 <= i2) {
            i2 = i3;
        }
        this.f40496b = i + i2;
        this.f40502h.setColor(getResources().getColor(e1c0.f88798n));
        invalidate();
        m62557g();
    }

    /* JADX INFO: renamed from: g */
    public final void m62557g() {
        this.f40501g = new GestureDetector(new C11234a());
    }

    /* JADX INFO: renamed from: h */
    public void m62558h(int i) {
        this.f40497c = i;
        invalidate();
        m62557g();
    }

    @Override // android.view.View
    @RequiresApi(api = 21)
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f40497c;
        float f = i;
        float f2 = i + this.f40500f;
        float height = getHeight();
        int i2 = this.f40499e;
        canvas.drawRoundRect(f, 0.0f, f2, height, i2, i2, this.f40502h);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return this.f40501g.onTouchEvent(motionEvent);
        }
        if (NullChecker.m81303a(this.f40503i)) {
            this.f40503i.call(Integer.valueOf(this.f40497c - this.f40495a));
        }
        return true;
    }

    public SelectFrameView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40497c = 0;
        this.f40498d = t100.m186890d(8.0f);
        this.f40499e = t100.m186890d(3.5f);
        this.f40500f = t100.m186890d(4.5f);
        this.f40502h = new Paint();
    }

    public SelectFrameView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40497c = 0;
        this.f40498d = t100.m186890d(8.0f);
        this.f40499e = t100.m186890d(3.5f);
        this.f40500f = t100.m186890d(4.5f);
        this.f40502h = new Paint();
    }
}
