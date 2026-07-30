package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.status.display.statuspage.view.FeedMineStatusBottomOperationView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class bfh {
    /* JADX INFO: renamed from: a */
    public static void m103899a(FeedMineStatusBottomOperationView feedMineStatusBottomOperationView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedMineStatusBottomOperationView.f43743a = (VText) viewGroup.getChildAt(0);
        feedMineStatusBottomOperationView.f43744b = (TextView) viewGroup.getChildAt(1);
        feedMineStatusBottomOperationView.f43745c = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m103900b(FeedMineStatusBottomOperationView feedMineStatusBottomOperationView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173714n1, viewGroup, false);
        m103899a(feedMineStatusBottomOperationView, viewInflate);
        return viewInflate;
    }
}
