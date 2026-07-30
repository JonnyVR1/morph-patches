package p149l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7870d;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomIntlLiveLayout;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;

/* JADX INFO: loaded from: classes11.dex */
public class z3j extends wl2 {
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m217049o(C7870d c7870d, CardBottomIntlLiveLayout cardBottomIntlLiveLayout, Context context, View view) {
        if (NullChecker.m81303a(c7870d.getUser())) {
            cardBottomIntlLiveLayout.f23488g.setText(c7870d.getUser().isFemale() ? R$string.f18303Yg : R$string.f18333Zg);
            CoreModule.m29936Q().startAudienceLive(context, CoreModule.m29936Q().getUserLiveId(c7870d.getUser().f56011id), "suggest-card", null);
            ttn.m190607a("p_suggest_users_home_view", c7870d.getUser());
            CoreModule.f17545c.f19663m0.m31093d8(c7870d.getUser().f56011id);
        }
        CoreModule.f17545c.f19663m0.f19414g2.m132487l(SwipeDirection.RIGHT);
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: c */
    public void mo100261c(final C7870d c7870d, View view, FrameLayout frameLayout, int i, final Context context) {
        super.mo100261c(c7870d, view, frameLayout, i, context);
        if (view instanceof CardBottomIntlLiveLayout) {
            c7870d.f22037j.m37496a(true);
            final CardBottomIntlLiveLayout cardBottomIntlLiveLayout = (CardBottomIntlLiveLayout) view;
            m203741k(cardBottomIntlLiveLayout.f23489h, c7870d, i);
            cardBottomIntlLiveLayout.f23486e.loadAnimWithListener("core_intl_living_card_entrance.svga", -1, new AnimListener(), true);
            xdl0.m208329E0(cardBottomIntlLiveLayout.f23487f, new View.OnClickListener() { // from class: l.y3j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    z3j.m217049o(c7870d, cardBottomIntlLiveLayout, context, view2);
                }
            });
            if (u59.m191833i0()) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardBottomIntlLiveLayout.f23485d.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) cardBottomIntlLiveLayout.f23489h.getLayoutParams();
            layoutParams2.removeRule(3);
            layoutParams.addRule(3, cardBottomIntlLiveLayout.f23489h.getId());
            layoutParams.bottomMargin = t100.f167268q;
            layoutParams2.bottomMargin = t100.f167264m;
            cardBottomIntlLiveLayout.f23485d.setLayoutParams(layoutParams);
            cardBottomIntlLiveLayout.f23489h.setLayoutParams(layoutParams2);
        }
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: d */
    public void mo100262d(FrameLayout.LayoutParams layoutParams) {
        super.mo100262d(layoutParams);
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: i */
    public boolean mo100265i() {
        return true;
    }

    @Override // p149l.fol
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean mo100260a(C7870d c7870d, int i, CardBottomFrame cardBottomFrame, Context context) {
        return NullChecker.m81303a(c7870d.getUser()) && CoreModule.f17545c.f19663m0.m31020L6(c7870d.getUser().f56011id) && c7870d.f22037j.f22040a == null;
    }
}
