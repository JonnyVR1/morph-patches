package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.state.FeedMomentPostStatusView;
import p147v.VDraweeView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes12.dex */
public class qfh {
    /* JADX INFO: renamed from: a */
    public static void m174311a(FeedMomentPostStatusView feedMomentPostStatusView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedMomentPostStatusView.f40807d = (VFrame) viewGroup.getChildAt(0);
        feedMomentPostStatusView.f40808e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedMomentPostStatusView.f40809f = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        feedMomentPostStatusView.f40810g = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        feedMomentPostStatusView.f40811h = (TextView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m174312b(FeedMomentPostStatusView feedMomentPostStatusView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142294u1, viewGroup, false);
        m174311a(feedMomentPostStatusView, viewInflate);
        return viewInflate;
    }
}
