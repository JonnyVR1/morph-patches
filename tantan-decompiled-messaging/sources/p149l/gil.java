package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardDialogTopAnimView;
import p147v.VPager;

/* JADX INFO: loaded from: classes4.dex */
public class gil {
    /* JADX INFO: renamed from: a */
    public static void m126355a(fil filVar, View view) {
        filVar.f97685k = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        filVar.f97686l = (HourBoardDialogTopAnimView) viewGroup.getChildAt(0);
        filVar.f97687m = (FrameLayout) viewGroup.getChildAt(1);
        filVar.f97688n = (TabLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        filVar.f97689o = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        filVar.f97690p = viewGroup.getChildAt(2);
        filVar.f97691q = (VPager) viewGroup.getChildAt(3);
    }
}
