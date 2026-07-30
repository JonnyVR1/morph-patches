package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.status.entrance.followheader.FeedStateHeaderItem;
import com.p046p1.mobile.putong.feed.newui.status.entrance.followheader.FeedVDraweeView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class y0i {
    /* JADX INFO: renamed from: a */
    public static void m212121a(FeedStateHeaderItem feedStateHeaderItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedStateHeaderItem.f42933a = (FeedVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedStateHeaderItem.f42934b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedStateHeaderItem.f42935c = (VDraweeView) viewGroup.getChildAt(1);
        feedStateHeaderItem.f42936d = (VDraweeView) viewGroup.getChildAt(2);
        feedStateHeaderItem.f42937e = (VDraweeView) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m212122b(FeedStateHeaderItem feedStateHeaderItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142268q3, viewGroup, false);
        m212121a(feedStateHeaderItem, viewInflate);
        return viewInflate;
    }
}
