package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedCanVoteContentView;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedVoteContainer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class drg {
    /* JADX INFO: renamed from: a */
    public static void m9563a(FeedCanVoteContentView feedCanVoteContentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedCanVoteContentView.f3809a = (TextView) viewGroup.getChildAt(0);
        feedCanVoteContentView.f3810b = (TextView) viewGroup.getChildAt(1);
        feedCanVoteContentView.f3811c = (FeedVoteContainer) viewGroup.getChildAt(2);
        feedCanVoteContentView.f3812d = (TextView) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m9564b(FeedCanVoteContentView feedCanVoteContentView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11091M3, viewGroup, false);
        m9563a(feedCanVoteContentView, viewInflate);
        return viewInflate;
    }
}
