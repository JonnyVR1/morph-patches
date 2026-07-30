package com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8020c;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomMomentLayout;
import com.p051p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p153l.adc0;
import p153l.bnl0;
import p153l.d79;
import p153l.em2;
import p153l.gp5;
import p153l.gra;
import p153l.gt0;
import p153l.luh;
import p153l.mql;
import p153l.o1j0;
import p153l.pql;
import p153l.qa00;
import p153l.qk4;
import p153l.t7m;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.c */
/* JADX INFO: loaded from: classes11.dex */
public class C8020c implements mql<t7m> {

    /* JADX INFO: renamed from: a */
    public t7m f22756a;

    /* JADX INFO: renamed from: b */
    public User f22757b;

    /* JADX INFO: renamed from: c */
    public CoreSuggested.UserInfo f22758c;

    /* JADX INFO: renamed from: d */
    public boolean f22759d;

    /* JADX INFO: renamed from: e */
    public CoreMomentInfo f22760e;

    /* JADX INFO: renamed from: f */
    public Context f22761f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f22762g;

    /* JADX INFO: renamed from: h */
    public boolean f22763h;

    /* JADX INFO: renamed from: j */
    public C8021d f22765j;

    /* JADX INFO: renamed from: l */
    public qk4 f22767l = null;

    /* JADX INFO: renamed from: m */
    public int f22768m = 0;

    /* JADX INFO: renamed from: n */
    public int f22769n = -1;

    /* JADX INFO: renamed from: i */
    public List<CardBottomFrame> f22764i = new ArrayList();

    /* JADX INFO: renamed from: k */
    public SparseArray<qk4> f22766k = new SparseArray<>();

    public C8020c(boolean z, Context context, FrameLayout frameLayout) {
        this.f22763h = z;
        this.f22762g = frameLayout;
        this.f22761f = context;
    }

    /* JADX INFO: renamed from: E */
    private void m38455E(qk4 qk4Var) {
        if (CoreModule.m30932N().mo61495Rc() && NullChecker.m82486a(this.f22767l)) {
            CardBottomFrame cardBottomFrame = this.f22767l.f158092a;
            CardBottomFrame cardBottomFrame2 = qk4Var.f158092a;
            if (cardBottomFrame == cardBottomFrame2 || cardBottomFrame2 != CardBottomFrame.MOMENT) {
                return;
            }
            View view = qk4Var.f158093b;
            if (view instanceof CardBottomMomentLayout) {
                CardBottomMomentLayout cardBottomMomentLayout = (CardBottomMomentLayout) view;
                if (NullChecker.m82486a(cardBottomMomentLayout) && bnl0.m105529O0(cardBottomMomentLayout.f24308l)) {
                    luh.m155941m(luh.m155932d(), luh.m155931c(), "p_edit_profile_view");
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m38457l(View view, View view2) {
        view.setVisibility(4);
        view2.setVisibility(0);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m38458m(View view, qk4 qk4Var) {
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
        qk4Var.f158093b.setVisibility(8);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m38459n(View view, View view2, View view3) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view2.setScaleX(1.0f);
        view2.setScaleY(1.0f);
        view.setVisibility(0);
        view3.setVisibility(0);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m38460o() {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m38462q(View view, qk4 qk4Var) {
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
        qk4Var.f158093b.setVisibility(0);
    }

    /* JADX INFO: renamed from: w */
    private void m38466w(final qk4 qk4Var, final qk4 qk4Var2, final boolean z) {
        qk4Var.f158093b.post(new Runnable() { // from class: l.nj4
            @Override // java.lang.Runnable
            public final void run() {
                this.f142264a.m38471D(qk4Var, qk4Var2, z);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    private void m38467x(final qk4 qk4Var, final qk4 qk4Var2, boolean z) {
        float f = z ? -1.0f : 1.0f;
        final View viewFindViewById = qk4Var2.f158093b.findViewById(adc0.f70094R0);
        final View viewFindViewById2 = qk4Var.f158093b.findViewById(adc0.f70094R0);
        final View viewFindViewById3 = qk4Var2.f158093b.findViewById(adc0.f70469n6);
        final View viewFindViewById4 = qk4Var.f158093b.findViewById(adc0.f70469n6);
        viewFindViewById3.setAlpha(1.0f);
        ViewPropertyAnimator viewPropertyAnimatorWithStartAction = viewFindViewById3.animate().withStartAction(new Runnable() { // from class: l.oj4
            @Override // java.lang.Runnable
            public final void run() {
                C8020c.m38460o();
            }
        });
        int i = qa00.f156298K;
        viewPropertyAnimatorWithStartAction.translationX(f * 1.0f * i).alpha(0.0f).setDuration(100L).withEndAction(new Runnable() { // from class: l.pj4
            @Override // java.lang.Runnable
            public final void run() {
                C8020c.m38458m(viewFindViewById3, qk4Var2);
            }
        }).start();
        viewFindViewById4.setTranslationX(f * (-1.0f) * i);
        viewFindViewById4.setAlpha(0.0f);
        viewFindViewById4.animate().withStartAction(new Runnable() { // from class: l.qj4
            @Override // java.lang.Runnable
            public final void run() {
                qk4Var.f158093b.setVisibility(0);
            }
        }).translationX(0.0f).alpha(1.0f).setDuration(100L).withEndAction(new Runnable() { // from class: l.rj4
            @Override // java.lang.Runnable
            public final void run() {
                C8020c.m38462q(viewFindViewById4, qk4Var);
            }
        }).start();
        bnl0.m105521K0(viewFindViewById2, bnl0.m105560i0(viewFindViewById), bnl0.m105560i0(viewFindViewById2));
        viewFindViewById.animate().cancel();
        viewFindViewById2.animate().withStartAction(new Runnable() { // from class: l.sj4
            @Override // java.lang.Runnable
            public final void run() {
                C8020c.m38457l(viewFindViewById, viewFindViewById2);
            }
        }).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(100L).withEndAction(new Runnable() { // from class: l.tj4
            @Override // java.lang.Runnable
            public final void run() {
                C8020c.m38459n(viewFindViewById2, viewFindViewById4, viewFindViewById);
            }
        }).start();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m38468A(View view, ValueAnimator valueAnimator) {
        bnl0.m105537U(view, ((Integer) valueAnimator.getAnimatedValue()).intValue());
        bnl0.m105564k0(this.f22765j.mo38481f().mo37828J());
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m38469B(View view, int i) {
        bnl0.m105537U(view, i);
        bnl0.m105564k0(this.f22765j.mo38481f().mo37828J());
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m38470C(View view, int i) {
        bnl0.m105537U(view, i);
        bnl0.m105564k0(this.f22765j.mo38481f().mo37828J());
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m38471D(qk4 qk4Var, qk4 qk4Var2, boolean z) {
        qk4Var.f158093b.setVisibility(0);
        m38467x(qk4Var, qk4Var2, z);
    }

    @Override // p153l.mql
    /* JADX INFO: renamed from: a */
    public void mo38435a(int i, boolean z) {
        qk4 qk4Var;
        int iMin = Math.min(Math.max(0, i), this.f22764i.size() - 1);
        if ((this.f22765j.m38485j() || this.f22765j.mo38480e()) && iMin > 0) {
            iMin = 0;
        }
        int i2 = (this.f22765j.m38484i() || this.f22765j.m38479d()) ? 0 : iMin;
        CardBottomFrame cardBottomFrame = this.f22764i.get(i2);
        if (NullChecker.m82486a(this.f22767l)) {
            qk4 qk4Var2 = this.f22767l;
            if (qk4Var2.f158092a == cardBottomFrame) {
                if (!TextUtils.equals(qk4Var2.m176922d(), this.f22765j.m38477b())) {
                    if (C8018a.f22733g) {
                        String str = cardBottomFrame.explain;
                        String str2 = this.f22765j.getUser().name;
                        o1j0.m165636j("缓存不一致了");
                    }
                    this.f22767l.m176923e(this.f22765j, this.f22761f, this.f22762g, i2);
                }
                if (C8018a.f22733g) {
                    String str3 = cardBottomFrame.explain;
                    String str4 = this.f22765j.getUser().name;
                    return;
                }
                return;
            }
        }
        qk4 qk4VarM38419g = this.f22766k.get(cardBottomFrame.getFrameId());
        if (C8018a.f22733g) {
            String str5 = this.f22765j.getUser().name;
        }
        if (qk4VarM38419g == null) {
            qk4VarM38419g = C8018a.m38417i().m38419g(this.f22765j, i2, cardBottomFrame, this.f22761f, this.f22762g);
            this.f22766k.put(cardBottomFrame.getFrameId(), qk4VarM38419g);
        } else if (!TextUtils.equals(qk4VarM38419g.m176922d(), this.f22765j.m38477b())) {
            if (C8018a.f22733g) {
                String str6 = this.f22765j.getUser().name;
                o1j0.m165636j("缓存不一致了*");
            }
            qk4VarM38419g.m176923e(this.f22765j, this.f22761f, this.f22762g, i2);
        }
        NullChecker.m82486a(this.f22767l);
        qk4 qk4Var3 = this.f22767l;
        if (qk4Var3 != null && z) {
            qk4VarM38419g.f158093b.setVisibility(4);
            m38466w(qk4VarM38419g, this.f22767l, i2 > this.f22768m);
        } else if (qk4Var3 != null) {
            bnl0.m105524M(qk4Var3.f158093b, false);
            bnl0.m105524M(qk4VarM38419g.f158093b, true);
        } else {
            qk4VarM38419g.f158093b.setVisibility(0);
        }
        if (NullChecker.m82486a(this.f22767l) && (qk4Var = this.f22767l) != qk4VarM38419g && qk4Var.f158092a == CardBottomFrame.INTL_COMPLIMENT_RECEIVED) {
            gp5.m131230d("swipe");
        }
        if (NullChecker.m82486a(qk4VarM38419g) && this.f22759d) {
            m38455E(qk4VarM38419g);
            if (!this.f22763h) {
                qk4VarM38419g.f158094c.mo96367j(this.f22765j, qk4VarM38419g, i2);
            }
        }
        this.f22767l = qk4VarM38419g;
        this.f22768m = i2;
        if (!this.f22765j.getUser().isMe() && !d79.m114691m0()) {
            m38473v(z);
        }
        bnl0.m105564k0(this.f22765j.mo38481f().mo37828J());
        if (i2 == 0) {
            this.f22769n = qk4VarM38419g.f158093b.getMeasuredHeight();
        }
    }

    @Override // p153l.mql
    /* JADX INFO: renamed from: b */
    public void mo38436b() {
        if (C8018a.f22733g) {
            this.f22766k.size();
        }
        int size = this.f22766k.size();
        int i = 0;
        while (true) {
            SparseArray<qk4> sparseArray = this.f22766k;
            if (i >= size) {
                sparseArray.clear();
                this.f22767l = null;
                boolean z = C8018a.f22733g;
                return;
            } else {
                qk4 qk4Var = sparseArray.get(sparseArray.keyAt(i));
                if (NullChecker.m82486a(qk4Var)) {
                    C8018a.m38417i().m38418f(this.f22761f, qk4Var);
                    this.f22762g.removeView(qk4Var.f158093b);
                    if (C8018a.f22733g) {
                        String str = qk4Var.f158092a.explain;
                    }
                }
                i++;
            }
        }
    }

    @Override // p153l.mql
    /* JADX INFO: renamed from: c */
    public void mo38437c(User user) {
    }

    @Override // p153l.mql
    /* JADX INFO: renamed from: d */
    public void mo38438d(Act act, User user) {
        qk4 qk4Var = this.f22767l;
        if (qk4Var != null) {
            KeyEvent.Callback callback = qk4Var.f158093b;
            if (callback instanceof pql) {
                CardUserContentView userContentLayout = ((pql) callback).getUserContentLayout();
                if (NullChecker.m82486a(userContentLayout)) {
                    userContentLayout.m40130a0(act, user);
                }
            }
        }
    }

    @Override // p153l.mql
    /* JADX INFO: renamed from: f */
    public View mo38440f() {
        qk4 qk4Var = this.f22767l;
        return qk4Var != null ? qk4Var.f158093b : this.f22756a.mo37908l();
    }

    @Override // p153l.mql
    /* JADX INFO: renamed from: g */
    public String mo38441g() {
        C8021d c8021d;
        if (!gra.m131692h3() || this.f22767l.f158092a != CardBottomFrame.TAG || (c8021d = this.f22765j) == null) {
            return "";
        }
        String[] strArr = {"sports", "places", "movies", "literature", "music", "food"};
        Map<String, String> map = c8021d.f22779j.f22786e;
        if (map == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            String str = map.get(strArr[i]);
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
                sb.append("、");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    @Override // p153l.mql
    /* JADX INFO: renamed from: i */
    public boolean mo38443i() {
        qk4 qk4Var = this.f22767l;
        if (qk4Var != null) {
            KeyEvent.Callback callback = qk4Var.f158093b;
            if (callback instanceof pql) {
                CardUserContentView userContentLayout = ((pql) callback).getUserContentLayout();
                if (NullChecker.m82486a(userContentLayout) && NullChecker.m82486a(userContentLayout.f24523g) && userContentLayout.f24523g.getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p153l.mql
    /* JADX INFO: renamed from: j */
    public void mo38444j(int i) {
        mo38435a(i, true);
    }

    @Deprecated
    /* JADX INFO: renamed from: v */
    public final void m38473v(boolean z) {
        int i;
        if (this.f22765j.mo38481f() == null) {
            return;
        }
        mo38440f();
        if (this.f22767l == null) {
            return;
        }
        final View viewMo37860V = this.f22765j.mo38481f().mo37860V();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewMo37860V.getLayoutParams();
        final int iM38474y = m38474y(this.f22767l.f158092a);
        if (!NullChecker.m82486a(marginLayoutParams) || (i = marginLayoutParams.bottomMargin) == iM38474y) {
            return;
        }
        if (!z) {
            bnl0.m105537U(viewMo37860V, iM38474y);
            bnl0.m105564k0(this.f22765j.mo38481f().mo37828J());
        } else {
            ValueAnimator duration = ValueAnimator.ofInt(i, iM38474y).setDuration(100L);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.kj4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f127070a.m38468A(viewMo37860V, valueAnimator);
                }
            });
            gt0.m132156b(viewMo37860V, gt0.m132161g(duration, new Runnable() { // from class: l.lj4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f132295a.m38469B(viewMo37860V, iM38474y);
                }
            }, new Runnable() { // from class: l.mj4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f137053a.m38470C(viewMo37860V, iM38474y);
                }
            })).start();
        }
    }

    /* JADX INFO: renamed from: y */
    public final int m38474y(CardBottomFrame cardBottomFrame) {
        int iM38476a = this.f22765j.m38476a(cardBottomFrame);
        return iM38476a > 0 ? iM38476a : qa00.m175859d(100.0f);
    }

    @Override // p153l.mql
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo38439e(t7m t7mVar, User user, CoreSuggested.UserInfo userInfo, boolean z, CoreMomentInfo coreMomentInfo) {
        this.f22756a = t7mVar;
        this.f22757b = user;
        this.f22758c = userInfo;
        this.f22759d = z;
        this.f22760e = coreMomentInfo;
        List<CardBottomFrame> listM38420h = C8018a.m38417i().m38420h();
        C8021d c8021d = new C8021d();
        this.f22765j = c8021d;
        c8021d.m38490o(t7mVar.mo37882d());
        this.f22765j.m38492q(this.f22763h);
        this.f22765j.m38495t(user);
        this.f22765j.m38493r(t7mVar.mo182641g());
        this.f22765j.m38491p(coreMomentInfo);
        this.f22765j.m38496u(userInfo);
        this.f22765j.m38494s(z);
        this.f22765j.m38488m(t7mVar);
        this.f22764i.clear();
        int i = 0;
        for (CardBottomFrame cardBottomFrame : listM38420h) {
            em2 em2VarM38423l = C8018a.m38417i().m38423l(cardBottomFrame);
            if (em2VarM38423l.mo96364a(this.f22765j, i, cardBottomFrame, this.f22761f)) {
                if (this.f22765j.f22779j.f22782a == null && em2VarM38423l.mo96366i()) {
                    this.f22765j.f22779j.f22782a = cardBottomFrame;
                }
                i++;
                this.f22764i.add(cardBottomFrame);
            }
        }
    }

    @Override // p153l.mql
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo38442h(t7m t7mVar) {
    }
}
