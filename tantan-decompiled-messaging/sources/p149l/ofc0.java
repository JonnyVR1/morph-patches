package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftAudienceView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ofc0 {
    /* JADX INFO: renamed from: a */
    public static void m164063a(ReceiveGiftAudienceView receiveGiftAudienceView, View view) {
        receiveGiftAudienceView._root = (ReceiveGiftAudienceView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        receiveGiftAudienceView._head = (CommonAnimMaskAvatarView) viewGroup.getChildAt(0);
        receiveGiftAudienceView._name = (VText) viewGroup.getChildAt(1);
    }
}
