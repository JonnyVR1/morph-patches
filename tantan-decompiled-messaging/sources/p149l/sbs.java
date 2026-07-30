package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubRedPacketPanel;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class sbs {
    /* JADX INFO: renamed from: a */
    public static void m183264a(LiveFansClubRedPacketPanel liveFansClubRedPacketPanel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveFansClubRedPacketPanel.f49136a = viewGroup.getChildAt(0);
        liveFansClubRedPacketPanel.f49137b = (RelativeLayout) viewGroup.getChildAt(1);
        liveFansClubRedPacketPanel.f49138c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveFansClubRedPacketPanel.f49139d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        liveFansClubRedPacketPanel.f49140e = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveFansClubRedPacketPanel.f49141f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
