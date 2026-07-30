package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardFirstView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class bgl {
    /* JADX INFO: renamed from: a */
    public static void m101667a(HourBoardFirstView hourBoardFirstView, View view) {
        hourBoardFirstView._root = (HourBoardFirstView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardFirstView._bg = viewGroup.getChildAt(0);
        hourBoardFirstView._rank_svga = (AnimEffectPlayer) viewGroup.getChildAt(1);
        hourBoardFirstView._avatar = (VDraweeView) viewGroup.getChildAt(2);
        hourBoardFirstView._crown = (VImage) viewGroup.getChildAt(3);
        hourBoardFirstView._avatar_bottom = viewGroup.getChildAt(4);
        hourBoardFirstView._living = (LivingNewTagView) viewGroup.getChildAt(5);
        hourBoardFirstView._name = (VText) viewGroup.getChildAt(6);
        hourBoardFirstView._heart = (VText) viewGroup.getChildAt(7);
        hourBoardFirstView._rank = (VText) viewGroup.getChildAt(8);
        hourBoardFirstView._rank_icon = (VImage) viewGroup.getChildAt(9);
    }
}
