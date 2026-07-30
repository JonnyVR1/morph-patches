package com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7869c;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomMomentLayout;
import com.p046p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p149l.bol;
import p149l.bt0;
import p149l.co5;
import p149l.d5m;
import p149l.eol;
import p149l.lsi0;
import p149l.rj4;
import p149l.t100;
import p149l.u4c0;
import p149l.u59;
import p149l.upa;
import p149l.wl2;
import p149l.wsh;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.c */
/* JADX INFO: loaded from: classes11.dex */
public class C7869c implements bol<d5m> {

    /* JADX INFO: renamed from: a */
    public d5m f22014a;

    /* JADX INFO: renamed from: b */
    public User f22015b;

    /* JADX INFO: renamed from: c */
    public CoreSuggested.UserInfo f22016c;

    /* JADX INFO: renamed from: d */
    public boolean f22017d;

    /* JADX INFO: renamed from: e */
    public CoreMomentInfo f22018e;

    /* JADX INFO: renamed from: f */
    public Context f22019f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f22020g;

    /* JADX INFO: renamed from: h */
    public boolean f22021h;

    /* JADX INFO: renamed from: j */
    public C7870d f22023j;

    /* JADX INFO: renamed from: l */
    public rj4 f22025l = null;

    /* JADX INFO: renamed from: m */
    public int f22026m = 0;

    /* JADX INFO: renamed from: n */
    public int f22027n = -1;

    /* JADX INFO: renamed from: i */
    public List<CardBottomFrame> f22022i = new ArrayList();

    /* JADX INFO: renamed from: k */
    public SparseArray<rj4> f22024k = new SparseArray<>();

    public C7869c(boolean z, Context context, FrameLayout frameLayout) {
        this.f22021h = z;
        this.f22020g = frameLayout;
        this.f22019f = context;
    }

    /* JADX INFO: renamed from: E */
    private void m37452E(rj4 rj4Var) {
        if (CoreModule.m29934N().mo60311Rc() && NullChecker.m81303a(this.f22025l)) {
            CardBottomFrame cardBottomFrame = this.f22025l.f159626a;
            CardBottomFrame cardBottomFrame2 = rj4Var.f159626a;
            if (cardBottomFrame == cardBottomFrame2 || cardBottomFrame2 != CardBottomFrame.MOMENT) {
                return;
            }
            View view = rj4Var.f159627b;
            if (view instanceof CardBottomMomentLayout) {
                CardBottomMomentLayout cardBottomMomentLayout = (CardBottomMomentLayout) view;
                if (NullChecker.m81303a(cardBottomMomentLayout) && xdl0.m208349O0(cardBottomMomentLayout.f23566l)) {
                    wsh.m205508m(wsh.m205499d(), wsh.m205498c(), "p_edit_profile_view");
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m37454l(View view, View view2) {
        view.setVisibility(4);
        view2.setVisibility(0);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m37455m(View view, rj4 rj4Var) {
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
        rj4Var.f159627b.setVisibility(8);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m37456n(View view, View view2, View view3) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view2.setScaleX(1.0f);
        view2.setScaleY(1.0f);
        view.setVisibility(0);
        view3.setVisibility(0);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m37457o() {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m37459q(View view, rj4 rj4Var) {
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
        rj4Var.f159627b.setVisibility(0);
    }

    /* JADX INFO: renamed from: w */
    private void m37463w(final rj4 rj4Var, final rj4 rj4Var2, final boolean z) {
        rj4Var.f159627b.post(new Runnable() { // from class: l.oi4
            @Override // java.lang.Runnable
            public final void run() {
                this.f144088a.m37468D(rj4Var, rj4Var2, z);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    private void m37464x(final rj4 rj4Var, final rj4 rj4Var2, boolean z) {
        float f = z ? -1.0f : 1.0f;
        final View viewFindViewById = rj4Var2.f159627b.findViewById(u4c0.f174006R0);
        final View viewFindViewById2 = rj4Var.f159627b.findViewById(u4c0.f174006R0);
        final View viewFindViewById3 = rj4Var2.f159627b.findViewById(u4c0.f174344l6);
        final View viewFindViewById4 = rj4Var.f159627b.findViewById(u4c0.f174344l6);
        viewFindViewById3.setAlpha(1.0f);
        ViewPropertyAnimator viewPropertyAnimatorWithStartAction = viewFindViewById3.animate().withStartAction(new Runnable() { // from class: l.pi4
            @Override // java.lang.Runnable
            public final void run() {
                C7869c.m37457o();
            }
        });
        int i = t100.f167236K;
        viewPropertyAnimatorWithStartAction.translationX(f * 1.0f * i).alpha(0.0f).setDuration(100L).withEndAction(new Runnable() { // from class: l.qi4
            @Override // java.lang.Runnable
            public final void run() {
                C7869c.m37455m(viewFindViewById3, rj4Var2);
            }
        }).start();
        viewFindViewById4.setTranslationX(f * (-1.0f) * i);
        viewFindViewById4.setAlpha(0.0f);
        viewFindViewById4.animate().withStartAction(new Runnable() { // from class: l.ri4
            @Override // java.lang.Runnable
            public final void run() {
                rj4Var.f159627b.setVisibility(0);
            }
        }).translationX(0.0f).alpha(1.0f).setDuration(100L).withEndAction(new Runnable() { // from class: l.si4
            @Override // java.lang.Runnable
            public final void run() {
                C7869c.m37459q(viewFindViewById4, rj4Var);
            }
        }).start();
        xdl0.m208341K0(viewFindViewById2, xdl0.m208380i0(viewFindViewById), xdl0.m208380i0(viewFindViewById2));
        viewFindViewById.animate().cancel();
        viewFindViewById2.animate().withStartAction(new Runnable() { // from class: l.ti4
            @Override // java.lang.Runnable
            public final void run() {
                C7869c.m37454l(viewFindViewById, viewFindViewById2);
            }
        }).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(100L).withEndAction(new Runnable() { // from class: l.ui4
            @Override // java.lang.Runnable
            public final void run() {
                C7869c.m37456n(viewFindViewById2, viewFindViewById4, viewFindViewById);
            }
        }).start();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m37465A(View view, ValueAnimator valueAnimator) {
        xdl0.m208357U(view, ((Integer) valueAnimator.getAnimatedValue()).intValue());
        xdl0.m208384k0(this.f22023j.mo37478f().mo36825J());
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m37466B(View view, int i) {
        xdl0.m208357U(view, i);
        xdl0.m208384k0(this.f22023j.mo37478f().mo36825J());
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m37467C(View view, int i) {
        xdl0.m208357U(view, i);
        xdl0.m208384k0(this.f22023j.mo37478f().mo36825J());
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m37468D(rj4 rj4Var, rj4 rj4Var2, boolean z) {
        rj4Var.f159627b.setVisibility(0);
        m37464x(rj4Var, rj4Var2, z);
    }

    @Override // p149l.bol
    /* JADX INFO: renamed from: a */
    public void mo37432a(int i, boolean z) {
        rj4 rj4Var;
        int iMin = Math.min(Math.max(0, i), this.f22022i.size() - 1);
        if ((this.f22023j.m37482j() || this.f22023j.mo37477e()) && iMin > 0) {
            iMin = 0;
        }
        int i2 = (this.f22023j.m37481i() || this.f22023j.m37476d()) ? 0 : iMin;
        CardBottomFrame cardBottomFrame = this.f22022i.get(i2);
        if (NullChecker.m81303a(this.f22025l)) {
            rj4 rj4Var2 = this.f22025l;
            if (rj4Var2.f159626a == cardBottomFrame) {
                if (!TextUtils.equals(rj4Var2.m179549d(), this.f22023j.m37474b())) {
                    if (C7867a.f21991g) {
                        String str = cardBottomFrame.explain;
                        String str2 = this.f22023j.getUser().name;
                        lsi0.m151580j("缓存不一致了");
                    }
                    this.f22025l.m179550e(this.f22023j, this.f22019f, this.f22020g, i2);
                }
                if (C7867a.f21991g) {
                    String str3 = cardBottomFrame.explain;
                    String str4 = this.f22023j.getUser().name;
                    return;
                }
                return;
            }
        }
        rj4 rj4VarM37416g = this.f22024k.get(cardBottomFrame.getFrameId());
        if (C7867a.f21991g) {
            String str5 = this.f22023j.getUser().name;
        }
        if (rj4VarM37416g == null) {
            rj4VarM37416g = C7867a.m37414i().m37416g(this.f22023j, i2, cardBottomFrame, this.f22019f, this.f22020g);
            this.f22024k.put(cardBottomFrame.getFrameId(), rj4VarM37416g);
        } else if (!TextUtils.equals(rj4VarM37416g.m179549d(), this.f22023j.m37474b())) {
            if (C7867a.f21991g) {
                String str6 = this.f22023j.getUser().name;
                lsi0.m151580j("缓存不一致了*");
            }
            rj4VarM37416g.m179550e(this.f22023j, this.f22019f, this.f22020g, i2);
        }
        NullChecker.m81303a(this.f22025l);
        rj4 rj4Var3 = this.f22025l;
        if (rj4Var3 != null && z) {
            rj4VarM37416g.f159627b.setVisibility(4);
            m37463w(rj4VarM37416g, this.f22025l, i2 > this.f22026m);
        } else if (rj4Var3 != null) {
            xdl0.m208344M(rj4Var3.f159627b, false);
            xdl0.m208344M(rj4VarM37416g.f159627b, true);
        } else {
            rj4VarM37416g.f159627b.setVisibility(0);
        }
        if (NullChecker.m81303a(this.f22025l) && (rj4Var = this.f22025l) != rj4VarM37416g && rj4Var.f159626a == CardBottomFrame.INTL_COMPLIMENT_RECEIVED) {
            co5.m107932d("swipe");
        }
        if (NullChecker.m81303a(rj4VarM37416g) && this.f22017d) {
            m37452E(rj4VarM37416g);
            if (!this.f22021h) {
                rj4VarM37416g.f159628c.mo114808j(this.f22023j, rj4VarM37416g, i2);
            }
        }
        this.f22025l = rj4VarM37416g;
        this.f22026m = i2;
        if (!this.f22023j.getUser().isMe() && !u59.m191833i0()) {
            m37470v(z);
        }
        xdl0.m208384k0(this.f22023j.mo37478f().mo36825J());
        if (i2 == 0) {
            this.f22027n = rj4VarM37416g.f159627b.getMeasuredHeight();
        }
    }

    @Override // p149l.bol
    /* JADX INFO: renamed from: b */
    public void mo37433b() {
        if (C7867a.f21991g) {
            this.f22024k.size();
        }
        int size = this.f22024k.size();
        int i = 0;
        while (true) {
            SparseArray<rj4> sparseArray = this.f22024k;
            if (i >= size) {
                sparseArray.clear();
                this.f22025l = null;
                boolean z = C7867a.f21991g;
                return;
            } else {
                rj4 rj4Var = sparseArray.get(sparseArray.keyAt(i));
                if (NullChecker.m81303a(rj4Var)) {
                    C7867a.m37414i().m37415f(this.f22019f, rj4Var);
                    this.f22020g.removeView(rj4Var.f159627b);
                    if (C7867a.f21991g) {
                        String str = rj4Var.f159626a.explain;
                    }
                }
                i++;
            }
        }
    }

    @Override // p149l.bol
    /* JADX INFO: renamed from: c */
    public void mo37434c(User user) {
    }

    @Override // p149l.bol
    /* JADX INFO: renamed from: d */
    public void mo37435d(Act act, User user) {
        rj4 rj4Var = this.f22025l;
        if (rj4Var != null) {
            KeyEvent.Callback callback = rj4Var.f159627b;
            if (callback instanceof eol) {
                CardUserContentView userContentLayout = ((eol) callback).getUserContentLayout();
                if (NullChecker.m81303a(userContentLayout)) {
                    userContentLayout.m39127a0(act, user);
                }
            }
        }
    }

    @Override // p149l.bol
    /* JADX INFO: renamed from: f */
    public View mo37437f() {
        rj4 rj4Var = this.f22025l;
        return rj4Var != null ? rj4Var.f159627b : this.f22014a.mo36905l();
    }

    @Override // p149l.bol
    /* JADX INFO: renamed from: g */
    public String mo37438g() {
        C7870d c7870d;
        if (!upa.m194761h3() || this.f22025l.f159626a != CardBottomFrame.TAG || (c7870d = this.f22023j) == null) {
            return "";
        }
        String[] strArr = {"sports", "places", "movies", "literature", "music", "food"};
        Map<String, String> map = c7870d.f22037j.f22044e;
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

    @Override // p149l.bol
    /* JADX INFO: renamed from: i */
    public boolean mo37440i() {
        rj4 rj4Var = this.f22025l;
        if (rj4Var != null) {
            KeyEvent.Callback callback = rj4Var.f159627b;
            if (callback instanceof eol) {
                CardUserContentView userContentLayout = ((eol) callback).getUserContentLayout();
                if (NullChecker.m81303a(userContentLayout) && NullChecker.m81303a(userContentLayout.f23781g) && userContentLayout.f23781g.getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p149l.bol
    /* JADX INFO: renamed from: j */
    public void mo37441j(int i) {
        mo37432a(i, true);
    }

    @Deprecated
    /* JADX INFO: renamed from: v */
    public final void m37470v(boolean z) {
        int i;
        if (this.f22023j.mo37478f() == null) {
            return;
        }
        mo37437f();
        if (this.f22025l == null) {
            return;
        }
        final View viewMo36857V = this.f22023j.mo37478f().mo36857V();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewMo36857V.getLayoutParams();
        final int iM37471y = m37471y(this.f22025l.f159626a);
        if (!NullChecker.m81303a(marginLayoutParams) || (i = marginLayoutParams.bottomMargin) == iM37471y) {
            return;
        }
        if (!z) {
            xdl0.m208357U(viewMo36857V, iM37471y);
            xdl0.m208384k0(this.f22023j.mo37478f().mo36825J());
        } else {
            ValueAnimator duration = ValueAnimator.ofInt(i, iM37471y).setDuration(100L);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.li4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f128165a.m37465A(viewMo36857V, valueAnimator);
                }
            });
            bt0.m103729b(viewMo36857V, bt0.m103734g(duration, new Runnable() { // from class: l.mi4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f133938a.m37466B(viewMo36857V, iM37471y);
                }
            }, new Runnable() { // from class: l.ni4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f139057a.m37467C(viewMo36857V, iM37471y);
                }
            })).start();
        }
    }

    /* JADX INFO: renamed from: y */
    public final int m37471y(CardBottomFrame cardBottomFrame) {
        int iM37473a = this.f22023j.m37473a(cardBottomFrame);
        return iM37473a > 0 ? iM37473a : t100.m186890d(100.0f);
    }

    @Override // p149l.bol
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo37436e(d5m d5mVar, User user, CoreSuggested.UserInfo userInfo, boolean z, CoreMomentInfo coreMomentInfo) {
        this.f22014a = d5mVar;
        this.f22015b = user;
        this.f22016c = userInfo;
        this.f22017d = z;
        this.f22018e = coreMomentInfo;
        List<CardBottomFrame> listM37417h = C7867a.m37414i().m37417h();
        C7870d c7870d = new C7870d();
        this.f22023j = c7870d;
        c7870d.m37487o(d5mVar.mo36879d());
        this.f22023j.m37489q(this.f22021h);
        this.f22023j.m37492t(user);
        this.f22023j.m37490r(d5mVar.mo110063g());
        this.f22023j.m37488p(coreMomentInfo);
        this.f22023j.m37493u(userInfo);
        this.f22023j.m37491s(z);
        this.f22023j.m37485m(d5mVar);
        this.f22022i.clear();
        int i = 0;
        for (CardBottomFrame cardBottomFrame : listM37417h) {
            wl2 wl2VarM37420l = C7867a.m37414i().m37420l(cardBottomFrame);
            if (wl2VarM37420l.mo100260a(this.f22023j, i, cardBottomFrame, this.f22019f)) {
                if (this.f22023j.f22037j.f22040a == null && wl2VarM37420l.mo100265i()) {
                    this.f22023j.f22037j.f22040a = cardBottomFrame;
                }
                i++;
                this.f22022i.add(cardBottomFrame);
            }
        }
    }

    @Override // p149l.bol
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo37439h(d5m d5mVar) {
    }
}
