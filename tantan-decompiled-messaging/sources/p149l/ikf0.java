package p149l;

import android.content.res.Resources;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes3.dex */
public class ikf0 implements Interpolator {

    /* JADX INFO: renamed from: b */
    public static int f113664b = 0;

    /* JADX INFO: renamed from: c */
    public static int f113665c = 1;

    /* JADX INFO: renamed from: d */
    public static float f113666d = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: renamed from: e */
    public static final float f113667e;

    /* JADX INFO: renamed from: f */
    public static final float f113668f;

    /* JADX INFO: renamed from: a */
    public int f113669a;

    static {
        float fM136797k = 1.0f / m136797k(1.0f);
        f113667e = fM136797k;
        f113668f = 1.0f - (fM136797k * m136797k(1.0f));
    }

    public ikf0(int i) {
        this.f113669a = i;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m136787a(@NonNull View view, PointF pointF, boolean z) {
        if (view.canScrollVertically(1) && view.getVisibility() == 0) {
            return false;
        }
        if ((view instanceof ViewGroup) && pointF != null && !m136792f(view)) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (m136793g(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    Object tag = childAt.getTag(p4c0.f147074J0);
                    if ("fixed".equals(tag) || "fixed-top".equals(tag)) {
                        return false;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    boolean zM136787a = m136787a(childAt, pointF, z);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return zM136787a;
                }
            }
        }
        return z || view.canScrollVertically(-1);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m136788b(@NonNull View view, PointF pointF) {
        if (view.canScrollVertically(-1) && view.getVisibility() == 0) {
            return false;
        }
        if (!(view instanceof ViewGroup) || pointF == null) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        PointF pointF2 = new PointF();
        for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount - 1);
            if (m136793g(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                Object tag = childAt.getTag(p4c0.f147074J0);
                if ("fixed".equals(tag) || "fixed-bottom".equals(tag)) {
                    return false;
                }
                pointF.offset(pointF2.x, pointF2.y);
                boolean zM136788b = m136788b(childAt, pointF);
                pointF.offset(-pointF2.x, -pointF2.y);
                return zM136788b;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static int m136789c(float f) {
        return (int) ((f * f113666d) + 0.5f);
    }

    /* JADX INFO: renamed from: d */
    public static void m136790d(View view, int i) {
        if (view instanceof ScrollView) {
            ((ScrollView) view).fling(i);
            return;
        }
        if (view instanceof AbsListView) {
            ((AbsListView) view).fling(i);
            return;
        }
        if (view instanceof WebView) {
            ((WebView) view).flingScroll(0, i);
        } else if (view instanceof NestedScrollView) {
            ((NestedScrollView) view).m1372p(i);
        } else if (view instanceof RecyclerView) {
            ((RecyclerView) view).fling(0, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m136791e(View view) {
        if (view instanceof bnc0) {
            return false;
        }
        return m136792f(view) || (view instanceof ViewPager) || (view instanceof w920);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m136792f(View view) {
        if (view instanceof bnc0) {
            return false;
        }
        return (view instanceof AbsListView) || (view instanceof ScrollView) || (view instanceof h6e0) || (view instanceof WebView) || (view instanceof s920);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m136793g(@NonNull View view, @NonNull View view2, float f, float f2, PointF pointF) {
        if (view2.getVisibility() != 0) {
            return false;
        }
        float[] fArr = {f, f2};
        fArr[0] = (view.getScrollX() - view2.getLeft()) + f;
        float scrollY = fArr[1] + (view.getScrollY() - view2.getTop());
        fArr[1] = scrollY;
        float f3 = fArr[0];
        boolean z = f3 >= 0.0f && scrollY >= 0.0f && f3 < ((float) view2.getWidth()) && fArr[1] < ((float) view2.getHeight());
        if (z && pointF != null) {
            pointF.set(fArr[0] - f, fArr[1] - f2);
        }
        return z;
    }

    /* JADX INFO: renamed from: h */
    public static int m136794h(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i = layoutParams.height;
        view.measure(childMeasureSpec, i > 0 ? View.MeasureSpec.makeMeasureSpec(i, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    /* JADX INFO: renamed from: i */
    public static float m136795i(int i) {
        return i / f113666d;
    }

    /* JADX INFO: renamed from: j */
    public static void m136796j(@NonNull AbsListView absListView, int i) {
        absListView.scrollListBy(i);
    }

    /* JADX INFO: renamed from: k */
    public static float m136797k(float f) {
        float f2 = f * 8.0f;
        return f2 < 1.0f ? f2 - (1.0f - ((float) Math.exp(-f2))) : ((1.0f - ((float) Math.exp(1.0f - f2))) * 0.63212055f) + 0.36787945f;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (this.f113669a == f113665c) {
            float f2 = 1.0f - f;
            return 1.0f - (f2 * f2);
        }
        float fM136797k = f113667e * m136797k(f);
        return fM136797k > 0.0f ? fM136797k + f113668f : fM136797k;
    }
}
