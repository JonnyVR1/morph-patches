package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.status.selectstatus.adapter.FeedSelectStatusItem;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class dyh {
    /* JADX INFO: renamed from: a */
    public static void m114072a(FeedSelectStatusItem feedSelectStatusItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedSelectStatusItem.f42996f = (VDraweeView) viewGroup.getChildAt(0);
        feedSelectStatusItem.f42997g = (TextView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m114073b(FeedSelectStatusItem feedSelectStatusItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142129W0, viewGroup, false);
        m114072a(feedSelectStatusItem, viewInflate);
        return viewInflate;
    }
}
