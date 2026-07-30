package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.view.CardUserLevelView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VMarqueeText;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class mn4 {
    /* JADX INFO: renamed from: a */
    public static void m159112a(CardUserLevelView cardUserLevelView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardUserLevelView.f52754a = (RelativeLayout) viewGroup.getChildAt(0);
        cardUserLevelView.f52755b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardUserLevelView.f52756c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cardUserLevelView.f52757d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        cardUserLevelView.f52758e = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        cardUserLevelView.f52759f = (RelativeLayout) viewGroup.getChildAt(1);
        cardUserLevelView.f52760g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardUserLevelView.f52761h = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cardUserLevelView.f52762i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        cardUserLevelView.f52763j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        cardUserLevelView.f52764k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        cardUserLevelView.f52765l = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        cardUserLevelView.f52766m = (AnimEffectPlayer) viewGroup.getChildAt(2);
    }
}
