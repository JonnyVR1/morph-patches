package com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8019b;
import com.p051p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.adc0;
import p153l.bnl0;
import p153l.em2;
import p153l.gp5;
import p153l.mql;
import p153l.pql;
import p153l.qa00;
import p153l.qk4;
import p153l.t7m;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.b */
/* JADX INFO: loaded from: classes11.dex */
public class C8019b implements mql<t7m> {

    /* JADX INFO: renamed from: a */
    public User f22742a;

    /* JADX INFO: renamed from: b */
    public CoreSuggested.UserInfo f22743b;

    /* JADX INFO: renamed from: c */
    public boolean f22744c;

    /* JADX INFO: renamed from: d */
    public CoreMomentInfo f22745d;

    /* JADX INFO: renamed from: e */
    public Context f22746e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f22747f;

    /* JADX INFO: renamed from: g */
    public a f22748g;

    /* JADX INFO: renamed from: h */
    public boolean f22749h;

    /* JADX INFO: renamed from: j */
    public C8021d f22751j;

    /* JADX INFO: renamed from: l */
    public qk4 f22753l = null;

    /* JADX INFO: renamed from: m */
    public int f22754m = 0;

    /* JADX INFO: renamed from: n */
    public int f22755n = -1;

    /* JADX INFO: renamed from: i */
    public List<CardBottomFrame> f22750i = new ArrayList();

    /* JADX INFO: renamed from: k */
    public SparseArray<qk4> f22752k = new SparseArray<>();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo38454a(qk4 qk4Var);
    }

    public C8019b(boolean z, Context context, FrameLayout frameLayout, a aVar) {
        this.f22749h = z;
        this.f22747f = frameLayout;
        this.f22746e = context;
        this.f22748g = aVar;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m38428k(View view, View view2) {
        view.setVisibility(4);
        view2.setVisibility(0);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m38429l(View view, qk4 qk4Var) {
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
        qk4Var.f158093b.setVisibility(0);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m38430m(View view, View view2, View view3) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view2.setScaleX(1.0f);
        view2.setScaleY(1.0f);
        view.setVisibility(0);
        view3.setVisibility(0);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m38431n() {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m38434q(View view, qk4 qk4Var) {
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
        qk4Var.f158093b.setVisibility(8);
    }

    @Override // p153l.mql
    /* JADX INFO: renamed from: a */
    public void mo38435a(int i, boolean z) {
        qk4 qk4Var;
        int iMin = Math.min(Math.max(0, i), this.f22750i.size() - 1);
        if ((this.f22751j.m38485j() || this.f22751j.mo38480e()) && iMin > 0) {
            iMin = 0;
        }
        int i2 = (this.f22751j.m38484i() || this.f22751j.m38479d()) ? 0 : iMin;
        CardBottomFrame cardBottomFrame = this.f22750i.get(i2);
        if (NullChecker.m82486a(this.f22753l)) {
            qk4 qk4Var2 = this.f22753l;
            if (qk4Var2.f158092a == cardBottomFrame) {
                if (!TextUtils.equals(qk4Var2.m176922d(), this.f22751j.m38477b())) {
                    this.f22753l.m176923e(this.f22751j, this.f22746e, this.f22747f, i2);
                }
                if (C8018a.f22733g) {
                    String str = cardBottomFrame.explain;
                    String str2 = this.f22751j.getUser().name;
                    return;
                }
                return;
            }
        }
        qk4 qk4VarM38419g = this.f22752k.get(cardBottomFrame.getFrameId());
        if (C8018a.f22733g) {
            String str3 = this.f22751j.getUser().name;
        }
        if (qk4VarM38419g == null) {
            qk4VarM38419g = C8018a.m38417i().m38419g(this.f22751j, i2, cardBottomFrame, this.f22746e, this.f22747f);
            this.f22752k.put(cardBottomFrame.getFrameId(), qk4VarM38419g);
        } else if (!TextUtils.equals(qk4VarM38419g.m176922d(), this.f22751j.m38477b())) {
            if (C8018a.f22733g) {
                String str4 = this.f22751j.getUser().name;
            }
            qk4VarM38419g.m176923e(this.f22751j, this.f22746e, this.f22747f, i2);
        }
        qk4 qk4Var3 = this.f22753l;
        if (qk4Var3 != null && z) {
            qk4VarM38419g.f158093b.setVisibility(4);
            m38446s(qk4VarM38419g, this.f22753l, i2 > this.f22754m);
        } else if (qk4Var3 != null) {
            bnl0.m105524M(qk4Var3.f158093b, false);
            bnl0.m105524M(qk4VarM38419g.f158093b, true);
        } else {
            qk4VarM38419g.f158093b.setVisibility(0);
        }
        if (NullChecker.m82486a(this.f22753l) && (qk4Var = this.f22753l) != qk4VarM38419g && qk4Var.f158092a == CardBottomFrame.INTL_COMPLIMENT_RECEIVED) {
            gp5.m131230d("swipe");
        }
        if (NullChecker.m82486a(qk4VarM38419g) && this.f22744c) {
            m38453z(qk4VarM38419g);
            if (!this.f22749h) {
                qk4VarM38419g.f158094c.mo96367j(this.f22751j, qk4VarM38419g, i2);
            }
        }
        this.f22753l = qk4VarM38419g;
        this.f22754m = i2;
        if (i2 == 0) {
            this.f22755n = qk4VarM38419g.f158093b.getMeasuredHeight();
        }
        a aVar = this.f22748g;
        if (aVar != null) {
            aVar.mo38454a(qk4VarM38419g);
        }
    }

    @Override // p153l.mql
    /* JADX INFO: renamed from: b */
    public void mo38436b() {
        if (C8018a.f22733g) {
            this.f22752k.size();
        }
        int size = this.f22752k.size();
        int i = 0;
        while (true) {
            SparseArray<qk4> sparseArray = this.f22752k;
            if (i >= size) {
                sparseArray.clear();
                this.f22753l = null;
                boolean z = C8018a.f22733g;
                return;
            } else {
                qk4 qk4Var = sparseArray.get(sparseArray.keyAt(i));
                if (NullChecker.m82486a(qk4Var)) {
                    C8018a.m38417i().m38418f(this.f22746e, qk4Var);
                    this.f22747f.removeView(qk4Var.f158093b);
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
    }

    @Override // p153l.mql
    /* JADX INFO: renamed from: f */
    public View mo38440f() {
        qk4 qk4Var = this.f22753l;
        if (qk4Var != null) {
            return qk4Var.f158093b;
        }
        return null;
    }

    @Override // p153l.mql
    /* JADX INFO: renamed from: g */
    public String mo38441g() {
        return "";
    }

    @Override // p153l.mql
    /* JADX INFO: renamed from: i */
    public boolean mo38443i() {
        qk4 qk4Var = this.f22753l;
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

    /* JADX INFO: renamed from: s */
    public final void m38446s(final qk4 qk4Var, final qk4 qk4Var2, final boolean z) {
        qk4Var.f158093b.post(new Runnable() { // from class: l.dj4
            @Override // java.lang.Runnable
            public final void run() {
                this.f88774a.m38452y(qk4Var, qk4Var2, z);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m38447t(final qk4 qk4Var, final qk4 qk4Var2, boolean z) {
        final View viewFindViewById = qk4Var2.f158093b.findViewById(adc0.f70094R0);
        final View viewFindViewById2 = qk4Var.f158093b.findViewById(adc0.f70094R0);
        final View viewFindViewById3 = qk4Var2.f158093b.findViewById(adc0.f70469n6);
        final View viewFindViewById4 = qk4Var.f158093b.findViewById(adc0.f70469n6);
        if (viewFindViewById3 == null || viewFindViewById4 == null || viewFindViewById == null || viewFindViewById2 == null) {
            bnl0.m105524M(qk4Var2.f158093b, false);
            bnl0.m105524M(qk4Var.f158093b, true);
            return;
        }
        float f = z ? -1.0f : 1.0f;
        viewFindViewById3.setAlpha(1.0f);
        ViewPropertyAnimator viewPropertyAnimatorWithStartAction = viewFindViewById3.animate().withStartAction(new Runnable() { // from class: l.ej4
            @Override // java.lang.Runnable
            public final void run() {
                C8019b.m38431n();
            }
        });
        int i = qa00.f156298K;
        viewPropertyAnimatorWithStartAction.translationX(f * 1.0f * i).alpha(0.0f).setDuration(100L).withEndAction(new Runnable() { // from class: l.fj4
            @Override // java.lang.Runnable
            public final void run() {
                C8019b.m38434q(viewFindViewById3, qk4Var2);
            }
        }).start();
        viewFindViewById4.setTranslationX(f * (-1.0f) * i);
        viewFindViewById4.setAlpha(0.0f);
        viewFindViewById4.animate().withStartAction(new Runnable() { // from class: l.gj4
            @Override // java.lang.Runnable
            public final void run() {
                qk4Var.f158093b.setVisibility(0);
            }
        }).translationX(0.0f).alpha(1.0f).setDuration(100L).withEndAction(new Runnable() { // from class: l.hj4
            @Override // java.lang.Runnable
            public final void run() {
                C8019b.m38429l(viewFindViewById4, qk4Var);
            }
        }).start();
        bnl0.m105521K0(viewFindViewById2, bnl0.m105560i0(viewFindViewById), bnl0.m105560i0(viewFindViewById2));
        viewFindViewById.animate().cancel();
        viewFindViewById2.animate().withStartAction(new Runnable() { // from class: l.ij4
            @Override // java.lang.Runnable
            public final void run() {
                C8019b.m38428k(viewFindViewById, viewFindViewById2);
            }
        }).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(100L).withEndAction(new Runnable() { // from class: l.jj4
            @Override // java.lang.Runnable
            public final void run() {
                C8019b.m38430m(viewFindViewById2, viewFindViewById4, viewFindViewById);
            }
        }).start();
    }

    /* JADX INFO: renamed from: u */
    public CardBottomFrame m38448u() {
        qk4 qk4Var = this.f22753l;
        if (qk4Var != null) {
            return qk4Var.m176919a();
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public qk4 m38449v() {
        qk4 qk4Var = this.f22753l;
        if (qk4Var != null) {
            return qk4Var;
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public C8021d m38450w() {
        return this.f22751j;
    }

    @Override // p153l.mql
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo38439e(t7m t7mVar, User user, CoreSuggested.UserInfo userInfo, boolean z, CoreMomentInfo coreMomentInfo) {
        this.f22742a = user;
        this.f22743b = userInfo;
        this.f22744c = z;
        this.f22745d = coreMomentInfo;
        List<CardBottomFrame> listM38420h = C8018a.m38417i().m38420h();
        C8021d c8021d = new C8021d();
        this.f22751j = c8021d;
        c8021d.m38492q(this.f22749h);
        this.f22751j.m38495t(user);
        this.f22751j.m38491p(coreMomentInfo);
        this.f22751j.m38496u(userInfo);
        this.f22751j.m38494s(z);
        this.f22750i.clear();
        int i = 0;
        for (CardBottomFrame cardBottomFrame : listM38420h) {
            em2 em2VarM38423l = C8018a.m38417i().m38423l(cardBottomFrame);
            if (em2VarM38423l.mo96364a(this.f22751j, i, cardBottomFrame, this.f22746e)) {
                if (this.f22751j.f22779j.f22782a == null && em2VarM38423l.mo96366i()) {
                    this.f22751j.f22779j.f22782a = cardBottomFrame;
                }
                i++;
                this.f22750i.add(cardBottomFrame);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m38452y(qk4 qk4Var, qk4 qk4Var2, boolean z) {
        qk4Var.f158093b.setVisibility(0);
        m38447t(qk4Var, qk4Var2, z);
    }

    @Override // p153l.mql
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo38442h(t7m t7mVar) {
    }

    /* JADX INFO: renamed from: z */
    public final void m38453z(qk4 qk4Var) {
    }
}
