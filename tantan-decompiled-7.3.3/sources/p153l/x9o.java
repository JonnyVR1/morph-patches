package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard.IntlLiveStarBoardEntryItemView;
import p151v.VDraweeView;
import p151v.VMarqueeText;

/* JADX INFO: loaded from: classes4.dex */
public class x9o {
    /* JADX INFO: renamed from: a */
    public static void m209806a(IntlLiveStarBoardEntryItemView intlLiveStarBoardEntryItemView, View view) {
        intlLiveStarBoardEntryItemView.f51595a = (IntlLiveStarBoardEntryItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveStarBoardEntryItemView.f51596b = (VDraweeView) viewGroup.getChildAt(0);
        intlLiveStarBoardEntryItemView.f51597c = (VMarqueeText) viewGroup.getChildAt(1);
    }
}
