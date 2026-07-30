package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatWaitingOrderView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class wtu {
    /* JADX INFO: renamed from: a */
    public static void m207913a(LiveVChatWaitingOrderView liveVChatWaitingOrderView, View view) {
        liveVChatWaitingOrderView.f46290a = (LiveVChatWaitingOrderView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatWaitingOrderView.f46291b = (VDraweeView) viewGroup.getChildAt(0);
        liveVChatWaitingOrderView.f46292c = (VImage) viewGroup.getChildAt(1);
        liveVChatWaitingOrderView.f46293d = (VImage) viewGroup.getChildAt(2);
        liveVChatWaitingOrderView.f46294e = (VLinear) viewGroup.getChildAt(3);
        liveVChatWaitingOrderView.f46295f = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        liveVChatWaitingOrderView.f46296g = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        liveVChatWaitingOrderView.f46297h = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        liveVChatWaitingOrderView.f46298i = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        liveVChatWaitingOrderView.f46299j = (ImageView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        liveVChatWaitingOrderView.f46300k = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
    }
}
