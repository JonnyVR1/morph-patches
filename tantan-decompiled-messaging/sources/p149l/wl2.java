package p149l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7870d;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public abstract class wl2 implements fol<C7870d, FrameLayout, View> {

    /* JADX INFO: renamed from: a */
    public static int f186860a = t100.m186890d(16.0f);

    /* JADX INFO: renamed from: b */
    public static int f186861b = t100.m186890d(110.0f);

    /* JADX INFO: renamed from: b */
    public void m203738b(FrameLayout frameLayout, View view) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        layoutParams.leftMargin = m203739e();
        layoutParams.rightMargin = m203740f();
        mo100262d(layoutParams);
        frameLayout.addView(view, layoutParams);
    }

    /* JADX INFO: renamed from: e */
    public int m203739e() {
        return f186860a;
    }

    /* JADX INFO: renamed from: f */
    public int m203740f() {
        return f186861b;
    }

    /* JADX INFO: renamed from: g */
    public int mo100263g() {
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public int mo100264h() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo100265i() {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public void m203741k(CardBottomBaseInfoView cardBottomBaseInfoView, C7870d c7870d, int i) {
        m203742l(cardBottomBaseInfoView, c7870d, i, null);
    }

    /* JADX INFO: renamed from: l */
    public void m203742l(CardBottomBaseInfoView cardBottomBaseInfoView, C7870d c7870d, int i, User user) {
        if (!NullChecker.m81303a(user)) {
            user = c7870d.getUser();
        }
        cardBottomBaseInfoView.setHideCertificationIcon(c7870d.m37475c());
        cardBottomBaseInfoView.m38898q(user, i, c7870d.mo37479g(), false);
    }

    /* JADX INFO: renamed from: m */
    public void m203743m(CardUserContentView cardUserContentView, C7870d c7870d, int i) {
        m203744n(cardUserContentView, c7870d, i, null);
    }

    /* JADX INFO: renamed from: n */
    public void m203744n(CardUserContentView cardUserContentView, C7870d c7870d, int i, User user) {
        if (!NullChecker.m81303a(user)) {
            user = NullChecker.m81303a(c7870d) ? c7870d.getUser() : null;
        }
        CardUserContentView.C8059b c8059bM39135b = CardUserContentView.C8059b.m39135b();
        c8059bM39135b.f23803b = NullChecker.m81303a(c7870d) && c7870d.mo37477e();
        c8059bM39135b.f23802a = NullChecker.m81303a(c7870d) && c7870d.m37482j();
        c8059bM39135b.f23804c = NullChecker.m81303a(c7870d) && c7870d.mo37479g();
        c8059bM39135b.f23805d = NullChecker.m81303a(c7870d) && c7870d.m37483k();
        c8059bM39135b.f23806e = NullChecker.m81303a(c7870d);
        c8059bM39135b.f23807f = NullChecker.m81303a(c7870d);
        c8059bM39135b.f23808g = user;
        c8059bM39135b.f23809h = NullChecker.m81303a(c7870d) ? c7870d.getUserInfo() : null;
        xdl0.m208344M(cardUserContentView.f23781g, false);
        c8059bM39135b.f23810i = upa.m194699T2();
        cardUserContentView.m39124X(user, i, true, c8059bM39135b);
    }

    /* JADX INFO: renamed from: d */
    public void mo100262d(FrameLayout.LayoutParams layoutParams) {
    }

    /* JADX INFO: renamed from: j */
    public void mo114808j(C7870d c7870d, rj4 rj4Var, int i) {
    }

    /* JADX INFO: renamed from: c */
    public void mo100261c(C7870d c7870d, View view, FrameLayout frameLayout, int i, Context context) {
    }
}
