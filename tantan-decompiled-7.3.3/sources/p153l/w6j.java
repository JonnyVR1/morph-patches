package p153l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LiveLivingCardDataWrapper;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.Voice;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8021d;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomIntlVoiceLayout;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;

/* JADX INFO: loaded from: classes11.dex */
public class w6j extends em2 {
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m205103o(C8021d c8021d, View view) {
        if (NullChecker.m82486a(c8021d.getUser())) {
            LiveLivingCardDataWrapper liveLivingCardDataWrapper = c8021d.getUserInfo().intlLiveCardPartDataWrapper;
            if (NullChecker.m82486a(liveLivingCardDataWrapper)) {
                Voice currentVoice = liveLivingCardDataWrapper.getCurrentVoice();
                if (NullChecker.m82486a(currentVoice)) {
                    CoreModule.m30934Q().mo68475wd(view.getContext(), currentVoice.voiceRoomId, "suggest-card", null);
                }
            }
            m205104q();
        }
        CoreModule.f18264c.f20405m0.f20156g2.m137019l(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: q */
    public static void m205104q() {
        i4g0.m138523u("e_intl_card_audio", "p_suggest_users_home_view", pf60.m172085a("intl_card_audio_ux", 2));
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: c */
    public void mo96365c(final C8021d c8021d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo96365c(c8021d, view, frameLayout, i, context);
        c8021d.f22779j.m38499a(true);
        CardBottomIntlVoiceLayout cardBottomIntlVoiceLayout = (CardBottomIntlVoiceLayout) view;
        m121321k(cardBottomIntlVoiceLayout.f24233d, c8021d, i);
        uqb0.f180374G.m127115L0(cardBottomIntlVoiceLayout.f24235f, "https://auto.tancdn.com/v1/images/eyJpZCI6Ik4zSk1HV01CNFVUMzVZS1lDR05SN1FTWVdKVU1KNjEzIiwidyI6OTgxLCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyODkzNjA2OTEzNTIzMDY2OTJ9.png");
        if (NullChecker.m82486a(c8021d.getUser())) {
            uqb0.f180374G.m127125Q0(cardBottomIntlVoiceLayout.f24239j, c8021d.getUser().m61308fp().profileSmall());
        }
        cardBottomIntlVoiceLayout.f24240k.loadAnimWithListener("core_intl_voice_card_head.svga", -1, new AnimListener(), true);
        cardBottomIntlVoiceLayout.f24236g.loadAnimWithListener("core_intl_voice_card_bg.svga", -1, new AnimListener(), true);
        bnl0.m105509E0(cardBottomIntlVoiceLayout.f24237h, new View.OnClickListener() { // from class: l.v6j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                w6j.m205103o(c8021d, view2);
            }
        });
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: d */
    public void mo96471d(FrameLayout.LayoutParams layoutParams) {
        super.mo96471d(layoutParams);
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: g */
    public int mo121319g() {
        return qa00.m175859d(138.0f);
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: h */
    public int mo121320h() {
        return qa00.f156305R;
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: i */
    public boolean mo96366i() {
        return true;
    }

    @Override // p153l.qql
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean mo96364a(C8021d c8021d, int i, CardBottomFrame cardBottomFrame, Context context) {
        if (!NullChecker.m82486a(c8021d.getUser()) || !CoreModule.f18264c.f20405m0.m32027M6(c8021d.getUser().f56859id) || c8021d.f22779j.f22782a != null) {
            return false;
        }
        c8021d.m38497v(cardBottomFrame, qa00.m175859d(121.0f));
        return true;
    }
}
