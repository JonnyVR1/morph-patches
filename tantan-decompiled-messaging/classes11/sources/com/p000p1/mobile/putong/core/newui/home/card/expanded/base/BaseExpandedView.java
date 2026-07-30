package com.p000p1.mobile.putong.core.newui.home.card.expanded.base;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.base.C0113a;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.c4g0;
import l.e30;
import l.mkd0;
import l.t100;
import l.vwb;
import l.w9j;
import p009l.alf;
import p009l.emf;
import p009l.lnf;
import p009l.oql;
import p009l.xkf;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class BaseExpandedView extends FrameLayout implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public alf f1116a;

    /* JADX INFO: renamed from: b */
    public List<oql> f1117b;

    /* JADX INFO: renamed from: c */
    public C0112b f1118c;

    /* JADX INFO: renamed from: d */
    public a<Integer> f1119d;

    /* JADX INFO: renamed from: e */
    public final int f1120e;

    /* JADX INFO: renamed from: f */
    public int f1121f;

    /* JADX INFO: renamed from: g */
    public int f1122g;

    /* JADX INFO: renamed from: h */
    public int f1123h;

    /* JADX INFO: renamed from: i */
    public VelocityTracker f1124i;

    /* JADX INFO: renamed from: j */
    public int f1125j;

    /* JADX INFO: renamed from: k */
    public int f1126k;

    /* JADX INFO: renamed from: l */
    public int f1127l;

    /* JADX INFO: renamed from: m */
    public int f1128m;

    /* JADX INFO: renamed from: n */
    public int f1129n;

    /* JADX INFO: renamed from: o */
    public int f1130o;

    /* JADX INFO: renamed from: p */
    public int f1131p;

    /* JADX INFO: renamed from: q */
    public c4g0 f1132q;

    /* JADX INFO: renamed from: r */
    public List<C0113a> f1133r;

    /* JADX INFO: renamed from: s */
    public boolean f1134s;

    /* JADX INFO: renamed from: t */
    public ScrollState f1135t;

    /* JADX INFO: renamed from: u */
    public ValueAnimator f1136u;

    /* JADX INFO: renamed from: v */
    public TimeInterpolator f1137v;

    public enum ExpandedItemStatus {
        IDLE("未初始化"),
        PRE_REMOVE("准备删除"),
        PRE_RECYCLE("准备复用"),
        BE_RECYCLE("被复用"),
        RENDING("渲染中");

        String status;

        ExpandedItemStatus(String str) {
            this.status = str;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.base.BaseExpandedView$a */
    public class C0111a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public int f1138a;

        /* JADX INFO: renamed from: b */
        public int f1139b = 0;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f1140c;

        public C0111a(int i) {
            this.f1140c = i;
            this.f1138a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            int iFloatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseExpandedView.this.f1118c.f1164u = iFloatValue;
            int i = this.f1138a - iFloatValue;
            this.f1139b += i;
            this.f1138a = iFloatValue;
            BaseExpandedView.this.m2004i1(-i, "auto-scroll-top");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.base.BaseExpandedView$b */
    public class C0112b {

        /* JADX INFO: renamed from: a */
        public long f1144a;

        /* JADX INFO: renamed from: b */
        public long f1145b;

        /* JADX INFO: renamed from: c */
        public int f1146c;

        /* JADX INFO: renamed from: d */
        public int f1147d;

        /* JADX INFO: renamed from: f */
        public int f1149f;

        /* JADX INFO: renamed from: g */
        public int f1150g;

        /* JADX INFO: renamed from: h */
        public int f1151h;

        /* JADX INFO: renamed from: i */
        public int f1152i;

        /* JADX INFO: renamed from: l */
        public String f1155l;

        /* JADX INFO: renamed from: y */
        public int f1168y;

        /* JADX INFO: renamed from: e */
        public DecelerateInterpolator f1148e = new DecelerateInterpolator(1.7f);

        /* JADX INFO: renamed from: j */
        public boolean f1153j = false;

        /* JADX INFO: renamed from: k */
        public boolean f1154k = false;

        /* JADX INFO: renamed from: m */
        public boolean f1156m = true;

        /* JADX INFO: renamed from: n */
        public boolean f1157n = false;

        /* JADX INFO: renamed from: o */
        public int f1158o = 20;

        /* JADX INFO: renamed from: p */
        public int f1159p = 0;

        /* JADX INFO: renamed from: q */
        public int f1160q = -1;

        /* JADX INFO: renamed from: r */
        public int f1161r = -1;

        /* JADX INFO: renamed from: s */
        public int f1162s = -1;

        /* JADX INFO: renamed from: t */
        public int f1163t = -1;

        /* JADX INFO: renamed from: u */
        public int f1164u = 0;

        /* JADX INFO: renamed from: v */
        public int f1165v = 0;

        /* JADX INFO: renamed from: w */
        public int f1166w = 0;

        /* JADX INFO: renamed from: x */
        public int f1167x = 0;

        /* JADX INFO: renamed from: z */
        public SparseArray<Pair<Boolean, Integer>> f1169z = new SparseArray<>();

        /* JADX INFO: renamed from: A */
        public int f1142A = 0;

        public C0112b() {
        }

        /* JADX INFO: renamed from: P */
        public void m2049P(int i) {
            this.f1142A = i | this.f1142A;
        }

        /* JADX INFO: renamed from: Q */
        public final boolean m2050Q() {
            return this.f1145b <= 0 || this.f1144a <= 0 || SystemClock.elapsedRealtime() > this.f1144a;
        }

        /* JADX INFO: renamed from: R */
        public boolean m2051R(int i) {
            return this.f1142A == i;
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0014 A[PHI: r0
          0x0014: PHI (r0v15 float) = (r0v3 float), (r0v4 float) binds: [B:3:0x0012, B:6:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX INFO: renamed from: S */
        public final int m2052S() {
            float fElapsedRealtime = (SystemClock.elapsedRealtime() - this.f1145b) / (this.f1144a - this.f1145b);
            float f = 0.0f;
            if (fElapsedRealtime < 0.0f) {
                fElapsedRealtime = f;
            } else {
                f = 1.0f;
                if (fElapsedRealtime > 1.0f) {
                    fElapsedRealtime = f;
                }
            }
            float interpolation = this.f1148e.getInterpolation(fElapsedRealtime);
            int i = this.f1146c;
            int iCeil = (int) (i > 0 ? Math.ceil(i * interpolation) : Math.floor(i * interpolation));
            if (Math.abs(iCeil) >= Math.abs(this.f1146c)) {
                iCeil = this.f1146c;
                this.f1145b = 0L;
            }
            int i2 = iCeil - this.f1147d;
            this.f1147d = iCeil;
            return i2;
        }

        /* JADX INFO: renamed from: T */
        public final void m2053T(long j, int i) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f1145b = jElapsedRealtime;
            this.f1144a = jElapsedRealtime + j;
            this.f1146c = i;
            this.f1147d = 0;
        }

        /* JADX INFO: renamed from: U */
        public final void m2054U() {
            this.f1153j = false;
            int i = this.f1142A;
            if (i == 16 || i == 17) {
                this.f1142A = 16;
            } else {
                this.f1142A = 0;
            }
            this.f1164u = 0;
            this.f1169z = new SparseArray<>();
            this.f1167x = 0;
            this.f1165v = 0;
            this.f1168y = 0;
            this.f1166w = 0;
            this.f1155l = null;
            this.f1156m = true;
            this.f1157n = false;
            this.f1160q = -1;
            this.f1161r = -1;
            BaseExpandedView.this.m2002g1(ScrollState.IDLE);
        }

        /* JADX INFO: renamed from: V */
        public void m2055V() {
            this.f1145b = 0L;
            this.f1144a = 0L;
        }
    }

    public BaseExpandedView(@NonNull Context context) {
        super(context);
        this.f1119d = a.b();
        this.f1120e = 18000;
        this.f1129n = 0;
        this.f1130o = 0;
        this.f1131p = 0;
        this.f1132q = null;
        this.f1133r = new ArrayList();
        this.f1134s = false;
        this.f1135t = ScrollState.IDLE;
        this.f1137v = new DecelerateInterpolator();
        m1967Q0();
    }

    /* JADX INFO: renamed from: P0 */
    private void m1966P0() {
        if (this.f1124i == null) {
            this.f1124i = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    private void m1967Q0() {
        this.f1118c = new C0112b();
        this.f1121f = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1122g = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1123h = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1117b = new ArrayList();
        setElevation(0.0f);
    }

    private int getItemAllHeight() {
        int iIntValue = 0;
        for (int i = 0; i < this.f1133r.size(); i++) {
            iIntValue += ((Integer) ((Pair) this.f1118c.f1169z.get(i)).second).intValue();
        }
        return iIntValue;
    }

    private String getRendingInfo() {
        StringBuilder sb = new StringBuilder();
        for (C0113a c0113a : this.f1133r) {
            sb.append(c0113a.f1182m + "," + c0113a.f1173d + "," + c0113a.f1175f + " , " + c0113a.f1184o);
            sb.append(" | ");
        }
        sb.append(" 字数量：" + getChildCount());
        return sb.toString();
    }

    private int getTopEmptyFixHeight() {
        return this.f1130o;
    }

    private int getTopFix() {
        return this.f1126k;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m1971D0(String str) {
        m1972E0(str, false);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m1972E0(String str, boolean z) {
        if (this.f1118c.f1165v < 0 || this.f1118c.f1165v >= this.f1133r.size() || this.f1133r.size() == 0) {
            this.f1118c.f1165v = 0;
            this.f1118c.f1167x = 0;
            return;
        }
        this.f1118c.f1167x = 0;
        for (int i = 0; i < this.f1133r.size(); i++) {
            C0113a c0113a = this.f1133r.get(i);
            if (c0113a.f1182m == ExpandedItemStatus.RENDING && c0113a.f1173d <= 0 && c0113a.f1175f > 0) {
                if (this.f1118c.f1165v == i && i == 0 && c0113a.f1173d == 0 && this.f1118c.f1167x != 0) {
                    int unused = this.f1118c.f1165v;
                }
                this.f1118c.f1165v = i;
                this.f1118c.f1167x = c0113a.f1173d;
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m1973F0() {
        C0112b c0112b;
        if (this.f1133r == null || (c0112b = this.f1118c) == null || c0112b.f1163t <= 0 || this.f1118c.f1162s <= 0) {
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f1133r.size(); i++) {
            C0113a c0113a = this.f1133r.get(i);
            if (c0113a.f1182m == ExpandedItemStatus.RENDING && c0113a.getView() != null) {
                m1993a1(c0113a, i, c0113a.f1184o, false);
                z = true;
            }
        }
        if (z) {
            m1991Y0();
            m1971D0("measure once");
            m2006s0();
            if (this.f1118c.f1168y < this.f1118c.f1162s) {
                m1977J0();
            }
            m1985T0("checkChildRequestLayout");
            m1980M0();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m1974G0(C0113a c0113a) {
        if (c0113a.getView() != null) {
            if (c0113a.getView().getTop() == 0 && c0113a.getView().getBottom() == 0) {
                return;
            }
            c0113a.getView().layout(0, 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m1975H0() {
        mkd0.z(this.f1132q);
    }

    /* JADX INFO: renamed from: I0 */
    public void m1976I0(boolean z) {
        C0112b c0112b = this.f1118c;
        if (z) {
            c0112b.f1156m = true;
            return;
        }
        c0112b.m2054U();
        int i = 0;
        this.f1118c.f1156m = false;
        m1996c1(true);
        while (true) {
            int size = this.f1133r.size();
            List<C0113a> list = this.f1133r;
            if (i >= size) {
                list.clear();
                return;
            }
            C0113a c0113a = list.get(i);
            if (c0113a.getView() != null) {
                m1992Z0(c0113a);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m1977J0() {
        int i = this.f1118c.f1166w;
        while (true) {
            i++;
            if (i >= this.f1133r.size()) {
                return;
            }
            C0113a c0113a = this.f1133r.get(i);
            ExpandedItemStatus expandedItemStatus = c0113a.f1182m;
            if (expandedItemStatus != ExpandedItemStatus.RENDING) {
                ExpandedItemStatus expandedItemStatus2 = ExpandedItemStatus.IDLE;
                alf alfVar = this.f1116a;
                if (expandedItemStatus == expandedItemStatus2) {
                    int iMo11507e = alfVar.mo11507e(i);
                    xkf xkfVarM1981N0 = m1981N0(iMo11507e);
                    View view = xkfVarM1981N0.f22639a;
                    addView(view, view.getLayoutParams());
                    c0113a.f1170a = xkfVarM1981N0;
                    m2005l0(c0113a, i, iMo11507e, "fill bottom idle");
                    c0113a.f1172c = 0;
                    c0113a.f1173d = this.f1118c.f1168y;
                    c0113a.f1174e = this.f1118c.f1163t;
                    int i2 = c0113a.f1173d + c0113a.f1177h;
                    c0113a.f1175f = i2;
                    this.f1118c.f1168y = i2;
                    this.f1118c.f1166w = i;
                } else {
                    m2005l0(c0113a, i, alfVar.mo11507e(i), "fill bottom recycle");
                    c0113a.f1172c = 0;
                    c0113a.f1173d = this.f1118c.f1168y;
                    c0113a.f1174e = this.f1118c.f1163t;
                    int i3 = c0113a.f1173d + c0113a.f1177h;
                    c0113a.f1175f = i3;
                    this.f1118c.f1168y = i3;
                    this.f1118c.f1166w = i;
                }
            } else if (i == this.f1133r.size() - 1 && c0113a.f1175f <= this.f1118c.f1162s) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m1978K0() {
        if (this.f1118c.m2051R(17)) {
            m1979L0();
            this.f1119d.onNext(Integer.valueOf(this.f1133r.size()));
        } else if (this.f1118c.m2051R(1)) {
            requestLayout();
        } else {
            this.f1118c.m2051R(16);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m1979L0() {
        int i;
        System.currentTimeMillis();
        this.f1118c.f1154k = true;
        m1996c1(false);
        int i2 = this.f1118c.f1165v;
        if (i2 < 0 || i2 >= this.f1116a.mo11505c()) {
            this.f1118c.f1167x = 0;
            this.f1118c.f1165v = 0;
            i2 = 0;
        }
        int i3 = this.f1118c.f1167x;
        while (i3 < this.f1118c.f1162s && i2 < this.f1116a.mo11505c() && i2 < this.f1133r.size()) {
            C0113a c0113a = this.f1133r.get(i2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            ExpandedItemStatus expandedItemStatus = c0113a.f1182m;
            if (expandedItemStatus == ExpandedItemStatus.IDLE) {
                int iMo11507e = this.f1116a.mo11507e(i2);
                xkf xkfVarM1981N0 = m1981N0(iMo11507e);
                new StringBuilder("Type: ").append(iMo11507e);
                new StringBuilder(" crTime: ").append(System.currentTimeMillis() - jCurrentTimeMillis);
                View view = xkfVarM1981N0.f22639a;
                addView(view, view.getLayoutParams());
                c0113a.f1170a = xkfVarM1981N0;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                m2005l0(c0113a, i2, iMo11507e, "idle create");
                new StringBuilder("Type: ").append(iMo11507e);
                new StringBuilder(" bdTime: ").append(System.currentTimeMillis() - jCurrentTimeMillis2);
                i = c0113a.f1177h;
            } else {
                if (expandedItemStatus == ExpandedItemStatus.BE_RECYCLE) {
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    m2005l0(c0113a, i2, c0113a.getType(), "be_recycle");
                    new StringBuilder("Type: ").append(c0113a.f1184o);
                    new StringBuilder(" rdTime: ").append(System.currentTimeMillis() - jCurrentTimeMillis3);
                    i = c0113a.f1177h;
                } else if (expandedItemStatus == ExpandedItemStatus.RENDING) {
                    m1993a1(c0113a, i2, this.f1116a.mo11507e(i2), false);
                    c0113a.f1171b = false;
                }
                i2++;
            }
            i3 += i;
            i2++;
        }
        m1986U0("before order");
        m1991Y0();
        m1986U0("after order");
        m1971D0("fill list");
        m2006s0();
        m1985T0("fillListInner");
        m1980M0();
        this.f1118c.f1154k = false;
    }

    /* JADX INFO: renamed from: M0 */
    public final void m1980M0() {
        if (this.f1133r.size() <= 0 || this.f1118c.f1166w != this.f1133r.size() - 1 || this.f1118c.f1168y >= this.f1118c.f1162s) {
            return;
        }
        if ((this.f1118c.f1167x < 0 || this.f1118c.f1165v > 0) && this.f1118c.f1168y + getFixPaddingBottom() + getInnerTransY() < this.f1118c.f1162s) {
            m2004i1((((this.f1118c.f1168y + getTopFix()) + getFixPaddingBottom()) + getInnerTransY()) - this.f1118c.f1162s, "fix-notify-opt");
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final xkf m1981N0(int i) {
        View viewM13976a = m1988W0().m13976a(i);
        return viewM13976a == null ? this.f1116a.mo11504b(this, i) : (xkf) viewM13976a.getTag(xkf.f22638d.hashCode());
    }

    /* JADX INFO: renamed from: O0 */
    public final void m1982O0() {
        List<C0113a> list = this.f1133r;
        if (list != null) {
            for (C0113a c0113a : list) {
                if (c0113a.getView() != null) {
                    if (c0113a.f1175f <= getTopFix() || c0113a.f1173d >= this.f1118c.f1162s) {
                        c0113a.f1170a.m24926u(false, 0, 0, getHeight());
                    } else {
                        c0113a.f1170a.m24926u(true, c0113a.f1173d, c0113a.f1175f, getHeight());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ Boolean m1983R0(C0113a c0113a) {
        return Boolean.valueOf(c0113a.f1184o == this.f1118c.f1161r);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m1984S0(Object obj) {
        m1990X0();
    }

    /* JADX INFO: renamed from: T0 */
    public final void m1985T0(String str) {
        for (int i = 0; i < this.f1133r.size(); i++) {
            C0113a c0113a = this.f1133r.get(i);
            if (c0113a.f1182m == ExpandedItemStatus.RENDING) {
                c0113a.getView().layout(c0113a.f1172c + c0113a.f1178i + this.f1125j, c0113a.f1173d + c0113a.f1179j + getTopFix() + getInnerTransY(), (c0113a.f1174e - c0113a.f1180k) - this.f1127l, (c0113a.f1175f - c0113a.f1181l) + getTopFix() + getInnerTransY());
            }
        }
        m2001f1();
        m1982O0();
    }

    /* JADX INFO: renamed from: U0 */
    public final void m1986U0(String str) {
    }

    /* JADX INFO: renamed from: V0 */
    public final void m1987V0() {
        List<C0113a> list = this.f1133r;
        if (list != null) {
            Iterator<C0113a> it = list.iterator();
            while (it.hasNext()) {
                xkf xkfVar = it.next().f1170a;
                if (xkfVar != null) {
                    xkfVar.mo2129r();
                }
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public emf m1988W0() {
        return lnf.m17966d().m17967c(getAct());
    }

    /* JADX INFO: renamed from: X */
    public void m1989X(oql oqlVar) {
        if (!this.f1117b.contains(oqlVar)) {
            this.f1117b.add(oqlVar);
        }
        if (NullChecker.a(oqlVar)) {
            oqlVar.m20009s0(this.f1135t);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final void m1990X0() {
        boolean z;
        alf alfVar;
        C0113a c0113a;
        ExpandedItemStatus expandedItemStatus;
        if (!this.f1118c.f1156m || (this.f1118c.f1156m && !TextUtils.equals(this.f1118c.f1155l, this.f1116a.mo11508f()))) {
            m1996c1(true);
            this.f1118c.m2054U();
            z = true;
        } else {
            z = false;
        }
        this.f1118c.f1155l = this.f1116a.mo11508f();
        m1986U0("pre order: " + z);
        if (!z) {
            m1971D0("res render");
        }
        ArrayList arrayList = new ArrayList();
        int iMo11505c = this.f1116a.mo11505c();
        int i = 0;
        while (true) {
            alfVar = this.f1116a;
            if (i >= iMo11505c) {
                break;
            }
            arrayList.add(Integer.valueOf(alfVar.mo11507e(i)));
            i++;
        }
        int iMo11505c2 = alfVar.mo11505c();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < this.f1133r.size(); i2++) {
            C0113a c0113a2 = this.f1133r.get(i2);
            c0113a2.f1171b = false;
            c0113a2.f1183n = false;
            if (c0113a2.f1182m == ExpandedItemStatus.BE_RECYCLE) {
                c0113a2.f1182m = ExpandedItemStatus.PRE_RECYCLE;
            }
        }
        for (int i3 = 0; i3 < iMo11505c2; i3++) {
            int iIntValue = ((Integer) arrayList.get(i3)).intValue();
            int i4 = 0;
            while (true) {
                if (i4 >= this.f1133r.size()) {
                    c0113a = null;
                    break;
                }
                c0113a = this.f1133r.get(i4);
                if (c0113a.f1184o == iIntValue && ((expandedItemStatus = c0113a.f1182m) == ExpandedItemStatus.RENDING || expandedItemStatus == ExpandedItemStatus.PRE_RECYCLE)) {
                    xkf xkfVar = c0113a.f1170a;
                    if (xkfVar == null) {
                        break;
                    }
                    xkfVar.m24923o();
                    c0113a.f1170a.mo12510s();
                    if (!z) {
                        break;
                    }
                    c0113a.f1183n = true;
                    c0113a.f1170a.m24925t();
                    break;
                }
                i4++;
            }
            if (c0113a != null) {
                c0113a.f1182m = ExpandedItemStatus.BE_RECYCLE;
            } else {
                c0113a = new C0113a(iIntValue);
            }
            arrayList2.add(c0113a);
        }
        for (C0113a c0113a3 : this.f1133r) {
            ExpandedItemStatus expandedItemStatus2 = c0113a3.f1182m;
            if (expandedItemStatus2 != ExpandedItemStatus.IDLE && expandedItemStatus2 != ExpandedItemStatus.BE_RECYCLE) {
                c0113a3.f1182m = ExpandedItemStatus.PRE_REMOVE;
            }
        }
        Iterator<C0113a> it = this.f1133r.iterator();
        while (it.hasNext()) {
            C0113a next = it.next();
            if (next.f1182m == ExpandedItemStatus.PRE_REMOVE) {
                xkf xkfVar2 = next.f1170a;
                if (xkfVar2 != null && !next.f1183n) {
                    xkfVar2.m24925t();
                }
                it.remove();
                m1992Z0(next);
            }
        }
        this.f1133r = arrayList2;
        if (this.f1118c.f1161r >= 0) {
            this.f1118c.f1160q = vwb.G(this.f1133r, new w9j() { // from class: l.dk2
                public final Object call(Object obj) {
                    return this.f11863a.m1983R0((C0113a) obj);
                }
            });
        }
        this.f1118c.m2049P(1);
        m2007v0();
        m1978K0();
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m1991Y0() {
        int i = this.f1118c.f1167x;
        for (int i2 = 0; i2 < this.f1133r.size(); i2++) {
            C0113a c0113a = this.f1133r.get(i2);
            ExpandedItemStatus expandedItemStatus = c0113a.f1182m;
            if (expandedItemStatus == ExpandedItemStatus.RENDING) {
                if (i2 >= this.f1118c.f1165v) {
                    c0113a.f1173d = i;
                    c0113a.f1172c = 0;
                    c0113a.f1174e = this.f1118c.f1163t;
                    i = c0113a.f1173d + c0113a.f1177h;
                    c0113a.f1175f = i;
                }
            } else if (expandedItemStatus == ExpandedItemStatus.BE_RECYCLE) {
                c0113a.f1173d = 0;
                c0113a.f1175f = 0;
                m1974G0(c0113a);
            }
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m1992Z0(C0113a c0113a) {
        c0113a.f1170a.mo12510s();
        c0113a.f1170a.m24923o();
        m1988W0().m13978c(c0113a);
        if (c0113a.getView() != null) {
            removeView(c0113a.getView());
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final void m1993a1(C0113a c0113a, int i, int i2, boolean z) {
        ViewGroup.LayoutParams layoutParams = c0113a.getView().getLayoutParams();
        boolean z2 = c0113a.getView().getVisibility() == 8;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            c0113a.f1178i = layoutParams2.leftMargin;
            c0113a.f1179j = layoutParams2.topMargin;
            c0113a.f1180k = layoutParams2.rightMargin;
            c0113a.f1181l = layoutParams2.bottomMargin;
            if (z2) {
                c0113a.f1178i = 0;
                c0113a.f1179j = 0;
                c0113a.f1180k = 0;
                c0113a.f1181l = 0;
            }
        }
        if ((z && !z2) || (!z && !z2 && c0113a.f1170a.f22639a.isLayoutRequested())) {
            c0113a.f1170a.f22639a.measure(View.MeasureSpec.makeMeasureSpec((((this.f1118c.f1163t - this.f1125j) - this.f1127l) - c0113a.f1178i) - c0113a.f1180k, 1073741824), View.MeasureSpec.makeMeasureSpec((((this.f1118c.f1162s - this.f1126k) - this.f1129n) - c0113a.f1179j) - c0113a.f1181l, 0));
        }
        if (z2) {
            c0113a.f1177h = 0;
            c0113a.f1176g = 0;
        } else {
            c0113a.f1177h = c0113a.f1170a.f22639a.getMeasuredHeight() + c0113a.f1179j + c0113a.f1181l;
            c0113a.f1176g = this.f1118c.f1163t + c0113a.f1178i + c0113a.f1180k;
        }
        c0113a.f1171b = false;
        c0113a.f1182m = ExpandedItemStatus.RENDING;
        this.f1118c.f1169z.put(i, Pair.create(Boolean.TRUE, Integer.valueOf(c0113a.f1177h)));
    }

    /* JADX INFO: renamed from: b1 */
    public void m1994b1(int i, int i2, int i3, int i4) {
        this.f1125j = i;
        this.f1126k = i2;
        this.f1127l = i3;
        this.f1128m = i4;
    }

    /* JADX INFO: renamed from: c0 */
    public void m1995c0() {
        xkf firstShowingHolder;
        if (this.f1133r == null || (firstShowingHolder = getFirstShowingHolder()) == null) {
            return;
        }
        firstShowingHolder.m24916h();
    }

    /* JADX INFO: renamed from: c1 */
    public void m1996c1(boolean z) {
        if (z || !this.f1118c.f1157n) {
            Choreographer.getInstance().removeFrameCallback(this);
            this.f1118c.f1157n = false;
            m2002g1(ScrollState.IDLE);
        }
        this.f1118c.m2055V();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b A[PHI: r2
      0x002b: PHI (r2v6 int) = (r2v2 int), (r2v3 int) binds: [B:10:0x0029, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: d0 */
    public final int m1997d0() {
        int i;
        VelocityTracker velocityTracker = this.f1124i;
        velocityTracker.computeCurrentVelocity(1000);
        int yVelocity = (int) (velocityTracker.getYVelocity() / 2.5f);
        if (Math.abs(yVelocity) > this.f1123h) {
            i = 1600;
        } else {
            i = Math.abs(yVelocity) > this.f1122g ? 900 : 300;
        }
        int i2 = 18000;
        if (yVelocity >= 18000) {
            yVelocity = i2;
        } else {
            i2 = -18000;
            if (yVelocity <= -18000) {
                yVelocity = i2;
            }
        }
        m2002g1(ScrollState.SCROLL_ANIM);
        this.f1118c.m2053T(i, -yVelocity);
        Choreographer.getInstance().postFrameCallback(this);
        return yVelocity;
    }

    /* JADX INFO: renamed from: d1 */
    public void m1998d1() {
        Choreographer.getInstance().removeFrameCallback(this);
        if (!this.f1118c.m2050Q()) {
            m2002g1(ScrollState.DRAGGING);
        }
        this.f1118c.f1157n = false;
        this.f1118c.m2055V();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        boolean z = this.f1118c.f1157n;
        C0112b c0112b = this.f1118c;
        if (!z) {
            if (c0112b.m2050Q()) {
                m2002g1(ScrollState.IDLE);
                m1996c1(true);
                return;
            } else if (m2004i1(this.f1118c.m2052S(), "touch_anim")) {
                m2002g1(ScrollState.IDLE);
                return;
            } else {
                Choreographer.getInstance().postFrameCallback(this);
                m2002g1(ScrollState.SCROLL_ANIM);
                return;
            }
        }
        int i = c0112b.f1158o;
        if (this.f1118c.f1165v == this.f1118c.f1160q && this.f1118c.f1167x < this.f1118c.f1158o) {
            i = this.f1118c.f1167x;
        }
        if (this.f1118c.f1159p > 0 && this.f1118c.f1165v == this.f1118c.f1160q - 1) {
            C0113a c0113a = this.f1133r.get(this.f1118c.f1165v);
            if ((((this.f1118c.f1167x + c0113a.f1177h) + c0113a.f1181l) + this.f1126k) - i < this.f1118c.f1159p) {
                m2004i1((((this.f1118c.f1167x + c0113a.f1177h) + c0113a.f1181l) + this.f1126k) - this.f1118c.f1159p, "auto_scroll_case1");
                this.f1118c.f1157n = false;
                m2002g1(ScrollState.IDLE);
                return;
            }
        }
        boolean zM2004i1 = m2004i1(i, "auto_scroll_case2");
        C0112b c0112b2 = this.f1118c;
        if (zM2004i1) {
            c0112b2.f1157n = false;
            m2002g1(ScrollState.IDLE);
            return;
        }
        if (c0112b2.f1165v == this.f1118c.f1160q && this.f1118c.f1167x <= 0) {
            m2004i1(this.f1118c.f1167x, "auto_scroll_case3");
            this.f1118c.f1157n = false;
            m2002g1(ScrollState.IDLE);
        } else {
            if (this.f1118c.f1160q >= this.f1133r.size() || this.f1118c.f1165v > this.f1118c.f1160q) {
                this.f1118c.f1157n = false;
                m2002g1(ScrollState.IDLE);
                return;
            }
            int i2 = this.f1118c.f1165v;
            int i3 = this.f1118c.f1160q;
            C0112b c0112b3 = this.f1118c;
            if (i2 < i3) {
                c0112b3.f1158o += 20;
                C0112b c0112b4 = this.f1118c;
                c0112b4.f1158o = Math.min(500, c0112b4.f1158o);
            } else {
                c0112b3.f1158o = Math.max(50, c0112b3.f1158o - 20);
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* JADX INFO: renamed from: e1 */
    public void m1999e1() {
        List<C0113a> list = this.f1133r;
        if (list != null) {
            Iterator<C0113a> it = list.iterator();
            while (it.hasNext()) {
                xkf xkfVar = it.next().f1170a;
                if (xkfVar != null) {
                    xkfVar.mo24927v();
                }
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m2000f0(long j) {
        ValueAnimator valueAnimator = this.f1136u;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f1136u.cancel();
        }
        m1996c1(true);
        int topFix = this.f1118c.f1164u + getTopFix() + t100.d(50.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(topFix, 0.0f);
        this.f1136u = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(j);
        this.f1136u.setInterpolator(this.f1137v);
        this.f1136u.addUpdateListener(new C0111a(topFix));
        this.f1136u.start();
    }

    /* JADX INFO: renamed from: f1 */
    public final void m2001f1() {
        if (vwb.J(this.f1117b)) {
            return;
        }
        for (oql oqlVar : this.f1117b) {
            int i = this.f1118c.f1164u;
            int itemAllHeight = getItemAllHeight();
            int height = getHeight();
            alf alfVar = this.f1116a;
            oqlVar.mo1365B(i, itemAllHeight, height, alfVar == null ? "NA" : alfVar.mo11508f(), this.f1131p);
            if (this.f1118c.f1165v < this.f1133r.size()) {
                C0113a c0113a = this.f1133r.get(this.f1118c.f1165v);
                oqlVar.mo1366c0(this.f1118c.f1165v, c0113a.f1184o, Math.abs(c0113a.f1173d), c0113a.f1177h, c0113a.getView());
            }
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final void m2002g1(ScrollState scrollState) {
        if (scrollState == this.f1135t || scrollState == null) {
            return;
        }
        this.f1135t = scrollState;
        if (vwb.J(this.f1117b)) {
            return;
        }
        Iterator<oql> it = this.f1117b.iterator();
        while (it.hasNext()) {
            it.next().m20009s0(this.f1135t);
        }
    }

    public Act getAct() {
        return getContext();
    }

    @Nullable
    public xkf getFirstShowingHolder() {
        if (vwb.J(this.f1133r)) {
            return null;
        }
        return this.f1133r.get(this.f1118c.f1165v).f1170a;
    }

    public int getFixPaddingBottom() {
        return this.f1128m;
    }

    public int getInnerTransY() {
        return this.f1131p;
    }

    public int getLatestRenderIndex() {
        C0112b c0112b = this.f1118c;
        if (c0112b != null) {
            return c0112b.f1166w;
        }
        return 0;
    }

    public c<Integer> getRenderObs() {
        return this.f1119d.asObservable();
    }

    public List<C0113a> getRendingList() {
        return this.f1133r;
    }

    public int getScrollH() {
        C0112b c0112b = this.f1118c;
        if (c0112b != null) {
            return c0112b.f1164u;
        }
        return 0;
    }

    public int getTopEmptySize() {
        return ((this.f1131p + getTopFix()) + getTopEmptyFixHeight()) - this.f1118c.f1164u;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m2003h1(ExpandedTouchType expandedTouchType, int i, int i2, int i3) {
        if (vwb.J(this.f1117b)) {
            return;
        }
        Iterator<oql> it = this.f1117b.iterator();
        while (it.hasNext()) {
            it.next().mo1920X(i, i2, this.f1118c.f1164u, i3, expandedTouchType);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final boolean m2004i1(int i, String str) {
        boolean z;
        int iMax;
        this.f1118c.f1154k = true;
        if (i == 0 || this.f1133r.size() == 0) {
            this.f1118c.f1154k = false;
            return false;
        }
        C0112b c0112b = this.f1118c;
        if (i > 0) {
            int i2 = c0112b.f1166w;
            int i3 = 0;
            while (true) {
                if (i3 > i || i2 >= this.f1133r.size() || i3 < 0) {
                    z = false;
                    break;
                }
                C0113a c0113a = this.f1133r.get(i2);
                ExpandedItemStatus expandedItemStatus = c0113a.f1182m;
                if (expandedItemStatus == ExpandedItemStatus.RENDING) {
                    if (i2 == this.f1133r.size() - 1 && c0113a.f1175f + this.f1128m + this.f1131p <= this.f1118c.f1162s) {
                        z = true;
                        break;
                    }
                } else {
                    ExpandedItemStatus expandedItemStatus2 = ExpandedItemStatus.IDLE;
                    alf alfVar = this.f1116a;
                    if (expandedItemStatus == expandedItemStatus2) {
                        int iMo11507e = alfVar.mo11507e(i2);
                        xkf xkfVarM1981N0 = m1981N0(iMo11507e);
                        View view = xkfVarM1981N0.f22639a;
                        addView(view, view.getLayoutParams());
                        c0113a.f1170a = xkfVarM1981N0;
                        m2005l0(c0113a, i2, iMo11507e, "trans d idle");
                        c0113a.f1172c = 0;
                        c0113a.f1173d = this.f1118c.f1168y;
                        c0113a.f1174e = this.f1118c.f1163t;
                        int i4 = c0113a.f1173d + c0113a.f1177h;
                        c0113a.f1175f = i4;
                        this.f1118c.f1168y = i4;
                        this.f1118c.f1166w = i2;
                    } else {
                        m2005l0(c0113a, i2, alfVar.mo11507e(i2), "trans d recycle");
                        c0113a.f1172c = 0;
                        c0113a.f1173d = this.f1118c.f1168y;
                        c0113a.f1174e = this.f1118c.f1163t;
                        int i5 = c0113a.f1173d + c0113a.f1177h;
                        c0113a.f1175f = i5;
                        this.f1118c.f1168y = i5;
                        this.f1118c.f1166w = i2;
                    }
                }
                i3 = (c0113a.f1175f + this.f1131p) - this.f1118c.f1162s;
                if (i2 == this.f1133r.size() - 1) {
                    i3 = (c0113a.f1175f - this.f1118c.f1162s) + this.f1128m + this.f1131p;
                }
                if (((c0113a.f1175f - i) - (i2 == this.f1133r.size() - 1 ? this.f1128m : 0)) + this.f1131p <= this.f1118c.f1162s) {
                    i2++;
                }
            }
            if (i >= i3 || i3 == 0) {
                z = true;
            }
            iMax = Math.min(i, i3);
        } else {
            int i6 = c0112b.f1165v;
            int i7 = 0;
            while (Math.abs(i7) <= Math.abs(i) && i6 >= 0 && i7 <= 0) {
                C0113a c0113a2 = this.f1133r.get(i6);
                ExpandedItemStatus expandedItemStatus3 = c0113a2.f1182m;
                if (expandedItemStatus3 == ExpandedItemStatus.RENDING) {
                    if (i6 == 0 && c0113a2.f1173d >= 0) {
                        break;
                    }
                } else {
                    ExpandedItemStatus expandedItemStatus4 = ExpandedItemStatus.IDLE;
                    alf alfVar2 = this.f1116a;
                    if (expandedItemStatus3 == expandedItemStatus4) {
                        int iMo11507e2 = alfVar2.mo11507e(i6);
                        xkf xkfVarM1981N1 = m1981N0(iMo11507e2);
                        View view2 = xkfVarM1981N1.f22639a;
                        addView(view2, view2.getLayoutParams());
                        c0113a2.f1170a = xkfVarM1981N1;
                        m2005l0(c0113a2, i6, iMo11507e2, "trans t idle " + i);
                        c0113a2.f1172c = 0;
                        c0113a2.f1173d = this.f1118c.f1167x - c0113a2.f1177h;
                        c0113a2.f1174e = this.f1118c.f1163t;
                        int i8 = c0113a2.f1173d;
                        c0113a2.f1175f = c0113a2.f1177h + i8;
                        this.f1118c.f1167x = i8;
                        this.f1118c.f1166w = i6;
                    } else {
                        m2005l0(c0113a2, i6, alfVar2.mo11507e(i6), "trans t recycle" + i);
                        c0113a2.f1172c = 0;
                        c0113a2.f1173d = this.f1118c.f1167x - c0113a2.f1177h;
                        c0113a2.f1174e = this.f1118c.f1163t;
                        int i9 = c0113a2.f1173d;
                        c0113a2.f1175f = c0113a2.f1177h + i9;
                        this.f1118c.f1167x = i9;
                        this.f1118c.f1166w = i6;
                    }
                }
                i7 = c0113a2.f1173d;
                if (i7 - i >= 0) {
                    i6--;
                }
            }
            z = Math.abs(i) >= Math.abs(i7) || i7 == 0;
            iMax = Math.max(i, i7);
        }
        this.f1118c.f1164u += iMax;
        for (int i10 = 0; i10 < this.f1133r.size(); i10++) {
            C0113a c0113a3 = this.f1133r.get(i10);
            if (c0113a3.f1182m == ExpandedItemStatus.RENDING) {
                c0113a3.f1173d -= iMax;
                c0113a3.f1175f -= iMax;
                if (c0113a3.getView().isLayoutRequested()) {
                    m1993a1(c0113a3, i10, c0113a3.getType(), true);
                }
            }
        }
        m1971D0("tans diff_" + str);
        m2006s0();
        m1985T0("transRendingViewByDiff_" + str);
        this.f1118c.f1154k = false;
        return z;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m2005l0(C0113a c0113a, int i, int i2, String str) {
        c0113a.f1182m = ExpandedItemStatus.RENDING;
        this.f1116a.mo11503a(c0113a.f1170a, i, i2);
        m1993a1(c0113a, i, i2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1987V0();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f1134s) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            m1998d1();
            this.f1118c.f1153j = false;
            this.f1118c.f1149f = x;
            this.f1118c.f1150g = y;
            if (y < ((this.f1131p + getTopFix()) + getTopEmptyFixHeight()) - this.f1118c.f1164u) {
                return false;
            }
        } else if (action == 1) {
            this.f1118c.f1153j = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f1118c.f1153j = false;
            }
        } else {
            if (this.f1118c.f1153j) {
                return true;
            }
            if (Math.abs(y - this.f1118c.f1150g) >= this.f1121f) {
                if ((this.f1118c.f1165v != 0 || this.f1118c.f1167x != 0 || y <= this.f1118c.f1150g) && getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                m2003h1(ExpandedTouchType.TOUCH_START_SCROLL, x, y, 0);
                m2002g1(ScrollState.DRAGGING);
                this.f1118c.f1153j = true;
                return true;
            }
        }
        this.f1118c.f1151h = x;
        this.f1118c.f1152i = y;
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m1985T0("system onLayout");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - this.f1125j) - this.f1127l, View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i2) - this.f1126k) - this.f1129n, 0));
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        if (size == this.f1118c.f1163t && size2 == this.f1118c.f1162s) {
            if (this.f1118c.f1154k) {
                return;
            }
            m1973F0();
            m2007v0();
            return;
        }
        this.f1118c.f1163t = size;
        this.f1118c.f1162s = size2;
        this.f1118c.m2049P(16);
        if (this.f1116a == null || this.f1133r.size() == this.f1116a.mo11505c()) {
            m1978K0();
        } else {
            m1990X0();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f1118c.m2051R(17) || this.f1134s) {
            return false;
        }
        m1966P0();
        int action = motionEvent.getAction() & 255;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        this.f1124i.addMovement(motionEvent);
        if (action == 0) {
            m1998d1();
            this.f1118c.f1153j = false;
            this.f1118c.f1149f = x;
            this.f1118c.f1150g = y;
            if (y < ((this.f1131p + getTopFix()) + getTopEmptyFixHeight()) - this.f1118c.f1164u) {
                return false;
            }
            m2003h1(ExpandedTouchType.TOUCH_DOWN, x, y, 0);
        } else if (action == 1) {
            if (this.f1118c.f1153j) {
                m2003h1(ExpandedTouchType.TOUCH_FINISH, x, y, m1997d0());
            } else {
                m2002g1(ScrollState.IDLE);
            }
            this.f1118c.f1153j = false;
        } else if (action == 2) {
            boolean z = this.f1118c.f1153j;
            C0112b c0112b = this.f1118c;
            if (z) {
                m2004i1(c0112b.f1152i - y, "touch-move");
                m2003h1(ExpandedTouchType.TOUCH_SCROLLING, x, y, 0);
            } else if (Math.abs(y - c0112b.f1150g) >= this.f1121f) {
                if ((this.f1118c.f1165v != 0 || this.f1118c.f1167x != 0 || y <= this.f1118c.f1150g) && getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.f1118c.f1153j = true;
                m2002g1(ScrollState.DRAGGING);
                m2003h1(ExpandedTouchType.TOUCH_START_SCROLL, x, y, 0);
            }
        } else if (action == 3) {
            this.f1118c.f1153j = false;
            m2002g1(ScrollState.IDLE);
        }
        this.f1118c.f1151h = x;
        this.f1118c.f1152i = y;
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s0 */
    public final void m2006s0() {
        this.f1118c.f1166w = 0;
        this.f1118c.f1168y = 0;
        if (this.f1133r.size() > 0) {
            for (int i = 0; i < this.f1133r.size(); i++) {
                C0113a c0113a = this.f1133r.get(i);
                if (c0113a.f1182m == ExpandedItemStatus.RENDING) {
                    if (c0113a.f1175f >= this.f1118c.f1162s || i == this.f1133r.size() - 1) {
                        this.f1118c.f1166w = i;
                        this.f1118c.f1168y = c0113a.f1175f;
                        return;
                    } else {
                        this.f1118c.f1166w = i;
                        this.f1118c.f1168y = c0113a.f1175f;
                    }
                }
            }
        }
    }

    public void setAdapter(alf alfVar) {
        this.f1116a = alfVar;
        m1975H0();
        this.f1132q = alfVar.m11506d().subscribe(mkd0.G(new e30() { // from class: l.ck2
            public final void call(Object obj) {
                this.f10649a.m1984S0(obj);
            }
        }));
    }

    public void setBlockScroll(boolean z) {
        this.f1134s = z;
    }

    public void setContentPadding(int i) {
        this.f1129n = i;
    }

    public void setTopEmptyFixHeight(int i) {
        this.f1130o = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            m1999e1();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m2007v0() {
        for (int i = 0; i < this.f1133r.size(); i++) {
            C0113a c0113a = this.f1133r.get(i);
            View view = c0113a.getView();
            C0112b c0112b = this.f1118c;
            if (view != null) {
                c0112b.f1169z.put(i, Pair.create(Boolean.FALSE, Integer.valueOf(c0113a.f1177h)));
            } else {
                c0112b.f1169z.put(i, Pair.create(Boolean.FALSE, Integer.valueOf(t100.d(100.0f))));
            }
        }
    }

    public BaseExpandedView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1119d = a.b();
        this.f1120e = 18000;
        this.f1129n = 0;
        this.f1130o = 0;
        this.f1131p = 0;
        this.f1132q = null;
        this.f1133r = new ArrayList();
        this.f1134s = false;
        this.f1135t = ScrollState.IDLE;
        this.f1137v = new DecelerateInterpolator();
        m1967Q0();
    }

    public BaseExpandedView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1119d = a.b();
        this.f1120e = 18000;
        this.f1129n = 0;
        this.f1130o = 0;
        this.f1131p = 0;
        this.f1132q = null;
        this.f1133r = new ArrayList();
        this.f1134s = false;
        this.f1135t = ScrollState.IDLE;
        this.f1137v = new DecelerateInterpolator();
        m1967Q0();
    }
}
