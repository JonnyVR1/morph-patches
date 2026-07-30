package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.starboard.StarBoardEntryItemView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class jtf0 {
    /* JADX INFO: renamed from: a */
    public static void m143101a(StarBoardEntryItemView starBoardEntryItemView, View view) {
        starBoardEntryItemView.f50756d = (StarBoardEntryItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        starBoardEntryItemView.f50757e = (VDraweeView) viewGroup.getChildAt(0);
        starBoardEntryItemView.f50758f = (FrameLayout) viewGroup.getChildAt(1);
        starBoardEntryItemView.f50759g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        starBoardEntryItemView.f50760h = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        starBoardEntryItemView.f50761i = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        starBoardEntryItemView.f50762j = (TextView) viewGroup.getChildAt(2);
    }
}
