package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomAlbumView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomAudioView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomTitleTagsView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomTopicView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class ush {
    /* JADX INFO: renamed from: a */
    public static void m195196a(FeedPostBottomView feedPostBottomView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostBottomView.f40777d = (FeedPostBottomTitleTagsView) viewGroup.getChildAt(0);
        feedPostBottomView.f40778e = (FeedPostBottomTopicView) viewGroup.getChildAt(1);
        feedPostBottomView.f40779f = (LinearLayout) viewGroup.getChildAt(2);
        feedPostBottomView.f40780g = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        feedPostBottomView.f40781h = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        feedPostBottomView.f40782i = (FeedRedDotView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        feedPostBottomView.f40783j = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        feedPostBottomView.f40784k = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        feedPostBottomView.f40785l = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        feedPostBottomView.f40786m = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        feedPostBottomView.f40787n = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6);
        feedPostBottomView.f40788o = (FrameLayout) viewGroup.getChildAt(3);
        feedPostBottomView.f40789p = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        feedPostBottomView.f40790q = (FeedPostBottomAlbumView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        feedPostBottomView.f40791r = (FeedPostBottomAudioView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        feedPostBottomView.f40792s = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m195197b(FeedPostBottomView feedPostBottomView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142309w2, viewGroup, false);
        m195196a(feedPostBottomView, viewInflate);
        return viewInflate;
    }
}
