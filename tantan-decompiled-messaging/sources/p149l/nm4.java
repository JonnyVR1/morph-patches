package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.view.CardUserLevelView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VMarqueeText;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class nm4 {
    /* JADX INFO: renamed from: a */
    public static void m160085a(CardUserLevelView cardUserLevelView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardUserLevelView.f51906a = (RelativeLayout) viewGroup.getChildAt(0);
        cardUserLevelView.f51907b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardUserLevelView.f51908c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cardUserLevelView.f51909d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        cardUserLevelView.f51910e = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        cardUserLevelView.f51911f = (RelativeLayout) viewGroup.getChildAt(1);
        cardUserLevelView.f51912g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardUserLevelView.f51913h = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cardUserLevelView.f51914i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        cardUserLevelView.f51915j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        cardUserLevelView.f51916k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        cardUserLevelView.f51917l = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        cardUserLevelView.f51918m = (AnimEffectPlayer) viewGroup.getChildAt(2);
    }
}
