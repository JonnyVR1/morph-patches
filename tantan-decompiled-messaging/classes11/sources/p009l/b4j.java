package p009l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0034d;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomIntlVoiceLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LiveLivingCardDataWrapper;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.Voice;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import l.j760;
import l.qib0;
import l.t100;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class b4j extends wl2 {
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m11835o(C0034d c0034d, View view) {
        if (NullChecker.a(c0034d.getUser())) {
            LiveLivingCardDataWrapper liveLivingCardDataWrapper = c0034d.getUserInfo().intlLiveCardPartDataWrapper;
            if (NullChecker.a(liveLivingCardDataWrapper)) {
                Voice currentVoice = liveLivingCardDataWrapper.getCurrentVoice();
                if (NullChecker.a(currentVoice)) {
                    CoreModule.Q().m9077wd(view.getContext(), currentVoice.voiceRoomId, "suggest-card", null);
                }
            }
            m11836q();
        }
        CoreModule.c.m0.g2.onNext(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: q */
    public static void m11836q() {
        zvf0.u("e_intl_card_audio", "p_suggest_users_home_view", new j760[]{j760.a("intl_card_audio_ux", 2)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.wl2
    /* JADX INFO: renamed from: c */
    public void mo11838c(final C0034d c0034d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo11838c(c0034d, view, frameLayout, i, context);
        c0034d.f815j.m1467a(true);
        CardBottomIntlVoiceLayout cardBottomIntlVoiceLayout = (CardBottomIntlVoiceLayout) view;
        m24310k(cardBottomIntlVoiceLayout.f2269d, c0034d, i);
        qib0.G.L0(cardBottomIntlVoiceLayout.f2271f, "https://auto.tancdn.com/v1/images/eyJpZCI6Ik4zSk1HV01CNFVUMzVZS1lDR05SN1FTWVdKVU1KNjEzIiwidyI6OTgxLCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyODkzNjA2OTEzNTIzMDY2OTJ9.png");
        if (NullChecker.a(c0034d.getUser())) {
            qib0.G.Q0(cardBottomIntlVoiceLayout.f2275j, c0034d.getUser().fp().profileSmall());
        }
        cardBottomIntlVoiceLayout.f2276k.loadAnimWithListener("core_intl_voice_card_head.svga", -1, new AnimListener(), true);
        cardBottomIntlVoiceLayout.f2272g.loadAnimWithListener("core_intl_voice_card_bg.svga", -1, new AnimListener(), true);
        xdl0.E0(cardBottomIntlVoiceLayout.f2273h, new View.OnClickListener() { // from class: l.a4j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b4j.m11835o(c0034d, view2);
            }
        });
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: d */
    public void mo11839d(FrameLayout.LayoutParams layoutParams) {
        super.mo11839d(layoutParams);
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: g */
    public int mo11840g() {
        return t100.d(138.0f);
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: h */
    public int mo11841h() {
        return t100.R;
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: i */
    public boolean mo11842i() {
        return true;
    }

    @Override // p009l.fol
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean mo11837a(C0034d c0034d, int i, CardBottomFrame cardBottomFrame, Context context) {
        if (!NullChecker.a(c0034d.getUser()) || !CoreModule.c.m0.M6(((DbObject) c0034d.getUser()).id) || c0034d.f815j.f818a != null) {
            return false;
        }
        c0034d.m1465v(cardBottomFrame, t100.d(121.0f));
        return true;
    }
}
