package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardDialogTopAnimView;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class lfl {
    /* JADX INFO: renamed from: a */
    public static void m149724a(HourBoardDialogTopAnimView hourBoardDialogTopAnimView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardDialogTopAnimView._bottom_bg = (VDraweeView) viewGroup.getChildAt(0);
        hourBoardDialogTopAnimView._bg_svga = (AnimEffectPlayer) viewGroup.getChildAt(1);
        hourBoardDialogTopAnimView._top_bg = (VImage) viewGroup.getChildAt(2);
    }
}
