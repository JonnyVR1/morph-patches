package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.packetgift.PacketGiftExpirationView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class md60 {
    /* JADX INFO: renamed from: a */
    public static void m157959a(PacketGiftExpirationView packetGiftExpirationView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        packetGiftExpirationView.f50737a = (VFrame) viewGroup.getChildAt(0);
        packetGiftExpirationView.f50738b = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        packetGiftExpirationView.f50739c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        packetGiftExpirationView.f50740d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        packetGiftExpirationView.f50741e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        packetGiftExpirationView.f50742f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
    }
}
