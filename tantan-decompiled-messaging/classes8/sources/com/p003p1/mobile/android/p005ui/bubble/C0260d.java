package com.p003p1.mobile.android.p005ui.bubble;

import android.R;
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
import com.p003p1.mobile.android.app.Act;
import com.p003p1.mobile.android.app.C0231c;
import com.p003p1.mobile.android.p005ui.bubble.C0260d;
import com.p003p1.mobile.android.p005ui.poplevel.C0283a;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import l.dqi;
import l.e30;
import l.kqf0;
import l.t100;
import l.v9j;
import l.vqf0;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.xee;
import p007l.b6c0;
import p007l.e51;
import p007l.h0m;
import p007l.mkd0;
import p007l.p4c0;
import p007l.uc80;
import p007l.wc80;

/* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.d */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0260d {

    /* JADX INFO: renamed from: d */
    public static C0260d f1439d = new C0260d();

    /* JADX INFO: renamed from: b */
    public int f1441b = 0;

    /* JADX INFO: renamed from: c */
    public String f1442c = "fail_tips";

    /* JADX INFO: renamed from: a */
    public HashMap<String, c> f1440a = new HashMap<>();

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.d$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f1443a;

        public a(String str) {
            this.f1443a = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0260d.this.m1171k(this.f1443a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.d$b */
    public class b implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f1445a;

        public b(String str) {
            this.f1445a = str;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            C0260d.this.m1171k(this.f1445a);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.d$c */
    public class c {

        /* JADX INFO: renamed from: a */
        public String f1447a;

        /* JADX INFO: renamed from: b */
        public WeakReference<View> f1448b;

        /* JADX INFO: renamed from: c */
        public BubbleView f1449c;

        /* JADX INFO: renamed from: d */
        public C0257a f1450d;

        public c(String str, C0257a c0257a) {
            this.f1447a = str;
            this.f1450d = c0257a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1161b(BubbleView bubbleView, c cVar, xee xeeVar, float f, float f2) {
        float f3 = f / 220.0f;
        bubbleView.setScaleX(f3);
        bubbleView.setScaleY(f3);
        if (f3 <= 0.0f) {
            WeakReference<View> weakReference = cVar.f1448b;
            View view = weakReference != null ? weakReference.get() : null;
            if (NullChecker.a(view) && (view.getParent() instanceof ViewGroup)) {
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
    public static /* synthetic */ void m1163d(View view) {
    }

    /* JADX INFO: renamed from: l */
    public static C0260d m1167l() {
        return f1439d;
    }

    /* JADX INFO: renamed from: h */
    public final void m1168h(C0257a c0257a, View view) {
        View viewInflate = LayoutInflater.from(view.getContext()).inflate(b6c0.f1923i, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(p4c0.f3674l);
        TextView textView = (TextView) viewInflate.findViewById(p4c0.f3672k);
        Integer num = c0257a.f1389F;
        if (num != null) {
            textView.setBreakStrategy(num.intValue());
        }
        if (c0257a.f1417u != null) {
            imageView.setVisibility(0);
            imageView.setImageResource(c0257a.f1417u.intValue());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.setMarginStart(0);
            layoutParams.setMarginEnd(t100.m);
            textView.setLayoutParams(layoutParams);
        } else if (c0257a.f1390G != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textView.getLayoutParams();
            C0257a.a aVar = c0257a.f1390G;
            layoutParams2.setMargins(aVar.f1423a, aVar.f1424b, aVar.f1425c, aVar.f1426d);
        }
        if (c0257a.f1393J) {
            textView.setGravity(1);
        }
        if (c0257a.f1411o) {
            textView.setTypeface(Typeface.defaultFromStyle(1));
        }
        textView.setTextColor(c0257a.f1412p);
        textView.setTextSize(c0257a.f1415s);
        if (!TextUtils.isEmpty(c0257a.f1413q)) {
            textView.setTextColor(Color.parseColor(c0257a.f1413q));
        }
        int i = c0257a.f1416t;
        if (i > 0) {
            textView.setMaxWidth(t100.d(i));
        }
        textView.setText(c0257a.f1414r);
        c0257a.m1148s(viewInflate);
    }

    /* JADX INFO: renamed from: i */
    public void m1169i(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c cVar = this.f1440a.get(str);
        if (NullChecker.a(cVar)) {
            C0257a c0257a = cVar.f1450d;
            if (NullChecker.b(c0257a) && NullChecker.a(c0257a.f1407k)) {
                c0257a.f1407k.m1156a(str);
            }
            if (z) {
                m1171k(str);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m1170j() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f1440a.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        if (vwb.J(arrayList)) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m1171k((String) it2.next());
        }
    }

    /* JADX INFO: renamed from: k */
    public void m1171k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final c cVarRemove = this.f1440a.remove(str);
        if (NullChecker.a(cVarRemove)) {
            final BubbleView bubbleView = cVarRemove.f1449c;
            if (NullChecker.a(bubbleView)) {
                bubbleView.m1105i();
                dqi dqiVar = new dqi(0.0f);
                kqf0 kqf0VarJ = new kqf0(dqiVar).r(new vqf0().d(0.61f).f(600.0f)).j(0.0f);
                float[] fArrM1107k = bubbleView.m1107k();
                bubbleView.setPivotX(fArrM1107k[0]);
                bubbleView.setPivotY(fArrM1107k[1]);
                kqf0VarJ.b(new xee.r() { // from class: com.p1.mobile.android.ui.bubble.b
                    /* JADX INFO: renamed from: a */
                    public final void m1159a(xee xeeVar, float f, float f2) {
                        C0260d.m1161b(bubbleView, cVarRemove, xeeVar, f, f2);
                    }
                });
                kqf0VarJ.j(220.0f).o(0.0f);
            }
            C0257a c0257a = cVarRemove.f1450d;
            if (NullChecker.a(c0257a) && NullChecker.a(c0257a.f1408l)) {
                c0257a.f1408l.m1157a(str);
            }
            if (NullChecker.a(c0257a) && NullChecker.a(c0257a.f1394K)) {
                c0257a.f1394K.mo1381a(c0257a);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final String m1172m() {
        int i = this.f1441b;
        this.f1441b = i + 1;
        return String.valueOf(i);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m1173n(String str, C0231c c0231c) {
        this.f1440a.remove(str);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Boolean m1174o(String str, View view, C0257a c0257a) {
        if (m1183x(str)) {
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            view.getLocalVisibleRect(new Rect());
            Rect rect2 = new Rect();
            view.getGlobalVisibleRect(rect2);
            m1182w(c0257a, rect2, rect, view, str);
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m1175p(final View view, final String str, final C0257a c0257a, int[] iArr) {
        xdl0.b0(view, new v9j() { // from class: l.qf3
            public final Object call() {
                return this.f3863a.m1174o(str, view, c0257a);
            }
        });
        if (m1183x(str)) {
            view.invalidate();
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Boolean m1176q(String str, FrameLayout frameLayout, Rect rect, C0257a c0257a, Rect rect2, BubbleView bubbleView, View view, View view2) {
        if (m1183x(str)) {
            Rect rect3 = new Rect();
            frameLayout.getGlobalVisibleRect(rect3);
            int i = rect.left;
            boolean z = c0257a.f1387D;
            int i2 = i - (z ? rect3.left : 0);
            int i3 = rect.top;
            int i4 = rect2.top;
            bubbleView.m1115s(c0257a, new Rect(i2, i3 - i4, rect.right + (z ? rect3.left : 0), rect.bottom - i4), view.getWidth(), view.getHeight(), str);
            int[] iArrM1108l = bubbleView.m1108l();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            int i5 = rect2.top - rect3.top;
            Rect rect4 = new Rect();
            view2.getGlobalVisibleRect(rect4);
            int i6 = i5 + (rect4.top - rect.top);
            layoutParams.leftMargin = iArrM1108l[0] + c0257a.f1399c;
            layoutParams.topMargin = iArrM1108l[1] + c0257a.f1400d + i6;
            frameLayout.addView(bubbleView, layoutParams);
            bubbleView.m1116t(str);
            if (NullChecker.a(c0257a.f1409m)) {
                c0257a.f1409m.m1158a(bubbleView);
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
    public final boolean m1177r(String str, BubbleView bubbleView, View view, C0257a c0257a) {
        c cVar = this.f1440a.get(str);
        if (!NullChecker.a(cVar)) {
            return false;
        }
        cVar.f1449c = bubbleView;
        cVar.f1448b = new WeakReference<>(view);
        cVar.f1450d = c0257a;
        return true;
    }

    /* JADX INFO: renamed from: s */
    public void m1178s(final C0257a c0257a, final View view, final String str) {
        if (c0257a.f1419w == null) {
            m1168h(c0257a, view);
        }
        this.f1440a.put(str, new c(str, c0257a));
        Object context = view.getContext();
        if (context instanceof Act) {
            ((Act) context).lifecycle().filter(new w9j() { // from class: l.nf3
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C0231c) obj) == C0231c.f1251m);
                }
            }).subscribe(mkd0.m9874G(new e30() { // from class: l.of3
                public final void call(Object obj) {
                    this.f3541a.m1173n(str, (C0231c) obj);
                }
            }));
        }
        xdl0.Q0(view, new e30() { // from class: l.pf3
            public final void call(Object obj) {
                this.f3720a.m1175p(view, str, c0257a, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public String m1179t(C0257a c0257a, View view) {
        if (view == null) {
            return this.f1442c;
        }
        String strM1172m = m1172m();
        m1180u(c0257a, view, strM1172m);
        return strM1172m;
    }

    /* JADX INFO: renamed from: u */
    public void m1180u(C0257a c0257a, View view, String str) {
        m1181v(c0257a, view, str, 1);
    }

    /* JADX INFO: renamed from: v */
    public void m1181v(C0257a c0257a, View view, String str, int i) {
        if (view == null || TextUtils.isEmpty(str) || this.f1440a.containsKey(str) || wc80.m11338e().m11345k()) {
            return;
        }
        e51.m9021D();
        if (!C0283a.m1372p().m1380I() || !(view.getContext() instanceof Act)) {
            wc80.m11338e().m11351q(uc80.m11203a(c0257a).m11215r(new WeakReference<>(view)).m11211n(str).m11213p(i));
        } else {
            c0257a.m1133c(str, view);
            C0283a.m1372p().m1375C(new h0m(str), (Act) view.getContext(), c0257a, C0283a.m1367F(i));
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m1182w(final C0257a c0257a, final Rect rect, final Rect rect2, final View view, final String str) {
        FrameLayout frameLayout;
        View rootView = view.getRootView();
        if (NullChecker.b(rootView)) {
            View viewFindViewById = c0257a.f1421y;
            if (viewFindViewById == null) {
                viewFindViewById = rootView.findViewById(R.id.content);
            }
            final View view2 = viewFindViewById;
            if (view2 instanceof ViewGroup) {
                if (c0257a.f1385B != 0) {
                    frameLayout = new FrameLayout(view.getContext());
                    BubbleBackgroundView bubbleBackgroundView = new BubbleBackgroundView(view.getContext());
                    bubbleBackgroundView.setBackgroundPaintColor(c0257a.f1385B);
                    bubbleBackgroundView.setTargetViewRect(rect);
                    bubbleBackgroundView.setTargetViewRadius(c0257a.f1386C);
                    xdl0.E0(bubbleBackgroundView, new View.OnClickListener() { // from class: l.rf3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            C0260d.m1163d(view3);
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
                if (m1177r(str, bubbleView, frameLayout2, c0257a)) {
                    if (c0257a.f1422z) {
                        frameLayout2.setOnClickListener(new a(str));
                    }
                    if (c0257a.f1384A) {
                        frameLayout2.setOnTouchListener(new b(str));
                    }
                    xdl0.b0(frameLayout2, new v9j() { // from class: com.p1.mobile.android.ui.bubble.c
                        public final Object call() {
                            return this.f1430a.m1176q(str, frameLayout2, rect, c0257a, rect2, bubbleView, view2, view);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public boolean m1183x(String str) {
        return this.f1440a.containsKey(str);
    }
}
