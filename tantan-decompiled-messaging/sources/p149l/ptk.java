package p149l;

import android.R;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.p065ui.guidetip.GuideTipsView;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class ptk {

    /* JADX INFO: renamed from: d */
    public static ptk f151170d = new ptk();

    /* JADX INFO: renamed from: b */
    public int f151172b = 0;

    /* JADX INFO: renamed from: c */
    public String f151173c = "fail_tips";

    /* JADX INFO: renamed from: a */
    public HashMap<String, C19335a> f151171a = new HashMap<>();

    /* JADX INFO: renamed from: l.ptk$a */
    public class C19335a {

        /* JADX INFO: renamed from: a */
        public String f151174a;

        /* JADX INFO: renamed from: b */
        public WeakReference<View> f151175b;

        /* JADX INFO: renamed from: c */
        public GuideTipsView f151176c;

        /* JADX INFO: renamed from: d */
        public jtk f151177d;

        public C19335a(String str) {
            this.f151174a = str;
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Boolean m171330d(FrameLayout frameLayout, Rect rect, Rect rect2, GuideTipsView guideTipsView, jtk jtkVar, View view, String str) {
        Rect rect3 = new Rect();
        frameLayout.getGlobalVisibleRect(rect3);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect2.top;
        guideTipsView.m79690o(jtkVar, new Rect(i, i2 - i3, rect.right, rect.bottom - i3), view.getWidth(), view.getHeight());
        int[] showPoint = guideTipsView.getShowPoint();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i4 = rect2.top - rect3.top;
        layoutParams.leftMargin = showPoint[0] + jtkVar.f119623e;
        layoutParams.topMargin = showPoint[1] + jtkVar.f119624f + i4;
        frameLayout.addView(guideTipsView, layoutParams);
        guideTipsView.m79691p(str);
        if (NullChecker.m81303a(null)) {
            throw null;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: h */
    public static ptk m171332h() {
        return f151170d;
    }

    /* JADX INFO: renamed from: f */
    public void m171333f(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C19335a c19335a = this.f151171a.get(str);
        if (NullChecker.m81303a(c19335a)) {
            jtk jtkVar = c19335a.f151177d;
            if (NullChecker.m81304b(jtkVar) && NullChecker.m81303a(jtkVar.f119634p)) {
                jtkVar.f119634p.mo125326a(str);
            }
            if (z) {
                m171334g(str);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m171334g(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C19335a c19335aRemove = this.f151171a.remove(str);
        if (NullChecker.m81303a(c19335aRemove)) {
            if (NullChecker.m81303a(c19335aRemove.f151176c)) {
                c19335aRemove.f151176c.m79682g();
            }
            WeakReference<View> weakReference = c19335aRemove.f151175b;
            View view = weakReference != null ? weakReference.get() : null;
            if (NullChecker.m81303a(view) && (view.getParent() instanceof ViewGroup)) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            jtk jtkVar = c19335aRemove.f151177d;
            if (NullChecker.m81303a(jtkVar) && NullChecker.m81303a(jtkVar.f119635q)) {
                jtkVar.f119635q.mo135260a(str);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m171335i(LinearLayout linearLayout) {
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
    public final int m171336j(LinearLayout linearLayout) {
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
    public final synchronized String m171337k() {
        int i;
        i = this.f151172b;
        this.f151172b = i + 1;
        return String.valueOf(i);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Boolean m171338l(View view, ViewGroup viewGroup, jtk jtkVar, String str) {
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
        m171349w(jtkVar, new Rect(i - i2, i3 - i4, (i - i2) + width, (i3 - i4) + height), view, viewGroup, str);
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m171339m(final View view, final ViewGroup viewGroup, final jtk jtkVar, final String str, int[] iArr) {
        xdl0.m208366b0(view, new v9j() { // from class: l.mtk
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f135612a.m171338l(view, viewGroup, jtkVar, str);
            }
        });
        view.invalidate();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Boolean m171340n(View view, jtk jtkVar, String str) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        view.getLocalVisibleRect(new Rect());
        Rect rect2 = new Rect();
        view.getGlobalVisibleRect(rect2);
        m171348v(jtkVar, rect2, rect, view, str);
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m171341o(final View view, final jtk jtkVar, final String str, int[] iArr) {
        xdl0.m208366b0(view, new v9j() { // from class: l.ntk
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f140484a.m171340n(view, jtkVar, str);
            }
        });
        view.invalidate();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m171342p(String str, GuideTipsView guideTipsView, View view, jtk jtkVar) {
        C19335a c19335a = this.f151171a.get(str);
        if (!NullChecker.m81303a(c19335a)) {
            return false;
        }
        c19335a.f151176c = guideTipsView;
        c19335a.f151175b = new WeakReference<>(view);
        c19335a.f151177d = jtkVar;
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void m171343q(String str, boolean z) {
        C19335a c19335a;
        GuideTipsView guideTipsView;
        if (TextUtils.isEmpty(this.f151173c) || (c19335a = this.f151171a.get(str)) == null || (guideTipsView = c19335a.f151176c) == null) {
            return;
        }
        guideTipsView.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: r */
    public String m171344r(jtk jtkVar, View view, ViewGroup viewGroup) {
        if (view == null || viewGroup == null) {
            return this.f151173c;
        }
        String strM171337k = m171337k();
        m171345s(jtkVar, view, viewGroup, strM171337k);
        return strM171337k;
    }

    /* JADX INFO: renamed from: s */
    public void m171345s(final jtk jtkVar, final View view, final ViewGroup viewGroup, final String str) {
        if (view == null || viewGroup == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f151171a.put(str, new C19335a(str));
        xdl0.m208353Q0(view, new e30() { // from class: l.ktk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124594a.m171339m(view, viewGroup, jtkVar, str, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public String m171346t(jtk jtkVar, View view) {
        if (view == null) {
            return this.f151173c;
        }
        String strM171337k = m171337k();
        m171347u(jtkVar, view, strM171337k);
        return strM171337k;
    }

    /* JADX INFO: renamed from: u */
    public void m171347u(final jtk jtkVar, final View view, final String str) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f151171a.put(str, new C19335a(str));
        xdl0.m208353Q0(view, new e30() { // from class: l.ltk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129973a.m171341o(view, jtkVar, str, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m171348v(final jtk jtkVar, final Rect rect, final Rect rect2, View view, final String str) {
        View rootView = view.getRootView();
        if (NullChecker.m81304b(rootView)) {
            final View viewFindViewById = rootView.findViewById(R.id.content);
            if (viewFindViewById instanceof ViewGroup) {
                final FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setBackgroundColor(0);
                ((ViewGroup) viewFindViewById).addView(frameLayout, -1, -1);
                final GuideTipsView guideTipsView = new GuideTipsView(view.getContext());
                if (m171342p(str, guideTipsView, frameLayout, jtkVar)) {
                    xdl0.m208366b0(frameLayout, new v9j() { // from class: l.otk
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return ptk.m171330d(frameLayout, rect, rect2, guideTipsView, jtkVar, viewFindViewById, str);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m171349w(jtk jtkVar, Rect rect, View view, ViewGroup viewGroup, String str) {
        int height = viewGroup.getHeight();
        int width = viewGroup.getWidth();
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        GuideTipsView guideTipsView = new GuideTipsView(view.getContext());
        if (m171342p(str, guideTipsView, frameLayout, jtkVar)) {
            guideTipsView.m79690o(jtkVar, rect, width, height);
            if (viewGroup instanceof LinearLayout) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width, height);
                LinearLayout linearLayout = (LinearLayout) viewGroup;
                if (linearLayout.getOrientation() == 1) {
                    layoutParams.topMargin = -m171335i(linearLayout);
                } else {
                    layoutParams.leftMargin = -m171336j(linearLayout);
                }
                frameLayout.setTag("inner_tips_tag");
                viewGroup.addView(frameLayout, layoutParams);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(guideTipsView.getViewWidth(), guideTipsView.getViewHeight());
                int[] showPoint = guideTipsView.getShowPoint();
                layoutParams2.leftMargin = showPoint[0] + jtkVar.f119623e;
                layoutParams2.topMargin = showPoint[1] + jtkVar.f119624f;
                frameLayout.addView(guideTipsView, layoutParams2);
                guideTipsView.m79691p(str);
            } else {
                viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(width, height));
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(guideTipsView.getViewWidth(), guideTipsView.getViewHeight());
                int[] showPoint2 = guideTipsView.getShowPoint();
                layoutParams3.leftMargin = showPoint2[0] + jtkVar.f119623e;
                layoutParams3.topMargin = showPoint2[1] + jtkVar.f119624f;
                frameLayout.addView(guideTipsView, layoutParams3);
                guideTipsView.m79691p(str);
            }
            jtkVar.getClass();
            if (NullChecker.m81303a(null)) {
                throw null;
            }
        }
    }
}
