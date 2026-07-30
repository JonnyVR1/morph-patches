package com.p051p1.mobile.putong.core.newui.home.card.expanded.base;

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
import com.clevertap.android.sdk.Constants;
import com.momo.momortc.MMConstants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.base.C8100a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.atl;
import p153l.dmf;
import p153l.gmf;
import p153l.jyb;
import p153l.kcg0;
import p153l.knf;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.rof;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class BaseExpandedView extends FrameLayout implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public gmf f23080a;

    /* JADX INFO: renamed from: b */
    public List<atl> f23081b;

    /* JADX INFO: renamed from: c */
    public C8099b f23082c;

    /* JADX INFO: renamed from: d */
    public C22507a<Integer> f23083d;

    /* JADX INFO: renamed from: e */
    public final int f23084e;

    /* JADX INFO: renamed from: f */
    public int f23085f;

    /* JADX INFO: renamed from: g */
    public int f23086g;

    /* JADX INFO: renamed from: h */
    public int f23087h;

    /* JADX INFO: renamed from: i */
    public VelocityTracker f23088i;

    /* JADX INFO: renamed from: j */
    public int f23089j;

    /* JADX INFO: renamed from: k */
    public int f23090k;

    /* JADX INFO: renamed from: l */
    public int f23091l;

    /* JADX INFO: renamed from: m */
    public int f23092m;

    /* JADX INFO: renamed from: n */
    public int f23093n;

    /* JADX INFO: renamed from: o */
    public int f23094o;

    /* JADX INFO: renamed from: p */
    public int f23095p;

    /* JADX INFO: renamed from: q */
    public kcg0 f23096q;

    /* JADX INFO: renamed from: r */
    public List<C8100a> f23097r;

    /* JADX INFO: renamed from: s */
    public boolean f23098s;

    /* JADX INFO: renamed from: t */
    public ScrollState f23099t;

    /* JADX INFO: renamed from: u */
    public ValueAnimator f23100u;

    /* JADX INFO: renamed from: v */
    public TimeInterpolator f23101v;

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
    public class C8098a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public int f23102a;

        /* JADX INFO: renamed from: b */
        public int f23103b = 0;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f23104c;

        public C8098a(int i) {
            this.f23104c = i;
            this.f23102a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            int iFloatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseExpandedView.this.f23082c.f23128u = iFloatValue;
            int i = this.f23102a - iFloatValue;
            this.f23103b += i;
            this.f23102a = iFloatValue;
            BaseExpandedView.this.m39033i1(-i, "auto-scroll-top");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.base.BaseExpandedView$b */
    public class C8099b {

        /* JADX INFO: renamed from: a */
        public long f23108a;

        /* JADX INFO: renamed from: b */
        public long f23109b;

        /* JADX INFO: renamed from: c */
        public int f23110c;

        /* JADX INFO: renamed from: d */
        public int f23111d;

        /* JADX INFO: renamed from: f */
        public int f23113f;

        /* JADX INFO: renamed from: g */
        public int f23114g;

        /* JADX INFO: renamed from: h */
        public int f23115h;

        /* JADX INFO: renamed from: i */
        public int f23116i;

        /* JADX INFO: renamed from: l */
        public String f23119l;

        /* JADX INFO: renamed from: y */
        public int f23132y;

        /* JADX INFO: renamed from: e */
        public DecelerateInterpolator f23112e = new DecelerateInterpolator(1.7f);

        /* JADX INFO: renamed from: j */
        public boolean f23117j = false;

        /* JADX INFO: renamed from: k */
        public boolean f23118k = false;

        /* JADX INFO: renamed from: m */
        public boolean f23120m = true;

        /* JADX INFO: renamed from: n */
        public boolean f23121n = false;

        /* JADX INFO: renamed from: o */
        public int f23122o = 20;

        /* JADX INFO: renamed from: p */
        public int f23123p = 0;

        /* JADX INFO: renamed from: q */
        public int f23124q = -1;

        /* JADX INFO: renamed from: r */
        public int f23125r = -1;

        /* JADX INFO: renamed from: s */
        public int f23126s = -1;

        /* JADX INFO: renamed from: t */
        public int f23127t = -1;

        /* JADX INFO: renamed from: u */
        public int f23128u = 0;

        /* JADX INFO: renamed from: v */
        public int f23129v = 0;

        /* JADX INFO: renamed from: w */
        public int f23130w = 0;

        /* JADX INFO: renamed from: x */
        public int f23131x = 0;

        /* JADX INFO: renamed from: z */
        public SparseArray<Pair<Boolean, Integer>> f23133z = new SparseArray<>();

        /* JADX INFO: renamed from: A */
        public int f23106A = 0;

        public C8099b() {
        }

        /* JADX INFO: renamed from: P */
        public void m39078P(int i) {
            this.f23106A = i | this.f23106A;
        }

        /* JADX INFO: renamed from: Q */
        public final boolean m39079Q() {
            return this.f23109b <= 0 || this.f23108a <= 0 || SystemClock.elapsedRealtime() > this.f23108a;
        }

        /* JADX INFO: renamed from: R */
        public boolean m39080R(int i) {
            return this.f23106A == i;
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0014 A[PHI: r0
          0x0014: PHI (r0v15 float) = (r0v3 float), (r0v4 float) binds: [B:3:0x0012, B:6:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX INFO: renamed from: S */
        public final int m39081S() {
            float fElapsedRealtime = (SystemClock.elapsedRealtime() - this.f23109b) / (this.f23108a - this.f23109b);
            float f = 0.0f;
            if (fElapsedRealtime < 0.0f) {
                fElapsedRealtime = f;
            } else {
                f = 1.0f;
                if (fElapsedRealtime > 1.0f) {
                    fElapsedRealtime = f;
                }
            }
            float interpolation = this.f23112e.getInterpolation(fElapsedRealtime);
            int i = this.f23110c;
            int iCeil = (int) (i > 0 ? Math.ceil(i * interpolation) : Math.floor(i * interpolation));
            if (Math.abs(iCeil) >= Math.abs(this.f23110c)) {
                iCeil = this.f23110c;
                this.f23109b = 0L;
            }
            int i2 = iCeil - this.f23111d;
            this.f23111d = iCeil;
            return i2;
        }

        /* JADX INFO: renamed from: T */
        public final void m39082T(long j, int i) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f23109b = jElapsedRealtime;
            this.f23108a = jElapsedRealtime + j;
            this.f23110c = i;
            this.f23111d = 0;
        }

        /* JADX INFO: renamed from: U */
        public final void m39083U() {
            this.f23117j = false;
            int i = this.f23106A;
            if (i == 16 || i == 17) {
                this.f23106A = 16;
            } else {
                this.f23106A = 0;
            }
            this.f23128u = 0;
            this.f23133z = new SparseArray<>();
            this.f23131x = 0;
            this.f23129v = 0;
            this.f23132y = 0;
            this.f23130w = 0;
            this.f23119l = null;
            this.f23120m = true;
            this.f23121n = false;
            this.f23124q = -1;
            this.f23125r = -1;
            BaseExpandedView.this.m39031g1(ScrollState.IDLE);
        }

        /* JADX INFO: renamed from: V */
        public void m39084V() {
            this.f23109b = 0L;
            this.f23108a = 0L;
        }
    }

    public BaseExpandedView(@NonNull Context context) {
        super(context);
        this.f23083d = C22507a.m222758b();
        this.f23084e = 18000;
        this.f23093n = 0;
        this.f23094o = 0;
        this.f23095p = 0;
        this.f23096q = null;
        this.f23097r = new ArrayList();
        this.f23098s = false;
        this.f23099t = ScrollState.IDLE;
        this.f23101v = new DecelerateInterpolator();
        m38996Q0();
    }

    /* JADX INFO: renamed from: P0 */
    private void m38995P0() {
        if (this.f23088i == null) {
            this.f23088i = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    private void m38996Q0() {
        this.f23082c = new C8099b();
        this.f23085f = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f23086g = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f23087h = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f23081b = new ArrayList();
        setElevation(0.0f);
    }

    private int getItemAllHeight() {
        int iIntValue = 0;
        for (int i = 0; i < this.f23097r.size(); i++) {
            iIntValue += ((Integer) ((Pair) this.f23082c.f23133z.get(i)).second).intValue();
        }
        return iIntValue;
    }

    private String getRendingInfo() {
        StringBuilder sb = new StringBuilder();
        for (C8100a c8100a : this.f23097r) {
            sb.append(c8100a.f23146m + Constants.SEPARATOR_COMMA + c8100a.f23137d + Constants.SEPARATOR_COMMA + c8100a.f23139f + " , " + c8100a.f23148o);
            sb.append(" | ");
        }
        sb.append(" 字数量：" + getChildCount());
        return sb.toString();
    }

    private int getTopEmptyFixHeight() {
        return this.f23094o;
    }

    private int getTopFix() {
        return this.f23090k;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m39000D0(String str) {
        m39001E0(str, false);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m39001E0(String str, boolean z) {
        if (this.f23082c.f23129v < 0 || this.f23082c.f23129v >= this.f23097r.size() || this.f23097r.size() == 0) {
            this.f23082c.f23129v = 0;
            this.f23082c.f23131x = 0;
            return;
        }
        this.f23082c.f23131x = 0;
        for (int i = 0; i < this.f23097r.size(); i++) {
            C8100a c8100a = this.f23097r.get(i);
            if (c8100a.f23146m == ExpandedItemStatus.RENDING && c8100a.f23137d <= 0 && c8100a.f23139f > 0) {
                if (this.f23082c.f23129v == i && i == 0 && c8100a.f23137d == 0 && this.f23082c.f23131x != 0) {
                    int unused = this.f23082c.f23129v;
                }
                this.f23082c.f23129v = i;
                this.f23082c.f23131x = c8100a.f23137d;
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m39002F0() {
        C8099b c8099b;
        if (this.f23097r == null || (c8099b = this.f23082c) == null || c8099b.f23127t <= 0 || this.f23082c.f23126s <= 0) {
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f23097r.size(); i++) {
            C8100a c8100a = this.f23097r.get(i);
            if (c8100a.f23146m == ExpandedItemStatus.RENDING && c8100a.getView() != null) {
                m39022a1(c8100a, i, c8100a.f23148o, false);
                z = true;
            }
        }
        if (z) {
            m39020Y0();
            m39000D0("measure once");
            m39035s0();
            if (this.f23082c.f23132y < this.f23082c.f23126s) {
                m39006J0();
            }
            m39014T0("checkChildRequestLayout");
            m39009M0();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m39003G0(C8100a c8100a) {
        if (c8100a.getView() != null) {
            if (c8100a.getView().getTop() == 0 && c8100a.getView().getBottom() == 0) {
                return;
            }
            c8100a.getView().layout(0, 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m39004H0() {
        psd0.m173633z(this.f23096q);
    }

    /* JADX INFO: renamed from: I0 */
    public void m39005I0(boolean z) {
        C8099b c8099b = this.f23082c;
        if (z) {
            c8099b.f23120m = true;
            return;
        }
        c8099b.m39083U();
        int i = 0;
        this.f23082c.f23120m = false;
        m39025c1(true);
        while (true) {
            int size = this.f23097r.size();
            List<C8100a> list = this.f23097r;
            if (i >= size) {
                list.clear();
                return;
            }
            C8100a c8100a = list.get(i);
            if (c8100a.getView() != null) {
                m39021Z0(c8100a);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m39006J0() {
        int i = this.f23082c.f23130w;
        while (true) {
            i++;
            if (i >= this.f23097r.size()) {
                return;
            }
            C8100a c8100a = this.f23097r.get(i);
            ExpandedItemStatus expandedItemStatus = c8100a.f23146m;
            if (expandedItemStatus != ExpandedItemStatus.RENDING) {
                ExpandedItemStatus expandedItemStatus2 = ExpandedItemStatus.IDLE;
                gmf gmfVar = this.f23080a;
                if (expandedItemStatus == expandedItemStatus2) {
                    int iMo126227e = gmfVar.mo126227e(i);
                    dmf dmfVarM39010N0 = m39010N0(iMo126227e);
                    View view = dmfVarM39010N0.f89621a;
                    addView(view, view.getLayoutParams());
                    c8100a.f23134a = dmfVarM39010N0;
                    m39034l0(c8100a, i, iMo126227e, "fill bottom idle");
                    c8100a.f23136c = 0;
                    c8100a.f23137d = this.f23082c.f23132y;
                    c8100a.f23138e = this.f23082c.f23127t;
                    int i2 = c8100a.f23137d + c8100a.f23141h;
                    c8100a.f23139f = i2;
                    this.f23082c.f23132y = i2;
                    this.f23082c.f23130w = i;
                } else {
                    m39034l0(c8100a, i, gmfVar.mo126227e(i), "fill bottom recycle");
                    c8100a.f23136c = 0;
                    c8100a.f23137d = this.f23082c.f23132y;
                    c8100a.f23138e = this.f23082c.f23127t;
                    int i3 = c8100a.f23137d + c8100a.f23141h;
                    c8100a.f23139f = i3;
                    this.f23082c.f23132y = i3;
                    this.f23082c.f23130w = i;
                }
            } else if (i == this.f23097r.size() - 1 && c8100a.f23139f <= this.f23082c.f23126s) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m39007K0() {
        if (this.f23082c.m39080R(17)) {
            m39008L0();
            this.f23083d.onNext(Integer.valueOf(this.f23097r.size()));
        } else if (this.f23082c.m39080R(1)) {
            requestLayout();
        } else {
            this.f23082c.m39080R(16);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m39008L0() {
        int i;
        System.currentTimeMillis();
        this.f23082c.f23118k = true;
        m39025c1(false);
        int i2 = this.f23082c.f23129v;
        if (i2 < 0 || i2 >= this.f23080a.mo126226c()) {
            this.f23082c.f23131x = 0;
            this.f23082c.f23129v = 0;
            i2 = 0;
        }
        int i3 = this.f23082c.f23131x;
        while (i3 < this.f23082c.f23126s && i2 < this.f23080a.mo126226c() && i2 < this.f23097r.size()) {
            C8100a c8100a = this.f23097r.get(i2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            ExpandedItemStatus expandedItemStatus = c8100a.f23146m;
            if (expandedItemStatus == ExpandedItemStatus.IDLE) {
                int iMo126227e = this.f23080a.mo126227e(i2);
                dmf dmfVarM39010N0 = m39010N0(iMo126227e);
                new StringBuilder("Type: ").append(iMo126227e);
                new StringBuilder(" crTime: ").append(System.currentTimeMillis() - jCurrentTimeMillis);
                View view = dmfVarM39010N0.f89621a;
                addView(view, view.getLayoutParams());
                c8100a.f23134a = dmfVarM39010N0;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                m39034l0(c8100a, i2, iMo126227e, "idle create");
                new StringBuilder("Type: ").append(iMo126227e);
                new StringBuilder(" bdTime: ").append(System.currentTimeMillis() - jCurrentTimeMillis2);
                i = c8100a.f23141h;
            } else {
                if (expandedItemStatus == ExpandedItemStatus.BE_RECYCLE) {
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    m39034l0(c8100a, i2, c8100a.getType(), "be_recycle");
                    new StringBuilder("Type: ").append(c8100a.f23148o);
                    new StringBuilder(" rdTime: ").append(System.currentTimeMillis() - jCurrentTimeMillis3);
                    i = c8100a.f23141h;
                } else if (expandedItemStatus == ExpandedItemStatus.RENDING) {
                    m39022a1(c8100a, i2, this.f23080a.mo126227e(i2), false);
                    c8100a.f23135b = false;
                }
                i2++;
            }
            i3 += i;
            i2++;
        }
        m39015U0("before order");
        m39020Y0();
        m39015U0("after order");
        m39000D0("fill list");
        m39035s0();
        m39014T0("fillListInner");
        m39009M0();
        this.f23082c.f23118k = false;
    }

    /* JADX INFO: renamed from: M0 */
    public final void m39009M0() {
        if (this.f23097r.size() <= 0 || this.f23082c.f23130w != this.f23097r.size() - 1 || this.f23082c.f23132y >= this.f23082c.f23126s) {
            return;
        }
        if ((this.f23082c.f23131x < 0 || this.f23082c.f23129v > 0) && this.f23082c.f23132y + getFixPaddingBottom() + getInnerTransY() < this.f23082c.f23126s) {
            m39033i1((((this.f23082c.f23132y + getTopFix()) + getFixPaddingBottom()) + getInnerTransY()) - this.f23082c.f23126s, "fix-notify-opt");
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final dmf m39010N0(int i) {
        View viewM150507a = m39017W0().m150507a(i);
        return viewM150507a == null ? this.f23080a.mo126225b(this, i) : (dmf) viewM150507a.getTag(dmf.f89620d.hashCode());
    }

    /* JADX INFO: renamed from: O0 */
    public final void m39011O0() {
        List<C8100a> list = this.f23097r;
        if (list != null) {
            for (C8100a c8100a : list) {
                if (c8100a.getView() != null) {
                    if (c8100a.f23139f <= getTopFix() || c8100a.f23137d >= this.f23082c.f23126s) {
                        c8100a.f23134a.m116957u(false, 0, 0, getHeight());
                    } else {
                        c8100a.f23134a.m116957u(true, c8100a.f23137d, c8100a.f23139f, getHeight());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ Boolean m39012R0(C8100a c8100a) {
        return Boolean.valueOf(c8100a.f23148o == this.f23082c.f23125r);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m39013S0(Object obj) {
        m39019X0();
    }

    /* JADX INFO: renamed from: T0 */
    public final void m39014T0(String str) {
        for (int i = 0; i < this.f23097r.size(); i++) {
            C8100a c8100a = this.f23097r.get(i);
            if (c8100a.f23146m == ExpandedItemStatus.RENDING) {
                c8100a.getView().layout(c8100a.f23136c + c8100a.f23142i + this.f23089j, c8100a.f23137d + c8100a.f23143j + getTopFix() + getInnerTransY(), (c8100a.f23138e - c8100a.f23144k) - this.f23091l, (c8100a.f23139f - c8100a.f23145l) + getTopFix() + getInnerTransY());
            }
        }
        m39030f1();
        m39011O0();
    }

    /* JADX INFO: renamed from: U0 */
    public final void m39015U0(String str) {
    }

    /* JADX INFO: renamed from: V0 */
    public final void m39016V0() {
        List<C8100a> list = this.f23097r;
        if (list != null) {
            Iterator<C8100a> it = list.iterator();
            while (it.hasNext()) {
                dmf dmfVar = it.next().f23134a;
                if (dmfVar != null) {
                    dmfVar.mo39158r();
                }
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public knf m39017W0() {
        return rof.m182405d().m182406c(getAct());
    }

    /* JADX INFO: renamed from: X */
    public void m39018X(atl atlVar) {
        if (!this.f23081b.contains(atlVar)) {
            this.f23081b.add(atlVar);
        }
        if (NullChecker.m82486a(atlVar)) {
            atlVar.mo100195s0(this.f23099t);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final void m39019X0() {
        boolean z;
        gmf gmfVar;
        C8100a c8100a;
        ExpandedItemStatus expandedItemStatus;
        if (!this.f23082c.f23120m || (this.f23082c.f23120m && !TextUtils.equals(this.f23082c.f23119l, this.f23080a.mo126228f()))) {
            m39025c1(true);
            this.f23082c.m39083U();
            z = true;
        } else {
            z = false;
        }
        this.f23082c.f23119l = this.f23080a.mo126228f();
        m39015U0("pre order: " + z);
        if (!z) {
            m39000D0("res render");
        }
        ArrayList arrayList = new ArrayList();
        int iMo126226c = this.f23080a.mo126226c();
        int i = 0;
        while (true) {
            gmfVar = this.f23080a;
            if (i >= iMo126226c) {
                break;
            }
            arrayList.add(Integer.valueOf(gmfVar.mo126227e(i)));
            i++;
        }
        int iMo126226c2 = gmfVar.mo126226c();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < this.f23097r.size(); i2++) {
            C8100a c8100a2 = this.f23097r.get(i2);
            c8100a2.f23135b = false;
            c8100a2.f23147n = false;
            if (c8100a2.f23146m == ExpandedItemStatus.BE_RECYCLE) {
                c8100a2.f23146m = ExpandedItemStatus.PRE_RECYCLE;
            }
        }
        for (int i3 = 0; i3 < iMo126226c2; i3++) {
            int iIntValue = ((Integer) arrayList.get(i3)).intValue();
            int i4 = 0;
            while (true) {
                if (i4 >= this.f23097r.size()) {
                    c8100a = null;
                    break;
                }
                c8100a = this.f23097r.get(i4);
                if (c8100a.f23148o == iIntValue && ((expandedItemStatus = c8100a.f23146m) == ExpandedItemStatus.RENDING || expandedItemStatus == ExpandedItemStatus.PRE_RECYCLE)) {
                    dmf dmfVar = c8100a.f23134a;
                    if (dmfVar == null) {
                        break;
                    }
                    dmfVar.m116954o();
                    c8100a.f23134a.mo115468s();
                    if (!z) {
                        break;
                    }
                    c8100a.f23147n = true;
                    c8100a.f23134a.m116956t();
                    break;
                }
                i4++;
            }
            if (c8100a != null) {
                c8100a.f23146m = ExpandedItemStatus.BE_RECYCLE;
            } else {
                c8100a = new C8100a(iIntValue);
            }
            arrayList2.add(c8100a);
        }
        for (C8100a c8100a3 : this.f23097r) {
            ExpandedItemStatus expandedItemStatus2 = c8100a3.f23146m;
            if (expandedItemStatus2 != ExpandedItemStatus.IDLE && expandedItemStatus2 != ExpandedItemStatus.BE_RECYCLE) {
                c8100a3.f23146m = ExpandedItemStatus.PRE_REMOVE;
            }
        }
        Iterator<C8100a> it = this.f23097r.iterator();
        while (it.hasNext()) {
            C8100a next = it.next();
            if (next.f23146m == ExpandedItemStatus.PRE_REMOVE) {
                dmf dmfVar2 = next.f23134a;
                if (dmfVar2 != null && !next.f23147n) {
                    dmfVar2.m116956t();
                }
                it.remove();
                m39021Z0(next);
            }
        }
        this.f23097r = arrayList2;
        if (this.f23082c.f23125r >= 0) {
            this.f23082c.f23124q = jyb.m147476G(this.f23097r, new qcj() { // from class: l.lk2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f132429a.m39012R0((C8100a) obj);
                }
            });
        }
        this.f23082c.m39078P(1);
        m39036v0();
        m39007K0();
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m39020Y0() {
        int i = this.f23082c.f23131x;
        for (int i2 = 0; i2 < this.f23097r.size(); i2++) {
            C8100a c8100a = this.f23097r.get(i2);
            ExpandedItemStatus expandedItemStatus = c8100a.f23146m;
            if (expandedItemStatus == ExpandedItemStatus.RENDING) {
                if (i2 >= this.f23082c.f23129v) {
                    c8100a.f23137d = i;
                    c8100a.f23136c = 0;
                    c8100a.f23138e = this.f23082c.f23127t;
                    i = c8100a.f23137d + c8100a.f23141h;
                    c8100a.f23139f = i;
                }
            } else if (expandedItemStatus == ExpandedItemStatus.BE_RECYCLE) {
                c8100a.f23137d = 0;
                c8100a.f23139f = 0;
                m39003G0(c8100a);
            }
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m39021Z0(C8100a c8100a) {
        c8100a.f23134a.mo115468s();
        c8100a.f23134a.m116954o();
        m39017W0().m150509c(c8100a);
        if (c8100a.getView() != null) {
            removeView(c8100a.getView());
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final void m39022a1(C8100a c8100a, int i, int i2, boolean z) {
        ViewGroup.LayoutParams layoutParams = c8100a.getView().getLayoutParams();
        boolean z2 = c8100a.getView().getVisibility() == 8;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            c8100a.f23142i = layoutParams2.leftMargin;
            c8100a.f23143j = layoutParams2.topMargin;
            c8100a.f23144k = layoutParams2.rightMargin;
            c8100a.f23145l = layoutParams2.bottomMargin;
            if (z2) {
                c8100a.f23142i = 0;
                c8100a.f23143j = 0;
                c8100a.f23144k = 0;
                c8100a.f23145l = 0;
            }
        }
        if ((z && !z2) || (!z && !z2 && c8100a.f23134a.f89621a.isLayoutRequested())) {
            c8100a.f23134a.f89621a.measure(View.MeasureSpec.makeMeasureSpec((((this.f23082c.f23127t - this.f23089j) - this.f23091l) - c8100a.f23142i) - c8100a.f23144k, 1073741824), View.MeasureSpec.makeMeasureSpec((((this.f23082c.f23126s - this.f23090k) - this.f23093n) - c8100a.f23143j) - c8100a.f23145l, 0));
        }
        if (z2) {
            c8100a.f23141h = 0;
            c8100a.f23140g = 0;
        } else {
            c8100a.f23141h = c8100a.f23134a.f89621a.getMeasuredHeight() + c8100a.f23143j + c8100a.f23145l;
            c8100a.f23140g = this.f23082c.f23127t + c8100a.f23142i + c8100a.f23144k;
        }
        c8100a.f23135b = false;
        c8100a.f23146m = ExpandedItemStatus.RENDING;
        this.f23082c.f23133z.put(i, Pair.create(Boolean.TRUE, Integer.valueOf(c8100a.f23141h)));
    }

    /* JADX INFO: renamed from: b1 */
    public void m39023b1(int i, int i2, int i3, int i4) {
        this.f23089j = i;
        this.f23090k = i2;
        this.f23091l = i3;
        this.f23092m = i4;
    }

    /* JADX INFO: renamed from: c0 */
    public void m39024c0() {
        dmf firstShowingHolder;
        if (this.f23097r == null || (firstShowingHolder = getFirstShowingHolder()) == null) {
            return;
        }
        firstShowingHolder.m116947h();
    }

    /* JADX INFO: renamed from: c1 */
    public void m39025c1(boolean z) {
        if (z || !this.f23082c.f23121n) {
            Choreographer.getInstance().removeFrameCallback(this);
            this.f23082c.f23121n = false;
            m39031g1(ScrollState.IDLE);
        }
        this.f23082c.m39084V();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b A[PHI: r2
      0x002b: PHI (r2v6 int) = (r2v2 int), (r2v3 int) binds: [B:10:0x0029, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: d0 */
    public final int m39026d0() {
        int i;
        VelocityTracker velocityTracker = this.f23088i;
        velocityTracker.computeCurrentVelocity(1000);
        int yVelocity = (int) (velocityTracker.getYVelocity() / 2.5f);
        if (Math.abs(yVelocity) > this.f23087h) {
            i = MMConstants.ERR_VCM_UNKNOWN_ERROR;
        } else {
            i = Math.abs(yVelocity) > this.f23086g ? 900 : 300;
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
        m39031g1(ScrollState.SCROLL_ANIM);
        this.f23082c.m39082T(i, -yVelocity);
        Choreographer.getInstance().postFrameCallback(this);
        return yVelocity;
    }

    /* JADX INFO: renamed from: d1 */
    public void m39027d1() {
        Choreographer.getInstance().removeFrameCallback(this);
        if (!this.f23082c.m39079Q()) {
            m39031g1(ScrollState.DRAGGING);
        }
        this.f23082c.f23121n = false;
        this.f23082c.m39084V();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        boolean z = this.f23082c.f23121n;
        C8099b c8099b = this.f23082c;
        if (!z) {
            if (c8099b.m39079Q()) {
                m39031g1(ScrollState.IDLE);
                m39025c1(true);
                return;
            } else if (m39033i1(this.f23082c.m39081S(), "touch_anim")) {
                m39031g1(ScrollState.IDLE);
                return;
            } else {
                Choreographer.getInstance().postFrameCallback(this);
                m39031g1(ScrollState.SCROLL_ANIM);
                return;
            }
        }
        int i = c8099b.f23122o;
        if (this.f23082c.f23129v == this.f23082c.f23124q && this.f23082c.f23131x < this.f23082c.f23122o) {
            i = this.f23082c.f23131x;
        }
        if (this.f23082c.f23123p > 0 && this.f23082c.f23129v == this.f23082c.f23124q - 1) {
            C8100a c8100a = this.f23097r.get(this.f23082c.f23129v);
            if ((((this.f23082c.f23131x + c8100a.f23141h) + c8100a.f23145l) + this.f23090k) - i < this.f23082c.f23123p) {
                m39033i1((((this.f23082c.f23131x + c8100a.f23141h) + c8100a.f23145l) + this.f23090k) - this.f23082c.f23123p, "auto_scroll_case1");
                this.f23082c.f23121n = false;
                m39031g1(ScrollState.IDLE);
                return;
            }
        }
        boolean zM39033i1 = m39033i1(i, "auto_scroll_case2");
        C8099b c8099b2 = this.f23082c;
        if (zM39033i1) {
            c8099b2.f23121n = false;
            m39031g1(ScrollState.IDLE);
            return;
        }
        if (c8099b2.f23129v == this.f23082c.f23124q && this.f23082c.f23131x <= 0) {
            m39033i1(this.f23082c.f23131x, "auto_scroll_case3");
            this.f23082c.f23121n = false;
            m39031g1(ScrollState.IDLE);
        } else {
            if (this.f23082c.f23124q >= this.f23097r.size() || this.f23082c.f23129v > this.f23082c.f23124q) {
                this.f23082c.f23121n = false;
                m39031g1(ScrollState.IDLE);
                return;
            }
            int i2 = this.f23082c.f23129v;
            int i3 = this.f23082c.f23124q;
            C8099b c8099b3 = this.f23082c;
            if (i2 < i3) {
                c8099b3.f23122o += 20;
                C8099b c8099b4 = this.f23082c;
                c8099b4.f23122o = Math.min(500, c8099b4.f23122o);
            } else {
                c8099b3.f23122o = Math.max(50, c8099b3.f23122o - 20);
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* JADX INFO: renamed from: e1 */
    public void m39028e1() {
        List<C8100a> list = this.f23097r;
        if (list != null) {
            Iterator<C8100a> it = list.iterator();
            while (it.hasNext()) {
                dmf dmfVar = it.next().f23134a;
                if (dmfVar != null) {
                    dmfVar.mo116958v();
                }
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m39029f0(long j) {
        ValueAnimator valueAnimator = this.f23100u;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f23100u.cancel();
        }
        m39025c1(true);
        int topFix = this.f23082c.f23128u + getTopFix() + qa00.m175859d(50.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(topFix, 0.0f);
        this.f23100u = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(j);
        this.f23100u.setInterpolator(this.f23101v);
        this.f23100u.addUpdateListener(new C8098a(topFix));
        this.f23100u.start();
    }

    /* JADX INFO: renamed from: f1 */
    public final void m39030f1() {
        if (jyb.m147479J(this.f23081b)) {
            return;
        }
        for (atl atlVar : this.f23081b) {
            int i = this.f23082c.f23128u;
            int itemAllHeight = getItemAllHeight();
            int height = getHeight();
            gmf gmfVar = this.f23080a;
            atlVar.mo38399B(i, itemAllHeight, height, gmfVar == null ? "NA" : gmfVar.mo126228f(), this.f23095p);
            if (this.f23082c.f23129v < this.f23097r.size()) {
                C8100a c8100a = this.f23097r.get(this.f23082c.f23129v);
                atlVar.mo38400c0(this.f23082c.f23129v, c8100a.f23148o, Math.abs(c8100a.f23137d), c8100a.f23141h, c8100a.getView());
            }
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final void m39031g1(ScrollState scrollState) {
        if (scrollState == this.f23099t || scrollState == null) {
            return;
        }
        this.f23099t = scrollState;
        if (jyb.m147479J(this.f23081b)) {
            return;
        }
        Iterator<atl> it = this.f23081b.iterator();
        while (it.hasNext()) {
            it.next().mo100195s0(this.f23099t);
        }
    }

    public Act getAct() {
        return (Act) getContext();
    }

    @Nullable
    public dmf getFirstShowingHolder() {
        if (jyb.m147479J(this.f23097r)) {
            return null;
        }
        return this.f23097r.get(this.f23082c.f23129v).f23134a;
    }

    public int getFixPaddingBottom() {
        return this.f23092m;
    }

    public int getInnerTransY() {
        return this.f23095p;
    }

    public int getLatestRenderIndex() {
        C8099b c8099b = this.f23082c;
        if (c8099b != null) {
            return c8099b.f23130w;
        }
        return 0;
    }

    public C22421c<Integer> getRenderObs() {
        return this.f23083d.asObservable();
    }

    public List<C8100a> getRendingList() {
        return this.f23097r;
    }

    public int getScrollH() {
        C8099b c8099b = this.f23082c;
        if (c8099b != null) {
            return c8099b.f23128u;
        }
        return 0;
    }

    public int getTopEmptySize() {
        return ((this.f23095p + getTopFix()) + getTopEmptyFixHeight()) - this.f23082c.f23128u;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m39032h1(ExpandedTouchType expandedTouchType, int i, int i2, int i3) {
        if (jyb.m147479J(this.f23081b)) {
            return;
        }
        Iterator<atl> it = this.f23081b.iterator();
        while (it.hasNext()) {
            it.next().mo38949X(i, i2, this.f23082c.f23128u, i3, expandedTouchType);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final boolean m39033i1(int i, String str) {
        boolean z;
        int iMax;
        this.f23082c.f23118k = true;
        if (i == 0 || this.f23097r.size() == 0) {
            this.f23082c.f23118k = false;
            return false;
        }
        C8099b c8099b = this.f23082c;
        if (i > 0) {
            int i2 = c8099b.f23130w;
            int i3 = 0;
            while (true) {
                if (i3 > i || i2 >= this.f23097r.size() || i3 < 0) {
                    z = false;
                    break;
                }
                C8100a c8100a = this.f23097r.get(i2);
                ExpandedItemStatus expandedItemStatus = c8100a.f23146m;
                if (expandedItemStatus == ExpandedItemStatus.RENDING) {
                    if (i2 == this.f23097r.size() - 1 && c8100a.f23139f + this.f23092m + this.f23095p <= this.f23082c.f23126s) {
                        z = true;
                        break;
                    }
                } else {
                    ExpandedItemStatus expandedItemStatus2 = ExpandedItemStatus.IDLE;
                    gmf gmfVar = this.f23080a;
                    if (expandedItemStatus == expandedItemStatus2) {
                        int iMo126227e = gmfVar.mo126227e(i2);
                        dmf dmfVarM39010N0 = m39010N0(iMo126227e);
                        View view = dmfVarM39010N0.f89621a;
                        addView(view, view.getLayoutParams());
                        c8100a.f23134a = dmfVarM39010N0;
                        m39034l0(c8100a, i2, iMo126227e, "trans d idle");
                        c8100a.f23136c = 0;
                        c8100a.f23137d = this.f23082c.f23132y;
                        c8100a.f23138e = this.f23082c.f23127t;
                        int i4 = c8100a.f23137d + c8100a.f23141h;
                        c8100a.f23139f = i4;
                        this.f23082c.f23132y = i4;
                        this.f23082c.f23130w = i2;
                    } else {
                        m39034l0(c8100a, i2, gmfVar.mo126227e(i2), "trans d recycle");
                        c8100a.f23136c = 0;
                        c8100a.f23137d = this.f23082c.f23132y;
                        c8100a.f23138e = this.f23082c.f23127t;
                        int i5 = c8100a.f23137d + c8100a.f23141h;
                        c8100a.f23139f = i5;
                        this.f23082c.f23132y = i5;
                        this.f23082c.f23130w = i2;
                    }
                }
                i3 = (c8100a.f23139f + this.f23095p) - this.f23082c.f23126s;
                if (i2 == this.f23097r.size() - 1) {
                    i3 = (c8100a.f23139f - this.f23082c.f23126s) + this.f23092m + this.f23095p;
                }
                if (((c8100a.f23139f - i) - (i2 == this.f23097r.size() - 1 ? this.f23092m : 0)) + this.f23095p <= this.f23082c.f23126s) {
                    i2++;
                }
            }
            if (i >= i3 || i3 == 0) {
                z = true;
            }
            iMax = Math.min(i, i3);
        } else {
            int i6 = c8099b.f23129v;
            int i7 = 0;
            while (Math.abs(i7) <= Math.abs(i) && i6 >= 0 && i7 <= 0) {
                C8100a c8100a2 = this.f23097r.get(i6);
                ExpandedItemStatus expandedItemStatus3 = c8100a2.f23146m;
                if (expandedItemStatus3 == ExpandedItemStatus.RENDING) {
                    if (i6 == 0 && c8100a2.f23137d >= 0) {
                        break;
                    }
                } else {
                    ExpandedItemStatus expandedItemStatus4 = ExpandedItemStatus.IDLE;
                    gmf gmfVar2 = this.f23080a;
                    if (expandedItemStatus3 == expandedItemStatus4) {
                        int iMo126227e2 = gmfVar2.mo126227e(i6);
                        dmf dmfVarM39010N1 = m39010N0(iMo126227e2);
                        View view2 = dmfVarM39010N1.f89621a;
                        addView(view2, view2.getLayoutParams());
                        c8100a2.f23134a = dmfVarM39010N1;
                        m39034l0(c8100a2, i6, iMo126227e2, "trans t idle " + i);
                        c8100a2.f23136c = 0;
                        c8100a2.f23137d = this.f23082c.f23131x - c8100a2.f23141h;
                        c8100a2.f23138e = this.f23082c.f23127t;
                        int i8 = c8100a2.f23137d;
                        c8100a2.f23139f = c8100a2.f23141h + i8;
                        this.f23082c.f23131x = i8;
                        this.f23082c.f23130w = i6;
                    } else {
                        m39034l0(c8100a2, i6, gmfVar2.mo126227e(i6), "trans t recycle" + i);
                        c8100a2.f23136c = 0;
                        c8100a2.f23137d = this.f23082c.f23131x - c8100a2.f23141h;
                        c8100a2.f23138e = this.f23082c.f23127t;
                        int i9 = c8100a2.f23137d;
                        c8100a2.f23139f = c8100a2.f23141h + i9;
                        this.f23082c.f23131x = i9;
                        this.f23082c.f23130w = i6;
                    }
                }
                i7 = c8100a2.f23137d;
                if (i7 - i >= 0) {
                    i6--;
                }
            }
            z = Math.abs(i) >= Math.abs(i7) || i7 == 0;
            iMax = Math.max(i, i7);
        }
        this.f23082c.f23128u += iMax;
        for (int i10 = 0; i10 < this.f23097r.size(); i10++) {
            C8100a c8100a3 = this.f23097r.get(i10);
            if (c8100a3.f23146m == ExpandedItemStatus.RENDING) {
                c8100a3.f23137d -= iMax;
                c8100a3.f23139f -= iMax;
                if (c8100a3.getView().isLayoutRequested()) {
                    m39022a1(c8100a3, i10, c8100a3.getType(), true);
                }
            }
        }
        m39000D0("tans diff_" + str);
        m39035s0();
        m39014T0("transRendingViewByDiff_" + str);
        this.f23082c.f23118k = false;
        return z;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m39034l0(C8100a c8100a, int i, int i2, String str) {
        c8100a.f23146m = ExpandedItemStatus.RENDING;
        this.f23080a.mo126224a(c8100a.f23134a, i, i2);
        m39022a1(c8100a, i, i2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m39016V0();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f23098s) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            m39027d1();
            this.f23082c.f23117j = false;
            this.f23082c.f23113f = x;
            this.f23082c.f23114g = y;
            if (y < ((this.f23095p + getTopFix()) + getTopEmptyFixHeight()) - this.f23082c.f23128u) {
                return false;
            }
        } else if (action == 1) {
            this.f23082c.f23117j = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f23082c.f23117j = false;
            }
        } else {
            if (this.f23082c.f23117j) {
                return true;
            }
            if (Math.abs(y - this.f23082c.f23114g) >= this.f23085f) {
                if ((this.f23082c.f23129v != 0 || this.f23082c.f23131x != 0 || y <= this.f23082c.f23114g) && getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                m39032h1(ExpandedTouchType.TOUCH_START_SCROLL, x, y, 0);
                m39031g1(ScrollState.DRAGGING);
                this.f23082c.f23117j = true;
                return true;
            }
        }
        this.f23082c.f23115h = x;
        this.f23082c.f23116i = y;
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m39014T0("system onLayout");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - this.f23089j) - this.f23091l, View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i2) - this.f23090k) - this.f23093n, 0));
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        if (size == this.f23082c.f23127t && size2 == this.f23082c.f23126s) {
            if (this.f23082c.f23118k) {
                return;
            }
            m39002F0();
            m39036v0();
            return;
        }
        this.f23082c.f23127t = size;
        this.f23082c.f23126s = size2;
        this.f23082c.m39078P(16);
        if (this.f23080a == null || this.f23097r.size() == this.f23080a.mo126226c()) {
            m39007K0();
        } else {
            m39019X0();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f23082c.m39080R(17) || this.f23098s) {
            return false;
        }
        m38995P0();
        int action = motionEvent.getAction() & 255;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        this.f23088i.addMovement(motionEvent);
        if (action == 0) {
            m39027d1();
            this.f23082c.f23117j = false;
            this.f23082c.f23113f = x;
            this.f23082c.f23114g = y;
            if (y < ((this.f23095p + getTopFix()) + getTopEmptyFixHeight()) - this.f23082c.f23128u) {
                return false;
            }
            m39032h1(ExpandedTouchType.TOUCH_DOWN, x, y, 0);
        } else if (action == 1) {
            if (this.f23082c.f23117j) {
                m39032h1(ExpandedTouchType.TOUCH_FINISH, x, y, m39026d0());
            } else {
                m39031g1(ScrollState.IDLE);
            }
            this.f23082c.f23117j = false;
        } else if (action == 2) {
            boolean z = this.f23082c.f23117j;
            C8099b c8099b = this.f23082c;
            if (z) {
                m39033i1(c8099b.f23116i - y, "touch-move");
                m39032h1(ExpandedTouchType.TOUCH_SCROLLING, x, y, 0);
            } else if (Math.abs(y - c8099b.f23114g) >= this.f23085f) {
                if ((this.f23082c.f23129v != 0 || this.f23082c.f23131x != 0 || y <= this.f23082c.f23114g) && getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.f23082c.f23117j = true;
                m39031g1(ScrollState.DRAGGING);
                m39032h1(ExpandedTouchType.TOUCH_START_SCROLL, x, y, 0);
            }
        } else if (action == 3) {
            this.f23082c.f23117j = false;
            m39031g1(ScrollState.IDLE);
        }
        this.f23082c.f23115h = x;
        this.f23082c.f23116i = y;
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s0 */
    public final void m39035s0() {
        this.f23082c.f23130w = 0;
        this.f23082c.f23132y = 0;
        if (this.f23097r.size() > 0) {
            for (int i = 0; i < this.f23097r.size(); i++) {
                C8100a c8100a = this.f23097r.get(i);
                if (c8100a.f23146m == ExpandedItemStatus.RENDING) {
                    if (c8100a.f23139f >= this.f23082c.f23126s || i == this.f23097r.size() - 1) {
                        this.f23082c.f23130w = i;
                        this.f23082c.f23132y = c8100a.f23139f;
                        return;
                    } else {
                        this.f23082c.f23130w = i;
                        this.f23082c.f23132y = c8100a.f23139f;
                    }
                }
            }
        }
    }

    public void setAdapter(gmf gmfVar) {
        this.f23080a = gmfVar;
        m39004H0();
        this.f23096q = gmfVar.m130776d().subscribe(psd0.m173596G(new y20() { // from class: l.kk2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127162a.m39013S0(obj);
            }
        }));
    }

    public void setBlockScroll(boolean z) {
        this.f23098s = z;
    }

    public void setContentPadding(int i) {
        this.f23093n = i;
    }

    public void setTopEmptyFixHeight(int i) {
        this.f23094o = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            m39028e1();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m39036v0() {
        for (int i = 0; i < this.f23097r.size(); i++) {
            C8100a c8100a = this.f23097r.get(i);
            View view = c8100a.getView();
            C8099b c8099b = this.f23082c;
            if (view != null) {
                c8099b.f23133z.put(i, Pair.create(Boolean.FALSE, Integer.valueOf(c8100a.f23141h)));
            } else {
                c8099b.f23133z.put(i, Pair.create(Boolean.FALSE, Integer.valueOf(qa00.m175859d(100.0f))));
            }
        }
    }

    public BaseExpandedView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23083d = C22507a.m222758b();
        this.f23084e = 18000;
        this.f23093n = 0;
        this.f23094o = 0;
        this.f23095p = 0;
        this.f23096q = null;
        this.f23097r = new ArrayList();
        this.f23098s = false;
        this.f23099t = ScrollState.IDLE;
        this.f23101v = new DecelerateInterpolator();
        m38996Q0();
    }

    public BaseExpandedView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23083d = C22507a.m222758b();
        this.f23084e = 18000;
        this.f23093n = 0;
        this.f23094o = 0;
        this.f23095p = 0;
        this.f23096q = null;
        this.f23097r = new ArrayList();
        this.f23098s = false;
        this.f23099t = ScrollState.IDLE;
        this.f23101v = new DecelerateInterpolator();
        m38996Q0();
    }
}
