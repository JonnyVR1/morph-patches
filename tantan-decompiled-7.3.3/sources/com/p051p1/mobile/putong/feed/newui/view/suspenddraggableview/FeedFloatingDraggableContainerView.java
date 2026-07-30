package com.p051p1.mobile.putong.feed.newui.view.suspenddraggableview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VFrame;
import p153l.hdc0;
import p153l.o4h;
import p153l.p4h;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedFloatingDraggableContainerView extends VFrame {

    /* JADX INFO: renamed from: a */
    public View f44374a;

    /* JADX INFO: renamed from: b */
    public Point f44375b;

    /* JADX INFO: renamed from: c */
    public Point f44376c;

    /* JADX INFO: renamed from: d */
    public Point f44377d;

    /* JADX INFO: renamed from: e */
    public float f44378e;

    /* JADX INFO: renamed from: f */
    public float f44379f;

    /* JADX INFO: renamed from: g */
    public final int f44380g;

    /* JADX INFO: renamed from: h */
    public InterfaceC11556a f44381h;

    /* JADX INFO: renamed from: i */
    public List<p4h> f44382i;

    /* JADX INFO: renamed from: j */
    public float f44383j;

    /* JADX INFO: renamed from: k */
    public float f44384k;

    /* JADX INFO: renamed from: l */
    public int f44385l;

    /* JADX INFO: renamed from: m */
    public boolean f44386m;

    /* JADX INFO: renamed from: n */
    public x20 f44387n;

    /* JADX INFO: renamed from: o */
    public y20<Point> f44388o;

    /* JADX INFO: renamed from: p */
    public x20 f44389p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.suspenddraggableview.FeedFloatingDraggableContainerView$a */
    public interface InterfaceC11556a {
        /* JADX INFO: renamed from: a */
        Point mo67659a(Point point);
    }

    public FeedFloatingDraggableContainerView(Context context, View view) {
        super(context);
        this.f44375b = new Point(0, 0);
        this.f44378e = -1.0f;
        this.f44379f = -1.0f;
        this.f44380g = hdc0.f108857N1;
        this.f44382i = new ArrayList();
        mo67653p(context, view);
    }

    /* JADX INFO: renamed from: B */
    public void m67647B(Activity activity) {
        View viewFindViewById = activity.getWindow().getDecorView().findViewById(this.f44380g);
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setVisibility(4);
        ((ViewGroup) viewFindViewById.getParent()).removeView(viewFindViewById);
        m67655u();
    }

    /* JADX INFO: renamed from: C */
    public FeedFloatingDraggableContainerView m67648C(InterfaceC11556a interfaceC11556a) {
        this.f44381h = interfaceC11556a;
        return this;
    }

    /* JADX INFO: renamed from: E */
    public FeedFloatingDraggableContainerView m67649E(y20<Point> y20Var) {
        this.f44388o = y20Var;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public FeedFloatingDraggableContainerView m67650F(x20 x20Var) {
        this.f44389p = x20Var;
        return this;
    }

    /* JADX INFO: renamed from: G */
    public void m67651G(Activity activity, Point point) {
        m67657w(point);
        View decorView = activity.getWindow().getDecorView();
        if (NullChecker.m82486a(decorView.findViewById(this.f44380g))) {
            return;
        }
        setId(this.f44380g);
        if (NullChecker.m82486a(getParent())) {
            ((ViewGroup) getParent()).removeView(this);
        }
        if (decorView instanceof FrameLayout) {
            setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            setX(this.f44375b.x);
            setY(this.f44375b.y);
            m67655u();
            ((FrameLayout) decorView).addView(this);
            setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: K */
    public FeedFloatingDraggableContainerView m67652K() {
        this.f44382i.add(new o4h());
        return this;
    }

    @Override // p151v.VFrame, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f44386m = m67658z(motionEvent);
        }
        if (!this.f44386m && NullChecker.m82486a(this.f44387n)) {
            this.f44387n.call();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public View getAttachView() {
        return this.f44374a;
    }

    @Override // p151v.VFrame, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f44386m) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f44383j = motionEvent.getRawX();
            this.f44384k = motionEvent.getRawY();
        } else if (actionMasked == 2 && (Math.abs(motionEvent.getRawX() - this.f44383j) > this.f44385l || Math.abs(motionEvent.getRawY() - this.f44384k) > this.f44385l)) {
            this.f44378e = this.f44383j;
            this.f44379f = this.f44384k;
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f44386m) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f44378e = motionEvent.getRawX();
            this.f44379f = motionEvent.getRawY();
        } else if (actionMasked == 1) {
            this.f44378e = 0.0f;
            this.f44379f = 0.0f;
        } else if (actionMasked == 2) {
            if (NullChecker.m82486a(this.f44389p)) {
                this.f44389p.call();
            }
            this.f44376c.x += (int) (motionEvent.getRawX() - this.f44378e);
            this.f44376c.y += (int) (motionEvent.getRawY() - this.f44379f);
            setX(this.f44376c.x);
            setY(this.f44376c.y);
            this.f44378e = motionEvent.getRawX();
            this.f44379f = motionEvent.getRawY();
        }
        m67656v(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void mo67653p(Context context, View view) {
        this.f44374a = view;
        this.f44385l = ViewConfiguration.get(context).getScaledTouchSlop();
        addView(view, new ViewGroup.LayoutParams(-2, -2));
        this.f44377d = new Point();
    }

    /* JADX INFO: renamed from: s */
    public final Point m67654s(Point point) {
        return NullChecker.m82486a(this.f44381h) ? this.f44381h.mo67659a(point) : point;
    }

    @Override // android.view.View
    public void setX(float f) {
        Point point = this.f44376c;
        point.x = (int) f;
        Point pointM67654s = m67654s(point);
        this.f44374a.setX(pointM67654s.x);
        this.f44377d.x = pointM67654s.x;
        if (NullChecker.m82486a(this.f44388o)) {
            this.f44388o.call(this.f44377d);
        }
    }

    @Override // android.view.View
    public void setY(float f) {
        Point point = this.f44376c;
        point.y = (int) f;
        Point pointM67654s = m67654s(point);
        this.f44374a.setY(pointM67654s.y);
        this.f44377d.y = pointM67654s.y;
        if (NullChecker.m82486a(this.f44388o)) {
            this.f44388o.call(this.f44377d);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m67655u() {
        Point point = new Point();
        this.f44376c = point;
        Point point2 = this.f44375b;
        point.x = point2.x;
        point.y = point2.y;
    }

    /* JADX INFO: renamed from: v */
    public final void m67656v(MotionEvent motionEvent) {
        for (p4h p4hVar : this.f44382i) {
            if (NullChecker.m82486a(p4hVar)) {
                p4hVar.mo166011a(motionEvent, this.f44376c, this);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m67657w(Point point) {
        this.f44375b = point;
        m67655u();
    }

    /* JADX INFO: renamed from: z */
    public final boolean m67658z(MotionEvent motionEvent) {
        if (NullChecker.m82486a(this.f44374a)) {
            int x = (int) this.f44374a.getX();
            int y = (int) this.f44374a.getY();
            int width = this.f44374a.getWidth() + x;
            int height = this.f44374a.getHeight() + y;
            if (motionEvent.getRawX() >= x && motionEvent.getRawX() <= width && motionEvent.getRawY() >= y && motionEvent.getRawY() <= height) {
                return true;
            }
        }
        return false;
    }

    public FeedFloatingDraggableContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44375b = new Point(0, 0);
        this.f44378e = -1.0f;
        this.f44379f = -1.0f;
        this.f44380g = hdc0.f108857N1;
        this.f44382i = new ArrayList();
    }

    public FeedFloatingDraggableContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44375b = new Point(0, 0);
        this.f44378e = -1.0f;
        this.f44379f = -1.0f;
        this.f44380g = hdc0.f108857N1;
        this.f44382i = new ArrayList();
    }
}
