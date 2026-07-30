package p153l;

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
public class ivc0 implements hvc0, iu6, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public View f117040a;

    /* JADX INFO: renamed from: b */
    public View f117041b;

    /* JADX INFO: renamed from: c */
    public View f117042c;

    /* JADX INFO: renamed from: d */
    public View f117043d;

    /* JADX INFO: renamed from: e */
    public View f117044e;

    /* JADX INFO: renamed from: f */
    public int f117045f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f117046g = true;

    /* JADX INFO: renamed from: h */
    public boolean f117047h = true;

    /* JADX INFO: renamed from: i */
    public rof0 f117048i = new rof0();

    public ivc0(@NonNull View view) {
        this.f117042c = view;
        this.f117041b = view;
        this.f117040a = view;
    }

    @Override // p153l.hvc0
    /* JADX INFO: renamed from: a */
    public void mo137310a(MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        pointF.offset(-this.f117040a.getLeft(), -this.f117040a.getTop());
        View view = this.f117042c;
        View view2 = this.f117040a;
        if (view != view2) {
            this.f117042c = m142285m(view2, pointF, view);
        }
        View view3 = this.f117042c;
        View view4 = this.f117040a;
        rof0 rof0Var = this.f117048i;
        if (view3 == view4) {
            rof0Var.f164191a = null;
        } else {
            rof0Var.f164191a = pointF;
        }
    }

    @Override // p153l.hvc0
    /* JADX INFO: renamed from: b */
    public void mo137311b(boolean z) {
        this.f117048i.f164193c = z;
    }

    @Override // p153l.hvc0
    /* JADX INFO: renamed from: c */
    public ValueAnimator.AnimatorUpdateListener mo137312c(int i) {
        View view = this.f117042c;
        if (view == null || i == 0) {
            return null;
        }
        if ((i >= 0 || !view.canScrollVertically(1)) && (i <= 0 || !this.f117042c.canScrollVertically(-1))) {
            return null;
        }
        this.f117045f = i;
        return this;
    }

    @Override // p153l.hvc0
    /* JADX INFO: renamed from: d */
    public void mo137313d(lvc0 lvc0Var, View view, View view2) {
        m142284l(this.f117040a, lvc0Var);
        if (view == null && view2 == null) {
            return;
        }
        this.f117043d = view;
        this.f117044e = view2;
        FrameLayout frameLayout = new FrameLayout(this.f117040a.getContext());
        int iIndexOfChild = lvc0Var.mo155985c().getLayout().indexOfChild(this.f117040a);
        lvc0Var.mo155985c().getLayout().removeView(this.f117040a);
        frameLayout.addView(this.f117040a, 0, new ViewGroup.LayoutParams(-1, -1));
        lvc0Var.mo155985c().getLayout().addView(frameLayout, iIndexOfChild, this.f117040a.getLayoutParams());
        this.f117040a = frameLayout;
        if (view != null) {
            view.setTag(vcc0.f183374J0, "fixed-top");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            int iIndexOfChild2 = viewGroup.indexOfChild(view);
            viewGroup.removeView(view);
            layoutParams.height = rsf0.m182964h(view);
            viewGroup.addView(new Space(this.f117040a.getContext()), iIndexOfChild2, layoutParams);
            frameLayout.addView(view, 1, layoutParams);
        }
        if (view2 != null) {
            view2.setTag(vcc0.f183374J0, "fixed-bottom");
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            ViewGroup viewGroup2 = (ViewGroup) view2.getParent();
            int iIndexOfChild3 = viewGroup2.indexOfChild(view2);
            viewGroup2.removeView(view2);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(layoutParams2);
            layoutParams2.height = rsf0.m182964h(view2);
            viewGroup2.addView(new Space(this.f117040a.getContext()), iIndexOfChild3, layoutParams2);
            layoutParams3.gravity = 80;
            frameLayout.addView(view2, 1, layoutParams3);
        }
    }

    @Override // p153l.hvc0
    /* JADX INFO: renamed from: e */
    public void mo137314e(int i, int i2, int i3) {
        boolean z;
        View viewFindViewById;
        View viewFindViewById2;
        boolean z2 = true;
        if (i2 == -1 || (viewFindViewById2 = this.f117041b.findViewById(i2)) == null) {
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
        if (i3 == -1 || (viewFindViewById = this.f117041b.findViewById(i3)) == null) {
            z2 = z;
        } else if (i < 0) {
            viewFindViewById.setTranslationY(i);
        } else {
            if (viewFindViewById.getTranslationY() < 0.0f) {
                viewFindViewById.setTranslationY(0.0f);
            }
            z2 = z;
        }
        View view = this.f117041b;
        if (z2) {
            view.setTranslationY(0.0f);
        } else {
            view.setTranslationY(i);
        }
        View view2 = this.f117043d;
        if (view2 != null) {
            view2.setTranslationY(Math.max(0, i));
        }
        View view3 = this.f117044e;
        if (view3 != null) {
            view3.setTranslationY(Math.min(0, i));
        }
    }

    @Override // p153l.hvc0
    /* JADX INFO: renamed from: f */
    public void mo137315f(xde0 xde0Var) {
        if (xde0Var instanceof rof0) {
            this.f117048i = (rof0) xde0Var;
        } else {
            this.f117048i.f164192b = xde0Var;
        }
    }

    @Override // p153l.hvc0
    /* JADX INFO: renamed from: g */
    public boolean mo137316g() {
        return this.f117047h && this.f117048i.mo182408a(this.f117040a);
    }

    @Override // p153l.hvc0
    @NonNull
    public View getView() {
        return this.f117040a;
    }

    @Override // p153l.hvc0
    @NonNull
    /* JADX INFO: renamed from: h */
    public View mo137317h() {
        return this.f117042c;
    }

    @Override // p153l.hvc0
    /* JADX INFO: renamed from: i */
    public void mo137318i() {
        View view = this.f117042c;
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

    @Override // p153l.hvc0
    /* JADX INFO: renamed from: j */
    public boolean mo137319j() {
        return this.f117046g && this.f117048i.mo182409b(this.f117040a);
    }

    @Override // p153l.iu6
    /* JADX INFO: renamed from: k */
    public void mo142177k(boolean z, boolean z2) {
        this.f117046g = z;
        this.f117047h = z2;
    }

    /* JADX INFO: renamed from: l */
    public void m142284l(View view, lvc0 lvc0Var) {
        boolean zIsInEditMode = this.f117040a.isInEditMode();
        View view2 = null;
        while (true) {
            if (view2 != null && (!(view2 instanceof ei20) || (view2 instanceof ai20))) {
                break;
            }
            view = m142286n(view, view2 == null);
            if (view == view2) {
                break;
            }
            if (!zIsInEditMode) {
                fyd.m128079a(view, lvc0Var, this);
            }
            view2 = view;
        }
        if (view2 != null) {
            this.f117042c = view2;
        }
    }

    /* JADX INFO: renamed from: m */
    public View m142285m(View view, PointF pointF, View view2) {
        if ((view instanceof ViewGroup) && pointF != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (rsf0.m182963g(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if (!(childAt instanceof ViewPager) && rsf0.m182961e(childAt)) {
                        return childAt;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    View viewM142285m = m142285m(childAt, pointF, view2);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return viewM142285m;
                }
            }
        }
        return view2;
    }

    /* JADX INFO: renamed from: n */
    public View m142286n(View view, boolean z) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        View view2 = null;
        while (linkedList.size() > 0 && view2 == null) {
            View view3 = (View) linkedList.poll();
            if (view3 != null) {
                if ((z || view3 != view) && rsf0.m182961e(view3)) {
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
            float scaleY = (iIntValue - this.f117045f) * this.f117042c.getScaleY();
            View view = this.f117042c;
            if (view instanceof AbsListView) {
                rsf0.m182966j((AbsListView) view, (int) scaleY);
            } else {
                view.scrollBy(0, (int) scaleY);
            }
        } catch (Throwable unused) {
        }
        this.f117045f = iIntValue;
    }
}
