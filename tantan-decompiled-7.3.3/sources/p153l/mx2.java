package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p051p1.mobile.putong.core.newui.home.opt.CardAnimType;
import com.p051p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p051p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p051p1.mobile.putong.core.newui.home.opt.CardSwipeOutState;
import com.p051p1.mobile.putong.core.newui.home.opt.SwipeState;
import com.p051p1.mobile.putong.core.newui.home.opt.VirtualState;
import java.util.Iterator;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class mx2 extends qx2 {

    /* JADX INFO: renamed from: l.mx2$a */
    public static /* synthetic */ class C18728a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f139175a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f139176b;

        static {
            int[] iArr = new int[CardOperation.values().length];
            f139176b = iArr;
            try {
                iArr[CardOperation.SWIPE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f139176b[CardOperation.SWIPE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f139176b[CardOperation.SWIPE_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[CardSwipeOutState.values().length];
            f139175a = iArr2;
            try {
                iArr2[CardSwipeOutState.BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f139175a[CardSwipeOutState.PASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f139175a[CardSwipeOutState.STAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public mx2(Context context) {
        super(context);
    }

    @Override // p153l.qx2
    /* JADX INFO: renamed from: A0 */
    public /* bridge */ /* synthetic */ boolean mo160614A0(CardOperation cardOperation, boolean z) {
        return super.mo160614A0(cardOperation, z);
    }

    /* JADX INFO: renamed from: B0 */
    public void m160615B0(View view, CardOperation cardOperation, float f, boolean z) {
        txl0 next;
        int i;
        if (jyb.m147479J(this.f149591a)) {
            next = null;
            break;
        }
        Iterator<txl0> it = this.f149591a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.f176568a != view);
        if (next != null && this.f149602l.mo39826a(next, cardOperation, z) == CardSwipeOutState.PASS) {
            Iterator<txl0> it2 = this.f149591a.iterator();
            while (it2.hasNext()) {
                txl0 next2 = it2.next();
                if (next2 == next) {
                    it2.remove();
                } else {
                    next2.f176572e--;
                }
            }
            m169620B().removeView(next.f176568a);
            this.f149601k.m211130b(next);
            this.f149595e.mo105835l(next.f176568a, false);
            m169646g0(next);
            if (this.f149591a.size() > 0) {
                List<txl0> list = this.f149591a;
                i = list.get(list.size() - 1).f176572e + 1;
            } else {
                i = -1;
            }
            if (!jyb.m147479J(this.f149591a)) {
                for (txl0 txl0Var : this.f149591a) {
                    if (txl0Var.f176572e == 0) {
                        this.f149595e.mo105829d(txl0Var.f176568a, 0);
                        break;
                    }
                }
            }
            if (i < 0 || i >= this.f149595e.mo105831f()) {
                return;
            }
            nx2 nx2VarM169663p = m169663p();
            int iMo105833h = nx2VarM169663p.mo105833h(i);
            LayoutInflater layoutInflaterM171370a = p9r.m171370a(m169667r());
            View viewM211129a = m169671x().m211129a(iMo105833h);
            if (viewM211129a == null) {
                viewM211129a = m169663p().mo105830e(iMo105833h, m169667r(), layoutInflaterM171370a);
            }
            View view2 = viewM211129a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            view2.setRotation(0.0f);
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
            view2.setAlpha(1.0f);
            nx2VarM169663p.mo105829d(view2, i);
            txl0 txl0Var2 = new txl0();
            txl0Var2.f176572e = i;
            txl0Var2.f176568a = view2;
            txl0Var2.f176571d = nx2VarM169663p.mo105833h(i);
            txl0Var2.f176577j = VirtualState.INIT;
            txl0Var2.m193510c(nx2VarM169663p.mo105834i(i), nx2VarM169663p.mo105832g(i));
            txl0Var2.f176568a = view2;
            m169627O(view2, 0.0f, 0.0f, 0.0f, 0.0f, CardProgressAction.ANIM, false, "other");
            this.f149591a.add(txl0Var2);
            m169620B().addView(view2);
            m169620B().requestLayout();
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final void m160616C0(nh4 nh4Var) {
        int i;
        Iterator<txl0> it = this.f149591a.iterator();
        while (it.hasNext()) {
            it.next().f176572e += nh4Var.f141911e;
        }
        m169646g0(nh4Var.f141922p);
        if (this.f149591a.size() > 0) {
            List<txl0> list = this.f149591a;
            i = list.get(list.size() - 1).f176572e + 1;
        } else {
            i = -1;
        }
        if (!jyb.m147479J(this.f149591a)) {
            for (txl0 txl0Var : this.f149591a) {
                if (txl0Var.f176572e == 0) {
                    this.f149595e.mo105829d(txl0Var.f176568a, 0);
                    break;
                }
            }
        }
        if (i < 0 || i >= this.f149595e.mo105831f()) {
            return;
        }
        nx2 nx2VarM169663p = m169663p();
        int iMo105833h = nx2VarM169663p.mo105833h(i);
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(m169667r());
        View viewM211129a = m169671x().m211129a(iMo105833h);
        if (viewM211129a == null) {
            viewM211129a = m169663p().mo105830e(iMo105833h, m169667r(), layoutInflaterM171370a);
        }
        viewM211129a.setTranslationY(0.0f);
        viewM211129a.setTranslationX(0.0f);
        viewM211129a.setRotation(0.0f);
        viewM211129a.setScaleX(1.0f);
        viewM211129a.setScaleY(1.0f);
        nx2VarM169663p.mo105829d(viewM211129a, i);
        txl0 txl0Var2 = new txl0();
        txl0Var2.f176572e = i;
        txl0Var2.f176568a = viewM211129a;
        txl0Var2.f176571d = nx2VarM169663p.mo105833h(i);
        txl0Var2.f176577j = VirtualState.INIT;
        txl0Var2.m193510c(nx2VarM169663p.mo105834i(i), nx2VarM169663p.mo105832g(i));
        txl0Var2.f176568a = viewM211129a;
        if (this.f149594d.mo164123h() && this.f149594d.mo164116a() < 1.0f) {
            viewM211129a.setAlpha(this.f149594d.mo164116a());
        }
        m169627O(txl0Var2.f176568a, 0.0f, 0.0f, 0.0f, 0.0f, CardProgressAction.ANIM_DONE, nh4Var.f141923q, "outSuccess");
        this.f149591a.add(txl0Var2);
        m169620B().addView(viewM211129a);
        m169620B().requestLayout();
    }

    @Override // p153l.ox2
    /* JADX INFO: renamed from: J */
    public void mo160617J(nh4 nh4Var, long j) {
        float f;
        float f2 = 1.0f;
        float f3 = 0.0f;
        float fMax = Math.max(0.0f, Math.min(1.0f, nh4Var.m163031f().getInterpolation((j - nh4Var.f141909c) / nh4Var.f141910d)));
        mo0 mo0Var = nh4Var.f141912f;
        boolean z = false;
        for (txl0 txl0Var : this.f149591a) {
            if (nh4Var.m163037l(txl0Var)) {
                txl0Var.m193514g(fMax, mo0Var);
                f = f2;
                z = true;
            } else if (z) {
                int iMo98955d = m169619A().mo98955d();
                float fMo98956e = m169619A().mo98956e();
                boolean zMo98957i = m169619A().mo98957i();
                float f4 = mo0Var.f137753a;
                float f5 = f4 + ((mo0Var.f137754b - f4) * fMax);
                float f6 = mo0Var.f137755c;
                float f7 = f6 + ((mo0Var.f137756d - f6) * fMax);
                float fMin = Math.min(f2, Math.max(((float) Math.sqrt((f7 * f7) + (f5 * f5))) / this.f149603m, f3));
                if (this.f149594d.mo164123h() && this.f149594d.mo164116a() < f2) {
                    if (txl0Var.f176572e == 1) {
                        txl0Var.f176568a.setAlpha(Math.min(f2, Math.max(this.f149594d.mo164116a(), (this.f149594d.mo164117b() * fMin) + this.f149594d.mo164116a())));
                    } else {
                        txl0Var.f176568a.setAlpha(f3);
                    }
                }
                float fMin2 = Math.min(txl0Var.f176572e - fMin, 2.0f);
                float f8 = f2 - (fMo98956e * fMin2);
                float f9 = f8 * f8 * f8;
                float fSqrt = (float) Math.sqrt(Math.sqrt(fMin2));
                f = f2;
                float fSqrt2 = (((float) (((double) (fSqrt * fSqrt * fSqrt)) * Math.sqrt(fSqrt))) * iMo98955d) + (zMo98957i ? (txl0Var.f176568a.getHeight() * (f - f9)) / 2.0f : 0.0f);
                txl0Var.f176568a.setScaleY(f9);
                txl0Var.f176568a.setScaleX(f9);
                txl0Var.f176568a.setTranslationY((m169619A().mo141296q() ? -1.0f : f) * fSqrt2);
            } else {
                f = f2;
            }
            f2 = f;
            f3 = 0.0f;
        }
    }

    @Override // p153l.ox2
    /* JADX INFO: renamed from: L */
    public void mo160618L(nh4 nh4Var, long j) {
        float interpolation = nh4Var.m163031f().getInterpolation((j - nh4Var.f141909c) / nh4Var.f141910d);
        this.f149595e.mo165056k(nh4Var.f141922p.f176568a);
        float fMax = Math.max(0.0f, interpolation);
        mo0 mo0Var = nh4Var.f141912f;
        for (txl0 txl0Var : this.f149591a) {
            if (nh4Var.m163037l(txl0Var)) {
                if (txl0Var.f176572e == 0) {
                    txl0Var.m193514g(fMax, mo0Var);
                    View view = txl0Var.f176568a;
                    m169627O(view, view.getTranslationX(), txl0Var.f176568a.getTranslationY(), 0.0f, 0.0f, CardProgressAction.BACK_ANIM, nh4Var.f141923q, "animBack:");
                } else {
                    int iMo98955d = m169619A().mo98955d();
                    float fMo98956e = m169619A().mo98956e();
                    boolean zMo98957i = m169619A().mo98957i();
                    float f = mo0Var.f137753a;
                    float f2 = f + ((mo0Var.f137754b - f) * fMax);
                    float f3 = mo0Var.f137755c;
                    float f4 = f3 + ((mo0Var.f137756d - f3) * fMax);
                    float fMin = Math.min(1.0f, Math.max(((float) Math.sqrt((f4 * f4) + (f2 * f2))) / this.f149603m, 0.0f));
                    if (this.f149594d.mo164123h() && this.f149594d.mo164116a() < 1.0f) {
                        int i = txl0Var.f176572e;
                        if (i == 1) {
                            txl0Var.f176568a.setAlpha(Math.min(1.0f, Math.max(this.f149594d.mo164116a(), (this.f149594d.mo164117b() * fMin) + this.f149594d.mo164116a())));
                        } else if (i == 2) {
                            txl0Var.f176568a.setAlpha(Math.min(1.0f, Math.max(0.0f, this.f149594d.mo164116a() * fMin)));
                        } else {
                            txl0Var.f176568a.setAlpha(0.0f);
                        }
                    }
                    float fMin2 = Math.min(txl0Var.f176572e - fMin, 2.0f);
                    float f5 = 1.0f - (fMo98956e * fMin2);
                    float f6 = f5 * f5 * f5;
                    float fSqrt = (float) Math.sqrt(Math.sqrt(fMin2));
                    float fSqrt2 = (((float) (((double) (fSqrt * fSqrt * fSqrt)) * Math.sqrt(fSqrt))) * iMo98955d) + (zMo98957i ? (txl0Var.f176568a.getHeight() * (1.0f - f6)) / 2.0f : 0.0f);
                    txl0Var.f176568a.setScaleY(f6);
                    txl0Var.f176568a.setScaleX(f6);
                    txl0Var.f176568a.setTranslationY((m169619A().mo141296q() ? -1.0f : 1.0f) * fSqrt2);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x019a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.ox2
    /* JADX INFO: renamed from: M */
    public void mo160619M(nh4 nh4Var, long j) {
        float fMax;
        float f;
        float f2;
        float f3;
        int i;
        float f4;
        mx2 mx2Var = this;
        float f5 = 1.0f;
        float f6 = 0.0f;
        float fMax2 = Math.max(0.0f, Math.min(1.0f, nh4Var.m163031f().getInterpolation((j - nh4Var.f141909c) / nh4Var.f141910d)));
        mo0 mo0Var = nh4Var.f141912f;
        if (mx2Var.f149594d.mo164125j()) {
            long jMo164122g = mx2Var.f149594d.mo164122g();
            if (mx2Var.f149594d.mo164124i()) {
                jMo164122g = (long) (mx2Var.f149594d.mo164122g() * Math.abs(mo0Var.f137764l - mo0Var.f137763k));
            }
            if (jMo164122g <= 0) {
                jMo164122g = 1;
            }
            fMax = Math.max(0.0f, Math.min(1.0f, (j - nh4Var.f141909c) / Math.min(nh4Var.f141910d, jMo164122g)));
            if (nh4Var.f141915i && nh4Var.f141913g == CardSwipeOutState.INVALID) {
                long j2 = nh4Var.f141909c;
                nh4Var.f141909c = j2 + (j - j2);
                fMax2 = 0.0f;
                fMax = 0.0f;
            }
        } else {
            fMax = 1.0f;
        }
        float fM159219a = mo0Var.m159219a(fMax2);
        if (nh4Var.f141913g != CardSwipeOutState.INVALID || (fM159219a <= mx2Var.f149605o && !nh4Var.f141915i)) {
            f = fMax2;
            f2 = fMax;
        } else {
            CardSwipeOutState cardSwipeOutStateMo39826a = mx2Var.f149602l.mo39826a(nh4Var.f141922p, nh4Var.m163035j(), nh4Var.f141915i);
            mx2Var.m169636Y("swipe anim out: " + nh4Var.f141921o);
            if (BifrostLayout.f24063d) {
                cardSwipeOutStateMo39826a.name();
                nh4Var.f141922p.m193512e(false);
            }
            int i2 = C18728a.f139175a[cardSwipeOutStateMo39826a.ordinal()];
            if (i2 == 1) {
                if (nh4Var.f141915i) {
                    mx2Var.f149595e.mo165056k(nh4Var.f141922p.f176568a);
                }
                nh4Var.f141913g = cardSwipeOutStateMo39826a;
                nh4Var.f141912f.m159223e(nh4Var.f141922p.f176568a);
                mo0 mo0Var2 = nh4Var.f141912f;
                mo0Var2.f137763k = fMax;
                mo0Var2.m159220b();
                long j3 = j - nh4Var.f141909c;
                nh4Var.f141909c = j;
                nh4Var.f141910d = Math.max(200L, j3);
                nh4Var.m163028c();
                nh4Var.f141908b = CardAnimType.ANIM_BACK;
                nh4Var.f141907a = vo0.f184957O;
                nh4Var.f141922p.f176577j = VirtualState.RENDING;
                String str = BifrostLayout.f24062c;
                return;
            }
            if (i2 == 2) {
                nh4Var.f141913g = cardSwipeOutStateMo39826a;
                nh4Var.f141922p.f176577j = VirtualState.ANIM_OUT;
            } else if (i2 == 3) {
                nh4Var.f141908b = CardAnimType.ANIM_INVALID;
                nh4Var.f141922p.f176577j = VirtualState.RENDING;
            }
            mx2Var.m169635X("swipeCheckDone:" + cardSwipeOutStateMo39826a.name() + ", detail" + nh4Var.f141922p.m193511d());
            if (nh4Var.f141922p.f176568a instanceof pn4) {
                SwipeDirection swipeDirection = SwipeDirection.LEFT;
                int i3 = C18728a.f139176b[nh4Var.m163035j().ordinal()];
                if (i3 == 1) {
                    swipeDirection = SwipeDirection.UP;
                } else if (i3 != 2 && i3 == 3) {
                    swipeDirection = SwipeDirection.RIGHT;
                }
                ((pn4) nh4Var.f141922p.f176568a).mo38985x(swipeDirection, cardSwipeOutStateMo39826a, nh4Var.f141915i);
                View view = nh4Var.f141922p.f176568a;
                ((pn4) view).mo38964D0(view, SwipeState.START_FLING_OUT, nh4Var.f141915i);
            }
            if (mx2Var.f149594d.mo164125j() && nh4Var.f141915i) {
                long j4 = nh4Var.f141909c;
                nh4Var.f141909c = j4 + (j - j4);
                f = 0.0f;
                f2 = 0.0f;
            } else {
                f = fMax2;
                f2 = fMax;
            }
        }
        int i4 = 1;
        for (txl0 txl0Var : mx2Var.f149591a) {
            if (!nh4Var.m163037l(txl0Var)) {
                f3 = f;
                i = i4;
            } else if (nh4Var.m163038m(txl0Var.f176578k)) {
                txl0Var.f176568a.hashCode();
                txl0Var.m193514g(f, mo0Var);
                boolean z = nh4Var.f141916j;
                float f7 = f;
                View view2 = txl0Var.f176568a;
                if (z) {
                    i = i4;
                    f3 = f7;
                    float translationX = view2.getTranslationX();
                    float translationY = txl0Var.f176568a.getTranslationY();
                    CardProgressAction cardProgressAction = CardProgressAction.ANIM;
                    m169653k(translationX, translationY, 0.0f, 0.0f, cardProgressAction, nh4Var.f141923q, nh4Var.f141911e, " by anim finish");
                    View view3 = txl0Var.f176568a;
                    mx2Var = this;
                    mx2Var.m169655l(view3, view3.getTranslationX(), txl0Var.f176568a.getTranslationY(), 0.0f, 0.0f, cardProgressAction, nh4Var.f141923q);
                } else {
                    f3 = f7;
                    i = i4;
                    mx2Var.m169627O(view2, view2.getTranslationX(), txl0Var.f176568a.getTranslationY(), 0.0f, 0.0f, CardProgressAction.ANIM, nh4Var.f141923q, nh4Var.f141915i ? "auto out: auto" : "animOut: no auto");
                    mx2Var = this;
                }
            } else {
                f3 = f;
                i = i4;
                if (txl0Var.f176572e < 0) {
                    i4 = i;
                    f = f3;
                } else {
                    if (!nh4Var.f141917k) {
                        int iMo98955d = mx2Var.m169619A().mo98955d();
                        float fMo98956e = mx2Var.m169619A().mo98956e();
                        boolean zMo98957i = mx2Var.m169619A().mo98957i();
                        float f8 = mo0Var.f137753a;
                        float f9 = f8 + ((mo0Var.f137754b - f8) * f3);
                        float f10 = mo0Var.f137755c;
                        float f11 = f10 + ((mo0Var.f137756d - f10) * f3);
                        float fSqrt = ((float) Math.sqrt((f11 * f11) + (f9 * f9))) / mx2Var.f149603m;
                        if (mx2Var.f149594d.mo164125j()) {
                            float f12 = mo0Var.f137763k;
                            fSqrt = f12 + ((mo0Var.f137764l - f12) * f2);
                        }
                        float fMin = Math.min(f5, Math.max(fSqrt, f6));
                        if (mx2Var.f149594d.mo164123h() && mx2Var.f149594d.mo164116a() < f5) {
                            if (i == 1) {
                                txl0Var.f176568a.setAlpha(Math.min(f5, Math.max(f6, (mx2Var.f149594d.mo164117b() * fMin) + mx2Var.f149594d.mo164116a())));
                            } else if (i == 2) {
                                txl0Var.f176568a.setAlpha(Math.min(f5, Math.max(f6, mx2Var.f149594d.mo164116a() * fMin)));
                            } else {
                                txl0Var.f176568a.setAlpha(f6);
                            }
                        }
                        float fMin2 = Math.min(i - fMin, 2.0f);
                        int i5 = i + 1;
                        float f13 = f5 - (fMo98956e * fMin2);
                        float f14 = f13 * f13 * f13;
                        float fSqrt2 = (float) Math.sqrt(Math.sqrt(fMin2));
                        f4 = f5;
                        float fSqrt3 = (((float) (((double) (fSqrt2 * fSqrt2 * fSqrt2)) * Math.sqrt(fSqrt2))) * iMo98955d) + (zMo98957i ? (txl0Var.f176568a.getHeight() * (f4 - f14)) / 2.0f : 0.0f);
                        if (Float.isNaN(f14)) {
                            String str2 = BifrostLayout.f24062c;
                        }
                        txl0Var.f176568a.setScaleY(f14);
                        txl0Var.f176568a.setScaleX(f14);
                        if (BifrostLayout.f24063d) {
                            txl0Var.f176568a.hashCode();
                        }
                        txl0Var.f176568a.setTranslationY((mx2Var.m169619A().mo141296q() ? -1.0f : f4) * fSqrt3);
                        if (f14 > f4) {
                            String str3 = BifrostLayout.f24062c;
                        }
                        i4 = i5;
                    }
                    f5 = f4;
                    f = f3;
                    f6 = 0.0f;
                }
            }
            f4 = f5;
            i4 = i;
            f5 = f4;
            f = f3;
            f6 = 0.0f;
        }
        float f15 = f5;
        CardSwipeOutState cardSwipeOutState = nh4Var.f141913g;
        CardSwipeOutState cardSwipeOutState2 = CardSwipeOutState.PASS;
        if (cardSwipeOutState == cardSwipeOutState2 && !nh4Var.f141916j) {
            nh4Var.f141916j = true;
            mx2Var.m169636Y("anim success begin :" + nh4Var.f141921o);
            m160616C0(nh4Var);
            mx2Var.m169636Y("anim success end :" + nh4Var.f141921o);
            pn4 pn4Var = mx2Var.f149607q;
            if (pn4Var != null) {
                CardProgressAction cardProgressAction2 = CardProgressAction.ANIM_DONE;
                pn4Var.mo37368d0(0.0f, 0.0f, 0.0f, cardProgressAction2);
                mx2Var.f149607q.mo39824v0(0.0f, 0.0f, cardProgressAction2);
            }
        }
        if (nh4Var.f141913g != cardSwipeOutState2 || nh4Var.f141917k) {
            return;
        }
        if ((mx2Var.f149594d.mo164125j() || fM159219a < mx2Var.f149603m) && (!mx2Var.f149594d.mo164125j() || f2 < f15)) {
            return;
        }
        nh4Var.f141917k = true;
    }

    @Override // p153l.qx2, p153l.im4
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ void mo140726a() {
        super.mo140726a();
    }

    @Override // p153l.qx2, p153l.im4
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ String mo140727b() {
        return super.mo140727b();
    }

    @Override // p153l.qx2
    /* JADX INFO: renamed from: u0 */
    public /* bridge */ /* synthetic */ C22421c mo160620u0() {
        return super.mo160620u0();
    }

    @Override // p153l.qx2
    /* JADX INFO: renamed from: z0 */
    public /* bridge */ /* synthetic */ void mo160621z0() {
        super.mo160621z0();
    }
}
