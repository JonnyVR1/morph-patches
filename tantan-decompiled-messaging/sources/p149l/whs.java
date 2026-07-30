package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class whs {
    /* JADX INFO: renamed from: a */
    public static void m203242a(LiveGiftItemView liveGiftItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveGiftItemView.f49514d = (VDraweeView) viewGroup.getChildAt(0);
        liveGiftItemView.f49515e = (AnimEffectPlayer) viewGroup.getChildAt(1);
        liveGiftItemView.f49516f = (VImage) viewGroup.getChildAt(2);
        liveGiftItemView.f49517g = (VText) viewGroup.getChildAt(3);
        liveGiftItemView.f49518h = (VText) viewGroup.getChildAt(4);
        liveGiftItemView.f49519i = (FrameLayout) viewGroup.getChildAt(5);
        liveGiftItemView.f49520j = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        liveGiftItemView.f49521k = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        liveGiftItemView.f49522l = (TextView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        liveGiftItemView.f49523m = viewGroup.getChildAt(6);
        liveGiftItemView.f49524n = (ProgressBar) viewGroup.getChildAt(7);
        liveGiftItemView.f49525o = (Group) viewGroup.getChildAt(8);
        liveGiftItemView.f49526p = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0)).getChildAt(0);
        liveGiftItemView.f49527q = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0)).getChildAt(1);
        liveGiftItemView.f49528r = viewGroup.getChildAt(10);
        liveGiftItemView.f49529s = viewGroup.getChildAt(11);
        liveGiftItemView.f49530t = (VText) viewGroup.getChildAt(12);
        liveGiftItemView.f49531u = (VText) viewGroup.getChildAt(13);
        liveGiftItemView.f49532v = viewGroup.getChildAt(14);
        liveGiftItemView.f49533w = (VText) viewGroup.getChildAt(15);
        liveGiftItemView.f49534x = (VText) viewGroup.getChildAt(16);
    }
}
