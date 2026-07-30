package p149l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LiveLivingCardDataWrapper;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.Voice;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7870d;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomIntlVoiceLayout;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;

/* JADX INFO: loaded from: classes11.dex */
public class b4j extends wl2 {
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m100258o(C7870d c7870d, View view) {
        if (NullChecker.m81303a(c7870d.getUser())) {
            LiveLivingCardDataWrapper liveLivingCardDataWrapper = c7870d.getUserInfo().intlLiveCardPartDataWrapper;
            if (NullChecker.m81303a(liveLivingCardDataWrapper)) {
                Voice currentVoice = liveLivingCardDataWrapper.getCurrentVoice();
                if (NullChecker.m81303a(currentVoice)) {
                    CoreModule.m29936Q().mo67292wd(view.getContext(), currentVoice.voiceRoomId, "suggest-card", null);
                }
            }
            m100259q();
        }
        CoreModule.f17545c.f19663m0.f19414g2.m132487l(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: q */
    public static void m100259q() {
        zvf0.m220399u("e_intl_card_audio", "p_suggest_users_home_view", j760.m140076a("intl_card_audio_ux", 2));
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: c */
    public void mo100261c(final C7870d c7870d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo100261c(c7870d, view, frameLayout, i, context);
        c7870d.f22037j.m37496a(true);
        CardBottomIntlVoiceLayout cardBottomIntlVoiceLayout = (CardBottomIntlVoiceLayout) view;
        m203741k(cardBottomIntlVoiceLayout.f23491d, c7870d, i);
        qib0.f154691G.m102331L0(cardBottomIntlVoiceLayout.f23493f, "https://auto.tancdn.com/v1/images/eyJpZCI6Ik4zSk1HV01CNFVUMzVZS1lDR05SN1FTWVdKVU1KNjEzIiwidyI6OTgxLCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyODkzNjA2OTEzNTIzMDY2OTJ9.png");
        if (NullChecker.m81303a(c7870d.getUser())) {
            qib0.f154691G.m102341Q0(cardBottomIntlVoiceLayout.f23497j, c7870d.getUser().m60124fp().profileSmall());
        }
        cardBottomIntlVoiceLayout.f23498k.loadAnimWithListener("core_intl_voice_card_head.svga", -1, new AnimListener(), true);
        cardBottomIntlVoiceLayout.f23494g.loadAnimWithListener("core_intl_voice_card_bg.svga", -1, new AnimListener(), true);
        xdl0.m208329E0(cardBottomIntlVoiceLayout.f23495h, new View.OnClickListener() { // from class: l.a4j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b4j.m100258o(c7870d, view2);
            }
        });
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: d */
    public void mo100262d(FrameLayout.LayoutParams layoutParams) {
        super.mo100262d(layoutParams);
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: g */
    public int mo100263g() {
        return t100.m186890d(138.0f);
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: h */
    public int mo100264h() {
        return t100.f167243R;
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: i */
    public boolean mo100265i() {
        return true;
    }

    @Override // p149l.fol
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean mo100260a(C7870d c7870d, int i, CardBottomFrame cardBottomFrame, Context context) {
        if (!NullChecker.m81303a(c7870d.getUser()) || !CoreModule.f17545c.f19663m0.m31024M6(c7870d.getUser().f56011id) || c7870d.f22037j.f22040a != null) {
            return false;
        }
        c7870d.m37494v(cardBottomFrame, t100.m186890d(121.0f));
        return true;
    }
}
