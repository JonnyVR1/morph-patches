package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftUserItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vfc0 {
    /* JADX INFO: renamed from: a */
    public static void m23933a(ReceiveGiftUserItemView receiveGiftUserItemView, View view) {
        receiveGiftUserItemView._root = (ReceiveGiftUserItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        receiveGiftUserItemView._head = (CommonAnimMaskAvatarView) viewGroup.getChildAt(0);
        receiveGiftUserItemView._select = viewGroup.getChildAt(1);
        receiveGiftUserItemView._name = viewGroup.getChildAt(2);
    }
}
