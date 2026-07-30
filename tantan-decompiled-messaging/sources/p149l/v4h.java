package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.group.FeedGroupEntranceView;
import p147v.VLinear;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public class v4h {
    /* JADX INFO: renamed from: a */
    public static void m196988a(FeedGroupEntranceView feedGroupEntranceView, View view) {
        feedGroupEntranceView.f39960c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedGroupEntranceView.f39961d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedGroupEntranceView.f39962e = (VRecyclerView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m196989b(FeedGroupEntranceView feedGroupEntranceView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142021E0, viewGroup, false);
        m196988a(feedGroupEntranceView, viewInflate);
        return viewInflate;
    }
}
