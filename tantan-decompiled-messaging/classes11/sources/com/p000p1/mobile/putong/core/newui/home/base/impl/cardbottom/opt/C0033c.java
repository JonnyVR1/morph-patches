package com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0033c;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomMomentLayout;
import com.p000p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l.bt0;
import l.co5;
import l.lsi0;
import l.t100;
import l.u4c0;
import l.u59;
import l.upa;
import l.xdl0;
import p009l.bol;
import p009l.d5m;
import p009l.eol;
import p009l.rj4;
import p009l.wl2;
import p009l.wsh;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0033c implements bol<d5m> {

    /* JADX INFO: renamed from: a */
    public d5m f792a;

    /* JADX INFO: renamed from: b */
    public User f793b;

    /* JADX INFO: renamed from: c */
    public CoreSuggested.UserInfo f794c;

    /* JADX INFO: renamed from: d */
    public boolean f795d;

    /* JADX INFO: renamed from: e */
    public CoreMomentInfo f796e;

    /* JADX INFO: renamed from: f */
    public Context f797f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f798g;

    /* JADX INFO: renamed from: h */
    public boolean f799h;

    /* JADX INFO: renamed from: j */
    public C0034d f801j;

    /* JADX INFO: renamed from: l */
    public rj4 f803l = null;

    /* JADX INFO: renamed from: m */
    public int f804m = 0;

    /* JADX INFO: renamed from: n */
    public int f805n = -1;

    /* JADX INFO: renamed from: i */
    public List<CardBottomFrame> f800i = new ArrayList();

    /* JADX INFO: renamed from: k */
    public SparseArray<rj4> f802k = new SparseArray<>();

    public C0033c(boolean z, Context context, FrameLayout frameLayout) {
        this.f799h = z;
        this.f798g = frameLayout;
        this.f797f = context;
    }

    /* JADX INFO: renamed from: E */
    private void m1423E(rj4 rj4Var) {
        if (CoreModule.N().Rc() && NullChecker.a(this.f803l)) {
            CardBottomFrame cardBottomFrame = this.f803l.f19858a;
            CardBottomFrame cardBottomFrame2 = rj4Var.f19858a;
            if (cardBottomFrame == cardBottomFrame2 || cardBottomFrame2 != CardBottomFrame.MOMENT) {
                return;
            }
            Object obj = rj4Var.f19859b;
            if (obj instanceof CardBottomMomentLayout) {
                CardBottomMomentLayout cardBottomMomentLayout = (CardBottomMomentLayout) obj;
                if (NullChecker.a(cardBottomMomentLayout) && xdl0.O0(cardBottomMomentLayout.f2344l)) {
                    wsh.m24541m(wsh.m24532d(), wsh.m24531c(), "p_edit_profile_view");
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m1425l(View view, View view2) {
        view.setVisibility(4);
        view2.setVisibility(0);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m1426m(View view, rj4 rj4Var) {
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
        rj4Var.f19859b.setVisibility(8);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m1427n(View view, View view2, View view3) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view2.setScaleX(1.0f);
        view2.setScaleY(1.0f);
        view.setVisibility(0);
        view3.setVisibility(0);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m1428o() {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m1430q(View view, rj4 rj4Var) {
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
        rj4Var.f19859b.setVisibility(0);
    }

    /* JADX INFO: renamed from: w */
    private void m1434w(final rj4 rj4Var, final rj4 rj4Var2, final boolean z) {
        rj4Var.f19859b.post(new Runnable() { // from class: l.oi4
            @Override // java.lang.Runnable
            public final void run() {
                this.f18061a.m1439D(rj4Var, rj4Var2, z);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    private void m1435x(final rj4 rj4Var, final rj4 rj4Var2, boolean z) {
        float f = z ? -1.0f : 1.0f;
        final View viewFindViewById = rj4Var2.f19859b.findViewById(u4c0.R0);
        final View viewFindViewById2 = rj4Var.f19859b.findViewById(u4c0.R0);
        final View viewFindViewById3 = rj4Var2.f19859b.findViewById(u4c0.l6);
        final View viewFindViewById4 = rj4Var.f19859b.findViewById(u4c0.l6);
        viewFindViewById3.setAlpha(1.0f);
        ViewPropertyAnimator viewPropertyAnimatorWithStartAction = viewFindViewById3.animate().withStartAction(new Runnable() { // from class: l.pi4
            @Override // java.lang.Runnable
            public final void run() {
                C0033c.m1428o();
            }
        });
        int i = t100.K;
        viewPropertyAnimatorWithStartAction.translationX(f * 1.0f * i).alpha(0.0f).setDuration(100L).withEndAction(new Runnable() { // from class: l.qi4
            @Override // java.lang.Runnable
            public final void run() {
                C0033c.m1426m(viewFindViewById3, rj4Var2);
            }
        }).start();
        viewFindViewById4.setTranslationX(f * (-1.0f) * i);
        viewFindViewById4.setAlpha(0.0f);
        viewFindViewById4.animate().withStartAction(new Runnable() { // from class: l.ri4
            @Override // java.lang.Runnable
            public final void run() {
                rj4Var.f19859b.setVisibility(0);
            }
        }).translationX(0.0f).alpha(1.0f).setDuration(100L).withEndAction(new Runnable() { // from class: l.si4
            @Override // java.lang.Runnable
            public final void run() {
                C0033c.m1430q(viewFindViewById4, rj4Var);
            }
        }).start();
        xdl0.K0(viewFindViewById2, xdl0.i0(viewFindViewById), xdl0.i0(viewFindViewById2));
        viewFindViewById.animate().cancel();
        viewFindViewById2.animate().withStartAction(new Runnable() { // from class: l.ti4
            @Override // java.lang.Runnable
            public final void run() {
                C0033c.m1425l(viewFindViewById, viewFindViewById2);
            }
        }).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(100L).withEndAction(new Runnable() { // from class: l.ui4
            @Override // java.lang.Runnable
            public final void run() {
                C0033c.m1427n(viewFindViewById2, viewFindViewById4, viewFindViewById);
            }
        }).start();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m1436A(View view, ValueAnimator valueAnimator) {
        xdl0.U(view, ((Integer) valueAnimator.getAnimatedValue()).intValue());
        xdl0.k0(this.f801j.mo1449f().mo781J());
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m1437B(View view, int i) {
        xdl0.U(view, i);
        xdl0.k0(this.f801j.mo1449f().mo781J());
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m1438C(View view, int i) {
        xdl0.U(view, i);
        xdl0.k0(this.f801j.mo1449f().mo781J());
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m1439D(rj4 rj4Var, rj4 rj4Var2, boolean z) {
        rj4Var.f19859b.setVisibility(0);
        m1435x(rj4Var, rj4Var2, z);
    }

    @Override // p009l.bol
    /* JADX INFO: renamed from: a */
    public void mo1403a(int i, boolean z) {
        rj4 rj4Var;
        int iMin = Math.min(Math.max(0, i), this.f800i.size() - 1);
        if ((this.f801j.m1453j() || this.f801j.mo1448e()) && iMin > 0) {
            iMin = 0;
        }
        int i2 = (this.f801j.m1452i() || this.f801j.m1447d()) ? 0 : iMin;
        CardBottomFrame cardBottomFrame = this.f800i.get(i2);
        if (NullChecker.a(this.f803l)) {
            rj4 rj4Var2 = this.f803l;
            if (rj4Var2.f19858a == cardBottomFrame) {
                if (!TextUtils.equals(rj4Var2.m21681d(), this.f801j.m1445b())) {
                    if (C0031a.f769g) {
                        String str = cardBottomFrame.explain;
                        String str2 = this.f801j.getUser().name;
                        lsi0.j("缓存不一致了");
                    }
                    this.f803l.m21682e(this.f801j, this.f797f, this.f798g, i2);
                }
                if (C0031a.f769g) {
                    String str3 = cardBottomFrame.explain;
                    String str4 = this.f801j.getUser().name;
                    return;
                }
                return;
            }
        }
        rj4 rj4VarM1387g = this.f802k.get(cardBottomFrame.getFrameId());
        if (C0031a.f769g) {
            String str5 = this.f801j.getUser().name;
        }
        if (rj4VarM1387g == null) {
            rj4VarM1387g = C0031a.m1385i().m1387g(this.f801j, i2, cardBottomFrame, this.f797f, this.f798g);
            this.f802k.put(cardBottomFrame.getFrameId(), rj4VarM1387g);
        } else if (!TextUtils.equals(rj4VarM1387g.m21681d(), this.f801j.m1445b())) {
            if (C0031a.f769g) {
                String str6 = this.f801j.getUser().name;
                lsi0.j("缓存不一致了*");
            }
            rj4VarM1387g.m21682e(this.f801j, this.f797f, this.f798g, i2);
        }
        NullChecker.a(this.f803l);
        rj4 rj4Var3 = this.f803l;
        if (rj4Var3 != null && z) {
            rj4VarM1387g.f19859b.setVisibility(4);
            m1434w(rj4VarM1387g, this.f803l, i2 > this.f804m);
        } else if (rj4Var3 != null) {
            xdl0.M(rj4Var3.f19859b, false);
            xdl0.M(rj4VarM1387g.f19859b, true);
        } else {
            rj4VarM1387g.f19859b.setVisibility(0);
        }
        if (NullChecker.a(this.f803l) && (rj4Var = this.f803l) != rj4VarM1387g && rj4Var.f19858a == CardBottomFrame.INTL_COMPLIMENT_RECEIVED) {
            co5.d("swipe");
        }
        if (NullChecker.a(rj4VarM1387g) && this.f795d) {
            m1423E(rj4VarM1387g);
            if (!this.f799h) {
                rj4VarM1387g.f19860c.mo13735j(this.f801j, rj4VarM1387g, i2);
            }
        }
        this.f803l = rj4VarM1387g;
        this.f804m = i2;
        if (!this.f801j.getUser().isMe() && !u59.i0()) {
            m1441v(z);
        }
        xdl0.k0(this.f801j.mo1449f().mo781J());
        if (i2 == 0) {
            this.f805n = rj4VarM1387g.f19859b.getMeasuredHeight();
        }
    }

    @Override // p009l.bol
    /* JADX INFO: renamed from: b */
    public void mo1404b() {
        if (C0031a.f769g) {
            this.f802k.size();
        }
        int size = this.f802k.size();
        int i = 0;
        while (true) {
            SparseArray<rj4> sparseArray = this.f802k;
            if (i >= size) {
                sparseArray.clear();
                this.f803l = null;
                boolean z = C0031a.f769g;
                return;
            } else {
                rj4 rj4Var = sparseArray.get(sparseArray.keyAt(i));
                if (NullChecker.a(rj4Var)) {
                    C0031a.m1385i().m1386f(this.f797f, rj4Var);
                    this.f798g.removeView(rj4Var.f19859b);
                    if (C0031a.f769g) {
                        String str = rj4Var.f19858a.explain;
                    }
                }
                i++;
            }
        }
    }

    @Override // p009l.bol
    /* JADX INFO: renamed from: c */
    public void mo1405c(User user) {
    }

    @Override // p009l.bol
    /* JADX INFO: renamed from: d */
    public void mo1406d(Act act, User user) {
        rj4 rj4Var = this.f803l;
        if (rj4Var != null) {
            KeyEvent.Callback callback = rj4Var.f19859b;
            if (callback instanceof eol) {
                CardUserContentView userContentLayout = ((eol) callback).getUserContentLayout();
                if (NullChecker.a(userContentLayout)) {
                    userContentLayout.m3142a0(act, user);
                }
            }
        }
    }

    @Override // p009l.bol
    /* JADX INFO: renamed from: f */
    public View mo1408f() {
        rj4 rj4Var = this.f803l;
        return rj4Var != null ? rj4Var.f19859b : this.f792a.mo869l();
    }

    @Override // p009l.bol
    /* JADX INFO: renamed from: g */
    public String mo1409g() {
        C0034d c0034d;
        if (!upa.h3() || this.f803l.f19858a != CardBottomFrame.TAG || (c0034d = this.f801j) == null) {
            return "";
        }
        String[] strArr = {"sports", "places", "movies", "literature", "music", "food"};
        Map<String, String> map = c0034d.f815j.f822e;
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

    @Override // p009l.bol
    /* JADX INFO: renamed from: i */
    public boolean mo1411i() {
        rj4 rj4Var = this.f803l;
        if (rj4Var != null) {
            KeyEvent.Callback callback = rj4Var.f19859b;
            if (callback instanceof eol) {
                CardUserContentView userContentLayout = ((eol) callback).getUserContentLayout();
                if (NullChecker.a(userContentLayout) && NullChecker.a(userContentLayout.f2559g) && userContentLayout.f2559g.getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p009l.bol
    /* JADX INFO: renamed from: j */
    public void mo1412j(int i) {
        mo1403a(i, true);
    }

    @Deprecated
    /* JADX INFO: renamed from: v */
    public final void m1441v(boolean z) {
        int i;
        if (this.f801j.mo1449f() == null) {
            return;
        }
        mo1408f();
        if (this.f803l == null) {
            return;
        }
        final View viewMo815V = this.f801j.mo1449f().mo815V();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewMo815V.getLayoutParams();
        final int iM1442y = m1442y(this.f803l.f19858a);
        if (!NullChecker.a(marginLayoutParams) || (i = marginLayoutParams.bottomMargin) == iM1442y) {
            return;
        }
        if (!z) {
            xdl0.U(viewMo815V, iM1442y);
            xdl0.k0(this.f801j.mo1449f().mo781J());
        } else {
            ValueAnimator duration = ValueAnimator.ofInt(i, iM1442y).setDuration(100L);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.li4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f16172a.m1436A(viewMo815V, valueAnimator);
                }
            });
            bt0.b(viewMo815V, bt0.g(duration, new Runnable() { // from class: l.mi4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16932a.m1437B(viewMo815V, iM1442y);
                }
            }, new Runnable() { // from class: l.ni4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17482a.m1438C(viewMo815V, iM1442y);
                }
            })).start();
        }
    }

    /* JADX INFO: renamed from: y */
    public final int m1442y(CardBottomFrame cardBottomFrame) {
        int iM1444a = this.f801j.m1444a(cardBottomFrame);
        return iM1444a > 0 ? iM1444a : t100.d(100.0f);
    }

    @Override // p009l.bol
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo1407e(d5m d5mVar, User user, CoreSuggested.UserInfo userInfo, boolean z, CoreMomentInfo coreMomentInfo) {
        this.f792a = d5mVar;
        this.f793b = user;
        this.f794c = userInfo;
        this.f795d = z;
        this.f796e = coreMomentInfo;
        List<CardBottomFrame> listM1388h = C0031a.m1385i().m1388h();
        C0034d c0034d = new C0034d();
        this.f801j = c0034d;
        c0034d.m1458o(d5mVar.mo840d());
        this.f801j.m1460q(this.f799h);
        this.f801j.m1463t(user);
        this.f801j.m1461r(d5mVar.mo13009g());
        this.f801j.m1459p(coreMomentInfo);
        this.f801j.m1464u(userInfo);
        this.f801j.m1462s(z);
        this.f801j.m1456m(d5mVar);
        this.f800i.clear();
        int i = 0;
        for (CardBottomFrame cardBottomFrame : listM1388h) {
            wl2 wl2VarM1391l = C0031a.m1385i().m1391l(cardBottomFrame);
            if (wl2VarM1391l.mo11837a(this.f801j, i, cardBottomFrame, this.f797f)) {
                if (this.f801j.f815j.f818a == null && wl2VarM1391l.mo11842i()) {
                    this.f801j.f815j.f818a = cardBottomFrame;
                }
                i++;
                this.f800i.add(cardBottomFrame);
            }
        }
    }

    @Override // p009l.bol
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo1410h(d5m d5mVar) {
    }
}
