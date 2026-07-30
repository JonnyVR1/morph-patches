package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.state.FeedMomentPostStatusView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class qfh {
    /* JADX INFO: renamed from: a */
    public static void m13547a(FeedMomentPostStatusView feedMomentPostStatusView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedMomentPostStatusView.f2268d = viewGroup.getChildAt(0);
        feedMomentPostStatusView.f2269e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedMomentPostStatusView.f2270f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        feedMomentPostStatusView.f2271g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        feedMomentPostStatusView.f2272h = (TextView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m13548b(FeedMomentPostStatusView feedMomentPostStatusView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11313u1, viewGroup, false);
        m13547a(feedMomentPostStatusView, viewInflate);
        return viewInflate;
    }
}
