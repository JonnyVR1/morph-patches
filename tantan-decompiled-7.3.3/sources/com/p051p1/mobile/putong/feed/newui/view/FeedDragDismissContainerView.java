package com.p051p1.mobile.putong.feed.newui.view;

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
import p153l.a4h;
import p153l.bnl0;
import p153l.skl0;
import p153l.ukl0;
import p153l.y3h;
import p153l.z3h;

/* JADX INFO: loaded from: classes13.dex */
public class FeedDragDismissContainerView extends FrameLayout implements C22700a.b {

    /* JADX INFO: renamed from: a */
    public View f44214a;

    /* JADX INFO: renamed from: b */
    public skl0 f44215b;

    /* JADX INFO: renamed from: c */
    public ukl0 f44216c;

    /* JADX INFO: renamed from: d */
    public z3h f44217d;

    /* JADX INFO: renamed from: e */
    public String f44218e;

    /* JADX INFO: renamed from: f */
    public C22700a f44219f;

    /* JADX INFO: renamed from: g */
    public boolean f44220g;

    /* JADX INFO: renamed from: h */
    public Point f44221h;

    public FeedDragDismissContainerView(@NonNull Context context, boolean z) {
        super(context);
        this.f44221h = new Point();
        this.f44220g = z;
        m67490b();
    }

    /* JADX INFO: renamed from: a */
    private Act m67489a() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: b */
    private void m67490b() {
        this.f44219f = new C22700a(this);
    }

    /* JADX INFO: renamed from: c */
    private void m67491c() {
        this.f44215b = new skl0(this, getFeedDragDismissListener());
        ukl0 ukl0Var = new ukl0(m67489a(), this.f44215b, this.f44220g);
        this.f44216c = ukl0Var;
        ukl0Var.m196506c(this);
    }

    /* JADX INFO: renamed from: d */
    private void m67492d() {
        if (getChildCount() > 0) {
            this.f44214a = getChildAt(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.f44219f.m224577g(canvas);
        super.dispatchDraw(canvas);
    }

    public z3h getFeedDragDismissListener() {
        if (this.f44217d == null) {
            this.f44217d = new a4h(m67489a());
        }
        return this.f44217d;
    }

    public <T extends View> T getInnerContentView() {
        return (T) this.f44214a;
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: k */
    public String mo45129k() {
        return this.f44218e;
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: l */
    public ValueAnimator mo45130l(ViewGroup viewGroup) {
        return this.f44219f.m224575G(viewGroup);
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: n */
    public ValueAnimator mo45131n(ViewGroup viewGroup) {
        return this.f44219f.m224576H(viewGroup);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67492d();
        m67491c();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f44221h = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        } else if (action == 2) {
            float fMin = Math.min(bnl0.m105592y0(), bnl0.m105588w0()) / 50;
            return Math.abs(((float) this.f44221h.x) - motionEvent.getX()) > fMin || Math.abs(((float) this.f44221h.y) - motionEvent.getY()) > fMin;
        }
        return super.onInterceptHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f44216c.m196504a(motionEvent);
    }

    public void setFeedDragDismissBackListener(y3h y3hVar) {
        if (NullChecker.m82486a(this.f44215b)) {
            this.f44215b.m186534o(y3hVar);
        }
    }

    public void setFeedDragDismissListener(z3h z3hVar) {
        this.f44217d = z3hVar;
    }

    public void setInnerContentView(View view) {
        this.f44214a = view;
        addView(view);
        m67491c();
    }

    public void setInnerDragDismissBehavior(skl0 skl0Var) {
        if (NullChecker.m82486a(skl0Var)) {
            this.f44215b = skl0Var;
            this.f44216c = new ukl0(m67489a(), skl0Var, this.f44220g);
        }
    }

    public void setOriginalHeight(float f) {
        this.f44219f.m224595y(f);
    }

    public void setOriginalWidth(float f) {
        this.f44219f.m224596z(f);
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (NullChecker.m82486a(this.f44217d)) {
            this.f44217d.mo95928b(getTranslationX(), getTranslationY());
        }
    }

    public void setZoomAnimationKey(String str) {
        this.f44218e = str;
    }

    public FeedDragDismissContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44221h = new Point();
        m67490b();
    }

    public FeedDragDismissContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44221h = new Point();
        m67490b();
    }
}
