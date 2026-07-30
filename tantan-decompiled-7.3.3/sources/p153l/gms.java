package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.p051p1.mobile.putong.live.livingroom.view.LiveGiftTrayView;
import com.p051p1.mobile.putong.live.livingroom.view.TrayBackground;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class gms {
    /* JADX INFO: renamed from: a */
    public static void m130829a(LiveGiftTrayView liveGiftTrayView, View view) {
        liveGiftTrayView.f52795d = (LiveGiftTrayView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveGiftTrayView.f52796e = (TrayBackground) viewGroup.getChildAt(0);
        liveGiftTrayView.f52797f = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        liveGiftTrayView.f52798g = (VDraweeView) viewGroup.getChildAt(2);
        liveGiftTrayView.f52799h = (LiveGradientTextView) viewGroup.getChildAt(3);
        liveGiftTrayView.f52800i = (VText) viewGroup.getChildAt(4);
        liveGiftTrayView.f52801j = (VDraweeView) viewGroup.getChildAt(5);
        liveGiftTrayView.f52802k = (VImage) viewGroup.getChildAt(6);
        liveGiftTrayView.f52803l = (VText) viewGroup.getChildAt(7);
        liveGiftTrayView.f52804m = (LinearLayout) viewGroup.getChildAt(8);
        liveGiftTrayView.f52805n = (VText) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        liveGiftTrayView.f52806o = (VText) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1);
        liveGiftTrayView.f52807p = (AnimEffectPlayer) viewGroup.getChildAt(9);
        liveGiftTrayView.f52808q = (VDraweeView) viewGroup.getChildAt(10);
        liveGiftTrayView.f52809r = (VDraweeView) viewGroup.getChildAt(11);
    }
}
