package com.p046p1.mobile.putong.core.p053ui.mediapreview;

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
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import p147v.C22585a;
import p149l.m9e;
import p149l.n9e;
import p149l.o9e;
import p149l.pbl0;
import p149l.rbl0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class DragDismissContainerView extends FrameLayout implements C22585a.b {

    /* JADX INFO: renamed from: a */
    public View f30650a;

    /* JADX INFO: renamed from: b */
    public pbl0 f30651b;

    /* JADX INFO: renamed from: c */
    public rbl0 f30652c;

    /* JADX INFO: renamed from: d */
    public n9e f30653d;

    /* JADX INFO: renamed from: e */
    public String f30654e;

    /* JADX INFO: renamed from: f */
    public C22585a f30655f;

    /* JADX INFO: renamed from: g */
    public boolean f30656g;

    /* JADX INFO: renamed from: h */
    public Point f30657h;

    public DragDismissContainerView(@NonNull Context context, boolean z) {
        super(context);
        this.f30657h = new Point();
        this.f30656g = z;
        m47810b();
    }

    /* JADX INFO: renamed from: a */
    private Act m47809a() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: b */
    private void m47810b() {
        this.f30655f = new C22585a(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m47811c() {
        this.f30651b = new pbl0(this, getDragDismissListener());
        rbl0 rbl0Var = new rbl0(m47809a(), this.f30651b, this.f30656g);
        this.f30652c = rbl0Var;
        rbl0Var.m178617c(this);
    }

    /* JADX INFO: renamed from: d */
    public final void m47812d() {
        if (getChildCount() > 0) {
            this.f30650a = getChildAt(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.f30655f.m223331g(canvas);
        super.dispatchDraw(canvas);
    }

    public n9e getDragDismissListener() {
        if (this.f30653d == null) {
            this.f30653d = new o9e(m47809a());
        }
        return this.f30653d;
    }

    public <T extends View> T getInnerContentView() {
        return (T) this.f30650a;
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: k */
    public String mo43946k() {
        return this.f30654e;
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: l */
    public ValueAnimator mo43947l(ViewGroup viewGroup) {
        return this.f30655f.m223329G(viewGroup);
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: n */
    public ValueAnimator mo43948n(ViewGroup viewGroup) {
        return this.f30655f.m223330H(viewGroup);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47812d();
        m47811c();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f30657h = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        } else if (action == 2) {
            float fMin = Math.min(xdl0.m208412y0(), xdl0.m208408w0()) / 50;
            return Math.abs(((float) this.f30657h.x) - motionEvent.getX()) > fMin || Math.abs(((float) this.f30657h.y) - motionEvent.getY()) > fMin;
        }
        return super.onInterceptHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f30652c.m178615a(motionEvent);
    }

    public void setDragDismissBackListener(m9e m9eVar) {
        if (NullChecker.m81303a(this.f30651b)) {
            this.f30651b.m168240o(m9eVar);
        }
    }

    public void setFeedDragDismissListener(n9e n9eVar) {
        this.f30653d = n9eVar;
    }

    public void setInnerContentView(View view) {
        this.f30650a = view;
        addView(view);
        m47811c();
    }

    public void setInnerDragDismissBehavior(pbl0 pbl0Var) {
        if (NullChecker.m81303a(pbl0Var)) {
            this.f30651b = pbl0Var;
            this.f30652c = new rbl0(m47809a(), pbl0Var, this.f30656g);
        }
    }

    public void setOriginalHeight(float f) {
        this.f30655f.m223349y(f);
    }

    public void setOriginalWidth(float f) {
        this.f30655f.m223350z(f);
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (NullChecker.m81303a(this.f30653d)) {
            this.f30653d.mo158539b(getTranslationX(), getTranslationY());
        }
    }

    public void setZoomAnimationKey(String str) {
        this.f30654e = str;
    }

    public DragDismissContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30657h = new Point();
        m47810b();
    }

    public DragDismissContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30657h = new Point();
        m47810b();
    }
}
