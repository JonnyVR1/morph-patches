package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedCanVoteContentView;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedVoteContainer;

/* JADX INFO: loaded from: classes12.dex */
public class drg {
    /* JADX INFO: renamed from: a */
    public static void m113295a(FeedCanVoteContentView feedCanVoteContentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedCanVoteContentView.f42348a = (TextView) viewGroup.getChildAt(0);
        feedCanVoteContentView.f42349b = (TextView) viewGroup.getChildAt(1);
        feedCanVoteContentView.f42350c = (FeedVoteContainer) viewGroup.getChildAt(2);
        feedCanVoteContentView.f42351d = (TextView) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m113296b(FeedCanVoteContentView feedCanVoteContentView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142072M3, viewGroup, false);
        m113295a(feedCanVoteContentView, viewInflate);
        return viewInflate;
    }
}
