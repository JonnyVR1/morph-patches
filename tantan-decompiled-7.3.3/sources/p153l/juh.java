package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomAlbumView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomAudioView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomTitleTagsView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomTopicView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class juh {
    /* JADX INFO: renamed from: a */
    public static void m146981a(FeedPostBottomView feedPostBottomView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostBottomView.f41625d = (FeedPostBottomTitleTagsView) viewGroup.getChildAt(0);
        feedPostBottomView.f41626e = (FeedPostBottomTopicView) viewGroup.getChildAt(1);
        feedPostBottomView.f41627f = (LinearLayout) viewGroup.getChildAt(2);
        feedPostBottomView.f41628g = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        feedPostBottomView.f41629h = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        feedPostBottomView.f41630i = (FeedRedDotView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        feedPostBottomView.f41631j = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        feedPostBottomView.f41632k = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        feedPostBottomView.f41633l = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        feedPostBottomView.f41634m = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        feedPostBottomView.f41635n = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6);
        feedPostBottomView.f41636o = (FrameLayout) viewGroup.getChildAt(3);
        feedPostBottomView.f41637p = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        feedPostBottomView.f41638q = (FeedPostBottomAlbumView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        feedPostBottomView.f41639r = (FeedPostBottomAudioView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        feedPostBottomView.f41640s = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m146982b(FeedPostBottomView feedPostBottomView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173778w2, viewGroup, false);
        m146981a(feedPostBottomView, viewInflate);
        return viewInflate;
    }
}
