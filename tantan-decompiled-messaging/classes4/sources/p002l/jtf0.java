package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.starboard.StarBoardEntryItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jtf0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m16224a(StarBoardEntryItemView starBoardEntryItemView, View view) {
        starBoardEntryItemView.f6798d = (StarBoardEntryItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        starBoardEntryItemView.f6799e = viewGroup.getChildAt(0);
        starBoardEntryItemView.f6800f = (FrameLayout) viewGroup.getChildAt(1);
        starBoardEntryItemView.f6801g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        starBoardEntryItemView.f6802h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        starBoardEntryItemView.f6803i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        starBoardEntryItemView.f6804j = (TextView) viewGroup.getChildAt(2);
    }
}
