package p003l;

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
import l.p4c0;
import l.s920;
import l.w920;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class dnc0 implements cnc0, ft6, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public View f3037a;

    /* JADX INFO: renamed from: b */
    public View f3038b;

    /* JADX INFO: renamed from: c */
    public View f3039c;

    /* JADX INFO: renamed from: d */
    public View f3040d;

    /* JADX INFO: renamed from: e */
    public View f3041e;

    /* JADX INFO: renamed from: f */
    public int f3042f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f3043g = true;

    /* JADX INFO: renamed from: h */
    public boolean f3044h = true;

    /* JADX INFO: renamed from: i */
    public kgf0 f3045i = new kgf0();

    public dnc0(@NonNull View view) {
        this.f3039c = view;
        this.f3038b = view;
        this.f3037a = view;
    }

    @Override // p003l.cnc0
    /* JADX INFO: renamed from: a */
    public void mo3397a(MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        pointF.offset(-this.f3037a.getLeft(), -this.f3037a.getTop());
        View view = this.f3039c;
        View view2 = this.f3037a;
        if (view != view2) {
            this.f3039c = m3625m(view2, pointF, view);
        }
        View view3 = this.f3039c;
        View view4 = this.f3037a;
        kgf0 kgf0Var = this.f3045i;
        if (view3 == view4) {
            kgf0Var.f4925a = null;
        } else {
            kgf0Var.f4925a = pointF;
        }
    }

    @Override // p003l.cnc0
    /* JADX INFO: renamed from: b */
    public void mo3398b(boolean z) {
        this.f3045i.f4927c = z;
    }

    @Override // p003l.cnc0
    /* JADX INFO: renamed from: c */
    public ValueAnimator.AnimatorUpdateListener mo3399c(int i) {
        View view = this.f3039c;
        if (view == null || i == 0) {
            return null;
        }
        if ((i >= 0 || !view.canScrollVertically(1)) && (i <= 0 || !this.f3039c.canScrollVertically(-1))) {
            return null;
        }
        this.f3042f = i;
        return this;
    }

    @Override // p003l.cnc0
    /* JADX INFO: renamed from: d */
    public void mo3400d(gnc0 gnc0Var, View view, View view2) {
        m3624l(this.f3037a, gnc0Var);
        if (view == null && view2 == null) {
            return;
        }
        this.f3040d = view;
        this.f3041e = view2;
        FrameLayout frameLayout = new FrameLayout(this.f3037a.getContext());
        int iIndexOfChild = gnc0Var.mo4652c().getLayout().indexOfChild(this.f3037a);
        gnc0Var.mo4652c().getLayout().removeView(this.f3037a);
        frameLayout.addView(this.f3037a, 0, new ViewGroup.LayoutParams(-1, -1));
        gnc0Var.mo4652c().getLayout().addView(frameLayout, iIndexOfChild, this.f3037a.getLayoutParams());
        this.f3037a = frameLayout;
        if (view != null) {
            view.setTag(p4c0.J0, "fixed-top");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            int iIndexOfChild2 = viewGroup.indexOfChild(view);
            viewGroup.removeView(view);
            layoutParams.height = ikf0.m5151h(view);
            viewGroup.addView(new Space(this.f3037a.getContext()), iIndexOfChild2, layoutParams);
            frameLayout.addView(view, 1, layoutParams);
        }
        if (view2 != null) {
            view2.setTag(p4c0.J0, "fixed-bottom");
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            ViewGroup viewGroup2 = (ViewGroup) view2.getParent();
            int iIndexOfChild3 = viewGroup2.indexOfChild(view2);
            viewGroup2.removeView(view2);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(layoutParams2);
            layoutParams2.height = ikf0.m5151h(view2);
            viewGroup2.addView(new Space(this.f3037a.getContext()), iIndexOfChild3, layoutParams2);
            layoutParams3.gravity = 80;
            frameLayout.addView(view2, 1, layoutParams3);
        }
    }

    @Override // p003l.cnc0
    /* JADX INFO: renamed from: e */
    public void mo3401e(int i, int i2, int i3) {
        boolean z;
        View viewFindViewById;
        View viewFindViewById2;
        boolean z2 = true;
        if (i2 == -1 || (viewFindViewById2 = this.f3038b.findViewById(i2)) == null) {
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
        if (i3 == -1 || (viewFindViewById = this.f3038b.findViewById(i3)) == null) {
            z2 = z;
        } else if (i < 0) {
            viewFindViewById.setTranslationY(i);
        } else {
            if (viewFindViewById.getTranslationY() < 0.0f) {
                viewFindViewById.setTranslationY(0.0f);
            }
            z2 = z;
        }
        View view = this.f3038b;
        if (z2) {
            view.setTranslationY(0.0f);
        } else {
            view.setTranslationY(i);
        }
        View view2 = this.f3040d;
        if (view2 != null) {
            view2.setTranslationY(Math.max(0, i));
        }
        View view3 = this.f3041e;
        if (view3 != null) {
            view3.setTranslationY(Math.min(0, i));
        }
    }

    @Override // p003l.cnc0
    /* JADX INFO: renamed from: f */
    public void mo3402f(s5e0 s5e0Var) {
        if (s5e0Var instanceof kgf0) {
            this.f3045i = (kgf0) s5e0Var;
        } else {
            this.f3045i.f4926b = s5e0Var;
        }
    }

    @Override // p003l.cnc0
    /* JADX INFO: renamed from: g */
    public boolean mo3403g() {
        return this.f3044h && this.f3045i.mo5652a(this.f3037a);
    }

    @Override // p003l.cnc0
    @NonNull
    public View getView() {
        return this.f3037a;
    }

    @Override // p003l.cnc0
    @NonNull
    /* JADX INFO: renamed from: h */
    public View mo3404h() {
        return this.f3039c;
    }

    @Override // p003l.cnc0
    /* JADX INFO: renamed from: i */
    public void mo3405i() {
        NestedScrollView nestedScrollView = this.f3039c;
        if (nestedScrollView instanceof ScrollView) {
            ((ScrollView) nestedScrollView).scrollTo(0, 0);
            return;
        }
        if (nestedScrollView instanceof AbsListView) {
            ((AbsListView) nestedScrollView).setSelection(0);
            return;
        }
        if (nestedScrollView instanceof WebView) {
            ((WebView) nestedScrollView).scrollTo(0, 0);
        } else if (nestedScrollView instanceof NestedScrollView) {
            nestedScrollView.scrollTo(0, 0);
        } else if (nestedScrollView instanceof RecyclerView) {
            ((RecyclerView) nestedScrollView).scrollToPosition(0);
        }
    }

    @Override // p003l.cnc0
    /* JADX INFO: renamed from: j */
    public boolean mo3406j() {
        return this.f3043g && this.f3045i.mo5653b(this.f3037a);
    }

    @Override // p003l.ft6
    /* JADX INFO: renamed from: k */
    public void mo3623k(boolean z, boolean z2) {
        this.f3043g = z;
        this.f3044h = z2;
    }

    /* JADX INFO: renamed from: l */
    public void m3624l(View view, gnc0 gnc0Var) {
        boolean zIsInEditMode = this.f3037a.isInEditMode();
        View view2 = null;
        while (true) {
            if (view2 != null && (!(view2 instanceof w920) || (view2 instanceof s920))) {
                break;
            }
            view = m3626n(view, view2 == null);
            if (view == view2) {
                break;
            }
            if (!zIsInEditMode) {
                rwd.m7404a(view, gnc0Var, this);
            }
            view2 = view;
        }
        if (view2 != null) {
            this.f3039c = view2;
        }
    }

    /* JADX INFO: renamed from: m */
    public View m3625m(View view, PointF pointF, View view2) {
        if ((view instanceof ViewGroup) && pointF != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (ikf0.m5150g(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if (!(childAt instanceof ViewPager) && ikf0.m5148e(childAt)) {
                        return childAt;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    View viewM3625m = m3625m(childAt, pointF, view2);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return viewM3625m;
                }
            }
        }
        return view2;
    }

    /* JADX INFO: renamed from: n */
    public View m3626n(View view, boolean z) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        View view2 = null;
        while (linkedList.size() > 0 && view2 == null) {
            View view3 = (View) linkedList.poll();
            if (view3 != null) {
                if ((z || view3 != view) && ikf0.m5148e(view3)) {
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
            float scaleY = (iIntValue - this.f3042f) * this.f3039c.getScaleY();
            View view = this.f3039c;
            if (view instanceof AbsListView) {
                ikf0.m5153j((AbsListView) view, (int) scaleY);
            } else {
                view.scrollBy(0, (int) scaleY);
            }
        } catch (Throwable unused) {
        }
        this.f3042f = iIntValue;
    }
}
