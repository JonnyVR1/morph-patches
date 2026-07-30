package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.starboard.StarBoardEntryItemView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class s1g0 {
    /* JADX INFO: renamed from: a */
    public static void m184046a(StarBoardEntryItemView starBoardEntryItemView, View view) {
        starBoardEntryItemView.f51604d = (StarBoardEntryItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        starBoardEntryItemView.f51605e = (VDraweeView) viewGroup.getChildAt(0);
        starBoardEntryItemView.f51606f = (FrameLayout) viewGroup.getChildAt(1);
        starBoardEntryItemView.f51607g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        starBoardEntryItemView.f51608h = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        starBoardEntryItemView.f51609i = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        starBoardEntryItemView.f51610j = (TextView) viewGroup.getChildAt(2);
    }
}
