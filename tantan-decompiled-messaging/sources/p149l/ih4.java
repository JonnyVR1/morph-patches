package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomIntlVoiceLayout;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundFrameLayout;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class ih4 {
    /* JADX INFO: renamed from: a */
    public static void m136185a(CardBottomIntlVoiceLayout cardBottomIntlVoiceLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomIntlVoiceLayout.f23491d = (CardBottomBaseInfoView) viewGroup.getChildAt(0);
        cardBottomIntlVoiceLayout.f23492e = (RoundFrameLayout) viewGroup.getChildAt(1);
        cardBottomIntlVoiceLayout.f23493f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomIntlVoiceLayout.f23494g = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cardBottomIntlVoiceLayout.f23495h = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        cardBottomIntlVoiceLayout.f23496i = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        cardBottomIntlVoiceLayout.f23497j = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        cardBottomIntlVoiceLayout.f23498k = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(2);
        cardBottomIntlVoiceLayout.f23499l = viewGroup.getChildAt(2);
    }
}
