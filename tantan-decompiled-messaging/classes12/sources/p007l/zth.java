package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedPostSelectedHeader;
import com.p000p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostSelectedCategoryTopicsView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class zth {
    /* JADX INFO: renamed from: a */
    public static void m17538a(FeedPostSelectedCategoryTopicsView feedPostSelectedCategoryTopicsView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostSelectedCategoryTopicsView.f1475a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedPostSelectedCategoryTopicsView.f1476b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedPostSelectedCategoryTopicsView.f1477c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedPostSelectedCategoryTopicsView.f1478d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        feedPostSelectedCategoryTopicsView.f1479e = (FeedPostSelectedHeader) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        feedPostSelectedCategoryTopicsView.f1480f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        feedPostSelectedCategoryTopicsView.f1481g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(1);
        feedPostSelectedCategoryTopicsView.f1482h = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m17539b(FeedPostSelectedCategoryTopicsView feedPostSelectedCategoryTopicsView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11042E2, viewGroup, false);
        m17538a(feedPostSelectedCategoryTopicsView, viewInflate);
        return viewInflate;
    }
}
