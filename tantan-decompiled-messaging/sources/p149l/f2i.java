package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.status.display.view.FeedAutoScrollView;
import com.p046p1.mobile.putong.feed.newui.status.display.view.FeedStateSquareEntranceView;
import p147v.VImage;

/* JADX INFO: loaded from: classes12.dex */
public class f2i {
    /* JADX INFO: renamed from: a */
    public static void m119184a(FeedStateSquareEntranceView feedStateSquareEntranceView, View view) {
        feedStateSquareEntranceView.f42915d = (FeedStateSquareEntranceView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedStateSquareEntranceView.f42916e = (VImage) viewGroup.getChildAt(0);
        feedStateSquareEntranceView.f42917f = (FeedAutoScrollView) viewGroup.getChildAt(1);
    }
}
