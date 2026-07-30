package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.view.CardAnchorLevelView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VMarqueeText;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ng4 {
    /* JADX INFO: renamed from: a */
    public static void m159292a(CardAnchorLevelView cardAnchorLevelView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardAnchorLevelView.f51864a = (RelativeLayout) viewGroup.getChildAt(0);
        cardAnchorLevelView.f51865b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardAnchorLevelView.f51866c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cardAnchorLevelView.f51867d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        cardAnchorLevelView.f51868e = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        cardAnchorLevelView.f51869f = (RelativeLayout) viewGroup.getChildAt(1);
        cardAnchorLevelView.f51870g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardAnchorLevelView.f51871h = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cardAnchorLevelView.f51872i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        cardAnchorLevelView.f51873j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        cardAnchorLevelView.f51874k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        cardAnchorLevelView.f51875l = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        cardAnchorLevelView.f51876m = (AnimEffectPlayer) viewGroup.getChildAt(2);
    }
}
