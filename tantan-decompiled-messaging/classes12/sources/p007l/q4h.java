package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.actRender.FeedGroupDetailViewHolder;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class q4h {
    /* JADX INFO: renamed from: a */
    public static void m13386a(FeedGroupDetailViewHolder feedGroupDetailViewHolder, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedGroupDetailViewHolder.f1521a = viewGroup.getChildAt(0);
        feedGroupDetailViewHolder.f1522b = viewGroup.getChildAt(1);
        feedGroupDetailViewHolder.f1523c = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        feedGroupDetailViewHolder.f1524d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        feedGroupDetailViewHolder.f1525e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        feedGroupDetailViewHolder.f1526f = viewGroup.getChildAt(3);
        feedGroupDetailViewHolder.f1527g = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        feedGroupDetailViewHolder.f1528h = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        feedGroupDetailViewHolder.f1529i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedGroupDetailViewHolder.f1530j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        feedGroupDetailViewHolder.f1531k = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        feedGroupDetailViewHolder.f1532l = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        feedGroupDetailViewHolder.f1533m = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedGroupDetailViewHolder.f1534n = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        feedGroupDetailViewHolder.f1535o = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        feedGroupDetailViewHolder.f1536p = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2);
        feedGroupDetailViewHolder.f1537q = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedGroupDetailViewHolder.f1538r = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        feedGroupDetailViewHolder.f1539s = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        feedGroupDetailViewHolder.f1540t = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        feedGroupDetailViewHolder.f1541u = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        feedGroupDetailViewHolder.f1542v = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(2);
        feedGroupDetailViewHolder.f1543w = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        feedGroupDetailViewHolder.f1544x = (LinearLayout) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m13387b(FeedGroupDetailViewHolder feedGroupDetailViewHolder, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11269o, viewGroup, false);
        m13386a(feedGroupDetailViewHolder, viewInflate);
        return viewInflate;
    }
}
