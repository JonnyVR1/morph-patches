package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.packetgift.PacketGiftActionTipsView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftOuterContentView;
import p147v.VImage;
import p147v.VPager;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class nsj {
    /* JADX INFO: renamed from: a */
    public static void m160781a(GiftOuterContentView giftOuterContentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftOuterContentView.f50337d = (VPager) viewGroup.getChildAt(0);
        giftOuterContentView.f50338e = (VImage) viewGroup.getChildAt(1);
        giftOuterContentView.f50339f = (VText) viewGroup.getChildAt(2);
        giftOuterContentView.f50340g = (Group) viewGroup.getChildAt(3);
        giftOuterContentView.f50341h = (PacketGiftActionTipsView) viewGroup.getChildAt(4);
    }
}
