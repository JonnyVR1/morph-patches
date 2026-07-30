package com.p046p1.mobile.putong.feed.newui.view.suspenddraggableview;

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
import p147v.VFrame;
import p149l.a3h;
import p149l.b5c0;
import p149l.d30;
import p149l.e30;
import p149l.z2h;

/* JADX INFO: loaded from: classes12.dex */
public class FeedFloatingDraggableContainerView extends VFrame {

    /* JADX INFO: renamed from: a */
    public View f43526a;

    /* JADX INFO: renamed from: b */
    public Point f43527b;

    /* JADX INFO: renamed from: c */
    public Point f43528c;

    /* JADX INFO: renamed from: d */
    public Point f43529d;

    /* JADX INFO: renamed from: e */
    public float f43530e;

    /* JADX INFO: renamed from: f */
    public float f43531f;

    /* JADX INFO: renamed from: g */
    public final int f43532g;

    /* JADX INFO: renamed from: h */
    public InterfaceC11393a f43533h;

    /* JADX INFO: renamed from: i */
    public List<a3h> f43534i;

    /* JADX INFO: renamed from: j */
    public float f43535j;

    /* JADX INFO: renamed from: k */
    public float f43536k;

    /* JADX INFO: renamed from: l */
    public int f43537l;

    /* JADX INFO: renamed from: m */
    public boolean f43538m;

    /* JADX INFO: renamed from: n */
    public d30 f43539n;

    /* JADX INFO: renamed from: o */
    public e30<Point> f43540o;

    /* JADX INFO: renamed from: p */
    public d30 f43541p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.suspenddraggableview.FeedFloatingDraggableContainerView$a */
    public interface InterfaceC11393a {
        /* JADX INFO: renamed from: a */
        Point mo66476a(Point point);
    }

    public FeedFloatingDraggableContainerView(Context context, View view) {
        super(context);
        this.f43527b = new Point(0, 0);
        this.f43530e = -1.0f;
        this.f43531f = -1.0f;
        this.f43532g = b5c0.f73504N1;
        this.f43534i = new ArrayList();
        mo66470p(context, view);
    }

    /* JADX INFO: renamed from: B */
    public void m66464B(Activity activity) {
        View viewFindViewById = activity.getWindow().getDecorView().findViewById(this.f43532g);
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setVisibility(4);
        ((ViewGroup) viewFindViewById.getParent()).removeView(viewFindViewById);
        m66472u();
    }

    /* JADX INFO: renamed from: C */
    public FeedFloatingDraggableContainerView m66465C(InterfaceC11393a interfaceC11393a) {
        this.f43533h = interfaceC11393a;
        return this;
    }

    /* JADX INFO: renamed from: E */
    public FeedFloatingDraggableContainerView m66466E(e30<Point> e30Var) {
        this.f43540o = e30Var;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public FeedFloatingDraggableContainerView m66467F(d30 d30Var) {
        this.f43541p = d30Var;
        return this;
    }

    /* JADX INFO: renamed from: G */
    public void m66468G(Activity activity, Point point) {
        m66474w(point);
        View decorView = activity.getWindow().getDecorView();
        if (NullChecker.m81303a(decorView.findViewById(this.f43532g))) {
            return;
        }
        setId(this.f43532g);
        if (NullChecker.m81303a(getParent())) {
            ((ViewGroup) getParent()).removeView(this);
        }
        if (decorView instanceof FrameLayout) {
            setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            setX(this.f43527b.x);
            setY(this.f43527b.y);
            m66472u();
            ((FrameLayout) decorView).addView(this);
            setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: K */
    public FeedFloatingDraggableContainerView m66469K() {
        this.f43534i.add(new z2h());
        return this;
    }

    @Override // p147v.VFrame, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f43538m = m66475z(motionEvent);
        }
        if (!this.f43538m && NullChecker.m81303a(this.f43539n)) {
            this.f43539n.call();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public View getAttachView() {
        return this.f43526a;
    }

    @Override // p147v.VFrame, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f43538m) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f43535j = motionEvent.getRawX();
            this.f43536k = motionEvent.getRawY();
        } else if (actionMasked == 2 && (Math.abs(motionEvent.getRawX() - this.f43535j) > this.f43537l || Math.abs(motionEvent.getRawY() - this.f43536k) > this.f43537l)) {
            this.f43530e = this.f43535j;
            this.f43531f = this.f43536k;
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f43538m) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f43530e = motionEvent.getRawX();
            this.f43531f = motionEvent.getRawY();
        } else if (actionMasked == 1) {
            this.f43530e = 0.0f;
            this.f43531f = 0.0f;
        } else if (actionMasked == 2) {
            if (NullChecker.m81303a(this.f43541p)) {
                this.f43541p.call();
            }
            this.f43528c.x += (int) (motionEvent.getRawX() - this.f43530e);
            this.f43528c.y += (int) (motionEvent.getRawY() - this.f43531f);
            setX(this.f43528c.x);
            setY(this.f43528c.y);
            this.f43530e = motionEvent.getRawX();
            this.f43531f = motionEvent.getRawY();
        }
        m66473v(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void mo66470p(Context context, View view) {
        this.f43526a = view;
        this.f43537l = ViewConfiguration.get(context).getScaledTouchSlop();
        addView(view, new ViewGroup.LayoutParams(-2, -2));
        this.f43529d = new Point();
    }

    /* JADX INFO: renamed from: s */
    public final Point m66471s(Point point) {
        return NullChecker.m81303a(this.f43533h) ? this.f43533h.mo66476a(point) : point;
    }

    @Override // android.view.View
    public void setX(float f) {
        Point point = this.f43528c;
        point.x = (int) f;
        Point pointM66471s = m66471s(point);
        this.f43526a.setX(pointM66471s.x);
        this.f43529d.x = pointM66471s.x;
        if (NullChecker.m81303a(this.f43540o)) {
            this.f43540o.call(this.f43529d);
        }
    }

    @Override // android.view.View
    public void setY(float f) {
        Point point = this.f43528c;
        point.y = (int) f;
        Point pointM66471s = m66471s(point);
        this.f43526a.setY(pointM66471s.y);
        this.f43529d.y = pointM66471s.y;
        if (NullChecker.m81303a(this.f43540o)) {
            this.f43540o.call(this.f43529d);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m66472u() {
        Point point = new Point();
        this.f43528c = point;
        Point point2 = this.f43527b;
        point.x = point2.x;
        point.y = point2.y;
    }

    /* JADX INFO: renamed from: v */
    public final void m66473v(MotionEvent motionEvent) {
        for (a3h a3hVar : this.f43534i) {
            if (NullChecker.m81303a(a3hVar)) {
                a3hVar.mo94691a(motionEvent, this.f43528c, this);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m66474w(Point point) {
        this.f43527b = point;
        m66472u();
    }

    /* JADX INFO: renamed from: z */
    public final boolean m66475z(MotionEvent motionEvent) {
        if (NullChecker.m81303a(this.f43526a)) {
            int x = (int) this.f43526a.getX();
            int y = (int) this.f43526a.getY();
            int width = this.f43526a.getWidth() + x;
            int height = this.f43526a.getHeight() + y;
            if (motionEvent.getRawX() >= x && motionEvent.getRawX() <= width && motionEvent.getRawY() >= y && motionEvent.getRawY() <= height) {
                return true;
            }
        }
        return false;
    }

    public FeedFloatingDraggableContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43527b = new Point(0, 0);
        this.f43530e = -1.0f;
        this.f43531f = -1.0f;
        this.f43532g = b5c0.f73504N1;
        this.f43534i = new ArrayList();
    }

    public FeedFloatingDraggableContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43527b = new Point(0, 0);
        this.f43530e = -1.0f;
        this.f43531f = -1.0f;
        this.f43532g = b5c0.f73504N1;
        this.f43534i = new ArrayList();
    }
}
