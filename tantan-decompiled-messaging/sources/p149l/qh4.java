package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomLiveView;
import com.p046p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qh4 {
    /* JADX INFO: renamed from: a */
    public static void m174508a(CardBottomLiveView cardBottomLiveView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomLiveView.f23519c = (CardBottomBaseInfoView) viewGroup.getChildAt(0);
        cardBottomLiveView.f23520d = (VLinear) viewGroup.getChildAt(1);
        cardBottomLiveView.f23521e = (CardUserContentView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomLiveView.f23522f = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cardBottomLiveView.f23523g = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        cardBottomLiveView.f23524h = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardBottomLiveView.f23525i = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        cardBottomLiveView.f23526j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        cardBottomLiveView.f23527k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        cardBottomLiveView.f23528l = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
    }
}
