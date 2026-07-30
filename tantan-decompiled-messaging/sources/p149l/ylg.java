package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.FeedAlbumInterestedEntranceView;
import p147v.VDraweeView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes12.dex */
public class ylg {
    /* JADX INFO: renamed from: a */
    public static void m215265a(FeedAlbumInterestedEntranceView feedAlbumInterestedEntranceView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedAlbumInterestedEntranceView.f42232d = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedAlbumInterestedEntranceView.f42233e = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedAlbumInterestedEntranceView.f42234f = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        feedAlbumInterestedEntranceView.f42235g = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        feedAlbumInterestedEntranceView.f42236h = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        feedAlbumInterestedEntranceView.f42237i = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedAlbumInterestedEntranceView.f42238j = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m215266b(FeedAlbumInterestedEntranceView feedAlbumInterestedEntranceView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142123V0, viewGroup, false);
        m215265a(feedAlbumInterestedEntranceView, viewInflate);
        return viewInflate;
    }
}
