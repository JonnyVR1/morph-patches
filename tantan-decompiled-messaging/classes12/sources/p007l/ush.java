package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomAlbumView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomAudioView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomTitleTagsView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomTopicView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ush {
    /* JADX INFO: renamed from: a */
    public static void m15133a(FeedPostBottomView feedPostBottomView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostBottomView.f2238d = (FeedPostBottomTitleTagsView) viewGroup.getChildAt(0);
        feedPostBottomView.f2239e = (FeedPostBottomTopicView) viewGroup.getChildAt(1);
        feedPostBottomView.f2240f = (LinearLayout) viewGroup.getChildAt(2);
        feedPostBottomView.f2241g = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        feedPostBottomView.f2242h = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        feedPostBottomView.f2243i = (FeedRedDotView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        feedPostBottomView.f2244j = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        feedPostBottomView.f2245k = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        feedPostBottomView.f2246l = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        feedPostBottomView.f2247m = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        feedPostBottomView.f2248n = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6);
        feedPostBottomView.f2249o = (FrameLayout) viewGroup.getChildAt(3);
        feedPostBottomView.f2250p = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        feedPostBottomView.f2251q = (FeedPostBottomAlbumView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        feedPostBottomView.f2252r = (FeedPostBottomAudioView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        feedPostBottomView.f2253s = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m15134b(FeedPostBottomView feedPostBottomView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11328w2, viewGroup, false);
        m15133a(feedPostBottomView, viewInflate);
        return viewInflate;
    }
}
