package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardDialogTopAnimView;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class cil {
    /* JADX INFO: renamed from: a */
    public static void m109905a(HourBoardDialogTopAnimView hourBoardDialogTopAnimView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardDialogTopAnimView._bottom_bg = (VDraweeView) viewGroup.getChildAt(0);
        hourBoardDialogTopAnimView._bg_svga = (AnimEffectPlayer) viewGroup.getChildAt(1);
        hourBoardDialogTopAnimView._top_bg = (VImage) viewGroup.getChildAt(2);
    }
}
