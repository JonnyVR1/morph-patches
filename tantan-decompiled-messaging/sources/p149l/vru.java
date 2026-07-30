package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatWaitingOrderView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class vru {
    /* JADX INFO: renamed from: a */
    public static void m199753a(LiveVChatWaitingOrderView liveVChatWaitingOrderView, View view) {
        liveVChatWaitingOrderView.f45442a = (LiveVChatWaitingOrderView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatWaitingOrderView.f45443b = (VDraweeView) viewGroup.getChildAt(0);
        liveVChatWaitingOrderView.f45444c = (VImage) viewGroup.getChildAt(1);
        liveVChatWaitingOrderView.f45445d = (VImage) viewGroup.getChildAt(2);
        liveVChatWaitingOrderView.f45446e = (VLinear) viewGroup.getChildAt(3);
        liveVChatWaitingOrderView.f45447f = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        liveVChatWaitingOrderView.f45448g = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        liveVChatWaitingOrderView.f45449h = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        liveVChatWaitingOrderView.f45450i = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        liveVChatWaitingOrderView.f45451j = (ImageView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        liveVChatWaitingOrderView.f45452k = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
    }
}
