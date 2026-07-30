package p153l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8021d;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public abstract class em2 implements qql<C8021d, FrameLayout, View> {

    /* JADX INFO: renamed from: a */
    public static int f94611a = qa00.m175859d(16.0f);

    /* JADX INFO: renamed from: b */
    public static int f94612b = qa00.m175859d(110.0f);

    /* JADX INFO: renamed from: b */
    public void m121316b(FrameLayout frameLayout, View view) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        layoutParams.leftMargin = m121317e();
        layoutParams.rightMargin = m121318f();
        mo96471d(layoutParams);
        frameLayout.addView(view, layoutParams);
    }

    /* JADX INFO: renamed from: e */
    public int m121317e() {
        return f94611a;
    }

    /* JADX INFO: renamed from: f */
    public int m121318f() {
        return f94612b;
    }

    /* JADX INFO: renamed from: g */
    public int mo121319g() {
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public int mo121320h() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo96366i() {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public void m121321k(CardBottomBaseInfoView cardBottomBaseInfoView, C8021d c8021d, int i) {
        m121322l(cardBottomBaseInfoView, c8021d, i, null);
    }

    /* JADX INFO: renamed from: l */
    public void m121322l(CardBottomBaseInfoView cardBottomBaseInfoView, C8021d c8021d, int i, User user) {
        if (!NullChecker.m82486a(user)) {
            user = c8021d.getUser();
        }
        cardBottomBaseInfoView.setHideCertificationIcon(c8021d.m38478c());
        cardBottomBaseInfoView.m39901q(user, i, c8021d.mo38482g(), false);
    }

    /* JADX INFO: renamed from: m */
    public void m121323m(CardUserContentView cardUserContentView, C8021d c8021d, int i) {
        m121324n(cardUserContentView, c8021d, i, null);
    }

    /* JADX INFO: renamed from: n */
    public void m121324n(CardUserContentView cardUserContentView, C8021d c8021d, int i, User user) {
        if (!NullChecker.m82486a(user)) {
            user = NullChecker.m82486a(c8021d) ? c8021d.getUser() : null;
        }
        CardUserContentView.C8210b c8210bM40138b = CardUserContentView.C8210b.m40138b();
        c8210bM40138b.f24545b = NullChecker.m82486a(c8021d) && c8021d.mo38480e();
        c8210bM40138b.f24544a = NullChecker.m82486a(c8021d) && c8021d.m38485j();
        c8210bM40138b.f24546c = NullChecker.m82486a(c8021d) && c8021d.mo38482g();
        c8210bM40138b.f24547d = NullChecker.m82486a(c8021d) && c8021d.m38486k();
        c8210bM40138b.f24548e = NullChecker.m82486a(c8021d);
        c8210bM40138b.f24549f = NullChecker.m82486a(c8021d);
        c8210bM40138b.f24550g = user;
        c8210bM40138b.f24551h = NullChecker.m82486a(c8021d) ? c8021d.getUserInfo() : null;
        bnl0.m105524M(cardUserContentView.f24523g, false);
        c8210bM40138b.f24552i = gra.m131630T2();
        cardUserContentView.m40127X(user, i, true, c8210bM40138b);
    }

    /* JADX INFO: renamed from: d */
    public void mo96471d(FrameLayout.LayoutParams layoutParams) {
    }

    /* JADX INFO: renamed from: j */
    public void mo96367j(C8021d c8021d, qk4 qk4Var, int i) {
    }

    /* JADX INFO: renamed from: c */
    public void mo96365c(C8021d c8021d, View view, FrameLayout frameLayout, int i, Context context) {
    }
}
