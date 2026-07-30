package com.p000p1.mobile.putong.core.p001ui.mediapreview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.xdl0;
import p003l.m9e;
import p003l.n9e;
import p003l.o9e;
import p003l.pbl0;
import p003l.rbl0;
import p028v.C1378a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DragDismissContainerView extends FrameLayout implements C1378a.b {

    /* JADX INFO: renamed from: a */
    public View f541a;

    /* JADX INFO: renamed from: b */
    public pbl0 f542b;

    /* JADX INFO: renamed from: c */
    public rbl0 f543c;

    /* JADX INFO: renamed from: d */
    public n9e f544d;

    /* JADX INFO: renamed from: e */
    public String f545e;

    /* JADX INFO: renamed from: f */
    public C1378a f546f;

    /* JADX INFO: renamed from: g */
    public boolean f547g;

    /* JADX INFO: renamed from: h */
    public Point f548h;

    public DragDismissContainerView(@NonNull Context context, boolean z) {
        super(context);
        this.f548h = new Point();
        this.f547g = z;
        m876b();
    }

    /* JADX INFO: renamed from: a */
    private Act m875a() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    private void m876b() {
        this.f546f = new C1378a(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m877c() {
        this.f542b = new pbl0(this, getDragDismissListener());
        rbl0 rbl0Var = new rbl0(m875a(), this.f542b, this.f547g);
        this.f543c = rbl0Var;
        rbl0Var.m7180c(this);
    }

    /* JADX INFO: renamed from: d */
    public final void m878d() {
        if (getChildCount() > 0) {
            this.f541a = getChildAt(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.f546f.m11823g(canvas);
        super.dispatchDraw(canvas);
    }

    public n9e getDragDismissListener() {
        if (this.f544d == null) {
            this.f544d = new o9e(m875a());
        }
        return this.f544d;
    }

    public <T extends View> T getInnerContentView() {
        return (T) this.f541a;
    }

    @Override // p028v.C1378a.b
    /* JADX INFO: renamed from: k */
    public String mo879k() {
        return this.f545e;
    }

    @Override // p028v.C1378a.b
    /* JADX INFO: renamed from: l */
    public ValueAnimator mo880l(ViewGroup viewGroup) {
        return this.f546f.m11821G(viewGroup);
    }

    @Override // p028v.C1378a.b
    /* JADX INFO: renamed from: n */
    public ValueAnimator mo881n(ViewGroup viewGroup) {
        return this.f546f.m11822H(viewGroup);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m878d();
        m877c();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f548h = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        } else if (action == 2) {
            float fMin = Math.min(xdl0.y0(), xdl0.w0()) / 50;
            return Math.abs(((float) this.f548h.x) - motionEvent.getX()) > fMin || Math.abs(((float) this.f548h.y) - motionEvent.getY()) > fMin;
        }
        return super.onInterceptHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f543c.m7178a(motionEvent);
    }

    public void setDragDismissBackListener(m9e m9eVar) {
        if (NullChecker.a(this.f542b)) {
            this.f542b.m6832o(m9eVar);
        }
    }

    public void setFeedDragDismissListener(n9e n9eVar) {
        this.f544d = n9eVar;
    }

    public void setInnerContentView(View view) {
        this.f541a = view;
        addView(view);
        m877c();
    }

    public void setInnerDragDismissBehavior(pbl0 pbl0Var) {
        if (NullChecker.a(pbl0Var)) {
            this.f542b = pbl0Var;
            this.f543c = new rbl0(m875a(), pbl0Var, this.f547g);
        }
    }

    public void setOriginalHeight(float f) {
        this.f546f.m11841y(f);
    }

    public void setOriginalWidth(float f) {
        this.f546f.m11842z(f);
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (NullChecker.a(this.f544d)) {
            this.f544d.mo6530b(getTranslationX(), getTranslationY());
        }
    }

    public void setZoomAnimationKey(String str) {
        this.f545e = str;
    }

    public DragDismissContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f548h = new Point();
        m876b();
    }

    public DragDismissContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f548h = new Point();
        m876b();
    }
}
