package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.messages.redpacket.RedPacketCustomizeHeaderView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mkc0 {
    /* JADX INFO: renamed from: a */
    public static void m8162a(RedPacketCustomizeHeaderView redPacketCustomizeHeaderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        redPacketCustomizeHeaderView.a = (LinearLayout) viewGroup.getChildAt(0);
        redPacketCustomizeHeaderView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        redPacketCustomizeHeaderView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        redPacketCustomizeHeaderView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        redPacketCustomizeHeaderView.e = viewGroup.getChildAt(1);
        redPacketCustomizeHeaderView.f = (LinearLayout) viewGroup.getChildAt(2);
        redPacketCustomizeHeaderView.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        redPacketCustomizeHeaderView.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        redPacketCustomizeHeaderView.i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        redPacketCustomizeHeaderView.j = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        redPacketCustomizeHeaderView.k = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        redPacketCustomizeHeaderView.l = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
    }
}
