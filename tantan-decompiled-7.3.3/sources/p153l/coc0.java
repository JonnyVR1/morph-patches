package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftUserItemView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class coc0 {
    /* JADX INFO: renamed from: a */
    public static void m111638a(ReceiveGiftUserItemView receiveGiftUserItemView, View view) {
        receiveGiftUserItemView._root = (ReceiveGiftUserItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        receiveGiftUserItemView._head = (CommonAnimMaskAvatarView) viewGroup.getChildAt(0);
        receiveGiftUserItemView._select = viewGroup.getChildAt(1);
        receiveGiftUserItemView._name = (VText) viewGroup.getChildAt(2);
    }
}
