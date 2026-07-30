package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p046p1.mobile.putong.core.newui.home.opt.CardAnimType;
import com.p046p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p046p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p046p1.mobile.putong.core.newui.home.opt.CardSwipeOutState;
import com.p046p1.mobile.putong.core.newui.home.opt.SwipeState;
import com.p046p1.mobile.putong.core.newui.home.opt.VirtualState;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class xw2 extends bx2 {

    /* JADX INFO: renamed from: l.xw2$a */
    public static /* synthetic */ class C21246a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f194687a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f194688b;

        static {
            int[] iArr = new int[CardOperation.values().length];
            f194688b = iArr;
            try {
                iArr[CardOperation.SWIPE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f194688b[CardOperation.SWIPE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f194688b[CardOperation.SWIPE_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[CardSwipeOutState.values().length];
            f194687a = iArr2;
            try {
                iArr2[CardSwipeOutState.BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f194687a[CardSwipeOutState.PASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f194687a[CardSwipeOutState.STAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public xw2(Context context) {
        super(context);
    }

    @Override // p149l.bx2
    /* JADX INFO: renamed from: A0 */
    public /* bridge */ /* synthetic */ boolean mo99351A0(CardOperation cardOperation, boolean z) {
        return super.mo99351A0(cardOperation, z);
    }

    /* JADX INFO: renamed from: B0 */
    public void m211310B0(View view, CardOperation cardOperation, float f, boolean z) {
        pol0 next;
        int i;
        if (vwb.m200296J(this.f205090a)) {
            next = null;
            break;
        }
        Iterator<pol0> it = this.f205090a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.f150530a != view);
        if (next != null && this.f205101l.mo38823a(next, cardOperation, z) == CardSwipeOutState.PASS) {
            Iterator<pol0> it2 = this.f205090a.iterator();
            while (it2.hasNext()) {
                pol0 next2 = it2.next();
                if (next2 == next) {
                    it2.remove();
                } else {
                    next2.f150534e--;
                }
            }
            m220507B().removeView(next.f150530a);
            this.f205100k.m178473b(next);
            this.f205094e.mo100903l(next.f150530a, false);
            m220533g0(next);
            if (this.f205090a.size() > 0) {
                List<pol0> list = this.f205090a;
                i = list.get(list.size() - 1).f150534e + 1;
            } else {
                i = -1;
            }
            if (!vwb.m200296J(this.f205090a)) {
                for (pol0 pol0Var : this.f205090a) {
                    if (pol0Var.f150534e == 0) {
                        this.f205094e.mo100897d(pol0Var.f150530a, 0);
                        break;
                    }
                }
            }
            if (i < 0 || i >= this.f205094e.mo100899f()) {
                return;
            }
            yw2 yw2VarM220549p = m220549p();
            int iMo100901h = yw2VarM220549p.mo100901h(i);
            LayoutInflater layoutInflaterM163037a = o7r.m163037a(m220553r());
            View viewM178472a = m220557x().m178472a(iMo100901h);
            if (viewM178472a == null) {
                viewM178472a = m220549p().mo100898e(iMo100901h, m220553r(), layoutInflaterM163037a);
            }
            View view2 = viewM178472a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            view2.setRotation(0.0f);
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
            view2.setAlpha(1.0f);
            yw2VarM220549p.mo100897d(view2, i);
            pol0 pol0Var2 = new pol0();
            pol0Var2.f150534e = i;
            pol0Var2.f150530a = view2;
            pol0Var2.f150533d = yw2VarM220549p.mo100901h(i);
            pol0Var2.f150539j = VirtualState.INIT;
            pol0Var2.m170602c(yw2VarM220549p.mo100902i(i), yw2VarM220549p.mo100900g(i));
            pol0Var2.f150530a = view2;
            m220514O(view2, 0.0f, 0.0f, 0.0f, 0.0f, CardProgressAction.ANIM, false, "other");
            this.f205090a.add(pol0Var2);
            m220507B().addView(view2);
            m220507B().requestLayout();
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final void m211311C0(og4 og4Var) {
        int i;
        Iterator<pol0> it = this.f205090a.iterator();
        while (it.hasNext()) {
            it.next().f150534e += og4Var.f143805e;
        }
        m220533g0(og4Var.f143816p);
        if (this.f205090a.size() > 0) {
            List<pol0> list = this.f205090a;
            i = list.get(list.size() - 1).f150534e + 1;
        } else {
            i = -1;
        }
        if (!vwb.m200296J(this.f205090a)) {
            for (pol0 pol0Var : this.f205090a) {
                if (pol0Var.f150534e == 0) {
                    this.f205094e.mo100897d(pol0Var.f150530a, 0);
                    break;
                }
            }
        }
        if (i < 0 || i >= this.f205094e.mo100899f()) {
            return;
        }
        yw2 yw2VarM220549p = m220549p();
        int iMo100901h = yw2VarM220549p.mo100901h(i);
        LayoutInflater layoutInflaterM163037a = o7r.m163037a(m220553r());
        View viewM178472a = m220557x().m178472a(iMo100901h);
        if (viewM178472a == null) {
            viewM178472a = m220549p().mo100898e(iMo100901h, m220553r(), layoutInflaterM163037a);
        }
        viewM178472a.setTranslationY(0.0f);
        viewM178472a.setTranslationX(0.0f);
        viewM178472a.setRotation(0.0f);
        viewM178472a.setScaleX(1.0f);
        viewM178472a.setScaleY(1.0f);
        yw2VarM220549p.mo100897d(viewM178472a, i);
        pol0 pol0Var2 = new pol0();
        pol0Var2.f150534e = i;
        pol0Var2.f150530a = viewM178472a;
        pol0Var2.f150533d = yw2VarM220549p.mo100901h(i);
        pol0Var2.f150539j = VirtualState.INIT;
        pol0Var2.m170602c(yw2VarM220549p.mo100902i(i), yw2VarM220549p.mo100900g(i));
        pol0Var2.f150530a = viewM178472a;
        if (this.f205093d.mo122788h() && this.f205093d.mo122781a() < 1.0f) {
            viewM178472a.setAlpha(this.f205093d.mo122781a());
        }
        m220514O(pol0Var2.f150530a, 0.0f, 0.0f, 0.0f, 0.0f, CardProgressAction.ANIM_DONE, og4Var.f143817q, "outSuccess");
        this.f205090a.add(pol0Var2);
        m220507B().addView(viewM178472a);
        m220507B().requestLayout();
    }

    @Override // p149l.zw2
    /* JADX INFO: renamed from: J */
    public void mo211312J(og4 og4Var, long j) {
        float f;
        float f2 = 1.0f;
        float f3 = 0.0f;
        float fMax = Math.max(0.0f, Math.min(1.0f, og4Var.m164165f().getInterpolation((j - og4Var.f143803c) / og4Var.f143804d)));
        qo0 qo0Var = og4Var.f143806f;
        boolean z = false;
        for (pol0 pol0Var : this.f205090a) {
            if (og4Var.m164171l(pol0Var)) {
                pol0Var.m170606g(fMax, qo0Var);
                f = f2;
                z = true;
            } else if (z) {
                int iMo107794d = m220506A().mo107794d();
                float fMo107795e = m220506A().mo107795e();
                boolean zMo107796i = m220506A().mo107796i();
                float f4 = qo0Var.f155518a;
                float f5 = f4 + ((qo0Var.f155519b - f4) * fMax);
                float f6 = qo0Var.f155520c;
                float f7 = f6 + ((qo0Var.f155521d - f6) * fMax);
                float fMin = Math.min(f2, Math.max(((float) Math.sqrt((f7 * f7) + (f5 * f5))) / this.f205102m, f3));
                if (this.f205093d.mo122788h() && this.f205093d.mo122781a() < f2) {
                    if (pol0Var.f150534e == 1) {
                        pol0Var.f150530a.setAlpha(Math.min(f2, Math.max(this.f205093d.mo122781a(), (this.f205093d.mo122782b() * fMin) + this.f205093d.mo122781a())));
                    } else {
                        pol0Var.f150530a.setAlpha(f3);
                    }
                }
                float fMin2 = Math.min(pol0Var.f150534e - fMin, 2.0f);
                float f8 = f2 - (fMo107795e * fMin2);
                float f9 = f8 * f8 * f8;
                float fSqrt = (float) Math.sqrt(Math.sqrt(fMin2));
                f = f2;
                float fSqrt2 = (((float) (((double) (fSqrt * fSqrt * fSqrt)) * Math.sqrt(fSqrt))) * iMo107794d) + (zMo107796i ? (pol0Var.f150530a.getHeight() * (f - f9)) / 2.0f : 0.0f);
                pol0Var.f150530a.setScaleY(f9);
                pol0Var.f150530a.setScaleX(f9);
                pol0Var.f150530a.setTranslationY((m220506A().mo107798q() ? -1.0f : f) * fSqrt2);
            } else {
                f = f2;
            }
            f2 = f;
            f3 = 0.0f;
        }
    }

    @Override // p149l.zw2
    /* JADX INFO: renamed from: L */
    public void mo211313L(og4 og4Var, long j) {
        float interpolation = og4Var.m164165f().getInterpolation((j - og4Var.f143803c) / og4Var.f143804d);
        this.f205094e.mo184172k(og4Var.f143816p.f150530a);
        float fMax = Math.max(0.0f, interpolation);
        qo0 qo0Var = og4Var.f143806f;
        for (pol0 pol0Var : this.f205090a) {
            if (og4Var.m164171l(pol0Var)) {
                if (pol0Var.f150534e == 0) {
                    pol0Var.m170606g(fMax, qo0Var);
                    View view = pol0Var.f150530a;
                    m220514O(view, view.getTranslationX(), pol0Var.f150530a.getTranslationY(), 0.0f, 0.0f, CardProgressAction.BACK_ANIM, og4Var.f143817q, "animBack:");
                } else {
                    int iMo107794d = m220506A().mo107794d();
                    float fMo107795e = m220506A().mo107795e();
                    boolean zMo107796i = m220506A().mo107796i();
                    float f = qo0Var.f155518a;
                    float f2 = f + ((qo0Var.f155519b - f) * fMax);
                    float f3 = qo0Var.f155520c;
                    float f4 = f3 + ((qo0Var.f155521d - f3) * fMax);
                    float fMin = Math.min(1.0f, Math.max(((float) Math.sqrt((f4 * f4) + (f2 * f2))) / this.f205102m, 0.0f));
                    if (this.f205093d.mo122788h() && this.f205093d.mo122781a() < 1.0f) {
                        int i = pol0Var.f150534e;
                        if (i == 1) {
                            pol0Var.f150530a.setAlpha(Math.min(1.0f, Math.max(this.f205093d.mo122781a(), (this.f205093d.mo122782b() * fMin) + this.f205093d.mo122781a())));
                        } else if (i == 2) {
                            pol0Var.f150530a.setAlpha(Math.min(1.0f, Math.max(0.0f, this.f205093d.mo122781a() * fMin)));
                        } else {
                            pol0Var.f150530a.setAlpha(0.0f);
                        }
                    }
                    float fMin2 = Math.min(pol0Var.f150534e - fMin, 2.0f);
                    float f5 = 1.0f - (fMo107795e * fMin2);
                    float f6 = f5 * f5 * f5;
                    float fSqrt = (float) Math.sqrt(Math.sqrt(fMin2));
                    float fSqrt2 = (((float) (((double) (fSqrt * fSqrt * fSqrt)) * Math.sqrt(fSqrt))) * iMo107794d) + (zMo107796i ? (pol0Var.f150530a.getHeight() * (1.0f - f6)) / 2.0f : 0.0f);
                    pol0Var.f150530a.setScaleY(f6);
                    pol0Var.f150530a.setScaleX(f6);
                    pol0Var.f150530a.setTranslationY((m220506A().mo107798q() ? -1.0f : 1.0f) * fSqrt2);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x019a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.zw2
    /* JADX INFO: renamed from: M */
    public void mo211314M(og4 og4Var, long j) {
        float fMax;
        float f;
        float f2;
        float f3;
        int i;
        float f4;
        xw2 xw2Var = this;
        float f5 = 1.0f;
        float f6 = 0.0f;
        float fMax2 = Math.max(0.0f, Math.min(1.0f, og4Var.m164165f().getInterpolation((j - og4Var.f143803c) / og4Var.f143804d)));
        qo0 qo0Var = og4Var.f143806f;
        if (xw2Var.f205093d.mo122790j()) {
            long jMo122787g = xw2Var.f205093d.mo122787g();
            if (xw2Var.f205093d.mo122789i()) {
                jMo122787g = (long) (xw2Var.f205093d.mo122787g() * Math.abs(qo0Var.f155529l - qo0Var.f155528k));
            }
            if (jMo122787g <= 0) {
                jMo122787g = 1;
            }
            fMax = Math.max(0.0f, Math.min(1.0f, (j - og4Var.f143803c) / Math.min(og4Var.f143804d, jMo122787g)));
            if (og4Var.f143809i && og4Var.f143807g == CardSwipeOutState.INVALID) {
                long j2 = og4Var.f143803c;
                og4Var.f143803c = j2 + (j - j2);
                fMax2 = 0.0f;
                fMax = 0.0f;
            }
        } else {
            fMax = 1.0f;
        }
        float fM175716a = qo0Var.m175716a(fMax2);
        if (og4Var.f143807g != CardSwipeOutState.INVALID || (fM175716a <= xw2Var.f205104o && !og4Var.f143809i)) {
            f = fMax2;
            f2 = fMax;
        } else {
            CardSwipeOutState cardSwipeOutStateMo38823a = xw2Var.f205101l.mo38823a(og4Var.f143816p, og4Var.m164169j(), og4Var.f143809i);
            xw2Var.m220523Y("swipe anim out: " + og4Var.f143815o);
            if (BifrostLayout.f23321d) {
                cardSwipeOutStateMo38823a.name();
                og4Var.f143816p.m170604e(false);
            }
            int i2 = C21246a.f194687a[cardSwipeOutStateMo38823a.ordinal()];
            if (i2 == 1) {
                if (og4Var.f143809i) {
                    xw2Var.f205094e.mo184172k(og4Var.f143816p.f150530a);
                }
                og4Var.f143807g = cardSwipeOutStateMo38823a;
                og4Var.f143806f.m175720e(og4Var.f143816p.f150530a);
                qo0 qo0Var2 = og4Var.f143806f;
                qo0Var2.f155528k = fMax;
                qo0Var2.m175717b();
                long j3 = j - og4Var.f143803c;
                og4Var.f143803c = j;
                og4Var.f143804d = Math.max(200L, j3);
                og4Var.m164162c();
                og4Var.f143802b = CardAnimType.ANIM_BACK;
                og4Var.f143801a = zo0.f204051O;
                og4Var.f143816p.f150539j = VirtualState.RENDING;
                String str = BifrostLayout.f23320c;
                return;
            }
            if (i2 == 2) {
                og4Var.f143807g = cardSwipeOutStateMo38823a;
                og4Var.f143816p.f150539j = VirtualState.ANIM_OUT;
            } else if (i2 == 3) {
                og4Var.f143802b = CardAnimType.ANIM_INVALID;
                og4Var.f143816p.f150539j = VirtualState.RENDING;
            }
            xw2Var.m220522X("swipeCheckDone:" + cardSwipeOutStateMo38823a.name() + ", detail" + og4Var.f143816p.m170603d());
            if (og4Var.f143816p.f150530a instanceof qm4) {
                SwipeDirection swipeDirection = SwipeDirection.LEFT;
                int i3 = C21246a.f194688b[og4Var.m164169j().ordinal()];
                if (i3 == 1) {
                    swipeDirection = SwipeDirection.UP;
                } else if (i3 != 2 && i3 == 3) {
                    swipeDirection = SwipeDirection.RIGHT;
                }
                ((qm4) og4Var.f143816p.f150530a).mo37982x(swipeDirection, cardSwipeOutStateMo38823a, og4Var.f143809i);
                View view = og4Var.f143816p.f150530a;
                ((qm4) view).mo37961D0(view, SwipeState.START_FLING_OUT, og4Var.f143809i);
            }
            if (xw2Var.f205093d.mo122790j() && og4Var.f143809i) {
                long j4 = og4Var.f143803c;
                og4Var.f143803c = j4 + (j - j4);
                f = 0.0f;
                f2 = 0.0f;
            } else {
                f = fMax2;
                f2 = fMax;
            }
        }
        int i4 = 1;
        for (pol0 pol0Var : xw2Var.f205090a) {
            if (!og4Var.m164171l(pol0Var)) {
                f3 = f;
                i = i4;
            } else if (og4Var.m164172m(pol0Var.f150540k)) {
                pol0Var.f150530a.hashCode();
                pol0Var.m170606g(f, qo0Var);
                boolean z = og4Var.f143810j;
                float f7 = f;
                View view2 = pol0Var.f150530a;
                if (z) {
                    i = i4;
                    f3 = f7;
                    float translationX = view2.getTranslationX();
                    float translationY = pol0Var.f150530a.getTranslationY();
                    CardProgressAction cardProgressAction = CardProgressAction.ANIM;
                    m220539k(translationX, translationY, 0.0f, 0.0f, cardProgressAction, og4Var.f143817q, og4Var.f143805e, " by anim finish");
                    View view3 = pol0Var.f150530a;
                    xw2Var = this;
                    xw2Var.m220541l(view3, view3.getTranslationX(), pol0Var.f150530a.getTranslationY(), 0.0f, 0.0f, cardProgressAction, og4Var.f143817q);
                } else {
                    f3 = f7;
                    i = i4;
                    xw2Var.m220514O(view2, view2.getTranslationX(), pol0Var.f150530a.getTranslationY(), 0.0f, 0.0f, CardProgressAction.ANIM, og4Var.f143817q, og4Var.f143809i ? "auto out: auto" : "animOut: no auto");
                    xw2Var = this;
                }
            } else {
                f3 = f;
                i = i4;
                if (pol0Var.f150534e < 0) {
                    i4 = i;
                    f = f3;
                } else {
                    if (!og4Var.f143811k) {
                        int iMo107794d = xw2Var.m220506A().mo107794d();
                        float fMo107795e = xw2Var.m220506A().mo107795e();
                        boolean zMo107796i = xw2Var.m220506A().mo107796i();
                        float f8 = qo0Var.f155518a;
                        float f9 = f8 + ((qo0Var.f155519b - f8) * f3);
                        float f10 = qo0Var.f155520c;
                        float f11 = f10 + ((qo0Var.f155521d - f10) * f3);
                        float fSqrt = ((float) Math.sqrt((f11 * f11) + (f9 * f9))) / xw2Var.f205102m;
                        if (xw2Var.f205093d.mo122790j()) {
                            float f12 = qo0Var.f155528k;
                            fSqrt = f12 + ((qo0Var.f155529l - f12) * f2);
                        }
                        float fMin = Math.min(f5, Math.max(fSqrt, f6));
                        if (xw2Var.f205093d.mo122788h() && xw2Var.f205093d.mo122781a() < f5) {
                            if (i == 1) {
                                pol0Var.f150530a.setAlpha(Math.min(f5, Math.max(f6, (xw2Var.f205093d.mo122782b() * fMin) + xw2Var.f205093d.mo122781a())));
                            } else if (i == 2) {
                                pol0Var.f150530a.setAlpha(Math.min(f5, Math.max(f6, xw2Var.f205093d.mo122781a() * fMin)));
                            } else {
                                pol0Var.f150530a.setAlpha(f6);
                            }
                        }
                        float fMin2 = Math.min(i - fMin, 2.0f);
                        int i5 = i + 1;
                        float f13 = f5 - (fMo107795e * fMin2);
                        float f14 = f13 * f13 * f13;
                        float fSqrt2 = (float) Math.sqrt(Math.sqrt(fMin2));
                        f4 = f5;
                        float fSqrt3 = (((float) (((double) (fSqrt2 * fSqrt2 * fSqrt2)) * Math.sqrt(fSqrt2))) * iMo107794d) + (zMo107796i ? (pol0Var.f150530a.getHeight() * (f4 - f14)) / 2.0f : 0.0f);
                        if (Float.isNaN(f14)) {
                            String str2 = BifrostLayout.f23320c;
                        }
                        pol0Var.f150530a.setScaleY(f14);
                        pol0Var.f150530a.setScaleX(f14);
                        if (BifrostLayout.f23321d) {
                            pol0Var.f150530a.hashCode();
                        }
                        pol0Var.f150530a.setTranslationY((xw2Var.m220506A().mo107798q() ? -1.0f : f4) * fSqrt3);
                        if (f14 > f4) {
                            String str3 = BifrostLayout.f23320c;
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
        CardSwipeOutState cardSwipeOutState = og4Var.f143807g;
        CardSwipeOutState cardSwipeOutState2 = CardSwipeOutState.PASS;
        if (cardSwipeOutState == cardSwipeOutState2 && !og4Var.f143810j) {
            og4Var.f143810j = true;
            xw2Var.m220523Y("anim success begin :" + og4Var.f143815o);
            m211311C0(og4Var);
            xw2Var.m220523Y("anim success end :" + og4Var.f143815o);
            qm4 qm4Var = xw2Var.f205106q;
            if (qm4Var != null) {
                CardProgressAction cardProgressAction2 = CardProgressAction.ANIM_DONE;
                qm4Var.mo36365d0(0.0f, 0.0f, 0.0f, cardProgressAction2);
                xw2Var.f205106q.mo38821v0(0.0f, 0.0f, cardProgressAction2);
            }
        }
        if (og4Var.f143807g != cardSwipeOutState2 || og4Var.f143811k) {
            return;
        }
        if ((xw2Var.f205093d.mo122790j() || fM175716a < xw2Var.f205102m) && (!xw2Var.f205093d.mo122790j() || f2 < f15)) {
            return;
        }
        og4Var.f143811k = true;
    }

    @Override // p149l.bx2, p149l.jl4
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ void mo104259a() {
        super.mo104259a();
    }

    @Override // p149l.bx2, p149l.jl4
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ String mo104260b() {
        return super.mo104260b();
    }

    @Override // p149l.bx2
    /* JADX INFO: renamed from: u0 */
    public /* bridge */ /* synthetic */ C22306c mo104263u0() {
        return super.mo104263u0();
    }

    @Override // p149l.bx2
    /* JADX INFO: renamed from: z0 */
    public /* bridge */ /* synthetic */ void mo104268z0() {
        super.mo104268z0();
    }
}
