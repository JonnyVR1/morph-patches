package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatMissedCallItem;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class pmu {
    /* JADX INFO: renamed from: a */
    public static void m170376a(LiveVChatMissedCallItem liveVChatMissedCallItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatMissedCallItem.f45395d = (VLinear) viewGroup.getChildAt(0);
        liveVChatMissedCallItem.f45396e = (VDraweeView) viewGroup.getChildAt(1);
        liveVChatMissedCallItem.f45397f = viewGroup.getChildAt(2);
        liveVChatMissedCallItem.f45398g = (VText) viewGroup.getChildAt(3);
        liveVChatMissedCallItem.f45399h = (VLinear) viewGroup.getChildAt(4);
        liveVChatMissedCallItem.f45400i = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        liveVChatMissedCallItem.f45401j = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        liveVChatMissedCallItem.f45402k = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
    }
}
