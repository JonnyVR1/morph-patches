package com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7868b;
import com.p046p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.bol;
import p149l.co5;
import p149l.d5m;
import p149l.eol;
import p149l.rj4;
import p149l.t100;
import p149l.u4c0;
import p149l.wl2;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.b */
/* JADX INFO: loaded from: classes11.dex */
public class C7868b implements bol<d5m> {

    /* JADX INFO: renamed from: a */
    public User f22000a;

    /* JADX INFO: renamed from: b */
    public CoreSuggested.UserInfo f22001b;

    /* JADX INFO: renamed from: c */
    public boolean f22002c;

    /* JADX INFO: renamed from: d */
    public CoreMomentInfo f22003d;

    /* JADX INFO: renamed from: e */
    public Context f22004e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f22005f;

    /* JADX INFO: renamed from: g */
    public a f22006g;

    /* JADX INFO: renamed from: h */
    public boolean f22007h;

    /* JADX INFO: renamed from: j */
    public C7870d f22009j;

    /* JADX INFO: renamed from: l */
    public rj4 f22011l = null;

    /* JADX INFO: renamed from: m */
    public int f22012m = 0;

    /* JADX INFO: renamed from: n */
    public int f22013n = -1;

    /* JADX INFO: renamed from: i */
    public List<CardBottomFrame> f22008i = new ArrayList();

    /* JADX INFO: renamed from: k */
    public SparseArray<rj4> f22010k = new SparseArray<>();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo37451a(rj4 rj4Var);
    }

    public C7868b(boolean z, Context context, FrameLayout frameLayout, a aVar) {
        this.f22007h = z;
        this.f22005f = frameLayout;
        this.f22004e = context;
        this.f22006g = aVar;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m37425k(View view, View view2) {
        view.setVisibility(4);
        view2.setVisibility(0);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m37426l(View view, rj4 rj4Var) {
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
        rj4Var.f159627b.setVisibility(0);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m37427m(View view, View view2, View view3) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view2.setScaleX(1.0f);
        view2.setScaleY(1.0f);
        view.setVisibility(0);
        view3.setVisibility(0);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m37428n() {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m37431q(View view, rj4 rj4Var) {
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
        rj4Var.f159627b.setVisibility(8);
    }

    @Override // p149l.bol
    /* JADX INFO: renamed from: a */
    public void mo37432a(int i, boolean z) {
        rj4 rj4Var;
        int iMin = Math.min(Math.max(0, i), this.f22008i.size() - 1);
        if ((this.f22009j.m37482j() || this.f22009j.mo37477e()) && iMin > 0) {
            iMin = 0;
        }
        int i2 = (this.f22009j.m37481i() || this.f22009j.m37476d()) ? 0 : iMin;
        CardBottomFrame cardBottomFrame = this.f22008i.get(i2);
        if (NullChecker.m81303a(this.f22011l)) {
            rj4 rj4Var2 = this.f22011l;
            if (rj4Var2.f159626a == cardBottomFrame) {
                if (!TextUtils.equals(rj4Var2.m179549d(), this.f22009j.m37474b())) {
                    this.f22011l.m179550e(this.f22009j, this.f22004e, this.f22005f, i2);
                }
                if (C7867a.f21991g) {
                    String str = cardBottomFrame.explain;
                    String str2 = this.f22009j.getUser().name;
                    return;
                }
                return;
            }
        }
        rj4 rj4VarM37416g = this.f22010k.get(cardBottomFrame.getFrameId());
        if (C7867a.f21991g) {
            String str3 = this.f22009j.getUser().name;
        }
        if (rj4VarM37416g == null) {
            rj4VarM37416g = C7867a.m37414i().m37416g(this.f22009j, i2, cardBottomFrame, this.f22004e, this.f22005f);
            this.f22010k.put(cardBottomFrame.getFrameId(), rj4VarM37416g);
        } else if (!TextUtils.equals(rj4VarM37416g.m179549d(), this.f22009j.m37474b())) {
            if (C7867a.f21991g) {
                String str4 = this.f22009j.getUser().name;
            }
            rj4VarM37416g.m179550e(this.f22009j, this.f22004e, this.f22005f, i2);
        }
        rj4 rj4Var3 = this.f22011l;
        if (rj4Var3 != null && z) {
            rj4VarM37416g.f159627b.setVisibility(4);
            m37443s(rj4VarM37416g, this.f22011l, i2 > this.f22012m);
        } else if (rj4Var3 != null) {
            xdl0.m208344M(rj4Var3.f159627b, false);
            xdl0.m208344M(rj4VarM37416g.f159627b, true);
        } else {
            rj4VarM37416g.f159627b.setVisibility(0);
        }
        if (NullChecker.m81303a(this.f22011l) && (rj4Var = this.f22011l) != rj4VarM37416g && rj4Var.f159626a == CardBottomFrame.INTL_COMPLIMENT_RECEIVED) {
            co5.m107932d("swipe");
        }
        if (NullChecker.m81303a(rj4VarM37416g) && this.f22002c) {
            m37450z(rj4VarM37416g);
            if (!this.f22007h) {
                rj4VarM37416g.f159628c.mo114808j(this.f22009j, rj4VarM37416g, i2);
            }
        }
        this.f22011l = rj4VarM37416g;
        this.f22012m = i2;
        if (i2 == 0) {
            this.f22013n = rj4VarM37416g.f159627b.getMeasuredHeight();
        }
        a aVar = this.f22006g;
        if (aVar != null) {
            aVar.mo37451a(rj4VarM37416g);
        }
    }

    @Override // p149l.bol
    /* JADX INFO: renamed from: b */
    public void mo37433b() {
        if (C7867a.f21991g) {
            this.f22010k.size();
        }
        int size = this.f22010k.size();
        int i = 0;
        while (true) {
            SparseArray<rj4> sparseArray = this.f22010k;
            if (i >= size) {
                sparseArray.clear();
                this.f22011l = null;
                boolean z = C7867a.f21991g;
                return;
            } else {
                rj4 rj4Var = sparseArray.get(sparseArray.keyAt(i));
                if (NullChecker.m81303a(rj4Var)) {
                    C7867a.m37414i().m37415f(this.f22004e, rj4Var);
                    this.f22005f.removeView(rj4Var.f159627b);
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
    }

    @Override // p149l.bol
    /* JADX INFO: renamed from: f */
    public View mo37437f() {
        rj4 rj4Var = this.f22011l;
        if (rj4Var != null) {
            return rj4Var.f159627b;
        }
        return null;
    }

    @Override // p149l.bol
    /* JADX INFO: renamed from: g */
    public String mo37438g() {
        return "";
    }

    @Override // p149l.bol
    /* JADX INFO: renamed from: i */
    public boolean mo37440i() {
        rj4 rj4Var = this.f22011l;
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

    /* JADX INFO: renamed from: s */
    public final void m37443s(final rj4 rj4Var, final rj4 rj4Var2, final boolean z) {
        rj4Var.f159627b.post(new Runnable() { // from class: l.ei4
            @Override // java.lang.Runnable
            public final void run() {
                this.f91545a.m37449y(rj4Var, rj4Var2, z);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m37444t(final rj4 rj4Var, final rj4 rj4Var2, boolean z) {
        final View viewFindViewById = rj4Var2.f159627b.findViewById(u4c0.f174006R0);
        final View viewFindViewById2 = rj4Var.f159627b.findViewById(u4c0.f174006R0);
        final View viewFindViewById3 = rj4Var2.f159627b.findViewById(u4c0.f174344l6);
        final View viewFindViewById4 = rj4Var.f159627b.findViewById(u4c0.f174344l6);
        if (viewFindViewById3 == null || viewFindViewById4 == null || viewFindViewById == null || viewFindViewById2 == null) {
            xdl0.m208344M(rj4Var2.f159627b, false);
            xdl0.m208344M(rj4Var.f159627b, true);
            return;
        }
        float f = z ? -1.0f : 1.0f;
        viewFindViewById3.setAlpha(1.0f);
        ViewPropertyAnimator viewPropertyAnimatorWithStartAction = viewFindViewById3.animate().withStartAction(new Runnable() { // from class: l.fi4
            @Override // java.lang.Runnable
            public final void run() {
                C7868b.m37428n();
            }
        });
        int i = t100.f167236K;
        viewPropertyAnimatorWithStartAction.translationX(f * 1.0f * i).alpha(0.0f).setDuration(100L).withEndAction(new Runnable() { // from class: l.gi4
            @Override // java.lang.Runnable
            public final void run() {
                C7868b.m37431q(viewFindViewById3, rj4Var2);
            }
        }).start();
        viewFindViewById4.setTranslationX(f * (-1.0f) * i);
        viewFindViewById4.setAlpha(0.0f);
        viewFindViewById4.animate().withStartAction(new Runnable() { // from class: l.hi4
            @Override // java.lang.Runnable
            public final void run() {
                rj4Var.f159627b.setVisibility(0);
            }
        }).translationX(0.0f).alpha(1.0f).setDuration(100L).withEndAction(new Runnable() { // from class: l.ii4
            @Override // java.lang.Runnable
            public final void run() {
                C7868b.m37426l(viewFindViewById4, rj4Var);
            }
        }).start();
        xdl0.m208341K0(viewFindViewById2, xdl0.m208380i0(viewFindViewById), xdl0.m208380i0(viewFindViewById2));
        viewFindViewById.animate().cancel();
        viewFindViewById2.animate().withStartAction(new Runnable() { // from class: l.ji4
            @Override // java.lang.Runnable
            public final void run() {
                C7868b.m37425k(viewFindViewById, viewFindViewById2);
            }
        }).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(100L).withEndAction(new Runnable() { // from class: l.ki4
            @Override // java.lang.Runnable
            public final void run() {
                C7868b.m37427m(viewFindViewById2, viewFindViewById4, viewFindViewById);
            }
        }).start();
    }

    /* JADX INFO: renamed from: u */
    public CardBottomFrame m37445u() {
        rj4 rj4Var = this.f22011l;
        if (rj4Var != null) {
            return rj4Var.m179546a();
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public rj4 m37446v() {
        rj4 rj4Var = this.f22011l;
        if (rj4Var != null) {
            return rj4Var;
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public C7870d m37447w() {
        return this.f22009j;
    }

    @Override // p149l.bol
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo37436e(d5m d5mVar, User user, CoreSuggested.UserInfo userInfo, boolean z, CoreMomentInfo coreMomentInfo) {
        this.f22000a = user;
        this.f22001b = userInfo;
        this.f22002c = z;
        this.f22003d = coreMomentInfo;
        List<CardBottomFrame> listM37417h = C7867a.m37414i().m37417h();
        C7870d c7870d = new C7870d();
        this.f22009j = c7870d;
        c7870d.m37489q(this.f22007h);
        this.f22009j.m37492t(user);
        this.f22009j.m37488p(coreMomentInfo);
        this.f22009j.m37493u(userInfo);
        this.f22009j.m37491s(z);
        this.f22008i.clear();
        int i = 0;
        for (CardBottomFrame cardBottomFrame : listM37417h) {
            wl2 wl2VarM37420l = C7867a.m37414i().m37420l(cardBottomFrame);
            if (wl2VarM37420l.mo100260a(this.f22009j, i, cardBottomFrame, this.f22004e)) {
                if (this.f22009j.f22037j.f22040a == null && wl2VarM37420l.mo100265i()) {
                    this.f22009j.f22037j.f22040a = cardBottomFrame;
                }
                i++;
                this.f22008i.add(cardBottomFrame);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m37449y(rj4 rj4Var, rj4 rj4Var2, boolean z) {
        rj4Var.f159627b.setVisibility(0);
        m37444t(rj4Var, rj4Var2, z);
    }

    @Override // p149l.bol
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo37439h(d5m d5mVar) {
    }

    /* JADX INFO: renamed from: z */
    public final void m37450z(rj4 rj4Var) {
    }
}
