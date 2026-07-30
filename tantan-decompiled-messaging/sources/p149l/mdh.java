package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.status.display.statuspage.view.FeedMineStatusBottomOperationView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class mdh {
    /* JADX INFO: renamed from: a */
    public static void m154063a(FeedMineStatusBottomOperationView feedMineStatusBottomOperationView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedMineStatusBottomOperationView.f42895a = (VText) viewGroup.getChildAt(0);
        feedMineStatusBottomOperationView.f42896b = (TextView) viewGroup.getChildAt(1);
        feedMineStatusBottomOperationView.f42897c = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m154064b(FeedMineStatusBottomOperationView feedMineStatusBottomOperationView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142245n1, viewGroup, false);
        m154063a(feedMineStatusBottomOperationView, viewInflate);
        return viewInflate;
    }
}
