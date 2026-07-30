package p153l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8021d;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomIntlLiveLayout;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;

/* JADX INFO: loaded from: classes11.dex */
public class u6j extends em2 {
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m194712o(C8021d c8021d, CardBottomIntlLiveLayout cardBottomIntlLiveLayout, Context context, View view) {
        if (NullChecker.m82486a(c8021d.getUser())) {
            cardBottomIntlLiveLayout.f24230g.setText(c8021d.getUser().isFemale() ? R$string.f19680th : R$string.f19711uh);
            CoreModule.m30934Q().startAudienceLive(context, CoreModule.m30934Q().getUserLiveId(c8021d.getUser().f56859id), "suggest-card", null);
            tvn.m192813a("p_suggest_users_home_view", c8021d.getUser());
            CoreModule.f18264c.f20405m0.m32096d8(c8021d.getUser().f56859id);
        }
        CoreModule.f18264c.f20405m0.f20156g2.m137019l(SwipeDirection.RIGHT);
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: c */
    public void mo96365c(final C8021d c8021d, View view, FrameLayout frameLayout, int i, final Context context) {
        super.mo96365c(c8021d, view, frameLayout, i, context);
        if (view instanceof CardBottomIntlLiveLayout) {
            c8021d.f22779j.m38499a(true);
            final CardBottomIntlLiveLayout cardBottomIntlLiveLayout = (CardBottomIntlLiveLayout) view;
            m121321k(cardBottomIntlLiveLayout.f24231h, c8021d, i);
            cardBottomIntlLiveLayout.f24228e.loadAnimWithListener("core_intl_living_card_entrance.svga", -1, new AnimListener(), true);
            bnl0.m105509E0(cardBottomIntlLiveLayout.f24229f, new View.OnClickListener() { // from class: l.t6j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    u6j.m194712o(c8021d, cardBottomIntlLiveLayout, context, view2);
                }
            });
            if (d79.m114691m0()) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardBottomIntlLiveLayout.f24227d.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) cardBottomIntlLiveLayout.f24231h.getLayoutParams();
            layoutParams2.removeRule(3);
            layoutParams.addRule(3, cardBottomIntlLiveLayout.f24231h.getId());
            layoutParams.bottomMargin = qa00.f156330q;
            layoutParams2.bottomMargin = qa00.f156326m;
            cardBottomIntlLiveLayout.f24227d.setLayoutParams(layoutParams);
            cardBottomIntlLiveLayout.f24231h.setLayoutParams(layoutParams2);
        }
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: d */
    public void mo96471d(FrameLayout.LayoutParams layoutParams) {
        super.mo96471d(layoutParams);
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: i */
    public boolean mo96366i() {
        return true;
    }

    @Override // p153l.qql
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean mo96364a(C8021d c8021d, int i, CardBottomFrame cardBottomFrame, Context context) {
        return NullChecker.m82486a(c8021d.getUser()) && CoreModule.f18264c.f20405m0.m32023L6(c8021d.getUser().f56859id) && c8021d.f22779j.f22782a == null;
    }
}
