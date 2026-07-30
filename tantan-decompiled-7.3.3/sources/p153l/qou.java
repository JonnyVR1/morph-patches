package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatMissedCallItem;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class qou {
    /* JADX INFO: renamed from: a */
    public static void m177324a(LiveVChatMissedCallItem liveVChatMissedCallItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatMissedCallItem.f46243d = (VLinear) viewGroup.getChildAt(0);
        liveVChatMissedCallItem.f46244e = (VDraweeView) viewGroup.getChildAt(1);
        liveVChatMissedCallItem.f46245f = viewGroup.getChildAt(2);
        liveVChatMissedCallItem.f46246g = (VText) viewGroup.getChildAt(3);
        liveVChatMissedCallItem.f46247h = (VLinear) viewGroup.getChildAt(4);
        liveVChatMissedCallItem.f46248i = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        liveVChatMissedCallItem.f46249j = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        liveVChatMissedCallItem.f46250k = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
    }
}
