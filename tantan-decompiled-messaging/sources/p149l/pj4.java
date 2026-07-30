package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.view.CardFansClubLevelView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VMarqueeText;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class pj4 {
    /* JADX INFO: renamed from: a */
    public static void m169784a(CardFansClubLevelView cardFansClubLevelView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardFansClubLevelView.f51883a = (RelativeLayout) viewGroup.getChildAt(0);
        cardFansClubLevelView.f51884b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardFansClubLevelView.f51885c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cardFansClubLevelView.f51886d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        cardFansClubLevelView.f51887e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        cardFansClubLevelView.f51888f = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        cardFansClubLevelView.f51889g = (RelativeLayout) viewGroup.getChildAt(1);
        cardFansClubLevelView.f51890h = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardFansClubLevelView.f51891i = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cardFansClubLevelView.f51892j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        cardFansClubLevelView.f51893k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        cardFansClubLevelView.f51894l = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        cardFansClubLevelView.f51895m = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        cardFansClubLevelView.f51896n = (AnimEffectPlayer) viewGroup.getChildAt(2);
    }
}
