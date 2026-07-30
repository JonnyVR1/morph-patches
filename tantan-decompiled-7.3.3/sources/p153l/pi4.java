package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomLiveView;
import com.p051p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pi4 {
    /* JADX INFO: renamed from: a */
    public static void m172352a(CardBottomLiveView cardBottomLiveView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomLiveView.f24261c = (CardBottomBaseInfoView) viewGroup.getChildAt(0);
        cardBottomLiveView.f24262d = (VLinear) viewGroup.getChildAt(1);
        cardBottomLiveView.f24263e = (CardUserContentView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomLiveView.f24264f = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cardBottomLiveView.f24265g = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        cardBottomLiveView.f24266h = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardBottomLiveView.f24267i = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        cardBottomLiveView.f24268j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        cardBottomLiveView.f24269k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        cardBottomLiveView.f24270l = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
    }
}
