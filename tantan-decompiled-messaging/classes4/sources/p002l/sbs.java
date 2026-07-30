package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubRedPacketPanel;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class sbs {
    /* JADX INFO: renamed from: a */
    public static void m22351a(LiveFansClubRedPacketPanel liveFansClubRedPacketPanel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveFansClubRedPacketPanel.f5178a = viewGroup.getChildAt(0);
        liveFansClubRedPacketPanel.f5179b = (RelativeLayout) viewGroup.getChildAt(1);
        liveFansClubRedPacketPanel.f5180c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveFansClubRedPacketPanel.f5181d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        liveFansClubRedPacketPanel.f5182e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveFansClubRedPacketPanel.f5183f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
