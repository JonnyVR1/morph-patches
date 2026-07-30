package com.p046p1.mobile.putong.feed.newui.view;

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
import p149l.j2h;
import p149l.k2h;
import p149l.l2h;
import p149l.obl0;
import p149l.qbl0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedDragDismissContainerView extends FrameLayout implements C22585a.b {

    /* JADX INFO: renamed from: a */
    public View f43366a;

    /* JADX INFO: renamed from: b */
    public obl0 f43367b;

    /* JADX INFO: renamed from: c */
    public qbl0 f43368c;

    /* JADX INFO: renamed from: d */
    public k2h f43369d;

    /* JADX INFO: renamed from: e */
    public String f43370e;

    /* JADX INFO: renamed from: f */
    public C22585a f43371f;

    /* JADX INFO: renamed from: g */
    public boolean f43372g;

    /* JADX INFO: renamed from: h */
    public Point f43373h;

    public FeedDragDismissContainerView(@NonNull Context context, boolean z) {
        super(context);
        this.f43373h = new Point();
        this.f43372g = z;
        m66307b();
    }

    /* JADX INFO: renamed from: a */
    private Act m66306a() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: b */
    private void m66307b() {
        this.f43371f = new C22585a(this);
    }

    /* JADX INFO: renamed from: c */
    private void m66308c() {
        this.f43367b = new obl0(this, getFeedDragDismissListener());
        qbl0 qbl0Var = new qbl0(m66306a(), this.f43367b, this.f43372g);
        this.f43368c = qbl0Var;
        qbl0Var.m173834c(this);
    }

    /* JADX INFO: renamed from: d */
    private void m66309d() {
        if (getChildCount() > 0) {
            this.f43366a = getChildAt(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.f43371f.m223331g(canvas);
        super.dispatchDraw(canvas);
    }

    public k2h getFeedDragDismissListener() {
        if (this.f43369d == null) {
            this.f43369d = new l2h(m66306a());
        }
        return this.f43369d;
    }

    public <T extends View> T getInnerContentView() {
        return (T) this.f43366a;
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: k */
    public String mo43946k() {
        return this.f43370e;
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: l */
    public ValueAnimator mo43947l(ViewGroup viewGroup) {
        return this.f43371f.m223329G(viewGroup);
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: n */
    public ValueAnimator mo43948n(ViewGroup viewGroup) {
        return this.f43371f.m223330H(viewGroup);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66309d();
        m66308c();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f43373h = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        } else if (action == 2) {
            float fMin = Math.min(xdl0.m208412y0(), xdl0.m208408w0()) / 50;
            return Math.abs(((float) this.f43373h.x) - motionEvent.getX()) > fMin || Math.abs(((float) this.f43373h.y) - motionEvent.getY()) > fMin;
        }
        return super.onInterceptHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f43368c.m173832a(motionEvent);
    }

    public void setFeedDragDismissBackListener(j2h j2hVar) {
        if (NullChecker.m81303a(this.f43367b)) {
            this.f43367b.m163460o(j2hVar);
        }
    }

    public void setFeedDragDismissListener(k2h k2hVar) {
        this.f43369d = k2hVar;
    }

    public void setInnerContentView(View view) {
        this.f43366a = view;
        addView(view);
        m66308c();
    }

    public void setInnerDragDismissBehavior(obl0 obl0Var) {
        if (NullChecker.m81303a(obl0Var)) {
            this.f43367b = obl0Var;
            this.f43368c = new qbl0(m66306a(), obl0Var, this.f43372g);
        }
    }

    public void setOriginalHeight(float f) {
        this.f43371f.m223349y(f);
    }

    public void setOriginalWidth(float f) {
        this.f43371f.m223350z(f);
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (NullChecker.m81303a(this.f43369d)) {
            this.f43369d.mo144303b(getTranslationX(), getTranslationY());
        }
    }

    public void setZoomAnimationKey(String str) {
        this.f43370e = str;
    }

    public FeedDragDismissContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43373h = new Point();
        m66307b();
    }

    public FeedDragDismissContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43373h = new Point();
        m66307b();
    }
}
