package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class xjs {
    /* JADX INFO: renamed from: a */
    public static void m211263a(LiveGiftItemView liveGiftItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveGiftItemView.f50362d = (VDraweeView) viewGroup.getChildAt(0);
        liveGiftItemView.f50363e = (AnimEffectPlayer) viewGroup.getChildAt(1);
        liveGiftItemView.f50364f = (VImage) viewGroup.getChildAt(2);
        liveGiftItemView.f50365g = (VText) viewGroup.getChildAt(3);
        liveGiftItemView.f50366h = (VText) viewGroup.getChildAt(4);
        liveGiftItemView.f50367i = (FrameLayout) viewGroup.getChildAt(5);
        liveGiftItemView.f50368j = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        liveGiftItemView.f50369k = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        liveGiftItemView.f50370l = (TextView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        liveGiftItemView.f50371m = viewGroup.getChildAt(6);
        liveGiftItemView.f50372n = (ProgressBar) viewGroup.getChildAt(7);
        liveGiftItemView.f50373o = (Group) viewGroup.getChildAt(8);
        liveGiftItemView.f50374p = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0)).getChildAt(0);
        liveGiftItemView.f50375q = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0)).getChildAt(1);
        liveGiftItemView.f50376r = viewGroup.getChildAt(10);
        liveGiftItemView.f50377s = viewGroup.getChildAt(11);
        liveGiftItemView.f50378t = (VText) viewGroup.getChildAt(12);
        liveGiftItemView.f50379u = (VText) viewGroup.getChildAt(13);
        liveGiftItemView.f50380v = viewGroup.getChildAt(14);
        liveGiftItemView.f50381w = (VText) viewGroup.getChildAt(15);
        liveGiftItemView.f50382x = (VText) viewGroup.getChildAt(16);
    }
}
