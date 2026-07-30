package com.p051p1.mobile.putong.core.p058ui.mediapreview;

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
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import p151v.C22700a;
import p153l.bnl0;
import p153l.qae;
import p153l.rae;
import p153l.sae;
import p153l.tkl0;
import p153l.vkl0;

/* JADX INFO: loaded from: classes3.dex */
public class DragDismissContainerView extends FrameLayout implements C22700a.b {

    /* JADX INFO: renamed from: a */
    public View f31498a;

    /* JADX INFO: renamed from: b */
    public tkl0 f31499b;

    /* JADX INFO: renamed from: c */
    public vkl0 f31500c;

    /* JADX INFO: renamed from: d */
    public rae f31501d;

    /* JADX INFO: renamed from: e */
    public String f31502e;

    /* JADX INFO: renamed from: f */
    public C22700a f31503f;

    /* JADX INFO: renamed from: g */
    public boolean f31504g;

    /* JADX INFO: renamed from: h */
    public Point f31505h;

    public DragDismissContainerView(@NonNull Context context, boolean z) {
        super(context);
        this.f31505h = new Point();
        this.f31504g = z;
        m48993b();
    }

    /* JADX INFO: renamed from: a */
    private Act m48992a() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: b */
    private void m48993b() {
        this.f31503f = new C22700a(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m48994c() {
        this.f31499b = new tkl0(this, getDragDismissListener());
        vkl0 vkl0Var = new vkl0(m48992a(), this.f31499b, this.f31504g);
        this.f31500c = vkl0Var;
        vkl0Var.m201572c(this);
    }

    /* JADX INFO: renamed from: d */
    public final void m48995d() {
        if (getChildCount() > 0) {
            this.f31498a = getChildAt(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.f31503f.m224577g(canvas);
        super.dispatchDraw(canvas);
    }

    public rae getDragDismissListener() {
        if (this.f31501d == null) {
            this.f31501d = new sae(m48992a());
        }
        return this.f31501d;
    }

    public <T extends View> T getInnerContentView() {
        return (T) this.f31498a;
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: k */
    public String mo45129k() {
        return this.f31502e;
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: l */
    public ValueAnimator mo45130l(ViewGroup viewGroup) {
        return this.f31503f.m224575G(viewGroup);
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: n */
    public ValueAnimator mo45131n(ViewGroup viewGroup) {
        return this.f31503f.m224576H(viewGroup);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48995d();
        m48994c();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f31505h = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        } else if (action == 2) {
            float fMin = Math.min(bnl0.m105592y0(), bnl0.m105588w0()) / 50;
            return Math.abs(((float) this.f31505h.x) - motionEvent.getX()) > fMin || Math.abs(((float) this.f31505h.y) - motionEvent.getY()) > fMin;
        }
        return super.onInterceptHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f31500c.m201570a(motionEvent);
    }

    public void setDragDismissBackListener(qae qaeVar) {
        if (NullChecker.m82486a(this.f31499b)) {
            this.f31499b.m191579o(qaeVar);
        }
    }

    public void setFeedDragDismissListener(rae raeVar) {
        this.f31501d = raeVar;
    }

    public void setInnerContentView(View view) {
        this.f31498a = view;
        addView(view);
        m48994c();
    }

    public void setInnerDragDismissBehavior(tkl0 tkl0Var) {
        if (NullChecker.m82486a(tkl0Var)) {
            this.f31499b = tkl0Var;
            this.f31500c = new vkl0(m48992a(), tkl0Var, this.f31504g);
        }
    }

    public void setOriginalHeight(float f) {
        this.f31503f.m224595y(f);
    }

    public void setOriginalWidth(float f) {
        this.f31503f.m224596z(f);
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (NullChecker.m82486a(this.f31501d)) {
            this.f31501d.mo173453b(getTranslationX(), getTranslationY());
        }
    }

    public void setZoomAnimationKey(String str) {
        this.f31502e = str;
    }

    public DragDismissContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31505h = new Point();
        m48993b();
    }

    public DragDismissContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31505h = new Point();
        m48993b();
    }
}
