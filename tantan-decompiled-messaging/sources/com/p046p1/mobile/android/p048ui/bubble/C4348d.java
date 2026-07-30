package com.p046p1.mobile.android.p048ui.bubble;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.android.p048ui.poplevel.C4371a;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p149l.b6c0;
import p149l.dqi;
import p149l.e30;
import p149l.e51;
import p149l.h0m;
import p149l.kqf0;
import p149l.mkd0;
import p149l.p4c0;
import p149l.t100;
import p149l.uc80;
import p149l.v9j;
import p149l.vqf0;
import p149l.vwb;
import p149l.w9j;
import p149l.wc80;
import p149l.xdl0;
import p149l.xee;

/* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.d */
/* JADX INFO: loaded from: classes8.dex */
public class C4348d {

    /* JADX INFO: renamed from: d */
    public static C4348d f15740d = new C4348d();

    /* JADX INFO: renamed from: b */
    public int f15742b = 0;

    /* JADX INFO: renamed from: c */
    public String f15743c = "fail_tips";

    /* JADX INFO: renamed from: a */
    public HashMap<String, c> f15741a = new HashMap<>();

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.d$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f15744a;

        public a(String str) {
            this.f15744a = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4348d.this.m20900k(this.f15744a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.d$b */
    public class b implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f15746a;

        public b(String str) {
            this.f15746a = str;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            C4348d.this.m20900k(this.f15746a);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.d$c */
    public class c {

        /* JADX INFO: renamed from: a */
        public String f15748a;

        /* JADX INFO: renamed from: b */
        public WeakReference<View> f15749b;

        /* JADX INFO: renamed from: c */
        public BubbleView f15750c;

        /* JADX INFO: renamed from: d */
        public C4345a f15751d;

        public c(String str, C4345a c4345a) {
            this.f15748a = str;
            this.f15751d = c4345a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m20890b(BubbleView bubbleView, c cVar, xee xeeVar, float f, float f2) {
        float f3 = f / 220.0f;
        bubbleView.setScaleX(f3);
        bubbleView.setScaleY(f3);
        if (f3 <= 0.0f) {
            WeakReference<View> weakReference = cVar.f15749b;
            View view = weakReference != null ? weakReference.get() : null;
            if (NullChecker.m81303a(view) && (view.getParent() instanceof ViewGroup)) {
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
    public static /* synthetic */ void m20892d(View view) {
    }

    /* JADX INFO: renamed from: l */
    public static C4348d m20896l() {
        return f15740d;
    }

    /* JADX INFO: renamed from: h */
    public final void m20897h(C4345a c4345a, View view) {
        View viewInflate = LayoutInflater.from(view.getContext()).inflate(b6c0.f73783i, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(p4c0.f147126l);
        TextView textView = (TextView) viewInflate.findViewById(p4c0.f147124k);
        Integer num = c4345a.f15690F;
        if (num != null) {
            textView.setBreakStrategy(num.intValue());
        }
        if (c4345a.f15718u != null) {
            imageView.setVisibility(0);
            imageView.setImageResource(c4345a.f15718u.intValue());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.setMarginStart(0);
            layoutParams.setMarginEnd(t100.f167264m);
            textView.setLayoutParams(layoutParams);
        } else if (c4345a.f15691G != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textView.getLayoutParams();
            C4345a.a aVar = c4345a.f15691G;
            layoutParams2.setMargins(aVar.f15724a, aVar.f15725b, aVar.f15726c, aVar.f15727d);
        }
        if (c4345a.f15694J) {
            textView.setGravity(1);
        }
        if (c4345a.f15712o) {
            textView.setTypeface(Typeface.defaultFromStyle(1));
        }
        textView.setTextColor(c4345a.f15713p);
        textView.setTextSize(c4345a.f15716s);
        if (!TextUtils.isEmpty(c4345a.f15714q)) {
            textView.setTextColor(Color.parseColor(c4345a.f15714q));
        }
        int i = c4345a.f15717t;
        if (i > 0) {
            textView.setMaxWidth(t100.m186890d(i));
        }
        textView.setText(c4345a.f15715r);
        c4345a.m20877s(viewInflate);
    }

    /* JADX INFO: renamed from: i */
    public void m20898i(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c cVar = this.f15741a.get(str);
        if (NullChecker.m81303a(cVar)) {
            C4345a c4345a = cVar.f15751d;
            if (NullChecker.m81304b(c4345a) && NullChecker.m81303a(c4345a.f15708k)) {
                c4345a.f15708k.mo20885a(str);
            }
            if (z) {
                m20900k(str);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m20899j() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f15741a.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        if (vwb.m200296J(arrayList)) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m20900k((String) it2.next());
        }
    }

    /* JADX INFO: renamed from: k */
    public void m20900k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final c cVarRemove = this.f15741a.remove(str);
        if (NullChecker.m81303a(cVarRemove)) {
            final BubbleView bubbleView = cVarRemove.f15750c;
            if (NullChecker.m81303a(bubbleView)) {
                bubbleView.m20834i();
                dqi dqiVar = new dqi(0.0f);
                kqf0 kqf0VarM208547j = new kqf0(dqiVar).m146943r(new vqf0().m199490d(0.61f).m199492f(600.0f)).m208547j(0.0f);
                float[] fArrM20836k = bubbleView.m20836k();
                bubbleView.setPivotX(fArrM20836k[0]);
                bubbleView.setPivotY(fArrM20836k[1]);
                kqf0VarM208547j.m208540b(new xee.InterfaceC21139r() { // from class: com.p1.mobile.android.ui.bubble.b
                    @Override // p149l.xee.InterfaceC21139r
                    /* JADX INFO: renamed from: a */
                    public final void mo20888a(xee xeeVar, float f, float f2) {
                        C4348d.m20890b(bubbleView, cVarRemove, xeeVar, f, f2);
                    }
                });
                kqf0VarM208547j.m208547j(220.0f).m146940o(0.0f);
            }
            C4345a c4345a = cVarRemove.f15751d;
            if (NullChecker.m81303a(c4345a) && NullChecker.m81303a(c4345a.f15709l)) {
                c4345a.f15709l.mo20886a(str);
            }
            if (NullChecker.m81303a(c4345a) && NullChecker.m81303a(c4345a.f15695K)) {
                c4345a.f15695K.mo21109a(c4345a);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final String m20901m() {
        int i = this.f15742b;
        this.f15742b = i + 1;
        return String.valueOf(i);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m20902n(String str, C4319c c4319c) {
        this.f15741a.remove(str);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Boolean m20903o(String str, View view, C4345a c4345a) {
        if (m20912x(str)) {
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            view.getLocalVisibleRect(new Rect());
            Rect rect2 = new Rect();
            view.getGlobalVisibleRect(rect2);
            m20911w(c4345a, rect2, rect, view, str);
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m20904p(final View view, final String str, final C4345a c4345a, int[] iArr) {
        xdl0.m208366b0(view, new v9j() { // from class: l.qf3
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f154078a.m20903o(str, view, c4345a);
            }
        });
        if (m20912x(str)) {
            view.invalidate();
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Boolean m20905q(String str, FrameLayout frameLayout, Rect rect, C4345a c4345a, Rect rect2, BubbleView bubbleView, View view, View view2) {
        if (m20912x(str)) {
            Rect rect3 = new Rect();
            frameLayout.getGlobalVisibleRect(rect3);
            int i = rect.left;
            boolean z = c4345a.f15688D;
            int i2 = i - (z ? rect3.left : 0);
            int i3 = rect.top;
            int i4 = rect2.top;
            bubbleView.m20844s(c4345a, new Rect(i2, i3 - i4, rect.right + (z ? rect3.left : 0), rect.bottom - i4), view.getWidth(), view.getHeight(), str);
            int[] iArrM20837l = bubbleView.m20837l();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            int i5 = rect2.top - rect3.top;
            Rect rect4 = new Rect();
            view2.getGlobalVisibleRect(rect4);
            int i6 = i5 + (rect4.top - rect.top);
            layoutParams.leftMargin = iArrM20837l[0] + c4345a.f15700c;
            layoutParams.topMargin = iArrM20837l[1] + c4345a.f15701d + i6;
            frameLayout.addView(bubbleView, layoutParams);
            bubbleView.m20845t(str);
            if (NullChecker.m81303a(c4345a.f15710m)) {
                c4345a.f15710m.mo20887a(bubbleView);
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
    public final boolean m20906r(String str, BubbleView bubbleView, View view, C4345a c4345a) {
        c cVar = this.f15741a.get(str);
        if (!NullChecker.m81303a(cVar)) {
            return false;
        }
        cVar.f15750c = bubbleView;
        cVar.f15749b = new WeakReference<>(view);
        cVar.f15751d = c4345a;
        return true;
    }

    /* JADX INFO: renamed from: s */
    public void m20907s(final C4345a c4345a, final View view, final String str) {
        if (c4345a.f15720w == null) {
            m20897h(c4345a, view);
        }
        this.f15741a.put(str, new c(str, c4345a));
        Context context = view.getContext();
        if (context instanceof Act) {
            ((Act) context).lifecycle().filter(new w9j() { // from class: l.nf3
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15552m);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.of3
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f143620a.m20902n(str, (C4319c) obj);
                }
            }));
        }
        xdl0.m208353Q0(view, new e30() { // from class: l.pf3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148511a.m20904p(view, str, c4345a, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public String m20908t(C4345a c4345a, View view) {
        if (view == null) {
            return this.f15743c;
        }
        String strM20901m = m20901m();
        m20909u(c4345a, view, strM20901m);
        return strM20901m;
    }

    /* JADX INFO: renamed from: u */
    public void m20909u(C4345a c4345a, View view, String str) {
        m20910v(c4345a, view, str, 1);
    }

    /* JADX INFO: renamed from: v */
    public void m20910v(C4345a c4345a, View view, String str, int i) {
        if (view == null || TextUtils.isEmpty(str) || this.f15741a.containsKey(str) || wc80.m202636e().m202643k()) {
            return;
        }
        e51.m114739D();
        if (!C4371a.m21100p().m21108I() || !(view.getContext() instanceof Act)) {
            wc80.m202636e().m202649q(uc80.m192995a(c4345a).m193007r(new WeakReference<>(view)).m193003n(str).m193005p(i));
        } else {
            c4345a.m20862c(str, view);
            C4371a.m21100p().m21103C(new h0m(str), (Act) view.getContext(), c4345a, C4371a.m21095F(i));
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m20911w(final C4345a c4345a, final Rect rect, final Rect rect2, final View view, final String str) {
        FrameLayout frameLayout;
        View rootView = view.getRootView();
        if (NullChecker.m81304b(rootView)) {
            View viewFindViewById = c4345a.f15722y;
            if (viewFindViewById == null) {
                viewFindViewById = rootView.findViewById(R.id.content);
            }
            final View view2 = viewFindViewById;
            if (view2 instanceof ViewGroup) {
                if (c4345a.f15686B != 0) {
                    frameLayout = new FrameLayout(view.getContext());
                    BubbleBackgroundView bubbleBackgroundView = new BubbleBackgroundView(view.getContext());
                    bubbleBackgroundView.setBackgroundPaintColor(c4345a.f15686B);
                    bubbleBackgroundView.setTargetViewRect(rect);
                    bubbleBackgroundView.setTargetViewRadius(c4345a.f15687C);
                    xdl0.m208329E0(bubbleBackgroundView, new View.OnClickListener() { // from class: l.rf3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            C4348d.m20892d(view3);
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
                if (m20906r(str, bubbleView, frameLayout2, c4345a)) {
                    if (c4345a.f15723z) {
                        frameLayout2.setOnClickListener(new a(str));
                    }
                    if (c4345a.f15685A) {
                        frameLayout2.setOnTouchListener(new b(str));
                    }
                    xdl0.m208366b0(frameLayout2, new v9j() { // from class: com.p1.mobile.android.ui.bubble.c
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return this.f15731a.m20905q(str, frameLayout2, rect, c4345a, rect2, bubbleView, view2, view);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public boolean m20912x(String str) {
        return this.f15741a.containsKey(str);
    }
}
