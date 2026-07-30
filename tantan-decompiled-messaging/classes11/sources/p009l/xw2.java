package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p000p1.mobile.putong.core.newui.home.opt.CardAnimType;
import com.p000p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p000p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p000p1.mobile.putong.core.newui.home.opt.CardSwipeOutState;
import com.p000p1.mobile.putong.core.newui.home.opt.SwipeState;
import com.p000p1.mobile.putong.core.newui.home.opt.VirtualState;
import com.p1.mobile.putong.core.data.SwipeDirection;
import java.util.Iterator;
import java.util.List;
import l.vwb;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class xw2 extends bx2 {

    /* JADX INFO: renamed from: l.xw2$a */
    public static /* synthetic */ class C1316a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22737a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f22738b;

        static {
            int[] iArr = new int[CardOperation.values().length];
            f22738b = iArr;
            try {
                iArr[CardOperation.SWIPE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22738b[CardOperation.SWIPE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22738b[CardOperation.SWIPE_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[CardSwipeOutState.values().length];
            f22737a = iArr2;
            try {
                iArr2[CardSwipeOutState.BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22737a[CardSwipeOutState.PASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22737a[CardSwipeOutState.STAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public xw2(Context context) {
        super(context);
    }

    @Override // p009l.bx2
    /* JADX INFO: renamed from: A0 */
    public /* bridge */ /* synthetic */ boolean mo11678A0(CardOperation cardOperation, boolean z) {
        return super.mo11678A0(cardOperation, z);
    }

    /* JADX INFO: renamed from: B0 */
    public void m25030B0(View view, CardOperation cardOperation, float f, boolean z) {
        pol0 next;
        int i;
        if (vwb.J(this.f23927a)) {
            next = null;
            break;
        }
        Iterator<pol0> it = this.f23927a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.f18800a != view);
        if (next != null && this.f23938l.mo2819a(next, cardOperation, z) == CardSwipeOutState.PASS) {
            Iterator<pol0> it2 = this.f23927a.iterator();
            while (it2.hasNext()) {
                pol0 next2 = it2.next();
                if (next2 == next) {
                    it2.remove();
                } else {
                    next2.f18804e--;
                }
            }
            m25989B().removeView(next.f18800a);
            this.f23937k.m21470b(next);
            this.f23931e.mo11928l(next.f18800a, false);
            m26015g0(next);
            if (this.f23927a.size() > 0) {
                List<pol0> list = this.f23927a;
                i = list.get(list.size() - 1).f18804e + 1;
            } else {
                i = -1;
            }
            if (!vwb.J(this.f23927a)) {
                for (pol0 pol0Var : this.f23927a) {
                    if (pol0Var.f18804e == 0) {
                        this.f23931e.mo11922d(pol0Var.f18800a, 0);
                        break;
                    }
                }
            }
            if (i < 0 || i >= this.f23931e.mo11924f()) {
                return;
            }
            yw2 yw2VarM26031p = m26031p();
            int iMo11926h = yw2VarM26031p.mo11926h(i);
            LayoutInflater layoutInflaterM19649a = o7r.m19649a(m26035r());
            View viewM21469a = m26039x().m21469a(iMo11926h);
            if (viewM21469a == null) {
                viewM21469a = m26031p().mo11923e(iMo11926h, m26035r(), layoutInflaterM19649a);
            }
            View view2 = viewM21469a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            view2.setRotation(0.0f);
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
            view2.setAlpha(1.0f);
            yw2VarM26031p.mo11922d(view2, i);
            pol0 pol0Var2 = new pol0();
            pol0Var2.f18804e = i;
            pol0Var2.f18800a = view2;
            pol0Var2.f18803d = yw2VarM26031p.mo11926h(i);
            pol0Var2.f18809j = VirtualState.INIT;
            pol0Var2.m20521c(yw2VarM26031p.mo11927i(i), yw2VarM26031p.mo11925g(i));
            pol0Var2.f18800a = view2;
            m25996O(view2, 0.0f, 0.0f, 0.0f, 0.0f, CardProgressAction.ANIM, false, "other");
            this.f23927a.add(pol0Var2);
            m25989B().addView(view2);
            m25989B().requestLayout();
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final void m25031C0(og4 og4Var) {
        int i;
        Iterator<pol0> it = this.f23927a.iterator();
        while (it.hasNext()) {
            it.next().f18804e += og4Var.f18010e;
        }
        m26015g0(og4Var.f18021p);
        if (this.f23927a.size() > 0) {
            List<pol0> list = this.f23927a;
            i = list.get(list.size() - 1).f18804e + 1;
        } else {
            i = -1;
        }
        if (!vwb.J(this.f23927a)) {
            for (pol0 pol0Var : this.f23927a) {
                if (pol0Var.f18804e == 0) {
                    this.f23931e.mo11922d(pol0Var.f18800a, 0);
                    break;
                }
            }
        }
        if (i < 0 || i >= this.f23931e.mo11924f()) {
            return;
        }
        yw2 yw2VarM26031p = m26031p();
        int iMo11926h = yw2VarM26031p.mo11926h(i);
        LayoutInflater layoutInflaterM19649a = o7r.m19649a(m26035r());
        View viewM21469a = m26039x().m21469a(iMo11926h);
        if (viewM21469a == null) {
            viewM21469a = m26031p().mo11923e(iMo11926h, m26035r(), layoutInflaterM19649a);
        }
        viewM21469a.setTranslationY(0.0f);
        viewM21469a.setTranslationX(0.0f);
        viewM21469a.setRotation(0.0f);
        viewM21469a.setScaleX(1.0f);
        viewM21469a.setScaleY(1.0f);
        yw2VarM26031p.mo11922d(viewM21469a, i);
        pol0 pol0Var2 = new pol0();
        pol0Var2.f18804e = i;
        pol0Var2.f18800a = viewM21469a;
        pol0Var2.f18803d = yw2VarM26031p.mo11926h(i);
        pol0Var2.f18809j = VirtualState.INIT;
        pol0Var2.m20521c(yw2VarM26031p.mo11927i(i), yw2VarM26031p.mo11925g(i));
        pol0Var2.f18800a = viewM21469a;
        if (this.f23930d.mo14559h() && this.f23930d.mo14552a() < 1.0f) {
            viewM21469a.setAlpha(this.f23930d.mo14552a());
        }
        m25996O(pol0Var2.f18800a, 0.0f, 0.0f, 0.0f, 0.0f, CardProgressAction.ANIM_DONE, og4Var.f18022q, "outSuccess");
        this.f23927a.add(pol0Var2);
        m25989B().addView(viewM21469a);
        m25989B().requestLayout();
    }

    @Override // p009l.zw2
    /* JADX INFO: renamed from: J */
    public void mo25032J(og4 og4Var, long j) {
        float f;
        float f2 = 1.0f;
        float f3 = 0.0f;
        float fMax = Math.max(0.0f, Math.min(1.0f, og4Var.m19744f().getInterpolation((j - og4Var.f18008c) / og4Var.f18009d)));
        qo0 qo0Var = og4Var.f18011f;
        boolean z = false;
        for (pol0 pol0Var : this.f23927a) {
            if (og4Var.m19750l(pol0Var)) {
                pol0Var.m20525g(fMax, qo0Var);
                f = f2;
                z = true;
            } else if (z) {
                int iMo12722d = m25988A().mo12722d();
                float fMo12723e = m25988A().mo12723e();
                boolean zMo12724i = m25988A().mo12724i();
                float f4 = qo0Var.f19395a;
                float f5 = f4 + ((qo0Var.f19396b - f4) * fMax);
                float f6 = qo0Var.f19397c;
                float f7 = f6 + ((qo0Var.f19398d - f6) * fMax);
                float fMin = Math.min(f2, Math.max(((float) Math.sqrt((f7 * f7) + (f5 * f5))) / this.f23939m, f3));
                if (this.f23930d.mo14559h() && this.f23930d.mo14552a() < f2) {
                    if (pol0Var.f18804e == 1) {
                        pol0Var.f18800a.setAlpha(Math.min(f2, Math.max(this.f23930d.mo14552a(), (this.f23930d.mo14553b() * fMin) + this.f23930d.mo14552a())));
                    } else {
                        pol0Var.f18800a.setAlpha(f3);
                    }
                }
                float fMin2 = Math.min(pol0Var.f18804e - fMin, 2.0f);
                float f8 = f2 - (fMo12723e * fMin2);
                float f9 = f8 * f8 * f8;
                float fSqrt = (float) Math.sqrt(Math.sqrt(fMin2));
                f = f2;
                float fSqrt2 = (((float) (((double) (fSqrt * fSqrt * fSqrt)) * Math.sqrt(fSqrt))) * iMo12722d) + (zMo12724i ? (pol0Var.f18800a.getHeight() * (f - f9)) / 2.0f : 0.0f);
                pol0Var.f18800a.setScaleY(f9);
                pol0Var.f18800a.setScaleX(f9);
                pol0Var.f18800a.setTranslationY((m25988A().mo12726q() ? -1.0f : f) * fSqrt2);
            } else {
                f = f2;
            }
            f2 = f;
            f3 = 0.0f;
        }
    }

    @Override // p009l.zw2
    /* JADX INFO: renamed from: L */
    public void mo25033L(og4 og4Var, long j) {
        float interpolation = og4Var.m19744f().getInterpolation((j - og4Var.f18008c) / og4Var.f18009d);
        this.f23931e.mo22191k(og4Var.f18021p.f18800a);
        float fMax = Math.max(0.0f, interpolation);
        qo0 qo0Var = og4Var.f18011f;
        for (pol0 pol0Var : this.f23927a) {
            if (og4Var.m19750l(pol0Var)) {
                if (pol0Var.f18804e == 0) {
                    pol0Var.m20525g(fMax, qo0Var);
                    View view = pol0Var.f18800a;
                    m25996O(view, view.getTranslationX(), pol0Var.f18800a.getTranslationY(), 0.0f, 0.0f, CardProgressAction.BACK_ANIM, og4Var.f18022q, "animBack:");
                } else {
                    int iMo12722d = m25988A().mo12722d();
                    float fMo12723e = m25988A().mo12723e();
                    boolean zMo12724i = m25988A().mo12724i();
                    float f = qo0Var.f19395a;
                    float f2 = f + ((qo0Var.f19396b - f) * fMax);
                    float f3 = qo0Var.f19397c;
                    float f4 = f3 + ((qo0Var.f19398d - f3) * fMax);
                    float fMin = Math.min(1.0f, Math.max(((float) Math.sqrt((f4 * f4) + (f2 * f2))) / this.f23939m, 0.0f));
                    if (this.f23930d.mo14559h() && this.f23930d.mo14552a() < 1.0f) {
                        int i = pol0Var.f18804e;
                        if (i == 1) {
                            pol0Var.f18800a.setAlpha(Math.min(1.0f, Math.max(this.f23930d.mo14552a(), (this.f23930d.mo14553b() * fMin) + this.f23930d.mo14552a())));
                        } else if (i == 2) {
                            pol0Var.f18800a.setAlpha(Math.min(1.0f, Math.max(0.0f, this.f23930d.mo14552a() * fMin)));
                        } else {
                            pol0Var.f18800a.setAlpha(0.0f);
                        }
                    }
                    float fMin2 = Math.min(pol0Var.f18804e - fMin, 2.0f);
                    float f5 = 1.0f - (fMo12723e * fMin2);
                    float f6 = f5 * f5 * f5;
                    float fSqrt = (float) Math.sqrt(Math.sqrt(fMin2));
                    float fSqrt2 = (((float) (((double) (fSqrt * fSqrt * fSqrt)) * Math.sqrt(fSqrt))) * iMo12722d) + (zMo12724i ? (pol0Var.f18800a.getHeight() * (1.0f - f6)) / 2.0f : 0.0f);
                    pol0Var.f18800a.setScaleY(f6);
                    pol0Var.f18800a.setScaleX(f6);
                    pol0Var.f18800a.setTranslationY((m25988A().mo12726q() ? -1.0f : 1.0f) * fSqrt2);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x019a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.zw2
    /* JADX INFO: renamed from: M */
    public void mo25034M(og4 og4Var, long j) {
        float fMax;
        float f;
        float f2;
        float f3;
        int i;
        float f4;
        xw2 xw2Var = this;
        float f5 = 1.0f;
        float f6 = 0.0f;
        float fMax2 = Math.max(0.0f, Math.min(1.0f, og4Var.m19744f().getInterpolation((j - og4Var.f18008c) / og4Var.f18009d)));
        qo0 qo0Var = og4Var.f18011f;
        if (xw2Var.f23930d.mo14561j()) {
            long jMo14558g = xw2Var.f23930d.mo14558g();
            if (xw2Var.f23930d.mo14560i()) {
                jMo14558g = (long) (xw2Var.f23930d.mo14558g() * Math.abs(qo0Var.f19406l - qo0Var.f19405k));
            }
            if (jMo14558g <= 0) {
                jMo14558g = 1;
            }
            fMax = Math.max(0.0f, Math.min(1.0f, (j - og4Var.f18008c) / Math.min(og4Var.f18009d, jMo14558g)));
            if (og4Var.f18014i && og4Var.f18012g == CardSwipeOutState.INVALID) {
                long j2 = og4Var.f18008c;
                og4Var.f18008c = j2 + (j - j2);
                fMax2 = 0.0f;
                fMax = 0.0f;
            }
        } else {
            fMax = 1.0f;
        }
        float fM21115a = qo0Var.m21115a(fMax2);
        if (og4Var.f18012g != CardSwipeOutState.INVALID || (fM21115a <= xw2Var.f23941o && !og4Var.f18014i)) {
            f = fMax2;
            f2 = fMax;
        } else {
            CardSwipeOutState cardSwipeOutStateMo2819a = xw2Var.f23938l.mo2819a(og4Var.f18021p, og4Var.m19748j(), og4Var.f18014i);
            xw2Var.m26005Y("swipe anim out: " + og4Var.f18020o);
            if (BifrostLayout.f2099d) {
                cardSwipeOutStateMo2819a.name();
                og4Var.f18021p.m20523e(false);
            }
            int i2 = C1316a.f22737a[cardSwipeOutStateMo2819a.ordinal()];
            if (i2 == 1) {
                if (og4Var.f18014i) {
                    xw2Var.f23931e.mo22191k(og4Var.f18021p.f18800a);
                }
                og4Var.f18012g = cardSwipeOutStateMo2819a;
                og4Var.f18011f.m21119e(og4Var.f18021p.f18800a);
                qo0 qo0Var2 = og4Var.f18011f;
                qo0Var2.f19405k = fMax;
                qo0Var2.m21116b();
                long j3 = j - og4Var.f18008c;
                og4Var.f18008c = j;
                og4Var.f18009d = Math.max(200L, j3);
                og4Var.m19741c();
                og4Var.f18007b = CardAnimType.ANIM_BACK;
                og4Var.f18006a = zo0.f23775O;
                og4Var.f18021p.f18809j = VirtualState.RENDING;
                String str = BifrostLayout.f2098c;
                return;
            }
            if (i2 == 2) {
                og4Var.f18012g = cardSwipeOutStateMo2819a;
                og4Var.f18021p.f18809j = VirtualState.ANIM_OUT;
            } else if (i2 == 3) {
                og4Var.f18007b = CardAnimType.ANIM_INVALID;
                og4Var.f18021p.f18809j = VirtualState.RENDING;
            }
            xw2Var.m26004X("swipeCheckDone:" + cardSwipeOutStateMo2819a.name() + ", detail" + og4Var.f18021p.m20522d());
            if (og4Var.f18021p.f18800a instanceof qm4) {
                SwipeDirection swipeDirection = SwipeDirection.LEFT;
                int i3 = C1316a.f22738b[og4Var.m19748j().ordinal()];
                if (i3 == 1) {
                    swipeDirection = SwipeDirection.UP;
                } else if (i3 != 2 && i3 == 3) {
                    swipeDirection = SwipeDirection.RIGHT;
                }
                ((qm4) og4Var.f18021p.f18800a).mo1956x(swipeDirection, cardSwipeOutStateMo2819a, og4Var.f18014i);
                View view = og4Var.f18021p.f18800a;
                ((qm4) view).mo1935D0(view, SwipeState.START_FLING_OUT, og4Var.f18014i);
            }
            if (xw2Var.f23930d.mo14561j() && og4Var.f18014i) {
                long j4 = og4Var.f18008c;
                og4Var.f18008c = j4 + (j - j4);
                f = 0.0f;
                f2 = 0.0f;
            } else {
                f = fMax2;
                f2 = fMax;
            }
        }
        int i4 = 1;
        for (pol0 pol0Var : xw2Var.f23927a) {
            if (!og4Var.m19750l(pol0Var)) {
                f3 = f;
                i = i4;
            } else if (og4Var.m19751m(pol0Var.f18810k)) {
                pol0Var.f18800a.hashCode();
                pol0Var.m20525g(f, qo0Var);
                boolean z = og4Var.f18015j;
                float f7 = f;
                View view2 = pol0Var.f18800a;
                if (z) {
                    i = i4;
                    f3 = f7;
                    float translationX = view2.getTranslationX();
                    float translationY = pol0Var.f18800a.getTranslationY();
                    CardProgressAction cardProgressAction = CardProgressAction.ANIM;
                    m26021k(translationX, translationY, 0.0f, 0.0f, cardProgressAction, og4Var.f18022q, og4Var.f18010e, " by anim finish");
                    View view3 = pol0Var.f18800a;
                    xw2Var = this;
                    xw2Var.m26023l(view3, view3.getTranslationX(), pol0Var.f18800a.getTranslationY(), 0.0f, 0.0f, cardProgressAction, og4Var.f18022q);
                } else {
                    f3 = f7;
                    i = i4;
                    xw2Var.m25996O(view2, view2.getTranslationX(), pol0Var.f18800a.getTranslationY(), 0.0f, 0.0f, CardProgressAction.ANIM, og4Var.f18022q, og4Var.f18014i ? "auto out: auto" : "animOut: no auto");
                    xw2Var = this;
                }
            } else {
                f3 = f;
                i = i4;
                if (pol0Var.f18804e < 0) {
                    i4 = i;
                    f = f3;
                } else {
                    if (!og4Var.f18016k) {
                        int iMo12722d = xw2Var.m25988A().mo12722d();
                        float fMo12723e = xw2Var.m25988A().mo12723e();
                        boolean zMo12724i = xw2Var.m25988A().mo12724i();
                        float f8 = qo0Var.f19395a;
                        float f9 = f8 + ((qo0Var.f19396b - f8) * f3);
                        float f10 = qo0Var.f19397c;
                        float f11 = f10 + ((qo0Var.f19398d - f10) * f3);
                        float fSqrt = ((float) Math.sqrt((f11 * f11) + (f9 * f9))) / xw2Var.f23939m;
                        if (xw2Var.f23930d.mo14561j()) {
                            float f12 = qo0Var.f19405k;
                            fSqrt = f12 + ((qo0Var.f19406l - f12) * f2);
                        }
                        float fMin = Math.min(f5, Math.max(fSqrt, f6));
                        if (xw2Var.f23930d.mo14559h() && xw2Var.f23930d.mo14552a() < f5) {
                            if (i == 1) {
                                pol0Var.f18800a.setAlpha(Math.min(f5, Math.max(f6, (xw2Var.f23930d.mo14553b() * fMin) + xw2Var.f23930d.mo14552a())));
                            } else if (i == 2) {
                                pol0Var.f18800a.setAlpha(Math.min(f5, Math.max(f6, xw2Var.f23930d.mo14552a() * fMin)));
                            } else {
                                pol0Var.f18800a.setAlpha(f6);
                            }
                        }
                        float fMin2 = Math.min(i - fMin, 2.0f);
                        int i5 = i + 1;
                        float f13 = f5 - (fMo12723e * fMin2);
                        float f14 = f13 * f13 * f13;
                        float fSqrt2 = (float) Math.sqrt(Math.sqrt(fMin2));
                        f4 = f5;
                        float fSqrt3 = (((float) (((double) (fSqrt2 * fSqrt2 * fSqrt2)) * Math.sqrt(fSqrt2))) * iMo12722d) + (zMo12724i ? (pol0Var.f18800a.getHeight() * (f4 - f14)) / 2.0f : 0.0f);
                        if (Float.isNaN(f14)) {
                            String str2 = BifrostLayout.f2098c;
                        }
                        pol0Var.f18800a.setScaleY(f14);
                        pol0Var.f18800a.setScaleX(f14);
                        if (BifrostLayout.f2099d) {
                            pol0Var.f18800a.hashCode();
                        }
                        pol0Var.f18800a.setTranslationY((xw2Var.m25988A().mo12726q() ? -1.0f : f4) * fSqrt3);
                        if (f14 > f4) {
                            String str3 = BifrostLayout.f2098c;
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
        CardSwipeOutState cardSwipeOutState = og4Var.f18012g;
        CardSwipeOutState cardSwipeOutState2 = CardSwipeOutState.PASS;
        if (cardSwipeOutState == cardSwipeOutState2 && !og4Var.f18015j) {
            og4Var.f18015j = true;
            xw2Var.m26005Y("anim success begin :" + og4Var.f18020o);
            m25031C0(og4Var);
            xw2Var.m26005Y("anim success end :" + og4Var.f18020o);
            qm4 qm4Var = xw2Var.f23943q;
            if (qm4Var != null) {
                CardProgressAction cardProgressAction2 = CardProgressAction.ANIM_DONE;
                qm4Var.mo294d0(0.0f, 0.0f, 0.0f, cardProgressAction2);
                xw2Var.f23943q.mo2817v0(0.0f, 0.0f, cardProgressAction2);
            }
        }
        if (og4Var.f18012g != cardSwipeOutState2 || og4Var.f18016k) {
            return;
        }
        if ((xw2Var.f23930d.mo14561j() || fM21115a < xw2Var.f23939m) && (!xw2Var.f23930d.mo14561j() || f2 < f15)) {
            return;
        }
        og4Var.f18016k = true;
    }

    @Override // p009l.bx2, p009l.jl4
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ void mo12312a() {
        super.mo12312a();
    }

    @Override // p009l.bx2, p009l.jl4
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ String mo12313b() {
        return super.mo12313b();
    }

    @Override // p009l.bx2
    /* JADX INFO: renamed from: u0 */
    public /* bridge */ /* synthetic */ c mo12316u0() {
        return super.mo12316u0();
    }

    @Override // p009l.bx2
    /* JADX INFO: renamed from: z0 */
    public /* bridge */ /* synthetic */ void mo12321z0() {
        super.mo12321z0();
    }
}
