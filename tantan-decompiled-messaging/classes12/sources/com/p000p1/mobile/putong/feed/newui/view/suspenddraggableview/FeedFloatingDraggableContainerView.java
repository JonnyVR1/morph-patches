package com.p000p1.mobile.putong.feed.newui.view.suspenddraggableview;

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
import l.d30;
import l.e30;
import p007l.a3h;
import p007l.b5c0;
import p007l.z2h;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedFloatingDraggableContainerView extends VFrame {

    /* JADX INFO: renamed from: a */
    public View f4987a;

    /* JADX INFO: renamed from: b */
    public Point f4988b;

    /* JADX INFO: renamed from: c */
    public Point f4989c;

    /* JADX INFO: renamed from: d */
    public Point f4990d;

    /* JADX INFO: renamed from: e */
    public float f4991e;

    /* JADX INFO: renamed from: f */
    public float f4992f;

    /* JADX INFO: renamed from: g */
    public final int f4993g;

    /* JADX INFO: renamed from: h */
    public InterfaceC2237a f4994h;

    /* JADX INFO: renamed from: i */
    public List<a3h> f4995i;

    /* JADX INFO: renamed from: j */
    public float f4996j;

    /* JADX INFO: renamed from: k */
    public float f4997k;

    /* JADX INFO: renamed from: l */
    public int f4998l;

    /* JADX INFO: renamed from: m */
    public boolean f4999m;

    /* JADX INFO: renamed from: n */
    public d30 f5000n;

    /* JADX INFO: renamed from: o */
    public e30<Point> f5001o;

    /* JADX INFO: renamed from: p */
    public d30 f5002p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.suspenddraggableview.FeedFloatingDraggableContainerView$a */
    public interface InterfaceC2237a {
        /* JADX INFO: renamed from: a */
        Point mo7643a(Point point);
    }

    public FeedFloatingDraggableContainerView(Context context, View view) {
        super(context);
        this.f4988b = new Point(0, 0);
        this.f4991e = -1.0f;
        this.f4992f = -1.0f;
        this.f4993g = b5c0.f5985N1;
        this.f4995i = new ArrayList();
        mo7637p(context, view);
    }

    /* JADX INFO: renamed from: B */
    public void m7631B(Activity activity) {
        View viewFindViewById = activity.getWindow().getDecorView().findViewById(this.f4993g);
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setVisibility(4);
        ((ViewGroup) viewFindViewById.getParent()).removeView(viewFindViewById);
        m7639u();
    }

    /* JADX INFO: renamed from: C */
    public FeedFloatingDraggableContainerView m7632C(InterfaceC2237a interfaceC2237a) {
        this.f4994h = interfaceC2237a;
        return this;
    }

    /* JADX INFO: renamed from: E */
    public FeedFloatingDraggableContainerView m7633E(e30<Point> e30Var) {
        this.f5001o = e30Var;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public FeedFloatingDraggableContainerView m7634F(d30 d30Var) {
        this.f5002p = d30Var;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public void m7635G(Activity activity, Point point) {
        m7641w(point);
        View decorView = activity.getWindow().getDecorView();
        if (NullChecker.a(decorView.findViewById(this.f4993g))) {
            return;
        }
        setId(this.f4993g);
        if (NullChecker.a(getParent())) {
            ((ViewGroup) getParent()).removeView(this);
        }
        if (decorView instanceof FrameLayout) {
            setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            setX(this.f4988b.x);
            setY(this.f4988b.y);
            m7639u();
            ((FrameLayout) decorView).addView(this);
            setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: K */
    public FeedFloatingDraggableContainerView m7636K() {
        this.f4995i.add(new z2h());
        return this;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f4999m = m7642z(motionEvent);
        }
        if (!this.f4999m && NullChecker.a(this.f5000n)) {
            this.f5000n.call();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public View getAttachView() {
        return this.f4987a;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f4999m) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4996j = motionEvent.getRawX();
            this.f4997k = motionEvent.getRawY();
        } else if (actionMasked == 2 && (Math.abs(motionEvent.getRawX() - this.f4996j) > this.f4998l || Math.abs(motionEvent.getRawY() - this.f4997k) > this.f4998l)) {
            this.f4991e = this.f4996j;
            this.f4992f = this.f4997k;
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f4999m) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4991e = motionEvent.getRawX();
            this.f4992f = motionEvent.getRawY();
        } else if (actionMasked == 1) {
            this.f4991e = 0.0f;
            this.f4992f = 0.0f;
        } else if (actionMasked == 2) {
            if (NullChecker.a(this.f5002p)) {
                this.f5002p.call();
            }
            this.f4989c.x += (int) (motionEvent.getRawX() - this.f4991e);
            this.f4989c.y += (int) (motionEvent.getRawY() - this.f4992f);
            setX(this.f4989c.x);
            setY(this.f4989c.y);
            this.f4991e = motionEvent.getRawX();
            this.f4992f = motionEvent.getRawY();
        }
        m7640v(motionEvent);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public void mo7637p(Context context, View view) {
        this.f4987a = view;
        this.f4998l = ViewConfiguration.get(context).getScaledTouchSlop();
        addView(view, new ViewGroup.LayoutParams(-2, -2));
        this.f4990d = new Point();
    }

    /* JADX INFO: renamed from: s */
    public final Point m7638s(Point point) {
        return NullChecker.a(this.f4994h) ? this.f4994h.mo7643a(point) : point;
    }

    public void setX(float f) {
        Point point = this.f4989c;
        point.x = (int) f;
        Point pointM7638s = m7638s(point);
        this.f4987a.setX(pointM7638s.x);
        this.f4990d.x = pointM7638s.x;
        if (NullChecker.a(this.f5001o)) {
            this.f5001o.call(this.f4990d);
        }
    }

    public void setY(float f) {
        Point point = this.f4989c;
        point.y = (int) f;
        Point pointM7638s = m7638s(point);
        this.f4987a.setY(pointM7638s.y);
        this.f4990d.y = pointM7638s.y;
        if (NullChecker.a(this.f5001o)) {
            this.f5001o.call(this.f4990d);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m7639u() {
        Point point = new Point();
        this.f4989c = point;
        Point point2 = this.f4988b;
        point.x = point2.x;
        point.y = point2.y;
    }

    /* JADX INFO: renamed from: v */
    public final void m7640v(MotionEvent motionEvent) {
        for (a3h a3hVar : this.f4995i) {
            if (NullChecker.a(a3hVar)) {
                a3hVar.mo8400a(motionEvent, this.f4989c, this);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m7641w(Point point) {
        this.f4988b = point;
        m7639u();
    }

    /* JADX INFO: renamed from: z */
    public final boolean m7642z(MotionEvent motionEvent) {
        if (NullChecker.a(this.f4987a)) {
            int x = (int) this.f4987a.getX();
            int y = (int) this.f4987a.getY();
            int width = this.f4987a.getWidth() + x;
            int height = this.f4987a.getHeight() + y;
            if (motionEvent.getRawX() >= x && motionEvent.getRawX() <= width && motionEvent.getRawY() >= y && motionEvent.getRawY() <= height) {
                return true;
            }
        }
        return false;
    }

    public FeedFloatingDraggableContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4988b = new Point(0, 0);
        this.f4991e = -1.0f;
        this.f4992f = -1.0f;
        this.f4993g = b5c0.f5985N1;
        this.f4995i = new ArrayList();
    }

    public FeedFloatingDraggableContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4988b = new Point(0, 0);
        this.f4991e = -1.0f;
        this.f4992f = -1.0f;
        this.f4993g = b5c0.f5985N1;
        this.f4995i = new ArrayList();
    }
}
