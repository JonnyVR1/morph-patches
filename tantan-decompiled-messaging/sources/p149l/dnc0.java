package p149l;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public class dnc0 implements cnc0, ft6, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public View f87046a;

    /* JADX INFO: renamed from: b */
    public View f87047b;

    /* JADX INFO: renamed from: c */
    public View f87048c;

    /* JADX INFO: renamed from: d */
    public View f87049d;

    /* JADX INFO: renamed from: e */
    public View f87050e;

    /* JADX INFO: renamed from: f */
    public int f87051f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f87052g = true;

    /* JADX INFO: renamed from: h */
    public boolean f87053h = true;

    /* JADX INFO: renamed from: i */
    public kgf0 f87054i = new kgf0();

    public dnc0(@NonNull View view) {
        this.f87048c = view;
        this.f87047b = view;
        this.f87046a = view;
    }

    @Override // p149l.cnc0
    /* JADX INFO: renamed from: a */
    public void mo107749a(MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        pointF.offset(-this.f87046a.getLeft(), -this.f87046a.getTop());
        View view = this.f87048c;
        View view2 = this.f87046a;
        if (view != view2) {
            this.f87048c = m112615m(view2, pointF, view);
        }
        View view3 = this.f87048c;
        View view4 = this.f87046a;
        kgf0 kgf0Var = this.f87054i;
        if (view3 == view4) {
            kgf0Var.f123030a = null;
        } else {
            kgf0Var.f123030a = pointF;
        }
    }

    @Override // p149l.cnc0
    /* JADX INFO: renamed from: b */
    public void mo107750b(boolean z) {
        this.f87054i.f123032c = z;
    }

    @Override // p149l.cnc0
    /* JADX INFO: renamed from: c */
    public ValueAnimator.AnimatorUpdateListener mo107751c(int i) {
        View view = this.f87048c;
        if (view == null || i == 0) {
            return null;
        }
        if ((i >= 0 || !view.canScrollVertically(1)) && (i <= 0 || !this.f87048c.canScrollVertically(-1))) {
            return null;
        }
        this.f87051f = i;
        return this;
    }

    @Override // p149l.cnc0
    /* JADX INFO: renamed from: d */
    public void mo107752d(gnc0 gnc0Var, View view, View view2) {
        m112614l(this.f87046a, gnc0Var);
        if (view == null && view2 == null) {
            return;
        }
        this.f87049d = view;
        this.f87050e = view2;
        FrameLayout frameLayout = new FrameLayout(this.f87046a.getContext());
        int iIndexOfChild = gnc0Var.mo127123c().getLayout().indexOfChild(this.f87046a);
        gnc0Var.mo127123c().getLayout().removeView(this.f87046a);
        frameLayout.addView(this.f87046a, 0, new ViewGroup.LayoutParams(-1, -1));
        gnc0Var.mo127123c().getLayout().addView(frameLayout, iIndexOfChild, this.f87046a.getLayoutParams());
        this.f87046a = frameLayout;
        if (view != null) {
            view.setTag(p4c0.f147074J0, "fixed-top");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            int iIndexOfChild2 = viewGroup.indexOfChild(view);
            viewGroup.removeView(view);
            layoutParams.height = ikf0.m136794h(view);
            viewGroup.addView(new Space(this.f87046a.getContext()), iIndexOfChild2, layoutParams);
            frameLayout.addView(view, 1, layoutParams);
        }
        if (view2 != null) {
            view2.setTag(p4c0.f147074J0, "fixed-bottom");
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            ViewGroup viewGroup2 = (ViewGroup) view2.getParent();
            int iIndexOfChild3 = viewGroup2.indexOfChild(view2);
            viewGroup2.removeView(view2);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(layoutParams2);
            layoutParams2.height = ikf0.m136794h(view2);
            viewGroup2.addView(new Space(this.f87046a.getContext()), iIndexOfChild3, layoutParams2);
            layoutParams3.gravity = 80;
            frameLayout.addView(view2, 1, layoutParams3);
        }
    }

    @Override // p149l.cnc0
    /* JADX INFO: renamed from: e */
    public void mo107753e(int i, int i2, int i3) {
        boolean z;
        View viewFindViewById;
        View viewFindViewById2;
        boolean z2 = true;
        if (i2 == -1 || (viewFindViewById2 = this.f87047b.findViewById(i2)) == null) {
            z = false;
        } else if (i > 0) {
            viewFindViewById2.setTranslationY(i);
            z = true;
        } else {
            if (viewFindViewById2.getTranslationY() > 0.0f) {
                viewFindViewById2.setTranslationY(0.0f);
            }
            z = false;
        }
        if (i3 == -1 || (viewFindViewById = this.f87047b.findViewById(i3)) == null) {
            z2 = z;
        } else if (i < 0) {
            viewFindViewById.setTranslationY(i);
        } else {
            if (viewFindViewById.getTranslationY() < 0.0f) {
                viewFindViewById.setTranslationY(0.0f);
            }
            z2 = z;
        }
        View view = this.f87047b;
        if (z2) {
            view.setTranslationY(0.0f);
        } else {
            view.setTranslationY(i);
        }
        View view2 = this.f87049d;
        if (view2 != null) {
            view2.setTranslationY(Math.max(0, i));
        }
        View view3 = this.f87050e;
        if (view3 != null) {
            view3.setTranslationY(Math.min(0, i));
        }
    }

    @Override // p149l.cnc0
    /* JADX INFO: renamed from: f */
    public void mo107754f(s5e0 s5e0Var) {
        if (s5e0Var instanceof kgf0) {
            this.f87054i = (kgf0) s5e0Var;
        } else {
            this.f87054i.f123031b = s5e0Var;
        }
    }

    @Override // p149l.cnc0
    /* JADX INFO: renamed from: g */
    public boolean mo107755g() {
        return this.f87053h && this.f87054i.mo145888a(this.f87046a);
    }

    @Override // p149l.cnc0
    @NonNull
    public View getView() {
        return this.f87046a;
    }

    @Override // p149l.cnc0
    @NonNull
    /* JADX INFO: renamed from: h */
    public View mo107756h() {
        return this.f87048c;
    }

    @Override // p149l.cnc0
    /* JADX INFO: renamed from: i */
    public void mo107757i() {
        View view = this.f87048c;
        if (view instanceof ScrollView) {
            ((ScrollView) view).scrollTo(0, 0);
            return;
        }
        if (view instanceof AbsListView) {
            ((AbsListView) view).setSelection(0);
            return;
        }
        if (view instanceof WebView) {
            ((WebView) view).scrollTo(0, 0);
        } else if (view instanceof NestedScrollView) {
            ((NestedScrollView) view).scrollTo(0, 0);
        } else if (view instanceof RecyclerView) {
            ((RecyclerView) view).scrollToPosition(0);
        }
    }

    @Override // p149l.cnc0
    /* JADX INFO: renamed from: j */
    public boolean mo107758j() {
        return this.f87052g && this.f87054i.mo145889b(this.f87046a);
    }

    @Override // p149l.ft6
    /* JADX INFO: renamed from: k */
    public void mo112613k(boolean z, boolean z2) {
        this.f87052g = z;
        this.f87053h = z2;
    }

    /* JADX INFO: renamed from: l */
    public void m112614l(View view, gnc0 gnc0Var) {
        boolean zIsInEditMode = this.f87046a.isInEditMode();
        View view2 = null;
        while (true) {
            if (view2 != null && (!(view2 instanceof w920) || (view2 instanceof s920))) {
                break;
            }
            view = m112616n(view, view2 == null);
            if (view == view2) {
                break;
            }
            if (!zIsInEditMode) {
                rwd.m181388a(view, gnc0Var, this);
            }
            view2 = view;
        }
        if (view2 != null) {
            this.f87048c = view2;
        }
    }

    /* JADX INFO: renamed from: m */
    public View m112615m(View view, PointF pointF, View view2) {
        if ((view instanceof ViewGroup) && pointF != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (ikf0.m136793g(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if (!(childAt instanceof ViewPager) && ikf0.m136791e(childAt)) {
                        return childAt;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    View viewM112615m = m112615m(childAt, pointF, view2);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return viewM112615m;
                }
            }
        }
        return view2;
    }

    /* JADX INFO: renamed from: n */
    public View m112616n(View view, boolean z) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        View view2 = null;
        while (linkedList.size() > 0 && view2 == null) {
            View view3 = (View) linkedList.poll();
            if (view3 != null) {
                if ((z || view3 != view) && ikf0.m136791e(view3)) {
                    view2 = view3;
                } else if (view3 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view3;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        linkedList.add(viewGroup.getChildAt(i));
                    }
                }
            }
        }
        return view2 == null ? view : view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        try {
            float scaleY = (iIntValue - this.f87051f) * this.f87048c.getScaleY();
            View view = this.f87048c;
            if (view instanceof AbsListView) {
                ikf0.m136796j((AbsListView) view, (int) scaleY);
            } else {
                view.scrollBy(0, (int) scaleY);
            }
        } catch (Throwable unused) {
        }
        this.f87051f = iIntValue;
    }
}
