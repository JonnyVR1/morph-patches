package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.group.FeedGroupEntranceView;
import p151v.VLinear;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class k6h {
    /* JADX INFO: renamed from: a */
    public static void m148514a(FeedGroupEntranceView feedGroupEntranceView, View view) {
        feedGroupEntranceView.f40808c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedGroupEntranceView.f40809d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedGroupEntranceView.f40810e = (VRecyclerView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m148515b(FeedGroupEntranceView feedGroupEntranceView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173490E0, viewGroup, false);
        m148514a(feedGroupEntranceView, viewInflate);
        return viewInflate;
    }
}
