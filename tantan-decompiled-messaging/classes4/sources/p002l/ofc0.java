package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftAudienceView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ofc0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m19442a(ReceiveGiftAudienceView receiveGiftAudienceView, View view) {
        receiveGiftAudienceView._root = (ReceiveGiftAudienceView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        receiveGiftAudienceView._head = (CommonAnimMaskAvatarView) viewGroup.getChildAt(0);
        receiveGiftAudienceView._name = viewGroup.getChildAt(1);
    }
}
