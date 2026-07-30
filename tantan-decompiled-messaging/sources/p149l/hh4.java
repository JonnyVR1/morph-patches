package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomIntlLiveLayout;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hh4 {
    /* JADX INFO: renamed from: a */
    public static void m130939a(CardBottomIntlLiveLayout cardBottomIntlLiveLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomIntlLiveLayout.f23485d = (VFrame) viewGroup.getChildAt(0);
        cardBottomIntlLiveLayout.f23486e = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardBottomIntlLiveLayout.f23487f = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cardBottomIntlLiveLayout.f23488g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        cardBottomIntlLiveLayout.f23489h = (CardBottomBaseInfoView) viewGroup.getChildAt(1);
        cardBottomIntlLiveLayout.f23490i = viewGroup.getChildAt(2);
    }
}
