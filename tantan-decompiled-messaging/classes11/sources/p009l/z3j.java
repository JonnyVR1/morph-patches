package p009l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0034d;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomIntlLiveLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import l.t100;
import l.u59;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class z3j extends wl2 {
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m25587o(C0034d c0034d, CardBottomIntlLiveLayout cardBottomIntlLiveLayout, Context context, View view) {
        if (NullChecker.a(c0034d.getUser())) {
            cardBottomIntlLiveLayout.f2266g.setText(c0034d.getUser().isFemale() ? R.string.Yg : R.string.Zg);
            CoreModule.Q().startAudienceLive(context, CoreModule.Q().getUserLiveId(((DbObject) c0034d.getUser()).id), "suggest-card", null);
            ttn.m22660a("p_suggest_users_home_view", c0034d.getUser());
            CoreModule.c.m0.d8(((DbObject) c0034d.getUser()).id);
        }
        CoreModule.c.m0.g2.onNext(SwipeDirection.RIGHT);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.wl2
    /* JADX INFO: renamed from: c */
    public void mo11838c(final C0034d c0034d, View view, FrameLayout frameLayout, int i, final Context context) {
        super.mo11838c(c0034d, view, frameLayout, i, context);
        if (view instanceof CardBottomIntlLiveLayout) {
            c0034d.f815j.m1467a(true);
            final CardBottomIntlLiveLayout cardBottomIntlLiveLayout = (CardBottomIntlLiveLayout) view;
            m24310k(cardBottomIntlLiveLayout.f2267h, c0034d, i);
            cardBottomIntlLiveLayout.f2264e.loadAnimWithListener("core_intl_living_card_entrance.svga", -1, new AnimListener(), true);
            xdl0.E0(cardBottomIntlLiveLayout.f2265f, new View.OnClickListener() { // from class: l.y3j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    z3j.m25587o(c0034d, cardBottomIntlLiveLayout, context, view2);
                }
            });
            if (u59.i0()) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardBottomIntlLiveLayout.f2263d.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) cardBottomIntlLiveLayout.f2267h.getLayoutParams();
            layoutParams2.removeRule(3);
            layoutParams.addRule(3, cardBottomIntlLiveLayout.f2267h.getId());
            layoutParams.bottomMargin = t100.q;
            layoutParams2.bottomMargin = t100.m;
            cardBottomIntlLiveLayout.f2263d.setLayoutParams(layoutParams);
            cardBottomIntlLiveLayout.f2267h.setLayoutParams(layoutParams2);
        }
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: d */
    public void mo11839d(FrameLayout.LayoutParams layoutParams) {
        super.mo11839d(layoutParams);
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: i */
    public boolean mo11842i() {
        return true;
    }

    @Override // p009l.fol
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean mo11837a(C0034d c0034d, int i, CardBottomFrame cardBottomFrame, Context context) {
        return NullChecker.a(c0034d.getUser()) && CoreModule.c.m0.L6(((DbObject) c0034d.getUser()).id) && c0034d.f815j.f818a == null;
    }
}
