package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardDialogTopAnimView;
import p147v.VFrame;
import p147v.VPager;

/* JADX INFO: loaded from: classes4.dex */
public class q8y {
    /* JADX INFO: renamed from: a */
    public static void m173580a(p8y p8yVar, View view) {
        p8yVar.f147646k = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        p8yVar.f147647l = (HourBoardDialogTopAnimView) viewGroup.getChildAt(0);
        p8yVar.f147648m = (TabLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        p8yVar.f147649n = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        p8yVar.f147650o = (VPager) viewGroup.getChildAt(2);
    }
}
