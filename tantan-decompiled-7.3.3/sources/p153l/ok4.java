package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.view.CardFansClubLevelView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VMarqueeText;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ok4 {
    /* JADX INFO: renamed from: a */
    public static void m167977a(CardFansClubLevelView cardFansClubLevelView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardFansClubLevelView.f52731a = (RelativeLayout) viewGroup.getChildAt(0);
        cardFansClubLevelView.f52732b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardFansClubLevelView.f52733c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cardFansClubLevelView.f52734d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        cardFansClubLevelView.f52735e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        cardFansClubLevelView.f52736f = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        cardFansClubLevelView.f52737g = (RelativeLayout) viewGroup.getChildAt(1);
        cardFansClubLevelView.f52738h = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardFansClubLevelView.f52739i = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cardFansClubLevelView.f52740j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        cardFansClubLevelView.f52741k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        cardFansClubLevelView.f52742l = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        cardFansClubLevelView.f52743m = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        cardFansClubLevelView.f52744n = (AnimEffectPlayer) viewGroup.getChildAt(2);
    }
}
