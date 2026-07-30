package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardDialogTopAnimView;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class q8y {
    /* JADX INFO: renamed from: a */
    public static void m21104a(p8y p8yVar, View view) {
        p8yVar.f17069k = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        p8yVar.f17070l = (HourBoardDialogTopAnimView) viewGroup.getChildAt(0);
        p8yVar.f17071m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        p8yVar.f17072n = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        p8yVar.f17073o = viewGroup.getChildAt(2);
    }
}
