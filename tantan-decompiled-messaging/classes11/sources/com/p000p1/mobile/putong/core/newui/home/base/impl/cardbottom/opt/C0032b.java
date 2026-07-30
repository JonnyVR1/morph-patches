package com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0032b;
import com.p000p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.co5;
import l.t100;
import l.u4c0;
import l.xdl0;
import p009l.bol;
import p009l.d5m;
import p009l.eol;
import p009l.rj4;
import p009l.wl2;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0032b implements bol<d5m> {

    /* JADX INFO: renamed from: a */
    public User f778a;

    /* JADX INFO: renamed from: b */
    public CoreSuggested.UserInfo f779b;

    /* JADX INFO: renamed from: c */
    public boolean f780c;

    /* JADX INFO: renamed from: d */
    public CoreMomentInfo f781d;

    /* JADX INFO: renamed from: e */
    public Context f782e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f783f;

    /* JADX INFO: renamed from: g */
    public a f784g;

    /* JADX INFO: renamed from: h */
    public boolean f785h;

    /* JADX INFO: renamed from: j */
    public C0034d f787j;

    /* JADX INFO: renamed from: l */
    public rj4 f789l = null;

    /* JADX INFO: renamed from: m */
    public int f790m = 0;

    /* JADX INFO: renamed from: n */
    public int f791n = -1;

    /* JADX INFO: renamed from: i */
    public List<CardBottomFrame> f786i = new ArrayList();

    /* JADX INFO: renamed from: k */
    public SparseArray<rj4> f788k = new SparseArray<>();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo1422a(rj4 rj4Var);
    }

    public C0032b(boolean z, Context context, FrameLayout frameLayout, a aVar) {
        this.f785h = z;
        this.f783f = frameLayout;
        this.f782e = context;
        this.f784g = aVar;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m1396k(View view, View view2) {
        view.setVisibility(4);
        view2.setVisibility(0);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m1397l(View view, rj4 rj4Var) {
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
        rj4Var.f19859b.setVisibility(0);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m1398m(View view, View view2, View view3) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view2.setScaleX(1.0f);
        view2.setScaleY(1.0f);
        view.setVisibility(0);
        view3.setVisibility(0);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m1399n() {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m1402q(View view, rj4 rj4Var) {
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
        rj4Var.f19859b.setVisibility(8);
    }

    @Override // p009l.bol
    /* JADX INFO: renamed from: a */
    public void mo1403a(int i, boolean z) {
        rj4 rj4Var;
        int iMin = Math.min(Math.max(0, i), this.f786i.size() - 1);
        if ((this.f787j.m1453j() || this.f787j.mo1448e()) && iMin > 0) {
            iMin = 0;
        }
        int i2 = (this.f787j.m1452i() || this.f787j.m1447d()) ? 0 : iMin;
        CardBottomFrame cardBottomFrame = this.f786i.get(i2);
        if (NullChecker.a(this.f789l)) {
            rj4 rj4Var2 = this.f789l;
            if (rj4Var2.f19858a == cardBottomFrame) {
                if (!TextUtils.equals(rj4Var2.m21681d(), this.f787j.m1445b())) {
                    this.f789l.m21682e(this.f787j, this.f782e, this.f783f, i2);
                }
                if (C0031a.f769g) {
                    String str = cardBottomFrame.explain;
                    String str2 = this.f787j.getUser().name;
                    return;
                }
                return;
            }
        }
        rj4 rj4VarM1387g = this.f788k.get(cardBottomFrame.getFrameId());
        if (C0031a.f769g) {
            String str3 = this.f787j.getUser().name;
        }
        if (rj4VarM1387g == null) {
            rj4VarM1387g = C0031a.m1385i().m1387g(this.f787j, i2, cardBottomFrame, this.f782e, this.f783f);
            this.f788k.put(cardBottomFrame.getFrameId(), rj4VarM1387g);
        } else if (!TextUtils.equals(rj4VarM1387g.m21681d(), this.f787j.m1445b())) {
            if (C0031a.f769g) {
                String str4 = this.f787j.getUser().name;
            }
            rj4VarM1387g.m21682e(this.f787j, this.f782e, this.f783f, i2);
        }
        rj4 rj4Var3 = this.f789l;
        if (rj4Var3 != null && z) {
            rj4VarM1387g.f19859b.setVisibility(4);
            m1414s(rj4VarM1387g, this.f789l, i2 > this.f790m);
        } else if (rj4Var3 != null) {
            xdl0.M(rj4Var3.f19859b, false);
            xdl0.M(rj4VarM1387g.f19859b, true);
        } else {
            rj4VarM1387g.f19859b.setVisibility(0);
        }
        if (NullChecker.a(this.f789l) && (rj4Var = this.f789l) != rj4VarM1387g && rj4Var.f19858a == CardBottomFrame.INTL_COMPLIMENT_RECEIVED) {
            co5.d("swipe");
        }
        if (NullChecker.a(rj4VarM1387g) && this.f780c) {
            m1421z(rj4VarM1387g);
            if (!this.f785h) {
                rj4VarM1387g.f19860c.mo13735j(this.f787j, rj4VarM1387g, i2);
            }
        }
        this.f789l = rj4VarM1387g;
        this.f790m = i2;
        if (i2 == 0) {
            this.f791n = rj4VarM1387g.f19859b.getMeasuredHeight();
        }
        a aVar = this.f784g;
        if (aVar != null) {
            aVar.mo1422a(rj4VarM1387g);
        }
    }

    @Override // p009l.bol
    /* JADX INFO: renamed from: b */
    public void mo1404b() {
        if (C0031a.f769g) {
            this.f788k.size();
        }
        int size = this.f788k.size();
        int i = 0;
        while (true) {
            SparseArray<rj4> sparseArray = this.f788k;
            if (i >= size) {
                sparseArray.clear();
                this.f789l = null;
                boolean z = C0031a.f769g;
                return;
            } else {
                rj4 rj4Var = sparseArray.get(sparseArray.keyAt(i));
                if (NullChecker.a(rj4Var)) {
                    C0031a.m1385i().m1386f(this.f782e, rj4Var);
                    this.f783f.removeView(rj4Var.f19859b);
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
    }

    @Override // p009l.bol
    /* JADX INFO: renamed from: f */
    public View mo1408f() {
        rj4 rj4Var = this.f789l;
        if (rj4Var != null) {
            return rj4Var.f19859b;
        }
        return null;
    }

    @Override // p009l.bol
    /* JADX INFO: renamed from: g */
    public String mo1409g() {
        return "";
    }

    @Override // p009l.bol
    /* JADX INFO: renamed from: i */
    public boolean mo1411i() {
        rj4 rj4Var = this.f789l;
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

    /* JADX INFO: renamed from: s */
    public final void m1414s(final rj4 rj4Var, final rj4 rj4Var2, final boolean z) {
        rj4Var.f19859b.post(new Runnable() { // from class: l.ei4
            @Override // java.lang.Runnable
            public final void run() {
                this.f12573a.m1420y(rj4Var, rj4Var2, z);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m1415t(final rj4 rj4Var, final rj4 rj4Var2, boolean z) {
        final View viewFindViewById = rj4Var2.f19859b.findViewById(u4c0.R0);
        final View viewFindViewById2 = rj4Var.f19859b.findViewById(u4c0.R0);
        final View viewFindViewById3 = rj4Var2.f19859b.findViewById(u4c0.l6);
        final View viewFindViewById4 = rj4Var.f19859b.findViewById(u4c0.l6);
        if (viewFindViewById3 == null || viewFindViewById4 == null || viewFindViewById == null || viewFindViewById2 == null) {
            xdl0.M(rj4Var2.f19859b, false);
            xdl0.M(rj4Var.f19859b, true);
            return;
        }
        float f = z ? -1.0f : 1.0f;
        viewFindViewById3.setAlpha(1.0f);
        ViewPropertyAnimator viewPropertyAnimatorWithStartAction = viewFindViewById3.animate().withStartAction(new Runnable() { // from class: l.fi4
            @Override // java.lang.Runnable
            public final void run() {
                C0032b.m1399n();
            }
        });
        int i = t100.K;
        viewPropertyAnimatorWithStartAction.translationX(f * 1.0f * i).alpha(0.0f).setDuration(100L).withEndAction(new Runnable() { // from class: l.gi4
            @Override // java.lang.Runnable
            public final void run() {
                C0032b.m1402q(viewFindViewById3, rj4Var2);
            }
        }).start();
        viewFindViewById4.setTranslationX(f * (-1.0f) * i);
        viewFindViewById4.setAlpha(0.0f);
        viewFindViewById4.animate().withStartAction(new Runnable() { // from class: l.hi4
            @Override // java.lang.Runnable
            public final void run() {
                rj4Var.f19859b.setVisibility(0);
            }
        }).translationX(0.0f).alpha(1.0f).setDuration(100L).withEndAction(new Runnable() { // from class: l.ii4
            @Override // java.lang.Runnable
            public final void run() {
                C0032b.m1397l(viewFindViewById4, rj4Var);
            }
        }).start();
        xdl0.K0(viewFindViewById2, xdl0.i0(viewFindViewById), xdl0.i0(viewFindViewById2));
        viewFindViewById.animate().cancel();
        viewFindViewById2.animate().withStartAction(new Runnable() { // from class: l.ji4
            @Override // java.lang.Runnable
            public final void run() {
                C0032b.m1396k(viewFindViewById, viewFindViewById2);
            }
        }).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(100L).withEndAction(new Runnable() { // from class: l.ki4
            @Override // java.lang.Runnable
            public final void run() {
                C0032b.m1398m(viewFindViewById2, viewFindViewById4, viewFindViewById);
            }
        }).start();
    }

    /* JADX INFO: renamed from: u */
    public CardBottomFrame m1416u() {
        rj4 rj4Var = this.f789l;
        if (rj4Var != null) {
            return rj4Var.m21678a();
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public rj4 m1417v() {
        rj4 rj4Var = this.f789l;
        if (rj4Var != null) {
            return rj4Var;
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public C0034d m1418w() {
        return this.f787j;
    }

    @Override // p009l.bol
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo1407e(d5m d5mVar, User user, CoreSuggested.UserInfo userInfo, boolean z, CoreMomentInfo coreMomentInfo) {
        this.f778a = user;
        this.f779b = userInfo;
        this.f780c = z;
        this.f781d = coreMomentInfo;
        List<CardBottomFrame> listM1388h = C0031a.m1385i().m1388h();
        C0034d c0034d = new C0034d();
        this.f787j = c0034d;
        c0034d.m1460q(this.f785h);
        this.f787j.m1463t(user);
        this.f787j.m1459p(coreMomentInfo);
        this.f787j.m1464u(userInfo);
        this.f787j.m1462s(z);
        this.f786i.clear();
        int i = 0;
        for (CardBottomFrame cardBottomFrame : listM1388h) {
            wl2 wl2VarM1391l = C0031a.m1385i().m1391l(cardBottomFrame);
            if (wl2VarM1391l.mo11837a(this.f787j, i, cardBottomFrame, this.f782e)) {
                if (this.f787j.f815j.f818a == null && wl2VarM1391l.mo11842i()) {
                    this.f787j.f815j.f818a = cardBottomFrame;
                }
                i++;
                this.f786i.add(cardBottomFrame);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m1420y(rj4 rj4Var, rj4 rj4Var2, boolean z) {
        rj4Var.f19859b.setVisibility(0);
        m1415t(rj4Var, rj4Var2, z);
    }

    @Override // p009l.bol
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo1410h(d5m d5mVar) {
    }

    /* JADX INFO: renamed from: z */
    public final void m1421z(rj4 rj4Var) {
    }
}
