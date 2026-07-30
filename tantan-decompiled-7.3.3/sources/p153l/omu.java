package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class omu {
    /* JADX INFO: renamed from: a */
    public static void m168281a(LiveVChatGiftItemView liveVChatGiftItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatGiftItemView.f46037d = (VDraweeView) viewGroup.getChildAt(0);
        liveVChatGiftItemView.f46038e = (AnimEffectPlayer) viewGroup.getChildAt(1);
        liveVChatGiftItemView.f46039f = (VImage) viewGroup.getChildAt(2);
        liveVChatGiftItemView.f46040g = (VText) viewGroup.getChildAt(3);
        liveVChatGiftItemView.f46041h = (VText) viewGroup.getChildAt(4);
        liveVChatGiftItemView.f46042i = (FrameLayout) viewGroup.getChildAt(5);
        liveVChatGiftItemView.f46043j = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        liveVChatGiftItemView.f46044k = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        liveVChatGiftItemView.f46045l = (TextView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        liveVChatGiftItemView.f46046m = viewGroup.getChildAt(6);
        liveVChatGiftItemView.f46047n = (ProgressBar) viewGroup.getChildAt(7);
        liveVChatGiftItemView.f46048o = (Group) viewGroup.getChildAt(8);
        liveVChatGiftItemView.f46049p = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0)).getChildAt(0);
        liveVChatGiftItemView.f46050q = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0)).getChildAt(1);
        liveVChatGiftItemView.f46051r = viewGroup.getChildAt(10);
        liveVChatGiftItemView.f46052s = viewGroup.getChildAt(11);
        liveVChatGiftItemView.f46053t = (VText) viewGroup.getChildAt(12);
        liveVChatGiftItemView.f46054u = (VText) viewGroup.getChildAt(13);
        liveVChatGiftItemView.f46055v = viewGroup.getChildAt(14);
        liveVChatGiftItemView.f46056w = (VText) viewGroup.getChildAt(15);
        liveVChatGiftItemView.f46057x = (VText) viewGroup.getChildAt(16);
    }
}
