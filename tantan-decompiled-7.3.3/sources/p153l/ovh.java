package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedPostSelectedHeader;
import com.p051p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostSelectedCategoryTopicsView;
import p151v.VButton;
import p151v.VLinear;
import p151v.VMenuBar;
import p151v.VRecyclerView;
import p151v.VSearchBar;

/* JADX INFO: loaded from: classes13.dex */
public class ovh {
    /* JADX INFO: renamed from: a */
    public static void m169434a(FeedPostSelectedCategoryTopicsView feedPostSelectedCategoryTopicsView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostSelectedCategoryTopicsView.f40862a = (VMenuBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedPostSelectedCategoryTopicsView.f40863b = (VSearchBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedPostSelectedCategoryTopicsView.f40864c = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedPostSelectedCategoryTopicsView.f40865d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        feedPostSelectedCategoryTopicsView.f40866e = (FeedPostSelectedHeader) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        feedPostSelectedCategoryTopicsView.f40867f = (VRecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        feedPostSelectedCategoryTopicsView.f40868g = (VRecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(1);
        feedPostSelectedCategoryTopicsView.f40869h = (VButton) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m169435b(FeedPostSelectedCategoryTopicsView feedPostSelectedCategoryTopicsView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173492E2, viewGroup, false);
        m169434a(feedPostSelectedCategoryTopicsView, viewInflate);
        return viewInflate;
    }
}
