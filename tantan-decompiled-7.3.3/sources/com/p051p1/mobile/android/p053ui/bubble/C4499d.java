package com.p051p1.mobile.android.p053ui.bubble;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.android.p053ui.poplevel.C4522a;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p153l.al80;
import p153l.b3m;
import p153l.bge;
import p153l.bnl0;
import p153l.cl80;
import p153l.ezf0;
import p153l.gec0;
import p153l.jyb;
import p153l.l51;
import p153l.pcj;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.tyf0;
import p153l.vcc0;
import p153l.y20;
import p153l.zsi;

/* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.d */
/* JADX INFO: loaded from: classes8.dex */
public class C4499d {

    /* JADX INFO: renamed from: d */
    public static C4499d f16459d = new C4499d();

    /* JADX INFO: renamed from: b */
    public int f16461b = 0;

    /* JADX INFO: renamed from: c */
    public String f16462c = "fail_tips";

    /* JADX INFO: renamed from: a */
    public HashMap<String, c> f16460a = new HashMap<>();

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.d$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f16463a;

        public a(String str) {
            this.f16463a = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4499d.this.m21899k(this.f16463a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.d$b */
    public class b implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f16465a;

        public b(String str) {
            this.f16465a = str;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            C4499d.this.m21899k(this.f16465a);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.d$c */
    public class c {

        /* JADX INFO: renamed from: a */
        public String f16467a;

        /* JADX INFO: renamed from: b */
        public WeakReference<View> f16468b;

        /* JADX INFO: renamed from: c */
        public BubbleView f16469c;

        /* JADX INFO: renamed from: d */
        public C4496a f16470d;

        public c(String str, C4496a c4496a) {
            this.f16467a = str;
            this.f16470d = c4496a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m21889b(BubbleView bubbleView, c cVar, bge bgeVar, float f, float f2) {
        float f3 = f / 220.0f;
        bubbleView.setScaleX(f3);
        bubbleView.setScaleY(f3);
        if (f3 <= 0.0f) {
            WeakReference<View> weakReference = cVar.f16468b;
            View view = weakReference != null ? weakReference.get() : null;
            if (NullChecker.m82486a(view) && (view.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                viewGroup.removeView(view);
                Object tag = view.getTag();
                if (tag instanceof View) {
                    viewGroup.removeView((View) tag);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m21891d(View view) {
    }

    /* JADX INFO: renamed from: l */
    public static C4499d m21895l() {
        return f16459d;
    }

    /* JADX INFO: renamed from: h */
    public final void m21896h(C4496a c4496a, View view) {
        View viewInflate = LayoutInflater.from(view.getContext()).inflate(gec0.f103796i, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(vcc0.f183426l);
        TextView textView = (TextView) viewInflate.findViewById(vcc0.f183424k);
        Integer num = c4496a.f16409F;
        if (num != null) {
            textView.setBreakStrategy(num.intValue());
        }
        if (c4496a.f16437u != null) {
            imageView.setVisibility(0);
            imageView.setImageResource(c4496a.f16437u.intValue());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.setMarginStart(0);
            layoutParams.setMarginEnd(qa00.f156326m);
            textView.setLayoutParams(layoutParams);
        } else if (c4496a.f16410G != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textView.getLayoutParams();
            C4496a.a aVar = c4496a.f16410G;
            layoutParams2.setMargins(aVar.f16443a, aVar.f16444b, aVar.f16445c, aVar.f16446d);
        }
        if (c4496a.f16413J) {
            textView.setGravity(1);
        }
        if (c4496a.f16431o) {
            textView.setTypeface(Typeface.defaultFromStyle(1));
        }
        textView.setTextColor(c4496a.f16432p);
        textView.setTextSize(c4496a.f16435s);
        if (!TextUtils.isEmpty(c4496a.f16433q)) {
            textView.setTextColor(Color.parseColor(c4496a.f16433q));
        }
        int i = c4496a.f16436t;
        if (i > 0) {
            textView.setMaxWidth(qa00.m175859d(i));
        }
        textView.setText(c4496a.f16434r);
        c4496a.m21876s(viewInflate);
    }

    /* JADX INFO: renamed from: i */
    public void m21897i(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c cVar = this.f16460a.get(str);
        if (NullChecker.m82486a(cVar)) {
            C4496a c4496a = cVar.f16470d;
            if (NullChecker.m82487b(c4496a) && NullChecker.m82486a(c4496a.f16427k)) {
                c4496a.f16427k.mo21884a(str);
            }
            if (z) {
                m21899k(str);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m21898j() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f16460a.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        if (jyb.m147479J(arrayList)) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m21899k((String) it2.next());
        }
    }

    /* JADX INFO: renamed from: k */
    public void m21899k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final c cVarRemove = this.f16460a.remove(str);
        if (NullChecker.m82486a(cVarRemove)) {
            final BubbleView bubbleView = cVarRemove.f16469c;
            if (NullChecker.m82486a(bubbleView)) {
                bubbleView.m21833i();
                zsi zsiVar = new zsi(0.0f);
                tyf0 tyf0VarM104127j = new tyf0(zsiVar).m193595r(new ezf0().m123347d(0.61f).m123349f(600.0f)).m104127j(0.0f);
                float[] fArrM21835k = bubbleView.m21835k();
                bubbleView.setPivotX(fArrM21835k[0]);
                bubbleView.setPivotY(fArrM21835k[1]);
                tyf0VarM104127j.m104120b(new bge.InterfaceC16001r() { // from class: com.p1.mobile.android.ui.bubble.b
                    @Override // p153l.bge.InterfaceC16001r
                    /* JADX INFO: renamed from: a */
                    public final void mo21887a(bge bgeVar, float f, float f2) {
                        C4499d.m21889b(bubbleView, cVarRemove, bgeVar, f, f2);
                    }
                });
                tyf0VarM104127j.m104127j(220.0f).m193592o(0.0f);
            }
            C4496a c4496a = cVarRemove.f16470d;
            if (NullChecker.m82486a(c4496a) && NullChecker.m82486a(c4496a.f16428l)) {
                c4496a.f16428l.mo21885a(str);
            }
            if (NullChecker.m82486a(c4496a) && NullChecker.m82486a(c4496a.f16414K)) {
                c4496a.f16414K.mo22108a(c4496a);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final String m21900m() {
        int i = this.f16461b;
        this.f16461b = i + 1;
        return String.valueOf(i);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m21901n(String str, C4470c c4470c) {
        this.f16460a.remove(str);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Boolean m21902o(String str, View view, C4496a c4496a) {
        if (m21911x(str)) {
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            view.getLocalVisibleRect(new Rect());
            Rect rect2 = new Rect();
            view.getGlobalVisibleRect(rect2);
            m21910w(c4496a, rect2, rect, view, str);
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m21903p(final View view, final String str, final C4496a c4496a, int[] iArr) {
        bnl0.m105546b0(view, new pcj() { // from class: l.eg3
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f93893a.m21902o(str, view, c4496a);
            }
        });
        if (m21911x(str)) {
            view.invalidate();
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Boolean m21904q(String str, FrameLayout frameLayout, Rect rect, C4496a c4496a, Rect rect2, BubbleView bubbleView, View view, View view2) {
        if (m21911x(str)) {
            Rect rect3 = new Rect();
            frameLayout.getGlobalVisibleRect(rect3);
            int i = rect.left;
            boolean z = c4496a.f16407D;
            int i2 = i - (z ? rect3.left : 0);
            int i3 = rect.top;
            int i4 = rect2.top;
            bubbleView.m21843s(c4496a, new Rect(i2, i3 - i4, rect.right + (z ? rect3.left : 0), rect.bottom - i4), view.getWidth(), view.getHeight(), str);
            int[] iArrM21836l = bubbleView.m21836l();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            int i5 = rect2.top - rect3.top;
            Rect rect4 = new Rect();
            view2.getGlobalVisibleRect(rect4);
            int i6 = i5 + (rect4.top - rect.top);
            layoutParams.leftMargin = iArrM21836l[0] + c4496a.f16419c;
            layoutParams.topMargin = iArrM21836l[1] + c4496a.f16420d + i6;
            frameLayout.addView(bubbleView, layoutParams);
            bubbleView.m21844t(str);
            if (NullChecker.m82486a(c4496a.f16429m)) {
                c4496a.f16429m.mo21886a(bubbleView);
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) frameLayout.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(frameLayout);
                Object tag = frameLayout.getTag();
                if (tag instanceof View) {
                    viewGroup.removeView((View) tag);
                }
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m21905r(String str, BubbleView bubbleView, View view, C4496a c4496a) {
        c cVar = this.f16460a.get(str);
        if (!NullChecker.m82486a(cVar)) {
            return false;
        }
        cVar.f16469c = bubbleView;
        cVar.f16468b = new WeakReference<>(view);
        cVar.f16470d = c4496a;
        return true;
    }

    /* JADX INFO: renamed from: s */
    public void m21906s(final C4496a c4496a, final View view, final String str) {
        if (c4496a.f16439w == null) {
            m21896h(c4496a, view);
        }
        this.f16460a.put(str, new c(str, c4496a));
        Context context = view.getContext();
        if (context instanceof Act) {
            ((Act) context).lifecycle().filter(new qcj() { // from class: l.bg3
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16271m);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.cg3
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f81617a.m21901n(str, (C4470c) obj);
                }
            }));
        }
        bnl0.m105533Q0(view, new y20() { // from class: l.dg3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88252a.m21903p(view, str, c4496a, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public String m21907t(C4496a c4496a, View view) {
        if (view == null) {
            return this.f16462c;
        }
        String strM21900m = m21900m();
        m21908u(c4496a, view, strM21900m);
        return strM21900m;
    }

    /* JADX INFO: renamed from: u */
    public void m21908u(C4496a c4496a, View view, String str) {
        m21909v(c4496a, view, str, 1);
    }

    /* JADX INFO: renamed from: v */
    public void m21909v(C4496a c4496a, View view, String str, int i) {
        if (view == null || TextUtils.isEmpty(str) || this.f16460a.containsKey(str) || cl80.m110426e().m110433k()) {
            return;
        }
        l51.m152884D();
        if (!C4522a.m22099p().m22107I() || !(view.getContext() instanceof Act)) {
            cl80.m110426e().m110439q(al80.m98641a(c4496a).m98653r(new WeakReference<>(view)).m98649n(str).m98651p(i));
        } else {
            c4496a.m21861c(str, view);
            C4522a.m22099p().m22102C(new b3m(str), (Act) view.getContext(), c4496a, C4522a.m22094F(i));
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m21910w(final C4496a c4496a, final Rect rect, final Rect rect2, final View view, final String str) {
        FrameLayout frameLayout;
        View rootView = view.getRootView();
        if (NullChecker.m82487b(rootView)) {
            View viewFindViewById = c4496a.f16441y;
            if (viewFindViewById == null) {
                viewFindViewById = rootView.findViewById(R.id.content);
            }
            final View view2 = viewFindViewById;
            if (view2 instanceof ViewGroup) {
                if (c4496a.f16405B != 0) {
                    frameLayout = new FrameLayout(view.getContext());
                    BubbleBackgroundView bubbleBackgroundView = new BubbleBackgroundView(view.getContext());
                    bubbleBackgroundView.setBackgroundPaintColor(c4496a.f16405B);
                    bubbleBackgroundView.setTargetViewRect(rect);
                    bubbleBackgroundView.setTargetViewRadius(c4496a.f16406C);
                    bnl0.m105509E0(bubbleBackgroundView, new View.OnClickListener() { // from class: l.fg3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            C4499d.m21891d(view3);
                        }
                    });
                    ViewGroup viewGroup = (ViewGroup) view2;
                    viewGroup.addView(bubbleBackgroundView, -1, -1);
                    frameLayout.setTag(bubbleBackgroundView);
                    viewGroup.addView(frameLayout, -1, -1);
                } else {
                    frameLayout = new FrameLayout(view.getContext());
                    ((ViewGroup) view2).addView(frameLayout, -1, -1);
                }
                final FrameLayout frameLayout2 = frameLayout;
                final BubbleView bubbleView = new BubbleView(view.getContext());
                if (m21905r(str, bubbleView, frameLayout2, c4496a)) {
                    if (c4496a.f16442z) {
                        frameLayout2.setOnClickListener(new a(str));
                    }
                    if (c4496a.f16404A) {
                        frameLayout2.setOnTouchListener(new b(str));
                    }
                    bnl0.m105546b0(frameLayout2, new pcj() { // from class: com.p1.mobile.android.ui.bubble.c
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return this.f16450a.m21904q(str, frameLayout2, rect, c4496a, rect2, bubbleView, view2, view);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public boolean m21911x(String str) {
        return this.f16460a.containsKey(str);
    }
}
