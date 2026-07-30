package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardDialogTopAnimView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gil {
    /* JADX INFO: renamed from: a */
    public static void m13827a(fil filVar, View view) {
        filVar.f10406k = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        filVar.f10407l = (HourBoardDialogTopAnimView) viewGroup.getChildAt(0);
        filVar.f10408m = (FrameLayout) viewGroup.getChildAt(1);
        filVar.f10409n = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        filVar.f10410o = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        filVar.f10411p = viewGroup.getChildAt(2);
        filVar.f10412q = viewGroup.getChildAt(3);
    }
}
