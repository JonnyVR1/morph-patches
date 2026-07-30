package com.p000p1.mobile.putong.feed.newui.view;

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
import p007l.j2h;
import p007l.k2h;
import p007l.l2h;
import p007l.obl0;
import p007l.qbl0;
import v.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedDragDismissContainerView extends FrameLayout implements a.b {

    /* JADX INFO: renamed from: a */
    public View f4827a;

    /* JADX INFO: renamed from: b */
    public obl0 f4828b;

    /* JADX INFO: renamed from: c */
    public qbl0 f4829c;

    /* JADX INFO: renamed from: d */
    public k2h f4830d;

    /* JADX INFO: renamed from: e */
    public String f4831e;

    /* JADX INFO: renamed from: f */
    public a f4832f;

    /* JADX INFO: renamed from: g */
    public boolean f4833g;

    /* JADX INFO: renamed from: h */
    public Point f4834h;

    public FeedDragDismissContainerView(@NonNull Context context, boolean z) {
        super(context);
        this.f4834h = new Point();
        this.f4833g = z;
        m7469b();
    }

    /* JADX INFO: renamed from: a */
    private Act m7468a() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    private void m7469b() {
        this.f4832f = new a(this);
    }

    /* JADX INFO: renamed from: c */
    private void m7470c() {
        this.f4828b = new obl0(this, getFeedDragDismissListener());
        qbl0 qbl0Var = new qbl0(m7468a(), this.f4828b, this.f4833g);
        this.f4829c = qbl0Var;
        qbl0Var.m13503c(this);
    }

    /* JADX INFO: renamed from: d */
    private void m7471d() {
        if (getChildCount() > 0) {
            this.f4827a = getChildAt(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.f4832f.g(canvas);
        super.dispatchDraw(canvas);
    }

    public k2h getFeedDragDismissListener() {
        if (this.f4830d == null) {
            this.f4830d = new l2h(m7468a());
        }
        return this.f4830d;
    }

    public <T extends View> T getInnerContentView() {
        return (T) this.f4827a;
    }

    /* JADX INFO: renamed from: k */
    public String m7472k() {
        return this.f4831e;
    }

    /* JADX INFO: renamed from: l */
    public ValueAnimator m7473l(ViewGroup viewGroup) {
        return this.f4832f.G(viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public ValueAnimator m7474n(ViewGroup viewGroup) {
        return this.f4832f.H(viewGroup);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7471d();
        m7470c();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f4834h = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        } else if (action == 2) {
            float fMin = Math.min(xdl0.y0(), xdl0.w0()) / 50;
            return Math.abs(((float) this.f4834h.x) - motionEvent.getX()) > fMin || Math.abs(((float) this.f4834h.y) - motionEvent.getY()) > fMin;
        }
        return super.onInterceptHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f4829c.m13501a(motionEvent);
    }

    public void setFeedDragDismissBackListener(j2h j2hVar) {
        if (NullChecker.a(this.f4828b)) {
            this.f4828b.m12526o(j2hVar);
        }
    }

    public void setFeedDragDismissListener(k2h k2hVar) {
        this.f4830d = k2hVar;
    }

    public void setInnerContentView(View view) {
        this.f4827a = view;
        addView(view);
        m7470c();
    }

    public void setInnerDragDismissBehavior(obl0 obl0Var) {
        if (NullChecker.a(obl0Var)) {
            this.f4828b = obl0Var;
            this.f4829c = new qbl0(m7468a(), obl0Var, this.f4833g);
        }
    }

    public void setOriginalHeight(float f) {
        this.f4832f.y(f);
    }

    public void setOriginalWidth(float f) {
        this.f4832f.z(f);
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (NullChecker.a(this.f4830d)) {
            this.f4830d.mo11386b(getTranslationX(), getTranslationY());
        }
    }

    public void setZoomAnimationKey(String str) {
        this.f4831e = str;
    }

    public FeedDragDismissContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4834h = new Point();
        m7469b();
    }

    public FeedDragDismissContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4834h = new Point();
        m7469b();
    }
}
