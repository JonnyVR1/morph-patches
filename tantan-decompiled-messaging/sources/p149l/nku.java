package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class nku {
    /* JADX INFO: renamed from: a */
    public static void m160005a(LiveVChatGiftItemView liveVChatGiftItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatGiftItemView.f45189d = (VDraweeView) viewGroup.getChildAt(0);
        liveVChatGiftItemView.f45190e = (AnimEffectPlayer) viewGroup.getChildAt(1);
        liveVChatGiftItemView.f45191f = (VImage) viewGroup.getChildAt(2);
        liveVChatGiftItemView.f45192g = (VText) viewGroup.getChildAt(3);
        liveVChatGiftItemView.f45193h = (VText) viewGroup.getChildAt(4);
        liveVChatGiftItemView.f45194i = (FrameLayout) viewGroup.getChildAt(5);
        liveVChatGiftItemView.f45195j = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        liveVChatGiftItemView.f45196k = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        liveVChatGiftItemView.f45197l = (TextView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        liveVChatGiftItemView.f45198m = viewGroup.getChildAt(6);
        liveVChatGiftItemView.f45199n = (ProgressBar) viewGroup.getChildAt(7);
        liveVChatGiftItemView.f45200o = (Group) viewGroup.getChildAt(8);
        liveVChatGiftItemView.f45201p = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0)).getChildAt(0);
        liveVChatGiftItemView.f45202q = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0)).getChildAt(1);
        liveVChatGiftItemView.f45203r = viewGroup.getChildAt(10);
        liveVChatGiftItemView.f45204s = viewGroup.getChildAt(11);
        liveVChatGiftItemView.f45205t = (VText) viewGroup.getChildAt(12);
        liveVChatGiftItemView.f45206u = (VText) viewGroup.getChildAt(13);
        liveVChatGiftItemView.f45207v = viewGroup.getChildAt(14);
        liveVChatGiftItemView.f45208w = (VText) viewGroup.getChildAt(15);
        liveVChatGiftItemView.f45209x = (VText) viewGroup.getChildAt(16);
    }
}
