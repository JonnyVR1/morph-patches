package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardDialogContentMainlandView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardEmptyView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardMainlandMeItemView;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class bil {
    /* JADX INFO: renamed from: a */
    public static void m104488a(HourBoardDialogContentMainlandView hourBoardDialogContentMainlandView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardDialogContentMainlandView._empty = viewGroup.getChildAt(0);
        hourBoardDialogContentMainlandView._bg = viewGroup.getChildAt(1);
        hourBoardDialogContentMainlandView._bottom_bg = (VDraweeView) viewGroup.getChildAt(2);
        hourBoardDialogContentMainlandView._bg_svga = (AnimEffectPlayer) viewGroup.getChildAt(3);
        hourBoardDialogContentMainlandView._top_bg = (VImage) viewGroup.getChildAt(4);
        hourBoardDialogContentMainlandView._title_bar = (DialogTitleBar) viewGroup.getChildAt(5);
        hourBoardDialogContentMainlandView._top_divider = viewGroup.getChildAt(6);
        hourBoardDialogContentMainlandView._recyclerView = (RecyclerView) viewGroup.getChildAt(7);
        hourBoardDialogContentMainlandView._empty_view = (HourBoardEmptyView) viewGroup.getChildAt(8);
        hourBoardDialogContentMainlandView._own = (HourBoardMainlandMeItemView) viewGroup.getChildAt(9);
    }
}
