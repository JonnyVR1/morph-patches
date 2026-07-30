package p153l;

import android.R;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.p070ui.guidetip.GuideTipsView;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class fwk {

    /* JADX INFO: renamed from: d */
    public static fwk f101172d = new fwk();

    /* JADX INFO: renamed from: b */
    public int f101174b = 0;

    /* JADX INFO: renamed from: c */
    public String f101175c = "fail_tips";

    /* JADX INFO: renamed from: a */
    public HashMap<String, C17087a> f101173a = new HashMap<>();

    /* JADX INFO: renamed from: l.fwk$a */
    public class C17087a {

        /* JADX INFO: renamed from: a */
        public String f101176a;

        /* JADX INFO: renamed from: b */
        public WeakReference<View> f101177b;

        /* JADX INFO: renamed from: c */
        public GuideTipsView f101178c;

        /* JADX INFO: renamed from: d */
        public zvk f101179d;

        public C17087a(String str) {
            this.f101176a = str;
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Boolean m127775d(FrameLayout frameLayout, Rect rect, Rect rect2, GuideTipsView guideTipsView, zvk zvkVar, View view, String str) {
        Rect rect3 = new Rect();
        frameLayout.getGlobalVisibleRect(rect3);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect2.top;
        guideTipsView.m80873o(zvkVar, new Rect(i, i2 - i3, rect.right, rect.bottom - i3), view.getWidth(), view.getHeight());
        int[] showPoint = guideTipsView.getShowPoint();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i4 = rect2.top - rect3.top;
        layoutParams.leftMargin = showPoint[0] + zvkVar.f206233e;
        layoutParams.topMargin = showPoint[1] + zvkVar.f206234f + i4;
        frameLayout.addView(guideTipsView, layoutParams);
        guideTipsView.m80874p(str);
        if (NullChecker.m82486a(null)) {
            throw null;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: h */
    public static fwk m127777h() {
        return f101172d;
    }

    /* JADX INFO: renamed from: f */
    public void m127778f(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C17087a c17087a = this.f101173a.get(str);
        if (NullChecker.m82486a(c17087a)) {
            zvk zvkVar = c17087a.f101179d;
            if (NullChecker.m82487b(zvkVar) && NullChecker.m82486a(zvkVar.f206244p)) {
                zvkVar.f206244p.mo102709a(str);
            }
            if (z) {
                m127779g(str);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m127779g(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C17087a c17087aRemove = this.f101173a.remove(str);
        if (NullChecker.m82486a(c17087aRemove)) {
            if (NullChecker.m82486a(c17087aRemove.f101178c)) {
                c17087aRemove.f101178c.m80865g();
            }
            WeakReference<View> weakReference = c17087aRemove.f101177b;
            View view = weakReference != null ? weakReference.get() : null;
            if (NullChecker.m82486a(view) && (view.getParent() instanceof ViewGroup)) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            zvk zvkVar = c17087aRemove.f101179d;
            if (NullChecker.m82486a(zvkVar) && NullChecker.m82486a(zvkVar.f206245q)) {
                zvkVar.f206245q.mo96261a(str);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m127780i(LinearLayout linearLayout) {
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
    public final int m127781j(LinearLayout linearLayout) {
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
    public final synchronized String m127782k() {
        int i;
        i = this.f101174b;
        this.f101174b = i + 1;
        return String.valueOf(i);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Boolean m127783l(View view, ViewGroup viewGroup, zvk zvkVar, String str) {
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
        m127794w(zvkVar, new Rect(i - i2, i3 - i4, (i - i2) + width, (i3 - i4) + height), view, viewGroup, str);
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m127784m(final View view, final ViewGroup viewGroup, final zvk zvkVar, final String str, int[] iArr) {
        bnl0.m105546b0(view, new pcj() { // from class: l.cwk
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f84131a.m127783l(view, viewGroup, zvkVar, str);
            }
        });
        view.invalidate();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Boolean m127785n(View view, zvk zvkVar, String str) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        view.getLocalVisibleRect(new Rect());
        Rect rect2 = new Rect();
        view.getGlobalVisibleRect(rect2);
        m127793v(zvkVar, rect2, rect, view, str);
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m127786o(final View view, final zvk zvkVar, final String str, int[] iArr) {
        bnl0.m105546b0(view, new pcj() { // from class: l.dwk
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f91027a.m127785n(view, zvkVar, str);
            }
        });
        view.invalidate();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m127787p(String str, GuideTipsView guideTipsView, View view, zvk zvkVar) {
        C17087a c17087a = this.f101173a.get(str);
        if (!NullChecker.m82486a(c17087a)) {
            return false;
        }
        c17087a.f101178c = guideTipsView;
        c17087a.f101177b = new WeakReference<>(view);
        c17087a.f101179d = zvkVar;
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void m127788q(String str, boolean z) {
        C17087a c17087a;
        GuideTipsView guideTipsView;
        if (TextUtils.isEmpty(this.f101175c) || (c17087a = this.f101173a.get(str)) == null || (guideTipsView = c17087a.f101178c) == null) {
            return;
        }
        guideTipsView.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: r */
    public String m127789r(zvk zvkVar, View view, ViewGroup viewGroup) {
        if (view == null || viewGroup == null) {
            return this.f101175c;
        }
        String strM127782k = m127782k();
        m127790s(zvkVar, view, viewGroup, strM127782k);
        return strM127782k;
    }

    /* JADX INFO: renamed from: s */
    public void m127790s(final zvk zvkVar, final View view, final ViewGroup viewGroup, final String str) {
        if (view == null || viewGroup == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f101173a.put(str, new C17087a(str));
        bnl0.m105533Q0(view, new y20() { // from class: l.awk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73767a.m127784m(view, viewGroup, zvkVar, str, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public String m127791t(zvk zvkVar, View view) {
        if (view == null) {
            return this.f101175c;
        }
        String strM127782k = m127782k();
        m127792u(zvkVar, view, strM127782k);
        return strM127782k;
    }

    /* JADX INFO: renamed from: u */
    public void m127792u(final zvk zvkVar, final View view, final String str) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f101173a.put(str, new C17087a(str));
        bnl0.m105533Q0(view, new y20() { // from class: l.bwk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78758a.m127786o(view, zvkVar, str, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m127793v(final zvk zvkVar, final Rect rect, final Rect rect2, View view, final String str) {
        View rootView = view.getRootView();
        if (NullChecker.m82487b(rootView)) {
            final View viewFindViewById = rootView.findViewById(R.id.content);
            if (viewFindViewById instanceof ViewGroup) {
                final FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setBackgroundColor(0);
                ((ViewGroup) viewFindViewById).addView(frameLayout, -1, -1);
                final GuideTipsView guideTipsView = new GuideTipsView(view.getContext());
                if (m127787p(str, guideTipsView, frameLayout, zvkVar)) {
                    bnl0.m105546b0(frameLayout, new pcj() { // from class: l.ewk
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return fwk.m127775d(frameLayout, rect, rect2, guideTipsView, zvkVar, viewFindViewById, str);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m127794w(zvk zvkVar, Rect rect, View view, ViewGroup viewGroup, String str) {
        int height = viewGroup.getHeight();
        int width = viewGroup.getWidth();
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        GuideTipsView guideTipsView = new GuideTipsView(view.getContext());
        if (m127787p(str, guideTipsView, frameLayout, zvkVar)) {
            guideTipsView.m80873o(zvkVar, rect, width, height);
            if (viewGroup instanceof LinearLayout) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width, height);
                LinearLayout linearLayout = (LinearLayout) viewGroup;
                if (linearLayout.getOrientation() == 1) {
                    layoutParams.topMargin = -m127780i(linearLayout);
                } else {
                    layoutParams.leftMargin = -m127781j(linearLayout);
                }
                frameLayout.setTag("inner_tips_tag");
                viewGroup.addView(frameLayout, layoutParams);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(guideTipsView.getViewWidth(), guideTipsView.getViewHeight());
                int[] showPoint = guideTipsView.getShowPoint();
                layoutParams2.leftMargin = showPoint[0] + zvkVar.f206233e;
                layoutParams2.topMargin = showPoint[1] + zvkVar.f206234f;
                frameLayout.addView(guideTipsView, layoutParams2);
                guideTipsView.m80874p(str);
            } else {
                viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(width, height));
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(guideTipsView.getViewWidth(), guideTipsView.getViewHeight());
                int[] showPoint2 = guideTipsView.getShowPoint();
                layoutParams3.leftMargin = showPoint2[0] + zvkVar.f206233e;
                layoutParams3.topMargin = showPoint2[1] + zvkVar.f206234f;
                frameLayout.addView(guideTipsView, layoutParams3);
                guideTipsView.m80874p(str);
            }
            zvkVar.getClass();
            if (NullChecker.m82486a(null)) {
                throw null;
            }
        }
    }
}
