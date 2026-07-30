package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard.IntlLiveStarBoardEntryItemView;
import p147v.VDraweeView;
import p147v.VMarqueeText;

/* JADX INFO: loaded from: classes4.dex */
public class x7o {
    /* JADX INFO: renamed from: a */
    public static void m207303a(IntlLiveStarBoardEntryItemView intlLiveStarBoardEntryItemView, View view) {
        intlLiveStarBoardEntryItemView.f50747a = (IntlLiveStarBoardEntryItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveStarBoardEntryItemView.f50748b = (VDraweeView) viewGroup.getChildAt(0);
        intlLiveStarBoardEntryItemView.f50749c = (VMarqueeText) viewGroup.getChildAt(1);
    }
}
