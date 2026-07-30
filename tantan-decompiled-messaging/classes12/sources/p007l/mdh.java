package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.status.display.statuspage.view.FeedMineStatusBottomOperationView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class mdh {
    /* JADX INFO: renamed from: a */
    public static void m11911a(FeedMineStatusBottomOperationView feedMineStatusBottomOperationView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedMineStatusBottomOperationView.f4356a = viewGroup.getChildAt(0);
        feedMineStatusBottomOperationView.f4357b = (TextView) viewGroup.getChildAt(1);
        feedMineStatusBottomOperationView.f4358c = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m11912b(FeedMineStatusBottomOperationView feedMineStatusBottomOperationView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11264n1, viewGroup, false);
        m11911a(feedMineStatusBottomOperationView, viewInflate);
        return viewInflate;
    }
}
