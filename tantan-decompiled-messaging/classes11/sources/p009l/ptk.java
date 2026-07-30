package p009l;

import android.R;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.p004ui.guidetip.GuideTipsView;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import l.e30;
import l.v9j;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ptk {

    /* JADX INFO: renamed from: d */
    public static ptk f18902d = new ptk();

    /* JADX INFO: renamed from: b */
    public int f18904b = 0;

    /* JADX INFO: renamed from: c */
    public String f18905c = "fail_tips";

    /* JADX INFO: renamed from: a */
    public HashMap<String, C1131a> f18903a = new HashMap<>();

    /* JADX INFO: renamed from: l.ptk$a */
    public class C1131a {

        /* JADX INFO: renamed from: a */
        public String f18906a;

        /* JADX INFO: renamed from: b */
        public WeakReference<View> f18907b;

        /* JADX INFO: renamed from: c */
        public GuideTipsView f18908c;

        /* JADX INFO: renamed from: d */
        public jtk f18909d;

        public C1131a(String str) {
            this.f18906a = str;
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Boolean m20686d(FrameLayout frameLayout, Rect rect, Rect rect2, GuideTipsView guideTipsView, jtk jtkVar, View view, String str) {
        Rect rect3 = new Rect();
        frameLayout.getGlobalVisibleRect(rect3);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect2.top;
        guideTipsView.m10011o(jtkVar, new Rect(i, i2 - i3, rect.right, rect.bottom - i3), view.getWidth(), view.getHeight());
        int[] showPoint = guideTipsView.getShowPoint();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i4 = rect2.top - rect3.top;
        layoutParams.leftMargin = showPoint[0] + jtkVar.f15302e;
        layoutParams.topMargin = showPoint[1] + jtkVar.f15303f + i4;
        frameLayout.addView(guideTipsView, layoutParams);
        guideTipsView.m10012p(str);
        if (NullChecker.a((Object) null)) {
            throw null;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: h */
    public static ptk m20688h() {
        return f18902d;
    }

    /* JADX INFO: renamed from: f */
    public void m20689f(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1131a c1131a = this.f18903a.get(str);
        if (NullChecker.a(c1131a)) {
            jtk jtkVar = c1131a.f18909d;
            if (NullChecker.b(jtkVar) && NullChecker.a(jtkVar.f15313p)) {
                jtkVar.f15313p.mo17215a(str);
            }
            if (z) {
                m20690g(str);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m20690g(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1131a c1131aRemove = this.f18903a.remove(str);
        if (NullChecker.a(c1131aRemove)) {
            if (NullChecker.a(c1131aRemove.f18908c)) {
                c1131aRemove.f18908c.m10003g();
            }
            WeakReference<View> weakReference = c1131aRemove.f18907b;
            View view = weakReference != null ? weakReference.get() : null;
            if (NullChecker.a(view) && (view.getParent() instanceof ViewGroup)) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            jtk jtkVar = c1131aRemove.f18909d;
            if (NullChecker.a(jtkVar) && NullChecker.a(jtkVar.f15314q)) {
                jtkVar.f15314q.mo17216a(str);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m20691i(LinearLayout linearLayout) {
        int childCount = linearLayout.getChildCount();
        int height = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt.getVisibility() != 8 && (!(childAt.getTag() instanceof String) || !TextUtils.equals((String) childAt.getTag(), "inner_tips_tag"))) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                height = height + childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
        }
        return height;
    }

    /* JADX INFO: renamed from: j */
    public final int m20692j(LinearLayout linearLayout) {
        int childCount = linearLayout.getChildCount();
        int width = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt.getVisibility() != 8 && (!(childAt.getTag() instanceof String) || !TextUtils.equals((String) childAt.getTag(), "inner_tips_tag"))) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                width = width + childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            }
        }
        return width;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized String m20693k() {
        int i;
        i = this.f18904b;
        this.f18904b = i + 1;
        return String.valueOf(i);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Boolean m20694l(View view, ViewGroup viewGroup, jtk jtkVar, String str) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        viewGroup.getLocationInWindow(iArr2);
        int width = view.getWidth();
        int height = view.getHeight();
        int i = iArr[0];
        int i2 = iArr2[0];
        int i3 = iArr[1];
        int i4 = iArr2[1];
        m20705w(jtkVar, new Rect(i - i2, i3 - i4, (i - i2) + width, (i3 - i4) + height), view, viewGroup, str);
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m20695m(final View view, final ViewGroup viewGroup, final jtk jtkVar, final String str, int[] iArr) {
        xdl0.b0(view, new v9j() { // from class: l.mtk
            public final Object call() {
                return this.f17086a.m20694l(view, viewGroup, jtkVar, str);
            }
        });
        view.invalidate();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Boolean m20696n(View view, jtk jtkVar, String str) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        view.getLocalVisibleRect(new Rect());
        Rect rect2 = new Rect();
        view.getGlobalVisibleRect(rect2);
        m20704v(jtkVar, rect2, rect, view, str);
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m20697o(final View view, final jtk jtkVar, final String str, int[] iArr) {
        xdl0.b0(view, new v9j() { // from class: l.ntk
            public final Object call() {
                return this.f17732a.m20696n(view, jtkVar, str);
            }
        });
        view.invalidate();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m20698p(String str, GuideTipsView guideTipsView, View view, jtk jtkVar) {
        C1131a c1131a = this.f18903a.get(str);
        if (!NullChecker.a(c1131a)) {
            return false;
        }
        c1131a.f18908c = guideTipsView;
        c1131a.f18907b = new WeakReference<>(view);
        c1131a.f18909d = jtkVar;
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void m20699q(String str, boolean z) {
        C1131a c1131a;
        GuideTipsView guideTipsView;
        if (TextUtils.isEmpty(this.f18905c) || (c1131a = this.f18903a.get(str)) == null || (guideTipsView = c1131a.f18908c) == null) {
            return;
        }
        guideTipsView.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: r */
    public String m20700r(jtk jtkVar, View view, ViewGroup viewGroup) {
        if (view == null || viewGroup == null) {
            return this.f18905c;
        }
        String strM20693k = m20693k();
        m20701s(jtkVar, view, viewGroup, strM20693k);
        return strM20693k;
    }

    /* JADX INFO: renamed from: s */
    public void m20701s(final jtk jtkVar, final View view, final ViewGroup viewGroup, final String str) {
        if (view == null || viewGroup == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f18903a.put(str, new C1131a(str));
        xdl0.Q0(view, new e30() { // from class: l.ktk
            public final void call(Object obj) {
                this.f15849a.m20695m(view, viewGroup, jtkVar, str, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public String m20702t(jtk jtkVar, View view) {
        if (view == null) {
            return this.f18905c;
        }
        String strM20693k = m20693k();
        m20703u(jtkVar, view, strM20693k);
        return strM20693k;
    }

    /* JADX INFO: renamed from: u */
    public void m20703u(final jtk jtkVar, final View view, final String str) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f18903a.put(str, new C1131a(str));
        xdl0.Q0(view, new e30() { // from class: l.ltk
            public final void call(Object obj) {
                this.f16407a.m20697o(view, jtkVar, str, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m20704v(final jtk jtkVar, final Rect rect, final Rect rect2, View view, final String str) {
        View rootView = view.getRootView();
        if (NullChecker.b(rootView)) {
            final View viewFindViewById = rootView.findViewById(R.id.content);
            if (viewFindViewById instanceof ViewGroup) {
                final FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setBackgroundColor(0);
                ((ViewGroup) viewFindViewById).addView(frameLayout, -1, -1);
                final GuideTipsView guideTipsView = new GuideTipsView(view.getContext());
                if (m20698p(str, guideTipsView, frameLayout, jtkVar)) {
                    xdl0.b0(frameLayout, new v9j() { // from class: l.otk
                        public final Object call() {
                            return ptk.m20686d(frameLayout, rect, rect2, guideTipsView, jtkVar, viewFindViewById, str);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m20705w(jtk jtkVar, Rect rect, View view, ViewGroup viewGroup, String str) {
        int height = viewGroup.getHeight();
        int width = viewGroup.getWidth();
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        GuideTipsView guideTipsView = new GuideTipsView(view.getContext());
        if (m20698p(str, guideTipsView, frameLayout, jtkVar)) {
            guideTipsView.m10011o(jtkVar, rect, width, height);
            if (viewGroup instanceof LinearLayout) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width, height);
                LinearLayout linearLayout = (LinearLayout) viewGroup;
                if (linearLayout.getOrientation() == 1) {
                    layoutParams.topMargin = -m20691i(linearLayout);
                } else {
                    layoutParams.leftMargin = -m20692j(linearLayout);
                }
                frameLayout.setTag("inner_tips_tag");
                viewGroup.addView(frameLayout, layoutParams);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(guideTipsView.getViewWidth(), guideTipsView.getViewHeight());
                int[] showPoint = guideTipsView.getShowPoint();
                layoutParams2.leftMargin = showPoint[0] + jtkVar.f15302e;
                layoutParams2.topMargin = showPoint[1] + jtkVar.f15303f;
                frameLayout.addView(guideTipsView, layoutParams2);
                guideTipsView.m10012p(str);
            } else {
                viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(width, height));
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(guideTipsView.getViewWidth(), guideTipsView.getViewHeight());
                int[] showPoint2 = guideTipsView.getShowPoint();
                layoutParams3.leftMargin = showPoint2[0] + jtkVar.f15302e;
                layoutParams3.topMargin = showPoint2[1] + jtkVar.f15303f;
                frameLayout.addView(guideTipsView, layoutParams3);
                guideTipsView.m10012p(str);
            }
            jtkVar.getClass();
            if (NullChecker.a((Object) null)) {
                throw null;
            }
        }
    }
}
