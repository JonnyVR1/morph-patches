package p007l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.status.display.view.FeedAutoScrollView;
import com.p000p1.mobile.putong.feed.newui.status.display.view.FeedStateSquareEntranceView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class f2i {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m9995a(FeedStateSquareEntranceView feedStateSquareEntranceView, View view) {
        feedStateSquareEntranceView.f4376d = (FeedStateSquareEntranceView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedStateSquareEntranceView.f4377e = viewGroup.getChildAt(0);
        feedStateSquareEntranceView.f4378f = (FeedAutoScrollView) viewGroup.getChildAt(1);
    }
}
