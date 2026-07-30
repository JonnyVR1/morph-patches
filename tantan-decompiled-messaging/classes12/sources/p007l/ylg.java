package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.FeedAlbumInterestedEntranceView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ylg {
    /* JADX INFO: renamed from: a */
    public static void m17167a(FeedAlbumInterestedEntranceView feedAlbumInterestedEntranceView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedAlbumInterestedEntranceView.f3693d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedAlbumInterestedEntranceView.f3694e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedAlbumInterestedEntranceView.f3695f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        feedAlbumInterestedEntranceView.f3696g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        feedAlbumInterestedEntranceView.f3697h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        feedAlbumInterestedEntranceView.f3698i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedAlbumInterestedEntranceView.f3699j = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m17168b(FeedAlbumInterestedEntranceView feedAlbumInterestedEntranceView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11142V0, viewGroup, false);
        m17167a(feedAlbumInterestedEntranceView, viewInflate);
        return viewInflate;
    }
}
