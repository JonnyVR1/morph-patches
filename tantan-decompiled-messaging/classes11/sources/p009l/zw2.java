package p009l;

import android.content.Context;
import android.graphics.Canvas;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p000p1.mobile.putong.core.newui.home.opt.CardAnimType;
import com.p000p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p000p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p000p1.mobile.putong.core.newui.home.opt.SwipeState;
import com.p000p1.mobile.putong.core.newui.home.opt.VirtualState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.du2;
import l.o6j0;
import l.t100;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class zw2 implements jl4 {

    /* JADX INFO: renamed from: b */
    public BifrostLayout f23928b;

    /* JADX INFO: renamed from: d */
    public fr2 f23930d;

    /* JADX INFO: renamed from: e */
    public yw2 f23931e;

    /* JADX INFO: renamed from: g */
    public qj4 f23933g;

    /* JADX INFO: renamed from: i */
    public zo0 f23935i;

    /* JADX INFO: renamed from: j */
    public Context f23936j;

    /* JADX INFO: renamed from: k */
    public ra80 f23937k;

    /* JADX INFO: renamed from: l */
    public em4 f23938l;

    /* JADX INFO: renamed from: m */
    public float f23939m;

    /* JADX INFO: renamed from: n */
    public float f23940n;

    /* JADX INFO: renamed from: o */
    public float f23941o;

    /* JADX INFO: renamed from: p */
    public float f23942p;

    /* JADX INFO: renamed from: q */
    public qm4 f23943q;

    /* JADX INFO: renamed from: r */
    public long f23944r = -1;

    /* JADX INFO: renamed from: s */
    public float f23945s = 0.0f;

    /* JADX INFO: renamed from: t */
    public float f23946t = 0.0f;

    /* JADX INFO: renamed from: u */
    public boolean f23947u = true;

    /* JADX INFO: renamed from: v */
    public float f23948v = 0.0f;

    /* JADX INFO: renamed from: w */
    public float f23949w = 0.0f;

    /* JADX INFO: renamed from: a */
    public List<pol0> f23927a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public jn2 f23929c = mo11680f();

    /* JADX INFO: renamed from: f */
    public q4j0 f23932f = mo11681h();

    /* JADX INFO: renamed from: h */
    public cj2 f23934h = mo14530e();

    /* JADX INFO: renamed from: l.zw2$a */
    public static /* synthetic */ class C1374a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23950a;

        static {
            int[] iArr = new int[CardAnimType.values().length];
            f23950a = iArr;
            try {
                iArr[CardAnimType.ANIM_OUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23950a[CardAnimType.ANIM_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23950a[CardAnimType.ANIM_INSERT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public zw2(Context context) {
        this.f23939m = 100.0f;
        this.f23940n = 100.0f;
        this.f23941o = 100.0f;
        this.f23942p = 30.0f;
        this.f23936j = context;
        this.f23929c.m17174p(this);
        this.f23935i = new zo0(this, context);
        this.f23937k = new ra80();
        this.f23933g = new qj4(this);
        this.f23930d = mo14531g();
        this.f23939m = zo0.f23791t;
        this.f23941o = zo0.f23792u;
        this.f23942p = zo0.f23793v;
        this.f23940n = zo0.f23769I;
    }

    /* JADX INFO: renamed from: A */
    public jn2 m25988A() {
        return this.f23929c;
    }

    /* JADX INFO: renamed from: B */
    public BifrostLayout m25989B() {
        return this.f23928b;
    }

    /* JADX INFO: renamed from: C */
    public final float m25990C() {
        return this.f23942p;
    }

    /* JADX INFO: renamed from: D */
    public float mo14098D() {
        return this.f23928b.getHeight() * 0.25f;
    }

    /* JADX INFO: renamed from: E */
    public float mo14099E() {
        return zo0.f23766F;
    }

    /* JADX INFO: renamed from: F */
    public float mo14100F() {
        return zo0.f23766F;
    }

    /* JADX INFO: renamed from: G */
    public pol0 m25991G() {
        for (pol0 pol0Var : this.f23927a) {
            if (pol0Var.m20520b()) {
                return pol0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: H */
    public q4j0 m25992H() {
        return this.f23932f;
    }

    /* JADX INFO: renamed from: I */
    public void m25993I(og4 og4Var, long j) {
        int i = C1374a.f23950a[og4Var.f18007b.ordinal()];
        if (i == 1) {
            m26028n0(og4Var.f18021p.f18800a, SwipeState.FINISH_OUT, og4Var.f18014i);
            m26014f0(og4Var);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            m26028n0(og4Var.f18021p.f18800a, SwipeState.FINISH_BACK, og4Var.f18014i);
            mo25032J(og4Var, og4Var.f18008c + og4Var.f18009d);
            return;
        }
        m26028n0(og4Var.f18021p.f18800a, SwipeState.FINISH_BACK, og4Var.f18014i);
        mo25033L(og4Var, og4Var.f18008c + og4Var.f18009d);
        for (pol0 pol0Var : this.f23927a) {
            if (og4Var.m19750l(pol0Var) && pol0Var.f18804e == 0) {
                KeyEvent.Callback callback = pol0Var.f18800a;
                if (!(callback instanceof qm4)) {
                    break;
                }
                ((qm4) callback).mo294d0(0.0f, 0.0f, 0.0f, CardProgressAction.ANIM_DONE);
                break;
            }
        }
        qm4 qm4Var = this.f23943q;
        if (qm4Var != null) {
            CardProgressAction cardProgressAction = CardProgressAction.ANIM_DONE;
            qm4Var.mo294d0(0.0f, 0.0f, 0.0f, cardProgressAction);
            this.f23943q.mo2817v0(0.0f, 0.0f, cardProgressAction);
        }
    }

    /* JADX INFO: renamed from: J */
    public abstract void mo25032J(og4 og4Var, long j);

    /* JADX INFO: renamed from: K */
    public void m25994K(og4 og4Var, long j) {
        int i = C1374a.f23950a[og4Var.f18007b.ordinal()];
        if (i == 1) {
            mo25034M(og4Var, j);
        } else if (i == 2) {
            mo25033L(og4Var, j);
        } else {
            if (i != 3) {
                return;
            }
            mo25032J(og4Var, j);
        }
    }

    /* JADX INFO: renamed from: L */
    public abstract void mo25033L(og4 og4Var, long j);

    /* JADX INFO: renamed from: M */
    public abstract void mo25034M(og4 og4Var, long j);

    /* JADX INFO: renamed from: N */
    public void m25995N(og4 og4Var) {
        int i = C1374a.f23950a[og4Var.f18007b.ordinal()];
        if (i == 1) {
            m26028n0(og4Var.f18021p.f18800a, SwipeState.START_OUT, og4Var.f18014i);
        } else if (i == 2 || i == 3) {
            m26028n0(og4Var.f18021p.f18800a, SwipeState.START_BACK, og4Var.f18014i);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m25996O(View view, float f, float f2, float f3, float f4, CardProgressAction cardProgressAction, boolean z, String str) {
        m26019j(f, f2, f3, f4, cardProgressAction, z, str);
        qm4 qm4Var = this.f23943q;
        if (qm4Var != null) {
            qm4Var.mo2817v0(f - f3, f2 - f4, cardProgressAction);
        }
        float f5 = f - f3;
        float f6 = f5 / this.f23939m;
        float f7 = f2 - f4;
        float fM26040y = Math.abs(f7) > m26040y() ? (m26040y() + f7) / this.f23939m : 0.0f;
        if (mo14101W()) {
            fM26040y = 0.0f;
        }
        if (Math.abs(f5) < mo14103v()) {
            f6 = 0.0f;
        }
        if (fM26040y <= 0.0f) {
            float f8 = -fM26040y;
            if (Math.abs(f6) <= f8 && this.f23928b.mo2792v(true)) {
                if (Math.abs(f6) >= Math.abs(fM26040y) || Math.abs(f7) <= m26040y()) {
                    m26017i(view, 0.0f, 0.0f, 0.0f, cardProgressAction);
                    return;
                } else {
                    m26017i(view, 0.0f, 0.0f, f6 > 0.0f ? f8 - f6 : f8 + f6, cardProgressAction);
                    return;
                }
            }
        }
        if (fM26040y < 0.0f) {
            f6 = f6 > 0.0f ? f6 + fM26040y : f6 - fM26040y;
        }
        float f9 = f6;
        if (f9 < 0.0f) {
            m26017i(view, -f9, 0.0f, 0.0f, cardProgressAction);
        } else if (f9 > 0.0f) {
            m26017i(view, 0.0f, f9, 0.0f, cardProgressAction);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m25997P(float f, float f2, float f3, float f4) {
        zw2 zw2Var = this;
        int iMo12722d = zw2Var.m25988A().mo12722d();
        float fMo12723e = zw2Var.m25988A().mo12723e();
        boolean zMo12724i = zw2Var.m25988A().mo12724i();
        for (pol0 pol0Var : zw2Var.f23927a) {
            if (pol0Var.f18804e == 0) {
                pol0Var.f18800a.hashCode();
                pol0Var.f18800a.setPivotX(f3);
                pol0Var.f18800a.setPivotY(f4);
                pol0Var.f18800a.setTranslationX(f - f3);
                pol0Var.f18800a.setTranslationY(f2 - f4);
                zw2Var.m26016h0(pol0Var.f18800a, f, f2, f3, f4);
                zw2Var = this;
                zw2Var.m25996O(pol0Var.f18800a, f, f2, f3, f4, CardProgressAction.SWIPE, false, "touch move");
            } else {
                float f5 = f - f3;
                float f6 = f2 - f4;
                float fSqrt = (float) Math.sqrt((f5 * f5) + (f6 * f6));
                int i = pol0Var.f18804e;
                if (i < 0) {
                    continue;
                } else {
                    float fMin = Math.min(1.0f, fSqrt / zw2Var.f23939m);
                    float fMin2 = Math.min(i - fMin, 2.0f);
                    float f7 = 1.0f - (fMin2 * fMo12723e);
                    float f8 = f7 * f7 * f7;
                    if (Float.isNaN(f8)) {
                        return;
                    }
                    if (zw2Var.f23930d.mo14559h() && zw2Var.f23930d.mo14552a() < 1.0f) {
                        if (i == 1) {
                            pol0Var.f18800a.setAlpha(Math.min(1.0f, Math.max(0.0f, (fMin * zw2Var.f23930d.mo14553b()) + zw2Var.f23930d.mo14552a())));
                        } else if (i == 2) {
                            pol0Var.f18800a.setAlpha(Math.min(1.0f, Math.max(0.0f, fMin * zw2Var.f23930d.mo14552a())));
                        } else {
                            pol0Var.f18800a.setAlpha(0.0f);
                        }
                    }
                    float fSqrt2 = (float) Math.sqrt(Math.sqrt(fMin2));
                    float fSqrt3 = (((float) (((double) (fSqrt2 * fSqrt2 * fSqrt2)) * Math.sqrt(fSqrt2))) * iMo12722d) + (zMo12724i ? (pol0Var.f18800a.getHeight() * (1.0f - f8)) / 2.0f : 0.0f);
                    if (BifrostLayout.f2099d) {
                        pol0Var.f18800a.hashCode();
                    }
                    pol0Var.f18800a.setScaleY(f8);
                    pol0Var.f18800a.setScaleX(f8);
                    pol0Var.f18800a.setRotation(0.0f);
                    pol0Var.f18800a.setTranslationY((zw2Var.m25988A().mo12726q() ? -1.0f : 1.0f) * fSqrt3);
                    pol0Var.f18800a.setTranslationX(0.0f);
                }
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m25998Q(float f, float f2, float f3, float f4, float f5, float f6) {
        m26002U(f, f2, f3, f4, f5, f6);
    }

    /* JADX INFO: renamed from: R */
    public final void m25999R(float f, float f2, float f3, float f4, float f5, float f6) {
        CardOperation cardOperation;
        if ((-f6) <= Math.abs(f5) * mo14100F() || !this.f23928b.mo2792v(true) || mo14101W()) {
            cardOperation = f5 > 0.0f ? CardOperation.SWIPE_RIGHT : CardOperation.SWIPE_LEFT;
        } else {
            cardOperation = CardOperation.SWIPE_UP;
        }
        CardOperation cardOperation2 = cardOperation;
        float f7 = zo0.f23789r;
        float f8 = f5 / f7;
        float f9 = f6 / f7;
        float fMax = Math.max(Math.abs(f8), Math.abs(f9));
        float f10 = zo0.f23795x;
        if (fMax > f10) {
            float f11 = fMax / f10;
            f8 /= f11;
            f9 /= f11;
        }
        float f12 = f9;
        float f13 = f8;
        pol0 pol0VarM25991G = m25991G();
        pol0VarM25991G.f18809j = VirtualState.PRE_OUT;
        qo0 qo0Var = new qo0();
        qo0Var.m21119e(pol0VarM25991G.f18800a);
        qo0Var.m21118d(pol0VarM25991G.f18800a, cardOperation2, f13, f12, f5, f6, true);
        og4 og4Var = new og4(pol0VarM25991G.f18810k, pol0VarM25991G);
        og4Var.f18013h = cardOperation2;
        og4Var.f18007b = CardAnimType.ANIM_OUT;
        og4Var.m19739a(pol0VarM25991G.f18810k);
        og4Var.m19740b(VirtualState.RENDING);
        CardOperation cardOperation3 = CardOperation.SWIPE_LEFT;
        if (cardOperation2 == cardOperation3 || cardOperation2 == CardOperation.SWIPE_RIGHT) {
            float f14 = qo0Var.f19397c;
            float f15 = qo0Var.f19398d;
            og4Var.f18009d = zo0.f23777f + ((long) (((Math.sqrt((f14 - f15) * (f14 - f15)) * 1000.0d) / ((double) f10)) / ((double) zo0.f23789r)));
            og4Var.m19754p(this.f23930d.mo14554c(1.0f));
            m26032p0(f, f2, f3, f4, f13, f12, cardOperation2 == cardOperation3 ? "left" : "right", og4Var.f18009d);
        } else {
            long j = zo0.f23779h;
            og4Var.f18009d = j;
            m26032p0(f, f2, f3, f4, f13, f12, "up", j);
        }
        og4Var.f18010e = -1;
        og4Var.f18011f = qo0Var;
        this.f23930d.mo14557f(og4Var);
        this.f23935i.m25882d(og4Var);
    }

    /* JADX INFO: renamed from: S */
    public final void m26000S(float f, float f2, float f3, float f4, float f5, float f6) {
        if (Math.abs(f3 - f) <= m26037t() && (f4 - f2 <= mo14102u() || !this.f23928b.mo2792v(true) || mo14101W())) {
            m26026m0("快速返回");
            m26009c(f, f2, f3, f4, f5, f6);
            return;
        }
        if ((f - f3) * f5 < 0.0f) {
            m26012d0(f, f2, f3, f4, f5, f6);
            return;
        }
        m26026m0("快速滑动: " + f5 + " , " + f6 + "," + (Math.abs(f5) * mo14100F()));
        m25999R(f, f2, f3, f4, f5, f6);
    }

    /* JADX INFO: renamed from: T */
    public final void m26001T(float f, float f2, float f3, float f4, float f5, float f6) {
        CardOperation cardOperation;
        float f7 = -(f2 - f4);
        float f8 = f - f3;
        if (f7 <= Math.abs(f8) * mo14099E() || !this.f23928b.mo2792v(false) || Math.abs(f8) >= m25990C()) {
            int i = (f8 > 0.0f ? 1 : (f8 == 0.0f ? 0 : -1));
            CardOperation cardOperation2 = CardOperation.SWIPE_RIGHT;
        } else {
            CardOperation cardOperation3 = CardOperation.SWIPE_RIGHT;
        }
        if (Math.abs(f3 - f) / mo14099E() > f7 || !this.f23928b.f2102b || mo14101W()) {
            cardOperation = f8 > 0.0f ? CardOperation.SWIPE_RIGHT : CardOperation.SWIPE_LEFT;
        } else {
            cardOperation = CardOperation.SWIPE_UP;
        }
        CardOperation cardOperation4 = cardOperation;
        float f9 = zo0.f23789r;
        float f10 = f5 / f9;
        float f11 = f6 / f9;
        float fMax = Math.max(Math.abs(f10), Math.abs(f11));
        float f12 = zo0.f23795x;
        if (fMax > f12) {
            float f13 = fMax / f12;
            f10 /= f13;
            f11 /= f13;
        }
        float f14 = f11;
        float f15 = f10;
        pol0 pol0VarM25991G = m25991G();
        pol0VarM25991G.f18809j = VirtualState.PRE_OUT;
        qo0 qo0Var = new qo0();
        qo0Var.m21119e(pol0VarM25991G.f18800a);
        qo0Var.m21117c(pol0VarM25991G.f18800a, cardOperation4, f15, f14, f5, f6);
        og4 og4Var = new og4(pol0VarM25991G.f18810k, pol0VarM25991G);
        og4Var.f18013h = cardOperation4;
        og4Var.f18007b = CardAnimType.ANIM_OUT;
        og4Var.m19739a(pol0VarM25991G.f18810k);
        og4Var.m19740b(VirtualState.RENDING);
        CardOperation cardOperation5 = CardOperation.SWIPE_LEFT;
        if (cardOperation4 == cardOperation5 || cardOperation4 == CardOperation.SWIPE_RIGHT) {
            float f16 = qo0Var.f19397c;
            float f17 = qo0Var.f19398d;
            og4Var.f18009d = zo0.f23777f + ((long) (((Math.sqrt((f16 - f17) * (f16 - f17)) * 1000.0d) / ((double) f12)) / ((double) zo0.f23789r)));
            og4Var.m19754p(this.f23930d.mo14556e(1.0f));
            m26032p0(f, f2, f3, f4, f15, f14, cardOperation4 == cardOperation5 ? "left" : "right", og4Var.f18009d);
        } else {
            long j = zo0.f23779h;
            og4Var.f18009d = j;
            m26032p0(f, f2, f3, f4, f15, f14, "up", j);
        }
        og4Var.f18010e = -1;
        og4Var.f18011f = qo0Var;
        this.f23930d.mo14557f(og4Var);
        this.f23935i.m25882d(og4Var);
    }

    /* JADX INFO: renamed from: U */
    public final void m26002U(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        qm4 qm4Var = this.f23943q;
        if (qm4Var != null) {
            CardProgressAction cardProgressAction = CardProgressAction.SWIPE_DONE;
            qm4Var.mo294d0(0.0f, 0.0f, 0.0f, cardProgressAction);
            this.f23943q.mo2817v0(0.0f, 0.0f, cardProgressAction);
        }
        if (Math.abs(f5) > zo0.f23764D || Math.abs(f6) > zo0.f23764D) {
            m26000S(f, f2, f3, f4, f5, f6);
            return;
        }
        float f7 = f3 - f;
        float f8 = f2 - f4;
        float f9 = -f8;
        if (Math.abs(f7) / mo14099E() > f9 || !(z = this.f23928b.f2102b)) {
            if (Math.abs(f7) > m25990C()) {
                m26026m0("慢慢滑动1：" + (f - f3) + "," + f8);
                m26001T(f, f2, f3, f4, f5, f6);
                return;
            }
            m26026m0("慢慢返回1: " + (f - f3) + "," + f8);
            m26009c(f, f2, f3, f4, f5, f6);
            return;
        }
        if (z) {
            if (f9 <= mo14098D() || mo14101W()) {
                m26026m0("慢慢返回2: " + (f - f3) + "," + f8);
                m26009c(f, f2, f3, f4, f5, f6);
                return;
            }
            m26026m0("慢慢滑动2: " + (f - f3) + "," + f8);
            m26001T(f, f2, f3, f4, f5, f6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0034 A[RETURN] */
    /* JADX INFO: renamed from: V */
    public boolean m26003V() {
        if (this.f23935i.m25885g() || this.f23935i.m25884f()) {
            return false;
        }
        for (pol0 pol0Var : this.f23927a) {
            if (!pol0Var.m20524f()) {
                if (pol0Var != null) {
                    return pol0Var.m20520b();
                }
                return false;
            }
        }
        pol0Var = null;
        if (pol0Var != null) {
            return pol0Var.m20520b();
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    public boolean mo14101W() {
        return false;
    }

    /* JADX INFO: renamed from: X */
    public void m26004X(String str) {
        du2.a(BifrostLayout.f2098c, str);
    }

    /* JADX INFO: renamed from: Y */
    public void m26005Y(String str) {
        if (BifrostLayout.f2099d) {
            if (this.f23927a.size() > 0) {
                for (int i = 0; i < this.f23927a.size(); i++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    sb.append(":");
                    this.f23927a.get(i).m20522d();
                }
            }
            String str2 = BifrostLayout.f2098c;
        }
    }

    /* JADX INFO: renamed from: Z */
    public boolean m26006Z(ViewGroup viewGroup, MotionEvent motionEvent) {
        KeyEvent.Callback callback;
        pol0 pol0VarM25991G = m25991G();
        if (pol0VarM25991G != null && (callback = pol0VarM25991G.f18800a) != null && (callback instanceof rm4)) {
        }
        this.f23932f.m20807f(viewGroup, motionEvent);
        return false;
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m26007a0(ViewGroup viewGroup, MotionEvent motionEvent) {
        this.f23935i.m25880b();
        return this.f23932f.mo15047g(viewGroup, motionEvent);
    }

    /* JADX INFO: renamed from: b0 */
    public void m26008b0(boolean z, int i, int i2, int i3, int i4) {
        this.f23929c.m17170j(z, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public final void m26009c(float f, float f2, float f3, float f4, float f5, float f6) {
        pol0 pol0VarM25991G = m25991G();
        og4 og4Var = new og4(pol0VarM25991G.f18810k, pol0VarM25991G);
        og4Var.f18007b = CardAnimType.ANIM_BACK;
        og4Var.f18009d = (zo0.f23782k * 3) / 2;
        og4Var.f18010e = 0;
        og4Var.m19754p(new OvershootInterpolator());
        og4Var.m19740b(VirtualState.RENDING);
        qo0 qo0Var = new qo0();
        qo0Var.m21119e(pol0VarM25991G.f18800a);
        qo0Var.m21116b();
        og4Var.m19752n(qo0Var);
        String str = BifrostLayout.f2098c;
        m26032p0(f, f2, f3, f4, f5, f6, "back", og4Var.f18009d);
        this.f23935i.m25882d(og4Var);
    }

    /* JADX INFO: renamed from: c0 */
    public void m26010c0(int i, int i2) {
        this.f23929c.m17171k(i, i2);
        this.f23933g.m21067d(i, i2);
    }

    /* JADX INFO: renamed from: d */
    public void m26011d() {
        int iMin = Math.min(m25988A().mo12725m(), m26031p().mo11924f());
        if (iMin > 0) {
            yw2 yw2VarM26031p = m26031p();
            ArrayList arrayList = new ArrayList();
            LayoutInflater layoutInflaterM19649a = o7r.m19649a(m26035r());
            for (int i = 0; i < iMin; i++) {
                pol0 pol0Var = new pol0();
                pol0Var.f18804e = i;
                pol0Var.f18809j = VirtualState.INIT;
                pol0Var.m20521c(yw2VarM26031p.mo11927i(i), yw2VarM26031p.mo11925g(i));
                int iMo11926h = yw2VarM26031p.mo11926h(i);
                pol0Var.f18803d = iMo11926h;
                View viewMo11923e = yw2VarM26031p.mo11923e(iMo11926h, m26035r(), layoutInflaterM19649a);
                pol0Var.f18800a = viewMo11923e;
                yw2VarM26031p.mo11922d(viewMo11923e, i);
                arrayList.add(pol0Var);
            }
            this.f23927a.addAll(arrayList);
            Iterator<pol0> it = this.f23927a.iterator();
            while (it.hasNext()) {
                m25989B().addView(it.next().f18800a);
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m26012d0(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f5 / 100.0f;
        if (Math.abs(f7) < t100.d(5.0f)) {
            m26026m0("反向慢慢滑动:" + (f - f3) + "," + (f2 - f4));
            m26001T(f, f2, f3, f4, f5, f6);
            return;
        }
        if (Math.abs(f7) < t100.d(12.0f) && Math.abs(f7) >= t100.d(5.0f)) {
            m26026m0("反向慢慢返回");
            m26009c(f, f2, f3, f4, f5, f6);
            return;
        }
        m26026m0("反向快速滑动:" + f5 + " , " + f6 + " | " + (f - f3) + " | " + (f2 - f4));
        m25999R(f, f2, f3, f4, f5, f6);
    }

    /* JADX INFO: renamed from: e */
    public cj2 mo14530e() {
        return new umd();
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m26013e0(MotionEvent motionEvent) {
        return this.f23932f.mo15048h(motionEvent);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public abstract jn2 mo11680f();

    /* JADX INFO: renamed from: f0 */
    public final void m26014f0(og4 og4Var) {
        List<Integer> list = og4Var.f18018m;
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<pol0> it = this.f23927a.iterator();
        while (it.hasNext()) {
            pol0 next = it.next();
            if (list.contains(Integer.valueOf(next.f18810k)) || next.f18810k == og4Var.f18020o) {
                StringBuilder sb = new StringBuilder("realRemoveCard: ");
                sb.append(og4Var.f18020o);
                sb.append(" , d: ");
                pol0 pol0Var = og4Var.f18021p;
                sb.append(pol0Var == null ? "" : pol0Var.m20522d());
                m26004X(sb.toString());
                it.remove();
                m25989B().removeView(next.f18800a);
                this.f23937k.m21470b(next);
                this.f23931e.mo11928l(next.f18800a, false);
                String str = BifrostLayout.f2098c;
            }
        }
        if (BifrostLayout.f2099d) {
            m26005Y("anim out finish");
        }
    }

    /* JADX INFO: renamed from: g */
    public fr2 mo14531g() {
        return new fr2();
    }

    /* JADX INFO: renamed from: g0 */
    public void m26015g0(pol0 pol0Var) {
        this.f23931e.mo11929m(pol0Var);
        this.f23934h.mo12155a(this.f23931e.mo11924f());
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public q4j0 mo11681h() {
        return new q4j0(this);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m26016h0(View view, float f, float f2, float f3, float f4) {
        float width = view.getWidth() / 1.5f;
        view.setRotation((width != 0.0f ? Math.max(-1.0f, Math.min((f - f3) / width, 1.0f)) : 0.0f) * ((f2 > ((float) ((view.getHeight() / 3) * 2)) ? ((view.getHeight() / 3) * 2) - f2 : Math.min(((view.getHeight() / 3) * 2) - f2, view.getHeight() / 3)) / view.getHeight()) * 30.0f * 1.4f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final void m26017i(View view, float f, float f2, float f3, CardProgressAction cardProgressAction) {
        float f4 = f != 0.0f ? -f : f2;
        if ((f4 != -1.0f || f4 == this.f23945s) && ((f4 != 1.0f || f4 == this.f23945s) && ((f4 != 0.0f || f4 == this.f23945s) && Math.abs(f4 - this.f23945s) <= 0.01f && ((f3 != -1.0f || f3 == this.f23946t) && ((f3 != 1.0f || f3 == this.f23946t) && ((f3 != 0.0f || f3 == this.f23946t) && Math.abs(f3 - this.f23946t) <= 0.01f && !this.f23947u)))))) {
            return;
        }
        this.f23945s = f4;
        this.f23946t = f3;
        this.f23947u = cardProgressAction == CardProgressAction.SWIPE_DONE || cardProgressAction == CardProgressAction.ANIM_DONE || cardProgressAction == CardProgressAction.UNKNOWN;
        if (view instanceof qm4) {
            ((qm4) view).mo294d0(f, f2, f3, cardProgressAction);
        }
        qm4 qm4Var = this.f23943q;
        if (qm4Var != null) {
            qm4Var.mo294d0(f, f2, f3, cardProgressAction);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m26018i0(yw2 yw2Var) {
        this.f23931e = yw2Var;
        yw2Var.m25533c(this);
    }

    /* JADX INFO: renamed from: j */
    public void m26019j(float f, float f2, float f3, float f4, CardProgressAction cardProgressAction, boolean z, String str) {
        float f5;
        CardProgressAction cardProgressAction2;
        float f6;
        boolean z2;
        float f7 = f - f3;
        float f8 = f2 - f4;
        float fSqrt = (float) Math.sqrt((f7 * f7) + (f8 * f8));
        float fMin = Math.min(1.0f, fSqrt / this.f23940n);
        if ((fMin == 0.0f && this.f23948v != 0.0f) || ((fMin == 1.0f && this.f23948v != 1.0f) || Math.abs(fMin - this.f23948v) >= 0.01f)) {
            this.f23948v = fMin;
            if (!vwb.J(m26033q())) {
                for (pol0 pol0Var : m26033q()) {
                    KeyEvent.Callback callback = pol0Var.f18800a;
                    if (callback instanceof qm4) {
                        ((qm4) callback).mo1937f0(pol0Var.f18804e, this.f23948v, fSqrt, this.f23930d.mo14559h(), cardProgressAction.toString() + " reason: " + str);
                    }
                }
            }
        }
        if (vwb.J(m26033q())) {
            return;
        }
        for (pol0 pol0Var2 : m26033q()) {
            KeyEvent.Callback callback2 = pol0Var2.f18800a;
            if (callback2 instanceof qm4) {
                CardProgressAction cardProgressAction3 = cardProgressAction;
                f5 = f8;
                cardProgressAction2 = cardProgressAction3;
                f6 = f7;
                z2 = z;
                ((qm4) callback2).mo1943l0(pol0Var2.f18804e, cardProgressAction2, z2, f6, f5);
            } else {
                CardProgressAction cardProgressAction4 = cardProgressAction;
                f5 = f8;
                cardProgressAction2 = cardProgressAction4;
                f6 = f7;
                z2 = z;
            }
            float f9 = f5;
            cardProgressAction = cardProgressAction2;
            f8 = f9;
            z = z2;
            f7 = f6;
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m26020j0(BifrostLayout bifrostLayout) {
        this.f23928b = bifrostLayout;
    }

    /* JADX INFO: renamed from: k */
    public void m26021k(float f, float f2, float f3, float f4, CardProgressAction cardProgressAction, boolean z, int i, String str) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fSqrt = (float) Math.sqrt((f5 * f5) + (f6 * f6));
        float fMin = Math.min(1.0f, fSqrt / this.f23940n);
        if ((fMin != 0.0f || this.f23949w == 0.0f) && ((fMin != 1.0f || this.f23949w == 1.0f) && Math.abs(fMin - this.f23949w) < 0.01f)) {
            return;
        }
        float f7 = this.f23949w;
        this.f23949w = fMin;
        if (vwb.J(m26033q())) {
            return;
        }
        for (pol0 pol0Var : m26033q()) {
            KeyEvent.Callback callback = pol0Var.f18800a;
            if (callback instanceof qm4) {
                ((qm4) callback).mo1937f0(pol0Var.f18804e - i, this.f23949w, fSqrt, this.f23930d.mo14559h(), "after anim done reason: " + str + " detail: " + f7 + ", " + fMin);
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m26022k0(em4 em4Var) {
        this.f23938l = em4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public void m26023l(View view, float f, float f2, float f3, float f4, CardProgressAction cardProgressAction, boolean z) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        if (view instanceof qm4) {
            ((qm4) view).mo1943l0(0, cardProgressAction, z, f5, f6);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m26024l0(qm4 qm4Var) {
        this.f23943q = qm4Var;
    }

    /* JADX INFO: renamed from: m */
    public final DisplayMetrics m26025m() {
        return m26035r().getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: n */
    public int m26027n(float f) {
        return (int) (m26025m().density * f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    public void m26028n0(View view, SwipeState swipeState, boolean z) {
        if (view instanceof qm4) {
            ((qm4) view).mo1935D0(view, swipeState, z);
        }
        qm4 qm4Var = this.f23943q;
        if (qm4Var != null) {
            qm4Var.mo1935D0(view, swipeState, z);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m26030o0(SwipeState swipeState, boolean z) {
        View view;
        for (pol0 pol0Var : this.f23927a) {
            if (pol0Var.f18804e == 0) {
                view = pol0Var.f18800a;
                m26028n0(view, swipeState, z);
            }
        }
        view = null;
        m26028n0(view, swipeState, z);
    }

    /* JADX INFO: renamed from: p */
    public yw2 m26031p() {
        return this.f23931e;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m26032p0(float f, float f2, float f3, float f4, float f5, float f6, String str, long j) {
        long jM18550o = this.f23944r > 0 ? mqi0.m18550o() - this.f23944r : -1L;
        this.f23944r = mqi0.m18550o();
        o6j0.g("e_swipe_touch_info", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.f("touch_down_x", (int) f3), o6j0.a.f("touch_down_y", (int) f4), o6j0.a.f("touch_up_x", (int) f), o6j0.a.f("touch_up_y", (int) f2), o6j0.a.f("scope_x", this.f23928b.getWidth()), o6j0.a.f("scope_y", this.f23928b.getHeight()), o6j0.a.f("touch_speed_x", Math.abs((int) f5)), o6j0.a.f("touch_speed_y", Math.abs((int) f6)), o6j0.a.h("current_operation", str), o6j0.a.g("operation_interval", jM18550o), o6j0.a.g("swipe_action_during", j)});
    }

    /* JADX INFO: renamed from: q */
    public List<pol0> m26033q() {
        return this.f23927a;
    }

    /* JADX INFO: renamed from: q0 */
    public void m26034q0(float f) {
        List<pol0> list = this.f23927a;
        if (list == null || list.isEmpty() || f < 0.0f || Float.isNaN(f) || Float.isInfinite(f)) {
            return;
        }
        int iMo12722d = m25988A().mo12722d();
        float fMo12723e = m25988A().mo12723e();
        boolean zMo12724i = m25988A().mo12724i();
        for (pol0 pol0Var : this.f23927a) {
            int i = pol0Var.f18804e;
            if (i != 0 && i >= 0) {
                float fMin = Math.min(1.0f, f / this.f23939m);
                float fMin2 = Math.min(i - fMin, 2.0f);
                float f2 = 1.0f - (fMin2 * fMo12723e);
                float f3 = f2 * f2 * f2;
                if (Float.isNaN(f3)) {
                    return;
                }
                if (this.f23930d.mo14559h() && this.f23930d.mo14552a() < 1.0f) {
                    if (i == 1) {
                        pol0Var.f18800a.setAlpha(Math.min(1.0f, Math.max(0.0f, (fMin * this.f23930d.mo14553b()) + this.f23930d.mo14552a())));
                    } else if (i == 2) {
                        pol0Var.f18800a.setAlpha(Math.min(1.0f, Math.max(0.0f, fMin * this.f23930d.mo14552a())));
                    } else {
                        pol0Var.f18800a.setAlpha(0.0f);
                    }
                }
                float fSqrt = (float) Math.sqrt(Math.sqrt(fMin2));
                float fSqrt2 = (((float) (((double) (fSqrt * fSqrt * fSqrt)) * Math.sqrt(fSqrt))) * iMo12722d) + (zMo12724i ? (pol0Var.f18800a.getHeight() * (1.0f - f3)) / 2.0f : 0.0f);
                pol0Var.f18800a.setScaleY(f3);
                pol0Var.f18800a.setScaleX(f3);
                pol0Var.f18800a.setRotation(0.0f);
                pol0Var.f18800a.setTranslationY((m25988A().mo12726q() ? -1.0f : 1.0f) * fSqrt2);
                pol0Var.f18800a.setTranslationX(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public Context m26035r() {
        return this.f23936j;
    }

    /* JADX INFO: renamed from: s */
    public cj2 m26036s() {
        return this.f23934h;
    }

    /* JADX INFO: renamed from: t */
    public final float m26037t() {
        return this.f23942p;
    }

    /* JADX INFO: renamed from: u */
    public float mo14102u() {
        return t100.d(63.0f);
    }

    /* JADX INFO: renamed from: v */
    public float mo14103v() {
        return 0.0f;
    }

    /* JADX INFO: renamed from: w */
    public pol0 m26038w() {
        int i = 0;
        for (pol0 pol0Var : this.f23927a) {
            if (pol0Var.m20520b()) {
                if (i >= 1) {
                    return pol0Var;
                }
                i++;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public ra80 m26039x() {
        return this.f23937k;
    }

    /* JADX INFO: renamed from: y */
    public final float m26040y() {
        return mo14102u() / 1.5f;
    }

    /* JADX INFO: renamed from: z */
    public String m26041z(String str) {
        StringBuilder sb = new StringBuilder("from: ");
        sb.append(str);
        sb.append("=> 渲染详情:");
        List<pol0> list = this.f23927a;
        if (list != null && list.size() > 0) {
            for (int i = 0; i < this.f23927a.size(); i++) {
                sb.append(i + ":");
                sb.append(this.f23927a.get(i).m20522d());
                sb.append(" | ");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m26026m0(String str) {
    }

    /* JADX INFO: renamed from: o */
    public void m26029o(Canvas canvas) {
    }
}
