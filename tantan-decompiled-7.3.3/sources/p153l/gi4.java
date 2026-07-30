package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomIntlLiveLayout;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class gi4 {
    /* JADX INFO: renamed from: a */
    public static void m130284a(CardBottomIntlLiveLayout cardBottomIntlLiveLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomIntlLiveLayout.f24227d = (VFrame) viewGroup.getChildAt(0);
        cardBottomIntlLiveLayout.f24228e = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardBottomIntlLiveLayout.f24229f = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cardBottomIntlLiveLayout.f24230g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        cardBottomIntlLiveLayout.f24231h = (CardBottomBaseInfoView) viewGroup.getChildAt(1);
        cardBottomIntlLiveLayout.f24232i = viewGroup.getChildAt(2);
    }
}
