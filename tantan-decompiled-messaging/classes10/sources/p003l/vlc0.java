package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.messages.redpacket.RedPacketUserItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vlc0 {
    /* JADX INFO: renamed from: a */
    public static void m10243a(RedPacketUserItemView redPacketUserItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        redPacketUserItemView.a = viewGroup.getChildAt(0);
        redPacketUserItemView.b = (LinearLayout) viewGroup.getChildAt(1);
        redPacketUserItemView.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        redPacketUserItemView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        redPacketUserItemView.e = (LinearLayout) viewGroup.getChildAt(2);
        redPacketUserItemView.f = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        redPacketUserItemView.g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        redPacketUserItemView.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        redPacketUserItemView.i = viewGroup.getChildAt(3);
    }
}
