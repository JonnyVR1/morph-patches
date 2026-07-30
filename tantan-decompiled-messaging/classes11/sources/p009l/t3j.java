package p009l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0034d;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomDefaultLayout;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.tantanapp.common.data.DbObject;
import l.o6j0;
import l.t100;
import l.u59;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class t3j extends wl2 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.wl2
    /* JADX INFO: renamed from: c */
    public void mo11838c(C0034d c0034d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo11838c(c0034d, view, frameLayout, i, context);
        if (view instanceof CardBottomDefaultLayout) {
            CardBottomDefaultLayout cardBottomDefaultLayout = (CardBottomDefaultLayout) view;
            m24310k(cardBottomDefaultLayout.f2236c, c0034d, i);
            m24312m(cardBottomDefaultLayout.f2237d, c0034d, i);
            c0034d.f815j.m1467a(cardBottomDefaultLayout.f2237d.m3137V());
        }
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: d */
    public void mo11839d(FrameLayout.LayoutParams layoutParams) {
        super.mo11839d(layoutParams);
        layoutParams.leftMargin = t100.d(16.0f);
        layoutParams.rightMargin = t100.d(110.0f);
        if (IntlCountryCodeController.v()) {
            layoutParams.bottomMargin = t100.d(10.0f);
        }
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: i */
    public boolean mo11842i() {
        return true;
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: j */
    public void mo13735j(C0034d c0034d, rj4 rj4Var, int i) {
        super.mo13735j(c0034d, rj4Var, i);
        o6j0.h("e_card_default_information", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.h("receiver_user_id", ((DbObject) c0034d.getUser()).id)});
    }

    @Override // p009l.fol
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean mo11837a(C0034d c0034d, int i, CardBottomFrame cardBottomFrame, Context context) {
        if (c0034d.f815j.f818a != null) {
            return false;
        }
        if (u59.i0()) {
            c0034d.m1465v(cardBottomFrame, t100.d(85.0f));
            return true;
        }
        c0034d.m1465v(cardBottomFrame, t100.d(130.0f));
        return true;
    }
}
