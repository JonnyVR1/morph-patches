package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubRedPacketPanel;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class tds {
    /* JADX INFO: renamed from: a */
    public static void m190641a(LiveFansClubRedPacketPanel liveFansClubRedPacketPanel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveFansClubRedPacketPanel.f49984a = viewGroup.getChildAt(0);
        liveFansClubRedPacketPanel.f49985b = (RelativeLayout) viewGroup.getChildAt(1);
        liveFansClubRedPacketPanel.f49986c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveFansClubRedPacketPanel.f49987d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        liveFansClubRedPacketPanel.f49988e = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveFansClubRedPacketPanel.f49989f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
