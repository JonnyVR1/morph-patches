package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.p046p1.mobile.putong.live.livingroom.view.LiveGiftTrayView;
import com.p046p1.mobile.putong.live.livingroom.view.TrayBackground;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class fks {
    /* JADX INFO: renamed from: a */
    public static void m121888a(LiveGiftTrayView liveGiftTrayView, View view) {
        liveGiftTrayView.f51947d = (LiveGiftTrayView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveGiftTrayView.f51948e = (TrayBackground) viewGroup.getChildAt(0);
        liveGiftTrayView.f51949f = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        liveGiftTrayView.f51950g = (VDraweeView) viewGroup.getChildAt(2);
        liveGiftTrayView.f51951h = (LiveGradientTextView) viewGroup.getChildAt(3);
        liveGiftTrayView.f51952i = (VText) viewGroup.getChildAt(4);
        liveGiftTrayView.f51953j = (VDraweeView) viewGroup.getChildAt(5);
        liveGiftTrayView.f51954k = (VImage) viewGroup.getChildAt(6);
        liveGiftTrayView.f51955l = (VText) viewGroup.getChildAt(7);
        liveGiftTrayView.f51956m = (LinearLayout) viewGroup.getChildAt(8);
        liveGiftTrayView.f51957n = (VText) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        liveGiftTrayView.f51958o = (VText) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1);
        liveGiftTrayView.f51959p = (AnimEffectPlayer) viewGroup.getChildAt(9);
        liveGiftTrayView.f51960q = (VDraweeView) viewGroup.getChildAt(10);
        liveGiftTrayView.f51961r = (VDraweeView) viewGroup.getChildAt(11);
    }
}
