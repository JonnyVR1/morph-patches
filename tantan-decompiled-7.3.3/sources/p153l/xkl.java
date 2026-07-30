package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardDialogTopAnimView;
import p151v.VPager;

/* JADX INFO: loaded from: classes4.dex */
public class xkl {
    /* JADX INFO: renamed from: a */
    public static void m211402a(wkl wklVar, View view) {
        wklVar.f189559k = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        wklVar.f189560l = (HourBoardDialogTopAnimView) viewGroup.getChildAt(0);
        wklVar.f189561m = (FrameLayout) viewGroup.getChildAt(1);
        wklVar.f189562n = (TabLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        wklVar.f189563o = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        wklVar.f189564p = viewGroup.getChildAt(2);
        wklVar.f189565q = (VPager) viewGroup.getChildAt(3);
    }
}
