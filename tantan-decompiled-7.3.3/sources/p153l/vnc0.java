package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftAudienceView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class vnc0 {
    /* JADX INFO: renamed from: a */
    public static void m201971a(ReceiveGiftAudienceView receiveGiftAudienceView, View view) {
        receiveGiftAudienceView._root = (ReceiveGiftAudienceView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        receiveGiftAudienceView._head = (CommonAnimMaskAvatarView) viewGroup.getChildAt(0);
        receiveGiftAudienceView._name = (VText) viewGroup.getChildAt(1);
    }
}
