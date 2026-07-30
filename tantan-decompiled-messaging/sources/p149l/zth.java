package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedPostSelectedHeader;
import com.p046p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostSelectedCategoryTopicsView;
import p147v.VButton;
import p147v.VLinear;
import p147v.VMenuBar;
import p147v.VRecyclerView;
import p147v.VSearchBar;

/* JADX INFO: loaded from: classes12.dex */
public class zth {
    /* JADX INFO: renamed from: a */
    public static void m220125a(FeedPostSelectedCategoryTopicsView feedPostSelectedCategoryTopicsView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostSelectedCategoryTopicsView.f40014a = (VMenuBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedPostSelectedCategoryTopicsView.f40015b = (VSearchBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedPostSelectedCategoryTopicsView.f40016c = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedPostSelectedCategoryTopicsView.f40017d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        feedPostSelectedCategoryTopicsView.f40018e = (FeedPostSelectedHeader) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        feedPostSelectedCategoryTopicsView.f40019f = (VRecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        feedPostSelectedCategoryTopicsView.f40020g = (VRecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(1);
        feedPostSelectedCategoryTopicsView.f40021h = (VButton) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m220126b(FeedPostSelectedCategoryTopicsView feedPostSelectedCategoryTopicsView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142023E2, viewGroup, false);
        m220125a(feedPostSelectedCategoryTopicsView, viewInflate);
        return viewInflate;
    }
}
