package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.packetgift.PacketGiftActionTipsView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftOuterContentView;
import p151v.VImage;
import p151v.VPager;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class dvj {
    /* JADX INFO: renamed from: a */
    public static void m118283a(GiftOuterContentView giftOuterContentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftOuterContentView.f51185d = (VPager) viewGroup.getChildAt(0);
        giftOuterContentView.f51186e = (VImage) viewGroup.getChildAt(1);
        giftOuterContentView.f51187f = (VText) viewGroup.getChildAt(2);
        giftOuterContentView.f51188g = (Group) viewGroup.getChildAt(3);
        giftOuterContentView.f51189h = (PacketGiftActionTipsView) viewGroup.getChildAt(4);
    }
}
