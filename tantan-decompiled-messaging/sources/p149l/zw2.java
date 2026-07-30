package p149l;

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
import com.p046p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p046p1.mobile.putong.core.newui.home.opt.CardAnimType;
import com.p046p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p046p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p046p1.mobile.putong.core.newui.home.opt.SwipeState;
import com.p046p1.mobile.putong.core.newui.home.opt.VirtualState;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class zw2 implements jl4 {

    /* JADX INFO: renamed from: b */
    public BifrostLayout f205091b;

    /* JADX INFO: renamed from: d */
    public fr2 f205093d;

    /* JADX INFO: renamed from: e */
    public yw2 f205094e;

    /* JADX INFO: renamed from: g */
    public qj4 f205096g;

    /* JADX INFO: renamed from: i */
    public zo0 f205098i;

    /* JADX INFO: renamed from: j */
    public Context f205099j;

    /* JADX INFO: renamed from: k */
    public ra80 f205100k;

    /* JADX INFO: renamed from: l */
    public em4 f205101l;

    /* JADX INFO: renamed from: m */
    public float f205102m;

    /* JADX INFO: renamed from: n */
    public float f205103n;

    /* JADX INFO: renamed from: o */
    public float f205104o;

    /* JADX INFO: renamed from: p */
    public float f205105p;

    /* JADX INFO: renamed from: q */
    public qm4 f205106q;

    /* JADX INFO: renamed from: r */
    public long f205107r = -1;

    /* JADX INFO: renamed from: s */
    public float f205108s = 0.0f;

    /* JADX INFO: renamed from: t */
    public float f205109t = 0.0f;

    /* JADX INFO: renamed from: u */
    public boolean f205110u = true;

    /* JADX INFO: renamed from: v */
    public float f205111v = 0.0f;

    /* JADX INFO: renamed from: w */
    public float f205112w = 0.0f;

    /* JADX INFO: renamed from: a */
    public List<pol0> f205090a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public jn2 f205092c = mo99353f();

    /* JADX INFO: renamed from: f */
    public q4j0 f205095f = mo99354h();

    /* JADX INFO: renamed from: h */
    public cj2 f205097h = mo122295e();

    /* JADX INFO: renamed from: l.zw2$a */
    public static /* synthetic */ class C21790a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f205113a;

        static {
            int[] iArr = new int[CardAnimType.values().length];
            f205113a = iArr;
            try {
                iArr[CardAnimType.ANIM_OUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f205113a[CardAnimType.ANIM_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f205113a[CardAnimType.ANIM_INSERT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public zw2(Context context) {
        this.f205102m = 100.0f;
        this.f205103n = 100.0f;
        this.f205104o = 100.0f;
        this.f205105p = 30.0f;
        this.f205099j = context;
        this.f205092c.m142271p(this);
        this.f205098i = new zo0(this, context);
        this.f205100k = new ra80();
        this.f205096g = new qj4(this);
        this.f205093d = mo122296g();
        this.f205102m = zo0.f204067t;
        this.f205104o = zo0.f204068u;
        this.f205105p = zo0.f204069v;
        this.f205103n = zo0.f204045I;
    }

    /* JADX INFO: renamed from: A */
    public jn2 m220506A() {
        return this.f205092c;
    }

    /* JADX INFO: renamed from: B */
    public BifrostLayout m220507B() {
        return this.f205091b;
    }

    /* JADX INFO: renamed from: C */
    public final float m220508C() {
        return this.f205105p;
    }

    /* JADX INFO: renamed from: D */
    public float mo117876D() {
        return this.f205091b.getHeight() * 0.25f;
    }

    /* JADX INFO: renamed from: E */
    public float mo117877E() {
        return zo0.f204042F;
    }

    /* JADX INFO: renamed from: F */
    public float mo117878F() {
        return zo0.f204042F;
    }

    /* JADX INFO: renamed from: G */
    public pol0 m220509G() {
        for (pol0 pol0Var : this.f205090a) {
            if (pol0Var.m170601b()) {
                return pol0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: H */
    public q4j0 m220510H() {
        return this.f205095f;
    }

    /* JADX INFO: renamed from: I */
    public void m220511I(og4 og4Var, long j) {
        int i = C21790a.f205113a[og4Var.f143802b.ordinal()];
        if (i == 1) {
            m220546n0(og4Var.f143816p.f150530a, SwipeState.FINISH_OUT, og4Var.f143809i);
            m220532f0(og4Var);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            m220546n0(og4Var.f143816p.f150530a, SwipeState.FINISH_BACK, og4Var.f143809i);
            mo211312J(og4Var, og4Var.f143803c + og4Var.f143804d);
            return;
        }
        m220546n0(og4Var.f143816p.f150530a, SwipeState.FINISH_BACK, og4Var.f143809i);
        mo211313L(og4Var, og4Var.f143803c + og4Var.f143804d);
        for (pol0 pol0Var : this.f205090a) {
            if (og4Var.m164171l(pol0Var) && pol0Var.f150534e == 0) {
                KeyEvent.Callback callback = pol0Var.f150530a;
                if (!(callback instanceof qm4)) {
                    break;
                }
                ((qm4) callback).mo36365d0(0.0f, 0.0f, 0.0f, CardProgressAction.ANIM_DONE);
                break;
            }
        }
        qm4 qm4Var = this.f205106q;
        if (qm4Var != null) {
            CardProgressAction cardProgressAction = CardProgressAction.ANIM_DONE;
            qm4Var.mo36365d0(0.0f, 0.0f, 0.0f, cardProgressAction);
            this.f205106q.mo38821v0(0.0f, 0.0f, cardProgressAction);
        }
    }

    /* JADX INFO: renamed from: J */
    public abstract void mo211312J(og4 og4Var, long j);

    /* JADX INFO: renamed from: K */
    public void m220512K(og4 og4Var, long j) {
        int i = C21790a.f205113a[og4Var.f143802b.ordinal()];
        if (i == 1) {
            mo211314M(og4Var, j);
        } else if (i == 2) {
            mo211313L(og4Var, j);
        } else {
            if (i != 3) {
                return;
            }
            mo211312J(og4Var, j);
        }
    }

    /* JADX INFO: renamed from: L */
    public abstract void mo211313L(og4 og4Var, long j);

    /* JADX INFO: renamed from: M */
    public abstract void mo211314M(og4 og4Var, long j);

    /* JADX INFO: renamed from: N */
    public void m220513N(og4 og4Var) {
        int i = C21790a.f205113a[og4Var.f143802b.ordinal()];
        if (i == 1) {
            m220546n0(og4Var.f143816p.f150530a, SwipeState.START_OUT, og4Var.f143809i);
        } else if (i == 2 || i == 3) {
            m220546n0(og4Var.f143816p.f150530a, SwipeState.START_BACK, og4Var.f143809i);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m220514O(View view, float f, float f2, float f3, float f4, CardProgressAction cardProgressAction, boolean z, String str) {
        m220537j(f, f2, f3, f4, cardProgressAction, z, str);
        qm4 qm4Var = this.f205106q;
        if (qm4Var != null) {
            qm4Var.mo38821v0(f - f3, f2 - f4, cardProgressAction);
        }
        float f5 = f - f3;
        float f6 = f5 / this.f205102m;
        float f7 = f2 - f4;
        float fM220558y = Math.abs(f7) > m220558y() ? (m220558y() + f7) / this.f205102m : 0.0f;
        if (mo117879W()) {
            fM220558y = 0.0f;
        }
        if (Math.abs(f5) < mo117881v()) {
            f6 = 0.0f;
        }
        if (fM220558y <= 0.0f) {
            float f8 = -fM220558y;
            if (Math.abs(f6) <= f8 && this.f205091b.mo38796v(true)) {
                if (Math.abs(f6) >= Math.abs(fM220558y) || Math.abs(f7) <= m220558y()) {
                    m220535i(view, 0.0f, 0.0f, 0.0f, cardProgressAction);
                    return;
                } else {
                    m220535i(view, 0.0f, 0.0f, f6 > 0.0f ? f8 - f6 : f8 + f6, cardProgressAction);
                    return;
                }
            }
        }
        if (fM220558y < 0.0f) {
            f6 = f6 > 0.0f ? f6 + fM220558y : f6 - fM220558y;
        }
        float f9 = f6;
        if (f9 < 0.0f) {
            m220535i(view, -f9, 0.0f, 0.0f, cardProgressAction);
        } else if (f9 > 0.0f) {
            m220535i(view, 0.0f, f9, 0.0f, cardProgressAction);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m220515P(float f, float f2, float f3, float f4) {
        zw2 zw2Var = this;
        int iMo107794d = zw2Var.m220506A().mo107794d();
        float fMo107795e = zw2Var.m220506A().mo107795e();
        boolean zMo107796i = zw2Var.m220506A().mo107796i();
        for (pol0 pol0Var : zw2Var.f205090a) {
            if (pol0Var.f150534e == 0) {
                pol0Var.f150530a.hashCode();
                pol0Var.f150530a.setPivotX(f3);
                pol0Var.f150530a.setPivotY(f4);
                pol0Var.f150530a.setTranslationX(f - f3);
                pol0Var.f150530a.setTranslationY(f2 - f4);
                zw2Var.m220534h0(pol0Var.f150530a, f, f2, f3, f4);
                zw2Var = this;
                zw2Var.m220514O(pol0Var.f150530a, f, f2, f3, f4, CardProgressAction.SWIPE, false, "touch move");
            } else {
                float f5 = f - f3;
                float f6 = f2 - f4;
                float fSqrt = (float) Math.sqrt((f5 * f5) + (f6 * f6));
                int i = pol0Var.f150534e;
                if (i < 0) {
                    continue;
                } else {
                    float fMin = Math.min(1.0f, fSqrt / zw2Var.f205102m);
                    float fMin2 = Math.min(i - fMin, 2.0f);
                    float f7 = 1.0f - (fMin2 * fMo107795e);
                    float f8 = f7 * f7 * f7;
                    if (Float.isNaN(f8)) {
                        return;
                    }
                    if (zw2Var.f205093d.mo122788h() && zw2Var.f205093d.mo122781a() < 1.0f) {
                        if (i == 1) {
                            pol0Var.f150530a.setAlpha(Math.min(1.0f, Math.max(0.0f, (fMin * zw2Var.f205093d.mo122782b()) + zw2Var.f205093d.mo122781a())));
                        } else if (i == 2) {
                            pol0Var.f150530a.setAlpha(Math.min(1.0f, Math.max(0.0f, fMin * zw2Var.f205093d.mo122781a())));
                        } else {
                            pol0Var.f150530a.setAlpha(0.0f);
                        }
                    }
                    float fSqrt2 = (float) Math.sqrt(Math.sqrt(fMin2));
                    float fSqrt3 = (((float) (((double) (fSqrt2 * fSqrt2 * fSqrt2)) * Math.sqrt(fSqrt2))) * iMo107794d) + (zMo107796i ? (pol0Var.f150530a.getHeight() * (1.0f - f8)) / 2.0f : 0.0f);
                    if (BifrostLayout.f23321d) {
                        pol0Var.f150530a.hashCode();
                    }
                    pol0Var.f150530a.setScaleY(f8);
                    pol0Var.f150530a.setScaleX(f8);
                    pol0Var.f150530a.setRotation(0.0f);
                    pol0Var.f150530a.setTranslationY((zw2Var.m220506A().mo107798q() ? -1.0f : 1.0f) * fSqrt3);
                    pol0Var.f150530a.setTranslationX(0.0f);
                }
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m220516Q(float f, float f2, float f3, float f4, float f5, float f6) {
        m220520U(f, f2, f3, f4, f5, f6);
    }

    /* JADX INFO: renamed from: R */
    public final void m220517R(float f, float f2, float f3, float f4, float f5, float f6) {
        CardOperation cardOperation;
        if ((-f6) <= Math.abs(f5) * mo117878F() || !this.f205091b.mo38796v(true) || mo117879W()) {
            cardOperation = f5 > 0.0f ? CardOperation.SWIPE_RIGHT : CardOperation.SWIPE_LEFT;
        } else {
            cardOperation = CardOperation.SWIPE_UP;
        }
        CardOperation cardOperation2 = cardOperation;
        float f7 = zo0.f204065r;
        float f8 = f5 / f7;
        float f9 = f6 / f7;
        float fMax = Math.max(Math.abs(f8), Math.abs(f9));
        float f10 = zo0.f204071x;
        if (fMax > f10) {
            float f11 = fMax / f10;
            f8 /= f11;
            f9 /= f11;
        }
        float f12 = f9;
        float f13 = f8;
        pol0 pol0VarM220509G = m220509G();
        pol0VarM220509G.f150539j = VirtualState.PRE_OUT;
        qo0 qo0Var = new qo0();
        qo0Var.m175720e(pol0VarM220509G.f150530a);
        qo0Var.m175719d(pol0VarM220509G.f150530a, cardOperation2, f13, f12, f5, f6, true);
        og4 og4Var = new og4(pol0VarM220509G.f150540k, pol0VarM220509G);
        og4Var.f143808h = cardOperation2;
        og4Var.f143802b = CardAnimType.ANIM_OUT;
        og4Var.m164160a(pol0VarM220509G.f150540k);
        og4Var.m164161b(VirtualState.RENDING);
        CardOperation cardOperation3 = CardOperation.SWIPE_LEFT;
        if (cardOperation2 == cardOperation3 || cardOperation2 == CardOperation.SWIPE_RIGHT) {
            float f14 = qo0Var.f155520c;
            float f15 = qo0Var.f155521d;
            og4Var.f143804d = zo0.f204053f + ((long) (((Math.sqrt((f14 - f15) * (f14 - f15)) * 1000.0d) / ((double) f10)) / ((double) zo0.f204065r)));
            og4Var.m164175p(this.f205093d.mo122783c(1.0f));
            m220550p0(f, f2, f3, f4, f13, f12, cardOperation2 == cardOperation3 ? BLiveGiftBubblePopupTitlePosition.left : "right", og4Var.f143804d);
        } else {
            long j = zo0.f204055h;
            og4Var.f143804d = j;
            m220550p0(f, f2, f3, f4, f13, f12, "up", j);
        }
        og4Var.f143805e = -1;
        og4Var.f143806f = qo0Var;
        this.f205093d.mo122786f(og4Var);
        this.f205098i.m219538d(og4Var);
    }

    /* JADX INFO: renamed from: S */
    public final void m220518S(float f, float f2, float f3, float f4, float f5, float f6) {
        if (Math.abs(f3 - f) <= m220555t() && (f4 - f2 <= mo117880u() || !this.f205091b.mo38796v(true) || mo117879W())) {
            m220544m0("快速返回");
            m220527c(f, f2, f3, f4, f5, f6);
            return;
        }
        if ((f - f3) * f5 < 0.0f) {
            m220530d0(f, f2, f3, f4, f5, f6);
            return;
        }
        m220544m0("快速滑动: " + f5 + " , " + f6 + Constants.SEPARATOR_COMMA + (Math.abs(f5) * mo117878F()));
        m220517R(f, f2, f3, f4, f5, f6);
    }

    /* JADX INFO: renamed from: T */
    public final void m220519T(float f, float f2, float f3, float f4, float f5, float f6) {
        CardOperation cardOperation;
        float f7 = -(f2 - f4);
        float f8 = f - f3;
        if (f7 <= Math.abs(f8) * mo117877E() || !this.f205091b.mo38796v(false) || Math.abs(f8) >= m220508C()) {
            int i = (f8 > 0.0f ? 1 : (f8 == 0.0f ? 0 : -1));
            CardOperation cardOperation2 = CardOperation.SWIPE_RIGHT;
        } else {
            CardOperation cardOperation3 = CardOperation.SWIPE_RIGHT;
        }
        if (Math.abs(f3 - f) / mo117877E() > f7 || !this.f205091b.f23324b || mo117879W()) {
            cardOperation = f8 > 0.0f ? CardOperation.SWIPE_RIGHT : CardOperation.SWIPE_LEFT;
        } else {
            cardOperation = CardOperation.SWIPE_UP;
        }
        CardOperation cardOperation4 = cardOperation;
        float f9 = zo0.f204065r;
        float f10 = f5 / f9;
        float f11 = f6 / f9;
        float fMax = Math.max(Math.abs(f10), Math.abs(f11));
        float f12 = zo0.f204071x;
        if (fMax > f12) {
            float f13 = fMax / f12;
            f10 /= f13;
            f11 /= f13;
        }
        float f14 = f11;
        float f15 = f10;
        pol0 pol0VarM220509G = m220509G();
        pol0VarM220509G.f150539j = VirtualState.PRE_OUT;
        qo0 qo0Var = new qo0();
        qo0Var.m175720e(pol0VarM220509G.f150530a);
        qo0Var.m175718c(pol0VarM220509G.f150530a, cardOperation4, f15, f14, f5, f6);
        og4 og4Var = new og4(pol0VarM220509G.f150540k, pol0VarM220509G);
        og4Var.f143808h = cardOperation4;
        og4Var.f143802b = CardAnimType.ANIM_OUT;
        og4Var.m164160a(pol0VarM220509G.f150540k);
        og4Var.m164161b(VirtualState.RENDING);
        CardOperation cardOperation5 = CardOperation.SWIPE_LEFT;
        if (cardOperation4 == cardOperation5 || cardOperation4 == CardOperation.SWIPE_RIGHT) {
            float f16 = qo0Var.f155520c;
            float f17 = qo0Var.f155521d;
            og4Var.f143804d = zo0.f204053f + ((long) (((Math.sqrt((f16 - f17) * (f16 - f17)) * 1000.0d) / ((double) f12)) / ((double) zo0.f204065r)));
            og4Var.m164175p(this.f205093d.mo122785e(1.0f));
            m220550p0(f, f2, f3, f4, f15, f14, cardOperation4 == cardOperation5 ? BLiveGiftBubblePopupTitlePosition.left : "right", og4Var.f143804d);
        } else {
            long j = zo0.f204055h;
            og4Var.f143804d = j;
            m220550p0(f, f2, f3, f4, f15, f14, "up", j);
        }
        og4Var.f143805e = -1;
        og4Var.f143806f = qo0Var;
        this.f205093d.mo122786f(og4Var);
        this.f205098i.m219538d(og4Var);
    }

    /* JADX INFO: renamed from: U */
    public final void m220520U(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        qm4 qm4Var = this.f205106q;
        if (qm4Var != null) {
            CardProgressAction cardProgressAction = CardProgressAction.SWIPE_DONE;
            qm4Var.mo36365d0(0.0f, 0.0f, 0.0f, cardProgressAction);
            this.f205106q.mo38821v0(0.0f, 0.0f, cardProgressAction);
        }
        if (Math.abs(f5) > zo0.f204040D || Math.abs(f6) > zo0.f204040D) {
            m220518S(f, f2, f3, f4, f5, f6);
            return;
        }
        float f7 = f3 - f;
        float f8 = f2 - f4;
        float f9 = -f8;
        if (Math.abs(f7) / mo117877E() > f9 || !(z = this.f205091b.f23324b)) {
            if (Math.abs(f7) > m220508C()) {
                m220544m0("慢慢滑动1：" + (f - f3) + Constants.SEPARATOR_COMMA + f8);
                m220519T(f, f2, f3, f4, f5, f6);
                return;
            }
            m220544m0("慢慢返回1: " + (f - f3) + Constants.SEPARATOR_COMMA + f8);
            m220527c(f, f2, f3, f4, f5, f6);
            return;
        }
        if (z) {
            if (f9 <= mo117876D() || mo117879W()) {
                m220544m0("慢慢返回2: " + (f - f3) + Constants.SEPARATOR_COMMA + f8);
                m220527c(f, f2, f3, f4, f5, f6);
                return;
            }
            m220544m0("慢慢滑动2: " + (f - f3) + Constants.SEPARATOR_COMMA + f8);
            m220519T(f, f2, f3, f4, f5, f6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0034 A[RETURN] */
    /* JADX INFO: renamed from: V */
    public boolean m220521V() {
        if (this.f205098i.m219541g() || this.f205098i.m219540f()) {
            return false;
        }
        for (pol0 pol0Var : this.f205090a) {
            if (!pol0Var.m170605f()) {
                if (pol0Var != null) {
                    return pol0Var.m170601b();
                }
                return false;
            }
        }
        pol0Var = null;
        if (pol0Var != null) {
            return pol0Var.m170601b();
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    public boolean mo117879W() {
        return false;
    }

    /* JADX INFO: renamed from: X */
    public void m220522X(String str) {
        du2.m113670a(BifrostLayout.f23320c, str);
    }

    /* JADX INFO: renamed from: Y */
    public void m220523Y(String str) {
        if (BifrostLayout.f23321d) {
            if (this.f205090a.size() > 0) {
                for (int i = 0; i < this.f205090a.size(); i++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    sb.append(":");
                    this.f205090a.get(i).m170603d();
                }
            }
            String str2 = BifrostLayout.f23320c;
        }
    }

    /* JADX INFO: renamed from: Z */
    public boolean m220524Z(ViewGroup viewGroup, MotionEvent motionEvent) {
        KeyEvent.Callback callback;
        pol0 pol0VarM220509G = m220509G();
        if (pol0VarM220509G != null && (callback = pol0VarM220509G.f150530a) != null && (callback instanceof rm4)) {
        }
        this.f205095f.m172941f(viewGroup, motionEvent);
        return false;
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m220525a0(ViewGroup viewGroup, MotionEvent motionEvent) {
        this.f205098i.m219536b();
        return this.f205095f.mo126184g(viewGroup, motionEvent);
    }

    /* JADX INFO: renamed from: b0 */
    public void m220526b0(boolean z, int i, int i2, int i3, int i4) {
        this.f205092c.m142267j(z, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public final void m220527c(float f, float f2, float f3, float f4, float f5, float f6) {
        pol0 pol0VarM220509G = m220509G();
        og4 og4Var = new og4(pol0VarM220509G.f150540k, pol0VarM220509G);
        og4Var.f143802b = CardAnimType.ANIM_BACK;
        og4Var.f143804d = (zo0.f204058k * 3) / 2;
        og4Var.f143805e = 0;
        og4Var.m164175p(new OvershootInterpolator());
        og4Var.m164161b(VirtualState.RENDING);
        qo0 qo0Var = new qo0();
        qo0Var.m175720e(pol0VarM220509G.f150530a);
        qo0Var.m175717b();
        og4Var.m164173n(qo0Var);
        String str = BifrostLayout.f23320c;
        m220550p0(f, f2, f3, f4, f5, f6, "back", og4Var.f143804d);
        this.f205098i.m219538d(og4Var);
    }

    /* JADX INFO: renamed from: c0 */
    public void m220528c0(int i, int i2) {
        this.f205092c.m142268k(i, i2);
        this.f205096g.m174971d(i, i2);
    }

    /* JADX INFO: renamed from: d */
    public void m220529d() {
        int iMin = Math.min(m220506A().mo107797m(), m220549p().mo100899f());
        if (iMin > 0) {
            yw2 yw2VarM220549p = m220549p();
            ArrayList arrayList = new ArrayList();
            LayoutInflater layoutInflaterM163037a = o7r.m163037a(m220553r());
            for (int i = 0; i < iMin; i++) {
                pol0 pol0Var = new pol0();
                pol0Var.f150534e = i;
                pol0Var.f150539j = VirtualState.INIT;
                pol0Var.m170602c(yw2VarM220549p.mo100902i(i), yw2VarM220549p.mo100900g(i));
                int iMo100901h = yw2VarM220549p.mo100901h(i);
                pol0Var.f150533d = iMo100901h;
                View viewMo100898e = yw2VarM220549p.mo100898e(iMo100901h, m220553r(), layoutInflaterM163037a);
                pol0Var.f150530a = viewMo100898e;
                yw2VarM220549p.mo100897d(viewMo100898e, i);
                arrayList.add(pol0Var);
            }
            this.f205090a.addAll(arrayList);
            Iterator<pol0> it = this.f205090a.iterator();
            while (it.hasNext()) {
                m220507B().addView(it.next().f150530a);
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m220530d0(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f5 / 100.0f;
        if (Math.abs(f7) < t100.m186890d(5.0f)) {
            m220544m0("反向慢慢滑动:" + (f - f3) + Constants.SEPARATOR_COMMA + (f2 - f4));
            m220519T(f, f2, f3, f4, f5, f6);
            return;
        }
        if (Math.abs(f7) < t100.m186890d(12.0f) && Math.abs(f7) >= t100.m186890d(5.0f)) {
            m220544m0("反向慢慢返回");
            m220527c(f, f2, f3, f4, f5, f6);
            return;
        }
        m220544m0("反向快速滑动:" + f5 + " , " + f6 + " | " + (f - f3) + " | " + (f2 - f4));
        m220517R(f, f2, f3, f4, f5, f6);
    }

    /* JADX INFO: renamed from: e */
    public cj2 mo122295e() {
        return new umd();
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m220531e0(MotionEvent motionEvent) {
        return this.f205095f.mo126185h(motionEvent);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public abstract jn2 mo99353f();

    /* JADX INFO: renamed from: f0 */
    public final void m220532f0(og4 og4Var) {
        List<Integer> list = og4Var.f143813m;
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<pol0> it = this.f205090a.iterator();
        while (it.hasNext()) {
            pol0 next = it.next();
            if (list.contains(Integer.valueOf(next.f150540k)) || next.f150540k == og4Var.f143815o) {
                StringBuilder sb = new StringBuilder("realRemoveCard: ");
                sb.append(og4Var.f143815o);
                sb.append(" , d: ");
                pol0 pol0Var = og4Var.f143816p;
                sb.append(pol0Var == null ? "" : pol0Var.m170603d());
                m220522X(sb.toString());
                it.remove();
                m220507B().removeView(next.f150530a);
                this.f205100k.m178473b(next);
                this.f205094e.mo100903l(next.f150530a, false);
                String str = BifrostLayout.f23320c;
            }
        }
        if (BifrostLayout.f23321d) {
            m220523Y("anim out finish");
        }
    }

    /* JADX INFO: renamed from: g */
    public fr2 mo122296g() {
        return new fr2();
    }

    /* JADX INFO: renamed from: g0 */
    public void m220533g0(pol0 pol0Var) {
        this.f205094e.mo100904m(pol0Var);
        this.f205097h.mo102794a(this.f205094e.mo100899f());
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public q4j0 mo99354h() {
        return new q4j0(this);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m220534h0(View view, float f, float f2, float f3, float f4) {
        float width = view.getWidth() / 1.5f;
        view.setRotation((width != 0.0f ? Math.max(-1.0f, Math.min((f - f3) / width, 1.0f)) : 0.0f) * ((f2 > ((float) ((view.getHeight() / 3) * 2)) ? ((view.getHeight() / 3) * 2) - f2 : Math.min(((view.getHeight() / 3) * 2) - f2, view.getHeight() / 3)) / view.getHeight()) * 30.0f * 1.4f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final void m220535i(View view, float f, float f2, float f3, CardProgressAction cardProgressAction) {
        float f4 = f != 0.0f ? -f : f2;
        if ((f4 != -1.0f || f4 == this.f205108s) && ((f4 != 1.0f || f4 == this.f205108s) && ((f4 != 0.0f || f4 == this.f205108s) && Math.abs(f4 - this.f205108s) <= 0.01f && ((f3 != -1.0f || f3 == this.f205109t) && ((f3 != 1.0f || f3 == this.f205109t) && ((f3 != 0.0f || f3 == this.f205109t) && Math.abs(f3 - this.f205109t) <= 0.01f && !this.f205110u)))))) {
            return;
        }
        this.f205108s = f4;
        this.f205109t = f3;
        this.f205110u = cardProgressAction == CardProgressAction.SWIPE_DONE || cardProgressAction == CardProgressAction.ANIM_DONE || cardProgressAction == CardProgressAction.UNKNOWN;
        if (view instanceof qm4) {
            ((qm4) view).mo36365d0(f, f2, f3, cardProgressAction);
        }
        qm4 qm4Var = this.f205106q;
        if (qm4Var != null) {
            qm4Var.mo36365d0(f, f2, f3, cardProgressAction);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m220536i0(yw2 yw2Var) {
        this.f205094e = yw2Var;
        yw2Var.m216292c(this);
    }

    /* JADX INFO: renamed from: j */
    public void m220537j(float f, float f2, float f3, float f4, CardProgressAction cardProgressAction, boolean z, String str) {
        float f5;
        CardProgressAction cardProgressAction2;
        float f6;
        boolean z2;
        float f7 = f - f3;
        float f8 = f2 - f4;
        float fSqrt = (float) Math.sqrt((f7 * f7) + (f8 * f8));
        float fMin = Math.min(1.0f, fSqrt / this.f205103n);
        if ((fMin == 0.0f && this.f205111v != 0.0f) || ((fMin == 1.0f && this.f205111v != 1.0f) || Math.abs(fMin - this.f205111v) >= 0.01f)) {
            this.f205111v = fMin;
            if (!vwb.m200296J(m220551q())) {
                for (pol0 pol0Var : m220551q()) {
                    KeyEvent.Callback callback = pol0Var.f150530a;
                    if (callback instanceof qm4) {
                        ((qm4) callback).mo37963f0(pol0Var.f150534e, this.f205111v, fSqrt, this.f205093d.mo122788h(), cardProgressAction.toString() + " reason: " + str);
                    }
                }
            }
        }
        if (vwb.m200296J(m220551q())) {
            return;
        }
        for (pol0 pol0Var2 : m220551q()) {
            KeyEvent.Callback callback2 = pol0Var2.f150530a;
            if (callback2 instanceof qm4) {
                CardProgressAction cardProgressAction3 = cardProgressAction;
                f5 = f8;
                cardProgressAction2 = cardProgressAction3;
                f6 = f7;
                z2 = z;
                ((qm4) callback2).mo37969l0(pol0Var2.f150534e, cardProgressAction2, z2, f6, f5);
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
    public void m220538j0(BifrostLayout bifrostLayout) {
        this.f205091b = bifrostLayout;
    }

    /* JADX INFO: renamed from: k */
    public void m220539k(float f, float f2, float f3, float f4, CardProgressAction cardProgressAction, boolean z, int i, String str) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fSqrt = (float) Math.sqrt((f5 * f5) + (f6 * f6));
        float fMin = Math.min(1.0f, fSqrt / this.f205103n);
        if ((fMin != 0.0f || this.f205112w == 0.0f) && ((fMin != 1.0f || this.f205112w == 1.0f) && Math.abs(fMin - this.f205112w) < 0.01f)) {
            return;
        }
        float f7 = this.f205112w;
        this.f205112w = fMin;
        if (vwb.m200296J(m220551q())) {
            return;
        }
        for (pol0 pol0Var : m220551q()) {
            KeyEvent.Callback callback = pol0Var.f150530a;
            if (callback instanceof qm4) {
                ((qm4) callback).mo37963f0(pol0Var.f150534e - i, this.f205112w, fSqrt, this.f205093d.mo122788h(), "after anim done reason: " + str + " detail: " + f7 + ", " + fMin);
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m220540k0(em4 em4Var) {
        this.f205101l = em4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public void m220541l(View view, float f, float f2, float f3, float f4, CardProgressAction cardProgressAction, boolean z) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        if (view instanceof qm4) {
            ((qm4) view).mo37969l0(0, cardProgressAction, z, f5, f6);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m220542l0(qm4 qm4Var) {
        this.f205106q = qm4Var;
    }

    /* JADX INFO: renamed from: m */
    public final DisplayMetrics m220543m() {
        return m220553r().getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: n */
    public int m220545n(float f) {
        return (int) (m220543m().density * f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    public void m220546n0(View view, SwipeState swipeState, boolean z) {
        if (view instanceof qm4) {
            ((qm4) view).mo37961D0(view, swipeState, z);
        }
        qm4 qm4Var = this.f205106q;
        if (qm4Var != null) {
            qm4Var.mo37961D0(view, swipeState, z);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m220548o0(SwipeState swipeState, boolean z) {
        View view;
        for (pol0 pol0Var : this.f205090a) {
            if (pol0Var.f150534e == 0) {
                view = pol0Var.f150530a;
                m220546n0(view, swipeState, z);
            }
        }
        view = null;
        m220546n0(view, swipeState, z);
    }

    /* JADX INFO: renamed from: p */
    public yw2 m220549p() {
        return this.f205094e;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m220550p0(float f, float f2, float f3, float f4, float f5, float f6, String str, long j) {
        long jM155944o = this.f205107r > 0 ? mqi0.m155944o() - this.f205107r : -1L;
        this.f205107r = mqi0.m155944o();
        o6j0.m162863g("e_swipe_touch_info", "p_suggest_users_home_view", o6j0.C18854a.m162876f("touch_down_x", (int) f3), o6j0.C18854a.m162876f("touch_down_y", (int) f4), o6j0.C18854a.m162876f("touch_up_x", (int) f), o6j0.C18854a.m162876f("touch_up_y", (int) f2), o6j0.C18854a.m162876f("scope_x", this.f205091b.getWidth()), o6j0.C18854a.m162876f("scope_y", this.f205091b.getHeight()), o6j0.C18854a.m162876f("touch_speed_x", Math.abs((int) f5)), o6j0.C18854a.m162876f("touch_speed_y", Math.abs((int) f6)), o6j0.C18854a.m162878h("current_operation", str), o6j0.C18854a.m162877g("operation_interval", jM155944o), o6j0.C18854a.m162877g("swipe_action_during", j));
    }

    /* JADX INFO: renamed from: q */
    public List<pol0> m220551q() {
        return this.f205090a;
    }

    /* JADX INFO: renamed from: q0 */
    public void m220552q0(float f) {
        List<pol0> list = this.f205090a;
        if (list == null || list.isEmpty() || f < 0.0f || Float.isNaN(f) || Float.isInfinite(f)) {
            return;
        }
        int iMo107794d = m220506A().mo107794d();
        float fMo107795e = m220506A().mo107795e();
        boolean zMo107796i = m220506A().mo107796i();
        for (pol0 pol0Var : this.f205090a) {
            int i = pol0Var.f150534e;
            if (i != 0 && i >= 0) {
                float fMin = Math.min(1.0f, f / this.f205102m);
                float fMin2 = Math.min(i - fMin, 2.0f);
                float f2 = 1.0f - (fMin2 * fMo107795e);
                float f3 = f2 * f2 * f2;
                if (Float.isNaN(f3)) {
                    return;
                }
                if (this.f205093d.mo122788h() && this.f205093d.mo122781a() < 1.0f) {
                    if (i == 1) {
                        pol0Var.f150530a.setAlpha(Math.min(1.0f, Math.max(0.0f, (fMin * this.f205093d.mo122782b()) + this.f205093d.mo122781a())));
                    } else if (i == 2) {
                        pol0Var.f150530a.setAlpha(Math.min(1.0f, Math.max(0.0f, fMin * this.f205093d.mo122781a())));
                    } else {
                        pol0Var.f150530a.setAlpha(0.0f);
                    }
                }
                float fSqrt = (float) Math.sqrt(Math.sqrt(fMin2));
                float fSqrt2 = (((float) (((double) (fSqrt * fSqrt * fSqrt)) * Math.sqrt(fSqrt))) * iMo107794d) + (zMo107796i ? (pol0Var.f150530a.getHeight() * (1.0f - f3)) / 2.0f : 0.0f);
                pol0Var.f150530a.setScaleY(f3);
                pol0Var.f150530a.setScaleX(f3);
                pol0Var.f150530a.setRotation(0.0f);
                pol0Var.f150530a.setTranslationY((m220506A().mo107798q() ? -1.0f : 1.0f) * fSqrt2);
                pol0Var.f150530a.setTranslationX(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public Context m220553r() {
        return this.f205099j;
    }

    /* JADX INFO: renamed from: s */
    public cj2 m220554s() {
        return this.f205097h;
    }

    /* JADX INFO: renamed from: t */
    public final float m220555t() {
        return this.f205105p;
    }

    /* JADX INFO: renamed from: u */
    public float mo117880u() {
        return t100.m186890d(63.0f);
    }

    /* JADX INFO: renamed from: v */
    public float mo117881v() {
        return 0.0f;
    }

    /* JADX INFO: renamed from: w */
    public pol0 m220556w() {
        int i = 0;
        for (pol0 pol0Var : this.f205090a) {
            if (pol0Var.m170601b()) {
                if (i >= 1) {
                    return pol0Var;
                }
                i++;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public ra80 m220557x() {
        return this.f205100k;
    }

    /* JADX INFO: renamed from: y */
    public final float m220558y() {
        return mo117880u() / 1.5f;
    }

    /* JADX INFO: renamed from: z */
    public String m220559z(String str) {
        StringBuilder sb = new StringBuilder("from: ");
        sb.append(str);
        sb.append("=> 渲染详情:");
        List<pol0> list = this.f205090a;
        if (list != null && list.size() > 0) {
            for (int i = 0; i < this.f205090a.size(); i++) {
                sb.append(i + ":");
                sb.append(this.f205090a.get(i).m170603d());
                sb.append(" | ");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m220544m0(String str) {
    }

    /* JADX INFO: renamed from: o */
    public void m220547o(Canvas canvas) {
    }
}
