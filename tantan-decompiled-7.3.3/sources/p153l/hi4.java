package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomIntlVoiceLayout;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundFrameLayout;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class hi4 {
    /* JADX INFO: renamed from: a */
    public static void m135106a(CardBottomIntlVoiceLayout cardBottomIntlVoiceLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomIntlVoiceLayout.f24233d = (CardBottomBaseInfoView) viewGroup.getChildAt(0);
        cardBottomIntlVoiceLayout.f24234e = (RoundFrameLayout) viewGroup.getChildAt(1);
        cardBottomIntlVoiceLayout.f24235f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomIntlVoiceLayout.f24236g = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cardBottomIntlVoiceLayout.f24237h = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        cardBottomIntlVoiceLayout.f24238i = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        cardBottomIntlVoiceLayout.f24239j = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        cardBottomIntlVoiceLayout.f24240k = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(2);
        cardBottomIntlVoiceLayout.f24241l = viewGroup.getChildAt(2);
    }
}
