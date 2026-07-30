package com.p046p1.mobile.putong.core.newui.home.card.expanded.base;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.base.C7949a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.alf;
import p149l.c4g0;
import p149l.e30;
import p149l.emf;
import p149l.lnf;
import p149l.mkd0;
import p149l.oql;
import p149l.t100;
import p149l.vwb;
import p149l.w9j;
import p149l.xkf;

/* JADX INFO: loaded from: classes11.dex */
public class BaseExpandedView extends FrameLayout implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public alf f22338a;

    /* JADX INFO: renamed from: b */
    public List<oql> f22339b;

    /* JADX INFO: renamed from: c */
    public C7948b f22340c;

    /* JADX INFO: renamed from: d */
    public C22392a<Integer> f22341d;

    /* JADX INFO: renamed from: e */
    public final int f22342e;

    /* JADX INFO: renamed from: f */
    public int f22343f;

    /* JADX INFO: renamed from: g */
    public int f22344g;

    /* JADX INFO: renamed from: h */
    public int f22345h;

    /* JADX INFO: renamed from: i */
    public VelocityTracker f22346i;

    /* JADX INFO: renamed from: j */
    public int f22347j;

    /* JADX INFO: renamed from: k */
    public int f22348k;

    /* JADX INFO: renamed from: l */
    public int f22349l;

    /* JADX INFO: renamed from: m */
    public int f22350m;

    /* JADX INFO: renamed from: n */
    public int f22351n;

    /* JADX INFO: renamed from: o */
    public int f22352o;

    /* JADX INFO: renamed from: p */
    public int f22353p;

    /* JADX INFO: renamed from: q */
    public c4g0 f22354q;

    /* JADX INFO: renamed from: r */
    public List<C7949a> f22355r;

    /* JADX INFO: renamed from: s */
    public boolean f22356s;

    /* JADX INFO: renamed from: t */
    public ScrollState f22357t;

    /* JADX INFO: renamed from: u */
    public ValueAnimator f22358u;

    /* JADX INFO: renamed from: v */
    public TimeInterpolator f22359v;

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
    public class C7947a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public int f22360a;

        /* JADX INFO: renamed from: b */
        public int f22361b = 0;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f22362c;

        public C7947a(int i) {
            this.f22362c = i;
            this.f22360a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            int iFloatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseExpandedView.this.f22340c.f22386u = iFloatValue;
            int i = this.f22360a - iFloatValue;
            this.f22361b += i;
            this.f22360a = iFloatValue;
            BaseExpandedView.this.m38030i1(-i, "auto-scroll-top");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.base.BaseExpandedView$b */
    public class C7948b {

        /* JADX INFO: renamed from: a */
        public long f22366a;

        /* JADX INFO: renamed from: b */
        public long f22367b;

        /* JADX INFO: renamed from: c */
        public int f22368c;

        /* JADX INFO: renamed from: d */
        public int f22369d;

        /* JADX INFO: renamed from: f */
        public int f22371f;

        /* JADX INFO: renamed from: g */
        public int f22372g;

        /* JADX INFO: renamed from: h */
        public int f22373h;

        /* JADX INFO: renamed from: i */
        public int f22374i;

        /* JADX INFO: renamed from: l */
        public String f22377l;

        /* JADX INFO: renamed from: y */
        public int f22390y;

        /* JADX INFO: renamed from: e */
        public DecelerateInterpolator f22370e = new DecelerateInterpolator(1.7f);

        /* JADX INFO: renamed from: j */
        public boolean f22375j = false;

        /* JADX INFO: renamed from: k */
        public boolean f22376k = false;

        /* JADX INFO: renamed from: m */
        public boolean f22378m = true;

        /* JADX INFO: renamed from: n */
        public boolean f22379n = false;

        /* JADX INFO: renamed from: o */
        public int f22380o = 20;

        /* JADX INFO: renamed from: p */
        public int f22381p = 0;

        /* JADX INFO: renamed from: q */
        public int f22382q = -1;

        /* JADX INFO: renamed from: r */
        public int f22383r = -1;

        /* JADX INFO: renamed from: s */
        public int f22384s = -1;

        /* JADX INFO: renamed from: t */
        public int f22385t = -1;

        /* JADX INFO: renamed from: u */
        public int f22386u = 0;

        /* JADX INFO: renamed from: v */
        public int f22387v = 0;

        /* JADX INFO: renamed from: w */
        public int f22388w = 0;

        /* JADX INFO: renamed from: x */
        public int f22389x = 0;

        /* JADX INFO: renamed from: z */
        public SparseArray<Pair<Boolean, Integer>> f22391z = new SparseArray<>();

        /* JADX INFO: renamed from: A */
        public int f22364A = 0;

        public C7948b() {
        }

        /* JADX INFO: renamed from: P */
        public void m38075P(int i) {
            this.f22364A = i | this.f22364A;
        }

        /* JADX INFO: renamed from: Q */
        public final boolean m38076Q() {
            return this.f22367b <= 0 || this.f22366a <= 0 || SystemClock.elapsedRealtime() > this.f22366a;
        }

        /* JADX INFO: renamed from: R */
        public boolean m38077R(int i) {
            return this.f22364A == i;
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0014 A[PHI: r0
          0x0014: PHI (r0v15 float) = (r0v3 float), (r0v4 float) binds: [B:3:0x0012, B:6:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX INFO: renamed from: S */
        public final int m38078S() {
            float fElapsedRealtime = (SystemClock.elapsedRealtime() - this.f22367b) / (this.f22366a - this.f22367b);
            float f = 0.0f;
            if (fElapsedRealtime < 0.0f) {
                fElapsedRealtime = f;
            } else {
                f = 1.0f;
                if (fElapsedRealtime > 1.0f) {
                    fElapsedRealtime = f;
                }
            }
            float interpolation = this.f22370e.getInterpolation(fElapsedRealtime);
            int i = this.f22368c;
            int iCeil = (int) (i > 0 ? Math.ceil(i * interpolation) : Math.floor(i * interpolation));
            if (Math.abs(iCeil) >= Math.abs(this.f22368c)) {
                iCeil = this.f22368c;
                this.f22367b = 0L;
            }
            int i2 = iCeil - this.f22369d;
            this.f22369d = iCeil;
            return i2;
        }

        /* JADX INFO: renamed from: T */
        public final void m38079T(long j, int i) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f22367b = jElapsedRealtime;
            this.f22366a = jElapsedRealtime + j;
            this.f22368c = i;
            this.f22369d = 0;
        }

        /* JADX INFO: renamed from: U */
        public final void m38080U() {
            this.f22375j = false;
            int i = this.f22364A;
            if (i == 16 || i == 17) {
                this.f22364A = 16;
            } else {
                this.f22364A = 0;
            }
            this.f22386u = 0;
            this.f22391z = new SparseArray<>();
            this.f22389x = 0;
            this.f22387v = 0;
            this.f22390y = 0;
            this.f22388w = 0;
            this.f22377l = null;
            this.f22378m = true;
            this.f22379n = false;
            this.f22382q = -1;
            this.f22383r = -1;
            BaseExpandedView.this.m38028g1(ScrollState.IDLE);
        }

        /* JADX INFO: renamed from: V */
        public void m38081V() {
            this.f22367b = 0L;
            this.f22366a = 0L;
        }
    }

    public BaseExpandedView(@NonNull Context context) {
        super(context);
        this.f22341d = C22392a.m221512b();
        this.f22342e = 18000;
        this.f22351n = 0;
        this.f22352o = 0;
        this.f22353p = 0;
        this.f22354q = null;
        this.f22355r = new ArrayList();
        this.f22356s = false;
        this.f22357t = ScrollState.IDLE;
        this.f22359v = new DecelerateInterpolator();
        m37993Q0();
    }

    /* JADX INFO: renamed from: P0 */
    private void m37992P0() {
        if (this.f22346i == null) {
            this.f22346i = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    private void m37993Q0() {
        this.f22340c = new C7948b();
        this.f22343f = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f22344g = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f22345h = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f22339b = new ArrayList();
        setElevation(0.0f);
    }

    private int getItemAllHeight() {
        int iIntValue = 0;
        for (int i = 0; i < this.f22355r.size(); i++) {
            iIntValue += ((Integer) ((Pair) this.f22340c.f22391z.get(i)).second).intValue();
        }
        return iIntValue;
    }

    private String getRendingInfo() {
        StringBuilder sb = new StringBuilder();
        for (C7949a c7949a : this.f22355r) {
            sb.append(c7949a.f22404m + Constants.SEPARATOR_COMMA + c7949a.f22395d + Constants.SEPARATOR_COMMA + c7949a.f22397f + " , " + c7949a.f22406o);
            sb.append(" | ");
        }
        sb.append(" 字数量：" + getChildCount());
        return sb.toString();
    }

    private int getTopEmptyFixHeight() {
        return this.f22352o;
    }

    private int getTopFix() {
        return this.f22348k;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m37997D0(String str) {
        m37998E0(str, false);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m37998E0(String str, boolean z) {
        if (this.f22340c.f22387v < 0 || this.f22340c.f22387v >= this.f22355r.size() || this.f22355r.size() == 0) {
            this.f22340c.f22387v = 0;
            this.f22340c.f22389x = 0;
            return;
        }
        this.f22340c.f22389x = 0;
        for (int i = 0; i < this.f22355r.size(); i++) {
            C7949a c7949a = this.f22355r.get(i);
            if (c7949a.f22404m == ExpandedItemStatus.RENDING && c7949a.f22395d <= 0 && c7949a.f22397f > 0) {
                if (this.f22340c.f22387v == i && i == 0 && c7949a.f22395d == 0 && this.f22340c.f22389x != 0) {
                    int unused = this.f22340c.f22387v;
                }
                this.f22340c.f22387v = i;
                this.f22340c.f22389x = c7949a.f22395d;
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m37999F0() {
        C7948b c7948b;
        if (this.f22355r == null || (c7948b = this.f22340c) == null || c7948b.f22385t <= 0 || this.f22340c.f22384s <= 0) {
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f22355r.size(); i++) {
            C7949a c7949a = this.f22355r.get(i);
            if (c7949a.f22404m == ExpandedItemStatus.RENDING && c7949a.getView() != null) {
                m38019a1(c7949a, i, c7949a.f22406o, false);
                z = true;
            }
        }
        if (z) {
            m38017Y0();
            m37997D0("measure once");
            m38032s0();
            if (this.f22340c.f22390y < this.f22340c.f22384s) {
                m38003J0();
            }
            m38011T0("checkChildRequestLayout");
            m38006M0();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m38000G0(C7949a c7949a) {
        if (c7949a.getView() != null) {
            if (c7949a.getView().getTop() == 0 && c7949a.getView().getBottom() == 0) {
                return;
            }
            c7949a.getView().layout(0, 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m38001H0() {
        mkd0.m154992z(this.f22354q);
    }

    /* JADX INFO: renamed from: I0 */
    public void m38002I0(boolean z) {
        C7948b c7948b = this.f22340c;
        if (z) {
            c7948b.f22378m = true;
            return;
        }
        c7948b.m38080U();
        int i = 0;
        this.f22340c.f22378m = false;
        m38022c1(true);
        while (true) {
            int size = this.f22355r.size();
            List<C7949a> list = this.f22355r;
            if (i >= size) {
                list.clear();
                return;
            }
            C7949a c7949a = list.get(i);
            if (c7949a.getView() != null) {
                m38018Z0(c7949a);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m38003J0() {
        int i = this.f22340c.f22388w;
        while (true) {
            i++;
            if (i >= this.f22355r.size()) {
                return;
            }
            C7949a c7949a = this.f22355r.get(i);
            ExpandedItemStatus expandedItemStatus = c7949a.f22404m;
            if (expandedItemStatus != ExpandedItemStatus.RENDING) {
                ExpandedItemStatus expandedItemStatus2 = ExpandedItemStatus.IDLE;
                alf alfVar = this.f22338a;
                if (expandedItemStatus == expandedItemStatus2) {
                    int iMo97285e = alfVar.mo97285e(i);
                    xkf xkfVarM38007N0 = m38007N0(iMo97285e);
                    View view = xkfVarM38007N0.f193287a;
                    addView(view, view.getLayoutParams());
                    c7949a.f22392a = xkfVarM38007N0;
                    m38031l0(c7949a, i, iMo97285e, "fill bottom idle");
                    c7949a.f22394c = 0;
                    c7949a.f22395d = this.f22340c.f22390y;
                    c7949a.f22396e = this.f22340c.f22385t;
                    int i2 = c7949a.f22395d + c7949a.f22399h;
                    c7949a.f22397f = i2;
                    this.f22340c.f22390y = i2;
                    this.f22340c.f22388w = i;
                } else {
                    m38031l0(c7949a, i, alfVar.mo97285e(i), "fill bottom recycle");
                    c7949a.f22394c = 0;
                    c7949a.f22395d = this.f22340c.f22390y;
                    c7949a.f22396e = this.f22340c.f22385t;
                    int i3 = c7949a.f22395d + c7949a.f22399h;
                    c7949a.f22397f = i3;
                    this.f22340c.f22390y = i3;
                    this.f22340c.f22388w = i;
                }
            } else if (i == this.f22355r.size() - 1 && c7949a.f22397f <= this.f22340c.f22384s) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m38004K0() {
        if (this.f22340c.m38077R(17)) {
            m38005L0();
            this.f22341d.onNext(Integer.valueOf(this.f22355r.size()));
        } else if (this.f22340c.m38077R(1)) {
            requestLayout();
        } else {
            this.f22340c.m38077R(16);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m38005L0() {
        int i;
        System.currentTimeMillis();
        this.f22340c.f22376k = true;
        m38022c1(false);
        int i2 = this.f22340c.f22387v;
        if (i2 < 0 || i2 >= this.f22338a.mo97283c()) {
            this.f22340c.f22389x = 0;
            this.f22340c.f22387v = 0;
            i2 = 0;
        }
        int i3 = this.f22340c.f22389x;
        while (i3 < this.f22340c.f22384s && i2 < this.f22338a.mo97283c() && i2 < this.f22355r.size()) {
            C7949a c7949a = this.f22355r.get(i2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            ExpandedItemStatus expandedItemStatus = c7949a.f22404m;
            if (expandedItemStatus == ExpandedItemStatus.IDLE) {
                int iMo97285e = this.f22338a.mo97285e(i2);
                xkf xkfVarM38007N0 = m38007N0(iMo97285e);
                new StringBuilder("Type: ").append(iMo97285e);
                new StringBuilder(" crTime: ").append(System.currentTimeMillis() - jCurrentTimeMillis);
                View view = xkfVarM38007N0.f193287a;
                addView(view, view.getLayoutParams());
                c7949a.f22392a = xkfVarM38007N0;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                m38031l0(c7949a, i2, iMo97285e, "idle create");
                new StringBuilder("Type: ").append(iMo97285e);
                new StringBuilder(" bdTime: ").append(System.currentTimeMillis() - jCurrentTimeMillis2);
                i = c7949a.f22399h;
            } else {
                if (expandedItemStatus == ExpandedItemStatus.BE_RECYCLE) {
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    m38031l0(c7949a, i2, c7949a.getType(), "be_recycle");
                    new StringBuilder("Type: ").append(c7949a.f22406o);
                    new StringBuilder(" rdTime: ").append(System.currentTimeMillis() - jCurrentTimeMillis3);
                    i = c7949a.f22399h;
                } else if (expandedItemStatus == ExpandedItemStatus.RENDING) {
                    m38019a1(c7949a, i2, this.f22338a.mo97285e(i2), false);
                    c7949a.f22393b = false;
                }
                i2++;
            }
            i3 += i;
            i2++;
        }
        m38012U0("before order");
        m38017Y0();
        m38012U0("after order");
        m37997D0("fill list");
        m38032s0();
        m38011T0("fillListInner");
        m38006M0();
        this.f22340c.f22376k = false;
    }

    /* JADX INFO: renamed from: M0 */
    public final void m38006M0() {
        if (this.f22355r.size() <= 0 || this.f22340c.f22388w != this.f22355r.size() - 1 || this.f22340c.f22390y >= this.f22340c.f22384s) {
            return;
        }
        if ((this.f22340c.f22389x < 0 || this.f22340c.f22387v > 0) && this.f22340c.f22390y + getFixPaddingBottom() + getInnerTransY() < this.f22340c.f22384s) {
            m38030i1((((this.f22340c.f22390y + getTopFix()) + getFixPaddingBottom()) + getInnerTransY()) - this.f22340c.f22384s, "fix-notify-opt");
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final xkf m38007N0(int i) {
        View viewM117201a = m38014W0().m117201a(i);
        return viewM117201a == null ? this.f22338a.mo97282b(this, i) : (xkf) viewM117201a.getTag(xkf.f193286d.hashCode());
    }

    /* JADX INFO: renamed from: O0 */
    public final void m38008O0() {
        List<C7949a> list = this.f22355r;
        if (list != null) {
            for (C7949a c7949a : list) {
                if (c7949a.getView() != null) {
                    if (c7949a.f22397f <= getTopFix() || c7949a.f22395d >= this.f22340c.f22384s) {
                        c7949a.f22392a.m209788u(false, 0, 0, getHeight());
                    } else {
                        c7949a.f22392a.m209788u(true, c7949a.f22395d, c7949a.f22397f, getHeight());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ Boolean m38009R0(C7949a c7949a) {
        return Boolean.valueOf(c7949a.f22406o == this.f22340c.f22383r);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m38010S0(Object obj) {
        m38016X0();
    }

    /* JADX INFO: renamed from: T0 */
    public final void m38011T0(String str) {
        for (int i = 0; i < this.f22355r.size(); i++) {
            C7949a c7949a = this.f22355r.get(i);
            if (c7949a.f22404m == ExpandedItemStatus.RENDING) {
                c7949a.getView().layout(c7949a.f22394c + c7949a.f22400i + this.f22347j, c7949a.f22395d + c7949a.f22401j + getTopFix() + getInnerTransY(), (c7949a.f22396e - c7949a.f22402k) - this.f22349l, (c7949a.f22397f - c7949a.f22403l) + getTopFix() + getInnerTransY());
            }
        }
        m38027f1();
        m38008O0();
    }

    /* JADX INFO: renamed from: U0 */
    public final void m38012U0(String str) {
    }

    /* JADX INFO: renamed from: V0 */
    public final void m38013V0() {
        List<C7949a> list = this.f22355r;
        if (list != null) {
            Iterator<C7949a> it = list.iterator();
            while (it.hasNext()) {
                xkf xkfVar = it.next().f22392a;
                if (xkfVar != null) {
                    xkfVar.mo38155r();
                }
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public emf m38014W0() {
        return lnf.m150685d().m150686c(getAct());
    }

    /* JADX INFO: renamed from: X */
    public void m38015X(oql oqlVar) {
        if (!this.f22339b.contains(oqlVar)) {
            this.f22339b.add(oqlVar);
        }
        if (NullChecker.m81303a(oqlVar)) {
            oqlVar.mo155391s0(this.f22357t);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final void m38016X0() {
        boolean z;
        alf alfVar;
        C7949a c7949a;
        ExpandedItemStatus expandedItemStatus;
        if (!this.f22340c.f22378m || (this.f22340c.f22378m && !TextUtils.equals(this.f22340c.f22377l, this.f22338a.mo97286f()))) {
            m38022c1(true);
            this.f22340c.m38080U();
            z = true;
        } else {
            z = false;
        }
        this.f22340c.f22377l = this.f22338a.mo97286f();
        m38012U0("pre order: " + z);
        if (!z) {
            m37997D0("res render");
        }
        ArrayList arrayList = new ArrayList();
        int iMo97283c = this.f22338a.mo97283c();
        int i = 0;
        while (true) {
            alfVar = this.f22338a;
            if (i >= iMo97283c) {
                break;
            }
            arrayList.add(Integer.valueOf(alfVar.mo97285e(i)));
            i++;
        }
        int iMo97283c2 = alfVar.mo97283c();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < this.f22355r.size(); i2++) {
            C7949a c7949a2 = this.f22355r.get(i2);
            c7949a2.f22393b = false;
            c7949a2.f22405n = false;
            if (c7949a2.f22404m == ExpandedItemStatus.BE_RECYCLE) {
                c7949a2.f22404m = ExpandedItemStatus.PRE_RECYCLE;
            }
        }
        for (int i3 = 0; i3 < iMo97283c2; i3++) {
            int iIntValue = ((Integer) arrayList.get(i3)).intValue();
            int i4 = 0;
            while (true) {
                if (i4 >= this.f22355r.size()) {
                    c7949a = null;
                    break;
                }
                c7949a = this.f22355r.get(i4);
                if (c7949a.f22406o == iIntValue && ((expandedItemStatus = c7949a.f22404m) == ExpandedItemStatus.RENDING || expandedItemStatus == ExpandedItemStatus.PRE_RECYCLE)) {
                    xkf xkfVar = c7949a.f22392a;
                    if (xkfVar == null) {
                        break;
                    }
                    xkfVar.m209785o();
                    c7949a.f22392a.mo106149s();
                    if (!z) {
                        break;
                    }
                    c7949a.f22405n = true;
                    c7949a.f22392a.m209787t();
                    break;
                }
                i4++;
            }
            if (c7949a != null) {
                c7949a.f22404m = ExpandedItemStatus.BE_RECYCLE;
            } else {
                c7949a = new C7949a(iIntValue);
            }
            arrayList2.add(c7949a);
        }
        for (C7949a c7949a3 : this.f22355r) {
            ExpandedItemStatus expandedItemStatus2 = c7949a3.f22404m;
            if (expandedItemStatus2 != ExpandedItemStatus.IDLE && expandedItemStatus2 != ExpandedItemStatus.BE_RECYCLE) {
                c7949a3.f22404m = ExpandedItemStatus.PRE_REMOVE;
            }
        }
        Iterator<C7949a> it = this.f22355r.iterator();
        while (it.hasNext()) {
            C7949a next = it.next();
            if (next.f22404m == ExpandedItemStatus.PRE_REMOVE) {
                xkf xkfVar2 = next.f22392a;
                if (xkfVar2 != null && !next.f22405n) {
                    xkfVar2.m209787t();
                }
                it.remove();
                m38018Z0(next);
            }
        }
        this.f22355r = arrayList2;
        if (this.f22340c.f22383r >= 0) {
            this.f22340c.f22382q = vwb.m200293G(this.f22355r, new w9j() { // from class: l.dk2
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f86589a.m38009R0((C7949a) obj);
                }
            });
        }
        this.f22340c.m38075P(1);
        m38033v0();
        m38004K0();
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m38017Y0() {
        int i = this.f22340c.f22389x;
        for (int i2 = 0; i2 < this.f22355r.size(); i2++) {
            C7949a c7949a = this.f22355r.get(i2);
            ExpandedItemStatus expandedItemStatus = c7949a.f22404m;
            if (expandedItemStatus == ExpandedItemStatus.RENDING) {
                if (i2 >= this.f22340c.f22387v) {
                    c7949a.f22395d = i;
                    c7949a.f22394c = 0;
                    c7949a.f22396e = this.f22340c.f22385t;
                    i = c7949a.f22395d + c7949a.f22399h;
                    c7949a.f22397f = i;
                }
            } else if (expandedItemStatus == ExpandedItemStatus.BE_RECYCLE) {
                c7949a.f22395d = 0;
                c7949a.f22397f = 0;
                m38000G0(c7949a);
            }
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m38018Z0(C7949a c7949a) {
        c7949a.f22392a.mo106149s();
        c7949a.f22392a.m209785o();
        m38014W0().m117203c(c7949a);
        if (c7949a.getView() != null) {
            removeView(c7949a.getView());
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final void m38019a1(C7949a c7949a, int i, int i2, boolean z) {
        ViewGroup.LayoutParams layoutParams = c7949a.getView().getLayoutParams();
        boolean z2 = c7949a.getView().getVisibility() == 8;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            c7949a.f22400i = layoutParams2.leftMargin;
            c7949a.f22401j = layoutParams2.topMargin;
            c7949a.f22402k = layoutParams2.rightMargin;
            c7949a.f22403l = layoutParams2.bottomMargin;
            if (z2) {
                c7949a.f22400i = 0;
                c7949a.f22401j = 0;
                c7949a.f22402k = 0;
                c7949a.f22403l = 0;
            }
        }
        if ((z && !z2) || (!z && !z2 && c7949a.f22392a.f193287a.isLayoutRequested())) {
            c7949a.f22392a.f193287a.measure(View.MeasureSpec.makeMeasureSpec((((this.f22340c.f22385t - this.f22347j) - this.f22349l) - c7949a.f22400i) - c7949a.f22402k, 1073741824), View.MeasureSpec.makeMeasureSpec((((this.f22340c.f22384s - this.f22348k) - this.f22351n) - c7949a.f22401j) - c7949a.f22403l, 0));
        }
        if (z2) {
            c7949a.f22399h = 0;
            c7949a.f22398g = 0;
        } else {
            c7949a.f22399h = c7949a.f22392a.f193287a.getMeasuredHeight() + c7949a.f22401j + c7949a.f22403l;
            c7949a.f22398g = this.f22340c.f22385t + c7949a.f22400i + c7949a.f22402k;
        }
        c7949a.f22393b = false;
        c7949a.f22404m = ExpandedItemStatus.RENDING;
        this.f22340c.f22391z.put(i, Pair.create(Boolean.TRUE, Integer.valueOf(c7949a.f22399h)));
    }

    /* JADX INFO: renamed from: b1 */
    public void m38020b1(int i, int i2, int i3, int i4) {
        this.f22347j = i;
        this.f22348k = i2;
        this.f22349l = i3;
        this.f22350m = i4;
    }

    /* JADX INFO: renamed from: c0 */
    public void m38021c0() {
        xkf firstShowingHolder;
        if (this.f22355r == null || (firstShowingHolder = getFirstShowingHolder()) == null) {
            return;
        }
        firstShowingHolder.m209778h();
    }

    /* JADX INFO: renamed from: c1 */
    public void m38022c1(boolean z) {
        if (z || !this.f22340c.f22379n) {
            Choreographer.getInstance().removeFrameCallback(this);
            this.f22340c.f22379n = false;
            m38028g1(ScrollState.IDLE);
        }
        this.f22340c.m38081V();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b A[PHI: r2
      0x002b: PHI (r2v6 int) = (r2v2 int), (r2v3 int) binds: [B:10:0x0029, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: d0 */
    public final int m38023d0() {
        int i;
        VelocityTracker velocityTracker = this.f22346i;
        velocityTracker.computeCurrentVelocity(1000);
        int yVelocity = (int) (velocityTracker.getYVelocity() / 2.5f);
        if (Math.abs(yVelocity) > this.f22345h) {
            i = MMConstants.ERR_VCM_UNKNOWN_ERROR;
        } else {
            i = Math.abs(yVelocity) > this.f22344g ? 900 : 300;
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
        m38028g1(ScrollState.SCROLL_ANIM);
        this.f22340c.m38079T(i, -yVelocity);
        Choreographer.getInstance().postFrameCallback(this);
        return yVelocity;
    }

    /* JADX INFO: renamed from: d1 */
    public void m38024d1() {
        Choreographer.getInstance().removeFrameCallback(this);
        if (!this.f22340c.m38076Q()) {
            m38028g1(ScrollState.DRAGGING);
        }
        this.f22340c.f22379n = false;
        this.f22340c.m38081V();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        boolean z = this.f22340c.f22379n;
        C7948b c7948b = this.f22340c;
        if (!z) {
            if (c7948b.m38076Q()) {
                m38028g1(ScrollState.IDLE);
                m38022c1(true);
                return;
            } else if (m38030i1(this.f22340c.m38078S(), "touch_anim")) {
                m38028g1(ScrollState.IDLE);
                return;
            } else {
                Choreographer.getInstance().postFrameCallback(this);
                m38028g1(ScrollState.SCROLL_ANIM);
                return;
            }
        }
        int i = c7948b.f22380o;
        if (this.f22340c.f22387v == this.f22340c.f22382q && this.f22340c.f22389x < this.f22340c.f22380o) {
            i = this.f22340c.f22389x;
        }
        if (this.f22340c.f22381p > 0 && this.f22340c.f22387v == this.f22340c.f22382q - 1) {
            C7949a c7949a = this.f22355r.get(this.f22340c.f22387v);
            if ((((this.f22340c.f22389x + c7949a.f22399h) + c7949a.f22403l) + this.f22348k) - i < this.f22340c.f22381p) {
                m38030i1((((this.f22340c.f22389x + c7949a.f22399h) + c7949a.f22403l) + this.f22348k) - this.f22340c.f22381p, "auto_scroll_case1");
                this.f22340c.f22379n = false;
                m38028g1(ScrollState.IDLE);
                return;
            }
        }
        boolean zM38030i1 = m38030i1(i, "auto_scroll_case2");
        C7948b c7948b2 = this.f22340c;
        if (zM38030i1) {
            c7948b2.f22379n = false;
            m38028g1(ScrollState.IDLE);
            return;
        }
        if (c7948b2.f22387v == this.f22340c.f22382q && this.f22340c.f22389x <= 0) {
            m38030i1(this.f22340c.f22389x, "auto_scroll_case3");
            this.f22340c.f22379n = false;
            m38028g1(ScrollState.IDLE);
        } else {
            if (this.f22340c.f22382q >= this.f22355r.size() || this.f22340c.f22387v > this.f22340c.f22382q) {
                this.f22340c.f22379n = false;
                m38028g1(ScrollState.IDLE);
                return;
            }
            int i2 = this.f22340c.f22387v;
            int i3 = this.f22340c.f22382q;
            C7948b c7948b3 = this.f22340c;
            if (i2 < i3) {
                c7948b3.f22380o += 20;
                C7948b c7948b4 = this.f22340c;
                c7948b4.f22380o = Math.min(500, c7948b4.f22380o);
            } else {
                c7948b3.f22380o = Math.max(50, c7948b3.f22380o - 20);
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* JADX INFO: renamed from: e1 */
    public void m38025e1() {
        List<C7949a> list = this.f22355r;
        if (list != null) {
            Iterator<C7949a> it = list.iterator();
            while (it.hasNext()) {
                xkf xkfVar = it.next().f22392a;
                if (xkfVar != null) {
                    xkfVar.mo209789v();
                }
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m38026f0(long j) {
        ValueAnimator valueAnimator = this.f22358u;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f22358u.cancel();
        }
        m38022c1(true);
        int topFix = this.f22340c.f22386u + getTopFix() + t100.m186890d(50.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(topFix, 0.0f);
        this.f22358u = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(j);
        this.f22358u.setInterpolator(this.f22359v);
        this.f22358u.addUpdateListener(new C7947a(topFix));
        this.f22358u.start();
    }

    /* JADX INFO: renamed from: f1 */
    public final void m38027f1() {
        if (vwb.m200296J(this.f22339b)) {
            return;
        }
        for (oql oqlVar : this.f22339b) {
            int i = this.f22340c.f22386u;
            int itemAllHeight = getItemAllHeight();
            int height = getHeight();
            alf alfVar = this.f22338a;
            oqlVar.mo37396B(i, itemAllHeight, height, alfVar == null ? "NA" : alfVar.mo97286f(), this.f22353p);
            if (this.f22340c.f22387v < this.f22355r.size()) {
                C7949a c7949a = this.f22355r.get(this.f22340c.f22387v);
                oqlVar.mo37397c0(this.f22340c.f22387v, c7949a.f22406o, Math.abs(c7949a.f22395d), c7949a.f22399h, c7949a.getView());
            }
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final void m38028g1(ScrollState scrollState) {
        if (scrollState == this.f22357t || scrollState == null) {
            return;
        }
        this.f22357t = scrollState;
        if (vwb.m200296J(this.f22339b)) {
            return;
        }
        Iterator<oql> it = this.f22339b.iterator();
        while (it.hasNext()) {
            it.next().mo155391s0(this.f22357t);
        }
    }

    public Act getAct() {
        return (Act) getContext();
    }

    @Nullable
    public xkf getFirstShowingHolder() {
        if (vwb.m200296J(this.f22355r)) {
            return null;
        }
        return this.f22355r.get(this.f22340c.f22387v).f22392a;
    }

    public int getFixPaddingBottom() {
        return this.f22350m;
    }

    public int getInnerTransY() {
        return this.f22353p;
    }

    public int getLatestRenderIndex() {
        C7948b c7948b = this.f22340c;
        if (c7948b != null) {
            return c7948b.f22388w;
        }
        return 0;
    }

    public C22306c<Integer> getRenderObs() {
        return this.f22341d.asObservable();
    }

    public List<C7949a> getRendingList() {
        return this.f22355r;
    }

    public int getScrollH() {
        C7948b c7948b = this.f22340c;
        if (c7948b != null) {
            return c7948b.f22386u;
        }
        return 0;
    }

    public int getTopEmptySize() {
        return ((this.f22353p + getTopFix()) + getTopEmptyFixHeight()) - this.f22340c.f22386u;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m38029h1(ExpandedTouchType expandedTouchType, int i, int i2, int i3) {
        if (vwb.m200296J(this.f22339b)) {
            return;
        }
        Iterator<oql> it = this.f22339b.iterator();
        while (it.hasNext()) {
            it.next().mo37946X(i, i2, this.f22340c.f22386u, i3, expandedTouchType);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final boolean m38030i1(int i, String str) {
        boolean z;
        int iMax;
        this.f22340c.f22376k = true;
        if (i == 0 || this.f22355r.size() == 0) {
            this.f22340c.f22376k = false;
            return false;
        }
        C7948b c7948b = this.f22340c;
        if (i > 0) {
            int i2 = c7948b.f22388w;
            int i3 = 0;
            while (true) {
                if (i3 > i || i2 >= this.f22355r.size() || i3 < 0) {
                    z = false;
                    break;
                }
                C7949a c7949a = this.f22355r.get(i2);
                ExpandedItemStatus expandedItemStatus = c7949a.f22404m;
                if (expandedItemStatus == ExpandedItemStatus.RENDING) {
                    if (i2 == this.f22355r.size() - 1 && c7949a.f22397f + this.f22350m + this.f22353p <= this.f22340c.f22384s) {
                        z = true;
                        break;
                    }
                } else {
                    ExpandedItemStatus expandedItemStatus2 = ExpandedItemStatus.IDLE;
                    alf alfVar = this.f22338a;
                    if (expandedItemStatus == expandedItemStatus2) {
                        int iMo97285e = alfVar.mo97285e(i2);
                        xkf xkfVarM38007N0 = m38007N0(iMo97285e);
                        View view = xkfVarM38007N0.f193287a;
                        addView(view, view.getLayoutParams());
                        c7949a.f22392a = xkfVarM38007N0;
                        m38031l0(c7949a, i2, iMo97285e, "trans d idle");
                        c7949a.f22394c = 0;
                        c7949a.f22395d = this.f22340c.f22390y;
                        c7949a.f22396e = this.f22340c.f22385t;
                        int i4 = c7949a.f22395d + c7949a.f22399h;
                        c7949a.f22397f = i4;
                        this.f22340c.f22390y = i4;
                        this.f22340c.f22388w = i2;
                    } else {
                        m38031l0(c7949a, i2, alfVar.mo97285e(i2), "trans d recycle");
                        c7949a.f22394c = 0;
                        c7949a.f22395d = this.f22340c.f22390y;
                        c7949a.f22396e = this.f22340c.f22385t;
                        int i5 = c7949a.f22395d + c7949a.f22399h;
                        c7949a.f22397f = i5;
                        this.f22340c.f22390y = i5;
                        this.f22340c.f22388w = i2;
                    }
                }
                i3 = (c7949a.f22397f + this.f22353p) - this.f22340c.f22384s;
                if (i2 == this.f22355r.size() - 1) {
                    i3 = (c7949a.f22397f - this.f22340c.f22384s) + this.f22350m + this.f22353p;
                }
                if (((c7949a.f22397f - i) - (i2 == this.f22355r.size() - 1 ? this.f22350m : 0)) + this.f22353p <= this.f22340c.f22384s) {
                    i2++;
                }
            }
            if (i >= i3 || i3 == 0) {
                z = true;
            }
            iMax = Math.min(i, i3);
        } else {
            int i6 = c7948b.f22387v;
            int i7 = 0;
            while (Math.abs(i7) <= Math.abs(i) && i6 >= 0 && i7 <= 0) {
                C7949a c7949a2 = this.f22355r.get(i6);
                ExpandedItemStatus expandedItemStatus3 = c7949a2.f22404m;
                if (expandedItemStatus3 == ExpandedItemStatus.RENDING) {
                    if (i6 == 0 && c7949a2.f22395d >= 0) {
                        break;
                    }
                } else {
                    ExpandedItemStatus expandedItemStatus4 = ExpandedItemStatus.IDLE;
                    alf alfVar2 = this.f22338a;
                    if (expandedItemStatus3 == expandedItemStatus4) {
                        int iMo97285e2 = alfVar2.mo97285e(i6);
                        xkf xkfVarM38007N1 = m38007N0(iMo97285e2);
                        View view2 = xkfVarM38007N1.f193287a;
                        addView(view2, view2.getLayoutParams());
                        c7949a2.f22392a = xkfVarM38007N1;
                        m38031l0(c7949a2, i6, iMo97285e2, "trans t idle " + i);
                        c7949a2.f22394c = 0;
                        c7949a2.f22395d = this.f22340c.f22389x - c7949a2.f22399h;
                        c7949a2.f22396e = this.f22340c.f22385t;
                        int i8 = c7949a2.f22395d;
                        c7949a2.f22397f = c7949a2.f22399h + i8;
                        this.f22340c.f22389x = i8;
                        this.f22340c.f22388w = i6;
                    } else {
                        m38031l0(c7949a2, i6, alfVar2.mo97285e(i6), "trans t recycle" + i);
                        c7949a2.f22394c = 0;
                        c7949a2.f22395d = this.f22340c.f22389x - c7949a2.f22399h;
                        c7949a2.f22396e = this.f22340c.f22385t;
                        int i9 = c7949a2.f22395d;
                        c7949a2.f22397f = c7949a2.f22399h + i9;
                        this.f22340c.f22389x = i9;
                        this.f22340c.f22388w = i6;
                    }
                }
                i7 = c7949a2.f22395d;
                if (i7 - i >= 0) {
                    i6--;
                }
            }
            z = Math.abs(i) >= Math.abs(i7) || i7 == 0;
            iMax = Math.max(i, i7);
        }
        this.f22340c.f22386u += iMax;
        for (int i10 = 0; i10 < this.f22355r.size(); i10++) {
            C7949a c7949a3 = this.f22355r.get(i10);
            if (c7949a3.f22404m == ExpandedItemStatus.RENDING) {
                c7949a3.f22395d -= iMax;
                c7949a3.f22397f -= iMax;
                if (c7949a3.getView().isLayoutRequested()) {
                    m38019a1(c7949a3, i10, c7949a3.getType(), true);
                }
            }
        }
        m37997D0("tans diff_" + str);
        m38032s0();
        m38011T0("transRendingViewByDiff_" + str);
        this.f22340c.f22376k = false;
        return z;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m38031l0(C7949a c7949a, int i, int i2, String str) {
        c7949a.f22404m = ExpandedItemStatus.RENDING;
        this.f22338a.mo97281a(c7949a.f22392a, i, i2);
        m38019a1(c7949a, i, i2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m38013V0();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f22356s) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            m38024d1();
            this.f22340c.f22375j = false;
            this.f22340c.f22371f = x;
            this.f22340c.f22372g = y;
            if (y < ((this.f22353p + getTopFix()) + getTopEmptyFixHeight()) - this.f22340c.f22386u) {
                return false;
            }
        } else if (action == 1) {
            this.f22340c.f22375j = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f22340c.f22375j = false;
            }
        } else {
            if (this.f22340c.f22375j) {
                return true;
            }
            if (Math.abs(y - this.f22340c.f22372g) >= this.f22343f) {
                if ((this.f22340c.f22387v != 0 || this.f22340c.f22389x != 0 || y <= this.f22340c.f22372g) && getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                m38029h1(ExpandedTouchType.TOUCH_START_SCROLL, x, y, 0);
                m38028g1(ScrollState.DRAGGING);
                this.f22340c.f22375j = true;
                return true;
            }
        }
        this.f22340c.f22373h = x;
        this.f22340c.f22374i = y;
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m38011T0("system onLayout");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - this.f22347j) - this.f22349l, View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i2) - this.f22348k) - this.f22351n, 0));
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        if (size == this.f22340c.f22385t && size2 == this.f22340c.f22384s) {
            if (this.f22340c.f22376k) {
                return;
            }
            m37999F0();
            m38033v0();
            return;
        }
        this.f22340c.f22385t = size;
        this.f22340c.f22384s = size2;
        this.f22340c.m38075P(16);
        if (this.f22338a == null || this.f22355r.size() == this.f22338a.mo97283c()) {
            m38004K0();
        } else {
            m38016X0();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f22340c.m38077R(17) || this.f22356s) {
            return false;
        }
        m37992P0();
        int action = motionEvent.getAction() & 255;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        this.f22346i.addMovement(motionEvent);
        if (action == 0) {
            m38024d1();
            this.f22340c.f22375j = false;
            this.f22340c.f22371f = x;
            this.f22340c.f22372g = y;
            if (y < ((this.f22353p + getTopFix()) + getTopEmptyFixHeight()) - this.f22340c.f22386u) {
                return false;
            }
            m38029h1(ExpandedTouchType.TOUCH_DOWN, x, y, 0);
        } else if (action == 1) {
            if (this.f22340c.f22375j) {
                m38029h1(ExpandedTouchType.TOUCH_FINISH, x, y, m38023d0());
            } else {
                m38028g1(ScrollState.IDLE);
            }
            this.f22340c.f22375j = false;
        } else if (action == 2) {
            boolean z = this.f22340c.f22375j;
            C7948b c7948b = this.f22340c;
            if (z) {
                m38030i1(c7948b.f22374i - y, "touch-move");
                m38029h1(ExpandedTouchType.TOUCH_SCROLLING, x, y, 0);
            } else if (Math.abs(y - c7948b.f22372g) >= this.f22343f) {
                if ((this.f22340c.f22387v != 0 || this.f22340c.f22389x != 0 || y <= this.f22340c.f22372g) && getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.f22340c.f22375j = true;
                m38028g1(ScrollState.DRAGGING);
                m38029h1(ExpandedTouchType.TOUCH_START_SCROLL, x, y, 0);
            }
        } else if (action == 3) {
            this.f22340c.f22375j = false;
            m38028g1(ScrollState.IDLE);
        }
        this.f22340c.f22373h = x;
        this.f22340c.f22374i = y;
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s0 */
    public final void m38032s0() {
        this.f22340c.f22388w = 0;
        this.f22340c.f22390y = 0;
        if (this.f22355r.size() > 0) {
            for (int i = 0; i < this.f22355r.size(); i++) {
                C7949a c7949a = this.f22355r.get(i);
                if (c7949a.f22404m == ExpandedItemStatus.RENDING) {
                    if (c7949a.f22397f >= this.f22340c.f22384s || i == this.f22355r.size() - 1) {
                        this.f22340c.f22388w = i;
                        this.f22340c.f22390y = c7949a.f22397f;
                        return;
                    } else {
                        this.f22340c.f22388w = i;
                        this.f22340c.f22390y = c7949a.f22397f;
                    }
                }
            }
        }
    }

    public void setAdapter(alf alfVar) {
        this.f22338a = alfVar;
        m38001H0();
        this.f22354q = alfVar.m97284d().subscribe(mkd0.m154955G(new e30() { // from class: l.ck2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81270a.m38010S0(obj);
            }
        }));
    }

    public void setBlockScroll(boolean z) {
        this.f22356s = z;
    }

    public void setContentPadding(int i) {
        this.f22351n = i;
    }

    public void setTopEmptyFixHeight(int i) {
        this.f22352o = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            m38025e1();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m38033v0() {
        for (int i = 0; i < this.f22355r.size(); i++) {
            C7949a c7949a = this.f22355r.get(i);
            View view = c7949a.getView();
            C7948b c7948b = this.f22340c;
            if (view != null) {
                c7948b.f22391z.put(i, Pair.create(Boolean.FALSE, Integer.valueOf(c7949a.f22399h)));
            } else {
                c7948b.f22391z.put(i, Pair.create(Boolean.FALSE, Integer.valueOf(t100.m186890d(100.0f))));
            }
        }
    }

    public BaseExpandedView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22341d = C22392a.m221512b();
        this.f22342e = 18000;
        this.f22351n = 0;
        this.f22352o = 0;
        this.f22353p = 0;
        this.f22354q = null;
        this.f22355r = new ArrayList();
        this.f22356s = false;
        this.f22357t = ScrollState.IDLE;
        this.f22359v = new DecelerateInterpolator();
        m37993Q0();
    }

    public BaseExpandedView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22341d = C22392a.m221512b();
        this.f22342e = 18000;
        this.f22351n = 0;
        this.f22352o = 0;
        this.f22353p = 0;
        this.f22354q = null;
        this.f22355r = new ArrayList();
        this.f22356s = false;
        this.f22357t = ScrollState.IDLE;
        this.f22359v = new DecelerateInterpolator();
        m37993Q0();
    }
}
