package p009l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0034d;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p000p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.t100;
import l.upa;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class wl2 implements fol<C0034d, FrameLayout, View> {

    /* JADX INFO: renamed from: a */
    public static int f22171a = t100.d(16.0f);

    /* JADX INFO: renamed from: b */
    public static int f22172b = t100.d(110.0f);

    /* JADX INFO: renamed from: b */
    public void m24307b(FrameLayout frameLayout, View view) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        layoutParams.leftMargin = m24308e();
        layoutParams.rightMargin = m24309f();
        mo11839d(layoutParams);
        frameLayout.addView(view, layoutParams);
    }

    /* JADX INFO: renamed from: e */
    public int m24308e() {
        return f22171a;
    }

    /* JADX INFO: renamed from: f */
    public int m24309f() {
        return f22172b;
    }

    /* JADX INFO: renamed from: g */
    public int mo11840g() {
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public int mo11841h() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo11842i() {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public void m24310k(CardBottomBaseInfoView cardBottomBaseInfoView, C0034d c0034d, int i) {
        m24311l(cardBottomBaseInfoView, c0034d, i, null);
    }

    /* JADX INFO: renamed from: l */
    public void m24311l(CardBottomBaseInfoView cardBottomBaseInfoView, C0034d c0034d, int i, User user) {
        if (!NullChecker.a(user)) {
            user = c0034d.getUser();
        }
        cardBottomBaseInfoView.setHideCertificationIcon(c0034d.m1446c());
        cardBottomBaseInfoView.m2905q(user, i, c0034d.mo1450g(), false);
    }

    /* JADX INFO: renamed from: m */
    public void m24312m(CardUserContentView cardUserContentView, C0034d c0034d, int i) {
        m24313n(cardUserContentView, c0034d, i, null);
    }

    /* JADX INFO: renamed from: n */
    public void m24313n(CardUserContentView cardUserContentView, C0034d c0034d, int i, User user) {
        if (!NullChecker.a(user)) {
            user = NullChecker.a(c0034d) ? c0034d.getUser() : null;
        }
        CardUserContentView.C0223b c0223bM3151b = CardUserContentView.C0223b.m3151b();
        c0223bM3151b.f2581b = NullChecker.a(c0034d) && c0034d.mo1448e();
        c0223bM3151b.f2580a = NullChecker.a(c0034d) && c0034d.m1453j();
        c0223bM3151b.f2582c = NullChecker.a(c0034d) && c0034d.mo1450g();
        c0223bM3151b.f2583d = NullChecker.a(c0034d) && c0034d.m1454k();
        c0223bM3151b.f2584e = NullChecker.a(c0034d);
        c0223bM3151b.f2585f = NullChecker.a(c0034d);
        c0223bM3151b.f2586g = user;
        c0223bM3151b.f2587h = NullChecker.a(c0034d) ? c0034d.getUserInfo() : null;
        xdl0.M(cardUserContentView.f2559g, false);
        c0223bM3151b.f2588i = upa.T2();
        cardUserContentView.m3139X(user, i, true, c0223bM3151b);
    }

    /* JADX INFO: renamed from: d */
    public void mo11839d(FrameLayout.LayoutParams layoutParams) {
    }

    /* JADX INFO: renamed from: j */
    public void mo13735j(C0034d c0034d, rj4 rj4Var, int i) {
    }

    /* JADX INFO: renamed from: c */
    public void mo11838c(C0034d c0034d, View view, FrameLayout frameLayout, int i, Context context) {
    }
}
