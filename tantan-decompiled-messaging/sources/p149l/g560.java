package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.packetgift.PacketGiftExpirationView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class g560 {
    /* JADX INFO: renamed from: a */
    public static void m124472a(PacketGiftExpirationView packetGiftExpirationView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        packetGiftExpirationView.f49889a = (VFrame) viewGroup.getChildAt(0);
        packetGiftExpirationView.f49890b = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        packetGiftExpirationView.f49891c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        packetGiftExpirationView.f49892d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        packetGiftExpirationView.f49893e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        packetGiftExpirationView.f49894f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
    }
}
