package p153l;

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
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p051p1.mobile.putong.core.newui.home.opt.CardAnimType;
import com.p051p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p051p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p051p1.mobile.putong.core.newui.home.opt.SwipeState;
import com.p051p1.mobile.putong.core.newui.home.opt.VirtualState;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ox2 implements im4 {

    /* JADX INFO: renamed from: b */
    public BifrostLayout f149592b;

    /* JADX INFO: renamed from: d */
    public vr2 f149594d;

    /* JADX INFO: renamed from: e */
    public nx2 f149595e;

    /* JADX INFO: renamed from: g */
    public pk4 f149597g;

    /* JADX INFO: renamed from: i */
    public vo0 f149599i;

    /* JADX INFO: renamed from: j */
    public Context f149600j;

    /* JADX INFO: renamed from: k */
    public xi80 f149601k;

    /* JADX INFO: renamed from: l */
    public dn4 f149602l;

    /* JADX INFO: renamed from: m */
    public float f149603m;

    /* JADX INFO: renamed from: n */
    public float f149604n;

    /* JADX INFO: renamed from: o */
    public float f149605o;

    /* JADX INFO: renamed from: p */
    public float f149606p;

    /* JADX INFO: renamed from: q */
    public pn4 f149607q;

    /* JADX INFO: renamed from: r */
    public long f149608r = -1;

    /* JADX INFO: renamed from: s */
    public float f149609s = 0.0f;

    /* JADX INFO: renamed from: t */
    public float f149610t = 0.0f;

    /* JADX INFO: renamed from: u */
    public boolean f149611u = true;

    /* JADX INFO: renamed from: v */
    public float f149612v = 0.0f;

    /* JADX INFO: renamed from: w */
    public float f149613w = 0.0f;

    /* JADX INFO: renamed from: a */
    public List<txl0> f149591a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public qn2 f149593c = mo111754f();

    /* JADX INFO: renamed from: f */
    public udj0 f149596f = mo169647h();

    /* JADX INFO: renamed from: h */
    public kj2 f149598h = mo155050e();

    /* JADX INFO: renamed from: l.ox2$a */
    public static /* synthetic */ class C19240a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f149614a;

        static {
            int[] iArr = new int[CardAnimType.values().length];
            f149614a = iArr;
            try {
                iArr[CardAnimType.ANIM_OUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f149614a[CardAnimType.ANIM_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f149614a[CardAnimType.ANIM_INSERT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ox2(Context context) {
        this.f149603m = 100.0f;
        this.f149604n = 100.0f;
        this.f149605o = 100.0f;
        this.f149606p = 30.0f;
        this.f149600j = context;
        this.f149593c.m177177p(this);
        this.f149599i = new vo0(this, context);
        this.f149601k = new xi80();
        this.f149597g = new pk4(this);
        this.f149594d = mo155051g();
        this.f149603m = vo0.f184973t;
        this.f149605o = vo0.f184974u;
        this.f149606p = vo0.f184975v;
        this.f149604n = vo0.f184951I;
    }

    /* JADX INFO: renamed from: A */
    public qn2 m169619A() {
        return this.f149593c;
    }

    /* JADX INFO: renamed from: B */
    public BifrostLayout m169620B() {
        return this.f149592b;
    }

    /* JADX INFO: renamed from: C */
    public final float m169621C() {
        return this.f149606p;
    }

    /* JADX INFO: renamed from: D */
    public float mo118218D() {
        return this.f149592b.getHeight() * 0.25f;
    }

    /* JADX INFO: renamed from: E */
    public float mo118219E() {
        return vo0.f184948F;
    }

    /* JADX INFO: renamed from: F */
    public float mo118220F() {
        return vo0.f184948F;
    }

    /* JADX INFO: renamed from: G */
    public txl0 m169622G() {
        for (txl0 txl0Var : this.f149591a) {
            if (txl0Var.m193509b()) {
                return txl0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: H */
    public udj0 m169623H() {
        return this.f149596f;
    }

    /* JADX INFO: renamed from: I */
    public void m169624I(nh4 nh4Var, long j) {
        int i = C19240a.f149614a[nh4Var.f141908b.ordinal()];
        if (i == 1) {
            m169660n0(nh4Var.f141922p.f176568a, SwipeState.FINISH_OUT, nh4Var.f141915i);
            m169645f0(nh4Var);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            m169660n0(nh4Var.f141922p.f176568a, SwipeState.FINISH_BACK, nh4Var.f141915i);
            mo160617J(nh4Var, nh4Var.f141909c + nh4Var.f141910d);
            return;
        }
        m169660n0(nh4Var.f141922p.f176568a, SwipeState.FINISH_BACK, nh4Var.f141915i);
        mo160618L(nh4Var, nh4Var.f141909c + nh4Var.f141910d);
        for (txl0 txl0Var : this.f149591a) {
            if (nh4Var.m163037l(txl0Var) && txl0Var.f176572e == 0) {
                KeyEvent.Callback callback = txl0Var.f176568a;
                if (!(callback instanceof pn4)) {
                    break;
                }
                ((pn4) callback).mo37368d0(0.0f, 0.0f, 0.0f, CardProgressAction.ANIM_DONE);
                break;
            }
        }
        pn4 pn4Var = this.f149607q;
        if (pn4Var != null) {
            CardProgressAction cardProgressAction = CardProgressAction.ANIM_DONE;
            pn4Var.mo37368d0(0.0f, 0.0f, 0.0f, cardProgressAction);
            this.f149607q.mo39824v0(0.0f, 0.0f, cardProgressAction);
        }
    }

    /* JADX INFO: renamed from: J */
    public abstract void mo160617J(nh4 nh4Var, long j);

    /* JADX INFO: renamed from: K */
    public void m169625K(nh4 nh4Var, long j) {
        int i = C19240a.f149614a[nh4Var.f141908b.ordinal()];
        if (i == 1) {
            mo160619M(nh4Var, j);
        } else if (i == 2) {
            mo160618L(nh4Var, j);
        } else {
            if (i != 3) {
                return;
            }
            mo160617J(nh4Var, j);
        }
    }

    /* JADX INFO: renamed from: L */
    public abstract void mo160618L(nh4 nh4Var, long j);

    /* JADX INFO: renamed from: M */
    public abstract void mo160619M(nh4 nh4Var, long j);

    /* JADX INFO: renamed from: N */
    public void m169626N(nh4 nh4Var) {
        int i = C19240a.f149614a[nh4Var.f141908b.ordinal()];
        if (i == 1) {
            m169660n0(nh4Var.f141922p.f176568a, SwipeState.START_OUT, nh4Var.f141915i);
        } else if (i == 2 || i == 3) {
            m169660n0(nh4Var.f141922p.f176568a, SwipeState.START_BACK, nh4Var.f141915i);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m169627O(View view, float f, float f2, float f3, float f4, CardProgressAction cardProgressAction, boolean z, String str) {
        m169651j(f, f2, f3, f4, cardProgressAction, z, str);
        pn4 pn4Var = this.f149607q;
        if (pn4Var != null) {
            pn4Var.mo39824v0(f - f3, f2 - f4, cardProgressAction);
        }
        float f5 = f - f3;
        float f6 = f5 / this.f149603m;
        float f7 = f2 - f4;
        float fM169672y = Math.abs(f7) > m169672y() ? (m169672y() + f7) / this.f149603m : 0.0f;
        if (mo118221W()) {
            fM169672y = 0.0f;
        }
        if (Math.abs(f5) < mo118223v()) {
            f6 = 0.0f;
        }
        if (fM169672y <= 0.0f) {
            float f8 = -fM169672y;
            if (Math.abs(f6) <= f8 && this.f149592b.mo39799v(true)) {
                if (Math.abs(f6) >= Math.abs(fM169672y) || Math.abs(f7) <= m169672y()) {
                    m169649i(view, 0.0f, 0.0f, 0.0f, cardProgressAction);
                    return;
                } else {
                    m169649i(view, 0.0f, 0.0f, f6 > 0.0f ? f8 - f6 : f8 + f6, cardProgressAction);
                    return;
                }
            }
        }
        if (fM169672y < 0.0f) {
            f6 = f6 > 0.0f ? f6 + fM169672y : f6 - fM169672y;
        }
        float f9 = f6;
        if (f9 < 0.0f) {
            m169649i(view, -f9, 0.0f, 0.0f, cardProgressAction);
        } else if (f9 > 0.0f) {
            m169649i(view, 0.0f, f9, 0.0f, cardProgressAction);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m169628P(float f, float f2, float f3, float f4) {
        ox2 ox2Var = this;
        int iMo98955d = ox2Var.m169619A().mo98955d();
        float fMo98956e = ox2Var.m169619A().mo98956e();
        boolean zMo98957i = ox2Var.m169619A().mo98957i();
        for (txl0 txl0Var : ox2Var.f149591a) {
            if (txl0Var.f176572e == 0) {
                txl0Var.f176568a.hashCode();
                txl0Var.f176568a.setPivotX(f3);
                txl0Var.f176568a.setPivotY(f4);
                txl0Var.f176568a.setTranslationX(f - f3);
                txl0Var.f176568a.setTranslationY(f2 - f4);
                ox2Var.m169648h0(txl0Var.f176568a, f, f2, f3, f4);
                ox2Var = this;
                ox2Var.m169627O(txl0Var.f176568a, f, f2, f3, f4, CardProgressAction.SWIPE, false, "touch move");
            } else {
                float f5 = f - f3;
                float f6 = f2 - f4;
                float fSqrt = (float) Math.sqrt((f5 * f5) + (f6 * f6));
                int i = txl0Var.f176572e;
                if (i < 0) {
                    continue;
                } else {
                    float fMin = Math.min(1.0f, fSqrt / ox2Var.f149603m);
                    float fMin2 = Math.min(i - fMin, 2.0f);
                    float f7 = 1.0f - (fMin2 * fMo98956e);
                    float f8 = f7 * f7 * f7;
                    if (Float.isNaN(f8)) {
                        return;
                    }
                    if (ox2Var.f149594d.mo164123h() && ox2Var.f149594d.mo164116a() < 1.0f) {
                        if (i == 1) {
                            txl0Var.f176568a.setAlpha(Math.min(1.0f, Math.max(0.0f, (fMin * ox2Var.f149594d.mo164117b()) + ox2Var.f149594d.mo164116a())));
                        } else if (i == 2) {
                            txl0Var.f176568a.setAlpha(Math.min(1.0f, Math.max(0.0f, fMin * ox2Var.f149594d.mo164116a())));
                        } else {
                            txl0Var.f176568a.setAlpha(0.0f);
                        }
                    }
                    float fSqrt2 = (float) Math.sqrt(Math.sqrt(fMin2));
                    float fSqrt3 = (((float) (((double) (fSqrt2 * fSqrt2 * fSqrt2)) * Math.sqrt(fSqrt2))) * iMo98955d) + (zMo98957i ? (txl0Var.f176568a.getHeight() * (1.0f - f8)) / 2.0f : 0.0f);
                    if (BifrostLayout.f24063d) {
                        txl0Var.f176568a.hashCode();
                    }
                    txl0Var.f176568a.setScaleY(f8);
                    txl0Var.f176568a.setScaleX(f8);
                    txl0Var.f176568a.setRotation(0.0f);
                    txl0Var.f176568a.setTranslationY((ox2Var.m169619A().mo141296q() ? -1.0f : 1.0f) * fSqrt3);
                    txl0Var.f176568a.setTranslationX(0.0f);
                }
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m169629Q(float f, float f2, float f3, float f4, float f5, float f6) {
        m169633U(f, f2, f3, f4, f5, f6);
    }

    /* JADX INFO: renamed from: R */
    public final void m169630R(float f, float f2, float f3, float f4, float f5, float f6) {
        CardOperation cardOperation;
        if ((-f6) <= Math.abs(f5) * mo118220F() || !this.f149592b.mo39799v(true) || mo118221W()) {
            cardOperation = f5 > 0.0f ? CardOperation.SWIPE_RIGHT : CardOperation.SWIPE_LEFT;
        } else {
            cardOperation = CardOperation.SWIPE_UP;
        }
        CardOperation cardOperation2 = cardOperation;
        float f7 = vo0.f184971r;
        float f8 = f5 / f7;
        float f9 = f6 / f7;
        float fMax = Math.max(Math.abs(f8), Math.abs(f9));
        float f10 = vo0.f184977x;
        if (fMax > f10) {
            float f11 = fMax / f10;
            f8 /= f11;
            f9 /= f11;
        }
        float f12 = f9;
        float f13 = f8;
        txl0 txl0VarM169622G = m169622G();
        txl0VarM169622G.f176577j = VirtualState.PRE_OUT;
        mo0 mo0Var = new mo0();
        mo0Var.m159223e(txl0VarM169622G.f176568a);
        mo0Var.m159222d(txl0VarM169622G.f176568a, cardOperation2, f13, f12, f5, f6, true);
        nh4 nh4Var = new nh4(txl0VarM169622G.f176578k, txl0VarM169622G);
        nh4Var.f141914h = cardOperation2;
        nh4Var.f141908b = CardAnimType.ANIM_OUT;
        nh4Var.m163026a(txl0VarM169622G.f176578k);
        nh4Var.m163027b(VirtualState.RENDING);
        CardOperation cardOperation3 = CardOperation.SWIPE_LEFT;
        if (cardOperation2 == cardOperation3 || cardOperation2 == CardOperation.SWIPE_RIGHT) {
            float f14 = mo0Var.f137755c;
            float f15 = mo0Var.f137756d;
            nh4Var.f141910d = vo0.f184959f + ((long) (((Math.sqrt((f14 - f15) * (f14 - f15)) * 1000.0d) / ((double) f10)) / ((double) vo0.f184971r)));
            nh4Var.m163041p(this.f149594d.mo164118c(1.0f));
            m169664p0(f, f2, f3, f4, f13, f12, cardOperation2 == cardOperation3 ? BLiveGiftBubblePopupTitlePosition.left : "right", nh4Var.f141910d);
        } else {
            long j = vo0.f184961h;
            nh4Var.f141910d = j;
            m169664p0(f, f2, f3, f4, f13, f12, "up", j);
        }
        nh4Var.f141911e = -1;
        nh4Var.f141912f = mo0Var;
        this.f149594d.mo164121f(nh4Var);
        this.f149599i.m202049d(nh4Var);
    }

    /* JADX INFO: renamed from: S */
    public final void m169631S(float f, float f2, float f3, float f4, float f5, float f6) {
        if (Math.abs(f3 - f) <= m169669t() && (f4 - f2 <= mo118222u() || !this.f149592b.mo39799v(true) || mo118221W())) {
            m169658m0("快速返回");
            m169640c(f, f2, f3, f4, f5, f6);
            return;
        }
        if ((f - f3) * f5 < 0.0f) {
            m169643d0(f, f2, f3, f4, f5, f6);
            return;
        }
        m169658m0("快速滑动: " + f5 + " , " + f6 + Constants.SEPARATOR_COMMA + (Math.abs(f5) * mo118220F()));
        m169630R(f, f2, f3, f4, f5, f6);
    }

    /* JADX INFO: renamed from: T */
    public final void m169632T(float f, float f2, float f3, float f4, float f5, float f6) {
        CardOperation cardOperation;
        float f7 = -(f2 - f4);
        float f8 = f - f3;
        if (f7 <= Math.abs(f8) * mo118219E() || !this.f149592b.mo39799v(false) || Math.abs(f8) >= m169621C()) {
            int i = (f8 > 0.0f ? 1 : (f8 == 0.0f ? 0 : -1));
            CardOperation cardOperation2 = CardOperation.SWIPE_RIGHT;
        } else {
            CardOperation cardOperation3 = CardOperation.SWIPE_RIGHT;
        }
        if (Math.abs(f3 - f) / mo118219E() > f7 || !this.f149592b.f24066b || mo118221W()) {
            cardOperation = f8 > 0.0f ? CardOperation.SWIPE_RIGHT : CardOperation.SWIPE_LEFT;
        } else {
            cardOperation = CardOperation.SWIPE_UP;
        }
        CardOperation cardOperation4 = cardOperation;
        float f9 = vo0.f184971r;
        float f10 = f5 / f9;
        float f11 = f6 / f9;
        float fMax = Math.max(Math.abs(f10), Math.abs(f11));
        float f12 = vo0.f184977x;
        if (fMax > f12) {
            float f13 = fMax / f12;
            f10 /= f13;
            f11 /= f13;
        }
        float f14 = f11;
        float f15 = f10;
        txl0 txl0VarM169622G = m169622G();
        txl0VarM169622G.f176577j = VirtualState.PRE_OUT;
        mo0 mo0Var = new mo0();
        mo0Var.m159223e(txl0VarM169622G.f176568a);
        mo0Var.m159221c(txl0VarM169622G.f176568a, cardOperation4, f15, f14, f5, f6);
        nh4 nh4Var = new nh4(txl0VarM169622G.f176578k, txl0VarM169622G);
        nh4Var.f141914h = cardOperation4;
        nh4Var.f141908b = CardAnimType.ANIM_OUT;
        nh4Var.m163026a(txl0VarM169622G.f176578k);
        nh4Var.m163027b(VirtualState.RENDING);
        CardOperation cardOperation5 = CardOperation.SWIPE_LEFT;
        if (cardOperation4 == cardOperation5 || cardOperation4 == CardOperation.SWIPE_RIGHT) {
            float f16 = mo0Var.f137755c;
            float f17 = mo0Var.f137756d;
            nh4Var.f141910d = vo0.f184959f + ((long) (((Math.sqrt((f16 - f17) * (f16 - f17)) * 1000.0d) / ((double) f12)) / ((double) vo0.f184971r)));
            nh4Var.m163041p(this.f149594d.mo164120e(1.0f));
            m169664p0(f, f2, f3, f4, f15, f14, cardOperation4 == cardOperation5 ? BLiveGiftBubblePopupTitlePosition.left : "right", nh4Var.f141910d);
        } else {
            long j = vo0.f184961h;
            nh4Var.f141910d = j;
            m169664p0(f, f2, f3, f4, f15, f14, "up", j);
        }
        nh4Var.f141911e = -1;
        nh4Var.f141912f = mo0Var;
        this.f149594d.mo164121f(nh4Var);
        this.f149599i.m202049d(nh4Var);
    }

    /* JADX INFO: renamed from: U */
    public final void m169633U(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        pn4 pn4Var = this.f149607q;
        if (pn4Var != null) {
            CardProgressAction cardProgressAction = CardProgressAction.SWIPE_DONE;
            pn4Var.mo37368d0(0.0f, 0.0f, 0.0f, cardProgressAction);
            this.f149607q.mo39824v0(0.0f, 0.0f, cardProgressAction);
        }
        if (Math.abs(f5) > vo0.f184946D || Math.abs(f6) > vo0.f184946D) {
            m169631S(f, f2, f3, f4, f5, f6);
            return;
        }
        float f7 = f3 - f;
        float f8 = f2 - f4;
        float f9 = -f8;
        if (Math.abs(f7) / mo118219E() > f9 || !(z = this.f149592b.f24066b)) {
            if (Math.abs(f7) > m169621C()) {
                m169658m0("慢慢滑动1：" + (f - f3) + Constants.SEPARATOR_COMMA + f8);
                m169632T(f, f2, f3, f4, f5, f6);
                return;
            }
            m169658m0("慢慢返回1: " + (f - f3) + Constants.SEPARATOR_COMMA + f8);
            m169640c(f, f2, f3, f4, f5, f6);
            return;
        }
        if (z) {
            if (f9 <= mo118218D() || mo118221W()) {
                m169658m0("慢慢返回2: " + (f - f3) + Constants.SEPARATOR_COMMA + f8);
                m169640c(f, f2, f3, f4, f5, f6);
                return;
            }
            m169658m0("慢慢滑动2: " + (f - f3) + Constants.SEPARATOR_COMMA + f8);
            m169632T(f, f2, f3, f4, f5, f6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0034 A[RETURN] */
    /* JADX INFO: renamed from: V */
    public boolean m169634V() {
        if (this.f149599i.m202052g() || this.f149599i.m202051f()) {
            return false;
        }
        for (txl0 txl0Var : this.f149591a) {
            if (!txl0Var.m193513f()) {
                if (txl0Var != null) {
                    return txl0Var.m193509b();
                }
                return false;
            }
        }
        txl0Var = null;
        if (txl0Var != null) {
            return txl0Var.m193509b();
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    public boolean mo118221W() {
        return false;
    }

    /* JADX INFO: renamed from: X */
    public void m169635X(String str) {
        tu2.m192703a(BifrostLayout.f24062c, str);
    }

    /* JADX INFO: renamed from: Y */
    public void m169636Y(String str) {
        if (BifrostLayout.f24063d) {
            if (this.f149591a.size() > 0) {
                for (int i = 0; i < this.f149591a.size(); i++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    sb.append(":");
                    this.f149591a.get(i).m193511d();
                }
            }
            String str2 = BifrostLayout.f24062c;
        }
    }

    /* JADX INFO: renamed from: Z */
    public boolean m169637Z(ViewGroup viewGroup, MotionEvent motionEvent) {
        KeyEvent.Callback callback;
        txl0 txl0VarM169622G = m169622G();
        if (txl0VarM169622G != null && (callback = txl0VarM169622G.f176568a) != null && (callback instanceof qn4)) {
        }
        this.f149596f.m195496f(viewGroup, motionEvent);
        return false;
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m169638a0(ViewGroup viewGroup, MotionEvent motionEvent) {
        this.f149599i.m202047b();
        return this.f149596f.mo146591g(viewGroup, motionEvent);
    }

    /* JADX INFO: renamed from: b0 */
    public void m169639b0(boolean z, int i, int i2, int i3, int i4) {
        this.f149593c.m177173j(z, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public final void m169640c(float f, float f2, float f3, float f4, float f5, float f6) {
        txl0 txl0VarM169622G = m169622G();
        nh4 nh4Var = new nh4(txl0VarM169622G.f176578k, txl0VarM169622G);
        nh4Var.f141908b = CardAnimType.ANIM_BACK;
        nh4Var.f141910d = (vo0.f184964k * 3) / 2;
        nh4Var.f141911e = 0;
        nh4Var.m163041p(new OvershootInterpolator());
        nh4Var.m163027b(VirtualState.RENDING);
        mo0 mo0Var = new mo0();
        mo0Var.m159223e(txl0VarM169622G.f176568a);
        mo0Var.m159220b();
        nh4Var.m163039n(mo0Var);
        String str = BifrostLayout.f24062c;
        m169664p0(f, f2, f3, f4, f5, f6, "back", nh4Var.f141910d);
        this.f149599i.m202049d(nh4Var);
    }

    /* JADX INFO: renamed from: c0 */
    public void m169641c0(int i, int i2) {
        this.f149593c.m177174k(i, i2);
        this.f149597g.m172567d(i, i2);
    }

    /* JADX INFO: renamed from: d */
    public void m169642d() {
        int iMin = Math.min(m169619A().mo98958m(), m169663p().mo105831f());
        if (iMin > 0) {
            nx2 nx2VarM169663p = m169663p();
            ArrayList arrayList = new ArrayList();
            LayoutInflater layoutInflaterM171370a = p9r.m171370a(m169667r());
            for (int i = 0; i < iMin; i++) {
                txl0 txl0Var = new txl0();
                txl0Var.f176572e = i;
                txl0Var.f176577j = VirtualState.INIT;
                txl0Var.m193510c(nx2VarM169663p.mo105834i(i), nx2VarM169663p.mo105832g(i));
                int iMo105833h = nx2VarM169663p.mo105833h(i);
                txl0Var.f176571d = iMo105833h;
                View viewMo105830e = nx2VarM169663p.mo105830e(iMo105833h, m169667r(), layoutInflaterM171370a);
                txl0Var.f176568a = viewMo105830e;
                nx2VarM169663p.mo105829d(viewMo105830e, i);
                arrayList.add(txl0Var);
            }
            this.f149591a.addAll(arrayList);
            Iterator<txl0> it = this.f149591a.iterator();
            while (it.hasNext()) {
                m169620B().addView(it.next().f176568a);
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m169643d0(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f5 / 100.0f;
        if (Math.abs(f7) < qa00.m175859d(5.0f)) {
            m169658m0("反向慢慢滑动:" + (f - f3) + Constants.SEPARATOR_COMMA + (f2 - f4));
            m169632T(f, f2, f3, f4, f5, f6);
            return;
        }
        if (Math.abs(f7) < qa00.m175859d(12.0f) && Math.abs(f7) >= qa00.m175859d(5.0f)) {
            m169658m0("反向慢慢返回");
            m169640c(f, f2, f3, f4, f5, f6);
            return;
        }
        m169658m0("反向快速滑动:" + f5 + " , " + f6 + " | " + (f - f3) + " | " + (f2 - f4));
        m169630R(f, f2, f3, f4, f5, f6);
    }

    /* JADX INFO: renamed from: e */
    public kj2 mo155050e() {
        return new znd();
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m169644e0(MotionEvent motionEvent) {
        return this.f149596f.mo146592h(motionEvent);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public abstract qn2 mo111754f();

    /* JADX INFO: renamed from: f0 */
    public final void m169645f0(nh4 nh4Var) {
        List<Integer> list = nh4Var.f141919m;
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<txl0> it = this.f149591a.iterator();
        while (it.hasNext()) {
            txl0 next = it.next();
            if (list.contains(Integer.valueOf(next.f176578k)) || next.f176578k == nh4Var.f141921o) {
                StringBuilder sb = new StringBuilder("realRemoveCard: ");
                sb.append(nh4Var.f141921o);
                sb.append(" , d: ");
                txl0 txl0Var = nh4Var.f141922p;
                sb.append(txl0Var == null ? "" : txl0Var.m193511d());
                m169635X(sb.toString());
                it.remove();
                m169620B().removeView(next.f176568a);
                this.f149601k.m211130b(next);
                this.f149595e.mo105835l(next.f176568a, false);
                String str = BifrostLayout.f24062c;
            }
        }
        if (BifrostLayout.f24063d) {
            m169636Y("anim out finish");
        }
    }

    /* JADX INFO: renamed from: g */
    public vr2 mo155051g() {
        return new vr2();
    }

    /* JADX INFO: renamed from: g0 */
    public void m169646g0(txl0 txl0Var) {
        this.f149595e.mo105836m(txl0Var);
        this.f149598h.mo136416a(this.f149595e.mo105831f());
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public udj0 mo169647h() {
        return new udj0(this);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m169648h0(View view, float f, float f2, float f3, float f4) {
        float width = view.getWidth() / 1.5f;
        view.setRotation((width != 0.0f ? Math.max(-1.0f, Math.min((f - f3) / width, 1.0f)) : 0.0f) * ((f2 > ((float) ((view.getHeight() / 3) * 2)) ? ((view.getHeight() / 3) * 2) - f2 : Math.min(((view.getHeight() / 3) * 2) - f2, view.getHeight() / 3)) / view.getHeight()) * 30.0f * 1.4f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final void m169649i(View view, float f, float f2, float f3, CardProgressAction cardProgressAction) {
        float f4 = f != 0.0f ? -f : f2;
        if ((f4 != -1.0f || f4 == this.f149609s) && ((f4 != 1.0f || f4 == this.f149609s) && ((f4 != 0.0f || f4 == this.f149609s) && Math.abs(f4 - this.f149609s) <= 0.01f && ((f3 != -1.0f || f3 == this.f149610t) && ((f3 != 1.0f || f3 == this.f149610t) && ((f3 != 0.0f || f3 == this.f149610t) && Math.abs(f3 - this.f149610t) <= 0.01f && !this.f149611u)))))) {
            return;
        }
        this.f149609s = f4;
        this.f149610t = f3;
        this.f149611u = cardProgressAction == CardProgressAction.SWIPE_DONE || cardProgressAction == CardProgressAction.ANIM_DONE || cardProgressAction == CardProgressAction.UNKNOWN;
        if (view instanceof pn4) {
            ((pn4) view).mo37368d0(f, f2, f3, cardProgressAction);
        }
        pn4 pn4Var = this.f149607q;
        if (pn4Var != null) {
            pn4Var.mo37368d0(f, f2, f3, cardProgressAction);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m169650i0(nx2 nx2Var) {
        this.f149595e = nx2Var;
        nx2Var.m165054c(this);
    }

    /* JADX INFO: renamed from: j */
    public void m169651j(float f, float f2, float f3, float f4, CardProgressAction cardProgressAction, boolean z, String str) {
        float f5;
        CardProgressAction cardProgressAction2;
        float f6;
        boolean z2;
        float f7 = f - f3;
        float f8 = f2 - f4;
        float fSqrt = (float) Math.sqrt((f7 * f7) + (f8 * f8));
        float fMin = Math.min(1.0f, fSqrt / this.f149604n);
        if ((fMin == 0.0f && this.f149612v != 0.0f) || ((fMin == 1.0f && this.f149612v != 1.0f) || Math.abs(fMin - this.f149612v) >= 0.01f)) {
            this.f149612v = fMin;
            if (!jyb.m147479J(m169665q())) {
                for (txl0 txl0Var : m169665q()) {
                    KeyEvent.Callback callback = txl0Var.f176568a;
                    if (callback instanceof pn4) {
                        ((pn4) callback).mo38966f0(txl0Var.f176572e, this.f149612v, fSqrt, this.f149594d.mo164123h(), cardProgressAction.toString() + " reason: " + str);
                    }
                }
            }
        }
        if (jyb.m147479J(m169665q())) {
            return;
        }
        for (txl0 txl0Var2 : m169665q()) {
            KeyEvent.Callback callback2 = txl0Var2.f176568a;
            if (callback2 instanceof pn4) {
                CardProgressAction cardProgressAction3 = cardProgressAction;
                f5 = f8;
                cardProgressAction2 = cardProgressAction3;
                f6 = f7;
                z2 = z;
                ((pn4) callback2).mo38972l0(txl0Var2.f176572e, cardProgressAction2, z2, f6, f5);
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
    public void m169652j0(BifrostLayout bifrostLayout) {
        this.f149592b = bifrostLayout;
    }

    /* JADX INFO: renamed from: k */
    public void m169653k(float f, float f2, float f3, float f4, CardProgressAction cardProgressAction, boolean z, int i, String str) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fSqrt = (float) Math.sqrt((f5 * f5) + (f6 * f6));
        float fMin = Math.min(1.0f, fSqrt / this.f149604n);
        if ((fMin != 0.0f || this.f149613w == 0.0f) && ((fMin != 1.0f || this.f149613w == 1.0f) && Math.abs(fMin - this.f149613w) < 0.01f)) {
            return;
        }
        float f7 = this.f149613w;
        this.f149613w = fMin;
        if (jyb.m147479J(m169665q())) {
            return;
        }
        for (txl0 txl0Var : m169665q()) {
            KeyEvent.Callback callback = txl0Var.f176568a;
            if (callback instanceof pn4) {
                ((pn4) callback).mo38966f0(txl0Var.f176572e - i, this.f149613w, fSqrt, this.f149594d.mo164123h(), "after anim done reason: " + str + " detail: " + f7 + ", " + fMin);
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m169654k0(dn4 dn4Var) {
        this.f149602l = dn4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public void m169655l(View view, float f, float f2, float f3, float f4, CardProgressAction cardProgressAction, boolean z) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        if (view instanceof pn4) {
            ((pn4) view).mo38972l0(0, cardProgressAction, z, f5, f6);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m169656l0(pn4 pn4Var) {
        this.f149607q = pn4Var;
    }

    /* JADX INFO: renamed from: m */
    public final DisplayMetrics m169657m() {
        return m169667r().getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: n */
    public int m169659n(float f) {
        return (int) (m169657m().density * f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    public void m169660n0(View view, SwipeState swipeState, boolean z) {
        if (view instanceof pn4) {
            ((pn4) view).mo38964D0(view, swipeState, z);
        }
        pn4 pn4Var = this.f149607q;
        if (pn4Var != null) {
            pn4Var.mo38964D0(view, swipeState, z);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m169662o0(SwipeState swipeState, boolean z) {
        View view;
        for (txl0 txl0Var : this.f149591a) {
            if (txl0Var.f176572e == 0) {
                view = txl0Var.f176568a;
                m169660n0(view, swipeState, z);
            }
        }
        view = null;
        m169660n0(view, swipeState, z);
    }

    /* JADX INFO: renamed from: p */
    public nx2 m169663p() {
        return this.f149595e;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m169664p0(float f, float f2, float f3, float f4, float f5, float f6, String str, long j) {
        long jM174454o = this.f149608r > 0 ? pzi0.m174454o() - this.f149608r : -1L;
        this.f149608r = pzi0.m174454o();
        sfj0.m185600g("e_swipe_touch_info", "p_suggest_users_home_view", sfj0.C20032a.m185613f("touch_down_x", (int) f3), sfj0.C20032a.m185613f("touch_down_y", (int) f4), sfj0.C20032a.m185613f("touch_up_x", (int) f), sfj0.C20032a.m185613f("touch_up_y", (int) f2), sfj0.C20032a.m185613f("scope_x", this.f149592b.getWidth()), sfj0.C20032a.m185613f("scope_y", this.f149592b.getHeight()), sfj0.C20032a.m185613f("touch_speed_x", Math.abs((int) f5)), sfj0.C20032a.m185613f("touch_speed_y", Math.abs((int) f6)), sfj0.C20032a.m185615h("current_operation", str), sfj0.C20032a.m185614g("operation_interval", jM174454o), sfj0.C20032a.m185614g("swipe_action_during", j));
    }

    /* JADX INFO: renamed from: q */
    public List<txl0> m169665q() {
        return this.f149591a;
    }

    /* JADX INFO: renamed from: q0 */
    public void m169666q0(float f) {
        List<txl0> list = this.f149591a;
        if (list == null || list.isEmpty() || f < 0.0f || Float.isNaN(f) || Float.isInfinite(f)) {
            return;
        }
        int iMo98955d = m169619A().mo98955d();
        float fMo98956e = m169619A().mo98956e();
        boolean zMo98957i = m169619A().mo98957i();
        for (txl0 txl0Var : this.f149591a) {
            int i = txl0Var.f176572e;
            if (i != 0 && i >= 0) {
                float fMin = Math.min(1.0f, f / this.f149603m);
                float fMin2 = Math.min(i - fMin, 2.0f);
                float f2 = 1.0f - (fMin2 * fMo98956e);
                float f3 = f2 * f2 * f2;
                if (Float.isNaN(f3)) {
                    return;
                }
                if (this.f149594d.mo164123h() && this.f149594d.mo164116a() < 1.0f) {
                    if (i == 1) {
                        txl0Var.f176568a.setAlpha(Math.min(1.0f, Math.max(0.0f, (fMin * this.f149594d.mo164117b()) + this.f149594d.mo164116a())));
                    } else if (i == 2) {
                        txl0Var.f176568a.setAlpha(Math.min(1.0f, Math.max(0.0f, fMin * this.f149594d.mo164116a())));
                    } else {
                        txl0Var.f176568a.setAlpha(0.0f);
                    }
                }
                float fSqrt = (float) Math.sqrt(Math.sqrt(fMin2));
                float fSqrt2 = (((float) (((double) (fSqrt * fSqrt * fSqrt)) * Math.sqrt(fSqrt))) * iMo98955d) + (zMo98957i ? (txl0Var.f176568a.getHeight() * (1.0f - f3)) / 2.0f : 0.0f);
                txl0Var.f176568a.setScaleY(f3);
                txl0Var.f176568a.setScaleX(f3);
                txl0Var.f176568a.setRotation(0.0f);
                txl0Var.f176568a.setTranslationY((m169619A().mo141296q() ? -1.0f : 1.0f) * fSqrt2);
                txl0Var.f176568a.setTranslationX(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public Context m169667r() {
        return this.f149600j;
    }

    /* JADX INFO: renamed from: s */
    public kj2 m169668s() {
        return this.f149598h;
    }

    /* JADX INFO: renamed from: t */
    public final float m169669t() {
        return this.f149606p;
    }

    /* JADX INFO: renamed from: u */
    public float mo118222u() {
        return qa00.m175859d(63.0f);
    }

    /* JADX INFO: renamed from: v */
    public float mo118223v() {
        return 0.0f;
    }

    /* JADX INFO: renamed from: w */
    public txl0 m169670w() {
        int i = 0;
        for (txl0 txl0Var : this.f149591a) {
            if (txl0Var.m193509b()) {
                if (i >= 1) {
                    return txl0Var;
                }
                i++;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public xi80 m169671x() {
        return this.f149601k;
    }

    /* JADX INFO: renamed from: y */
    public final float m169672y() {
        return mo118222u() / 1.5f;
    }

    /* JADX INFO: renamed from: z */
    public String m169673z(String str) {
        StringBuilder sb = new StringBuilder("from: ");
        sb.append(str);
        sb.append("=> 渲染详情:");
        List<txl0> list = this.f149591a;
        if (list != null && list.size() > 0) {
            for (int i = 0; i < this.f149591a.size(); i++) {
                sb.append(i + ":");
                sb.append(this.f149591a.get(i).m193511d());
                sb.append(" | ");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m169658m0(String str) {
    }

    /* JADX INFO: renamed from: o */
    public void m169661o(Canvas canvas) {
    }
}
