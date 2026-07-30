package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.view.CardAnchorLevelView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VMarqueeText;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class mh4 {
    /* JADX INFO: renamed from: a */
    public static void m158410a(CardAnchorLevelView cardAnchorLevelView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardAnchorLevelView.f52712a = (RelativeLayout) viewGroup.getChildAt(0);
        cardAnchorLevelView.f52713b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardAnchorLevelView.f52714c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cardAnchorLevelView.f52715d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        cardAnchorLevelView.f52716e = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        cardAnchorLevelView.f52717f = (RelativeLayout) viewGroup.getChildAt(1);
        cardAnchorLevelView.f52718g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardAnchorLevelView.f52719h = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cardAnchorLevelView.f52720i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        cardAnchorLevelView.f52721j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        cardAnchorLevelView.f52722k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        cardAnchorLevelView.f52723l = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        cardAnchorLevelView.f52724m = (AnimEffectPlayer) viewGroup.getChildAt(2);
    }
}
